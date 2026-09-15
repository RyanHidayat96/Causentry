package kotlin.collections.unsigned;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.UnsignedKt;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u001d\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\b*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\t\u0010\n\u001a\u001c\u0010\u0006\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u001c\u0010\u0006\u001a\u00020\u0010*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013*\u00020\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0019\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0013*\u00020\u0007H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0013*\u00020\u000bH\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0019\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013*\u00020\u000fH\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a/\u0010!\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u001f\u0010 \u001a/\u0010!\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\"\u0010#\u001a/\u0010!\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u0001H\u0007¢\u0006\u0004\b$\u0010%\u001a/\u0010!\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u0001H\u0007¢\u0006\u0004\b&\u0010'\u001a\u0015\u0010*\u001a\u0004\u0018\u00010\u0003*\u00020\u0000H\u0007¢\u0006\u0004\b(\u0010)\u001a\u0015\u0010*\u001a\u0004\u0018\u00010\b*\u00020\u0007H\u0007¢\u0006\u0004\b+\u0010,\u001a\u0015\u0010*\u001a\u0004\u0018\u00010\f*\u00020\u000bH\u0007¢\u0006\u0004\b-\u0010.\u001a\u0015\u0010*\u001a\u0004\u0018\u00010\u0010*\u00020\u000fH\u0007¢\u0006\u0004\b/\u00100\u001a=\u00106\u001a\u0004\u0018\u00010\u0003\"\u000e\b\u0000\u00102*\b\u0012\u0004\u0012\u00028\u000001*\u00020\u00002\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u000003H\u0087\bø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a=\u00106\u001a\u0004\u0018\u00010\b\"\u000e\b\u0000\u00102*\b\u0012\u0004\u0012\u00028\u000001*\u00020\u00072\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u000003H\u0087\bø\u0001\u0000¢\u0006\u0004\b7\u00108\u001a=\u00106\u001a\u0004\u0018\u00010\f\"\u000e\b\u0000\u00102*\b\u0012\u0004\u0012\u00028\u000001*\u00020\u000b2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u000003H\u0087\bø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a=\u00106\u001a\u0004\u0018\u00010\u0010\"\u000e\b\u0000\u00102*\b\u0012\u0004\u0012\u00028\u000001*\u00020\u000f2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u000003H\u0087\bø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a1\u0010A\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u001a\u0010\u0002\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00030=j\n\u0012\u0006\b\u0000\u0012\u00020\u0003`>H\u0007¢\u0006\u0004\b?\u0010@\u001a1\u0010A\u001a\u0004\u0018\u00010\b*\u00020\u00072\u001a\u0010\u0002\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\b0=j\n\u0012\u0006\b\u0000\u0012\u00020\b`>H\u0007¢\u0006\u0004\bB\u0010C\u001a1\u0010A\u001a\u0004\u0018\u00010\f*\u00020\u000b2\u001a\u0010\u0002\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\f0=j\n\u0012\u0006\b\u0000\u0012\u00020\f`>H\u0007¢\u0006\u0004\bD\u0010E\u001a1\u0010A\u001a\u0004\u0018\u00010\u0010*\u00020\u000f2\u001a\u0010\u0002\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00100=j\n\u0012\u0006\b\u0000\u0012\u00020\u0010`>H\u0007¢\u0006\u0004\bF\u0010G\u001a\u0015\u0010I\u001a\u0004\u0018\u00010\u0003*\u00020\u0000H\u0007¢\u0006\u0004\bH\u0010)\u001a\u0015\u0010I\u001a\u0004\u0018\u00010\b*\u00020\u0007H\u0007¢\u0006\u0004\bJ\u0010,\u001a\u0015\u0010I\u001a\u0004\u0018\u00010\f*\u00020\u000bH\u0007¢\u0006\u0004\bK\u0010.\u001a\u0015\u0010I\u001a\u0004\u0018\u00010\u0010*\u00020\u000fH\u0007¢\u0006\u0004\bL\u00100\u001a=\u0010N\u001a\u0004\u0018\u00010\u0003\"\u000e\b\u0000\u00102*\b\u0012\u0004\u0012\u00028\u000001*\u00020\u00002\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u000003H\u0087\bø\u0001\u0000¢\u0006\u0004\bM\u00105\u001a=\u0010N\u001a\u0004\u0018\u00010\b\"\u000e\b\u0000\u00102*\b\u0012\u0004\u0012\u00028\u000001*\u00020\u00072\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u000003H\u0087\bø\u0001\u0000¢\u0006\u0004\bO\u00108\u001a=\u0010N\u001a\u0004\u0018\u00010\f\"\u000e\b\u0000\u00102*\b\u0012\u0004\u0012\u00028\u000001*\u00020\u000b2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u000003H\u0087\bø\u0001\u0000¢\u0006\u0004\bP\u0010:\u001a=\u0010N\u001a\u0004\u0018\u00010\u0010\"\u000e\b\u0000\u00102*\b\u0012\u0004\u0012\u00028\u000001*\u00020\u000f2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u000003H\u0087\bø\u0001\u0000¢\u0006\u0004\bQ\u0010<\u001a1\u0010S\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u001a\u0010\u0002\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00030=j\n\u0012\u0006\b\u0000\u0012\u00020\u0003`>H\u0007¢\u0006\u0004\bR\u0010@\u001a1\u0010S\u001a\u0004\u0018\u00010\b*\u00020\u00072\u001a\u0010\u0002\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\b0=j\n\u0012\u0006\b\u0000\u0012\u00020\b`>H\u0007¢\u0006\u0004\bT\u0010C\u001a1\u0010S\u001a\u0004\u0018\u00010\f*\u00020\u000b2\u001a\u0010\u0002\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\f0=j\n\u0012\u0006\b\u0000\u0012\u00020\f`>H\u0007¢\u0006\u0004\bU\u0010E\u001a1\u0010S\u001a\u0004\u0018\u00010\u0010*\u00020\u000f2\u001a\u0010\u0002\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00100=j\n\u0012\u0006\b\u0000\u0012\u00020\u0010`>H\u0007¢\u0006\u0004\bV\u0010G\u001a+\u0010X\u001a\u00020W*\u00020\u00002\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020W03H\u0087\bø\u0001\u0000¢\u0006\u0004\bX\u0010Y\u001a+\u0010X\u001a\u00020W*\u00020\u00072\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020W03H\u0087\bø\u0001\u0000¢\u0006\u0004\bX\u0010Z\u001a+\u0010X\u001a\u00020W*\u00020\u000b2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020W03H\u0087\bø\u0001\u0000¢\u0006\u0004\bX\u0010[\u001a+\u0010X\u001a\u00020W*\u00020\u000f2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020W03H\u0087\bø\u0001\u0000¢\u0006\u0004\bX\u0010\\\u001a+\u0010^\u001a\u00020]*\u00020\u00002\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020]03H\u0087\bø\u0001\u0000¢\u0006\u0004\b^\u0010_\u001a+\u0010^\u001a\u00020]*\u00020\u00072\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020]03H\u0087\bø\u0001\u0000¢\u0006\u0004\b^\u0010`\u001a+\u0010^\u001a\u00020]*\u00020\u000b2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020]03H\u0087\bø\u0001\u0000¢\u0006\u0004\b^\u0010a\u001a+\u0010^\u001a\u00020]*\u00020\u000f2\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020]03H\u0087\bø\u0001\u0000¢\u0006\u0004\b^\u0010b\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Lkotlin/UIntArray;", "", "p0", "Lkotlin/UInt;", "elementAt-qFRl0hI", "([II)I", "elementAt", "Lkotlin/ULongArray;", "Lkotlin/ULong;", "elementAt-r7IrZao", "([JI)J", "Lkotlin/UByteArray;", "Lkotlin/UByte;", "elementAt-PpDY95g", "([BI)B", "Lkotlin/UShortArray;", "Lkotlin/UShort;", "elementAt-nggk6HY", "([SI)S", "", "asList--ajY-9A", "([I)Ljava/util/List;", "asList", "asList-QwZRm1k", "([J)Ljava/util/List;", "asList-GBYM_sE", "([B)Ljava/util/List;", "asList-rL5Bavg", "([S)Ljava/util/List;", "p1", "p2", "binarySearch-2fe2U9s", "([IIII)I", "binarySearch", "binarySearch-K6DWlUc", "([JJII)I", "binarySearch-WpHrYlw", "([BBII)I", "binarySearch-EtDCXyQ", "([SSII)I", "max--ajY-9A", "([I)Lkotlin/UInt;", "max", "max-QwZRm1k", "([J)Lkotlin/ULong;", "max-GBYM_sE", "([B)Lkotlin/UByte;", "max-rL5Bavg", "([S)Lkotlin/UShort;", "", "R", "Lkotlin/Function1;", "maxBy-jgv0xPQ", "([ILkotlin/jvm/functions/Function1;)Lkotlin/UInt;", "maxBy", "maxBy-MShoTSo", "([JLkotlin/jvm/functions/Function1;)Lkotlin/ULong;", "maxBy-JOV_ifY", "([BLkotlin/jvm/functions/Function1;)Lkotlin/UByte;", "maxBy-xTcfx_M", "([SLkotlin/jvm/functions/Function1;)Lkotlin/UShort;", "Ljava/util/Comparator;", "Lkotlin/cancelAll;", "maxWith-YmdZ_VM", "([ILjava/util/Comparator;)Lkotlin/UInt;", "maxWith", "maxWith-zrEWJaI", "([JLjava/util/Comparator;)Lkotlin/ULong;", "maxWith-XMRcp5o", "([BLjava/util/Comparator;)Lkotlin/UByte;", "maxWith-eOHTfZs", "([SLjava/util/Comparator;)Lkotlin/UShort;", "min--ajY-9A", "min", "min-QwZRm1k", "min-GBYM_sE", "min-rL5Bavg", "minBy-jgv0xPQ", "minBy", "minBy-MShoTSo", "minBy-JOV_ifY", "minBy-xTcfx_M", "minWith-YmdZ_VM", "minWith", "minWith-zrEWJaI", "minWith-XMRcp5o", "minWith-eOHTfZs", "Ljava/math/BigDecimal;", "sumOfBigDecimal", "([ILkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([JLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([BLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([SLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "Ljava/math/BigInteger;", "sumOfBigInteger", "([ILkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([JLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([BLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([SLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;"}, k = 5, mv = {2, 1, 0}, pn = "", xi = 49, xs = "kotlin/collections/unsigned/UArraysKt")
class UArraysKt___UArraysJvmKt {
    /* JADX INFO: renamed from: elementAt-qFRl0hI, reason: not valid java name */
    private static final int m8515elementAtqFRl0hI(int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return UIntArray.m8184getpVg5ArA(iArr, i);
    }

    /* JADX INFO: renamed from: elementAt-r7IrZao, reason: not valid java name */
    private static final long m8516elementAtr7IrZao(long[] jArr, int i) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return ULongArray.m8263getsVKNKU(jArr, i);
    }

    /* JADX INFO: renamed from: elementAt-PpDY95g, reason: not valid java name */
    private static final byte m8513elementAtPpDY95g(byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return UByteArray.m8105getw2LRezQ(bArr, i);
    }

    /* JADX INFO: renamed from: elementAt-nggk6HY, reason: not valid java name */
    private static final short m8514elementAtnggk6HY(short[] sArr, int i) {
        Intrinsics.checkNotNullParameter(sArr, "");
        return UShortArray.m8368getMh2AYeg(sArr, i);
    }

    /* JADX INFO: renamed from: asList--ajY-9A, reason: not valid java name */
    public static final List<UInt> m8501asListajY9A(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return new UArraysKt___UArraysJvmKt$asList$1(iArr);
    }

    /* JADX INFO: renamed from: asList-QwZRm1k, reason: not valid java name */
    public static final List<ULong> m8503asListQwZRm1k(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return new UArraysKt___UArraysJvmKt$asList$2(jArr);
    }

    /* JADX INFO: renamed from: asList-GBYM_sE, reason: not valid java name */
    public static final List<UByte> m8502asListGBYM_sE(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return new UArraysKt___UArraysJvmKt$asList$3(bArr);
    }

    /* JADX INFO: renamed from: asList-rL5Bavg, reason: not valid java name */
    public static final List<UShort> m8504asListrL5Bavg(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "");
        return new UArraysKt___UArraysJvmKt$asList$4(sArr);
    }

    /* JADX INFO: renamed from: binarySearch-2fe2U9s$default, reason: not valid java name */
    public static /* synthetic */ int m8506binarySearch2fe2U9s$default(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = UIntArray.m8185getSizeimpl(iArr);
        }
        return UArraysKt.m8505binarySearch2fe2U9s(iArr, i, i2, i3);
    }

    /* JADX INFO: renamed from: binarySearch-2fe2U9s, reason: not valid java name */
    public static final int m8505binarySearch2fe2U9s(int[] iArr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(iArr, "");
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i2, i3, UIntArray.m8185getSizeimpl(iArr));
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int iUintCompare = UnsignedKt.uintCompare(iArr[i5], i);
            if (iUintCompare < 0) {
                i2 = i5 + 1;
            } else {
                if (iUintCompare <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: renamed from: binarySearch-K6DWlUc$default, reason: not valid java name */
    public static /* synthetic */ int m8510binarySearchK6DWlUc$default(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = ULongArray.m8264getSizeimpl(jArr);
        }
        return UArraysKt.m8509binarySearchK6DWlUc(jArr, j, i, i2);
    }

    /* JADX INFO: renamed from: binarySearch-K6DWlUc, reason: not valid java name */
    public static final int m8509binarySearchK6DWlUc(long[] jArr, long j, int i, int i2) {
        Intrinsics.checkNotNullParameter(jArr, "");
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i, i2, ULongArray.m8264getSizeimpl(jArr));
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int iUlongCompare = UnsignedKt.ulongCompare(jArr[i4], j);
            if (iUlongCompare < 0) {
                i = i4 + 1;
            } else {
                if (iUlongCompare <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: binarySearch-WpHrYlw$default, reason: not valid java name */
    public static /* synthetic */ int m8512binarySearchWpHrYlw$default(byte[] bArr, byte b, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UByteArray.m8106getSizeimpl(bArr);
        }
        return UArraysKt.m8511binarySearchWpHrYlw(bArr, b, i, i2);
    }

    /* JADX INFO: renamed from: binarySearch-WpHrYlw, reason: not valid java name */
    public static final int m8511binarySearchWpHrYlw(byte[] bArr, byte b, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i, i2, UByteArray.m8106getSizeimpl(bArr));
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int iUintCompare = UnsignedKt.uintCompare(bArr[i4], b & UByte.MAX_VALUE);
            if (iUintCompare < 0) {
                i = i4 + 1;
            } else {
                if (iUintCompare <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: binarySearch-EtDCXyQ$default, reason: not valid java name */
    public static /* synthetic */ int m8508binarySearchEtDCXyQ$default(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UShortArray.m8369getSizeimpl(sArr);
        }
        return UArraysKt.m8507binarySearchEtDCXyQ(sArr, s, i, i2);
    }

    /* JADX INFO: renamed from: binarySearch-EtDCXyQ, reason: not valid java name */
    public static final int m8507binarySearchEtDCXyQ(short[] sArr, short s, int i, int i2) {
        Intrinsics.checkNotNullParameter(sArr, "");
        AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i, i2, UShortArray.m8369getSizeimpl(sArr));
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int iUintCompare = UnsignedKt.uintCompare(sArr[i4], 65535 & s);
            if (iUintCompare < 0) {
                i = i4 + 1;
            } else {
                if (iUintCompare <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: max--ajY-9A, reason: not valid java name */
    public static final /* synthetic */ UInt m8517maxajY9A(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return UArraysKt.m8886maxOrNullajY9A(iArr);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: max-QwZRm1k, reason: not valid java name */
    public static final /* synthetic */ ULong m8519maxQwZRm1k(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return UArraysKt.m8888maxOrNullQwZRm1k(jArr);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: max-GBYM_sE, reason: not valid java name */
    public static final /* synthetic */ UByte m8518maxGBYM_sE(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return UArraysKt.m8887maxOrNullGBYM_sE(bArr);
    }

    @Deprecated(message = "Use maxOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: max-rL5Bavg, reason: not valid java name */
    public static final /* synthetic */ UShort m8520maxrL5Bavg(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "");
        return UArraysKt.m8889maxOrNullrL5Bavg(sArr);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: maxBy-jgv0xPQ, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UInt m8523maxByjgv0xPQ(int[] iArr, Function1<? super UInt, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (UIntArray.m8187isEmptyimpl(iArr)) {
            return null;
        }
        int iM8184getpVg5ArA = UIntArray.m8184getpVg5ArA(iArr, 0);
        int lastIndex = ArraysKt.getLastIndex(iArr);
        if (lastIndex == 0) {
            return UInt.m8118boximpl(iM8184getpVg5ArA);
        }
        R rInvoke = function1.invoke(UInt.m8118boximpl(iM8184getpVg5ArA));
        if (lastIndex > 0) {
            int i = 1;
            while (true) {
                int iM8184getpVg5ArA2 = UIntArray.m8184getpVg5ArA(iArr, i);
                R rInvoke2 = function1.invoke(UInt.m8118boximpl(iM8184getpVg5ArA2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    iM8184getpVg5ArA = iM8184getpVg5ArA2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UInt.m8118boximpl(iM8184getpVg5ArA);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: maxBy-MShoTSo, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> ULong m8522maxByMShoTSo(long[] jArr, Function1<? super ULong, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (ULongArray.m8266isEmptyimpl(jArr)) {
            return null;
        }
        long jM8263getsVKNKU = ULongArray.m8263getsVKNKU(jArr, 0);
        int lastIndex = ArraysKt.getLastIndex(jArr);
        if (lastIndex == 0) {
            return ULong.m8197boximpl(jM8263getsVKNKU);
        }
        R rInvoke = function1.invoke(ULong.m8197boximpl(jM8263getsVKNKU));
        if (lastIndex > 0) {
            int i = 1;
            while (true) {
                long jM8263getsVKNKU2 = ULongArray.m8263getsVKNKU(jArr, i);
                R rInvoke2 = function1.invoke(ULong.m8197boximpl(jM8263getsVKNKU2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    jM8263getsVKNKU = jM8263getsVKNKU2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return ULong.m8197boximpl(jM8263getsVKNKU);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: maxBy-JOV_ifY, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UByte m8521maxByJOV_ifY(byte[] bArr, Function1<? super UByte, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (UByteArray.m8108isEmptyimpl(bArr)) {
            return null;
        }
        byte bM8105getw2LRezQ = UByteArray.m8105getw2LRezQ(bArr, 0);
        int lastIndex = ArraysKt.getLastIndex(bArr);
        if (lastIndex == 0) {
            return UByte.m8036boximpl(bM8105getw2LRezQ);
        }
        R rInvoke = function1.invoke(UByte.m8036boximpl(bM8105getw2LRezQ));
        if (lastIndex > 0) {
            int i = 1;
            while (true) {
                byte bM8105getw2LRezQ2 = UByteArray.m8105getw2LRezQ(bArr, i);
                R rInvoke2 = function1.invoke(UByte.m8036boximpl(bM8105getw2LRezQ2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    bM8105getw2LRezQ = bM8105getw2LRezQ2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UByte.m8036boximpl(bM8105getw2LRezQ);
    }

    @Deprecated(message = "Use maxByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: maxBy-xTcfx_M, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UShort m8524maxByxTcfx_M(short[] sArr, Function1<? super UShort, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(sArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (UShortArray.m8371isEmptyimpl(sArr)) {
            return null;
        }
        short sM8368getMh2AYeg = UShortArray.m8368getMh2AYeg(sArr, 0);
        int lastIndex = ArraysKt.getLastIndex(sArr);
        if (lastIndex == 0) {
            return UShort.m8304boximpl(sM8368getMh2AYeg);
        }
        R rInvoke = function1.invoke(UShort.m8304boximpl(sM8368getMh2AYeg));
        if (lastIndex > 0) {
            int i = 1;
            while (true) {
                short sM8368getMh2AYeg2 = UShortArray.m8368getMh2AYeg(sArr, i);
                R rInvoke2 = function1.invoke(UShort.m8304boximpl(sM8368getMh2AYeg2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    sM8368getMh2AYeg = sM8368getMh2AYeg2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UShort.m8304boximpl(sM8368getMh2AYeg);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: maxWith-YmdZ_VM, reason: not valid java name */
    public static final /* synthetic */ UInt m8526maxWithYmdZ_VM(int[] iArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return UArraysKt.m8895maxWithOrNullYmdZ_VM(iArr, comparator);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: maxWith-zrEWJaI, reason: not valid java name */
    public static final /* synthetic */ ULong m8528maxWithzrEWJaI(long[] jArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return UArraysKt.m8897maxWithOrNullzrEWJaI(jArr, comparator);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: maxWith-XMRcp5o, reason: not valid java name */
    public static final /* synthetic */ UByte m8525maxWithXMRcp5o(byte[] bArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return UArraysKt.m8894maxWithOrNullXMRcp5o(bArr, comparator);
    }

    @Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: maxWith-eOHTfZs, reason: not valid java name */
    public static final /* synthetic */ UShort m8527maxWitheOHTfZs(short[] sArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(sArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return UArraysKt.m8896maxWithOrNulleOHTfZs(sArr, comparator);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: min--ajY-9A, reason: not valid java name */
    public static final /* synthetic */ UInt m8529minajY9A(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return UArraysKt.m8942minOrNullajY9A(iArr);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: min-QwZRm1k, reason: not valid java name */
    public static final /* synthetic */ ULong m8531minQwZRm1k(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return UArraysKt.m8944minOrNullQwZRm1k(jArr);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: min-GBYM_sE, reason: not valid java name */
    public static final /* synthetic */ UByte m8530minGBYM_sE(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return UArraysKt.m8943minOrNullGBYM_sE(bArr);
    }

    @Deprecated(message = "Use minOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: min-rL5Bavg, reason: not valid java name */
    public static final /* synthetic */ UShort m8532minrL5Bavg(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "");
        return UArraysKt.m8945minOrNullrL5Bavg(sArr);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: minBy-jgv0xPQ, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UInt m8535minByjgv0xPQ(int[] iArr, Function1<? super UInt, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (UIntArray.m8187isEmptyimpl(iArr)) {
            return null;
        }
        int iM8184getpVg5ArA = UIntArray.m8184getpVg5ArA(iArr, 0);
        int lastIndex = ArraysKt.getLastIndex(iArr);
        if (lastIndex == 0) {
            return UInt.m8118boximpl(iM8184getpVg5ArA);
        }
        R rInvoke = function1.invoke(UInt.m8118boximpl(iM8184getpVg5ArA));
        if (lastIndex > 0) {
            int i = 1;
            while (true) {
                int iM8184getpVg5ArA2 = UIntArray.m8184getpVg5ArA(iArr, i);
                R rInvoke2 = function1.invoke(UInt.m8118boximpl(iM8184getpVg5ArA2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    iM8184getpVg5ArA = iM8184getpVg5ArA2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UInt.m8118boximpl(iM8184getpVg5ArA);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: minBy-MShoTSo, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> ULong m8534minByMShoTSo(long[] jArr, Function1<? super ULong, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (ULongArray.m8266isEmptyimpl(jArr)) {
            return null;
        }
        long jM8263getsVKNKU = ULongArray.m8263getsVKNKU(jArr, 0);
        int lastIndex = ArraysKt.getLastIndex(jArr);
        if (lastIndex == 0) {
            return ULong.m8197boximpl(jM8263getsVKNKU);
        }
        R rInvoke = function1.invoke(ULong.m8197boximpl(jM8263getsVKNKU));
        if (lastIndex > 0) {
            int i = 1;
            while (true) {
                long jM8263getsVKNKU2 = ULongArray.m8263getsVKNKU(jArr, i);
                R rInvoke2 = function1.invoke(ULong.m8197boximpl(jM8263getsVKNKU2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    jM8263getsVKNKU = jM8263getsVKNKU2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return ULong.m8197boximpl(jM8263getsVKNKU);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: minBy-JOV_ifY, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UByte m8533minByJOV_ifY(byte[] bArr, Function1<? super UByte, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (UByteArray.m8108isEmptyimpl(bArr)) {
            return null;
        }
        byte bM8105getw2LRezQ = UByteArray.m8105getw2LRezQ(bArr, 0);
        int lastIndex = ArraysKt.getLastIndex(bArr);
        if (lastIndex == 0) {
            return UByte.m8036boximpl(bM8105getw2LRezQ);
        }
        R rInvoke = function1.invoke(UByte.m8036boximpl(bM8105getw2LRezQ));
        if (lastIndex > 0) {
            int i = 1;
            while (true) {
                byte bM8105getw2LRezQ2 = UByteArray.m8105getw2LRezQ(bArr, i);
                R rInvoke2 = function1.invoke(UByte.m8036boximpl(bM8105getw2LRezQ2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    bM8105getw2LRezQ = bM8105getw2LRezQ2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UByte.m8036boximpl(bM8105getw2LRezQ);
    }

    @Deprecated(message = "Use minByOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: minBy-xTcfx_M, reason: not valid java name */
    private static final /* synthetic */ <R extends Comparable<? super R>> UShort m8536minByxTcfx_M(short[] sArr, Function1<? super UShort, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(sArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (UShortArray.m8371isEmptyimpl(sArr)) {
            return null;
        }
        short sM8368getMh2AYeg = UShortArray.m8368getMh2AYeg(sArr, 0);
        int lastIndex = ArraysKt.getLastIndex(sArr);
        if (lastIndex == 0) {
            return UShort.m8304boximpl(sM8368getMh2AYeg);
        }
        R rInvoke = function1.invoke(UShort.m8304boximpl(sM8368getMh2AYeg));
        if (lastIndex > 0) {
            int i = 1;
            while (true) {
                short sM8368getMh2AYeg2 = UShortArray.m8368getMh2AYeg(sArr, i);
                R rInvoke2 = function1.invoke(UShort.m8304boximpl(sM8368getMh2AYeg2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    sM8368getMh2AYeg = sM8368getMh2AYeg2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return UShort.m8304boximpl(sM8368getMh2AYeg);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: minWith-YmdZ_VM, reason: not valid java name */
    public static final /* synthetic */ UInt m8538minWithYmdZ_VM(int[] iArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return UArraysKt.m8951minWithOrNullYmdZ_VM(iArr, comparator);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: minWith-zrEWJaI, reason: not valid java name */
    public static final /* synthetic */ ULong m8540minWithzrEWJaI(long[] jArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return UArraysKt.m8953minWithOrNullzrEWJaI(jArr, comparator);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: minWith-XMRcp5o, reason: not valid java name */
    public static final /* synthetic */ UByte m8537minWithXMRcp5o(byte[] bArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return UArraysKt.m8950minWithOrNullXMRcp5o(bArr, comparator);
    }

    @Deprecated(message = "Use minWithOrNull instead.", replaceWith = @ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: minWith-eOHTfZs, reason: not valid java name */
    public static final /* synthetic */ UShort m8539minWitheOHTfZs(short[] sArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(sArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        return UArraysKt.m8952minWithOrNulleOHTfZs(sArr, comparator);
    }

    private static final BigDecimal sumOfBigDecimal(int[] iArr, Function1<? super UInt, ? extends BigDecimal> function1) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        int iM8185getSizeimpl = UIntArray.m8185getSizeimpl(iArr);
        for (int i = 0; i < iM8185getSizeimpl; i++) {
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(UInt.m8118boximpl(UIntArray.m8184getpVg5ArA(iArr, i))));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        }
        return bigDecimalValueOf;
    }

    private static final BigDecimal sumOfBigDecimal(long[] jArr, Function1<? super ULong, ? extends BigDecimal> function1) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        int iM8264getSizeimpl = ULongArray.m8264getSizeimpl(jArr);
        for (int i = 0; i < iM8264getSizeimpl; i++) {
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(ULong.m8197boximpl(ULongArray.m8263getsVKNKU(jArr, i))));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        }
        return bigDecimalValueOf;
    }

    private static final BigDecimal sumOfBigDecimal(byte[] bArr, Function1<? super UByte, ? extends BigDecimal> function1) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        int iM8106getSizeimpl = UByteArray.m8106getSizeimpl(bArr);
        for (int i = 0; i < iM8106getSizeimpl; i++) {
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(UByte.m8036boximpl(UByteArray.m8105getw2LRezQ(bArr, i))));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        }
        return bigDecimalValueOf;
    }

    private static final BigDecimal sumOfBigDecimal(short[] sArr, Function1<? super UShort, ? extends BigDecimal> function1) {
        Intrinsics.checkNotNullParameter(sArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        int iM8369getSizeimpl = UShortArray.m8369getSizeimpl(sArr);
        for (int i = 0; i < iM8369getSizeimpl; i++) {
            bigDecimalValueOf = bigDecimalValueOf.add(function1.invoke(UShort.m8304boximpl(UShortArray.m8368getMh2AYeg(sArr, i))));
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "");
        }
        return bigDecimalValueOf;
    }

    private static final BigInteger sumOfBigInteger(int[] iArr, Function1<? super UInt, ? extends BigInteger> function1) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
        int iM8185getSizeimpl = UIntArray.m8185getSizeimpl(iArr);
        for (int i = 0; i < iM8185getSizeimpl; i++) {
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(UInt.m8118boximpl(UIntArray.m8184getpVg5ArA(iArr, i))));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
        }
        return bigIntegerValueOf;
    }

    private static final BigInteger sumOfBigInteger(long[] jArr, Function1<? super ULong, ? extends BigInteger> function1) {
        Intrinsics.checkNotNullParameter(jArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
        int iM8264getSizeimpl = ULongArray.m8264getSizeimpl(jArr);
        for (int i = 0; i < iM8264getSizeimpl; i++) {
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(ULong.m8197boximpl(ULongArray.m8263getsVKNKU(jArr, i))));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
        }
        return bigIntegerValueOf;
    }

    private static final BigInteger sumOfBigInteger(byte[] bArr, Function1<? super UByte, ? extends BigInteger> function1) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
        int iM8106getSizeimpl = UByteArray.m8106getSizeimpl(bArr);
        for (int i = 0; i < iM8106getSizeimpl; i++) {
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(UByte.m8036boximpl(UByteArray.m8105getw2LRezQ(bArr, i))));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
        }
        return bigIntegerValueOf;
    }

    private static final BigInteger sumOfBigInteger(short[] sArr, Function1<? super UShort, ? extends BigInteger> function1) {
        Intrinsics.checkNotNullParameter(sArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
        int iM8369getSizeimpl = UShortArray.m8369getSizeimpl(sArr);
        for (int i = 0; i < iM8369getSizeimpl; i++) {
            bigIntegerValueOf = bigIntegerValueOf.add(function1.invoke(UShort.m8304boximpl(UShortArray.m8368getMh2AYeg(sArr, i))));
            Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "");
        }
        return bigIntegerValueOf;
    }
}
