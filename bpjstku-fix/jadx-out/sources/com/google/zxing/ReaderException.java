package com.google.zxing;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ReaderException extends Exception {
    protected static final boolean TuitionPaymentFragmentbindingInflater1;
    protected static final StackTraceElement[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    static {
        TuitionPaymentFragmentbindingInflater1 = System.getProperty("surefire.test.class.path") != null;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new StackTraceElement[0];
    }

    ReaderException() {
    }

    ReaderException(Throwable th) {
        super(th);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        synchronized (this) {
        }
        return null;
    }
}
