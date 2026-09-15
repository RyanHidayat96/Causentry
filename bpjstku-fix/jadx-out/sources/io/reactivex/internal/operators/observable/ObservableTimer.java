package io.reactivex.internal.operators.observable;

import defpackage.BufferProviderState;
import defpackage.VideoRecordEventStart;
import defpackage.appendBackupVideoProfile;
import defpackage.deriveMediaType;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableTimer extends VideoRecordEventStart<Long> {
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private TimeUnit b;

    public ObservableTimer(long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
        this.b = timeUnit;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = appendbackupvideoprofile;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super Long> derivemediatype) {
        TimerObserver timerObserver = new TimerObserver(derivemediatype);
        derivemediatype.onSubscribe(timerObserver);
        DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(timerObserver, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(timerObserver, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.b));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TimerObserver extends AtomicReference<BufferProviderState> implements BufferProviderState, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        final deriveMediaType<? super Long> downstream;

        TimerObserver(deriveMediaType<? super Long> derivemediatype) {
            this.downstream = derivemediatype;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (isDisposed()) {
                return;
            }
            this.downstream.onNext(0L);
            lazySet(EmptyDisposable.INSTANCE);
            this.downstream.onComplete();
        }
    }
}
