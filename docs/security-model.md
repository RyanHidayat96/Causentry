# Security Model

Core principles:

- No arbitrary shell command RPCs from the APK.
- No mandatory Zygisk, LSPosed, KPM, metamodule, root hiding, or third-party module dependency.
- No SELinux permissive mode.
- No boot-critical collectors.
- Bounded privileged behavior only after explicit later design.

Detailed threat modeling begins in STEP 2.
