package defpackage;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class isX650<T> extends isFHDProblematicDevice<T> {
    private final Thread TuitionPaymentFragmentbindingInflater1;
    private final AutoValue_AudioMimeInfoBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Override // defpackage.AudioEncoderConfigBuilder
    protected final boolean TuitionPaymentFragmentbindingInflater1() {
        return true;
    }

    public isX650(CoroutineContext coroutineContext, Thread thread, AutoValue_AudioMimeInfoBuilder autoValue_AudioMimeInfoBuilder) {
        super(coroutineContext, true, true);
        this.TuitionPaymentFragmentbindingInflater1 = thread;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = autoValue_AudioMimeInfoBuilder;
    }

    @Override // defpackage.AudioEncoderConfigBuilder
    protected final void a_(Object obj) {
        if (Intrinsics.areEqual(Thread.currentThread(), this.TuitionPaymentFragmentbindingInflater1)) {
            return;
        }
        LockSupport.unpark(this.TuitionPaymentFragmentbindingInflater1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T b() throws Throwable {
        AutoValue_AudioMimeInfoBuilder autoValue_AudioMimeInfoBuilder = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (autoValue_AudioMimeInfoBuilder != null) {
            autoValue_AudioMimeInfoBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault1(false);
        }
        while (!Thread.interrupted()) {
            try {
                AutoValue_AudioMimeInfoBuilder autoValue_AudioMimeInfoBuilder2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                long jG = autoValue_AudioMimeInfoBuilder2 != null ? autoValue_AudioMimeInfoBuilder2.g() : Long.MAX_VALUE;
                if (cancel()) {
                    AutoValue_AudioMimeInfoBuilder autoValue_AudioMimeInfoBuilder3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (autoValue_AudioMimeInfoBuilder3 != null) {
                        autoValue_AudioMimeInfoBuilder3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(false);
                    }
                    T t = (T) AudioEncoderInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getInterfaceDescriptor());
                    isVivoY91i isvivoy91i = t instanceof isVivoY91i ? (isVivoY91i) t : null;
                    if (isvivoy91i == null) {
                        return t;
                    }
                    throw isvivoy91i.TuitionPaymentFragmentbindingInflater1;
                }
                LockSupport.parkNanos(this, jG);
            } catch (Throwable th) {
                AutoValue_AudioMimeInfoBuilder autoValue_AudioMimeInfoBuilder4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (autoValue_AudioMimeInfoBuilder4 != null) {
                    autoValue_AudioMimeInfoBuilder4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        TuitionPaymentFragmentspecialinlinedviewModeldefault1((Throwable) interruptedException);
        throw interruptedException;
    }
}
