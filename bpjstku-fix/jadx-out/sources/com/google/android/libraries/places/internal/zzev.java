package com.google.android.libraries.places.internal;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.ConstantObservableExternalSyntheticLambda0;
import defpackage.DeferrableSurfaceExternalSyntheticLambda1;
import defpackage.getCloseFuture;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class zzev implements zzer {
    private final zzbif zza;
    private final DeferrableSurfaceExternalSyntheticLambda1 zzb;
    private final zzeo zzc;

    static /* synthetic */ ListenableFuture zzc(zzev zzevVar, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        zzbdt zzbdtVarZzb = zzbdu.zzb(zzevVar.zza);
        zzbdo zzbdoVarZzc = zzbdp.zzc();
        zzbdoVarZzc.zza(str);
        return zzcaj.zzb(zzbdtVarZzb.zzc().zza(zzbdu.zza(), zzbdtVarZzb.zzd()), (zzbdp) zzbdoVarZzc.zzG());
    }

    @Override // com.google.android.libraries.places.internal.zzer
    public final void zza() {
        ListenableFuture listenableFutureZza = this.zzc.zza();
        final Function1 function1 = new Function1() { // from class: com.google.android.libraries.places.internal.zzet
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                return zzev.zzc(this.zza, (String) obj);
            }
        };
        ConstantObservableExternalSyntheticLambda0 constantObservableExternalSyntheticLambda0 = new ConstantObservableExternalSyntheticLambda0() { // from class: com.google.android.libraries.places.internal.zzes
            @Override // defpackage.ConstantObservableExternalSyntheticLambda0
            public final /* synthetic */ ListenableFuture apply(Object obj) {
                return (ListenableFuture) function1.invoke(obj);
            }
        };
        DeferrableSurfaceExternalSyntheticLambda1 deferrableSurfaceExternalSyntheticLambda1 = this.zzb;
        getCloseFuture.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getCloseFuture.b(listenableFutureZza, constantObservableExternalSyntheticLambda0, deferrableSurfaceExternalSyntheticLambda1), new zzeu(this), deferrableSurfaceExternalSyntheticLambda1);
    }

    @Override // com.google.android.libraries.places.internal.zzer
    public final void zzb() {
        this.zza.zzd();
    }

    public zzev(zzbif zzbifVar, zzeo zzeoVar, DeferrableSurfaceExternalSyntheticLambda1 deferrableSurfaceExternalSyntheticLambda1) {
        Intrinsics.checkNotNullParameter(zzbifVar, "");
        Intrinsics.checkNotNullParameter(zzeoVar, "");
        Intrinsics.checkNotNullParameter(deferrableSurfaceExternalSyntheticLambda1, "");
        this.zza = zzbifVar;
        this.zzc = zzeoVar;
        this.zzb = deferrableSurfaceExternalSyntheticLambda1;
    }
}
