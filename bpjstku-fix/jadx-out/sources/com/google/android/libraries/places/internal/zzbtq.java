package com.google.android.libraries.places.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.tryOpenCamera;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbtq extends zzbhu {
    private final zzbfd zza;
    private final zzbip zzb;
    private final zzbiu zzc;
    private final zzbhs zzd;

    public zzbtq(zzbiu zzbiuVar, zzbip zzbipVar, zzbfd zzbfdVar, zzbhs zzbhsVar) {
        if (zzbiuVar == null) {
            throw new NullPointerException(FirebaseAnalytics.Param.METHOD);
        }
        this.zzc = zzbiuVar;
        if (zzbipVar == null) {
            throw new NullPointerException("headers");
        }
        this.zzb = zzbipVar;
        if (zzbfdVar == null) {
            throw new NullPointerException("callOptions");
        }
        this.zza = zzbfdVar;
        if (zzbhsVar == null) {
            throw new NullPointerException("pickDetailsConsumer");
        }
        this.zzd = zzbhsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzbtq zzbtqVar = (zzbtq) obj;
        return tryOpenCamera.b(this.zza, zzbtqVar.zza) && tryOpenCamera.b(this.zzb, zzbtqVar.zzb) && tryOpenCamera.b(this.zzc, zzbtqVar.zzc) && tryOpenCamera.b(this.zzd, zzbtqVar.zzd);
    }

    public final int hashCode() {
        return tryOpenCamera.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final String toString() {
        zzbfd zzbfdVar = this.zza;
        zzbip zzbipVar = this.zzb;
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(zzbipVar);
        String strValueOf3 = String.valueOf(zzbfdVar);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 17 + String.valueOf(strValueOf2).length() + 13 + String.valueOf(strValueOf3).length() + 1);
        sb.append("[method=");
        sb.append(strValueOf);
        sb.append(" headers=");
        sb.append(strValueOf2);
        sb.append(" callOptions=");
        sb.append(strValueOf3);
        sb.append("]");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbhu
    public final zzbfd zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbhu
    public final zzbip zzb() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzbhu
    public final zzbiu zzc() {
        return this.zzc;
    }
}
