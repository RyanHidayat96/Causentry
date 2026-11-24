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

typedef struct {
    uint64_t symtab;
    uint64_t strtab;
    uint64_t hash;
    uint64_t gnu_hash;
    uint64_t jmprel;
    size_t pltrel_size;
    uint64_t rela;
    size_t rela_size;
    uint64_t rel;
    size_t rel_size;
    size_t syment;
    bool uses_rela;
} CausentryElfDynamicInfo;

typedef struct {
    uint64_t mapped_start;
    uint64_t mapped_end;
    size_t file_offset;
    uint64_t exec_start;
    uint64_t exec_end;
    int32_t exec_perms;
    CausentryBuf path;
} CausentryMapsMatch;

typedef bool (*CausentryNamePredicate)(void* ctx, const uint8_t* name, size_t name_len);
typedef bool (*CausentryDirentPredicate)(void* ctx, uint64_t ino, const uint8_t* name, size_t name_len);

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

// Overflow-checked FUSE dirent / direntplus / read_out wire-format filtering
bool causentry_fuse_align_dirent_name(size_t name_len, size_t* aligned_size);
bool causentry_fuse_dirent_record_size(uint32_t name_len, size_t available, size_t* record_size);
bool causentry_fuse_direntplus_record_size(uint32_t name_len, size_t available, size_t* record_size);
bool causentry_fuse_find_emulated_zero_nodeid(const uint8_t* data, size_t len, uint64_t* out_nodeid);
bool causentry_fuse_strip_sensitive_direntplus_cache(
    const uint8_t* data, size_t len, CausentryNamePredicate pred, void* ctx,
    CausentryBuf* out_buf, size_t* out_changed);
bool causentry_fuse_filter_dirent_payload(
    const uint8_t* data, size_t len, bool is_direntplus, CausentryDirentPredicate pred, void* ctx,
    CausentryBuf* out_buf, size_t* out_removed);
bool causentry_fuse_filter_read_out_dirent_payload(
    const uint8_t* data, size_t len, CausentryDirentPredicate pred, void* ctx,
    CausentryBuf* out_buf, size_t* out_removed);

// ELF32/64, APK/ZIP stored-ELF locator, pure-Rust XZ (.gnu_debugdata), and /proc/self/maps parser
bool causentry_fuse_find_embedded_stored_elf(
    const uint8_t* apk, size_t apk_len, const uint8_t* entry_path, size_t entry_len,
    size_t* out_offset, size_t* out_size);
bool causentry_fuse_decompress_gnu_debugdata(
    const uint8_t* compressed, size_t len, size_t max_out, CausentryBuf* out_buf);
bool causentry_fuse_find_named_section(
    const uint8_t* elf, size_t elf_len, const uint8_t* name, size_t name_len,
    size_t* out_offset, size_t* out_size);
bool causentry_fuse_find_symbol_offset(
    const uint8_t* elf, size_t elf_len, const uint8_t* name, size_t name_len, uint64_t* out_value);
bool causentry_fuse_find_symbol_offsets_batch(
    const uint8_t* elf, size_t elf_len, const uint8_t* const* names, const size_t* name_lens,
    size_t count, uint64_t* out_values, bool* out_found);
bool causentry_fuse_find_largest_symbol_containing(
    const uint8_t* elf, size_t elf_len, const uint8_t* needle, size_t needle_len,
    uint64_t* out_value, size_t* out_size, CausentryBuf* out_name);
bool causentry_fuse_vaddr_to_file_offset(
    const uint8_t* elf, size_t elf_len, uint64_t vaddr, size_t* out_offset);
bool causentry_fuse_parse_dynamic_info(
    const uint8_t* elf, size_t elf_len, CausentryElfDynamicInfo* out_info);
uint32_t causentry_fuse_compute_gnu_hash(const uint8_t* name, size_t len);
uint32_t causentry_fuse_compute_elf_hash(const uint8_t* name, size_t len);
size_t causentry_fuse_dynamic_symbol_count(
    const uint8_t* elf, size_t elf_len, const CausentryElfDynamicInfo* info);
bool causentry_fuse_find_dynamic_symbol_index_with_gnu_hash(
    const uint8_t* elf, size_t elf_len, const CausentryElfDynamicInfo* info,
    const uint8_t* name, size_t name_len, uint32_t gnu_hash, uint32_t* out_idx);
bool causentry_fuse_find_dynamic_symbol_index(
    const uint8_t* elf, size_t elf_len, const CausentryElfDynamicInfo* info,
    const uint8_t* name, size_t name_len, uint32_t* out_idx);
bool causentry_fuse_find_relocation_slots_for_symbol(
    const uint8_t* elf, size_t elf_len, const CausentryElfDynamicInfo* info,
    uint32_t sym_index, uint64_t load_bias, CausentryBuf* out_u64_bytes);
bool causentry_fuse_parse_maps_for_marker(
    const uint8_t* maps, size_t maps_len, const uint8_t* marker, size_t marker_len,
    CausentryMapsMatch* out_match);

#ifdef __cplusplus
}
#endif
