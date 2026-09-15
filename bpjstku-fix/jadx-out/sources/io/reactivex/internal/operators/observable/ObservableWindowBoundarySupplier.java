package io.reactivex.internal.operators.observable;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import defpackage.AutoValue_VideoValidatedEncoderProfilesProxy;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.VideoRecordEventStart;
import defpackage.deriveMediaType;
import defpackage.dumpMediaCodecListForFormat;
import defpackage.isProblematicMimeType;
import defpackage.notifySuspended;
import defpackage.share;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.subjects.UnicastSubject;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class ObservableWindowBoundarySupplier<T, B> extends notifySuspended<T, VideoRecordEventStart<T>> {
    private Callable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<B>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public ObservableWindowBoundarySupplier(AutoValue_VideoValidatedEncoderProfilesProxy<T> autoValue_VideoValidatedEncoderProfilesProxy, Callable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<B>> callable, int i) {
        super(autoValue_VideoValidatedEncoderProfilesProxy);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = callable;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i;
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super VideoRecordEventStart<T>> derivemediatype) {
        this.TuitionPaymentFragmentbindingInflater1.subscribe(new WindowBoundaryMainObserver(derivemediatype, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class WindowBoundaryMainObserver<T, B> extends AtomicInteger implements deriveMediaType<T>, BufferProviderState, Runnable {
        private static final long serialVersionUID = 2233020065421370272L;
        final int capacityHint;
        volatile boolean done;
        final deriveMediaType<? super VideoRecordEventStart<T>> downstream;
        final Callable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<B>> other;
        BufferProviderState upstream;
        UnicastSubject<T> window;
        private static TuitionPaymentFragmentspecialinlinedviewModeldefault2<Object, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2<>(null);
        static final Object TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new Object();
        final AtomicReference<TuitionPaymentFragmentspecialinlinedviewModeldefault2<T, B>> boundaryObserver = new AtomicReference<>();
        final AtomicInteger windows = new AtomicInteger(1);
        final MpscLinkedQueue<Object> queue = new MpscLinkedQueue<>();
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicBoolean stopWindows = new AtomicBoolean();

        WindowBoundaryMainObserver(deriveMediaType<? super VideoRecordEventStart<T>> derivemediatype, int i, Callable<? extends AutoValue_VideoValidatedEncoderProfilesProxy<B>> callable) {
            this.downstream = derivemediatype;
            this.capacityHint = i;
            this.other = callable;
        }

        @Override // defpackage.deriveMediaType
        public final void onSubscribe(BufferProviderState bufferProviderState) {
            if (DisposableHelper.b(this.upstream, bufferProviderState)) {
                this.upstream = bufferProviderState;
                this.downstream.onSubscribe(this);
                this.queue.TuitionPaymentFragmentbindingInflater1(TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(T t) {
            this.queue.TuitionPaymentFragmentbindingInflater1(t);
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            b();
            if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(this.errors, th)) {
                this.done = true;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            } else {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            b();
            this.done = true;
            TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            if (this.stopWindows.compareAndSet(false, true)) {
                b();
                if (this.windows.decrementAndGet() == 0) {
                    this.upstream.dispose();
                }
            }
        }

        private void b() {
            AtomicReference<TuitionPaymentFragmentspecialinlinedviewModeldefault2<T, B>> atomicReference = this.boundaryObserver;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2<Object, Object> tuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            TuitionPaymentFragmentspecialinlinedviewModeldefault2<T, B> andSet = atomicReference.getAndSet((TuitionPaymentFragmentspecialinlinedviewModeldefault2<T, B>) tuitionPaymentFragmentspecialinlinedviewModeldefault2);
            if (andSet == null || andSet == tuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return;
            }
            andSet.dispose();
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.stopWindows.get();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.windows.decrementAndGet() == 0) {
                this.upstream.dispose();
            }
        }

        final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            if (getAndIncrement() == 0) {
                deriveMediaType<? super VideoRecordEventStart<T>> derivemediatype = this.downstream;
                MpscLinkedQueue<Object> mpscLinkedQueue = this.queue;
                AtomicThrowable atomicThrowable = this.errors;
                int iAddAndGet = 1;
                while (this.windows.get() != 0) {
                    UnicastSubject<T> unicastSubject = this.window;
                    boolean z = this.done;
                    if (z && atomicThrowable.get() != null) {
                        mpscLinkedQueue.TuitionPaymentFragmentbindingInflater1();
                        Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable);
                        if (unicastSubject != null) {
                            this.window = null;
                            unicastSubject.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        }
                        derivemediatype.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        return;
                    }
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = mpscLinkedQueue.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    boolean z2 = objTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null;
                    if (z && z2) {
                        Throwable thTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ExceptionHelper.TuitionPaymentFragmentspecialinlinedviewModeldefault2(atomicThrowable);
                        if (thTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            if (unicastSubject != null) {
                                this.window = null;
                                unicastSubject.onComplete();
                            }
                            derivemediatype.onComplete();
                            return;
                        }
                        if (unicastSubject != null) {
                            this.window = null;
                            unicastSubject.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        }
                        derivemediatype.onError(thTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                        return;
                    }
                    if (!z2) {
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault2 != TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                            unicastSubject.onNext((T) objTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        } else {
                            if (unicastSubject != null) {
                                this.window = null;
                                unicastSubject.onComplete();
                            }
                            if (!this.stopWindows.get()) {
                                UnicastSubject<T> unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault2 = UnicastSubject.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.capacityHint, this);
                                this.window = unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                this.windows.getAndIncrement();
                                try {
                                    AutoValue_VideoValidatedEncoderProfilesProxy autoValue_VideoValidatedEncoderProfilesProxy = (AutoValue_VideoValidatedEncoderProfilesProxy) share.b(this.other.call(), "The other Callable returned a null ObservableSource");
                                    TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
                                    if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.boundaryObserver, null, tuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                                        autoValue_VideoValidatedEncoderProfilesProxy.subscribe(tuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                        derivemediatype.onNext(unicastSubjectTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                                    }
                                } catch (Throwable th) {
                                    dumpMediaCodecListForFormat.b(th);
                                    ExceptionHelper.TuitionPaymentFragmentbindingInflater1(atomicThrowable, th);
                                    this.done = true;
                                }
                            }
                        }
                    } else {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                }
                mpscLinkedQueue.TuitionPaymentFragmentbindingInflater1();
                this.window = null;
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2<T, B> extends isProblematicMimeType<B> {
        private WindowBoundaryMainObserver<T, B> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = windowBoundaryMainObserver;
        }

        @Override // defpackage.deriveMediaType
        public final void onNext(B b) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            dispose();
            WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(windowBoundaryMainObserver.boundaryObserver, this, null);
            windowBoundaryMainObserver.queue.TuitionPaymentFragmentbindingInflater1(WindowBoundaryMainObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            windowBoundaryMainObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }

        @Override // defpackage.deriveMediaType
        public final void onError(Throwable th) {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            windowBoundaryMainObserver.upstream.dispose();
            if (ExceptionHelper.TuitionPaymentFragmentbindingInflater1(windowBoundaryMainObserver.errors, th)) {
                windowBoundaryMainObserver.done = true;
                windowBoundaryMainObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
            } else {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            }
        }

        @Override // defpackage.deriveMediaType
        public final void onComplete() {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            WindowBoundaryMainObserver<T, B> windowBoundaryMainObserver = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            windowBoundaryMainObserver.upstream.dispose();
            windowBoundaryMainObserver.done = true;
            windowBoundaryMainObserver.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        }
    }
}
