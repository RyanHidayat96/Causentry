package com.google.android.libraries.places.internal;

import android.os.Process;
import com.google.android.libraries.places.api.model.Place;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpr extends SuspendLambda implements Function2 {
    public static int TuitionPaymentFragmentbindingInflater1;
    public static int b;
    int zza;
    final /* synthetic */ zzpw zzb;
    final /* synthetic */ Place zzc;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzpr) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        ResultKt.throwOnFailure(obj);
        if (i != 0) {
            return obj;
        }
        this.zza = 1;
        Object objZzo = this.zzb.zzo(this.zzc.getPhotoMetadatas(), this);
        return objZzo == coroutine_suspended ? coroutine_suspended : objZzo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzpr(zzpw zzpwVar, Place place, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzpwVar;
        this.zzc = place;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzpr(this.zzb, this.zzc, continuation);
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = b;
        int i2 = i % 7644020;
        b = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentbindingInflater1;
        }
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        TuitionPaymentFragmentbindingInflater1 = startUptimeMillis;
        return startUptimeMillis;
    }
}
