package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a7\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\b2\b\b\u0002\u0010\u0002\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\b2\b\b\u0002\u0010\u0004\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "p0", "p1", "p2", "p3", "Landroidx/compose/ui/node/TouchBoundsExpansion;", "TouchBoundsExpansion", "(IIII)J", "Landroidx/compose/ui/unit/Dp;", "Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "DpTouchBoundsExpansion-a9UjIt4", "(FFFF)Landroidx/compose/ui/node/DpTouchBoundsExpansion;", "DpTouchBoundsExpansion"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TouchBoundsExpansionKt {
    public static /* synthetic */ long TouchBoundsExpansion$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        return TouchBoundsExpansion(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: DpTouchBoundsExpansion-a9UjIt4, reason: not valid java name */
    public static final DpTouchBoundsExpansion m6026DpTouchBoundsExpansiona9UjIt4(float f, float f2, float f3, float f4) {
        return new DpTouchBoundsExpansion(f, f2, f3, f4, true, null);
    }

    public static final long TouchBoundsExpansion(int i, int i2, int i3, int i4) {
        if (i < 0 || i >= 32768) {
            InlineClassHelperKt.throwIllegalArgumentException("Start must be in the range of 0 .. 32767");
        }
        if (i2 < 0 || i2 >= 32768) {
            InlineClassHelperKt.throwIllegalArgumentException("Top must be in the range of 0 .. 32767");
        }
        if (i3 < 0 || i3 >= 32768) {
            InlineClassHelperKt.throwIllegalArgumentException("End must be in the range of 0 .. 32767");
        }
        if (i4 < 0 || i4 >= 32768) {
            InlineClassHelperKt.throwIllegalArgumentException("Bottom must be in the range of 0 .. 32767");
        }
        return TouchBoundsExpansion.m6012constructorimpl(TouchBoundsExpansion.INSTANCE.pack$ui_release(i, i2, i3, i4, true));
    }

    /* JADX INFO: renamed from: DpTouchBoundsExpansion-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ DpTouchBoundsExpansion m6027DpTouchBoundsExpansiona9UjIt4$default(float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m6935constructorimpl(0.0f);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m6935constructorimpl(0.0f);
        }
        if ((i & 4) != 0) {
            f3 = Dp.m6935constructorimpl(0.0f);
        }
        if ((i & 8) != 0) {
            f4 = Dp.m6935constructorimpl(0.0f);
        }
        return m6026DpTouchBoundsExpansiona9UjIt4(f, f2, f3, f4);
    }
}
