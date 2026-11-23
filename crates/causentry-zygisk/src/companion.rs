//! Zygisk Root Companion `SCM_RIGHTS` FD broker connecting targets to `causentryd`.

#![cfg(target_os = "android")]

use crate::dex_loader::set_policy_channel_fd;
use crate::log;
use crate::zygisk_abi::ApiTable;
use causentry_proto::{CompanionHandshake, INTERNAL_SOCK_PATH, TargetProcess};
use std::ffi::c_int;
use std::mem::{size_of, zeroed};
use std::ptr;
use std::thread;
use std::time::Duration;

fn set_socket_timeout(fd: c_int) {
    let tv = libc::timeval {
        tv_sec: 2,
        tv_usec: 0,
    };
    unsafe {
        libc::setsockopt(
            fd,
            libc::SOL_SOCKET,
            libc::SO_RCVTIMEO,
            (&raw const tv).cast(),
            size_of::<libc::timeval>() as libc::socklen_t,
        );
        libc::setsockopt(
            fd,
            libc::SOL_SOCKET,
            libc::SO_SNDTIMEO,
            (&raw const tv).cast(),
            size_of::<libc::timeval>() as libc::socklen_t,
        );
    }
}

#[repr(C, align(8))]
struct CmsgBuf([u8; 64]);

fn send_fd_over_socket(sock: c_int, fd_to_send: c_int) -> bool {
    let mut dummy: u8 = 1;
    let mut iov = libc::iovec {
        iov_base: (&raw mut dummy).cast(),
        iov_len: 1,
    };
    let mut cmsg_buf = CmsgBuf([0u8; 64]);
    let space = unsafe { libc::CMSG_SPACE(size_of::<c_int>() as u32) } as usize;
    if space > cmsg_buf.0.len() {
        return false;
    }

    let mut msg: libc::msghdr = unsafe { zeroed() };
    msg.msg_iov = &raw mut iov;
    msg.msg_iovlen = 1 as _;
    msg.msg_control = cmsg_buf.0.as_mut_ptr().cast();
    msg.msg_controllen = space as _;

    unsafe {
        let cmsg = libc::CMSG_FIRSTHDR(&raw const msg);
        if cmsg.is_null() {
            return false;
        }
        (*cmsg).cmsg_level = libc::SOL_SOCKET;
        (*cmsg).cmsg_type = libc::SCM_RIGHTS;
        (*cmsg).cmsg_len = libc::CMSG_LEN(size_of::<c_int>() as u32) as _;
        ptr::copy_nonoverlapping(
            (&raw const fd_to_send).cast::<u8>(),
            libc::CMSG_DATA(cmsg),
            size_of::<c_int>(),
        );
        libc::sendmsg(sock, &raw const msg, libc::MSG_NOSIGNAL) == 1
    }
}

fn recv_fd_from_socket(sock: c_int) -> c_int {
    let mut dummy: u8 = 0;
    let mut iov = libc::iovec {
        iov_base: (&raw mut dummy).cast(),
        iov_len: 1,
    };
    let mut cmsg_buf = CmsgBuf([0u8; 64]);
    let space = unsafe { libc::CMSG_SPACE(size_of::<c_int>() as u32) } as usize;
    if space > cmsg_buf.0.len() {
        return -1;
    }

    let mut msg: libc::msghdr = unsafe { zeroed() };
    msg.msg_iov = &raw mut iov;
    msg.msg_iovlen = 1 as _;
    msg.msg_control = cmsg_buf.0.as_mut_ptr().cast();
    msg.msg_controllen = space as _;

    unsafe {
        if libc::recvmsg(sock, &raw mut msg, 0) <= 0 {
            return -1;
        }
        let mut cmsg = libc::CMSG_FIRSTHDR(&raw const msg);
        let expected_len = libc::CMSG_LEN(size_of::<c_int>() as u32) as _;
        while !cmsg.is_null() {
            if (*cmsg).cmsg_level == libc::SOL_SOCKET
                && (*cmsg).cmsg_type == libc::SCM_RIGHTS
                && (*cmsg).cmsg_len == expected_len
            {
                let mut fd: c_int = -1;
                ptr::copy_nonoverlapping(
                    libc::CMSG_DATA(cmsg),
                    (&raw mut fd).cast::<u8>(),
                    size_of::<c_int>(),
                );
                return fd;
            }
            cmsg = libc::CMSG_NXTHDR(&raw const msg, cmsg);
        }
    }
    -1
}

fn connect_to_daemon_internal_socket() -> c_int {
    let path_bytes = INTERNAL_SOCK_PATH.as_bytes();
    let mut addr: libc::sockaddr_un = unsafe { zeroed() };
    if path_bytes.len() >= addr.sun_path.len() {
        return -1;
    }
    addr.sun_family = libc::AF_UNIX as libc::sa_family_t;
    unsafe {
        ptr::copy_nonoverlapping(
            path_bytes.as_ptr(),
            addr.sun_path.as_mut_ptr().cast::<u8>(),
            path_bytes.len(),
        );
    }

    for _ in 0..15 {
        let fd = unsafe { libc::socket(libc::AF_UNIX, libc::SOCK_STREAM | libc::SOCK_CLOEXEC, 0) };
        if fd < 0 {
            return -1;
        }
        let rc = unsafe {
            libc::connect(
                fd,
                (&raw const addr).cast::<libc::sockaddr>(),
                size_of::<libc::sockaddr_un>() as libc::socklen_t,
            )
        };
        if rc == 0 {
            return fd;
        }
        unsafe { libc::close(fd) };
        thread::sleep(Duration::from_millis(25));
    }
    -1
}

pub fn handle_companion_request(client: c_int) {
    set_socket_timeout(client);
    let mut req = CompanionHandshake { target: -1, pid: 0 };
    let n = unsafe {
        libc::recv(
            client,
            (&raw mut req).cast(),
            size_of::<CompanionHandshake>(),
            libc::MSG_WAITALL,
        )
    };
    if n == size_of::<CompanionHandshake>() as isize {
        let daemon_fd = connect_to_daemon_internal_socket();
        if daemon_fd >= 0 {
            let _ = send_fd_over_socket(client, daemon_fd);
            unsafe { libc::close(daemon_fd) };
            return;
        }
    }
    let fail: u8 = 0;
    unsafe {
        libc::send(client, (&raw const fail).cast(), 1, libc::MSG_NOSIGNAL);
    }
}

pub fn acquire_policy_socket_fd(api: *mut ApiTable, target: TargetProcess, is_app: bool) {
    if api.is_null() {
        return;
    }
    let client = unsafe { (*api).connect_companion() };
    if client < 0 {
        log::warn("connectCompanion failed");
        return;
    }
    set_socket_timeout(client);
    let req = CompanionHandshake {
        target: target as i32,
        pid: unsafe { libc::getpid() },
    };
    let sent = unsafe {
        libc::send(
            client,
            (&raw const req).cast(),
            size_of::<CompanionHandshake>(),
            libc::MSG_NOSIGNAL,
        )
    };
    if sent == size_of::<CompanionHandshake>() as isize {
        let fd = recv_fd_from_socket(client);
        if fd >= 0 {
            if is_app {
                unsafe {
                    (*api).exempt_fd(fd);
                }
            }
            set_policy_channel_fd(fd);
            log::info(&format!(
                "acquired policy channel fd={fd} for target={}",
                target as i32
            ));
        }
    }
    unsafe { libc::close(client) };
}
