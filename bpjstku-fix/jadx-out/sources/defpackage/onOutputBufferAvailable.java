package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* JADX INFO: loaded from: classes4.dex */
public class onOutputBufferAvailable<T> extends isFHDProblematicDevice<T> implements CoroutineStackFrame {
    public final Continuation<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.AudioEncoderConfigBuilder
    public final boolean TuitionPaymentFragmentbindingInflater1() {
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public onOutputBufferAvailable(CoroutineContext coroutineContext, Continuation<? super T> continuation) {
        super(coroutineContext, true, true);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = continuation;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // defpackage.AudioEncoderConfigBuilder
    public void a_(Object obj) {
        EncoderImplByteBufferInputExternalSyntheticLambda5.TuitionPaymentFragmentbindingInflater1(IntrinsicsKt.intercepted(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3), SignalEosOutputBufferNotComeQuirk.TuitionPaymentFragmentbindingInflater1(obj, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
    }

    @Override // defpackage.isFHDProblematicDevice
    public void TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj) {
        Continuation<T> continuation = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        continuation.resumeWith(SignalEosOutputBufferNotComeQuirk.TuitionPaymentFragmentbindingInflater1(obj, continuation));
    }
}
