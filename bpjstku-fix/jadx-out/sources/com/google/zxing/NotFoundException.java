package com.google.zxing;

/* JADX INFO: loaded from: classes6.dex */
public final class NotFoundException extends ReaderException {
    private static final NotFoundException b;

    static {
        NotFoundException notFoundException = new NotFoundException();
        b = notFoundException;
        notFoundException.setStackTrace(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    private NotFoundException() {
    }

    public static NotFoundException TuitionPaymentFragmentbindingInflater1() {
        return b;
    }
}
