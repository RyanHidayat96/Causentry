use std::env;
use std::path::PathBuf;

fn main() {
    let target_os = env::var("CARGO_CFG_TARGET_OS").unwrap_or_default();
    if target_os != "android" {
        return;
    }

    let target_arch = env::var("CARGO_CFG_TARGET_ARCH").unwrap_or_default();
    let (abi, sysroot_triple) = match target_arch.as_str() {
        "aarch64" => ("arm64-v8a", "aarch64-linux-android"),
        "arm" => ("armeabi-v7a", "arm-linux-androideabi"),
        "x86_64" => ("x86_64", "x86_64-linux-android"),
        "x86" => ("x86", "i686-linux-android"),
        other => panic!("unsupported Android arch: {other}"),
    };

    let manifest_dir = PathBuf::from(env::var("CARGO_MANIFEST_DIR").unwrap());
    let repo_root = manifest_dir
        .parent()
        .and_then(|p| p.parent())
        .expect("workspace root");
    let dobby_dir = repo_root
        .join("android/zygote/src/main/cpp")
        .join(format!("build-{abi}"))
        .join("third_party/Dobby");

    println!("cargo:rerun-if-changed={}", dobby_dir.display());
    println!("cargo:rustc-link-search=native={}", dobby_dir.display());

    // Locate NDK sysroot static C++ runtime for libdobby.a (tools/sdk/ndk/*).
    let ndk_root = repo_root.join("tools/sdk/ndk");
    if let Ok(entries) = std::fs::read_dir(&ndk_root) {
        let mut versions: Vec<_> = entries.flatten().map(|e| e.path()).collect();
        versions.sort();
        if let Some(latest_ndk) = versions.pop() {
            let sysroot_lib = latest_ndk
                .join("toolchains/llvm/prebuilt/windows-x86_64/sysroot/usr/lib")
                .join(sysroot_triple);
            if sysroot_lib.is_dir() {
                println!("cargo:rustc-link-search=native={}", sysroot_lib.display());
            }
        }
    }

    println!("cargo:rustc-link-lib=static=dobby");
    println!("cargo:rustc-link-lib=static=c++_static");
    println!("cargo:rustc-link-lib=static=c++abi");
    println!("cargo:rustc-link-lib=dylib=m");
    println!("cargo:rustc-link-lib=dylib=log");
    println!("cargo:rustc-link-lib=dylib=dl");

    println!("cargo:rustc-cdylib-link-arg=-Wl,--no-undefined");
    println!("cargo:rustc-cdylib-link-arg=-Wl,--exclude-libs,ALL");
    println!("cargo:rustc-cdylib-link-arg=-Wl,--no-rosegment");
    println!("cargo:rustc-cdylib-link-arg=-Wl,-soname,libzygisk.so");
}
