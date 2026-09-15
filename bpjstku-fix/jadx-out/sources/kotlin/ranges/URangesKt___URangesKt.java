package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.URandomKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0002\u0010\u0006\u001a\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u0003\u001a\u0013\u0010\n\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u0006\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\b\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\t\u001a\u0014\u0010\r\u001a\u00020\u0001*\u00020\fH\u0087\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\r\u001a\u00020\u0005*\u00020\u000fH\u0087\b¢\u0006\u0004\b\r\u0010\u0010\u001a\u001b\u0010\r\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\r\u0010\u0013\u001a\u001b\u0010\r\u001a\u00020\u0005*\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\r\u0010\u0014\u001a\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0001*\u00020\fH\u0087\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u0005*\u00020\u000fH\u0087\b¢\u0006\u0004\b\u0015\u0010\u0017\u001a\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u0001*\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0018\u001a\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u0005*\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0019\u001a\u001e\u0010\u001d\u001a\u00020\u001a*\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0087\n¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001e\u0010\u001d\u001a\u00020\u001a*\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0087\n¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001c\u0010\u001d\u001a\u00020\u001a*\u00020\f2\u0006\u0010\u0012\u001a\u00020 H\u0087\u0002¢\u0006\u0004\b!\u0010\"\u001a\u001c\u0010\u001d\u001a\u00020\u001a*\u00020\u000f2\u0006\u0010\u0012\u001a\u00020 H\u0087\u0002¢\u0006\u0004\b#\u0010$\u001a\u001c\u0010\u001d\u001a\u00020\u001a*\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b%\u0010&\u001a\u001c\u0010\u001d\u001a\u00020\u001a*\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0004\b'\u0010(\u001a\u001c\u0010\u001d\u001a\u00020\u001a*\u00020\f2\u0006\u0010\u0012\u001a\u00020)H\u0087\u0002¢\u0006\u0004\b*\u0010+\u001a\u001c\u0010\u001d\u001a\u00020\u001a*\u00020\u000f2\u0006\u0010\u0012\u001a\u00020)H\u0087\u0002¢\u0006\u0004\b,\u0010-\u001a\u001c\u00100\u001a\u00020\u0000*\u00020 2\u0006\u0010\u0012\u001a\u00020 H\u0087\u0004¢\u0006\u0004\b.\u0010/\u001a\u001c\u00100\u001a\u00020\u0000*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\b1\u00102\u001a\u001c\u00100\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0087\u0004¢\u0006\u0004\b3\u00104\u001a\u001c\u00100\u001a\u00020\u0000*\u00020)2\u0006\u0010\u0012\u001a\u00020)H\u0087\u0004¢\u0006\u0004\b5\u00106\u001a\u0013\u00107\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b7\u00108\u001a\u0013\u00107\u001a\u00020\u0004*\u00020\u0004H\u0007¢\u0006\u0004\b7\u00109\u001a\u001c\u0010;\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0012\u001a\u00020:H\u0087\u0004¢\u0006\u0004\b;\u0010<\u001a\u001c\u0010;\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0012\u001a\u00020=H\u0087\u0004¢\u0006\u0004\b;\u0010>\u001a\u001c\u0010A\u001a\u00020\f*\u00020 2\u0006\u0010\u0012\u001a\u00020 H\u0087\u0004¢\u0006\u0004\b?\u0010@\u001a\u001c\u0010A\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\bB\u0010C\u001a\u001c\u0010A\u001a\u00020\u000f*\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0087\u0004¢\u0006\u0004\bD\u0010E\u001a\u001c\u0010A\u001a\u00020\f*\u00020)2\u0006\u0010\u0012\u001a\u00020)H\u0087\u0004¢\u0006\u0004\bF\u0010G\u001a\u001b\u0010J\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0007¢\u0006\u0004\bH\u0010I\u001a\u001b\u0010J\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0007¢\u0006\u0004\bK\u0010L\u001a\u001b\u0010J\u001a\u00020 *\u00020 2\u0006\u0010\u0012\u001a\u00020 H\u0007¢\u0006\u0004\bM\u0010N\u001a\u001b\u0010J\u001a\u00020)*\u00020)2\u0006\u0010\u0012\u001a\u00020)H\u0007¢\u0006\u0004\bO\u0010P\u001a\u001b\u0010R\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0007¢\u0006\u0004\bQ\u0010I\u001a\u001b\u0010R\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0007¢\u0006\u0004\bS\u0010L\u001a\u001b\u0010R\u001a\u00020 *\u00020 2\u0006\u0010\u0012\u001a\u00020 H\u0007¢\u0006\u0004\bT\u0010N\u001a\u001b\u0010R\u001a\u00020)*\u00020)2\u0006\u0010\u0012\u001a\u00020)H\u0007¢\u0006\u0004\bU\u0010P\u001a#\u0010Y\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010V\u001a\u00020\u0001H\u0007¢\u0006\u0004\bW\u0010X\u001a#\u0010Y\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010V\u001a\u00020\u0005H\u0007¢\u0006\u0004\bZ\u0010[\u001a#\u0010Y\u001a\u00020 *\u00020 2\u0006\u0010\u0012\u001a\u00020 2\u0006\u0010V\u001a\u00020 H\u0007¢\u0006\u0004\b\\\u0010]\u001a#\u0010Y\u001a\u00020)*\u00020)2\u0006\u0010\u0012\u001a\u00020)2\u0006\u0010V\u001a\u00020)H\u0007¢\u0006\u0004\b^\u0010_\u001a!\u0010Y\u001a\u00020\u0001*\u00020\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010`H\u0007¢\u0006\u0004\ba\u0010b\u001a!\u0010Y\u001a\u00020\u0005*\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050`H\u0007¢\u0006\u0004\bc\u0010d"}, d2 = {"Lkotlin/ranges/UIntProgression;", "Lkotlin/UInt;", "first", "(Lkotlin/ranges/UIntProgression;)I", "Lkotlin/ranges/ULongProgression;", "Lkotlin/ULong;", "(Lkotlin/ranges/ULongProgression;)J", "firstOrNull", "(Lkotlin/ranges/UIntProgression;)Lkotlin/UInt;", "(Lkotlin/ranges/ULongProgression;)Lkotlin/ULong;", "last", "lastOrNull", "Lkotlin/ranges/UIntRange;", "random", "(Lkotlin/ranges/UIntRange;)I", "Lkotlin/ranges/ULongRange;", "(Lkotlin/ranges/ULongRange;)J", "Lkotlin/random/Random;", "p0", "(Lkotlin/ranges/UIntRange;Lkotlin/random/Random;)I", "(Lkotlin/ranges/ULongRange;Lkotlin/random/Random;)J", "randomOrNull", "(Lkotlin/ranges/UIntRange;)Lkotlin/UInt;", "(Lkotlin/ranges/ULongRange;)Lkotlin/ULong;", "(Lkotlin/ranges/UIntRange;Lkotlin/random/Random;)Lkotlin/UInt;", "(Lkotlin/ranges/ULongRange;Lkotlin/random/Random;)Lkotlin/ULong;", "", "contains-biwQdVI", "(Lkotlin/ranges/UIntRange;Lkotlin/UInt;)Z", "contains", "contains-GYNo2lE", "(Lkotlin/ranges/ULongRange;Lkotlin/ULong;)Z", "Lkotlin/UByte;", "contains-68kG9v0", "(Lkotlin/ranges/UIntRange;B)Z", "contains-ULb-yJY", "(Lkotlin/ranges/ULongRange;B)Z", "contains-Gab390E", "(Lkotlin/ranges/ULongRange;I)Z", "contains-fz5IDCE", "(Lkotlin/ranges/UIntRange;J)Z", "Lkotlin/UShort;", "contains-ZsK3CEQ", "(Lkotlin/ranges/UIntRange;S)Z", "contains-uhHAxoY", "(Lkotlin/ranges/ULongRange;S)Z", "downTo-Kr8caGY", "(BB)Lkotlin/ranges/UIntProgression;", "downTo", "downTo-J1ME1BU", "(II)Lkotlin/ranges/UIntProgression;", "downTo-eb3DHEI", "(JJ)Lkotlin/ranges/ULongProgression;", "downTo-5PvTz6A", "(SS)Lkotlin/ranges/UIntProgression;", "reversed", "(Lkotlin/ranges/UIntProgression;)Lkotlin/ranges/UIntProgression;", "(Lkotlin/ranges/ULongProgression;)Lkotlin/ranges/ULongProgression;", "", "step", "(Lkotlin/ranges/UIntProgression;I)Lkotlin/ranges/UIntProgression;", "", "(Lkotlin/ranges/ULongProgression;J)Lkotlin/ranges/ULongProgression;", "until-Kr8caGY", "(BB)Lkotlin/ranges/UIntRange;", "until", "until-J1ME1BU", "(II)Lkotlin/ranges/UIntRange;", "until-eb3DHEI", "(JJ)Lkotlin/ranges/ULongRange;", "until-5PvTz6A", "(SS)Lkotlin/ranges/UIntRange;", "coerceAtLeast-J1ME1BU", "(II)I", "coerceAtLeast", "coerceAtLeast-eb3DHEI", "(JJ)J", "coerceAtLeast-Kr8caGY", "(BB)B", "coerceAtLeast-5PvTz6A", "(SS)S", "coerceAtMost-J1ME1BU", "coerceAtMost", "coerceAtMost-eb3DHEI", "coerceAtMost-Kr8caGY", "coerceAtMost-5PvTz6A", "p1", "coerceIn-WZ9TVnA", "(III)I", "coerceIn", "coerceIn-sambcqE", "(JJJ)J", "coerceIn-b33U2AM", "(BBB)B", "coerceIn-VKSA0NQ", "(SSS)S", "Lkotlin/ranges/ClosedRange;", "coerceIn-wuiCnnA", "(ILkotlin/ranges/ClosedRange;)I", "coerceIn-JPwROB0", "(JLkotlin/ranges/ClosedRange;)J"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/ranges/URangesKt")
public class URangesKt___URangesKt {
    public static final int first(UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "");
        if (uIntProgression.isEmpty()) {
            StringBuilder sb = new StringBuilder("Progression ");
            sb.append(uIntProgression);
            sb.append(" is empty.");
            throw new NoSuchElementException(sb.toString());
        }
        return uIntProgression.getFirst();
    }

    public static final long first(ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "");
        if (uLongProgression.isEmpty()) {
            StringBuilder sb = new StringBuilder("Progression ");
            sb.append(uLongProgression);
            sb.append(" is empty.");
            throw new NoSuchElementException(sb.toString());
        }
        return uLongProgression.getFirst();
    }

    public static final UInt firstOrNull(UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "");
        if (uIntProgression.isEmpty()) {
            return null;
        }
        return UInt.m8118boximpl(uIntProgression.getFirst());
    }

    public static final ULong firstOrNull(ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "");
        if (uLongProgression.isEmpty()) {
            return null;
        }
        return ULong.m8197boximpl(uLongProgression.getFirst());
    }

    public static final int last(UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "");
        if (uIntProgression.isEmpty()) {
            StringBuilder sb = new StringBuilder("Progression ");
            sb.append(uIntProgression);
            sb.append(" is empty.");
            throw new NoSuchElementException(sb.toString());
        }
        return uIntProgression.getLast();
    }

    public static final long last(ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "");
        if (uLongProgression.isEmpty()) {
            StringBuilder sb = new StringBuilder("Progression ");
            sb.append(uLongProgression);
            sb.append(" is empty.");
            throw new NoSuchElementException(sb.toString());
        }
        return uLongProgression.getLast();
    }

    public static final UInt lastOrNull(UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "");
        if (uIntProgression.isEmpty()) {
            return null;
        }
        return UInt.m8118boximpl(uIntProgression.getLast());
    }

    public static final ULong lastOrNull(ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "");
        if (uLongProgression.isEmpty()) {
            return null;
        }
        return ULong.m8197boximpl(uLongProgression.getLast());
    }

    private static final int random(UIntRange uIntRange) {
        Intrinsics.checkNotNullParameter(uIntRange, "");
        return URangesKt.random(uIntRange, Random.INSTANCE);
    }

    private static final long random(ULongRange uLongRange) {
        Intrinsics.checkNotNullParameter(uLongRange, "");
        return URangesKt.random(uLongRange, Random.INSTANCE);
    }

    public static final int random(UIntRange uIntRange, Random random) {
        Intrinsics.checkNotNullParameter(uIntRange, "");
        Intrinsics.checkNotNullParameter(random, "");
        try {
            return URandomKt.nextUInt(random, uIntRange);
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    public static final long random(ULongRange uLongRange, Random random) {
        Intrinsics.checkNotNullParameter(uLongRange, "");
        Intrinsics.checkNotNullParameter(random, "");
        try {
            return URandomKt.nextULong(random, uLongRange);
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    private static final UInt randomOrNull(UIntRange uIntRange) {
        Intrinsics.checkNotNullParameter(uIntRange, "");
        return URangesKt.randomOrNull(uIntRange, Random.INSTANCE);
    }

    private static final ULong randomOrNull(ULongRange uLongRange) {
        Intrinsics.checkNotNullParameter(uLongRange, "");
        return URangesKt.randomOrNull(uLongRange, Random.INSTANCE);
    }

    public static final UInt randomOrNull(UIntRange uIntRange, Random random) {
        Intrinsics.checkNotNullParameter(uIntRange, "");
        Intrinsics.checkNotNullParameter(random, "");
        if (uIntRange.isEmpty()) {
            return null;
        }
        return UInt.m8118boximpl(URandomKt.nextUInt(random, uIntRange));
    }

    public static final ULong randomOrNull(ULongRange uLongRange, Random random) {
        Intrinsics.checkNotNullParameter(uLongRange, "");
        Intrinsics.checkNotNullParameter(random, "");
        if (uLongRange.isEmpty()) {
            return null;
        }
        return ULong.m8197boximpl(URandomKt.nextULong(random, uLongRange));
    }

    /* JADX INFO: renamed from: contains-biwQdVI, reason: not valid java name */
    private static final boolean m9297containsbiwQdVI(UIntRange uIntRange, UInt uInt) {
        Intrinsics.checkNotNullParameter(uIntRange, "");
        return uInt != null && uIntRange.m9265containsWZ4Q5Ns(uInt.getData());
    }

    /* JADX INFO: renamed from: contains-GYNo2lE, reason: not valid java name */
    private static final boolean m9293containsGYNo2lE(ULongRange uLongRange, ULong uLong) {
        Intrinsics.checkNotNullParameter(uLongRange, "");
        return uLong != null && uLongRange.m9274containsVKZWuLQ(uLong.getData());
    }

    /* JADX INFO: renamed from: contains-68kG9v0, reason: not valid java name */
    public static final boolean m9292contains68kG9v0(UIntRange uIntRange, byte b) {
        Intrinsics.checkNotNullParameter(uIntRange, "");
        return uIntRange.m9265containsWZ4Q5Ns(UInt.m8124constructorimpl(b & UByte.MAX_VALUE));
    }

    /* JADX INFO: renamed from: contains-ULb-yJY, reason: not valid java name */
    public static final boolean m9295containsULbyJY(ULongRange uLongRange, byte b) {
        Intrinsics.checkNotNullParameter(uLongRange, "");
        return uLongRange.m9274containsVKZWuLQ(ULong.m8203constructorimpl(((long) b) & 255));
    }

    /* JADX INFO: renamed from: contains-Gab390E, reason: not valid java name */
    public static final boolean m9294containsGab390E(ULongRange uLongRange, int i) {
        Intrinsics.checkNotNullParameter(uLongRange, "");
        return uLongRange.m9274containsVKZWuLQ(ULong.m8203constructorimpl(((long) i) & 4294967295L));
    }

    /* JADX INFO: renamed from: contains-fz5IDCE, reason: not valid java name */
    public static final boolean m9298containsfz5IDCE(UIntRange uIntRange, long j) {
        Intrinsics.checkNotNullParameter(uIntRange, "");
        return ULong.m8203constructorimpl(j >>> 32) == 0 && uIntRange.m9265containsWZ4Q5Ns(UInt.m8124constructorimpl((int) j));
    }

    /* JADX INFO: renamed from: contains-ZsK3CEQ, reason: not valid java name */
    public static final boolean m9296containsZsK3CEQ(UIntRange uIntRange, short s) {
        Intrinsics.checkNotNullParameter(uIntRange, "");
        return uIntRange.m9265containsWZ4Q5Ns(UInt.m8124constructorimpl(s & UShort.MAX_VALUE));
    }

    /* JADX INFO: renamed from: contains-uhHAxoY, reason: not valid java name */
    public static final boolean m9299containsuhHAxoY(ULongRange uLongRange, short s) {
        Intrinsics.checkNotNullParameter(uLongRange, "");
        return uLongRange.m9274containsVKZWuLQ(ULong.m8203constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    /* JADX INFO: renamed from: downTo-Kr8caGY, reason: not valid java name */
    public static final UIntProgression m9302downToKr8caGY(byte b, byte b2) {
        return UIntProgression.INSTANCE.m9262fromClosedRangeNkh28Cs(UInt.m8124constructorimpl(b & UByte.MAX_VALUE), UInt.m8124constructorimpl(b2 & UByte.MAX_VALUE), -1);
    }

    /* JADX INFO: renamed from: downTo-J1ME1BU, reason: not valid java name */
    public static final UIntProgression m9301downToJ1ME1BU(int i, int i2) {
        return UIntProgression.INSTANCE.m9262fromClosedRangeNkh28Cs(i, i2, -1);
    }

    /* JADX INFO: renamed from: downTo-eb3DHEI, reason: not valid java name */
    public static final ULongProgression m9303downToeb3DHEI(long j, long j2) {
        return ULongProgression.INSTANCE.m9271fromClosedRange7ftBX0g(j, j2, -1L);
    }

    /* JADX INFO: renamed from: downTo-5PvTz6A, reason: not valid java name */
    public static final UIntProgression m9300downTo5PvTz6A(short s, short s2) {
        return UIntProgression.INSTANCE.m9262fromClosedRangeNkh28Cs(UInt.m8124constructorimpl(s & UShort.MAX_VALUE), UInt.m8124constructorimpl(s2 & UShort.MAX_VALUE), -1);
    }

    public static final UIntProgression reversed(UIntProgression uIntProgression) {
        Intrinsics.checkNotNullParameter(uIntProgression, "");
        return UIntProgression.INSTANCE.m9262fromClosedRangeNkh28Cs(uIntProgression.getLast(), uIntProgression.getFirst(), -uIntProgression.getStep());
    }

    public static final ULongProgression reversed(ULongProgression uLongProgression) {
        Intrinsics.checkNotNullParameter(uLongProgression, "");
        return ULongProgression.INSTANCE.m9271fromClosedRange7ftBX0g(uLongProgression.getLast(), uLongProgression.getFirst(), -uLongProgression.getStep());
    }

    public static final UIntProgression step(UIntProgression uIntProgression, int i) {
        Intrinsics.checkNotNullParameter(uIntProgression, "");
        RangesKt.checkStepIsPositive(i > 0, Integer.valueOf(i));
        UIntProgression.Companion companion = UIntProgression.INSTANCE;
        int iM9260getFirstpVg5ArA = uIntProgression.getFirst();
        int iM9261getLastpVg5ArA = uIntProgression.getLast();
        if (uIntProgression.getStep() <= 0) {
            i = -i;
        }
        return companion.m9262fromClosedRangeNkh28Cs(iM9260getFirstpVg5ArA, iM9261getLastpVg5ArA, i);
    }

    public static final ULongProgression step(ULongProgression uLongProgression, long j) {
        Intrinsics.checkNotNullParameter(uLongProgression, "");
        RangesKt.checkStepIsPositive(j > 0, Long.valueOf(j));
        ULongProgression.Companion companion = ULongProgression.INSTANCE;
        long jM9269getFirstsVKNKU = uLongProgression.getFirst();
        long jM9270getLastsVKNKU = uLongProgression.getLast();
        if (uLongProgression.getStep() <= 0) {
            j = -j;
        }
        return companion.m9271fromClosedRange7ftBX0g(jM9269getFirstsVKNKU, jM9270getLastsVKNKU, j);
    }

    /* JADX INFO: renamed from: until-Kr8caGY, reason: not valid java name */
    public static final UIntRange m9306untilKr8caGY(byte b, byte b2) {
        int i = b2 & UByte.MAX_VALUE;
        return Intrinsics.compare(i, 0) <= 0 ? UIntRange.INSTANCE.getEMPTY() : new UIntRange(UInt.m8124constructorimpl(b & UByte.MAX_VALUE), UInt.m8124constructorimpl(UInt.m8124constructorimpl(i) - 1), null);
    }

    /* JADX INFO: renamed from: until-J1ME1BU, reason: not valid java name */
    public static final UIntRange m9305untilJ1ME1BU(int i, int i2) {
        return Integer.compare(i2 ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE) <= 0 ? UIntRange.INSTANCE.getEMPTY() : new UIntRange(i, UInt.m8124constructorimpl(i2 - 1), null);
    }

    /* JADX INFO: renamed from: until-eb3DHEI, reason: not valid java name */
    public static final ULongRange m9307untileb3DHEI(long j, long j2) {
        return Long.compare(j2 ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE) <= 0 ? ULongRange.INSTANCE.getEMPTY() : new ULongRange(j, ULong.m8203constructorimpl(j2 - ULong.m8203constructorimpl(1L)), null);
    }

    /* JADX INFO: renamed from: until-5PvTz6A, reason: not valid java name */
    public static final UIntRange m9304until5PvTz6A(short s, short s2) {
        int i = s2 & UShort.MAX_VALUE;
        return Intrinsics.compare(i, 0) <= 0 ? UIntRange.INSTANCE.getEMPTY() : new UIntRange(UInt.m8124constructorimpl(s & UShort.MAX_VALUE), UInt.m8124constructorimpl(UInt.m8124constructorimpl(i) - 1), null);
    }

    /* JADX INFO: renamed from: coerceAtLeast-J1ME1BU, reason: not valid java name */
    public static final int m9279coerceAtLeastJ1ME1BU(int i, int i2) {
        return Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) < 0 ? i2 : i;
    }

    /* JADX INFO: renamed from: coerceAtLeast-eb3DHEI, reason: not valid java name */
    public static final long m9281coerceAtLeasteb3DHEI(long j, long j2) {
        return Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) < 0 ? j2 : j;
    }

    /* JADX INFO: renamed from: coerceAtLeast-Kr8caGY, reason: not valid java name */
    public static final byte m9280coerceAtLeastKr8caGY(byte b, byte b2) {
        return Intrinsics.compare(b & UByte.MAX_VALUE, b2 & UByte.MAX_VALUE) < 0 ? b2 : b;
    }

    /* JADX INFO: renamed from: coerceAtLeast-5PvTz6A, reason: not valid java name */
    public static final short m9278coerceAtLeast5PvTz6A(short s, short s2) {
        return Intrinsics.compare(s & UShort.MAX_VALUE, 65535 & s2) < 0 ? s2 : s;
    }

    /* JADX INFO: renamed from: coerceAtMost-J1ME1BU, reason: not valid java name */
    public static final int m9283coerceAtMostJ1ME1BU(int i, int i2) {
        return Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) > 0 ? i2 : i;
    }

    /* JADX INFO: renamed from: coerceAtMost-eb3DHEI, reason: not valid java name */
    public static final long m9285coerceAtMosteb3DHEI(long j, long j2) {
        return Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) > 0 ? j2 : j;
    }

    /* JADX INFO: renamed from: coerceAtMost-Kr8caGY, reason: not valid java name */
    public static final byte m9284coerceAtMostKr8caGY(byte b, byte b2) {
        return Intrinsics.compare(b & UByte.MAX_VALUE, b2 & UByte.MAX_VALUE) > 0 ? b2 : b;
    }

    /* JADX INFO: renamed from: coerceAtMost-5PvTz6A, reason: not valid java name */
    public static final short m9282coerceAtMost5PvTz6A(short s, short s2) {
        return Intrinsics.compare(s & UShort.MAX_VALUE, 65535 & s2) > 0 ? s2 : s;
    }

    /* JADX INFO: renamed from: coerceIn-WZ9TVnA, reason: not valid java name */
    public static final int m9288coerceInWZ9TVnA(int i, int i2, int i3) {
        if (Integer.compare(i2 ^ Integer.MIN_VALUE, i3 ^ Integer.MIN_VALUE) > 0) {
            StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
            sb.append((Object) UInt.m8170toStringimpl(i3));
            sb.append(" is less than minimum ");
            sb.append((Object) UInt.m8170toStringimpl(i2));
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        if (Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) < 0) {
            return i2;
        }
        return Integer.compare(i ^ Integer.MIN_VALUE, i3 ^ Integer.MIN_VALUE) > 0 ? i3 : i;
    }

    /* JADX INFO: renamed from: coerceIn-sambcqE, reason: not valid java name */
    public static final long m9290coerceInsambcqE(long j, long j2, long j3) {
        if (Long.compare(j2 ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE) > 0) {
            StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
            sb.append((Object) ULong.m8249toStringimpl(j3));
            sb.append(" is less than minimum ");
            sb.append((Object) ULong.m8249toStringimpl(j2));
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        if (Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) < 0) {
            return j2;
        }
        return Long.compare(j ^ Long.MIN_VALUE, j3 ^ Long.MIN_VALUE) > 0 ? j3 : j;
    }

    /* JADX INFO: renamed from: coerceIn-b33U2AM, reason: not valid java name */
    public static final byte m9289coerceInb33U2AM(byte b, byte b2, byte b3) {
        int i = b2 & UByte.MAX_VALUE;
        int i2 = b3 & UByte.MAX_VALUE;
        if (Intrinsics.compare(i, i2) > 0) {
            StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
            sb.append((Object) UByte.m8086toStringimpl(b3));
            sb.append(" is less than minimum ");
            sb.append((Object) UByte.m8086toStringimpl(b2));
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        int i3 = b & UByte.MAX_VALUE;
        if (Intrinsics.compare(i3, i) < 0) {
            return b2;
        }
        return Intrinsics.compare(i3, i2) > 0 ? b3 : b;
    }

    /* JADX INFO: renamed from: coerceIn-VKSA0NQ, reason: not valid java name */
    public static final short m9287coerceInVKSA0NQ(short s, short s2, short s3) {
        int i = s2 & UShort.MAX_VALUE;
        int i2 = s3 & UShort.MAX_VALUE;
        if (Intrinsics.compare(i, i2) > 0) {
            StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: maximum ");
            sb.append((Object) UShort.m8354toStringimpl(s3));
            sb.append(" is less than minimum ");
            sb.append((Object) UShort.m8354toStringimpl(s2));
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        int i3 = 65535 & s;
        if (Intrinsics.compare(i3, i) < 0) {
            return s2;
        }
        return Intrinsics.compare(i3, i2) > 0 ? s3 : s;
    }

    /* JADX INFO: renamed from: coerceIn-wuiCnnA, reason: not valid java name */
    public static final int m9291coerceInwuiCnnA(int i, ClosedRange<UInt> closedRange) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        if (closedRange instanceof ClosedFloatingPointRange) {
            return ((UInt) RangesKt.coerceIn(UInt.m8118boximpl(i), (ClosedFloatingPointRange<UInt>) closedRange)).getData();
        }
        if (!closedRange.isEmpty()) {
            if (Integer.compare(i ^ Integer.MIN_VALUE, ((UInt) closedRange.getStart()).getData() ^ Integer.MIN_VALUE) < 0) {
                return ((UInt) closedRange.getStart()).getData();
            }
            return Integer.compare(i ^ Integer.MIN_VALUE, ((UInt) closedRange.getEndInclusive()).getData() ^ Integer.MIN_VALUE) > 0 ? ((UInt) closedRange.getEndInclusive()).getData() : i;
        }
        StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: ");
        sb.append(closedRange);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: renamed from: coerceIn-JPwROB0, reason: not valid java name */
    public static final long m9286coerceInJPwROB0(long j, ClosedRange<ULong> closedRange) {
        Intrinsics.checkNotNullParameter(closedRange, "");
        if (closedRange instanceof ClosedFloatingPointRange) {
            return ((ULong) RangesKt.coerceIn(ULong.m8197boximpl(j), (ClosedFloatingPointRange<ULong>) closedRange)).getData();
        }
        if (!closedRange.isEmpty()) {
            if (Long.compare(j ^ Long.MIN_VALUE, ((ULong) closedRange.getStart()).getData() ^ Long.MIN_VALUE) < 0) {
                return ((ULong) closedRange.getStart()).getData();
            }
            return Long.compare(j ^ Long.MIN_VALUE, ((ULong) closedRange.getEndInclusive()).getData() ^ Long.MIN_VALUE) > 0 ? ((ULong) closedRange.getEndInclusive()).getData() : j;
        }
        StringBuilder sb = new StringBuilder("Cannot coerce value to an empty range: ");
        sb.append(closedRange);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }
}
