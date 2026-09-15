package io.reactivex.internal.operators.observable;

import defpackage.VideoRecordEventStart;
import defpackage.deriveMediaType;
import io.reactivex.internal.observers.BasicIntQueueDisposable;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableRange extends VideoRecordEventStart<Integer> {
    private final int TuitionPaymentFragmentbindingInflater1;
    private final long TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public ObservableRange(int i, int i2) {
        this.TuitionPaymentFragmentbindingInflater1 = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = ((long) i) + ((long) i2);
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super Integer> derivemediatype) {
        RangeDisposable rangeDisposable = new RangeDisposable(derivemediatype, this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        derivemediatype.onSubscribe(rangeDisposable);
        if (rangeDisposable.fused) {
            return;
        }
        deriveMediaType<? super Integer> derivemediatype2 = rangeDisposable.downstream;
        long j = rangeDisposable.end;
        for (long j2 = rangeDisposable.index; j2 != j && rangeDisposable.get() == 0; j2++) {
            derivemediatype2.onNext(Integer.valueOf((int) j2));
        }
        if (rangeDisposable.get() == 0) {
            rangeDisposable.lazySet(1);
            derivemediatype2.onComplete();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class RangeDisposable extends BasicIntQueueDisposable<Integer> {
        private static final long serialVersionUID = 396518478098735504L;
        final deriveMediaType<? super Integer> downstream;
        final long end;
        boolean fused;
        long index;

        RangeDisposable(deriveMediaType<? super Integer> derivemediatype, long j, long j2) {
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
                return Integer.valueOf((int) j);
            }
            lazySet(1);
            return null;
        }
    }
}
