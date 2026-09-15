package kotlin;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 z2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001zB\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u000fH\u0087\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0012\u0010\bJ\u0018\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u0014\u0010\fJ\u0018\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0015\u0010\u000eJ\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0087\n¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0018\u0010\bJ\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u001a\u0010\fJ\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001b\u0010\u000eJ\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0087\n¢\u0006\u0004\b\u001c\u0010\u0017J\u0018\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u001d\u0010\bJ\u0018\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u001f\u0010\fJ\u0018\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b \u0010\u000eJ\u0018\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0087\n¢\u0006\u0004\b!\u0010\u0017J\u0018\u0010#\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\"\u0010\bJ\u0018\u0010#\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\nH\u0087\n¢\u0006\u0004\b$\u0010\fJ\u0018\u0010#\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b%\u0010\u000eJ\u0018\u0010#\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0087\n¢\u0006\u0004\b&\u0010\u0017J\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b'\u0010\bJ\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\nH\u0087\n¢\u0006\u0004\b)\u0010\fJ\u0018\u0010(\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b*\u0010\u000eJ\u0018\u0010(\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0087\n¢\u0006\u0004\b+\u0010\u0017J\u0018\u0010-\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b,\u0010\bJ\u0018\u0010-\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\nH\u0087\b¢\u0006\u0004\b.\u0010\fJ\u0018\u0010-\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b/\u0010\u000eJ\u0018\u0010-\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0087\b¢\u0006\u0004\b0\u0010\u0017J\u0018\u00103\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\nH\u0087\b¢\u0006\u0004\b4\u00105J\u0018\u00103\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b6\u0010\u000eJ\u0018\u00103\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0087\b¢\u0006\u0004\b7\u0010\u0017J\u0010\u00109\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b8\u0010\u0005J\u0010\u0010;\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b:\u0010\u0005J\u0018\u0010?\u001a\u00020<2\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b=\u0010>J\u0018\u0010A\u001a\u00020<2\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b@\u0010>J\u0018\u0010C\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\f¢\u0006\u0004\bB\u0010\u000eJ\u0018\u0010E\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\f¢\u0006\u0004\bD\u0010\u000eJ\u0018\u0010G\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bF\u0010\u000eJ\u0018\u0010I\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bH\u0010\u000eJ\u0018\u0010K\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bJ\u0010\u000eJ\u0010\u0010M\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\bL\u0010\u0005J\u0010\u0010Q\u001a\u00020NH\u0087\b¢\u0006\u0004\bO\u0010PJ\u0010\u0010U\u001a\u00020RH\u0087\b¢\u0006\u0004\bS\u0010TJ\u0010\u0010W\u001a\u00020\u0002H\u0087\b¢\u0006\u0004\bV\u0010\u0005J\u0010\u0010[\u001a\u00020XH\u0087\b¢\u0006\u0004\bY\u0010ZJ\u0010\u0010]\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b\\\u0010PJ\u0010\u0010_\u001a\u00020\nH\u0087\b¢\u0006\u0004\b^\u0010TJ\u0010\u0010a\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b`\u0010\u0005J\u0010\u0010c\u001a\u00020\u000fH\u0087\b¢\u0006\u0004\bb\u0010ZJ\u0010\u0010g\u001a\u00020dH\u0087\b¢\u0006\u0004\be\u0010fJ\u0010\u0010k\u001a\u00020hH\u0087\b¢\u0006\u0004\bi\u0010jJ\u000f\u0010o\u001a\u00020lH\u0017¢\u0006\u0004\bm\u0010nJ\u001a\u0010r\u001a\u00020q2\b\u0010\u0003\u001a\u0004\u0018\u00010pHÖ\u0003¢\u0006\u0004\br\u0010sJ\u0010\u0010t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bt\u0010uR\u001a\u0010v\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\bv\u0010w\u0012\u0004\bx\u0010y\u0088\u0001v\u0092\u0001\u00020\u0002"}, d2 = {"Lkotlin/UInt;", "", "", "p0", "constructor-impl", "(I)I", "Lkotlin/UByte;", "compareTo-7apg3OU", "(IB)I", "compareTo", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(IS)I", "compareTo-WZ4Q5Ns", "(II)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(IJ)I", "plus-7apg3OU", "plus", "plus-xj2QHRw", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "(IJ)J", "minus-7apg3OU", "minus", "minus-xj2QHRw", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "times-7apg3OU", "times", "times-xj2QHRw", "times-WZ4Q5Ns", "times-VKZWuLQ", "div-7apg3OU", "div", "div-xj2QHRw", "div-WZ4Q5Ns", "div-VKZWuLQ", "rem-7apg3OU", "rem", "rem-xj2QHRw", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "floorDiv-7apg3OU", "floorDiv", "floorDiv-xj2QHRw", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "mod-7apg3OU", "(IB)B", "mod", "mod-xj2QHRw", "(IS)S", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "inc-pVg5ArA", "inc", "dec-pVg5ArA", "dec", "Lkotlin/ranges/UIntRange;", "rangeTo-WZ4Q5Ns", "(II)Lkotlin/ranges/UIntRange;", "rangeTo", "rangeUntil-WZ4Q5Ns", "rangeUntil", "shl-pVg5ArA", "shl", "shr-pVg5ArA", "shr", "and-WZ4Q5Ns", "and", "or-WZ4Q5Ns", "or", "xor-WZ4Q5Ns", "xor", "inv-pVg5ArA", "inv", "", "toByte-impl", "(I)B", "toByte", "", "toShort-impl", "(I)S", "toShort", "toInt-impl", "toInt", "", "toLong-impl", "(I)J", "toLong", "toUByte-w2LRezQ", "toUByte", "toUShort-Mh2AYeg", "toUShort", "toUInt-pVg5ArA", "toUInt", "toULong-s-VKNKU", "toULong", "", "toFloat-impl", "(I)F", "toFloat", "", "toDouble-impl", "(I)D", "toDouble", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "I", "getData$annotations", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
public final class UInt implements Comparable<UInt> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int MAX_VALUE = -1;
    public static final int MIN_VALUE = 0;
    public static final int SIZE_BITS = 32;
    public static final int SIZE_BYTES = 4;
    private final int data;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m8124constructorimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8131equalsimpl0(int i, int i2) {
        return i == i2;
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    private static final byte m8164toByteimpl(int i) {
        return (byte) i;
    }

    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    private static final int m8167toIntimpl(int i) {
        return i;
    }

    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    private static final long m8168toLongimpl(int i) {
        return ((long) i) & 4294967295L;
    }

    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    private static final short m8169toShortimpl(int i) {
        return (short) i;
    }

    /* JADX INFO: renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m8172toUIntpVg5ArA(int i) {
        return i;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(UInt uInt) {
        return UnsignedKt.uintCompare(getData(), uInt.getData());
    }

    private /* synthetic */ UInt(int i) {
        this.data = i;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lkotlin/UInt$Companion;", "", "<init>", "()V", "Lkotlin/UInt;", "MIN_VALUE", "I", "MAX_VALUE", "", "SIZE_BYTES", "SIZE_BITS"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m8119compareTo7apg3OU(int i, byte b) {
        return Integer.compare(i ^ Integer.MIN_VALUE, m8124constructorimpl(b & UByte.MAX_VALUE) ^ Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m8123compareToxj2QHRw(int i, short s) {
        return Integer.compare(i ^ Integer.MIN_VALUE, m8124constructorimpl(s & UShort.MAX_VALUE) ^ Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private int m8121compareToWZ4Q5Ns(int i) {
        return UnsignedKt.uintCompare(getData(), i);
    }

    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static int m8122compareToWZ4Q5Ns(int i, int i2) {
        return UnsignedKt.uintCompare(i, i2);
    }

    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m8120compareToVKZWuLQ(int i, long j) {
        return Long.compare(ULong.m8203constructorimpl(((long) i) & 4294967295L) ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
    }

    /* JADX INFO: renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m8148plus7apg3OU(int i, byte b) {
        return m8124constructorimpl(i + m8124constructorimpl(b & UByte.MAX_VALUE));
    }

    /* JADX INFO: renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m8151plusxj2QHRw(int i, short s) {
        return m8124constructorimpl(i + m8124constructorimpl(s & UShort.MAX_VALUE));
    }

    /* JADX INFO: renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m8150plusWZ4Q5Ns(int i, int i2) {
        return m8124constructorimpl(i + i2);
    }

    /* JADX INFO: renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m8149plusVKZWuLQ(int i, long j) {
        return ULong.m8203constructorimpl(ULong.m8203constructorimpl(((long) i) & 4294967295L) + j);
    }

    /* JADX INFO: renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m8139minus7apg3OU(int i, byte b) {
        return m8124constructorimpl(i - m8124constructorimpl(b & UByte.MAX_VALUE));
    }

    /* JADX INFO: renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m8142minusxj2QHRw(int i, short s) {
        return m8124constructorimpl(i - m8124constructorimpl(s & UShort.MAX_VALUE));
    }

    /* JADX INFO: renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m8141minusWZ4Q5Ns(int i, int i2) {
        return m8124constructorimpl(i - i2);
    }

    /* JADX INFO: renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m8140minusVKZWuLQ(int i, long j) {
        return ULong.m8203constructorimpl(ULong.m8203constructorimpl(((long) i) & 4294967295L) - j);
    }

    /* JADX INFO: renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m8160times7apg3OU(int i, byte b) {
        return m8124constructorimpl(i * m8124constructorimpl(b & UByte.MAX_VALUE));
    }

    /* JADX INFO: renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m8163timesxj2QHRw(int i, short s) {
        return m8124constructorimpl(i * m8124constructorimpl(s & UShort.MAX_VALUE));
    }

    /* JADX INFO: renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m8162timesWZ4Q5Ns(int i, int i2) {
        return m8124constructorimpl(i * i2);
    }

    /* JADX INFO: renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m8161timesVKZWuLQ(int i, long j) {
        return ULong.m8203constructorimpl(ULong.m8203constructorimpl(((long) i) & 4294967295L) * j);
    }

    /* JADX INFO: renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m8126div7apg3OU(int i, byte b) {
        return UByte$$ExternalSyntheticBackport0.m(i, m8124constructorimpl(b & UByte.MAX_VALUE));
    }

    /* JADX INFO: renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m8129divxj2QHRw(int i, short s) {
        return UByte$$ExternalSyntheticBackport0.m(i, m8124constructorimpl(s & UShort.MAX_VALUE));
    }

    /* JADX INFO: renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m8128divWZ4Q5Ns(int i, int i2) {
        return UnsignedKt.m8380uintDivideJ1ME1BU(i, i2);
    }

    /* JADX INFO: renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m8127divVKZWuLQ(int i, long j) {
        return UByte$$ExternalSyntheticBackport0.m$1(ULong.m8203constructorimpl(((long) i) & 4294967295L), j);
    }

    /* JADX INFO: renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m8154rem7apg3OU(int i, byte b) {
        return UByte$$ExternalSyntheticBackport0.m$1(i, m8124constructorimpl(b & UByte.MAX_VALUE));
    }

    /* JADX INFO: renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m8157remxj2QHRw(int i, short s) {
        return UByte$$ExternalSyntheticBackport0.m$1(i, m8124constructorimpl(s & UShort.MAX_VALUE));
    }

    /* JADX INFO: renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m8156remWZ4Q5Ns(int i, int i2) {
        return UnsignedKt.m8381uintRemainderJ1ME1BU(i, i2);
    }

    /* JADX INFO: renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m8155remVKZWuLQ(int i, long j) {
        return UByte$$ExternalSyntheticBackport0.m8093m(ULong.m8203constructorimpl(((long) i) & 4294967295L), j);
    }

    /* JADX INFO: renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m8132floorDiv7apg3OU(int i, byte b) {
        return UByte$$ExternalSyntheticBackport0.m(i, m8124constructorimpl(b & UByte.MAX_VALUE));
    }

    /* JADX INFO: renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m8135floorDivxj2QHRw(int i, short s) {
        return UByte$$ExternalSyntheticBackport0.m(i, m8124constructorimpl(s & UShort.MAX_VALUE));
    }

    /* JADX INFO: renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m8134floorDivWZ4Q5Ns(int i, int i2) {
        return UByte$$ExternalSyntheticBackport0.m(i, i2);
    }

    /* JADX INFO: renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m8133floorDivVKZWuLQ(int i, long j) {
        return UByte$$ExternalSyntheticBackport0.m$1(ULong.m8203constructorimpl(((long) i) & 4294967295L), j);
    }

    /* JADX INFO: renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m8143mod7apg3OU(int i, byte b) {
        return UByte.m8042constructorimpl((byte) UByte$$ExternalSyntheticBackport0.m$1(i, m8124constructorimpl(b & UByte.MAX_VALUE)));
    }

    /* JADX INFO: renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m8146modxj2QHRw(int i, short s) {
        return UShort.m8310constructorimpl((short) UByte$$ExternalSyntheticBackport0.m$1(i, m8124constructorimpl(s & UShort.MAX_VALUE)));
    }

    /* JADX INFO: renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m8145modWZ4Q5Ns(int i, int i2) {
        return UByte$$ExternalSyntheticBackport0.m$1(i, i2);
    }

    /* JADX INFO: renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m8144modVKZWuLQ(int i, long j) {
        return UByte$$ExternalSyntheticBackport0.m8093m(ULong.m8203constructorimpl(((long) i) & 4294967295L), j);
    }

    /* JADX INFO: renamed from: inc-pVg5ArA, reason: not valid java name */
    private static final int m8137incpVg5ArA(int i) {
        return m8124constructorimpl(i + 1);
    }

    /* JADX INFO: renamed from: dec-pVg5ArA, reason: not valid java name */
    private static final int m8125decpVg5ArA(int i) {
        return m8124constructorimpl(i - 1);
    }

    /* JADX INFO: renamed from: rangeTo-WZ4Q5Ns, reason: not valid java name */
    private static final UIntRange m8152rangeToWZ4Q5Ns(int i, int i2) {
        return new UIntRange(i, i2, null);
    }

    /* JADX INFO: renamed from: rangeUntil-WZ4Q5Ns, reason: not valid java name */
    private static final UIntRange m8153rangeUntilWZ4Q5Ns(int i, int i2) {
        return URangesKt.m9305untilJ1ME1BU(i, i2);
    }

    /* JADX INFO: renamed from: shl-pVg5ArA, reason: not valid java name */
    private static final int m8158shlpVg5ArA(int i, int i2) {
        return m8124constructorimpl(i << i2);
    }

    /* JADX INFO: renamed from: shr-pVg5ArA, reason: not valid java name */
    private static final int m8159shrpVg5ArA(int i, int i2) {
        return m8124constructorimpl(i >>> i2);
    }

    /* JADX INFO: renamed from: and-WZ4Q5Ns, reason: not valid java name */
    private static final int m8117andWZ4Q5Ns(int i, int i2) {
        return m8124constructorimpl(i & i2);
    }

    /* JADX INFO: renamed from: or-WZ4Q5Ns, reason: not valid java name */
    private static final int m8147orWZ4Q5Ns(int i, int i2) {
        return m8124constructorimpl(i | i2);
    }

    /* JADX INFO: renamed from: xor-WZ4Q5Ns, reason: not valid java name */
    private static final int m8175xorWZ4Q5Ns(int i, int i2) {
        return m8124constructorimpl(i ^ i2);
    }

    /* JADX INFO: renamed from: inv-pVg5ArA, reason: not valid java name */
    private static final int m8138invpVg5ArA(int i) {
        return m8124constructorimpl(~i);
    }

    /* JADX INFO: renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m8171toUBytew2LRezQ(int i) {
        return UByte.m8042constructorimpl((byte) i);
    }

    /* JADX INFO: renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m8174toUShortMh2AYeg(int i) {
        return UShort.m8310constructorimpl((short) i);
    }

    /* JADX INFO: renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m8173toULongsVKNKU(int i) {
        return ULong.m8203constructorimpl(((long) i) & 4294967295L);
    }

    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    private static final float m8166toFloatimpl(int i) {
        return (float) UnsignedKt.uintToDouble(i);
    }

    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    private static final double m8165toDoubleimpl(int i) {
        return UnsignedKt.uintToDouble(i);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m8170toStringimpl(int i) {
        return String.valueOf(((long) i) & 4294967295L);
    }

    public final String toString() {
        return m8170toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UInt m8118boximpl(int i) {
        return new UInt(i);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m8130equalsimpl(int i, Object obj) {
        return (obj instanceof UInt) && i == ((UInt) obj).getData();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m8136hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public final boolean equals(Object p0) {
        return m8130equalsimpl(this.data, p0);
    }

    public final int hashCode() {
        return m8136hashCodeimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getData() {
        return this.data;
    }
}
