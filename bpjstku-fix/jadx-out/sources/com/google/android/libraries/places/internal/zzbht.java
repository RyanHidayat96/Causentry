package com.google.android.libraries.places.internal;

import androidx.core.app.NotificationCompat;
import defpackage.registerCamera;
import defpackage.tryOpenCamera;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbht {
    private static final zzbht zza = new zzbht(null, null, zzbjv.zza, false);
    private final zzbhx zzb;
    private final zzbfm zzc = null;
    private final zzbjv zzd;
    private final boolean zze;

    private zzbht(zzbhx zzbhxVar, zzbfm zzbfmVar, zzbjv zzbjvVar, boolean z) {
        this.zzb = zzbhxVar;
        if (zzbjvVar == null) {
            throw new NullPointerException(NotificationCompat.CATEGORY_STATUS);
        }
        this.zzd = zzbjvVar;
        this.zze = z;
    }

    public static zzbht zza(zzbhx zzbhxVar, zzbfm zzbfmVar) {
        if (zzbhxVar != null) {
            return new zzbht(zzbhxVar, null, zzbjv.zza, false);
        }
        throw new NullPointerException("subchannel");
    }

    public static zzbht zzb(zzbjv zzbjvVar) {
        if (!zzbjvVar.zzj()) {
            return new zzbht(null, null, zzbjvVar, false);
        }
        throw new IllegalArgumentException("error status shouldn't be OK");
    }

    public static zzbht zzc(zzbjv zzbjvVar) {
        if (!zzbjvVar.zzj()) {
            return new zzbht(null, null, zzbjvVar, true);
        }
        throw new IllegalArgumentException("drop status shouldn't be OK");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbht)) {
            return false;
        }
        zzbht zzbhtVar = (zzbht) obj;
        if (tryOpenCamera.b(this.zzb, zzbhtVar.zzb) && tryOpenCamera.b(this.zzd, zzbhtVar.zzd)) {
            zzbfm zzbfmVar = zzbhtVar.zzc;
            if (tryOpenCamera.b(null, null) && this.zze == zzbhtVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return tryOpenCamera.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.zzb, this.zzd, null, Boolean.valueOf(this.zze));
    }

    public final boolean zzh() {
        return (this.zzb == null && this.zzd.zzj()) ? false : true;
    }

    public final String toString() {
        registerCamera.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new registerCamera.TuitionPaymentFragmentbindingInflater1(getClass().getSimpleName(), (byte) 0);
        zzbhx zzbhxVar = this.zzb;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.b = zzbhxVar;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "subchannel";
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.b = null;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "streamTracerFactory";
        zzbjv zzbjvVar = this.zzd;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault4;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault4;
        tuitionPaymentFragmentspecialinlinedviewModeldefault4.b = zzbjvVar;
        tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = NotificationCompat.CATEGORY_STATUS;
        String strValueOf = String.valueOf(this.zze);
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault5 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3((byte) 0);
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault5;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault5;
        tuitionPaymentFragmentspecialinlinedviewModeldefault5.b = strValueOf;
        tuitionPaymentFragmentspecialinlinedviewModeldefault5.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "drop";
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault6 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault6;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault6;
        tuitionPaymentFragmentspecialinlinedviewModeldefault6.b = null;
        tuitionPaymentFragmentspecialinlinedviewModeldefault6.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "authority-override";
        return tuitionPaymentFragmentbindingInflater1.toString();
    }

    public static zzbht zzd() {
        return zza;
    }

    public final zzbhx zze() {
        return this.zzb;
    }

    public final zzbjv zzf() {
        return this.zzd;
    }

    public final boolean zzg() {
        return this.zze;
    }
}
