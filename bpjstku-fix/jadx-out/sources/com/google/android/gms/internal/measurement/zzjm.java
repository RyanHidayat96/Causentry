package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* JADX INFO: loaded from: classes5.dex */
public final class zzjm {
    private static UserManager zza;
    private static volatile boolean zzb = !zza();

    public static boolean zza() {
        return true;
    }

    public static boolean zzb(Context context) {
        return zza() && !zzd(context);
    }

    public static boolean zzc(Context context) {
        return !zza() || zzd(context);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004a A[Catch: all -> 0x0052, TryCatch #0 {, blocks: (B:7:0x0009, B:9:0x000d, B:14:0x0014, B:16:0x0018, B:17:0x0022, B:31:0x004e, B:32:0x0050, B:20:0x0028, B:22:0x002e, B:29:0x004a, B:26:0x003b), top: B:37:0x0009, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x004e A[Catch: all -> 0x0052, TryCatch #0 {, blocks: (B:7:0x0009, B:9:0x000d, B:14:0x0014, B:16:0x0018, B:17:0x0022, B:31:0x004e, B:32:0x0050, B:20:0x0028, B:22:0x002e, B:29:0x004a, B:26:0x003b), top: B:37:0x0009, inners: #1 }] */
    private static boolean zzd(Context context) {
        boolean z;
        if (zzb) {
            return true;
        }
        synchronized (zzjm.class) {
            if (zzb) {
                return true;
            }
            int i = 1;
            while (true) {
                if (i <= 2) {
                    if (zza == null) {
                        zza = (UserManager) context.getSystemService(UserManager.class);
                    }
                    UserManager userManager = zza;
                    if (userManager == null) {
                        z = true;
                    } else {
                        try {
                            z = userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle());
                            if (z) {
                                zza = null;
                            }
                        } catch (NullPointerException e2) {
                            Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e2);
                            zza = null;
                            i++;
                        }
                    }
                    if (z) {
                        zzb = true;
                    }
                    return z;
                }
                if (z) {
                    zza = null;
                }
                if (z) {
                    zzb = true;
                }
                return z;
            }
        }
    }

    private zzjm() {
    }
}
