package io.reactivex.internal.operators.observable;

import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.channelCountToChannelConfig;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.isRealmeC2;
import defpackage.notifySuspended;
import defpackage.readableMs;
import defpackage.share;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableWithLatestFromMany<T, R> extends notifySuspended<T, R> {
    private Iterable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<?>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final readableMs<? super Object[], R> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private AutoValue_VideoValidatedEncoderProfilesProxy<?>[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public ObservableWithLatestFromMany(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, AutoValue_VideoValidatedEncoderProfilesProxy<?>[] autoValue_VideoValidatedEncoderProfilesProxyArr, readableMs<? super Object[], R> readablems) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = autoValue_VideoValidatedEncoderProfilesProxyArr;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = readablems;
    }

    public ObservableWithLatestFromMany(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, Iterable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<?>> iterable, readableMs<? super Object[], R> readablems) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iterable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = readablems;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super R> derivemediatype) {
        int length;
        AutoValue_VideoValidatedEncoderProfilesProxy<?>[] autoValue_VideoValidatedEncoderProfilesProxyArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (autoValue_VideoValidatedEncoderProfilesProxyArr == null) {
            autoValue_VideoValidatedEncoderProfilesProxyArr = new AutoValue_VideoValidatedEncoderProfilesProxy[8];
            try {
                length = 0;
                for (AutoValue_VideoValidatedEncoderProfilesProxy<?> autoValue_VideoValidatedEncoderProfilesProxy : this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    if (length == autoValue_VideoValidatedEncoderProfilesProxyArr.length) {
                        autoValue_VideoValidatedEncoderProfilesProxyArr = (AutoValue_VideoValidatedEncoderProfilesProxy[]) Arrays.copyOf(autoValue_VideoValidatedEncoderProfilesProxyArr, (length >> 1) + length);
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
            new channelCountToChannelConfig(this.TuitionPaymentFragmentbindingInflater1, new TuitionPaymentFragmentspecialinlinedviewModeldefault1()).subscribeActual(derivemediatype);
            return;
        }
        WithLatestFromObserver withLatestFromObserver = new WithLatestFromObserver(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, length);
        derivemediatype.onSubscribe(withLatestFromObserver);
        WithLatestInnerObserver[] withLatestInnerObserverArr = withLatestFromObserver.observers;
        AtomicReference<BufferProviderState> atomicReference = withLatestFromObserver.upstream;
        for (int i = 0; i < length && !DisposableHelper.TuitionPaymentFragmentbindingInflater1(atomicReference.get()) && !withLatestFromObserver.done; i++) {
            autoValue_VideoValidatedEncoderProfilesProxyArr[i].subscribe(withLatestInnerObserverArr[i]);
        }
        this.TuitionPaymentFragmentbindingInflater1.subscribe(withLatestFromObserver);
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class WithLatestFromObserver<T, R> extends AtomicInteger implements deriveMediaType<T>, BufferProviderState {
        private static final long serialVersionUID = 1577321883966341961L;
        final readableMs<? super Object[], R> combiner;
        volatile boolean done;
        final deriveMediaType<? super R> downstream;
        final AtomicThrowable error;
        final WithLatestInnerObserver[] observers;
        final AtomicReference<BufferProviderState> upstream;
        final AtomicReferenceArray<Object> values;

        WithLatestFromObserver(deriveMediaType<? super R> derivemediatype, readableMs<? super Object[], R> readablems, int i) {
            this.downstream = derivemediatype;
            this.combiner = readablems;
            WithLatestInnerObserver[] withLatestInnerObserverArr = new WithLatestInnerObserver[i];
            for (int i2 = 0; i2 < i; i2++) {
                withLatestInnerObserverArr[i2] = new WithLatestInnerObserver(this, i2);
            }
            this.observers = withLatestInnerObserverArr;
            this.values = new AtomicReferenceArray<>(i);
            this.upstream = new AtomicReference<>();
            this.error = new AtomicThrowable();
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.upstream, bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (this.done) {
                return;
            }
            AtomicReferenceArray<Object> atomicReferenceArray = this.values;
            int length = atomicReferenceArray.length();
            Object[] objArr = new Object[length + 1];
            int i = 0;
            objArr[0] = t;
            while (i < length) {
                Object obj = atomicReferenceArray.get(i);
                if (obj == null) {
                    return;
                }
                i++;
                objArr[i] = obj;
            }
            try {
                isRealmeC2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.downstream, share.b(this.combiner.apply(objArr), "combiner returned a null value"), this, this.error);
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                dispose();
                onError(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (this.done) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                return;
            }
            this.done = true;
            WithLatestInnerObserver[] withLatestInnerObserverArr = this.observers;
            for (int i = 0; i < withLatestInnerObserverArr.length; i++) {
                if (i != -1) {
                    DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(withLatestInnerObserverArr[i]);
                }
            }
            deriveMediaType<? super R> derivemediatype = this.downstream;
            AtomicThrowable atomicThrowable = this.error;
            if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(atomicThrowable, th)) {
                if (getAndIncrement() == 0) {
                    derivemediatype.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable));
                    return;
                }
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            WithLatestInnerObserver[] withLatestInnerObserverArr = this.observers;
            for (int i = 0; i < withLatestInnerObserverArr.length; i++) {
                if (i != -1) {
                    DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(withLatestInnerObserverArr[i]);
                }
            }
            deriveMediaType<? super R> derivemediatype = this.downstream;
            AtomicThrowable atomicThrowable = this.error;
            if (getAndIncrement() == 0) {
                Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable);
                if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                    derivemediatype.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                } else {
                    derivemediatype.onComplete();
                }
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.upstream.get());
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.upstream);
            for (WithLatestInnerObserver withLatestInnerObserver : this.observers) {
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(withLatestInnerObserver);
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class WithLatestInnerObserver extends AtomicReference<BufferProviderState> implements deriveMediaType<Object> {
        private static final long serialVersionUID = 3256684027868224024L;
        boolean hasValue;
        final int index;
        final WithLatestFromObserver<?, ?> parent;

        WithLatestInnerObserver(WithLatestFromObserver<?, ?> withLatestFromObserver, int i) {
            this.parent = withLatestFromObserver;
            this.index = i;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(Object obj) {
            if (!this.hasValue) {
                this.hasValue = true;
            }
            WithLatestFromObserver<?, ?> withLatestFromObserver = this.parent;
            withLatestFromObserver.values.set(this.index, obj);
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            WithLatestFromObserver<?, ?> withLatestFromObserver = this.parent;
            int i = this.index;
            withLatestFromObserver.done = true;
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(withLatestFromObserver.upstream);
            WithLatestInnerObserver[] withLatestInnerObserverArr = withLatestFromObserver.observers;
            for (int i2 = 0; i2 < withLatestInnerObserverArr.length; i2++) {
                if (i2 != i) {
                    DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(withLatestInnerObserverArr[i2]);
                }
            }
            deriveMediaType<? super Object> derivemediatype = withLatestFromObserver.downstream;
            AtomicThrowable atomicThrowable = withLatestFromObserver.error;
            if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(atomicThrowable, th)) {
                if (withLatestFromObserver.getAndIncrement() == 0) {
                    derivemediatype.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable));
                    return;
                }
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            WithLatestFromObserver<?, ?> withLatestFromObserver = this.parent;
            int i = this.index;
            if (this.hasValue) {
                return;
            }
            withLatestFromObserver.done = true;
            WithLatestInnerObserver[] withLatestInnerObserverArr = withLatestFromObserver.observers;
            for (int i2 = 0; i2 < withLatestInnerObserverArr.length; i2++) {
                if (i2 != i) {
                    DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(withLatestInnerObserverArr[i2]);
                }
            }
            deriveMediaType<? super Object> derivemediatype = withLatestFromObserver.downstream;
            AtomicThrowable atomicThrowable = withLatestFromObserver.error;
            if (withLatestFromObserver.getAndIncrement() == 0) {
                Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable);
                if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                    derivemediatype.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                } else {
                    derivemediatype.onComplete();
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements readableMs<T, R> {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // defpackage.readableMs
        public final R apply(T t) throws Exception {
            return (R) share.b(ObservableWithLatestFromMany.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.apply(new Object[]{t}), "The combiner returned a null value");
        }
    }
}
