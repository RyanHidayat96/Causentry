package io.reactivex.internal.operators.observable;

import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.VideoRecordEventStart;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableAmb<T> extends VideoRecordEventStart<T> {
    private AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>[] TuitionPaymentFragmentbindingInflater1;
    private Iterable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public ObservableAmb(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>[] autoValue_VideoValidatedEncoderProfilesProxyArr, Iterable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> iterable) {
        this.TuitionPaymentFragmentbindingInflater1 = autoValue_VideoValidatedEncoderProfilesProxyArr;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iterable;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        int length;
        AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>[] autoValue_VideoValidatedEncoderProfilesProxyArr = this.TuitionPaymentFragmentbindingInflater1;
        if (autoValue_VideoValidatedEncoderProfilesProxyArr == null) {
            autoValue_VideoValidatedEncoderProfilesProxyArr = new AutoValue_VideoValidatedEncoderProfilesProxy[8];
            try {
                length = 0;
                for (AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy : this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    if (autoValue_VideoValidatedEncoderProfilesProxy == null) {
                        EmptyDisposable.b(new NullPointerException("One of the sources is null"), derivemediatype);
                        return;
                    }
                    if (length == autoValue_VideoValidatedEncoderProfilesProxyArr.length) {
                        AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>[] autoValue_VideoValidatedEncoderProfilesProxyArr2 = new AutoValue_VideoValidatedEncoderProfilesProxy[(length >> 2) + length];
                        System.arraycopy(autoValue_VideoValidatedEncoderProfilesProxyArr, 0, autoValue_VideoValidatedEncoderProfilesProxyArr2, 0, length);
                        autoValue_VideoValidatedEncoderProfilesProxyArr = autoValue_VideoValidatedEncoderProfilesProxyArr2;
                    }
                    autoValue_VideoValidatedEncoderProfilesProxyArr[length] = autoValue_VideoValidatedEncoderProfilesProxy;
                    length++;
                }
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                EmptyDisposable.b(th, derivemediatype);
                return;
            }
        } else {
            length = autoValue_VideoValidatedEncoderProfilesProxyArr.length;
        }
        if (length == 0) {
            EmptyDisposable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(derivemediatype);
            return;
        }
        if (length == 1) {
            autoValue_VideoValidatedEncoderProfilesProxyArr[0].subscribe(derivemediatype);
            return;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1(derivemediatype, length);
        AmbInnerObserver<T>[] ambInnerObserverArr = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int length2 = ambInnerObserverArr.length;
        int i = 0;
        while (i < length2) {
            int i2 = i + 1;
            ambInnerObserverArr[i] = new AmbInnerObserver<>(tuitionPaymentFragmentspecialinlinedviewModeldefault1, i2, tuitionPaymentFragmentspecialinlinedviewModeldefault1.b);
            i = i2;
        }
        tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1.lazySet(0);
        tuitionPaymentFragmentspecialinlinedviewModeldefault1.b.onSubscribe(tuitionPaymentFragmentspecialinlinedviewModeldefault1);
        for (int i3 = 0; i3 < length2 && tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1.get() == 0; i3++) {
            autoValue_VideoValidatedEncoderProfilesProxyArr[i3].subscribe(ambInnerObserverArr[i3]);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> implements BufferProviderState {
        final AtomicInteger TuitionPaymentFragmentbindingInflater1 = new AtomicInteger();
        final AmbInnerObserver<T>[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        final deriveMediaType<? super T> b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(deriveMediaType<? super T> derivemediatype, int i) {
            this.b = derivemediatype;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AmbInnerObserver[i];
        }

        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
            int i2 = this.TuitionPaymentFragmentbindingInflater1.get();
            int i3 = 0;
            if (i2 != 0) {
                return i2 == i;
            }
            if (!this.TuitionPaymentFragmentbindingInflater1.compareAndSet(0, i)) {
                return false;
            }
            AmbInnerObserver<T>[] ambInnerObserverArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            int length = ambInnerObserverArr.length;
            while (i3 < length) {
                int i4 = i3 + 1;
                if (i4 != i) {
                    DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(ambInnerObserverArr[i3]);
                }
                i3 = i4;
            }
            return true;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            if (this.TuitionPaymentFragmentbindingInflater1.get() != -1) {
                this.TuitionPaymentFragmentbindingInflater1.lazySet(-1);
                for (AmbInnerObserver<T> ambInnerObserver : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(ambInnerObserver);
                }
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.TuitionPaymentFragmentbindingInflater1.get() == -1;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class AmbInnerObserver<T> extends AtomicReference<BufferProviderState> implements deriveMediaType<T> {
        private static final long serialVersionUID = -1185974347409665484L;
        final deriveMediaType<? super T> downstream;
        final int index;
        final TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> parent;
        boolean won;

        AmbInnerObserver(TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> tuitionPaymentFragmentspecialinlinedviewModeldefault1, int i, deriveMediaType<? super T> derivemediatype) {
            this.parent = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
            this.index = i;
            this.downstream = derivemediatype;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (this.won) {
                this.downstream.onNext(t);
            } else if (this.parent.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.index)) {
                this.won = true;
                this.downstream.onNext(t);
            } else {
                get().dispose();
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (this.won) {
                this.downstream.onError(th);
            } else if (this.parent.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.index)) {
                this.won = true;
                this.downstream.onError(th);
            } else {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.won) {
                this.downstream.onComplete();
            } else if (this.parent.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.index)) {
                this.won = true;
                this.downstream.onComplete();
            }
        }
    }
}
