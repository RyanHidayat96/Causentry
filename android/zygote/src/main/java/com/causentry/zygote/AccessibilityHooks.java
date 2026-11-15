package com.causentry.zygote;

import android.os.Binder;
import android.util.Log;

import com.v7878.unsafe.Reflection;
import com.v7878.unsafe.invoke.EmulatedStackFrame;
import com.v7878.unsafe.invoke.Transformers;
import com.v7878.vmtools.HookTransformer;
import com.v7878.vmtools.Hooks;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Blocks accessibility-based detection for protected packages.
 *
 * SettingsProvider filtering alone is not enough: every app can ask
 * AccessibilityManagerService over binder for the live service list and for
 * touch-exploration state, completely bypassing the settings namespace.
 * myBCA does exactly that (AccessibilityManager#getEnabledAccessibilityServiceList
 * plus #isTouchExplorationEnabled), which is why hiding the settings keys left
 * the warning dialog intact.
 *
 * Hook targets (com.android.server.accessibility.AccessibilityManagerService):
 *   - getEnabledAccessibilityServiceList / getInstalledAccessibilityServiceList
 *     / getAccessibilityServiceList  -> empty list for a protected caller.
 *   - isTouchExplorationEnabled / isAccessibilityButtonShown -> false.
 *   - addClient / registerClient (int state) -> all state flags cleared, so the
 *     caller's cached AccessibilityManager#isEnabled() stays false.
 *
 * The caller UID is read from Binder inside each hook, so system-internal calls
 * (uid 1000) and unprotected apps keep their normal behaviour.
 */
final class AccessibilityHooks {
    private static final String TAG = "CausentryZygote";
    private static final String SERVICE_CLASS =
            "com.android.server.accessibility.AccessibilityManagerService";
    /** No accessibility state flags set: representation of "nothing enabled". */
    private static final int STATE_NONE = 0;
    private static volatile int installedHooks;

    private AccessibilityHooks() {}

    static synchronized int install(ClassLoader loader) {
        if (installedHooks > 0) return installedHooks;
        int installed = 0;
        try {
            Class<?> service = Class.forName(SERVICE_CLASS, true, loader);
            for (Class<?> cursor = service; cursor != null; cursor = cursor.getSuperclass()) {
                for (Executable executable : Reflection.getHiddenExecutables(cursor)) {
                    if (!(executable instanceof Method)) continue;
                    Method method = (Method) executable;
                    Flavor flavor = flavorOf(method);
                    if (flavor == null) continue;
                    try {
                        HookTransformer transformer = transformerFor(method, flavor);
                        Hooks.hook(method, Hooks.EntryPointType.DIRECT, transformer,
                                Hooks.EntryPointType.DIRECT);
                        installed++;
                        Log.i(TAG, "hooked " + SERVICE_CLASS + "#" + method.getName()
                                + " (" + flavor + ")");
                    } catch (Throwable error) {
                        Log.w(TAG, "accessibility hook unavailable " + method, error);
                    }
                }
            }
        } catch (ClassNotFoundException unavailable) {
            Log.w(TAG, "AccessibilityManagerService not present in this runtime");
        } catch (Throwable error) {
            Log.e(TAG, "accessibility hook initialization failed", error);
        }
        installedHooks = installed;
        if (installed == 0) Log.w(TAG, "no accessibility hooks installed");
        return installed;
    }

    private enum Flavor { EMPTY_LIST, FALSE, STATE }

    private static Flavor flavorOf(Method method) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if ("isTouchExplorationEnabled".equals(name)
                || "isAccessibilityButtonShown".equals(name)) {
            return returnType == boolean.class ? Flavor.FALSE : null;
        }
        if (name.startsWith("getEnabledAccessibilityServiceList")
                || name.startsWith("getInstalledAccessibilityServiceList")
                || name.startsWith("getAccessibilityServiceList")) {
            return Flavor.EMPTY_LIST;
        }
        if (name.startsWith("addClient") || name.startsWith("registerClient")) {
            // addClient returns long on AOSP (packed IntPair), int on some OEM forks
            return (returnType == int.class || returnType == long.class) ? Flavor.STATE : null;
        }
        return null;
    }

    private static HookTransformer transformerFor(Method method, Flavor flavor) {
        return (original, frame) -> {
            int callingUid = Binder.getCallingUid();
            if (!CloakPolicy.hidesAccessibility(callingUid)) {
                Transformers.invokeExactNoChecks(original, frame);
                return;
            }
            // When hiding, answer directly and never let the service register the
            // caller as a client: addClient() would push the real state back to
            // the app through the IAccessibilityManagerClient callback.
            switch (flavor) {
                case EMPTY_LIST:
                    emptyListResult(frame, method);
                    break;
                case FALSE:
                    frame.accessor().setValue(EmulatedStackFrame.RETURN_VALUE_IDX, false);
                    break;
                case STATE:
                    // addClient returns long on AOSP (IntPair-packed), int on OEM forks
                    if (method.getReturnType() == long.class) {
                        frame.accessor().setValue(EmulatedStackFrame.RETURN_VALUE_IDX, 0L);
                    } else {
                        frame.accessor().setValue(EmulatedStackFrame.RETURN_VALUE_IDX, STATE_NONE);
                    }
                    break;
            }
        };
    }

    /**
     * Replaces the return value with an empty list instance compatible with the
     * declared return type (plain List on AOSP, ParceledListSlice on some OEMs).
     */
    private static void emptyListResult(EmulatedStackFrame frame, Method method) {
        Class<?> returnType = method.getReturnType();
        Object empty = null;
        if (returnType.isAssignableFrom(ArrayList.class)) {
            empty = new ArrayList<>(0);
        } else if (returnType.getName().endsWith("ParceledListSlice")) {
            empty = newParceledListSlice(returnType);
        }
        if (empty == null) return;
        frame.accessor().setValue(EmulatedStackFrame.RETURN_VALUE_IDX, empty);
    }

    private static Object newParceledListSlice(Class<?> returnType) {
        try {
            Constructor<?> constructor = returnType.getDeclaredConstructor(List.class);
            constructor.setAccessible(true);
            return constructor.newInstance(Collections.emptyList());
        } catch (Throwable error) {
            Log.w(TAG, "cannot build empty " + returnType.getName(), error);
            return null;
        }
    }
}
