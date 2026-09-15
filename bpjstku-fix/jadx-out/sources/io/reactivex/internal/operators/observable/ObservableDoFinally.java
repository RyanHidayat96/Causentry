package io.reactivex.internal.operators.observable;

import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.SharedByteBuffer;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.formatInterval;
import defpackage.notifySuspended;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableDoFinally<T> extends notifySuspended<T, T> {
    private formatInterval TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public ObservableDoFinally(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, formatInterval formatinterval) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = formatinterval;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new DoFinallyObserver(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2));
    }

    static final class DoFinallyObserver<T> extends BasicIntQueueDisposable<T> implements deriveMediaType<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final deriveMediaType<? super T> downstream;
        final formatInterval onFinally;
        SharedByteBuffer<T> qd;
        boolean syncFused;
        BufferProviderState upstream;

        DoFinallyObserver(deriveMediaType<? super T> derivemediatype, formatInterval formatinterval) {
            this.downstream = derivemediatype;
            this.onFinally = formatinterval;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.upstream, bufferProviderState)) {
                this.upstream = bufferProviderState;
                if (bufferProviderState instanceof SharedByteBuffer) {
                    this.qd = (SharedByteBuffer) bufferProviderState;
                }
                this.downstream.onSubscribe(this);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            this.downstream.onNext(t);
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            this.downstream.onError(th);
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th2) {
                    dumpMediaCodecListForFormat.b(th2);
                    DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th2);
                }
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.downstream.onComplete();
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    dumpMediaCodecListForFormat.b(th);
                    DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                }
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.upstream.dispose();
            if (compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    dumpMediaCodecListForFormat.b(th);
                    DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                }
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // defpackage.VideoValidatedEncoderProfilesProxy
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
            SharedByteBuffer<T> sharedByteBuffer = this.qd;
            if (sharedByteBuffer == null || (i & 4) != 0) {
                return 0;
            }
            int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = sharedByteBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i);
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 != 0) {
                this.syncFused = iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 1;
            }
            return iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }

        @Override // defpackage.AudioSettingsBuilder
        public final void TuitionPaymentFragmentbindingInflater1() {
            this.qd.TuitionPaymentFragmentbindingInflater1();
        }

        @Override // defpackage.AudioSettingsBuilder
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return this.qd.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        @Override // defpackage.AudioSettingsBuilder
        public final T TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Exception {
            T tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.qd.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
            if (tTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null && this.syncFused && compareAndSet(0, 1)) {
                try {
                    this.onFinally.run();
                } catch (Throwable th) {
                    dumpMediaCodecListForFormat.b(th);
                    DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                }
            }
            return tTuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
    }
}
