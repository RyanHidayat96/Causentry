package io.reactivex.internal.schedulers;

import defpackage.BufferProviderState;
import defpackage.DeactivateEncoderSurfaceBeforeStopEncoderQuirk;
import defpackage.hasMatchedVideoProfileForDynamicRange;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes4.dex */
public final class ScheduledRunnable extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, BufferProviderState {
    private static final long serialVersionUID = -6120223772001106981L;
    final Runnable actual;
    private static Object TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new Object();
    private static Object TuitionPaymentFragmentbindingInflater1 = new Object();
    private static Object TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new Object();
    private static Object b = new Object();

    public ScheduledRunnable(Runnable runnable, hasMatchedVideoProfileForDynamicRange hasmatchedvideoprofilefordynamicrange) {
        super(3);
        this.actual = runnable;
        lazySet(0, hasmatchedvideoprofilefordynamicrange);
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        run();
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.actual.run();
        } catch (Throwable th) {
            try {
                DeactivateEncoderSurfaceBeforeStopEncoderQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault2(th);
            } finally {
                lazySet(2, null);
                Object obj3 = get(0);
                if (obj3 != TuitionPaymentFragmentspecialinlinedviewModeldefault3 && compareAndSet(0, obj3, b) && obj3 != null) {
                    ((hasMatchedVideoProfileForDynamicRange) obj3).TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
                }
                do {
                    obj = get(1);
                    if (obj == TuitionPaymentFragmentbindingInflater1 || obj == TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                        break;
                    }
                } while (!compareAndSet(1, obj, b));
            }
        }
        lazySet(2, null);
        Object obj4 = get(0);
        if (obj4 != TuitionPaymentFragmentspecialinlinedviewModeldefault3 && compareAndSet(0, obj4, b) && obj4 != null) {
            ((hasMatchedVideoProfileForDynamicRange) obj4).TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
        }
        do {
            obj = get(1);
            Object obj5 = TuitionPaymentFragmentbindingInflater1;
            if (obj == obj5) {
                return;
            } else {
                if (obj == obj2) {
                    return;
                }
            }
        } while (!compareAndSet(1, obj, b));
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == b) {
                return;
            }
            if (obj == TuitionPaymentFragmentbindingInflater1) {
                future.cancel(false);
                return;
            } else if (obj == TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // defpackage.BufferProviderState
    public final void dispose() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        while (true) {
            Object obj5 = get(1);
            if (obj5 == b || obj5 == (obj3 = TuitionPaymentFragmentbindingInflater1) || obj5 == (obj4 = TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                break;
            }
            boolean z = get(2) != Thread.currentThread();
            if (z) {
                obj3 = obj4;
            }
            if (compareAndSet(1, obj5, obj3)) {
                if (obj5 == null) {
                    break;
                }
                ((Future) obj5).cancel(z);
                break;
            }
        }
        do {
            obj = get(0);
            if (obj == b || obj == (obj2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((hasMatchedVideoProfileForDynamicRange) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
    }

    @Override // defpackage.BufferProviderState
    public final boolean isDisposed() {
        Object obj = get(0);
        return obj == TuitionPaymentFragmentspecialinlinedviewModeldefault3 || obj == b;
    }
}
