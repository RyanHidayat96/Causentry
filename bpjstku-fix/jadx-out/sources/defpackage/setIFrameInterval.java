package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: loaded from: classes4.dex */
public final class setIFrameInterval<U, T extends U> extends onOutputBufferAvailable<T> implements Runnable {
    public final long TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public setIFrameInterval(long j, Continuation<? super U> continuation) {
        super(continuation.get$context(), continuation);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1((Throwable) TimeoutKt.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, AudioEncoderConfigAudioProfileResolver.TuitionPaymentFragmentspecialinlinedviewModeldefault1(get$context()), this));
    }

    @Override // defpackage.isFHDProblematicDevice, defpackage.AudioEncoderConfigBuilder
    public final String p_() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.p_());
        sb.append("(timeMillis=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        sb.append(')');
        return sb.toString();
    }
}
