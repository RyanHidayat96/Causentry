package defpackage;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class lambdamute7androidxcameravideointernalaudioAudioSource<T> implements getDefaultVideoProfile<T> {
    private AtomicReference<BufferProviderState> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private getDefaultVideoProfile<? super T> b;

    public lambdamute7androidxcameravideointernalaudioAudioSource(AtomicReference<BufferProviderState> atomicReference, getDefaultVideoProfile<? super T> getdefaultvideoprofile) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = atomicReference;
        this.b = getdefaultvideoprofile;
    }

    @Override // defpackage.getDefaultVideoProfile
    public final void onSubscribe(BufferProviderState bufferProviderState) {
        DisposableHelper.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, bufferProviderState);
    }

    @Override // defpackage.getDefaultVideoProfile
    public final void b(T t) {
        this.b.b(t);
    }

    @Override // defpackage.getDefaultVideoProfile
    public final void onError(Throwable th) {
        this.b.onError(th);
    }
}
