package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.ColorKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b+\b\u0007\u0018\u0000 b2\u00020\u0001:\u0001bB]\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014BA\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015¢\u0006\u0004\b\u0013\u0010\u0017BY\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0018B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0019B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u001aB1\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u000f\u0012\u0006\u0010\n\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u001bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0016¢\u0006\u0004\b\u0013\u0010\u001cB)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0016¢\u0006\u0004\b\u0013\u0010\u001dBA\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0016\u0012\u0006\u0010\n\u001a\u00020\f\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u001eB!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H\u0007¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0004H\u0007¢\u0006\u0004\b#\u0010!J\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b \u0010$J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\"\u0010$J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0011H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0011H\u0016¢\u0006\u0004\b'\u0010&J'\u0010(\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\fH\u0007¢\u0006\u0004\b(\u0010)J\u0017\u0010(\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b(\u0010$J'\u0010*\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\fH\u0007¢\u0006\u0004\b*\u0010)J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¢\u0006\u0004\b*\u0010$J\u0017\u0010+\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0017¢\u0006\u0004\b+\u0010$J'\u0010-\u001a\u00020,2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\fH\u0010¢\u0006\u0004\b-\u0010.J'\u0010/\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\fH\u0010¢\u0006\u0004\b/\u00100J7\u00104\u001a\u0002012\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0001H\u0010¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0017¢\u0006\u0004\b5\u0010$J\u001a\u00108\u001a\u0002072\b\u0010\u0003\u001a\u0004\u0018\u000106H\u0096\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0011H\u0016¢\u0006\u0004\b:\u0010;R\u001a\u0010<\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010AR\u001c\u0010C\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010G\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010!R\u001a\u0010J\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\bJ\u0010H\u001a\u0004\bK\u0010!R\u001a\u0010L\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\bL\u0010H\u001a\u0004\bM\u0010!R\u001a\u0010N\u001a\u00020\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR&\u0010R\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u001a\u0010V\u001a\u00020\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bV\u0010O\u001a\u0004\bW\u0010QR\u001a\u0010X\u001a\u00020\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bX\u0010O\u001a\u0004\bY\u0010QR&\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010S\u001a\u0004\b[\u0010UR\u001a\u0010\\\u001a\u00020\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\\\u0010O\u001a\u0004\b]\u0010QR\u001a\u0010^\u001a\u0002078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b^\u0010`R\u001a\u0010a\u001a\u0002078\u0017X\u0097\u0004¢\u0006\f\n\u0004\ba\u0010_\u001a\u0004\ba\u0010`"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "p0", "", "p1", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "p2", "p3", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "p4", "p5", "", "p6", "p7", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "p8", "", "p9", "<init>", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;[FLandroidx/compose/ui/graphics/colorspace/DoubleFunction;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;FFLandroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "Lkotlin/Function1;", "", "(Ljava/lang/String;[FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FF)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "(Ljava/lang/String;[FD)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;D)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;DFFI)V", "(Landroidx/compose/ui/graphics/colorspace/Rgb;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;)V", "getPrimaries", "()[F", "getTransform", "getInverseTransform", "([F)[F", "getMinValue", "(I)F", "getMaxValue", "toLinear", "(FFF)[F", "fromLinear", "toXyz", "", "toXy$ui_graphics_release", "(FFF)J", "toZ$ui_graphics_release", "(FFF)F", "Landroidx/compose/ui/graphics/Color;", "xyzaToColor-JlNiLsg$ui_graphics_release", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "xyzaToColor", "fromXyz", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "whitePoint", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "getWhitePoint", "()Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "min", "F", "max", "transferParameters", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "getTransferParameters", "()Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "primaries", "[F", "getPrimaries$ui_graphics_release", "transform", "getTransform$ui_graphics_release", "inverseTransform", "getInverseTransform$ui_graphics_release", "oetfOrig", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "getOetfOrig$ui_graphics_release", "()Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "oetf", "Lkotlin/jvm/functions/Function1;", "getOetf", "()Lkotlin/jvm/functions/Function1;", "oetfFunc", "getOetfFunc$ui_graphics_release", "eotfOrig", "getEotfOrig$ui_graphics_release", "eotf", "getEotf", "eotfFunc", "getEotfFunc$ui_graphics_release", "isWideGamut", "Z", "()Z", "isSrgb", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Rgb extends ColorSpace {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final DoubleFunction DoubleIdentity = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda2
        @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
        public final double invoke(double d) {
            return Rgb.DoubleIdentity$lambda$8(d);
        }
    };
    private final Function1<Double, Double> eotf;
    private final DoubleFunction eotfFunc;
    private final DoubleFunction eotfOrig;
    private final float[] inverseTransform;
    private final boolean isSrgb;
    private final boolean isWideGamut;
    private final float max;
    private final float min;
    private final Function1<Double, Double> oetf;
    private final DoubleFunction oetfFunc;
    private final DoubleFunction oetfOrig;
    private final float[] primaries;
    private final TransferParameters transferParameters;
    private final float[] transform;
    private final WhitePoint whitePoint;

    /* JADX INFO: Access modifiers changed from: private */
    public static final double DoubleIdentity$lambda$8(double d) {
        return d;
    }

    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, float[] fArr2, DoubleFunction doubleFunction, DoubleFunction doubleFunction2, float f, float f2, TransferParameters transferParameters, int i) {
        super(str, ColorModel.INSTANCE.m4651getRgbxdoWZVw(), i, null);
        this.whitePoint = whitePoint;
        this.min = f;
        this.max = f2;
        this.transferParameters = transferParameters;
        this.oetfOrig = doubleFunction;
        this.oetf = new Function1<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$oetf$1
            public final Double invoke(double d) {
                return Double.valueOf(RangesKt.coerceIn(this.this$0.getOetfOrig().invoke(d), this.this$0.min, this.this$0.max));
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Double invoke(Double d) {
                return invoke(d.doubleValue());
            }

            {
                super(1);
            }
        };
        this.oetfFunc = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda0
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                return Rgb.oetfFunc$lambda$0(this.f$0, d);
            }
        };
        this.eotfOrig = doubleFunction2;
        this.eotf = new Function1<Double, Double>() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$eotf$1
            public final Double invoke(double d) {
                return Double.valueOf(this.this$0.getEotfOrig().invoke(RangesKt.coerceIn(d, this.this$0.min, this.this$0.max)));
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Double invoke(Double d) {
                return invoke(d.doubleValue());
            }

            {
                super(1);
            }
        };
        this.eotfFunc = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda1
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                return Rgb.eotfFunc$lambda$1(this.f$0, d);
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f >= f2) {
            StringBuilder sb = new StringBuilder("Invalid range: min=");
            sb.append(f);
            sb.append(", max=");
            sb.append(f2);
            sb.append("; min must be strictly < max");
            throw new IllegalArgumentException(sb.toString());
        }
        Companion companion = INSTANCE;
        float[] fArrXyPrimaries = companion.xyPrimaries(fArr);
        this.primaries = fArrXyPrimaries;
        if (fArr2 != null) {
            if (fArr2.length != 9) {
                StringBuilder sb2 = new StringBuilder("Transform must have 9 entries! Has ");
                sb2.append(fArr2.length);
                throw new IllegalArgumentException(sb2.toString());
            }
            this.transform = fArr2;
        } else {
            this.transform = companion.computeXYZMatrix(fArrXyPrimaries, whitePoint);
        }
        this.inverseTransform = ColorSpaceKt.inverse3x3(this.transform);
        this.isWideGamut = companion.isWideGamut(fArrXyPrimaries, f, f2);
        this.isSrgb = companion.isSrgb(fArrXyPrimaries, whitePoint, doubleFunction, doubleFunction2, f, f2, i);
    }

    /* JADX INFO: renamed from: getPrimaries$ui_graphics_release, reason: from getter */
    public final float[] getPrimaries() {
        return this.primaries;
    }

    /* JADX INFO: renamed from: getTransform$ui_graphics_release, reason: from getter */
    public final float[] getTransform() {
        return this.transform;
    }

    /* JADX INFO: renamed from: getInverseTransform$ui_graphics_release, reason: from getter */
    public final float[] getInverseTransform() {
        return this.inverseTransform;
    }

    /* JADX INFO: renamed from: getOetfOrig$ui_graphics_release, reason: from getter */
    public final DoubleFunction getOetfOrig() {
        return this.oetfOrig;
    }

    public final Function1<Double, Double> getOetf() {
        return this.oetf;
    }

    /* JADX INFO: renamed from: getOetfFunc$ui_graphics_release, reason: from getter */
    public final DoubleFunction getOetfFunc() {
        return this.oetfFunc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double oetfFunc$lambda$0(Rgb rgb, double d) {
        return RangesKt.coerceIn(rgb.oetfOrig.invoke(d), rgb.min, rgb.max);
    }

    /* JADX INFO: renamed from: getEotfOrig$ui_graphics_release, reason: from getter */
    public final DoubleFunction getEotfOrig() {
        return this.eotfOrig;
    }

    public final Function1<Double, Double> getEotf() {
        return this.eotf;
    }

    /* JADX INFO: renamed from: getEotfFunc$ui_graphics_release, reason: from getter */
    public final DoubleFunction getEotfFunc() {
        return this.eotfFunc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double eotfFunc$lambda$1(Rgb rgb, double d) {
        return rgb.eotfOrig.invoke(RangesKt.coerceIn(d, rgb.min, rgb.max));
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: isWideGamut, reason: from getter */
    public final boolean getIsWideGamut() {
        return this.isWideGamut;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: isSrgb, reason: from getter */
    public final boolean getIsSrgb() {
        return this.isSrgb;
    }

    public final float[] getPrimaries() {
        float[] fArr = this.primaries;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "");
        return fArrCopyOf;
    }

    public final float[] getTransform() {
        float[] fArr = this.transform;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "");
        return fArrCopyOf;
    }

    public final float[] getInverseTransform() {
        float[] fArr = this.inverseTransform;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "");
        return fArrCopyOf;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, final Function1<? super Double, Double> function1, final Function1<? super Double, Double> function2) {
        Companion companion = INSTANCE;
        this(str, companion.computePrimaries$ui_graphics_release(fArr), companion.computeWhitePoint(fArr), null, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda3
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                return Rgb._init_$lambda$2(function1, d);
            }
        }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda4
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                return Rgb._init_$lambda$3(function2, d);
            }
        }, 0.0f, 1.0f, null, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$2(Function1 function1, double d) {
        return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$3(Function1 function1, double d) {
        return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, final Function1<? super Double, Double> function1, final Function1<? super Double, Double> function2, float f, float f2) {
        this(str, fArr, whitePoint, null, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda7
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                return Rgb._init_$lambda$4(function1, d);
            }
        }, new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda8
            @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
            public final double invoke(double d) {
                return Rgb._init_$lambda$5(function2, d);
            }
        }, f, f2, null, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$4(Function1 function1, double d) {
        return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$5(Function1 function1, double d) {
        return ((Number) function1.invoke(Double.valueOf(d))).doubleValue();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, TransferParameters transferParameters) {
        Companion companion = INSTANCE;
        this(str, companion.computePrimaries$ui_graphics_release(fArr), companion.computeWhitePoint(fArr), transferParameters, -1);
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, TransferParameters transferParameters) {
        this(str, fArr, whitePoint, transferParameters, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, TransferParameters transferParameters, int i) {
        Companion companion = INSTANCE;
        this(str, fArr, whitePoint, null, companion.generateOetf(transferParameters), companion.generateEotf(transferParameters), 0.0f, 1.0f, transferParameters, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, double d) {
        Companion companion = INSTANCE;
        this(str, companion.computePrimaries$ui_graphics_release(fArr), companion.computeWhitePoint(fArr), d, 0.0f, 1.0f, -1);
    }

    public Rgb(String str, float[] fArr, WhitePoint whitePoint, double d) {
        this(str, fArr, whitePoint, d, 0.0f, 1.0f, -1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Rgb(String str, float[] fArr, WhitePoint whitePoint, final double d, float f, float f2, int i) {
        DoubleFunction doubleFunction;
        DoubleFunction doubleFunction2;
        if (d == 1.0d) {
            doubleFunction = DoubleIdentity;
        } else {
            doubleFunction = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda5
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d2) {
                    return Rgb._init_$lambda$6(d, d2);
                }
            };
        }
        DoubleFunction doubleFunction3 = doubleFunction;
        if (d == 1.0d) {
            doubleFunction2 = DoubleIdentity;
        } else {
            doubleFunction2 = new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$$ExternalSyntheticLambda6
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d2) {
                    return Rgb._init_$lambda$7(d, d2);
                }
            };
        }
        this(str, fArr, whitePoint, null, doubleFunction3, doubleFunction2, f, f2, new TransferParameters(d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$6(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, 1.0d / d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double _init_$lambda$7(double d, double d2) {
        if (d2 < 0.0d) {
            d2 = 0.0d;
        }
        return Math.pow(d2, d);
    }

    public Rgb(Rgb rgb, float[] fArr, WhitePoint whitePoint) {
        this(rgb.getName(), rgb.primaries, whitePoint, fArr, rgb.oetfOrig, rgb.eotfOrig, rgb.min, rgb.max, rgb.transferParameters, -1);
    }

    public final float[] getPrimaries(float[] p0) {
        return ArraysKt.copyInto$default(this.primaries, p0, 0, 0, 0, 14, (Object) null);
    }

    public final float[] getTransform(float[] p0) {
        return ArraysKt.copyInto$default(this.transform, p0, 0, 0, 0, 14, (Object) null);
    }

    public final float[] getInverseTransform(float[] p0) {
        return ArraysKt.copyInto$default(this.inverseTransform, p0, 0, 0, 0, 14, (Object) null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float getMinValue(int p0) {
        return this.min;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float getMaxValue(int p0) {
        return this.max;
    }

    public final float[] toLinear(float p0, float p1, float p2) {
        return toLinear(new float[]{p0, p1, p2});
    }

    public final float[] toLinear(float[] p0) {
        if (p0.length < 3) {
            return p0;
        }
        p0[0] = (float) this.eotfFunc.invoke(p0[0]);
        p0[1] = (float) this.eotfFunc.invoke(p0[1]);
        p0[2] = (float) this.eotfFunc.invoke(p0[2]);
        return p0;
    }

    public final float[] fromLinear(float p0, float p1, float p2) {
        return fromLinear(new float[]{p0, p1, p2});
    }

    public final float[] fromLinear(float[] p0) {
        if (p0.length < 3) {
            return p0;
        }
        p0[0] = (float) this.oetfFunc.invoke(p0[0]);
        p0[1] = (float) this.oetfFunc.invoke(p0[1]);
        p0[2] = (float) this.oetfFunc.invoke(p0[2]);
        return p0;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] toXyz(float[] p0) {
        if (p0.length < 3) {
            return p0;
        }
        p0[0] = (float) this.eotfFunc.invoke(p0[0]);
        p0[1] = (float) this.eotfFunc.invoke(p0[1]);
        p0[2] = (float) this.eotfFunc.invoke(p0[2]);
        return ColorSpaceKt.mul3x3Float3(this.transform, p0);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final long toXy$ui_graphics_release(float p0, float p1, float p2) {
        float fInvoke = (float) this.eotfFunc.invoke(p0);
        float fInvoke2 = (float) this.eotfFunc.invoke(p1);
        float fInvoke3 = (float) this.eotfFunc.invoke(p2);
        float[] fArr = this.transform;
        if (fArr.length < 9) {
            return 0L;
        }
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        return (((long) Float.floatToRawIntBits((fArr[1] * fInvoke) + (fArr[4] * fInvoke2) + (fArr[7] * fInvoke3))) & 4294967295L) | (((long) Float.floatToRawIntBits(((f * fInvoke) + (f2 * fInvoke2)) + (f3 * fInvoke3))) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float toZ$ui_graphics_release(float p0, float p1, float p2) {
        float fInvoke = (float) this.eotfFunc.invoke(p0);
        float fInvoke2 = (float) this.eotfFunc.invoke(p1);
        float fInvoke3 = (float) this.eotfFunc.invoke(p2);
        float[] fArr = this.transform;
        return (fArr[2] * fInvoke) + (fArr[5] * fInvoke2) + (fArr[8] * fInvoke3);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* JADX INFO: renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public final long mo4654xyzaToColorJlNiLsg$ui_graphics_release(float p0, float p1, float p2, float p3, ColorSpace p4) {
        float[] fArr = this.inverseTransform;
        return ColorKt.Color((float) this.oetfFunc.invoke((fArr[0] * p0) + (fArr[3] * p1) + (fArr[6] * p2)), (float) this.oetfFunc.invoke((fArr[1] * p0) + (fArr[4] * p1) + (fArr[7] * p2)), (float) this.oetfFunc.invoke((fArr[2] * p0) + (fArr[5] * p1) + (fArr[8] * p2)), p3, p4);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] fromXyz(float[] p0) {
        ColorSpaceKt.mul3x3Float3(this.inverseTransform, p0);
        if (p0.length < 3) {
            return p0;
        }
        p0[0] = (float) this.oetfFunc.invoke(p0[0]);
        p0[1] = (float) this.oetfFunc.invoke(p0[1]);
        p0[2] = (float) this.oetfFunc.invoke(p0[2]);
        return p0;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 == null || getClass() != p0.getClass() || !super.equals(p0)) {
            return false;
        }
        Rgb rgb = (Rgb) p0;
        if (Float.compare(rgb.min, this.min) != 0 || Float.compare(rgb.max, this.max) != 0 || !Intrinsics.areEqual(this.whitePoint, rgb.whitePoint) || !Arrays.equals(this.primaries, rgb.primaries)) {
            return false;
        }
        TransferParameters transferParameters = this.transferParameters;
        if (transferParameters != null) {
            return Intrinsics.areEqual(transferParameters, rgb.transferParameters);
        }
        if (rgb.transferParameters == null) {
            return true;
        }
        if (Intrinsics.areEqual(this.oetfOrig, rgb.oetfOrig)) {
            return Intrinsics.areEqual(this.eotfOrig, rgb.eotfOrig);
        }
        return false;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final int hashCode() {
        int iHashCode = super.hashCode();
        int iHashCode2 = this.whitePoint.hashCode();
        int iHashCode3 = Arrays.hashCode(this.primaries);
        float f = this.min;
        int iFloatToIntBits = f == 0.0f ? 0 : Float.floatToIntBits(f);
        float f2 = this.max;
        int iFloatToIntBits2 = f2 == 0.0f ? 0 : Float.floatToIntBits(f2);
        TransferParameters transferParameters = this.transferParameters;
        int iHashCode4 = (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iFloatToIntBits) * 31) + iFloatToIntBits2) * 31) + (transferParameters != null ? transferParameters.hashCode() : 0);
        if (this.transferParameters == null) {
            return (((iHashCode4 * 31) + this.oetfOrig.hashCode()) * 31) + this.eotfOrig.hashCode();
        }
        return iHashCode4;
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J0\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0082\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010\u001fJ\u001f\u0010#\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020%H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010'R\u0014\u0010)\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb$Companion;", "", "<init>", "()V", "", "p0", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "p1", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "p2", "p3", "", "p4", "p5", "", "p6", "", "isSrgb", "([FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;FFI)Z", "", "compare", "(DLandroidx/compose/ui/graphics/colorspace/DoubleFunction;Landroidx/compose/ui/graphics/colorspace/DoubleFunction;)Z", "isWideGamut", "([FFF)Z", "area", "([F)F", "cross", "(FFFF)F", "contains", "([F[F)Z", "computePrimaries$ui_graphics_release", "([F)[F", "computeWhitePoint", "([F)Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "xyPrimaries", "computeXYZMatrix", "([FLandroidx/compose/ui/graphics/colorspace/WhitePoint;)[F", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "generateOetf", "(Landroidx/compose/ui/graphics/colorspace/TransferParameters;)Landroidx/compose/ui/graphics/colorspace/DoubleFunction;", "generateEotf", "DoubleIdentity", "Landroidx/compose/ui/graphics/colorspace/DoubleFunction;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private final float cross(float p0, float p1, float p2, float p3) {
            return (p0 * p3) - (p1 * p2);
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSrgb(float[] p0, WhitePoint p1, DoubleFunction p2, DoubleFunction p3, float p4, float p5, int p6) {
            if (p6 == 0) {
                return true;
            }
            if (!ColorSpaceKt.compare(p0, ColorSpaces.INSTANCE.getSrgbPrimaries$ui_graphics_release()) || !ColorSpaceKt.compare(p1, Illuminant.INSTANCE.getD65()) || p4 != 0.0f || p5 != 1.0f) {
                return false;
            }
            Rgb srgb = ColorSpaces.INSTANCE.getSrgb();
            for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                if (!compare(d, p2, srgb.getOetfOrig()) || !compare(d, p3, srgb.getEotfOrig())) {
                    return false;
                }
            }
            return true;
        }

        private final boolean compare(double p0, DoubleFunction p1, DoubleFunction p2) {
            return Math.abs(p1.invoke(p0) - p2.invoke(p0)) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isWideGamut(float[] p0, float p1, float p2) {
            if (area(p0) / area(ColorSpaces.INSTANCE.getNtsc1953Primaries$ui_graphics_release()) <= 0.9f || !contains(p0, ColorSpaces.INSTANCE.getSrgbPrimaries$ui_graphics_release())) {
                return p1 < 0.0f && p2 > 1.0f;
            }
            return true;
        }

        private final float area(float[] p0) {
            if (p0.length < 6) {
                return 0.0f;
            }
            float f = p0[0];
            float f2 = p0[1];
            float f3 = p0[2];
            float f4 = p0[3];
            float f5 = p0[4];
            float f6 = p0[5];
            float f7 = ((((((f * f4) + (f2 * f5)) + (f3 * f6)) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
            return f7 < 0.0f ? -f7 : f7;
        }

        private final boolean contains(float[] p0, float[] p1) {
            float f = p0[0];
            float f2 = p1[0];
            float f3 = p0[1];
            float f4 = p1[1];
            float f5 = p0[2];
            float f6 = p1[2];
            float f7 = p0[3];
            float f8 = p1[3];
            float f9 = p0[4];
            float f10 = p1[4];
            float f11 = p0[5];
            float f12 = p1[5];
            float[] fArr = {f - f2, f3 - f4, f5 - f6, f7 - f8, f9 - f10, f11 - f12};
            float f13 = fArr[0];
            float f14 = fArr[1];
            if (((f4 - f12) * f13) - ((f2 - f10) * f14) >= 0.0f && ((f2 - f6) * f14) - ((f4 - f8) * f13) >= 0.0f) {
                float f15 = fArr[2];
                float f16 = fArr[3];
                if (((f8 - f4) * f15) - ((f6 - f2) * f16) >= 0.0f && ((f6 - f10) * f16) - ((f8 - f12) * f15) >= 0.0f) {
                    float f17 = fArr[4];
                    float f18 = fArr[5];
                    if (((f12 - f8) * f17) - ((f10 - f6) * f18) >= 0.0f && ((f10 - f2) * f18) - ((f12 - f4) * f17) >= 0.0f) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final float[] computePrimaries$ui_graphics_release(float[] p0) {
            float[] fArrMul3x3Float3 = ColorSpaceKt.mul3x3Float3(p0, new float[]{1.0f, 0.0f, 0.0f});
            float[] fArrMul3x3Float4 = ColorSpaceKt.mul3x3Float3(p0, new float[]{0.0f, 1.0f, 0.0f});
            float[] fArrMul3x3Float5 = ColorSpaceKt.mul3x3Float3(p0, new float[]{0.0f, 0.0f, 1.0f});
            float f = fArrMul3x3Float3[0];
            float f2 = fArrMul3x3Float3[1];
            float f3 = f + f2 + fArrMul3x3Float3[2];
            float f4 = fArrMul3x3Float4[0];
            float f5 = fArrMul3x3Float4[1];
            float f6 = f4 + f5 + fArrMul3x3Float4[2];
            float f7 = fArrMul3x3Float5[0];
            float f8 = fArrMul3x3Float5[1];
            float f9 = f7 + f8 + fArrMul3x3Float5[2];
            return new float[]{f / f3, f2 / f3, f4 / f6, f5 / f6, f7 / f9, f8 / f9};
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WhitePoint computeWhitePoint(float[] p0) {
            float[] fArrMul3x3Float3 = ColorSpaceKt.mul3x3Float3(p0, new float[]{1.0f, 1.0f, 1.0f});
            float f = fArrMul3x3Float3[0];
            float f2 = fArrMul3x3Float3[1];
            float f3 = f + f2 + fArrMul3x3Float3[2];
            return new WhitePoint(f / f3, f2 / f3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] xyPrimaries(float[] p0) {
            float[] fArr = new float[6];
            if (p0.length == 9) {
                float f = p0[0];
                float f2 = p0[1];
                float f3 = f + f2 + p0[2];
                fArr[0] = f / f3;
                fArr[1] = f2 / f3;
                float f4 = p0[3];
                float f5 = p0[4];
                float f6 = f4 + f5 + p0[5];
                fArr[2] = f4 / f6;
                fArr[3] = f5 / f6;
                float f7 = p0[6];
                float f8 = p0[7];
                float f9 = f7 + f8 + p0[8];
                fArr[4] = f7 / f9;
                fArr[5] = f8 / f9;
                return fArr;
            }
            ArraysKt.copyInto$default(p0, fArr, 0, 0, 6, 6, (Object) null);
            return fArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] computeXYZMatrix(float[] p0, WhitePoint p1) {
            float f = p0[0];
            float f2 = p0[1];
            float f3 = p0[2];
            float f4 = p0[3];
            float f5 = p0[4];
            float f6 = p0[5];
            float x = p1.getX();
            float y = p1.getY();
            float f7 = 1.0f - f;
            float f8 = f7 / f2;
            float f9 = 1.0f - f3;
            float f10 = 1.0f - f5;
            float f11 = (1.0f - x) / y;
            float f12 = f / f2;
            float f13 = (f3 / f4) - f12;
            float f14 = (x / y) - f12;
            float f15 = (f9 / f4) - f8;
            float f16 = (f5 / f6) - f12;
            float f17 = (((f11 - f8) * f13) - (f14 * f15)) / ((((f10 / f6) - f8) * f13) - (f15 * f16));
            float f18 = (f14 - (f16 * f17)) / f13;
            float f19 = (1.0f - f18) - f17;
            float f20 = f19 / f2;
            float f21 = f18 / f4;
            float f22 = f17 / f6;
            return new float[]{f * f20, f19, f20 * (f7 - f2), f3 * f21, f18, f21 * (f9 - f4), f5 * f22, f17, f22 * (f10 - f6)};
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DoubleFunction generateOetf(final TransferParameters p0) {
            if (p0.isHLGish$ui_graphics_release()) {
                return new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda4
                    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                    public final double invoke(double d) {
                        return Rgb.Companion.generateOetf$lambda$0(p0, d);
                    }
                };
            }
            if (p0.isPQish$ui_graphics_release()) {
                return new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda5
                    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                    public final double invoke(double d) {
                        return Rgb.Companion.generateOetf$lambda$1(p0, d);
                    }
                };
            }
            if (p0.getE() == 0.0d && p0.getF() == 0.0d) {
                return new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda6
                    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                    public final double invoke(double d) {
                        return Rgb.Companion.generateOetf$lambda$2(p0, d);
                    }
                };
            }
            return new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda7
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d) {
                    return Rgb.Companion.generateOetf$lambda$3(p0, d);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$0(TransferParameters transferParameters, double d) {
            return ColorSpaces.INSTANCE.transferHlgOetf$ui_graphics_release(transferParameters, d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$1(TransferParameters transferParameters, double d) {
            return ColorSpaces.INSTANCE.transferSt2048Oetf$ui_graphics_release(transferParameters, d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$2(TransferParameters transferParameters, double d) {
            return ColorSpaceKt.rcpResponse(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateOetf$lambda$3(TransferParameters transferParameters, double d) {
            return ColorSpaceKt.rcpResponse(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DoubleFunction generateEotf(final TransferParameters p0) {
            if (p0.isHLGish$ui_graphics_release()) {
                return new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda0
                    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                    public final double invoke(double d) {
                        return Rgb.Companion.generateEotf$lambda$4(p0, d);
                    }
                };
            }
            if (p0.isPQish$ui_graphics_release()) {
                return new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda1
                    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                    public final double invoke(double d) {
                        return Rgb.Companion.generateEotf$lambda$5(p0, d);
                    }
                };
            }
            if (p0.getE() == 0.0d && p0.getF() == 0.0d) {
                return new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda2
                    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                    public final double invoke(double d) {
                        return Rgb.Companion.generateEotf$lambda$6(p0, d);
                    }
                };
            }
            return new DoubleFunction() { // from class: androidx.compose.ui.graphics.colorspace.Rgb$Companion$$ExternalSyntheticLambda3
                @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
                public final double invoke(double d) {
                    return Rgb.Companion.generateEotf$lambda$7(p0, d);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$4(TransferParameters transferParameters, double d) {
            return ColorSpaces.INSTANCE.transferHlgEotf$ui_graphics_release(transferParameters, d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$5(TransferParameters transferParameters, double d) {
            return ColorSpaces.INSTANCE.transferSt2048Eotf$ui_graphics_release(transferParameters, d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$6(TransferParameters transferParameters, double d) {
            return ColorSpaceKt.response(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final double generateEotf$lambda$7(TransferParameters transferParameters, double d) {
            return ColorSpaceKt.response(d, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
