package com.google.android.gms.internal.mlkit_common;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.AbstractMap;

/* JADX INFO: loaded from: classes3.dex */
final class zzav extends zzao {
    final /* synthetic */ zzaw zza;

    zzav(zzaw zzawVar) {
        this.zza = zzawVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        zzac.zza(i, this.zza.zzc, FirebaseAnalytics.Param.INDEX);
        zzaw zzawVar = this.zza;
        int i2 = i + i;
        Object obj = zzawVar.zzb[i2];
        obj.getClass();
        Object obj2 = zzawVar.zzb[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}
