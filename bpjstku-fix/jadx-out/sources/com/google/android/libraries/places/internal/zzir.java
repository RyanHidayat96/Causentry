package com.google.android.libraries.places.internal;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class zzir {
    private final Context zza;

    private final void zzc(zzbip zzbipVar) {
        Context context = this.zza;
        String strZza = zzmh.zza(context.getPackageManager(), context.getPackageName());
        if (TextUtils.isEmpty(strZza)) {
            return;
        }
        zzbik zzbikVar = zzbip.zza;
        zzbipVar.zzc(zzbil.zzc("X-Android-Package", zzbikVar), context.getPackageName());
        zzbipVar.zzc(zzbil.zzc("X-Places-Android-Sdk", zzbikVar), "4.4.1");
        zzbipVar.zzc(zzbil.zzc("X-Android-Cert", zzbikVar), strZza);
    }

    private static final void zzd(zzbip zzbipVar, String str) {
        if (str.isEmpty()) {
            return;
        }
        zzbipVar.zzc(zzbil.zzc("X-Goog-FieldMask", zzbip.zza), str);
    }

    public final zzbip zza(String str, String str2) {
        zzbip zzbipVar = new zzbip();
        zzbipVar.zzc(zzbil.zzc("X-Goog-Api-Key", zzbip.zza), str);
        zzc(zzbipVar);
        zzd(zzbipVar, str2);
        return zzbipVar;
    }

    public final zzbip zzb(String str, String str2) {
        zzbip zzbipVar = new zzbip();
        zzbipVar.zzc(zzbil.zzc("Authorization", zzbip.zza), "Bearer ".concat(String.valueOf(str)));
        zzd(zzbipVar, str2);
        zzc(zzbipVar);
        return zzbipVar;
    }

    public zzir(Context context) {
        this.zza = context;
    }
}
