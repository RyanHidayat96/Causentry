package defpackage;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes4.dex */
public final class isProblematicVideoQuality<T> extends ExtraSupportedQualityQuirk<T> {
    private static TuitionPaymentFragmentspecialinlinedviewModeldefault1[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1[0];
    private static TuitionPaymentFragmentspecialinlinedviewModeldefault1[] b = new TuitionPaymentFragmentspecialinlinedviewModeldefault1[0];
    private Lock TuitionPaymentFragmentbindingInflater1;
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private ReadWriteLock TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AtomicReference<Object> f1227a;
    private AtomicReference<Throwable> asBinder;
    private AtomicReference<TuitionPaymentFragmentspecialinlinedviewModeldefault1<T>[]> asInterface;
    private Lock g;

    public static <T> isProblematicVideoQuality<T> TuitionPaymentFragmentbindingInflater1() {
        return new isProblematicVideoQuality<>();
    }

    isProblematicVideoQuality() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = reentrantReadWriteLock;
        this.TuitionPaymentFragmentbindingInflater1 = reentrantReadWriteLock.readLock();
        this.g = reentrantReadWriteLock.writeLock();
        this.asInterface = new AtomicReference<>(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        this.f1227a = new AtomicReference<>();
        this.asBinder = new AtomicReference<>();
    }

    @Override // defpackage.VideoRecordEventStart
    public final void subscribeActual(deriveMediaType<? super T> derivemediatype) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1<T>[] tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1[] tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr2;
        getMinInputChannelCount<Object> getmininputchannelcount;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> tuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1<>(derivemediatype, this);
        derivemediatype.onSubscribe(tuitionPaymentFragmentspecialinlinedviewModeldefault1);
        do {
            tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr = this.asInterface.get();
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr == b) {
                Throwable th = this.asBinder.get();
                if (th == ExceptionHelper.TuitionPaymentFragmentbindingInflater1) {
                    derivemediatype.onComplete();
                    return;
                } else {
                    derivemediatype.onError(th);
                    return;
                }
            }
            int length = tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr.length;
            tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1[length + 1];
            System.arraycopy(tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr, 0, tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr2, 0, length);
            tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr2[length] = tuitionPaymentFragmentspecialinlinedviewModeldefault1;
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.asInterface, tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr, tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr2));
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault1.b) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionPaymentFragmentspecialinlinedviewModeldefault1);
            return;
        }
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault1.b) {
            return;
        }
        synchronized (tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault1.b) {
                return;
            }
            if (tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                return;
            }
            isProblematicVideoQuality<T> isproblematicvideoquality = tuitionPaymentFragmentspecialinlinedviewModeldefault1.f1228a;
            Lock lock = isproblematicvideoquality.TuitionPaymentFragmentbindingInflater1;
            lock.lock();
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1 = isproblematicvideoquality.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Object obj = isproblematicvideoquality.f1227a.get();
            lock.unlock();
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = obj != null;
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
            if (obj == null || tuitionPaymentFragmentspecialinlinedviewModeldefault1.b || NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault1(obj, tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                return;
            }
            while (!tuitionPaymentFragmentspecialinlinedviewModeldefault1.b) {
                synchronized (tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    getmininputchannelcount = tuitionPaymentFragmentspecialinlinedviewModeldefault1.g;
                    if (getmininputchannelcount == null) {
                        tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = false;
                        return;
                    }
                    tuitionPaymentFragmentspecialinlinedviewModeldefault1.g = null;
                }
                getmininputchannelcount.TuitionPaymentFragmentspecialinlinedviewModeldefault1((getMinInputChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault2<? super Object>) tuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        }
    }

    @Override // defpackage.deriveMediaType
    public final void onSubscribe(BufferProviderState bufferProviderState) {
        if (this.asBinder.get() != null) {
            bufferProviderState.dispose();
        }
    }

    @Override // defpackage.deriveMediaType
    public final void onNext(T t) {
        share.b(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.asBinder.get() == null) {
            Object objTuitionPaymentFragmentbindingInflater1 = NotificationLite.TuitionPaymentFragmentbindingInflater1(t);
            b(objTuitionPaymentFragmentbindingInflater1);
            for (TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> tuitionPaymentFragmentspecialinlinedviewModeldefault1 : this.asInterface.get()) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(objTuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        }
    }

    @Override // defpackage.deriveMediaType
    public final void onError(Throwable th) {
        share.b(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.asBinder, null, th)) {
            DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            return;
        }
        Object objTuitionPaymentFragmentbindingInflater1 = NotificationLite.TuitionPaymentFragmentbindingInflater1(th);
        AtomicReference<TuitionPaymentFragmentspecialinlinedviewModeldefault1<T>[]> atomicReference = this.asInterface;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1<T>[] tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr = b;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1<T>[] andSet = atomicReference.getAndSet(tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr);
        if (andSet != tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr) {
            b(objTuitionPaymentFragmentbindingInflater1);
        }
        for (TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> tuitionPaymentFragmentspecialinlinedviewModeldefault1 : andSet) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(objTuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    }

    @Override // defpackage.deriveMediaType
    public final void onComplete() {
        if (PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.asBinder, null, ExceptionHelper.TuitionPaymentFragmentbindingInflater1)) {
            Object objB = NotificationLite.b();
            AtomicReference<TuitionPaymentFragmentspecialinlinedviewModeldefault1<T>[]> atomicReference = this.asInterface;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1<T>[] tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr = b;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1<T>[] andSet = atomicReference.getAndSet(tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr);
            if (andSet != tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr) {
                b(objB);
            }
            for (TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> tuitionPaymentFragmentspecialinlinedviewModeldefault1 : andSet) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(objB, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        }
    }

    final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1<T>[] tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1[] tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr2;
        do {
            tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr = this.asInterface.get();
            int length = tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr.length;
            if (length == 0) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr[i] == tuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            } else {
                TuitionPaymentFragmentspecialinlinedviewModeldefault1[] tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr3 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1[length - 1];
                System.arraycopy(tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr, 0, tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr3, 0, i);
                System.arraycopy(tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr, i + 1, tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr3, i, (length - i) - 1);
                tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr2 = tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr3;
            }
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.asInterface, tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr, tuitionPaymentFragmentspecialinlinedviewModeldefault1Arr2));
    }

    private void b(Object obj) {
        this.g.lock();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
        this.f1227a.lazySet(obj);
        this.g.unlock();
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1<T> implements BufferProviderState, getMinInputChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault2<Object> {
        long TuitionPaymentFragmentbindingInflater1;
        final deriveMediaType<? super T> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final isProblematicVideoQuality<T> f1228a;
        private boolean asBinder;
        volatile boolean b;
        getMinInputChannelCount<Object> g;

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(deriveMediaType<? super T> derivemediatype, isProblematicVideoQuality<T> isproblematicvideoquality) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = derivemediatype;
            this.f1228a = isproblematicvideoquality;
        }

        @Override // defpackage.BufferProviderState
        public final void dispose() {
            if (this.b) {
                return;
            }
            this.b = true;
            this.f1228a.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this);
        }

        @Override // defpackage.BufferProviderState
        public final boolean isDisposed() {
            return this.b;
        }

        final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Object obj, long j) {
            if (this.b) {
                return;
            }
            if (!this.asBinder) {
                synchronized (this) {
                    if (this.b) {
                        return;
                    }
                    if (this.TuitionPaymentFragmentbindingInflater1 == j) {
                        return;
                    }
                    if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                        getMinInputChannelCount<Object> getmininputchannelcount = this.g;
                        if (getmininputchannelcount == null) {
                            getmininputchannelcount = new getMinInputChannelCount<>();
                            this.g = getmininputchannelcount;
                        }
                        getmininputchannelcount.TuitionPaymentFragmentspecialinlinedviewModeldefault1(obj);
                        return;
                    }
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
                    this.asBinder = true;
                }
            }
            if (this.b) {
                return;
            }
            NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault1(obj, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }

        @Override // getMinInputChannelCount.TuitionPaymentFragmentspecialinlinedviewModeldefault2, defpackage.findQualityInTargetQualities
        public final boolean b(Object obj) {
            return this.b || NotificationLite.TuitionPaymentFragmentspecialinlinedviewModeldefault1(obj, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    }
}
