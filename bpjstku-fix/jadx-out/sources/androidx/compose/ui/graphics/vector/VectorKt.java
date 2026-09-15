package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0087\b¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\u0010\u001a\u00020\r*\u00020\f2\u0006\u0010\u0004\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0013\u001a\u00020\f*\u00020\fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0015\u0010\u0015\u001a\u00020\r*\u0004\u0018\u00010\u0014H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0017\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001a\u001a\u00020\u00198\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001c\u001a\u00020\u00198\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b\"\u0014\u0010\u001d\u001a\u00020\u00198\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u00198\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001b\"\u0014\u0010\u001f\u001a\u00020\u00198\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b\"\u0014\u0010 \u001a\u00020\u00198\u0006X\u0087T¢\u0006\u0006\n\u0004\b \u0010\u001b\"\u0014\u0010!\u001a\u00020\u00198\u0006X\u0087T¢\u0006\u0006\n\u0004\b!\u0010\u001b\" \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0014\u0010&\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b&\u0010\u0018\"\u0014\u0010'\u001a\u00020\u00198\u0006X\u0087T¢\u0006\u0006\n\u0004\b'\u0010\u001b\"\u0014\u0010(\u001a\u00020\u00198\u0006X\u0087T¢\u0006\u0006\n\u0004\b(\u0010\u001b\"\u0014\u0010)\u001a\u00020\u00198\u0006X\u0087T¢\u0006\u0006\n\u0004\b)\u0010\u001b\"\u0014\u0010*\u001a\u00020\u00198\u0006X\u0087T¢\u0006\u0006\n\u0004\b*\u0010\u001b\"\u0014\u0010+\u001a\u00020\u00198\u0006X\u0087T¢\u0006\u0006\n\u0004\b+\u0010\u001b\"\u001a\u0010-\u001a\u00020,8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u001a\u00102\u001a\u0002018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b3\u00100\"\u001a\u00105\u001a\u0002048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u00100\"\u001a\u00107\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u001a\u0010<\u001a\u00020;8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010.\u001a\u0004\b=\u00100"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/graphics/vector/PathBuilder;", "", "Lkotlin/ExtensionFunctionType;", "p0", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "PathData", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "addPathNodes", "(Ljava/lang/String;)Ljava/util/List;", "Landroidx/compose/ui/graphics/Color;", "", "rgbEqual--OWjLjI", "(JJ)Z", "rgbEqual", "toOpaque-8_81llA", "(J)J", "toOpaque", "Landroidx/compose/ui/graphics/ColorFilter;", "tintableWithAlphaMask", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "DefaultGroupName", "Ljava/lang/String;", "", "DefaultRotation", "F", "DefaultPivotX", "DefaultPivotY", "DefaultScaleX", "DefaultScaleY", "DefaultTranslationX", "DefaultTranslationY", "EmptyPath", "Ljava/util/List;", "getEmptyPath", "()Ljava/util/List;", "DefaultPathName", "DefaultStrokeLineWidth", "DefaultStrokeLineMiter", "DefaultTrimPathStart", "DefaultTrimPathEnd", "DefaultTrimPathOffset", "Landroidx/compose/ui/graphics/StrokeCap;", "DefaultStrokeLineCap", "I", "getDefaultStrokeLineCap", "()I", "Landroidx/compose/ui/graphics/StrokeJoin;", "DefaultStrokeLineJoin", "getDefaultStrokeLineJoin", "Landroidx/compose/ui/graphics/BlendMode;", "DefaultTintBlendMode", "getDefaultTintBlendMode", "DefaultTintColor", "J", "getDefaultTintColor", "()J", "Landroidx/compose/ui/graphics/PathFillType;", "DefaultFillType", "getDefaultFillType"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class VectorKt {
    public static final String DefaultGroupName = "";
    public static final String DefaultPathName = "";
    public static final float DefaultPivotX = 0.0f;
    public static final float DefaultPivotY = 0.0f;
    public static final float DefaultRotation = 0.0f;
    public static final float DefaultScaleX = 1.0f;
    public static final float DefaultScaleY = 1.0f;
    public static final float DefaultStrokeLineMiter = 4.0f;
    public static final float DefaultStrokeLineWidth = 0.0f;
    public static final float DefaultTranslationX = 0.0f;
    public static final float DefaultTranslationY = 0.0f;
    public static final float DefaultTrimPathEnd = 1.0f;
    public static final float DefaultTrimPathOffset = 0.0f;
    public static final float DefaultTrimPathStart = 0.0f;
    private static final List<PathNode> EmptyPath = CollectionsKt.emptyList();
    private static final int DefaultStrokeLineCap = StrokeCap.INSTANCE.m4589getButtKaPHkGw();
    private static final int DefaultStrokeLineJoin = StrokeJoin.INSTANCE.m4600getMiterLxFBmk8();
    private static final int DefaultTintBlendMode = BlendMode.INSTANCE.m4157getSrcIn0nO6VwU();
    private static final long DefaultTintColor = Color.INSTANCE.m4253getTransparent0d7_KjU();
    private static final int DefaultFillType = PathFillType.INSTANCE.m4514getNonZeroRgk1Os();

    public static final List<PathNode> getEmptyPath() {
        return EmptyPath;
    }

    public static final int getDefaultStrokeLineCap() {
        return DefaultStrokeLineCap;
    }

    public static final int getDefaultStrokeLineJoin() {
        return DefaultStrokeLineJoin;
    }

    public static final int getDefaultTintBlendMode() {
        return DefaultTintBlendMode;
    }

    public static final long getDefaultTintColor() {
        return DefaultTintColor;
    }

    public static final int getDefaultFillType() {
        return DefaultFillType;
    }

    public static final List<PathNode> PathData(Function1<? super PathBuilder, Unit> function1) {
        PathBuilder pathBuilder = new PathBuilder();
        function1.invoke(pathBuilder);
        return pathBuilder.getNodes();
    }

    public static final List<PathNode> addPathNodes(String str) {
        if (str == null) {
            return EmptyPath;
        }
        return new PathParser().parsePathString(str).toNodes();
    }

    /* JADX INFO: renamed from: rgbEqual--OWjLjI, reason: not valid java name */
    public static final boolean m4971rgbEqualOWjLjI(long j, long j2) {
        return Color.m4224getRedimpl(j) == Color.m4224getRedimpl(j2) && Color.m4223getGreenimpl(j) == Color.m4223getGreenimpl(j2) && Color.m4221getBlueimpl(j) == Color.m4221getBlueimpl(j2);
    }

    /* JADX INFO: renamed from: toOpaque-8_81llA, reason: not valid java name */
    public static final long m4972toOpaque8_81llA(long j) {
        return Color.m4220getAlphaimpl(j) == 1.0f ? j : Color.m4217copywmQWz5c$default(j, 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    public static final boolean tintableWithAlphaMask(ColorFilter colorFilter) {
        if (!(colorFilter instanceof BlendModeColorFilter)) {
            return colorFilter == null;
        }
        BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) colorFilter;
        return BlendMode.m4128equalsimpl0(blendModeColorFilter.getBlendMode(), BlendMode.INSTANCE.m4157getSrcIn0nO6VwU()) || BlendMode.m4128equalsimpl0(blendModeColorFilter.getBlendMode(), BlendMode.INSTANCE.m4159getSrcOver0nO6VwU());
    }
}
