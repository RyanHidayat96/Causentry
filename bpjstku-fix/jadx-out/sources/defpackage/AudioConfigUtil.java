package defpackage;

import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes4.dex */
public final class AudioConfigUtil {
    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(CoroutineContext coroutineContext, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) coroutineContext.get(CoroutineExceptionHandler.INSTANCE);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(coroutineContext, th);
            } else {
                lambdafetchData0androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault1(coroutineContext, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                ExceptionsKt.addSuppressed(runtimeException, th);
                th = runtimeException;
            }
            lambdafetchData0androidxcameravideointernalencoderEncoderImplByteBufferInput.TuitionPaymentFragmentspecialinlinedviewModeldefault1(coroutineContext, th);
        }
    }

    public static final class b extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        private /* synthetic */ Function2<CoroutineContext, Throwable, Unit> b;

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(CoroutineContext coroutineContext, Throwable th) {
            throw null;
        }
    }
}
