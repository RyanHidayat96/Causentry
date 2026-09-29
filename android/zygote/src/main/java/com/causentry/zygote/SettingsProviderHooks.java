package com.causentry.zygote;

import android.content.Context;
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
import java.util.Arrays;
import java.util.Collections;
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
    private static final Set<String> HIDDEN_DEVELOPER_SETTINGS = Collections.unmodifiableSet(
            new HashSet<>(Arrays.asList(
                    "development_settings_enabled",
                    "adb_enabled",
                    "adb_wifi_enabled")));
    private static volatile int installedHooks;

    private SettingsProviderHooks() {}

    static synchronized int install() {
        if (installedHooks > 0) return installedHooks;
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
            installedHooks = installed;
            return installed;
        } catch (ClassNotFoundException unavailable) {
            // AOSP can host this provider outside system_server. Its package marker
            // will load this backend in the provider process instead.
            return 0;
        } catch (Throwable error) {
            Log.e(TAG, "settings provider hook initialization failed", error);
            return 0;
        }
    }

    private static void interceptCall(MethodHandle original, EmulatedStackFrame frame) throws Throwable {
        String key = hiddenDeveloperSetting(frame);
        if (key != null && CloakPolicy.hidesDeveloperOptions(Binder.getCallingUid())) {
            Bundle result = new Bundle();
            result.putString(Settings.NameValueTable.NAME, key);
            result.putString(Settings.NameValueTable.VALUE, "0");
            frame.accessor().setValue(EmulatedStackFrame.RETURN_VALUE_IDX, result);
            return;
        }
        Transformers.invokeExactNoChecks(original, frame);
    }

    /** Supports both legacy call(method, key, extras) and modern call(pkg, method, key, extras). */
    private static String hiddenDeveloperSetting(EmulatedStackFrame frame) {
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
            if (getMethodSeen && HIDDEN_DEVELOPER_SETTINGS.contains(text)) return text;
        }
        return null;
    }

    private static Class<?> findProviderClass() throws ClassNotFoundException {
        ClassLoader packageLoader = providerPackageLoader();
        if (packageLoader != null) {
            try {
                return Class.forName(PROVIDER, true, packageLoader);
            } catch (ClassNotFoundException ignored) {
                // The package can still be isolated in its own loader.
            }
        }
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

    private static ClassLoader providerPackageLoader() {
        try {
            Class<?> activityThread = Class.forName("android.app.ActivityThread");
            Method current = activityThread.getDeclaredMethod("currentActivityThread");
            Object thread = current.invoke(null);
            if (thread == null) return null;
            Method systemContext = activityThread.getDeclaredMethod("getSystemContext");
            Object context = systemContext.invoke(thread);
            if (!(context instanceof Context)) return null;
            Context provider = ((Context) context).createPackageContext(PROVIDER,
                    Context.CONTEXT_INCLUDE_CODE | Context.CONTEXT_IGNORE_SECURITY);
            return provider.getClassLoader();
        } catch (Throwable ignored) {
            return null;
        }
    }
}
