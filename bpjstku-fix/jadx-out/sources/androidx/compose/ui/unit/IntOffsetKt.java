package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0014\u0010\u000e\u001a\u00020\u000b*\u00020\u0003H\u0087\b¢\u0006\u0004\b\f\u0010\r\u001a\u001c\u0010\u0011\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001c\u0010\u0013\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\u0012\u0010\u0010\u001a\u001c\u0010\u0011\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u000bH\u0087\u0002¢\u0006\u0004\b\u0014\u0010\u0010\u001a\u001c\u0010\u0013\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u000bH\u0087\u0002¢\u0006\u0004\b\u0015\u0010\u0010\u001a\u0013\u0010\u0017\u001a\u00020\u0003*\u00020\u000bH\u0007¢\u0006\u0004\b\u0016\u0010\r"}, d2 = {"", "p0", "p1", "Landroidx/compose/ui/unit/IntOffset;", "IntOffset", "(II)J", "", "p2", "lerp-81ZRxRo", "(JJF)J", "lerp", "Landroidx/compose/ui/geometry/Offset;", "toOffset--gyyYBs", "(J)J", "toOffset", "plus-Nv-tHpc", "(JJ)J", "plus", "minus-Nv-tHpc", "minus", "plus-oCl6YwE", "minus-oCl6YwE", "round-k-4lQ0M", "round"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IntOffsetKt {
    public static final long IntOffset(int i, int i2) {
        return IntOffset.m7057constructorimpl((((long) i2) & 4294967295L) | (((long) i) << 32));
    }

    /* JADX INFO: renamed from: lerp-81ZRxRo, reason: not valid java name */
    public static final long m7075lerp81ZRxRo(long j, long j2, float f) {
        return IntOffset.m7057constructorimpl((((long) MathHelpersKt.lerp(IntOffset.m7063getXimpl(j), IntOffset.m7063getXimpl(j2), f)) << 32) | (((long) MathHelpersKt.lerp(IntOffset.m7064getYimpl(j), IntOffset.m7064getYimpl(j2), f)) & 4294967295L));
    }

    /* JADX INFO: renamed from: toOffset--gyyYBs, reason: not valid java name */
    public static final long m7081toOffsetgyyYBs(long j) {
        return Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(IntOffset.m7064getYimpl(j))) & 4294967295L) | (((long) Float.floatToRawIntBits(IntOffset.m7063getXimpl(j))) << 32));
    }

    /* JADX INFO: renamed from: plus-oCl6YwE, reason: not valid java name */
    public static final long m7079plusoCl6YwE(long j, long j2) {
        float fM7063getXimpl = IntOffset.m7063getXimpl(j);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        return Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(IntOffset.m7064getYimpl(j) + Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fM7063getXimpl + fIntBitsToFloat) << 32));
    }

    /* JADX INFO: renamed from: minus-oCl6YwE, reason: not valid java name */
    public static final long m7077minusoCl6YwE(long j, long j2) {
        float fM7063getXimpl = IntOffset.m7063getXimpl(j);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        return Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(IntOffset.m7064getYimpl(j) - Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fM7063getXimpl - fIntBitsToFloat) << 32));
    }

    /* JADX INFO: renamed from: plus-Nv-tHpc, reason: not valid java name */
    public static final long m7078plusNvtHpc(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fM7063getXimpl = IntOffset.m7063getXimpl(j2);
        return Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + IntOffset.m7064getYimpl(j2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat + fM7063getXimpl) << 32));
    }

    /* JADX INFO: renamed from: minus-Nv-tHpc, reason: not valid java name */
    public static final long m7076minusNvtHpc(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fM7063getXimpl = IntOffset.m7063getXimpl(j2);
        return Offset.m3966constructorimpl((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - IntOffset.m7064getYimpl(j2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat - fM7063getXimpl) << 32));
    }

    /* JADX INFO: renamed from: round-k-4lQ0M, reason: not valid java name */
    public static final long m7080roundk4lQ0M(long j) {
        return IntOffset.m7057constructorimpl((((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) Math.round(Float.intBitsToFloat((int) (j >> 32)))) << 32));
    }
}
