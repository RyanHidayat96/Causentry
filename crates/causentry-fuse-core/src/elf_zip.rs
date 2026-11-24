//! Memory-safe pure-Rust ELF32/ELF64, APK/ZIP stored-entry, and `/proc/self/maps` parser.

use crate::xz_dec::{MAX_GNU_DEBUGDATA_OUTPUT_BYTES, decompress_gnu_debugdata};

const ELFMAG: [u8; 4] = [0x7f, b'E', b'L', b'F'];
const ELFCLASS32: u8 = 1;
const ELFCLASS64: u8 = 2;
const ELFDATA2LSB: u8 = 1;

const EM_386: u16 = 3;
const EM_ARM: u16 = 40;
const EM_X86_64: u16 = 62;
const EM_AARCH64: u16 = 183;

const PT_LOAD: u32 = 1;
const PT_DYNAMIC: u32 = 2;

const SHT_SYMTAB: u32 = 2;
const SHT_DYNSYM: u32 = 11;

const DT_NULL: i64 = 0;
const DT_PLTRELSZ: i64 = 2;
const DT_HASH: i64 = 4;
const DT_STRTAB: i64 = 5;
const DT_SYMTAB: i64 = 6;
const DT_RELA: i64 = 7;
const DT_RELASZ: i64 = 8;
const DT_SYMENT: i64 = 11;
const DT_REL: i64 = 17;
const DT_RELSZ: i64 = 18;
const DT_PLTREL: i64 = 20;
const DT_JMPREL: i64 = 23;
const DT_GNU_HASH: i64 = 0x6fff_fef5;
const DT_RELA_TAG: u64 = 7;

const ELF64_HDR_SIZE: usize = 64;
const ELF32_HDR_SIZE: usize = 52;
const ELF64_SHDR_SIZE: usize = 64;
const ELF32_SHDR_SIZE: usize = 40;
const ELF64_PHDR_SIZE: usize = 56;
const ELF32_PHDR_SIZE: usize = 32;
const ELF64_SYM_SIZE: usize = 24;
const ELF32_SYM_SIZE: usize = 16;

const PROT_READ: i32 = 1;
const PROT_WRITE: i32 = 2;
const PROT_EXEC: i32 = 4;

fn read_u16_le(data: &[u8], off: usize) -> Option<u16> {
    let slice = data.get(off..off.checked_add(2)?)?;
    Some(u16::from_le_bytes([slice[0], slice[1]]))
}

fn read_u32_le(data: &[u8], off: usize) -> Option<u32> {
    let slice = data.get(off..off.checked_add(4)?)?;
    Some(u32::from_le_bytes([slice[0], slice[1], slice[2], slice[3]]))
}

fn read_i32_le(data: &[u8], off: usize) -> Option<i32> {
    let slice = data.get(off..off.checked_add(4)?)?;
    Some(i32::from_le_bytes([slice[0], slice[1], slice[2], slice[3]]))
}

fn read_u64_le(data: &[u8], off: usize) -> Option<u64> {
    let slice = data.get(off..off.checked_add(8)?)?;
    Some(u64::from_le_bytes([
        slice[0], slice[1], slice[2], slice[3], slice[4], slice[5], slice[6], slice[7],
    ]))
}

fn read_i64_le(data: &[u8], off: usize) -> Option<i64> {
    let slice = data.get(off..off.checked_add(8)?)?;
    Some(i64::from_le_bytes([
        slice[0], slice[1], slice[2], slice[3], slice[4], slice[5], slice[6], slice[7],
    ]))
}

fn cstr_at(table: &[u8], offset: usize) -> Option<&[u8]> {
    let tail = table.get(offset..)?;
    let nul = tail.iter().position(|&b| b == 0)?;
    Some(&tail[..nul])
}

/// Locates an uncompressed (`method == 0`) stored entry inside a ZIP/APK archive.
///
/// Returns `(data_offset, byte_len)` within `apk`.
pub fn find_embedded_stored_elf(apk: &[u8], entry_path: &[u8]) -> Option<(usize, usize)> {
    const EOCD_SIG: u32 = 0x0605_4b50;
    const CD_SIG: u32 = 0x0201_4b50;
    const LOCAL_SIG: u32 = 0x0403_4b50;

    if apk.len() < 22 || entry_path.is_empty() {
        return None;
    }

    let search_start = apk.len().saturating_sub(0xFFFF + 22);
    let mut eocd_offset = None;
    let mut off = apk.len() - 22;
    loop {
        if read_u32_le(apk, off) == Some(EOCD_SIG) {
            eocd_offset = Some(off);
            break;
        }
        if off <= search_start {
            break;
        }
        off -= 1;
    }
    let eocd = eocd_offset?;

    let total_entries = read_u16_le(apk, eocd + 10)? as usize;
    let mut cursor = read_u32_le(apk, eocd + 16)? as usize;

    for _ in 0..total_entries {
        if cursor.checked_add(46)? > apk.len() {
            break;
        }
        if read_u32_le(apk, cursor) != Some(CD_SIG) {
            break;
        }
        let method = read_u16_le(apk, cursor + 10)?;
        let comp_size = read_u32_le(apk, cursor + 20)? as usize;
        let uncomp_size = read_u32_le(apk, cursor + 24)? as usize;
        let name_len = read_u16_le(apk, cursor + 28)? as usize;
        let extra_len = read_u16_le(apk, cursor + 30)? as usize;
        let comment_len = read_u16_le(apk, cursor + 32)? as usize;
        let local_offset = read_u32_le(apk, cursor + 42)? as usize;

        let name_start = cursor.checked_add(46)?;
        let name_end = name_start.checked_add(name_len)?;
        if name_end > apk.len() {
            break;
        }

        if &apk[name_start..name_end] == entry_path {
            if method != 0 || comp_size != uncomp_size {
                return None;
            }
            if local_offset.checked_add(30)? > apk.len()
                || read_u32_le(apk, local_offset) != Some(LOCAL_SIG)
            {
                return None;
            }
            let local_name_len = read_u16_le(apk, local_offset + 26)? as usize;
            let local_extra_len = read_u16_le(apk, local_offset + 28)? as usize;
            let data_offset = local_offset
                .checked_add(30)?
                .checked_add(local_name_len)?
                .checked_add(local_extra_len)?;
            if data_offset.checked_add(uncomp_size)? > apk.len() {
                return None;
            }
            return Some((data_offset, uncomp_size));
        }

        cursor = name_end.checked_add(extra_len)?.checked_add(comment_len)?;
    }

    None
}

#[derive(Clone, Copy)]
struct ElfHeaderMeta {
    is_64: bool,
    machine: u16,
    phoff: usize,
    shoff: usize,
    phentsize: usize,
    phnum: usize,
    shentsize: usize,
    shnum: usize,
    shstrndx: usize,
}

#[derive(Clone, Copy)]
struct ElfSectionMeta {
    sh_name: usize,
    sh_type: u32,
    sh_offset: usize,
    sh_size: usize,
    sh_link: usize,
    sh_entsize: usize,
}

#[derive(Clone, Copy)]
struct ElfPhdrMeta {
    p_type: u32,
    p_offset: usize,
    p_vaddr: u64,
    p_filesz: usize,
    p_memsz: u64,
}

fn parse_elf_header(elf: &[u8]) -> Option<ElfHeaderMeta> {
    if elf.len() < ELF32_HDR_SIZE || elf.get(0..4)? != ELFMAG {
        return None;
    }
    let class = *elf.get(4)?;
    let data_enc = *elf.get(5)?;
    if data_enc != ELFDATA2LSB {
        return None;
    }
    let machine = read_u16_le(elf, 18)?;
    match class {
        ELFCLASS64 => {
            if elf.len() < ELF64_HDR_SIZE {
                return None;
            }
            Some(ElfHeaderMeta {
                is_64: true,
                machine,
                phoff: usize::try_from(read_u64_le(elf, 32)?).ok()?,
                shoff: usize::try_from(read_u64_le(elf, 40)?).ok()?,
                phentsize: read_u16_le(elf, 54)? as usize,
                phnum: read_u16_le(elf, 56)? as usize,
                shentsize: read_u16_le(elf, 58)? as usize,
                shnum: read_u16_le(elf, 60)? as usize,
                shstrndx: read_u16_le(elf, 62)? as usize,
            })
        }
        ELFCLASS32 => Some(ElfHeaderMeta {
            is_64: false,
            machine,
            phoff: read_u32_le(elf, 28)? as usize,
            shoff: read_u32_le(elf, 32)? as usize,
            phentsize: read_u16_le(elf, 42)? as usize,
            phnum: read_u16_le(elf, 44)? as usize,
            shentsize: read_u16_le(elf, 46)? as usize,
            shnum: read_u16_le(elf, 48)? as usize,
            shstrndx: read_u16_le(elf, 50)? as usize,
        }),
        _ => None,
    }
}

fn read_section_header(elf: &[u8], meta: ElfHeaderMeta, index: usize) -> Option<ElfSectionMeta> {
    let expected = if meta.is_64 { ELF64_SHDR_SIZE } else { ELF32_SHDR_SIZE };
    if meta.shoff == 0 || meta.shentsize != expected || index >= meta.shnum {
        return None;
    }
    let off = meta.shoff.checked_add(index.checked_mul(meta.shentsize)?)?;
    if off.checked_add(meta.shentsize)? > elf.len() {
        return None;
    }
    if meta.is_64 {
        Some(ElfSectionMeta {
            sh_name: read_u32_le(elf, off)? as usize,
            sh_type: read_u32_le(elf, off + 4)?,
            sh_offset: usize::try_from(read_u64_le(elf, off + 24)?).ok()?,
            sh_size: usize::try_from(read_u64_le(elf, off + 32)?).ok()?,
            sh_link: read_u32_le(elf, off + 40)? as usize,
            sh_entsize: usize::try_from(read_u64_le(elf, off + 56)?).ok()?,
        })
    } else {
        Some(ElfSectionMeta {
            sh_name: read_u32_le(elf, off)? as usize,
            sh_type: read_u32_le(elf, off + 4)?,
            sh_offset: read_u32_le(elf, off + 16)? as usize,
            sh_size: read_u32_le(elf, off + 20)? as usize,
            sh_link: read_u32_le(elf, off + 24)? as usize,
            sh_entsize: read_u32_le(elf, off + 36)? as usize,
        })
    }
}

fn read_program_header(elf: &[u8], meta: ElfHeaderMeta, index: usize) -> Option<ElfPhdrMeta> {
    let expected = if meta.is_64 { ELF64_PHDR_SIZE } else { ELF32_PHDR_SIZE };
    if meta.phoff == 0 || meta.phentsize < expected || index >= meta.phnum {
        return None;
    }
    let off = meta.phoff.checked_add(index.checked_mul(meta.phentsize)?)?;
    if off.checked_add(expected)? > elf.len() {
        return None;
    }
    if meta.is_64 {
        Some(ElfPhdrMeta {
            p_type: read_u32_le(elf, off)?,
            p_offset: usize::try_from(read_u64_le(elf, off + 8)?).ok()?,
            p_vaddr: read_u64_le(elf, off + 16)?,
            p_filesz: usize::try_from(read_u64_le(elf, off + 32)?).ok()?,
            p_memsz: read_u64_le(elf, off + 40)?,
        })
    } else {
        Some(ElfPhdrMeta {
            p_type: read_u32_le(elf, off)?,
            p_offset: read_u32_le(elf, off + 4)? as usize,
            p_vaddr: read_u32_le(elf, off + 8)? as u64,
            p_filesz: read_u32_le(elf, off + 16)? as usize,
            p_memsz: read_u32_le(elf, off + 20)? as u64,
        })
    }
}

fn section_slice(elf: &[u8], sec: ElfSectionMeta) -> Option<&[u8]> {
    let end = sec.sh_offset.checked_add(sec.sh_size)?;
    elf.get(sec.sh_offset..end)
}

fn read_symbol(sym_bytes: &[u8], index: usize, is_64: bool) -> Option<(usize, u64, usize)> {
    if is_64 {
        let off = index.checked_mul(ELF64_SYM_SIZE)?;
        let st_name = read_u32_le(sym_bytes, off)? as usize;
        let st_value = read_u64_le(sym_bytes, off + 8)?;
        let st_size = usize::try_from(read_u64_le(sym_bytes, off + 16)?).ok()?;
        Some((st_name, st_value, st_size))
    } else {
        let off = index.checked_mul(ELF32_SYM_SIZE)?;
        let st_name = read_u32_le(sym_bytes, off)? as usize;
        let st_value = read_u32_le(sym_bytes, off + 4)? as u64;
        let st_size = read_u32_le(sym_bytes, off + 8)? as usize;
        Some((st_name, st_value, st_size))
    }
}

/// Locates a named ELF section returning `(offset, size)` within `elf`.
pub fn find_named_section(elf: &[u8], section_name: &[u8]) -> Option<(usize, usize)> {
    let meta = parse_elf_header(elf)?;
    if meta.shstrndx >= meta.shnum {
        return None;
    }
    let shstrtab_sec = read_section_header(elf, meta, meta.shstrndx)?;
    let shstrtab = section_slice(elf, shstrtab_sec)?;

    for idx in 0..meta.shnum {
        let sec = read_section_header(elf, meta, idx)?;
        let end = sec.sh_offset.checked_add(sec.sh_size)?;
        if end > elf.len() {
            continue;
        }
        if let Some(name) = cstr_at(shstrtab, sec.sh_name)
            && name == section_name
        {
            return Some((sec.sh_offset, sec.sh_size));
        }
    }
    None
}

fn scan_symbol_tables<F>(elf: &[u8], mut visitor: F)
where
    F: FnMut(&[u8], u64, usize),
{
    let Some(meta) = parse_elf_header(elf) else {
        return;
    };
    let expected_sym_size = if meta.is_64 { ELF64_SYM_SIZE } else { ELF32_SYM_SIZE };
    for idx in 0..meta.shnum {
        let Some(sec) = read_section_header(elf, meta, idx) else {
            break;
        };
        if sec.sh_type != SHT_SYMTAB && sec.sh_type != SHT_DYNSYM {
            continue;
        }
        if sec.sh_link >= meta.shnum || sec.sh_entsize != expected_sym_size || sec.sh_size == 0 {
            continue;
        }
        let Some(strtab_sec) = read_section_header(elf, meta, sec.sh_link) else {
            continue;
        };
        let (Some(strtab), Some(symtab)) = (section_slice(elf, strtab_sec), section_slice(elf, sec))
        else {
            continue;
        };
        let count = symtab.len() / expected_sym_size;
        for s_idx in 0..count {
            let Some((st_name, st_value, st_size)) = read_symbol(symtab, s_idx, meta.is_64) else {
                break;
            };
            if st_name == 0 || st_value == 0 {
                continue;
            }
            if let Some(name) = cstr_at(strtab, st_name) {
                visitor(name, st_value, st_size);
            }
        }
    }
}

/// Resolves the `st_value` offset for an exact `symbol_name`, falling back to compressed
/// `.gnu_debugdata` up to `max_depth` levels.
pub fn find_symbol_offset(elf: &[u8], symbol_name: &[u8], max_depth: u8) -> Option<u64> {
    let mut found = None;
    scan_symbol_tables(elf, |name, value, _| {
        if found.is_none() && name == symbol_name {
            found = Some(value);
        }
    });
    if found.is_some() || max_depth == 0 {
        return found;
    }
    let (off, len) = find_named_section(elf, b".gnu_debugdata")?;
    let compressed = elf.get(off..off.checked_add(len)?)?;
    let expanded = decompress_gnu_debugdata(compressed, MAX_GNU_DEBUGDATA_OUTPUT_BYTES)?;
    find_symbol_offset(&expanded, symbol_name, max_depth - 1)
}

/// Batch-resolves `names` in a single symbol-table pass, decompressing `.gnu_debugdata` at most once.
pub fn find_symbol_offsets_batch(elf: &[u8], names: &[&[u8]]) -> Vec<Option<u64>> {
    let mut values = vec![None; names.len()];
    if names.is_empty() {
        return values;
    }

    scan_symbol_tables(elf, |actual, value, _| {
        for (slot, target) in values.iter_mut().zip(names.iter()) {
            if slot.is_none() && actual == *target {
                *slot = Some(value);
            }
        }
    });

    if values.iter().all(|v| v.is_some()) {
        return values;
    }

    if let Some((off, len)) = find_named_section(elf, b".gnu_debugdata")
        && let Some(compressed) = off.checked_add(len).and_then(|end| elf.get(off..end))
        && let Some(expanded) = decompress_gnu_debugdata(compressed, MAX_GNU_DEBUGDATA_OUTPUT_BYTES)
    {
        scan_symbol_tables(&expanded, |actual, value, _| {
            for (slot, target) in values.iter_mut().zip(names.iter()) {
                if slot.is_none() && actual == *target {
                    *slot = Some(value);
                }
            }
        });
    }

    values
}

/// Matched symbol record returned by `find_largest_symbol_containing`.
#[derive(Debug, Clone, PartialEq, Eq)]
pub struct SymbolMatch {
    pub value: u64,
    pub size: usize,
    pub name: Vec<u8>,
}

fn collect_symbols_containing_impl(
    elf: &[u8],
    needle: &[u8],
    depth: u8,
    matches: &mut Vec<SymbolMatch>,
) {
    scan_symbol_tables(elf, |name, value, size| {
        if !needle.is_empty() && !name.windows(needle.len()).any(|w| w == needle) {
            return;
        }
        let duplicate = matches
            .iter()
            .any(|m| m.value == value && m.size == size && m.name.as_slice() == name);
        if !duplicate {
            matches.push(SymbolMatch {
                value,
                size,
                name: name.to_vec(),
            });
        }
    });

    if depth >= 2 {
        return;
    }
    let Some((off, len)) = find_named_section(elf, b".gnu_debugdata") else {
        return;
    };
    let Some(compressed) = off.checked_add(len).and_then(|end| elf.get(off..end)) else {
        return;
    };
    if let Some(expanded) = decompress_gnu_debugdata(compressed, MAX_GNU_DEBUGDATA_OUTPUT_BYTES) {
        collect_symbols_containing_impl(&expanded, needle, depth + 1, matches);
    }
}

/// Finds the symbol containing `needle` with the largest `st_size` (breaking ties by smallest `st_value`).
pub fn find_largest_symbol_containing(elf: &[u8], needle: &[u8]) -> Option<SymbolMatch> {
    if needle.is_empty() {
        return None;
    }
    let mut matches = Vec::new();
    collect_symbols_containing_impl(elf, needle, 0, &mut matches);
    matches.into_iter().max_by(|lhs, rhs| {
        lhs.size
            .cmp(&rhs.size)
            .then_with(|| rhs.value.cmp(&lhs.value))
    })
}

/// Converts a virtual address to an ELF file offset using `PT_LOAD` / `PT_DYNAMIC`.
pub fn vaddr_to_file_offset(elf: &[u8], vaddr: u64) -> Option<usize> {
    let meta = parse_elf_header(elf)?;
    for idx in 0..meta.phnum {
        let phdr = read_program_header(elf, meta, idx)?;
        if phdr.p_type != PT_LOAD && phdr.p_type != PT_DYNAMIC {
            continue;
        }
        let Some(end_va) = phdr.p_vaddr.checked_add(phdr.p_memsz) else {
            continue;
        };
        if vaddr >= phdr.p_vaddr && vaddr < end_va {
            let delta = usize::try_from(vaddr - phdr.p_vaddr).ok()?;
            return phdr.p_offset.checked_add(delta);
        }
    }
    None
}

/// C-ABI compatible dynamic linking table descriptors extracted from `PT_DYNAMIC`.
#[repr(C)]
#[derive(Debug, Clone, Copy, Default, PartialEq, Eq)]
pub struct ElfDynamicInfo {
    pub symtab: u64,
    pub strtab: u64,
    pub hash: u64,
    pub gnu_hash: u64,
    pub jmprel: u64,
    pub pltrel_size: usize,
    pub rela: u64,
    pub rela_size: usize,
    pub rel: u64,
    pub rel_size: usize,
    pub syment: usize,
    pub uses_rela: bool,
}

/// Parses `PT_DYNAMIC` entries from a mapped ELF file.
pub fn parse_dynamic_info(elf: &[u8]) -> Option<ElfDynamicInfo> {
    let meta = parse_elf_header(elf)?;
    let mut dyn_phdr = None;
    for idx in 0..meta.phnum {
        let phdr = read_program_header(elf, meta, idx)?;
        if phdr.p_type == PT_DYNAMIC {
            dyn_phdr = Some(phdr);
            break;
        }
    }
    let dyn_phdr = dyn_phdr?;
    let dyn_end = dyn_phdr.p_offset.checked_add(dyn_phdr.p_filesz)?;
    let dyn_bytes = elf.get(dyn_phdr.p_offset..dyn_end)?;

    let mut info = ElfDynamicInfo {
        syment: if meta.is_64 { ELF64_SYM_SIZE } else { ELF32_SYM_SIZE },
        uses_rela: meta.is_64,
        ..Default::default()
    };

    let entry_size = if meta.is_64 { 16 } else { 8 };
    let count = dyn_bytes.len() / entry_size;
    for idx in 0..count {
        let off = idx * entry_size;
        let (tag, val) = if meta.is_64 {
            (read_i64_le(dyn_bytes, off)?, read_u64_le(dyn_bytes, off + 8)?)
        } else {
            (read_i32_le(dyn_bytes, off)? as i64, read_u32_le(dyn_bytes, off + 4)? as u64)
        };
        if tag == DT_NULL {
            break;
        }
        match tag {
            DT_SYMTAB => info.symtab = val,
            DT_STRTAB => info.strtab = val,
            DT_HASH => info.hash = val,
            DT_GNU_HASH => info.gnu_hash = val,
            DT_JMPREL => info.jmprel = val,
            DT_PLTRELSZ => info.pltrel_size = usize::try_from(val).ok().unwrap_or(0),
            DT_RELA => info.rela = val,
            DT_RELASZ => info.rela_size = usize::try_from(val).ok().unwrap_or(0),
            DT_REL => info.rel = val,
            DT_RELSZ => info.rel_size = usize::try_from(val).ok().unwrap_or(0),
            DT_SYMENT => info.syment = usize::try_from(val).ok().unwrap_or(info.syment),
            DT_PLTREL => info.uses_rela = val == DT_RELA_TAG,
            _ => {}
        }
    }

    if info.symtab == 0 || info.strtab == 0 {
        return None;
    }
    Some(info)
}

/// Computes the GNU hash (`djb2`) of `name`.
pub fn compute_gnu_hash(name: &[u8]) -> u32 {
    let mut hash: u32 = 0x1505;
    for &b in name {
        hash = hash.wrapping_mul(33).wrapping_add(b as u32);
    }
    hash
}

/// Computes the ELF SysV hash of `name`.
pub fn compute_elf_hash(name: &[u8]) -> u32 {
    let mut hash: u32 = 0;
    for &b in name {
        hash = (hash << 4).wrapping_add(b as u32);
        let high = hash & 0xF000_0000;
        if high != 0 {
            hash ^= high >> 24;
        }
        hash &= 0x0FFF_FFFF;
    }
    hash
}

fn symbol_count_from_sysv_hash(elf: &[u8], hash_vaddr: u64) -> usize {
    let Some(off) = vaddr_to_file_offset(elf, hash_vaddr) else {
        return 0;
    };
    read_u32_le(elf, off + 4).unwrap_or(0) as usize
}

fn symbol_count_from_gnu_hash(elf: &[u8], gnu_hash_vaddr: u64, is_64: bool) -> usize {
    let Some(off) = vaddr_to_file_offset(elf, gnu_hash_vaddr) else {
        return 0;
    };
    let (Some(nbuckets), Some(symoffset), Some(bloom_size)) = (
        read_u32_le(elf, off),
        read_u32_le(elf, off + 4),
        read_u32_le(elf, off + 8),
    ) else {
        return 0;
    };
    let bloom_word_bytes = if is_64 { 8usize } else { 4usize };
    let Some(bloom_bytes) = (bloom_size as usize).checked_mul(bloom_word_bytes) else {
        return 0;
    };
    let Some(buckets_off) = off.checked_add(16).and_then(|v| v.checked_add(bloom_bytes)) else {
        return 0;
    };
    let Some(chains_off) = (nbuckets as usize)
        .checked_mul(4)
        .and_then(|v| buckets_off.checked_add(v))
    else {
        return 0;
    };
    let mut max_symbol = symoffset;
    for i in 0..(nbuckets as usize) {
        let Some(b) = read_u32_le(elf, buckets_off + i * 4) else {
            return 0;
        };
        if b > max_symbol {
            max_symbol = b;
        }
    }
    if max_symbol == symoffset {
        return symoffset as usize;
    }
    let mut chain_idx = (max_symbol - symoffset) as usize;
    loop {
        let Some(word_off) = chains_off.checked_add(chain_idx * 4) else {
            return 0;
        };
        let Some(chain_word) = read_u32_le(elf, word_off) else {
            return 0;
        };
        if (chain_word & 1) != 0 {
            break;
        }
        chain_idx = chain_idx.saturating_add(1);
    }
    (symoffset as usize).saturating_add(chain_idx).saturating_add(1)
}

/// Computes the dynamic symbol count via SysV `DT_HASH` or GNU `DT_GNU_HASH`.
pub fn dynamic_symbol_count(elf: &[u8], info: &ElfDynamicInfo) -> usize {
    if info.hash != 0 {
        let count = symbol_count_from_sysv_hash(elf, info.hash);
        if count != 0 {
            return count;
        }
    }
    if info.gnu_hash != 0 {
        let is_64 = parse_elf_header(elf).map(|m| m.is_64).unwrap_or(true);
        let count = symbol_count_from_gnu_hash(elf, info.gnu_hash, is_64);
        if count != 0 {
            return count;
        }
    }
    0
}

fn dyn_symbol_name<'a>(
    elf: &'a [u8],
    info: &ElfDynamicInfo,
    is_64: bool,
    sym_idx: usize,
) -> Option<(&'a [u8], u64)> {
    let symtab_off = vaddr_to_file_offset(elf, info.symtab)?;
    let strtab_off = vaddr_to_file_offset(elf, info.strtab)?;
    let sym_stride = if is_64 { ELF64_SYM_SIZE } else { ELF32_SYM_SIZE };
    let entry_off = symtab_off.checked_add(sym_idx.checked_mul(sym_stride)?)?;
    if entry_off.checked_add(sym_stride)? > elf.len() || strtab_off >= elf.len() {
        return None;
    }
    let sym_slice = elf.get(entry_off..entry_off + sym_stride)?;
    let (st_name, st_value, _) = read_symbol(sym_slice, 0, is_64)?;
    let name = cstr_at(elf.get(strtab_off..)?, st_name)?;
    Some((name, st_value))
}

/// Looks up a dynamic symbol index using GNU hash table (`DT_GNU_HASH`).
pub fn find_dynamic_symbol_index_with_gnu_hash(
    elf: &[u8],
    info: &ElfDynamicInfo,
    name: &[u8],
    gnu_hash: u32,
) -> Option<u32> {
    if info.gnu_hash == 0 {
        return None;
    }
    let meta = parse_elf_header(elf)?;
    let off = vaddr_to_file_offset(elf, info.gnu_hash)?;
    let nbuckets = read_u32_le(elf, off)?;
    let symoffset = read_u32_le(elf, off + 4)?;
    let bloom_size = read_u32_le(elf, off + 8)?;
    let bloom_shift = read_u32_le(elf, off + 12)?;
    if nbuckets == 0 || bloom_size == 0 {
        return None;
    }

    let bloom_off = off.checked_add(16)?;
    let bloom_word_bytes = if meta.is_64 { 8usize } else { 4usize };
    let bloom_bits = (bloom_word_bytes * 8) as u32;
    let bloom_idx = ((gnu_hash / bloom_bits) as usize) % (bloom_size as usize);
    let word_off = bloom_off.checked_add(bloom_idx.checked_mul(bloom_word_bytes)?)?;
    let bloom_word = if meta.is_64 {
        read_u64_le(elf, word_off)?
    } else {
        read_u32_le(elf, word_off)? as u64
    };
    let mask = (1u64 << (gnu_hash % bloom_bits))
        | (1u64 << ((gnu_hash >> (bloom_shift % bloom_bits)) % bloom_bits));
    if (bloom_word & mask) != mask {
        return None;
    }

    let buckets_off = bloom_off.checked_add((bloom_size as usize).checked_mul(bloom_word_bytes)?)?;
    let chains_off = buckets_off.checked_add((nbuckets as usize).checked_mul(4)?)?;
    let mut symbol_index = read_u32_le(elf, buckets_off.checked_add(((gnu_hash % nbuckets) as usize) * 4)?)?;
    if symbol_index < symoffset {
        return None;
    }

    loop {
        let chain_idx = (symbol_index - symoffset) as usize;
        let chain_hash = read_u32_le(elf, chains_off.checked_add(chain_idx.checked_mul(4)?)?)?;
        if (chain_hash ^ gnu_hash) < 2 {
            let (actual, _) = dyn_symbol_name(elf, info, meta.is_64, symbol_index as usize)?;
            if actual == name {
                return Some(symbol_index);
            }
        }
        if (chain_hash & 1) != 0 {
            break;
        }
        symbol_index = symbol_index.checked_add(1)?;
    }

    None
}

fn find_dynamic_symbol_index_with_sysv_hash(
    elf: &[u8],
    info: &ElfDynamicInfo,
    name: &[u8],
    elf_hash: u32,
) -> Option<u32> {
    if info.hash == 0 {
        return None;
    }
    let meta = parse_elf_header(elf)?;
    let off = vaddr_to_file_offset(elf, info.hash)?;
    let nbucket = read_u32_le(elf, off)?;
    let nchain = read_u32_le(elf, off + 4)?;
    if nbucket == 0 || nchain == 0 {
        return None;
    }
    let buckets_off = off.checked_add(8)?;
    let chains_off = buckets_off.checked_add((nbucket as usize).checked_mul(4)?)?;
    let mut idx = read_u32_le(elf, buckets_off.checked_add(((elf_hash % nbucket) as usize) * 4)?)?;
    let mut steps = 0u32;
    while idx != 0 && idx < nchain && steps < nchain {
        if let Some((actual, _)) = dyn_symbol_name(elf, info, meta.is_64, idx as usize)
            && actual == name
        {
            return Some(idx);
        }
        idx = read_u32_le(elf, chains_off.checked_add((idx as usize).checked_mul(4)?)?)?;
        steps += 1;
    }
    None
}

fn find_dynamic_symbol_index_linear(
    elf: &[u8],
    info: &ElfDynamicInfo,
    name: &[u8],
) -> Option<u32> {
    let meta = parse_elf_header(elf)?;
    let count = dynamic_symbol_count(elf, info);
    for idx in 0..count {
        if let Some((actual, _)) = dyn_symbol_name(elf, info, meta.is_64, idx)
            && actual == name
        {
            return u32::try_from(idx).ok();
        }
    }
    None
}

/// Resolves a dynamic symbol index via GNU hash -> SysV hash -> bounded linear fallback.
pub fn find_dynamic_symbol_index(elf: &[u8], info: &ElfDynamicInfo, name: &[u8]) -> Option<u32> {
    let gnu_hash = compute_gnu_hash(name);
    if let Some(idx) = find_dynamic_symbol_index_with_gnu_hash(elf, info, name, gnu_hash) {
        return Some(idx);
    }
    let elf_hash = compute_elf_hash(name);
    if let Some(idx) = find_dynamic_symbol_index_with_sysv_hash(elf, info, name, elf_hash) {
        return Some(idx);
    }
    find_dynamic_symbol_index_linear(elf, info, name)
}

fn reloc_types_for_machine(machine: u16) -> Option<(u32, u32, u32)> {
    match machine {
        EM_AARCH64 => Some((1026, 1025, 257)), // JUMP_SLOT, GLOB_DAT, ABS64
        EM_ARM => Some((22, 21, 2)),          // JUMP_SLOT, GLOB_DAT, ABS32
        EM_X86_64 => Some((7, 6, 1)),         // JUMP_SLOT, GLOB_DAT, 64
        EM_386 => Some((7, 6, 1)),            // JMP_SLOT, GLOB_DAT, 32
        _ => None,
    }
}

struct RelocScanCtx {
    is_64: bool,
    allowed_types: (u32, u32, u32),
    target_sym: u32,
    load_bias: u64,
}

fn collect_reloc_slots(
    elf: &[u8],
    ctx: &RelocScanCtx,
    reloc_vaddr: u64,
    reloc_bytes: usize,
    rela: bool,
    slots: &mut Vec<u64>,
) {
    if reloc_vaddr == 0 || reloc_bytes == 0 {
        return;
    }
    let Some(base_off) = vaddr_to_file_offset(elf, reloc_vaddr) else {
        return;
    };
    let entry_size = match (ctx.is_64, rela) {
        (true, true) => 24usize,
        (true, false) => 16usize,
        (false, true) => 12usize,
        (false, false) => 8usize,
    };
    let count = reloc_bytes / entry_size;
    for i in 0..count {
        let Some(off) = i.checked_mul(entry_size).and_then(|d| base_off.checked_add(d)) else {
            break;
        };
        let (r_offset, r_type, r_sym) = if ctx.is_64 {
            let (Some(ro), Some(ri)) = (read_u64_le(elf, off), read_u64_le(elf, off + 8)) else {
                break;
            };
            (ro, (ri & 0xffff_ffff) as u32, (ri >> 32) as u32)
        } else {
            let (Some(ro), Some(ri)) = (read_u32_le(elf, off), read_u32_le(elf, off + 4)) else {
                break;
            };
            (ro as u64, ri & 0xff, ri >> 8)
        };
        if r_sym != ctx.target_sym {
            continue;
        }
        if r_type != ctx.allowed_types.0
            && r_type != ctx.allowed_types.1
            && r_type != ctx.allowed_types.2
        {
            continue;
        }
        let Some(slot_addr) = r_offset.checked_add(ctx.load_bias) else {
            continue;
        };
        if slot_addr <= ctx.load_bias {
            continue;
        }
        if !slots.contains(&slot_addr) {
            slots.push(slot_addr);
        }
    }
}

/// Collects deduplicated runtime GOT/PLT relocation slot addresses across `JMPREL`, `RELA`, and `REL`.
pub fn find_relocation_slots_for_symbol(
    elf: &[u8],
    info: &ElfDynamicInfo,
    sym_index: u32,
    load_bias: u64,
) -> Vec<u64> {
    let mut slots = Vec::new();
    let Some(meta) = parse_elf_header(elf) else {
        return slots;
    };
    let Some(allowed_types) = reloc_types_for_machine(meta.machine) else {
        return slots;
    };
    let ctx = RelocScanCtx {
        is_64: meta.is_64,
        allowed_types,
        target_sym: sym_index,
        load_bias,
    };
    collect_reloc_slots(elf, &ctx, info.jmprel, info.pltrel_size, info.uses_rela, &mut slots);
    collect_reloc_slots(elf, &ctx, info.rela, info.rela_size, true, &mut slots);
    collect_reloc_slots(elf, &ctx, info.rel, info.rel_size, false, &mut slots);
    slots
}

/// Aggregate mapping span parsed from `/proc/self/maps` for a library path marker.
#[derive(Debug, Clone, PartialEq, Eq)]
pub struct MapsModuleSpan {
    pub mapped_start: u64,
    pub mapped_end: u64,
    pub file_offset: usize,
    pub exec_start: u64,
    pub exec_end: u64,
    pub exec_perms: i32,
    pub path: Vec<u8>,
}

fn trim_ascii_whitespace(mut slice: &[u8]) -> &[u8] {
    while let Some(&b) = slice.first() {
        if matches!(b, b' ' | b'\t' | b'\r' | b'\n') {
            slice = &slice[1..];
        } else {
            break;
        }
    }
    while let Some(&b) = slice.last() {
        if matches!(b, b' ' | b'\t' | b'\r' | b'\n') {
            slice = &slice[..slice.len() - 1];
        } else {
            break;
        }
    }
    slice
}

fn perms_bitmask(perms: &[u8]) -> i32 {
    let mut out = 0i32;
    if perms.first().copied() == Some(b'r') {
        out |= PROT_READ;
    }
    if perms.get(1).copied() == Some(b'w') {
        out |= PROT_WRITE;
    }
    if perms.get(2).copied() == Some(b'x') {
        out |= PROT_EXEC;
    }
    out
}

/// Parses `/proc/self/maps` bytes and aggregates the span matching `marker`.
pub fn parse_maps_for_marker(maps: &[u8], marker: &[u8]) -> Option<MapsModuleSpan> {
    if maps.is_empty() || marker.is_empty() {
        return None;
    }

    let mut lowest_base = 0u64;
    let mut highest_end = 0u64;
    let mut lowest_offset = 0usize;
    let mut lowest_path: Vec<u8> = Vec::new();
    let mut exec_start = 0u64;
    let mut exec_end = 0u64;
    let mut exec_perms = 0i32;

    for raw_line in maps.split(|&b| b == b'\n') {
        let line = trim_ascii_whitespace(raw_line);
        if line.is_empty() {
            continue;
        }
        // Format: start-end perms offset dev inode [path...]
        let Some(sp1) = line.iter().position(|&b| b == b' ' || b == b'\t') else {
            continue;
        };
        let range = &line[..sp1];
        let Some(dash) = range.iter().position(|&b| b == b'-') else {
            continue;
        };
        let Ok(start_str) = std::str::from_utf8(&range[..dash]) else {
            continue;
        };
        let Ok(end_str) = std::str::from_utf8(&range[dash + 1..]) else {
            continue;
        };
        let (Ok(start), Ok(end)) = (
            u64::from_str_radix(start_str, 16),
            u64::from_str_radix(end_str, 16),
        ) else {
            continue;
        };

        let mut rest = trim_ascii_whitespace(&line[sp1..]);
        let Some(sp2) = rest.iter().position(|&b| b == b' ' || b == b'\t') else {
            continue;
        };
        let perms = &rest[..sp2];
        rest = trim_ascii_whitespace(&rest[sp2..]);

        let Some(sp3) = rest.iter().position(|&b| b == b' ' || b == b'\t') else {
            continue;
        };
        let Ok(off_str) = std::str::from_utf8(&rest[..sp3]) else {
            continue;
        };
        let Ok(file_offset) = usize::from_str_radix(off_str, 16) else {
            continue;
        };
        rest = trim_ascii_whitespace(&rest[sp3..]);

        // Skip dev
        let Some(sp4) = rest.iter().position(|&b| b == b' ' || b == b'\t') else {
            continue;
        };
        rest = trim_ascii_whitespace(&rest[sp4..]);

        // Skip inode
        let path_bytes = match rest.iter().position(|&b| b == b' ' || b == b'\t') {
            Some(sp5) => trim_ascii_whitespace(&rest[sp5..]),
            None => continue,
        };
        if !path_bytes.windows(marker.len()).any(|w| w == marker) {
            continue;
        }

        if lowest_base == 0 || start < lowest_base {
            lowest_base = start;
            lowest_offset = file_offset;
            lowest_path = path_bytes.to_vec();
        }
        if end > highest_end {
            highest_end = end;
        }
        let p = perms_bitmask(perms);
        if (p & PROT_EXEC) != 0 && exec_start == 0 {
            exec_start = start;
            exec_end = end;
            exec_perms = p;
        }
    }

    if lowest_base == 0 || lowest_path.is_empty() {
        return None;
    }

    Some(MapsModuleSpan {
        mapped_start: lowest_base,
        mapped_end: highest_end,
        file_offset: lowest_offset,
        exec_start,
        exec_end,
        exec_perms,
        path: lowest_path,
    })
}

#[cfg(test)]
mod tests {
    use super::*;

    fn push_le16(buf: &mut Vec<u8>, v: u16) {
        buf.extend_from_slice(&v.to_le_bytes());
    }
    fn push_le32(buf: &mut Vec<u8>, v: u32) {
        buf.extend_from_slice(&v.to_le_bytes());
    }
    fn push_le64(buf: &mut Vec<u8>, v: u64) {
        buf.extend_from_slice(&v.to_le_bytes());
    }

    fn build_synthetic_apk(entry_name: &[u8], payload: &[u8]) -> Vec<u8> {
        let mut zip = Vec::new();
        // Local file header at 0
        let local_off = zip.len() as u32;
        push_le32(&mut zip, 0x0403_4b50);
        push_le16(&mut zip, 20);
        push_le16(&mut zip, 0);
        push_le16(&mut zip, 0); // method = stored
        push_le16(&mut zip, 0);
        push_le16(&mut zip, 0);
        push_le32(&mut zip, 0);
        push_le32(&mut zip, payload.len() as u32);
        push_le32(&mut zip, payload.len() as u32);
        push_le16(&mut zip, entry_name.len() as u16);
        push_le16(&mut zip, 4); // extra_len = 4
        zip.extend_from_slice(entry_name);
        zip.extend_from_slice(&[0u8; 4]);
        zip.extend_from_slice(payload);

        // Central directory
        let cd_off = zip.len() as u32;
        push_le32(&mut zip, 0x0201_4b50);
        push_le16(&mut zip, 20);
        push_le16(&mut zip, 20);
        push_le16(&mut zip, 0);
        push_le16(&mut zip, 0); // method = stored
        push_le16(&mut zip, 0);
        push_le16(&mut zip, 0);
        push_le32(&mut zip, 0);
        push_le32(&mut zip, payload.len() as u32);
        push_le32(&mut zip, payload.len() as u32);
        push_le16(&mut zip, entry_name.len() as u16);
        push_le16(&mut zip, 0);
        push_le16(&mut zip, 0);
        push_le16(&mut zip, 0);
        push_le16(&mut zip, 0);
        push_le32(&mut zip, 0);
        push_le32(&mut zip, local_off);
        zip.extend_from_slice(entry_name);
        let cd_size = (zip.len() as u32) - cd_off;

        // EOCD
        push_le32(&mut zip, 0x0605_4b50);
        push_le16(&mut zip, 0);
        push_le16(&mut zip, 0);
        push_le16(&mut zip, 1);
        push_le16(&mut zip, 1);
        push_le32(&mut zip, cd_size);
        push_le32(&mut zip, cd_off);
        push_le16(&mut zip, 0);
        zip
    }

    fn build_synthetic_elf64() -> Vec<u8> {
        let mut elf = vec![0u8; 0x1000];
        // ELF64 header
        elf[0..4].copy_from_slice(&ELFMAG);
        elf[4] = ELFCLASS64;
        elf[5] = ELFDATA2LSB;
        elf[6] = 1;
        elf[16..18].copy_from_slice(&3u16.to_le_bytes()); // ET_DYN
        elf[18..20].copy_from_slice(&EM_AARCH64.to_le_bytes());
        elf[32..40].copy_from_slice(&64u64.to_le_bytes()); // e_phoff = 64
        elf[40..48].copy_from_slice(&0x500u64.to_le_bytes()); // e_shoff = 0x500
        elf[54..56].copy_from_slice(&56u16.to_le_bytes()); // e_phentsize
        elf[56..58].copy_from_slice(&2u16.to_le_bytes()); // e_phnum = 2
        elf[58..60].copy_from_slice(&64u16.to_le_bytes()); // e_shentsize
        elf[60..62].copy_from_slice(&4u16.to_le_bytes()); // e_shnum = 4 (null, shstrtab, strtab, dynsym)
        elf[62..64].copy_from_slice(&1u16.to_le_bytes()); // e_shstrndx = 1

        // Phdr 0: PT_LOAD (vaddr 0..0x1000 -> offset 0)
        let mut ph0 = Vec::new();
        push_le32(&mut ph0, PT_LOAD);
        push_le32(&mut ph0, 5);
        push_le64(&mut ph0, 0); // p_offset
        push_le64(&mut ph0, 0); // p_vaddr
        push_le64(&mut ph0, 0);
        push_le64(&mut ph0, 0x1000);
        push_le64(&mut ph0, 0x1000);
        push_le64(&mut ph0, 0x1000);
        elf[64..64 + 56].copy_from_slice(&ph0);

        // Phdr 1: PT_DYNAMIC at offset 0x200, filesz 16*6 = 96
        let mut ph1 = Vec::new();
        push_le32(&mut ph1, PT_DYNAMIC);
        push_le32(&mut ph1, 6);
        push_le64(&mut ph1, 0x200);
        push_le64(&mut ph1, 0x200);
        push_le64(&mut ph1, 0x200);
        push_le64(&mut ph1, 96);
        push_le64(&mut ph1, 96);
        push_le64(&mut ph1, 8);
        elf[64 + 56..64 + 112].copy_from_slice(&ph1);

        // Dyn entries at 0x200
        let mut dyn_sec = Vec::new();
        push_le64(&mut dyn_sec, DT_SYMTAB as u64);
        push_le64(&mut dyn_sec, 0x380);
        push_le64(&mut dyn_sec, DT_STRTAB as u64);
        push_le64(&mut dyn_sec, 0x300);
        push_le64(&mut dyn_sec, DT_RELA as u64);
        push_le64(&mut dyn_sec, 0x420);
        push_le64(&mut dyn_sec, DT_RELASZ as u64);
        push_le64(&mut dyn_sec, 24);
        push_le64(&mut dyn_sec, DT_HASH as u64);
        push_le64(&mut dyn_sec, 0x450);
        push_le64(&mut dyn_sec, 0);
        push_le64(&mut dyn_sec, 0);
        elf[0x200..0x200 + dyn_sec.len()].copy_from_slice(&dyn_sec);

        // strtab at 0x300
        let strtab = b"\0pf_lookup\0pf_readdir_extra\0";
        elf[0x300..0x300 + strtab.len()].copy_from_slice(strtab);

        // dynsym at 0x380 (3 symbols: undef, pf_lookup, pf_readdir_extra)
        let mut sym = Vec::new();
        // sym 0: null (24B)
        sym.extend_from_slice(&[0u8; 24]);
        // sym 1: pf_lookup (st_name=1, val=0x1110, size=64)
        push_le32(&mut sym, 1);
        sym.push(0x12);
        sym.push(0);
        push_le16(&mut sym, 1);
        push_le64(&mut sym, 0x1110);
        push_le64(&mut sym, 64);
        // sym 2: pf_readdir_extra (st_name=11, val=0x2220, size=128)
        push_le32(&mut sym, 11);
        sym.push(0x12);
        sym.push(0);
        push_le16(&mut sym, 1);
        push_le64(&mut sym, 0x2220);
        push_le64(&mut sym, 128);
        elf[0x380..0x380 + sym.len()].copy_from_slice(&sym);

        // RELA at 0x420 referencing sym 1 with R_AARCH64_JUMP_SLOT (1026), r_offset=0x900
        let mut rela = Vec::new();
        push_le64(&mut rela, 0x900);
        push_le64(&mut rela, (1u64 << 32) | 1026u64);
        push_le64(&mut rela, 0);
        elf[0x420..0x420 + 24].copy_from_slice(&rela);

        // SysV hash at 0x450: nbucket=1, nchain=3
        let h_pf = compute_elf_hash(b"pf_lookup");
        let _ = h_pf;
        let mut hash = Vec::new();
        push_le32(&mut hash, 1);
        push_le32(&mut hash, 3);
        push_le32(&mut hash, 1); // bucket[0] = 1
        push_le32(&mut hash, 0); // chain[0]
        push_le32(&mut hash, 2); // chain[1] -> 2
        push_le32(&mut hash, 0); // chain[2] -> 0
        elf[0x450..0x450 + hash.len()].copy_from_slice(&hash);

        // shstrtab at 0x4c0
        let shstrtab = b"\0.shstrtab\0.dynstr\0.dynsym\0";
        elf[0x4c0..0x4c0 + shstrtab.len()].copy_from_slice(shstrtab);

        // 4 Section headers at 0x500
        let mut shdrs = vec![0u8; 64 * 4];
        // sec 1: .shstrtab
        shdrs[64..68].copy_from_slice(&1u32.to_le_bytes());
        shdrs[68..72].copy_from_slice(&3u32.to_le_bytes()); // SHT_STRTAB
        shdrs[64 + 24..64 + 32].copy_from_slice(&0x4c0u64.to_le_bytes());
        shdrs[64 + 32..64 + 40].copy_from_slice(&(shstrtab.len() as u64).to_le_bytes());
        // sec 2: .dynstr
        shdrs[128..132].copy_from_slice(&11u32.to_le_bytes());
        shdrs[128 + 4..128 + 8].copy_from_slice(&3u32.to_le_bytes());
        shdrs[128 + 24..128 + 32].copy_from_slice(&0x300u64.to_le_bytes());
        shdrs[128 + 32..128 + 40].copy_from_slice(&(strtab.len() as u64).to_le_bytes());
        // sec 3: .dynsym
        shdrs[192..196].copy_from_slice(&19u32.to_le_bytes());
        shdrs[192 + 4..192 + 8].copy_from_slice(&SHT_DYNSYM.to_le_bytes());
        shdrs[192 + 24..192 + 32].copy_from_slice(&0x380u64.to_le_bytes());
        shdrs[192 + 32..192 + 40].copy_from_slice(&(sym.len() as u64).to_le_bytes());
        shdrs[192 + 40..192 + 44].copy_from_slice(&2u32.to_le_bytes()); // sh_link = 2
        shdrs[192 + 56..192 + 64].copy_from_slice(&24u64.to_le_bytes());
        elf[0x500..0x500 + shdrs.len()].copy_from_slice(&shdrs);
        elf
    }

    #[test]
    fn locates_embedded_stored_elf_in_apk() {
        let payload = b"\x7fELF-mock-so-bytes";
        let apk = build_synthetic_apk(b"lib/arm64-v8a/libfuse_jni.so", payload);
        let (off, len) = find_embedded_stored_elf(&apk, b"lib/arm64-v8a/libfuse_jni.so").unwrap();
        assert_eq!(&apk[off..off + len], payload);
        assert_eq!(find_embedded_stored_elf(&apk, b"lib/arm64-v8a/missing.so"), None);
    }

    #[test]
    fn parses_elf64_sections_symbols_and_relocs() {
        let elf = build_synthetic_elf64();
        assert!(find_named_section(&elf, b".dynsym").is_some());
        assert_eq!(find_symbol_offset(&elf, b"pf_lookup", 0), Some(0x1110));

        let batch = find_symbol_offsets_batch(&elf, &[b"pf_lookup", b"missing", b"pf_readdir_extra"]);
        assert_eq!(batch, vec![Some(0x1110), None, Some(0x2220)]);

        let largest = find_largest_symbol_containing(&elf, b"pf_").unwrap();
        assert_eq!(largest.name, b"pf_readdir_extra");
        assert_eq!(largest.value, 0x2220);

        let dyn_info = parse_dynamic_info(&elf).unwrap();
        assert_eq!(dynamic_symbol_count(&elf, &dyn_info), 3);
        let idx = find_dynamic_symbol_index(&elf, &dyn_info, b"pf_lookup").unwrap();
        assert_eq!(idx, 1);

        let slots = find_relocation_slots_for_symbol(&elf, &dyn_info, idx, 0x7000_0000);
        assert_eq!(slots, vec![0x7000_0900]);
    }

    #[test]
    fn parses_proc_maps_lines_safely() {
        let maps = b"\
702c419000-702c480000 r--p 00000000 fc:00 123 /apex/com.android.mediaprovider/MediaProvider.apk\n\
702c480000-702c520000 r-xp 00067000 fc:00 123 /apex/com.android.mediaprovider/MediaProvider.apk\n\
702c520000-702c530000 rw-p 00107000 fc:00 123 /apex/com.android.mediaprovider/MediaProvider.apk\n";
        let span = parse_maps_for_marker(maps, b"MediaProvider.apk").unwrap();
        assert_eq!(span.mapped_start, 0x702c419000);
        assert_eq!(span.mapped_end, 0x702c530000);
        assert_eq!(span.exec_start, 0x702c480000);
        assert_eq!(span.exec_end, 0x702c520000);
        assert_eq!(span.exec_perms, PROT_READ | PROT_EXEC);
    }
}
