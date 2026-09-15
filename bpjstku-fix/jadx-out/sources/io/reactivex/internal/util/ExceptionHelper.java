package io.reactivex.internal.util;

import androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ExceptionHelper {
    public static final Throwable TuitionPaymentFragmentbindingInflater1 = new Termination();

    public static RuntimeException TuitionPaymentFragmentspecialinlinedviewModeldefault1(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        }
        return new RuntimeException(th);
    }

    public static <T> boolean TuitionPaymentFragmentbindingInflater1(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        do {
            th2 = atomicReference.get();
            if (th2 == TuitionPaymentFragmentbindingInflater1) {
                return false;
            }
        } while (!PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, th2, th2 == null ? th : new CompositeException(th2, th)));
        return true;
    }

    public static <T> Throwable TuitionPaymentFragmentspecialinlinedviewModeldefault2(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = TuitionPaymentFragmentbindingInflater1;
        return th != th2 ? atomicReference.getAndSet(th2) : th;
    }

    public static String TuitionPaymentFragmentbindingInflater1(long j, TimeUnit timeUnit) {
        StringBuilder sb = new StringBuilder("The source did not signal an event for ");
        sb.append(j);
        sb.append(" ");
        sb.append(timeUnit.toString().toLowerCase());
        sb.append(" and has been terminated.");
        return sb.toString();
    }

    static final class Termination extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            return this;
        }

        Termination() {
            super("No further exceptions");
        }
    }
}
