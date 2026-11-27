package com.causentry.app.core.jni;

import java.lang.reflect.Constructor;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Thread-local error carrier used by native JNI entry points to report typed
 * Java exceptions without raising unwinds across the FFI boundary.
 */
public final class NativeBridgeError extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private static final ConcurrentHashMap<String, Optional<Constructor<? extends RuntimeException>>> CONSTRUCTORS =
        new ConcurrentHashMap<>();
    private static final ThreadLocal<String[]> SLOTS = ThreadLocal.withInitial(() -> new String[2]);

    public final String type;

    public NativeBridgeError(String type, String message) {
        super(message, null, false, false);
        this.type = type;
    }

    public static String[] slot() {
        return SLOTS.get();
    }

    public static void check(String[] slot) {
        if (slot[0] != null) {
            String type = slot[0];
            String message = slot[1];
            slot[0] = null;
            slot[1] = null;
            throw make(type, message);
        }
    }

    private static RuntimeException make(String type, String message) {
        Optional<Constructor<? extends RuntimeException>> ctor =
            CONSTRUCTORS.computeIfAbsent(type, NativeBridgeError::resolveConstructor);
        if (ctor.isPresent()) {
            try {
                return ctor.get().newInstance(message);
            } catch (ReflectiveOperationException | LinkageError | SecurityException e) {
                // Fall back to a plain RuntimeException below.
            }
        }
        return new RuntimeException(type + ": " + message);
    }

    private static Optional<Constructor<? extends RuntimeException>> resolveConstructor(String type) {
        for (String prefix : new String[] {"java.lang.", "java.util.", "java.io.", ""}) {
            try {
                Class<?> c = Class.forName(prefix + type);
                if (RuntimeException.class.isAssignableFrom(c)) {
                    @SuppressWarnings("unchecked")
                    Constructor<? extends RuntimeException> ctor =
                        (Constructor<? extends RuntimeException>) c.getConstructor(String.class);
                    return Optional.of(ctor);
                }
            } catch (ReflectiveOperationException | IllegalArgumentException e) {
                // Try next package prefix.
            }
        }
        return Optional.empty();
    }
}
