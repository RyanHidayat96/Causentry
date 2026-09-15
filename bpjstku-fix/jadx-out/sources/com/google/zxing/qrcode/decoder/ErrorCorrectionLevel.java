package com.google.zxing.qrcode.decoder;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 com.google.zxing.qrcode.decoder.ErrorCorrectionLevel, still in use, count: 1, list:
  (r1v1 com.google.zxing.qrcode.decoder.ErrorCorrectionLevel) from 0x0028: FILLED_NEW_ARRAY 
  (r1v1 com.google.zxing.qrcode.decoder.ErrorCorrectionLevel)
  (r0v0 com.google.zxing.qrcode.decoder.ErrorCorrectionLevel)
  (r3v2 com.google.zxing.qrcode.decoder.ErrorCorrectionLevel)
  (r2v1 com.google.zxing.qrcode.decoder.ErrorCorrectionLevel)
 A[WRAPPED] (LINE:36) elemType: com.google.zxing.qrcode.decoder.ErrorCorrectionLevel
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes5.dex */
public final class ErrorCorrectionLevel {
    L(1),
    /* JADX INFO: Fake field, exist only in values array */
    M(0),
    /* JADX INFO: Fake field, exist only in values array */
    Q(3),
    /* JADX INFO: Fake field, exist only in values array */
    H(2);

    private static final ErrorCorrectionLevel[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final int bits;

    public static ErrorCorrectionLevel valueOf(String str) {
        return (ErrorCorrectionLevel) Enum.valueOf(ErrorCorrectionLevel.class, str);
    }

    public static ErrorCorrectionLevel[] values() {
        return (ErrorCorrectionLevel[]) TuitionPaymentFragmentbindingInflater1.clone();
    }

    static {
        ErrorCorrectionLevel errorCorrectionLevel = L;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ErrorCorrectionLevel[]{errorCorrectionLevel, errorCorrectionLevel, errorCorrectionLevel, errorCorrectionLevel};
    }

    private ErrorCorrectionLevel(int i) {
        super(str, i);
        this.bits = i;
    }

    public static ErrorCorrectionLevel TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
        if (i >= 0) {
            ErrorCorrectionLevel[] errorCorrectionLevelArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (i < errorCorrectionLevelArr.length) {
                return errorCorrectionLevelArr[i];
            }
        }
        throw new IllegalArgumentException();
    }
}
