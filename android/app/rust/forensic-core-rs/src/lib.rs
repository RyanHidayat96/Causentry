//! JNI bindings for `com.causentry.app.core.jni.ForensicNative`.

pub mod port;

/// Splits `"Type: message"`; anything else maps to `RuntimeException`.
fn split_error(message: &str) -> (&str, &str) {
    message
        .split_once(": ")
        .filter(|(k, _)| {
            k.starts_with(|c: char| c.is_ascii_alphabetic())
                && k.chars()
                    .all(|c| c.is_ascii_alphanumeric() || matches!(c, '.' | '_' | '$'))
        })
        .unwrap_or(("RuntimeException", message))
}

/// Writes an error pair (exception class name and message) into the caller's `String[2]` slot.
fn report(env: &mut jni::JNIEnv, slot: &jni::objects::JObjectArray, message: &str) {
    let (kind, text) = split_error(message);
    if let (Ok(kind), Ok(text)) = (env.new_string(kind), env.new_string(text)) {
        let _ = env.set_object_array_element(slot, 0, &kind);
        let _ = env.set_object_array_element(slot, 1, &text);
    }
}

/// Executes a closure and converts any panic into an error string instead of unwinding across JNI.
fn run<T>(f: impl FnOnce() -> Result<T, String>) -> Result<T, String> {
    std::panic::catch_unwind(std::panic::AssertUnwindSafe(f)).unwrap_or_else(|panic| {
        let text = panic
            .downcast_ref::<&str>()
            .map(ToString::to_string)
            .or_else(|| panic.downcast_ref::<String>().cloned())
            .unwrap_or_default();
        Err(format!("RuntimeException: Rust panic: {text}"))
    })
}

/// Decodes a Java `String` from UTF-16 code units; throws `NullPointerException` when null.
fn string_arg(env: &mut jni::JNIEnv, s: &jni::objects::JString) -> Option<String> {
    if s.is_null() {
        let _ = env.throw_new("java/lang/NullPointerException", "null String argument");
        return None;
    }
    let raw = env.get_raw();
    let mut stack = [0u16; 128];
    // SAFETY: `raw` is this thread's JNIEnv and `s` is a valid non-null Java String reference.
    let len = unsafe { ((**raw).GetStringLength?)(raw, s.as_raw()) };
    let n = usize::try_from(len).unwrap_or(0);
    let mut heap = Vec::new();
    let units: &mut [u16] = if n <= stack.len() {
        &mut stack[..n]
    } else {
        heap.resize(n, 0);
        &mut heap
    };
    // SAFETY: `units` holds `len` UTF-16 code units from `s`.
    unsafe { ((**raw).GetStringRegion?)(raw, s.as_raw(), 0, len, units.as_mut_ptr()) };
    Some(String::from_utf16_lossy(units))
}

/// Constructs a Java `String` directly from UTF-16 code units.
fn java_string(env: &mut jni::JNIEnv, text: &str) -> jni::sys::jstring {
    let mut stack = [0u16; 128];
    let mut heap = Vec::new();
    let units: &[u16] = if text.len() <= stack.len() {
        let mut n = 0;
        for u in text.encode_utf16() {
            stack[n] = u;
            n += 1;
        }
        &stack[..n]
    } else {
        heap.extend(text.encode_utf16());
        &heap
    };
    let Ok(len) = jni::sys::jsize::try_from(units.len()) else {
        return std::ptr::null_mut();
    };
    let raw = env.get_raw();
    // SAFETY: `raw` is this thread's valid JNIEnv pointer.
    let Some(new_string) = (unsafe { (**raw).NewString }) else {
        return std::ptr::null_mut();
    };
    // SAFETY: `units` contains `len` valid UTF-16 code units for the duration of this call.
    unsafe { new_string(raw, units.as_ptr(), len) }
}

// SAFETY: Matches `com.causentry.app.core.jni.ForensicNative.n_parseLogcatLine`.
#[unsafe(no_mangle)]
pub extern "system" fn Java_com_causentry_app_core_jni_ForensicNative_n_1parseLogcatLine<'local>(
    mut env: jni::JNIEnv<'local>,
    _class: jni::objects::JClass<'local>,
    raw: jni::objects::JString<'local>,
    slot: jni::objects::JObjectArray<'local>,
) -> jni::sys::jstring {
    let Some(raw) = string_arg(&mut env, &raw) else {
        return std::ptr::null_mut();
    };
    match run(|| port::parse_logcat_line(raw)) {
        Ok(out) => java_string(&mut env, &out),
        Err(message) => {
            report(&mut env, &slot, &message);
            std::ptr::null_mut()
        }
    }
}

// SAFETY: Matches `com.causentry.app.core.jni.ForensicNative.n_classifyCrashTrace`.
#[unsafe(no_mangle)]
pub extern "system" fn Java_com_causentry_app_core_jni_ForensicNative_n_1classifyCrashTrace<
    'local,
>(
    mut env: jni::JNIEnv<'local>,
    _class: jni::objects::JClass<'local>,
    trace: jni::objects::JString<'local>,
    pkg: jni::objects::JString<'local>,
    crash_type: jni::objects::JString<'local>,
    slot: jni::objects::JObjectArray<'local>,
) -> jni::sys::jstring {
    let Some(trace) = string_arg(&mut env, &trace) else {
        return std::ptr::null_mut();
    };
    let Some(pkg) = string_arg(&mut env, &pkg) else {
        return std::ptr::null_mut();
    };
    let Some(crash_type) = string_arg(&mut env, &crash_type) else {
        return std::ptr::null_mut();
    };
    match run(|| port::classify_crash_trace(trace, pkg, crash_type)) {
        Ok(out) => java_string(&mut env, &out),
        Err(message) => {
            report(&mut env, &slot, &message);
            std::ptr::null_mut()
        }
    }
}

// SAFETY: Matches `com.causentry.app.core.jni.ForensicNative.n_formatUptimeSeconds`.
#[unsafe(no_mangle)]
pub extern "system" fn Java_com_causentry_app_core_jni_ForensicNative_n_1formatUptimeSeconds<
    'local,
>(
    mut env: jni::JNIEnv<'local>,
    _class: jni::objects::JClass<'local>,
    seconds: jni::sys::jlong,
    slot: jni::objects::JObjectArray<'local>,
) -> jni::sys::jstring {
    match run(|| port::format_uptime_seconds(seconds)) {
        Ok(out) => java_string(&mut env, &out),
        Err(message) => {
            report(&mut env, &slot, &message);
            std::ptr::null_mut()
        }
    }
}
