package io.reactivex.internal.operators.observable;

import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.ExcludeStretchedVideoQualityQuirk;
import defpackage.appendBackupVideoProfile;
import defpackage.deriveMediaType;
import defpackage.notifySuspended;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableDebounceTimed<T> extends notifySuspended<T, T> {
    private TimeUnit TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private appendBackupVideoProfile TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public ObservableDebounceTimed(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, long j, TimeUnit timeUnit, appendBackupVideoProfile appendbackupvideoprofile) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = timeUnit;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = appendbackupvideoprofile;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new b(new ExcludeStretchedVideoQualityQuirk(derivemediatype), this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2()));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class b<T> implements deriveMediaType<T>, BufferProviderState {
        final deriveMediaType<? super T> TuitionPaymentFragmentbindingInflater1;
        private BufferProviderState TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        volatile long TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private TimeUnit asBinder;
        private appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 asInterface;
        private boolean b;
        private BufferProviderState d;

        b(deriveMediaType<? super T> derivemediatype, long j, TimeUnit timeUnit, appendBackupVideoProfile.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3) {
            this.TuitionPaymentFragmentbindingInflater1 = derivemediatype;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
            this.asBinder = timeUnit;
            this.asInterface = tuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.d, bufferProviderState)) {
                this.d = bufferProviderState;
                this.TuitionPaymentFragmentbindingInflater1.onSubscribe(this);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (this.b) {
                return;
            }
            long j = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = j;
            BufferProviderState bufferProviderState = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (bufferProviderState != null) {
                bufferProviderState.dispose();
            }
            DebounceEmitter debounceEmitter = new DebounceEmitter(t, j, this);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = debounceEmitter;
            DisposableHelper.b((AtomicReference<BufferProviderState>) debounceEmitter, this.asInterface.TuitionPaymentFragmentbindingInflater1(debounceEmitter, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.asBinder));
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (this.b) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                return;
            }
            BufferProviderState bufferProviderState = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (bufferProviderState != null) {
                bufferProviderState.dispose();
            }
            this.b = true;
            this.TuitionPaymentFragmentbindingInflater1.onError(th);
            this.asInterface.dispose();
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.b) {
                return;
            }
            this.b = true;
            BufferProviderState bufferProviderState = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (bufferProviderState != null) {
                bufferProviderState.dispose();
            }
            DebounceEmitter debounceEmitter = (DebounceEmitter) bufferProviderState;
            if (debounceEmitter != null) {
                debounceEmitter.run();
            }
            this.TuitionPaymentFragmentbindingInflater1.onComplete();
            this.asInterface.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.d.dispose();
            this.asInterface.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.asInterface.isDisposed();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class DebounceEmitter<T> extends AtomicReference<BufferProviderState> implements Runnable, BufferProviderState {
        private static final long serialVersionUID = 6812032969491025141L;
        final long idx;
        final AtomicBoolean once = new AtomicBoolean();
        final b<T> parent;
        final T value;

        DebounceEmitter(T t, long j, b<T> bVar) {
            this.value = t;
            this.idx = j;
            this.parent = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.once.compareAndSet(false, true)) {
                b<T> bVar = this.parent;
                long j = this.idx;
                T t = this.value;
                if (j == bVar.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    bVar.TuitionPaymentFragmentbindingInflater1.onNext(t);
                    dispose();
                }
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return get() == DisposableHelper.DISPOSED;
        }
    }
}
