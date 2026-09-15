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
public final class AudioEncoderInfoImpl<T> extends resolveAudioSourceFormat<T> {
    private final Continuation<Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public AudioEncoderInfoImpl(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        super(coroutineContext, false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = IntrinsicsKt.createCoroutineUnintercepted(function2, this, this);
    }

    @Override // defpackage.AudioEncoderConfigBuilder
    protected final void INotificationSideChannelDefault() {
        AudioEncoderInfoImpl<T> audioEncoderInfoImpl = this;
        try {
            Continuation continuationIntercepted = IntrinsicsKt.intercepted(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            Result.Companion companion = Result.INSTANCE;
            EncoderImplByteBufferInputExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1(continuationIntercepted, Result.m8024constructorimpl(Unit.INSTANCE));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            audioEncoderInfoImpl.resumeWith(Result.m8024constructorimpl(ResultKt.createFailure(th)));
            throw th;
        }
    }
}
