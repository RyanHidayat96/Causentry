package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class share {
    private static dumpEncoderCapabilities<Object, Object> TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    public static int b(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public static <T> T b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static <T> dumpEncoderCapabilities<T, T> b() {
        return (dumpEncoderCapabilities<T, T>) TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i, String str) {
        if (i > 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" > 0 required but it was ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static long TuitionPaymentFragmentspecialinlinedviewModeldefault2(long j, String str) {
        if (j > 0) {
            return j;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" > 0 required but it was ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements dumpEncoderCapabilities<Object, Object> {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // defpackage.dumpEncoderCapabilities
        public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(Object obj, Object obj2) {
            return share.TuitionPaymentFragmentspecialinlinedviewModeldefault3(obj, obj2);
        }
    }
}
