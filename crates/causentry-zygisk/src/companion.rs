//! Zygisk Root Companion bidirectional socket relay connecting target processes to `causentryd`.
//!
//! Rather than relying on `SCM_RIGHTS` FD passing (which is blocked or stripped by some
//! Zygisk implementations / SELinux policies), the companion bridges Zygisk's already-authorized
//! `connectCompanion()` Unix stream socket directly to `/data/adb/causentry/internal.sock`
//! inside a detached zero-CPU `poll()` thread.

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

fn set_socket_timeout(fd: c_int, secs: libc::time_t) {
    let tv = libc::timeval {
        tv_sec: secs,
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

    for _ in 0..20 {
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

fn write_all_fd(fd: c_int, mut buf: &[u8]) -> bool {
    while !buf.is_empty() {
        let n = unsafe { libc::send(fd, buf.as_ptr().cast(), buf.len(), libc::MSG_NOSIGNAL) };
        if n < 0 {
            let err = std::io::Error::last_os_error().raw_os_error().unwrap_or(0);
            if err == libc::EINTR {
                continue;
            }
            return false;
        }
        if n == 0 {
            return false;
        }
        buf = &buf[n as usize..];
    }
    true
}

fn forward_once(src: c_int, dst: c_int, buf: &mut [u8]) -> bool {
    loop {
        let n = unsafe { libc::recv(src, buf.as_mut_ptr().cast(), buf.len(), 0) };
        if n < 0 {
            let err = std::io::Error::last_os_error().raw_os_error().unwrap_or(0);
            if err == libc::EINTR {
                continue;
            }
            return false;
        }
        if n == 0 {
            return false;
        }
        return write_all_fd(dst, &buf[..n as usize]);
    }
}

fn relay_bidirectional(client_fd: c_int, daemon_fd: c_int, target: i32, pid: i32) {
    let mut buf = vec![0u8; 16 * 1024];
    let mut fds = [
        libc::pollfd {
            fd: client_fd,
            events: libc::POLLIN,
            revents: 0,
        },
        libc::pollfd {
            fd: daemon_fd,
            events: libc::POLLIN,
            revents: 0,
        },
    ];

    loop {
        fds[0].revents = 0;
        fds[1].revents = 0;
        let rc = unsafe { libc::poll(fds.as_mut_ptr(), 2, -1) };
        if rc < 0 {
            let err = std::io::Error::last_os_error().raw_os_error().unwrap_or(0);
            if err == libc::EINTR {
                continue;
            }
            break;
        }
        if (fds[0].revents & libc::POLLIN) != 0 && !forward_once(client_fd, daemon_fd, &mut buf) {
            break;
        }
        if (fds[1].revents & libc::POLLIN) != 0 && !forward_once(daemon_fd, client_fd, &mut buf) {
            break;
        }
        if ((fds[0].revents | fds[1].revents) & (libc::POLLERR | libc::POLLHUP | libc::POLLNVAL))
            != 0
        {
            break;
        }
    }

    unsafe {
        libc::close(client_fd);
        libc::close(daemon_fd);
    }
    log::info(&format!(
        "companion relay closed target={target} pid={pid}"
    ));
}

pub fn handle_companion_request(client: c_int) {
    set_socket_timeout(client, 2);
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
            let relay_fd = unsafe { libc::dup(client) };
            if relay_fd >= 0 {
                // Clear timeouts before acking so the long-lived push stream stays open.
                set_socket_timeout(relay_fd, 0);
                let ok_ack: u8 = 1;
                if write_all_fd(relay_fd, &[ok_ack]) {
                    let target = req.target;
                    let pid = req.pid;
                    if thread::Builder::new()
                        .name(format!("cs-relay-{target}"))
                        .spawn(move || relay_bidirectional(relay_fd, daemon_fd, target, pid))
                        .is_ok()
                    {
                        log::info(&format!(
                            "companion relay started target={target} pid={pid}"
                        ));
                        return;
                    }
                }
                unsafe { libc::close(relay_fd) };
            }
            unsafe { libc::close(daemon_fd) };
        } else {
            log::warn(&format!(
                "companion could not connect to causentryd internal.sock for target={}",
                req.target
            ));
        }
    }
    let fail: u8 = 0;
    let _ = write_all_fd(client, &[fail]);
}

pub fn acquire_policy_socket_fd(api: *mut ApiTable, target: TargetProcess, _is_app: bool) {
    if api.is_null() {
        return;
    }
    let client = unsafe { (*api).connect_companion() };
    if client < 0 {
        log::warn("connectCompanion failed");
        return;
    }
    set_socket_timeout(client, 2);
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
        let mut ack: u8 = 0;
        let got = unsafe { libc::recv(client, (&raw mut ack).cast(), 1, libc::MSG_WAITALL) };
        if got == 1 && ack == 1 {
            set_socket_timeout(client, 0);
            unsafe {
                (*api).exempt_fd(client);
            }
            set_policy_channel_fd(client);
            log::info(&format!(
                "acquired bridged policy channel fd={client} for target={}",
                target as i32
            ));
            return;
        }
        log::warn(&format!(
            "companion handshake rejected got={got} ack={ack} target={}",
            target as i32
        ));
    } else {
        log::warn(&format!(
            "companion handshake send failed sent={sent} target={}",
            target as i32
        ));
    }
    unsafe { libc::close(client) };
}
