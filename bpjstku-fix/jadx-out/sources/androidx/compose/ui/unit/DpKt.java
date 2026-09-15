package androidx.compose.ui.unit;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\f\u001a\"\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001c\u0010\t\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0007\u0010\b\u001a\u001c\u0010\t\u001a\u00020\u0000*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0007\u0010\u000b\u001a\u001c\u0010\t\u001a\u00020\u0000*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\n¢\u0006\u0004\b\u0007\u0010\r\u001a \u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u000f\u0010\b\u001a \u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0011\u0010\b\u001a$\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001c\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0016\u0010\b\u001a\u001c\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0018\u0010\b\u001a'\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001b\u0010\u0014\u001a \u0010 \u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a\"\u0010\u0005\u001a\u00020\u001d*\u00020\u001d2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0001H\u0086\b¢\u0006\u0004\b!\u0010\"\u001a'\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0006H\u0007¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010'\u001a\u00020%2\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0007¢\u0006\u0004\b&\u0010\u001f\u001a\"\u0010\u0005\u001a\u00020%*\u00020%2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020%0\u0001H\u0086\b¢\u0006\u0004\b(\u0010\"\u001a\u001c\u0010\t\u001a\u00020%*\u00020\f2\u0006\u0010\u0002\u001a\u00020%H\u0087\n¢\u0006\u0004\b)\u0010*\u001a\u001c\u0010\t\u001a\u00020%*\u00020\u00062\u0006\u0010\u0002\u001a\u00020%H\u0087\n¢\u0006\u0004\b)\u0010+\u001a'\u0010\u001c\u001a\u00020%2\u0006\u0010\u0002\u001a\u00020%2\u0006\u0010\u000e\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\u0006H\u0007¢\u0006\u0004\b,\u0010$\"\u001f\u00102\u001a\u00020-*\u00020\u00008Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/\"\u001f\u00105\u001a\u00020-*\u00020\u00008Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b4\u00101\u001a\u0004\b3\u0010/\"\u001f\u0010:\u001a\u00020\u0000*\u00020\f8Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b8\u00109\u001a\u0004\b6\u00107\"\u001f\u0010:\u001a\u00020\u0000*\u00020\n8Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b8\u0010<\u001a\u0004\b6\u0010;\"\u001f\u0010:\u001a\u00020\u0000*\u00020\u00068Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b8\u00101\u001a\u0004\b6\u0010=\"\u001f\u0010@\u001a\u00020-*\u00020\u00008Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b?\u00101\u001a\u0004\b>\u0010/\"\u001f\u00102\u001a\u00020-*\u00020\u001d8Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bC\u0010D\u001a\u0004\bA\u0010B\"\u001f\u00105\u001a\u00020-*\u00020\u001d8Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bF\u0010D\u001a\u0004\bE\u0010B\"\u001f\u00102\u001a\u00020-*\u00020%8Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bH\u0010D\u001a\u0004\bG\u0010B\"\u001f\u00105\u001a\u00020-*\u00020%8Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bJ\u0010D\u001a\u0004\bI\u0010B\"\u001e\u0010N\u001a\u00020\u001d*\u00020%8GX\u0087\u0004¢\u0006\f\u0012\u0004\bM\u0010D\u001a\u0004\bK\u0010L\"\u001f\u0010T\u001a\u00020\u0000*\u00020O8Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bR\u0010S\u001a\u0004\bP\u0010Q\"\u001f\u0010W\u001a\u00020\u0000*\u00020O8Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bV\u0010S\u001a\u0004\bU\u0010Q\"\u001f\u0010[\u001a\u00020%*\u00020O8Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\bZ\u0010S\u001a\u0004\bX\u0010Y"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "Lkotlin/Function0;", "p0", "takeOrElse-D5KLDUw", "(FLkotlin/jvm/functions/Function0;)F", "takeOrElse", "", "times-3ABfNKs", "(FF)F", "times", "", "(DF)F", "", "(IF)F", "p1", "min-YgX7TsA", "min", "max-YgX7TsA", "max", "coerceIn-2z7ARbQ", "(FFF)F", "coerceIn", "coerceAtLeast-YgX7TsA", "coerceAtLeast", "coerceAtMost-YgX7TsA", "coerceAtMost", "p2", "lerp-Md-fbLM", "lerp", "Landroidx/compose/ui/unit/DpOffset;", "DpOffset-YgX7TsA", "(FF)J", "DpOffset", "takeOrElse-gVKV90s", "(JLkotlin/jvm/functions/Function0;)J", "lerp-xhh869w", "(JJF)J", "Landroidx/compose/ui/unit/DpSize;", "DpSize-YgX7TsA", "DpSize", "takeOrElse-itqla9I", "times-6HolHcs", "(IJ)J", "(FJ)J", "lerp-IDex15A", "", "isSpecified-0680j_4", "(F)Z", "isSpecified-0680j_4$annotations", "(F)V", "isSpecified", "isUnspecified-0680j_4", "isUnspecified-0680j_4$annotations", "isUnspecified", "getDp", "(I)F", "getDp$annotations", "(I)V", "dp", "(D)F", "(D)V", "(F)F", "isFinite-0680j_4", "isFinite-0680j_4$annotations", "isFinite", "isSpecified-jo-Fl9I", "(J)Z", "isSpecified-jo-Fl9I$annotations", "(J)V", "isUnspecified-jo-Fl9I", "isUnspecified-jo-Fl9I$annotations", "isSpecified-EaSLcWc", "isSpecified-EaSLcWc$annotations", "isUnspecified-EaSLcWc", "isUnspecified-EaSLcWc$annotations", "getCenter-EaSLcWc", "(J)J", "getCenter-EaSLcWc$annotations", "center", "Landroidx/compose/ui/unit/DpRect;", "getWidth", "(Landroidx/compose/ui/unit/DpRect;)F", "getWidth$annotations", "(Landroidx/compose/ui/unit/DpRect;)V", "width", "getHeight", "getHeight$annotations", "height", "getSize", "(Landroidx/compose/ui/unit/DpRect;)J", "getSize$annotations", "size"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DpKt {
    /* JADX INFO: renamed from: getCenter-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m6962getCenterEaSLcWc$annotations(long j) {
    }

    public static /* synthetic */ void getDp$annotations(double d) {
    }

    public static /* synthetic */ void getDp$annotations(float f) {
    }

    public static /* synthetic */ void getDp$annotations(int i) {
    }

    public static /* synthetic */ void getHeight$annotations(DpRect dpRect) {
    }

    public static /* synthetic */ void getSize$annotations(DpRect dpRect) {
    }

    public static /* synthetic */ void getWidth$annotations(DpRect dpRect) {
    }

    /* JADX INFO: renamed from: isFinite-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m6964isFinite0680j_4$annotations(float f) {
    }

    /* JADX INFO: renamed from: isSpecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m6966isSpecified0680j_4$annotations(float f) {
    }

    /* JADX INFO: renamed from: isSpecified-EaSLcWc, reason: not valid java name */
    public static final boolean m6967isSpecifiedEaSLcWc(long j) {
        return j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* JADX INFO: renamed from: isSpecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m6968isSpecifiedEaSLcWc$annotations(long j) {
    }

    /* JADX INFO: renamed from: isSpecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m6969isSpecifiedjoFl9I(long j) {
        return j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* JADX INFO: renamed from: isSpecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m6970isSpecifiedjoFl9I$annotations(long j) {
    }

    /* JADX INFO: renamed from: isUnspecified-0680j_4$annotations, reason: not valid java name */
    public static /* synthetic */ void m6972isUnspecified0680j_4$annotations(float f) {
    }

    /* JADX INFO: renamed from: isUnspecified-EaSLcWc, reason: not valid java name */
    public static final boolean m6973isUnspecifiedEaSLcWc(long j) {
        return j == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* JADX INFO: renamed from: isUnspecified-EaSLcWc$annotations, reason: not valid java name */
    public static /* synthetic */ void m6974isUnspecifiedEaSLcWc$annotations(long j) {
    }

    /* JADX INFO: renamed from: isUnspecified-jo-Fl9I, reason: not valid java name */
    public static final boolean m6975isUnspecifiedjoFl9I(long j) {
        return j == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* JADX INFO: renamed from: isUnspecified-jo-Fl9I$annotations, reason: not valid java name */
    public static /* synthetic */ void m6976isUnspecifiedjoFl9I$annotations(long j) {
    }

    /* JADX INFO: renamed from: isSpecified-0680j_4, reason: not valid java name */
    public static final boolean m6965isSpecified0680j_4(float f) {
        return !Float.isNaN(f);
    }

    /* JADX INFO: renamed from: isUnspecified-0680j_4, reason: not valid java name */
    public static final boolean m6971isUnspecified0680j_4(float f) {
        return Float.isNaN(f);
    }

    public static final float getDp(int i) {
        return Dp.m6935constructorimpl(i);
    }

    public static final float getDp(double d) {
        return Dp.m6935constructorimpl((float) d);
    }

    public static final float getDp(float f) {
        return Dp.m6935constructorimpl(f);
    }

    /* JADX INFO: renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m6986times3ABfNKs(float f, float f2) {
        return Dp.m6935constructorimpl(f * f2);
    }

    /* JADX INFO: renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m6985times3ABfNKs(double d, float f) {
        return Dp.m6935constructorimpl(((float) d) * f);
    }

    /* JADX INFO: renamed from: times-3ABfNKs, reason: not valid java name */
    public static final float m6987times3ABfNKs(int i, float f) {
        return Dp.m6935constructorimpl(i * f);
    }

    /* JADX INFO: renamed from: min-YgX7TsA, reason: not valid java name */
    public static final float m6981minYgX7TsA(float f, float f2) {
        return Dp.m6935constructorimpl(Math.min(f, f2));
    }

    /* JADX INFO: renamed from: max-YgX7TsA, reason: not valid java name */
    public static final float m6980maxYgX7TsA(float f, float f2) {
        return Dp.m6935constructorimpl(Math.max(f, f2));
    }

    /* JADX INFO: renamed from: coerceIn-2z7ARbQ, reason: not valid java name */
    public static final float m6960coerceIn2z7ARbQ(float f, float f2, float f3) {
        return Dp.m6935constructorimpl(RangesKt.coerceIn(f, f2, f3));
    }

    /* JADX INFO: renamed from: coerceAtLeast-YgX7TsA, reason: not valid java name */
    public static final float m6958coerceAtLeastYgX7TsA(float f, float f2) {
        return Dp.m6935constructorimpl(RangesKt.coerceAtLeast(f, f2));
    }

    /* JADX INFO: renamed from: coerceAtMost-YgX7TsA, reason: not valid java name */
    public static final float m6959coerceAtMostYgX7TsA(float f, float f2) {
        return Dp.m6935constructorimpl(RangesKt.coerceAtMost(f, f2));
    }

    /* JADX INFO: renamed from: lerp-Md-fbLM, reason: not valid java name */
    public static final float m6978lerpMdfbLM(float f, float f2, float f3) {
        return Dp.m6935constructorimpl(MathHelpersKt.lerp(f, f2, f3));
    }

    /* JADX INFO: renamed from: takeOrElse-gVKV90s, reason: not valid java name */
    public static final long m6983takeOrElsegVKV90s(long j, Function0<DpOffset> function0) {
        return j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? j : function0.invoke().m7004unboximpl();
    }

    /* JADX INFO: renamed from: lerp-xhh869w, reason: not valid java name */
    public static final long m6979lerpxhh869w(long j, long j2, float f) {
        float fLerp = MathHelpersKt.lerp(DpOffset.m6996getXD9Ej5fM(j), DpOffset.m6996getXD9Ej5fM(j2), f);
        float fLerp2 = MathHelpersKt.lerp(DpOffset.m6998getYD9Ej5fM(j), DpOffset.m6998getYD9Ej5fM(j2), f);
        return DpOffset.m6991constructorimpl((((long) Float.floatToRawIntBits(fLerp)) << 32) | (((long) Float.floatToRawIntBits(fLerp2)) & 4294967295L));
    }

    /* JADX INFO: renamed from: takeOrElse-itqla9I, reason: not valid java name */
    public static final long m6984takeOrElseitqla9I(long j, Function0<DpSize> function0) {
        return j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats ? j : function0.invoke().getPackedValue();
    }

    /* JADX INFO: renamed from: getCenter-EaSLcWc, reason: not valid java name */
    public static final long m6961getCenterEaSLcWc(long j) {
        float fM6935constructorimpl = Dp.m6935constructorimpl(DpSize.m7033getWidthD9Ej5fM(j) / 2.0f);
        return DpOffset.m6991constructorimpl((((long) Float.floatToRawIntBits(Dp.m6935constructorimpl(DpSize.m7031getHeightD9Ej5fM(j) / 2.0f))) & 4294967295L) | (((long) Float.floatToRawIntBits(fM6935constructorimpl)) << 32));
    }

    /* JADX INFO: renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m6989times6HolHcs(int i, long j) {
        return DpSize.m7039timesGh9hcWk(j, i);
    }

    /* JADX INFO: renamed from: times-6HolHcs, reason: not valid java name */
    public static final long m6988times6HolHcs(float f, long j) {
        return DpSize.m7038timesGh9hcWk(j, f);
    }

    /* JADX INFO: renamed from: lerp-IDex15A, reason: not valid java name */
    public static final long m6977lerpIDex15A(long j, long j2, float f) {
        float fM6978lerpMdfbLM = m6978lerpMdfbLM(DpSize.m7033getWidthD9Ej5fM(j), DpSize.m7033getWidthD9Ej5fM(j2), f);
        float fM6978lerpMdfbLM2 = m6978lerpMdfbLM(DpSize.m7031getHeightD9Ej5fM(j), DpSize.m7031getHeightD9Ej5fM(j2), f);
        return DpSize.m7024constructorimpl((((long) Float.floatToRawIntBits(fM6978lerpMdfbLM)) << 32) | (((long) Float.floatToRawIntBits(fM6978lerpMdfbLM2)) & 4294967295L));
    }

    public static final float getWidth(DpRect dpRect) {
        return Dp.m6935constructorimpl(dpRect.m7019getRightD9Ej5fM() - dpRect.m7018getLeftD9Ej5fM());
    }

    public static final float getHeight(DpRect dpRect) {
        return Dp.m6935constructorimpl(dpRect.m7017getBottomD9Ej5fM() - dpRect.m7020getTopD9Ej5fM());
    }

    /* JADX INFO: renamed from: takeOrElse-D5KLDUw, reason: not valid java name */
    public static final float m6982takeOrElseD5KLDUw(float f, Function0<Dp> function0) {
        return !Float.isNaN(f) ? f : function0.invoke().m6949unboximpl();
    }

    /* JADX INFO: renamed from: isFinite-0680j_4, reason: not valid java name */
    public static final boolean m6963isFinite0680j_4(float f) {
        return (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040;
    }

    /* JADX INFO: renamed from: DpOffset-YgX7TsA, reason: not valid java name */
    public static final long m6956DpOffsetYgX7TsA(float f, float f2) {
        return DpOffset.m6991constructorimpl((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
    }

    /* JADX INFO: renamed from: DpSize-YgX7TsA, reason: not valid java name */
    public static final long m6957DpSizeYgX7TsA(float f, float f2) {
        return DpSize.m7024constructorimpl((((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
    }

    public static final long getSize(DpRect dpRect) {
        return m6957DpSizeYgX7TsA(Dp.m6935constructorimpl(dpRect.m7019getRightD9Ej5fM() - dpRect.m7018getLeftD9Ej5fM()), Dp.m6935constructorimpl(dpRect.m7017getBottomD9Ej5fM() - dpRect.m7020getTopD9Ej5fM()));
    }
}
