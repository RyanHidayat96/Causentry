package io.reactivex.internal.operators.single;

import defpackage.BackupHdrProfileEncoderProfilesProvider;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.deriveCodec;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.getDefaultVideoProfile;
import defpackage.readableUs;
import defpackage.scaleBitrate;
import io.reactivex.internal.disposables.CancellableDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class SingleCreate<T> extends deriveCodec<T> {
    public static int TuitionPaymentFragmentbindingInflater1 = -1046646269;
    private scaleBitrate<T> b;

    public SingleCreate(scaleBitrate<T> scalebitrate) {
        this.b = scalebitrate;
    }

    @Override // defpackage.deriveCodec
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(getDefaultVideoProfile<? super T> getdefaultvideoprofile) {
        Emitter emitter = new Emitter(getdefaultvideoprofile);
        getdefaultvideoprofile.onSubscribe(emitter);
        try {
            this.b.subscribe(emitter);
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            if (emitter.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th)) {
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }
    }

    static final class Emitter<T> extends AtomicReference<BufferProviderState> implements BackupHdrProfileEncoderProfilesProvider<T>, BufferProviderState {
        private static final long serialVersionUID = -2467358622224974244L;
        final getDefaultVideoProfile<? super T> downstream;

        Emitter(getDefaultVideoProfile<? super T> getdefaultvideoprofile) {
            this.downstream = getdefaultvideoprofile;
        }

        @Override // defpackage.BackupHdrProfileEncoderProfilesProvider
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

        @Override // defpackage.BackupHdrProfileEncoderProfilesProvider
        public final void TuitionPaymentFragmentbindingInflater1(Throwable th) {
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault1(th)) {
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }

        @Override // defpackage.BackupHdrProfileEncoderProfilesProvider
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

        @Override // defpackage.BackupHdrProfileEncoderProfilesProvider
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
