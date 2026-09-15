package kotlin.internal;

import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.UInt;
import kotlin.ULong;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u001a'\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\f\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000b\u0010\u0005\u001a'\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000e\u0010\t"}, d2 = {"Lkotlin/UInt;", "p0", "p1", "p2", "differenceModulo-WZ9TVnA", "(III)I", "differenceModulo", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "", "getProgressionLastElement-Nkh28Cs", "getProgressionLastElement", "", "getProgressionLastElement-7ftBX0g"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class UProgressionUtilKt {
    /* JADX INFO: renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m9241differenceModuloWZ9TVnA(int i, int i2, int i3) {
        int iM$1 = UByte$$ExternalSyntheticBackport0.m$1(i, i3);
        int iM$2 = UByte$$ExternalSyntheticBackport0.m$1(i2, i3);
        int iCompare = Integer.compare(iM$1 ^ Integer.MIN_VALUE, iM$2 ^ Integer.MIN_VALUE);
        int iM8124constructorimpl = UInt.m8124constructorimpl(iM$1 - iM$2);
        return iCompare >= 0 ? iM8124constructorimpl : UInt.m8124constructorimpl(iM8124constructorimpl + i3);
    }

    /* JADX INFO: renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m9242differenceModulosambcqE(long j, long j2, long j3) {
        long jM8093m = UByte$$ExternalSyntheticBackport0.m8093m(j, j3);
        long jM8093m2 = UByte$$ExternalSyntheticBackport0.m8093m(j2, j3);
        int iCompare = Long.compare(jM8093m ^ Long.MIN_VALUE, jM8093m2 ^ Long.MIN_VALUE);
        long jM8203constructorimpl = ULong.m8203constructorimpl(jM8093m - jM8093m2);
        return iCompare >= 0 ? jM8203constructorimpl : ULong.m8203constructorimpl(jM8203constructorimpl + j3);
    }

    /* JADX INFO: renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m9244getProgressionLastElementNkh28Cs(int i, int i2, int i3) {
        if (i3 > 0) {
            if (Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) < 0) {
                return UInt.m8124constructorimpl(i2 - m9241differenceModuloWZ9TVnA(i2, i, UInt.m8124constructorimpl(i3)));
            }
        } else if (i3 < 0) {
            if (Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) > 0) {
                return UInt.m8124constructorimpl(i2 + m9241differenceModuloWZ9TVnA(i, i2, UInt.m8124constructorimpl(-i3)));
            }
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
        return i2;
    }

    /* JADX INFO: renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m9243getProgressionLastElement7ftBX0g(long j, long j2, long j3) {
        if (j3 > 0) {
            if (Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) < 0) {
                return ULong.m8203constructorimpl(j2 - m9242differenceModulosambcqE(j2, j, ULong.m8203constructorimpl(j3)));
            }
        } else if (j3 < 0) {
            if (Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) > 0) {
                return ULong.m8203constructorimpl(j2 + m9242differenceModulosambcqE(j, j2, ULong.m8203constructorimpl(-j3)));
            }
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
        return j2;
    }
}
