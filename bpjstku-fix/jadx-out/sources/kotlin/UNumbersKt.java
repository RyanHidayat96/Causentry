package kotlin;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0014\u0010\n\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\t\u0010\u0003\u001a\u0014\u0010\f\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u000b\u0010\u0003\u001a\u001c\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001c\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0011\u0010\u000f\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0013H\u0087\b¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u0013H\u0087\b¢\u0006\u0004\b\u0016\u0010\u0015\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u0013H\u0087\b¢\u0006\u0004\b\u0017\u0010\u0015\u001a\u0014\u0010\n\u001a\u00020\u0013*\u00020\u0013H\u0087\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0014\u0010\f\u001a\u00020\u0013*\u00020\u0013H\u0087\b¢\u0006\u0004\b\u001a\u0010\u0019\u001a\u001c\u0010\u0010\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\r\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001c\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\r\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u001d\u0010\u001c\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u001eH\u0087\b¢\u0006\u0004\b\u001f\u0010 \u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u001eH\u0087\b¢\u0006\u0004\b!\u0010 \u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u001eH\u0087\b¢\u0006\u0004\b\"\u0010 \u001a\u0014\u0010\n\u001a\u00020\u001e*\u00020\u001eH\u0087\b¢\u0006\u0004\b#\u0010$\u001a\u0014\u0010\f\u001a\u00020\u001e*\u00020\u001eH\u0087\b¢\u0006\u0004\b%\u0010$\u001a\u001c\u0010\u0010\u001a\u00020\u001e*\u00020\u001e2\u0006\u0010\r\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b&\u0010'\u001a\u001c\u0010\u0012\u001a\u00020\u001e*\u00020\u001e2\u0006\u0010\r\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b(\u0010'\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020)H\u0087\b¢\u0006\u0004\b*\u0010+\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020)H\u0087\b¢\u0006\u0004\b,\u0010+\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020)H\u0087\b¢\u0006\u0004\b-\u0010+\u001a\u0014\u0010\n\u001a\u00020)*\u00020)H\u0087\b¢\u0006\u0004\b.\u0010/\u001a\u0014\u0010\f\u001a\u00020)*\u00020)H\u0087\b¢\u0006\u0004\b0\u0010/\u001a\u001c\u0010\u0010\u001a\u00020)*\u00020)2\u0006\u0010\r\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b1\u00102\u001a\u001c\u0010\u0012\u001a\u00020)*\u00020)2\u0006\u0010\r\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b3\u00102"}, d2 = {"Lkotlin/UInt;", "", "countOneBits-WZ4Q5Ns", "(I)I", "countOneBits", "countLeadingZeroBits-WZ4Q5Ns", "countLeadingZeroBits", "countTrailingZeroBits-WZ4Q5Ns", "countTrailingZeroBits", "takeHighestOneBit-WZ4Q5Ns", "takeHighestOneBit", "takeLowestOneBit-WZ4Q5Ns", "takeLowestOneBit", "p0", "rotateLeft-V7xB4Y4", "(II)I", "rotateLeft", "rotateRight-V7xB4Y4", "rotateRight", "Lkotlin/ULong;", "countOneBits-VKZWuLQ", "(J)I", "countLeadingZeroBits-VKZWuLQ", "countTrailingZeroBits-VKZWuLQ", "takeHighestOneBit-VKZWuLQ", "(J)J", "takeLowestOneBit-VKZWuLQ", "rotateLeft-JSWoG40", "(JI)J", "rotateRight-JSWoG40", "Lkotlin/UByte;", "countOneBits-7apg3OU", "(B)I", "countLeadingZeroBits-7apg3OU", "countTrailingZeroBits-7apg3OU", "takeHighestOneBit-7apg3OU", "(B)B", "takeLowestOneBit-7apg3OU", "rotateLeft-LxnNnR4", "(BI)B", "rotateRight-LxnNnR4", "Lkotlin/UShort;", "countOneBits-xj2QHRw", "(S)I", "countLeadingZeroBits-xj2QHRw", "countTrailingZeroBits-xj2QHRw", "takeHighestOneBit-xj2QHRw", "(S)S", "takeLowestOneBit-xj2QHRw", "rotateLeft-olVBNx4", "(SI)S", "rotateRight-olVBNx4"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class UNumbersKt {
    /* JADX INFO: renamed from: countOneBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m8281countOneBitsWZ4Q5Ns(int i) {
        return Integer.bitCount(i);
    }

    /* JADX INFO: renamed from: countLeadingZeroBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m8277countLeadingZeroBitsWZ4Q5Ns(int i) {
        return Integer.numberOfLeadingZeros(i);
    }

    /* JADX INFO: renamed from: countTrailingZeroBits-WZ4Q5Ns, reason: not valid java name */
    private static final int m8285countTrailingZeroBitsWZ4Q5Ns(int i) {
        return Integer.numberOfTrailingZeros(i);
    }

    /* JADX INFO: renamed from: takeHighestOneBit-WZ4Q5Ns, reason: not valid java name */
    private static final int m8297takeHighestOneBitWZ4Q5Ns(int i) {
        return UInt.m8124constructorimpl(Integer.highestOneBit(i));
    }

    /* JADX INFO: renamed from: takeLowestOneBit-WZ4Q5Ns, reason: not valid java name */
    private static final int m8301takeLowestOneBitWZ4Q5Ns(int i) {
        return UInt.m8124constructorimpl(Integer.lowestOneBit(i));
    }

    /* JADX INFO: renamed from: rotateLeft-V7xB4Y4, reason: not valid java name */
    private static final int m8289rotateLeftV7xB4Y4(int i, int i2) {
        return UInt.m8124constructorimpl(Integer.rotateLeft(i, i2));
    }

    /* JADX INFO: renamed from: rotateRight-V7xB4Y4, reason: not valid java name */
    private static final int m8293rotateRightV7xB4Y4(int i, int i2) {
        return UInt.m8124constructorimpl(Integer.rotateRight(i, i2));
    }

    /* JADX INFO: renamed from: countOneBits-VKZWuLQ, reason: not valid java name */
    private static final int m8280countOneBitsVKZWuLQ(long j) {
        return Long.bitCount(j);
    }

    /* JADX INFO: renamed from: countLeadingZeroBits-VKZWuLQ, reason: not valid java name */
    private static final int m8276countLeadingZeroBitsVKZWuLQ(long j) {
        return Long.numberOfLeadingZeros(j);
    }

    /* JADX INFO: renamed from: countTrailingZeroBits-VKZWuLQ, reason: not valid java name */
    private static final int m8284countTrailingZeroBitsVKZWuLQ(long j) {
        return Long.numberOfTrailingZeros(j);
    }

    /* JADX INFO: renamed from: takeHighestOneBit-VKZWuLQ, reason: not valid java name */
    private static final long m8296takeHighestOneBitVKZWuLQ(long j) {
        return ULong.m8203constructorimpl(Long.highestOneBit(j));
    }

    /* JADX INFO: renamed from: takeLowestOneBit-VKZWuLQ, reason: not valid java name */
    private static final long m8300takeLowestOneBitVKZWuLQ(long j) {
        return ULong.m8203constructorimpl(Long.lowestOneBit(j));
    }

    /* JADX INFO: renamed from: rotateLeft-JSWoG40, reason: not valid java name */
    private static final long m8287rotateLeftJSWoG40(long j, int i) {
        return ULong.m8203constructorimpl(Long.rotateLeft(j, i));
    }

    /* JADX INFO: renamed from: rotateRight-JSWoG40, reason: not valid java name */
    private static final long m8291rotateRightJSWoG40(long j, int i) {
        return ULong.m8203constructorimpl(Long.rotateRight(j, i));
    }

    /* JADX INFO: renamed from: countOneBits-7apg3OU, reason: not valid java name */
    private static final int m8279countOneBits7apg3OU(byte b) {
        return Integer.bitCount(UInt.m8124constructorimpl(b & UByte.MAX_VALUE));
    }

    /* JADX INFO: renamed from: countLeadingZeroBits-7apg3OU, reason: not valid java name */
    private static final int m8275countLeadingZeroBits7apg3OU(byte b) {
        return Integer.numberOfLeadingZeros(b & UByte.MAX_VALUE) - 24;
    }

    /* JADX INFO: renamed from: countTrailingZeroBits-7apg3OU, reason: not valid java name */
    private static final int m8283countTrailingZeroBits7apg3OU(byte b) {
        return Integer.numberOfTrailingZeros(b | UByte.MIN_VALUE);
    }

    /* JADX INFO: renamed from: takeHighestOneBit-7apg3OU, reason: not valid java name */
    private static final byte m8295takeHighestOneBit7apg3OU(byte b) {
        return UByte.m8042constructorimpl((byte) Integer.highestOneBit(b & UByte.MAX_VALUE));
    }

    /* JADX INFO: renamed from: takeLowestOneBit-7apg3OU, reason: not valid java name */
    private static final byte m8299takeLowestOneBit7apg3OU(byte b) {
        return UByte.m8042constructorimpl((byte) Integer.lowestOneBit(b & UByte.MAX_VALUE));
    }

    /* JADX INFO: renamed from: rotateLeft-LxnNnR4, reason: not valid java name */
    private static final byte m8288rotateLeftLxnNnR4(byte b, int i) {
        return UByte.m8042constructorimpl(NumbersKt.rotateLeft(b, i));
    }

    /* JADX INFO: renamed from: rotateRight-LxnNnR4, reason: not valid java name */
    private static final byte m8292rotateRightLxnNnR4(byte b, int i) {
        return UByte.m8042constructorimpl(NumbersKt.rotateRight(b, i));
    }

    /* JADX INFO: renamed from: countOneBits-xj2QHRw, reason: not valid java name */
    private static final int m8282countOneBitsxj2QHRw(short s) {
        return Integer.bitCount(UInt.m8124constructorimpl(s & UShort.MAX_VALUE));
    }

    /* JADX INFO: renamed from: countLeadingZeroBits-xj2QHRw, reason: not valid java name */
    private static final int m8278countLeadingZeroBitsxj2QHRw(short s) {
        return Integer.numberOfLeadingZeros(s & UShort.MAX_VALUE) - 16;
    }

    /* JADX INFO: renamed from: countTrailingZeroBits-xj2QHRw, reason: not valid java name */
    private static final int m8286countTrailingZeroBitsxj2QHRw(short s) {
        return Integer.numberOfTrailingZeros(s | 65536);
    }

    /* JADX INFO: renamed from: takeHighestOneBit-xj2QHRw, reason: not valid java name */
    private static final short m8298takeHighestOneBitxj2QHRw(short s) {
        return UShort.m8310constructorimpl((short) Integer.highestOneBit(s & UShort.MAX_VALUE));
    }

    /* JADX INFO: renamed from: takeLowestOneBit-xj2QHRw, reason: not valid java name */
    private static final short m8302takeLowestOneBitxj2QHRw(short s) {
        return UShort.m8310constructorimpl((short) Integer.lowestOneBit(s & UShort.MAX_VALUE));
    }

    /* JADX INFO: renamed from: rotateLeft-olVBNx4, reason: not valid java name */
    private static final short m8290rotateLeftolVBNx4(short s, int i) {
        return UShort.m8310constructorimpl(NumbersKt.rotateLeft(s, i));
    }

    /* JADX INFO: renamed from: rotateRight-olVBNx4, reason: not valid java name */
    private static final short m8294rotateRightolVBNx4(short s, int i) {
        return UShort.m8310constructorimpl(NumbersKt.rotateRight(s, i));
    }
}
