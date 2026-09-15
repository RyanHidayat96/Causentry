package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0017\u0018\u0000 #2\u00020\u0001:\u0002$#B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\rJ'\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000f\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0017R\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u001a\u0010\u001e\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\""}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector;", "", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "p0", "p1", "p2", "p3", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "p4", "", "p5", "<init>", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I[FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "transform", "(FFF)[F", "([F)[F", "Landroidx/compose/ui/graphics/Color;", "transformToColor-l2rxGTc$ui_graphics_release", "(J)J", "transformToColor", "source", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getSource", "()Landroidx/compose/ui/graphics/colorspace/ColorSpace;", FirebaseAnalytics.Param.DESTINATION, "getDestination", "transformSource", "transformDestination", "renderIntent", "I", "getRenderIntent-uksYyKA", "()I", "[F", "Companion", "RgbConnector"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class Connector {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ColorSpace destination;
    private final int renderIntent;
    private final ColorSpace source;
    private final float[] transform;
    private final ColorSpace transformDestination;
    private final ColorSpace transformSource;

    private Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, ColorSpace colorSpace4, int i, float[] fArr) {
        this.source = colorSpace;
        this.destination = colorSpace2;
        this.transformSource = colorSpace3;
        this.transformDestination = colorSpace4;
        this.renderIntent = i;
        this.transform = fArr;
    }

    public final ColorSpace getSource() {
        return this.source;
    }

    public final ColorSpace getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: getRenderIntent-uksYyKA, reason: not valid java name and from getter */
    public final int getRenderIntent() {
        return this.renderIntent;
    }

    private Connector(ColorSpace colorSpace, ColorSpace colorSpace2, int i) {
        this(colorSpace, colorSpace2, ColorModel.m4644equalsimpl0(colorSpace.getModel(), ColorModel.INSTANCE.m4651getRgbxdoWZVw()) ? ColorSpaceKt.adapt$default(colorSpace, Illuminant.INSTANCE.getD50(), null, 2, null) : colorSpace, ColorModel.m4644equalsimpl0(colorSpace2.getModel(), ColorModel.INSTANCE.m4651getRgbxdoWZVw()) ? ColorSpaceKt.adapt$default(colorSpace2, Illuminant.INSTANCE.getD50(), null, 2, null) : colorSpace2, i, INSTANCE.m4662computeTransformYBCOT_4(colorSpace, colorSpace2, i), null);
    }

    public final float[] transform(float p0, float p1, float p2) {
        return transform(new float[]{p0, p1, p2});
    }

    public float[] transform(float[] p0) {
        float[] xyz = this.transformSource.toXyz(p0);
        float[] fArr = this.transform;
        if (fArr != null) {
            xyz[0] = xyz[0] * fArr[0];
            xyz[1] = xyz[1] * fArr[1];
            xyz[2] = xyz[2] * fArr[2];
        }
        return this.transformDestination.fromXyz(xyz);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\tH\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0010¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$RgbConnector;", "Landroidx/compose/ui/graphics/colorspace/Connector;", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "p0", "p1", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "p2", "<init>", "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "transform", "([F)[F", "Landroidx/compose/ui/graphics/Color;", "transformToColor-l2rxGTc$ui_graphics_release", "(J)J", "transformToColor", "computeTransform-YBCOT_4", "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;I)[F", "computeTransform", "mSource", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "mDestination", "mTransform", "[F"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RgbConnector extends Connector {
        private final Rgb mDestination;
        private final Rgb mSource;
        private final float[] mTransform;

        /* JADX WARN: Illegal instructions before constructor call */
        private RgbConnector(Rgb rgb, Rgb rgb2, int i) {
            Rgb rgb3 = rgb;
            Rgb rgb4 = rgb2;
            super(rgb3, rgb4, rgb3, rgb4, i, null, null);
            this.mSource = rgb;
            this.mDestination = rgb2;
            this.mTransform = m4663computeTransformYBCOT_4(rgb, rgb2, i);
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        public final float[] transform(float[] p0) {
            p0[0] = (float) this.mSource.getEotfFunc().invoke(p0[0]);
            p0[1] = (float) this.mSource.getEotfFunc().invoke(p0[1]);
            p0[2] = (float) this.mSource.getEotfFunc().invoke(p0[2]);
            ColorSpaceKt.mul3x3Float3(this.mTransform, p0);
            p0[0] = (float) this.mDestination.getOetfFunc().invoke(p0[0]);
            p0[1] = (float) this.mDestination.getOetfFunc().invoke(p0[1]);
            p0[2] = (float) this.mDestination.getOetfFunc().invoke(p0[2]);
            return p0;
        }

        /* JADX INFO: renamed from: computeTransform-YBCOT_4, reason: not valid java name */
        private final float[] m4663computeTransformYBCOT_4(Rgb p0, Rgb p1, int p2) {
            if (ColorSpaceKt.compare(p0.getWhitePoint(), p1.getWhitePoint())) {
                return ColorSpaceKt.mul3x3(p1.getInverseTransform(), p0.getTransform());
            }
            float[] transform = p0.getTransform();
            float[] inverseTransform = p1.getInverseTransform();
            float[] xyz$ui_graphics_release = p0.getWhitePoint().toXyz$ui_graphics_release();
            float[] xyz$ui_graphics_release2 = p1.getWhitePoint().toXyz$ui_graphics_release();
            if (!ColorSpaceKt.compare(p0.getWhitePoint(), Illuminant.INSTANCE.getD50())) {
                transform = ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(Adaptation.INSTANCE.getBradford().getTransform(), xyz$ui_graphics_release, Illuminant.INSTANCE.newD50Xyz$ui_graphics_release()), p0.getTransform());
            }
            if (!ColorSpaceKt.compare(p1.getWhitePoint(), Illuminant.INSTANCE.getD50())) {
                inverseTransform = ColorSpaceKt.inverse3x3(ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(Adaptation.INSTANCE.getBradford().getTransform(), xyz$ui_graphics_release2, Illuminant.INSTANCE.newD50Xyz$ui_graphics_release()), p1.getTransform()));
            }
            if (RenderIntent.m4668equalsimpl0(p2, RenderIntent.INSTANCE.m4672getAbsoluteuksYyKA())) {
                transform = ColorSpaceKt.mul3x3Diag(new float[]{xyz$ui_graphics_release[0] / xyz$ui_graphics_release2[0], xyz$ui_graphics_release[1] / xyz$ui_graphics_release2[1], xyz$ui_graphics_release[2] / xyz$ui_graphics_release2[2]}, transform);
            }
            return ColorSpaceKt.mul3x3(inverseTransform, transform);
        }

        @Override // androidx.compose.ui.graphics.colorspace.Connector
        /* JADX INFO: renamed from: transformToColor-l2rxGTc$ui_graphics_release */
        public final long mo4660transformToColorl2rxGTc$ui_graphics_release(long p0) {
            float fM4224getRedimpl = Color.m4224getRedimpl(p0);
            float fM4223getGreenimpl = Color.m4223getGreenimpl(p0);
            float fM4221getBlueimpl = Color.m4221getBlueimpl(p0);
            float fM4220getAlphaimpl = Color.m4220getAlphaimpl(p0);
            float fInvoke = (float) this.mSource.getEotfFunc().invoke(fM4224getRedimpl);
            float fInvoke2 = (float) this.mSource.getEotfFunc().invoke(fM4223getGreenimpl);
            float fInvoke3 = (float) this.mSource.getEotfFunc().invoke(fM4221getBlueimpl);
            float[] fArr = this.mTransform;
            return ColorKt.Color((float) this.mDestination.getOetfFunc().invoke((fArr[0] * fInvoke) + (fArr[3] * fInvoke2) + (fArr[6] * fInvoke3)), (float) this.mDestination.getOetfFunc().invoke((fArr[1] * fInvoke) + (fArr[4] * fInvoke2) + (fArr[7] * fInvoke3)), (float) this.mDestination.getOetfFunc().invoke((fArr[2] * fInvoke) + (fArr[5] * fInvoke2) + (fArr[8] * fInvoke3)), fM4220getAlphaimpl, this.mDestination);
        }

        public /* synthetic */ RgbConnector(Rgb rgb, Rgb rgb2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(rgb, rgb2, i);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "p0", "p1", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "p2", "", "computeTransform-YBCOT_4", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I)[F", "computeTransform", "Landroidx/compose/ui/graphics/colorspace/Connector;", "identity$ui_graphics_release", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/colorspace/Connector;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: computeTransform-YBCOT_4, reason: not valid java name */
        public final float[] m4662computeTransformYBCOT_4(ColorSpace p0, ColorSpace p1, int p2) {
            if (!RenderIntent.m4668equalsimpl0(p2, RenderIntent.INSTANCE.m4672getAbsoluteuksYyKA())) {
                return null;
            }
            boolean zM4644equalsimpl0 = ColorModel.m4644equalsimpl0(p0.getModel(), ColorModel.INSTANCE.m4651getRgbxdoWZVw());
            boolean zM4644equalsimpl1 = ColorModel.m4644equalsimpl0(p1.getModel(), ColorModel.INSTANCE.m4651getRgbxdoWZVw());
            if (zM4644equalsimpl0 && zM4644equalsimpl1) {
                return null;
            }
            if (!zM4644equalsimpl0 && !zM4644equalsimpl1) {
                return null;
            }
            if (!zM4644equalsimpl0) {
                p0 = p1;
            }
            Intrinsics.checkNotNull(p0, "");
            Rgb rgb = (Rgb) p0;
            float[] xyz$ui_graphics_release = zM4644equalsimpl0 ? rgb.getWhitePoint().toXyz$ui_graphics_release() : Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
            float[] xyz$ui_graphics_release2 = zM4644equalsimpl1 ? rgb.getWhitePoint().toXyz$ui_graphics_release() : Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
            return new float[]{xyz$ui_graphics_release[0] / xyz$ui_graphics_release2[0], xyz$ui_graphics_release[1] / xyz$ui_graphics_release2[1], xyz$ui_graphics_release[2] / xyz$ui_graphics_release2[2]};
        }

        public final Connector identity$ui_graphics_release(final ColorSpace p0) {
            final int iM4674getRelativeuksYyKA = RenderIntent.INSTANCE.m4674getRelativeuksYyKA();
            return new Connector(p0, iM4674getRelativeuksYyKA) { // from class: androidx.compose.ui.graphics.colorspace.Connector$Companion$identity$1
                @Override // androidx.compose.ui.graphics.colorspace.Connector
                public final float[] transform(float[] p1) {
                    return p1;
                }

                @Override // androidx.compose.ui.graphics.colorspace.Connector
                /* JADX INFO: renamed from: transformToColor-l2rxGTc$ui_graphics_release */
                public final long mo4660transformToColorl2rxGTc$ui_graphics_release(long p1) {
                    return p1;
                }

                {
                    super(p0, p0, iM4674getRelativeuksYyKA, null);
                }
            };
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: transformToColor-l2rxGTc$ui_graphics_release, reason: not valid java name */
    public long mo4660transformToColorl2rxGTc$ui_graphics_release(long p0) {
        float fM4224getRedimpl = Color.m4224getRedimpl(p0);
        float fM4223getGreenimpl = Color.m4223getGreenimpl(p0);
        float fM4221getBlueimpl = Color.m4221getBlueimpl(p0);
        float fM4220getAlphaimpl = Color.m4220getAlphaimpl(p0);
        long xy$ui_graphics_release = this.transformSource.toXy$ui_graphics_release(fM4224getRedimpl, fM4223getGreenimpl, fM4221getBlueimpl);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (xy$ui_graphics_release >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (xy$ui_graphics_release & 4294967295L));
        float z$ui_graphics_release = this.transformSource.toZ$ui_graphics_release(fM4224getRedimpl, fM4223getGreenimpl, fM4221getBlueimpl);
        float[] fArr = this.transform;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            z$ui_graphics_release *= fArr[2];
        }
        float f = fIntBitsToFloat;
        return this.transformDestination.mo4654xyzaToColorJlNiLsg$ui_graphics_release(f, fIntBitsToFloat2, z$ui_graphics_release, fM4220getAlphaimpl, this.destination);
    }

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(colorSpace, colorSpace2, i);
    }

    public /* synthetic */ Connector(ColorSpace colorSpace, ColorSpace colorSpace2, ColorSpace colorSpace3, ColorSpace colorSpace4, int i, float[] fArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(colorSpace, colorSpace2, colorSpace3, colorSpace4, i, fArr);
    }
}
