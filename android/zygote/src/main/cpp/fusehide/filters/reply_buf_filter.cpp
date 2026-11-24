// Copyright (C) 2026 XiaoTong6666
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

#include "fusehide/filters/reply_buf_filter.hpp"
#include "causentry_fuse_core.h"

namespace fusehide {

namespace {

struct ReadOutCtx {
    uint32_t uid;
    uint64_t ino;
    bool requireParentMatch;
};

bool FilterReadOutDirentCallback(void* rawCtx, uint64_t childIno, const uint8_t* namePtr,
                                 size_t nameLen) {
    const auto* ctx = static_cast<const ReadOutCtx*>(rawCtx);
    const std::string_view name(reinterpret_cast<const char*>(namePtr), nameLen);
    return ShouldFilterTrackedHiddenDirentInode(ctx->uid, childIno, name) ||
           HiddenPathPolicy::ShouldFilterHiddenRootDirent(ctx->uid, ctx->ino, name,
                                                          ctx->requireParentMatch);
}

bool FilterReadOutInRust(const char* buf, size_t size, uint32_t uid, uint64_t ino,
                         bool requireParentMatch, std::vector<char>* filteredStorage,
                         size_t* removedCount) {
    ReadOutCtx ctx{uid, ino, requireParentMatch};
    CausentryBuf outBuf{};
    if (!causentry_fuse_filter_read_out_dirent_payload(
            reinterpret_cast<const uint8_t*>(buf), size, FilterReadOutDirentCallback, &ctx,
            &outBuf, removedCount)) {
        return false;
    }
    filteredStorage->resize(outBuf.len);
    if (outBuf.ptr != nullptr && outBuf.len > 0) {
        std::memcpy(filteredStorage->data(), outBuf.ptr, outBuf.len);
    }
    causentry_fuse_buf_free(outBuf);
    return true;
}

}  // namespace

ReplyBufFilterResult FilterReplyBufPayload(const char* buf, size_t size,
                                           const ReplyBufFilterContext& context,
                                           std::vector<char>* filteredStorage) {
    ReplyBufFilterResult result{.data = buf, .size = size, .mode = nullptr, .removedCount = 0};
    if (buf == nullptr || size == 0 || filteredStorage == nullptr ||
        !HiddenPathPolicy::IsTestHiddenUid(context.filterUid)) {
        return result;
    }

    size_t removedCount = 0;
    if (context.filterPlainReaddir) {
        if (DirentFilter::BuildFilteredDirentPayload(buf, size, context.filterUid,
                                                     context.filterIno, filteredStorage,
                                                     &removedCount, context.requireParentMatch)) {
            return {filteredStorage->data(), filteredStorage->size(), "readdir", removedCount};
        }
    } else if (context.filterReaddirplus) {
        if (DirentFilter::BuildFilteredDirentplusPayload(
                buf, size, context.filterUid, context.filterIno, filteredStorage, &removedCount,
                context.requireParentMatch)) {
            return {filteredStorage->data(), filteredStorage->size(), "readdirplus", removedCount};
        }
    } else if (context.filterPostfilterReaddir) {
        if (FilterReadOutInRust(buf, size, context.filterUid, context.filterIno,
                                context.requireParentMatch, filteredStorage, &removedCount)) {
            return {filteredStorage->data(), filteredStorage->size(), "readdir_postfilter",
                    removedCount};
        }
    }

    if (context.enableAutoFallback) {
        if (DirentFilter::BuildFilteredDirentplusPayload(buf, size, context.filterUid, 0,
                                                         filteredStorage, &removedCount, false)) {
            return {filteredStorage->data(), filteredStorage->size(), "auto_direntplus",
                    removedCount};
        }
        if (DirentFilter::BuildFilteredDirentPayload(buf, size, context.filterUid, 0,
                                                     filteredStorage, &removedCount, false)) {
            return {filteredStorage->data(), filteredStorage->size(), "auto_dirent", removedCount};
        }
        if (FilterReadOutInRust(buf, size, context.filterUid, 0, false, filteredStorage,
                                &removedCount)) {
            return {filteredStorage->data(), filteredStorage->size(), "auto_read_out_dirent",
                    removedCount};
        }
    }
    return result;
}

}  // namespace fusehide
