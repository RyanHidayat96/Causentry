package io.reactivex.internal.operators.single;

import defpackage.BufferProviderState;
import defpackage.appendBackupVideoProfile;
import defpackage.deriveCodec;
import defpackage.generateBackupProfile;
import defpackage.getDefaultVideoProfile;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class SingleObserveOn<T> extends deriveCodec<T> {
    private generateBackupProfile<T> TuitionPaymentFragmentbindingInflater1;
    private appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public SingleObserveOn(generateBackupProfile<T> generatebackupprofile, appendBackupVideoProfile appendbackupvideoprofile) {
        this.TuitionPaymentFragmentbindingInflater1 = generatebackupprofile;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = appendbackupvideoprofile;
    }

    @Override // defpackage.deriveCodec
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super T> getdefaultvideoprofile) {
        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(new ObserveOnSingleObserver(getdefaultvideoprofile, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
    }

    static final class ObserveOnSingleObserver<T> extends AtomicReference<BufferProviderState> implements getDefaultVideoProfile<T>, BufferProviderState, Runnable {
        private static final long serialVersionUID = 3528003840217436037L;
        final getDefaultVideoProfile<? super T> downstream;
        Throwable error;
        final appendBackupVideoProfile scheduler;
        T value;

        ObserveOnSingleObserver(getDefaultVideoProfile<? super T> getdefaultvideoprofile, appendBackupVideoProfile appendbackupvideoprofile) {
            this.downstream = getdefaultvideoprofile;
            this.scheduler = appendbackupvideoprofile;
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState)) {
                this.downstream.onSubscribe(this);
            }
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void b(T t) {
            this.value = t;
            DisposableHelper.b((AtomicReference<BufferProviderState>) this, this.scheduler.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this));
        }

        @Override // defpackage.getDefaultVideoProfile
        public final void onError(Throwable th) {
            this.error = th;
            DisposableHelper.b((AtomicReference<BufferProviderState>) this, this.scheduler.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th = this.error;
            if (th != null) {
                this.downstream.onError(th);
            } else {
                this.downstream.b(this.value);
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return DisposableHelper.TuitionPaymentFragmentbindingInflater1(get());
        }
    }
}
