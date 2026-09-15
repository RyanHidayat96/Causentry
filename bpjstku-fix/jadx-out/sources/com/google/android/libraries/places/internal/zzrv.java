package com.google.android.libraries.places.internal;

import defpackage.clampVideoBitrateIfNotSupported;
import defpackage.onEncodePaused;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
final class zzrv extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ clampVideoBitrateIfNotSupported zzb;
    final /* synthetic */ Function2 zzc;
    private /* synthetic */ Object zzd;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzrv) create((onEncodePaused) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        ResultKt.throwOnFailure(obj);
        if (i == 0) {
            onEncodePaused onencodepaused = (onEncodePaused) this.zzd;
            this.zza = 1;
            if (this.zzb.collect(new zzru(onencodepaused, this.zzc), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzrv(clampVideoBitrateIfNotSupported clampvideobitrateifnotsupported, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.zzb = clampvideobitrateifnotsupported;
        this.zzc = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzrv zzrvVar = new zzrv(this.zzb, this.zzc, continuation);
        zzrvVar.zzd = obj;
        return zzrvVar;
    }
}
