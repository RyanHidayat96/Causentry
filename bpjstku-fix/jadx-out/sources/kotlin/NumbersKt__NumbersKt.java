package kotlin;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\n\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0014\u0010\b\u001a\u00020\u0000*\u00020\u0000H\u0087\b¢\u0006\u0004\b\b\u0010\u0007\u001a\u001b\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\f\u0010\u000b\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\rH\u0087\b¢\u0006\u0004\b\u0002\u0010\u000e\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\rH\u0087\b¢\u0006\u0004\b\u0004\u0010\u000e\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\rH\u0087\b¢\u0006\u0004\b\u0005\u0010\u000e\u001a\u0014\u0010\u0006\u001a\u00020\r*\u00020\rH\u0087\b¢\u0006\u0004\b\u0006\u0010\u000f\u001a\u0014\u0010\b\u001a\u00020\r*\u00020\rH\u0087\b¢\u0006\u0004\b\b\u0010\u000f\u001a\u001b\u0010\n\u001a\u00020\r*\u00020\r2\u0006\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\n\u0010\u0010\u001a\u001b\u0010\f\u001a\u00020\r*\u00020\r2\u0006\u0010\t\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\f\u0010\u0010"}, d2 = {"", "", "countOneBits", "(B)I", "countLeadingZeroBits", "countTrailingZeroBits", "takeHighestOneBit", "(B)B", "takeLowestOneBit", "p0", "rotateLeft", "(BI)B", "rotateRight", "", "(S)I", "(S)S", "(SI)S"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/NumbersKt")
class NumbersKt__NumbersKt extends NumbersKt__NumbersJVMKt {
    public static final byte rotateLeft(byte b, int i) {
        int i2 = i & 7;
        return (byte) ((b << i2) | ((b & 255) >>> (8 - i2)));
    }

    public static final short rotateLeft(short s, int i) {
        int i2 = i & 15;
        return (short) ((s << i2) | ((65535 & s) >>> (16 - i2)));
    }

    public static final byte rotateRight(byte b, int i) {
        int i2 = i & 7;
        return (byte) ((b << (8 - i2)) | ((b & 255) >>> i2));
    }

    public static final short rotateRight(short s, int i) {
        int i2 = i & 15;
        return (short) ((s << (16 - i2)) | ((65535 & s) >>> i2));
    }

    private static final int countOneBits(byte b) {
        return Integer.bitCount(b & UByte.MAX_VALUE);
    }

    private static final int countLeadingZeroBits(byte b) {
        return Integer.numberOfLeadingZeros(b & UByte.MAX_VALUE) - 24;
    }

    private static final int countTrailingZeroBits(byte b) {
        return Integer.numberOfTrailingZeros(b | UByte.MIN_VALUE);
    }

    private static final byte takeHighestOneBit(byte b) {
        return (byte) Integer.highestOneBit(b & UByte.MAX_VALUE);
    }

    private static final byte takeLowestOneBit(byte b) {
        return (byte) Integer.lowestOneBit(b);
    }

    private static final int countOneBits(short s) {
        return Integer.bitCount(s & UShort.MAX_VALUE);
    }

    private static final int countLeadingZeroBits(short s) {
        return Integer.numberOfLeadingZeros(s & UShort.MAX_VALUE) - 16;
    }

    private static final int countTrailingZeroBits(short s) {
        return Integer.numberOfTrailingZeros(s | 65536);
    }

    private static final short takeHighestOneBit(short s) {
        return (short) Integer.highestOneBit(s & UShort.MAX_VALUE);
    }

    private static final short takeLowestOneBit(short s) {
        return (short) Integer.lowestOneBit(s);
    }
}
