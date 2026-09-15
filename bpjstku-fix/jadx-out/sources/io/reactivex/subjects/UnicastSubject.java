package io.reactivex.subjects;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import defpackage.AudioSettingsBuilder;
import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.ExtraSupportedQualityQuirk;
import defpackage.createMediaMuxer;
import defpackage.deriveMediaType;
import defpackage.share;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class UnicastSubject<T> extends ExtraSupportedQualityQuirk<T> {
    final BasicIntQueueDisposable<T> TuitionPaymentFragmentbindingInflater1;
    volatile boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final AtomicReference<deriveMediaType<? super T>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Throwable f1215a;
    private AtomicBoolean asBinder;
    private volatile boolean asInterface;
    final createMediaMuxer<T> b;
    private boolean d;
    private AtomicReference<Runnable> g;

    public static <T> UnicastSubject<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return new UnicastSubject<>(bufferSize());
    }

    public static <T> UnicastSubject<T> TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        return new UnicastSubject<>(i);
    }

    public static <T> UnicastSubject<T> TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i, Runnable runnable) {
        return new UnicastSubject<>(i, runnable);
    }

    private UnicastSubject(int i) {
        this.b = new createMediaMuxer<>(share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "capacityHint"));
        this.g = new AtomicReference<>();
        this.d = true;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new AtomicReference<>();
        this.asBinder = new AtomicBoolean();
        this.TuitionPaymentFragmentbindingInflater1 = new UnicastQueueDisposable();
    }

    private UnicastSubject(int i, Runnable runnable) {
        this.b = new createMediaMuxer<>(share.TuitionPaymentFragmentspecialinlinedviewModeldefault1(i, "capacityHint"));
        this.g = new AtomicReference<>(share.b(runnable, "onTerminate"));
        this.d = true;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new AtomicReference<>();
        this.asBinder = new AtomicBoolean();
        this.TuitionPaymentFragmentbindingInflater1 = new UnicastQueueDisposable();
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        if (!this.asBinder.get() && this.asBinder.compareAndSet(false, true)) {
            derivemediatype.onSubscribe(this.TuitionPaymentFragmentbindingInflater1);
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.lazySet(derivemediatype);
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.lazySet(null);
                return;
            } else {
                TuitionPaymentFragmentbindingInflater1();
                return;
            }
        }
        EmptyDisposable.b(new IllegalStateException("Only a single observer allowed."), derivemediatype);
    }

    final void b() {
        Runnable runnable = this.g.get();
        if (runnable == null || !PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.g, runnable, null)) {
            return;
        }
        runnable.run();
    }

    @Override // defpackage.deriveMediaType
    public final void onSubscribe(BufferProviderState bufferProviderState) {
        if (this.asInterface || this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            bufferProviderState.dispose();
        }
    }

    @Override // defpackage.deriveMediaType
    public final void onNext(T t) {
        share.b(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.asInterface || this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return;
        }
        this.b.TuitionPaymentFragmentbindingInflater1(t);
        TuitionPaymentFragmentbindingInflater1();
    }

    @Override // defpackage.deriveMediaType
    public final void onError(Throwable th) {
        share.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.asInterface || this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            return;
        }
        this.f1215a = th;
        this.asInterface = true;
        b();
        TuitionPaymentFragmentbindingInflater1();
    }

    @Override // defpackage.deriveMediaType
    public final void onComplete() {
        if (this.asInterface || this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            return;
        }
        this.asInterface = true;
        b();
        TuitionPaymentFragmentbindingInflater1();
    }

    private boolean b(AudioSettingsBuilder<T> audioSettingsBuilder, deriveMediaType<? super T> derivemediatype) {
        Throwable th = this.f1215a;
        if (th == null) {
            return false;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.lazySet(null);
        audioSettingsBuilder.TuitionPaymentFragmentbindingInflater1();
        derivemediatype.onError(th);
        return true;
    }

    private void TuitionPaymentFragmentbindingInflater1() {
        if (this.TuitionPaymentFragmentbindingInflater1.getAndIncrement() == 0) {
            deriveMediaType<? super T> derivemediatype = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get();
            int iAddAndGet = 1;
            int iAddAndGet2 = 1;
            while (derivemediatype == null) {
                iAddAndGet2 = this.TuitionPaymentFragmentbindingInflater1.addAndGet(-iAddAndGet2);
                if (iAddAndGet2 == 0) {
                    return;
                } else {
                    derivemediatype = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get();
                }
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                createMediaMuxer<T> createmediamuxer = this.b;
                boolean z = this.d;
                while (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    boolean z2 = this.asInterface;
                    if (!z && z2 && b(createmediamuxer, derivemediatype)) {
                        return;
                    }
                    derivemediatype.onNext(null);
                    if (!z2) {
                        iAddAndGet = this.TuitionPaymentFragmentbindingInflater1.addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    } else {
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.lazySet(null);
                        Throwable th = this.f1215a;
                        if (th != null) {
                            derivemediatype.onError(th);
                            return;
                        } else {
                            derivemediatype.onComplete();
                            return;
                        }
                    }
                }
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.lazySet(null);
                return;
            }
            createMediaMuxer<T> createmediamuxer2 = this.b;
            boolean z3 = this.d;
            boolean z4 = true;
            int iAddAndGet3 = 1;
            while (!this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                boolean z5 = this.asInterface;
                T tTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                boolean z6 = tTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null;
                if (z5) {
                    if (!z3 && z4) {
                        if (b(createmediamuxer2, derivemediatype)) {
                            return;
                        } else {
                            z4 = false;
                        }
                    }
                    if (z6) {
                        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.lazySet(null);
                        Throwable th2 = this.f1215a;
                        if (th2 != null) {
                            derivemediatype.onError(th2);
                            return;
                        } else {
                            derivemediatype.onComplete();
                            return;
                        }
                    }
                }
                if (!z6) {
                    derivemediatype.onNext(tTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                } else {
                    iAddAndGet3 = this.TuitionPaymentFragmentbindingInflater1.addAndGet(-iAddAndGet3);
                    if (iAddAndGet3 == 0) {
                        return;
                    }
                }
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.lazySet(null);
            createmediamuxer2.TuitionPaymentFragmentbindingInflater1();
        }
    }

    final class UnicastQueueDisposable extends BasicIntQueueDisposable<T> {
        private static final long serialVersionUID = 7926949470189395511L;

        UnicastQueueDisposable() {
        }

        @Override // defpackage.VideoValidatedEncoderProfilesProxy
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            UnicastSubject.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
            return 2;
        }

        @Override // defpackage.AudioSettingsBuilder
        public final T TuitionPaymentFragmentspecialinlinedviewModeldefault2() throws Exception {
            return UnicastSubject.this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        }

        @Override // defpackage.AudioSettingsBuilder
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return UnicastSubject.this.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        }

        @Override // defpackage.AudioSettingsBuilder
        public final void TuitionPaymentFragmentbindingInflater1() {
            UnicastSubject.this.b.TuitionPaymentFragmentbindingInflater1();
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            if (UnicastSubject.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                return;
            }
            UnicastSubject.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
            UnicastSubject.this.b();
            UnicastSubject.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.lazySet(null);
            if (UnicastSubject.this.TuitionPaymentFragmentbindingInflater1.getAndIncrement() == 0) {
                UnicastSubject.this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.lazySet(null);
                if (UnicastSubject.this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    return;
                }
                UnicastSubject.this.b.TuitionPaymentFragmentbindingInflater1();
            }
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return UnicastSubject.this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        }
    }
}
