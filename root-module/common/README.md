# Root Module Common

This directory is reserved for shared module assets that are not executable shell entry
points. Active runtime helpers currently live in `root-module/bin/lib.sh`.

Provider-specific behavior should stay behind small shell helpers or future Rust
adapters so Magisk, KernelSU, KernelSU-Next, and APatch differences do not leak across
the rest of the module.
