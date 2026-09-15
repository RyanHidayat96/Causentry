package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class getCaptureIds implements ImageOutputConfigRotationValue {
    /* JADX WARN: Code duplicated, block: B:46:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d9 A[Catch: all -> 0x00f2, TryCatch #0 {all -> 0x00f2, blocks: (B:22:0x0063, B:28:0x006f, B:37:0x0099, B:43:0x00b0, B:45:0x00c8, B:48:0x00e2, B:47:0x00d9, B:51:0x00ea, B:52:0x00f1), top: B:56:0x0063 }] */
    @Override // defpackage.ImageOutputConfigRotationValue
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdaaddObserver2androidxcameracoreimplLiveDataObservable lambdaaddobserver2androidxcameracoreimpllivedataobservable) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (lambdaaddobserver2androidxcameracoreimpllivedataobservable.d >= lambdaaddobserver2androidxcameracoreimpllivedataobservable.b.length() - lambdaaddobserver2androidxcameracoreimpllivedataobservable.g) {
                break;
            }
            char cCharAt = lambdaaddobserver2androidxcameracoreimpllivedataobservable.b.charAt(lambdaaddobserver2androidxcameracoreimpllivedataobservable.d);
            if (cCharAt >= ' ' && cCharAt <= '?') {
                sb.append(cCharAt);
            } else if (cCharAt >= '@' && cCharAt <= '^') {
                sb.append((char) (cCharAt - '@'));
            } else {
                LiveDataObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault2(cCharAt);
            }
            lambdaaddobserver2androidxcameracoreimpllivedataobservable.d++;
            if (sb.length() >= 4) {
                lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.append(TuitionPaymentFragmentbindingInflater1(sb));
                sb.delete(0, 4);
                if (LiveDataObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaaddobserver2androidxcameracoreimpllivedataobservable.b, lambdaaddobserver2androidxcameracoreimpllivedataobservable.d, 4) != 4) {
                    lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    break;
                }
            }
        }
        sb.append((char) 31);
        try {
            int length = sb.length();
            if (length == 0) {
                lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                return;
            }
            if (length == 1) {
                lambdaaddobserver2androidxcameracoreimpllivedataobservable.b(lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.length());
                int i = lambdaaddobserver2androidxcameracoreimpllivedataobservable.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                int length2 = lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.length();
                if ((lambdaaddobserver2androidxcameracoreimpllivedataobservable.b.length() - lambdaaddobserver2androidxcameracoreimpllivedataobservable.g) - lambdaaddobserver2androidxcameracoreimpllivedataobservable.d == 0 && i - length2 <= 2) {
                    lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i2 = length - 1;
            String strTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(sb);
            boolean z = lambdaaddobserver2androidxcameracoreimpllivedataobservable.d >= lambdaaddobserver2androidxcameracoreimpllivedataobservable.b.length() - lambdaaddobserver2androidxcameracoreimpllivedataobservable.g && i2 <= 2;
            if (i2 <= 2) {
                lambdaaddobserver2androidxcameracoreimpllivedataobservable.b(lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.length() + i2);
                if (lambdaaddobserver2androidxcameracoreimpllivedataobservable.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.length() >= 3) {
                    lambdaaddobserver2androidxcameracoreimpllivedataobservable.b(lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.length() + strTuitionPaymentFragmentbindingInflater1.length());
                } else if (z) {
                    lambdaaddobserver2androidxcameracoreimpllivedataobservable.asInterface = null;
                    lambdaaddobserver2androidxcameracoreimpllivedataobservable.d -= i2;
                }
                lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.append(strTuitionPaymentFragmentbindingInflater1);
            } else if (z) {
                lambdaaddobserver2androidxcameracoreimpllivedataobservable.asInterface = null;
                lambdaaddobserver2androidxcameracoreimpllivedataobservable.d -= i2;
            } else {
                lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.append(strTuitionPaymentFragmentbindingInflater1);
            }
            lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        } catch (Throwable th) {
            lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            throw th;
        }
    }

    private static String TuitionPaymentFragmentbindingInflater1(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        int iCharAt = (charSequence.charAt(0) << 18) + ((length >= 2 ? charSequence.charAt(1) : (char) 0) << '\f') + ((length >= 3 ? charSequence.charAt(2) : (char) 0) << 6) + (length >= 4 ? charSequence.charAt(3) : (char) 0);
        char c = (char) ((iCharAt >> 16) & 255);
        char c2 = (char) ((iCharAt >> 8) & 255);
        char c3 = (char) (iCharAt & 255);
        StringBuilder sb = new StringBuilder(3);
        sb.append(c);
        if (length >= 2) {
            sb.append(c2);
        }
        if (length >= 3) {
            sb.append(c3);
        }
        return sb.toString();
    }
}
