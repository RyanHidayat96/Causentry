package androidx.compose.ui.graphics.colorspace;

import androidx.collection.MutableIntObjectMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\u001a'\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\n\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\t\u0010\u0007\u001a%\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u000b2\b\b\u0002\u0010\u0002\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a?\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a?\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0015\u0010\u0014\u001aO\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0013\u0010\u0018\u001aO\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0015\u0010\u0018\u001a?\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0019\u0010\u0014\u001a?\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001a\u0010\u0014\u001a!\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0001\u001a\u00020\u001b2\b\u0010\u0002\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0001\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001d\u0010\u001f\u001a\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0001\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020 H\u0000¢\u0006\u0004\b\u001d\u0010!\u001a\u0017\u0010\"\u001a\u00020 2\u0006\u0010\u0001\u001a\u00020 H\u0001¢\u0006\u0004\b\"\u0010#\u001a\u001f\u0010$\u001a\u00020 2\u0006\u0010\u0001\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020 H\u0001¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010&\u001a\u00020 2\u0006\u0010\u0001\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020 H\u0001¢\u0006\u0004\b&\u0010%\u001a0\u0010(\u001a\u00020'2\u0006\u0010\u0001\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020'2\u0006\u0010\u0004\u001a\u00020'2\u0006\u0010\u0010\u001a\u00020'H\u0080\b¢\u0006\u0004\b(\u0010)\u001a0\u0010*\u001a\u00020'2\u0006\u0010\u0001\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020'2\u0006\u0010\u0004\u001a\u00020'2\u0006\u0010\u0010\u001a\u00020'H\u0080\b¢\u0006\u0004\b*\u0010)\u001a0\u0010+\u001a\u00020'2\u0006\u0010\u0001\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020'2\u0006\u0010\u0004\u001a\u00020'2\u0006\u0010\u0010\u001a\u00020'H\u0080\b¢\u0006\u0004\b+\u0010)\u001a\u001f\u0010,\u001a\u00020 2\u0006\u0010\u0001\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020 H\u0001¢\u0006\u0004\b,\u0010%\u001a'\u0010-\u001a\u00020 2\u0006\u0010\u0001\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020 2\u0006\u0010\u0004\u001a\u00020 H\u0001¢\u0006\u0004\b-\u0010."}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "p0", "p1", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "p2", "Landroidx/compose/ui/graphics/colorspace/Connector;", "createConnector-YBCOT_4", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I)Landroidx/compose/ui/graphics/colorspace/Connector;", "createConnector", "connect-YBCOT_4", "connect", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "Landroidx/compose/ui/graphics/colorspace/Adaptation;", "adapt", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/Adaptation;)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "p3", "p4", "p5", "rcpResponse", "(DDDDDD)D", "response", "p6", "p7", "(DDDDDDDD)D", "absRcpResponse", "absResponse", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "", "compare", "(Landroidx/compose/ui/graphics/colorspace/TransferParameters;Landroidx/compose/ui/graphics/colorspace/TransferParameters;)Z", "(Landroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/WhitePoint;)Z", "", "([F[F)Z", "inverse3x3", "([F)[F", "mul3x3", "([F[F)[F", "mul3x3Float3", "", "mul3x3Float3_0", "([FFFF)F", "mul3x3Float3_1", "mul3x3Float3_2", "mul3x3Diag", "chromaticAdaptation", "([F[F[F)[F"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ColorSpaceKt {
    /* JADX INFO: renamed from: createConnector-YBCOT_4, reason: not valid java name */
    private static final Connector m4657createConnectorYBCOT_4(ColorSpace colorSpace, ColorSpace colorSpace2, int i) {
        if (colorSpace == colorSpace2) {
            return Connector.INSTANCE.identity$ui_graphics_release(colorSpace);
        }
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (ColorModel.m4644equalsimpl0(colorSpace.getModel(), ColorModel.INSTANCE.m4651getRgbxdoWZVw()) && ColorModel.m4644equalsimpl0(colorSpace2.getModel(), ColorModel.INSTANCE.m4651getRgbxdoWZVw())) {
            Intrinsics.checkNotNull(colorSpace, "");
            Intrinsics.checkNotNull(colorSpace2, "");
            return new Connector.RgbConnector((Rgb) colorSpace, (Rgb) colorSpace2, i, defaultConstructorMarker);
        }
        return new Connector(colorSpace, colorSpace2, i, defaultConstructorMarker);
    }

    /* JADX INFO: renamed from: connect-YBCOT_4$default, reason: not valid java name */
    public static /* synthetic */ Connector m4656connectYBCOT_4$default(ColorSpace colorSpace, ColorSpace colorSpace2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            colorSpace2 = ColorSpaces.INSTANCE.getSrgb();
        }
        if ((i2 & 2) != 0) {
            i = RenderIntent.INSTANCE.m4673getPerceptualuksYyKA();
        }
        return m4655connectYBCOT_4(colorSpace, colorSpace2, i);
    }

    /* JADX INFO: renamed from: connect-YBCOT_4, reason: not valid java name */
    public static final Connector m4655connectYBCOT_4(ColorSpace colorSpace, ColorSpace colorSpace2, int i) {
        int id$ui_graphics_release = colorSpace.getId();
        int id$ui_graphics_release2 = colorSpace2.getId();
        if ((id$ui_graphics_release | id$ui_graphics_release2) < 0) {
            return m4657createConnectorYBCOT_4(colorSpace, colorSpace2, i);
        }
        MutableIntObjectMap<Connector> connectors = ConnectorKt.getConnectors();
        int i2 = id$ui_graphics_release | (id$ui_graphics_release2 << 6) | (i << 12);
        Connector connectorM4657createConnectorYBCOT_4 = connectors.get(i2);
        if (connectorM4657createConnectorYBCOT_4 == null) {
            connectorM4657createConnectorYBCOT_4 = m4657createConnectorYBCOT_4(colorSpace, colorSpace2, i);
            connectors.set(i2, connectorM4657createConnectorYBCOT_4);
        }
        return connectorM4657createConnectorYBCOT_4;
    }

    public static /* synthetic */ ColorSpace adapt$default(ColorSpace colorSpace, WhitePoint whitePoint, Adaptation adaptation, int i, Object obj) {
        if ((i & 2) != 0) {
            adaptation = Adaptation.INSTANCE.getBradford();
        }
        return adapt(colorSpace, whitePoint, adaptation);
    }

    public static final ColorSpace adapt(ColorSpace colorSpace, WhitePoint whitePoint, Adaptation adaptation) {
        if (ColorModel.m4644equalsimpl0(colorSpace.getModel(), ColorModel.INSTANCE.m4651getRgbxdoWZVw())) {
            Intrinsics.checkNotNull(colorSpace, "");
            Rgb rgb = (Rgb) colorSpace;
            if (!compare(rgb.getWhitePoint(), whitePoint)) {
                return new Rgb(rgb, mul3x3(chromaticAdaptation(adaptation.getTransform(), rgb.getWhitePoint().toXyz$ui_graphics_release(), whitePoint.toXyz$ui_graphics_release()), rgb.getTransform()), whitePoint);
            }
        }
        return colorSpace;
    }

    public static final double rcpResponse(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 * d4 ? (Math.pow(d, 1.0d / d6) - d3) / d2 : d / d4;
    }

    public static final double response(double d, double d2, double d3, double d4, double d5, double d6) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d6) : d4 * d;
    }

    public static final double rcpResponse(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        if (d < d5 * d4) {
            return (d - d7) / d4;
        }
        return (Math.pow(d - d6, 1.0d / d8) - d3) / d2;
    }

    public static final double response(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        return d >= d5 ? Math.pow((d2 * d) + d3, d8) + d6 : (d4 * d) + d7;
    }

    public static final double absRcpResponse(double d, double d2, double d3, double d4, double d5, double d6) {
        return Math.copySign(rcpResponse(d < 0.0d ? -d : d, d2, d3, d4, d5, d6), d);
    }

    public static final double absResponse(double d, double d2, double d3, double d4, double d5, double d6) {
        return Math.copySign(response(d < 0.0d ? -d : d, d2, d3, d4, d5, d6), d);
    }

    public static final boolean compare(TransferParameters transferParameters, TransferParameters transferParameters2) {
        return transferParameters2 != null && Math.abs(transferParameters.getA() - transferParameters2.getA()) < 0.001d && Math.abs(transferParameters.getB() - transferParameters2.getB()) < 0.001d && Math.abs(transferParameters.getC() - transferParameters2.getC()) < 0.001d && Math.abs(transferParameters.getD() - transferParameters2.getD()) < 0.002d && Math.abs(transferParameters.getE() - transferParameters2.getE()) < 0.001d && Math.abs(transferParameters.getF() - transferParameters2.getF()) < 0.001d && Math.abs(transferParameters.getGamma() - transferParameters2.getGamma()) < 0.001d;
    }

    public static final boolean compare(WhitePoint whitePoint, WhitePoint whitePoint2) {
        if (whitePoint == whitePoint2) {
            return true;
        }
        return Math.abs(whitePoint.getX() - whitePoint2.getX()) < 0.001f && Math.abs(whitePoint.getY() - whitePoint2.getY()) < 0.001f;
    }

    public static final boolean compare(float[] fArr, float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            if (Float.compare(fArr[i], fArr2[i]) != 0 && Math.abs(fArr[i] - fArr2[i]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    public static final float[] inverse3x3(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f * f10) + (f2 * f11) + (f3 * f12);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    public static final float[] mul3x3(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length >= 9 && fArr2.length >= 9) {
            float f = fArr[0];
            float f2 = fArr2[0];
            float f3 = fArr[3];
            float f4 = fArr2[1];
            float f5 = fArr[6];
            float f6 = fArr2[2];
            fArr3[0] = (f * f2) + (f3 * f4) + (f5 * f6);
            float f7 = fArr[1];
            float f8 = fArr2[0];
            float f9 = fArr[4];
            float f10 = fArr[7];
            fArr3[1] = (f7 * f8) + (f4 * f9) + (f10 * f6);
            float f11 = fArr[2];
            float f12 = fArr[5];
            float f13 = fArr2[1];
            float f14 = fArr[8];
            fArr3[2] = (f11 * f8) + (f13 * f12) + (f6 * f14);
            float f15 = fArr[0];
            float f16 = fArr2[3];
            float f17 = fArr2[4];
            float f18 = fArr2[5];
            fArr3[3] = (f16 * f15) + (f3 * f17) + (f5 * f18);
            float f19 = fArr[1];
            float f20 = fArr2[3];
            fArr3[4] = (f19 * f20) + (f9 * f17) + (f10 * f18);
            float f21 = fArr[2];
            fArr3[5] = (f20 * f21) + (f12 * fArr2[4]) + (f18 * f14);
            float f22 = fArr2[6];
            float f23 = fArr[3];
            float f24 = fArr2[7];
            float f25 = fArr2[8];
            fArr3[6] = (f15 * f22) + (f23 * f24) + (f5 * f25);
            float f26 = fArr2[6];
            fArr3[7] = (f19 * f26) + (fArr[4] * f24) + (f10 * f25);
            fArr3[8] = (f21 * f26) + (fArr[5] * fArr2[7]) + (f14 * f25);
        }
        return fArr3;
    }

    public static final float[] mul3x3Float3(float[] fArr, float[] fArr2) {
        if (fArr.length >= 9 && fArr2.length >= 3) {
            float f = fArr2[0];
            float f2 = fArr2[1];
            float f3 = fArr2[2];
            fArr2[0] = (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
            fArr2[1] = (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
            fArr2[2] = (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
        }
        return fArr2;
    }

    public static final float mul3x3Float3_0(float[] fArr, float f, float f2, float f3) {
        return (fArr[0] * f) + (fArr[3] * f2) + (fArr[6] * f3);
    }

    public static final float mul3x3Float3_1(float[] fArr, float f, float f2, float f3) {
        return (fArr[1] * f) + (fArr[4] * f2) + (fArr[7] * f3);
    }

    public static final float mul3x3Float3_2(float[] fArr, float f, float f2, float f3) {
        return (fArr[2] * f) + (fArr[5] * f2) + (fArr[8] * f3);
    }

    public static final float[] mul3x3Diag(float[] fArr, float[] fArr2) {
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[1];
        float f4 = fArr2[1];
        float f5 = fArr[2];
        return new float[]{f2 * f, f4 * f3, fArr2[2] * f5, fArr2[3] * f, fArr2[4] * f3, fArr2[5] * f5, f * fArr2[6], f3 * fArr2[7], f5 * fArr2[8]};
    }

    public static final float[] chromaticAdaptation(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] fArrMul3x3Float3 = mul3x3Float3(fArr, fArr2);
        float[] fArrMul3x3Float4 = mul3x3Float3(fArr, fArr3);
        return mul3x3(inverse3x3(fArr), mul3x3Diag(new float[]{fArrMul3x3Float4[0] / fArrMul3x3Float3[0], fArrMul3x3Float4[1] / fArrMul3x3Float3[1], fArrMul3x3Float4[2] / fArrMul3x3Float3[2]}, fArr));
    }

    public static final ColorSpace adapt(ColorSpace colorSpace, WhitePoint whitePoint) {
        return adapt$default(colorSpace, whitePoint, null, 2, null);
    }
}
