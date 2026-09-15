package com.google.android.libraries.places.internal;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.getCloseFuture;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeq implements zzapa {
    private static final zzbil zzb = zzbil.zzc("Cookie", zzbip.zza);
    private ListenableFuture zza;
    private final zzeo zzc;

    @Override // com.google.android.libraries.places.internal.zzapa
    public final zzaqg zza(zzaoy zzaoyVar) {
        Intrinsics.checkNotNullParameter(zzaoyVar, "");
        ListenableFuture listenableFutureZza = this.zzc.zza();
        this.zza = listenableFutureZza;
        zzaqg zzaqgVarZzb = zzaqg.zzb(listenableFutureZza);
        Intrinsics.checkNotNullExpressionValue(zzaqgVarZzb, "");
        return zzaqgVarZzb;
    }

    @Override // com.google.android.libraries.places.internal.zzapa
    public final zzaqg zzb(zzaoy zzaoyVar) {
        Intrinsics.checkNotNullParameter(zzaoyVar, "");
        ListenableFuture listenableFuture = this.zza;
        if (listenableFuture == null) {
            zzaqg zzaqgVarZza = zzaqg.zza();
            Intrinsics.checkNotNullExpressionValue(zzaqgVarZza, "");
            return zzaqgVarZza;
        }
        try {
            Intrinsics.checkNotNull(listenableFuture);
            Object objB = getCloseFuture.b(listenableFuture);
            Intrinsics.checkNotNullExpressionValue(objB, "");
            String str = (String) objB;
            if (!Intrinsics.areEqual(str, "")) {
                zzbip zzbipVarZzb = zzaoyVar.zzb();
                zzbil zzbilVar = zzb;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4);
                sb.append("NID=");
                sb.append(str);
                zzbipVarZzb.zzc(zzbilVar, sb.toString());
            }
        } catch (Exception unused) {
        }
        zzaqg zzaqgVarZza2 = zzaqg.zza();
        Intrinsics.checkNotNullExpressionValue(zzaqgVarZza2, "");
        return zzaqgVarZza2;
    }

    public zzeq(zzeo zzeoVar) {
        Intrinsics.checkNotNullParameter(zzeoVar, "");
        this.zzc = zzeoVar;
    }
}
