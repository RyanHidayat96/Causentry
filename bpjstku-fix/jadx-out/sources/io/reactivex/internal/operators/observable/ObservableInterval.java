package io.reactivex.internal.operators.observable;

import defpackage.AudioTimestampFramePositionIncorrectQuirk;
import defpackage.BufferProviderState;
import defpackage.VideoRecordEventStart;
import defpackage.appendBackupVideoProfile;
import defpackage.deriveMediaType;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableInterval extends VideoRecordEventStart<Long> {
    private TimeUnit TuitionPaymentFragmentbindingInflater1;
    private appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private long b;

    public ObservableInterval(long j, long j2, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j;
        this.b = j2;
        this.TuitionPaymentFragmentbindingInflater1 = timeUnit;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = appendbackupvideoprofile;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super Long> derivemediatype) {
        IntervalObserver intervalObserver = new IntervalObserver(derivemediatype);
        derivemediatype.onSubscribe(intervalObserver);
        appendBackupVideoProfile appendbackupvideoprofile = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (appendbackupvideoprofile instanceof AudioTimestampFramePositionIncorrectQuirk) {
            appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = appendbackupvideoprofile.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            DisposableHelper.TuitionPaymentFragmentbindingInflater1(intervalObserver, tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(intervalObserver, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.b, this.TuitionPaymentFragmentbindingInflater1);
            return;
        }
        DisposableHelper.TuitionPaymentFragmentbindingInflater1(intervalObserver, appendbackupvideoprofile.TuitionPaymentFragmentbindingInflater1(intervalObserver, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.b, this.TuitionPaymentFragmentbindingInflater1));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class IntervalObserver extends AtomicReference<BufferProviderState> implements BufferProviderState, Runnable {
        private static final long serialVersionUID = 346773832286157679L;
        long count;
        final deriveMediaType<? super Long> downstream;

        IntervalObserver(deriveMediaType<? super Long> derivemediatype) {
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
            if (get() != DisposableHelper.DISPOSED) {
                deriveMediaType<? super Long> derivemediatype = this.downstream;
                long j = this.count;
                this.count = 1 + j;
                derivemediatype.onNext(Long.valueOf(j));
            }
        }
    }
}
