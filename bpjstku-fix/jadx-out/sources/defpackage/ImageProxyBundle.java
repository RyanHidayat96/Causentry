package defpackage;

/* JADX INFO: loaded from: classes5.dex */
public class ImageProxyBundle implements ImageOutputConfigRotationValue {
    public int b() {
        return 1;
    }

    @Override // defpackage.ImageOutputConfigRotationValue
    public void TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdaaddObserver2androidxcameracoreimplLiveDataObservable lambdaaddobserver2androidxcameracoreimpllivedataobservable) {
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        StringBuilder sb = new StringBuilder();
        while (lambdaaddobserver2androidxcameracoreimpllivedataobservable.d < lambdaaddobserver2androidxcameracoreimpllivedataobservable.b.length() - lambdaaddobserver2androidxcameracoreimpllivedataobservable.g) {
            char cCharAt = lambdaaddobserver2androidxcameracoreimpllivedataobservable.b.charAt(lambdaaddobserver2androidxcameracoreimpllivedataobservable.d);
            lambdaaddobserver2androidxcameracoreimpllivedataobservable.d++;
            int iTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(cCharAt, sb);
            int length = lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.length() + ((sb.length() / 3) << 1);
            lambdaaddobserver2androidxcameracoreimpllivedataobservable.b(length);
            int i = lambdaaddobserver2androidxcameracoreimpllivedataobservable.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - length;
            if (lambdaaddobserver2androidxcameracoreimpllivedataobservable.d >= lambdaaddobserver2androidxcameracoreimpllivedataobservable.b.length() - lambdaaddobserver2androidxcameracoreimpllivedataobservable.g) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (i < 2 || i > 2)) {
                    iTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaaddobserver2androidxcameracoreimpllivedataobservable, sb, sb2, iTuitionPaymentFragmentbindingInflater1);
                }
                while (sb.length() % 3 == 1 && ((iTuitionPaymentFragmentbindingInflater1 <= 3 && i != 1) || iTuitionPaymentFragmentbindingInflater1 > 3)) {
                    iTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaaddobserver2androidxcameracoreimpllivedataobservable, sb, sb2, iTuitionPaymentFragmentbindingInflater1);
                }
                break;
            }
            if (sb.length() % 3 == 0 && (iTuitionPaymentFragmentspecialinlinedviewModeldefault1 = LiveDataObservable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaaddobserver2androidxcameracoreimpllivedataobservable.b, lambdaaddobserver2androidxcameracoreimpllivedataobservable.d, b())) != b()) {
                lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = iTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                break;
            }
        }
        TuitionPaymentFragmentbindingInflater1(lambdaaddobserver2androidxcameracoreimpllivedataobservable, sb);
    }

    private int TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaaddObserver2androidxcameracoreimplLiveDataObservable lambdaaddobserver2androidxcameracoreimpllivedataobservable, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        lambdaaddobserver2androidxcameracoreimpllivedataobservable.d--;
        int iTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(lambdaaddobserver2androidxcameracoreimpllivedataobservable.b.charAt(lambdaaddobserver2androidxcameracoreimpllivedataobservable.d), sb2);
        lambdaaddobserver2androidxcameracoreimpllivedataobservable.asInterface = null;
        return iTuitionPaymentFragmentbindingInflater1;
    }

    void TuitionPaymentFragmentbindingInflater1(lambdaaddObserver2androidxcameracoreimplLiveDataObservable lambdaaddobserver2androidxcameracoreimpllivedataobservable, StringBuilder sb) {
        int length = sb.length() / 3;
        int length2 = sb.length() % 3;
        int length3 = lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.length() + (length << 1);
        lambdaaddobserver2androidxcameracoreimpllivedataobservable.b(length3);
        int i = lambdaaddobserver2androidxcameracoreimpllivedataobservable.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - length3;
        if (length2 == 2) {
            sb.append((char) 0);
            while (sb.length() >= 3) {
                b(lambdaaddobserver2androidxcameracoreimpllivedataobservable, sb);
            }
            if (lambdaaddobserver2androidxcameracoreimpllivedataobservable.d < lambdaaddobserver2androidxcameracoreimpllivedataobservable.b.length() - lambdaaddobserver2androidxcameracoreimpllivedataobservable.g) {
                lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.append((char) 254);
            }
        } else if (i == 1 && length2 == 1) {
            while (sb.length() >= 3) {
                b(lambdaaddobserver2androidxcameracoreimpllivedataobservable, sb);
            }
            if (lambdaaddobserver2androidxcameracoreimpllivedataobservable.d < lambdaaddobserver2androidxcameracoreimpllivedataobservable.b.length() - lambdaaddobserver2androidxcameracoreimpllivedataobservable.g) {
                lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.append((char) 254);
            }
            lambdaaddobserver2androidxcameracoreimpllivedataobservable.d--;
        } else if (length2 == 0) {
            while (sb.length() >= 3) {
                b(lambdaaddobserver2androidxcameracoreimpllivedataobservable, sb);
            }
            if (i > 0 || lambdaaddobserver2androidxcameracoreimpllivedataobservable.d < lambdaaddobserver2androidxcameracoreimpllivedataobservable.b.length() - lambdaaddobserver2androidxcameracoreimpllivedataobservable.g) {
                lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.append((char) 254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
    }

    int TuitionPaymentFragmentbindingInflater1(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append((char) 3);
            return 1;
        }
        if (c >= '0' && c <= '9') {
            sb.append((char) (c - ','));
            return 1;
        }
        if (c >= 'A' && c <= 'Z') {
            sb.append((char) (c - '3'));
            return 1;
        }
        if (c >= 0 && c <= 31) {
            sb.append((char) 0);
            sb.append(c);
            return 2;
        }
        if (c >= '!' && c <= '/') {
            sb.append((char) 1);
            sb.append((char) (c - '!'));
            return 2;
        }
        if (c >= ':' && c <= '@') {
            sb.append((char) 1);
            sb.append((char) (c - '+'));
            return 2;
        }
        if (c >= '[' && c <= '_') {
            sb.append((char) 1);
            sb.append((char) (c - 'E'));
            return 2;
        }
        if (c >= '`' && c <= 127) {
            sb.append((char) 2);
            sb.append((char) (c - '`'));
            return 2;
        }
        if (c >= 128) {
            sb.append("\u0001\u001e");
            return TuitionPaymentFragmentbindingInflater1((char) (c - 128), sb) + 2;
        }
        throw new IllegalArgumentException("Illegal character: ".concat(String.valueOf(c)));
    }

    static void b(lambdaaddObserver2androidxcameracoreimplLiveDataObservable lambdaaddobserver2androidxcameracoreimpllivedataobservable, StringBuilder sb) {
        int iCharAt = (sb.charAt(0) * 1600) + (sb.charAt(1) * '(') + sb.charAt(2) + 1;
        lambdaaddobserver2androidxcameracoreimpllivedataobservable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.append(new String(new char[]{(char) (iCharAt / 256), (char) (iCharAt % 256)}));
        sb.delete(0, 3);
    }
}
