package com.google.android.libraries.places.widget.internal.placedetails;

import com.google.android.libraries.places.api.model.PhotoMetadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
final class zzbd extends SuspendLambda implements Function2 {
    int zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ CoroutineScope zzc;
    final /* synthetic */ zzbi zzd;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbd) create((zzau) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzau zzauVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.zza != 0) {
            zzauVar = (zzau) this.zzb;
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            zzau zzauVar2 = (zzau) this.zzb;
            zzbi zzbiVar = this.zzd;
            PhotoMetadata photoMetadataZza = zzauVar2.zza();
            int iZzb = zzauVar2.zzb();
            this.zzb = zzauVar2;
            this.zza = 1;
            Object objZzo = zzbiVar.zzo(photoMetadataZza, iZzb, this);
            if (objZzo == coroutine_suspended) {
                return coroutine_suspended;
            }
            zzauVar = zzauVar2;
            obj = objZzo;
        }
        zzauVar.zzc().postValue((zzbp) obj);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbd(CoroutineScope coroutineScope, zzbi zzbiVar, Continuation continuation) {
        super(2, continuation);
        this.zzc = coroutineScope;
        this.zzd = zzbiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzbd zzbdVar = new zzbd(this.zzc, this.zzd, continuation);
        zzbdVar.zzb = obj;
        return zzbdVar;
    }
}
