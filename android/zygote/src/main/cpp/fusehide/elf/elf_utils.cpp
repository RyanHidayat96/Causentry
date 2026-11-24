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

#include "fusehide/elf/elf_utils.hpp"
#include "causentry_fuse_core.h"

namespace fusehide {

namespace {

bool IsReadableFilePath(const std::string& path) {
    const int fd = open(path.c_str(), O_RDONLY | O_CLOEXEC);
    if (fd < 0) {
        return false;
    }
    close(fd);
    return true;
}

std::string ReadSelfMaps() {
    const int fd = open("/proc/self/maps", O_RDONLY | O_CLOEXEC);
    if (fd < 0) {
        return {};
    }
    std::string contents;
    char buf[4096];
    while (true) {
        const ssize_t n = read(fd, buf, sizeof(buf));
        if (n < 0) {
            if (errno == EINTR) {
                continue;
            }
            break;
        }
        if (n == 0) {
            break;
        }
        contents.append(buf, static_cast<size_t>(n));
    }
    close(fd);
    return contents;
}

std::string TakeRustPath(CausentryBuf buf) {
    std::string out;
    if (buf.ptr != nullptr && buf.len > 0) {
        out.assign(reinterpret_cast<const char*>(buf.ptr), buf.len);
    }
    causentry_fuse_buf_free(buf);
    return out;
}

CausentryElfDynamicInfo ToRustDynamicInfo(const DynamicInfo& info) {
    CausentryElfDynamicInfo out{};
    out.symtab = info.symtab;
    out.strtab = info.strtab;
    out.hash = info.hash;
    out.gnu_hash = info.gnuHash;
    out.jmprel = info.jmprel;
    out.pltrel_size = info.pltrelSize;
    out.rela = info.rela;
    out.rela_size = info.relaSize;
    out.rel = info.rel;
    out.rel_size = info.relSize;
    out.syment = info.syment;
    out.uses_rela = info.usesRela;
    return out;
}

void EnrichModuleFromMaps(ModuleInfo* module) {
    if (module == nullptr || module->base == 0) {
        return;
    }
    const std::string maps = ReadSelfMaps();
    if (maps.empty()) {
        return;
    }
    const std::string_view marker(kTargetLibrary);
    CausentryMapsMatch match{};
    if (!causentry_fuse_parse_maps_for_marker(
            reinterpret_cast<const uint8_t*>(maps.data()), maps.size(),
            reinterpret_cast<const uint8_t*>(marker.data()), marker.size(), &match)) {
        return;
    }
    const std::string parsedPath = TakeRustPath(match.path);
    const bool modulePathUsable = module->path.empty() ||
                                  module->path.find("!/") != std::string::npos ||
                                  IsReadableFilePath(module->path);
    if (!modulePathUsable && !parsedPath.empty() && IsReadableFilePath(parsedPath)) {
        module->path = parsedPath;
    }
    module->mappedStart = static_cast<uintptr_t>(match.mapped_start);
    module->mappedEnd = static_cast<uintptr_t>(match.mapped_end);
    module->fileOffset = match.file_offset;
    module->execStart = static_cast<uintptr_t>(match.exec_start);
    module->execEnd = static_cast<uintptr_t>(match.exec_end);
    module->execPerms = match.exec_perms;
}

int DlIterateCallback(dl_phdr_info* info, size_t, void* data) {
    auto* module = reinterpret_cast<ModuleInfo*>(data);
    if (info == nullptr || info->dlpi_name == nullptr) {
        return 0;
    }
    const std::string_view name(info->dlpi_name);
    if (name.find(kTargetLibrary) == std::string_view::npos) {
        return 0;
    }
    module->base = static_cast<uintptr_t>(info->dlpi_addr);
    module->path = info->dlpi_name;
    module->phdrs = reinterpret_cast<const ElfProgramHeader*>(info->dlpi_phdr);
    module->phnum = info->dlpi_phnum;
    return 1;
}

}  // namespace

std::optional<ModuleInfo> FindModuleFromMaps(std::string_view pathMarker) {
    if (pathMarker.empty()) {
        return std::nullopt;
    }
    const std::string maps = ReadSelfMaps();
    if (maps.empty()) {
        return std::nullopt;
    }
    CausentryMapsMatch match{};
    if (!causentry_fuse_parse_maps_for_marker(
            reinterpret_cast<const uint8_t*>(maps.data()), maps.size(),
            reinterpret_cast<const uint8_t*>(pathMarker.data()), pathMarker.size(), &match)) {
        return std::nullopt;
    }
    ModuleInfo module;
    module.base = static_cast<uintptr_t>(match.mapped_start);
    module.path = TakeRustPath(match.path);
    module.mappedStart = static_cast<uintptr_t>(match.mapped_start);
    module.mappedEnd = static_cast<uintptr_t>(match.mapped_end);
    module.fileOffset = match.file_offset;
    module.execStart = static_cast<uintptr_t>(match.exec_start);
    module.execEnd = static_cast<uintptr_t>(match.exec_end);
    module.execPerms = match.exec_perms;
    return module;
}

std::optional<ModuleInfo> FindModuleFromMaps() {
    return FindModuleFromMaps(kTargetLibrary);
}

std::optional<ModuleInfo> FindTargetModule() {
    ModuleInfo module;
    dl_iterate_phdr(DlIterateCallback, &module);
    if (module.base != 0 && !module.path.empty()) {
        EnrichModuleFromMaps(&module);
        return module;
    }
    return FindModuleFromMaps();
}

std::optional<MappedFile> MapReadOnlyFile(const std::string& path, size_t fileOffset) {
    const int fd = open(path.c_str(), O_RDONLY | O_CLOEXEC);
    if (fd < 0) {
        __android_log_print(6, kLogTag, "failed with %d %s: elf_parser: open %s", errno,
                            strerror(errno), path.c_str());
        return std::nullopt;
    }

    struct stat st{};
    if (fstat(fd, &st) != 0) {
        __android_log_print(6, kLogTag, "failed with %d %s: elf_parser: stat %s", errno,
                            strerror(errno), path.c_str());
        close(fd);
        return std::nullopt;
    }

    size_t effectiveOffset = 0;
    if (fileOffset != 0 && fileOffset < static_cast<size_t>(st.st_size)) {
        char elfMagic[SELFMAG];
        const ssize_t bytesRead =
            pread(fd, elfMagic, sizeof(elfMagic), static_cast<off_t>(fileOffset));
        if (bytesRead == SELFMAG && std::memcmp(elfMagic, ELFMAG, SELFMAG) == 0) {
            effectiveOffset = fileOffset;
        } else {
            __android_log_print(4, kLogTag, "elf_parser: offset %zu in %s is not an ELF header",
                                fileOffset, path.c_str());
            close(fd);
            return std::nullopt;
        }
    } else if (fileOffset != 0) {
        __android_log_print(4, kLogTag, "elf_parser: offset %zu is outside %s size %zu", fileOffset,
                            path.c_str(), static_cast<size_t>(st.st_size));
        close(fd);
        return std::nullopt;
    }

    const size_t pageSize = static_cast<size_t>(getpagesize());
    const size_t mapOffset = effectiveOffset & ~(pageSize - 1);
    const size_t delta = effectiveOffset - mapOffset;
    const size_t mapSize = static_cast<size_t>(st.st_size) - mapOffset;
    void* address =
        mmap(nullptr, mapSize, PROT_READ, MAP_PRIVATE, fd, static_cast<off_t>(mapOffset));
    close(fd);
    if (address == MAP_FAILED) {
        __android_log_print(6, kLogTag, "failed with %d %s: elf_parser: mmap %s", errno,
                            strerror(errno), path.c_str());
        return std::nullopt;
    }

    const auto* mappedBytes = reinterpret_cast<const std::byte*>(address);
    return MappedFile{address, mapSize, mappedBytes + delta, mapSize - delta};
}

std::optional<MappedFile> MakeOwnedFile(std::vector<std::byte> bytes) {
    if (bytes.empty()) {
        return std::nullopt;
    }
    auto owned = std::make_shared<std::vector<std::byte>>(std::move(bytes));
    MappedFile file;
    file.owned = owned;
    file.data = owned->data();
    file.size = owned->size();
    return file;
}

uint16_t ReadLe16(const std::byte* ptr) {
    uint16_t value = 0;
    std::memcpy(&value, ptr, sizeof(value));
    return value;
}

uint32_t ReadLe32(const std::byte* ptr) {
    uint32_t value = 0;
    std::memcpy(&value, ptr, sizeof(value));
    return value;
}

std::optional<MappedFile> MapEmbeddedStoredElf(const std::string& modulePath) {
    const size_t bang = modulePath.find("!/");
    if (bang == std::string::npos) {
        return std::nullopt;
    }
    const std::string apkPath = modulePath.substr(0, bang);
    const std::string entryPath = modulePath.substr(bang + 2);

    auto apk = MapReadOnlyFile(apkPath);
    if (!apk.has_value()) {
        return std::nullopt;
    }

    size_t dataOffset = 0;
    size_t dataSize = 0;
    if (!causentry_fuse_find_embedded_stored_elf(
            reinterpret_cast<const uint8_t*>(apk->bytes()), apk->size,
            reinterpret_cast<const uint8_t*>(entryPath.data()), entryPath.size(), &dataOffset,
            &dataSize)) {
        __android_log_print(5, kLogTag, "embedded entry not found or unsupported: %s",
                            entryPath.c_str());
        return std::nullopt;
    }

    MappedFile embedded = std::move(*apk);
    embedded.data = embedded.bytes() + dataOffset;
    embedded.size = dataSize;
    __android_log_print(4, kLogTag, "mapped embedded elf entry=%s size=%zu", entryPath.c_str(),
                        dataSize);
    return embedded;
}

std::optional<std::pair<const std::byte*, size_t>> FindNamedSectionData(const MappedFile& file,
                                                                        std::string_view name) {
    size_t offset = 0;
    size_t sectionSize = 0;
    if (!causentry_fuse_find_named_section(
            reinterpret_cast<const uint8_t*>(file.bytes()), file.size,
            reinterpret_cast<const uint8_t*>(name.data()), name.size(), &offset, &sectionSize)) {
        return std::nullopt;
    }
    return std::pair<const std::byte*, size_t>{file.bytes() + offset, sectionSize};
}

std::optional<MappedFile> DecompressGnuDebugdata(const std::byte* compressed, size_t size) {
    if (compressed == nullptr || size == 0) {
        return std::nullopt;
    }
    CausentryBuf outBuf{};
    if (!causentry_fuse_decompress_gnu_debugdata(reinterpret_cast<const uint8_t*>(compressed), size,
                                                 kMaxGnuDebugdataOutputBytes, &outBuf)) {
        __android_log_print(5, kLogTag, "gnu_debugdata pure-Rust XZ decompress failed in=%zu", size);
        return std::nullopt;
    }
    std::vector<std::byte> output(outBuf.len);
    if (outBuf.ptr != nullptr && outBuf.len > 0) {
        std::memcpy(output.data(), outBuf.ptr, outBuf.len);
    }
    causentry_fuse_buf_free(outBuf);
    __android_log_print(4, kLogTag, "decompressed .gnu_debugdata via Rust XZ in=%zu out=%zu", size,
                        output.size());
    return MakeOwnedFile(std::move(output));
}

std::optional<uintptr_t> FindSymbolOffset(const MappedFile& file, std::string_view symbolName) {
    uint64_t value = 0;
    if (!causentry_fuse_find_symbol_offset(
            reinterpret_cast<const uint8_t*>(file.bytes()), file.size,
            reinterpret_cast<const uint8_t*>(symbolName.data()), symbolName.size(), &value)) {
        return std::nullopt;
    }
    return static_cast<uintptr_t>(value);
}

std::vector<std::optional<uintptr_t>> FindSymbolOffsetsOnce(
    const MappedFile& file, std::span<const std::string_view> names) {
    std::vector<std::optional<uintptr_t>> values(names.size());
    if (names.empty()) {
        return values;
    }
    std::vector<const uint8_t*> ptrs(names.size());
    std::vector<size_t> lens(names.size());
    for (size_t i = 0; i < names.size(); ++i) {
        ptrs[i] = reinterpret_cast<const uint8_t*>(names[i].data());
        lens[i] = names[i].size();
    }
    std::vector<uint64_t> outValues(names.size(), 0);
    // Avoid vector<bool> bit-packing; Rust expects contiguous `bool*`.
    std::vector<uint8_t> outFound(names.size(), 0);
    if (causentry_fuse_find_symbol_offsets_batch(
            reinterpret_cast<const uint8_t*>(file.bytes()), file.size, ptrs.data(), lens.data(),
            names.size(), outValues.data(), reinterpret_cast<bool*>(outFound.data()))) {
        for (size_t i = 0; i < names.size(); ++i) {
            if (outFound[i] != 0) {
                values[i] = static_cast<uintptr_t>(outValues[i]);
            }
        }
    }
    return values;
}

std::optional<SymbolMatch> FindLargestSymbolContaining(const MappedFile& file,
                                                       std::string_view needle) {
    uint64_t value = 0;
    size_t symSize = 0;
    CausentryBuf outName{};
    if (!causentry_fuse_find_largest_symbol_containing(
            reinterpret_cast<const uint8_t*>(file.bytes()), file.size,
            reinterpret_cast<const uint8_t*>(needle.data()), needle.size(), &value, &symSize,
            &outName)) {
        return std::nullopt;
    }
    SymbolMatch match;
    match.value = static_cast<uintptr_t>(value);
    match.size = symSize;
    match.name = TakeRustPath(outName);
    __android_log_print(4, kLogTag,
                        "resolved by contains needle=%.*s picked=%s value=%p size=%zu",
                        static_cast<int>(needle.size()), needle.data(), match.name.c_str(),
                        reinterpret_cast<void*>(match.value), match.size);
    return match;
}

std::optional<size_t> VirtualAddressToFileOffset(const MappedFile& file, uintptr_t address) {
    size_t offset = 0;
    if (!causentry_fuse_vaddr_to_file_offset(reinterpret_cast<const uint8_t*>(file.bytes()),
                                             file.size, static_cast<uint64_t>(address), &offset)) {
        return std::nullopt;
    }
    return offset;
}

std::optional<DynamicInfo> ParseDynamicInfo(const MappedFile& file) {
    CausentryElfDynamicInfo raw{};
    if (!causentry_fuse_parse_dynamic_info(reinterpret_cast<const uint8_t*>(file.bytes()),
                                           file.size, &raw)) {
        return std::nullopt;
    }
    DynamicInfo info;
    info.symtab = static_cast<uintptr_t>(raw.symtab);
    info.strtab = static_cast<uintptr_t>(raw.strtab);
    info.hash = static_cast<uintptr_t>(raw.hash);
    info.gnuHash = static_cast<uintptr_t>(raw.gnu_hash);
    info.jmprel = static_cast<uintptr_t>(raw.jmprel);
    info.pltrelSize = raw.pltrel_size;
    info.rela = static_cast<uintptr_t>(raw.rela);
    info.relaSize = raw.rela_size;
    info.rel = static_cast<uintptr_t>(raw.rel);
    info.relSize = raw.rel_size;
    info.syment = raw.syment;
    info.usesRela = raw.uses_rela;
    return info;
}

std::optional<RuntimeDynamicInfo> ParseRuntimeDynamicInfo(const ModuleInfo& module) {
    if (module.base == 0 || module.phdrs == nullptr || module.phnum == 0) {
        return std::nullopt;
    }

    RuntimeDynamicInfo info;
    const ElfProgramHeader* dynamicPhdr = nullptr;
    for (uint16_t i = 0; i < module.phnum; ++i) {
        if (module.phdrs[i].p_type == PT_DYNAMIC) {
            dynamicPhdr = &module.phdrs[i];
            break;
        }
    }
    if (dynamicPhdr == nullptr) {
        return std::nullopt;
    }

    const auto* dyn = reinterpret_cast<const ElfDynamic*>(module.base + dynamicPhdr->p_vaddr);
    const size_t dynCount = dynamicPhdr->p_memsz / sizeof(ElfDynamic);
    for (size_t i = 0; i < dynCount; ++i) {
        switch (dyn[i].d_tag) {
            case DT_SYMTAB:
                info.symtab =
                    reinterpret_cast<const ElfSymbol*>(RuntimePtr(module.base, dyn[i].d_un.d_ptr));
                break;
            case DT_STRTAB:
                info.strtab =
                    reinterpret_cast<const char*>(RuntimePtr(module.base, dyn[i].d_un.d_ptr));
                break;
            case DT_HASH:
                info.hash =
                    reinterpret_cast<const uint32_t*>(RuntimePtr(module.base, dyn[i].d_un.d_ptr));
                break;
            case DT_GNU_HASH:
                info.gnuHash =
                    reinterpret_cast<const uint32_t*>(RuntimePtr(module.base, dyn[i].d_un.d_ptr));
                break;
            case DT_JMPREL:
                info.jmprel = RuntimePtr(module.base, dyn[i].d_un.d_ptr);
                break;
            case DT_PLTRELSZ:
                info.pltrelSize = dyn[i].d_un.d_val;
                break;
            case DT_RELA:
                info.rela = RuntimePtr(module.base, dyn[i].d_un.d_ptr);
                break;
            case DT_RELASZ:
                info.relaSize = dyn[i].d_un.d_val;
                break;
            case DT_REL:
                info.rel = RuntimePtr(module.base, dyn[i].d_un.d_ptr);
                break;
            case DT_RELSZ:
                info.relSize = dyn[i].d_un.d_val;
                break;
            case DT_SYMENT:
                info.syment = dyn[i].d_un.d_val;
                break;
            case DT_PLTREL:
                info.usesRela = dyn[i].d_un.d_val == DT_RELA;
                break;
            default:
                break;
        }
    }

    if (info.symtab == nullptr || info.strtab == nullptr) {
        return std::nullopt;
    }
    return info;
}

const ElfSymbol* DynamicSymbolTable(const MappedFile& file, const DynamicInfo& info) {
    const auto offset = VirtualAddressToFileOffset(file, info.symtab);
    if (!offset.has_value())
        return nullptr;
    return reinterpret_cast<const ElfSymbol*>(file.bytes() + *offset);
}

const char* DynamicStringTable(const MappedFile& file, const DynamicInfo& info) {
    const auto offset = VirtualAddressToFileOffset(file, info.strtab);
    if (!offset.has_value())
        return nullptr;
    return reinterpret_cast<const char*>(file.bytes() + *offset);
}

size_t DynamicSymbolCount(const MappedFile& file, const DynamicInfo& info) {
    const auto rustInfo = ToRustDynamicInfo(info);
    return causentry_fuse_dynamic_symbol_count(reinterpret_cast<const uint8_t*>(file.bytes()),
                                               file.size, &rustInfo);
}

uint32_t ComputeGnuHash(const uint8_t* name, size_t len) {
    return causentry_fuse_compute_gnu_hash(name, len);
}

uint32_t ComputeElfHash(const uint8_t* name, size_t len) {
    return causentry_fuse_compute_elf_hash(name, len);
}

std::optional<uint32_t> FindDynamicSymbolIndexWithGnuHash(const MappedFile& file,
                                                          const DynamicInfo& info,
                                                          const uint8_t* name, size_t nameLen,
                                                          uint32_t gnuHash) {
    const auto rustInfo = ToRustDynamicInfo(info);
    uint32_t idx = 0;
    if (!causentry_fuse_find_dynamic_symbol_index_with_gnu_hash(
            reinterpret_cast<const uint8_t*>(file.bytes()), file.size, &rustInfo, name, nameLen,
            gnuHash, &idx)) {
        return std::nullopt;
    }
    return idx;
}

std::optional<uint32_t> FindDynamicSymbolIndex(const MappedFile& file, const DynamicInfo& info,
                                               const uint8_t* name, size_t nameLen) {
    const auto rustInfo = ToRustDynamicInfo(info);
    uint32_t idx = 0;
    if (!causentry_fuse_find_dynamic_symbol_index(reinterpret_cast<const uint8_t*>(file.bytes()),
                                                  file.size, &rustInfo, name, nameLen, &idx)) {
        return std::nullopt;
    }
    return idx;
}

std::optional<uint32_t> FindRuntimeSymbolIndexWithGnuHash(const RuntimeDynamicInfo& info,
                                                          const uint8_t* name, size_t nameLen,
                                                          uint32_t gnuHash) {
    if (info.gnuHash == nullptr)
        return std::nullopt;

    const auto* words = info.gnuHash;
    const uint32_t nbuckets = words[0];
    const uint32_t symoffset = words[1];
    const uint32_t bloomSize = words[2];
    const uint32_t bloomShift = words[3];
    if (nbuckets == 0 || bloomSize == 0)
        return std::nullopt;

    const auto* bloom = reinterpret_cast<const uintptr_t*>(words + 4);
    const auto* buckets = reinterpret_cast<const uint32_t*>(bloom + bloomSize);
    const auto* chains = buckets + nbuckets;
    const uintptr_t bloomWord = bloom[(gnuHash / (sizeof(uintptr_t) * 8U)) % bloomSize];
    const uintptr_t mask = (uintptr_t{1} << (gnuHash % (sizeof(uintptr_t) * 8U))) |
                           (uintptr_t{1} << ((gnuHash >> bloomShift) % (sizeof(uintptr_t) * 8U)));
    if ((bloomWord & mask) != mask)
        return std::nullopt;

    uint32_t symbolIndex = buckets[gnuHash % nbuckets];
    if (symbolIndex < symoffset)
        return std::nullopt;

    for (;; ++symbolIndex) {
        const uint32_t chainHash = chains[symbolIndex - symoffset];
        if ((chainHash ^ gnuHash) < 2) {
            const auto& symbol = info.symtab[symbolIndex];
            const char* currentName = info.strtab + symbol.st_name;
            const size_t currentLen = std::strlen(currentName);
            if (nameLen == currentLen && std::memcmp(name, currentName, nameLen) == 0) {
                return symbolIndex;
            }
        }
        if ((chainHash & 1U) != 0U)
            break;
    }
    return std::nullopt;
}

std::optional<uint32_t> FindRuntimeSymbolIndexWithSysvHash(const RuntimeDynamicInfo& info,
                                                           const uint8_t* name, size_t nameLen,
                                                           uint32_t elfHash) {
    if (info.hash == nullptr)
        return std::nullopt;
    const uint32_t nbucket = info.hash[0];
    const uint32_t nchain = info.hash[1];
    if (nbucket == 0 || nchain == 0)
        return std::nullopt;

    const auto* buckets = info.hash + 2;
    const auto* chains = buckets + nbucket;
    uint32_t idx = buckets[elfHash % nbucket];
    while (idx != 0 && idx < nchain) {
        const auto& sym = info.symtab[idx];
        const char* currentName = info.strtab + sym.st_name;
        const size_t currentLen = std::strlen(currentName);
        if (nameLen == currentLen && std::memcmp(name, currentName, nameLen) == 0) {
            return idx;
        }
        idx = chains[idx];
    }
    return std::nullopt;
}

std::optional<uint32_t> FindRuntimeSymbolIndexLinear(const RuntimeDynamicInfo& info,
                                                     const uint8_t* name, size_t nameLen) {
    size_t symbolCount = 0;
    if (info.hash != nullptr) {
        symbolCount = info.hash[1];
    } else if (info.gnuHash != nullptr) {
        const uint32_t nbuckets = info.gnuHash[0];
        const uint32_t symoffset = info.gnuHash[1];
        const uint32_t bloomSize = info.gnuHash[2];
        const auto* bloom = reinterpret_cast<const uintptr_t*>(info.gnuHash + 4);
        const auto* buckets = reinterpret_cast<const uint32_t*>(bloom + bloomSize);
        const auto* chains = buckets + nbuckets;
        uint32_t maxSymbol = symoffset;
        for (uint32_t i = 0; i < nbuckets; ++i) {
            if (buckets[i] > maxSymbol)
                maxSymbol = buckets[i];
        }
        if (maxSymbol == symoffset) {
            symbolCount = symoffset;
        } else {
            uint32_t chainIndex = maxSymbol - symoffset;
            while ((chains[chainIndex] & 1U) == 0U)
                ++chainIndex;
            symbolCount = symoffset + chainIndex + 1;
        }
    }
    if (symbolCount == 0)
        return std::nullopt;

    for (size_t i = 0; i < symbolCount; ++i) {
        const auto& sym = info.symtab[i];
        const char* currentName = info.strtab + sym.st_name;
        const size_t currentLen = std::strlen(currentName);
        if (nameLen == currentLen && std::memcmp(name, currentName, nameLen) == 0) {
            return static_cast<uint32_t>(i);
        }
    }
    return std::nullopt;
}

std::optional<uint32_t> FindRuntimeSymbolIndex(const RuntimeDynamicInfo& info, const uint8_t* name,
                                               size_t nameLen) {
    const uint32_t gnuHash = ComputeGnuHash(name, nameLen);
    if (auto index = FindRuntimeSymbolIndexWithGnuHash(info, name, nameLen, gnuHash);
        index.has_value()) {
        return index;
    }

    const uint32_t elfHash = ComputeElfHash(name, nameLen);
    if (auto index = FindRuntimeSymbolIndexWithSysvHash(info, name, nameLen, elfHash);
        index.has_value()) {
        return index;
    }

    return FindRuntimeSymbolIndexLinear(info, name, nameLen);
}

#if defined(__aarch64__)
static constexpr auto kRelocationTypeJumpSlot = static_cast<uint32_t>(R_AARCH64_JUMP_SLOT);
static constexpr auto kRelocationTypeGlobDat = static_cast<uint32_t>(R_AARCH64_GLOB_DAT);
static constexpr auto kRelocationTypeAbs = static_cast<uint32_t>(R_AARCH64_ABS64);
#elif defined(__arm__)
static constexpr auto kRelocationTypeJumpSlot = static_cast<uint32_t>(R_ARM_JUMP_SLOT);
static constexpr auto kRelocationTypeGlobDat = static_cast<uint32_t>(R_ARM_GLOB_DAT);
static constexpr auto kRelocationTypeAbs = static_cast<uint32_t>(R_ARM_ABS32);
#elif defined(__x86_64__)
static constexpr auto kRelocationTypeJumpSlot = static_cast<uint32_t>(R_X86_64_JUMP_SLOT);
static constexpr auto kRelocationTypeGlobDat = static_cast<uint32_t>(R_X86_64_GLOB_DAT);
static constexpr auto kRelocationTypeAbs = static_cast<uint32_t>(R_X86_64_64);
#elif defined(__i386__)
static constexpr auto kRelocationTypeJumpSlot = static_cast<uint32_t>(R_386_JMP_SLOT);
static constexpr auto kRelocationTypeGlobDat = static_cast<uint32_t>(R_386_GLOB_DAT);
static constexpr auto kRelocationTypeAbs = static_cast<uint32_t>(R_386_32);
#else
#error Unsupported ELF relocation architecture
#endif

std::vector<uintptr_t> FindRelocationSlotsForSymbol(const MappedFile& file, const DynamicInfo& info,
                                                    uint32_t symIndex, uintptr_t loadBias) {
    std::vector<uintptr_t> slots;
    const auto rustInfo = ToRustDynamicInfo(info);
    CausentryBuf outBuf{};
    if (!causentry_fuse_find_relocation_slots_for_symbol(
            reinterpret_cast<const uint8_t*>(file.bytes()), file.size, &rustInfo, symIndex,
            static_cast<uint64_t>(loadBias), &outBuf)) {
        return slots;
    }
    const size_t count = outBuf.len / sizeof(uint64_t);
    slots.reserve(count);
    for (size_t i = 0; i < count; ++i) {
        uint64_t addr = 0;
        std::memcpy(&addr, outBuf.ptr + i * sizeof(uint64_t), sizeof(uint64_t));
        slots.push_back(static_cast<uintptr_t>(addr));
    }
    causentry_fuse_buf_free(outBuf);
    return slots;
}

void CollectRuntimeRelocationSlots(uintptr_t relocAddress, size_t relocBytes, bool rela,
                                   uint32_t targetSymIndex, uintptr_t loadBias,
                                   std::vector<uintptr_t>& slots) {
    if (relocAddress == 0 || relocBytes == 0)
        return;

    const size_t entrySize = rela ? sizeof(ElfRelocationWithAddend) : sizeof(ElfRelocationNoAddend);
    const size_t count = relocBytes / entrySize;
    for (size_t i = 0; i < count; ++i) {
        uint64_t infoValue = 0;
        uintptr_t offsetValue = 0;
        if (rela) {
            const auto* r = reinterpret_cast<const ElfRelocationWithAddend*>(
                relocAddress + i * sizeof(ElfRelocationWithAddend));
            infoValue = r->r_info;
            offsetValue = r->r_offset;
        } else {
            const auto* r = reinterpret_cast<const ElfRelocationNoAddend*>(
                relocAddress + i * sizeof(ElfRelocationNoAddend));
            infoValue = r->r_info;
            offsetValue = r->r_offset;
        }

#if defined(__LP64__)
        const uint32_t relocationType = ELF64_R_TYPE(infoValue);
        const uint32_t symIndex = ELF64_R_SYM(infoValue);
#else
        const uint32_t relocationType = ELF32_R_TYPE(infoValue);
        const uint32_t symIndex = ELF32_R_SYM(infoValue);
#endif

        if (symIndex != targetSymIndex)
            continue;
        if (relocationType != kRelocationTypeJumpSlot && relocationType != kRelocationTypeGlobDat &&
            relocationType != kRelocationTypeAbs) {
            continue;
        }

        const uintptr_t slotAddr = offsetValue + loadBias;
        bool found = false;
        for (const auto existing : slots) {
            if (existing == slotAddr) {
                found = true;
                break;
            }
        }
        if (!found) {
            slots.push_back(slotAddr);
        }
    }
}

std::vector<uintptr_t> FindRuntimeRelocationSlotsForSymbol(const RuntimeDynamicInfo& info,
                                                           uint32_t symIndex, uintptr_t loadBias) {
    std::vector<uintptr_t> slots;
    CollectRuntimeRelocationSlots(info.jmprel, info.pltrelSize, info.usesRela, symIndex, loadBias,
                                  slots);
    CollectRuntimeRelocationSlots(info.rela, info.relaSize, true, symIndex, loadBias, slots);
    CollectRuntimeRelocationSlots(info.rel, info.relSize, false, symIndex, loadBias, slots);
    return slots;
}

}  // namespace fusehide
