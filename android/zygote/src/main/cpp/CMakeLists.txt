cmake_minimum_required(VERSION 3.22.1)

project(fusehide)

add_library(
    fusehide
    SHARED
    local_atexit.cpp
    fusehide.cpp
    fusehide/core/runtime_state.cpp
    fusehide/elf/elf_utils.cpp
    fusehide/filters/dirent_filter.cpp
    fusehide/filters/reply_buf_filter.cpp
    fusehide/hooks/fuse_wrappers.cpp
    fusehide/hooks/hook_install.cpp
    fusehide/jni/jni_entry.cpp
    fusehide/policy/path_policy.cpp
    fusehide/policy/unicode_policy.cpp
)

target_compile_features(fusehide PRIVATE cxx_std_20)

target_compile_options(
    fusehide
    PRIVATE
    -Wall
    -Wextra
    -Werror
    -fvisibility=hidden
    $<$<COMPILE_LANGUAGE:CXX>:-fno-exceptions>
    $<$<COMPILE_LANGUAGE:CXX>:-fno-rtti>
)

target_link_options(
    fusehide
    PRIVATE
    -Wl,--as-needed
)

if(NOT CMAKE_BUILD_TYPE MATCHES "Debug")
    target_compile_options(fusehide PRIVATE
        -Oz
        -flto=full
        -ffunction-sections
        -fdata-sections
        $<$<COMPILE_LANGUAGE:CXX>:-fno-unwind-tables>
        $<$<COMPILE_LANGUAGE:CXX>:-fno-asynchronous-unwind-tables>
        -fno-ident
        -fno-math-errno
        -fomit-frame-pointer
    )

    target_link_options(fusehide PRIVATE
        -flto=full
        -Wl,--gc-sections
        -Wl,--icf=all
        -Wl,--exclude-libs,ALL
        -Wl,-s
        -Wl,--hash-style=gnu
        -Wl,--build-id=none
        -Wl,-Bsymbolic
    )
endif()

set(CAUSENTRY_FUSE_CORE_INCLUDE "${CMAKE_CURRENT_SOURCE_DIR}/../../../../../crates/causentry-fuse-core/include")
set(CAUSENTRY_FUSE_CORE_LIB "" CACHE FILEPATH "Path to Rust libcausentry_fuse_core.a")

target_include_directories(
    fusehide
    PRIVATE
    ${CMAKE_CURRENT_SOURCE_DIR}
    ${CAUSENTRY_FUSE_CORE_INCLUDE}
)

find_library(log-lib log)
find_library(dl-lib dl)
if(CAUSENTRY_FUSE_CORE_LIB)
    target_link_libraries(fusehide ${CAUSENTRY_FUSE_CORE_LIB} ${log-lib} ${dl-lib})
else()
    target_link_libraries(fusehide ${log-lib} ${dl-lib})
endif()

target_link_options(fusehide PRIVATE -Wl,-z,max-page-size=16384 -Wl,-z,nodelete)

# Dobby static library is linked by the pure Rust Zygisk loader (crates/causentry-zygisk).
set(DOBBY_GENERATE_SHARED OFF CACHE BOOL "Build Dobby statically for Rust Zygisk" FORCE)
if(ANDROID_ABI STREQUAL "arm64-v8a")
    set(NearBranch ON CACHE BOOL "Require available ARM64 near trampoline backend" FORCE)
else()
    set(NearBranch OFF CACHE BOOL "Disable ARM64 NearBranch on non-arm64 ABIs" FORCE)
endif()
add_subdirectory(third_party/Dobby)
