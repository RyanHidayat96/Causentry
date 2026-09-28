package com.causentry.zygote;

import android.os.Binder;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;

import com.v7878.unsafe.Reflection;
import com.v7878.unsafe.invoke.EmulatedStackFrame;
import com.v7878.unsafe.invoke.Transformers;
import com.v7878.vmtools.HookTransformer;
import com.v7878.vmtools.Hooks;

import java.lang.reflect.Executable;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/**
 * Returns developer mode OFF from SettingsProvider for selected caller UIDs.
 *
 * This is deliberately provider-side rather than target-app injection: the value
 * is intercepted before an app's Settings cache is populated, while hardened apps
 * never receive foreign code in their own process.
 */
final class SettingsProviderHooks {
    private static final String TAG = "CausentryZygote";
    private static final String PROVIDER = "com.android.providers.settings.SettingsProvider";
    private static final String DEVELOPMENT_SETTINGS_ENABLED = "development_settings_enabled";

    private SettingsProviderHooks() {}

    static int install() {
        try {
            CloakPolicy.refreshNow();
            Class<?> provider = findProviderClass();
            int installed = 0;
            Set<Executable> seen = new HashSet<>();
            for (Class<?> cursor = provider; cursor != null; cursor = cursor.getSuperclass()) {
                for (Executable executable : Reflection.getHiddenExecutables(cursor)) {
                    if (!(executable instanceof Method) || !"call".equals(executable.getName())
                            || !seen.add(executable)) {
                        continue;
                    }
                    Method method = (Method) executable;
                    if (method.getReturnType() != Bundle.class) continue;
                    try {
                        Hooks.hook(method, Hooks.EntryPointType.DIRECT,
                                SettingsProviderHooks::interceptCall, Hooks.EntryPointType.DIRECT);
                        installed++;
                        Log.i(TAG, "hooked SettingsProvider " + method);
                    } catch (Throwable error) {
                        Log.w(TAG, "SettingsProvider hook unavailable " + method, error);
                    }
                }
            }
            return installed;
        } catch (Throwable error) {
            Log.e(TAG, "settings provider hook initialization failed", error);
            return 0;
        }
    }

    private static void interceptCall(MethodHandle original, EmulatedStackFrame frame) throws Throwable {
        if (readsDeveloperOptions(frame) && CloakPolicy.hidesDeveloperOptions(Binder.getCallingUid())) {
            Bundle result = new Bundle();
            result.putString(Settings.NameValueTable.NAME, DEVELOPMENT_SETTINGS_ENABLED);
            result.putString(Settings.NameValueTable.VALUE, "0");
            frame.accessor().setValue(EmulatedStackFrame.RETURN_VALUE_IDX, result);
            return;
        }
        Transformers.invokeExactNoChecks(original, frame);
    }

    /** Supports both legacy call(method, key, extras) and modern call(pkg, method, key, extras). */
    private static boolean readsDeveloperOptions(EmulatedStackFrame frame) {
        EmulatedStackFrame.StackFrameAccessor accessor = frame.accessor();
        boolean getMethodSeen = false;
        for (int i = 1; i < frame.type().parameterCount(); i++) {
            if (accessor.getArgumentShorty(i) != 'L') continue;
            Object value = accessor.getReference(i);
            if (!(value instanceof String)) continue;
            String text = (String) value;
            if (text.startsWith("GET_")) {
                getMethodSeen = true;
                continue;
            }
            if (getMethodSeen) return DEVELOPMENT_SETTINGS_ENABLED.equals(text);
        }
        return false;
    }

    private static Class<?> findProviderClass() throws ClassNotFoundException {
        ClassLoader context = Thread.currentThread().getContextClassLoader();
        if (context != null) {
            try {
                return Class.forName(PROVIDER, true, context);
            } catch (ClassNotFoundException ignored) {
                // ZygoteLoader normally sets this to the target app loader.
            }
        }
        return Class.forName(PROVIDER, true, SettingsProviderHooks.class.getClassLoader());
    }
}
