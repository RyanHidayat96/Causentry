package kotlin;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0007\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0003\u0010\u0004\"\u001f\u0010\t\u001a\u00020\u0000*\u00020\u00028Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"", "p0", "", "Char", "(I)C", "getCode", "(C)I", "getCode$annotations", "(C)V", "code"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CharCodeKt {
    private static final int getCode(char c) {
        return c;
    }

    public static /* synthetic */ void getCode$annotations(char c) {
    }

    private static final char Char(int i) {
        if (i < 0 || i > 65535) {
            throw new IllegalArgumentException("Invalid Char code: ".concat(String.valueOf(i)));
        }
        return (char) i;
    }
}
