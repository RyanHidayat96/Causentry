package com.google.zxing;

/* JADX INFO: loaded from: classes5.dex */
public final class FormatException extends ReaderException {
    private static final FormatException TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    static {
        FormatException formatException = new FormatException();
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = formatException;
        formatException.setStackTrace(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    private FormatException() {
    }

    private FormatException(Throwable th) {
        super(th);
    }

    public static FormatException TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return TuitionPaymentFragmentbindingInflater1 ? new FormatException() : TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public static FormatException TuitionPaymentFragmentspecialinlinedviewModeldefault2(Throwable th) {
        return TuitionPaymentFragmentbindingInflater1 ? new FormatException(th) : TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }
}
