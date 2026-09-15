package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class LiveDataObservableExternalSyntheticLambda3 extends clone {
    private static final char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static final char b;
    private static final char[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {'T', 'N', '*', 'E'};
    private static final char[] TuitionPaymentFragmentbindingInflater1 = {'/', ':', '+', '.'};

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr;
        b = cArr[0];
    }

    @Override // defpackage.clone
    public final boolean[] TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
        int i;
        if (str.length() < 2) {
            StringBuilder sb = new StringBuilder();
            char c = b;
            sb.append(c);
            sb.append(str);
            sb.append(c);
            str = sb.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault2 = LiveDataObservableExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cArr, upperCase);
            boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault3 = LiveDataObservableExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cArr, upperCase2);
            char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault4 = LiveDataObservableExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cArr2, upperCase);
            boolean zTuitionPaymentFragmentspecialinlinedviewModeldefault5 = LiveDataObservableExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cArr2, upperCase2);
            if (zTuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                if (!zTuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(String.valueOf(str)));
                }
            } else if (!zTuitionPaymentFragmentspecialinlinedviewModeldefault4) {
                if (zTuitionPaymentFragmentspecialinlinedviewModeldefault3 || zTuitionPaymentFragmentspecialinlinedviewModeldefault5) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(String.valueOf(str)));
                }
                StringBuilder sb2 = new StringBuilder();
                char c2 = b;
                sb2.append(c2);
                sb2.append(str);
                sb2.append(c2);
                str = sb2.toString();
            } else if (!zTuitionPaymentFragmentspecialinlinedviewModeldefault5) {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(String.valueOf(str)));
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                i2 += 9;
            } else {
                if (!LiveDataObservableExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(TuitionPaymentFragmentbindingInflater1, str.charAt(i3))) {
                    StringBuilder sb3 = new StringBuilder("Cannot encode : '");
                    sb3.append(str.charAt(i3));
                    sb3.append('\'');
                    throw new IllegalArgumentException(sb3.toString());
                }
                i2 += 10;
            }
        }
        boolean[] zArr = new boolean[i2 + (str.length() - 1)];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i6 = 0;
            while (true) {
                if (i6 >= LiveDataObservableExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length) {
                    i = 0;
                    break;
                }
                if (upperCase3 == LiveDataObservableExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1[i6]) {
                    i = LiveDataObservableExternalSyntheticLambda0.b[i6];
                    break;
                }
                i6++;
            }
            int i7 = 0;
            int i8 = 0;
            boolean z = true;
            while (i7 < 7) {
                zArr[i4] = z;
                i4++;
                if (((i >> (6 - i7)) & 1) == 0 || i8 == 1) {
                    z = !z;
                    i7++;
                    i8 = 0;
                } else {
                    i8++;
                }
            }
            if (i5 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
        }
        return zArr;
    }
}
