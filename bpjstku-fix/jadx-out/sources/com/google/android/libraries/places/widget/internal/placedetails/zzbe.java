package com.google.android.libraries.places.widget.internal.placedetails;

import com.google.android.libraries.places.internal.zzrw;
import defpackage.createPersistentInputSurface;
import defpackage.lambdarequestKeyFrame8androidxcameravideointernalencoderEncoderImpl;
import defpackage.signalEndOfInputStream;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
final class zzbe extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ List zzb;
    final /* synthetic */ zzbi zzc;
    private /* synthetic */ Object zzd;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbe) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        ResultKt.throwOnFailure(obj);
        if (i == 0) {
            CoroutineScope coroutineScope = (CoroutineScope) this.zzd;
            signalEndOfInputStream.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = new signalEndOfInputStream.TuitionPaymentFragmentbindingInflater1(this.zzb);
            zzbi zzbiVar = this.zzc;
            this.zza = 1;
            Object objCollect = zzrw.zza(tuitionPaymentFragmentbindingInflater1, lambdarequestKeyFrame8androidxcameravideointernalencoderEncoderImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), new zzbd(coroutineScope, zzbiVar, null)).collect(createPersistentInputSurface.INSTANCE, this);
            if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objCollect = Unit.INSTANCE;
            }
            if (objCollect == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbe(List list, zzbi zzbiVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = list;
        this.zzc = zzbiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzbe zzbeVar = new zzbe(this.zzb, this.zzc, continuation);
        zzbeVar.zzd = obj;
        return zzbeVar;
    }
}
