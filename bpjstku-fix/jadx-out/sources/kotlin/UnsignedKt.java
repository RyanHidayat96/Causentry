package kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\bH\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\bH\u0001¢\u0006\u0004\b\f\u0010\n\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0004\u001a\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u000eH\u0081\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u000eH\u0081\b¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u000eH\u0081\b¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0016H\u0081\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0001\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0017\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0018\u0010 \u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u0010H\u0081\b¢\u0006\u0004\b \u0010!\u001a\u0018\u0010\"\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0016H\u0081\b¢\u0006\u0004\b\"\u0010#\u001a\u0017\u0010$\u001a\u00020\u001b2\u0006\u0010\u0001\u001a\u00020\u0010H\u0001¢\u0006\u0004\b$\u0010%\u001a\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u001bH\u0001¢\u0006\u0004\b&\u0010'\u001a\u0018\u0010)\u001a\u00020(2\u0006\u0010\u0001\u001a\u00020\u000eH\u0081\b¢\u0006\u0004\b)\u0010*\u001a \u0010)\u001a\u00020(2\u0006\u0010\u0001\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000eH\u0081\b¢\u0006\u0004\b)\u0010+\u001a\u0018\u0010,\u001a\u00020(2\u0006\u0010\u0001\u001a\u00020\u0010H\u0081\b¢\u0006\u0004\b,\u0010-\u001a\u001f\u0010,\u001a\u00020(2\u0006\u0010\u0001\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u000eH\u0001¢\u0006\u0004\b,\u0010."}, d2 = {"Lkotlin/UInt;", "p0", "p1", "uintRemainder-J1ME1BU", "(II)I", "uintRemainder", "uintDivide-J1ME1BU", "uintDivide", "Lkotlin/ULong;", "ulongDivide-eb3DHEI", "(JJ)J", "ulongDivide", "ulongRemainder-eb3DHEI", "ulongRemainder", "", "uintCompare", "", "ulongCompare", "(JJ)I", "uintToULong", "(I)J", "uintToLong", "", "uintToFloat", "(I)F", "floatToUInt", "(F)I", "", "uintToDouble", "(I)D", "doubleToUInt", "(D)I", "ulongToFloat", "(J)F", "floatToULong", "(F)J", "ulongToDouble", "(J)D", "doubleToULong", "(D)J", "", "uintToString", "(I)Ljava/lang/String;", "(II)Ljava/lang/String;", "ulongToString", "(J)Ljava/lang/String;", "(JI)Ljava/lang/String;"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class UnsignedKt {
    public static final double uintToDouble(int i) {
        return ((double) (Integer.MAX_VALUE & i)) + (((double) ((i >>> 31) << 30)) * 2.0d);
    }

    private static final long uintToLong(int i) {
        return ((long) i) & 4294967295L;
    }

    public static final double ulongToDouble(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    /* JADX INFO: renamed from: uintRemainder-J1ME1BU, reason: not valid java name */
    public static final int m8381uintRemainderJ1ME1BU(int i, int i2) {
        return UInt.m8124constructorimpl((int) ((((long) i) & 4294967295L) % (((long) i2) & 4294967295L)));
    }

    /* JADX INFO: renamed from: uintDivide-J1ME1BU, reason: not valid java name */
    public static final int m8380uintDivideJ1ME1BU(int i, int i2) {
        return UInt.m8124constructorimpl((int) ((((long) i) & 4294967295L) / (((long) i2) & 4294967295L)));
    }

    /* JADX INFO: renamed from: ulongDivide-eb3DHEI, reason: not valid java name */
    public static final long m8382ulongDivideeb3DHEI(long j, long j2) {
        if (j2 < 0) {
            return Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) < 0 ? ULong.m8203constructorimpl(0L) : ULong.m8203constructorimpl(1L);
        }
        if (j >= 0) {
            return ULong.m8203constructorimpl(j / j2);
        }
        long j3 = ((j >>> 1) / j2) << 1;
        return ULong.m8203constructorimpl(j3 + ((long) (Long.compare(ULong.m8203constructorimpl(j - (j3 * j2)) ^ Long.MIN_VALUE, ULong.m8203constructorimpl(j2) ^ Long.MIN_VALUE) < 0 ? 0 : 1)));
    }

    /* JADX INFO: renamed from: ulongRemainder-eb3DHEI, reason: not valid java name */
    public static final long m8383ulongRemaindereb3DHEI(long j, long j2) {
        if (j2 < 0) {
            return Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) < 0 ? j : ULong.m8203constructorimpl(j - j2);
        }
        if (j >= 0) {
            return ULong.m8203constructorimpl(j % j2);
        }
        long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
        if (Long.compare(ULong.m8203constructorimpl(j3) ^ Long.MIN_VALUE, ULong.m8203constructorimpl(j2) ^ Long.MIN_VALUE) < 0) {
            j2 = 0;
        }
        return ULong.m8203constructorimpl(j3 - j2);
    }

    public static final int uintCompare(int i, int i2) {
        return Intrinsics.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
    }

    public static final int ulongCompare(long j, long j2) {
        return Intrinsics.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    private static final long uintToULong(int i) {
        return ULong.m8203constructorimpl(((long) i) & 4294967295L);
    }

    private static final float uintToFloat(int i) {
        return (float) uintToDouble(i);
    }

    private static final int floatToUInt(float f) {
        return doubleToUInt(f);
    }

    public static final int doubleToUInt(double d) {
        if (Double.isNaN(d) || d <= uintToDouble(0)) {
            return 0;
        }
        if (d >= uintToDouble(-1)) {
            return -1;
        }
        if (d <= 2.147483647E9d) {
            return UInt.m8124constructorimpl((int) d);
        }
        return UInt.m8124constructorimpl(UInt.m8124constructorimpl((int) (d - 2.147483647E9d)) + UInt.m8124constructorimpl(Integer.MAX_VALUE));
    }

    private static final float ulongToFloat(long j) {
        return (float) ulongToDouble(j);
    }

    private static final long floatToULong(float f) {
        return doubleToULong(f);
    }

    public static final long doubleToULong(double d) {
        if (Double.isNaN(d) || d <= ulongToDouble(0L)) {
            return 0L;
        }
        if (d >= ulongToDouble(-1L)) {
            return -1L;
        }
        if (d < 9.223372036854776E18d) {
            return ULong.m8203constructorimpl((long) d);
        }
        return ULong.m8203constructorimpl(ULong.m8203constructorimpl((long) (d - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    private static final String uintToString(int i) {
        return String.valueOf(((long) i) & 4294967295L);
    }

    private static final String uintToString(int i, int i2) {
        return ulongToString(((long) i) & 4294967295L, i2);
    }

    private static final String ulongToString(long j) {
        return ulongToString(j, 10);
    }

    public static final String ulongToString(long j, int i) {
        if (j >= 0) {
            String string = Long.toString(j, CharsKt.checkRadix(i));
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb = new StringBuilder();
        String string2 = Long.toString(j3, CharsKt.checkRadix(i));
        Intrinsics.checkNotNullExpressionValue(string2, "");
        sb.append(string2);
        String string3 = Long.toString(j4, CharsKt.checkRadix(i));
        Intrinsics.checkNotNullExpressionValue(string3, "");
        sb.append(string3);
        return sb.toString();
    }
}
