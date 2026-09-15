package defpackage;

import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes4.dex */
public final class AudioSource<T> extends CountDownLatch implements getDefaultVideoProfile<T>, VideoOutputSourceState, errorToString<T> {
    private Throwable TuitionPaymentFragmentbindingInflater1;
    private T TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private volatile boolean b;

    public AudioSource() {
        super(1);
    }

    @Override // defpackage.getDefaultVideoProfile
    public final void onSubscribe(BufferProviderState bufferProviderState) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = bufferProviderState;
        if (this.b) {
            bufferProviderState.dispose();
        }
    }

    @Override // defpackage.getDefaultVideoProfile
    public final void b(T t) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = t;
        countDown();
    }

    @Override // defpackage.getDefaultVideoProfile
    public final void onError(Throwable th) {
        this.TuitionPaymentFragmentbindingInflater1 = th;
        countDown();
    }

    @Override // defpackage.VideoOutputSourceState, defpackage.errorToString
    public final void onComplete() {
        countDown();
    }

    public final T TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        if (getCount() != 0) {
            try {
                await();
            } catch (InterruptedException e2) {
                this.b = true;
                BufferProviderState bufferProviderState = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (bufferProviderState != null) {
                    bufferProviderState.dispose();
                }
                throw ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(e2);
            }
        }
        Throwable th = this.TuitionPaymentFragmentbindingInflater1;
        if (th != null) {
            throw ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th);
        }
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }
}
