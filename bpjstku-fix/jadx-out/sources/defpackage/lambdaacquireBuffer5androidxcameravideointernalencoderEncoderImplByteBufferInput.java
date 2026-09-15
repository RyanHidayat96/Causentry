package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* JADX INFO: loaded from: classes4.dex */
final class lambdaacquireBuffer5androidxcameravideointernalencoderEncoderImplByteBufferInput<T> implements Continuation<T>, CoroutineStackFrame {
    private final CoroutineContext TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Continuation<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lambdaacquireBuffer5androidxcameravideointernalencoderEncoderImplByteBufferInput(Continuation<? super T> continuation, CoroutineContext coroutineContext) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = continuation;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = coroutineContext;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.resumeWith(obj);
    }
}
