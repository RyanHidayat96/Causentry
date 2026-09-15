package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a'\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\r\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0007\u001a\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u001a'\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0011\u001a\u0014\u0010\u0015\u001a\u00020\u0014*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"", "p0", "Lkotlin/time/DurationUnit;", "p1", "Lkotlin/time/Duration;", "p2", "saturatingAdd-NuflL3o", "(JLkotlin/time/DurationUnit;J)J", "saturatingAdd", "checkInfiniteSumDefined-PjuGub4", "(JJJ)J", "checkInfiniteSumDefined", "saturatingAddInHalves-NuflL3o", "saturatingAddInHalves", "infinityOfSign", "(J)J", "saturatingDiff", "(JJLkotlin/time/DurationUnit;)J", "saturatingOriginsDiff", "saturatingFiniteDiff", "", "isSaturated", "(J)Z"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LongSaturatedMathKt {
    public static final boolean isSaturated(long j) {
        return ((j - 1) | 1) == Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: saturatingAdd-NuflL3o, reason: not valid java name */
    public static final long m9479saturatingAddNuflL3o(long j, DurationUnit durationUnit, long j2) {
        Intrinsics.checkNotNullParameter(durationUnit, "");
        long jM9413toLongimpl = Duration.m9413toLongimpl(j2, durationUnit);
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            return m9478checkInfiniteSumDefinedPjuGub4(j, j2, jM9413toLongimpl);
        }
        if ((1 | (jM9413toLongimpl - 1)) == Long.MAX_VALUE) {
            return m9480saturatingAddInHalvesNuflL3o(j, durationUnit, j2);
        }
        long j3 = j + jM9413toLongimpl;
        if (((j ^ j3) & (jM9413toLongimpl ^ j3)) < 0) {
            return j < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        return j3;
    }

    /* JADX INFO: renamed from: checkInfiniteSumDefined-PjuGub4, reason: not valid java name */
    private static final long m9478checkInfiniteSumDefinedPjuGub4(long j, long j2, long j3) {
        if (!Duration.m9399isInfiniteimpl(j2) || (j ^ j3) >= 0) {
            return j;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    /* JADX INFO: renamed from: saturatingAddInHalves-NuflL3o, reason: not valid java name */
    private static final long m9480saturatingAddInHalvesNuflL3o(long j, DurationUnit durationUnit, long j2) {
        long jM9377divUwyO8pc = Duration.m9377divUwyO8pc(j2, 2);
        long jM9413toLongimpl = Duration.m9413toLongimpl(jM9377divUwyO8pc, durationUnit);
        return (1 | (jM9413toLongimpl - 1)) == Long.MAX_VALUE ? jM9413toLongimpl : m9479saturatingAddNuflL3o(m9479saturatingAddNuflL3o(j, durationUnit, jM9377divUwyO8pc), durationUnit, Duration.m9402minusLRDsOJo(j2, jM9377divUwyO8pc));
    }

    private static final long infinityOfSign(long j) {
        return j < 0 ? Duration.INSTANCE.m9464getNEG_INFINITEUwyO8pc$kotlin_stdlib() : Duration.INSTANCE.m9463getINFINITEUwyO8pc();
    }

    public static final long saturatingDiff(long j, long j2, DurationUnit durationUnit) {
        Intrinsics.checkNotNullParameter(durationUnit, "");
        if ((1 | (j2 - 1)) == Long.MAX_VALUE) {
            return Duration.m9418unaryMinusUwyO8pc(infinityOfSign(j2));
        }
        return saturatingFiniteDiff(j, j2, durationUnit);
    }

    public static final long saturatingOriginsDiff(long j, long j2, DurationUnit durationUnit) {
        Intrinsics.checkNotNullParameter(durationUnit, "");
        if (((j2 - 1) | 1) == Long.MAX_VALUE) {
            if (j == j2) {
                return Duration.INSTANCE.m9465getZEROUwyO8pc();
            }
            return Duration.m9418unaryMinusUwyO8pc(infinityOfSign(j2));
        }
        if ((1 | (j - 1)) == Long.MAX_VALUE) {
            return infinityOfSign(j);
        }
        return saturatingFiniteDiff(j, j2, durationUnit);
    }

    private static final long saturatingFiniteDiff(long j, long j2, DurationUnit durationUnit) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) < 0) {
            if (durationUnit.compareTo(DurationUnit.MILLISECONDS) < 0) {
                long jConvertDurationUnit = DurationUnitKt.convertDurationUnit(1L, DurationUnit.MILLISECONDS, durationUnit);
                Duration.Companion companion = Duration.INSTANCE;
                return Duration.m9403plusLRDsOJo(DurationKt.toDuration((j / jConvertDurationUnit) - (j2 / jConvertDurationUnit), DurationUnit.MILLISECONDS), DurationKt.toDuration((j % jConvertDurationUnit) - (j2 % jConvertDurationUnit), durationUnit));
            }
            return Duration.m9418unaryMinusUwyO8pc(infinityOfSign(j3));
        }
        return DurationKt.toDuration(j3, durationUnit);
    }
}
