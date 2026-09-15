package com.google.android.libraries.places.internal;

import defpackage.getContainerClass;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeu implements getContainerClass {
    final /* synthetic */ zzev zza;

    @Override // defpackage.getContainerClass
    public final void onFailure(Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
    }

    @Override // defpackage.getContainerClass
    public final /* synthetic */ void onSuccess(Object obj) {
        zzbdr zzbdrVar = (zzbdr) obj;
        Intrinsics.checkNotNullParameter(zzbdrVar, "");
        String strZzc = zzbdrVar.zzc();
        Intrinsics.checkNotNullExpressionValue(strZzc, "");
        if (strZzc.length() > 0) {
            zzeo zzeoVar = this.zza.zzc;
            String strZzc2 = zzbdrVar.zzc();
            Intrinsics.checkNotNullExpressionValue(strZzc2, "");
            zzeoVar.zzb(strZzc2);
        }
    }

    zzeu(zzev zzevVar) {
        this.zza = zzevVar;
    }
}
