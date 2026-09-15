package kotlin.random;

import kotlin.Metadata;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.ULongRange;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0002\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0002\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\u0002\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0002\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0000H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\r\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a#\u0010\r\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001b\u0010\r\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\r\u0010\u0014\u001a\u001b\u0010\u0018\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0018\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u0018\u0010\u001a\u001a/\u0010\u0018\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00152\b\b\u0002\u0010\u0007\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010!\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u001f\u0010$\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\fH\u0000¢\u0006\u0004\b\"\u0010#"}, d2 = {"Lkotlin/random/Random;", "Lkotlin/UInt;", "nextUInt", "(Lkotlin/random/Random;)I", "p0", "nextUInt-qCasIEU", "(Lkotlin/random/Random;I)I", "p1", "nextUInt-a8DCA5k", "(Lkotlin/random/Random;II)I", "Lkotlin/ranges/UIntRange;", "(Lkotlin/random/Random;Lkotlin/ranges/UIntRange;)I", "Lkotlin/ULong;", "nextULong", "(Lkotlin/random/Random;)J", "nextULong-V1Xi4fY", "(Lkotlin/random/Random;J)J", "nextULong-jmpaW-c", "(Lkotlin/random/Random;JJ)J", "Lkotlin/ranges/ULongRange;", "(Lkotlin/random/Random;Lkotlin/ranges/ULongRange;)J", "Lkotlin/UByteArray;", "nextUBytes-EVgfTAA", "(Lkotlin/random/Random;[B)[B", "nextUBytes", "", "(Lkotlin/random/Random;I)[B", "p2", "nextUBytes-Wvrt4B4", "(Lkotlin/random/Random;[BII)[B", "", "checkUIntRangeBounds-J1ME1BU", "(II)V", "checkUIntRangeBounds", "checkULongRangeBounds-eb3DHEI", "(JJ)V", "checkULongRangeBounds"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class URandomKt {
    public static final int nextUInt(Random random) {
        Intrinsics.checkNotNullParameter(random, "");
        return UInt.m8124constructorimpl(random.nextInt());
    }

    /* JADX INFO: renamed from: nextUInt-qCasIEU, reason: not valid java name */
    public static final int m9257nextUIntqCasIEU(Random random, int i) {
        Intrinsics.checkNotNullParameter(random, "");
        return m9256nextUInta8DCA5k(random, 0, i);
    }

    /* JADX INFO: renamed from: nextUInt-a8DCA5k, reason: not valid java name */
    public static final int m9256nextUInta8DCA5k(Random random, int i, int i2) {
        Intrinsics.checkNotNullParameter(random, "");
        m9251checkUIntRangeBoundsJ1ME1BU(i, i2);
        return UInt.m8124constructorimpl(random.nextInt(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }

    public static final int nextUInt(Random random, UIntRange uIntRange) {
        Intrinsics.checkNotNullParameter(random, "");
        Intrinsics.checkNotNullParameter(uIntRange, "");
        if (uIntRange.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: ".concat(String.valueOf(uIntRange)));
        }
        if (Integer.compare(uIntRange.getLast() ^ Integer.MIN_VALUE, (-1) ^ Integer.MIN_VALUE) < 0) {
            return m9256nextUInta8DCA5k(random, uIntRange.getFirst(), UInt.m8124constructorimpl(uIntRange.getLast() + 1));
        }
        return Integer.compare(uIntRange.getFirst() ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE) > 0 ? UInt.m8124constructorimpl(m9256nextUInta8DCA5k(random, UInt.m8124constructorimpl(uIntRange.getFirst() - 1), uIntRange.getLast()) + 1) : nextUInt(random);
    }

    public static final long nextULong(Random random) {
        Intrinsics.checkNotNullParameter(random, "");
        return ULong.m8203constructorimpl(random.nextLong());
    }

    /* JADX INFO: renamed from: nextULong-V1Xi4fY, reason: not valid java name */
    public static final long m9258nextULongV1Xi4fY(Random random, long j) {
        Intrinsics.checkNotNullParameter(random, "");
        return m9259nextULongjmpaWc(random, 0L, j);
    }

    /* JADX INFO: renamed from: nextULong-jmpaW-c, reason: not valid java name */
    public static final long m9259nextULongjmpaWc(Random random, long j, long j2) {
        Intrinsics.checkNotNullParameter(random, "");
        m9252checkULongRangeBoundseb3DHEI(j, j2);
        return ULong.m8203constructorimpl(random.nextLong(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }

    public static final long nextULong(Random random, ULongRange uLongRange) {
        Intrinsics.checkNotNullParameter(random, "");
        Intrinsics.checkNotNullParameter(uLongRange, "");
        if (uLongRange.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: ".concat(String.valueOf(uLongRange)));
        }
        if (Long.compare(uLongRange.getLast() ^ Long.MIN_VALUE, (-1) ^ Long.MIN_VALUE) < 0) {
            return m9259nextULongjmpaWc(random, uLongRange.getFirst(), ULong.m8203constructorimpl(uLongRange.getLast() + ULong.m8203constructorimpl(1L)));
        }
        return Long.compare(uLongRange.getFirst() ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE) > 0 ? ULong.m8203constructorimpl(m9259nextULongjmpaWc(random, ULong.m8203constructorimpl(uLongRange.getFirst() - ULong.m8203constructorimpl(1L)), uLongRange.getLast()) + ULong.m8203constructorimpl(1L)) : nextULong(random);
    }

    /* JADX INFO: renamed from: nextUBytes-EVgfTAA, reason: not valid java name */
    public static final byte[] m9253nextUBytesEVgfTAA(Random random, byte[] bArr) {
        Intrinsics.checkNotNullParameter(random, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        random.nextBytes(bArr);
        return bArr;
    }

    public static final byte[] nextUBytes(Random random, int i) {
        Intrinsics.checkNotNullParameter(random, "");
        return UByteArray.m8100constructorimpl(random.nextBytes(i));
    }

    /* JADX INFO: renamed from: nextUBytes-Wvrt4B4$default, reason: not valid java name */
    public static /* synthetic */ byte[] m9255nextUBytesWvrt4B4$default(Random random, byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = UByteArray.m8106getSizeimpl(bArr);
        }
        return m9254nextUBytesWvrt4B4(random, bArr, i, i2);
    }

    /* JADX INFO: renamed from: nextUBytes-Wvrt4B4, reason: not valid java name */
    public static final byte[] m9254nextUBytesWvrt4B4(Random random, byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(random, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        random.nextBytes(bArr, i, i2);
        return bArr;
    }

    /* JADX INFO: renamed from: checkUIntRangeBounds-J1ME1BU, reason: not valid java name */
    public static final void m9251checkUIntRangeBoundsJ1ME1BU(int i, int i2) {
        if (Integer.compare(i2 ^ Integer.MIN_VALUE, i ^ Integer.MIN_VALUE) <= 0) {
            throw new IllegalArgumentException(RandomKt.boundsErrorMessage(UInt.m8118boximpl(i), UInt.m8118boximpl(i2)).toString());
        }
    }

    /* JADX INFO: renamed from: checkULongRangeBounds-eb3DHEI, reason: not valid java name */
    public static final void m9252checkULongRangeBoundseb3DHEI(long j, long j2) {
        if (Long.compare(j2 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE) <= 0) {
            throw new IllegalArgumentException(RandomKt.boundsErrorMessage(ULong.m8197boximpl(j), ULong.m8197boximpl(j2)).toString());
        }
    }
}
