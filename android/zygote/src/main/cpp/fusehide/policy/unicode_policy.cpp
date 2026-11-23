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

#include "fusehide/core/state.hpp"
#include "causentry_fuse_core.h"

namespace fusehide {

namespace {

std::string TakeRustString(CausentryBuf buf) {
    std::string out;
    if (buf.ptr != nullptr && buf.len > 0) {
        out.assign(reinterpret_cast<const char*>(buf.ptr), buf.len);
    }
    causentry_fuse_buf_free(buf);
    return out;
}

}  // namespace

std::string UnicodePolicy::DebugPreview(std::string_view value, size_t limit) {
    const size_t n = value.size() < limit ? value.size() : limit;
    return EscapeForLog(reinterpret_cast<const uint8_t*>(value.data()), n);
}

bool ContainsInterestingIgnorableUtf8Bytes(std::string_view value) {
    return causentry_fuse_contains_ignorable_utf8(
        reinterpret_cast<const uint8_t*>(value.data()), value.size());
}

void UnicodePolicy::LogSuspiciousDirectPath(const char* hookName, std::string_view path) {
    if (!ContainsInterestingIgnorableUtf8Bytes(path) ||
        !ShouldLogLimited(gSuspiciousDirectLogCount, 16)) {
        return;
    }
    __android_log_print(5, kLogTag,
                        "%s direct path still contains interesting zero-width bytes, "
                        "NeedsSanitization returned false path=%s unicode=12.1.0",
                        hookName, DebugPreview(path).c_str());
}

// Keep this table aligned with the Unicode 12.1 data used by the Android kernel casefold path.
// Implemented in Rust (`causentry-fuse-core`).
bool IsDefaultIgnorableCodePoint(uint32_t cp) {
    return causentry_fuse_is_default_ignorable(cp);
}

// Escape for logging: printable ASCII as-is, else \xHH.
// Implemented in Rust (`causentry-fuse-core`).
std::string UnicodePolicy::EscapeForLog(const uint8_t* data, size_t length) {
    CausentryBuf buf{};
    if (!causentry_fuse_escape_for_log(data, length, &buf)) {
        return {};
    }
    return TakeRustString(buf);
}

// Original logs at level 5 (WARN), with format "invalid char at %zu-%zu : %s"
// and escapes the ENTIRE input string, not just the invalid range.
void UnicodePolicy::LogInvalidUtf8(const uint8_t* data, size_t dataLen, size_t begin, size_t end) {
    const std::string escaped = EscapeForLog(data, dataLen);
    __android_log_print(5, kLogTag, "invalid char at %zu-%zu : %s", begin, end, escaped.c_str());
}

// Strict UTF-8 decoder implemented in Rust (`causentry-fuse-core`).
bool UnicodePolicy::DecodeUtf8CodePoint(const uint8_t* data, size_t len, size_t index, uint32_t* cp,
                                        size_t* width) {
    return causentry_fuse_decode_utf8(data, len, index, cp, width);
}

size_t UnicodePolicy::InvalidUtf8SpanEnd(const uint8_t* data, size_t len, size_t index) {
    if (index >= len)
        return index;

    const uint8_t b0 = data[index];
    size_t next = index + 1;
    if (b0 < 0x80 || next >= len) {
        return next;
    }

    if (b0 < 0xe0) {
        if (b0 <= 0xc1)
            return next;
        const uint8_t b1 = data[next];
        return ((b1 ^ 0x80) < 0x40) ? next + 1 : next;
    }

    if (b0 < 0xf0) {
        const uint8_t b1 = data[next];
        if (b0 == 0xe0 && b1 < 0xa0)
            return next;
        if (b0 == 0xed && b1 >= 0xa0)
            return next;
        if ((b1 ^ 0x80) >= 0x40)
            return next;
        ++next;
        if (next >= len)
            return next;
        const uint8_t b2 = data[next];
        return ((b2 ^ 0x80) < 0x40) ? next + 1 : next;
    }

    if (b0 >= 0xf5)
        return next;
    const uint8_t b1 = data[next];
    if (b0 == 0xf0 && b1 < 0x90)
        return next;
    if (b0 == 0xf4 && b1 >= 0x90)
        return next;
    if ((b1 ^ 0x80) >= 0x40)
        return next;
    ++next;
    if (next >= len)
        return next;
    const uint8_t b2 = data[next];
    if ((b2 ^ 0x80) >= 0x40)
        return next;
    ++next;
    if (next >= len)
        return next;
    const uint8_t b3 = data[next];
    return ((b3 ^ 0x80) < 0x40) ? next + 1 : next;
}

// Checks whether the path contains any default-ignorable code point that the original
// binary strips before comparing package-owned and app-accessible paths.

bool UnicodePolicy::NeedsSanitization(std::string_view input) {
    const auto* data = reinterpret_cast<const uint8_t*>(input.data());
    const size_t len = input.size();

    for (size_t i = 0; i < len;) {
        if (data[i] < 0x80) {
            ++i;
            continue;
        }

        uint32_t cp = 0;
        size_t width = 0;
        if (!DecodeUtf8CodePoint(data, len, i, &cp, &width)) {
            // Invalid UTF-8 is treated as non-ignorable here, matching the device build.
            return false;
        }

        if (IsDefaultIgnorableCodePoint(cp)) {
            return true;
        }
        i += width;
    }
    return false;
}

// Rewrites a string in place, stripping default-ignorable code points the same way the
// device binary does before delegating to MediaProvider policy helpers.

void UnicodePolicy::RewriteString(std::string& input) {
    auto* data = reinterpret_cast<uint8_t*>(input.data());
    const size_t origLen = input.size();
    size_t readPos = 0;
    size_t writePos = 0;

    while (readPos < origLen) {
        if (data[readPos] < 0x80) {
            if (writePos != readPos) {
                data[writePos] = data[readPos];
            }
            ++writePos;
            ++readPos;
            continue;
        }

        uint32_t cp = 0;
        size_t width = 0;
        if (!DecodeUtf8CodePoint(data, origLen, readPos, &cp, &width)) {
            const size_t invalidEnd = InvalidUtf8SpanEnd(data, origLen, readPos);
            LogInvalidUtf8(reinterpret_cast<const uint8_t*>(input.data()), origLen, readPos,
                           invalidEnd);
            readPos = invalidEnd;
            continue;
        }

        if (IsDefaultIgnorableCodePoint(cp)) {
            // Skip this code point (don't write it)
            readPos += width;
            continue;
        }

        // Copy bytes forward if writePos < readPos
        if (writePos != readPos) {
            std::memmove(data + writePos, data + readPos, width);
        }
        writePos += width;
        readPos += width;
    }

    // Truncate string to new length
    if (writePos < origLen) {
        input.resize(writePos);
    }
}

// ASCII case folding matches the lookup-table behavior seen in the analyzed device binary.

static char FoldAscii(uint8_t ch) {
    return static_cast<char>(std::tolower(ch));
}

// This is the core comparison routine used by the sanitizing wrappers below.
// The control flow mirrors the device binary's case-folding compare logic.
//
// Two indices (lhsIdx, rhsIdx) advance through (lhsData, lhsLen) and
// (rhsData, rhsLen) respectively.
//
// Main loop:
//   1. On lhs side: decode UTF-8 at lhsIdx. If it's a default-ignorable,
//      advance lhsIdx past it and repeat. If decode fails, log the ENTIRE
//      lhs string and use the current byte as-is for comparison.
//      When we hit a non-ignorable or invalid byte, we have our lhs char.
//
//   2. Same for rhs side.
//
//   3. Compare FoldAscii(lhs byte) vs FoldAscii(rhs byte).
//      If different, return the difference.
//      If same, advance both indices and continue.
//
//   4. If one side runs out, check if the other side's remaining bytes are
//      all default-ignorable. If so, equal. Otherwise, shorter side is less.
//
// The final return is the byte-wise difference after ASCII folding, which matches the original
// table-driven implementation.

int UnicodePolicy::CompareCaseFoldIgnoringDefaultIgnorables(const uint8_t* lhsData, size_t lhsLen,
                                                            const uint8_t* rhsData, size_t rhsLen) {
    size_t lhsIdx = 0;
    size_t rhsIdx = 0;
    // Tracks the "next index" for each side after skipping ignorables.
    // On invalid UTF-8, nextIdx == current idx (no skip).
    size_t lhsNextIdx = 0;
    size_t rhsNextIdx = 0;

    if (lhsLen == 0 || rhsLen == 0) {
        goto tail_check;
    }

    lhsNextIdx = 0;
    rhsNextIdx = 0;

    while (true) {
        // Advance lhs past ignorable code points.
        while (lhsIdx == lhsNextIdx) {
            if (lhsIdx >= lhsLen)
                goto tail_check;

            if (lhsData[lhsIdx] < 0x80) {
                lhsNextIdx = lhsIdx + 1;
                break;
            }

            uint32_t cp = 0;
            size_t width = 0;
            if (!DecodeUtf8CodePoint(lhsData, lhsLen, lhsIdx, &cp, &width)) {
                // Invalid: log entire lhs, treat byte as non-ignorable
                LogInvalidUtf8(lhsData, lhsLen, lhsIdx, lhsIdx + 1);
                // lhsNextIdx stays == lhsIdx, so we fall through
                break;
            }

            if (!IsDefaultIgnorableCodePoint(cp)) {
                lhsNextIdx = lhsIdx + width;
                break;
            }
            // Skip ignorable
            lhsIdx += width;
            lhsNextIdx = lhsIdx;
        }

        // Advance rhs past ignorable code points.
        while (rhsIdx == rhsNextIdx) {
            if (rhsIdx >= rhsLen)
                goto tail_check;

            if (rhsData[rhsIdx] < 0x80) {
                rhsNextIdx = rhsIdx + 1;
                break;
            }

            uint32_t cp = 0;
            size_t width = 0;
            if (!DecodeUtf8CodePoint(rhsData, rhsLen, rhsIdx, &cp, &width)) {
                LogInvalidUtf8(rhsData, rhsLen, rhsIdx, rhsIdx + 1);
                break;
            }

            if (!IsDefaultIgnorableCodePoint(cp)) {
                rhsNextIdx = rhsIdx + width;
                break;
            }
            rhsIdx += width;
            rhsNextIdx = rhsIdx;
        }

        // Compare the current bytes after ASCII folding.
        {
            const uint8_t lhsByte = static_cast<uint8_t>(FoldAscii(lhsData[lhsIdx]));
            const uint8_t rhsByte = static_cast<uint8_t>(FoldAscii(rhsData[rhsIdx]));
            if (lhsByte != rhsByte) {
                return static_cast<int>(lhsByte) - static_cast<int>(rhsByte);
            }
        }

        lhsIdx++;
        rhsIdx++;

        if (lhsIdx >= lhsLen || rhsIdx >= rhsLen) {
            break;
        }
    }

tail_check:
    // Check if remaining lhs bytes are all default-ignorable
    if (lhsIdx < lhsLen && lhsIdx == lhsNextIdx) {
        while (true) {
            if (lhsNextIdx >= lhsLen)
                break;

            if (lhsData[lhsNextIdx] < 0x80) {
                goto final_compare;
            }

            uint32_t cp = 0;
            size_t width = 0;
            if (!DecodeUtf8CodePoint(lhsData, lhsLen, lhsNextIdx, &cp, &width)) {
                LogInvalidUtf8(lhsData, lhsLen, lhsNextIdx, lhsNextIdx + 1);
                goto final_compare;
            }

            if (!IsDefaultIgnorableCodePoint(cp)) {
                goto final_compare;
            }
            lhsNextIdx += width;
        }
        lhsIdx = lhsLen;  // All remaining were ignorable
    }

    // Check if remaining rhs bytes are all default-ignorable
    if (rhsIdx < rhsLen && rhsIdx == rhsNextIdx) {
        while (true) {
            if (rhsNextIdx >= rhsLen)
                break;

            if (rhsData[rhsNextIdx] < 0x80) {
                goto final_compare;
            }

            uint32_t cp = 0;
            size_t width = 0;
            if (!DecodeUtf8CodePoint(rhsData, rhsLen, rhsNextIdx, &cp, &width)) {
                LogInvalidUtf8(rhsData, rhsLen, rhsNextIdx, rhsNextIdx + 1);
                goto final_compare;
            }

            if (!IsDefaultIgnorableCodePoint(cp)) {
                goto final_compare;
            }
            rhsNextIdx += width;
        }
        rhsIdx = rhsLen;  // All remaining were ignorable
    }

final_compare:
    // If both sides are exhausted, return equality. Otherwise return the folded byte difference.
    {
        const uint8_t lhsByte =
            (lhsIdx < lhsLen) ? static_cast<uint8_t>(FoldAscii(lhsData[lhsIdx])) : 0;
        const uint8_t rhsByte =
            (rhsIdx < rhsLen) ? static_cast<uint8_t>(FoldAscii(rhsData[rhsIdx])) : 0;
        return static_cast<int>(lhsByte) - static_cast<int>(rhsByte);
    }
}

std::string DebugPreview(std::string_view value, size_t limit) {
    return UnicodePolicy::DebugPreview(value, limit);
}

std::string EscapeForLog(const uint8_t* data, size_t length) {
    return UnicodePolicy::EscapeForLog(data, length);
}

void LogInvalidUtf8(const uint8_t* data, size_t dataLen, size_t begin, size_t end) {
    UnicodePolicy::LogInvalidUtf8(data, dataLen, begin, end);
}

void LogSuspiciousDirectPath(const char* hookName, std::string_view path) {
    UnicodePolicy::LogSuspiciousDirectPath(hookName, path);
}

bool DecodeUtf8CodePoint(const uint8_t* data, size_t len, size_t index, uint32_t* cp,
                         size_t* width) {
    return UnicodePolicy::DecodeUtf8CodePoint(data, len, index, cp, width);
}

size_t InvalidUtf8SpanEnd(const uint8_t* data, size_t len, size_t index) {
    return UnicodePolicy::InvalidUtf8SpanEnd(data, len, index);
}

bool NeedsSanitization(std::string_view input) {
    return UnicodePolicy::NeedsSanitization(input);
}

void RewriteString(std::string& input) {
    UnicodePolicy::RewriteString(input);
}

int CompareCaseFoldIgnoringDefaultIgnorables(const uint8_t* lhsData, size_t lhsLen,
                                             const uint8_t* rhsData, size_t rhsLen) {
    return UnicodePolicy::CompareCaseFoldIgnoringDefaultIgnorables(lhsData, lhsLen, rhsData,
                                                                   rhsLen);
}

}  // namespace fusehide
