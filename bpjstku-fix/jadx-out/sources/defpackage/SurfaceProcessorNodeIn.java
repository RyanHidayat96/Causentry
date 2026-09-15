package defpackage;

import javax.security.auth.x500.X500Principal;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes4.dex */
final class SurfaceProcessorNodeIn {
    int TuitionPaymentFragmentbindingInflater1;
    int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    final int asBinder;
    int b;
    int g;

    public SurfaceProcessorNodeIn(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = name;
        this.asBinder = name.length();
    }

    final String TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        int i;
        int i2;
        int i3;
        int i4;
        char c;
        char c2;
        char c3;
        int i5;
        int i6;
        char c4;
        char c5;
        while (true) {
            i = this.g;
            i2 = this.asBinder;
            if (i >= i2 || this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i] != ' ') {
                break;
            }
            this.g = i + 1;
        }
        if (i == i2) {
            return null;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
        this.g = i + 1;
        while (true) {
            i3 = this.g;
            i4 = this.asBinder;
            if (i3 >= i4 || (c5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i3]) == '=' || c5 == ' ') {
                break;
            }
            this.g = i3 + 1;
        }
        if (i3 >= i4) {
            StringBuilder sb = new StringBuilder("Unexpected end of DN: ");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            throw new IllegalStateException(sb.toString());
        }
        this.b = i3;
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i3] == ' ') {
            while (true) {
                i5 = this.g;
                i6 = this.asBinder;
                if (i5 >= i6 || (c4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i5]) == '=' || c4 != ' ') {
                    break;
                }
                this.g = i5 + 1;
            }
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i5] != '=' || i5 == i6) {
                StringBuilder sb2 = new StringBuilder("Unexpected end of DN: ");
                sb2.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                throw new IllegalStateException(sb2.toString());
            }
        }
        this.g++;
        while (true) {
            int i7 = this.g;
            if (i7 >= this.asBinder || this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i7] != ' ') {
                break;
            }
            this.g = i7 + 1;
        }
        int i8 = this.b;
        int i9 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (i8 - i9 > 4) {
            char[] cArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (cArr[i9 + 3] == '.' && (((c = cArr[i9]) == 'O' || c == 'o') && (((c2 = cArr[i9 + 1]) == 'I' || c2 == 'i') && ((c3 = cArr[i9 + 2]) == 'D' || c3 == 'd')))) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i9 + 4;
            }
        }
        char[] cArr2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        int i10 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        return new String(cArr2, i10, i8 - i10);
    }

    final char TuitionPaymentFragmentbindingInflater1() {
        int i = this.g + 1;
        this.g = i;
        if (i == this.asBinder) {
            StringBuilder sb = new StringBuilder("Unexpected end of DN: ");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            throw new IllegalStateException(sb.toString());
        }
        char c = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i];
        if (c == ' ' || c == '%' || c == '\\' || c == '_' || c == '\"' || c == '#') {
            return c;
        }
        switch (c) {
            case '*':
            case '+':
            case ',':
                return c;
            default:
                switch (c) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        return c;
                    default:
                        return TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                }
        }
    }

    private char TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i;
        int i2;
        int iB = b(this.g);
        this.g++;
        if (iB < 128) {
            return (char) iB;
        }
        if (iB < 192 || iB > 247) {
            return '?';
        }
        if (iB <= 223) {
            i = iB & 31;
            i2 = 1;
        } else if (iB <= 239) {
            i = iB & 15;
            i2 = 2;
        } else {
            i = iB & 7;
            i2 = 3;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.g;
            int i5 = i4 + 1;
            this.g = i5;
            if (i5 == this.asBinder || this.TuitionPaymentFragmentspecialinlinedviewModeldefault3[i5] != '\\') {
                return '?';
            }
            int i6 = i4 + 2;
            this.g = i6;
            int iB2 = b(i6);
            this.g++;
            if ((iB2 & DerHeader.TAG_CLASS_PRIVATE) != 128) {
                return '?';
            }
            i = (i << 6) + (iB2 & 63);
        }
        return (char) i;
    }

    final int b(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 >= this.asBinder) {
            StringBuilder sb = new StringBuilder("Malformed DN: ");
            sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            throw new IllegalStateException(sb.toString());
        }
        char[] cArr = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        char c = cArr[i];
        if (c >= '0' && c <= '9') {
            i2 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 'W';
        } else {
            if (c < 'A' || c > 'F') {
                StringBuilder sb2 = new StringBuilder("Malformed DN: ");
                sb2.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                throw new IllegalStateException(sb2.toString());
            }
            i2 = c - '7';
        }
        char c2 = cArr[i4];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                StringBuilder sb3 = new StringBuilder("Malformed DN: ");
                sb3.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                throw new IllegalStateException(sb3.toString());
            }
            i3 = c2 - '7';
        }
        return (i2 << 4) + i3;
    }
}
