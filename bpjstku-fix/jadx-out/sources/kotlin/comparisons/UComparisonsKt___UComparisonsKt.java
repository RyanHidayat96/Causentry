package kotlin.comparisons;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\u001f\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a(\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a(\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0087\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a(\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0087\b¢\u0006\u0004\b\u0016\u0010\u0017\u001a#\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0002\u001a\u00020\u0018\"\u00020\u0000H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a#\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00062\n\u0010\u0002\u001a\u00020\u001b\"\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a#\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\t2\n\u0010\u0002\u001a\u00020\u001e\"\u00020\tH\u0007¢\u0006\u0004\b\u001f\u0010 \u001a#\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\f2\n\u0010\u0002\u001a\u00020!\"\u00020\fH\u0007¢\u0006\u0004\b\"\u0010#\u001a\u001f\u0010%\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b$\u0010\u0004\u001a\u001f\u0010%\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0006H\u0007¢\u0006\u0004\b&\u0010\b\u001a\u001f\u0010%\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\tH\u0007¢\u0006\u0004\b'\u0010\u000b\u001a\u001f\u0010%\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\fH\u0007¢\u0006\u0004\b(\u0010\u000e\u001a(\u0010%\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b)\u0010\u0011\u001a(\u0010%\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b*\u0010\u0013\u001a(\u0010%\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0087\b¢\u0006\u0004\b+\u0010\u0015\u001a(\u0010%\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0087\b¢\u0006\u0004\b,\u0010\u0017\u001a#\u0010%\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0002\u001a\u00020\u0018\"\u00020\u0000H\u0007¢\u0006\u0004\b-\u0010\u001a\u001a#\u0010%\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00062\n\u0010\u0002\u001a\u00020\u001b\"\u00020\u0006H\u0007¢\u0006\u0004\b.\u0010\u001d\u001a#\u0010%\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\t2\n\u0010\u0002\u001a\u00020\u001e\"\u00020\tH\u0007¢\u0006\u0004\b/\u0010 \u001a#\u0010%\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\f2\n\u0010\u0002\u001a\u00020!\"\u00020\fH\u0007¢\u0006\u0004\b0\u0010#"}, d2 = {"Lkotlin/UInt;", "p0", "p1", "maxOf-J1ME1BU", "(II)I", "maxOf", "Lkotlin/ULong;", "maxOf-eb3DHEI", "(JJ)J", "Lkotlin/UByte;", "maxOf-Kr8caGY", "(BB)B", "Lkotlin/UShort;", "maxOf-5PvTz6A", "(SS)S", "p2", "maxOf-WZ9TVnA", "(III)I", "maxOf-sambcqE", "(JJJ)J", "maxOf-b33U2AM", "(BBB)B", "maxOf-VKSA0NQ", "(SSS)S", "Lkotlin/UIntArray;", "maxOf-Md2H83M", "(I[I)I", "Lkotlin/ULongArray;", "maxOf-R03FKyM", "(J[J)J", "Lkotlin/UByteArray;", "maxOf-Wr6uiD8", "(B[B)B", "Lkotlin/UShortArray;", "maxOf-t1qELG4", "(S[S)S", "minOf-J1ME1BU", "minOf", "minOf-eb3DHEI", "minOf-Kr8caGY", "minOf-5PvTz6A", "minOf-WZ9TVnA", "minOf-sambcqE", "minOf-b33U2AM", "minOf-VKSA0NQ", "minOf-Md2H83M", "minOf-R03FKyM", "minOf-Wr6uiD8", "minOf-t1qELG4"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/comparisons/UComparisonsKt")
public class UComparisonsKt___UComparisonsKt {
    /* JADX INFO: renamed from: maxOf-J1ME1BU, reason: not valid java name */
    public static final int m9216maxOfJ1ME1BU(int i, int i2) {
        return Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) >= 0 ? i : i2;
    }

    /* JADX INFO: renamed from: maxOf-eb3DHEI, reason: not valid java name */
    public static final long m9224maxOfeb3DHEI(long j, long j2) {
        return Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) >= 0 ? j : j2;
    }

    /* JADX INFO: renamed from: maxOf-Kr8caGY, reason: not valid java name */
    public static final byte m9217maxOfKr8caGY(byte b, byte b2) {
        return Intrinsics.compare(b & UByte.MAX_VALUE, b2 & UByte.MAX_VALUE) >= 0 ? b : b2;
    }

    /* JADX INFO: renamed from: maxOf-5PvTz6A, reason: not valid java name */
    public static final short m9215maxOf5PvTz6A(short s, short s2) {
        return Intrinsics.compare(s & UShort.MAX_VALUE, 65535 & s2) >= 0 ? s : s2;
    }

    /* JADX INFO: renamed from: maxOf-WZ9TVnA, reason: not valid java name */
    private static final int m9221maxOfWZ9TVnA(int i, int i2, int i3) {
        return UComparisonsKt.m9216maxOfJ1ME1BU(i, UComparisonsKt.m9216maxOfJ1ME1BU(i2, i3));
    }

    /* JADX INFO: renamed from: maxOf-sambcqE, reason: not valid java name */
    private static final long m9225maxOfsambcqE(long j, long j2, long j3) {
        return UComparisonsKt.m9224maxOfeb3DHEI(j, UComparisonsKt.m9224maxOfeb3DHEI(j2, j3));
    }

    /* JADX INFO: renamed from: maxOf-b33U2AM, reason: not valid java name */
    private static final byte m9223maxOfb33U2AM(byte b, byte b2, byte b3) {
        return UComparisonsKt.m9217maxOfKr8caGY(b, UComparisonsKt.m9217maxOfKr8caGY(b2, b3));
    }

    /* JADX INFO: renamed from: maxOf-VKSA0NQ, reason: not valid java name */
    private static final short m9220maxOfVKSA0NQ(short s, short s2, short s3) {
        return UComparisonsKt.m9215maxOf5PvTz6A(s, UComparisonsKt.m9215maxOf5PvTz6A(s2, s3));
    }

    /* JADX INFO: renamed from: maxOf-Md2H83M, reason: not valid java name */
    public static final int m9218maxOfMd2H83M(int i, int... iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        int iM8185getSizeimpl = UIntArray.m8185getSizeimpl(iArr);
        for (int i2 = 0; i2 < iM8185getSizeimpl; i2++) {
            i = UComparisonsKt.m9216maxOfJ1ME1BU(i, UIntArray.m8184getpVg5ArA(iArr, i2));
        }
        return i;
    }

    /* JADX INFO: renamed from: maxOf-R03FKyM, reason: not valid java name */
    public static final long m9219maxOfR03FKyM(long j, long... jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        int iM8264getSizeimpl = ULongArray.m8264getSizeimpl(jArr);
        for (int i = 0; i < iM8264getSizeimpl; i++) {
            j = UComparisonsKt.m9224maxOfeb3DHEI(j, ULongArray.m8263getsVKNKU(jArr, i));
        }
        return j;
    }

    /* JADX INFO: renamed from: maxOf-Wr6uiD8, reason: not valid java name */
    public static final byte m9222maxOfWr6uiD8(byte b, byte... bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        int iM8106getSizeimpl = UByteArray.m8106getSizeimpl(bArr);
        for (int i = 0; i < iM8106getSizeimpl; i++) {
            b = UComparisonsKt.m9217maxOfKr8caGY(b, UByteArray.m8105getw2LRezQ(bArr, i));
        }
        return b;
    }

    /* JADX INFO: renamed from: maxOf-t1qELG4, reason: not valid java name */
    public static final short m9226maxOft1qELG4(short s, short... sArr) {
        Intrinsics.checkNotNullParameter(sArr, "");
        int iM8369getSizeimpl = UShortArray.m8369getSizeimpl(sArr);
        for (int i = 0; i < iM8369getSizeimpl; i++) {
            s = UComparisonsKt.m9215maxOf5PvTz6A(s, UShortArray.m8368getMh2AYeg(sArr, i));
        }
        return s;
    }

    /* JADX INFO: renamed from: minOf-J1ME1BU, reason: not valid java name */
    public static final int m9228minOfJ1ME1BU(int i, int i2) {
        return Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) <= 0 ? i : i2;
    }

    /* JADX INFO: renamed from: minOf-eb3DHEI, reason: not valid java name */
    public static final long m9236minOfeb3DHEI(long j, long j2) {
        return Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) <= 0 ? j : j2;
    }

    /* JADX INFO: renamed from: minOf-Kr8caGY, reason: not valid java name */
    public static final byte m9229minOfKr8caGY(byte b, byte b2) {
        return Intrinsics.compare(b & UByte.MAX_VALUE, b2 & UByte.MAX_VALUE) <= 0 ? b : b2;
    }

    /* JADX INFO: renamed from: minOf-5PvTz6A, reason: not valid java name */
    public static final short m9227minOf5PvTz6A(short s, short s2) {
        return Intrinsics.compare(s & UShort.MAX_VALUE, 65535 & s2) <= 0 ? s : s2;
    }

    /* JADX INFO: renamed from: minOf-WZ9TVnA, reason: not valid java name */
    private static final int m9233minOfWZ9TVnA(int i, int i2, int i3) {
        return UComparisonsKt.m9228minOfJ1ME1BU(i, UComparisonsKt.m9228minOfJ1ME1BU(i2, i3));
    }

    /* JADX INFO: renamed from: minOf-sambcqE, reason: not valid java name */
    private static final long m9237minOfsambcqE(long j, long j2, long j3) {
        return UComparisonsKt.m9236minOfeb3DHEI(j, UComparisonsKt.m9236minOfeb3DHEI(j2, j3));
    }

    /* JADX INFO: renamed from: minOf-b33U2AM, reason: not valid java name */
    private static final byte m9235minOfb33U2AM(byte b, byte b2, byte b3) {
        return UComparisonsKt.m9229minOfKr8caGY(b, UComparisonsKt.m9229minOfKr8caGY(b2, b3));
    }

    /* JADX INFO: renamed from: minOf-VKSA0NQ, reason: not valid java name */
    private static final short m9232minOfVKSA0NQ(short s, short s2, short s3) {
        return UComparisonsKt.m9227minOf5PvTz6A(s, UComparisonsKt.m9227minOf5PvTz6A(s2, s3));
    }

    /* JADX INFO: renamed from: minOf-Md2H83M, reason: not valid java name */
    public static final int m9230minOfMd2H83M(int i, int... iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        int iM8185getSizeimpl = UIntArray.m8185getSizeimpl(iArr);
        for (int i2 = 0; i2 < iM8185getSizeimpl; i2++) {
            i = UComparisonsKt.m9228minOfJ1ME1BU(i, UIntArray.m8184getpVg5ArA(iArr, i2));
        }
        return i;
    }

    /* JADX INFO: renamed from: minOf-R03FKyM, reason: not valid java name */
    public static final long m9231minOfR03FKyM(long j, long... jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        int iM8264getSizeimpl = ULongArray.m8264getSizeimpl(jArr);
        for (int i = 0; i < iM8264getSizeimpl; i++) {
            j = UComparisonsKt.m9236minOfeb3DHEI(j, ULongArray.m8263getsVKNKU(jArr, i));
        }
        return j;
    }

    /* JADX INFO: renamed from: minOf-Wr6uiD8, reason: not valid java name */
    public static final byte m9234minOfWr6uiD8(byte b, byte... bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        int iM8106getSizeimpl = UByteArray.m8106getSizeimpl(bArr);
        for (int i = 0; i < iM8106getSizeimpl; i++) {
            b = UComparisonsKt.m9229minOfKr8caGY(b, UByteArray.m8105getw2LRezQ(bArr, i));
        }
        return b;
    }

    /* JADX INFO: renamed from: minOf-t1qELG4, reason: not valid java name */
    public static final short m9238minOft1qELG4(short s, short... sArr) {
        Intrinsics.checkNotNullParameter(sArr, "");
        int iM8369getSizeimpl = UShortArray.m8369getSizeimpl(sArr);
        for (int i = 0; i < iM8369getSizeimpl; i++) {
            s = UComparisonsKt.m9227minOf5PvTz6A(s, UShortArray.m8368getMh2AYeg(sArr, i));
        }
        return s;
    }
}
