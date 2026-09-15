package com.google.android.libraries.places.internal;

import androidx.autofill.HintConstants;
import defpackage.CameraStateRegistryCameraRegistration;
import defpackage.registerCamera;
import defpackage.tryOpenCamera;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbgt extends zzbjm {
    private final SocketAddress zza;
    private final InetSocketAddress zzb;
    private final String zzc;
    private final String zzd;

    /* synthetic */ zzbgt(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2, byte[] bArr) {
        if (socketAddress == null) {
            throw new NullPointerException("proxyAddress");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("targetAddress");
        }
        if ((socketAddress instanceof InetSocketAddress) && !(!((InetSocketAddress) socketAddress).isUnresolved())) {
            throw new IllegalStateException(CameraStateRegistryCameraRegistration.b("The proxy address %s is not resolved", socketAddress));
        }
        this.zza = socketAddress;
        this.zzb = inetSocketAddress;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbgt)) {
            return false;
        }
        zzbgt zzbgtVar = (zzbgt) obj;
        return tryOpenCamera.b(this.zza, zzbgtVar.zza) && tryOpenCamera.b(this.zzb, zzbgtVar.zzb) && tryOpenCamera.b(this.zzc, zzbgtVar.zzc) && tryOpenCamera.b(this.zzd, zzbgtVar.zzd);
    }

    public final int hashCode() {
        return tryOpenCamera.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final String toString() {
        byte b = 0;
        registerCamera.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new registerCamera.TuitionPaymentFragmentbindingInflater1(getClass().getSimpleName(), b);
        SocketAddress socketAddress = this.zza;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.b = socketAddress;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "proxyAddr";
        InetSocketAddress inetSocketAddress = this.zzb;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.b = inetSocketAddress;
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "targetAddr";
        String str = this.zzc;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault4;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault4;
        tuitionPaymentFragmentspecialinlinedviewModeldefault4.b = str;
        tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = HintConstants.AUTOFILL_HINT_USERNAME;
        String strValueOf = String.valueOf(this.zzd != null);
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault5 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(b);
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault5;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault5;
        tuitionPaymentFragmentspecialinlinedviewModeldefault5.b = strValueOf;
        tuitionPaymentFragmentspecialinlinedviewModeldefault5.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "hasPassword";
        return tuitionPaymentFragmentbindingInflater1.toString();
    }

    public static zzbgs zze() {
        return new zzbgs(null);
    }

    public final String zza() {
        return this.zzd;
    }

    public final String zzb() {
        return this.zzc;
    }

    public final SocketAddress zzc() {
        return this.zza;
    }

    public final InetSocketAddress zzd() {
        return this.zzb;
    }
}
