package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0010¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0010¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0017¢\u0006\u0004\b\u001b\u0010\u000eR\u0014\u0010\u001d\u001a\u00020\u001c8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Oklab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;I)V", "", "getMinValue", "(I)F", "getMaxValue", "", "toXyz", "([F)[F", "p2", "", "toXy$ui_graphics_release", "(FFF)J", "toZ$ui_graphics_release", "(FFF)F", "p3", "p4", "Landroidx/compose/ui/graphics/Color;", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "xyzaToColor", "fromXyz", "", "isWideGamut", "()Z", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Oklab extends ColorSpace {
    private static final float[] InverseM1;
    private static final float[] InverseM2;
    private static final float[] M1;
    private static final float[] M2;

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float getMaxValue(int p0) {
        return p0 == 0 ? 1.0f : 0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float getMinValue(int p0) {
        return p0 == 0 ? 0.0f : -0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: isWideGamut */
    public final boolean getIsWideGamut() {
        return true;
    }

    public Oklab(String str, int i) {
        super(str, ColorModel.INSTANCE.m4650getLabxdoWZVw(), i, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] toXyz(float[] p0) {
        float f = p0[0];
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        p0[0] = f;
        float f2 = p0[1];
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        p0[1] = f2;
        float f3 = p0[2];
        float f4 = f3 >= -0.5f ? f3 : -0.5f;
        p0[2] = f4 <= 0.5f ? f4 : 0.5f;
        ColorSpaceKt.mul3x3Float3(InverseM2, p0);
        float f5 = p0[0];
        p0[0] = f5 * f5 * f5;
        float f6 = p0[1];
        p0[1] = f6 * f6 * f6;
        float f7 = p0[2];
        p0[2] = f7 * f7 * f7;
        ColorSpaceKt.mul3x3Float3(InverseM1, p0);
        return p0;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final long toXy$ui_graphics_release(float p0, float p1, float p2) {
        if (p0 < 0.0f) {
            p0 = 0.0f;
        }
        if (p0 > 1.0f) {
            p0 = 1.0f;
        }
        if (p1 < -0.5f) {
            p1 = -0.5f;
        }
        if (p1 > 0.5f) {
            p1 = 0.5f;
        }
        if (p2 < -0.5f) {
            p2 = -0.5f;
        }
        float f = p2 <= 0.5f ? p2 : 0.5f;
        float[] fArr = InverseM2;
        float f2 = (fArr[0] * p0) + (fArr[3] * p1) + (fArr[6] * f);
        float f3 = (fArr[1] * p0) + (fArr[4] * p1) + (fArr[7] * f);
        float f4 = (fArr[2] * p0) + (fArr[5] * p1) + (fArr[8] * f);
        float f5 = f2 * f2 * f2;
        float f6 = f3 * f3 * f3;
        float f7 = f4 * f4 * f4;
        float[] fArr2 = InverseM1;
        return (((long) Float.floatToRawIntBits((fArr2[1] * f5) + (fArr2[4] * f6) + (fArr2[7] * f7))) & 4294967295L) | (((long) Float.floatToRawIntBits(((fArr2[0] * f5) + (fArr2[3] * f6)) + (fArr2[6] * f7))) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float toZ$ui_graphics_release(float p0, float p1, float p2) {
        if (p0 < 0.0f) {
            p0 = 0.0f;
        }
        if (p0 > 1.0f) {
            p0 = 1.0f;
        }
        if (p1 < -0.5f) {
            p1 = -0.5f;
        }
        if (p1 > 0.5f) {
            p1 = 0.5f;
        }
        if (p2 < -0.5f) {
            p2 = -0.5f;
        }
        float f = p2 <= 0.5f ? p2 : 0.5f;
        float[] fArr = InverseM2;
        float f2 = (fArr[0] * p0) + (fArr[3] * p1) + (fArr[6] * f);
        float f3 = (fArr[1] * p0) + (fArr[4] * p1) + (fArr[7] * f);
        float f4 = (fArr[2] * p0) + (fArr[5] * p1) + (fArr[8] * f);
        float[] fArr2 = InverseM1;
        return (fArr2[2] * f2 * f2 * f2) + (fArr2[5] * f3 * f3 * f3) + (fArr2[8] * f4 * f4 * f4);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public final long mo4654xyzaToColorJlNiLsg$ui_graphics_release(float p0, float p1, float p2, float p3, ColorSpace p4) {
        float[] fArr = M1;
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float fFastCbrt = MathHelpersKt.fastCbrt((f * p0) + (f2 * p1) + (f3 * p2));
        float fFastCbrt2 = MathHelpersKt.fastCbrt((f4 * p0) + (f5 * p1) + (f6 * p2));
        float fFastCbrt3 = MathHelpersKt.fastCbrt((f7 * p0) + (f8 * p1) + (f9 * p2));
        float[] fArr2 = M2;
        return ColorKt.Color((fArr2[0] * fFastCbrt) + (fArr2[3] * fFastCbrt2) + (fArr2[6] * fFastCbrt3), (fArr2[1] * fFastCbrt) + (fArr2[4] * fFastCbrt2) + (fArr2[7] * fFastCbrt3), (fArr2[2] * fFastCbrt) + (fArr2[5] * fFastCbrt2) + (fArr2[8] * fFastCbrt3), p3, p4);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] fromXyz(float[] p0) {
        ColorSpaceKt.mul3x3Float3(M1, p0);
        p0[0] = MathHelpersKt.fastCbrt(p0[0]);
        p0[1] = MathHelpersKt.fastCbrt(p0[1]);
        p0[2] = MathHelpersKt.fastCbrt(p0[2]);
        ColorSpaceKt.mul3x3Float3(M2, p0);
        return p0;
    }

    static {
        float[] fArrMul3x3 = ColorSpaceKt.mul3x3(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, ColorSpaceKt.chromaticAdaptation(Adaptation.INSTANCE.getBradford().getTransform(), Illuminant.INSTANCE.getD50().toXyz$ui_graphics_release(), Illuminant.INSTANCE.getD65().toXyz$ui_graphics_release()));
        M1 = fArrMul3x3;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        M2 = fArr;
        InverseM1 = ColorSpaceKt.inverse3x3(fArrMul3x3);
        InverseM2 = ColorSpaceKt.inverse3x3(fArr);
    }
}
