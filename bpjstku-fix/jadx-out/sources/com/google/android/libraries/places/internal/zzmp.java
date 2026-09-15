package com.google.android.libraries.places.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzmp {
    public static zzmn zzd(Context context) {
        if (com.google.android.gms.internal.auth.zzdp.TuitionPaymentFragmentbindingInflater1(new ArrayList()) != 0) {
            throw new RuntimeException("0");
        }
        String packageName = context.getPackageName();
        int i = 0;
        try {
            i = context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        zzml zzmlVar = new zzml();
        zzmlVar.zza(packageName);
        zzmlVar.zzb(i);
        zzmlVar.zzc(zzmo.PROGRAMMATIC_API);
        return zzmlVar;
    }

    public abstract String zza();

    public abstract int zzb();

    public abstract zzmo zzc();
}
