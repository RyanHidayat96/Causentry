package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class VideoEncoderConfigVideoProfileResolver {
    public static final <T> T TuitionPaymentFragmentbindingInflater1(CoroutineContext coroutineContext, Function0<? extends T> function0) throws Throwable {
        int i;
        try {
            getStandard getstandard = new getStandard();
            getstandard.b = VideoMimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1(VideoMimeInfo.TuitionPaymentFragmentbindingInflater1(coroutineContext), true, getstandard);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = getStandard.TuitionPaymentFragmentbindingInflater1;
            do {
                i = atomicIntegerFieldUpdater.get(getstandard);
                if (i != 0) {
                    if (i == 2 || i == 3) {
                        break;
                        break;
                    }
                    getStandard.TuitionPaymentFragmentspecialinlinedviewModeldefault2(i);
                    throw new KotlinNothingValueException();
                }
            } while (!getStandard.TuitionPaymentFragmentbindingInflater1.compareAndSet(getstandard, i, 0));
            try {
                return function0.invoke();
            } finally {
                getstandard.asInterface();
            }
        } catch (InterruptedException e2) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e2);
        }
    }
}
