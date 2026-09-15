package kotlin;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\n\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 v2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001vB\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0013\u0010\bJ\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u0015\u0010\fJ\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u0016\u0010\u000fJ\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0019\u0010\bJ\u0018\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\nH\u0087\n¢\u0006\u0004\b\u001b\u0010\fJ\u0018\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0087\n¢\u0006\u0004\b\u001c\u0010\u000fJ\u0018\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\u001d\u0010\u0018J\u0018\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001e\u0010\bJ\u0018\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\nH\u0087\n¢\u0006\u0004\b \u0010\fJ\u0018\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0087\n¢\u0006\u0004\b!\u0010\u000fJ\u0018\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b\"\u0010\u0018J\u0018\u0010$\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b#\u0010\bJ\u0018\u0010$\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\nH\u0087\n¢\u0006\u0004\b%\u0010\fJ\u0018\u0010$\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0087\n¢\u0006\u0004\b&\u0010\u000fJ\u0018\u0010$\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b'\u0010\u0018J\u0018\u0010)\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b(\u0010\bJ\u0018\u0010)\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\nH\u0087\n¢\u0006\u0004\b*\u0010\fJ\u0018\u0010)\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0087\n¢\u0006\u0004\b+\u0010\u000fJ\u0018\u0010)\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010H\u0087\n¢\u0006\u0004\b,\u0010\u0018J\u0018\u0010.\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b-\u0010\bJ\u0018\u0010.\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\nH\u0087\b¢\u0006\u0004\b/\u0010\fJ\u0018\u0010.\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0087\b¢\u0006\u0004\b0\u0010\u000fJ\u0018\u0010.\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b1\u0010\u0018J\u0018\u00104\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b2\u00103J\u0018\u00104\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\nH\u0087\b¢\u0006\u0004\b5\u00106J\u0018\u00104\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0087\b¢\u0006\u0004\b7\u0010\u000fJ\u0018\u00104\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b8\u0010\u0018J\u0010\u0010:\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b9\u0010\u0005J\u0010\u0010<\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b;\u0010\u0005J\u0018\u0010@\u001a\u00020=2\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b>\u0010?J\u0018\u0010B\u001a\u00020=2\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bA\u0010?J\u0018\u0010D\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bC\u00103J\u0018\u0010F\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bE\u00103J\u0018\u0010H\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bG\u00103J\u0010\u0010J\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\bI\u0010\u0005J\u0010\u0010L\u001a\u00020\u0002H\u0087\b¢\u0006\u0004\bK\u0010\u0005J\u0010\u0010P\u001a\u00020MH\u0087\b¢\u0006\u0004\bN\u0010OJ\u0010\u0010S\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\bQ\u0010RJ\u0010\u0010W\u001a\u00020TH\u0087\b¢\u0006\u0004\bU\u0010VJ\u0010\u0010Y\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\bX\u0010\u0005J\u0010\u0010[\u001a\u00020\nH\u0087\b¢\u0006\u0004\bZ\u0010OJ\u0010\u0010]\u001a\u00020\rH\u0087\b¢\u0006\u0004\b\\\u0010RJ\u0010\u0010_\u001a\u00020\u0010H\u0087\b¢\u0006\u0004\b^\u0010VJ\u0010\u0010c\u001a\u00020`H\u0087\b¢\u0006\u0004\ba\u0010bJ\u0010\u0010g\u001a\u00020dH\u0087\b¢\u0006\u0004\be\u0010fJ\u000f\u0010k\u001a\u00020hH\u0017¢\u0006\u0004\bi\u0010jJ\u001a\u0010n\u001a\u00020m2\b\u0010\u0003\u001a\u0004\u0018\u00010lHÖ\u0003¢\u0006\u0004\bn\u0010oJ\u0010\u0010p\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\bp\u0010qR\u001a\u0010r\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\br\u0010s\u0012\u0004\bt\u0010u\u0088\u0001r\u0092\u0001\u00020\u0002"}, d2 = {"Lkotlin/UByte;", "", "", "p0", "constructor-impl", "(B)B", "", "compareTo-7apg3OU", "(BB)I", "compareTo", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(BS)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(BI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(BJ)I", "plus-7apg3OU", "plus", "plus-xj2QHRw", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "(BJ)J", "minus-7apg3OU", "minus", "minus-xj2QHRw", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "times-7apg3OU", "times", "times-xj2QHRw", "times-WZ4Q5Ns", "times-VKZWuLQ", "div-7apg3OU", "div", "div-xj2QHRw", "div-WZ4Q5Ns", "div-VKZWuLQ", "rem-7apg3OU", "rem", "rem-xj2QHRw", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "floorDiv-7apg3OU", "floorDiv", "floorDiv-xj2QHRw", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "mod-7apg3OU", "(BB)B", "mod", "mod-xj2QHRw", "(BS)S", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "inc-w2LRezQ", "inc", "dec-w2LRezQ", "dec", "Lkotlin/ranges/UIntRange;", "rangeTo-7apg3OU", "(BB)Lkotlin/ranges/UIntRange;", "rangeTo", "rangeUntil-7apg3OU", "rangeUntil", "and-7apg3OU", "and", "or-7apg3OU", "or", "xor-7apg3OU", "xor", "inv-w2LRezQ", "inv", "toByte-impl", "toByte", "", "toShort-impl", "(B)S", "toShort", "toInt-impl", "(B)I", "toInt", "", "toLong-impl", "(B)J", "toLong", "toUByte-w2LRezQ", "toUByte", "toUShort-Mh2AYeg", "toUShort", "toUInt-pVg5ArA", "toUInt", "toULong-s-VKNKU", "toULong", "", "toFloat-impl", "(B)F", "toFloat", "", "toDouble-impl", "(B)D", "toDouble", "", "toString-impl", "(B)Ljava/lang/String;", "toString", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "B", "getData$annotations", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
public final class UByte implements Comparable<UByte> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final byte MAX_VALUE = -1;
    public static final byte MIN_VALUE = 0;
    public static final int SIZE_BITS = 8;
    public static final int SIZE_BYTES = 1;
    private final byte data;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static byte m8042constructorimpl(byte b) {
        return b;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8049equalsimpl0(byte b, byte b2) {
        return b == b2;
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    private static final byte m8080toByteimpl(byte b) {
        return b;
    }

    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    private static final int m8083toIntimpl(byte b) {
        return b & MAX_VALUE;
    }

    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    private static final long m8084toLongimpl(byte b) {
        return ((long) b) & 255;
    }

    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    private static final short m8085toShortimpl(byte b) {
        return (short) (b & 255);
    }

    /* JADX INFO: renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m8087toUBytew2LRezQ(byte b) {
        return b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(UByte uByte) {
        return Intrinsics.compare(getData() & MAX_VALUE, uByte.getData() & MAX_VALUE);
    }

    private /* synthetic */ UByte(byte b) {
        this.data = b;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\n"}, d2 = {"Lkotlin/UByte$Companion;", "", "<init>", "()V", "Lkotlin/UByte;", "MIN_VALUE", "B", "MAX_VALUE", "", "SIZE_BYTES", "I", "SIZE_BITS"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private int m8037compareTo7apg3OU(byte b) {
        return Intrinsics.compare(getData() & MAX_VALUE, b & MAX_VALUE);
    }

    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static int m8038compareTo7apg3OU(byte b, byte b2) {
        return Intrinsics.compare(b & MAX_VALUE, b2 & MAX_VALUE);
    }

    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m8041compareToxj2QHRw(byte b, short s) {
        return Intrinsics.compare(b & MAX_VALUE, s & UShort.MAX_VALUE);
    }

    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m8040compareToWZ4Q5Ns(byte b, int i) {
        return Integer.compare(UInt.m8124constructorimpl(b & MAX_VALUE) ^ Integer.MIN_VALUE, i ^ Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m8039compareToVKZWuLQ(byte b, long j) {
        return Long.compare(ULong.m8203constructorimpl(((long) b) & 255) ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
    }

    /* JADX INFO: renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m8066plus7apg3OU(byte b, byte b2) {
        return UInt.m8124constructorimpl(UInt.m8124constructorimpl(b & MAX_VALUE) + UInt.m8124constructorimpl(b2 & MAX_VALUE));
    }

    /* JADX INFO: renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m8069plusxj2QHRw(byte b, short s) {
        return UInt.m8124constructorimpl(UInt.m8124constructorimpl(b & MAX_VALUE) + UInt.m8124constructorimpl(s & UShort.MAX_VALUE));
    }

    /* JADX INFO: renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m8068plusWZ4Q5Ns(byte b, int i) {
        return UInt.m8124constructorimpl(UInt.m8124constructorimpl(b & MAX_VALUE) + i);
    }

    /* JADX INFO: renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m8067plusVKZWuLQ(byte b, long j) {
        return ULong.m8203constructorimpl(ULong.m8203constructorimpl(((long) b) & 255) + j);
    }

    /* JADX INFO: renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m8057minus7apg3OU(byte b, byte b2) {
        return UInt.m8124constructorimpl(UInt.m8124constructorimpl(b & MAX_VALUE) - UInt.m8124constructorimpl(b2 & MAX_VALUE));
    }

    /* JADX INFO: renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m8060minusxj2QHRw(byte b, short s) {
        return UInt.m8124constructorimpl(UInt.m8124constructorimpl(b & MAX_VALUE) - UInt.m8124constructorimpl(s & UShort.MAX_VALUE));
    }

    /* JADX INFO: renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m8059minusWZ4Q5Ns(byte b, int i) {
        return UInt.m8124constructorimpl(UInt.m8124constructorimpl(b & MAX_VALUE) - i);
    }

    /* JADX INFO: renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m8058minusVKZWuLQ(byte b, long j) {
        return ULong.m8203constructorimpl(ULong.m8203constructorimpl(((long) b) & 255) - j);
    }

    /* JADX INFO: renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m8076times7apg3OU(byte b, byte b2) {
        return UInt.m8124constructorimpl(UInt.m8124constructorimpl(b & MAX_VALUE) * UInt.m8124constructorimpl(b2 & MAX_VALUE));
    }

    /* JADX INFO: renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m8079timesxj2QHRw(byte b, short s) {
        return UInt.m8124constructorimpl(UInt.m8124constructorimpl(b & MAX_VALUE) * UInt.m8124constructorimpl(s & UShort.MAX_VALUE));
    }

    /* JADX INFO: renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m8078timesWZ4Q5Ns(byte b, int i) {
        return UInt.m8124constructorimpl(UInt.m8124constructorimpl(b & MAX_VALUE) * i);
    }

    /* JADX INFO: renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m8077timesVKZWuLQ(byte b, long j) {
        return ULong.m8203constructorimpl(ULong.m8203constructorimpl(((long) b) & 255) * j);
    }

    /* JADX INFO: renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m8044div7apg3OU(byte b, byte b2) {
        return UByte$$ExternalSyntheticBackport0.m(UInt.m8124constructorimpl(b & MAX_VALUE), UInt.m8124constructorimpl(b2 & MAX_VALUE));
    }

    /* JADX INFO: renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m8047divxj2QHRw(byte b, short s) {
        return UByte$$ExternalSyntheticBackport0.m(UInt.m8124constructorimpl(b & MAX_VALUE), UInt.m8124constructorimpl(s & UShort.MAX_VALUE));
    }

    /* JADX INFO: renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m8046divWZ4Q5Ns(byte b, int i) {
        return UByte$$ExternalSyntheticBackport0.m(UInt.m8124constructorimpl(b & MAX_VALUE), i);
    }

    /* JADX INFO: renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m8045divVKZWuLQ(byte b, long j) {
        return UByte$$ExternalSyntheticBackport0.m$1(ULong.m8203constructorimpl(((long) b) & 255), j);
    }

    /* JADX INFO: renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m8072rem7apg3OU(byte b, byte b2) {
        return UByte$$ExternalSyntheticBackport0.m$1(UInt.m8124constructorimpl(b & MAX_VALUE), UInt.m8124constructorimpl(b2 & MAX_VALUE));
    }

    /* JADX INFO: renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m8075remxj2QHRw(byte b, short s) {
        return UByte$$ExternalSyntheticBackport0.m$1(UInt.m8124constructorimpl(b & MAX_VALUE), UInt.m8124constructorimpl(s & UShort.MAX_VALUE));
    }

    /* JADX INFO: renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m8074remWZ4Q5Ns(byte b, int i) {
        return UByte$$ExternalSyntheticBackport0.m$1(UInt.m8124constructorimpl(b & MAX_VALUE), i);
    }

    /* JADX INFO: renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m8073remVKZWuLQ(byte b, long j) {
        return UByte$$ExternalSyntheticBackport0.m8093m(ULong.m8203constructorimpl(((long) b) & 255), j);
    }

    /* JADX INFO: renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m8050floorDiv7apg3OU(byte b, byte b2) {
        return UByte$$ExternalSyntheticBackport0.m(UInt.m8124constructorimpl(b & MAX_VALUE), UInt.m8124constructorimpl(b2 & MAX_VALUE));
    }

    /* JADX INFO: renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m8053floorDivxj2QHRw(byte b, short s) {
        return UByte$$ExternalSyntheticBackport0.m(UInt.m8124constructorimpl(b & MAX_VALUE), UInt.m8124constructorimpl(s & UShort.MAX_VALUE));
    }

    /* JADX INFO: renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m8052floorDivWZ4Q5Ns(byte b, int i) {
        return UByte$$ExternalSyntheticBackport0.m(UInt.m8124constructorimpl(b & MAX_VALUE), i);
    }

    /* JADX INFO: renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m8051floorDivVKZWuLQ(byte b, long j) {
        return UByte$$ExternalSyntheticBackport0.m$1(ULong.m8203constructorimpl(((long) b) & 255), j);
    }

    /* JADX INFO: renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m8061mod7apg3OU(byte b, byte b2) {
        return m8042constructorimpl((byte) UByte$$ExternalSyntheticBackport0.m$1(UInt.m8124constructorimpl(b & MAX_VALUE), UInt.m8124constructorimpl(b2 & MAX_VALUE)));
    }

    /* JADX INFO: renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m8064modxj2QHRw(byte b, short s) {
        return UShort.m8310constructorimpl((short) UByte$$ExternalSyntheticBackport0.m$1(UInt.m8124constructorimpl(b & MAX_VALUE), UInt.m8124constructorimpl(s & UShort.MAX_VALUE)));
    }

    /* JADX INFO: renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m8063modWZ4Q5Ns(byte b, int i) {
        return UByte$$ExternalSyntheticBackport0.m$1(UInt.m8124constructorimpl(b & MAX_VALUE), i);
    }

    /* JADX INFO: renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m8062modVKZWuLQ(byte b, long j) {
        return UByte$$ExternalSyntheticBackport0.m8093m(ULong.m8203constructorimpl(((long) b) & 255), j);
    }

    /* JADX INFO: renamed from: inc-w2LRezQ, reason: not valid java name */
    private static final byte m8055incw2LRezQ(byte b) {
        return m8042constructorimpl((byte) (b + 1));
    }

    /* JADX INFO: renamed from: dec-w2LRezQ, reason: not valid java name */
    private static final byte m8043decw2LRezQ(byte b) {
        return m8042constructorimpl((byte) (b - 1));
    }

    /* JADX INFO: renamed from: rangeTo-7apg3OU, reason: not valid java name */
    private static final UIntRange m8070rangeTo7apg3OU(byte b, byte b2) {
        return new UIntRange(UInt.m8124constructorimpl(b & MAX_VALUE), UInt.m8124constructorimpl(b2 & MAX_VALUE), null);
    }

    /* JADX INFO: renamed from: rangeUntil-7apg3OU, reason: not valid java name */
    private static final UIntRange m8071rangeUntil7apg3OU(byte b, byte b2) {
        return URangesKt.m9305untilJ1ME1BU(UInt.m8124constructorimpl(b & MAX_VALUE), UInt.m8124constructorimpl(b2 & MAX_VALUE));
    }

    /* JADX INFO: renamed from: and-7apg3OU, reason: not valid java name */
    private static final byte m8035and7apg3OU(byte b, byte b2) {
        return m8042constructorimpl((byte) (b & b2));
    }

    /* JADX INFO: renamed from: or-7apg3OU, reason: not valid java name */
    private static final byte m8065or7apg3OU(byte b, byte b2) {
        return m8042constructorimpl((byte) (b | b2));
    }

    /* JADX INFO: renamed from: xor-7apg3OU, reason: not valid java name */
    private static final byte m8091xor7apg3OU(byte b, byte b2) {
        return m8042constructorimpl((byte) (b ^ b2));
    }

    /* JADX INFO: renamed from: inv-w2LRezQ, reason: not valid java name */
    private static final byte m8056invw2LRezQ(byte b) {
        return m8042constructorimpl((byte) (~b));
    }

    /* JADX INFO: renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m8090toUShortMh2AYeg(byte b) {
        return UShort.m8310constructorimpl((short) (b & 255));
    }

    /* JADX INFO: renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m8088toUIntpVg5ArA(byte b) {
        return UInt.m8124constructorimpl(b & MAX_VALUE);
    }

    /* JADX INFO: renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m8089toULongsVKNKU(byte b) {
        return ULong.m8203constructorimpl(((long) b) & 255);
    }

    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    private static final float m8082toFloatimpl(byte b) {
        return (float) UnsignedKt.uintToDouble(b & MAX_VALUE);
    }

    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    private static final double m8081toDoubleimpl(byte b) {
        return UnsignedKt.uintToDouble(b & MAX_VALUE);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m8086toStringimpl(byte b) {
        return String.valueOf(b & MAX_VALUE);
    }

    public final String toString() {
        return m8086toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ UByte m8036boximpl(byte b) {
        return new UByte(b);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m8048equalsimpl(byte b, Object obj) {
        return (obj instanceof UByte) && b == ((UByte) obj).getData();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m8054hashCodeimpl(byte b) {
        return Byte.hashCode(b);
    }

    public final boolean equals(Object p0) {
        return m8048equalsimpl(this.data, p0);
    }

    public final int hashCode() {
        return m8054hashCodeimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ byte getData() {
        return this.data;
    }
}
