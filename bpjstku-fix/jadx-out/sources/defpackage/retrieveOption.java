package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class retrieveOption extends getPriorities {
    protected abstract char[] b(char c);

    protected retrieveOption() {
    }

    @Override // defpackage.getPriorities
    public String TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (b(str.charAt(i)) != null) {
                return TuitionPaymentFragmentbindingInflater1(str, i);
            }
        }
        return str;
    }

    protected final String TuitionPaymentFragmentbindingInflater1(String str, int i) {
        int length = str.length();
        char[] cArrB = ConfigOption.b();
        int length2 = cArrB.length;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            char[] cArrB2 = b(str.charAt(i));
            if (cArrB2 != null) {
                int length3 = cArrB2.length;
                int i4 = i - i2;
                int i5 = i3 + i4;
                int i6 = i5 + length3;
                if (length2 < i6) {
                    length2 = ((length - i) * 2) + i6;
                    if (length2 < 0) {
                        throw new AssertionError("Cannot increase internal buffer any further");
                    }
                    char[] cArr = new char[length2];
                    if (i3 > 0) {
                        System.arraycopy(cArrB, 0, cArr, 0, i3);
                    }
                    cArrB = cArr;
                }
                if (i4 > 0) {
                    str.getChars(i2, i, cArrB, i3);
                    i3 = i5;
                }
                if (length3 > 0) {
                    System.arraycopy(cArrB2, 0, cArrB, i3, length3);
                    i3 += length3;
                }
                i2 = i + 1;
            }
            i++;
        }
        int i7 = length - i2;
        if (i7 > 0) {
            int i8 = i7 + i3;
            if (length2 < i8) {
                if (i8 < 0) {
                    throw new AssertionError("Cannot increase internal buffer any further");
                }
                char[] cArr2 = new char[i8];
                if (i3 > 0) {
                    System.arraycopy(cArrB, 0, cArr2, 0, i3);
                }
                cArrB = cArr2;
            }
            str.getChars(i2, length, cArrB, i3);
            i3 = i8;
        }
        return new String(cArrB, 0, i3);
    }
}
