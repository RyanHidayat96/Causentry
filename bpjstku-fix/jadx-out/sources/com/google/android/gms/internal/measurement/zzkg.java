package com.google.android.gms.internal.measurement;

import android.net.Uri;
import defpackage.getCameraRegistration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzkg {
    final Uri zza;
    final String zzb;
    final String zzc;
    final boolean zzd;
    final boolean zze;

    public zzkg(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    public final zzkg zza() {
        String str = this.zzb;
        if (str.isEmpty()) {
            return new zzkg(null, this.zza, str, this.zzc, true, false, this.zze, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final zzkm zzc(String str, long j) {
        int i = zzkm.zzc;
        return new zzkc(this, str, Long.valueOf(j), true);
    }

    public final zzkm zzd(String str, boolean z) {
        int i = zzkm.zzc;
        return new zzkd(this, str, Boolean.valueOf(z), true);
    }

    public final zzkm zze(String str, double d) {
        int i = zzkm.zzc;
        return new zzke(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    public final zzkm zzf(String str, String str2) {
        int i = zzkm.zzc;
        return new zzkf(this, str, str2, true);
    }

    private zzkg(String str, Uri uri, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, getCameraRegistration getcameraregistration) {
        this.zza = uri;
        this.zzb = "";
        this.zzc = "";
        this.zzd = z;
        this.zze = z3;
    }

    public final zzkg zzb() {
        return new zzkg(null, this.zza, this.zzb, this.zzc, this.zzd, false, true, false, null);
    }
}
