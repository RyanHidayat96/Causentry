package com.google.android.libraries.places.internal;

import defpackage.addSignalEosTimeoutIfNeeded;
import defpackage.onEncodePaused;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes6.dex */
final class zzru implements addSignalEosTimeoutIfNeeded {
    final /* synthetic */ onEncodePaused zza;
    final /* synthetic */ Function2 zzb;

    @Override // defpackage.addSignalEosTimeoutIfNeeded
    public final Object emit(Object obj, Continuation continuation) {
        onEncodePaused onencodepaused = this.zza;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault1 = onencodepaused.TuitionPaymentFragmentspecialinlinedviewModeldefault1(b.async$default(onencodepaused, null, null, new zzrt(this.zzb, obj, null), 3, null), continuation);
        return objTuitionPaymentFragmentspecialinlinedviewModeldefault1 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objTuitionPaymentFragmentspecialinlinedviewModeldefault1 : Unit.INSTANCE;
    }

    zzru(onEncodePaused onencodepaused, Function2 function2) {
        this.zza = onencodepaused;
        this.zzb = function2;
    }
}
