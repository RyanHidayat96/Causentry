package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
public class ServiceStarter {
    static final String ACTION_MESSAGING_EVENT = "com.google.firebase.MESSAGING_EVENT";
    static final int ERROR_ILLEGAL_STATE_EXCEPTION = 402;
    static final int ERROR_ILLEGAL_STATE_EXCEPTION_FALLBACK_TO_BIND = 403;
    static final int ERROR_NOT_FOUND = 404;
    static final int ERROR_SECURITY_EXCEPTION = 401;
    public static final int ERROR_UNKNOWN = 500;
    private static final String EXTRA_WRAPPED_INTENT = "wrapped_intent";
    private static final String PERMISSIONS_MISSING_HINT = "this should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    public static final int SUCCESS = -1;
    private static ServiceStarter instance;
    private String firebaseMessagingServiceClassName = null;
    private Boolean hasWakeLockPermission = null;
    private Boolean hasAccessNetworkStatePermission = null;
    private final Queue<Intent> messagingEvents = new ArrayDeque();

    static ServiceStarter getInstance() {
        ServiceStarter serviceStarter;
        synchronized (ServiceStarter.class) {
            if (instance == null) {
                instance = new ServiceStarter();
            }
            serviceStarter = instance;
        }
        return serviceStarter;
    }

    private ServiceStarter() {
    }

    Intent getMessagingEvent() {
        return this.messagingEvents.poll();
    }

    public int startMessagingService(Context context, Intent intent) {
        this.messagingEvents.offer(intent);
        Intent intent2 = new Intent(ACTION_MESSAGING_EVENT);
        intent2.setPackage(context.getPackageName());
        return doStartService(context, intent2);
    }

    private int doStartService(Context context, Intent intent) {
        ComponentName componentNameStartService;
        String strResolveServiceClassName = resolveServiceClassName(context, intent);
        if (strResolveServiceClassName != null) {
            intent.setClassName(context.getPackageName(), strResolveServiceClassName);
        }
        try {
            if (hasWakeLockPermission(context)) {
                componentNameStartService = WakeLockHolder.startWakefulService(context, intent);
            } else {
                componentNameStartService = context.startService(intent);
            }
            if (componentNameStartService == null) {
                return ERROR_NOT_FOUND;
            }
            return -1;
        } catch (IllegalStateException e2) {
            e2.toString();
            return 402;
        } catch (SecurityException unused) {
            return 401;
        }
    }

    private String resolveServiceClassName(Context context, Intent intent) {
        synchronized (this) {
            String str = this.firebaseMessagingServiceClassName;
            if (str != null) {
                return str;
            }
            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveInfoResolveService != null && resolveInfoResolveService.serviceInfo != null) {
                ServiceInfo serviceInfo = resolveInfoResolveService.serviceInfo;
                if (context.getPackageName().equals(((PackageItemInfo) serviceInfo).packageName) && ((PackageItemInfo) serviceInfo).name != null) {
                    if (((PackageItemInfo) serviceInfo).name.startsWith(".")) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(context.getPackageName());
                        sb.append(((PackageItemInfo) serviceInfo).name);
                        this.firebaseMessagingServiceClassName = sb.toString();
                    } else {
                        this.firebaseMessagingServiceClassName = ((PackageItemInfo) serviceInfo).name;
                    }
                    return this.firebaseMessagingServiceClassName;
                }
                String str2 = ((PackageItemInfo) serviceInfo).packageName;
                String str3 = ((PackageItemInfo) serviceInfo).name;
                return null;
            }
            return null;
        }
    }

    boolean hasWakeLockPermission(Context context) {
        if (this.hasWakeLockPermission == null) {
            this.hasWakeLockPermission = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        return this.hasWakeLockPermission.booleanValue();
    }

    boolean hasAccessNetworkStatePermission(Context context) {
        if (this.hasAccessNetworkStatePermission == null) {
            this.hasAccessNetworkStatePermission = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        return this.hasAccessNetworkStatePermission.booleanValue();
    }

    public static void setForTesting(ServiceStarter serviceStarter) {
        instance = serviceStarter;
    }
}
