package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.CircularProgressIndicatorTokens;
import androidx.compose.material3.tokens.LinearProgressIndicatorTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u001aR\u0010%\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010(2\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\u00052\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a0\u0010%\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001aD\u0010%\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\u00052\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a8\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00012\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b6\u00107\u001aL\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00012\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\u00052\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u00108\u001aH\u00109\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00010(2\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/H\u0007ø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001a0\u00109\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+H\u0007ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a:\u00109\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/H\u0007ø\u0001\u0000¢\u0006\u0004\b>\u0010?\u001a8\u00109\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00012\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+H\u0007ø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001aB\u00109\u001a\u00020&2\u0006\u0010'\u001a\u00020\u00012\b\b\u0002\u0010)\u001a\u00020\u00132\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/H\u0007ø\u0001\u0000¢\u0006\u0004\b:\u0010B\u001a6\u0010C\u001a\u00020&*\u00020D2\u0006\u0010E\u001a\u00020\u00012\u0006\u0010F\u001a\u00020\u00012\u0006\u0010*\u001a\u00020+2\u0006\u0010G\u001a\u00020HH\u0002ø\u0001\u0000¢\u0006\u0004\bI\u0010J\u001a&\u0010K\u001a\u00020&*\u00020D2\u0006\u0010*\u001a\u00020+2\u0006\u0010G\u001a\u00020HH\u0002ø\u0001\u0000¢\u0006\u0004\bL\u0010M\u001a6\u0010N\u001a\u00020&*\u00020D2\u0006\u0010E\u001a\u00020\u00012\u0006\u0010F\u001a\u00020\u00012\u0006\u0010*\u001a\u00020+2\u0006\u0010G\u001a\u00020HH\u0002ø\u0001\u0000¢\u0006\u0004\bO\u0010J\u001a>\u0010P\u001a\u00020&*\u00020D2\u0006\u0010E\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u00052\u0006\u0010F\u001a\u00020\u00012\u0006\u0010*\u001a\u00020+2\u0006\u0010G\u001a\u00020HH\u0002ø\u0001\u0000¢\u0006\u0004\bQ\u0010R\u001a>\u0010S\u001a\u00020&*\u00020D2\u0006\u0010T\u001a\u00020\u00012\u0006\u0010U\u001a\u00020\u00012\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00012\u0006\u0010.\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0004\bV\u0010W\u001a.\u0010X\u001a\u00020&*\u00020D2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00012\u0006\u0010.\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0004\bY\u0010Z\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\"\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0016\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0017\u0010\u0007\"\u0016\u0010\u0018\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0019\u0010\u0007\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010#\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b\"\u000e\u0010$\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006["}, d2 = {"BaseRotationAngle", "", "CircularEasing", "Landroidx/compose/animation/core/CubicBezierEasing;", "CircularIndicatorDiameter", "Landroidx/compose/ui/unit/Dp;", "getCircularIndicatorDiameter", "()F", "F", "FirstLineHeadDelay", "", "FirstLineHeadDuration", "FirstLineHeadEasing", "FirstLineTailDelay", "FirstLineTailDuration", "FirstLineTailEasing", "HeadAndTailAnimationDuration", "HeadAndTailDelayDuration", "IncreaseSemanticsBounds", "Landroidx/compose/ui/Modifier;", "JumpRotationAngle", "LinearAnimationDuration", "LinearIndicatorHeight", "getLinearIndicatorHeight", "LinearIndicatorWidth", "getLinearIndicatorWidth", "RotationAngleOffset", "RotationDuration", "RotationsPerCycle", "SecondLineHeadDelay", "SecondLineHeadDuration", "SecondLineHeadEasing", "SecondLineTailDelay", "SecondLineTailDuration", "SecondLineTailEasing", "SemanticsBoundsPadding", "StartAngleOffset", "CircularProgressIndicator", "", "progress", "Lkotlin/Function0;", "modifier", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", "strokeWidth", "trackColor", "strokeCap", "Landroidx/compose/ui/graphics/StrokeCap;", "CircularProgressIndicator-DUhRLBM", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-aM-cp0Q", "(Landroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-LxG7B9w", "(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "CircularProgressIndicator-MBs18nI", "(FLandroidx/compose/ui/Modifier;JFLandroidx/compose/runtime/Composer;II)V", "(FLandroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator", "LinearProgressIndicator-_5eSR-E", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-RIQooxk", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-2cYBFYY", "(Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LinearProgressIndicator-eaDK9VM", "(FLandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V", "(FLandroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "drawCircularIndicator", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "startAngle", "sweep", "stroke", "Landroidx/compose/ui/graphics/drawscope/Stroke;", "drawCircularIndicator-42QJj7c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawCircularIndicatorTrack", "drawCircularIndicatorTrack-bw27NRU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawDeterminateCircularIndicator", "drawDeterminateCircularIndicator-42QJj7c", "drawIndeterminateCircularIndicator", "drawIndeterminateCircularIndicator-hrjfTZI", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFFJLandroidx/compose/ui/graphics/drawscope/Stroke;)V", "drawLinearIndicator", "startFraction", "endFraction", "drawLinearIndicator-qYKTg0g", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFJFI)V", "drawLinearIndicatorTrack", "drawLinearIndicatorTrack-AZGd3zU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFI)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ProgressIndicatorKt {
    private static final float BaseRotationAngle = 286.0f;
    private static final CubicBezierEasing CircularEasing;
    private static final float CircularIndicatorDiameter;
    private static final int FirstLineHeadDelay = 0;
    private static final int FirstLineHeadDuration = 750;
    private static final CubicBezierEasing FirstLineHeadEasing;
    private static final int FirstLineTailDelay = 333;
    private static final int FirstLineTailDuration = 850;
    private static final CubicBezierEasing FirstLineTailEasing;
    private static final int HeadAndTailAnimationDuration = 666;
    private static final int HeadAndTailDelayDuration = 666;
    private static final Modifier IncreaseSemanticsBounds;
    private static final float JumpRotationAngle = 290.0f;
    private static final int LinearAnimationDuration = 1800;
    private static final float LinearIndicatorHeight;
    private static final float LinearIndicatorWidth;
    private static final float RotationAngleOffset = 216.0f;
    private static final int RotationDuration = 1332;
    private static final int RotationsPerCycle = 5;
    private static final int SecondLineHeadDelay = 1000;
    private static final int SecondLineHeadDuration = 567;
    private static final CubicBezierEasing SecondLineHeadEasing;
    private static final int SecondLineTailDelay = 1267;
    private static final int SecondLineTailDuration = 533;
    private static final CubicBezierEasing SecondLineTailEasing;
    private static final float SemanticsBoundsPadding;
    private static final float StartAngleOffset = -90.0f;

    /* JADX WARN: Code duplicated, block: B:100:0x0149  */
    /* JADX WARN: Code duplicated, block: B:103:0x0173  */
    /* JADX WARN: Code duplicated, block: B:105:0x0179  */
    /* JADX WARN: Code duplicated, block: B:111:0x0188  */
    /* JADX WARN: Code duplicated, block: B:112:0x018a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0197  */
    /* JADX WARN: Code duplicated, block: B:119:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:125:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:129:0x01be  */
    /* JADX WARN: Code duplicated, block: B:132:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:46:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:57:0x0096  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ed A[PHI: r3 r6 r10 r12
  0x00ed: PHI (r3v27 int) = (r3v16 int), (r3v29 int) binds: [B:80:0x00e3, B:70:0x00bf] A[DONT_GENERATE, DONT_INLINE]
  0x00ed: PHI (r6v6 androidx.compose.ui.Modifier) = (r6v3 androidx.compose.ui.Modifier), (r6v2 androidx.compose.ui.Modifier) binds: [B:80:0x00e3, B:70:0x00bf] A[DONT_GENERATE, DONT_INLINE]
  0x00ed: PHI (r10v20 long) = (r10v2 long), (r10v1 long) binds: [B:80:0x00e3, B:70:0x00bf] A[DONT_GENERATE, DONT_INLINE]
  0x00ed: PHI (r12v8 long) = (r12v4 long), (r12v10 long) binds: [B:80:0x00e3, B:70:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:89:0x0109  */
    /* JADX WARN: Code duplicated, block: B:90:0x010b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0112  */
    /* JADX WARN: Code duplicated, block: B:95:0x011a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0141  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: LinearProgressIndicator-_5eSR-E, reason: not valid java name */
    public static final void m2279LinearProgressIndicator_5eSRE(final Function0<Float> function0, Modifier modifier, long j, long j2, int i, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long linearColor;
        long j3;
        int i5;
        int i6;
        int i7;
        long linearTrackColor;
        int iM2270getLinearStrokeCapKaPHkGw;
        final long j4;
        boolean z;
        Object objRememberedValue;
        final Function0 function1;
        boolean zChanged;
        Object objRememberedValue2;
        boolean z2;
        boolean z3;
        boolean zChanged2;
        boolean z4;
        Object objRememberedValue3;
        final int i8;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i9;
        int i10;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1796992155);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 == 0) {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                linearColor = j;
                if ((i3 & 4) == 0 || !composerStartRestartGroup.changed(linearColor)) {
                    i10 = 128;
                } else {
                    i10 = 256;
                }
                i4 |= i10;
            } else {
                linearColor = j;
            }
            if ((i2 & 3072) == 0) {
                j3 = j2;
                if ((i3 & 8) == 0 || !composerStartRestartGroup.changed(j3)) {
                    i9 = 1024;
                } else {
                    i9 = 2048;
                }
                i4 |= i9;
            } else {
                j3 = j2;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    i6 = i;
                    if (composerStartRestartGroup.changed(i6)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i4 |= i7;
                }
                if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        linearTrackColor = j3;
                    } else {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                            i4 &= -7169;
                        } else {
                            linearTrackColor = j3;
                        }
                        if (i5 != 0) {
                            iM2270getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw();
                        }
                        j4 = linearColor;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1796992155, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:84)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-1348540816);
                        if ((i4 & 14) == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Float invoke() {
                                    return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        function1 = (Function0) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierThen = modifier2.then(IncreaseSemanticsBounds);
                        composerStartRestartGroup.startReplaceableGroup(-1348540664);
                        zChanged = composerStartRestartGroup.changed(function1);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$1$1
                                @Override // kotlin.jvm.functions.Function1
                                public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function1.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        Modifier modifierM1049sizeVpY3zN4 = SizeKt.m1049sizeVpY3zN4(SemanticsModifierKt.semantics(modifierThen, true, (Function1) objRememberedValue2), LinearIndicatorWidth, LinearIndicatorHeight);
                        composerStartRestartGroup.startReplaceableGroup(-1348540492);
                        z2 = (((i4 & 7168) ^ 3072) <= 2048 && composerStartRestartGroup.changed(linearTrackColor)) || (i4 & 3072) == 2048;
                        if ((57344 & i4) == 16384) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        zChanged2 = composerStartRestartGroup.changed(function1);
                        z4 = (((i4 & 896) ^ 384) <= 256 && composerStartRestartGroup.changed(j4)) || (i4 & 384) == 256;
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!(z4 | z2 | z3 | zChanged2) || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            final long j6 = linearTrackColor;
                            final int i12 = iM2270getLinearStrokeCapKaPHkGw;
                            objRememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                                @Override // kotlin.jvm.functions.Function1
                                public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                    invoke2(drawScope);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(DrawScope drawScope) {
                                    float fM4040getHeightimpl = Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc());
                                    ProgressIndicatorKt.m2291drawLinearIndicatorTrackAZGd3zU(drawScope, j6, fM4040getHeightimpl, i12);
                                    ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, 0.0f, function1.invoke().floatValue(), j4, fM4040getHeightimpl, i12);
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CanvasKt.Canvas(modifierM1049sizeVpY3zN4, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i8 = iM2270getLinearStrokeCapKaPHkGw;
                        j3 = linearTrackColor;
                        j5 = j4;
                    }
                    iM2270getLinearStrokeCapKaPHkGw = i6;
                    j4 = linearColor;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1796992155, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:84)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1348540816);
                    if ((i4 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                        objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Float invoke() {
                                return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Float invoke() {
                                return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    function1 = (Function0) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierThen2 = modifier2.then(IncreaseSemanticsBounds);
                    composerStartRestartGroup.startReplaceableGroup(-1348540664);
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function1.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function1.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierM1049sizeVpY3zN5 = SizeKt.m1049sizeVpY3zN4(SemanticsModifierKt.semantics(modifierThen2, true, (Function1) objRememberedValue2), LinearIndicatorWidth, LinearIndicatorHeight);
                    composerStartRestartGroup.startReplaceableGroup(-1348540492);
                    if (((i4 & 7168) ^ 3072) <= 2048) {
                    }
                    if ((57344 & i4) == 16384) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zChanged2 = composerStartRestartGroup.changed(function1);
                    if (((i4 & 896) ^ 384) <= 256) {
                    }
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!(z4 | z2 | z3 | zChanged2)) {
                        final long j7 = linearTrackColor;
                        final int i13 = iM2270getLinearStrokeCapKaPHkGw;
                        objRememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                float fM4040getHeightimpl = Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc());
                                ProgressIndicatorKt.m2291drawLinearIndicatorTrackAZGd3zU(drawScope, j7, fM4040getHeightimpl, i13);
                                ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, 0.0f, function1.invoke().floatValue(), j4, fM4040getHeightimpl, i13);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        final long j8 = linearTrackColor;
                        final int i14 = iM2270getLinearStrokeCapKaPHkGw;
                        objRememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                float fM4040getHeightimpl = Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc());
                                ProgressIndicatorKt.m2291drawLinearIndicatorTrackAZGd3zU(drawScope, j8, fM4040getHeightimpl, i14);
                                ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, 0.0f, function1.invoke().floatValue(), j4, fM4040getHeightimpl, i14);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM1049sizeVpY3zN5, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i8 = iM2270getLinearStrokeCapKaPHkGw;
                    j3 = linearTrackColor;
                    j5 = j4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    i8 = i6;
                    j5 = linearColor;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier3 = modifier2;
                    final long j9 = j3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i15) {
                            ProgressIndicatorKt.m2279LinearProgressIndicator_5eSRE(function0, modifier3, j5, j9, i8, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                        }
                    });
                }
            }
            i4 |= 24576;
            i6 = i;
            if ((i4 & 9363) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) == 0) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                        i4 &= -7169;
                    } else {
                        linearTrackColor = j3;
                    }
                    if (i5 != 0) {
                        iM2270getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw();
                    } else {
                        iM2270getLinearStrokeCapKaPHkGw = i6;
                    }
                } else {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                        i4 &= -7169;
                    } else {
                        linearTrackColor = j3;
                    }
                    if (i5 != 0) {
                        iM2270getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw();
                    } else {
                        iM2270getLinearStrokeCapKaPHkGw = i6;
                    }
                }
                j4 = linearColor;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1796992155, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:84)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1348540816);
                if ((i4 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                function1 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen3 = modifier2.then(IncreaseSemanticsBounds);
                composerStartRestartGroup.startReplaceableGroup(-1348540664);
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function1.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function1.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierM1049sizeVpY3zN6 = SizeKt.m1049sizeVpY3zN4(SemanticsModifierKt.semantics(modifierThen3, true, (Function1) objRememberedValue2), LinearIndicatorWidth, LinearIndicatorHeight);
                composerStartRestartGroup.startReplaceableGroup(-1348540492);
                if (((i4 & 7168) ^ 3072) <= 2048) {
                }
                if ((57344 & i4) == 16384) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zChanged2 = composerStartRestartGroup.changed(function1);
                if (((i4 & 896) ^ 384) <= 256) {
                }
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!(z4 | z2 | z3 | zChanged2)) {
                    final long j10 = linearTrackColor;
                    final int i15 = iM2270getLinearStrokeCapKaPHkGw;
                    objRememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float fM4040getHeightimpl = Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc());
                            ProgressIndicatorKt.m2291drawLinearIndicatorTrackAZGd3zU(drawScope, j10, fM4040getHeightimpl, i15);
                            ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, 0.0f, function1.invoke().floatValue(), j4, fM4040getHeightimpl, i15);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    final long j11 = linearTrackColor;
                    final int i16 = iM2270getLinearStrokeCapKaPHkGw;
                    objRememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float fM4040getHeightimpl = Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc());
                            ProgressIndicatorKt.m2291drawLinearIndicatorTrackAZGd3zU(drawScope, j11, fM4040getHeightimpl, i16);
                            ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, 0.0f, function1.invoke().floatValue(), j4, fM4040getHeightimpl, i16);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1049sizeVpY3zN6, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i8 = iM2270getLinearStrokeCapKaPHkGw;
                j3 = linearTrackColor;
                j5 = j4;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) == 0) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                        i4 &= -7169;
                    } else {
                        linearTrackColor = j3;
                    }
                    if (i5 != 0) {
                        iM2270getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw();
                    } else {
                        iM2270getLinearStrokeCapKaPHkGw = i6;
                    }
                } else {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                        i4 &= -7169;
                    } else {
                        linearTrackColor = j3;
                    }
                    if (i5 != 0) {
                        iM2270getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw();
                    } else {
                        iM2270getLinearStrokeCapKaPHkGw = i6;
                    }
                }
                j4 = linearColor;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1796992155, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:84)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1348540816);
                if ((i4 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                function1 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen4 = modifier2.then(IncreaseSemanticsBounds);
                composerStartRestartGroup.startReplaceableGroup(-1348540664);
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function1.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function1.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierM1049sizeVpY3zN7 = SizeKt.m1049sizeVpY3zN4(SemanticsModifierKt.semantics(modifierThen4, true, (Function1) objRememberedValue2), LinearIndicatorWidth, LinearIndicatorHeight);
                composerStartRestartGroup.startReplaceableGroup(-1348540492);
                if (((i4 & 7168) ^ 3072) <= 2048) {
                }
                if ((57344 & i4) == 16384) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zChanged2 = composerStartRestartGroup.changed(function1);
                if (((i4 & 896) ^ 384) <= 256) {
                }
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!(z4 | z2 | z3 | zChanged2)) {
                    final long j12 = linearTrackColor;
                    final int i17 = iM2270getLinearStrokeCapKaPHkGw;
                    objRememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float fM4040getHeightimpl = Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc());
                            ProgressIndicatorKt.m2291drawLinearIndicatorTrackAZGd3zU(drawScope, j12, fM4040getHeightimpl, i17);
                            ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, 0.0f, function1.invoke().floatValue(), j4, fM4040getHeightimpl, i17);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    final long j13 = linearTrackColor;
                    final int i18 = iM2270getLinearStrokeCapKaPHkGw;
                    objRememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float fM4040getHeightimpl = Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc());
                            ProgressIndicatorKt.m2291drawLinearIndicatorTrackAZGd3zU(drawScope, j13, fM4040getHeightimpl, i18);
                            ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, 0.0f, function1.invoke().floatValue(), j4, fM4040getHeightimpl, i18);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1049sizeVpY3zN7, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i8 = iM2270getLinearStrokeCapKaPHkGw;
                j3 = linearTrackColor;
                j5 = j4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier4 = modifier2;
                final long j14 = j3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i19) {
                        ProgressIndicatorKt.m2279LinearProgressIndicator_5eSRE(function0, modifier4, j5, j14, i8, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
        }
        i4 |= 48;
        modifier2 = modifier;
        if ((i2 & 384) == 0) {
            linearColor = j;
            if ((i3 & 4) == 0) {
                i10 = 128;
            } else {
                i10 = 128;
            }
            i4 |= i10;
        } else {
            linearColor = j;
        }
        if ((i2 & 3072) == 0) {
            j3 = j2;
            if ((i3 & 8) == 0) {
                i9 = 1024;
            } else {
                i9 = 1024;
            }
            i4 |= i9;
        } else {
            j3 = j2;
        }
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i2 & 24576) == 0) {
                i6 = i;
                if (composerStartRestartGroup.changed(i6)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i4 |= i7;
            }
            if ((i4 & 9363) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) == 0) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                        i4 &= -7169;
                    } else {
                        linearTrackColor = j3;
                    }
                    if (i5 != 0) {
                        iM2270getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw();
                    } else {
                        iM2270getLinearStrokeCapKaPHkGw = i6;
                    }
                } else {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                        i4 &= -7169;
                    } else {
                        linearTrackColor = j3;
                    }
                    if (i5 != 0) {
                        iM2270getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw();
                    } else {
                        iM2270getLinearStrokeCapKaPHkGw = i6;
                    }
                }
                j4 = linearColor;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1796992155, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:84)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1348540816);
                if ((i4 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                function1 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen5 = modifier2.then(IncreaseSemanticsBounds);
                composerStartRestartGroup.startReplaceableGroup(-1348540664);
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function1.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function1.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierM1049sizeVpY3zN8 = SizeKt.m1049sizeVpY3zN4(SemanticsModifierKt.semantics(modifierThen5, true, (Function1) objRememberedValue2), LinearIndicatorWidth, LinearIndicatorHeight);
                composerStartRestartGroup.startReplaceableGroup(-1348540492);
                if (((i4 & 7168) ^ 3072) <= 2048) {
                }
                if ((57344 & i4) == 16384) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zChanged2 = composerStartRestartGroup.changed(function1);
                if (((i4 & 896) ^ 384) <= 256) {
                }
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!(z4 | z2 | z3 | zChanged2)) {
                    final long j15 = linearTrackColor;
                    final int i19 = iM2270getLinearStrokeCapKaPHkGw;
                    objRememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float fM4040getHeightimpl = Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc());
                            ProgressIndicatorKt.m2291drawLinearIndicatorTrackAZGd3zU(drawScope, j15, fM4040getHeightimpl, i19);
                            ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, 0.0f, function1.invoke().floatValue(), j4, fM4040getHeightimpl, i19);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    final long j16 = linearTrackColor;
                    final int i110 = iM2270getLinearStrokeCapKaPHkGw;
                    objRememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float fM4040getHeightimpl = Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc());
                            ProgressIndicatorKt.m2291drawLinearIndicatorTrackAZGd3zU(drawScope, j16, fM4040getHeightimpl, i110);
                            ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, 0.0f, function1.invoke().floatValue(), j4, fM4040getHeightimpl, i110);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1049sizeVpY3zN8, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i8 = iM2270getLinearStrokeCapKaPHkGw;
                j3 = linearTrackColor;
                j5 = j4;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) == 0) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                        i4 &= -7169;
                    } else {
                        linearTrackColor = j3;
                    }
                    if (i5 != 0) {
                        iM2270getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw();
                    } else {
                        iM2270getLinearStrokeCapKaPHkGw = i6;
                    }
                } else {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                        i4 &= -7169;
                    } else {
                        linearTrackColor = j3;
                    }
                    if (i5 != 0) {
                        iM2270getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw();
                    } else {
                        iM2270getLinearStrokeCapKaPHkGw = i6;
                    }
                }
                j4 = linearColor;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1796992155, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:84)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1348540816);
                if ((i4 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                function1 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierThen6 = modifier2.then(IncreaseSemanticsBounds);
                composerStartRestartGroup.startReplaceableGroup(-1348540664);
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function1.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function1.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierM1049sizeVpY3zN9 = SizeKt.m1049sizeVpY3zN4(SemanticsModifierKt.semantics(modifierThen6, true, (Function1) objRememberedValue2), LinearIndicatorWidth, LinearIndicatorHeight);
                composerStartRestartGroup.startReplaceableGroup(-1348540492);
                if (((i4 & 7168) ^ 3072) <= 2048) {
                }
                if ((57344 & i4) == 16384) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zChanged2 = composerStartRestartGroup.changed(function1);
                if (((i4 & 896) ^ 384) <= 256) {
                }
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!(z4 | z2 | z3 | zChanged2)) {
                    final long j17 = linearTrackColor;
                    final int i111 = iM2270getLinearStrokeCapKaPHkGw;
                    objRememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float fM4040getHeightimpl = Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc());
                            ProgressIndicatorKt.m2291drawLinearIndicatorTrackAZGd3zU(drawScope, j17, fM4040getHeightimpl, i111);
                            ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, 0.0f, function1.invoke().floatValue(), j4, fM4040getHeightimpl, i111);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    final long j18 = linearTrackColor;
                    final int i112 = iM2270getLinearStrokeCapKaPHkGw;
                    objRememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float fM4040getHeightimpl = Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc());
                            ProgressIndicatorKt.m2291drawLinearIndicatorTrackAZGd3zU(drawScope, j18, fM4040getHeightimpl, i112);
                            ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, 0.0f, function1.invoke().floatValue(), j4, fM4040getHeightimpl, i112);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1049sizeVpY3zN9, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i8 = iM2270getLinearStrokeCapKaPHkGw;
                j3 = linearTrackColor;
                j5 = j4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier5 = modifier2;
                final long j19 = j3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i113) {
                        ProgressIndicatorKt.m2279LinearProgressIndicator_5eSRE(function0, modifier5, j5, j19, i8, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
        }
        i4 |= 24576;
        i6 = i;
        if ((i4 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0) {
                if (i11 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    i4 &= -7169;
                } else {
                    linearTrackColor = j3;
                }
                if (i5 != 0) {
                    iM2270getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw();
                } else {
                    iM2270getLinearStrokeCapKaPHkGw = i6;
                }
            } else {
                if (i11 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    i4 &= -7169;
                } else {
                    linearTrackColor = j3;
                }
                if (i5 != 0) {
                    iM2270getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw();
                } else {
                    iM2270getLinearStrokeCapKaPHkGw = i6;
                }
            }
            j4 = linearColor;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1796992155, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:84)");
            }
            composerStartRestartGroup.startReplaceableGroup(-1348540816);
            if ((i4 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            function1 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen7 = modifier2.then(IncreaseSemanticsBounds);
            composerStartRestartGroup.startReplaceableGroup(-1348540664);
            zChanged = composerStartRestartGroup.changed(function1);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function1.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function1.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM1049sizeVpY3zN10 = SizeKt.m1049sizeVpY3zN4(SemanticsModifierKt.semantics(modifierThen7, true, (Function1) objRememberedValue2), LinearIndicatorWidth, LinearIndicatorHeight);
            composerStartRestartGroup.startReplaceableGroup(-1348540492);
            if (((i4 & 7168) ^ 3072) <= 2048) {
            }
            if ((57344 & i4) == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            zChanged2 = composerStartRestartGroup.changed(function1);
            if (((i4 & 896) ^ 384) <= 256) {
            }
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (!(z4 | z2 | z3 | zChanged2)) {
                final long j110 = linearTrackColor;
                final int i113 = iM2270getLinearStrokeCapKaPHkGw;
                objRememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        float fM4040getHeightimpl = Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc());
                        ProgressIndicatorKt.m2291drawLinearIndicatorTrackAZGd3zU(drawScope, j110, fM4040getHeightimpl, i113);
                        ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, 0.0f, function1.invoke().floatValue(), j4, fM4040getHeightimpl, i113);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                final long j111 = linearTrackColor;
                final int i114 = iM2270getLinearStrokeCapKaPHkGw;
                objRememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        float fM4040getHeightimpl = Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc());
                        ProgressIndicatorKt.m2291drawLinearIndicatorTrackAZGd3zU(drawScope, j111, fM4040getHeightimpl, i114);
                        ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, 0.0f, function1.invoke().floatValue(), j4, fM4040getHeightimpl, i114);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM1049sizeVpY3zN10, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i8 = iM2270getLinearStrokeCapKaPHkGw;
            j3 = linearTrackColor;
            j5 = j4;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0) {
                if (i11 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    i4 &= -7169;
                } else {
                    linearTrackColor = j3;
                }
                if (i5 != 0) {
                    iM2270getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw();
                } else {
                    iM2270getLinearStrokeCapKaPHkGw = i6;
                }
            } else {
                if (i11 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    i4 &= -7169;
                } else {
                    linearTrackColor = j3;
                }
                if (i5 != 0) {
                    iM2270getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw();
                } else {
                    iM2270getLinearStrokeCapKaPHkGw = i6;
                }
            }
            j4 = linearColor;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1796992155, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:84)");
            }
            composerStartRestartGroup.startReplaceableGroup(-1348540816);
            if ((i4 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$coercedProgress$1$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            function1 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierThen8 = modifier2.then(IncreaseSemanticsBounds);
            composerStartRestartGroup.startReplaceableGroup(-1348540664);
            zChanged = composerStartRestartGroup.changed(function1);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function1.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function1.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM1049sizeVpY3zN11 = SizeKt.m1049sizeVpY3zN4(SemanticsModifierKt.semantics(modifierThen8, true, (Function1) objRememberedValue2), LinearIndicatorWidth, LinearIndicatorHeight);
            composerStartRestartGroup.startReplaceableGroup(-1348540492);
            if (((i4 & 7168) ^ 3072) <= 2048) {
            }
            if ((57344 & i4) == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            zChanged2 = composerStartRestartGroup.changed(function1);
            if (((i4 & 896) ^ 384) <= 256) {
            }
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (!(z4 | z2 | z3 | zChanged2)) {
                final long j112 = linearTrackColor;
                final int i115 = iM2270getLinearStrokeCapKaPHkGw;
                objRememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        float fM4040getHeightimpl = Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc());
                        ProgressIndicatorKt.m2291drawLinearIndicatorTrackAZGd3zU(drawScope, j112, fM4040getHeightimpl, i115);
                        ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, 0.0f, function1.invoke().floatValue(), j4, fM4040getHeightimpl, i115);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                final long j113 = linearTrackColor;
                final int i116 = iM2270getLinearStrokeCapKaPHkGw;
                objRememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$2$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        float fM4040getHeightimpl = Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc());
                        ProgressIndicatorKt.m2291drawLinearIndicatorTrackAZGd3zU(drawScope, j113, fM4040getHeightimpl, i116);
                        ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, 0.0f, function1.invoke().floatValue(), j4, fM4040getHeightimpl, i116);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM1049sizeVpY3zN11, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i8 = iM2270getLinearStrokeCapKaPHkGw;
            j3 = linearTrackColor;
            j5 = j4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier6 = modifier2;
            final long j114 = j3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i117) {
                    ProgressIndicatorKt.m2279LinearProgressIndicator_5eSRE(function0, modifier6, j5, j114, i8, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0262  */
    /* JADX WARN: Code duplicated, block: B:104:0x028e  */
    /* JADX WARN: Code duplicated, block: B:108:0x029a  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00db A[PHI: r2 r4 r8 r10
  0x00db: PHI (r2v17 androidx.compose.ui.Modifier) = (r2v2 androidx.compose.ui.Modifier), (r2v20 androidx.compose.ui.Modifier) binds: [B:69:0x00ce, B:59:0x00aa] A[DONT_GENERATE, DONT_INLINE]
  0x00db: PHI (r4v16 int) = (r4v12 int), (r4v18 int) binds: [B:69:0x00ce, B:59:0x00aa] A[DONT_GENERATE, DONT_INLINE]
  0x00db: PHI (r8v35 long) = (r8v2 long), (r8v1 long) binds: [B:69:0x00ce, B:59:0x00aa] A[DONT_GENERATE, DONT_INLINE]
  0x00db: PHI (r10v24 long) = (r10v2 long), (r10v1 long) binds: [B:69:0x00ce, B:59:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:77:0x0200  */
    /* JADX WARN: Code duplicated, block: B:80:0x0209  */
    /* JADX WARN: Code duplicated, block: B:83:0x020f A[PHI: r10
  0x020f: PHI (r10v22 long) = (r10v20 long), (r10v23 long) binds: [B:82:0x020d, B:78:0x0206] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x0212  */
    /* JADX WARN: Code duplicated, block: B:87:0x0219  */
    /* JADX WARN: Code duplicated, block: B:88:0x021e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0237  */
    /* JADX WARN: Code duplicated, block: B:93:0x023d  */
    /* JADX WARN: Code duplicated, block: B:99:0x025a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: LinearProgressIndicator-2cYBFYY, reason: not valid java name */
    public static final void m2276LinearProgressIndicator2cYBFYY(Modifier modifier, long j, long j2, int i, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        long linearColor;
        long linearTrackColor;
        int i5;
        Modifier.Companion companion;
        int iM2270getLinearStrokeCapKaPHkGw;
        int i6;
        long j3;
        long j4;
        boolean z;
        int i7;
        long j5;
        final State<Float> stateAnimateFloat;
        final State<Float> stateAnimateFloat2;
        final State<Float> stateAnimateFloat3;
        final State<Float> stateAnimateFloat4;
        long j6;
        boolean z2;
        boolean z3;
        boolean zChanged;
        boolean zChanged2;
        Modifier modifier3;
        boolean zChanged3;
        boolean zChanged4;
        Object objRememberedValue;
        final long j7;
        final int i8;
        final long j8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-476865359);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            linearColor = j;
            i4 |= ((i3 & 2) == 0 && composerStartRestartGroup.changed(linearColor)) ? 32 : 16;
        } else {
            linearColor = j;
        }
        if ((i2 & 384) == 0) {
            linearTrackColor = j2;
            i4 |= ((i3 & 4) == 0 && composerStartRestartGroup.changed(linearTrackColor)) ? 256 : 128;
        } else {
            linearTrackColor = j2;
        }
        int i10 = i3 & 8;
        if (i10 == 0) {
            if ((i2 & 3072) == 0) {
                i5 = i;
                i4 |= composerStartRestartGroup.changed(i5) ? 2048 : 1024;
            }
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i3 & 2) != 0) {
                        i4 &= -113;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    companion = modifier2;
                } else {
                    if (i9 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i3 & 2) != 0) {
                        linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                        i4 &= -113;
                    }
                    if ((i3 & 4) != 0) {
                        linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if (i10 != 0) {
                        iM2270getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw();
                        i6 = i4;
                        j3 = linearColor;
                        j4 = linearTrackColor;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-476865359, i6, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:121)");
                    }
                    InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                    z = true;
                    i7 = i6;
                    j5 = j4;
                    stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            keyframesSpecConfig.setDurationMillis(1800);
                            keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 0), ProgressIndicatorKt.FirstLineHeadEasing);
                            keyframesSpecConfig.at(Float.valueOf(1.0f), 750);
                        }
                    }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                    stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            keyframesSpecConfig.setDurationMillis(1800);
                            keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 333), ProgressIndicatorKt.FirstLineTailEasing);
                            keyframesSpecConfig.at(Float.valueOf(1.0f), 1183);
                        }
                    }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                    stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            keyframesSpecConfig.setDurationMillis(1800);
                            keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 1000), ProgressIndicatorKt.SecondLineHeadEasing);
                            keyframesSpecConfig.at(Float.valueOf(1.0f), 1567);
                        }
                    }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                    stateAnimateFloat4 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, 1.0f, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            keyframesSpecConfig.setDurationMillis(1800);
                            keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 1267), ProgressIndicatorKt.SecondLineTailEasing);
                            keyframesSpecConfig.at(Float.valueOf(1.0f), 1800);
                        }
                    }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                    Modifier modifierM1049sizeVpY3zN4 = SizeKt.m1049sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(companion.then(IncreaseSemanticsBounds)), LinearIndicatorWidth, LinearIndicatorHeight);
                    composerStartRestartGroup.startReplaceableGroup(-1348537245);
                    if (((i7 & 896) ^ 384) > 256) {
                        j6 = j5;
                        if (!composerStartRestartGroup.changed(j6)) {
                            z2 = true;
                        }
                        if ((i7 & 7168) == 2048) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        zChanged = composerStartRestartGroup.changed(r28);
                        zChanged2 = composerStartRestartGroup.changed(stateAnimateFloat2);
                        modifier3 = companion;
                        if ((((i7 & 112) ^ 48) > 32 || !composerStartRestartGroup.changed(j3)) && (i7 & 48) != 32) {
                        }
                        zChanged3 = composerStartRestartGroup.changed(stateAnimateFloat3);
                        zChanged4 = composerStartRestartGroup.changed(stateAnimateFloat4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!(zChanged3 | z2 | z3 | zChanged | zChanged2 | z | zChanged4) || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            final long j9 = j6;
                            final int i11 = iM2270getLinearStrokeCapKaPHkGw;
                            final long j10 = j3;
                            objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                                @Override // kotlin.jvm.functions.Function1
                                public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                    invoke2(drawScope);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(DrawScope drawScope) {
                                    float fM4040getHeightimpl = Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc());
                                    ProgressIndicatorKt.m2291drawLinearIndicatorTrackAZGd3zU(drawScope, j9, fM4040getHeightimpl, i11);
                                    if (stateAnimateFloat.getValue().floatValue() - stateAnimateFloat2.getValue().floatValue() > 0.0f) {
                                        ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat.getValue().floatValue(), stateAnimateFloat2.getValue().floatValue(), j10, fM4040getHeightimpl, i11);
                                    }
                                    if (stateAnimateFloat3.getValue().floatValue() - stateAnimateFloat4.getValue().floatValue() > 0.0f) {
                                        ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat3.getValue().floatValue(), stateAnimateFloat4.getValue().floatValue(), j10, fM4040getHeightimpl, i11);
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CanvasKt.Canvas(modifierM1049sizeVpY3zN4, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j7 = j3;
                        i8 = iM2270getLinearStrokeCapKaPHkGw;
                        j8 = j6;
                    } else {
                        j6 = j5;
                    }
                    if ((i7 & 384) == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((i7 & 7168) == 2048) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zChanged = composerStartRestartGroup.changed(r28);
                    zChanged2 = composerStartRestartGroup.changed(stateAnimateFloat2);
                    modifier3 = companion;
                    z = ((i7 & 112) ^ 48) > 32 ? false : false;
                    zChanged3 = composerStartRestartGroup.changed(stateAnimateFloat3);
                    zChanged4 = composerStartRestartGroup.changed(stateAnimateFloat4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(zChanged3 | z2 | z3 | zChanged | zChanged2 | z | zChanged4)) {
                        final long j11 = j6;
                        final int i12 = iM2270getLinearStrokeCapKaPHkGw;
                        final long j12 = j3;
                        objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                float fM4040getHeightimpl = Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc());
                                ProgressIndicatorKt.m2291drawLinearIndicatorTrackAZGd3zU(drawScope, j11, fM4040getHeightimpl, i12);
                                if (stateAnimateFloat.getValue().floatValue() - stateAnimateFloat2.getValue().floatValue() > 0.0f) {
                                    ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat.getValue().floatValue(), stateAnimateFloat2.getValue().floatValue(), j12, fM4040getHeightimpl, i12);
                                }
                                if (stateAnimateFloat3.getValue().floatValue() - stateAnimateFloat4.getValue().floatValue() > 0.0f) {
                                    ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat3.getValue().floatValue(), stateAnimateFloat4.getValue().floatValue(), j12, fM4040getHeightimpl, i12);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        final long j13 = j6;
                        final int i13 = iM2270getLinearStrokeCapKaPHkGw;
                        final long j14 = j3;
                        objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                float fM4040getHeightimpl = Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc());
                                ProgressIndicatorKt.m2291drawLinearIndicatorTrackAZGd3zU(drawScope, j13, fM4040getHeightimpl, i13);
                                if (stateAnimateFloat.getValue().floatValue() - stateAnimateFloat2.getValue().floatValue() > 0.0f) {
                                    ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat.getValue().floatValue(), stateAnimateFloat2.getValue().floatValue(), j14, fM4040getHeightimpl, i13);
                                }
                                if (stateAnimateFloat3.getValue().floatValue() - stateAnimateFloat4.getValue().floatValue() > 0.0f) {
                                    ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat3.getValue().floatValue(), stateAnimateFloat4.getValue().floatValue(), j14, fM4040getHeightimpl, i13);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM1049sizeVpY3zN4, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j7 = j3;
                    i8 = iM2270getLinearStrokeCapKaPHkGw;
                    j8 = j6;
                }
                j4 = linearTrackColor;
                iM2270getLinearStrokeCapKaPHkGw = i5;
                i6 = i4;
                j3 = linearColor;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-476865359, i6, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:121)");
                }
                InfiniteTransition infiniteTransitionRememberInfiniteTransition2 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                z = true;
                i7 = i6;
                j5 = j4;
                stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 1.0f, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        keyframesSpecConfig.setDurationMillis(1800);
                        keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 0), ProgressIndicatorKt.FirstLineHeadEasing);
                        keyframesSpecConfig.at(Float.valueOf(1.0f), 750);
                    }
                }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 1.0f, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        keyframesSpecConfig.setDurationMillis(1800);
                        keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 333), ProgressIndicatorKt.FirstLineTailEasing);
                        keyframesSpecConfig.at(Float.valueOf(1.0f), 1183);
                    }
                }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 1.0f, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        keyframesSpecConfig.setDurationMillis(1800);
                        keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 1000), ProgressIndicatorKt.SecondLineHeadEasing);
                        keyframesSpecConfig.at(Float.valueOf(1.0f), 1567);
                    }
                }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                stateAnimateFloat4 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, 1.0f, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        keyframesSpecConfig.setDurationMillis(1800);
                        keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 1267), ProgressIndicatorKt.SecondLineTailEasing);
                        keyframesSpecConfig.at(Float.valueOf(1.0f), 1800);
                    }
                }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                Modifier modifierM1049sizeVpY3zN5 = SizeKt.m1049sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(companion.then(IncreaseSemanticsBounds)), LinearIndicatorWidth, LinearIndicatorHeight);
                composerStartRestartGroup.startReplaceableGroup(-1348537245);
                if (((i7 & 896) ^ 384) > 256) {
                    j6 = j5;
                    if (!composerStartRestartGroup.changed(j6)) {
                        z2 = true;
                    }
                    if ((i7 & 7168) == 2048) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zChanged = composerStartRestartGroup.changed(r28);
                    zChanged2 = composerStartRestartGroup.changed(stateAnimateFloat2);
                    modifier3 = companion;
                    if (((i7 & 112) ^ 48) > 32) {
                    }
                    zChanged3 = composerStartRestartGroup.changed(stateAnimateFloat3);
                    zChanged4 = composerStartRestartGroup.changed(stateAnimateFloat4);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(zChanged3 | z2 | z3 | zChanged | zChanged2 | z | zChanged4)) {
                        final long j15 = j6;
                        final int i14 = iM2270getLinearStrokeCapKaPHkGw;
                        final long j16 = j3;
                        objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                float fM4040getHeightimpl = Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc());
                                ProgressIndicatorKt.m2291drawLinearIndicatorTrackAZGd3zU(drawScope, j15, fM4040getHeightimpl, i14);
                                if (stateAnimateFloat.getValue().floatValue() - stateAnimateFloat2.getValue().floatValue() > 0.0f) {
                                    ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat.getValue().floatValue(), stateAnimateFloat2.getValue().floatValue(), j16, fM4040getHeightimpl, i14);
                                }
                                if (stateAnimateFloat3.getValue().floatValue() - stateAnimateFloat4.getValue().floatValue() > 0.0f) {
                                    ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat3.getValue().floatValue(), stateAnimateFloat4.getValue().floatValue(), j16, fM4040getHeightimpl, i14);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        final long j17 = j6;
                        final int i15 = iM2270getLinearStrokeCapKaPHkGw;
                        final long j18 = j3;
                        objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                float fM4040getHeightimpl = Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc());
                                ProgressIndicatorKt.m2291drawLinearIndicatorTrackAZGd3zU(drawScope, j17, fM4040getHeightimpl, i15);
                                if (stateAnimateFloat.getValue().floatValue() - stateAnimateFloat2.getValue().floatValue() > 0.0f) {
                                    ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat.getValue().floatValue(), stateAnimateFloat2.getValue().floatValue(), j18, fM4040getHeightimpl, i15);
                                }
                                if (stateAnimateFloat3.getValue().floatValue() - stateAnimateFloat4.getValue().floatValue() > 0.0f) {
                                    ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat3.getValue().floatValue(), stateAnimateFloat4.getValue().floatValue(), j18, fM4040getHeightimpl, i15);
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM1049sizeVpY3zN5, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j7 = j3;
                    i8 = iM2270getLinearStrokeCapKaPHkGw;
                    j8 = j6;
                } else {
                    j6 = j5;
                }
                if ((i7 & 384) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((i7 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zChanged = composerStartRestartGroup.changed(r28);
                zChanged2 = composerStartRestartGroup.changed(stateAnimateFloat2);
                modifier3 = companion;
                if (((i7 & 112) ^ 48) > 32) {
                }
                zChanged3 = composerStartRestartGroup.changed(stateAnimateFloat3);
                zChanged4 = composerStartRestartGroup.changed(stateAnimateFloat4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(zChanged3 | z2 | z3 | zChanged | zChanged2 | z | zChanged4)) {
                    final long j19 = j6;
                    final int i16 = iM2270getLinearStrokeCapKaPHkGw;
                    final long j110 = j3;
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float fM4040getHeightimpl = Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc());
                            ProgressIndicatorKt.m2291drawLinearIndicatorTrackAZGd3zU(drawScope, j19, fM4040getHeightimpl, i16);
                            if (stateAnimateFloat.getValue().floatValue() - stateAnimateFloat2.getValue().floatValue() > 0.0f) {
                                ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat.getValue().floatValue(), stateAnimateFloat2.getValue().floatValue(), j110, fM4040getHeightimpl, i16);
                            }
                            if (stateAnimateFloat3.getValue().floatValue() - stateAnimateFloat4.getValue().floatValue() > 0.0f) {
                                ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat3.getValue().floatValue(), stateAnimateFloat4.getValue().floatValue(), j110, fM4040getHeightimpl, i16);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    final long j111 = j6;
                    final int i17 = iM2270getLinearStrokeCapKaPHkGw;
                    final long j112 = j3;
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float fM4040getHeightimpl = Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc());
                            ProgressIndicatorKt.m2291drawLinearIndicatorTrackAZGd3zU(drawScope, j111, fM4040getHeightimpl, i17);
                            if (stateAnimateFloat.getValue().floatValue() - stateAnimateFloat2.getValue().floatValue() > 0.0f) {
                                ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat.getValue().floatValue(), stateAnimateFloat2.getValue().floatValue(), j112, fM4040getHeightimpl, i17);
                            }
                            if (stateAnimateFloat3.getValue().floatValue() - stateAnimateFloat4.getValue().floatValue() > 0.0f) {
                                ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat3.getValue().floatValue(), stateAnimateFloat4.getValue().floatValue(), j112, fM4040getHeightimpl, i17);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1049sizeVpY3zN5, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j7 = j3;
                i8 = iM2270getLinearStrokeCapKaPHkGw;
                j8 = j6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                j7 = linearColor;
                j8 = linearTrackColor;
                i8 = i5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i18) {
                        ProgressIndicatorKt.m2276LinearProgressIndicator2cYBFYY(modifier4, j7, j8, i8, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
        }
        i4 |= 3072;
        i5 = i;
        if ((i4 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0) {
                if (i9 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i3 & 2) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    i4 &= -113;
                }
                if ((i3 & 4) != 0) {
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    i4 &= -897;
                }
                if (i10 != 0) {
                    iM2270getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw();
                    i6 = i4;
                    j3 = linearColor;
                    j4 = linearTrackColor;
                } else {
                    j4 = linearTrackColor;
                    iM2270getLinearStrokeCapKaPHkGw = i5;
                    i6 = i4;
                    j3 = linearColor;
                }
            } else {
                if (i9 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i3 & 2) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    i4 &= -113;
                }
                if ((i3 & 4) != 0) {
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    i4 &= -897;
                }
                if (i10 != 0) {
                    iM2270getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw();
                    i6 = i4;
                    j3 = linearColor;
                    j4 = linearTrackColor;
                } else {
                    j4 = linearTrackColor;
                    iM2270getLinearStrokeCapKaPHkGw = i5;
                    i6 = i4;
                    j3 = linearColor;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-476865359, i6, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:121)");
            }
            InfiniteTransition infiniteTransitionRememberInfiniteTransition3 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
            z = true;
            i7 = i6;
            j5 = j4;
            stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition3, 0.0f, 1.0f, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    keyframesSpecConfig.setDurationMillis(1800);
                    keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 0), ProgressIndicatorKt.FirstLineHeadEasing);
                    keyframesSpecConfig.at(Float.valueOf(1.0f), 750);
                }
            }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
            stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition3, 0.0f, 1.0f, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    keyframesSpecConfig.setDurationMillis(1800);
                    keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 333), ProgressIndicatorKt.FirstLineTailEasing);
                    keyframesSpecConfig.at(Float.valueOf(1.0f), 1183);
                }
            }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
            stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition3, 0.0f, 1.0f, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    keyframesSpecConfig.setDurationMillis(1800);
                    keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 1000), ProgressIndicatorKt.SecondLineHeadEasing);
                    keyframesSpecConfig.at(Float.valueOf(1.0f), 1567);
                }
            }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
            stateAnimateFloat4 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition3, 0.0f, 1.0f, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    keyframesSpecConfig.setDurationMillis(1800);
                    keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 1267), ProgressIndicatorKt.SecondLineTailEasing);
                    keyframesSpecConfig.at(Float.valueOf(1.0f), 1800);
                }
            }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
            Modifier modifierM1049sizeVpY3zN6 = SizeKt.m1049sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(companion.then(IncreaseSemanticsBounds)), LinearIndicatorWidth, LinearIndicatorHeight);
            composerStartRestartGroup.startReplaceableGroup(-1348537245);
            if (((i7 & 896) ^ 384) > 256) {
                j6 = j5;
                if (!composerStartRestartGroup.changed(j6)) {
                    z2 = true;
                }
                if ((i7 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zChanged = composerStartRestartGroup.changed(r28);
                zChanged2 = composerStartRestartGroup.changed(stateAnimateFloat2);
                modifier3 = companion;
                if (((i7 & 112) ^ 48) > 32) {
                }
                zChanged3 = composerStartRestartGroup.changed(stateAnimateFloat3);
                zChanged4 = composerStartRestartGroup.changed(stateAnimateFloat4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(zChanged3 | z2 | z3 | zChanged | zChanged2 | z | zChanged4)) {
                    final long j113 = j6;
                    final int i18 = iM2270getLinearStrokeCapKaPHkGw;
                    final long j114 = j3;
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float fM4040getHeightimpl = Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc());
                            ProgressIndicatorKt.m2291drawLinearIndicatorTrackAZGd3zU(drawScope, j113, fM4040getHeightimpl, i18);
                            if (stateAnimateFloat.getValue().floatValue() - stateAnimateFloat2.getValue().floatValue() > 0.0f) {
                                ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat.getValue().floatValue(), stateAnimateFloat2.getValue().floatValue(), j114, fM4040getHeightimpl, i18);
                            }
                            if (stateAnimateFloat3.getValue().floatValue() - stateAnimateFloat4.getValue().floatValue() > 0.0f) {
                                ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat3.getValue().floatValue(), stateAnimateFloat4.getValue().floatValue(), j114, fM4040getHeightimpl, i18);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    final long j115 = j6;
                    final int i19 = iM2270getLinearStrokeCapKaPHkGw;
                    final long j116 = j3;
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float fM4040getHeightimpl = Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc());
                            ProgressIndicatorKt.m2291drawLinearIndicatorTrackAZGd3zU(drawScope, j115, fM4040getHeightimpl, i19);
                            if (stateAnimateFloat.getValue().floatValue() - stateAnimateFloat2.getValue().floatValue() > 0.0f) {
                                ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat.getValue().floatValue(), stateAnimateFloat2.getValue().floatValue(), j116, fM4040getHeightimpl, i19);
                            }
                            if (stateAnimateFloat3.getValue().floatValue() - stateAnimateFloat4.getValue().floatValue() > 0.0f) {
                                ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat3.getValue().floatValue(), stateAnimateFloat4.getValue().floatValue(), j116, fM4040getHeightimpl, i19);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1049sizeVpY3zN6, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j7 = j3;
                i8 = iM2270getLinearStrokeCapKaPHkGw;
                j8 = j6;
            } else {
                j6 = j5;
            }
            if ((i7 & 384) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i7 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            zChanged = composerStartRestartGroup.changed(r28);
            zChanged2 = composerStartRestartGroup.changed(stateAnimateFloat2);
            modifier3 = companion;
            if (((i7 & 112) ^ 48) > 32) {
            }
            zChanged3 = composerStartRestartGroup.changed(stateAnimateFloat3);
            zChanged4 = composerStartRestartGroup.changed(stateAnimateFloat4);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!(zChanged3 | z2 | z3 | zChanged | zChanged2 | z | zChanged4)) {
                final long j117 = j6;
                final int i110 = iM2270getLinearStrokeCapKaPHkGw;
                final long j118 = j3;
                objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        float fM4040getHeightimpl = Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc());
                        ProgressIndicatorKt.m2291drawLinearIndicatorTrackAZGd3zU(drawScope, j117, fM4040getHeightimpl, i110);
                        if (stateAnimateFloat.getValue().floatValue() - stateAnimateFloat2.getValue().floatValue() > 0.0f) {
                            ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat.getValue().floatValue(), stateAnimateFloat2.getValue().floatValue(), j118, fM4040getHeightimpl, i110);
                        }
                        if (stateAnimateFloat3.getValue().floatValue() - stateAnimateFloat4.getValue().floatValue() > 0.0f) {
                            ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat3.getValue().floatValue(), stateAnimateFloat4.getValue().floatValue(), j118, fM4040getHeightimpl, i110);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                final long j119 = j6;
                final int i111 = iM2270getLinearStrokeCapKaPHkGw;
                final long j1110 = j3;
                objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        float fM4040getHeightimpl = Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc());
                        ProgressIndicatorKt.m2291drawLinearIndicatorTrackAZGd3zU(drawScope, j119, fM4040getHeightimpl, i111);
                        if (stateAnimateFloat.getValue().floatValue() - stateAnimateFloat2.getValue().floatValue() > 0.0f) {
                            ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat.getValue().floatValue(), stateAnimateFloat2.getValue().floatValue(), j1110, fM4040getHeightimpl, i111);
                        }
                        if (stateAnimateFloat3.getValue().floatValue() - stateAnimateFloat4.getValue().floatValue() > 0.0f) {
                            ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat3.getValue().floatValue(), stateAnimateFloat4.getValue().floatValue(), j1110, fM4040getHeightimpl, i111);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM1049sizeVpY3zN6, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j7 = j3;
            i8 = iM2270getLinearStrokeCapKaPHkGw;
            j8 = j6;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0) {
                if (i9 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i3 & 2) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    i4 &= -113;
                }
                if ((i3 & 4) != 0) {
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    i4 &= -897;
                }
                if (i10 != 0) {
                    iM2270getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw();
                    i6 = i4;
                    j3 = linearColor;
                    j4 = linearTrackColor;
                } else {
                    j4 = linearTrackColor;
                    iM2270getLinearStrokeCapKaPHkGw = i5;
                    i6 = i4;
                    j3 = linearColor;
                }
            } else {
                if (i9 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i3 & 2) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    i4 &= -113;
                }
                if ((i3 & 4) != 0) {
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    i4 &= -897;
                }
                if (i10 != 0) {
                    iM2270getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw();
                    i6 = i4;
                    j3 = linearColor;
                    j4 = linearTrackColor;
                } else {
                    j4 = linearTrackColor;
                    iM2270getLinearStrokeCapKaPHkGw = i5;
                    i6 = i4;
                    j3 = linearColor;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-476865359, i6, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:121)");
            }
            InfiniteTransition infiniteTransitionRememberInfiniteTransition4 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
            z = true;
            i7 = i6;
            j5 = j4;
            stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition4, 0.0f, 1.0f, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineHead$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    keyframesSpecConfig.setDurationMillis(1800);
                    keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 0), ProgressIndicatorKt.FirstLineHeadEasing);
                    keyframesSpecConfig.at(Float.valueOf(1.0f), 750);
                }
            }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
            stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition4, 0.0f, 1.0f, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$firstLineTail$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    keyframesSpecConfig.setDurationMillis(1800);
                    keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 333), ProgressIndicatorKt.FirstLineTailEasing);
                    keyframesSpecConfig.at(Float.valueOf(1.0f), 1183);
                }
            }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
            stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition4, 0.0f, 1.0f, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineHead$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    keyframesSpecConfig.setDurationMillis(1800);
                    keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 1000), ProgressIndicatorKt.SecondLineHeadEasing);
                    keyframesSpecConfig.at(Float.valueOf(1.0f), 1567);
                }
            }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
            stateAnimateFloat4 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition4, 0.0f, 1.0f, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$secondLineTail$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    keyframesSpecConfig.setDurationMillis(1800);
                    keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 1267), ProgressIndicatorKt.SecondLineTailEasing);
                    keyframesSpecConfig.at(Float.valueOf(1.0f), 1800);
                }
            }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
            Modifier modifierM1049sizeVpY3zN7 = SizeKt.m1049sizeVpY3zN4(ProgressSemanticsKt.progressSemantics(companion.then(IncreaseSemanticsBounds)), LinearIndicatorWidth, LinearIndicatorHeight);
            composerStartRestartGroup.startReplaceableGroup(-1348537245);
            if (((i7 & 896) ^ 384) > 256) {
                j6 = j5;
                if (!composerStartRestartGroup.changed(j6)) {
                    z2 = true;
                }
                if ((i7 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zChanged = composerStartRestartGroup.changed(r28);
                zChanged2 = composerStartRestartGroup.changed(stateAnimateFloat2);
                modifier3 = companion;
                if (((i7 & 112) ^ 48) > 32) {
                }
                zChanged3 = composerStartRestartGroup.changed(stateAnimateFloat3);
                zChanged4 = composerStartRestartGroup.changed(stateAnimateFloat4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(zChanged3 | z2 | z3 | zChanged | zChanged2 | z | zChanged4)) {
                    final long j1111 = j6;
                    final int i112 = iM2270getLinearStrokeCapKaPHkGw;
                    final long j1112 = j3;
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float fM4040getHeightimpl = Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc());
                            ProgressIndicatorKt.m2291drawLinearIndicatorTrackAZGd3zU(drawScope, j1111, fM4040getHeightimpl, i112);
                            if (stateAnimateFloat.getValue().floatValue() - stateAnimateFloat2.getValue().floatValue() > 0.0f) {
                                ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat.getValue().floatValue(), stateAnimateFloat2.getValue().floatValue(), j1112, fM4040getHeightimpl, i112);
                            }
                            if (stateAnimateFloat3.getValue().floatValue() - stateAnimateFloat4.getValue().floatValue() > 0.0f) {
                                ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat3.getValue().floatValue(), stateAnimateFloat4.getValue().floatValue(), j1112, fM4040getHeightimpl, i112);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    final long j1113 = j6;
                    final int i113 = iM2270getLinearStrokeCapKaPHkGw;
                    final long j1114 = j3;
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float fM4040getHeightimpl = Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc());
                            ProgressIndicatorKt.m2291drawLinearIndicatorTrackAZGd3zU(drawScope, j1113, fM4040getHeightimpl, i113);
                            if (stateAnimateFloat.getValue().floatValue() - stateAnimateFloat2.getValue().floatValue() > 0.0f) {
                                ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat.getValue().floatValue(), stateAnimateFloat2.getValue().floatValue(), j1114, fM4040getHeightimpl, i113);
                            }
                            if (stateAnimateFloat3.getValue().floatValue() - stateAnimateFloat4.getValue().floatValue() > 0.0f) {
                                ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat3.getValue().floatValue(), stateAnimateFloat4.getValue().floatValue(), j1114, fM4040getHeightimpl, i113);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1049sizeVpY3zN7, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j7 = j3;
                i8 = iM2270getLinearStrokeCapKaPHkGw;
                j8 = j6;
            } else {
                j6 = j5;
            }
            if ((i7 & 384) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i7 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            zChanged = composerStartRestartGroup.changed(r28);
            zChanged2 = composerStartRestartGroup.changed(stateAnimateFloat2);
            modifier3 = companion;
            if (((i7 & 112) ^ 48) > 32) {
            }
            zChanged3 = composerStartRestartGroup.changed(stateAnimateFloat3);
            zChanged4 = composerStartRestartGroup.changed(stateAnimateFloat4);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!(zChanged3 | z2 | z3 | zChanged | zChanged2 | z | zChanged4)) {
                final long j1115 = j6;
                final int i114 = iM2270getLinearStrokeCapKaPHkGw;
                final long j1116 = j3;
                objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        float fM4040getHeightimpl = Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc());
                        ProgressIndicatorKt.m2291drawLinearIndicatorTrackAZGd3zU(drawScope, j1115, fM4040getHeightimpl, i114);
                        if (stateAnimateFloat.getValue().floatValue() - stateAnimateFloat2.getValue().floatValue() > 0.0f) {
                            ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat.getValue().floatValue(), stateAnimateFloat2.getValue().floatValue(), j1116, fM4040getHeightimpl, i114);
                        }
                        if (stateAnimateFloat3.getValue().floatValue() - stateAnimateFloat4.getValue().floatValue() > 0.0f) {
                            ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat3.getValue().floatValue(), stateAnimateFloat4.getValue().floatValue(), j1116, fM4040getHeightimpl, i114);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                final long j1117 = j6;
                final int i115 = iM2270getLinearStrokeCapKaPHkGw;
                final long j1118 = j3;
                objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$4$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        float fM4040getHeightimpl = Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc());
                        ProgressIndicatorKt.m2291drawLinearIndicatorTrackAZGd3zU(drawScope, j1117, fM4040getHeightimpl, i115);
                        if (stateAnimateFloat.getValue().floatValue() - stateAnimateFloat2.getValue().floatValue() > 0.0f) {
                            ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat.getValue().floatValue(), stateAnimateFloat2.getValue().floatValue(), j1118, fM4040getHeightimpl, i115);
                        }
                        if (stateAnimateFloat3.getValue().floatValue() - stateAnimateFloat4.getValue().floatValue() > 0.0f) {
                            ProgressIndicatorKt.m2290drawLinearIndicatorqYKTg0g(drawScope, stateAnimateFloat3.getValue().floatValue(), stateAnimateFloat4.getValue().floatValue(), j1118, fM4040getHeightimpl, i115);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM1049sizeVpY3zN7, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j7 = j3;
            i8 = iM2270getLinearStrokeCapKaPHkGw;
            j8 = j6;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i116) {
                    ProgressIndicatorKt.m2276LinearProgressIndicator2cYBFYY(modifier5, j7, j8, i8, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:46:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ec A[PHI: r3 r6 r9 r11
  0x00ec: PHI (r3v21 int) = (r3v16 int), (r3v22 int), (r3v23 int) binds: [B:78:0x00df, B:68:0x00ba, B:69:0x00bc] A[DONT_GENERATE, DONT_INLINE]
  0x00ec: PHI (r6v6 androidx.compose.ui.Modifier) = (r6v3 androidx.compose.ui.Modifier), (r6v2 androidx.compose.ui.Modifier), (r6v2 androidx.compose.ui.Modifier) binds: [B:78:0x00df, B:68:0x00ba, B:69:0x00bc] A[DONT_GENERATE, DONT_INLINE]
  0x00ec: PHI (r9v7 long) = (r9v2 long), (r9v1 long), (r9v1 long) binds: [B:78:0x00df, B:68:0x00ba, B:69:0x00bc] A[DONT_GENERATE, DONT_INLINE]
  0x00ec: PHI (r11v6 long) = (r11v2 long), (r11v1 long), (r11v1 long) binds: [B:78:0x00df, B:68:0x00ba, B:69:0x00bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:86:0x010a  */
    /* JADX WARN: Code duplicated, block: B:87:0x010c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0113  */
    /* JADX WARN: Code duplicated, block: B:92:0x011b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0144  */
    /* JADX WARN: Code duplicated, block: B:99:0x0152  */
    @Deprecated(message = "Use the overload that takes `progress` as a lambda", replaceWith = @ReplaceWith(expression = "LinearProgressIndicator(\nprogress = { progress },\nmodifier = modifier,\ncolor = color,\ntrackColor = trackColor,\nstrokeCap = strokeCap,\n)", imports = {}))
    /* JADX INFO: renamed from: LinearProgressIndicator-_5eSR-E, reason: not valid java name */
    public static final void m2278LinearProgressIndicator_5eSRE(final float f, Modifier modifier, long j, long j2, int i, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long linearColor;
        long linearTrackColor;
        int i5;
        int i6;
        int i7;
        int iM2270getLinearStrokeCapKaPHkGw;
        long j3;
        long j4;
        boolean z;
        Object objRememberedValue;
        final int i8;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i9;
        int i10;
        Composer composerStartRestartGroup = composer.startRestartGroup(905419617);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 == 0) {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                linearColor = j;
                if ((i3 & 4) == 0 || !composerStartRestartGroup.changed(linearColor)) {
                    i10 = 128;
                } else {
                    i10 = 256;
                }
                i4 |= i10;
            } else {
                linearColor = j;
            }
            if ((i2 & 3072) == 0) {
                linearTrackColor = j2;
                if ((i3 & 8) == 0 || !composerStartRestartGroup.changed(linearTrackColor)) {
                    i9 = 1024;
                } else {
                    i9 = 2048;
                }
                i4 |= i9;
            } else {
                linearTrackColor = j2;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    i6 = i;
                    if (composerStartRestartGroup.changed(i6)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i4 |= i7;
                }
                if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i11 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                            i4 &= -7169;
                        }
                        if (i5 != 0) {
                            iM2270getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw();
                            j3 = linearColor;
                            j4 = linearTrackColor;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(905419617, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:216)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-1348535908);
                        if ((i4 & 14) == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$6$1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Float invoke() {
                                    return Float.valueOf(f);
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        m2279LinearProgressIndicator_5eSRE((Function0<Float>) objRememberedValue, modifier2, j3, j4, iM2270getLinearStrokeCapKaPHkGw, composerStartRestartGroup, i4 & 65520, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i8 = iM2270getLinearStrokeCapKaPHkGw;
                        j5 = j3;
                        linearTrackColor = j4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                    }
                    j3 = linearColor;
                    j4 = linearTrackColor;
                    iM2270getLinearStrokeCapKaPHkGw = i6;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(905419617, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:216)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-1348535908);
                    if ((i4 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z) {
                        objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$6$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Float invoke() {
                                return Float.valueOf(f);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$6$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Float invoke() {
                                return Float.valueOf(f);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    m2279LinearProgressIndicator_5eSRE((Function0<Float>) objRememberedValue, modifier2, j3, j4, iM2270getLinearStrokeCapKaPHkGw, composerStartRestartGroup, i4 & 65520, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i8 = iM2270getLinearStrokeCapKaPHkGw;
                    j5 = j3;
                    linearTrackColor = j4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    j5 = linearColor;
                    i8 = i6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier3 = modifier2;
                    final long j6 = linearTrackColor;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i12) {
                            ProgressIndicatorKt.m2278LinearProgressIndicator_5eSRE(f, modifier3, j5, j6, i8, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                        }
                    });
                }
            }
            i4 |= 24576;
            i6 = i;
            if ((i4 & 9363) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        iM2270getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw();
                        j3 = linearColor;
                        j4 = linearTrackColor;
                    } else {
                        j3 = linearColor;
                        j4 = linearTrackColor;
                        iM2270getLinearStrokeCapKaPHkGw = i6;
                    }
                } else {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        iM2270getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw();
                        j3 = linearColor;
                        j4 = linearTrackColor;
                    } else {
                        j3 = linearColor;
                        j4 = linearTrackColor;
                        iM2270getLinearStrokeCapKaPHkGw = i6;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(905419617, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:216)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1348535908);
                if ((i4 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z) {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$6$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(f);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$6$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(f);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                m2279LinearProgressIndicator_5eSRE((Function0<Float>) objRememberedValue, modifier2, j3, j4, iM2270getLinearStrokeCapKaPHkGw, composerStartRestartGroup, i4 & 65520, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i8 = iM2270getLinearStrokeCapKaPHkGw;
                j5 = j3;
                linearTrackColor = j4;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        iM2270getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw();
                        j3 = linearColor;
                        j4 = linearTrackColor;
                    } else {
                        j3 = linearColor;
                        j4 = linearTrackColor;
                        iM2270getLinearStrokeCapKaPHkGw = i6;
                    }
                } else {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        iM2270getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw();
                        j3 = linearColor;
                        j4 = linearTrackColor;
                    } else {
                        j3 = linearColor;
                        j4 = linearTrackColor;
                        iM2270getLinearStrokeCapKaPHkGw = i6;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(905419617, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:216)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1348535908);
                if ((i4 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z) {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$6$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(f);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$6$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(f);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                m2279LinearProgressIndicator_5eSRE((Function0<Float>) objRememberedValue, modifier2, j3, j4, iM2270getLinearStrokeCapKaPHkGw, composerStartRestartGroup, i4 & 65520, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i8 = iM2270getLinearStrokeCapKaPHkGw;
                j5 = j3;
                linearTrackColor = j4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier4 = modifier2;
                final long j7 = linearTrackColor;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i12) {
                        ProgressIndicatorKt.m2278LinearProgressIndicator_5eSRE(f, modifier4, j5, j7, i8, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
        }
        i4 |= 48;
        modifier2 = modifier;
        if ((i2 & 384) == 0) {
            linearColor = j;
            if ((i3 & 4) == 0) {
                i10 = 128;
            } else {
                i10 = 128;
            }
            i4 |= i10;
        } else {
            linearColor = j;
        }
        if ((i2 & 3072) == 0) {
            linearTrackColor = j2;
            if ((i3 & 8) == 0) {
                i9 = 1024;
            } else {
                i9 = 1024;
            }
            i4 |= i9;
        } else {
            linearTrackColor = j2;
        }
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i2 & 24576) == 0) {
                i6 = i;
                if (composerStartRestartGroup.changed(i6)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i4 |= i7;
            }
            if ((i4 & 9363) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        iM2270getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw();
                        j3 = linearColor;
                        j4 = linearTrackColor;
                    } else {
                        j3 = linearColor;
                        j4 = linearTrackColor;
                        iM2270getLinearStrokeCapKaPHkGw = i6;
                    }
                } else {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        iM2270getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw();
                        j3 = linearColor;
                        j4 = linearTrackColor;
                    } else {
                        j3 = linearColor;
                        j4 = linearTrackColor;
                        iM2270getLinearStrokeCapKaPHkGw = i6;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(905419617, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:216)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1348535908);
                if ((i4 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z) {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$6$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(f);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$6$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(f);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                m2279LinearProgressIndicator_5eSRE((Function0<Float>) objRememberedValue, modifier2, j3, j4, iM2270getLinearStrokeCapKaPHkGw, composerStartRestartGroup, i4 & 65520, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i8 = iM2270getLinearStrokeCapKaPHkGw;
                j5 = j3;
                linearTrackColor = j4;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        iM2270getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw();
                        j3 = linearColor;
                        j4 = linearTrackColor;
                    } else {
                        j3 = linearColor;
                        j4 = linearTrackColor;
                        iM2270getLinearStrokeCapKaPHkGw = i6;
                    }
                } else {
                    if (i11 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                        i4 &= -7169;
                    }
                    if (i5 != 0) {
                        iM2270getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw();
                        j3 = linearColor;
                        j4 = linearTrackColor;
                    } else {
                        j3 = linearColor;
                        j4 = linearTrackColor;
                        iM2270getLinearStrokeCapKaPHkGw = i6;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(905419617, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:216)");
                }
                composerStartRestartGroup.startReplaceableGroup(-1348535908);
                if ((i4 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z) {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$6$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(f);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$6$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(f);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                m2279LinearProgressIndicator_5eSRE((Function0<Float>) objRememberedValue, modifier2, j3, j4, iM2270getLinearStrokeCapKaPHkGw, composerStartRestartGroup, i4 & 65520, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i8 = iM2270getLinearStrokeCapKaPHkGw;
                j5 = j3;
                linearTrackColor = j4;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier5 = modifier2;
                final long j8 = linearTrackColor;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i12) {
                        ProgressIndicatorKt.m2278LinearProgressIndicator_5eSRE(f, modifier5, j5, j8, i8, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
        }
        i4 |= 24576;
        i6 = i;
        if ((i4 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i11 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    i4 &= -7169;
                }
                if (i5 != 0) {
                    iM2270getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw();
                    j3 = linearColor;
                    j4 = linearTrackColor;
                } else {
                    j3 = linearColor;
                    j4 = linearTrackColor;
                    iM2270getLinearStrokeCapKaPHkGw = i6;
                }
            } else {
                if (i11 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    i4 &= -7169;
                }
                if (i5 != 0) {
                    iM2270getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw();
                    j3 = linearColor;
                    j4 = linearTrackColor;
                } else {
                    j3 = linearColor;
                    j4 = linearTrackColor;
                    iM2270getLinearStrokeCapKaPHkGw = i6;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(905419617, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:216)");
            }
            composerStartRestartGroup.startReplaceableGroup(-1348535908);
            if ((i4 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z) {
                objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$6$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(f);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$6$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(f);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            m2279LinearProgressIndicator_5eSRE((Function0<Float>) objRememberedValue, modifier2, j3, j4, iM2270getLinearStrokeCapKaPHkGw, composerStartRestartGroup, i4 & 65520, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i8 = iM2270getLinearStrokeCapKaPHkGw;
            j5 = j3;
            linearTrackColor = j4;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i11 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    i4 &= -7169;
                }
                if (i5 != 0) {
                    iM2270getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw();
                    j3 = linearColor;
                    j4 = linearTrackColor;
                } else {
                    j3 = linearColor;
                    j4 = linearTrackColor;
                    iM2270getLinearStrokeCapKaPHkGw = i6;
                }
            } else {
                if (i11 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    i4 &= -7169;
                }
                if (i5 != 0) {
                    iM2270getLinearStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw();
                    j3 = linearColor;
                    j4 = linearTrackColor;
                } else {
                    j3 = linearColor;
                    j4 = linearTrackColor;
                    iM2270getLinearStrokeCapKaPHkGw = i6;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(905419617, i4, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:216)");
            }
            composerStartRestartGroup.startReplaceableGroup(-1348535908);
            if ((i4 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z) {
                objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$6$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(f);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$6$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(f);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            m2279LinearProgressIndicator_5eSRE((Function0<Float>) objRememberedValue, modifier2, j3, j4, iM2270getLinearStrokeCapKaPHkGw, composerStartRestartGroup, i4 & 65520, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i8 = iM2270getLinearStrokeCapKaPHkGw;
            j5 = j3;
            linearTrackColor = j4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier6 = modifier2;
            final long j9 = linearTrackColor;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i12) {
                    ProgressIndicatorKt.m2278LinearProgressIndicator_5eSRE(f, modifier6, j5, j9, i8, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cd A[PHI: r3 r4 r8
  0x00cd: PHI (r3v16 int) = (r3v11 int), (r3v18 int) binds: [B:67:0x00bf, B:59:0x00a6] A[DONT_GENERATE, DONT_INLINE]
  0x00cd: PHI (r4v6 androidx.compose.ui.Modifier) = (r4v2 androidx.compose.ui.Modifier), (r4v9 androidx.compose.ui.Modifier) binds: [B:67:0x00bf, B:59:0x00a6] A[DONT_GENERATE, DONT_INLINE]
  0x00cd: PHI (r8v10 long) = (r8v2 long), (r8v1 long) binds: [B:67:0x00bf, B:59:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x0105  */
    /* JADX WARN: Code duplicated, block: B:79:0x0111  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* JADX INFO: renamed from: LinearProgressIndicator-eaDK9VM, reason: not valid java name */
    public static final /* synthetic */ void m2280LinearProgressIndicatoreaDK9VM(final float f, Modifier modifier, long j, long j2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long linearColor;
        long j3;
        Modifier.Companion companion;
        long linearTrackColor;
        long j4;
        final long j5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i4;
        int i5;
        Composer composerStartRestartGroup = composer.startRestartGroup(-372717133);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                linearColor = j;
                if ((i2 & 4) == 0 || !composerStartRestartGroup.changed(linearColor)) {
                    i5 = 128;
                } else {
                    i5 = 256;
                }
                i3 |= i5;
            } else {
                linearColor = j;
            }
            if ((i & 3072) == 0) {
                j3 = j2;
                if ((i2 & 8) == 0 || !composerStartRestartGroup.changed(j3)) {
                    i4 = 1024;
                } else {
                    i4 = 2048;
                }
                i3 |= i4;
            } else {
                j3 = j2;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i6 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                        j4 = linearColor;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-372717133, i3, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:232)");
                    }
                    m2278LinearProgressIndicator_5eSRE(f, companion, j4, linearTrackColor, ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw(), composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    linearColor = j4;
                    j5 = linearTrackColor;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    companion = modifier2;
                }
                j4 = linearColor;
                linearTrackColor = j3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-372717133, i3, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:232)");
                }
                m2278LinearProgressIndicator_5eSRE(f, companion, j4, linearTrackColor, ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw(), composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                linearColor = j4;
                j5 = linearTrackColor;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                companion = modifier2;
                j5 = j3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier3 = companion;
                final long j6 = linearColor;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        ProgressIndicatorKt.m2280LinearProgressIndicatoreaDK9VM(f, modifier3, j6, j5, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) == 0) {
            linearColor = j;
            if ((i2 & 4) == 0) {
                i5 = 128;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        } else {
            linearColor = j;
        }
        if ((i & 3072) == 0) {
            j3 = j2;
            if ((i2 & 8) == 0) {
                i4 = 1024;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        } else {
            j3 = j2;
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i2 & 4) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    j4 = linearColor;
                } else {
                    j4 = linearColor;
                    linearTrackColor = j3;
                }
            } else {
                if (i6 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i2 & 4) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    j4 = linearColor;
                } else {
                    j4 = linearColor;
                    linearTrackColor = j3;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-372717133, i3, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:232)");
            }
            m2278LinearProgressIndicator_5eSRE(f, companion, j4, linearTrackColor, ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw(), composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            linearColor = j4;
            j5 = linearTrackColor;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i2 & 4) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    j4 = linearColor;
                } else {
                    j4 = linearColor;
                    linearTrackColor = j3;
                }
            } else {
                if (i6 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i2 & 4) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    j4 = linearColor;
                } else {
                    j4 = linearColor;
                    linearTrackColor = j3;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-372717133, i3, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:232)");
            }
            m2278LinearProgressIndicator_5eSRE(f, companion, j4, linearTrackColor, ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw(), composerStartRestartGroup, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            linearColor = j4;
            j5 = linearTrackColor;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = companion;
            final long j7 = linearColor;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    ProgressIndicatorKt.m2280LinearProgressIndicatoreaDK9VM(f, modifier4, j7, j5, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* JADX INFO: renamed from: LinearProgressIndicator-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ void m2277LinearProgressIndicatorRIQooxk(Modifier modifier, long j, long j2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long linearColor;
        long linearTrackColor;
        Modifier.Companion companion;
        long j3;
        Composer composerStartRestartGroup = composer.startRestartGroup(585576195);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            linearColor = j;
            i3 |= ((i2 & 2) == 0 && composerStartRestartGroup.changed(linearColor)) ? 32 : 16;
        } else {
            linearColor = j;
        }
        if ((i & 384) == 0) {
            linearTrackColor = j2;
            i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changed(linearTrackColor)) ? 256 : 128;
        } else {
            linearTrackColor = j2;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            companion = modifier2;
            j3 = linearColor;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                companion = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    linearColor = ProgressIndicatorDefaults.INSTANCE.getLinearColor(composerStartRestartGroup, 6);
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    linearTrackColor = ProgressIndicatorDefaults.INSTANCE.getLinearTrackColor(composerStartRestartGroup, 6);
                    i3 &= -897;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                companion = modifier2;
            }
            int i5 = i3;
            j3 = linearColor;
            long j4 = linearTrackColor;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(585576195, i5, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:246)");
            }
            m2276LinearProgressIndicator2cYBFYY(companion, j3, j4, ProgressIndicatorDefaults.INSTANCE.m2270getLinearStrokeCapKaPHkGw(), composerStartRestartGroup, (i5 & 14) | 3072 | (i5 & 112) | (i5 & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            linearTrackColor = j4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier3 = companion;
            final long j5 = j3;
            final long j6 = linearTrackColor;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$LinearProgressIndicator$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    ProgressIndicatorKt.m2277LinearProgressIndicatorRIQooxk(modifier3, j5, j6, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawLinearIndicator-qYKTg0g, reason: not valid java name */
    public static final void m2290drawLinearIndicatorqYKTg0g(DrawScope drawScope, float f, float f2, long j, float f3, int i) {
        float fM4043getWidthimpl = Size.m4043getWidthimpl(drawScope.mo4798getSizeNHjbRc());
        float fM4040getHeightimpl = Size.m4040getHeightimpl(drawScope.mo4798getSizeNHjbRc());
        float f4 = fM4040getHeightimpl / 2.0f;
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.Ltr;
        float f5 = (z ? f : 1.0f - f2) * fM4043getWidthimpl;
        float f6 = (z ? f2 : 1.0f - f) * fM4043getWidthimpl;
        if (StrokeCap.m4585equalsimpl0(i, StrokeCap.INSTANCE.m4589getButtKaPHkGw()) || fM4040getHeightimpl > fM4043getWidthimpl) {
            DrawScope.m4784drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(f5, f4), OffsetKt.Offset(f6, f4), f3, 0, null, 0.0f, null, 0, 496, null);
            return;
        }
        float f7 = f3 / 2.0f;
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo = RangesKt.rangeTo(f7, fM4043getWidthimpl - f7);
        float fFloatValue = ((Number) RangesKt.coerceIn(Float.valueOf(f5), closedFloatingPointRangeRangeTo)).floatValue();
        float fFloatValue2 = ((Number) RangesKt.coerceIn(Float.valueOf(f6), closedFloatingPointRangeRangeTo)).floatValue();
        if (Math.abs(f2 - f) > 0.0f) {
            DrawScope.m4784drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(fFloatValue, f4), OffsetKt.Offset(fFloatValue2, f4), f3, i, null, 0.0f, null, 0, 480, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawLinearIndicatorTrack-AZGd3zU, reason: not valid java name */
    public static final void m2291drawLinearIndicatorTrackAZGd3zU(DrawScope drawScope, long j, float f, int i) {
        m2290drawLinearIndicatorqYKTg0g(drawScope, 0.0f, 1.0f, j, f, i);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x013a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0142  */
    /* JADX WARN: Code duplicated, block: B:106:0x0186  */
    /* JADX WARN: Code duplicated, block: B:108:0x018e  */
    /* JADX WARN: Code duplicated, block: B:111:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:119:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:121:0x01df  */
    /* JADX WARN: Code duplicated, block: B:127:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:129:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:132:0x021b  */
    /* JADX WARN: Code duplicated, block: B:133:0x0225  */
    /* JADX WARN: Code duplicated, block: B:137:0x0231  */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x0101  */
    /* JADX WARN: Code duplicated, block: B:91:0x010c  */
    /* JADX WARN: Code duplicated, block: B:94:0x011c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0131  */
    /* JADX WARN: Code duplicated, block: B:98:0x0133  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: CircularProgressIndicator-DUhRLBM, reason: not valid java name */
    public static final void m2272CircularProgressIndicatorDUhRLBM(final Function0<Float> function0, Modifier modifier, long j, float f, long j2, int i, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long circularColor;
        int i5;
        float fM2269getCircularStrokeWidthD9Ej5fM;
        int i6;
        long circularTrackColor;
        int i7;
        final int iM2267getCircularDeterminateStrokeCapKaPHkGw;
        int i8;
        boolean z;
        Object objRememberedValue;
        final Function0 function1;
        final Stroke stroke;
        boolean zChanged;
        Object objRememberedValue2;
        boolean zChanged2;
        boolean z2;
        boolean zChangedInstance;
        Modifier modifier3;
        int i9;
        boolean z3;
        Object objRememberedValue3;
        final long j3;
        final float f2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i10;
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-761680467);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 == 0) {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                circularColor = j;
                if ((i3 & 4) == 0 || !composerStartRestartGroup.changed(circularColor)) {
                    i11 = 128;
                } else {
                    i11 = 256;
                }
                i4 |= i11;
            } else {
                circularColor = j;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    fM2269getCircularStrokeWidthD9Ej5fM = f;
                    if (composerStartRestartGroup.changed(fM2269getCircularStrokeWidthD9Ej5fM)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                if ((i2 & 24576) == 0) {
                    circularTrackColor = j2;
                    if ((i3 & 16) == 0 || !composerStartRestartGroup.changed(circularTrackColor)) {
                        i10 = 8192;
                    } else {
                        i10 = 16384;
                    }
                    i4 |= i10;
                } else {
                    circularTrackColor = j2;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    iM2267getCircularDeterminateStrokeCapKaPHkGw = i;
                } else {
                    iM2267getCircularDeterminateStrokeCapKaPHkGw = i;
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changed(iM2267getCircularDeterminateStrokeCapKaPHkGw)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i4 |= i8;
                    }
                }
                if ((i4 & 74899) == 74898 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                            i4 &= -897;
                        }
                        if (i5 != 0) {
                            fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i3 & 16) != 0) {
                            circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                            i4 &= -57345;
                        }
                        if (i7 != 0) {
                            iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i3 & 16) != 0) {
                            i4 &= -57345;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-761680467, i4, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:352)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(821866314);
                    if ((i4 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$coercedProgress$1$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Float invoke() {
                                return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    function1 = (Function0) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    stroke = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo694toPx0680j_4(fM2269getCircularStrokeWidthD9Ej5fM), 0.0f, iM2267getCircularDeterminateStrokeCapKaPHkGw, 0, null, 26, null);
                    composerStartRestartGroup.startReplaceableGroup(821866535);
                    zChanged = composerStartRestartGroup.changed(function1);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function1.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    Modifier modifierM1047size3ABfNKs = SizeKt.m1047size3ABfNKs(SemanticsModifierKt.semantics(modifier2, true, (Function1) objRememberedValue2), CircularIndicatorDiameter);
                    composerStartRestartGroup.startReplaceableGroup(821866689);
                    zChanged2 = composerStartRestartGroup.changed(function1);
                    z2 = (((i4 & 57344) ^ 24576) <= 16384 && composerStartRestartGroup.changed(circularTrackColor)) || (i4 & 24576) == 16384;
                    zChangedInstance = composerStartRestartGroup.changedInstance(stroke);
                    modifier3 = modifier2;
                    i9 = iM2267getCircularDeterminateStrokeCapKaPHkGw;
                    z3 = (((i4 & 896) ^ 384) <= 256 && composerStartRestartGroup.changed(circularColor)) || (i4 & 384) == 256;
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!(z2 | zChanged2 | zChangedInstance | z3) || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        final long j4 = circularTrackColor;
                        final long j5 = circularColor;
                        objRememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$2$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                float fFloatValue = function1.invoke().floatValue();
                                ProgressIndicatorKt.m2287drawCircularIndicatorTrackbw27NRU(drawScope, j4, stroke);
                                ProgressIndicatorKt.m2288drawDeterminateCircularIndicator42QJj7c(drawScope, 270.0f, fFloatValue * 360.0f, j5, stroke);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM1047size3ABfNKs, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = i9;
                        j3 = circularColor;
                        f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                        modifier2 = modifier3;
                    } else {
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = i9;
                        modifier2 = modifier3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier4 = modifier2;
                        final long j6 = circularTrackColor;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i13) {
                                ProgressIndicatorKt.m2272CircularProgressIndicatorDUhRLBM(function0, modifier4, j3, f2, j6, iM2267getCircularDeterminateStrokeCapKaPHkGw, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                            }
                        });
                    }
                }
                composerStartRestartGroup.skipToGroupEnd();
                j3 = circularColor;
                f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier5 = modifier2;
                    final long j7 = circularTrackColor;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i13) {
                            ProgressIndicatorKt.m2272CircularProgressIndicatorDUhRLBM(function0, modifier5, j3, f2, j7, iM2267getCircularDeterminateStrokeCapKaPHkGw, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                        }
                    });
                }
            }
            i4 |= 3072;
            fM2269getCircularStrokeWidthD9Ej5fM = f;
            if ((i2 & 24576) == 0) {
                circularTrackColor = j2;
                if ((i3 & 16) == 0) {
                    i10 = 8192;
                } else {
                    i10 = 8192;
                }
                i4 |= i10;
            } else {
                circularTrackColor = j2;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                iM2267getCircularDeterminateStrokeCapKaPHkGw = i;
            } else {
                iM2267getCircularDeterminateStrokeCapKaPHkGw = i;
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(iM2267getCircularDeterminateStrokeCapKaPHkGw)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
            }
            if ((i4 & 74899) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i3 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        i4 &= -57345;
                    }
                    if (i7 != 0) {
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                    }
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i3 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        i4 &= -57345;
                    }
                    if (i7 != 0) {
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-761680467, i4, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:352)");
                }
                composerStartRestartGroup.startReplaceableGroup(821866314);
                if ((i4 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$coercedProgress$1$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$coercedProgress$1$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                function1 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                stroke = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo694toPx0680j_4(fM2269getCircularStrokeWidthD9Ej5fM), 0.0f, iM2267getCircularDeterminateStrokeCapKaPHkGw, 0, null, 26, null);
                composerStartRestartGroup.startReplaceableGroup(821866535);
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function1.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function1.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierM1047size3ABfNKs2 = SizeKt.m1047size3ABfNKs(SemanticsModifierKt.semantics(modifier2, true, (Function1) objRememberedValue2), CircularIndicatorDiameter);
                composerStartRestartGroup.startReplaceableGroup(821866689);
                zChanged2 = composerStartRestartGroup.changed(function1);
                if (((i4 & 57344) ^ 24576) <= 16384) {
                }
                zChangedInstance = composerStartRestartGroup.changedInstance(stroke);
                modifier3 = modifier2;
                i9 = iM2267getCircularDeterminateStrokeCapKaPHkGw;
                if (((i4 & 896) ^ 384) <= 256) {
                }
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!(z2 | zChanged2 | zChangedInstance | z3)) {
                    final long j8 = circularTrackColor;
                    final long j9 = circularColor;
                    objRememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float fFloatValue = function1.invoke().floatValue();
                            ProgressIndicatorKt.m2287drawCircularIndicatorTrackbw27NRU(drawScope, j8, stroke);
                            ProgressIndicatorKt.m2288drawDeterminateCircularIndicator42QJj7c(drawScope, 270.0f, fFloatValue * 360.0f, j9, stroke);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    final long j10 = circularTrackColor;
                    final long j11 = circularColor;
                    objRememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float fFloatValue = function1.invoke().floatValue();
                            ProgressIndicatorKt.m2287drawCircularIndicatorTrackbw27NRU(drawScope, j10, stroke);
                            ProgressIndicatorKt.m2288drawDeterminateCircularIndicator42QJj7c(drawScope, 270.0f, fFloatValue * 360.0f, j11, stroke);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1047size3ABfNKs2, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    iM2267getCircularDeterminateStrokeCapKaPHkGw = i9;
                    j3 = circularColor;
                    f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                    modifier2 = modifier3;
                } else {
                    iM2267getCircularDeterminateStrokeCapKaPHkGw = i9;
                    modifier2 = modifier3;
                    j3 = circularColor;
                    f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                }
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i3 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        i4 &= -57345;
                    }
                    if (i7 != 0) {
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                    }
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i3 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        i4 &= -57345;
                    }
                    if (i7 != 0) {
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-761680467, i4, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:352)");
                }
                composerStartRestartGroup.startReplaceableGroup(821866314);
                if ((i4 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$coercedProgress$1$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$coercedProgress$1$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                function1 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                stroke = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo694toPx0680j_4(fM2269getCircularStrokeWidthD9Ej5fM), 0.0f, iM2267getCircularDeterminateStrokeCapKaPHkGw, 0, null, 26, null);
                composerStartRestartGroup.startReplaceableGroup(821866535);
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function1.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function1.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierM1047size3ABfNKs3 = SizeKt.m1047size3ABfNKs(SemanticsModifierKt.semantics(modifier2, true, (Function1) objRememberedValue2), CircularIndicatorDiameter);
                composerStartRestartGroup.startReplaceableGroup(821866689);
                zChanged2 = composerStartRestartGroup.changed(function1);
                if (((i4 & 57344) ^ 24576) <= 16384) {
                }
                zChangedInstance = composerStartRestartGroup.changedInstance(stroke);
                modifier3 = modifier2;
                i9 = iM2267getCircularDeterminateStrokeCapKaPHkGw;
                if (((i4 & 896) ^ 384) <= 256) {
                }
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!(z2 | zChanged2 | zChangedInstance | z3)) {
                    final long j12 = circularTrackColor;
                    final long j13 = circularColor;
                    objRememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float fFloatValue = function1.invoke().floatValue();
                            ProgressIndicatorKt.m2287drawCircularIndicatorTrackbw27NRU(drawScope, j12, stroke);
                            ProgressIndicatorKt.m2288drawDeterminateCircularIndicator42QJj7c(drawScope, 270.0f, fFloatValue * 360.0f, j13, stroke);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    final long j14 = circularTrackColor;
                    final long j15 = circularColor;
                    objRememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float fFloatValue = function1.invoke().floatValue();
                            ProgressIndicatorKt.m2287drawCircularIndicatorTrackbw27NRU(drawScope, j14, stroke);
                            ProgressIndicatorKt.m2288drawDeterminateCircularIndicator42QJj7c(drawScope, 270.0f, fFloatValue * 360.0f, j15, stroke);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1047size3ABfNKs3, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    iM2267getCircularDeterminateStrokeCapKaPHkGw = i9;
                    j3 = circularColor;
                    f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                    modifier2 = modifier3;
                } else {
                    iM2267getCircularDeterminateStrokeCapKaPHkGw = i9;
                    modifier2 = modifier3;
                    j3 = circularColor;
                    f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier6 = modifier2;
                final long j16 = circularTrackColor;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i13) {
                        ProgressIndicatorKt.m2272CircularProgressIndicatorDUhRLBM(function0, modifier6, j3, f2, j16, iM2267getCircularDeterminateStrokeCapKaPHkGw, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
        }
        i4 |= 48;
        modifier2 = modifier;
        if ((i2 & 384) == 0) {
            circularColor = j;
            if ((i3 & 4) == 0) {
                i11 = 128;
            } else {
                i11 = 128;
            }
            i4 |= i11;
        } else {
            circularColor = j;
        }
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 3072) == 0) {
                fM2269getCircularStrokeWidthD9Ej5fM = f;
                if (composerStartRestartGroup.changed(fM2269getCircularStrokeWidthD9Ej5fM)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            if ((i2 & 24576) == 0) {
                circularTrackColor = j2;
                if ((i3 & 16) == 0) {
                    i10 = 8192;
                } else {
                    i10 = 8192;
                }
                i4 |= i10;
            } else {
                circularTrackColor = j2;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                iM2267getCircularDeterminateStrokeCapKaPHkGw = i;
            } else {
                iM2267getCircularDeterminateStrokeCapKaPHkGw = i;
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(iM2267getCircularDeterminateStrokeCapKaPHkGw)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
            }
            if ((i4 & 74899) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i3 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        i4 &= -57345;
                    }
                    if (i7 != 0) {
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                    }
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i3 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        i4 &= -57345;
                    }
                    if (i7 != 0) {
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-761680467, i4, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:352)");
                }
                composerStartRestartGroup.startReplaceableGroup(821866314);
                if ((i4 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$coercedProgress$1$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$coercedProgress$1$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                function1 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                stroke = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo694toPx0680j_4(fM2269getCircularStrokeWidthD9Ej5fM), 0.0f, iM2267getCircularDeterminateStrokeCapKaPHkGw, 0, null, 26, null);
                composerStartRestartGroup.startReplaceableGroup(821866535);
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function1.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function1.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierM1047size3ABfNKs4 = SizeKt.m1047size3ABfNKs(SemanticsModifierKt.semantics(modifier2, true, (Function1) objRememberedValue2), CircularIndicatorDiameter);
                composerStartRestartGroup.startReplaceableGroup(821866689);
                zChanged2 = composerStartRestartGroup.changed(function1);
                if (((i4 & 57344) ^ 24576) <= 16384) {
                }
                zChangedInstance = composerStartRestartGroup.changedInstance(stroke);
                modifier3 = modifier2;
                i9 = iM2267getCircularDeterminateStrokeCapKaPHkGw;
                if (((i4 & 896) ^ 384) <= 256) {
                }
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!(z2 | zChanged2 | zChangedInstance | z3)) {
                    final long j17 = circularTrackColor;
                    final long j18 = circularColor;
                    objRememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float fFloatValue = function1.invoke().floatValue();
                            ProgressIndicatorKt.m2287drawCircularIndicatorTrackbw27NRU(drawScope, j17, stroke);
                            ProgressIndicatorKt.m2288drawDeterminateCircularIndicator42QJj7c(drawScope, 270.0f, fFloatValue * 360.0f, j18, stroke);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    final long j19 = circularTrackColor;
                    final long j110 = circularColor;
                    objRememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float fFloatValue = function1.invoke().floatValue();
                            ProgressIndicatorKt.m2287drawCircularIndicatorTrackbw27NRU(drawScope, j19, stroke);
                            ProgressIndicatorKt.m2288drawDeterminateCircularIndicator42QJj7c(drawScope, 270.0f, fFloatValue * 360.0f, j110, stroke);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1047size3ABfNKs4, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    iM2267getCircularDeterminateStrokeCapKaPHkGw = i9;
                    j3 = circularColor;
                    f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                    modifier2 = modifier3;
                } else {
                    iM2267getCircularDeterminateStrokeCapKaPHkGw = i9;
                    modifier2 = modifier3;
                    j3 = circularColor;
                    f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                }
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i3 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        i4 &= -57345;
                    }
                    if (i7 != 0) {
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                    }
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i3 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        i4 &= -57345;
                    }
                    if (i7 != 0) {
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-761680467, i4, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:352)");
                }
                composerStartRestartGroup.startReplaceableGroup(821866314);
                if ((i4 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$coercedProgress$1$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$coercedProgress$1$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                function1 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                stroke = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo694toPx0680j_4(fM2269getCircularStrokeWidthD9Ej5fM), 0.0f, iM2267getCircularDeterminateStrokeCapKaPHkGw, 0, null, 26, null);
                composerStartRestartGroup.startReplaceableGroup(821866535);
                zChanged = composerStartRestartGroup.changed(function1);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function1.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function1.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierM1047size3ABfNKs5 = SizeKt.m1047size3ABfNKs(SemanticsModifierKt.semantics(modifier2, true, (Function1) objRememberedValue2), CircularIndicatorDiameter);
                composerStartRestartGroup.startReplaceableGroup(821866689);
                zChanged2 = composerStartRestartGroup.changed(function1);
                if (((i4 & 57344) ^ 24576) <= 16384) {
                }
                zChangedInstance = composerStartRestartGroup.changedInstance(stroke);
                modifier3 = modifier2;
                i9 = iM2267getCircularDeterminateStrokeCapKaPHkGw;
                if (((i4 & 896) ^ 384) <= 256) {
                }
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!(z2 | zChanged2 | zChangedInstance | z3)) {
                    final long j111 = circularTrackColor;
                    final long j112 = circularColor;
                    objRememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float fFloatValue = function1.invoke().floatValue();
                            ProgressIndicatorKt.m2287drawCircularIndicatorTrackbw27NRU(drawScope, j111, stroke);
                            ProgressIndicatorKt.m2288drawDeterminateCircularIndicator42QJj7c(drawScope, 270.0f, fFloatValue * 360.0f, j112, stroke);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    final long j113 = circularTrackColor;
                    final long j114 = circularColor;
                    objRememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            float fFloatValue = function1.invoke().floatValue();
                            ProgressIndicatorKt.m2287drawCircularIndicatorTrackbw27NRU(drawScope, j113, stroke);
                            ProgressIndicatorKt.m2288drawDeterminateCircularIndicator42QJj7c(drawScope, 270.0f, fFloatValue * 360.0f, j114, stroke);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1047size3ABfNKs5, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    iM2267getCircularDeterminateStrokeCapKaPHkGw = i9;
                    j3 = circularColor;
                    f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                    modifier2 = modifier3;
                } else {
                    iM2267getCircularDeterminateStrokeCapKaPHkGw = i9;
                    modifier2 = modifier3;
                    j3 = circularColor;
                    f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier7 = modifier2;
                final long j115 = circularTrackColor;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i13) {
                        ProgressIndicatorKt.m2272CircularProgressIndicatorDUhRLBM(function0, modifier7, j3, f2, j115, iM2267getCircularDeterminateStrokeCapKaPHkGw, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
        }
        i4 |= 3072;
        fM2269getCircularStrokeWidthD9Ej5fM = f;
        if ((i2 & 24576) == 0) {
            circularTrackColor = j2;
            if ((i3 & 16) == 0) {
                i10 = 8192;
            } else {
                i10 = 8192;
            }
            i4 |= i10;
        } else {
            circularTrackColor = j2;
        }
        i7 = i3 & 32;
        if (i7 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            iM2267getCircularDeterminateStrokeCapKaPHkGw = i;
        } else {
            iM2267getCircularDeterminateStrokeCapKaPHkGw = i;
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changed(iM2267getCircularDeterminateStrokeCapKaPHkGw)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
        }
        if ((i4 & 74899) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i4 &= -897;
                }
                if (i5 != 0) {
                    fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                }
                if ((i3 & 16) != 0) {
                    circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    i4 &= -57345;
                }
                if (i7 != 0) {
                    iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                }
            } else {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i4 &= -897;
                }
                if (i5 != 0) {
                    fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                }
                if ((i3 & 16) != 0) {
                    circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    i4 &= -57345;
                }
                if (i7 != 0) {
                    iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-761680467, i4, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:352)");
            }
            composerStartRestartGroup.startReplaceableGroup(821866314);
            if ((i4 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$coercedProgress$1$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$coercedProgress$1$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            function1 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            stroke = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo694toPx0680j_4(fM2269getCircularStrokeWidthD9Ej5fM), 0.0f, iM2267getCircularDeterminateStrokeCapKaPHkGw, 0, null, 26, null);
            composerStartRestartGroup.startReplaceableGroup(821866535);
            zChanged = composerStartRestartGroup.changed(function1);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function1.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function1.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM1047size3ABfNKs6 = SizeKt.m1047size3ABfNKs(SemanticsModifierKt.semantics(modifier2, true, (Function1) objRememberedValue2), CircularIndicatorDiameter);
            composerStartRestartGroup.startReplaceableGroup(821866689);
            zChanged2 = composerStartRestartGroup.changed(function1);
            if (((i4 & 57344) ^ 24576) <= 16384) {
            }
            zChangedInstance = composerStartRestartGroup.changedInstance(stroke);
            modifier3 = modifier2;
            i9 = iM2267getCircularDeterminateStrokeCapKaPHkGw;
            if (((i4 & 896) ^ 384) <= 256) {
            }
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (!(z2 | zChanged2 | zChangedInstance | z3)) {
                final long j116 = circularTrackColor;
                final long j117 = circularColor;
                objRememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$2$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        float fFloatValue = function1.invoke().floatValue();
                        ProgressIndicatorKt.m2287drawCircularIndicatorTrackbw27NRU(drawScope, j116, stroke);
                        ProgressIndicatorKt.m2288drawDeterminateCircularIndicator42QJj7c(drawScope, 270.0f, fFloatValue * 360.0f, j117, stroke);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                final long j118 = circularTrackColor;
                final long j119 = circularColor;
                objRememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$2$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        float fFloatValue = function1.invoke().floatValue();
                        ProgressIndicatorKt.m2287drawCircularIndicatorTrackbw27NRU(drawScope, j118, stroke);
                        ProgressIndicatorKt.m2288drawDeterminateCircularIndicator42QJj7c(drawScope, 270.0f, fFloatValue * 360.0f, j119, stroke);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM1047size3ABfNKs6, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                iM2267getCircularDeterminateStrokeCapKaPHkGw = i9;
                j3 = circularColor;
                f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                modifier2 = modifier3;
            } else {
                iM2267getCircularDeterminateStrokeCapKaPHkGw = i9;
                modifier2 = modifier3;
                j3 = circularColor;
                f2 = fM2269getCircularStrokeWidthD9Ej5fM;
            }
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i4 &= -897;
                }
                if (i5 != 0) {
                    fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                }
                if ((i3 & 16) != 0) {
                    circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    i4 &= -57345;
                }
                if (i7 != 0) {
                    iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                }
            } else {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i4 &= -897;
                }
                if (i5 != 0) {
                    fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                }
                if ((i3 & 16) != 0) {
                    circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    i4 &= -57345;
                }
                if (i7 != 0) {
                    iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-761680467, i4, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:352)");
            }
            composerStartRestartGroup.startReplaceableGroup(821866314);
            if ((i4 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$coercedProgress$1$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$coercedProgress$1$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(RangesKt.coerceIn(function0.invoke().floatValue(), 0.0f, 1.0f));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            function1 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            stroke = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo694toPx0680j_4(fM2269getCircularStrokeWidthD9Ej5fM), 0.0f, iM2267getCircularDeterminateStrokeCapKaPHkGw, 0, null, 26, null);
            composerStartRestartGroup.startReplaceableGroup(821866535);
            zChanged = composerStartRestartGroup.changed(function1);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function1.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function1.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0, 4, null));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM1047size3ABfNKs7 = SizeKt.m1047size3ABfNKs(SemanticsModifierKt.semantics(modifier2, true, (Function1) objRememberedValue2), CircularIndicatorDiameter);
            composerStartRestartGroup.startReplaceableGroup(821866689);
            zChanged2 = composerStartRestartGroup.changed(function1);
            if (((i4 & 57344) ^ 24576) <= 16384) {
            }
            zChangedInstance = composerStartRestartGroup.changedInstance(stroke);
            modifier3 = modifier2;
            i9 = iM2267getCircularDeterminateStrokeCapKaPHkGw;
            if (((i4 & 896) ^ 384) <= 256) {
            }
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (!(z2 | zChanged2 | zChangedInstance | z3)) {
                final long j1110 = circularTrackColor;
                final long j1111 = circularColor;
                objRememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$2$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        float fFloatValue = function1.invoke().floatValue();
                        ProgressIndicatorKt.m2287drawCircularIndicatorTrackbw27NRU(drawScope, j1110, stroke);
                        ProgressIndicatorKt.m2288drawDeterminateCircularIndicator42QJj7c(drawScope, 270.0f, fFloatValue * 360.0f, j1111, stroke);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                final long j1112 = circularTrackColor;
                final long j1113 = circularColor;
                objRememberedValue3 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$2$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        float fFloatValue = function1.invoke().floatValue();
                        ProgressIndicatorKt.m2287drawCircularIndicatorTrackbw27NRU(drawScope, j1112, stroke);
                        ProgressIndicatorKt.m2288drawDeterminateCircularIndicator42QJj7c(drawScope, 270.0f, fFloatValue * 360.0f, j1113, stroke);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM1047size3ABfNKs7, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                iM2267getCircularDeterminateStrokeCapKaPHkGw = i9;
                j3 = circularColor;
                f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                modifier2 = modifier3;
            } else {
                iM2267getCircularDeterminateStrokeCapKaPHkGw = i9;
                modifier2 = modifier3;
                j3 = circularColor;
                f2 = fM2269getCircularStrokeWidthD9Ej5fM;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier8 = modifier2;
            final long j1114 = circularTrackColor;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i13) {
                    ProgressIndicatorKt.m2272CircularProgressIndicatorDUhRLBM(function0, modifier8, j3, f2, j1114, iM2267getCircularDeterminateStrokeCapKaPHkGw, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:103:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:106:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:110:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:116:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:118:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:121:0x031e  */
    /* JADX WARN: Code duplicated, block: B:125:0x032c  */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:86:0x0106 A[PHI: r2 r5 r6 r9 r11
  0x0106: PHI (r2v22 androidx.compose.ui.Modifier) = (r2v2 androidx.compose.ui.Modifier), (r2v25 androidx.compose.ui.Modifier) binds: [B:84:0x00f8, B:71:0x00c8] A[DONT_GENERATE, DONT_INLINE]
  0x0106: PHI (r5v17 int) = (r5v14 int), (r5v19 int) binds: [B:84:0x00f8, B:71:0x00c8] A[DONT_GENERATE, DONT_INLINE]
  0x0106: PHI (r6v7 long) = (r6v3 long), (r6v9 long) binds: [B:84:0x00f8, B:71:0x00c8] A[DONT_GENERATE, DONT_INLINE]
  0x0106: PHI (r9v14 long) = (r9v2 long), (r9v1 long) binds: [B:84:0x00f8, B:71:0x00c8] A[DONT_GENERATE, DONT_INLINE]
  0x0106: PHI (r11v23 float) = (r11v3 float), (r11v2 float) binds: [B:84:0x00f8, B:71:0x00c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x0117  */
    /* JADX WARN: Code duplicated, block: B:92:0x0280  */
    /* JADX WARN: Code duplicated, block: B:96:0x028c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0294 A[PHI: r14 r35
  0x0294: PHI (r14v13 int) = (r14v11 int), (r14v15 int) binds: [B:97:0x0292, B:95:0x0287] A[DONT_GENERATE, DONT_INLINE]
  0x0294: PHI (r35v9 androidx.compose.ui.Modifier) = (r35v7 androidx.compose.ui.Modifier), (r35v10 androidx.compose.ui.Modifier) binds: [B:97:0x0292, B:95:0x0287] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x0299  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: CircularProgressIndicator-LxG7B9w, reason: not valid java name */
    public static final void m2273CircularProgressIndicatorLxG7B9w(Modifier modifier, long j, float f, long j2, int i, Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        long circularColor;
        float fM2269getCircularStrokeWidthD9Ej5fM;
        final long j3;
        int i5;
        int i6;
        int i7;
        Modifier.Companion companion;
        long circularTrackColor;
        int i8;
        long j4;
        float f2;
        int iM2268getCircularIndeterminateStrokeCapKaPHkGw;
        long j5;
        final Stroke stroke;
        int i9;
        final State stateAnimateValue;
        final State<Float> stateAnimateFloat;
        final State<Float> stateAnimateFloat2;
        final State<Float> stateAnimateFloat3;
        Modifier modifier3;
        int i10;
        boolean z;
        boolean zChangedInstance;
        boolean zChanged;
        boolean zChanged2;
        boolean zChanged3;
        boolean zChanged4;
        boolean z2;
        boolean z3;
        Object objRememberedValue;
        final int i11;
        final long j6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-115871647);
        int i12 = i3 & 1;
        if (i12 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            circularColor = j;
            i4 |= ((i3 & 2) == 0 && composerStartRestartGroup.changed(circularColor)) ? 32 : 16;
        } else {
            circularColor = j;
        }
        int i13 = i3 & 4;
        if (i13 == 0) {
            if ((i2 & 384) == 0) {
                fM2269getCircularStrokeWidthD9Ej5fM = f;
                i4 |= composerStartRestartGroup.changed(fM2269getCircularStrokeWidthD9Ej5fM) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    j3 = j2;
                    int i14 = composerStartRestartGroup.changed(j3) ? 2048 : 1024;
                    i4 |= i14;
                } else {
                    j3 = j2;
                }
                i4 |= i14;
            } else {
                j3 = j2;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    i6 = i;
                    if (composerStartRestartGroup.changed(i6)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i4 |= i7;
                }
                if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 2) != 0) {
                            i4 &= -113;
                        }
                        if ((i3 & 8) != 0) {
                            i4 &= -7169;
                        }
                        companion = modifier2;
                        circularTrackColor = j3;
                    } else {
                        if (i12 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if ((i3 & 2) != 0) {
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                            i4 &= -113;
                        }
                        if (i13 != 0) {
                            fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i3 & 8) != 0) {
                            circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                            i4 &= -7169;
                        } else {
                            circularTrackColor = j3;
                        }
                        if (i5 != 0) {
                            i8 = i4;
                            j4 = circularTrackColor;
                            f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                            iM2268getCircularIndeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2268getCircularIndeterminateStrokeCapKaPHkGw();
                            j5 = circularColor;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-115871647, i8, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:395)");
                        }
                        stroke = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo694toPx0680j_4(f2), 0.0f, iM2268getCircularIndeterminateStrokeCapKaPHkGw, 0, null, 26, null);
                        InfiniteTransition infiniteTransitionRememberInfiniteTransition = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                        i9 = i8;
                        stateAnimateValue = InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition, 0, 5, VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 12), 16);
                        stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, BaseRotationAngle, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                        stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, JumpRotationAngle, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                invoke2(keyframesSpecConfig);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                keyframesSpecConfig.setDurationMillis(1332);
                                keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 0), ProgressIndicatorKt.CircularEasing);
                                keyframesSpecConfig.at(Float.valueOf(290.0f), 666);
                            }
                        }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                        stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition, 0.0f, JumpRotationAngle, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                invoke2(keyframesSpecConfig);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                                keyframesSpecConfig.setDurationMillis(1332);
                                keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 666), ProgressIndicatorKt.CircularEasing);
                                keyframesSpecConfig.at(Float.valueOf(290.0f), keyframesSpecConfig.getDurationMillis());
                            }
                        }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                        Modifier modifierM1047size3ABfNKs = SizeKt.m1047size3ABfNKs(ProgressSemanticsKt.progressSemantics(companion), CircularIndicatorDiameter);
                        composerStartRestartGroup.startReplaceableGroup(821870113);
                        j3 = j4;
                        if (((i9 & 7168) ^ 3072) > 2048 || !composerStartRestartGroup.changed(j3)) {
                            modifier3 = companion;
                            i10 = i9;
                            if ((i10 & 3072) != 2048) {
                                z = false;
                            }
                            zChangedInstance = composerStartRestartGroup.changedInstance(r29);
                            zChanged = composerStartRestartGroup.changed(stateAnimateValue);
                            zChanged2 = composerStartRestartGroup.changed(stateAnimateFloat2);
                            zChanged3 = composerStartRestartGroup.changed(stateAnimateFloat3);
                            zChanged4 = composerStartRestartGroup.changed(stateAnimateFloat);
                            int i15 = iM2268getCircularIndeterminateStrokeCapKaPHkGw;
                            if ((i10 & 896) == 256) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            z3 = (((i10 & 112) ^ 48) <= 32 && composerStartRestartGroup.changed(j5)) || (i10 & 48) == 32;
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!(z | zChangedInstance | zChanged | zChanged2 | zChanged3 | zChanged4 | z2 | z3) || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                final float f3 = f2;
                                final long j7 = j5;
                                objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$4$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                        invoke2(drawScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(DrawScope drawScope) {
                                        ProgressIndicatorKt.m2287drawCircularIndicatorTrackbw27NRU(drawScope, j3, stroke);
                                        float fFloatValue = stateAnimateValue.getValue().floatValue();
                                        float fAbs = Math.abs(stateAnimateFloat2.getValue().floatValue() - stateAnimateFloat3.getValue().floatValue());
                                        float fFloatValue2 = stateAnimateFloat.getValue().floatValue();
                                        ProgressIndicatorKt.m2289drawIndeterminateCircularIndicatorhrjfTZI(drawScope, stateAnimateFloat3.getValue().floatValue() + (((fFloatValue * 216.0f) % 360.0f) - 90.0f) + fFloatValue2, f3, fAbs, j7, stroke);
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            CanvasKt.Canvas(modifierM1047size3ABfNKs, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            i11 = i15;
                            j6 = j5;
                            modifier2 = modifier3;
                        } else {
                            modifier3 = companion;
                            i10 = i9;
                        }
                        z = true;
                        zChangedInstance = composerStartRestartGroup.changedInstance(r29);
                        zChanged = composerStartRestartGroup.changed(stateAnimateValue);
                        zChanged2 = composerStartRestartGroup.changed(stateAnimateFloat2);
                        zChanged3 = composerStartRestartGroup.changed(stateAnimateFloat3);
                        zChanged4 = composerStartRestartGroup.changed(stateAnimateFloat);
                        int i16 = iM2268getCircularIndeterminateStrokeCapKaPHkGw;
                        if ((i10 & 896) == 256) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (((i10 & 112) ^ 48) <= 32) {
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!(z | zChangedInstance | zChanged | zChanged2 | zChanged3 | zChanged4 | z2 | z3)) {
                            final float f4 = f2;
                            final long j8 = j5;
                            objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$4$1
                                @Override // kotlin.jvm.functions.Function1
                                public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                    invoke2(drawScope);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(DrawScope drawScope) {
                                    ProgressIndicatorKt.m2287drawCircularIndicatorTrackbw27NRU(drawScope, j3, stroke);
                                    float fFloatValue = stateAnimateValue.getValue().floatValue();
                                    float fAbs = Math.abs(stateAnimateFloat2.getValue().floatValue() - stateAnimateFloat3.getValue().floatValue());
                                    float fFloatValue2 = stateAnimateFloat.getValue().floatValue();
                                    ProgressIndicatorKt.m2289drawIndeterminateCircularIndicatorhrjfTZI(drawScope, stateAnimateFloat3.getValue().floatValue() + (((fFloatValue * 216.0f) % 360.0f) - 90.0f) + fFloatValue2, f4, fAbs, j8, stroke);
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            final float f5 = f2;
                            final long j9 = j5;
                            objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$4$1
                                @Override // kotlin.jvm.functions.Function1
                                public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                    invoke2(drawScope);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(DrawScope drawScope) {
                                    ProgressIndicatorKt.m2287drawCircularIndicatorTrackbw27NRU(drawScope, j3, stroke);
                                    float fFloatValue = stateAnimateValue.getValue().floatValue();
                                    float fAbs = Math.abs(stateAnimateFloat2.getValue().floatValue() - stateAnimateFloat3.getValue().floatValue());
                                    float fFloatValue2 = stateAnimateFloat.getValue().floatValue();
                                    ProgressIndicatorKt.m2289drawIndeterminateCircularIndicatorhrjfTZI(drawScope, stateAnimateFloat3.getValue().floatValue() + (((fFloatValue * 216.0f) % 360.0f) - 90.0f) + fFloatValue2, f5, fAbs, j9, stroke);
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        CanvasKt.Canvas(modifierM1047size3ABfNKs, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        i11 = i16;
                        j6 = j5;
                        modifier2 = modifier3;
                    }
                    i8 = i4;
                    j5 = circularColor;
                    long j10 = circularTrackColor;
                    f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                    iM2268getCircularIndeterminateStrokeCapKaPHkGw = i6;
                    j4 = j10;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-115871647, i8, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:395)");
                    }
                    stroke = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo694toPx0680j_4(f2), 0.0f, iM2268getCircularIndeterminateStrokeCapKaPHkGw, 0, null, 26, null);
                    InfiniteTransition infiniteTransitionRememberInfiniteTransition2 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                    i9 = i8;
                    stateAnimateValue = InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition2, 0, 5, VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 12), 16);
                    stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, BaseRotationAngle, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                    stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, JumpRotationAngle, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            keyframesSpecConfig.setDurationMillis(1332);
                            keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 0), ProgressIndicatorKt.CircularEasing);
                            keyframesSpecConfig.at(Float.valueOf(290.0f), 666);
                        }
                    }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                    stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition2, 0.0f, JumpRotationAngle, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            invoke2(keyframesSpecConfig);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                            keyframesSpecConfig.setDurationMillis(1332);
                            keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 666), ProgressIndicatorKt.CircularEasing);
                            keyframesSpecConfig.at(Float.valueOf(290.0f), keyframesSpecConfig.getDurationMillis());
                        }
                    }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                    Modifier modifierM1047size3ABfNKs2 = SizeKt.m1047size3ABfNKs(ProgressSemanticsKt.progressSemantics(companion), CircularIndicatorDiameter);
                    composerStartRestartGroup.startReplaceableGroup(821870113);
                    j3 = j4;
                    if (((i9 & 7168) ^ 3072) > 2048) {
                        modifier3 = companion;
                        i10 = i9;
                        if ((i10 & 3072) != 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        modifier3 = companion;
                        i10 = i9;
                        if ((i10 & 3072) != 2048) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    zChangedInstance = composerStartRestartGroup.changedInstance(r29);
                    zChanged = composerStartRestartGroup.changed(stateAnimateValue);
                    zChanged2 = composerStartRestartGroup.changed(stateAnimateFloat2);
                    zChanged3 = composerStartRestartGroup.changed(stateAnimateFloat3);
                    zChanged4 = composerStartRestartGroup.changed(stateAnimateFloat);
                    int i17 = iM2268getCircularIndeterminateStrokeCapKaPHkGw;
                    if ((i10 & 896) == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (((i10 & 112) ^ 48) <= 32) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(z | zChangedInstance | zChanged | zChanged2 | zChanged3 | zChanged4 | z2 | z3)) {
                        final float f6 = f2;
                        final long j11 = j5;
                        objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$4$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                ProgressIndicatorKt.m2287drawCircularIndicatorTrackbw27NRU(drawScope, j3, stroke);
                                float fFloatValue = stateAnimateValue.getValue().floatValue();
                                float fAbs = Math.abs(stateAnimateFloat2.getValue().floatValue() - stateAnimateFloat3.getValue().floatValue());
                                float fFloatValue2 = stateAnimateFloat.getValue().floatValue();
                                ProgressIndicatorKt.m2289drawIndeterminateCircularIndicatorhrjfTZI(drawScope, stateAnimateFloat3.getValue().floatValue() + (((fFloatValue * 216.0f) % 360.0f) - 90.0f) + fFloatValue2, f6, fAbs, j11, stroke);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        final float f7 = f2;
                        final long j12 = j5;
                        objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$4$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(DrawScope drawScope) {
                                ProgressIndicatorKt.m2287drawCircularIndicatorTrackbw27NRU(drawScope, j3, stroke);
                                float fFloatValue = stateAnimateValue.getValue().floatValue();
                                float fAbs = Math.abs(stateAnimateFloat2.getValue().floatValue() - stateAnimateFloat3.getValue().floatValue());
                                float fFloatValue2 = stateAnimateFloat.getValue().floatValue();
                                ProgressIndicatorKt.m2289drawIndeterminateCircularIndicatorhrjfTZI(drawScope, stateAnimateFloat3.getValue().floatValue() + (((fFloatValue * 216.0f) % 360.0f) - 90.0f) + fFloatValue2, f7, fAbs, j12, stroke);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    CanvasKt.Canvas(modifierM1047size3ABfNKs2, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    i11 = i17;
                    j6 = j5;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    j6 = circularColor;
                    f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                    i11 = i6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier4 = modifier2;
                    final float f8 = f2;
                    final long j13 = j3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i18) {
                            ProgressIndicatorKt.m2273CircularProgressIndicatorLxG7B9w(modifier4, j6, f8, j13, i11, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                        }
                    });
                }
            }
            i4 |= 24576;
            i6 = i;
            if ((i4 & 9363) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) == 0) {
                    if (i12 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i3 & 2) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i4 &= -113;
                    }
                    if (i13 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i3 & 8) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        i4 &= -7169;
                    } else {
                        circularTrackColor = j3;
                    }
                    if (i5 != 0) {
                        i8 = i4;
                        j4 = circularTrackColor;
                        f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                        iM2268getCircularIndeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2268getCircularIndeterminateStrokeCapKaPHkGw();
                        j5 = circularColor;
                    } else {
                        i8 = i4;
                        j5 = circularColor;
                        long j14 = circularTrackColor;
                        f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                        iM2268getCircularIndeterminateStrokeCapKaPHkGw = i6;
                        j4 = j14;
                    }
                } else {
                    if (i12 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i3 & 2) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i4 &= -113;
                    }
                    if (i13 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i3 & 8) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        i4 &= -7169;
                    } else {
                        circularTrackColor = j3;
                    }
                    if (i5 != 0) {
                        i8 = i4;
                        j4 = circularTrackColor;
                        f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                        iM2268getCircularIndeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2268getCircularIndeterminateStrokeCapKaPHkGw();
                        j5 = circularColor;
                    } else {
                        i8 = i4;
                        j5 = circularColor;
                        long j15 = circularTrackColor;
                        f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                        iM2268getCircularIndeterminateStrokeCapKaPHkGw = i6;
                        j4 = j15;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-115871647, i8, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:395)");
                }
                stroke = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo694toPx0680j_4(f2), 0.0f, iM2268getCircularIndeterminateStrokeCapKaPHkGw, 0, null, 26, null);
                InfiniteTransition infiniteTransitionRememberInfiniteTransition3 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                i9 = i8;
                stateAnimateValue = InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition3, 0, 5, VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 12), 16);
                stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition3, 0.0f, BaseRotationAngle, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition3, 0.0f, JumpRotationAngle, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        keyframesSpecConfig.setDurationMillis(1332);
                        keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 0), ProgressIndicatorKt.CircularEasing);
                        keyframesSpecConfig.at(Float.valueOf(290.0f), 666);
                    }
                }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition3, 0.0f, JumpRotationAngle, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        keyframesSpecConfig.setDurationMillis(1332);
                        keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 666), ProgressIndicatorKt.CircularEasing);
                        keyframesSpecConfig.at(Float.valueOf(290.0f), keyframesSpecConfig.getDurationMillis());
                    }
                }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                Modifier modifierM1047size3ABfNKs3 = SizeKt.m1047size3ABfNKs(ProgressSemanticsKt.progressSemantics(companion), CircularIndicatorDiameter);
                composerStartRestartGroup.startReplaceableGroup(821870113);
                j3 = j4;
                if (((i9 & 7168) ^ 3072) > 2048) {
                    modifier3 = companion;
                    i10 = i9;
                    if ((i10 & 3072) != 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    modifier3 = companion;
                    i10 = i9;
                    if ((i10 & 3072) != 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zChangedInstance = composerStartRestartGroup.changedInstance(r29);
                zChanged = composerStartRestartGroup.changed(stateAnimateValue);
                zChanged2 = composerStartRestartGroup.changed(stateAnimateFloat2);
                zChanged3 = composerStartRestartGroup.changed(stateAnimateFloat3);
                zChanged4 = composerStartRestartGroup.changed(stateAnimateFloat);
                int i18 = iM2268getCircularIndeterminateStrokeCapKaPHkGw;
                if ((i10 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (((i10 & 112) ^ 48) <= 32) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(z | zChangedInstance | zChanged | zChanged2 | zChanged3 | zChanged4 | z2 | z3)) {
                    final float f9 = f2;
                    final long j16 = j5;
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$4$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            ProgressIndicatorKt.m2287drawCircularIndicatorTrackbw27NRU(drawScope, j3, stroke);
                            float fFloatValue = stateAnimateValue.getValue().floatValue();
                            float fAbs = Math.abs(stateAnimateFloat2.getValue().floatValue() - stateAnimateFloat3.getValue().floatValue());
                            float fFloatValue2 = stateAnimateFloat.getValue().floatValue();
                            ProgressIndicatorKt.m2289drawIndeterminateCircularIndicatorhrjfTZI(drawScope, stateAnimateFloat3.getValue().floatValue() + (((fFloatValue * 216.0f) % 360.0f) - 90.0f) + fFloatValue2, f9, fAbs, j16, stroke);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    final float f10 = f2;
                    final long j17 = j5;
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$4$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            ProgressIndicatorKt.m2287drawCircularIndicatorTrackbw27NRU(drawScope, j3, stroke);
                            float fFloatValue = stateAnimateValue.getValue().floatValue();
                            float fAbs = Math.abs(stateAnimateFloat2.getValue().floatValue() - stateAnimateFloat3.getValue().floatValue());
                            float fFloatValue2 = stateAnimateFloat.getValue().floatValue();
                            ProgressIndicatorKt.m2289drawIndeterminateCircularIndicatorhrjfTZI(drawScope, stateAnimateFloat3.getValue().floatValue() + (((fFloatValue * 216.0f) % 360.0f) - 90.0f) + fFloatValue2, f10, fAbs, j17, stroke);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1047size3ABfNKs3, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i11 = i18;
                j6 = j5;
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) == 0) {
                    if (i12 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i3 & 2) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i4 &= -113;
                    }
                    if (i13 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i3 & 8) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        i4 &= -7169;
                    } else {
                        circularTrackColor = j3;
                    }
                    if (i5 != 0) {
                        i8 = i4;
                        j4 = circularTrackColor;
                        f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                        iM2268getCircularIndeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2268getCircularIndeterminateStrokeCapKaPHkGw();
                        j5 = circularColor;
                    } else {
                        i8 = i4;
                        j5 = circularColor;
                        long j18 = circularTrackColor;
                        f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                        iM2268getCircularIndeterminateStrokeCapKaPHkGw = i6;
                        j4 = j18;
                    }
                } else {
                    if (i12 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i3 & 2) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i4 &= -113;
                    }
                    if (i13 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i3 & 8) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        i4 &= -7169;
                    } else {
                        circularTrackColor = j3;
                    }
                    if (i5 != 0) {
                        i8 = i4;
                        j4 = circularTrackColor;
                        f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                        iM2268getCircularIndeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2268getCircularIndeterminateStrokeCapKaPHkGw();
                        j5 = circularColor;
                    } else {
                        i8 = i4;
                        j5 = circularColor;
                        long j19 = circularTrackColor;
                        f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                        iM2268getCircularIndeterminateStrokeCapKaPHkGw = i6;
                        j4 = j19;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-115871647, i8, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:395)");
                }
                stroke = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo694toPx0680j_4(f2), 0.0f, iM2268getCircularIndeterminateStrokeCapKaPHkGw, 0, null, 26, null);
                InfiniteTransition infiniteTransitionRememberInfiniteTransition4 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                i9 = i8;
                stateAnimateValue = InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition4, 0, 5, VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 12), 16);
                stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition4, 0.0f, BaseRotationAngle, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition4, 0.0f, JumpRotationAngle, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        keyframesSpecConfig.setDurationMillis(1332);
                        keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 0), ProgressIndicatorKt.CircularEasing);
                        keyframesSpecConfig.at(Float.valueOf(290.0f), 666);
                    }
                }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition4, 0.0f, JumpRotationAngle, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        keyframesSpecConfig.setDurationMillis(1332);
                        keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 666), ProgressIndicatorKt.CircularEasing);
                        keyframesSpecConfig.at(Float.valueOf(290.0f), keyframesSpecConfig.getDurationMillis());
                    }
                }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                Modifier modifierM1047size3ABfNKs4 = SizeKt.m1047size3ABfNKs(ProgressSemanticsKt.progressSemantics(companion), CircularIndicatorDiameter);
                composerStartRestartGroup.startReplaceableGroup(821870113);
                j3 = j4;
                if (((i9 & 7168) ^ 3072) > 2048) {
                    modifier3 = companion;
                    i10 = i9;
                    if ((i10 & 3072) != 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    modifier3 = companion;
                    i10 = i9;
                    if ((i10 & 3072) != 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zChangedInstance = composerStartRestartGroup.changedInstance(r29);
                zChanged = composerStartRestartGroup.changed(stateAnimateValue);
                zChanged2 = composerStartRestartGroup.changed(stateAnimateFloat2);
                zChanged3 = composerStartRestartGroup.changed(stateAnimateFloat3);
                zChanged4 = composerStartRestartGroup.changed(stateAnimateFloat);
                int i19 = iM2268getCircularIndeterminateStrokeCapKaPHkGw;
                if ((i10 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (((i10 & 112) ^ 48) <= 32) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(z | zChangedInstance | zChanged | zChanged2 | zChanged3 | zChanged4 | z2 | z3)) {
                    final float f11 = f2;
                    final long j110 = j5;
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$4$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            ProgressIndicatorKt.m2287drawCircularIndicatorTrackbw27NRU(drawScope, j3, stroke);
                            float fFloatValue = stateAnimateValue.getValue().floatValue();
                            float fAbs = Math.abs(stateAnimateFloat2.getValue().floatValue() - stateAnimateFloat3.getValue().floatValue());
                            float fFloatValue2 = stateAnimateFloat.getValue().floatValue();
                            ProgressIndicatorKt.m2289drawIndeterminateCircularIndicatorhrjfTZI(drawScope, stateAnimateFloat3.getValue().floatValue() + (((fFloatValue * 216.0f) % 360.0f) - 90.0f) + fFloatValue2, f11, fAbs, j110, stroke);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    final float f12 = f2;
                    final long j111 = j5;
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$4$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            ProgressIndicatorKt.m2287drawCircularIndicatorTrackbw27NRU(drawScope, j3, stroke);
                            float fFloatValue = stateAnimateValue.getValue().floatValue();
                            float fAbs = Math.abs(stateAnimateFloat2.getValue().floatValue() - stateAnimateFloat3.getValue().floatValue());
                            float fFloatValue2 = stateAnimateFloat.getValue().floatValue();
                            ProgressIndicatorKt.m2289drawIndeterminateCircularIndicatorhrjfTZI(drawScope, stateAnimateFloat3.getValue().floatValue() + (((fFloatValue * 216.0f) % 360.0f) - 90.0f) + fFloatValue2, f12, fAbs, j111, stroke);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1047size3ABfNKs4, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i11 = i19;
                j6 = j5;
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier5 = modifier2;
                final float f13 = f2;
                final long j112 = j3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i110) {
                        ProgressIndicatorKt.m2273CircularProgressIndicatorLxG7B9w(modifier5, j6, f13, j112, i11, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
        }
        i4 |= 384;
        fM2269getCircularStrokeWidthD9Ej5fM = f;
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                j3 = j2;
                if (composerStartRestartGroup.changed(j3)) {
                }
                i4 |= i14;
            } else {
                j3 = j2;
            }
            i4 |= i14;
        } else {
            j3 = j2;
        }
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i2 & 24576) == 0) {
                i6 = i;
                if (composerStartRestartGroup.changed(i6)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i4 |= i7;
            }
            if ((i4 & 9363) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) == 0) {
                    if (i12 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i3 & 2) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i4 &= -113;
                    }
                    if (i13 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i3 & 8) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        i4 &= -7169;
                    } else {
                        circularTrackColor = j3;
                    }
                    if (i5 != 0) {
                        i8 = i4;
                        j4 = circularTrackColor;
                        f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                        iM2268getCircularIndeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2268getCircularIndeterminateStrokeCapKaPHkGw();
                        j5 = circularColor;
                    } else {
                        i8 = i4;
                        j5 = circularColor;
                        long j113 = circularTrackColor;
                        f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                        iM2268getCircularIndeterminateStrokeCapKaPHkGw = i6;
                        j4 = j113;
                    }
                } else {
                    if (i12 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i3 & 2) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i4 &= -113;
                    }
                    if (i13 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i3 & 8) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        i4 &= -7169;
                    } else {
                        circularTrackColor = j3;
                    }
                    if (i5 != 0) {
                        i8 = i4;
                        j4 = circularTrackColor;
                        f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                        iM2268getCircularIndeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2268getCircularIndeterminateStrokeCapKaPHkGw();
                        j5 = circularColor;
                    } else {
                        i8 = i4;
                        j5 = circularColor;
                        long j114 = circularTrackColor;
                        f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                        iM2268getCircularIndeterminateStrokeCapKaPHkGw = i6;
                        j4 = j114;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-115871647, i8, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:395)");
                }
                stroke = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo694toPx0680j_4(f2), 0.0f, iM2268getCircularIndeterminateStrokeCapKaPHkGw, 0, null, 26, null);
                InfiniteTransition infiniteTransitionRememberInfiniteTransition5 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                i9 = i8;
                stateAnimateValue = InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition5, 0, 5, VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 12), 16);
                stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition5, 0.0f, BaseRotationAngle, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition5, 0.0f, JumpRotationAngle, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        keyframesSpecConfig.setDurationMillis(1332);
                        keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 0), ProgressIndicatorKt.CircularEasing);
                        keyframesSpecConfig.at(Float.valueOf(290.0f), 666);
                    }
                }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition5, 0.0f, JumpRotationAngle, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        keyframesSpecConfig.setDurationMillis(1332);
                        keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 666), ProgressIndicatorKt.CircularEasing);
                        keyframesSpecConfig.at(Float.valueOf(290.0f), keyframesSpecConfig.getDurationMillis());
                    }
                }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                Modifier modifierM1047size3ABfNKs5 = SizeKt.m1047size3ABfNKs(ProgressSemanticsKt.progressSemantics(companion), CircularIndicatorDiameter);
                composerStartRestartGroup.startReplaceableGroup(821870113);
                j3 = j4;
                if (((i9 & 7168) ^ 3072) > 2048) {
                    modifier3 = companion;
                    i10 = i9;
                    if ((i10 & 3072) != 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    modifier3 = companion;
                    i10 = i9;
                    if ((i10 & 3072) != 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zChangedInstance = composerStartRestartGroup.changedInstance(r29);
                zChanged = composerStartRestartGroup.changed(stateAnimateValue);
                zChanged2 = composerStartRestartGroup.changed(stateAnimateFloat2);
                zChanged3 = composerStartRestartGroup.changed(stateAnimateFloat3);
                zChanged4 = composerStartRestartGroup.changed(stateAnimateFloat);
                int i110 = iM2268getCircularIndeterminateStrokeCapKaPHkGw;
                if ((i10 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (((i10 & 112) ^ 48) <= 32) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(z | zChangedInstance | zChanged | zChanged2 | zChanged3 | zChanged4 | z2 | z3)) {
                    final float f14 = f2;
                    final long j115 = j5;
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$4$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            ProgressIndicatorKt.m2287drawCircularIndicatorTrackbw27NRU(drawScope, j3, stroke);
                            float fFloatValue = stateAnimateValue.getValue().floatValue();
                            float fAbs = Math.abs(stateAnimateFloat2.getValue().floatValue() - stateAnimateFloat3.getValue().floatValue());
                            float fFloatValue2 = stateAnimateFloat.getValue().floatValue();
                            ProgressIndicatorKt.m2289drawIndeterminateCircularIndicatorhrjfTZI(drawScope, stateAnimateFloat3.getValue().floatValue() + (((fFloatValue * 216.0f) % 360.0f) - 90.0f) + fFloatValue2, f14, fAbs, j115, stroke);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    final float f15 = f2;
                    final long j116 = j5;
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$4$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            ProgressIndicatorKt.m2287drawCircularIndicatorTrackbw27NRU(drawScope, j3, stroke);
                            float fFloatValue = stateAnimateValue.getValue().floatValue();
                            float fAbs = Math.abs(stateAnimateFloat2.getValue().floatValue() - stateAnimateFloat3.getValue().floatValue());
                            float fFloatValue2 = stateAnimateFloat.getValue().floatValue();
                            ProgressIndicatorKt.m2289drawIndeterminateCircularIndicatorhrjfTZI(drawScope, stateAnimateFloat3.getValue().floatValue() + (((fFloatValue * 216.0f) % 360.0f) - 90.0f) + fFloatValue2, f15, fAbs, j116, stroke);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1047size3ABfNKs5, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i11 = i110;
                j6 = j5;
                modifier2 = modifier3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) == 0) {
                    if (i12 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i3 & 2) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i4 &= -113;
                    }
                    if (i13 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i3 & 8) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        i4 &= -7169;
                    } else {
                        circularTrackColor = j3;
                    }
                    if (i5 != 0) {
                        i8 = i4;
                        j4 = circularTrackColor;
                        f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                        iM2268getCircularIndeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2268getCircularIndeterminateStrokeCapKaPHkGw();
                        j5 = circularColor;
                    } else {
                        i8 = i4;
                        j5 = circularColor;
                        long j117 = circularTrackColor;
                        f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                        iM2268getCircularIndeterminateStrokeCapKaPHkGw = i6;
                        j4 = j117;
                    }
                } else {
                    if (i12 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i3 & 2) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i4 &= -113;
                    }
                    if (i13 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i3 & 8) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        i4 &= -7169;
                    } else {
                        circularTrackColor = j3;
                    }
                    if (i5 != 0) {
                        i8 = i4;
                        j4 = circularTrackColor;
                        f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                        iM2268getCircularIndeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2268getCircularIndeterminateStrokeCapKaPHkGw();
                        j5 = circularColor;
                    } else {
                        i8 = i4;
                        j5 = circularColor;
                        long j118 = circularTrackColor;
                        f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                        iM2268getCircularIndeterminateStrokeCapKaPHkGw = i6;
                        j4 = j118;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-115871647, i8, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:395)");
                }
                stroke = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo694toPx0680j_4(f2), 0.0f, iM2268getCircularIndeterminateStrokeCapKaPHkGw, 0, null, 26, null);
                InfiniteTransition infiniteTransitionRememberInfiniteTransition6 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
                i9 = i8;
                stateAnimateValue = InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition6, 0, 5, VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 12), 16);
                stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition6, 0.0f, BaseRotationAngle, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition6, 0.0f, JumpRotationAngle, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        keyframesSpecConfig.setDurationMillis(1332);
                        keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 0), ProgressIndicatorKt.CircularEasing);
                        keyframesSpecConfig.at(Float.valueOf(290.0f), 666);
                    }
                }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition6, 0.0f, JumpRotationAngle, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        invoke2(keyframesSpecConfig);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                        keyframesSpecConfig.setDurationMillis(1332);
                        keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 666), ProgressIndicatorKt.CircularEasing);
                        keyframesSpecConfig.at(Float.valueOf(290.0f), keyframesSpecConfig.getDurationMillis());
                    }
                }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
                Modifier modifierM1047size3ABfNKs6 = SizeKt.m1047size3ABfNKs(ProgressSemanticsKt.progressSemantics(companion), CircularIndicatorDiameter);
                composerStartRestartGroup.startReplaceableGroup(821870113);
                j3 = j4;
                if (((i9 & 7168) ^ 3072) > 2048) {
                    modifier3 = companion;
                    i10 = i9;
                    if ((i10 & 3072) != 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    modifier3 = companion;
                    i10 = i9;
                    if ((i10 & 3072) != 2048) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zChangedInstance = composerStartRestartGroup.changedInstance(r29);
                zChanged = composerStartRestartGroup.changed(stateAnimateValue);
                zChanged2 = composerStartRestartGroup.changed(stateAnimateFloat2);
                zChanged3 = composerStartRestartGroup.changed(stateAnimateFloat3);
                zChanged4 = composerStartRestartGroup.changed(stateAnimateFloat);
                int i111 = iM2268getCircularIndeterminateStrokeCapKaPHkGw;
                if ((i10 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (((i10 & 112) ^ 48) <= 32) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(z | zChangedInstance | zChanged | zChanged2 | zChanged3 | zChanged4 | z2 | z3)) {
                    final float f16 = f2;
                    final long j119 = j5;
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$4$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            ProgressIndicatorKt.m2287drawCircularIndicatorTrackbw27NRU(drawScope, j3, stroke);
                            float fFloatValue = stateAnimateValue.getValue().floatValue();
                            float fAbs = Math.abs(stateAnimateFloat2.getValue().floatValue() - stateAnimateFloat3.getValue().floatValue());
                            float fFloatValue2 = stateAnimateFloat.getValue().floatValue();
                            ProgressIndicatorKt.m2289drawIndeterminateCircularIndicatorhrjfTZI(drawScope, stateAnimateFloat3.getValue().floatValue() + (((fFloatValue * 216.0f) % 360.0f) - 90.0f) + fFloatValue2, f16, fAbs, j119, stroke);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    final float f17 = f2;
                    final long j1110 = j5;
                    objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$4$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(DrawScope drawScope) {
                            ProgressIndicatorKt.m2287drawCircularIndicatorTrackbw27NRU(drawScope, j3, stroke);
                            float fFloatValue = stateAnimateValue.getValue().floatValue();
                            float fAbs = Math.abs(stateAnimateFloat2.getValue().floatValue() - stateAnimateFloat3.getValue().floatValue());
                            float fFloatValue2 = stateAnimateFloat.getValue().floatValue();
                            ProgressIndicatorKt.m2289drawIndeterminateCircularIndicatorhrjfTZI(drawScope, stateAnimateFloat3.getValue().floatValue() + (((fFloatValue * 216.0f) % 360.0f) - 90.0f) + fFloatValue2, f17, fAbs, j1110, stroke);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                CanvasKt.Canvas(modifierM1047size3ABfNKs6, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i11 = i111;
                j6 = j5;
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier6 = modifier2;
                final float f18 = f2;
                final long j1111 = j3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i112) {
                        ProgressIndicatorKt.m2273CircularProgressIndicatorLxG7B9w(modifier6, j6, f18, j1111, i11, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
        }
        i4 |= 24576;
        i6 = i;
        if ((i4 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0) {
                if (i12 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i3 & 2) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i4 &= -113;
                }
                if (i13 != 0) {
                    fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                }
                if ((i3 & 8) != 0) {
                    circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    i4 &= -7169;
                } else {
                    circularTrackColor = j3;
                }
                if (i5 != 0) {
                    i8 = i4;
                    j4 = circularTrackColor;
                    f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                    iM2268getCircularIndeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2268getCircularIndeterminateStrokeCapKaPHkGw();
                    j5 = circularColor;
                } else {
                    i8 = i4;
                    j5 = circularColor;
                    long j1112 = circularTrackColor;
                    f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                    iM2268getCircularIndeterminateStrokeCapKaPHkGw = i6;
                    j4 = j1112;
                }
            } else {
                if (i12 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i3 & 2) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i4 &= -113;
                }
                if (i13 != 0) {
                    fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                }
                if ((i3 & 8) != 0) {
                    circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    i4 &= -7169;
                } else {
                    circularTrackColor = j3;
                }
                if (i5 != 0) {
                    i8 = i4;
                    j4 = circularTrackColor;
                    f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                    iM2268getCircularIndeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2268getCircularIndeterminateStrokeCapKaPHkGw();
                    j5 = circularColor;
                } else {
                    i8 = i4;
                    j5 = circularColor;
                    long j1113 = circularTrackColor;
                    f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                    iM2268getCircularIndeterminateStrokeCapKaPHkGw = i6;
                    j4 = j1113;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-115871647, i8, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:395)");
            }
            stroke = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo694toPx0680j_4(f2), 0.0f, iM2268getCircularIndeterminateStrokeCapKaPHkGw, 0, null, 26, null);
            InfiniteTransition infiniteTransitionRememberInfiniteTransition7 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
            i9 = i8;
            stateAnimateValue = InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition7, 0, 5, VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 12), 16);
            stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition7, 0.0f, BaseRotationAngle, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
            stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition7, 0.0f, JumpRotationAngle, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    keyframesSpecConfig.setDurationMillis(1332);
                    keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 0), ProgressIndicatorKt.CircularEasing);
                    keyframesSpecConfig.at(Float.valueOf(290.0f), 666);
                }
            }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
            stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition7, 0.0f, JumpRotationAngle, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    keyframesSpecConfig.setDurationMillis(1332);
                    keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 666), ProgressIndicatorKt.CircularEasing);
                    keyframesSpecConfig.at(Float.valueOf(290.0f), keyframesSpecConfig.getDurationMillis());
                }
            }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
            Modifier modifierM1047size3ABfNKs7 = SizeKt.m1047size3ABfNKs(ProgressSemanticsKt.progressSemantics(companion), CircularIndicatorDiameter);
            composerStartRestartGroup.startReplaceableGroup(821870113);
            j3 = j4;
            if (((i9 & 7168) ^ 3072) > 2048) {
                modifier3 = companion;
                i10 = i9;
                if ((i10 & 3072) != 2048) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                modifier3 = companion;
                i10 = i9;
                if ((i10 & 3072) != 2048) {
                    z = true;
                } else {
                    z = false;
                }
            }
            zChangedInstance = composerStartRestartGroup.changedInstance(r29);
            zChanged = composerStartRestartGroup.changed(stateAnimateValue);
            zChanged2 = composerStartRestartGroup.changed(stateAnimateFloat2);
            zChanged3 = composerStartRestartGroup.changed(stateAnimateFloat3);
            zChanged4 = composerStartRestartGroup.changed(stateAnimateFloat);
            int i112 = iM2268getCircularIndeterminateStrokeCapKaPHkGw;
            if ((i10 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (((i10 & 112) ^ 48) <= 32) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!(z | zChangedInstance | zChanged | zChanged2 | zChanged3 | zChanged4 | z2 | z3)) {
                final float f19 = f2;
                final long j1114 = j5;
                objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$4$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        ProgressIndicatorKt.m2287drawCircularIndicatorTrackbw27NRU(drawScope, j3, stroke);
                        float fFloatValue = stateAnimateValue.getValue().floatValue();
                        float fAbs = Math.abs(stateAnimateFloat2.getValue().floatValue() - stateAnimateFloat3.getValue().floatValue());
                        float fFloatValue2 = stateAnimateFloat.getValue().floatValue();
                        ProgressIndicatorKt.m2289drawIndeterminateCircularIndicatorhrjfTZI(drawScope, stateAnimateFloat3.getValue().floatValue() + (((fFloatValue * 216.0f) % 360.0f) - 90.0f) + fFloatValue2, f19, fAbs, j1114, stroke);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                final float f110 = f2;
                final long j1115 = j5;
                objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$4$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        ProgressIndicatorKt.m2287drawCircularIndicatorTrackbw27NRU(drawScope, j3, stroke);
                        float fFloatValue = stateAnimateValue.getValue().floatValue();
                        float fAbs = Math.abs(stateAnimateFloat2.getValue().floatValue() - stateAnimateFloat3.getValue().floatValue());
                        float fFloatValue2 = stateAnimateFloat.getValue().floatValue();
                        ProgressIndicatorKt.m2289drawIndeterminateCircularIndicatorhrjfTZI(drawScope, stateAnimateFloat3.getValue().floatValue() + (((fFloatValue * 216.0f) % 360.0f) - 90.0f) + fFloatValue2, f110, fAbs, j1115, stroke);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM1047size3ABfNKs7, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i11 = i112;
            j6 = j5;
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) == 0) {
                if (i12 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i3 & 2) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i4 &= -113;
                }
                if (i13 != 0) {
                    fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                }
                if ((i3 & 8) != 0) {
                    circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    i4 &= -7169;
                } else {
                    circularTrackColor = j3;
                }
                if (i5 != 0) {
                    i8 = i4;
                    j4 = circularTrackColor;
                    f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                    iM2268getCircularIndeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2268getCircularIndeterminateStrokeCapKaPHkGw();
                    j5 = circularColor;
                } else {
                    i8 = i4;
                    j5 = circularColor;
                    long j1116 = circularTrackColor;
                    f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                    iM2268getCircularIndeterminateStrokeCapKaPHkGw = i6;
                    j4 = j1116;
                }
            } else {
                if (i12 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i3 & 2) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i4 &= -113;
                }
                if (i13 != 0) {
                    fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                }
                if ((i3 & 8) != 0) {
                    circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    i4 &= -7169;
                } else {
                    circularTrackColor = j3;
                }
                if (i5 != 0) {
                    i8 = i4;
                    j4 = circularTrackColor;
                    f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                    iM2268getCircularIndeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2268getCircularIndeterminateStrokeCapKaPHkGw();
                    j5 = circularColor;
                } else {
                    i8 = i4;
                    j5 = circularColor;
                    long j1117 = circularTrackColor;
                    f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                    iM2268getCircularIndeterminateStrokeCapKaPHkGw = i6;
                    j4 = j1117;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-115871647, i8, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:395)");
            }
            stroke = new Stroke(((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo694toPx0680j_4(f2), 0.0f, iM2268getCircularIndeterminateStrokeCapKaPHkGw, 0, null, 26, null);
            InfiniteTransition infiniteTransitionRememberInfiniteTransition8 = InfiniteTransitionKt.rememberInfiniteTransition(null, composerStartRestartGroup, 0, 1);
            i9 = i8;
            stateAnimateValue = InfiniteTransitionKt.animateValue(infiniteTransitionRememberInfiniteTransition8, 0, 5, VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(6660, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 12), 16);
            stateAnimateFloat = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition8, 0.0f, BaseRotationAngle, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(RotationDuration, 0, EasingKt.getLinearEasing(), 2, null), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
            stateAnimateFloat2 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition8, 0.0f, JumpRotationAngle, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$endAngle$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    keyframesSpecConfig.setDurationMillis(1332);
                    keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 0), ProgressIndicatorKt.CircularEasing);
                    keyframesSpecConfig.at(Float.valueOf(290.0f), 666);
                }
            }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
            stateAnimateFloat3 = InfiniteTransitionKt.animateFloat(infiniteTransitionRememberInfiniteTransition8, 0.0f, JumpRotationAngle, AnimationSpecKt.m460infiniteRepeatable9IiC70o$default(AnimationSpecKt.keyframes(new Function1<KeyframesSpec.KeyframesSpecConfig<Float>, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$startAngle$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    invoke2(keyframesSpecConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(KeyframesSpec.KeyframesSpecConfig<Float> keyframesSpecConfig) {
                    keyframesSpecConfig.setDurationMillis(1332);
                    keyframesSpecConfig.using(keyframesSpecConfig.at(Float.valueOf(0.0f), 666), ProgressIndicatorKt.CircularEasing);
                    keyframesSpecConfig.at(Float.valueOf(290.0f), keyframesSpecConfig.getDurationMillis());
                }
            }), null, 0L, 6, null), null, composerStartRestartGroup, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
            Modifier modifierM1047size3ABfNKs8 = SizeKt.m1047size3ABfNKs(ProgressSemanticsKt.progressSemantics(companion), CircularIndicatorDiameter);
            composerStartRestartGroup.startReplaceableGroup(821870113);
            j3 = j4;
            if (((i9 & 7168) ^ 3072) > 2048) {
                modifier3 = companion;
                i10 = i9;
                if ((i10 & 3072) != 2048) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                modifier3 = companion;
                i10 = i9;
                if ((i10 & 3072) != 2048) {
                    z = true;
                } else {
                    z = false;
                }
            }
            zChangedInstance = composerStartRestartGroup.changedInstance(r29);
            zChanged = composerStartRestartGroup.changed(stateAnimateValue);
            zChanged2 = composerStartRestartGroup.changed(stateAnimateFloat2);
            zChanged3 = composerStartRestartGroup.changed(stateAnimateFloat3);
            zChanged4 = composerStartRestartGroup.changed(stateAnimateFloat);
            int i113 = iM2268getCircularIndeterminateStrokeCapKaPHkGw;
            if ((i10 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (((i10 & 112) ^ 48) <= 32) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!(z | zChangedInstance | zChanged | zChanged2 | zChanged3 | zChanged4 | z2 | z3)) {
                final float f111 = f2;
                final long j1118 = j5;
                objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$4$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        ProgressIndicatorKt.m2287drawCircularIndicatorTrackbw27NRU(drawScope, j3, stroke);
                        float fFloatValue = stateAnimateValue.getValue().floatValue();
                        float fAbs = Math.abs(stateAnimateFloat2.getValue().floatValue() - stateAnimateFloat3.getValue().floatValue());
                        float fFloatValue2 = stateAnimateFloat.getValue().floatValue();
                        ProgressIndicatorKt.m2289drawIndeterminateCircularIndicatorhrjfTZI(drawScope, stateAnimateFloat3.getValue().floatValue() + (((fFloatValue * 216.0f) % 360.0f) - 90.0f) + fFloatValue2, f111, fAbs, j1118, stroke);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                final float f112 = f2;
                final long j1119 = j5;
                objRememberedValue = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$4$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        ProgressIndicatorKt.m2287drawCircularIndicatorTrackbw27NRU(drawScope, j3, stroke);
                        float fFloatValue = stateAnimateValue.getValue().floatValue();
                        float fAbs = Math.abs(stateAnimateFloat2.getValue().floatValue() - stateAnimateFloat3.getValue().floatValue());
                        float fFloatValue2 = stateAnimateFloat.getValue().floatValue();
                        ProgressIndicatorKt.m2289drawIndeterminateCircularIndicatorhrjfTZI(drawScope, stateAnimateFloat3.getValue().floatValue() + (((fFloatValue * 216.0f) % 360.0f) - 90.0f) + fFloatValue2, f112, fAbs, j1119, stroke);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            CanvasKt.Canvas(modifierM1047size3ABfNKs8, (Function1) objRememberedValue, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            i11 = i113;
            j6 = j5;
            modifier2 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier7 = modifier2;
            final float f113 = f2;
            final long j11110 = j3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i114) {
                    ProgressIndicatorKt.m2273CircularProgressIndicatorLxG7B9w(modifier7, j6, f113, j11110, i11, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x013e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0140  */
    /* JADX WARN: Code duplicated, block: B:105:0x0147  */
    /* JADX WARN: Code duplicated, block: B:107:0x014f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0179  */
    /* JADX WARN: Code duplicated, block: B:114:0x0186  */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0090  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:60:0x009a  */
    /* JADX WARN: Code duplicated, block: B:62:0x009d  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:92:0x0107  */
    /* JADX WARN: Code duplicated, block: B:94:0x0112  */
    /* JADX WARN: Code duplicated, block: B:95:0x011d A[PHI: r3 r6 r7 r11 r12
  0x011d: PHI (r3v24 int) = (r3v18 int), (r3v26 int), (r3v27 int) binds: [B:93:0x0110, B:81:0x00e2, B:82:0x00e4] A[DONT_GENERATE, DONT_INLINE]
  0x011d: PHI (r6v6 androidx.compose.ui.Modifier) = (r6v3 androidx.compose.ui.Modifier), (r6v2 androidx.compose.ui.Modifier), (r6v2 androidx.compose.ui.Modifier) binds: [B:93:0x0110, B:81:0x00e2, B:82:0x00e4] A[DONT_GENERATE, DONT_INLINE]
  0x011d: PHI (r7v10 long) = (r7v7 long), (r7v6 long), (r7v6 long) binds: [B:93:0x0110, B:81:0x00e2, B:82:0x00e4] A[DONT_GENERATE, DONT_INLINE]
  0x011d: PHI (r11v18 float) = (r11v3 float), (r11v2 float), (r11v2 float) binds: [B:93:0x0110, B:81:0x00e2, B:82:0x00e4] A[DONT_GENERATE, DONT_INLINE]
  0x011d: PHI (r12v18 long) = (r12v7 long), (r12v6 long), (r12v6 long) binds: [B:93:0x0110, B:81:0x00e2, B:82:0x00e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x012a  */
    @Deprecated(message = "Use the overload that takes `progress` as a lambda", replaceWith = @ReplaceWith(expression = "CircularProgressIndicator(\nprogress = { progress },\nmodifier = modifier,\ncolor = color,\nstrokeWidth = strokeWidth,\ntrackColor = trackColor,\nstrokeCap = strokeCap,\n)", imports = {}))
    /* JADX INFO: renamed from: CircularProgressIndicator-DUhRLBM, reason: not valid java name */
    public static final void m2271CircularProgressIndicatorDUhRLBM(final float f, Modifier modifier, long j, float f2, long j2, int i, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        long circularColor;
        int i5;
        float fM2269getCircularStrokeWidthD9Ej5fM;
        int i6;
        long circularTrackColor;
        int i7;
        int i8;
        int i9;
        int iM2267getCircularDeterminateStrokeCapKaPHkGw;
        int i10;
        float f3;
        long j3;
        boolean z;
        Object objRememberedValue;
        final long j4;
        final int i11;
        final float f4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1472321743);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i12 = i3 & 2;
        if (i12 == 0) {
            if ((i2 & 48) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                if ((i3 & 4) == 0) {
                    circularColor = j;
                    int i13 = composerStartRestartGroup.changed(circularColor) ? 256 : 128;
                    i4 |= i13;
                } else {
                    circularColor = j;
                }
                i4 |= i13;
            } else {
                circularColor = j;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    fM2269getCircularStrokeWidthD9Ej5fM = f2;
                    if (composerStartRestartGroup.changed(fM2269getCircularStrokeWidthD9Ej5fM)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                if ((i2 & 24576) == 0) {
                    if ((i3 & 16) == 0) {
                        circularTrackColor = j2;
                        int i14 = composerStartRestartGroup.changed(circularTrackColor) ? 16384 : 8192;
                        i4 |= i14;
                    } else {
                        circularTrackColor = j2;
                    }
                    i4 |= i14;
                } else {
                    circularTrackColor = j2;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    if ((196608 & i2) == 0) {
                        i8 = i;
                        if (composerStartRestartGroup.changed(i8)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i4 |= i9;
                    }
                    if ((i4 & 74899) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i12 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i3 & 4) != 0) {
                                circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                                i4 &= -897;
                            }
                            if (i5 != 0) {
                                fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                            }
                            if ((i3 & 16) != 0) {
                                circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                                i4 &= -57345;
                            }
                            if (i7 != 0) {
                                iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                                i10 = i4;
                                f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                                j3 = circularTrackColor;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1472321743, i10, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:491)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(821871588);
                            if ((i10 & 14) == 4) {
                                z = true;
                            } else {
                                z = false;
                            }
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Float invoke() {
                                        return Float.valueOf(f);
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            m2272CircularProgressIndicatorDUhRLBM((Function0<Float>) objRememberedValue, modifier2, circularColor, f3, j3, iM2267getCircularDeterminateStrokeCapKaPHkGw, composerStartRestartGroup, i10 & 524272, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            circularTrackColor = j3;
                            j4 = circularColor;
                            i11 = iM2267getCircularDeterminateStrokeCapKaPHkGw;
                            f4 = f3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                        }
                        i10 = i4;
                        f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                        j3 = circularTrackColor;
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = i8;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1472321743, i10, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:491)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(821871588);
                        if ((i10 & 14) == 4) {
                            z = true;
                        } else {
                            z = false;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z) {
                            objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Float invoke() {
                                    return Float.valueOf(f);
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        } else {
                            objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Float invoke() {
                                    return Float.valueOf(f);
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        m2272CircularProgressIndicatorDUhRLBM((Function0<Float>) objRememberedValue, modifier2, circularColor, f3, j3, iM2267getCircularDeterminateStrokeCapKaPHkGw, composerStartRestartGroup, i10 & 524272, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        circularTrackColor = j3;
                        j4 = circularColor;
                        i11 = iM2267getCircularDeterminateStrokeCapKaPHkGw;
                        f4 = f3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        j4 = circularColor;
                        f4 = fM2269getCircularStrokeWidthD9Ej5fM;
                        i11 = i8;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier3 = modifier2;
                        final long j5 = circularTrackColor;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$7
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i15) {
                                ProgressIndicatorKt.m2271CircularProgressIndicatorDUhRLBM(f, modifier3, j4, f4, j5, i11, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                            }
                        });
                    }
                }
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i8 = i;
                if ((i4 & 74899) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                            i4 &= -897;
                        }
                        if (i5 != 0) {
                            fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i3 & 16) != 0) {
                            circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                            i4 &= -57345;
                        }
                        if (i7 != 0) {
                            iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                            i10 = i4;
                            f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                            j3 = circularTrackColor;
                        } else {
                            i10 = i4;
                            f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                            j3 = circularTrackColor;
                            iM2267getCircularDeterminateStrokeCapKaPHkGw = i8;
                        }
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                            i4 &= -897;
                        }
                        if (i5 != 0) {
                            fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i3 & 16) != 0) {
                            circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                            i4 &= -57345;
                        }
                        if (i7 != 0) {
                            iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                            i10 = i4;
                            f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                            j3 = circularTrackColor;
                        } else {
                            i10 = i4;
                            f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                            j3 = circularTrackColor;
                            iM2267getCircularDeterminateStrokeCapKaPHkGw = i8;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1472321743, i10, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:491)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(821871588);
                    if ((i10 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z) {
                        objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Float invoke() {
                                return Float.valueOf(f);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Float invoke() {
                                return Float.valueOf(f);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    m2272CircularProgressIndicatorDUhRLBM((Function0<Float>) objRememberedValue, modifier2, circularColor, f3, j3, iM2267getCircularDeterminateStrokeCapKaPHkGw, composerStartRestartGroup, i10 & 524272, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    circularTrackColor = j3;
                    j4 = circularColor;
                    i11 = iM2267getCircularDeterminateStrokeCapKaPHkGw;
                    f4 = f3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                            i4 &= -897;
                        }
                        if (i5 != 0) {
                            fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i3 & 16) != 0) {
                            circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                            i4 &= -57345;
                        }
                        if (i7 != 0) {
                            iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                            i10 = i4;
                            f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                            j3 = circularTrackColor;
                        } else {
                            i10 = i4;
                            f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                            j3 = circularTrackColor;
                            iM2267getCircularDeterminateStrokeCapKaPHkGw = i8;
                        }
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                            i4 &= -897;
                        }
                        if (i5 != 0) {
                            fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i3 & 16) != 0) {
                            circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                            i4 &= -57345;
                        }
                        if (i7 != 0) {
                            iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                            i10 = i4;
                            f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                            j3 = circularTrackColor;
                        } else {
                            i10 = i4;
                            f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                            j3 = circularTrackColor;
                            iM2267getCircularDeterminateStrokeCapKaPHkGw = i8;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1472321743, i10, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:491)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(821871588);
                    if ((i10 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z) {
                        objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Float invoke() {
                                return Float.valueOf(f);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Float invoke() {
                                return Float.valueOf(f);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    m2272CircularProgressIndicatorDUhRLBM((Function0<Float>) objRememberedValue, modifier2, circularColor, f3, j3, iM2267getCircularDeterminateStrokeCapKaPHkGw, composerStartRestartGroup, i10 & 524272, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    circularTrackColor = j3;
                    j4 = circularColor;
                    i11 = iM2267getCircularDeterminateStrokeCapKaPHkGw;
                    f4 = f3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier4 = modifier2;
                    final long j6 = circularTrackColor;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i15) {
                            ProgressIndicatorKt.m2271CircularProgressIndicatorDUhRLBM(f, modifier4, j4, f4, j6, i11, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                        }
                    });
                }
            }
            i4 |= 3072;
            fM2269getCircularStrokeWidthD9Ej5fM = f2;
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    circularTrackColor = j2;
                    if (composerStartRestartGroup.changed(circularTrackColor)) {
                    }
                    i4 |= i14;
                } else {
                    circularTrackColor = j2;
                }
                i4 |= i14;
            } else {
                circularTrackColor = j2;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((196608 & i2) == 0) {
                    i8 = i;
                    if (composerStartRestartGroup.changed(i8)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
                if ((i4 & 74899) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                            i4 &= -897;
                        }
                        if (i5 != 0) {
                            fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i3 & 16) != 0) {
                            circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                            i4 &= -57345;
                        }
                        if (i7 != 0) {
                            iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                            i10 = i4;
                            f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                            j3 = circularTrackColor;
                        } else {
                            i10 = i4;
                            f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                            j3 = circularTrackColor;
                            iM2267getCircularDeterminateStrokeCapKaPHkGw = i8;
                        }
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                            i4 &= -897;
                        }
                        if (i5 != 0) {
                            fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i3 & 16) != 0) {
                            circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                            i4 &= -57345;
                        }
                        if (i7 != 0) {
                            iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                            i10 = i4;
                            f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                            j3 = circularTrackColor;
                        } else {
                            i10 = i4;
                            f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                            j3 = circularTrackColor;
                            iM2267getCircularDeterminateStrokeCapKaPHkGw = i8;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1472321743, i10, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:491)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(821871588);
                    if ((i10 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z) {
                        objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Float invoke() {
                                return Float.valueOf(f);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Float invoke() {
                                return Float.valueOf(f);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    m2272CircularProgressIndicatorDUhRLBM((Function0<Float>) objRememberedValue, modifier2, circularColor, f3, j3, iM2267getCircularDeterminateStrokeCapKaPHkGw, composerStartRestartGroup, i10 & 524272, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    circularTrackColor = j3;
                    j4 = circularColor;
                    i11 = iM2267getCircularDeterminateStrokeCapKaPHkGw;
                    f4 = f3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                            i4 &= -897;
                        }
                        if (i5 != 0) {
                            fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i3 & 16) != 0) {
                            circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                            i4 &= -57345;
                        }
                        if (i7 != 0) {
                            iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                            i10 = i4;
                            f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                            j3 = circularTrackColor;
                        } else {
                            i10 = i4;
                            f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                            j3 = circularTrackColor;
                            iM2267getCircularDeterminateStrokeCapKaPHkGw = i8;
                        }
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                            i4 &= -897;
                        }
                        if (i5 != 0) {
                            fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i3 & 16) != 0) {
                            circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                            i4 &= -57345;
                        }
                        if (i7 != 0) {
                            iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                            i10 = i4;
                            f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                            j3 = circularTrackColor;
                        } else {
                            i10 = i4;
                            f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                            j3 = circularTrackColor;
                            iM2267getCircularDeterminateStrokeCapKaPHkGw = i8;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1472321743, i10, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:491)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(821871588);
                    if ((i10 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z) {
                        objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Float invoke() {
                                return Float.valueOf(f);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Float invoke() {
                                return Float.valueOf(f);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    m2272CircularProgressIndicatorDUhRLBM((Function0<Float>) objRememberedValue, modifier2, circularColor, f3, j3, iM2267getCircularDeterminateStrokeCapKaPHkGw, composerStartRestartGroup, i10 & 524272, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    circularTrackColor = j3;
                    j4 = circularColor;
                    i11 = iM2267getCircularDeterminateStrokeCapKaPHkGw;
                    f4 = f3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier5 = modifier2;
                    final long j7 = circularTrackColor;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i15) {
                            ProgressIndicatorKt.m2271CircularProgressIndicatorDUhRLBM(f, modifier5, j4, f4, j7, i11, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                        }
                    });
                }
            }
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i8 = i;
            if ((i4 & 74899) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i3 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        i4 &= -57345;
                    }
                    if (i7 != 0) {
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                        i10 = i4;
                        f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                        j3 = circularTrackColor;
                    } else {
                        i10 = i4;
                        f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                        j3 = circularTrackColor;
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = i8;
                    }
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i3 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        i4 &= -57345;
                    }
                    if (i7 != 0) {
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                        i10 = i4;
                        f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                        j3 = circularTrackColor;
                    } else {
                        i10 = i4;
                        f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                        j3 = circularTrackColor;
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = i8;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1472321743, i10, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:491)");
                }
                composerStartRestartGroup.startReplaceableGroup(821871588);
                if ((i10 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z) {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(f);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(f);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                m2272CircularProgressIndicatorDUhRLBM((Function0<Float>) objRememberedValue, modifier2, circularColor, f3, j3, iM2267getCircularDeterminateStrokeCapKaPHkGw, composerStartRestartGroup, i10 & 524272, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                circularTrackColor = j3;
                j4 = circularColor;
                i11 = iM2267getCircularDeterminateStrokeCapKaPHkGw;
                f4 = f3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i3 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        i4 &= -57345;
                    }
                    if (i7 != 0) {
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                        i10 = i4;
                        f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                        j3 = circularTrackColor;
                    } else {
                        i10 = i4;
                        f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                        j3 = circularTrackColor;
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = i8;
                    }
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i3 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        i4 &= -57345;
                    }
                    if (i7 != 0) {
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                        i10 = i4;
                        f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                        j3 = circularTrackColor;
                    } else {
                        i10 = i4;
                        f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                        j3 = circularTrackColor;
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = i8;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1472321743, i10, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:491)");
                }
                composerStartRestartGroup.startReplaceableGroup(821871588);
                if ((i10 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z) {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(f);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(f);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                m2272CircularProgressIndicatorDUhRLBM((Function0<Float>) objRememberedValue, modifier2, circularColor, f3, j3, iM2267getCircularDeterminateStrokeCapKaPHkGw, composerStartRestartGroup, i10 & 524272, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                circularTrackColor = j3;
                j4 = circularColor;
                i11 = iM2267getCircularDeterminateStrokeCapKaPHkGw;
                f4 = f3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier6 = modifier2;
                final long j8 = circularTrackColor;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i15) {
                        ProgressIndicatorKt.m2271CircularProgressIndicatorDUhRLBM(f, modifier6, j4, f4, j8, i11, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
        }
        i4 |= 48;
        modifier2 = modifier;
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                circularColor = j;
                if (composerStartRestartGroup.changed(circularColor)) {
                }
                i4 |= i13;
            } else {
                circularColor = j;
            }
            i4 |= i13;
        } else {
            circularColor = j;
        }
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 3072) == 0) {
                fM2269getCircularStrokeWidthD9Ej5fM = f2;
                if (composerStartRestartGroup.changed(fM2269getCircularStrokeWidthD9Ej5fM)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            if ((i2 & 24576) == 0) {
                if ((i3 & 16) == 0) {
                    circularTrackColor = j2;
                    if (composerStartRestartGroup.changed(circularTrackColor)) {
                    }
                    i4 |= i14;
                } else {
                    circularTrackColor = j2;
                }
                i4 |= i14;
            } else {
                circularTrackColor = j2;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((196608 & i2) == 0) {
                    i8 = i;
                    if (composerStartRestartGroup.changed(i8)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
                if ((i4 & 74899) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                            i4 &= -897;
                        }
                        if (i5 != 0) {
                            fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i3 & 16) != 0) {
                            circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                            i4 &= -57345;
                        }
                        if (i7 != 0) {
                            iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                            i10 = i4;
                            f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                            j3 = circularTrackColor;
                        } else {
                            i10 = i4;
                            f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                            j3 = circularTrackColor;
                            iM2267getCircularDeterminateStrokeCapKaPHkGw = i8;
                        }
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                            i4 &= -897;
                        }
                        if (i5 != 0) {
                            fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i3 & 16) != 0) {
                            circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                            i4 &= -57345;
                        }
                        if (i7 != 0) {
                            iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                            i10 = i4;
                            f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                            j3 = circularTrackColor;
                        } else {
                            i10 = i4;
                            f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                            j3 = circularTrackColor;
                            iM2267getCircularDeterminateStrokeCapKaPHkGw = i8;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1472321743, i10, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:491)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(821871588);
                    if ((i10 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z) {
                        objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Float invoke() {
                                return Float.valueOf(f);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Float invoke() {
                                return Float.valueOf(f);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    m2272CircularProgressIndicatorDUhRLBM((Function0<Float>) objRememberedValue, modifier2, circularColor, f3, j3, iM2267getCircularDeterminateStrokeCapKaPHkGw, composerStartRestartGroup, i10 & 524272, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    circularTrackColor = j3;
                    j4 = circularColor;
                    i11 = iM2267getCircularDeterminateStrokeCapKaPHkGw;
                    f4 = f3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                            i4 &= -897;
                        }
                        if (i5 != 0) {
                            fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i3 & 16) != 0) {
                            circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                            i4 &= -57345;
                        }
                        if (i7 != 0) {
                            iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                            i10 = i4;
                            f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                            j3 = circularTrackColor;
                        } else {
                            i10 = i4;
                            f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                            j3 = circularTrackColor;
                            iM2267getCircularDeterminateStrokeCapKaPHkGw = i8;
                        }
                    } else {
                        if (i12 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i3 & 4) != 0) {
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                            i4 &= -897;
                        }
                        if (i5 != 0) {
                            fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                        }
                        if ((i3 & 16) != 0) {
                            circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                            i4 &= -57345;
                        }
                        if (i7 != 0) {
                            iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                            i10 = i4;
                            f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                            j3 = circularTrackColor;
                        } else {
                            i10 = i4;
                            f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                            j3 = circularTrackColor;
                            iM2267getCircularDeterminateStrokeCapKaPHkGw = i8;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1472321743, i10, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:491)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(821871588);
                    if ((i10 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z) {
                        objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Float invoke() {
                                return Float.valueOf(f);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Float invoke() {
                                return Float.valueOf(f);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    m2272CircularProgressIndicatorDUhRLBM((Function0<Float>) objRememberedValue, modifier2, circularColor, f3, j3, iM2267getCircularDeterminateStrokeCapKaPHkGw, composerStartRestartGroup, i10 & 524272, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    circularTrackColor = j3;
                    j4 = circularColor;
                    i11 = iM2267getCircularDeterminateStrokeCapKaPHkGw;
                    f4 = f3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier7 = modifier2;
                    final long j9 = circularTrackColor;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i15) {
                            ProgressIndicatorKt.m2271CircularProgressIndicatorDUhRLBM(f, modifier7, j4, f4, j9, i11, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                        }
                    });
                }
            }
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i8 = i;
            if ((i4 & 74899) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i3 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        i4 &= -57345;
                    }
                    if (i7 != 0) {
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                        i10 = i4;
                        f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                        j3 = circularTrackColor;
                    } else {
                        i10 = i4;
                        f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                        j3 = circularTrackColor;
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = i8;
                    }
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i3 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        i4 &= -57345;
                    }
                    if (i7 != 0) {
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                        i10 = i4;
                        f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                        j3 = circularTrackColor;
                    } else {
                        i10 = i4;
                        f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                        j3 = circularTrackColor;
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = i8;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1472321743, i10, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:491)");
                }
                composerStartRestartGroup.startReplaceableGroup(821871588);
                if ((i10 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z) {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(f);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(f);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                m2272CircularProgressIndicatorDUhRLBM((Function0<Float>) objRememberedValue, modifier2, circularColor, f3, j3, iM2267getCircularDeterminateStrokeCapKaPHkGw, composerStartRestartGroup, i10 & 524272, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                circularTrackColor = j3;
                j4 = circularColor;
                i11 = iM2267getCircularDeterminateStrokeCapKaPHkGw;
                f4 = f3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i3 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        i4 &= -57345;
                    }
                    if (i7 != 0) {
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                        i10 = i4;
                        f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                        j3 = circularTrackColor;
                    } else {
                        i10 = i4;
                        f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                        j3 = circularTrackColor;
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = i8;
                    }
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i3 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        i4 &= -57345;
                    }
                    if (i7 != 0) {
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                        i10 = i4;
                        f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                        j3 = circularTrackColor;
                    } else {
                        i10 = i4;
                        f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                        j3 = circularTrackColor;
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = i8;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1472321743, i10, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:491)");
                }
                composerStartRestartGroup.startReplaceableGroup(821871588);
                if ((i10 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z) {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(f);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(f);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                m2272CircularProgressIndicatorDUhRLBM((Function0<Float>) objRememberedValue, modifier2, circularColor, f3, j3, iM2267getCircularDeterminateStrokeCapKaPHkGw, composerStartRestartGroup, i10 & 524272, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                circularTrackColor = j3;
                j4 = circularColor;
                i11 = iM2267getCircularDeterminateStrokeCapKaPHkGw;
                f4 = f3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier8 = modifier2;
                final long j10 = circularTrackColor;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i15) {
                        ProgressIndicatorKt.m2271CircularProgressIndicatorDUhRLBM(f, modifier8, j4, f4, j10, i11, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
        }
        i4 |= 3072;
        fM2269getCircularStrokeWidthD9Ej5fM = f2;
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                circularTrackColor = j2;
                if (composerStartRestartGroup.changed(circularTrackColor)) {
                }
                i4 |= i14;
            } else {
                circularTrackColor = j2;
            }
            i4 |= i14;
        } else {
            circularTrackColor = j2;
        }
        i7 = i3 & 32;
        if (i7 != 0) {
            if ((196608 & i2) == 0) {
                i8 = i;
                if (composerStartRestartGroup.changed(i8)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i4 |= i9;
            }
            if ((i4 & 74899) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i3 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        i4 &= -57345;
                    }
                    if (i7 != 0) {
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                        i10 = i4;
                        f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                        j3 = circularTrackColor;
                    } else {
                        i10 = i4;
                        f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                        j3 = circularTrackColor;
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = i8;
                    }
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i3 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        i4 &= -57345;
                    }
                    if (i7 != 0) {
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                        i10 = i4;
                        f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                        j3 = circularTrackColor;
                    } else {
                        i10 = i4;
                        f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                        j3 = circularTrackColor;
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = i8;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1472321743, i10, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:491)");
                }
                composerStartRestartGroup.startReplaceableGroup(821871588);
                if ((i10 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z) {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(f);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(f);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                m2272CircularProgressIndicatorDUhRLBM((Function0<Float>) objRememberedValue, modifier2, circularColor, f3, j3, iM2267getCircularDeterminateStrokeCapKaPHkGw, composerStartRestartGroup, i10 & 524272, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                circularTrackColor = j3;
                j4 = circularColor;
                i11 = iM2267getCircularDeterminateStrokeCapKaPHkGw;
                f4 = f3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0) {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i3 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        i4 &= -57345;
                    }
                    if (i7 != 0) {
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                        i10 = i4;
                        f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                        j3 = circularTrackColor;
                    } else {
                        i10 = i4;
                        f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                        j3 = circularTrackColor;
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = i8;
                    }
                } else {
                    if (i12 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i3 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i4 &= -897;
                    }
                    if (i5 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    }
                    if ((i3 & 16) != 0) {
                        circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                        i4 &= -57345;
                    }
                    if (i7 != 0) {
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                        i10 = i4;
                        f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                        j3 = circularTrackColor;
                    } else {
                        i10 = i4;
                        f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                        j3 = circularTrackColor;
                        iM2267getCircularDeterminateStrokeCapKaPHkGw = i8;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1472321743, i10, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:491)");
                }
                composerStartRestartGroup.startReplaceableGroup(821871588);
                if ((i10 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z) {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(f);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Float invoke() {
                            return Float.valueOf(f);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                m2272CircularProgressIndicatorDUhRLBM((Function0<Float>) objRememberedValue, modifier2, circularColor, f3, j3, iM2267getCircularDeterminateStrokeCapKaPHkGw, composerStartRestartGroup, i10 & 524272, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                circularTrackColor = j3;
                j4 = circularColor;
                i11 = iM2267getCircularDeterminateStrokeCapKaPHkGw;
                f4 = f3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier9 = modifier2;
                final long j11 = circularTrackColor;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i15) {
                        ProgressIndicatorKt.m2271CircularProgressIndicatorDUhRLBM(f, modifier9, j4, f4, j11, i11, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
            }
        }
        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i8 = i;
        if ((i4 & 74899) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i4 &= -897;
                }
                if (i5 != 0) {
                    fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                }
                if ((i3 & 16) != 0) {
                    circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    i4 &= -57345;
                }
                if (i7 != 0) {
                    iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                    i10 = i4;
                    f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                    j3 = circularTrackColor;
                } else {
                    i10 = i4;
                    f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                    j3 = circularTrackColor;
                    iM2267getCircularDeterminateStrokeCapKaPHkGw = i8;
                }
            } else {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i4 &= -897;
                }
                if (i5 != 0) {
                    fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                }
                if ((i3 & 16) != 0) {
                    circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    i4 &= -57345;
                }
                if (i7 != 0) {
                    iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                    i10 = i4;
                    f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                    j3 = circularTrackColor;
                } else {
                    i10 = i4;
                    f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                    j3 = circularTrackColor;
                    iM2267getCircularDeterminateStrokeCapKaPHkGw = i8;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1472321743, i10, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:491)");
            }
            composerStartRestartGroup.startReplaceableGroup(821871588);
            if ((i10 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z) {
                objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(f);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(f);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            m2272CircularProgressIndicatorDUhRLBM((Function0<Float>) objRememberedValue, modifier2, circularColor, f3, j3, iM2267getCircularDeterminateStrokeCapKaPHkGw, composerStartRestartGroup, i10 & 524272, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            circularTrackColor = j3;
            j4 = circularColor;
            i11 = iM2267getCircularDeterminateStrokeCapKaPHkGw;
            f4 = f3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i4 &= -897;
                }
                if (i5 != 0) {
                    fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                }
                if ((i3 & 16) != 0) {
                    circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    i4 &= -57345;
                }
                if (i7 != 0) {
                    iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                    i10 = i4;
                    f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                    j3 = circularTrackColor;
                } else {
                    i10 = i4;
                    f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                    j3 = circularTrackColor;
                    iM2267getCircularDeterminateStrokeCapKaPHkGw = i8;
                }
            } else {
                if (i12 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i3 & 4) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i4 &= -897;
                }
                if (i5 != 0) {
                    fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                }
                if ((i3 & 16) != 0) {
                    circularTrackColor = ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6);
                    i4 &= -57345;
                }
                if (i7 != 0) {
                    iM2267getCircularDeterminateStrokeCapKaPHkGw = ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw();
                    i10 = i4;
                    f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                    j3 = circularTrackColor;
                } else {
                    i10 = i4;
                    f3 = fM2269getCircularStrokeWidthD9Ej5fM;
                    j3 = circularTrackColor;
                    iM2267getCircularDeterminateStrokeCapKaPHkGw = i8;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1472321743, i10, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:491)");
            }
            composerStartRestartGroup.startReplaceableGroup(821871588);
            if ((i10 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z) {
                objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(f);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = (Function0) new Function0<Float>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$6$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(f);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            m2272CircularProgressIndicatorDUhRLBM((Function0<Float>) objRememberedValue, modifier2, circularColor, f3, j3, iM2267getCircularDeterminateStrokeCapKaPHkGw, composerStartRestartGroup, i10 & 524272, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            circularTrackColor = j3;
            j4 = circularColor;
            i11 = iM2267getCircularDeterminateStrokeCapKaPHkGw;
            f4 = f3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier10 = modifier2;
            final long j12 = circularTrackColor;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i15) {
                    ProgressIndicatorKt.m2271CircularProgressIndicatorDUhRLBM(f, modifier10, j4, f4, j12, i11, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c9 A[PHI: r3 r4 r7
  0x00c9: PHI (r3v16 int) = (r3v12 int), (r3v17 int) binds: [B:65:0x00be, B:58:0x00a8] A[DONT_GENERATE, DONT_INLINE]
  0x00c9: PHI (r4v6 androidx.compose.ui.Modifier) = (r4v2 androidx.compose.ui.Modifier), (r4v8 androidx.compose.ui.Modifier) binds: [B:65:0x00be, B:58:0x00a8] A[DONT_GENERATE, DONT_INLINE]
  0x00c9: PHI (r7v15 long) = (r7v7 long), (r7v6 long) binds: [B:65:0x00be, B:58:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:73:0x0108  */
    /* JADX WARN: Code duplicated, block: B:76:0x0111  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* JADX INFO: renamed from: CircularProgressIndicator-MBs18nI, reason: not valid java name */
    public static final /* synthetic */ void m2274CircularProgressIndicatorMBs18nI(final float f, Modifier modifier, long j, float f2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        long circularColor;
        int i4;
        float f3;
        int i5;
        Modifier.Companion companion;
        final float fM2269getCircularStrokeWidthD9Ej5fM;
        long j2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(402841196);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    circularColor = j;
                    int i7 = composerStartRestartGroup.changed(circularColor) ? 256 : 128;
                    i3 |= i7;
                } else {
                    circularColor = j;
                }
                i3 |= i7;
            } else {
                circularColor = j;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    f3 = f2;
                    if (composerStartRestartGroup.changed(f3)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i6 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if ((i2 & 4) != 0) {
                            circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                            i3 &= -897;
                        }
                        if (i4 != 0) {
                            fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                            j2 = circularColor;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(402841196, i3, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:508)");
                        }
                        m2271CircularProgressIndicatorDUhRLBM(f, companion, j2, fM2269getCircularStrokeWidthD9Ej5fM, ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6), ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw(), composerStartRestartGroup, (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        companion = modifier2;
                    }
                    j2 = circularColor;
                    fM2269getCircularStrokeWidthD9Ej5fM = f3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(402841196, i3, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:508)");
                    }
                    m2271CircularProgressIndicatorDUhRLBM(f, companion, j2, fM2269getCircularStrokeWidthD9Ej5fM, ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6), ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw(), composerStartRestartGroup, (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    j2 = circularColor;
                    fM2269getCircularStrokeWidthD9Ej5fM = f3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier3 = companion;
                    final long j3 = j2;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i8) {
                            ProgressIndicatorKt.m2274CircularProgressIndicatorMBs18nI(f, modifier3, j3, fM2269getCircularStrokeWidthD9Ej5fM, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            f3 = f2;
            if ((i3 & 1171) == 1170) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                        j2 = circularColor;
                    } else {
                        j2 = circularColor;
                        fM2269getCircularStrokeWidthD9Ej5fM = f3;
                    }
                } else {
                    if (i6 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                        j2 = circularColor;
                    } else {
                        j2 = circularColor;
                        fM2269getCircularStrokeWidthD9Ej5fM = f3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(402841196, i3, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:508)");
                }
                m2271CircularProgressIndicatorDUhRLBM(f, companion, j2, fM2269getCircularStrokeWidthD9Ej5fM, ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6), ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw(), composerStartRestartGroup, (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                        j2 = circularColor;
                    } else {
                        j2 = circularColor;
                        fM2269getCircularStrokeWidthD9Ej5fM = f3;
                    }
                } else {
                    if (i6 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                        j2 = circularColor;
                    } else {
                        j2 = circularColor;
                        fM2269getCircularStrokeWidthD9Ej5fM = f3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(402841196, i3, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:508)");
                }
                m2271CircularProgressIndicatorDUhRLBM(f, companion, j2, fM2269getCircularStrokeWidthD9Ej5fM, ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6), ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw(), composerStartRestartGroup, (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier4 = companion;
                final long j4 = j2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i8) {
                        ProgressIndicatorKt.m2274CircularProgressIndicatorMBs18nI(f, modifier4, j4, fM2269getCircularStrokeWidthD9Ej5fM, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                circularColor = j;
                if (composerStartRestartGroup.changed(circularColor)) {
                }
                i3 |= i7;
            } else {
                circularColor = j;
            }
            i3 |= i7;
        } else {
            circularColor = j;
        }
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                f3 = f2;
                if (composerStartRestartGroup.changed(f3)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i3 & 1171) == 1170) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                        j2 = circularColor;
                    } else {
                        j2 = circularColor;
                        fM2269getCircularStrokeWidthD9Ej5fM = f3;
                    }
                } else {
                    if (i6 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                        j2 = circularColor;
                    } else {
                        j2 = circularColor;
                        fM2269getCircularStrokeWidthD9Ej5fM = f3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(402841196, i3, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:508)");
                }
                m2271CircularProgressIndicatorDUhRLBM(f, companion, j2, fM2269getCircularStrokeWidthD9Ej5fM, ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6), ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw(), composerStartRestartGroup, (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                        j2 = circularColor;
                    } else {
                        j2 = circularColor;
                        fM2269getCircularStrokeWidthD9Ej5fM = f3;
                    }
                } else {
                    if (i6 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 4) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                        j2 = circularColor;
                    } else {
                        j2 = circularColor;
                        fM2269getCircularStrokeWidthD9Ej5fM = f3;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(402841196, i3, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:508)");
                }
                m2271CircularProgressIndicatorDUhRLBM(f, companion, j2, fM2269getCircularStrokeWidthD9Ej5fM, ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6), ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw(), composerStartRestartGroup, (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier5 = companion;
                final long j5 = j2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i8) {
                        ProgressIndicatorKt.m2274CircularProgressIndicatorMBs18nI(f, modifier5, j5, fM2269getCircularStrokeWidthD9Ej5fM, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 3072;
        f3 = f2;
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i2 & 4) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i3 &= -897;
                }
                if (i4 != 0) {
                    fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    j2 = circularColor;
                } else {
                    j2 = circularColor;
                    fM2269getCircularStrokeWidthD9Ej5fM = f3;
                }
            } else {
                if (i6 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i2 & 4) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i3 &= -897;
                }
                if (i4 != 0) {
                    fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    j2 = circularColor;
                } else {
                    j2 = circularColor;
                    fM2269getCircularStrokeWidthD9Ej5fM = f3;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(402841196, i3, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:508)");
            }
            m2271CircularProgressIndicatorDUhRLBM(f, companion, j2, fM2269getCircularStrokeWidthD9Ej5fM, ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6), ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw(), composerStartRestartGroup, (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i2 & 4) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i3 &= -897;
                }
                if (i4 != 0) {
                    fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    j2 = circularColor;
                } else {
                    j2 = circularColor;
                    fM2269getCircularStrokeWidthD9Ej5fM = f3;
                }
            } else {
                if (i6 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i2 & 4) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i3 &= -897;
                }
                if (i4 != 0) {
                    fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    j2 = circularColor;
                } else {
                    j2 = circularColor;
                    fM2269getCircularStrokeWidthD9Ej5fM = f3;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(402841196, i3, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:508)");
            }
            m2271CircularProgressIndicatorDUhRLBM(f, companion, j2, fM2269getCircularStrokeWidthD9Ej5fM, ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6), ProgressIndicatorDefaults.INSTANCE.m2267getCircularDeterminateStrokeCapKaPHkGw(), composerStartRestartGroup, (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier6 = companion;
            final long j6 = j2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    ProgressIndicatorKt.m2274CircularProgressIndicatorMBs18nI(f, modifier6, j6, fM2269getCircularStrokeWidthD9Ej5fM, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ab A[PHI: r2 r4 r6
  0x00ab: PHI (r2v6 androidx.compose.ui.Modifier) = (r2v2 androidx.compose.ui.Modifier), (r2v8 androidx.compose.ui.Modifier) binds: [B:54:0x00a0, B:47:0x008a] A[DONT_GENERATE, DONT_INLINE]
  0x00ab: PHI (r4v13 int) = (r4v10 int), (r4v14 int) binds: [B:54:0x00a0, B:47:0x008a] A[DONT_GENERATE, DONT_INLINE]
  0x00ab: PHI (r6v9 long) = (r6v3 long), (r6v2 long) binds: [B:54:0x00a0, B:47:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* JADX INFO: renamed from: CircularProgressIndicator-aM-cp0Q, reason: not valid java name */
    public static final /* synthetic */ void m2275CircularProgressIndicatoraMcp0Q(Modifier modifier, long j, float f, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        long circularColor;
        float f2;
        Modifier.Companion companion;
        float fM2269getCircularStrokeWidthD9Ej5fM;
        int i4;
        long j2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(947193756);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                circularColor = j;
                int i6 = composerStartRestartGroup.changed(circularColor) ? 32 : 16;
                i3 |= i6;
            } else {
                circularColor = j;
            }
            i3 |= i6;
        } else {
            circularColor = j;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                f2 = f;
                i3 |= composerStartRestartGroup.changed(f2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i5 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                        i3 &= -113;
                    }
                    if (i7 != 0) {
                        fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                    }
                    long j3 = circularColor;
                    i4 = i3;
                    j2 = j3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(947193756, i4, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:523)");
                    }
                    m2273CircularProgressIndicatorLxG7B9w(companion, j2, fM2269getCircularStrokeWidthD9Ej5fM, ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6), ProgressIndicatorDefaults.INSTANCE.m2268getCircularIndeterminateStrokeCapKaPHkGw(), composerStartRestartGroup, (i4 & 14) | 24576 | (i4 & 112) | (i4 & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f2 = fM2269getCircularStrokeWidthD9Ej5fM;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    companion = modifier2;
                }
                fM2269getCircularStrokeWidthD9Ej5fM = f2;
                long j4 = circularColor;
                i4 = i3;
                j2 = j4;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(947193756, i4, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:523)");
                }
                m2273CircularProgressIndicatorLxG7B9w(companion, j2, fM2269getCircularStrokeWidthD9Ej5fM, ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6), ProgressIndicatorDefaults.INSTANCE.m2268getCircularIndeterminateStrokeCapKaPHkGw(), composerStartRestartGroup, (i4 & 14) | 24576 | (i4 & 112) | (i4 & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f2 = fM2269getCircularStrokeWidthD9Ej5fM;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                companion = modifier2;
                j2 = circularColor;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier3 = companion;
                final long j5 = j2;
                final float f3 = f2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$9
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i8) {
                        ProgressIndicatorKt.m2275CircularProgressIndicatoraMcp0Q(modifier3, j5, f3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 384;
        f2 = f;
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i2 & 2) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i3 &= -113;
                }
                if (i7 != 0) {
                    fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                } else {
                    fM2269getCircularStrokeWidthD9Ej5fM = f2;
                }
            } else {
                if (i5 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i2 & 2) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i3 &= -113;
                }
                if (i7 != 0) {
                    fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                } else {
                    fM2269getCircularStrokeWidthD9Ej5fM = f2;
                }
            }
            long j6 = circularColor;
            i4 = i3;
            j2 = j6;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(947193756, i4, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:523)");
            }
            m2273CircularProgressIndicatorLxG7B9w(companion, j2, fM2269getCircularStrokeWidthD9Ej5fM, ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6), ProgressIndicatorDefaults.INSTANCE.m2268getCircularIndeterminateStrokeCapKaPHkGw(), composerStartRestartGroup, (i4 & 14) | 24576 | (i4 & 112) | (i4 & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f2 = fM2269getCircularStrokeWidthD9Ej5fM;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i2 & 2) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i3 &= -113;
                }
                if (i7 != 0) {
                    fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                } else {
                    fM2269getCircularStrokeWidthD9Ej5fM = f2;
                }
            } else {
                if (i5 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if ((i2 & 2) != 0) {
                    circularColor = ProgressIndicatorDefaults.INSTANCE.getCircularColor(composerStartRestartGroup, 6);
                    i3 &= -113;
                }
                if (i7 != 0) {
                    fM2269getCircularStrokeWidthD9Ej5fM = ProgressIndicatorDefaults.INSTANCE.m2269getCircularStrokeWidthD9Ej5fM();
                } else {
                    fM2269getCircularStrokeWidthD9Ej5fM = f2;
                }
            }
            long j7 = circularColor;
            i4 = i3;
            j2 = j7;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(947193756, i4, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:523)");
            }
            m2273CircularProgressIndicatorLxG7B9w(companion, j2, fM2269getCircularStrokeWidthD9Ej5fM, ProgressIndicatorDefaults.INSTANCE.getCircularTrackColor(composerStartRestartGroup, 6), ProgressIndicatorDefaults.INSTANCE.m2268getCircularIndeterminateStrokeCapKaPHkGw(), composerStartRestartGroup, (i4 & 14) | 24576 | (i4 & 112) | (i4 & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f2 = fM2269getCircularStrokeWidthD9Ej5fM;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = companion;
            final long j8 = j2;
            final float f4 = f2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$CircularProgressIndicator$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i8) {
                    ProgressIndicatorKt.m2275CircularProgressIndicatoraMcp0Q(modifier4, j8, f4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: drawCircularIndicator-42QJj7c, reason: not valid java name */
    private static final void m2286drawCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        float width = stroke.getWidth() / 2.0f;
        float fM4043getWidthimpl = Size.m4043getWidthimpl(drawScope.mo4798getSizeNHjbRc()) - (2.0f * width);
        DrawScope.m4777drawArcyD3GUKo$default(drawScope, j, f, f2, false, OffsetKt.Offset(width, width), androidx.compose.ui.geometry.SizeKt.Size(fM4043getWidthimpl, fM4043getWidthimpl), 0.0f, stroke, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawCircularIndicatorTrack-bw27NRU, reason: not valid java name */
    public static final void m2287drawCircularIndicatorTrackbw27NRU(DrawScope drawScope, long j, Stroke stroke) {
        m2286drawCircularIndicator42QJj7c(drawScope, 0.0f, 360.0f, j, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawDeterminateCircularIndicator-42QJj7c, reason: not valid java name */
    public static final void m2288drawDeterminateCircularIndicator42QJj7c(DrawScope drawScope, float f, float f2, long j, Stroke stroke) {
        m2286drawCircularIndicator42QJj7c(drawScope, f, f2, j, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawIndeterminateCircularIndicator-hrjfTZI, reason: not valid java name */
    public static final void m2289drawIndeterminateCircularIndicatorhrjfTZI(DrawScope drawScope, float f, float f2, float f3, long j, Stroke stroke) {
        m2286drawCircularIndicator42QJj7c(drawScope, f + (StrokeCap.m4585equalsimpl0(stroke.getCap(), StrokeCap.INSTANCE.m4589getButtKaPHkGw()) ? 0.0f : ((f2 / Dp.m6935constructorimpl(CircularIndicatorDiameter / 2.0f)) * 57.29578f) / 2.0f), Math.max(f3, 0.1f), j, stroke);
    }

    public static final float getLinearIndicatorWidth() {
        return LinearIndicatorWidth;
    }

    public static final float getLinearIndicatorHeight() {
        return LinearIndicatorHeight;
    }

    public static final float getCircularIndicatorDiameter() {
        return CircularIndicatorDiameter;
    }

    static {
        float fM6935constructorimpl = Dp.m6935constructorimpl(10.0f);
        SemanticsBoundsPadding = fM6935constructorimpl;
        IncreaseSemanticsBounds = PaddingKt.m1004paddingVpY3zN4$default(SemanticsModifierKt.semantics(LayoutModifierKt.layout(Modifier.INSTANCE, new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material3.ProgressIndicatorKt$IncreaseSemanticsBounds$1
            @Override // kotlin.jvm.functions.Function3
            public final /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                return m2292invoke3p2s80s(measureScope, measurable, constraints.getValue());
            }

            /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
            public final MeasureResult m2292invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
                final int i = measureScope.mo688roundToPx0680j_4(ProgressIndicatorKt.SemanticsBoundsPadding);
                int i2 = i * 2;
                final Placeable placeableMo5637measureBRTryo0 = measurable.mo5637measureBRTryo0(ConstraintsKt.m6907offsetNN6EwU(j, 0, i2));
                return MeasureScope.layout$default(measureScope, placeableMo5637measureBRTryo0.getWidth(), placeableMo5637measureBRTryo0.getHeight() - i2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$IncreaseSemanticsBounds$1.1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Placeable.PlacementScope placementScope) {
                        Placeable.PlacementScope.place$default(placementScope, placeableMo5637measureBRTryo0, 0, -i, 0.0f, 4, null);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                }, 4, null);
            }
        }), true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ProgressIndicatorKt$IncreaseSemanticsBounds$2
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }
        }), 0.0f, fM6935constructorimpl, 1, null);
        LinearIndicatorWidth = Dp.m6935constructorimpl(240.0f);
        LinearIndicatorHeight = LinearProgressIndicatorTokens.INSTANCE.m3131getTrackHeightD9Ej5fM();
        CircularIndicatorDiameter = Dp.m6935constructorimpl(CircularProgressIndicatorTokens.INSTANCE.m2865getSizeD9Ej5fM() - Dp.m6935constructorimpl(CircularProgressIndicatorTokens.INSTANCE.m2864getActiveIndicatorWidthD9Ej5fM() * 2.0f));
        FirstLineHeadEasing = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);
        FirstLineTailEasing = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);
        SecondLineHeadEasing = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);
        SecondLineTailEasing = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);
        CircularEasing = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);
    }
}
