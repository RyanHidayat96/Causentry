package com.google.android.libraries.places.internal;

import android.content.Context;
import android.os.Build;
import android.os.DropBoxManager;
import android.util.Log;
import defpackage.markCameraState;
import defpackage.traceState;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmr {
    private static DropBoxManager zza;
    private static final LinkedHashMap zzb = new zzmq(16, 0.75f, true);
    private static String zzc;

    public static void zza(Context context) {
        synchronized (zzmr.class) {
            if (zza == null) {
                zza = (DropBoxManager) context.getApplicationContext().getSystemService("dropbox");
                zzc = "com.google.android.libraries.places";
            }
        }
    }

    public static void zzb(Throwable th) {
        DropBoxManager dropBoxManager;
        long j;
        synchronized (zzmr.class) {
            long id2 = Thread.currentThread().getId();
            int iHashCode = th.hashCode();
            Integer num = (Integer) zzb.get(Long.valueOf(id2));
            if ((num == null || num.intValue() != iHashCode) && (dropBoxManager = zza) != null && dropBoxManager.isTagEnabled("system_app_crash")) {
                DropBoxManager dropBoxManager2 = zza;
                StringBuilder sb = new StringBuilder();
                String str = zzc;
                List<String> listTuitionPaymentFragmentspecialinlinedviewModeldefault1 = new markCameraState(new markCameraState.AnonymousClass3(traceState.TuitionPaymentFragmentspecialinlinedviewModeldefault2('.'))).TuitionPaymentFragmentspecialinlinedviewModeldefault1("4.4.1");
                if (listTuitionPaymentFragmentspecialinlinedviewModeldefault1.size() != 3) {
                    j = -1;
                } else {
                    long j2 = 0;
                    for (int i = 0; i < listTuitionPaymentFragmentspecialinlinedviewModeldefault1.size(); i++) {
                        try {
                            j2 = (j2 * 100) + ((long) Integer.parseInt(listTuitionPaymentFragmentspecialinlinedviewModeldefault1.get(i)));
                        } catch (NumberFormatException unused) {
                            j = -1;
                        }
                    }
                    j = j2;
                }
                sb.append(String.format("Package: %s v%d (%s)\n", str, Long.valueOf(j), "4.4.1"));
                sb.append(String.format("Build: %s\n", Build.FINGERPRINT));
                sb.append("\n");
                sb.append(Log.getStackTraceString(th));
                dropBoxManager2.addText("system_app_crash", sb.toString());
                zzb.put(Long.valueOf(id2), Integer.valueOf(iHashCode));
            }
        }
    }
}
