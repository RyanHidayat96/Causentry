package defpackage;

import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class traceState {
    public abstract boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(char c);

    public static traceState b() {
        return TuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
    }

    public static traceState TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return g.TuitionPaymentFragmentbindingInflater1;
    }

    public static traceState TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return b.b;
    }

    public static traceState TuitionPaymentFragmentspecialinlinedviewModeldefault2(char c) {
        return new TuitionPaymentFragmentbindingInflater1(c);
    }

    protected traceState() {
    }

    public boolean TuitionPaymentFragmentbindingInflater1(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public int b(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException(updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, length, FirebaseAnalytics.Param.INDEX));
        }
        while (i < length) {
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int TuitionPaymentFragmentspecialinlinedviewModeldefault1(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (TuitionPaymentFragmentspecialinlinedviewModeldefault3(charSequence.charAt(i2))) {
                i++;
            }
        }
        return i;
    }

    public String toString() {
        return super.toString();
    }

    static abstract class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends traceState {
        TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }
    }

    static abstract class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        private final String b;

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str) {
            this.b = str;
        }

        @Override // defpackage.traceState
        public final String toString() {
            return this.b;
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        static final traceState b = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();

        @Override // defpackage.traceState
        public final int TuitionPaymentFragmentspecialinlinedviewModeldefault1(CharSequence charSequence) {
            return 0;
        }

        @Override // defpackage.traceState
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(char c) {
            return false;
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            super("CharMatcher.none()");
        }

        @Override // defpackage.traceState
        public final int b(CharSequence charSequence, int i) {
            int length = charSequence.length();
            if (i < 0 || i > length) {
                throw new IndexOutOfBoundsException(updateAndVerifyState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i, length, FirebaseAnalytics.Param.INDEX));
            }
            return -1;
        }

        @Override // defpackage.traceState
        public final boolean TuitionPaymentFragmentbindingInflater1(CharSequence charSequence) {
            return charSequence.length() == 0;
        }
    }

    static final class g extends TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        private static int b = Integer.numberOfLeadingZeros(31);
        static final traceState TuitionPaymentFragmentbindingInflater1 = new g();

        g() {
            super("CharMatcher.whitespace()");
        }

        @Override // defpackage.traceState
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(char c) {
            return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c) >>> b) == c;
        }
    }

    static final class b extends TuitionPaymentFragmentspecialinlinedviewModeldefault3 {
        static final traceState b = new b();

        @Override // defpackage.traceState
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(char c) {
            return c <= 127;
        }

        b() {
            super("CharMatcher.ascii()");
        }
    }

    static final class TuitionPaymentFragmentbindingInflater1 extends TuitionPaymentFragmentspecialinlinedviewModeldefault1 {
        private final char TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentbindingInflater1(char c) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = c;
        }

        @Override // defpackage.traceState
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(char c) {
            return c == this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        @Override // defpackage.traceState
        public final String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.is('");
            char c = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            char[] cArr = {'\\', 'u', 0, 0, 0, 0};
            for (int i = 0; i < 4; i++) {
                cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
                c = (char) (c >> 4);
            }
            sb.append(String.copyValueOf(cArr));
            sb.append("')");
            return sb.toString();
        }
    }
}
