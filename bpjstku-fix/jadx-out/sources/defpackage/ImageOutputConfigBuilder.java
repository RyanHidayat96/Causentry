package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class ImageOutputConfigBuilder implements ImageOutputConfigRotationValue {
    @Override // defpackage.ImageOutputConfigRotationValue
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdaaddObserver2androidxcameracoreimplLiveDataObservable lambdaaddobserver2androidxcameracoreimpllivedataobservable) {
        String str = lambdaaddobserver2androidxcameracoreimpllivedataobservable.b;
        int i = lambdaaddobserver2androidxcameracoreimpllivedataobservable.d;
        int length = str.length();
        if (i < length) {
            char cCharAt = str.charAt(i);
            int i2 = 0;
            while (cCharAt >= '0' && cCharAt <= '9' && i < length) {
                i2++;
                i++;
                if (i < length) {
                    cCharAt = str.charAt(i);
                }
            }
            if (i2 >= 2) {
                char cCharAt2 = lambdaaddobserver2androidxcameracoreimpllivedataobservable.b.charAt(lambdaaddobserver2androidxcameracoreimpllivedataobservable.d);
                char cCharAt3 = lambdaaddobserver2androidxcameracoreimpllivedataobservable.b.charAt(lambdaaddobserver2androidxcameracoreimpllivedataobservable.d + 1);
                if (cCharAt2 < '0' || cCharAt2 > '9' || cCharAt3 < '0' || cCharAt3 > '9') {
                    StringBuilder sb = new StringBuilder("not digits: ");
                    sb.append(cCharAt2);
                    sb.append(cCharAt3);
                    throw new IllegalArgumentException(sb.toString());
                }
                lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.append((char) (((cCharAt2 - '0') * 10) + (cCharAt3 - '0') + 130));
                lambdaaddobserver2androidxcameracoreimpllivedataobservable.d += 2;
                return;
            }
        }
        char cCharAt4 = lambdaaddobserver2androidxcameracoreimpllivedataobservable.b.charAt(lambdaaddobserver2androidxcameracoreimpllivedataobservable.d);
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = LiveDataObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaaddobserver2androidxcameracoreimpllivedataobservable.b, lambdaaddobserver2androidxcameracoreimpllivedataobservable.d, 0);
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 0) {
            if (cCharAt4 >= 128 && cCharAt4 <= 255) {
                lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.append((char) 235);
                lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.append((char) (cCharAt4 - 127));
                lambdaaddobserver2androidxcameracoreimpllivedataobservable.d++;
                return;
            }
            lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.append((char) (cCharAt4 + 1));
            lambdaaddobserver2androidxcameracoreimpllivedataobservable.d++;
            return;
        }
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 1) {
            lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.append((char) 230);
            lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            return;
        }
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 2) {
            lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.append((char) 239);
            lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 2;
            return;
        }
        if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 3) {
            lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.append((char) 238);
            lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 3;
        } else if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 == 4) {
            lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.append((char) 240);
            lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 4;
        } else {
            if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 != 5) {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(iTuitionPaymentFragmentspecialinlinedviewModeldefault1)));
            }
            lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.append((char) 231);
            lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 5;
        }
    }
}
