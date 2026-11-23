//! Fixed-capacity (zero-heap-alloc) Dobby v3 hook slot manager & FuseHide Native API v2/v3 ABI.

#![allow(dead_code)]

use std::ffi::{c_int, c_void};
use std::mem::size_of;
use std::ptr;
use std::sync::Mutex;

pub const RT_SUCCESS: c_int = 0;
pub const RT_FAILED: c_int = -1;

pub const K_NATIVE_HOOK_OK: c_int = 0;
pub const K_NATIVE_HOOK_FAILED_NEVER_PUBLISHED: c_int = -1;
pub const K_NATIVE_HOOK_FAILED_AFTER_PUBLISHED: c_int = -2;
pub const K_NATIVE_HOOK_RECOVERY_REQUIRED: c_int = -3;

pub const DOBBY_BRANCH_LEGACY: u32 = 0;
pub const DOBBY_BRANCH_REQUIRE_NEAR: u32 = 2;
pub const DOBBY_BRANCH_FORCE_LONG: u32 = 3;

pub const DOBBY_HOOK_RECOVERY_REQUIRED: u32 = 9;

pub const DOBBY_HOOK_REQUIRE_CONCURRENT_SAFE: u32 = 1 << 0;
pub const DOBBY_HOOK_REQUIRE_PRISTINE_ENTRY: u32 = 1 << 1;
pub const DOBBY_HOOK_VALIDATE_BACKUP: u32 = 1 << 2;
pub const DOBBY_HOOK_PRESERVE_LANDING_PAD: u32 = 1 << 3;
pub const DOBBY_HOOK_EXPERIMENTAL_PAC_SP: u32 = 1 << 4;

pub type DobbyHookHandle = u64;
pub type DobbyDummyFunc = *mut c_void;

#[repr(C)]
#[derive(Debug, Clone, Copy)]
pub struct DobbyHookOptions {
    pub struct_size: u32,
    pub branch_policy: u32,
    pub flags: u32,
    pub reserved: u32,
    pub target: *mut c_void,
    pub replacement: DobbyDummyFunc,
}

#[repr(C)]
#[derive(Debug, Clone, Copy)]
pub struct DobbyHookResult {
    pub struct_size: u32,
    pub status: u32,
    pub cause: u32,
    pub reserved: u32,
    pub patch_size: u32,
    pub selected_branch: u32,
    pub handle: DobbyHookHandle,
    pub original: DobbyDummyFunc,
    pub target_may_be_patched: u8,
    pub restored_and_synchronized: u8,
    pub ever_published: u8,
    pub reserved_bytes: [u8; 5],
}

impl DobbyHookResult {
    pub const fn empty() -> Self {
        Self {
            struct_size: size_of::<Self>() as u32,
            status: 0,
            cause: 0,
            reserved: 0,
            patch_size: 0,
            selected_branch: 0,
            handle: 0,
            original: ptr::null_mut(),
            target_may_be_patched: 0,
            restored_and_synchronized: 0,
            ever_published: 0,
            reserved_bytes: [0; 5],
        }
    }
}

pub type HookInstaller =
    extern "C" fn(target: *mut c_void, replacement: *mut c_void, backup: *mut *mut c_void) -> c_int;
pub type HookBackupPublisher = extern "C" fn(user_data: *mut c_void, original: *mut c_void);
pub type StrictHookInstaller = extern "C" fn(
    target: *mut c_void,
    replacement: *mut c_void,
    user_data: *mut c_void,
    publish: Option<HookBackupPublisher>,
) -> c_int;

#[repr(C)]
pub struct NativeApiEntries {
    pub version: u32,
    pub hook_func: HookInstaller,
    pub unhook_func: extern "C" fn(*mut c_void) -> c_int,
}

#[repr(C)]
pub struct NativeApiEntriesV3 {
    pub base: NativeApiEntries,
    pub struct_size: u32,
    pub reserved: u32,
    pub hook_with_publication: StrictHookInstaller,
}

#[cfg(target_os = "android")]
unsafe extern "C" {
    pub fn DobbyPrepareHook(
        options: *const DobbyHookOptions,
        result: *mut DobbyHookResult,
    ) -> c_int;
    pub fn DobbyCommitHook(handle: DobbyHookHandle, result: *mut DobbyHookResult) -> c_int;
    pub fn DobbyAbortHook(handle: DobbyHookHandle, result: *mut DobbyHookResult) -> c_int;
    pub fn DobbyRecoverHook(handle: DobbyHookHandle, result: *mut DobbyHookResult) -> c_int;
    pub fn DobbyDestroyHook(handle: DobbyHookHandle, result: *mut DobbyHookResult) -> c_int;
}

#[derive(Debug, Clone, Copy, PartialEq, Eq)]
enum SlotState {
    Free,
    Preparing,
    Prepared,
    Installed,
    RecoveryRequired,
    Unhooking,
}

#[derive(Clone, Copy)]
struct HookSlot {
    target: usize,
    ticket: DobbyHookHandle,
    state: SlotState,
}

impl HookSlot {
    const fn empty() -> Self {
        Self {
            target: 0,
            ticket: 0,
            state: SlotState::Free,
        }
    }
}

const NATIVE_HOOK_CAPACITY: usize = 256;
static SLOTS: Mutex<[HookSlot; NATIVE_HOOK_CAPACITY]> =
    Mutex::new([HookSlot::empty(); NATIVE_HOOK_CAPACITY]);

#[cfg(target_os = "android")]
fn release_slot(idx: usize) {
    if let Ok(mut slots) = SLOTS.lock() {
        slots[idx] = HookSlot::empty();
    }
}

#[cfg(target_os = "android")]
fn install_native_hook_internal(
    target: *mut c_void,
    replacement: *mut c_void,
    backup: *mut *mut c_void,
    user_data: *mut c_void,
    publish: Option<HookBackupPublisher>,
) -> c_int {
    if !backup.is_null() {
        unsafe { *backup = ptr::null_mut() };
    }
    if target.is_null() || replacement.is_null() || (!user_data.is_null() && publish.is_none()) {
        return RT_FAILED;
    }

    let target_addr = target as usize;
    let slot_idx = {
        let Ok(mut slots) = SLOTS.lock() else {
            return RT_FAILED;
        };
        let mut free_idx = None;
        for (idx, cand) in slots.iter().enumerate() {
            if cand.state != SlotState::Free && cand.target == target_addr {
                return RT_FAILED;
            }
            if free_idx.is_none() && cand.state == SlotState::Free {
                free_idx = Some(idx);
            }
        }
        let Some(idx) = free_idx else {
            return RT_FAILED;
        };
        slots[idx].target = target_addr;
        slots[idx].state = SlotState::Preparing;
        idx
    };

    #[cfg(target_arch = "aarch64")]
    let (branch_policy, flags) = (
        DOBBY_BRANCH_REQUIRE_NEAR,
        DOBBY_HOOK_REQUIRE_CONCURRENT_SAFE
            | DOBBY_HOOK_VALIDATE_BACKUP
            | DOBBY_HOOK_PRESERVE_LANDING_PAD
            | DOBBY_HOOK_EXPERIMENTAL_PAC_SP,
    );
    #[cfg(not(target_arch = "aarch64"))]
    let (branch_policy, flags) = (DOBBY_BRANCH_LEGACY, 0u32);

    let options = DobbyHookOptions {
        struct_size: size_of::<DobbyHookOptions>() as u32,
        branch_policy,
        flags,
        reserved: 0,
        target,
        replacement,
    };

    let mut result = DobbyHookResult::empty();
    if unsafe { DobbyPrepareHook(&raw const options, &raw mut result) } != RT_SUCCESS {
        crate::log::error(&format!(
            "native hook prepare target={target:p} status={} cause={} retained={}",
            result.status,
            result.cause,
            result.handle != 0
        ));
        if result.handle != 0 {
            if let Ok(mut slots) = SLOTS.lock() {
                slots[slot_idx].ticket = result.handle;
                slots[slot_idx].state = if result.status == DOBBY_HOOK_RECOVERY_REQUIRED {
                    SlotState::RecoveryRequired
                } else {
                    SlotState::Prepared
                };
            }
            return K_NATIVE_HOOK_RECOVERY_REQUIRED;
        }
        release_slot(slot_idx);
        return K_NATIVE_HOOK_FAILED_NEVER_PUBLISHED;
    }

    let ticket = result.handle;
    if ticket == 0 || result.original.is_null() {
        let mut aborted = DobbyHookResult::empty();
        let released = ticket != 0
            && unsafe { DobbyAbortHook(ticket, &raw mut aborted) } == RT_SUCCESS;
        if released || ticket == 0 {
            release_slot(slot_idx);
            return K_NATIVE_HOOK_FAILED_NEVER_PUBLISHED;
        }
        if let Ok(mut slots) = SLOTS.lock() {
            slots[slot_idx].ticket = ticket;
            slots[slot_idx].state = SlotState::Prepared;
        }
        return K_NATIVE_HOOK_RECOVERY_REQUIRED;
    }

    if let Ok(mut slots) = SLOTS.lock() {
        slots[slot_idx].ticket = ticket;
        slots[slot_idx].state = SlotState::Preparing;
    }

    if let Some(pub_fn) = publish {
        pub_fn(user_data, result.original);
    } else if !backup.is_null() {
        unsafe { *backup = result.original };
    }

    if unsafe { DobbyCommitHook(ticket, &raw mut result) } == RT_SUCCESS {
        if let Ok(mut slots) = SLOTS.lock() {
            slots[slot_idx].state = SlotState::Installed;
        }
        return RT_SUCCESS;
    }

    crate::log::error(&format!(
        "native hook commit target={target:p} status={} cause={} retained={}",
        result.status,
        result.cause,
        result.handle != 0
    ));
    if result.handle == ticket
        && result.ever_published == 0
        && result.target_may_be_patched == 0
        && result.status != DOBBY_HOOK_RECOVERY_REQUIRED
    {
        let mut aborted = DobbyHookResult::empty();
        if unsafe { DobbyAbortHook(ticket, &raw mut aborted) } == RT_SUCCESS {
            result.handle = 0;
        }
    }
    if result.handle == 0 {
        release_slot(slot_idx);
    } else if let Ok(mut slots) = SLOTS.lock() {
        slots[slot_idx].state = if result.status == DOBBY_HOOK_RECOVERY_REQUIRED {
            SlotState::RecoveryRequired
        } else {
            SlotState::Prepared
        };
    }

    if result.ever_published == 0 && result.handle == 0 {
        if let Some(pub_fn) = publish {
            pub_fn(user_data, ptr::null_mut());
        }
    }
    if !backup.is_null() && result.ever_published == 0 {
        unsafe { *backup = ptr::null_mut() };
    }
    if result.handle != 0 {
        K_NATIVE_HOOK_RECOVERY_REQUIRED
    } else if result.ever_published != 0 {
        K_NATIVE_HOOK_FAILED_AFTER_PUBLISHED
    } else {
        K_NATIVE_HOOK_FAILED_NEVER_PUBLISHED
    }
}

#[cfg(not(target_os = "android"))]
fn install_native_hook_internal(
    _target: *mut c_void,
    _replacement: *mut c_void,
    _backup: *mut *mut c_void,
    _user_data: *mut c_void,
    _publish: Option<HookBackupPublisher>,
) -> c_int {
    RT_FAILED
}

pub extern "C" fn install_native_hook(
    target: *mut c_void,
    replacement: *mut c_void,
    backup: *mut *mut c_void,
) -> c_int {
    if install_native_hook_internal(target, replacement, backup, ptr::null_mut(), None)
        == K_NATIVE_HOOK_OK
    {
        RT_SUCCESS
    } else {
        RT_FAILED
    }
}

pub extern "C" fn install_native_hook_with_publication(
    target: *mut c_void,
    replacement: *mut c_void,
    user_data: *mut c_void,
    publish: Option<HookBackupPublisher>,
) -> c_int {
    if publish.is_none() {
        return K_NATIVE_HOOK_FAILED_NEVER_PUBLISHED;
    }
    install_native_hook_internal(target, replacement, ptr::null_mut(), user_data, publish)
}

#[cfg(target_os = "android")]
pub extern "C" fn uninstall_native_hook(target: *mut c_void) -> c_int {
    if target.is_null() {
        return RT_FAILED;
    }
    let target_addr = target as usize;
    let (slot_idx, ticket, prior) = {
        let Ok(mut slots) = SLOTS.lock() else {
            return RT_FAILED;
        };
        let mut found = None;
        for (idx, cand) in slots.iter().enumerate() {
            if cand.state != SlotState::Free && cand.target == target_addr {
                found = Some(idx);
                break;
            }
        }
        let Some(idx) = found else {
            return RT_FAILED;
        };
        let slot = &mut slots[idx];
        if slot.ticket == 0
            || slot.state == SlotState::Preparing
            || slot.state == SlotState::Unhooking
        {
            return RT_FAILED;
        }
        let ticket = slot.ticket;
        let prior = slot.state;
        slot.state = SlotState::Unhooking;
        (idx, ticket, prior)
    };

    let mut result = DobbyHookResult::empty();
    let rc = unsafe {
        match prior {
            SlotState::Prepared => DobbyAbortHook(ticket, &raw mut result),
            SlotState::RecoveryRequired => DobbyRecoverHook(ticket, &raw mut result),
            _ => DobbyDestroyHook(ticket, &raw mut result),
        }
    };
    if rc == RT_SUCCESS {
        release_slot(slot_idx);
        return RT_SUCCESS;
    }
    if let Ok(mut slots) = SLOTS.lock() {
        slots[slot_idx].state = prior;
    }
    RT_FAILED
}

#[cfg(not(target_os = "android"))]
pub extern "C" fn uninstall_native_hook(_target: *mut c_void) -> c_int {
    RT_FAILED
}

static NATIVE_API_V2: NativeApiEntries = NativeApiEntries {
    version: 2,
    hook_func: install_native_hook,
    unhook_func: uninstall_native_hook,
};

static NATIVE_API_V3: NativeApiEntriesV3 = NativeApiEntriesV3 {
    base: NativeApiEntries {
        version: 3,
        hook_func: install_native_hook,
        unhook_func: uninstall_native_hook,
    },
    struct_size: size_of::<NativeApiEntriesV3>() as u32,
    reserved: 0,
    hook_with_publication: install_native_hook_with_publication,
};

pub fn native_hook_api_v2_ptr() -> *const NativeApiEntries {
    &raw const NATIVE_API_V2
}

pub fn native_hook_api_v3_ptr() -> *const NativeApiEntriesV3 {
    &raw const NATIVE_API_V3
}

#[cfg(test)]
mod tests {
    use super::*;
    use std::mem::offset_of;

    #[test]
    fn native_hook_v3_layout_matches_cpp_static_asserts() {
        assert_eq!(offset_of!(NativeApiEntriesV3, base), 0);
        assert_eq!(size_of::<NativeApiEntries>(), size_of::<NativeApiEntries>());
        assert_eq!(NATIVE_API_V2.version, 2);
        assert_eq!(NATIVE_API_V3.base.version, 3);
        assert_eq!(NATIVE_API_V3.struct_size as usize, size_of::<NativeApiEntriesV3>());
    }
}
