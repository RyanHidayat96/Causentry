package io.reactivex.internal.operators.flowable;

import defpackage.AudioConfig;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.OutputTransform;
import defpackage.VideoRecordEvent;
import defpackage.VideoRecordEventFinalize;
import defpackage.createMediaMuxer;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.isSonyG3125;
import defpackage.status;
import io.reactivex.BackpressureStrategy;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class FlowableCreate<T> extends VideoRecordEvent<T> {
    private BackpressureStrategy TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private status<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public FlowableCreate(status<T> statusVar, BackpressureStrategy backpressureStrategy) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = statusVar;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = backpressureStrategy;
    }

    /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.FlowableCreate$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;

        static {
            int[] iArr = new int[BackpressureStrategy.values().length];
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iArr;
            try {
                iArr[BackpressureStrategy.MISSING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1[BackpressureStrategy.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1[BackpressureStrategy.DROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1[BackpressureStrategy.LATEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // defpackage.VideoRecordEvent
    public final void TuitionPaymentFragmentbindingInflater1(AudioConfig<? super T> audioConfig) {
        BaseEmitter missingEmitter;
        int i = AnonymousClass2.TuitionPaymentFragmentspecialinlinedviewModeldefault1[this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.ordinal()];
        if (i == 1) {
            missingEmitter = new MissingEmitter(audioConfig);
        } else if (i == 2) {
            missingEmitter = new ErrorAsyncEmitter(audioConfig);
        } else if (i == 3) {
            missingEmitter = new DropAsyncEmitter(audioConfig);
        } else if (i == 4) {
            missingEmitter = new LatestAsyncEmitter(audioConfig);
        } else {
            missingEmitter = new BufferAsyncEmitter(audioConfig, VideoRecordEvent.BUFFER_SIZE);
        }
        audioConfig.b(missingEmitter);
        try {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.subscribe(missingEmitter);
        } catch (Throwable th) {
            dumpMediaCodecListForFormat.b(th);
            if (missingEmitter.TuitionPaymentFragmentspecialinlinedviewModeldefault1(th)) {
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static abstract class BaseEmitter<T> extends AtomicLong implements VideoRecordEventFinalize<T>, OutputTransform {
        private static final long serialVersionUID = 7326289992464377023L;
        final AudioConfig<? super T> downstream;
        final SequentialDisposable serial = new SequentialDisposable();

        void TuitionPaymentFragmentbindingInflater1() {
        }

        void asInterface() {
        }

        BaseEmitter(AudioConfig<? super T> audioConfig) {
            this.downstream = audioConfig;
        }

        @Override // defpackage.getRecordingStats
        public void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        @Override // defpackage.getRecordingStats
        public final void TuitionPaymentFragmentbindingInflater1(Throwable th) {
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault1(th)) {
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }

        public boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
            return b(th);
        }

        protected final boolean b(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (this.serial.isDisposed()) {
                return false;
            }
            try {
                this.downstream.onError(th);
                return true;
            } finally {
                this.serial.dispose();
            }
        }

        @Override // defpackage.OutputTransform
        public final void b() {
            this.serial.dispose();
            asInterface();
        }

        @Override // defpackage.VideoRecordEventFinalize
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            return this.serial.isDisposed();
        }

        @Override // defpackage.OutputTransform
        public final void b(long j) {
            if (SubscriptionHelper.TuitionPaymentFragmentbindingInflater1(j)) {
                isSonyG3125.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this, j);
                TuitionPaymentFragmentbindingInflater1();
            }
        }

        @Override // defpackage.VideoRecordEventFinalize
        public final void b(BufferProviderState bufferProviderState) {
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.serial, bufferProviderState);
        }

        @Override // java.util.concurrent.atomic.AtomicLong
        public String toString() {
            return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
        }

        protected final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            if (this.serial.isDisposed()) {
                return;
            }
            try {
                this.downstream.onComplete();
            } finally {
                this.serial.dispose();
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class MissingEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 3776720187248809713L;

        MissingEmitter(AudioConfig<? super T> audioConfig) {
            super(audioConfig);
        }

        @Override // defpackage.getRecordingStats
        public final void TuitionPaymentFragmentbindingInflater1(T t) {
            long j;
            if (this.serial.isDisposed()) {
                return;
            }
            if (t != null) {
                this.downstream.onNext(t);
                do {
                    j = get();
                    if (j == 0) {
                        return;
                    }
                } while (!compareAndSet(j, j - 1));
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault1(nullPointerException)) {
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(nullPointerException);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static abstract class NoOverflowBaseAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 4127754106204442833L;

        abstract void asBinder();

        NoOverflowBaseAsyncEmitter(AudioConfig<? super T> audioConfig) {
            super(audioConfig);
        }

        @Override // defpackage.getRecordingStats
        public final void TuitionPaymentFragmentbindingInflater1(T t) {
            if (this.serial.isDisposed()) {
                return;
            }
            if (t == null) {
                NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault1(nullPointerException)) {
                    return;
                }
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(nullPointerException);
                return;
            }
            if (get() != 0) {
                this.downstream.onNext(t);
                isSonyG3125.b(this, 1L);
            } else {
                asBinder();
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class DropAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 8360058422307496563L;

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter
        final void asBinder() {
        }

        DropAsyncEmitter(AudioConfig<? super T> audioConfig) {
            super(audioConfig);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class ErrorAsyncEmitter<T> extends NoOverflowBaseAsyncEmitter<T> {
        private static final long serialVersionUID = 338953216916120960L;

        ErrorAsyncEmitter(AudioConfig<? super T> audioConfig) {
            super(audioConfig);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.NoOverflowBaseAsyncEmitter
        final void asBinder() {
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("create: could not emit value due to lack of requests");
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault1(missingBackpressureException)) {
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(missingBackpressureException);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class BufferAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 2427151001689639875L;
        volatile boolean done;
        Throwable error;
        final createMediaMuxer<T> queue;
        final AtomicInteger wip;

        BufferAsyncEmitter(AudioConfig<? super T> audioConfig, int i) {
            super(audioConfig);
            this.queue = new createMediaMuxer<>(i);
            this.wip = new AtomicInteger();
        }

        @Override // defpackage.getRecordingStats
        public final void TuitionPaymentFragmentbindingInflater1(T t) {
            if (this.done || this.serial.isDisposed()) {
                return;
            }
            if (t == null) {
                NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault1(nullPointerException)) {
                    return;
                }
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(nullPointerException);
                return;
            }
            this.queue.TuitionPaymentFragmentbindingInflater1(t);
            asBinder();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
            if (this.done || this.serial.isDisposed()) {
                return false;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.error = th;
            this.done = true;
            asBinder();
            return true;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, defpackage.getRecordingStats
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            this.done = true;
            asBinder();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        final void TuitionPaymentFragmentbindingInflater1() {
            asBinder();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        final void asInterface() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.TuitionPaymentFragmentbindingInflater1();
            }
        }

        private void asBinder() {
            if (this.wip.getAndIncrement() == 0) {
                AudioConfig<? super T> audioConfig = this.downstream;
                createMediaMuxer<T> createmediamuxer = this.queue;
                int iAddAndGet = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (this.serial.isDisposed()) {
                            createmediamuxer.TuitionPaymentFragmentbindingInflater1();
                            return;
                        }
                        boolean z = this.done;
                        T tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createmediamuxer.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        boolean z2 = tTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null;
                        if (!z || !z2) {
                            if (z2) {
                                break;
                            }
                            audioConfig.onNext(tTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                            j2++;
                        } else {
                            Throwable th = this.error;
                            if (th != null) {
                                b(th);
                                return;
                            } else {
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                return;
                            }
                        }
                    }
                    if (j2 == j) {
                        if (this.serial.isDisposed()) {
                            createmediamuxer.TuitionPaymentFragmentbindingInflater1();
                            return;
                        }
                        boolean z3 = this.done;
                        boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault1 = createmediamuxer.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        if (z3 && zTuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                b(th2);
                                return;
                            } else {
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        isSonyG3125.b(this, j2);
                    }
                    iAddAndGet = this.wip.addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class LatestAsyncEmitter<T> extends BaseEmitter<T> {
        private static final long serialVersionUID = 4023437720691792495L;
        volatile boolean done;
        Throwable error;
        final AtomicReference<T> queue;
        final AtomicInteger wip;

        LatestAsyncEmitter(AudioConfig<? super T> audioConfig) {
            super(audioConfig);
            this.queue = new AtomicReference<>();
            this.wip = new AtomicInteger();
        }

        @Override // defpackage.getRecordingStats
        public final void TuitionPaymentFragmentbindingInflater1(T t) {
            if (this.done || this.serial.isDisposed()) {
                return;
            }
            if (t == null) {
                NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
                if (TuitionPaymentFragmentspecialinlinedviewModeldefault1(nullPointerException)) {
                    return;
                }
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(nullPointerException);
                return;
            }
            this.queue.set(t);
            g();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
            if (this.done || this.serial.isDisposed()) {
                return false;
            }
            if (th == null) {
                NullPointerException nullPointerException = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
                if (!TuitionPaymentFragmentspecialinlinedviewModeldefault1(nullPointerException)) {
                    DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(nullPointerException);
                }
            }
            this.error = th;
            this.done = true;
            g();
            return true;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter, defpackage.getRecordingStats
        public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            this.done = true;
            g();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        final void TuitionPaymentFragmentbindingInflater1() {
            g();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableCreate.BaseEmitter
        final void asInterface() {
            if (this.wip.getAndIncrement() == 0) {
                this.queue.lazySet(null);
            }
        }

        private void g() {
            if (this.wip.getAndIncrement() == 0) {
                AudioConfig<? super T> audioConfig = this.downstream;
                AtomicReference<T> atomicReference = this.queue;
                int iAddAndGet = 1;
                do {
                    long j = get();
                    long j2 = 0;
                    while (true) {
                        if (j2 == j) {
                            break;
                        }
                        if (this.serial.isDisposed()) {
                            atomicReference.lazySet(null);
                            return;
                        }
                        boolean z = this.done;
                        T andSet = atomicReference.getAndSet(null);
                        boolean z2 = andSet == null;
                        if (!z || !z2) {
                            if (z2) {
                                break;
                            }
                            audioConfig.onNext(andSet);
                            j2++;
                        } else {
                            Throwable th = this.error;
                            if (th != null) {
                                b(th);
                                return;
                            } else {
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                return;
                            }
                        }
                    }
                    if (j2 == j) {
                        if (this.serial.isDisposed()) {
                            atomicReference.lazySet(null);
                            return;
                        }
                        boolean z3 = this.done;
                        boolean z4 = atomicReference.get() == null;
                        if (z3 && z4) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                b(th2);
                                return;
                            } else {
                                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        isSonyG3125.b(this, j2);
                    }
                    iAddAndGet = this.wip.addAndGet(-iAddAndGet);
                } while (iAddAndGet != 0);
            }
        }
    }
}
