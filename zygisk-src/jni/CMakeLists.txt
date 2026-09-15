cmake_minimum_required(VERSION 3.22)
project(causentry-zygisk CXX)

set(CMAKE_CXX_STANDARD 17)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

add_library(causentry-zygisk SHARED main.cpp)
target_link_libraries(causentry-zygisk log)

target_compile_options(causentry-zygisk PRIVATE -Wall -Wextra -fno-exceptions -fno-rtti)
