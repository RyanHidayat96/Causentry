package kotlin;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.ULongRange;
import kotlin.ranges.URangesKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 }2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001}B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0000H\u0097\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b\u001c\u0010\u0014J\u0018\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b\u001e\u0010\u0017J\u0018\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b\u001f\u0010\u0019J\u0018\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b \u0010\u001bJ\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b!\u0010\u0014J\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b#\u0010\u0017J\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b$\u0010\u0019J\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b%\u0010\u001bJ\u0018\u0010'\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b&\u0010\u0014J\u0018\u0010'\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b(\u0010\u0017J\u0018\u0010'\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b)\u0010\u0019J\u0018\u0010'\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b*\u0010\u001bJ\u0018\u0010,\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\n¢\u0006\u0004\b+\u0010\u0014J\u0018\u0010,\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000bH\u0087\n¢\u0006\u0004\b-\u0010\u0017J\u0018\u0010,\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000eH\u0087\n¢\u0006\u0004\b.\u0010\u0019J\u0018\u0010,\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b/\u0010\u001bJ\u0018\u00101\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b0\u0010\u0014J\u0018\u00101\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000bH\u0087\b¢\u0006\u0004\b2\u0010\u0017J\u0018\u00101\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b3\u0010\u0019J\u0018\u00101\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b4\u0010\u001bJ\u0018\u00107\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b5\u00106J\u0018\u00107\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0087\b¢\u0006\u0004\b8\u00109J\u0018\u00107\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\b:\u0010\u0010J\u0018\u00107\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b;\u0010\u001bJ\u0010\u0010=\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b<\u0010\u0005J\u0010\u0010?\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b>\u0010\u0005J\u0018\u0010C\u001a\u00020@2\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bA\u0010BJ\u0018\u0010E\u001a\u00020@2\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\bD\u0010BJ\u0018\u0010G\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\f¢\u0006\u0004\bF\u0010\u0019J\u0018\u0010I\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\f¢\u0006\u0004\bH\u0010\u0019J\u0018\u0010K\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bJ\u0010\u001bJ\u0018\u0010M\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bL\u0010\u001bJ\u0018\u0010O\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0087\f¢\u0006\u0004\bN\u0010\u001bJ\u0010\u0010Q\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\bP\u0010\u0005J\u0010\u0010U\u001a\u00020RH\u0087\b¢\u0006\u0004\bS\u0010TJ\u0010\u0010Y\u001a\u00020VH\u0087\b¢\u0006\u0004\bW\u0010XJ\u0010\u0010\\\u001a\u00020\u0007H\u0087\b¢\u0006\u0004\bZ\u0010[J\u0010\u0010^\u001a\u00020\u0002H\u0087\b¢\u0006\u0004\b]\u0010\u0005J\u0010\u0010`\u001a\u00020\u0006H\u0087\b¢\u0006\u0004\b_\u0010TJ\u0010\u0010b\u001a\u00020\u000bH\u0087\b¢\u0006\u0004\ba\u0010XJ\u0010\u0010d\u001a\u00020\u000eH\u0087\b¢\u0006\u0004\bc\u0010[J\u0010\u0010f\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\be\u0010\u0005J\u0010\u0010j\u001a\u00020gH\u0087\b¢\u0006\u0004\bh\u0010iJ\u0010\u0010n\u001a\u00020kH\u0087\b¢\u0006\u0004\bl\u0010mJ\u000f\u0010r\u001a\u00020oH\u0017¢\u0006\u0004\bp\u0010qJ\u001a\u0010u\u001a\u00020t2\b\u0010\u0003\u001a\u0004\u0018\u00010sHÖ\u0003¢\u0006\u0004\bu\u0010vJ\u0010\u0010w\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\bw\u0010xR\u001a\u0010y\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\by\u0010z\u0012\u0004\b{\u0010|\u0088\u0001y\u0092\u0001\u00020\u0002"}, d2 = {"Lkotlin/ULong;", "", "", "p0", "constructor-impl", "(J)J", "Lkotlin/UByte;", "", "compareTo-7apg3OU", "(JB)I", "compareTo", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(JS)I", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(JI)I", "compareTo-VKZWuLQ", "(JJ)I", "plus-7apg3OU", "(JB)J", "plus", "plus-xj2QHRw", "(JS)J", "plus-WZ4Q5Ns", "(JI)J", "plus-VKZWuLQ", "(JJ)J", "minus-7apg3OU", "minus", "minus-xj2QHRw", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "times-7apg3OU", "times", "times-xj2QHRw", "times-WZ4Q5Ns", "times-VKZWuLQ", "div-7apg3OU", "div", "div-xj2QHRw", "div-WZ4Q5Ns", "div-VKZWuLQ", "rem-7apg3OU", "rem", "rem-xj2QHRw", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "floorDiv-7apg3OU", "floorDiv", "floorDiv-xj2QHRw", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "mod-7apg3OU", "(JB)B", "mod", "mod-xj2QHRw", "(JS)S", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "inc-s-VKNKU", "inc", "dec-s-VKNKU", "dec", "Lkotlin/ranges/ULongRange;", "rangeTo-VKZWuLQ", "(JJ)Lkotlin/ranges/ULongRange;", "rangeTo", "rangeUntil-VKZWuLQ", "rangeUntil", "shl-s-VKNKU", "shl", "shr-s-VKNKU", "shr", "and-VKZWuLQ", "and", "or-VKZWuLQ", "or", "xor-VKZWuLQ", "xor", "inv-s-VKNKU", "inv", "", "toByte-impl", "(J)B", "toByte", "", "toShort-impl", "(J)S", "toShort", "toInt-impl", "(J)I", "toInt", "toLong-impl", "toLong", "toUByte-w2LRezQ", "toUByte", "toUShort-Mh2AYeg", "toUShort", "toUInt-pVg5ArA", "toUInt", "toULong-s-VKNKU", "toULong", "", "toFloat-impl", "(J)F", "toFloat", "", "toDouble-impl", "(J)D", "toDouble", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "J", "getData$annotations", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
public final class ULong implements Comparable<ULong> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final long MAX_VALUE = -1;
    public static final long MIN_VALUE = 0;
    public static final int SIZE_BITS = 64;
    public static final int SIZE_BYTES = 8;
    private final long data;

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m8203constructorimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8210equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getData$annotations() {
    }

    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    private static final byte m8243toByteimpl(long j) {
        return (byte) j;
    }

    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    private static final int m8246toIntimpl(long j) {
        return (int) j;
    }

    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    private static final long m8247toLongimpl(long j) {
        return j;
    }

    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    private static final short m8248toShortimpl(long j) {
        return (short) j;
    }

    /* JADX INFO: renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m8252toULongsVKNKU(long j) {
        return j;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ULong uLong) {
        return UnsignedKt.ulongCompare(getData(), uLong.getData());
    }

    private /* synthetic */ ULong(long j) {
        this.data = j;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\n"}, d2 = {"Lkotlin/ULong$Companion;", "", "<init>", "()V", "Lkotlin/ULong;", "MIN_VALUE", "J", "MAX_VALUE", "", "SIZE_BYTES", "I", "SIZE_BITS"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m8198compareTo7apg3OU(long j, byte b) {
        return Long.compare(j ^ Long.MIN_VALUE, m8203constructorimpl(((long) b) & 255) ^ Long.MIN_VALUE);
    }

    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m8202compareToxj2QHRw(long j, short s) {
        return Long.compare(j ^ Long.MIN_VALUE, m8203constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) ^ Long.MIN_VALUE);
    }

    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m8201compareToWZ4Q5Ns(long j, int i) {
        return Long.compare(j ^ Long.MIN_VALUE, m8203constructorimpl(((long) i) & 4294967295L) ^ Long.MIN_VALUE);
    }

    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private int m8199compareToVKZWuLQ(long j) {
        return UnsignedKt.ulongCompare(getData(), j);
    }

    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static int m8200compareToVKZWuLQ(long j, long j2) {
        return UnsignedKt.ulongCompare(j, j2);
    }

    /* JADX INFO: renamed from: plus-7apg3OU, reason: not valid java name */
    private static final long m8227plus7apg3OU(long j, byte b) {
        return m8203constructorimpl(j + m8203constructorimpl(((long) b) & 255));
    }

    /* JADX INFO: renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final long m8230plusxj2QHRw(long j, short s) {
        return m8203constructorimpl(j + m8203constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    /* JADX INFO: renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final long m8229plusWZ4Q5Ns(long j, int i) {
        return m8203constructorimpl(j + m8203constructorimpl(((long) i) & 4294967295L));
    }

    /* JADX INFO: renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m8228plusVKZWuLQ(long j, long j2) {
        return m8203constructorimpl(j + j2);
    }

    /* JADX INFO: renamed from: minus-7apg3OU, reason: not valid java name */
    private static final long m8218minus7apg3OU(long j, byte b) {
        return m8203constructorimpl(j - m8203constructorimpl(((long) b) & 255));
    }

    /* JADX INFO: renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final long m8221minusxj2QHRw(long j, short s) {
        return m8203constructorimpl(j - m8203constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    /* JADX INFO: renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final long m8220minusWZ4Q5Ns(long j, int i) {
        return m8203constructorimpl(j - m8203constructorimpl(((long) i) & 4294967295L));
    }

    /* JADX INFO: renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m8219minusVKZWuLQ(long j, long j2) {
        return m8203constructorimpl(j - j2);
    }

    /* JADX INFO: renamed from: times-7apg3OU, reason: not valid java name */
    private static final long m8239times7apg3OU(long j, byte b) {
        return m8203constructorimpl(j * m8203constructorimpl(((long) b) & 255));
    }

    /* JADX INFO: renamed from: times-xj2QHRw, reason: not valid java name */
    private static final long m8242timesxj2QHRw(long j, short s) {
        return m8203constructorimpl(j * m8203constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    /* JADX INFO: renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final long m8241timesWZ4Q5Ns(long j, int i) {
        return m8203constructorimpl(j * m8203constructorimpl(((long) i) & 4294967295L));
    }

    /* JADX INFO: renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m8240timesVKZWuLQ(long j, long j2) {
        return m8203constructorimpl(j * j2);
    }

    /* JADX INFO: renamed from: div-7apg3OU, reason: not valid java name */
    private static final long m8205div7apg3OU(long j, byte b) {
        return UByte$$ExternalSyntheticBackport0.m$1(j, m8203constructorimpl(((long) b) & 255));
    }

    /* JADX INFO: renamed from: div-xj2QHRw, reason: not valid java name */
    private static final long m8208divxj2QHRw(long j, short s) {
        return UByte$$ExternalSyntheticBackport0.m$1(j, m8203constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    /* JADX INFO: renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final long m8207divWZ4Q5Ns(long j, int i) {
        return UByte$$ExternalSyntheticBackport0.m$1(j, m8203constructorimpl(((long) i) & 4294967295L));
    }

    /* JADX INFO: renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m8206divVKZWuLQ(long j, long j2) {
        return UnsignedKt.m8382ulongDivideeb3DHEI(j, j2);
    }

    /* JADX INFO: renamed from: rem-7apg3OU, reason: not valid java name */
    private static final long m8233rem7apg3OU(long j, byte b) {
        return UByte$$ExternalSyntheticBackport0.m8093m(j, m8203constructorimpl(((long) b) & 255));
    }

    /* JADX INFO: renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final long m8236remxj2QHRw(long j, short s) {
        return UByte$$ExternalSyntheticBackport0.m8093m(j, m8203constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    /* JADX INFO: renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final long m8235remWZ4Q5Ns(long j, int i) {
        return UByte$$ExternalSyntheticBackport0.m8093m(j, m8203constructorimpl(((long) i) & 4294967295L));
    }

    /* JADX INFO: renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m8234remVKZWuLQ(long j, long j2) {
        return UnsignedKt.m8383ulongRemaindereb3DHEI(j, j2);
    }

    /* JADX INFO: renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final long m8211floorDiv7apg3OU(long j, byte b) {
        return UByte$$ExternalSyntheticBackport0.m$1(j, m8203constructorimpl(((long) b) & 255));
    }

    /* JADX INFO: renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final long m8214floorDivxj2QHRw(long j, short s) {
        return UByte$$ExternalSyntheticBackport0.m$1(j, m8203constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    /* JADX INFO: renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final long m8213floorDivWZ4Q5Ns(long j, int i) {
        return UByte$$ExternalSyntheticBackport0.m$1(j, m8203constructorimpl(((long) i) & 4294967295L));
    }

    /* JADX INFO: renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m8212floorDivVKZWuLQ(long j, long j2) {
        return UByte$$ExternalSyntheticBackport0.m$1(j, j2);
    }

    /* JADX INFO: renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m8222mod7apg3OU(long j, byte b) {
        return UByte.m8042constructorimpl((byte) UByte$$ExternalSyntheticBackport0.m8093m(j, m8203constructorimpl(((long) b) & 255)));
    }

    /* JADX INFO: renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m8225modxj2QHRw(long j, short s) {
        return UShort.m8310constructorimpl((short) UByte$$ExternalSyntheticBackport0.m8093m(j, m8203constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    /* JADX INFO: renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m8224modWZ4Q5Ns(long j, int i) {
        return UInt.m8124constructorimpl((int) UByte$$ExternalSyntheticBackport0.m8093m(j, m8203constructorimpl(((long) i) & 4294967295L)));
    }

    /* JADX INFO: renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m8223modVKZWuLQ(long j, long j2) {
        return UByte$$ExternalSyntheticBackport0.m8093m(j, j2);
    }

    /* JADX INFO: renamed from: inc-s-VKNKU, reason: not valid java name */
    private static final long m8216incsVKNKU(long j) {
        return m8203constructorimpl(j + 1);
    }

    /* JADX INFO: renamed from: dec-s-VKNKU, reason: not valid java name */
    private static final long m8204decsVKNKU(long j) {
        return m8203constructorimpl(j - 1);
    }

    /* JADX INFO: renamed from: rangeTo-VKZWuLQ, reason: not valid java name */
    private static final ULongRange m8231rangeToVKZWuLQ(long j, long j2) {
        return new ULongRange(j, j2, null);
    }

    /* JADX INFO: renamed from: rangeUntil-VKZWuLQ, reason: not valid java name */
    private static final ULongRange m8232rangeUntilVKZWuLQ(long j, long j2) {
        return URangesKt.m9307untileb3DHEI(j, j2);
    }

    /* JADX INFO: renamed from: shl-s-VKNKU, reason: not valid java name */
    private static final long m8237shlsVKNKU(long j, int i) {
        return m8203constructorimpl(j << i);
    }

    /* JADX INFO: renamed from: shr-s-VKNKU, reason: not valid java name */
    private static final long m8238shrsVKNKU(long j, int i) {
        return m8203constructorimpl(j >>> i);
    }

    /* JADX INFO: renamed from: and-VKZWuLQ, reason: not valid java name */
    private static final long m8196andVKZWuLQ(long j, long j2) {
        return m8203constructorimpl(j & j2);
    }

    /* JADX INFO: renamed from: or-VKZWuLQ, reason: not valid java name */
    private static final long m8226orVKZWuLQ(long j, long j2) {
        return m8203constructorimpl(j | j2);
    }

    /* JADX INFO: renamed from: xor-VKZWuLQ, reason: not valid java name */
    private static final long m8254xorVKZWuLQ(long j, long j2) {
        return m8203constructorimpl(j ^ j2);
    }

    /* JADX INFO: renamed from: inv-s-VKNKU, reason: not valid java name */
    private static final long m8217invsVKNKU(long j) {
        return m8203constructorimpl(~j);
    }

    /* JADX INFO: renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m8250toUBytew2LRezQ(long j) {
        return UByte.m8042constructorimpl((byte) j);
    }

    /* JADX INFO: renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m8253toUShortMh2AYeg(long j) {
        return UShort.m8310constructorimpl((short) j);
    }

    /* JADX INFO: renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m8251toUIntpVg5ArA(long j) {
        return UInt.m8124constructorimpl((int) j);
    }

    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    private static final float m8245toFloatimpl(long j) {
        return (float) UnsignedKt.ulongToDouble(j);
    }

    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    private static final double m8244toDoubleimpl(long j) {
        return UnsignedKt.ulongToDouble(j);
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m8249toStringimpl(long j) {
        return UnsignedKt.ulongToString(j, 10);
    }

    public final String toString() {
        return m8249toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ULong m8197boximpl(long j) {
        return new ULong(j);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m8209equalsimpl(long j, Object obj) {
        return (obj instanceof ULong) && j == ((ULong) obj).getData();
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m8215hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public final boolean equals(Object p0) {
        return m8209equalsimpl(this.data, p0);
    }

    public final int hashCode() {
        return m8215hashCodeimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getData() {
        return this.data;
    }
}
