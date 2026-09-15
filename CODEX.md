# CODEX.md

# Causentry --- Universal Android Root-Cause Diagnostic Platform

## Master Engineering Specification & Incremental Codex Execution Contract

> **Document status:** Authoritative implementation specification\
> **Project codename:** Causentry\
> **Primary artifact:** `Causentry-Module-vX.Y.Z.zip`\
> **Bundled application:** `Causentry-vX.Y.Z.apk`\
> **Privileged backend:** `causentryd` Rust daemon\
> **Root environments:** Magisk, KernelSU, KernelSU Next, APatch\
> **Development style:** Senior-level, production-oriented,
> evidence-driven, testable, incremental\
> **Execution rule:** Implement exactly one step, validate it, STOP, and
> wait for the user to type `next`.

------------------------------------------------------------------------

# 0. READ THIS FIRST --- AGENT CONTRACT

You are acting as the principal/senior engineer responsible for
designing and implementing Causentry.

Treat this document as the source of truth.

Before making ANY change:

1.  Read this entire `CODEX.md`.
2.  Inspect the repository.
3.  Determine the current completed step from repository evidence, not
    assumptions.
4.  Re-run critical validation from the previous completed step when
    practical.
5.  Identify the next unfinished step.
6.  Implement ONLY that step.
7.  Test it.
8.  Fix failures introduced by your work.
9.  Update documentation relevant to that step.
10. Produce the required completion report.
11. STOP.

The user continues development by typing:

``` text
next
```

Do not continue automatically.

If the user requests a correction, redesign, or review, remain on the
current step until that request is complete.

------------------------------------------------------------------------

# 1. PRODUCT VISION

Causentry is not another Logcat viewer.

Its purpose is to answer:

``` text
"Why did this Android application fail to open, force close,
terminate during startup, crash later, freeze, or behave differently
under a particular device/root/environment condition?"
```

Traditional log viewers typically expose:

``` text
FATAL EXCEPTION
RuntimeException
SIGABRT
avc: denied
...
```

Causentry must transform available evidence into:

``` text
WHAT happened?
WHEN did it happen?
WHICH subsystem was involved?
WHAT evidence supports the diagnosis?
WHAT competing explanations exist?
HOW confident are we?
WHAT is directly proven?
WHAT is only correlated?
WHAT remains unknown?
WHAT diagnostic experiment should be tried next?
```

The product must prioritize evidence and reproducibility over
speculation.

------------------------------------------------------------------------

# 2. PRODUCT IDENTITY

Initial identifiers:

``` text
Product name        Causentry
Android package     dev.causentry.android
Daemon              causentryd
Module ID           causentry
Protocol namespace  causentry.protocol
Rule schema          causentry.rules
```

These identifiers should be centralized where practical.

Do not scatter product constants throughout the codebase.

------------------------------------------------------------------------

# 3. FINAL USER EXPERIENCE

The preferred end-user installation must be:

``` text
Download:
Causentry-Module-v1.0.0.zip

        ↓

Install from:
Magisk
or KernelSU / KernelSU Next
or APatch

        ↓

Universal installer detects root provider

        ↓

Installs Causentry module

        ↓

Installs/updates bundled Causentry APK

        ↓

Starts privileged causentryd daemon

        ↓

Causentry APK connects to daemon

        ↓

FULL DIAGNOSTIC MODE
```

A normal rooted user should not have to install the APK separately.

However, release builds MUST also provide:

``` text
Causentry-vX.Y.Z.apk
```

as a fallback for:

-   ROMs that block root-driven Package Manager installation,
-   signature/version conflicts,
-   recovery,
-   UI development,
-   limited/no-root mode,
-   troubleshooting.

Never install Causentry as `/system/app` or `/system/priv-app`.

Use the Android Package Manager.

Never silently downgrade an installed newer Causentry APK.

------------------------------------------------------------------------

# 4. FINAL RELEASE ARTIFACTS

A release should eventually produce:

``` text
release/
├── Causentry-Module-vX.Y.Z.zip
├── Causentry-vX.Y.Z.apk
├── causentryd-arm64-v8a
├── SHA256SUMS
├── metadata.json
└── release-notes.md
```

The ZIP is the PRIMARY artifact.

The APK is a supported fallback artifact.

The ZIP MUST bundle the matching signed APK and daemon.

------------------------------------------------------------------------

# 5. ROOT PLATFORM SUPPORT

Target compatibility:

  Platform        Target
  --------------- ------------------------------------------
  Magisk          TARGETED until real-device certification
  KernelSU        TARGETED until real-device certification
  KernelSU Next   TARGETED until real-device certification
  APatch          TARGETED until real-device certification
  No root         Limited mode

"Full" means Causentry should expose all capabilities available through
that provider/device/kernel.

It does NOT mean every OEM/kernel exposes identical telemetry.

------------------------------------------------------------------------

# 6. NO MANDATORY THIRD-PARTY MODULE DEPENDENCIES

Core Causentry MUST NOT require:

``` text
Zygisk
Zygisk Next
LSPosed
Shamiko
Tricky Store
Play Integrity modules
SUSFS
Shizuku
KernelSU metamodule
APatch KPM
root-hiding modules
```

The only requirement for FULL mode is one supported root environment:

``` text
Magisk
OR KernelSU / KernelSU Next
OR APatch
```

This is intentional.

A diagnostic tool must not unnecessarily alter the environment it is
trying to diagnose.

------------------------------------------------------------------------

# 7. OPTIONAL ENHANCED / LAB CAPABILITIES

Optional frameworks MAY later unlock additional developer/lab
diagnostics.

Examples:

``` text
Zygisk-compatible capability
LSPosed-compatible capability
JVMTI on debuggable applications
other explicitly authorized instrumentation
```

These MUST:

-   be optional,
-   never be silently installed,
-   never be required for core diagnosis,
-   clearly mark the resulting session as instrumented,
-   warn that instrumentation can change target behavior,
-   only be used where technically and legally appropriate,
-   never be used to bypass target security controls.

The UI must distinguish:

``` text
CORE DIAGNOSTICS
DEEP/LAB DIAGNOSTICS
```

Example:

``` text
Core Diagnostics       FULL
Deep/Lab Diagnostics   UNAVAILABLE
```

This is not an error.

------------------------------------------------------------------------

# 8. THREE DIAGNOSTIC LEVELS

Causentry has three conceptual levels.

## 8.1 Level 1 --- Passive Diagnosis

Default.

Does not inject into the target process.

Uses observable evidence such as:

``` text
Logcat
process lifecycle
ApplicationExitInfo where available
Java exceptions
memory evidence
native signals
tombstone metadata where accessible
SELinux AVC
procfs metadata
environment snapshot
root provider state
module inventory
```

Purpose:

Identify deterministic or strongly supported failure classes.

## 8.2 Level 2 --- Environment Correlation

Compares repeated runs under controlled conditions.

Example:

``` text
Condition present:
FAIL
FAIL
FAIL
FAIL

Condition absent:
PASS
PASS
PASS
PASS
```

Allowed conclusion:

``` text
Startup failure strongly correlates with this environment condition.
```

Not automatically allowed:

``` text
The target application explicitly detects this condition.
```

This distinction is mandatory.

## 8.3 Level 3 --- Deep/Lab Diagnosis

Optional.

Only for authorized/debuggable/lab targets.

May use deeper instrumentation where appropriate.

Every such session must visibly show:

``` text
INSTRUMENTED SESSION

Instrumentation can change target runtime behavior.
Interpret results accordingly.
```

------------------------------------------------------------------------

# 9. EVIDENCE HIERARCHY

Every diagnosis MUST have an evidence level.

``` text
DIRECT
CORRELATED
INFERRED
UNKNOWN
```

## DIRECT

There is direct evidence.

Example:

``` text
java.lang.OutOfMemoryError
```

Result:

``` text
Memory allocation failure
Evidence: DIRECT
```

## CORRELATED

Controlled repeated experiments strongly associate a condition with
failure.

Example:

``` text
Zygisk-related environment present -> 0/4 launches succeed
Zygisk-related environment absent  -> 4/4 launches succeed
```

Result:

``` text
Failure strongly correlates with Zygisk-related environment.
Evidence: CORRELATED
```

## INFERRED

Timeline/signatures indicate a likely cause but do not prove it.

## UNKNOWN

Evidence is insufficient.

Never upgrade evidence merely because a conclusion sounds plausible.

------------------------------------------------------------------------

# 10. FACT / INFERENCE / UNKNOWN SEPARATION

Every diagnosis should internally support:

``` text
facts[]
inferences[]
unknowns[]
```

Example:

``` text
FACT
- Process crashed with RuntimeException.
- Failure occurred 1.42 seconds after startup.
- No Java OOM evidence was found.

INFERENCE
- Failure may originate from startup security/environment logic.

UNKNOWN
- The exact internal condition checked by the target application.
```

The UI must preserve this distinction.

------------------------------------------------------------------------

# 11. CAUSE CANDIDATE RANKING

Causentry should not always return one simplistic answer.

The analysis engine must support ranked candidates.

Example:

``` text
Possible causes

1. Security/environment-related termination   91%
   Evidence: CORRELATED

2. Application compatibility bug              31%
   Evidence: INFERRED

3. Memory issue                                2%

4. SELinux                                     0%

5. Native crash                                0%
```

Scores are evidence-based, not decorative.

Candidate scores do not need to sum to 100%.

Each candidate must explain why its score exists.

------------------------------------------------------------------------

# 12. CONFIDENCE LEVELS

Internal representation:

``` text
0.00 .. 1.00
```

User display:

``` text
0–24%    VERY LOW / UNKNOWN
25–49%   LOW
50–74%   POSSIBLE
75–89%   HIGH
90–100%  VERY HIGH
```

Never label a merely correlated hypothesis "confirmed".

Evidence level and confidence are separate concepts.

Example:

``` text
Evidence: CORRELATED
Confidence: 97%
```

is valid.

------------------------------------------------------------------------

# 13. WHY A SCORE EXISTS

Every non-trivial confidence score must be explainable.

Example:

``` text
Why 92%?

+ Direct RuntimeException evidence
+ Failure consistently occurs during startup
+ Reproduced event sequence
+ Strong A/B correlation
+ Competing memory explanation absent
- Exact internal target check not observable
```

No black-box random scoring.

------------------------------------------------------------------------

# 14. SYSTEM ARCHITECTURE

Use:

``` text
┌────────────────────────────────────────────┐
│ Causentry Android APK                       │
│ Kotlin + Jetpack Compose                   │
│                                            │
│ • app selector                             │
│ • session orchestration UI                 │
│ • timeline                                 │
│ • diagnosis                                │
│ • candidate ranking                        │
│ • evidence explorer                        │
│ • environment inspector                    │
│ • experiments                              │
│ • history                                  │
│ • report/export                            │
└──────────────────┬─────────────────────────┘
                   │
                   │ authenticated
                   │ Unix Domain Socket
                   │ Protocol Buffers
                   │
┌──────────────────▼─────────────────────────┐
│ causentryd                                  │
│ Rust privileged diagnostic daemon          │
│                                            │
│ • collectors                               │
│ • normalization                            │
│ • session engine                           │
│ • correlation                              │
│ • rules                                    │
│ • evidence engine                          │
│ • confidence/ranking                       │
│ • provider abstraction                     │
└──────────────────┬─────────────────────────┘
                   │
┌──────────────────▼─────────────────────────┐
│ Universal Root Integration Module          │
│                                            │
│ Magisk                                     │
│ KernelSU / KernelSU Next                   │
│ APatch                                     │
│                                            │
│ • provider detection                       │
│ • daemon lifecycle                         │
│ • APK bootstrap                            │
│ • privileged runtime                       │
│ • minimal SELinux integration              │
└────────────────────────────────────────────┘
```

------------------------------------------------------------------------

# 15. TECHNOLOGY STACK

## Android

``` text
Language             Kotlin
UI                   Jetpack Compose
Design               Material 3
Architecture         Clean Architecture + MVVM
Async                Coroutines + Flow
DI                   Hilt
Database             Room
Preferences          DataStore
Serialization        Protocol Buffers
Build                Gradle Kotlin DSL
Dependency versions  Version Catalog
Tests                JUnit + AndroidX Test + MockK when justified
Static analysis      Android Lint + detekt or ktlint
```

## Native daemon

``` text
Language             Rust
Async                Tokio where justified
IPC                  Unix Domain Socket
Serialization        Protocol Buffers
Logging              tracing
Errors               thiserror + anyhow where appropriate
Tests                cargo test
Lint                 cargo clippy
Format               cargo fmt
```

Avoid `unsafe`.

If unavoidable:

-   minimize scope,
-   add `// SAFETY:` explanation,
-   test relevant invariant.

## Universal module

``` text
module.prop
customize.sh
service.sh
boot-completed.sh when supported/needed
uninstall.sh
post-fs-data.sh absent by default; requires explicit ADR + approval if ever introduced
sepolicy.rule only after evidence-based SELinux review; absent by default
payload/Causentry.apk
bin/causentryd
```

Keep shell logic minimal.

Complex logic belongs in Rust.

------------------------------------------------------------------------

# 16. ROOT PROVIDER ABSTRACTION

Never let business logic depend directly on:

``` text
/data/adb/magisk
/data/adb/ksu
/data/adb/ap
```

or similar implementation details.

Create a provider abstraction.

Conceptually:

``` text
RootProvider
├── MagiskProvider
├── KernelSuProvider
├── KernelSuNextProvider
├── APatchProvider
└── NoRootProvider
```

Capabilities:

``` text
CAN_RUN_PRIVILEGED_DAEMON
CAN_READ_EXTENDED_LOGS
CAN_READ_PROC_METADATA
CAN_READ_SELINUX_AUDIT
CAN_ENUMERATE_ROOT_MODULES
CAN_ACCESS_TOMBSTONE_METADATA
CAN_INSTALL_BUNDLED_APK
CAN_RUN_OPTIONAL_LAB_FEATURES
```

Each:

``` text
AVAILABLE
UNAVAILABLE
UNKNOWN
```

The application must degrade gracefully.

------------------------------------------------------------------------

# 17. PROVIDER DETECTION

Prefer documented installer/runtime signals.

Do not identify providers only by guessing filesystem directories.

During installation/runtime:

-   detect APatch from its documented environment when available,
-   detect KernelSU-family from documented environment when available,
-   otherwise detect Magisk through supported installer/runtime
    primitives,
-   distinguish KernelSU Next only when reliable evidence exists,
-   otherwise report `KernelSU family`.

Persist:

``` text
provider
providerVersion if known
detectionEvidence
capabilities
```

------------------------------------------------------------------------

# 18. UNIVERSAL MODULE APK BOOTSTRAP

The module ZIP bundles:

``` text
payload/Causentry.apk
```

Installation behavior:

1.  Validate bundled APK exists.
2.  Validate expected checksum metadata.
3.  Detect root provider.
4.  Install module files.
5.  If Android boot mode and Package Manager is ready, APK installation
    MAY be attempted.
6.  Otherwise create `apk-install.pending`.
7.  At boot, `service.sh` waits for:
    -   boot completion,
    -   Package Manager availability.
8.  Determine currently installed Causentry version/signature.
9.  Never silently downgrade.
10. Never replace an APK with mismatching signing identity.
11. Install/update matching APK.
12. Verify:

-   package name,
-   versionCode,
-   installation success.

13. Remove pending marker only after verification.
14. Start/verify daemon.
15. Record readable status.

APK installation failure must NOT destroy the module/daemon
installation.

Provide manual fallback.

------------------------------------------------------------------------

# 19. DAEMON RUNTIME LOCATION

Prefer Causentry-owned runtime/state paths.

Conceptually:

``` text
/data/adb/causentry/
├── bin/
├── config/
├── state/
├── sessions/
├── logs/
└── runtime/
```

Exact path choice must be verified against supported provider behavior.

Avoid unnecessary writes into root manager internal directories.

Use restrictive permissions.

------------------------------------------------------------------------

# 20. IPC SECURITY

The APK must never send arbitrary shell commands.

Define explicit RPCs.

Initial/future RPC set:

``` text
Ping
GetDaemonInfo
GetCapabilities
GetRootProvider
ListTargetsSupportInfo
StartSession
StopSession
GetSessionStatus
SubscribeEvents
GetEnvironmentSnapshot
GetSession
ListSessions
DeleteSession
CreateExperiment
RecordExperimentRun
AnalyzeExperiment
ExportSession
```

Requirements:

``` text
protocol version
request ID
response ID
timeouts
bounded message size
schema validation
caller authentication/authorization
socket permissions
connection cleanup
structured errors
```

Protect against:

``` text
malformed protobuf
oversized payload
path traversal
arbitrary file reads
arbitrary commands
integer overflow
memory exhaustion
unbounded queues
```

------------------------------------------------------------------------

# 21. DOMAIN MODEL

Minimum domain objects:

``` text
DiagnosticSession
TargetApplication
ProcessIdentity
DiagnosticEvent
CrashEvent
NativeCrashEvent
MemoryEvent
SelinuxEvent
EnvironmentSnapshot
RootProviderSnapshot
RootModuleSnapshot
ExitReason
Evidence
EvidenceLevel
Fact
Inference
Unknown
Diagnosis
DiagnosisCandidate
ConfidenceScore
Correlation
Experiment
ExperimentRun
ExperimentCondition
CollectorCapability
CollectorStatus
```

------------------------------------------------------------------------

# 22. SESSION STATE MACHINE

States:

``` text
CREATED
PREPARING
MONITORING
WAITING_FOR_TARGET
TARGET_RUNNING
TARGET_EXITED
COLLECTING_POST_EXIT
ANALYZING
COMPLETED
FAILED
CANCELLED
```

State transitions must be explicit and tested.

Do not encode lifecycle as loosely related booleans.

------------------------------------------------------------------------

# 23. NORMALIZED DIAGNOSTIC EVENT

Every event:

``` text
eventId
sessionId
monotonicTimestamp
wallClockTimestamp
source
category
severity
pid
uid
tid
packageName
message
rawReference
metadata
```

Sources:

``` text
LOGCAT
PROCESS
APPLICATION_EXIT
PROCFS
MEMORY
NATIVE
TOMBSTONE
SELINUX
ENVIRONMENT
ROOT_PROVIDER
ROOT_MODULE
SYSTEM
CAUSENTRY
```

Use monotonic time for correlation when available.

------------------------------------------------------------------------

# 24. TELEMETRY COLLECTORS

Collectors must fail independently.

One unavailable collector must not crash the session.

Each collector reports:

``` text
AVAILABLE
RUNNING
DEGRADED
UNAVAILABLE
FAILED
```

with reason.

------------------------------------------------------------------------

# 25. LOGCAT COLLECTOR

Collect relevant buffers where available:

``` text
main
system
crash
events when justified
```

Requirements:

-   bounded memory,
-   buffered disk persistence,
-   pre-target window,
-   post-exit window,
-   target PID/UID filtering,
-   fallback package correlation,
-   timestamp normalization,
-   raw preservation,
-   structured parsing,
-   dropped-event counter.

Initial signatures:

``` text
FATAL EXCEPTION
AndroidRuntime
OutOfMemoryError
SecurityException
IllegalStateException
ArrayIndexOutOfBoundsException
UnsatisfiedLinkError
dlopen failed
linker
SIGABRT
SIGSEGV
SIGBUS
SIGILL
SIGSYS
ANR
avc: denied
Process.killProcess
System.exit
```

Do not assume absence of a Logcat message means absence of a condition.

------------------------------------------------------------------------

# 26. PROCESS LIFECYCLE COLLECTOR

Observe where feasible:

``` text
UID resolution
PID discovery
process creation
process disappearance
PID replacement
runtime duration
multiple target processes
child process metadata
foreground/background context when available
```

Avoid aggressive high-frequency polling.

Prefer efficient platform mechanisms where reliable.

------------------------------------------------------------------------

# 27. APPLICATION EXIT INFORMATION

Use supported Android APIs where available.

Model:

``` text
reason
status
importance
timestamp
description
trace availability
```

Treat API availability and permissions honestly.

Do not fabricate cross-package exit data when Android does not expose
it.

------------------------------------------------------------------------

# 28. JAVA CRASH ANALYZER

Recognize:

``` text
RuntimeException
OutOfMemoryError
SecurityException
IllegalStateException
ArrayIndexOutOfBoundsException
NullPointerException
UnsatisfiedLinkError
ClassNotFoundException
NoClassDefFoundError
```

Extract:

``` text
exception
message
thread
stack
probable application frame
obfuscation indication
time relative to startup
```

Obfuscated stack names alone are not proof of security logic.

------------------------------------------------------------------------

# 29. MEMORY ANALYZER

Distinguish:

``` text
Java heap exhaustion
native allocation pressure
system memory pressure
OOM killer evidence
large allocation request
application heap limit
```

Never equate:

``` text
"device has free RAM"
```

with:

``` text
"application can allocate an arbitrarily large Java heap block"
```

When allocation size is present, parse and explain it.

------------------------------------------------------------------------

# 30. NATIVE CRASH ANALYZER

Recognize:

``` text
SIGABRT
SIGSEGV
SIGBUS
SIGILL
SIGSYS
```

Extract when available:

``` text
signal
code
fault address
pid
tid
thread
library
backtrace
build ID
abort message
```

Tombstone access is optional capability.

Gracefully degrade if unavailable.

------------------------------------------------------------------------

# 31. SELINUX ANALYZER

Parse:

``` text
avc: denied
scontext
tcontext
tclass
permission
path
process
```

Correlate temporally.

Never automatically claim causality.

Never make SELinux permissive as a diagnostic solution.

------------------------------------------------------------------------

# 32. ENVIRONMENT INSPECTOR

Capture only reliably observable state.

Examples:

``` text
Android version
SDK
manufacturer
model
build fingerprint
SELinux state
root provider
root provider version
root module inventory
developer settings where accessible
ADB state where accessible
boot state where reliable
location/mock-related state where reliable
```

Every field:

``` text
OBSERVED
UNAVAILABLE
UNKNOWN
```

Presence != cause.

------------------------------------------------------------------------

# 33. ROOT MODULE INVENTORY

Where supported, enumerate installed root modules.

Store:

``` text
module ID
display name
version
enabled/disabled state when reliable
provider
```

Do not inspect or expose unnecessary private module contents.

Inventory exists for correlation and experiment planning.

------------------------------------------------------------------------

# 34. RULE ENGINE

Use data-driven rules.

Initial format: YAML.

Rules are DATA ONLY.

No shell execution.

Example:

``` yaml
id: JAVA_OOM
schema_version: 1
match:
  any:
    - log_contains: "java.lang.OutOfMemoryError"
classification:
  category: OUT_OF_MEMORY
  evidence_level: DIRECT
  base_confidence: 0.98
  title: "Application memory allocation failed"
```

Support eventually:

``` text
exact match
substring
safe regex
event category
exception class
signal
metadata predicate
time window
event sequence
required evidence
conflicting evidence
```

Protect against regex DoS.

Version the rule schema.

------------------------------------------------------------------------

# 35. CORRELATION ENGINE

Core input:

``` text
normalized events
environment
root provider state
module inventory
exit reason
previous runs
experiment data
```

Correlate by:

``` text
monotonic time
PID
UID
package
thread
event sequence
exception
signal
library
environment condition
```

Example:

``` text
target starts
↓ 180 ms
security-related library metadata appears
↓ 400 ms
worker thread exception
↓ 4 ms
process disappears
```

Allowed:

``` text
Possible startup security/environment-related termination.
```

Not automatically allowed:

``` text
Library X detected Zygisk.
```

------------------------------------------------------------------------

# 36. DIFFERENTIAL DIAGNOSIS

This is a flagship feature.

The framework records repeated runs under controlled conditions.

Example:

``` text
Condition:
"Zygisk-related environment"

Present:
Run 1 FAIL
Run 2 FAIL
Run 3 FAIL
Run 4 FAIL

Absent:
Run 1 PASS
Run 2 PASS
Run 3 PASS
Run 4 PASS
```

Result:

``` text
Strong correlation with startup failure.
Evidence: CORRELATED
Confidence: Very High
```

The exact statistical method must be documented.

Avoid pretending small sample sizes prove causation.

------------------------------------------------------------------------

# 37. EXPERIMENT DESIGN

Experiment:

``` text
id
targetPackage
controlledCondition
baselineDescription
variantDescription
runs[]
createdAt
analysis
```

Run:

``` text
environmentSnapshot
moduleSnapshot
result
exitReason
primaryDiagnosis
duration
```

Initial implementation should let the USER manually change the
environment between runs.

Do not automatically manipulate root/security conditions in early
versions.

------------------------------------------------------------------------

# 38. MODULE CONFLICT FINDER

Use experiment data to narrow likely module conflicts.

Concept:

``` text
12 modules
↓
recommend test split
↓
user changes state
↓
record run
↓
narrow candidate group
↓
repeat
```

Eventually use binary-search-like recommendations.

Result example:

``` text
Potential conflicting module:
Module X

With condition:
0/5 successful

Without condition:
5/5 successful

Evidence:
CORRELATED

Confidence:
Very High
```

Never call a module malicious solely from correlation.

------------------------------------------------------------------------

# 39. MOCK-LOCATION / ENVIRONMENT CASES

For cases such as location-dependent apps:

Do not conclude:

``` text
Mock-location app installed = cause
```

Instead evaluate:

``` text
condition state
location initialization timing
target outcome
repeated experiments
competing explanations
```

Result:

``` text
Failure strongly correlates with mock-location environment.
```

unless direct evidence exists.

------------------------------------------------------------------------

# 40. SECURITY/ENVIRONMENT-RELATED TERMINATION CATEGORY

Provide a conservative category:

``` text
POSSIBLE_SECURITY_ENVIRONMENT
```

Use when:

-   target fails during startup,
-   failure is unusual/obfuscated/self-initiated,
-   common crash explanations are weak,
-   timing/environment evidence supports it.

This category MUST NOT itself imply:

``` text
root detected
Zygisk detected
bootloader detected
hook detected
```

Those require separate evidence/correlation.

------------------------------------------------------------------------

# 41. DIAGNOSTIC CATEGORIES

Initial:

``` text
JAVA_CRASH
NATIVE_CRASH
OUT_OF_MEMORY
ANR
SELINUX_DENIAL
MISSING_LIBRARY
LINKER_FAILURE
PERMISSION_FAILURE
PROCESS_KILLED
SELF_TERMINATION
SYSTEM_KILL
STARTUP_FAILURE
CAMERA_RELATED
LOCATION_RELATED
NETWORK_RELATED
WEBVIEW_RELATED
STORAGE_RELATED
POSSIBLE_SECURITY_ENVIRONMENT
MODULE_CONFLICT
ENVIRONMENT_CORRELATION
COMPATIBILITY_ISSUE
UNKNOWN
```

Prefer UNKNOWN over unsupported certainty.

------------------------------------------------------------------------

# 42. HUMAN-READABLE EXPLANATION ENGINE

Deterministic explanation comes before AI.

Pipeline:

``` text
Raw evidence
↓
Parser
↓
Normalized events
↓
Rules
↓
Temporal correlation
↓
Experiment evidence
↓
Candidate ranking
↓
Confidence
↓
Human-readable explanation
```

Example:

``` text
Primary cause
Memory allocation failure

Confidence
99% — VERY HIGH

Evidence
DIRECT

What happened?
The application attempted to allocate a memory block larger than the
available application heap.

Likely area
Camera/resolution handling

Root-related evidence
None found.
```

AI may later rewrite explanations for readability, but must never
override deterministic evidence.

------------------------------------------------------------------------

# 43. UI INFORMATION ARCHITECTURE

Primary screens:

``` text
Home
App Selector
Diagnostic Session
Diagnosis Result
Evidence
Timeline
Environment
Experiments
History
Settings
About/Capabilities
```

------------------------------------------------------------------------

# 44. HOME SCREEN

Example:

``` text
Causentry
Android Application Diagnostics

Diagnostic mode
FULL

Root provider
KernelSU Next

Daemon
Connected

[ Select Application ]

[ START DIAGNOSIS ]

Recent Sessions
```

Show degraded capability clearly but calmly.

------------------------------------------------------------------------

# 45. APP SELECTOR

Display:

``` text
icon
label
package
version
user/system indication
```

Support:

``` text
search
recent targets
filter
```

Avoid requesting broad package visibility without proper justification.

Implement Android package visibility correctly.

------------------------------------------------------------------------

# 46. LIVE SESSION SCREEN

Show high-level state:

``` text
Preparing
Waiting for target
Target running
Collecting evidence
Target exited
Analyzing
```

Show:

``` text
elapsed time
PID
event count
collector status
stop/cancel
```

Do not flood normal users with raw logs.

------------------------------------------------------------------------

# 47. RESULT SCREEN

Priority:

``` text
Status
Primary diagnosis
Evidence level
Confidence
Plain explanation
Candidate causes
Facts
Inferences
Unknowns
Recommended next diagnostic action
Advanced details
```

Example:

``` text
myBCA

FAILED DURING STARTUP

Primary diagnosis
Possible security/environment-related termination

Evidence
CORRELATED

Confidence
92% — VERY HIGH

Most strongly correlated condition
Zygisk-related environment

Direct internal detection evidence
Not available
```

------------------------------------------------------------------------

# 48. ADVANCED VIEW

Tabs:

``` text
Timeline
Evidence
Raw Logs
Process
Memory
Native
SELinux
Environment
Root
Experiments
```

Use lazy lists/paging for large data.

------------------------------------------------------------------------

# 49. CAPABILITY SCREEN

Example:

``` text
Root provider          KernelSU family
Privileged daemon      Available
Extended Logcat        Available
Process metadata       Available
SELinux audit          Available
Module inventory       Available
Tombstone metadata     Partial
Deep/Lab mode          Unavailable
```

Never present unavailable capability as a generic failure.

------------------------------------------------------------------------

# 50. STORAGE MODEL

Room should store summaries and normalized evidence.

Large raw logs should use bounded file storage, not giant Room blobs.

Suggested split:

``` text
Room:
session metadata
target metadata
diagnoses
candidates
evidence index
environment summary
experiment metadata

Files:
raw logs
large traces
export staging
```

Implement retention policy.

------------------------------------------------------------------------

# 51. PRIVACY & REDACTION

Causentry may observe sensitive logs.

Before export, redact:

``` text
Authorization headers
Bearer tokens
cookies
session IDs
password-like fields
PIN-like fields
private keys
access tokens
refresh tokens
known credential patterns
```

Do not upload anything automatically.

Core operation is offline-first.

Reports must state when redaction was applied.

------------------------------------------------------------------------

# 52. REPORTS

Support JSON first.

Later HTML.

JSON:

``` json
{
  "schemaVersion": 1,
  "appScopeVersion": "",
  "session": {},
  "target": {},
  "device": {},
  "rootProvider": {},
  "capabilities": [],
  "primaryDiagnosis": {},
  "candidates": [],
  "timeline": [],
  "evidence": [],
  "environment": {},
  "experiments": [],
  "limitations": []
}
```

Version report schema.

------------------------------------------------------------------------

# 53. PERFORMANCE REQUIREMENTS

Causentry must not become the reason a target fails.

Goals:

``` text
idle daemon CPU      approximately zero
monitoring CPU       low overhead
memory               bounded
queues               bounded
disk                  bounded/configurable
log rendering         virtualized/lazy
```

Use:

``` text
backpressure
bounded channels
batch writes
retention limits
drop accounting
```

If events are dropped, report the count.

------------------------------------------------------------------------

# 54. RELIABILITY

Handle:

``` text
daemon restart
APK restart
socket loss
target restart
multiple target PIDs
collector failure
logcat restart
database failure
device sleep
reboot
partial telemetry
unsupported Android API
provider capability missing
```

A partial session can still yield a diagnosis with lower confidence.

------------------------------------------------------------------------

# 55. SECURITY MODEL

Root components are security-sensitive.

Principles:

``` text
least privilege
explicit RPC
no arbitrary shell from APK
restricted socket
restricted files
bounded input
validated protocol
minimal SELinux policy
no permissive mode
no world-writable control files
```

Threat model must include:

``` text
malicious local app trying to command daemon
malformed IPC
malicious log content
path traversal
resource exhaustion
tampered rules
tampered APK payload
tampered module files
```

------------------------------------------------------------------------

# 56. TARGET APP SAFETY BOUNDARY

Core Causentry must NOT:

``` text
patch target APK
alter target code
intercept credentials
alter banking transactions
fake security API results
hide root from target
hide Zygisk from target
disable target anti-tamper
bypass integrity checks
stealth-inject into non-debuggable third-party apps
```

Observation and controlled environmental diagnosis are the core purpose.

------------------------------------------------------------------------

# 57. KOTLIN ENGINEERING STANDARDS

Use:

``` text
idiomatic Kotlin
immutable UI/domain state
StateFlow
sealed UI states
small composables
repository/use-case boundaries where valuable
structured concurrency
```

Never:

``` text
GlobalScope
blocking I/O on main
business logic in composables
catch Exception and ignore
hard-coded dispatcher everywhere
```

Prefer constructor injection.

------------------------------------------------------------------------

# 58. RUST ENGINEERING STANDARDS

Use:

``` text
small cohesive modules
typed errors
Result
bounded allocation
explicit timeouts
structured tracing
clean shutdown
```

Avoid runtime:

``` text
unwrap()
expect()
panic!
```

unless invariant is documented and truly unrecoverable.

Use cancellation-aware tasks.

------------------------------------------------------------------------

# 59. SHELL ENGINEERING STANDARDS

Shell scripts must:

``` text
quote variables
validate paths
avoid eval
avoid untrusted command construction
be idempotent
log failures
return meaningful exit codes
```

Do not put analysis logic in shell.

------------------------------------------------------------------------

# 60. REPOSITORY STRUCTURE

Target:

``` text
causentry/
├── CODEX.md
├── README.md
├── LICENSE
├── .gitignore
├── docs/
│   ├── architecture.md
│   ├── security-model.md
│   ├── protocol.md
│   ├── diagnostics.md
│   ├── confidence-model.md
│   ├── root-providers.md
│   └── adr/
│
├── android/
│   ├── settings.gradle.kts
│   ├── build.gradle.kts
│   ├── gradle.properties
│   ├── gradle/
│   │   └── libs.versions.toml
│   └── app/
│
├── daemon/
│   ├── Cargo.toml
│   ├── src/
│   │   ├── main.rs
│   │   ├── ipc/
│   │   ├── collector/
│   │   ├── analyzer/
│   │   ├── correlation/
│   │   ├── evidence/
│   │   ├── confidence/
│   │   ├── experiment/
│   │   ├── provider/
│   │   ├── rules/
│   │   ├── storage/
│   │   └── platform/
│   └── tests/
│
├── root-module/
│   ├── module.prop
│   ├── customize.sh
│   ├── service.sh
│   ├── uninstall.sh
│   ├── sepolicy.rule
│   ├── payload/
│   │   └── Causentry.apk
│   ├── common/
│   └── bin/
│       └── causentryd
│
├── proto/
│   └── causentry.proto
│
├── rules/
│   ├── java.yaml
│   ├── memory.yaml
│   ├── native.yaml
│   ├── selinux.yaml
│   ├── startup.yaml
│   ├── environment.yaml
│   └── compatibility.yaml
│
├── testdata/
│   ├── java/
│   ├── native/
│   ├── memory/
│   ├── selinux/
│   └── startup/
│
├── scripts/
│   ├── build-android.sh
│   ├── build-daemon.sh
│   ├── package-universal-module.sh
│   ├── verify.sh
│   └── checksums.sh
│
└── .github/
    └── workflows/
```

------------------------------------------------------------------------

# 61. TEST STRATEGY

Unit tests:

``` text
event parser
Java parser
memory parser
native parser
SELinux parser
rule parser
rule validation
correlation
candidate ranking
confidence scoring
redaction
protocol validation
provider detection
experiment analysis
```

Integration tests:

``` text
normal exit
Java crash
OOM
SIGABRT
SIGSEGV
SELinux denial
linker failure
startup RuntimeException
unknown exit
partial telemetry
```

Golden fixtures must be sanitized.

Never store real credentials from real apps.

------------------------------------------------------------------------

# 62. DIAGNOSTIC FIXTURE APP

Create a separate internal test app later.

Capabilities:

``` text
Normal Exit
Crash Java
Throw RuntimeException
Allocate Memory
Native SIGABRT
Native SIGSEGV
Freeze Main Thread
Load Missing Library
Exit Process
```

This fixture exists to validate Causentry safely and reproducibly.

Do not rely on banking applications for automated tests.

------------------------------------------------------------------------

# 63. CI QUALITY GATES

Eventually:

``` text
Android assemble
Android unit tests
Android lint
Kotlin static analysis
cargo fmt --check
cargo clippy -- -D warnings
cargo test
protobuf generation verification
rule schema validation
shellcheck where available
packaging validation
checksum verification
```

Do not hide failures.

------------------------------------------------------------------------

# 64. DOCUMENTATION

Maintain:

``` text
README.md
docs/architecture.md
docs/security-model.md
docs/protocol.md
docs/diagnostics.md
docs/confidence-model.md
docs/root-providers.md
```

Use ADRs for major architecture decisions.

Examples:

``` text
ADR-001 Rust daemon
ADR-002 Unix Domain Socket IPC
ADR-003 Universal root module
ADR-004 Evidence hierarchy
ADR-005 No mandatory Zygisk dependency
```

------------------------------------------------------------------------

# 65. DEFINITION OF DONE

A step/feature is complete only when:

``` text
implementation exists
build succeeds
tests pass
lint/static checks pass where configured
error paths handled
documentation updated
acceptance criteria met
```

"Code written" is not "done".

------------------------------------------------------------------------

# BOOT-SAFE PRODUCTION BASELINE --- MANDATORY

This section overrides any conflicting implementation detail elsewhere
in this specification.

Causentry is a privileged userspace diagnostic product. Stability of the
Android boot path is more important than collector completeness.

## Boot-critical design rules

1.  `post-fs-data.sh` MUST NOT exist in the default module unless a
    later, documented engineering review proves it is strictly
    necessary.
2.  Causentry MUST NOT use `post-fs-data` for APK installation, daemon
    startup, package scanning, log analysis, database migration, network
    access, or collector initialization.
3.  Prefer the provider's non-blocking `service.sh` lifecycle for
    lightweight bootstrap.
4.  When a provider offers a documented `boot-completed.sh` lifecycle,
    prefer it for operations that genuinely require Android framework
    readiness.
5.  `service.sh` MUST return promptly. It must never synchronously wait
    forever for Android, Package Manager, the daemon, a socket, a
    collector, or a child process.
6.  Long-running logic belongs in `causentryd`, not shell.
7.  Every wait MUST have a timeout.
8.  Every retry MUST be bounded.
9.  Every failure MUST degrade functionality instead of blocking boot.
10. No collector is allowed to be boot-critical.

## Forbidden boot-path operations

Do NOT:

``` text
modify boot.img
patch init
replace init
mount or modify /system for core functionality
write system.prop for core functionality
change Android security properties
make SELinux permissive
run resetprop/setprop tricks for core diagnostics
install KPM/kernel hooks
install Zygisk automatically
install LSPosed automatically
perform network requests during boot
run database migrations synchronously from boot scripts
run unlimited restart loops
```

If future functionality proposes any of these, create a dedicated ADR
and obtain explicit user approval before implementation.

## SELinux baseline

`sepolicy.rule` is NOT required by default.

Start with no custom SELinux policy. Probe actual capabilities on real
devices. If a required Causentry operation is denied:

1.  capture the exact AVC denial,
2.  prove that the denied operation is necessary,
3.  design the narrowest rule,
4.  document source/target/type/class/permission,
5.  test on the affected provider/device,
6.  verify no broad wildcard permission is introduced.

Never add broad SELinux rules merely to make a collector "work
everywhere".

## Capability probing

Root access does not imply universal telemetry access.

At daemon startup, probe each capability independently:

``` text
extended logcat
proc metadata
memory telemetry
SELinux audit visibility
root module inventory
native crash metadata
tombstone metadata
Package Manager bootstrap support
```

Each capability reports:

``` text
AVAILABLE
DEGRADED
UNAVAILABLE
UNKNOWN
```

A failed probe MUST NOT prevent the daemon from starting.

## ApplicationExitInfo policy

Treat Android `ApplicationExitInfo` as opportunistic evidence.

Do NOT design Causentry around an assumption that cross-package exit
information is universally available.

If access is unavailable, continue with other evidence.

## Tombstone policy

Tombstone access is optional.

Never assume root automatically grants usable tombstone access on every
Android/OEM/provider combination.

The native analyzer must work with:

``` text
full tombstone metadata
partial tombstone metadata
or no tombstone access
```

## Root provider support status

Never label a provider `FULL` merely because code exists.

Use:

``` text
TARGETED
HOST-TESTED
DEVICE-TESTED
VERIFIED
DEGRADED
UNSUPPORTED
```

A provider becomes `VERIFIED` only after the compatibility certification
suite passes on a real device/environment.

Initial project status:

``` text
Magisk          TARGETED
KernelSU        TARGETED
KernelSU Next   TARGETED
APatch          TARGETED
```

## Boot safety markers

Maintain Causentry-owned state under the chosen private
`/data/adb/causentry` state directory.

Conceptual markers:

``` text
install.pending
apk-install.pending
daemon-start.pending
boot-attempt
boot-success
last-failure
safe-mode
```

Do not depend on these markers to block Android boot.

They exist only for Causentry recovery/diagnostics.

## Bounded daemon recovery

Example policy:

``` text
daemon start fails
→ retry with backoff
→ bounded maximum attempts
→ mark DEGRADED
→ stop retrying for this boot
```

Never implement an infinite shell or daemon restart loop.

## Causentry Safe Mode

Implement an application/module-level safe mode.

When enabled:

``` text
no advanced collectors
no optional instrumentation
no custom SELinux rules
minimal daemon only
IPC health endpoint only
```

Safe mode must be activatable without requiring the Android UI whenever
practical.

Provider-native rescue mechanisms remain external recovery options, not
Causentry's primary safety strategy.

## First-install canary behavior

The first boot after installation/update must be conservative.

Recommended progression:

``` text
module installed
↓
minimal bootstrap
↓
Android reaches boot completed
↓
Package Manager health verified
↓
APK bootstrap verified
↓
daemon health verified
↓
core passive capabilities probed
↓
mark Causentry healthy
```

Advanced collectors must not be required to declare the module
boot-safe.

## No automatic third-party dependencies

Causentry MUST NOT automatically install Zygisk, Zygisk Next, LSPosed,
Shamiko, SUSFS, Tricky Store, KPMs, metamodules, or other root modules.

If an optional future diagnostic capability benefits from one of them:

``` text
detect capability
explain benefit
explain diagnostic contamination risk
require explicit user action
keep core mode functional without it
```

## Compatibility certification

For EACH root provider, release verification must include where
technically applicable:

``` text
module install
first reboot
second reboot
provider detection
APK auto-install/update
daemon startup
IPC
core collector probes
daemon forced crash
missing APK payload handling
invalid config handling
disable module + reboot
enable module + reboot
uninstall + reboot
reinstall
upgrade
downgrade prevention
signature mismatch protection
safe-mode behavior
```

Results must be recorded as evidence.

No untested provider may be advertised as verified.

## Boot-critical code budget

`customize.sh`: - installation only, - validation, - provider
detection, - file permissions, - no persistent long-running work.

`service.sh`: - tiny non-blocking bootstrap, - bounded handoff, - no
analysis, - no scans, - no network, - no long synchronous waits.

`boot-completed.sh` when supported/appropriate: - framework-dependent
bootstrap only, - bounded, - failure-tolerant.

`causentryd`: - owns long-running privileged diagnostics, - starts
collectors after health/capability checks, - all collectors
independently degradable.

## Module format portability

Use the common Magisk/KernelSU/APatch module subset wherever possible.

Do not rely on provider-internal BusyBox filesystem paths. Module
scripts execute in the provider-supported shell environment; use
portable shell primitives and documented environment variables.

Use:

``` text
MODDIR=${0%/*}
```

rather than hardcoding the module installation path.

Provider-specific behavior must live behind provider adapters.

## Development environment preflight

Before STEP 1, execute STEP 0.

### STEP 0 --- Development Environment Preflight

Do not modify project source.

Inspect:

``` text
Git
JDK
Android Studio/SDK
Android platform
Build Tools
Platform Tools / ADB
Android NDK
CMake if needed
Gradle/JBR environment
Rust
rustup
cargo
aarch64-linux-android Rust target
protobuf tooling/build integration
shell tooling
connected Android devices
```

For every item report:

``` text
version
resolved path
READY / MISSING / MISCONFIGURED / OPTIONAL
required action
```

System-wide installations or configuration changes require user
approval.

STOP after the preflight report.

STEP 1 may begin only after the environment is sufficiently ready or the
user explicitly accepts documented limitations.

# 66. EXECUTION ROADMAP

The following order is mandatory unless the user explicitly changes it.

Do NOT jump ahead.

------------------------------------------------------------------------

# STEP 1 --- Repository & Toolchain Foundation

Goal:

Create the professional monorepo foundation.

Implement:

-   repository structure,
-   Android Kotlin/Compose app,
-   Material 3,
-   Hilt,
-   Room,
-   DataStore,
-   Gradle Version Catalog,
-   Rust daemon crate,
-   universal root-module skeleton,
-   protobuf directory,
-   rules directory,
-   testdata,
-   scripts,
-   initial docs.

Android app initially displays:

``` text
Causentry
Android Application Diagnostics
```

Daemon:

``` text
causentryd --version
```

Create:

``` text
module.prop
```

Do NOT implement collectors.

Acceptance:

``` text
Android builds
Rust builds
cargo test passes
basic Android unit test passes
repo is clean
```

STOP.

------------------------------------------------------------------------

# STEP 2 --- Architecture & ADR Baseline

Create detailed:

``` text
docs/architecture.md
docs/security-model.md
docs/root-providers.md
docs/adr/ADR-001-rust-daemon.md
docs/adr/ADR-002-ipc.md
docs/adr/ADR-003-universal-root-module.md
docs/adr/ADR-004-evidence-model.md
```

Define boundaries before implementation grows.

No collector implementation.

Validate docs against CODEX.md.

STOP.

------------------------------------------------------------------------

# STEP 3 --- Shared Protocol

Define:

``` text
proto/causentry.proto
```

Messages:

``` text
DaemonInfo
Capabilities
RootProviderInfo
TargetApplication
DiagnosticSession
DiagnosticEvent
Evidence
Diagnosis
DiagnosisCandidate
EnvironmentSnapshot
StartSessionRequest
StartSessionResponse
StopSessionRequest
SessionStatus
ErrorResponse
```

Generate Kotlin/Rust bindings.

Do not expose protobuf objects directly as domain models.

Tests:

``` text
round trip
unknown enum
invalid data
message size helper
protocol version
```

STOP.

------------------------------------------------------------------------

# STEP 4 --- Root Provider Abstraction

Implement provider model before module lifecycle.

Providers:

``` text
Magisk
KernelSU family
KernelSU Next when reliably distinguishable
APatch
NoRoot
Unknown
```

Implement capability matrix.

Provider-specific paths/behavior isolated.

Host-test detection logic with fixtures/environment abstraction.

Do NOT add collectors.

STOP.

------------------------------------------------------------------------

# STEP 5 --- Universal Module Installer

Build one ZIP layout compatible with target managers.

Implement:

``` text
module.prop
customize.sh
service.sh skeleton
uninstall.sh
payload location
daemon location
state/runtime dirs
provider detection
install logging
```

No mandatory module dependencies.

No `/system` modification.

No SELinux permissive.

Validate ZIP structure automatically.

STOP.

------------------------------------------------------------------------

# STEP 6 --- APK Bundling & Auto-Install

Build APK and bundle into module.

Implement:

``` text
APK checksum
pending install marker
Package Manager readiness
install/update
signature/version checks
no downgrade
verification
manual fallback state
```

Test logic through abstractions/fixtures where device execution is
unavailable.

STOP.

------------------------------------------------------------------------

# STEP 7 --- Daemon Lifecycle

Implement module-managed daemon startup.

Requirements:

``` text
single instance
PID/state handling
stale socket recovery
bounded restart
clean shutdown
health status
version
logs
```

Reboot behavior documented.

STOP.

------------------------------------------------------------------------

# STEP 8 --- Secure IPC

Implement Unix Domain Socket.

RPC:

``` text
Ping
GetDaemonInfo
GetCapabilities
GetRootProvider
```

Implement:

``` text
protocol version
timeouts
bounded messages
caller restrictions
structured errors
reconnect
```

Android UI displays:

``` text
Connected
Unavailable
Protocol mismatch
Limited mode
```

STOP.

------------------------------------------------------------------------

# STEP 9 --- App Selector

Implement professional app selector.

Support:

``` text
search
icon
label
package
version
recent target
```

Respect Android package visibility.

Persist recent targets.

STOP.

------------------------------------------------------------------------

# STEP 10 --- Session State Machine

Implement domain/session orchestration.

Use synthetic events.

Persist session summary.

Implement cancellation.

No Logcat yet.

STOP.

------------------------------------------------------------------------

# STEP 11 --- Process Lifecycle Collector

Implement efficient process observation.

Normalize events.

Support PID changes/multiple processes.

UI shows high-level process state.

STOP.

------------------------------------------------------------------------

# STEP 12 --- Logcat Collector

Implement bounded Logcat collection.

Add raw-log advanced UI.

Support search/filter.

Do not diagnose yet beyond event parsing.

STOP.

------------------------------------------------------------------------

# STEP 13 --- Application Exit Collector

Implement supported ApplicationExitInfo integration where feasible.

Expose unavailable states honestly.

Correlate historical exit information carefully.

STOP.

------------------------------------------------------------------------

# STEP 14 --- Java Crash Analyzer

Implement Java exception parsing.

Generate direct evidence.

Test golden fixtures.

STOP.

------------------------------------------------------------------------

# STEP 15 --- Memory Analyzer

Implement:

``` text
Java heap evidence
allocation size
heap limit
RSS/PSS where available
system pressure
OOM killer evidence
```

Produce human-readable memory diagnosis.

STOP.

------------------------------------------------------------------------

# STEP 16 --- Native Crash Analyzer

Implement signal parsing.

Add tombstone metadata capability where accessible.

Support degraded mode.

STOP.

------------------------------------------------------------------------

# STEP 17 --- SELinux Analyzer

Implement AVC parsing and temporal relevance.

Never imply causality solely from proximity.

STOP.

------------------------------------------------------------------------

# STEP 18 --- Environment Inspector

Implement environment/root/module snapshots.

Every field supports observed/unavailable/unknown.

Create capability UI.

STOP.

------------------------------------------------------------------------

# STEP 19 --- Rule Engine

Implement safe YAML schema/parser.

Rules are data-only.

Add initial Java/memory/native/SELinux/startup rules.

Validate rules in tests/CI.

STOP.

------------------------------------------------------------------------

# STEP 20 --- Correlation Engine

Combine normalized evidence.

Implement deterministic event sequence correlation.

Generate diagnosis candidates.

Do not add differential experiments yet.

STOP.

------------------------------------------------------------------------

# STEP 21 --- Evidence Hierarchy

Implement:

``` text
DIRECT
CORRELATED
INFERRED
UNKNOWN
```

Add:

``` text
facts
inferences
unknowns
```

Require all diagnoses to declare evidence level.

STOP.

------------------------------------------------------------------------

# STEP 22 --- Confidence & Candidate Ranking

Implement transparent scoring.

Candidate scores explain their contributors/deductions.

Unit-test deterministic scoring.

Document:

``` text
docs/confidence-model.md
```

STOP.

------------------------------------------------------------------------

# STEP 23 --- Human-Readable Result UI

Build final diagnosis presentation.

Normal user view first.

Advanced evidence view second.

Include:

``` text
primary cause
evidence level
confidence
facts
inferences
unknowns
candidate ranking
recommended next diagnostic action
```

STOP.

------------------------------------------------------------------------

# STEP 24 --- Session History

Persist session metadata/results.

Support:

``` text
recent
filter by app
view
delete
compare
```

Raw data retention configurable.

STOP.

------------------------------------------------------------------------

# STEP 25 --- Differential Diagnosis Data Model

Implement experiment/run storage.

No automatic environment manipulation.

Allow manual labels such as:

``` text
Zygisk-related environment ON
Zygisk-related environment OFF
Mock-location environment ON
Module X enabled
```

STOP.

------------------------------------------------------------------------

# STEP 26 --- Differential Correlation Engine

Analyze repeated runs.

Implement statistically honest correlation/confidence.

Account for sample size.

Never convert correlation into direct proof.

STOP.

------------------------------------------------------------------------

# STEP 27 --- Experiment Wizard

Implement UX:

``` text
choose app
define condition
record baseline
run target
change environment manually
record variant
repeat
analyze
```

Show experiment integrity warnings.

STOP.

------------------------------------------------------------------------

# STEP 28 --- Module Conflict Finder

Using manually recorded module-state experiments:

-   recommend next split,
-   narrow candidate modules,
-   calculate correlation,
-   maintain rollback checklist.

Do not automatically disable modules yet.

STOP.

------------------------------------------------------------------------

# STEP 29 --- Report Export & Redaction

Implement:

``` text
JSON
human-readable report
redaction
schema version
Causentry version
rule version
```

Test sensitive-pattern removal.

STOP.

------------------------------------------------------------------------

# STEP 30 --- Diagnostic Fixture App

Create safe test APK/project.

Implement intentional scenarios:

``` text
Java crash
OOM
RuntimeException
native abort
native segfault
ANR
missing library
self exit
normal
```

Use it for E2E testing.

STOP.

------------------------------------------------------------------------

# STEP 31 --- Cross-Provider Compatibility Harness

Create tests/checklists for:

``` text
Magisk
KernelSU
KernelSU Next
APatch
```

Verify:

``` text
ZIP install
provider detection
APK bootstrap
daemon startup
IPC
reboot recovery
uninstall
```

If devices unavailable, mark physical verification pending rather than
claiming success.

STOP.

------------------------------------------------------------------------

# STEP 32 --- Reliability Hardening

Test:

``` text
daemon crash
socket loss
collector failure
target restart
device sleep
partial logs
storage errors
APK restart
```

No infinite restart loops.

STOP.

------------------------------------------------------------------------

# STEP 33 --- Performance Hardening

Measure:

``` text
CPU
RSS
event rate
queue depth
drops
disk usage
```

Optimize only based on evidence.

Document benchmark.

STOP.

------------------------------------------------------------------------

# STEP 34 --- Security Hardening

Audit:

``` text
IPC
socket permissions
provider scripts
Package Manager invocation
paths
protobuf
rules
exports
temporary files
SELinux
daemon privilege
```

Add adversarial tests.

STOP.

------------------------------------------------------------------------

# STEP 35 --- Optional Deep/Lab Capability Interface

Define extension architecture only.

Core must remain independent.

Support capability registration for authorized instrumentation.

Do not implement stealth third-party injection or bypass behavior.

UI must mark instrumented sessions.

STOP.

------------------------------------------------------------------------

# STEP 36 --- CI/CD

GitHub Actions:

``` text
Android build
Android tests
Android lint
Kotlin static analysis
Rust fmt
Rust clippy
Rust tests
rule validation
proto verification
shell validation
module packaging validation
```

STOP.

------------------------------------------------------------------------

# STEP 37 --- Reproducible Packaging

Produce:

``` text
Causentry-Module-vX.Y.Z.zip
Causentry-vX.Y.Z.apk
causentryd-arm64-v8a
SHA256SUMS
metadata.json
```

Ensure ZIP contains matching APK/daemon version.

STOP.

------------------------------------------------------------------------

# STEP 38 --- Full E2E Validation

Validate fixture scenarios through full architecture:

``` text
APK
↓
IPC
↓
daemon
↓
collectors
↓
analysis
↓
result UI
```

Verify degraded modes.

STOP.

------------------------------------------------------------------------

# STEP 39 --- Documentation & Release Candidate

Finalize:

``` text
README
architecture
security
root providers
installation
limitations
diagnostics
confidence
build guide
sample reports
```

Clearly state:

``` text
Causentry diagnoses observable behavior.
It cannot always reveal the exact internal decision logic of a third-party application.
Correlation is reported as correlation unless direct evidence exists.
```

STOP.

------------------------------------------------------------------------

# STEP 40 --- Senior v1.0 Review

Do NOT add features.

Review:

``` text
architecture
correctness
security
performance
reliability
UX
provider compatibility
test quality
documentation
technical debt
```

Create:

``` text
V1_RELEASE_REVIEW.md
```

Classify:

``` text
BLOCKER
HIGH
MEDIUM
LOW
FUTURE
```

Fix BLOCKER items before release readiness.

STOP.

------------------------------------------------------------------------

# 67. FUTURE FEATURES --- NOT MVP

Do not implement prematurely:

``` text
community signature repository
online rule updates
device/vendor knowledge base
automatic safe experiment orchestration
advanced symbolication
eBPF collectors where genuinely supported
desktop companion
AI explanation assistant
optional authorized instrumentation plugins
```

Core diagnosis remains deterministic.

------------------------------------------------------------------------

# 68. PROHIBITED SHORTCUTS

Never:

``` text
make SELinux permissive to "fix" access
require Zygisk because it is convenient
require LSPosed because it is convenient
run daemon commands directly from arbitrary APK strings
store unlimited logs
use regex without bounds/safety
claim support without testing
hardcode one root manager into domain logic
silently ignore provider differences
return 99% confidence without explainable evidence
label correlation as causation
```

------------------------------------------------------------------------

# 69. SENIOR ENGINEERING REVIEW CHECKLIST

Before completing each step ask:

``` text
Is the implementation simpler than necessary?
Is responsibility in the correct layer?
Can this component be unit-tested?
Does it degrade gracefully?
Did we add privilege unnecessarily?
Did we create a hidden dependency?
Can a malformed input crash the daemon?
Is memory bounded?
Is disk bounded?
Are logs sensitive?
Is the result evidence-based?
Are we confusing correlation and causation?
Did we update documentation?
```

------------------------------------------------------------------------

# 70. RESPONSE FORMAT AFTER EVERY STEP

After each step respond:

``` text
STEP X COMPLETE

Implemented
- ...

Architecture decisions
- ...

Files added/changed
- ...

Validation
- <command>
  PASS/FAIL: ...

- <command>
  PASS/FAIL: ...

Acceptance criteria
- [x] ...
- [x] ...

Known limitations
- ...

Pending physical-device verification
- ... (only when applicable)

Next step
STEP X+1 — <name>

Type `next` to continue.
```

Then STOP.

------------------------------------------------------------------------

# 71. BEHAVIOR WHEN USER TYPES `next`

When receiving:

``` text
next
```

Do NOT blindly assume the prior step succeeded.

First:

1.  inspect repository,
2.  confirm prior artifacts exist,
3.  run a minimal relevant validation,
4.  determine the next unfinished step,
5.  implement only that step.

If previous work is broken, repair it before proceeding and explain why.

------------------------------------------------------------------------

# 72. BEHAVIOR ON EXISTING REPOSITORY

If files already exist:

-   do not delete them blindly,
-   inspect architecture,
-   preserve useful work,
-   migrate carefully,
-   explain conflicts,
-   avoid destructive rewrites.

If repository state contradicts this specification, prefer this
specification unless the user explicitly overrides it.

------------------------------------------------------------------------

# 73. VERSIONING

Use semantic versioning for Causentry.

Protocol and rule schemas have independent integer/schema versions.

Never assume app version == protocol version == rule schema version.

The daemon and APK must negotiate protocol compatibility.

------------------------------------------------------------------------

# 74. ERROR DESIGN

Use typed errors.

User-facing errors should answer:

``` text
what failed?
does diagnosis continue?
what capability is unavailable?
what can the user do?
```

Example:

``` text
Tombstone access unavailable.

Causentry will continue using Logcat and native signal evidence.
Diagnosis may have lower confidence.
```

Prefer this over:

``` text
Error 13
```

------------------------------------------------------------------------

# 75. LOGGING DESIGN

Causentry internal logs are separate from target evidence.

Every internal log should identify:

``` text
component
severity
session if relevant
```

Never accidentally analyze Causentry's own logs as target evidence.

------------------------------------------------------------------------

# 76. TIME MODEL

Use both:

``` text
monotonic timestamp
wall-clock timestamp
```

Correlation uses monotonic time where possible.

Wall clock is for user display/export.

------------------------------------------------------------------------

# 77. RAW EVIDENCE IMMUTABILITY

Once raw evidence is stored for a completed session:

-   do not mutate it during analysis,
-   derived analyses may be recalculated,
-   rule engine versions must be recorded,
-   re-analysis should preserve provenance.

This enables future rule improvements without rewriting history.

------------------------------------------------------------------------

# 78. ANALYSIS PROVENANCE

Every diagnosis should eventually record:

``` text
Causentry version
daemon version
protocol version
rule set version
analysis engine version
evidence IDs
experiment IDs
```

A diagnosis must be reproducible from its inputs where feasible.

------------------------------------------------------------------------

# 79. UNKNOWN IS A VALID RESULT

A professional diagnostic tool must sometimes say:

``` text
Cause unknown.

Observed:
- process exited during startup
- no Java exception
- no native signal captured
- no relevant SELinux denial

Additional evidence is required.
```

Never invent a root cause just to provide an answer.

------------------------------------------------------------------------

# 80. FIRST COMMAND FOR CODEX

When beginning development from an empty repository:

``` text
Read CODEX.md completely.
Inspect the repository.
Execute only STEP 0 — Development Environment Preflight.
Do not modify project source during STEP 0.
Report readiness and missing requirements.
Stop when STEP 0 is complete.
Do not begin STEP 1 until I type `next`.
```

This instruction remains valid throughout the project.

------------------------------------------------------------------------

# 81. FINAL PRODUCT PRINCIPLE

Causentry's competitive advantage is NOT:

``` text
"show more logs"
```

It is:

``` text
OBSERVE
↓
NORMALIZE
↓
CORRELATE
↓
COMPARE
↓
RANK
↓
EXPLAIN
```

The final product should make a technically honest distinction between:

``` text
"The app crashed with OutOfMemoryError."
```

and:

``` text
"The app's startup failure is highly correlated with a Zygisk-related environment,
but Causentry did not directly observe the target application's internal detection check."
```

That distinction is central to the entire architecture.

------------------------------------------------------------------------

# END OF MASTER SPECIFICATION

# RESEARCH-VERIFIED ENGINEERING BASELINE

The implementation agent MUST treat root-manager and Android platform
behavior as externally versioned contracts.

Before implementing or changing boot lifecycle, module packaging,
SELinux behavior, root-provider detection, Android framework access, or
provider-specific functionality:

1.  consult the current official documentation for the affected
    platform,
2.  record the relevant assumption in an ADR or implementation note,
3.  avoid undocumented provider internals when a documented mechanism
    exists,
4.  do not copy behavior from another root provider merely because
    module formats look similar,
5.  require real-device verification for claims that cannot be proven in
    host tests.

The architecture intentionally follows these verified principles:

``` text
KernelSU:
- module format is closely related to Magisk but differences exist,
- KSU environment can identify KernelSU in module scripts,
- post-fs-data is blocking and should only be used when necessary,
- service.sh is non-blocking and recommended for most boot scripts,
- metamodule is only needed for system-file modification,
- built-in Zygisk is not a KernelSU core feature.

APatch:
- supports module lifecycle scripts including service.sh/boot-completed.sh,
- post-fs-data is blocking,
- service.sh is recommended for most boot scripts,
- provider-specific differences must still be respected.

Magisk:
- treat its official module/boot-script contract as authoritative for Magisk,
- do not infer Magisk behavior solely from KernelSU/APatch documentation.

Android/AOSP:
- SELinux changes require evidence-driven minimal policy,
- cross-application observability is subject to Android version, permissions,
  SELinux, OEM policy, and root-provider behavior,
- capability probing is mandatory.
```

Documentation can evolve. Re-verify assumptions when implementing
provider-specific code.

# FINAL SAFETY GATE

Causentry must never trade boot stability for one additional collector.

If an advanced collector requires risky boot-time modification, broad
SELinux relaxation, undocumented kernel/provider behavior, or mandatory
instrumentation, the correct default decision is:

``` text
mark capability unavailable/degraded
document the limitation
keep the device boot-safe
```

A successful Causentry release is one that diagnoses as much as safely
observable while remaining removable, recoverable, bounded, and honest
about uncertainty.
