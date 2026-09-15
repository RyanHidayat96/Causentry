package io.reactivex.internal.operators.observable;

import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.VideoRecordEventStart;
import defpackage.createMediaMuxer;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.readableMs;
import defpackage.share;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableCombineLatest<T, R> extends VideoRecordEventStart<R> {
    private AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>[] TuitionPaymentFragmentbindingInflater1;
    private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private readableMs<? super Object[], ? extends R> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private Iterable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> b;

    public ObservableCombineLatest(AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>[] autoValue_VideoValidatedEncoderProfilesProxyArr, Iterable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>> iterable, readableMs<? super Object[], ? extends R> readablems, int i, boolean z) {
        this.TuitionPaymentFragmentbindingInflater1 = autoValue_VideoValidatedEncoderProfilesProxyArr;
        this.b = iterable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = readablems;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super R> derivemediatype) {
        int length;
        AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>[] autoValue_VideoValidatedEncoderProfilesProxyArr = this.TuitionPaymentFragmentbindingInflater1;
        if (autoValue_VideoValidatedEncoderProfilesProxyArr == null) {
            autoValue_VideoValidatedEncoderProfilesProxyArr = new AutoValue_VideoValidatedEncoderProfilesProxy[8];
            length = 0;
            for (AutoValue_VideoValidatedEncoderProfilesProxy<? extends T> autoValue_VideoValidatedEncoderProfilesProxy : this.b) {
                if (length == autoValue_VideoValidatedEncoderProfilesProxyArr.length) {
                    AutoValue_VideoValidatedEncoderProfilesProxy<? extends T>[] autoValue_VideoValidatedEncoderProfilesProxyArr2 = new AutoValue_VideoValidatedEncoderProfilesProxy[(length >> 2) + length];
                    System.arraycopy(autoValue_VideoValidatedEncoderProfilesProxyArr, 0, autoValue_VideoValidatedEncoderProfilesProxyArr2, 0, length);
                    autoValue_VideoValidatedEncoderProfilesProxyArr = autoValue_VideoValidatedEncoderProfilesProxyArr2;
                }
                autoValue_VideoValidatedEncoderProfilesProxyArr[length] = autoValue_VideoValidatedEncoderProfilesProxy;
                length++;
            }
        } else {
            length = autoValue_VideoValidatedEncoderProfilesProxyArr.length;
        }
        int i = length;
        if (i == 0) {
            EmptyDisposable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(derivemediatype);
            return;
        }
        LatestCoordinator latestCoordinator = new LatestCoordinator(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, i, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        CombinerObserver<T, R>[] combinerObserverArr = latestCoordinator.observers;
        int length2 = combinerObserverArr.length;
        latestCoordinator.downstream.onSubscribe(latestCoordinator);
        for (int i2 = 0; i2 < length2 && !latestCoordinator.done && !latestCoordinator.cancelled; i2++) {
            autoValue_VideoValidatedEncoderProfilesProxyArr[i2].subscribe(combinerObserverArr[i2]);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class LatestCoordinator<T, R> extends AtomicInteger implements BufferProviderState {
        private static final long serialVersionUID = 8567835998786448817L;
        int active;
        volatile boolean cancelled;
        final readableMs<? super Object[], ? extends R> combiner;
        int complete;
        final boolean delayError;
        volatile boolean done;
        final deriveMediaType<? super R> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        Object[] latest;
        final CombinerObserver<T, R>[] observers;
        final createMediaMuxer<Object[]> queue;

        LatestCoordinator(deriveMediaType<? super R> derivemediatype, readableMs<? super Object[], ? extends R> readablems, int i, int i2, boolean z) {
            this.downstream = derivemediatype;
            this.combiner = readablems;
            this.delayError = z;
            this.latest = new Object[i];
            CombinerObserver<T, R>[] combinerObserverArr = new CombinerObserver[i];
            for (int i3 = 0; i3 < i; i3++) {
                combinerObserverArr[i3] = new CombinerObserver<>(this, i3);
            }
            this.observers = combinerObserverArr;
            this.queue = new createMediaMuxer<>(i2);
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            for (CombinerObserver<T, R> combinerObserver : this.observers) {
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(combinerObserver);
            }
            if (getAndIncrement() == 0) {
                createMediaMuxer<Object[]> createmediamuxer = this.queue;
                synchronized (this) {
                    this.latest = null;
                }
                createmediamuxer.TuitionPaymentFragmentbindingInflater1();
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.cancelled;
        }

        final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            if (getAndIncrement() == 0) {
                createMediaMuxer<Object[]> createmediamuxer = this.queue;
                deriveMediaType<? super R> derivemediatype = this.downstream;
                boolean z = this.delayError;
                int iAddAndGet = 1;
                while (!this.cancelled) {
                    int i = 0;
                    if (z || this.errors.get() == null) {
                        boolean z2 = this.done;
                        Object[] objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createmediamuxer.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        boolean z3 = objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null;
                        if (z2 && z3) {
                            synchronized (this) {
                                this.latest = null;
                            }
                            createmediamuxer.TuitionPaymentFragmentbindingInflater1();
                            Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.errors);
                            if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                                derivemediatype.onComplete();
                                return;
                            } else {
                                derivemediatype.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                return;
                            }
                        }
                        if (!z3) {
                            try {
                                derivemediatype.onNext((Object) share.b(this.combiner.apply(objArrTuitionPaymentFragmentspecialinlinedviewModeldefault2), "The combiner returned a null value"));
                            } catch (Throwable th) {
                                dumpMediaCodecListForFormat.b(th);
                                ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.errors, th);
                                CombinerObserver<T, R>[] combinerObserverArr = this.observers;
                                int length = combinerObserverArr.length;
                                while (i < length) {
                                    DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(combinerObserverArr[i]);
                                    i++;
                                }
                                synchronized (this) {
                                    this.latest = null;
                                    createmediamuxer.TuitionPaymentFragmentbindingInflater1();
                                    derivemediatype.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.errors));
                                    return;
                                }
                            }
                        } else {
                            iAddAndGet = addAndGet(-iAddAndGet);
                            if (iAddAndGet == 0) {
                                return;
                            }
                        }
                    } else {
                        CombinerObserver<T, R>[] combinerObserverArr2 = this.observers;
                        int length2 = combinerObserverArr2.length;
                        while (i < length2) {
                            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(combinerObserverArr2[i]);
                            i++;
                        }
                        synchronized (this) {
                            this.latest = null;
                        }
                        createmediamuxer.TuitionPaymentFragmentbindingInflater1();
                        derivemediatype.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.errors));
                        return;
                    }
                }
                synchronized (this) {
                    this.latest = null;
                }
                createmediamuxer.TuitionPaymentFragmentbindingInflater1();
            }
        }

        final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, T t) {
            boolean z;
            synchronized (this) {
                Object[] objArr = this.latest;
                if (objArr == null) {
                    return;
                }
                Object obj = objArr[i];
                int i2 = this.active;
                if (obj == null) {
                    i2++;
                    this.active = i2;
                }
                objArr[i] = t;
                if (i2 == objArr.length) {
                    this.queue.TuitionPaymentFragmentbindingInflater1((Object[]) objArr.clone());
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class CombinerObserver<T, R> extends AtomicReference<BufferProviderState> implements deriveMediaType<T> {
        private static final long serialVersionUID = -4823716997131257941L;
        final int index;
        final LatestCoordinator<T, R> parent;

        CombinerObserver(LatestCoordinator<T, R> latestCoordinator, int i) {
            this.parent = latestCoordinator;
            this.index = i;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            this.parent.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.index, t);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x002a A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x0012, B:11:0x0018, B:16:0x0022, B:18:0x002a), top: B:32:0x0012 }] */
        /* JADX WARN: Code duplicated, block: B:25:0x0033  */
        /* JADX WARN: Code duplicated, block: B:27:0x0038 A[LOOP:0: B:26:0x0036->B:27:0x0038, LOOP_END] */
        /* JADX WARN: Instruction removed from duplicated block: B:25:0x0033, please report this as an issue */
        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            LatestCoordinator<T, R> latestCoordinator = this.parent;
            int i = this.index;
            if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(latestCoordinator.errors, th)) {
                if (latestCoordinator.delayError) {
                    synchronized (latestCoordinator) {
                        Object[] objArr = latestCoordinator.latest;
                        if (objArr == null) {
                            return;
                        }
                        boolean z = objArr[i] == null;
                        if (!z) {
                            int i2 = latestCoordinator.complete + 1;
                            latestCoordinator.complete = i2;
                            if (i2 == objArr.length) {
                                latestCoordinator.done = true;
                            }
                        } else {
                            latestCoordinator.done = true;
                        }
                        if (z) {
                            for (CombinerObserver<T, R> combinerObserver : latestCoordinator.observers) {
                                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(combinerObserver);
                            }
                        }
                    }
                } else {
                    while (i < r1) {
                        DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(combinerObserver);
                    }
                }
                latestCoordinator.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x001e A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x000b, B:13:0x0016, B:15:0x001e), top: B:26:0x0005 }] */
        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            LatestCoordinator<T, R> latestCoordinator = this.parent;
            int i = this.index;
            synchronized (latestCoordinator) {
                Object[] objArr = latestCoordinator.latest;
                if (objArr == null) {
                    return;
                }
                boolean z = objArr[i] == null;
                if (!z) {
                    int i2 = latestCoordinator.complete + 1;
                    latestCoordinator.complete = i2;
                    if (i2 == objArr.length) {
                        latestCoordinator.done = true;
                    }
                } else {
                    latestCoordinator.done = true;
                }
                if (z) {
                    for (CombinerObserver<T, R> combinerObserver : latestCoordinator.observers) {
                        DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(combinerObserver);
                    }
                }
                latestCoordinator.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
        }
    }
}
