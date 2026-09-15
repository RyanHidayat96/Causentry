package io.reactivex.internal.operators.maybe;

import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.VideoRecordEventResume;
import defpackage.VideoSpec;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.errorToString;
import defpackage.getOutputResults;
import defpackage.readableUs;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class MaybeCreate<T> extends VideoRecordEventResume<T> {
    private VideoSpec<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public MaybeCreate(VideoSpec<T> videoSpec) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = videoSpec;
    }

    @Override // defpackage.VideoRecordEventResume
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(errorToString<? super T> errortostring) {
        Emitter emitter = new Emitter(errortostring);
        errortostring.onSubscribe(emitter);
        try {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1(emitter);
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            if (emitter.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th)) {
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class Emitter<T> extends AtomicReference<BufferProviderState> implements getOutputResults<T>, BufferProviderState {
        private static final long serialVersionUID = -2467358622224974244L;
        final errorToString<? super T> downstream;

        Emitter(errorToString<? super T> errortostring) {
            this.downstream = errortostring;
        }

        @Override // defpackage.getOutputResults
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(T t) {
            BufferProviderState andSet;
            if (get() == DisposableHelper.DISPOSED || (andSet = getAndSet(DisposableHelper.DISPOSED)) == DisposableHelper.DISPOSED) {
                return;
            }
            try {
                if (t == null) {
                    this.downstream.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.downstream.b(t);
                }
                if (andSet != null) {
                    andSet.dispose();
                }
            } catch (Throwable th) {
                if (andSet != null) {
                    andSet.dispose();
                }
                throw th;
            }
        }

        @Override // defpackage.getOutputResults
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
            BufferProviderState andSet;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (get() == DisposableHelper.DISPOSED || (andSet = getAndSet(DisposableHelper.DISPOSED)) == DisposableHelper.DISPOSED) {
                return false;
            }
            try {
                this.downstream.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // defpackage.getOutputResults
        public final void TuitionPaymentFragmentbindingInflater1() {
            BufferProviderState andSet;
            if (get() == DisposableHelper.DISPOSED || (andSet = getAndSet(DisposableHelper.DISPOSED)) == DisposableHelper.DISPOSED) {
                return;
            }
            try {
                this.downstream.onComplete();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // defpackage.getOutputResults
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(readableUs readableus) {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, new CancellableDisposable(readableus));
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return DisposableHelper.TuitionPaymentFragmentbindingInflater1(get());
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }
    }
}
