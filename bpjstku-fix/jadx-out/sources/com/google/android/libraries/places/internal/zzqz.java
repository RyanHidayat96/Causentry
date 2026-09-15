package com.google.android.libraries.places.internal;

import android.os.Trace;

/* JADX INFO: loaded from: classes3.dex */
final class zzqz {
    static void zza(zzra zzraVar) {
        zzc(zzraVar);
        Trace.beginSection(zzraVar.zzd());
        String strZze = zzraVar.zze();
        if (strZze.length() > 127) {
            strZze = strZze.substring(0, 127);
        }
        Trace.beginSection(strZze);
    }

    static void zzb(zzra zzraVar) {
        zzc(zzraVar);
        Trace.endSection();
        Trace.endSection();
    }

    private static boolean zzc(zzra zzraVar) {
        return zzraVar.zza() != Thread.currentThread();
    }
}
