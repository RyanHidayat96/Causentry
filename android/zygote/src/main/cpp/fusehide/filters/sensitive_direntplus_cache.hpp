// Copyright (C) 2026 XiaoTong6666
// SPDX-License-Identifier: Apache-2.0
#pragma once

#include "causentry_fuse_core.h"
#include <cstddef>
#include <cstdint>
#include <cstring>
#include <optional>
#include <span>
#include <string_view>
#include <vector>

namespace fusehide {

// The directory root of an emulated-storage FUSE Session is inode 1, while
// the visible /storage/emulated/0 directory is its child. Extract that
// child's *kernel nodeid* only from a verified READDIRPLUS page for inode 1.
inline std::optional<uint64_t> FindEmulatedZeroDirentplusNodeId(std::span<const char> input) {
    uint64_t nodeid = 0;
    if (!causentry_fuse_find_emulated_zero_nodeid(
            reinterpret_cast<const uint8_t*>(input.data()), input.size(), &nodeid)) {
        return std::nullopt;
    }
    return nodeid;
}

// FUSE UAPI: fuse_direntplus = fuse_entry_out (128 bytes) + fuse_dirent.
// Delegates full payload validation & TTL zeroing to Rust `causentry-fuse-core`.
template <typename MatchesName>
bool CopyUncachedSensitiveDirentplus(std::span<const char> input, std::vector<char>* output,
                                     size_t* changed, MatchesName&& matchesName) {
    if (input.empty() || output == nullptr || changed == nullptr) {
        return false;
    }
    struct CallbackCtx {
        MatchesName* fn;
    } ctx{&matchesName};

    auto predicate = [](void* rawCtx, const uint8_t* namePtr, size_t nameLen) -> bool {
        auto* state = static_cast<CallbackCtx*>(rawCtx);
        return (*state->fn)(
            std::string_view(reinterpret_cast<const char*>(namePtr), nameLen));
    };

    CausentryBuf outBuf{};
    if (!causentry_fuse_strip_sensitive_direntplus_cache(
            reinterpret_cast<const uint8_t*>(input.data()), input.size(), predicate, &ctx, &outBuf,
            changed)) {
        return false;
    }
    output->resize(outBuf.len);
    if (outBuf.ptr != nullptr && outBuf.len > 0) {
        std::memcpy(output->data(), outBuf.ptr, outBuf.len);
    }
    causentry_fuse_buf_free(outBuf);
    return true;
}

}  // namespace fusehide
