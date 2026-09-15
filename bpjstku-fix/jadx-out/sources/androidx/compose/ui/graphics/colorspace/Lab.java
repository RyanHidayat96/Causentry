package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0010¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u001b\u0010\u000eR\u0014\u0010\u001d\u001a\u00020\u001c8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;I)V", "", "getMinValue", "(I)F", "getMaxValue", "", "toXyz", "([F)[F", "p2", "", "toXy$ui_graphics_release", "(FFF)J", "toZ$ui_graphics_release", "(FFF)F", "p3", "p4", "Landroidx/compose/ui/graphics/Color;", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "xyzaToColor", "fromXyz", "", "isWideGamut", "()Z", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Lab extends ColorSpace {
    private static final float A = 0.008856452f;
    private static final float B = 7.787037f;
    private static final float C = 0.13793103f;
    private static final float D = 0.20689656f;

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float getMaxValue(int p0) {
        return p0 == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float getMinValue(int p0) {
        return p0 == 0 ? 0.0f : -128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: isWideGamut */
    public final boolean getIsWideGamut() {
        return true;
    }

    public Lab(String str, int i) {
        super(str, ColorModel.INSTANCE.m4650getLabxdoWZVw(), i, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] toXyz(float[] p0) {
        float f = p0[0];
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 100.0f) {
            f = 100.0f;
        }
        p0[0] = f;
        float f2 = p0[1];
        if (f2 < -128.0f) {
            f2 = -128.0f;
        }
        if (f2 > 128.0f) {
            f2 = 128.0f;
        }
        p0[1] = f2;
        float f3 = p0[2];
        float f4 = f3 >= -128.0f ? f3 : -128.0f;
        float f5 = f4 <= 128.0f ? f4 : 128.0f;
        p0[2] = f5;
        float f6 = (f + 16.0f) / 116.0f;
        float f7 = (f2 * 0.002f) + f6;
        float f8 = f6 - (f5 * 0.005f);
        float f9 = f7 > D ? f7 * f7 * f7 : (f7 - C) * 0.12841855f;
        float f10 = f6 > D ? f6 * f6 * f6 : (f6 - C) * 0.12841855f;
        float f11 = f8 > D ? f8 * f8 * f8 : (f8 - C) * 0.12841855f;
        p0[0] = f9 * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[0];
        p0[1] = f10 * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[1];
        p0[2] = f11 * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
        return p0;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final long toXy$ui_graphics_release(float p0, float p1, float p2) {
        if (p0 < 0.0f) {
            p0 = 0.0f;
        }
        if (p0 > 100.0f) {
            p0 = 100.0f;
        }
        if (p1 < -128.0f) {
            p1 = -128.0f;
        }
        if (p1 > 128.0f) {
            p1 = 128.0f;
        }
        float f = (p0 + 16.0f) / 116.0f;
        float f2 = (p1 * 0.002f) + f;
        return (((long) Float.floatToRawIntBits((f > D ? f * f * f : (f - C) * 0.12841855f) * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[1])) & 4294967295L) | (((long) Float.floatToRawIntBits((f2 > D ? (f2 * f2) * f2 : (f2 - C) * 0.12841855f) * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[0])) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float toZ$ui_graphics_release(float p0, float p1, float p2) {
        if (p0 < 0.0f) {
            p0 = 0.0f;
        }
        if (p0 > 100.0f) {
            p0 = 100.0f;
        }
        if (p2 < -128.0f) {
            p2 = -128.0f;
        }
        if (p2 > 128.0f) {
            p2 = 128.0f;
        }
        float f = ((p0 + 16.0f) / 116.0f) - (p2 * 0.005f);
        return (f > D ? f * f * f : 0.12841855f * (f - C)) * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public final long mo4654xyzaToColorJlNiLsg$ui_graphics_release(float p0, float p1, float p2, float p3, ColorSpace p4) {
        float f = p0 / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[0];
        float f2 = p1 / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[1];
        float f3 = p2 / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
        float fCbrt = f > A ? (float) Math.cbrt(f) : (f * B) + C;
        float fCbrt2 = f2 > A ? (float) Math.cbrt(f2) : (f2 * B) + C;
        float f4 = (116.0f * fCbrt2) - 16.0f;
        float f5 = (fCbrt - fCbrt2) * 500.0f;
        float fCbrt3 = (fCbrt2 - (f3 > A ? (float) Math.cbrt(f3) : (f3 * B) + C)) * 200.0f;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > 100.0f) {
            f4 = 100.0f;
        }
        if (f5 < -128.0f) {
            f5 = -128.0f;
        }
        if (f5 > 128.0f) {
            f5 = 128.0f;
        }
        if (fCbrt3 < -128.0f) {
            fCbrt3 = -128.0f;
        }
        return ColorKt.Color(f4, f5, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, p3, p4);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] fromXyz(float[] p0) {
        float f = p0[0] / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[0];
        float f2 = p0[1] / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[1];
        float f3 = p0[2] / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
        float fCbrt = f > A ? (float) Math.cbrt(f) : (f * B) + C;
        float fCbrt2 = f2 > A ? (float) Math.cbrt(f2) : (f2 * B) + C;
        float f4 = (116.0f * fCbrt2) - 16.0f;
        float f5 = (fCbrt - fCbrt2) * 500.0f;
        float fCbrt3 = (fCbrt2 - (f3 > A ? (float) Math.cbrt(f3) : (f3 * B) + C)) * 200.0f;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > 100.0f) {
            f4 = 100.0f;
        }
        p0[0] = f4;
        if (f5 < -128.0f) {
            f5 = -128.0f;
        }
        if (f5 > 128.0f) {
            f5 = 128.0f;
        }
        p0[1] = f5;
        if (fCbrt3 < -128.0f) {
            fCbrt3 = -128.0f;
        }
        p0[2] = fCbrt3 <= 128.0f ? fCbrt3 : 128.0f;
        return p0;
    }
}
