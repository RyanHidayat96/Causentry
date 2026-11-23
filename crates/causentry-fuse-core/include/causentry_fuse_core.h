#pragma once

#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>

#ifdef __cplusplus
extern "C" {
#endif

typedef struct {
    uint8_t* ptr;
    size_t len;
    size_t cap;
} CausentryBuf;

void causentry_fuse_buf_free(CausentryBuf buf);

// Unicode 12.1 & strict UTF-8
bool causentry_fuse_is_default_ignorable(uint32_t cp);
bool causentry_fuse_contains_ignorable_utf8(const uint8_t* ptr, size_t len);
bool causentry_fuse_decode_utf8(const uint8_t* ptr, size_t len, size_t index,
                                uint32_t* cp, size_t* width);
bool causentry_fuse_escape_for_log(const uint8_t* ptr, size_t len, CausentryBuf* out);

// Path normalization & canonicalization
size_t causentry_fuse_visible_storage_root_len(const uint8_t* ptr, size_t len);
bool causentry_fuse_normalize_relative_path(const uint8_t* ptr, size_t len, CausentryBuf* out);
bool causentry_fuse_canonicalize_entry_name(const uint8_t* ptr, size_t len, CausentryBuf* out);
bool causentry_fuse_canonicalize_relative_path(const uint8_t* ptr, size_t len, CausentryBuf* out);

// Overflow-checked FUSE dirent / direntplus wire-format math
bool causentry_fuse_align_dirent_name(size_t name_len, size_t* aligned_size);
bool causentry_fuse_dirent_record_size(uint32_t name_len, size_t available, size_t* record_size);
bool causentry_fuse_direntplus_record_size(uint32_t name_len, size_t available, size_t* record_size);

#ifdef __cplusplus
}
#endif
