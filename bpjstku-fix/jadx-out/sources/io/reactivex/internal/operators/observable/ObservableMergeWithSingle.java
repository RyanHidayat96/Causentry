package io.reactivex.internal.operators.observable;

import defpackage.Absent;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.VideoRecordEventStart;
import defpackage.createMediaMuxer;
import defpackage.deriveMediaType;
import defpackage.generateBackupProfile;
import defpackage.getBytesPerFrame;
import defpackage.getDefaultVideoProfile;
import defpackage.notifySuspended;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableMergeWithSingle<T> extends notifySuspended<T, T> {
    private generateBackupProfile<? extends T> b;

    public ObservableMergeWithSingle(VideoRecordEventStart<T> videoRecordEventStart, generateBackupProfile<? extends T> generatebackupprofile) {
        super(videoRecordEventStart);
        this.b = generatebackupprofile;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(derivemediatype);
        derivemediatype.onSubscribe(mergeWithObserver);
        this.TuitionPaymentFragmentbindingInflater1.subscribe(mergeWithObserver);
        this.b.TuitionPaymentFragmentbindingInflater1(mergeWithObserver.otherObserver);
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class MergeWithObserver<T> extends AtomicInteger implements deriveMediaType<T>, BufferProviderState {
        private static final long serialVersionUID = -4592979584110982903L;
        volatile boolean disposed;
        final deriveMediaType<? super T> downstream;
        volatile boolean mainDone;
        volatile int otherState;
        volatile getBytesPerFrame<T> queue;
        T singleItem;
        final AtomicReference<BufferProviderState> mainDisposable = new AtomicReference<>();
        final OtherObserver<T> otherObserver = new OtherObserver<>(this);
        final AtomicThrowable error = new AtomicThrowable();

        MergeWithObserver(deriveMediaType<? super T> derivemediatype) {
            this.downstream = derivemediatype;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.mainDisposable, bufferProviderState);
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            if (compareAndSet(0, 1)) {
                this.downstream.onNext(t);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                createMediaMuxer createmediamuxer = this.queue;
                if (createmediamuxer == null) {
                    createmediamuxer = new createMediaMuxer(VideoRecordEventStart.bufferSize());
                    this.queue = createmediamuxer;
                }
                createmediamuxer.TuitionPaymentFragmentbindingInflater1(t);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.error, th)) {
                DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.otherObserver);
                if (getAndIncrement() == 0) {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                    return;
                }
                return;
            }
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            this.mainDone = true;
            if (getAndIncrement() == 0) {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return DisposableHelper.TuitionPaymentFragmentbindingInflater1(this.mainDisposable.get());
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            this.disposed = true;
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.mainDisposable);
            DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.otherObserver);
            if (getAndIncrement() == 0) {
                this.queue = null;
                this.singleItem = null;
            }
        }

        final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            deriveMediaType<? super T> derivemediatype = this.downstream;
            int iAddAndGet = 1;
            while (!this.disposed) {
                if (this.error.get() != null) {
                    this.singleItem = null;
                    this.queue = null;
                    derivemediatype.onError(ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.error));
                    return;
                }
                int i = this.otherState;
                if (i == 1) {
                    T t = this.singleItem;
                    this.singleItem = null;
                    this.otherState = 2;
                    derivemediatype.onNext(t);
                    i = 2;
                }
                boolean z = this.mainDone;
                getBytesPerFrame<T> getbytesperframe = this.queue;
                Absent absentTuitionPaymentFragmentspecialinlinedviewModeldefault2 = getbytesperframe != null ? getbytesperframe.TuitionPaymentFragmentspecialinlinedviewModeldefault2() : null;
                boolean z2 = absentTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null;
                if (z && z2 && i == 2) {
                    this.queue = null;
                    derivemediatype.onComplete();
                    return;
                } else if (!z2) {
                    derivemediatype.onNext(absentTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                } else {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
            }
            this.singleItem = null;
            this.queue = null;
        }

        static final class OtherObserver<T> extends AtomicReference<BufferProviderState> implements getDefaultVideoProfile<T> {
            private static final long serialVersionUID = -2935427570954647017L;
            final MergeWithObserver<T> parent;

            OtherObserver(MergeWithObserver<T> mergeWithObserver) {
                this.parent = mergeWithObserver;
            }

            @Override // defpackage.getDefaultVideoProfile
            public final void onSubscribe(BufferProviderState bufferProviderState) {
                DisposableHelper.TuitionPaymentFragmentbindingInflater1(this, bufferProviderState);
            }

            @Override // defpackage.getDefaultVideoProfile
            public final void b(T t) {
                MergeWithObserver<T> mergeWithObserver = this.parent;
                if (mergeWithObserver.compareAndSet(0, 1)) {
                    mergeWithObserver.downstream.onNext(t);
                    mergeWithObserver.otherState = 2;
                } else {
                    mergeWithObserver.singleItem = t;
                    mergeWithObserver.otherState = 1;
                    if (mergeWithObserver.getAndIncrement() != 0) {
                        return;
                    }
                }
                mergeWithObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
            }

            @Override // defpackage.getDefaultVideoProfile
            public final void onError(Throwable th) {
                MergeWithObserver<T> mergeWithObserver = this.parent;
                if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(mergeWithObserver.error, th)) {
                    DisposableHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(mergeWithObserver.mainDisposable);
                    if (mergeWithObserver.getAndIncrement() == 0) {
                        mergeWithObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                        return;
                    }
                    return;
                }
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }
        }
    }
}
