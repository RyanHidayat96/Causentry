package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0010¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u001b\u0010\u000eJ\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0082\b¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Xyz;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;I)V", "", "getMinValue", "(I)F", "getMaxValue", "", "toXyz", "([F)[F", "p2", "", "toXy$ui_graphics_release", "(FFF)J", "toZ$ui_graphics_release", "(FFF)F", "p3", "p4", "Landroidx/compose/ui/graphics/Color;", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "xyzaToColor", "fromXyz", "clamp", "(F)F", "", "isWideGamut", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Xyz extends ColorSpace {
    private final float clamp(float p0) {
        if (p0 < -2.0f) {
            p0 = -2.0f;
        }
        if (p0 > 2.0f) {
            return 2.0f;
        }
        return p0;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float getMaxValue(int p0) {
        return 2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float getMinValue(int p0) {
        return -2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: isWideGamut */
    public final boolean getIsWideGamut() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float toZ$ui_graphics_release(float p0, float p1, float p2) {
        if (p2 < -2.0f) {
            p2 = -2.0f;
        }
        if (p2 > 2.0f) {
            return 2.0f;
        }
        return p2;
    }

    public Xyz(String str, int i) {
        super(str, ColorModel.INSTANCE.m4652getXyzxdoWZVw(), i, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] toXyz(float[] p0) {
        float f = p0[0];
        if (f < -2.0f) {
            f = -2.0f;
        }
        if (f > 2.0f) {
            f = 2.0f;
        }
        p0[0] = f;
        float f2 = p0[1];
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        p0[1] = f2;
        float f3 = p0[2];
        float f4 = f3 >= -2.0f ? f3 : -2.0f;
        p0[2] = f4 <= 2.0f ? f4 : 2.0f;
        return p0;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public final long mo4654xyzaToColorJlNiLsg$ui_graphics_release(float p0, float p1, float p2, float p3, ColorSpace p4) {
        if (p0 < -2.0f) {
            p0 = -2.0f;
        }
        if (p0 > 2.0f) {
            p0 = 2.0f;
        }
        if (p1 < -2.0f) {
            p1 = -2.0f;
        }
        if (p1 > 2.0f) {
            p1 = 2.0f;
        }
        if (p2 < -2.0f) {
            p2 = -2.0f;
        }
        return ColorKt.Color(p0, p1, p2 <= 2.0f ? p2 : 2.0f, p3, p4);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] fromXyz(float[] p0) {
        float f = p0[0];
        if (f < -2.0f) {
            f = -2.0f;
        }
        if (f > 2.0f) {
            f = 2.0f;
        }
        p0[0] = f;
        float f2 = p0[1];
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        p0[1] = f2;
        float f3 = p0[2];
        float f4 = f3 >= -2.0f ? f3 : -2.0f;
        p0[2] = f4 <= 2.0f ? f4 : 2.0f;
        return p0;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final long toXy$ui_graphics_release(float p0, float p1, float p2) {
        if (p0 < -2.0f) {
            p0 = -2.0f;
        }
        if (p0 > 2.0f) {
            p0 = 2.0f;
        }
        if (p1 < -2.0f) {
            p1 = -2.0f;
        }
        return (((long) Float.floatToRawIntBits(p0)) << 32) | (((long) Float.floatToRawIntBits(p1 <= 2.0f ? p1 : 2.0f)) & 4294967295L);
    }
}
