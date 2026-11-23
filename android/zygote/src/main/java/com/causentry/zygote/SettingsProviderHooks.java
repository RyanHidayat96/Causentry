package com.causentry.zygote;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;

import com.v7878.unsafe.Reflection;
import com.v7878.unsafe.invoke.EmulatedStackFrame;
import com.v7878.unsafe.invoke.Transformers;
import com.v7878.vmtools.Hooks;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Intercepts both SettingsProvider#call and SettingsProvider#query per caller UID.
 * Zero target-app injection; system processes and unprotected apps are untouched.
 */
final class SettingsProviderHooks {
    private static final String TAG = "CausentryZygote";
    private static final String PROVIDER_PACKAGE = "com.android.providers.settings";
    private static final String PROVIDER_CLASS = PROVIDER_PACKAGE + ".SettingsProvider";

    private static final Set<String> HIDDEN_DEVELOPER_SETTINGS = Collections.unmodifiableSet(
            new HashSet<>(Arrays.asList(
                    "development_settings_enabled",
                    "adb_enabled",
                    "adb_wifi_enabled",
                    "usb_debugging",
                    "verifier_verify_adb_installs"
            )));

    private static final Set<String> HIDDEN_MOCK_SETTINGS = Collections.unmodifiableSet(
            new HashSet<>(Arrays.asList("mock_location")));

    private static final Set<String> HIDDEN_SECURE_SETTINGS = Collections.unmodifiableSet(
            new HashSet<>(Arrays.asList(
                    "enabled_accessibility_services",
                    "accessibility_enabled",
                    "touch_exploration_enabled",
                    "touch_exploration_granted_accessibility_services"
            )));

    private static volatile int installedHooks;

    private SettingsProviderHooks() {}

    static synchronized int install(boolean inSystemServer) {
        if (installedHooks > 0) return installedHooks;
        try {
            Class<?> provider = findProviderClass(inSystemServer);
            int installed = 0;
            Set<Executable> seen = new HashSet<>();
            for (Class<?> cursor = provider; cursor != null; cursor = cursor.getSuperclass()) {
                for (Executable executable : Reflection.getHiddenExecutables(cursor)) {
                    if (!(executable instanceof Method) || !seen.add(executable)) continue;
                    Method method = (Method) executable;
                    String name = method.getName();
                    if ("call".equals(name) && method.getReturnType() == Bundle.class) {
                        try {
                            Hooks.hook(method, Hooks.EntryPointType.DIRECT,
                                    SettingsProviderHooks::interceptCall, Hooks.EntryPointType.DIRECT);
                            installed++;
                            Log.i(TAG, "hooked SettingsProvider#call: " + method);
                        } catch (Throwable error) {
                            Log.w(TAG, "SettingsProvider#call hook unavailable " + method, error);
                        }
                    } else if ("query".equals(name) && Cursor.class.isAssignableFrom(method.getReturnType())) {
                        try {
                            Hooks.hook(method, Hooks.EntryPointType.DIRECT,
                                    SettingsProviderHooks::interceptQuery, Hooks.EntryPointType.DIRECT);
                            installed++;
                            Log.i(TAG, "hooked SettingsProvider#query: " + method);
                        } catch (Throwable error) {
                            Log.w(TAG, "SettingsProvider#query hook unavailable " + method, error);
                        }
                    }
                }
            }
            installedHooks = installed;
            return installed;
        } catch (ClassNotFoundException unavailable) {
            return 0;
        } catch (Throwable error) {
            Log.e(TAG, "settings provider hook initialization failed", error);
            return 0;
        }
    }

    private static void interceptCall(MethodHandle original, EmulatedStackFrame frame) throws Throwable {
        int callingUid = Binder.getCallingUid();
        String key = extractGetSettingKey(frame);
        if (key != null) {
            String spoofed = spoofValueFor(callingUid, key);
            if (spoofed != null) {
                Bundle result = new Bundle();
                result.putString(Settings.NameValueTable.NAME, key);
                result.putString(Settings.NameValueTable.VALUE, spoofed);
                frame.accessor().setValue(EmulatedStackFrame.RETURN_VALUE_IDX, result);
                return;
            }
        }
        Transformers.invokeExactNoChecks(original, frame);
    }

    private static void interceptQuery(MethodHandle original, EmulatedStackFrame frame) throws Throwable {
        int callingUid = Binder.getCallingUid();
        boolean checksDev = CloakPolicy.hidesDeveloperOptions(callingUid);
        boolean checksMock = CloakPolicy.hidesMockLocation(callingUid);
        boolean checksAcc = CloakPolicy.hidesAccessibility(callingUid);
        if (!checksDev && !checksMock && !checksAcc) {
            Transformers.invokeExactNoChecks(original, frame);
            return;
        }

        // Fast-path check URI last path segment (e.g. content://settings/global/adb_enabled)
        Uri uri = findUriArg(frame);
        if (uri != null) {
            String seg = uri.getLastPathSegment();
            String spoofed = seg != null ? spoofValueFor(callingUid, seg) : null;
            if (spoofed != null) {
                MatrixCursor mc = new MatrixCursor(new String[]{"name", "value"}, 1);
                mc.addRow(new Object[]{seg, spoofed});
                frame.accessor().setValue(EmulatedStackFrame.RETURN_VALUE_IDX, mc);
                return;
            }
        }

        Transformers.invokeExactNoChecks(original, frame);
        Object raw = frame.accessor().getReference(EmulatedStackFrame.RETURN_VALUE_IDX);
        if (!(raw instanceof Cursor)) return;
        Cursor cursor = (Cursor) raw;
        int nameCol = cursor.getColumnIndex("name");
        int valueCol = cursor.getColumnIndex("value");
        if (nameCol < 0 || valueCol < 0) return;

        // Rebuild cursor with spoofed values if any hidden keys appear
        String[] cols = cursor.getColumnNames();
        MatrixCursor filtered = new MatrixCursor(cols, cursor.getCount());
        boolean modified = false;
        int pos = cursor.getPosition();
        try {
            if (cursor.moveToFirst()) {
                do {
                    Object[] row = new Object[cols.length];
                    String keyName = cursor.getString(nameCol);
                    String spoofed = keyName != null ? spoofValueFor(callingUid, keyName) : null;
                    if (spoofed != null) modified = true;
                    for (int i = 0; i < cols.length; i++) {
                        row[i] = (i == valueCol && spoofed != null) ? spoofed : cursor.getString(i);
                    }
                    filtered.addRow(row);
                } while (cursor.moveToNext());
            }
        } finally {
            if (modified) {
                try { cursor.close(); } catch (Throwable ignored) {}
                frame.accessor().setValue(EmulatedStackFrame.RETURN_VALUE_IDX, filtered);
            } else {
                try { filtered.close(); } catch (Throwable ignored) {}
                cursor.moveToPosition(pos);
            }
        }
    }

    private static String spoofValueFor(int uid, String key) {
        if (HIDDEN_DEVELOPER_SETTINGS.contains(key) && CloakPolicy.hidesDeveloperOptions(uid)) {
            return "0";
        }
        if (HIDDEN_MOCK_SETTINGS.contains(key) && CloakPolicy.hidesMockLocation(uid)) {
            return "0";
        }
        if (HIDDEN_SECURE_SETTINGS.contains(key) && CloakPolicy.hidesAccessibility(uid)) {
            return key.endsWith("accessibility_services") ? "" : "0";
        }
        return null;
    }

    private static String extractGetSettingKey(EmulatedStackFrame frame) {
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
            if (getMethodSeen) return text;
        }
        return null;
    }

    private static Uri findUriArg(EmulatedStackFrame frame) {
        EmulatedStackFrame.StackFrameAccessor accessor = frame.accessor();
        for (int i = 1; i < frame.type().parameterCount(); i++) {
            if (accessor.getArgumentShorty(i) != 'L') continue;
            Object v = accessor.getReference(i);
            if (v instanceof Uri) return (Uri) v;
        }
        return null;
    }

    private static Class<?> findProviderClass(boolean inSystemServer) throws ClassNotFoundException {
        if (!inSystemServer) {
            ClassLoader ctx = Thread.currentThread().getContextClassLoader();
            if (ctx != null) {
                try {
                    return Class.forName(PROVIDER_CLASS, true, ctx);
                } catch (ClassNotFoundException ignored) {}
            }
            return Class.forName(PROVIDER_CLASS, true, SettingsProviderHooks.class.getClassLoader());
        }

        // MIUI/HyperOS hosts SettingsProvider inside system_server; only resolve if already loaded.
        ClassLoader sysLoader = PackageCloakHooks.class.getClassLoader();
        try {
            Class<?> at = Class.forName("android.app.ActivityThread");
            Object thread = at.getDeclaredMethod("currentActivityThread").invoke(null);
            if (thread != null) {
                Object sysCtx = at.getDeclaredMethod("getSystemContext").invoke(thread);
                if (sysCtx instanceof Context) {
                    Context providerCtx = ((Context) sysCtx).createPackageContext(
                            PROVIDER_PACKAGE, Context.CONTEXT_INCLUDE_CODE | Context.CONTEXT_IGNORE_SECURITY);
                    return Class.forName(PROVIDER_CLASS, true, providerCtx.getClassLoader());
                }
            }
        } catch (Throwable ignored) {}
        return Class.forName(PROVIDER_CLASS, true, sysLoader);
    }
}
