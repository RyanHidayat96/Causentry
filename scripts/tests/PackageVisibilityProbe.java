import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.os.Process;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/** Read-only Binder diagnostics. Runs in a separate app_process, never inside a target app. */
public final class PackageVisibilityProbe {
    private static Object manager;
    private static Class<?> managerApi;
    private static String target;
    private static boolean checkingTarget = true;
    private static int leaks;
    private static int errors;

    public static void main(String[] args) throws Exception {
        if (args[0].equals("--signatures")) {
            for (String className : new String[]{"com.android.server.pm.ComputerEngine",
                    "com.android.server.pm.AppsFilterImpl", "com.android.server.pm.AppsFilterSnapshotImpl",
                    "com.android.server.pm.PackageSetting"}) {
                try {
                    Class<?> type = Class.forName(className, false, PackageVisibilityProbe.class.getClassLoader());
                    for (Class<?> cursor = type; cursor != null; cursor = cursor.getSuperclass()) {
                        for (Method method : cursor.getDeclaredMethods()) {
                            String name = method.getName();
                            if (name.equals("shouldFilterApplication") || name.equals("getApplicationInfoInternal")
                                    || name.equals("getPackageInfoInternal") || name.equals("getPackageName")
                                    || name.equals("getActivityInfoInternal") || name.equals("queryIntentActivitiesInternal")
                                    || name.equals("queryIntentServicesInternal")) System.out.println(method);
                        }
                    }
                } catch (Throwable error) { System.out.println(className + " ERROR " + error); }
            }
            return;
        }
        target = args[0];
        int targetUid = Integer.parseInt(args[1]);
        manager = Class.forName("android.app.AppGlobals")
                .getMethod("getPackageManager").invoke(null);
        managerApi = Class.forName("android.content.pm.IPackageManager");
        System.out.println("callerUid=" + Process.myUid() + " target=" + target);
        query("getPackageInfo", target, 0L, 0);
        query("getApplicationInfo", target, 0L, 0);
        query("getPackageUid", target, 0L, 0);
        query("getPackageGids", target, 0L, 0);
        query("getPackagesForUid", targetUid);
        query("getNameForUid", targetUid);
        query("getInstalledPackages", 0L, 0);
        query("getInstalledApplications", 0L, 0);
        query("getApplicationEnabledSetting", target, 0);
        query("getInstallerPackageName", target);
        query("getInstallSourceInfo", target, 0);
        query("checkPermission", "android.permission.INTERNET", target, 0);
        query("getActivityInfo", new ComponentName(target, target + ".ui.MainActivity"), 0L, 0);
        query("getReceiverInfo", new ComponentName(target, target + ".core.Receiver"), 0L, 0);
        query("getProviderInfo", new ComponentName(target, target + ".core.Provider"), 0L, 0);
        query("resolveContentProvider", target + ".provider", 0L, 0);
        Intent launcher = new Intent(Intent.ACTION_MAIN).addCategory(Intent.CATEGORY_LAUNCHER);
        query("queryIntentActivities", launcher, null, 0L, 0);
        query("queryIntentReceivers", new Intent(Intent.ACTION_LOCALE_CHANGED), null, 0L, 0);
        query("queryIntentServices", new Intent().setPackage(target), null, 0L, 0);
        query("queryIntentContentProviders", new Intent().setComponent(
                new ComponentName(target, target + ".core.Provider")), null, 0L, 0);
        query("getPackageInfo", target, 0x2000L, 0);
        query("getApplicationInfo", target, 0x2000L, 0);
        checkingTarget = false;
        if (args.length > 2) query("getPackageInfo", args[2], 0L, 0);
        query("getApplicationInfo", "com.android.settings", 0L, 0);
        System.out.println("SUMMARY leaks=" + leaks + " errors=" + errors);
        if (args.length > 3 && args[3].equals("--expect-hidden") && (leaks > 0 || errors > 0)) {
            System.exit(1);
        }
    }

    private static void query(String name, Object... args) {
        String label = checkingTarget ? name : "control." + name;
        try {
            Method selected = null;
            for (Method method : managerApi.getMethods()) {
                if (!method.getName().equals(name) || method.getParameterCount() != args.length) continue;
                Class<?>[] types = method.getParameterTypes();
                boolean matches = true;
                for (int i = 0; i < args.length; i++) {
                    Class<?> type = types[i];
                    if (type == int.class) type = Integer.class;
                    if (type == long.class) type = Long.class;
                    if (args[i] != null && !type.isInstance(args[i])) matches = false;
                }
                if (matches) { selected = method; break; }
            }
            if (selected == null) {
                System.out.println(label + "=UNAVAILABLE");
                errors++;
                return;
            }
            Object result = selected.invoke(manager, args);
            if (result != null && result.getClass().getName().equals("android.content.pm.ParceledListSlice")) {
                result = result.getClass().getMethod("getList").invoke(result);
            }
            if (result instanceof List<?>) {
                List<?> list = (List<?>) result;
                int matches = 0;
                for (Object entry : list) if (target.equals(packageName(entry))) matches++;
                System.out.println(label + "=list size=" + list.size() + " targetMatches=" + matches);
                if (checkingTarget && matches > 0) leaks++;
            } else if (result != null && result.getClass().isArray()) {
                StringBuilder value = new StringBuilder("[");
                for (int i = 0; i < Array.getLength(result); i++) {
                    if (i > 0) value.append(',');
                    value.append(Array.get(result, i));
                }
                System.out.println(label + "=" + value.append(']'));
                if (checkingTarget && Array.getLength(result) > 0) leaks++;
            } else {
                String packageName = packageName(result);
                System.out.println(label + "=" + (packageName == null ? result : packageName));
                if (checkingTarget) {
                    boolean absent = result == null || ((name.equals("getPackageUid")
                            || name.equals("checkPermission")) && Integer.valueOf(-1).equals(result));
                    if (!absent) leaks++;
                } else if (result == null) {
                    errors++;
                }
            }
        } catch (Throwable error) {
            if (error instanceof InvocationTargetException) error = error.getCause();
            System.out.println(label + "=ERROR " + error);
            if (!(checkingTarget && error instanceof IllegalArgumentException
                    && (name.equals("getApplicationEnabledSetting")
                    || name.equals("getInstallerPackageName")))) errors++;
        }
    }

    private static String packageName(Object value) {
        if (value instanceof PackageInfo) return ((PackageInfo) value).packageName;
        if (value instanceof ApplicationInfo) return ((ApplicationInfo) value).packageName;
        if (value instanceof ComponentInfo) return ((ComponentInfo) value).packageName;
        if (value instanceof ResolveInfo) {
            ResolveInfo info = (ResolveInfo) value;
            if (info.activityInfo != null) return info.activityInfo.packageName;
            if (info.serviceInfo != null) return info.serviceInfo.packageName;
            if (info.providerInfo != null) return info.providerInfo.packageName;
        }
        return null;
    }
}
