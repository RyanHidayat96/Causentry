package defpackage;

import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class isRealmeC2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void TuitionPaymentFragmentspecialinlinedviewModeldefault2(deriveMediaType<? super T> derivemediatype, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            derivemediatype.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable);
                if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                    derivemediatype.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                } else {
                    derivemediatype.onComplete();
                }
            }
        }
    }
}
