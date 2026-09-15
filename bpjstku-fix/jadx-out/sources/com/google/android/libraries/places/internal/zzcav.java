package com.google.android.libraries.places.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.registerCamera;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
final class zzcav extends zzbhy {
    private final List zza;
    private final AtomicInteger zzb;
    private final int zzc;

    public zzcav(List list, AtomicInteger atomicInteger) {
        if (!(!list.isEmpty())) {
            throw new IllegalArgumentException("empty list");
        }
        this.zza = list;
        if (atomicInteger == null) {
            throw new NullPointerException(FirebaseAnalytics.Param.INDEX);
        }
        this.zzb = atomicInteger;
        Iterator it = list.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((zzbhy) it.next()).hashCode();
        }
        this.zzc = iHashCode;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcav)) {
            return false;
        }
        zzcav zzcavVar = (zzcav) obj;
        if (zzcavVar == this) {
            return true;
        }
        if (this.zzc == zzcavVar.zzc && this.zzb == zzcavVar.zzb) {
            List list = this.zza;
            int size = list.size();
            List list2 = zzcavVar.zza;
            if (size == list2.size() && new HashSet(list).containsAll(list2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzbhy
    public final zzbht zza(zzbhu zzbhuVar) {
        int andIncrement = this.zzb.getAndIncrement();
        List list = this.zza;
        return ((zzbhy) list.get((andIncrement & Integer.MAX_VALUE) % list.size())).zza(zzbhuVar);
    }

    public final String toString() {
        registerCamera.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new registerCamera.TuitionPaymentFragmentbindingInflater1(zzcav.class.getSimpleName(), (byte) 0);
        List list = this.zza;
        registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new registerCamera.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = tuitionPaymentFragmentspecialinlinedviewModeldefault2;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.b = list;
        tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = "subchannelPickers";
        return tuitionPaymentFragmentbindingInflater1.toString();
    }

    public final int hashCode() {
        return this.zzc;
    }
}
