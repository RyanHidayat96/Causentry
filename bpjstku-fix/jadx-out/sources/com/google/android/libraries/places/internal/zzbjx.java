package com.google.android.libraries.places.internal;

import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.Constants;
import defpackage.CameraStateRegistryCameraRegistration;
import defpackage.registerCamera;
import defpackage.tryOpenCamera;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbjx {
    private final zzbjv zza;
    private final Object zzb;

    public static zzbjx zzb(zzbjv zzbjvVar) {
        if (zzbjvVar == null) {
            throw new NullPointerException(NotificationCompat.CATEGORY_STATUS);
        }
        zzbjx zzbjxVar = new zzbjx(zzbjvVar, null);
        if (!zzbjvVar.zzj()) {
            return zzbjxVar;
        }
        throw new IllegalArgumentException(CameraStateRegistryCameraRegistration.b("cannot use OK status: %s", zzbjvVar));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbjx)) {
            return false;
        }
        zzbjx zzbjxVar = (zzbjx) obj;
        if (zzc() == zzbjxVar.zzc()) {
            return zzc() ? tryOpenCamera.b(this.zzb, zzbjxVar.zzb) : tryOpenCamera.b(this.zza, zzbjxVar.zza);
        }
        return false;
    }

    public final int hashCode() {
        return tryOpenCamera.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.zza, this.zzb);
    }

    public final String toString() {
        zzbjv zzbjvVar = this.zza;
        registerCamera.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new registerCamera.TuitionPaymentFragmentbindingInflater1(getClass().getSimpleName(), (byte) 0);
        if (zzbjvVar == null) {
            Object obj = this.zzb;
            registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.b = obj;
            tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "value";
        } else {
            registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
            tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.b = zzbjvVar;
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Constants.IPC_BUNDLE_KEY_SEND_ERROR;
        }
        return tuitionPaymentFragmentbindingInflater1.toString();
    }

    public final Object zzd() {
        if (this.zza == null) {
            return this.zzb;
        }
        throw new IllegalStateException("No value present.");
    }

    public final zzbjv zze() {
        zzbjv zzbjvVar = this.zza;
        return zzbjvVar == null ? zzbjv.zza : zzbjvVar;
    }

    private zzbjx(zzbjv zzbjvVar, Object obj) {
        this.zza = zzbjvVar;
        this.zzb = obj;
    }

    public static zzbjx zza(Object obj) {
        return new zzbjx(null, obj);
    }

    public final boolean zzc() {
        return this.zza == null;
    }
}
