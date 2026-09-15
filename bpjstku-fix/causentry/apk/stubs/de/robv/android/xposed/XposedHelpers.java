package de.robv.android.xposed;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/** Causentry compile-time stub (legacy Xposed API). Not packaged. */
public final class XposedHelpers {

    private XposedHelpers() {
    }

    public static Class<?> findClass(String className, ClassLoader classLoader) {
        return null;
    }

    public static Class<?> findClassIfExists(String className, ClassLoader classLoader) {
        return null;
    }

    public static XC_MethodHook.Unhook findAndHookMethod(Class<?> clazz, String methodName,
                                                         Object... parameterTypesAndCallback) {
        return null;
    }

    public static XC_MethodHook.Unhook findAndHookMethod(String className, ClassLoader classLoader,
                                                         String methodName, Object... parameterTypesAndCallback) {
        return null;
    }

    public static Method findMethodExact(Class<?> clazz, String methodName, Object... parameterTypes) {
        return null;
    }

    public static Object callStaticMethod(Class<?> clazz, String methodName, Object... args) {
        return null;
    }

    public static Object callMethod(Object obj, String methodName, Object... args) {
        return null;
    }

    public static Object getObjectField(Object obj, String fieldName) {
        return null;
    }

    public static void setObjectField(Object obj, String fieldName, Object value) {
    }

    public static Object getStaticObjectField(Class<?> clazz, String fieldName) {
        return null;
    }

    public static boolean getStaticBooleanField(Class<?> clazz, String fieldName) {
        return false;
    }

    public static int getStaticIntField(Class<?> clazz, String fieldName) {
        return 0;
    }

    public static void setStaticObjectField(Class<?> clazz, String fieldName, Object value) {
    }

    public static void setStaticBooleanField(Class<?> clazz, String fieldName, boolean value) {
    }

    public static void setStaticIntField(Class<?> clazz, String fieldName, int value) {
    }

    public static Object newInstance(Class<?> clazz, Object... args) {
        return null;
    }

    public static Field findField(Class<?> clazz, String fieldName) {
        return null;
    }
}
