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
public final class ObservableIntervalRange extends VideoRecordEventStart<Long> {
    private long TuitionPaymentFragmentbindingInflater1;
    private appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private long b;
    private TimeUnit g;

    public ObservableIntervalRange(long j, long j2, long j3, long j4, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j3;
        this.b = j4;
        this.g = timeUnit;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = appendbackupvideoprofile;
        this.TuitionPaymentFragmentbindingInflater1 = j;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j2;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super Long> derivemediatype) {
        IntervalRangeObserver intervalRangeObserver = new IntervalRangeObserver(derivemediatype, this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        derivemediatype.onSubscribe(intervalRangeObserver);
        appendBackupVideoProfile appendbackupvideoprofile = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (appendbackupvideoprofile instanceof AudioTimestampFramePositionIncorrectQuirk) {
            appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2 = appendbackupvideoprofile.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            DisposableHelper.TuitionPaymentFragmentbindingInflater1(intervalRangeObserver, tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            tuitionPaymentFragmentspecialinlinedviewModeldefault3TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(intervalRangeObserver, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.b, this.g);
            return;
        }
        DisposableHelper.TuitionPaymentFragmentbindingInflater1(intervalRangeObserver, appendbackupvideoprofile.TuitionPaymentFragmentbindingInflater1(intervalRangeObserver, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.b, this.g));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class IntervalRangeObserver extends AtomicReference<BufferProviderState> implements BufferProviderState, Runnable {
        private static final long serialVersionUID = 1891866368734007884L;
        long count;
        final deriveMediaType<? super Long> downstream;
        final long end;

        IntervalRangeObserver(deriveMediaType<? super Long> derivemediatype, long j, long j2) {
            this.downstream = derivemediatype;
            this.count = j;
            this.end = j2;
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
            long j = this.count;
            this.downstream.onNext(Long.valueOf(j));
            if (j == this.end) {
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
                this.downstream.onComplete();
            } else {
                this.count = j + 1;
            }
        }
    }
}
