package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class getBitrateRange extends setColorFormat {
    private final Continuation<Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public getBitrateRange(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        super(coroutineContext, false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = IntrinsicsKt.createCoroutineUnintercepted(function2, this, this);
    }

    @Override // defpackage.AudioEncoderConfigBuilder
    protected final void INotificationSideChannelDefault() {
        getBitrateRange getbitraterange = this;
        try {
            Continuation continuationIntercepted = IntrinsicsKt.intercepted(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            Result.Companion companion = Result.INSTANCE;
            EncoderImplByteBufferInputExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1(continuationIntercepted, Result.m8024constructorimpl(Unit.INSTANCE));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            getbitraterange.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(th)));
            throw th;
        }
    }
}
