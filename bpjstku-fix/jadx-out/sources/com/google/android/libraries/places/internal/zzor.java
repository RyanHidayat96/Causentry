package com.google.android.libraries.places.internal;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import defpackage.setDefaultResolution;
import defpackage.setTargetAspectRatio;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class zzor {
    private final Context zza;

    public final Object zza(Uri uri, zzot zzotVar, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        RequestBuilder requestBuilderB = Glide.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.zza).TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentbindingInflater1(uri).b();
        setDefaultResolution setdefaultresolutionTuitionPaymentFragmentspecialinlinedviewModeldefault2 = requestBuilderB.TuitionPaymentFragmentspecialinlinedviewModeldefault2(zzotVar, null, requestBuilderB, setTargetAspectRatio.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        Intrinsics.checkNotNullExpressionValue(setdefaultresolutionTuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    public zzor(Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.zza = context;
    }
}
