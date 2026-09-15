package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public final class postValue extends ImageProxyBundle {
    @Override // defpackage.ImageProxyBundle
    public final int b() {
        return 3;
    }

    @Override // defpackage.ImageProxyBundle, defpackage.ImageOutputConfigRotationValue
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdaaddObserver2androidxcameracoreimplLiveDataObservable lambdaaddobserver2androidxcameracoreimpllivedataobservable) {
        StringBuilder sb = new StringBuilder();
        while (lambdaaddobserver2androidxcameracoreimpllivedataobservable.d < lambdaaddobserver2androidxcameracoreimpllivedataobservable.b.length() - lambdaaddobserver2androidxcameracoreimpllivedataobservable.g) {
            char cCharAt = lambdaaddobserver2androidxcameracoreimpllivedataobservable.b.charAt(lambdaaddobserver2androidxcameracoreimpllivedataobservable.d);
            lambdaaddobserver2androidxcameracoreimpllivedataobservable.d++;
            TuitionPaymentFragmentbindingInflater1(cCharAt, sb);
            if (sb.length() % 3 == 0) {
                b(lambdaaddobserver2androidxcameracoreimpllivedataobservable, sb);
                int iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = LiveDataObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaaddobserver2androidxcameracoreimpllivedataobservable.b, lambdaaddobserver2androidxcameracoreimpllivedataobservable.d, 3);
                if (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 != 3) {
                    lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    break;
                }
            }
        }
        TuitionPaymentFragmentbindingInflater1(lambdaaddobserver2androidxcameracoreimpllivedataobservable, sb);
    }

    @Override // defpackage.ImageProxyBundle
    final int TuitionPaymentFragmentbindingInflater1(char c, StringBuilder sb) {
        if (c == '\r') {
            sb.append((char) 0);
        } else if (c == '*') {
            sb.append((char) 1);
        } else if (c == '>') {
            sb.append((char) 2);
        } else if (c == ' ') {
            sb.append((char) 3);
        } else if (c >= '0' && c <= '9') {
            sb.append((char) (c - ','));
        } else if (c >= 'A' && c <= 'Z') {
            sb.append((char) (c - '3'));
        } else {
            LiveDataObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault2(c);
        }
        return 1;
    }

    @Override // defpackage.ImageProxyBundle
    final void TuitionPaymentFragmentbindingInflater1(lambdaaddObserver2androidxcameracoreimplLiveDataObservable lambdaaddobserver2androidxcameracoreimpllivedataobservable, StringBuilder sb) {
        lambdaaddobserver2androidxcameracoreimpllivedataobservable.b(lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.length());
        int length = lambdaaddobserver2androidxcameracoreimpllivedataobservable.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.length();
        lambdaaddobserver2androidxcameracoreimpllivedataobservable.d -= sb.length();
        if ((lambdaaddobserver2androidxcameracoreimpllivedataobservable.b.length() - lambdaaddobserver2androidxcameracoreimpllivedataobservable.g) - lambdaaddobserver2androidxcameracoreimpllivedataobservable.d > 1 || length > 1 || (lambdaaddobserver2androidxcameracoreimpllivedataobservable.b.length() - lambdaaddobserver2androidxcameracoreimpllivedataobservable.g) - lambdaaddobserver2androidxcameracoreimpllivedataobservable.d != length) {
            lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.append((char) 254);
        }
        if (lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < 0) {
            lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        }
    }
}
