package defpackage;

import java.util.Iterator;
import kotlin.ExceptionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.internal.DiagnosticCoroutineContextException;
import kotlinx.coroutines.internal.ExceptionSuccessfullyProcessed;

/* JADX INFO: loaded from: classes4.dex */
public final class lambdafetchData0androidxcameravideointernalencoderEncoderImplByteBufferInput {
    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(CoroutineContext coroutineContext, Throwable th) {
        RuntimeException runtimeException;
        Iterator<CoroutineExceptionHandler> it = EncoderImplByteBufferInputExternalSyntheticLambda1.b().iterator();
        while (it.hasNext()) {
            try {
                it.next().handleException(coroutineContext, th);
            } catch (ExceptionSuccessfullyProcessed unused) {
                return;
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    ExceptionsKt.addSuppressed(runtimeException, th);
                }
                EncoderImplByteBufferInputExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(runtimeException);
            }
        }
        try {
            ExceptionsKt.addSuppressed(th, new DiagnosticCoroutineContextException(coroutineContext));
        } catch (Throwable unused2) {
        }
        EncoderImplByteBufferInputExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th);
    }
}
