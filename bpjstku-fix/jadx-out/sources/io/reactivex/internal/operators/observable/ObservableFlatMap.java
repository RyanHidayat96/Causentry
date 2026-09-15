package io.reactivex.internal.operators.observable;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import defpackage.AudioSettingsBuilder;
import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.SharedByteBuffer;
import defpackage.createMediaMuxer;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.getBytesPerFrame;
import defpackage.notifySuspended;
import defpackage.readableMs;
import defpackage.share;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ObservableFlatMap<T, U> extends notifySuspended<T, U> {
    private readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends U>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private boolean b;

    public ObservableFlatMap(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends U>> readablems, boolean z, int i, int i2) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = readablems;
        this.b = z;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super U> derivemediatype) {
        if (ObservableScalarXMap.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            return;
        }
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new MergeObserver(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.b, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
    }

    static final class MergeObserver<T, U> extends AtomicInteger implements BufferProviderState, deriveMediaType<T> {
        private static InnerObserver<?, ?>[] TuitionPaymentFragmentbindingInflater1 = new InnerObserver[0];
        private static InnerObserver<?, ?>[] b = new InnerObserver[0];
        private static final long serialVersionUID = -2117620485640801370L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final deriveMediaType<? super U> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        long lastId;
        int lastIndex;
        final readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends U>> mapper;
        final int maxConcurrency;
        final AtomicReference<InnerObserver<?, ?>[]> observers;
        volatile getBytesPerFrame<U> queue;
        Queue<AutoValue_VideoValidatedEncoderProfilesProxy<? extends U>> sources;
        long uniqueId;
        BufferProviderState upstream;
        int wip;

        MergeObserver(deriveMediaType<? super U> derivemediatype, readableMs<? super T, ? extends AutoValue_VideoValidatedEncoderProfilesProxy<? extends U>> readablems, boolean z, int i, int i2) {
            this.downstream = derivemediatype;
            this.mapper = readablems;
            this.delayErrors = z;
            this.maxConcurrency = i;
            this.bufferSize = i2;
            if (i != Integer.MAX_VALUE) {
                this.sources = new ArrayDeque(i);
            }
            this.observers = new AtomicReference<>(TuitionPaymentFragmentbindingInflater1);
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.upstream, bufferProviderState)) {
                this.upstream = bufferProviderState;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (this.done) {
                return;
            }
            try {
                AutoValue_VideoValidatedEncoderProfilesProxy<? extends U> autoValue_VideoValidatedEncoderProfilesProxy = (AutoValue_VideoValidatedEncoderProfilesProxy) share.b(this.mapper.apply(t), "The mapper returned a null ObservableSource");
                if (this.maxConcurrency != Integer.MAX_VALUE) {
                    synchronized (this) {
                        int i = this.wip;
                        if (i == this.maxConcurrency) {
                            this.sources.offer(autoValue_VideoValidatedEncoderProfilesProxy);
                            return;
                        }
                        this.wip = i + 1;
                    }
                }
                TuitionPaymentFragmentspecialinlinedviewModeldefault3(autoValue_VideoValidatedEncoderProfilesProxy);
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        private void TuitionPaymentFragmentspecialinlinedviewModeldefault3(AutoValue_VideoValidatedEncoderProfilesProxy<? extends U> autoValue_VideoValidatedEncoderProfilesProxy) {
            boolean z;
            while (autoValue_VideoValidatedEncoderProfilesProxy instanceof Callable) {
                if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3((Callable) autoValue_VideoValidatedEncoderProfilesProxy) || this.maxConcurrency == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    autoValue_VideoValidatedEncoderProfilesProxy = this.sources.poll();
                    if (autoValue_VideoValidatedEncoderProfilesProxy == null) {
                        z = true;
                        this.wip--;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    if (getAndIncrement() == 0) {
                        b();
                        return;
                    }
                    return;
                }
            }
            long j = this.uniqueId;
            this.uniqueId = 1 + j;
            InnerObserver<T, U> innerObserver = new InnerObserver<>(this, j);
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault1(innerObserver)) {
                autoValue_VideoValidatedEncoderProfilesProxy.subscribe(innerObserver);
            }
        }

        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(InnerObserver<T, U> innerObserver) {
            InnerObserver<?, ?>[] innerObserverArr;
            InnerObserver[] innerObserverArr2;
            do {
                innerObserverArr = this.observers.get();
                if (innerObserverArr != b) {
                    int length = innerObserverArr.length;
                    innerObserverArr2 = new InnerObserver[length + 1];
                    System.arraycopy(innerObserverArr, 0, innerObserverArr2, 0, length);
                    innerObserverArr2[length] = innerObserver;
                } else {
                    DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(innerObserver);
                    return false;
                }
            } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.observers, innerObserverArr, innerObserverArr2));
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void TuitionPaymentFragmentbindingInflater1(InnerObserver<T, U> innerObserver) {
            InnerObserver<?, ?>[] innerObserverArr;
            InnerObserver<?, ?>[] innerObserverArr2;
            do {
                innerObserverArr = this.observers.get();
                int length = innerObserverArr.length;
                if (length == 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (innerObserverArr[i] == innerObserver) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerObserverArr2 = TuitionPaymentFragmentbindingInflater1;
                } else {
                    InnerObserver<?, ?>[] innerObserverArr3 = new InnerObserver[length - 1];
                    System.arraycopy(innerObserverArr, 0, innerObserverArr3, 0, i);
                    System.arraycopy(innerObserverArr, i + 1, innerObserverArr3, i, (length - i) - 1);
                    innerObserverArr2 = innerObserverArr3;
                }
            } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.observers, innerObserverArr, innerObserverArr2));
        }

        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(Callable<? extends U> callable) {
            try {
                U uCall = callable.call();
                if (uCall == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.downstream.onNext(uCall);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                } else {
                    getBytesPerFrame<U> spscArrayQueue = this.queue;
                    if (spscArrayQueue == null) {
                        if (this.maxConcurrency == Integer.MAX_VALUE) {
                            spscArrayQueue = new createMediaMuxer<>(this.bufferSize);
                        } else {
                            spscArrayQueue = new SpscArrayQueue<>(this.maxConcurrency);
                        }
                        this.queue = spscArrayQueue;
                    }
                    if (!spscArrayQueue.TuitionPaymentFragmentbindingInflater1(uCall)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    }
                    if (getAndIncrement() != 0) {
                        return false;
                    }
                }
                b();
                return true;
            } catch (Throwable th) {
                dumpMediaCodecListForFormat.b(th);
                ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.errors, th);
                if (getAndIncrement() == 0) {
                    b();
                }
                return true;
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (this.done) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                return;
            }
            if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.errors, th)) {
                this.done = true;
                if (getAndIncrement() == 0) {
                    b();
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
            if (getAndIncrement() == 0) {
                b();
            }
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            if (!TuitionPaymentFragmentbindingInflater1() || (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.errors)) == null || thTuitionPaymentFragmentspecialinlinedviewModeldefault2 == ExceptionHelper.TuitionPaymentFragmentbindingInflater1) {
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.cancelled;
        }

        /* JADX WARN: Code duplicated, block: B:106:0x0112 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:121:0x00f5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:80:0x00ee  */
        /* JADX WARN: Code duplicated, block: B:83:0x00f4 A[PHI: r4
  0x00f4: PHI (r4v6 int) = (r4v4 int), (r4v7 int) binds: [B:71:0x00d4, B:82:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Multi-variable type inference failed */
        final void b() {
            int size;
            boolean z;
            deriveMediaType<? super U> derivemediatype = this.downstream;
            int iAddAndGet = 1;
            while (!TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                getBytesPerFrame<U> getbytesperframe = this.queue;
                int i = 0;
                if (getbytesperframe != null) {
                    while (!TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                        U uTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getbytesperframe.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        if (uTuitionPaymentFragmentspecialinlinedviewModeldefault2 != null) {
                            derivemediatype.onNext(uTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            i++;
                        }
                    }
                    return;
                }
                if (i != 0) {
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        TuitionPaymentFragmentbindingInflater1(i);
                    }
                } else {
                    boolean z2 = this.done;
                    getBytesPerFrame<U> getbytesperframe2 = this.queue;
                    InnerObserver<?, ?>[] innerObserverArr = this.observers.get();
                    int length = innerObserverArr.length;
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        synchronized (this) {
                            size = this.sources.size();
                        }
                    } else {
                        size = 0;
                    }
                    if (z2 && ((getbytesperframe2 == null || getbytesperframe2.TuitionPaymentFragmentspecialinlinedviewModeldefault1()) && length == 0 && size == 0)) {
                        Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.errors);
                        if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 != ExceptionHelper.TuitionPaymentFragmentbindingInflater1) {
                            if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                                derivemediatype.onComplete();
                                return;
                            } else {
                                derivemediatype.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                return;
                            }
                        }
                        return;
                    }
                    if (length != 0) {
                        long j = this.lastId;
                        int i2 = this.lastIndex;
                        if (length <= i2 || innerObserverArr[i2].f1210id != j) {
                            if (length <= i2) {
                                i2 = 0;
                            }
                            for (int i3 = 0; i3 < length && innerObserverArr[i2].f1210id != j; i3++) {
                                i2++;
                                if (i2 == length) {
                                    i2 = 0;
                                }
                            }
                            this.lastIndex = i2;
                            this.lastId = innerObserverArr[i2].f1210id;
                        }
                        for (int i4 = 0; i4 < length; i4++) {
                            if (TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                                return;
                            }
                            InnerObserver<T, U> innerObserver = innerObserverArr[i2];
                            AudioSettingsBuilder<U> audioSettingsBuilder = innerObserver.queue;
                            if (audioSettingsBuilder != null) {
                                do {
                                    try {
                                        U uTuitionPaymentFragmentspecialinlinedviewModeldefault3 = audioSettingsBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                                        if (uTuitionPaymentFragmentspecialinlinedviewModeldefault3 != null) {
                                            derivemediatype.onNext(uTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                                        } else {
                                            z = innerObserver.done;
                                            AudioSettingsBuilder<U> audioSettingsBuilder2 = innerObserver.queue;
                                            if (z && (audioSettingsBuilder2 == null || audioSettingsBuilder2.TuitionPaymentFragmentspecialinlinedviewModeldefault1())) {
                                                TuitionPaymentFragmentbindingInflater1(innerObserver);
                                                if (!TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                                                    return;
                                                } else {
                                                    i++;
                                                }
                                            }
                                            i2++;
                                            if (i2 == length) {
                                                i2 = 0;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        dumpMediaCodecListForFormat.b(th);
                                        DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(innerObserver);
                                        ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.errors, th);
                                        if (TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                                            return;
                                        }
                                        TuitionPaymentFragmentbindingInflater1(innerObserver);
                                        i++;
                                        i2++;
                                        if (i2 == length) {
                                        }
                                    }
                                } while (!TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                                return;
                            }
                            z = innerObserver.done;
                            AudioSettingsBuilder<U> audioSettingsBuilder3 = innerObserver.queue;
                            if (z) {
                                TuitionPaymentFragmentbindingInflater1(innerObserver);
                                if (!TuitionPaymentFragmentspecialinlinedviewModeldefault1()) {
                                    return;
                                } else {
                                    i++;
                                }
                            }
                            i2++;
                            if (i2 == length) {
                                i2 = 0;
                            }
                        }
                        this.lastIndex = i2;
                        this.lastId = innerObserverArr[i2].f1210id;
                    }
                    if (i != 0) {
                        if (this.maxConcurrency != Integer.MAX_VALUE) {
                            TuitionPaymentFragmentbindingInflater1(i);
                        }
                    } else {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                }
            }
        }

        private void TuitionPaymentFragmentbindingInflater1(int i) {
            while (i != 0) {
                synchronized (this) {
                    AutoValue_VideoValidatedEncoderProfilesProxy<? extends U> autoValue_VideoValidatedEncoderProfilesProxyPoll = this.sources.poll();
                    if (autoValue_VideoValidatedEncoderProfilesProxyPoll == null) {
                        this.wip--;
                    } else {
                        TuitionPaymentFragmentspecialinlinedviewModeldefault3(autoValue_VideoValidatedEncoderProfilesProxyPoll);
                    }
                }
                i--;
            }
        }

        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            if (this.cancelled) {
                return true;
            }
            Throwable th = this.errors.get();
            if (this.delayErrors || th == null) {
                return false;
            }
            TuitionPaymentFragmentbindingInflater1();
            Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.errors);
            if (thTuitionPaymentFragmentspecialinlinedviewModeldefault2 != ExceptionHelper.TuitionPaymentFragmentbindingInflater1) {
                this.downstream.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
            return true;
        }

        final boolean TuitionPaymentFragmentbindingInflater1() {
            InnerObserver<?, ?>[] andSet;
            this.upstream.dispose();
            InnerObserver<?, ?>[] innerObserverArr = this.observers.get();
            InnerObserver<?, ?>[] innerObserverArr2 = b;
            if (innerObserverArr == innerObserverArr2 || (andSet = this.observers.getAndSet(innerObserverArr2)) == innerObserverArr2) {
                return false;
            }
            for (InnerObserver<?, ?> innerObserver : andSet) {
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(innerObserver);
            }
            return true;
        }
    }

    static final class InnerObserver<T, U> extends AtomicReference<BufferProviderState> implements deriveMediaType<U> {
        private static final long serialVersionUID = -4606175640614850599L;
        volatile boolean done;
        int fusionMode;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        final long f1210id;
        final MergeObserver<T, U> parent;
        volatile AudioSettingsBuilder<U> queue;

        InnerObserver(MergeObserver<T, U> mergeObserver, long j) {
            this.f1210id = j;
            this.parent = mergeObserver;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState) && (bufferProviderState instanceof SharedByteBuffer)) {
                SharedByteBuffer sharedByteBuffer = (SharedByteBuffer) bufferProviderState;
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = sharedByteBuffer.TuitionPaymentFragmentspecialinlinedviewModeldefault1(7);
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 != 1) {
                    if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 2) {
                        this.fusionMode = iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        this.queue = sharedByteBuffer;
                        return;
                    }
                    return;
                }
                this.fusionMode = iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                this.queue = sharedByteBuffer;
                this.done = true;
                MergeObserver<T, U> mergeObserver = this.parent;
                if (mergeObserver.getAndIncrement() == 0) {
                    mergeObserver.b();
                }
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(U u) {
            if (this.fusionMode == 0) {
                MergeObserver<T, U> mergeObserver = this.parent;
                if (mergeObserver.get() == 0 && mergeObserver.compareAndSet(0, 1)) {
                    mergeObserver.downstream.onNext(u);
                    if (mergeObserver.decrementAndGet() == 0) {
                        return;
                    }
                } else {
                    AudioSettingsBuilder createmediamuxer = this.queue;
                    if (createmediamuxer == null) {
                        createmediamuxer = new createMediaMuxer(mergeObserver.bufferSize);
                        this.queue = createmediamuxer;
                    }
                    createmediamuxer.TuitionPaymentFragmentbindingInflater1(u);
                    if (mergeObserver.getAndIncrement() != 0) {
                        return;
                    }
                }
                mergeObserver.b();
                return;
            }
            MergeObserver<T, U> mergeObserver2 = this.parent;
            if (mergeObserver2.getAndIncrement() == 0) {
                mergeObserver2.b();
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.parent.errors, th)) {
                if (!this.parent.delayErrors) {
                    this.parent.TuitionPaymentFragmentbindingInflater1();
                }
                this.done = true;
                MergeObserver<T, U> mergeObserver = this.parent;
                if (mergeObserver.getAndIncrement() == 0) {
                    mergeObserver.b();
                    return;
                }
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.done = true;
            MergeObserver<T, U> mergeObserver = this.parent;
            if (mergeObserver.getAndIncrement() == 0) {
                mergeObserver.b();
            }
        }
    }
}
