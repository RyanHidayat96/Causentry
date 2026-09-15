package com.google.android.libraries.places.internal;

import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.Constants;
import defpackage.CameraStateRegistryCameraRegistration;
import defpackage.registerCamera;
import defpackage.tryOpenCamera;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbiz {
    private final zzbjv zza;
    private final Object zzb;

    private zzbiz(zzbjv zzbjvVar) {
        this.zzb = null;
        if (zzbjvVar == null) {
            throw new NullPointerException(NotificationCompat.CATEGORY_STATUS);
        }
        this.zza = zzbjvVar;
        if (!(!zzbjvVar.zzj())) {
            throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("cannot use OK status: %s", zzbjvVar));
        }
    }

    public static zzbiz zza(Object obj) {
        return new zzbiz(obj);
    }

    public static zzbiz zzb(zzbjv zzbjvVar) {
        return new zzbiz(zzbjvVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzbiz zzbizVar = (zzbiz) obj;
        return tryOpenCamera.b(this.zza, zzbizVar.zza) && tryOpenCamera.b(this.zzb, zzbizVar.zzb);
    }

    public final int hashCode() {
        return tryOpenCamera.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.zza, this.zzb);
    }

    public final String toString() {
        Object obj = this.zzb;
        byte b = 0;
        if (obj != null) {
            registerCamera.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new registerCamera.TuitionPaymentFragmentbindingInflater1(getClass().getSimpleName(), b);
            registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.b = obj;
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "config";
            return tuitionPaymentFragmentbindingInflater1.toString();
        }
        registerCamera.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater2 = new registerCamera.TuitionPaymentFragmentbindingInflater1(getClass().getSimpleName(), b);
        zzbjv zzbjvVar = this.zza;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        tuitionPaymentFragmentbindingInflater2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.b = zzbjvVar;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Constants.IPC_BUNDLE_KEY_SEND_ERROR;
        return tuitionPaymentFragmentbindingInflater2.toString();
    }

    private zzbiz(Object obj) {
        if (obj == null) {
            throw new NullPointerException("config");
        }
        this.zzb = obj;
        this.zza = null;
    }

    public final Object zzc() {
        return this.zzb;
    }

    public final zzbjv zzd() {
        return this.zza;
    }
}
