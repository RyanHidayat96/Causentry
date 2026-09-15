package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ConfigProvider {
    public static long TuitionPaymentFragmentspecialinlinedviewModeldefault2(long j, long j2) {
        long j3 = j + j2;
        return (((j2 ^ j) > 0L ? 1 : ((j2 ^ j) == 0L ? 0 : -1)) < 0) | ((j ^ j3) >= 0) ? j3 : ((j3 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    public static long b(long j, long j2) {
        long j3 = j + j2;
        if (((j ^ j2) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        StringBuilder sb = new StringBuilder("overflow: ");
        sb.append("checkedAdd");
        sb.append("(");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(")");
        throw new ArithmeticException(sb.toString());
    }
}
