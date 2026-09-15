package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0003H\u0087\n¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\f\u001a\u00020\t*\u00020\u0003H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u0010\u001a\u00020\r*\u00020\u0003H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0003*\u00020\rH\u0007¢\u0006\u0004\b\u0011\u0010\u000f\u001a\u0013\u0010\u0014\u001a\u00020\u0003*\u00020\rH\u0007¢\u0006\u0004\b\u0013\u0010\u000f\"\u001e\u0010\u0019\u001a\u00020\u0015*\u00020\u00038GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u000f"}, d2 = {"", "p0", "p1", "Landroidx/compose/ui/unit/IntSize;", "IntSize", "(II)J", "times-O0kMr_c", "(IJ)J", "times", "Landroidx/compose/ui/unit/IntRect;", "toIntRect-ozmzZPI", "(J)Landroidx/compose/ui/unit/IntRect;", "toIntRect", "Landroidx/compose/ui/geometry/Size;", "toSize-ozmzZPI", "(J)J", "toSize", "toIntSize-uvyYCjk", "toIntSize", "roundToIntSize-uvyYCjk", "roundToIntSize", "Landroidx/compose/ui/unit/IntOffset;", "getCenter-ozmzZPI", "getCenter-ozmzZPI$annotations", "(J)V", "center"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class IntSizeKt {
    /* JADX INFO: renamed from: getCenter-ozmzZPI$annotations, reason: not valid java name */
    public static /* synthetic */ void m7113getCenterozmzZPI$annotations(long j) {
    }

    public static final long IntSize(int i, int i2) {
        return IntSize.m7101constructorimpl((((long) i2) & 4294967295L) | (((long) i) << 32));
    }

    /* JADX INFO: renamed from: times-O0kMr_c, reason: not valid java name */
    public static final long m7115timesO0kMr_c(int i, long j) {
        return IntSize.m7108timesYEO4UFw(j, i);
    }

    /* JADX INFO: renamed from: toIntRect-ozmzZPI, reason: not valid java name */
    public static final IntRect m7116toIntRectozmzZPI(long j) {
        return IntRectKt.m7096IntRectVbeCjmY(IntOffset.INSTANCE.m7074getZeronOccac(), j);
    }

    /* JADX INFO: renamed from: getCenter-ozmzZPI, reason: not valid java name */
    public static final long m7112getCenterozmzZPI(long j) {
        return IntOffset.m7057constructorimpl(((j >> 33) << 32) | (((j << 32) >> 33) & 4294967295L));
    }

    /* JADX INFO: renamed from: toSize-ozmzZPI, reason: not valid java name */
    public static final long m7118toSizeozmzZPI(long j) {
        return Size.m4034constructorimpl((((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32));
    }

    /* JADX INFO: renamed from: toIntSize-uvyYCjk, reason: not valid java name */
    public static final long m7117toIntSizeuvyYCjk(long j) {
        return IntSize.m7101constructorimpl((((long) ((int) Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) ((int) Float.intBitsToFloat((int) (j >> 32)))) << 32));
    }

    /* JADX INFO: renamed from: roundToIntSize-uvyYCjk, reason: not valid java name */
    public static final long m7114roundToIntSizeuvyYCjk(long j) {
        return IntSize.m7101constructorimpl((((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) Math.round(Float.intBitsToFloat((int) (j >> 32)))) << 32));
    }
}
