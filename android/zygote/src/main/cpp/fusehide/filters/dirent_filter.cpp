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

#include "fusehide/filters/dirent_filter.hpp"
#include "fusehide/filters/sensitive_direntplus_cache.hpp"
#include "causentry_fuse_core.h"

namespace fusehide {

namespace {

struct RootDirentCtx {
    uint32_t uid;
    uint64_t ino;
    bool requireParentMatch;
};

struct ParentPathCtx {
    uint32_t uid;
    std::string_view parentPath;
    std::vector<FilteredDirentMatch>* removedEntries;
};

bool FilterRootDirentCallback(void* rawCtx, uint64_t childIno, const uint8_t* namePtr,
                              size_t nameLen) {
    const auto* ctx = static_cast<const RootDirentCtx*>(rawCtx);
    const std::string_view name(reinterpret_cast<const char*>(namePtr), nameLen);
    return ShouldFilterTrackedHiddenDirentInode(ctx->uid, childIno, name) ||
           HiddenPathPolicy::ShouldFilterHiddenRootDirent(ctx->uid, ctx->ino, name,
                                                          ctx->requireParentMatch);
}

bool FilterParentPathCallback(void* rawCtx, uint64_t childIno, const uint8_t* namePtr,
                              size_t nameLen) {
    const auto* ctx = static_cast<const ParentPathCtx*>(rawCtx);
    const std::string_view name(reinterpret_cast<const char*>(namePtr), nameLen);
    if (!ShouldFilterDirentForParentPath(ctx->uid, ctx->parentPath, childIno, name)) {
        return false;
    }
    if (ctx->removedEntries != nullptr) {
        ctx->removedEntries->push_back(FilteredDirentMatch{std::string(name), childIno});
    }
    return true;
}

bool RunRustDirentFilter(const char* data, size_t size, bool isDirentplus,
                         CausentryDirentPredicate pred, void* ctx, std::vector<char>* out,
                         size_t* removedCount) {
    if (data == nullptr || size == 0 || out == nullptr || removedCount == nullptr) {
        return false;
    }
    CausentryBuf outBuf{};
    if (!causentry_fuse_filter_dirent_payload(reinterpret_cast<const uint8_t*>(data), size,
                                              isDirentplus, pred, ctx, &outBuf, removedCount)) {
        return false;
    }
    out->resize(outBuf.len);
    if (outBuf.ptr != nullptr && outBuf.len > 0) {
        std::memcpy(out->data(), outBuf.ptr, outBuf.len);
    }
    causentry_fuse_buf_free(outBuf);
    return true;
}

}  // namespace

bool AlignDirentName(size_t nameLen, size_t* alignedSize) {
    return causentry_fuse_align_dirent_name(nameLen, alignedSize);
}

bool FuseDirentRecordSize(const fuse_dirent* dirent, size_t available, size_t* recordSize) {
    if (dirent == nullptr) {
        return false;
    }
    return causentry_fuse_dirent_record_size(dirent->namelen, available, recordSize);
}

bool FuseDirentplusRecordSize(const fuse_dirent* dirent, size_t available, size_t* recordSize) {
    if (dirent == nullptr) {
        return false;
    }
    return causentry_fuse_direntplus_record_size(dirent->namelen, available, recordSize);
}

bool BuildUncachedSensitiveDirentplusPayload(const char* data, size_t size,
                                             std::string_view parentPath, std::vector<char>* out,
                                             size_t* uncachedCount) {
    if (data == nullptr || size == 0 || parentPath.empty() || out == nullptr ||
        uncachedCount == nullptr) {
        return false;
    }
    const auto anyRule = RuleForAnyPackage();
    if (!anyRule)
        return false;

    return CopyUncachedSensitiveDirentplus(
        std::span<const char>(data, size), out, uncachedCount, [&](std::string_view name) {
            const std::string path = HiddenPathPolicy::JoinPathComponent(parentPath, name);
            return HiddenPathPolicy::IsAnyHiddenSubtreePath(*anyRule, path);
        });
}

bool ShouldFilterTrackedHiddenDirentInode(uint32_t uid, uint64_t childIno, std::string_view name) {
    if (!HiddenPathPolicy::IsTestHiddenUid(uid) || childIno == 0) {
        return false;
    }
    if (!IsTrackedHiddenSubtreeInode(uid, childIno)) {
        return false;
    }
    DebugLogPrint(4, "filter dirent by tracked inode uid=%u child=%s name=%s",
                  static_cast<unsigned>(uid), InodePath(childIno).c_str(),
                  DebugPreview(name).c_str());
    return true;
}

bool ShouldFilterDirentForParentPath(uint32_t uid, std::string_view parentPath, uint64_t childIno,
                                     std::string_view name) {
    if (!HiddenPathPolicy::IsTestHiddenUid(uid)) {
        return false;
    }
    if (ShouldFilterTrackedHiddenDirentInode(uid, childIno, name)) {
        return true;
    }
    const std::string childPath = HiddenPathPolicy::JoinPathComponent(parentPath, name);
    return HiddenPathPolicy::IsExactHiddenTargetPath(uid, childPath);
}

bool DirentFilter::BuildFilteredDirentPayload(const char* data, size_t size, uint32_t uid,
                                              uint64_t ino, std::vector<char>* out,
                                              size_t* removedCount, bool requireParentMatch) {
    RootDirentCtx ctx{uid, ino, requireParentMatch};
    return RunRustDirentFilter(data, size, false, FilterRootDirentCallback, &ctx, out,
                               removedCount);
}

bool BuildFilteredDirentPayloadForParentPath(const char* data, size_t size, uint32_t uid,
                                             std::string_view parentPath, std::vector<char>* out,
                                             size_t* removedCount,
                                             std::vector<FilteredDirentMatch>* removedEntries) {
    if (parentPath.empty()) {
        return false;
    }
    ParentPathCtx ctx{uid, parentPath, removedEntries};
    return RunRustDirentFilter(data, size, false, FilterParentPathCallback, &ctx, out,
                               removedCount);
}

bool DirentFilter::BuildFilteredDirentplusPayload(const char* data, size_t size, uint32_t uid,
                                                  uint64_t ino, std::vector<char>* out,
                                                  size_t* removedCount, bool requireParentMatch) {
    RootDirentCtx ctx{uid, ino, requireParentMatch};
    return RunRustDirentFilter(data, size, true, FilterRootDirentCallback, &ctx, out, removedCount);
}

bool BuildFilteredDirentplusPayloadForParentPath(const char* data, size_t size, uint32_t uid,
                                                 std::string_view parentPath,
                                                 std::vector<char>* out, size_t* removedCount,
                                                 std::vector<FilteredDirentMatch>* removedEntries) {
    if (parentPath.empty()) {
        return false;
    }
    ParentPathCtx ctx{uid, parentPath, removedEntries};
    return RunRustDirentFilter(data, size, true, FilterParentPathCallback, &ctx, out, removedCount);
}

}  // namespace fusehide
