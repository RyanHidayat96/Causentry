package io.reactivex.internal.operators.observable;

import defpackage.VideoRecordEventStart;
import defpackage.deriveMediaType;
import io.reactivex.internal.observers.BasicIntQueueDisposable;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableRangeLong extends VideoRecordEventStart<Long> {
    private final long TuitionPaymentFragmentbindingInflater1;
    private final long b;

    public ObservableRangeLong(long j, long j2) {
        this.b = j;
        this.TuitionPaymentFragmentbindingInflater1 = j2;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super Long> derivemediatype) {
        long j = this.b;
        RangeDisposable rangeDisposable = new RangeDisposable(derivemediatype, j, this.TuitionPaymentFragmentbindingInflater1 + j);
        derivemediatype.onSubscribe(rangeDisposable);
        if (rangeDisposable.fused) {
            return;
        }
        deriveMediaType<? super Long> derivemediatype2 = rangeDisposable.downstream;
        long j2 = rangeDisposable.end;
        for (long j3 = rangeDisposable.index; j3 != j2 && rangeDisposable.get() == 0; j3++) {
            derivemediatype2.onNext(Long.valueOf(j3));
        }
        if (rangeDisposable.get() == 0) {
            rangeDisposable.lazySet(1);
            derivemediatype2.onComplete();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class RangeDisposable extends BasicIntQueueDisposable<Long> {
        private static final long serialVersionUID = 396518478098735504L;
        final deriveMediaType<? super Long> downstream;
        final long end;
        boolean fused;
        long index;

        RangeDisposable(deriveMediaType<? super Long> derivemediatype, long j, long j2) {
            this.downstream = derivemediatype;
            this.index = j;
            this.end = j2;
        }

        @Override // defpackage.AudioSettingsBuilder
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return this.index == this.end;
        }

        @Override // defpackage.AudioSettingsBuilder
        public final void TuitionPaymentFragmentbindingInflater1() {
            this.index = this.end;
            lazySet(1);
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            set(1);
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return get() != 0;
        }

        @Override // defpackage.VideoValidatedEncoderProfilesProxy
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.fused = true;
            return 1;
        }

        @Override // defpackage.AudioSettingsBuilder
        public final /* synthetic */ Object TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Exception {
            long j = this.index;
            if (j != this.end) {
                this.index = 1 + j;
                return Long.valueOf(j);
            }
            lazySet(1);
            return null;
        }
    }
}
