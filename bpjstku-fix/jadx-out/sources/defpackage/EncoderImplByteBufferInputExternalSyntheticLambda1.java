package defpackage;

import java.util.Collection;
import java.util.ServiceLoader;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes4.dex */
public final class EncoderImplByteBufferInputExternalSyntheticLambda1 {
    private static final Collection<CoroutineExceptionHandler> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = SequencesKt.toList(SequencesKt.asSequence(ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator()));

    public static final Collection<CoroutineExceptionHandler> b() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
