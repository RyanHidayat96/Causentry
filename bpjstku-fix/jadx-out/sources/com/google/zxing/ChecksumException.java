package com.google.zxing;

/* JADX INFO: loaded from: classes6.dex */
public final class ChecksumException extends ReaderException {
    private static final ChecksumException b;

    static {
        ChecksumException checksumException = new ChecksumException();
        b = checksumException;
        checksumException.setStackTrace(TuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    private ChecksumException() {
    }

    public static ChecksumException TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return TuitionPaymentFragmentbindingInflater1 ? new ChecksumException() : b;
    }
}
