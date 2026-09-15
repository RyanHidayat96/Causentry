package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.material.internal.ViewUtils;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000p\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0002\u001a(\u0010\u0018\u001a\u00020\u00192\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a]\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\u0019\b\u0002\u0010$\u001a\u0013\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00190%¢\u0006\u0002\b&2\b\b\u0002\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020\u001c2\b\b\u0002\u0010*\u001a\u00020\u001cH\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a*\u0010-\u001a\u00020!2\u0006\u0010.\u001a\u00020\u00022\b\b\u0002\u0010/\u001a\u0002002\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u0002000\u001aH\u0007\u001a,\u00102\u001a\u00020!2\b\b\u0002\u00103\u001a\u00020\u00042\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u0002000\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001aF\u00106\u001a\u00020\u0019*\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020;2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00162\u0006\u0010>\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a>\u0010A\u001a\u00020\u0019*\u0002072\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020\u00022\u0006\u0010=\u001a\u00020\u00162\u0006\u0010B\u001a\u00020;2\u0006\u0010>\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\bC\u0010D\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u000b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u000e\u0010\f\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u000f\u001a\u00020\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0010\u0010\u0011\"\u0016\u0010\u0012\u001a\u00020\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0013\u0010\u0011\"\u0010\u0010\u0014\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006E²\u0006\n\u0010F\u001a\u00020\u0002X\u008a\u0084\u0002"}, d2 = {"AlphaTween", "Landroidx/compose/animation/core/TweenSpec;", "", "ArcRadius", "Landroidx/compose/ui/unit/Dp;", "F", "ArrowHeight", "ArrowWidth", "CrossfadeDurationMs", "", "DragMultiplier", "Elevation", "MaxAlpha", "MaxProgressArc", "MinAlpha", "SpinnerContainerSize", "getSpinnerContainerSize", "()F", "SpinnerSize", "getSpinnerSize", "StrokeWidth", "ArrowValues", "Landroidx/compose/material3/pulltorefresh/ArrowValues;", "progress", "CircularArrowProgressIndicator", "", "Lkotlin/Function0;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", "CircularArrowProgressIndicator-RPmYEkk", "(Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V", "PullToRefreshContainer", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "modifier", "Landroidx/compose/ui/Modifier;", "indicator", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "contentColor", "PullToRefreshContainer-wBJOh4Y", "(Landroidx/compose/material3/pulltorefresh/PullToRefreshState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/runtime/Composer;II)V", "PullToRefreshState", "positionalThresholdPx", "initialRefreshing", "", "enabled", "rememberPullToRefreshState", "positionalThreshold", "rememberPullToRefreshState--orJrPs", "(FLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "drawArrow", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "arrow", "Landroidx/compose/ui/graphics/Path;", "bounds", "Landroidx/compose/ui/geometry/Rect;", "alpha", "values", "strokeWidth", "drawArrow-uDrxG_w", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/Rect;JFLandroidx/compose/material3/pulltorefresh/ArrowValues;F)V", "drawCircularIndicator", "arcBounds", "drawCircularIndicator-KzyDr3Q", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFLandroidx/compose/material3/pulltorefresh/ArrowValues;Landroidx/compose/ui/geometry/Rect;F)V", "material3_release", "targetAlpha"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PullToRefreshKt {
    private static final int CrossfadeDurationMs = 100;
    private static final float DragMultiplier = 0.5f;
    private static final float MaxAlpha = 1.0f;
    private static final float MaxProgressArc = 0.8f;
    private static final float MinAlpha = 0.3f;
    private static final float StrokeWidth = Dp.m6935constructorimpl(2.5f);
    private static final float ArcRadius = Dp.m6935constructorimpl(5.5f);
    private static final float SpinnerSize = Dp.m6935constructorimpl(16.0f);
    private static final float SpinnerContainerSize = Dp.m6935constructorimpl(40.0f);
    private static final float Elevation = ElevationTokens.INSTANCE.m3003getLevel2D9Ej5fM();
    private static final float ArrowWidth = Dp.m6935constructorimpl(10.0f);
    private static final float ArrowHeight = Dp.m6935constructorimpl(5.0f);
    private static final TweenSpec<Float> AlphaTween = AnimationSpecKt.tween$default(300, 0, EasingKt.getLinearEasing(), 2, null);

    /* JADX WARN: Code duplicated, block: B:101:0x0137  */
    /* JADX WARN: Code duplicated, block: B:104:0x0180  */
    /* JADX WARN: Code duplicated, block: B:107:0x018c  */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0072  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x009c  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:94:0x0109  */
    /* JADX WARN: Code duplicated, block: B:98:0x011c  */
    /* JADX INFO: renamed from: PullToRefreshContainer-wBJOh4Y, reason: not valid java name */
    public static final void m2822PullToRefreshContainerwBJOh4Y(final PullToRefreshState pullToRefreshState, Modifier modifier, Function3<? super PullToRefreshState, ? super Composer, ? super Integer, Unit> function3, Shape shape, long j, long j2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function3<? super PullToRefreshState, ? super Composer, ? super Integer, Unit> function3M2818getLambda1$material3_release;
        int i5;
        int i6;
        Shape shape2;
        int i7;
        long containerColor;
        long contentColor;
        Object objRememberedValue;
        final Function3<? super PullToRefreshState, ? super Composer, ? super Integer, Unit> function4;
        final Shape shape3;
        final long j3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-801976958);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(pullToRefreshState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    function3M2818getLambda1$material3_release = function3;
                    if (composerStartRestartGroup.changedInstance(function3M2818getLambda1$material3_release)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        shape2 = shape;
                        if (composerStartRestartGroup.changed(shape2)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    if ((i & 24576) == 0) {
                        if ((i2 & 16) == 0) {
                            containerColor = j;
                            int i9 = composerStartRestartGroup.changed(containerColor) ? 16384 : 8192;
                            i3 |= i9;
                        } else {
                            containerColor = j;
                        }
                        i3 |= i9;
                    } else {
                        containerColor = j;
                    }
                    if ((196608 & i) == 0) {
                        if ((i2 & 32) == 0) {
                            contentColor = j2;
                            int i10 = composerStartRestartGroup.changed(contentColor) ? 131072 : 65536;
                            i3 |= i10;
                        } else {
                            contentColor = j2;
                        }
                        i3 |= i10;
                    } else {
                        contentColor = j2;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i8 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i4 != 0) {
                                function3M2818getLambda1$material3_release = ComposableSingletons$PullToRefreshKt.INSTANCE.m2818getLambda1$material3_release();
                            }
                            if (i6 != 0) {
                                shape2 = PullToRefreshDefaults.INSTANCE.getShape();
                            }
                            if ((i2 & 16) != 0) {
                                containerColor = PullToRefreshDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                contentColor = PullToRefreshDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i3 &= -458753;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-801976958, i3, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer (PullToRefresh.kt:115)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(751291370);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$showElevation$1$1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    return Boolean.valueOf(pullToRefreshState.getVerticalOffset() > 1.0f || pullToRefreshState.isRefreshing());
                                }

                                {
                                    super(0);
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        final State state = (State) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        final Modifier modifier3 = modifier2;
                        final Shape shape4 = shape2;
                        final long j4 = containerColor;
                        final Function3<? super PullToRefreshState, ? super Composer, ? super Integer, Unit> function5 = function3M2818getLambda1$material3_release;
                        CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4208boximpl(contentColor)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 935555266, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i11) {
                                float fM6935constructorimpl;
                                if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(935555266, i11, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer.<anonymous> (PullToRefresh.kt:122)");
                                    }
                                    Modifier modifierM1047size3ABfNKs = SizeKt.m1047size3ABfNKs(modifier3, PullToRefreshKt.getSpinnerContainerSize());
                                    composer2.startReplaceableGroup(-1737250521);
                                    boolean zChanged = composer2.changed(pullToRefreshState);
                                    final PullToRefreshState pullToRefreshState2 = pullToRefreshState;
                                    Object objRememberedValue2 = composer2.rememberedValue();
                                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1$1$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                                invoke2(graphicsLayerScope);
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                                graphicsLayerScope.setTranslationY(pullToRefreshState2.getVerticalOffset() - Size.m4040getHeightimpl(graphicsLayerScope.getSize()));
                                            }

                                            {
                                                super(1);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer2.endReplaceableGroup();
                                    Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierM1047size3ABfNKs, (Function1) objRememberedValue2);
                                    if (state.getValue().booleanValue()) {
                                        fM6935constructorimpl = PullToRefreshKt.Elevation;
                                    } else {
                                        fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                                    }
                                    Modifier modifierM556backgroundbw27NRU = BackgroundKt.m556backgroundbw27NRU(ShadowKt.m3821shadows4CzXII$default(modifierGraphicsLayer, fM6935constructorimpl, shape4, true, 0L, 0L, 24, null), j4, shape4);
                                    Function3<PullToRefreshState, Composer, Integer, Unit> function6 = function5;
                                    PullToRefreshState pullToRefreshState3 = pullToRefreshState;
                                    composer2.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                    composer2.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM556backgroundbw27NRU);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer composerM3536constructorimpl = Updater.m3536constructorimpl(composer2);
                                    Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                    if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m3506boximpl(SkippableUpdater.m3507constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    function6.invoke(pullToRefreshState3, composer2, 0);
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }
                        }), composerStartRestartGroup, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                    }
                    function4 = function3M2818getLambda1$material3_release;
                    shape3 = shape2;
                    j3 = contentColor;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier4 = modifier2;
                        final long j5 = containerColor;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i11) {
                                PullToRefreshKt.m2822PullToRefreshContainerwBJOh4Y(pullToRefreshState, modifier4, function4, shape3, j5, j3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 3072;
                shape2 = shape;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        containerColor = j;
                        if (composerStartRestartGroup.changed(containerColor)) {
                        }
                        i3 |= i9;
                    } else {
                        containerColor = j;
                    }
                    i3 |= i9;
                } else {
                    containerColor = j;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        contentColor = j2;
                        if (composerStartRestartGroup.changed(contentColor)) {
                        }
                        i3 |= i10;
                    } else {
                        contentColor = j2;
                    }
                    i3 |= i10;
                } else {
                    contentColor = j2;
                }
                if ((74899 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            function3M2818getLambda1$material3_release = ComposableSingletons$PullToRefreshKt.INSTANCE.m2818getLambda1$material3_release();
                        }
                        if (i6 != 0) {
                            shape2 = PullToRefreshDefaults.INSTANCE.getShape();
                        }
                        if ((i2 & 16) != 0) {
                            containerColor = PullToRefreshDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            contentColor = PullToRefreshDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                    } else {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            function3M2818getLambda1$material3_release = ComposableSingletons$PullToRefreshKt.INSTANCE.m2818getLambda1$material3_release();
                        }
                        if (i6 != 0) {
                            shape2 = PullToRefreshDefaults.INSTANCE.getShape();
                        }
                        if ((i2 & 16) != 0) {
                            containerColor = PullToRefreshDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            contentColor = PullToRefreshDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-801976958, i3, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer (PullToRefresh.kt:115)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(751291370);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$showElevation$1$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                return Boolean.valueOf(pullToRefreshState.getVerticalOffset() > 1.0f || pullToRefreshState.isRefreshing());
                            }

                            {
                                super(0);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    final State<Boolean> state2 = (State) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    final Modifier modifier5 = modifier2;
                    final Shape shape5 = shape2;
                    final long j6 = containerColor;
                    final Function3<? super PullToRefreshState, ? super Composer, ? super Integer, Unit> function6 = function3M2818getLambda1$material3_release;
                    CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4208boximpl(contentColor)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 935555266, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11) {
                            float fM6935constructorimpl;
                            if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(935555266, i11, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer.<anonymous> (PullToRefresh.kt:122)");
                                }
                                Modifier modifierM1047size3ABfNKs = SizeKt.m1047size3ABfNKs(modifier5, PullToRefreshKt.getSpinnerContainerSize());
                                composer2.startReplaceableGroup(-1737250521);
                                boolean zChanged = composer2.changed(pullToRefreshState);
                                final PullToRefreshState pullToRefreshState2 = pullToRefreshState;
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1$1$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                            invoke2(graphicsLayerScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                            graphicsLayerScope.setTranslationY(pullToRefreshState2.getVerticalOffset() - Size.m4040getHeightimpl(graphicsLayerScope.getSize()));
                                        }

                                        {
                                            super(1);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierM1047size3ABfNKs, (Function1) objRememberedValue2);
                                if (state2.getValue().booleanValue()) {
                                    fM6935constructorimpl = PullToRefreshKt.Elevation;
                                } else {
                                    fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                                }
                                Modifier modifierM556backgroundbw27NRU = BackgroundKt.m556backgroundbw27NRU(ShadowKt.m3821shadows4CzXII$default(modifierGraphicsLayer, fM6935constructorimpl, shape5, true, 0L, 0L, 24, null), j6, shape5);
                                Function3<PullToRefreshState, Composer, Integer, Unit> function7 = function6;
                                PullToRefreshState pullToRefreshState3 = pullToRefreshState;
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM556backgroundbw27NRU);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM3536constructorimpl = Updater.m3536constructorimpl(composer2);
                                Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m3506boximpl(SkippableUpdater.m3507constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                function7.invoke(pullToRefreshState3, composer2, 0);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }
                    }), composerStartRestartGroup, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            function3M2818getLambda1$material3_release = ComposableSingletons$PullToRefreshKt.INSTANCE.m2818getLambda1$material3_release();
                        }
                        if (i6 != 0) {
                            shape2 = PullToRefreshDefaults.INSTANCE.getShape();
                        }
                        if ((i2 & 16) != 0) {
                            containerColor = PullToRefreshDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            contentColor = PullToRefreshDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                    } else {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            function3M2818getLambda1$material3_release = ComposableSingletons$PullToRefreshKt.INSTANCE.m2818getLambda1$material3_release();
                        }
                        if (i6 != 0) {
                            shape2 = PullToRefreshDefaults.INSTANCE.getShape();
                        }
                        if ((i2 & 16) != 0) {
                            containerColor = PullToRefreshDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            contentColor = PullToRefreshDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-801976958, i3, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer (PullToRefresh.kt:115)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(751291370);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$showElevation$1$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                return Boolean.valueOf(pullToRefreshState.getVerticalOffset() > 1.0f || pullToRefreshState.isRefreshing());
                            }

                            {
                                super(0);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    final State<Boolean> state3 = (State) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    final Modifier modifier6 = modifier2;
                    final Shape shape6 = shape2;
                    final long j7 = containerColor;
                    final Function3<? super PullToRefreshState, ? super Composer, ? super Integer, Unit> function7 = function3M2818getLambda1$material3_release;
                    CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4208boximpl(contentColor)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 935555266, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11) {
                            float fM6935constructorimpl;
                            if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(935555266, i11, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer.<anonymous> (PullToRefresh.kt:122)");
                                }
                                Modifier modifierM1047size3ABfNKs = SizeKt.m1047size3ABfNKs(modifier6, PullToRefreshKt.getSpinnerContainerSize());
                                composer2.startReplaceableGroup(-1737250521);
                                boolean zChanged = composer2.changed(pullToRefreshState);
                                final PullToRefreshState pullToRefreshState2 = pullToRefreshState;
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1$1$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                            invoke2(graphicsLayerScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                            graphicsLayerScope.setTranslationY(pullToRefreshState2.getVerticalOffset() - Size.m4040getHeightimpl(graphicsLayerScope.getSize()));
                                        }

                                        {
                                            super(1);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierM1047size3ABfNKs, (Function1) objRememberedValue2);
                                if (state3.getValue().booleanValue()) {
                                    fM6935constructorimpl = PullToRefreshKt.Elevation;
                                } else {
                                    fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                                }
                                Modifier modifierM556backgroundbw27NRU = BackgroundKt.m556backgroundbw27NRU(ShadowKt.m3821shadows4CzXII$default(modifierGraphicsLayer, fM6935constructorimpl, shape6, true, 0L, 0L, 24, null), j7, shape6);
                                Function3<PullToRefreshState, Composer, Integer, Unit> function8 = function7;
                                PullToRefreshState pullToRefreshState3 = pullToRefreshState;
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM556backgroundbw27NRU);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM3536constructorimpl = Updater.m3536constructorimpl(composer2);
                                Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m3506boximpl(SkippableUpdater.m3507constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                function8.invoke(pullToRefreshState3, composer2, 0);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }
                    }), composerStartRestartGroup, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                function4 = function3M2818getLambda1$material3_release;
                shape3 = shape2;
                j3 = contentColor;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier7 = modifier2;
                    final long j8 = containerColor;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11) {
                            PullToRefreshKt.m2822PullToRefreshContainerwBJOh4Y(pullToRefreshState, modifier7, function4, shape3, j8, j3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 384;
            function3M2818getLambda1$material3_release = function3;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        containerColor = j;
                        if (composerStartRestartGroup.changed(containerColor)) {
                        }
                        i3 |= i9;
                    } else {
                        containerColor = j;
                    }
                    i3 |= i9;
                } else {
                    containerColor = j;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        contentColor = j2;
                        if (composerStartRestartGroup.changed(contentColor)) {
                        }
                        i3 |= i10;
                    } else {
                        contentColor = j2;
                    }
                    i3 |= i10;
                } else {
                    contentColor = j2;
                }
                if ((74899 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            function3M2818getLambda1$material3_release = ComposableSingletons$PullToRefreshKt.INSTANCE.m2818getLambda1$material3_release();
                        }
                        if (i6 != 0) {
                            shape2 = PullToRefreshDefaults.INSTANCE.getShape();
                        }
                        if ((i2 & 16) != 0) {
                            containerColor = PullToRefreshDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            contentColor = PullToRefreshDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                    } else {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            function3M2818getLambda1$material3_release = ComposableSingletons$PullToRefreshKt.INSTANCE.m2818getLambda1$material3_release();
                        }
                        if (i6 != 0) {
                            shape2 = PullToRefreshDefaults.INSTANCE.getShape();
                        }
                        if ((i2 & 16) != 0) {
                            containerColor = PullToRefreshDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            contentColor = PullToRefreshDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-801976958, i3, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer (PullToRefresh.kt:115)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(751291370);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$showElevation$1$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                return Boolean.valueOf(pullToRefreshState.getVerticalOffset() > 1.0f || pullToRefreshState.isRefreshing());
                            }

                            {
                                super(0);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    final State<Boolean> state4 = (State) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    final Modifier modifier8 = modifier2;
                    final Shape shape7 = shape2;
                    final long j9 = containerColor;
                    final Function3<? super PullToRefreshState, ? super Composer, ? super Integer, Unit> function8 = function3M2818getLambda1$material3_release;
                    CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4208boximpl(contentColor)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 935555266, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11) {
                            float fM6935constructorimpl;
                            if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(935555266, i11, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer.<anonymous> (PullToRefresh.kt:122)");
                                }
                                Modifier modifierM1047size3ABfNKs = SizeKt.m1047size3ABfNKs(modifier8, PullToRefreshKt.getSpinnerContainerSize());
                                composer2.startReplaceableGroup(-1737250521);
                                boolean zChanged = composer2.changed(pullToRefreshState);
                                final PullToRefreshState pullToRefreshState2 = pullToRefreshState;
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1$1$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                            invoke2(graphicsLayerScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                            graphicsLayerScope.setTranslationY(pullToRefreshState2.getVerticalOffset() - Size.m4040getHeightimpl(graphicsLayerScope.getSize()));
                                        }

                                        {
                                            super(1);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierM1047size3ABfNKs, (Function1) objRememberedValue2);
                                if (state4.getValue().booleanValue()) {
                                    fM6935constructorimpl = PullToRefreshKt.Elevation;
                                } else {
                                    fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                                }
                                Modifier modifierM556backgroundbw27NRU = BackgroundKt.m556backgroundbw27NRU(ShadowKt.m3821shadows4CzXII$default(modifierGraphicsLayer, fM6935constructorimpl, shape7, true, 0L, 0L, 24, null), j9, shape7);
                                Function3<PullToRefreshState, Composer, Integer, Unit> function9 = function8;
                                PullToRefreshState pullToRefreshState3 = pullToRefreshState;
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM556backgroundbw27NRU);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM3536constructorimpl = Updater.m3536constructorimpl(composer2);
                                Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m3506boximpl(SkippableUpdater.m3507constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                function9.invoke(pullToRefreshState3, composer2, 0);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }
                    }), composerStartRestartGroup, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            function3M2818getLambda1$material3_release = ComposableSingletons$PullToRefreshKt.INSTANCE.m2818getLambda1$material3_release();
                        }
                        if (i6 != 0) {
                            shape2 = PullToRefreshDefaults.INSTANCE.getShape();
                        }
                        if ((i2 & 16) != 0) {
                            containerColor = PullToRefreshDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            contentColor = PullToRefreshDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                    } else {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            function3M2818getLambda1$material3_release = ComposableSingletons$PullToRefreshKt.INSTANCE.m2818getLambda1$material3_release();
                        }
                        if (i6 != 0) {
                            shape2 = PullToRefreshDefaults.INSTANCE.getShape();
                        }
                        if ((i2 & 16) != 0) {
                            containerColor = PullToRefreshDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            contentColor = PullToRefreshDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-801976958, i3, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer (PullToRefresh.kt:115)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(751291370);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$showElevation$1$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                return Boolean.valueOf(pullToRefreshState.getVerticalOffset() > 1.0f || pullToRefreshState.isRefreshing());
                            }

                            {
                                super(0);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    final State<Boolean> state5 = (State) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    final Modifier modifier9 = modifier2;
                    final Shape shape8 = shape2;
                    final long j10 = containerColor;
                    final Function3<? super PullToRefreshState, ? super Composer, ? super Integer, Unit> function9 = function3M2818getLambda1$material3_release;
                    CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4208boximpl(contentColor)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 935555266, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11) {
                            float fM6935constructorimpl;
                            if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(935555266, i11, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer.<anonymous> (PullToRefresh.kt:122)");
                                }
                                Modifier modifierM1047size3ABfNKs = SizeKt.m1047size3ABfNKs(modifier9, PullToRefreshKt.getSpinnerContainerSize());
                                composer2.startReplaceableGroup(-1737250521);
                                boolean zChanged = composer2.changed(pullToRefreshState);
                                final PullToRefreshState pullToRefreshState2 = pullToRefreshState;
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1$1$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                            invoke2(graphicsLayerScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                            graphicsLayerScope.setTranslationY(pullToRefreshState2.getVerticalOffset() - Size.m4040getHeightimpl(graphicsLayerScope.getSize()));
                                        }

                                        {
                                            super(1);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierM1047size3ABfNKs, (Function1) objRememberedValue2);
                                if (state5.getValue().booleanValue()) {
                                    fM6935constructorimpl = PullToRefreshKt.Elevation;
                                } else {
                                    fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                                }
                                Modifier modifierM556backgroundbw27NRU = BackgroundKt.m556backgroundbw27NRU(ShadowKt.m3821shadows4CzXII$default(modifierGraphicsLayer, fM6935constructorimpl, shape8, true, 0L, 0L, 24, null), j10, shape8);
                                Function3<PullToRefreshState, Composer, Integer, Unit> function10 = function9;
                                PullToRefreshState pullToRefreshState3 = pullToRefreshState;
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM556backgroundbw27NRU);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM3536constructorimpl = Updater.m3536constructorimpl(composer2);
                                Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m3506boximpl(SkippableUpdater.m3507constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                function10.invoke(pullToRefreshState3, composer2, 0);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }
                    }), composerStartRestartGroup, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                function4 = function3M2818getLambda1$material3_release;
                shape3 = shape2;
                j3 = contentColor;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier10 = modifier2;
                    final long j11 = containerColor;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11) {
                            PullToRefreshKt.m2822PullToRefreshContainerwBJOh4Y(pullToRefreshState, modifier10, function4, shape3, j11, j3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            shape2 = shape;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    containerColor = j;
                    if (composerStartRestartGroup.changed(containerColor)) {
                    }
                    i3 |= i9;
                } else {
                    containerColor = j;
                }
                i3 |= i9;
            } else {
                containerColor = j;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    contentColor = j2;
                    if (composerStartRestartGroup.changed(contentColor)) {
                    }
                    i3 |= i10;
                } else {
                    contentColor = j2;
                }
                i3 |= i10;
            } else {
                contentColor = j2;
            }
            if ((74899 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function3M2818getLambda1$material3_release = ComposableSingletons$PullToRefreshKt.INSTANCE.m2818getLambda1$material3_release();
                    }
                    if (i6 != 0) {
                        shape2 = PullToRefreshDefaults.INSTANCE.getShape();
                    }
                    if ((i2 & 16) != 0) {
                        containerColor = PullToRefreshDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        contentColor = PullToRefreshDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                } else {
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function3M2818getLambda1$material3_release = ComposableSingletons$PullToRefreshKt.INSTANCE.m2818getLambda1$material3_release();
                    }
                    if (i6 != 0) {
                        shape2 = PullToRefreshDefaults.INSTANCE.getShape();
                    }
                    if ((i2 & 16) != 0) {
                        containerColor = PullToRefreshDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        contentColor = PullToRefreshDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-801976958, i3, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer (PullToRefresh.kt:115)");
                }
                composerStartRestartGroup.startReplaceableGroup(751291370);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$showElevation$1$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return Boolean.valueOf(pullToRefreshState.getVerticalOffset() > 1.0f || pullToRefreshState.isRefreshing());
                        }

                        {
                            super(0);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final State<Boolean> state6 = (State) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                final Modifier modifier11 = modifier2;
                final Shape shape9 = shape2;
                final long j12 = containerColor;
                final Function3<? super PullToRefreshState, ? super Composer, ? super Integer, Unit> function10 = function3M2818getLambda1$material3_release;
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4208boximpl(contentColor)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 935555266, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11) {
                        float fM6935constructorimpl;
                        if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(935555266, i11, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer.<anonymous> (PullToRefresh.kt:122)");
                            }
                            Modifier modifierM1047size3ABfNKs = SizeKt.m1047size3ABfNKs(modifier11, PullToRefreshKt.getSpinnerContainerSize());
                            composer2.startReplaceableGroup(-1737250521);
                            boolean zChanged = composer2.changed(pullToRefreshState);
                            final PullToRefreshState pullToRefreshState2 = pullToRefreshState;
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1$1$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                        invoke2(graphicsLayerScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                        graphicsLayerScope.setTranslationY(pullToRefreshState2.getVerticalOffset() - Size.m4040getHeightimpl(graphicsLayerScope.getSize()));
                                    }

                                    {
                                        super(1);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierM1047size3ABfNKs, (Function1) objRememberedValue2);
                            if (state6.getValue().booleanValue()) {
                                fM6935constructorimpl = PullToRefreshKt.Elevation;
                            } else {
                                fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                            }
                            Modifier modifierM556backgroundbw27NRU = BackgroundKt.m556backgroundbw27NRU(ShadowKt.m3821shadows4CzXII$default(modifierGraphicsLayer, fM6935constructorimpl, shape9, true, 0L, 0L, 24, null), j12, shape9);
                            Function3<PullToRefreshState, Composer, Integer, Unit> function11 = function10;
                            PullToRefreshState pullToRefreshState3 = pullToRefreshState;
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM556backgroundbw27NRU);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM3536constructorimpl = Updater.m3536constructorimpl(composer2);
                            Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m3506boximpl(SkippableUpdater.m3507constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            function11.invoke(pullToRefreshState3, composer2, 0);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }
                }), composerStartRestartGroup, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function3M2818getLambda1$material3_release = ComposableSingletons$PullToRefreshKt.INSTANCE.m2818getLambda1$material3_release();
                    }
                    if (i6 != 0) {
                        shape2 = PullToRefreshDefaults.INSTANCE.getShape();
                    }
                    if ((i2 & 16) != 0) {
                        containerColor = PullToRefreshDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        contentColor = PullToRefreshDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                } else {
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function3M2818getLambda1$material3_release = ComposableSingletons$PullToRefreshKt.INSTANCE.m2818getLambda1$material3_release();
                    }
                    if (i6 != 0) {
                        shape2 = PullToRefreshDefaults.INSTANCE.getShape();
                    }
                    if ((i2 & 16) != 0) {
                        containerColor = PullToRefreshDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        contentColor = PullToRefreshDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-801976958, i3, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer (PullToRefresh.kt:115)");
                }
                composerStartRestartGroup.startReplaceableGroup(751291370);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$showElevation$1$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return Boolean.valueOf(pullToRefreshState.getVerticalOffset() > 1.0f || pullToRefreshState.isRefreshing());
                        }

                        {
                            super(0);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final State<Boolean> state7 = (State) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                final Modifier modifier12 = modifier2;
                final Shape shape10 = shape2;
                final long j13 = containerColor;
                final Function3<? super PullToRefreshState, ? super Composer, ? super Integer, Unit> function11 = function3M2818getLambda1$material3_release;
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4208boximpl(contentColor)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 935555266, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11) {
                        float fM6935constructorimpl;
                        if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(935555266, i11, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer.<anonymous> (PullToRefresh.kt:122)");
                            }
                            Modifier modifierM1047size3ABfNKs = SizeKt.m1047size3ABfNKs(modifier12, PullToRefreshKt.getSpinnerContainerSize());
                            composer2.startReplaceableGroup(-1737250521);
                            boolean zChanged = composer2.changed(pullToRefreshState);
                            final PullToRefreshState pullToRefreshState2 = pullToRefreshState;
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1$1$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                        invoke2(graphicsLayerScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                        graphicsLayerScope.setTranslationY(pullToRefreshState2.getVerticalOffset() - Size.m4040getHeightimpl(graphicsLayerScope.getSize()));
                                    }

                                    {
                                        super(1);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierM1047size3ABfNKs, (Function1) objRememberedValue2);
                            if (state7.getValue().booleanValue()) {
                                fM6935constructorimpl = PullToRefreshKt.Elevation;
                            } else {
                                fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                            }
                            Modifier modifierM556backgroundbw27NRU = BackgroundKt.m556backgroundbw27NRU(ShadowKt.m3821shadows4CzXII$default(modifierGraphicsLayer, fM6935constructorimpl, shape10, true, 0L, 0L, 24, null), j13, shape10);
                            Function3<PullToRefreshState, Composer, Integer, Unit> function12 = function11;
                            PullToRefreshState pullToRefreshState3 = pullToRefreshState;
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM556backgroundbw27NRU);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM3536constructorimpl = Updater.m3536constructorimpl(composer2);
                            Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m3506boximpl(SkippableUpdater.m3507constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            function12.invoke(pullToRefreshState3, composer2, 0);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }
                }), composerStartRestartGroup, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            function4 = function3M2818getLambda1$material3_release;
            shape3 = shape2;
            j3 = contentColor;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier13 = modifier2;
                final long j14 = containerColor;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11) {
                        PullToRefreshKt.m2822PullToRefreshContainerwBJOh4Y(pullToRefreshState, modifier13, function4, shape3, j14, j3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                function3M2818getLambda1$material3_release = function3;
                if (composerStartRestartGroup.changedInstance(function3M2818getLambda1$material3_release)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        containerColor = j;
                        if (composerStartRestartGroup.changed(containerColor)) {
                        }
                        i3 |= i9;
                    } else {
                        containerColor = j;
                    }
                    i3 |= i9;
                } else {
                    containerColor = j;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        contentColor = j2;
                        if (composerStartRestartGroup.changed(contentColor)) {
                        }
                        i3 |= i10;
                    } else {
                        contentColor = j2;
                    }
                    i3 |= i10;
                } else {
                    contentColor = j2;
                }
                if ((74899 & i3) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            function3M2818getLambda1$material3_release = ComposableSingletons$PullToRefreshKt.INSTANCE.m2818getLambda1$material3_release();
                        }
                        if (i6 != 0) {
                            shape2 = PullToRefreshDefaults.INSTANCE.getShape();
                        }
                        if ((i2 & 16) != 0) {
                            containerColor = PullToRefreshDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            contentColor = PullToRefreshDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                    } else {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            function3M2818getLambda1$material3_release = ComposableSingletons$PullToRefreshKt.INSTANCE.m2818getLambda1$material3_release();
                        }
                        if (i6 != 0) {
                            shape2 = PullToRefreshDefaults.INSTANCE.getShape();
                        }
                        if ((i2 & 16) != 0) {
                            containerColor = PullToRefreshDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            contentColor = PullToRefreshDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-801976958, i3, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer (PullToRefresh.kt:115)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(751291370);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$showElevation$1$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                return Boolean.valueOf(pullToRefreshState.getVerticalOffset() > 1.0f || pullToRefreshState.isRefreshing());
                            }

                            {
                                super(0);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    final State<Boolean> state8 = (State) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    final Modifier modifier14 = modifier2;
                    final Shape shape11 = shape2;
                    final long j15 = containerColor;
                    final Function3<? super PullToRefreshState, ? super Composer, ? super Integer, Unit> function12 = function3M2818getLambda1$material3_release;
                    CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4208boximpl(contentColor)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 935555266, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11) {
                            float fM6935constructorimpl;
                            if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(935555266, i11, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer.<anonymous> (PullToRefresh.kt:122)");
                                }
                                Modifier modifierM1047size3ABfNKs = SizeKt.m1047size3ABfNKs(modifier14, PullToRefreshKt.getSpinnerContainerSize());
                                composer2.startReplaceableGroup(-1737250521);
                                boolean zChanged = composer2.changed(pullToRefreshState);
                                final PullToRefreshState pullToRefreshState2 = pullToRefreshState;
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1$1$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                            invoke2(graphicsLayerScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                            graphicsLayerScope.setTranslationY(pullToRefreshState2.getVerticalOffset() - Size.m4040getHeightimpl(graphicsLayerScope.getSize()));
                                        }

                                        {
                                            super(1);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierM1047size3ABfNKs, (Function1) objRememberedValue2);
                                if (state8.getValue().booleanValue()) {
                                    fM6935constructorimpl = PullToRefreshKt.Elevation;
                                } else {
                                    fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                                }
                                Modifier modifierM556backgroundbw27NRU = BackgroundKt.m556backgroundbw27NRU(ShadowKt.m3821shadows4CzXII$default(modifierGraphicsLayer, fM6935constructorimpl, shape11, true, 0L, 0L, 24, null), j15, shape11);
                                Function3<PullToRefreshState, Composer, Integer, Unit> function13 = function12;
                                PullToRefreshState pullToRefreshState3 = pullToRefreshState;
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM556backgroundbw27NRU);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM3536constructorimpl = Updater.m3536constructorimpl(composer2);
                                Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m3506boximpl(SkippableUpdater.m3507constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                function13.invoke(pullToRefreshState3, composer2, 0);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }
                    }), composerStartRestartGroup, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            function3M2818getLambda1$material3_release = ComposableSingletons$PullToRefreshKt.INSTANCE.m2818getLambda1$material3_release();
                        }
                        if (i6 != 0) {
                            shape2 = PullToRefreshDefaults.INSTANCE.getShape();
                        }
                        if ((i2 & 16) != 0) {
                            containerColor = PullToRefreshDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            contentColor = PullToRefreshDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                    } else {
                        if (i8 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i4 != 0) {
                            function3M2818getLambda1$material3_release = ComposableSingletons$PullToRefreshKt.INSTANCE.m2818getLambda1$material3_release();
                        }
                        if (i6 != 0) {
                            shape2 = PullToRefreshDefaults.INSTANCE.getShape();
                        }
                        if ((i2 & 16) != 0) {
                            containerColor = PullToRefreshDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            contentColor = PullToRefreshDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-801976958, i3, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer (PullToRefresh.kt:115)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(751291370);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$showElevation$1$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final Boolean invoke() {
                                return Boolean.valueOf(pullToRefreshState.getVerticalOffset() > 1.0f || pullToRefreshState.isRefreshing());
                            }

                            {
                                super(0);
                            }
                        });
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    final State<Boolean> state9 = (State) objRememberedValue;
                    composerStartRestartGroup.endReplaceableGroup();
                    final Modifier modifier15 = modifier2;
                    final Shape shape12 = shape2;
                    final long j16 = containerColor;
                    final Function3<? super PullToRefreshState, ? super Composer, ? super Integer, Unit> function13 = function3M2818getLambda1$material3_release;
                    CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4208boximpl(contentColor)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 935555266, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11) {
                            float fM6935constructorimpl;
                            if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(935555266, i11, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer.<anonymous> (PullToRefresh.kt:122)");
                                }
                                Modifier modifierM1047size3ABfNKs = SizeKt.m1047size3ABfNKs(modifier15, PullToRefreshKt.getSpinnerContainerSize());
                                composer2.startReplaceableGroup(-1737250521);
                                boolean zChanged = composer2.changed(pullToRefreshState);
                                final PullToRefreshState pullToRefreshState2 = pullToRefreshState;
                                Object objRememberedValue2 = composer2.rememberedValue();
                                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1$1$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                            invoke2(graphicsLayerScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                            graphicsLayerScope.setTranslationY(pullToRefreshState2.getVerticalOffset() - Size.m4040getHeightimpl(graphicsLayerScope.getSize()));
                                        }

                                        {
                                            super(1);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue2);
                                }
                                composer2.endReplaceableGroup();
                                Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierM1047size3ABfNKs, (Function1) objRememberedValue2);
                                if (state9.getValue().booleanValue()) {
                                    fM6935constructorimpl = PullToRefreshKt.Elevation;
                                } else {
                                    fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                                }
                                Modifier modifierM556backgroundbw27NRU = BackgroundKt.m556backgroundbw27NRU(ShadowKt.m3821shadows4CzXII$default(modifierGraphicsLayer, fM6935constructorimpl, shape12, true, 0L, 0L, 24, null), j16, shape12);
                                Function3<PullToRefreshState, Composer, Integer, Unit> function14 = function13;
                                PullToRefreshState pullToRefreshState3 = pullToRefreshState;
                                composer2.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM556backgroundbw27NRU);
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM3536constructorimpl = Updater.m3536constructorimpl(composer2);
                                Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                function3ModifierMaterializerOf.invoke(SkippableUpdater.m3506boximpl(SkippableUpdater.m3507constructorimpl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                function14.invoke(pullToRefreshState3, composer2, 0);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }
                    }), composerStartRestartGroup, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                function4 = function3M2818getLambda1$material3_release;
                shape3 = shape2;
                j3 = contentColor;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier16 = modifier2;
                    final long j17 = containerColor;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11) {
                            PullToRefreshKt.m2822PullToRefreshContainerwBJOh4Y(pullToRefreshState, modifier16, function4, shape3, j17, j3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            shape2 = shape;
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    containerColor = j;
                    if (composerStartRestartGroup.changed(containerColor)) {
                    }
                    i3 |= i9;
                } else {
                    containerColor = j;
                }
                i3 |= i9;
            } else {
                containerColor = j;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    contentColor = j2;
                    if (composerStartRestartGroup.changed(contentColor)) {
                    }
                    i3 |= i10;
                } else {
                    contentColor = j2;
                }
                i3 |= i10;
            } else {
                contentColor = j2;
            }
            if ((74899 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function3M2818getLambda1$material3_release = ComposableSingletons$PullToRefreshKt.INSTANCE.m2818getLambda1$material3_release();
                    }
                    if (i6 != 0) {
                        shape2 = PullToRefreshDefaults.INSTANCE.getShape();
                    }
                    if ((i2 & 16) != 0) {
                        containerColor = PullToRefreshDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        contentColor = PullToRefreshDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                } else {
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function3M2818getLambda1$material3_release = ComposableSingletons$PullToRefreshKt.INSTANCE.m2818getLambda1$material3_release();
                    }
                    if (i6 != 0) {
                        shape2 = PullToRefreshDefaults.INSTANCE.getShape();
                    }
                    if ((i2 & 16) != 0) {
                        containerColor = PullToRefreshDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        contentColor = PullToRefreshDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-801976958, i3, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer (PullToRefresh.kt:115)");
                }
                composerStartRestartGroup.startReplaceableGroup(751291370);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$showElevation$1$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return Boolean.valueOf(pullToRefreshState.getVerticalOffset() > 1.0f || pullToRefreshState.isRefreshing());
                        }

                        {
                            super(0);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final State<Boolean> state10 = (State) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                final Modifier modifier17 = modifier2;
                final Shape shape13 = shape2;
                final long j18 = containerColor;
                final Function3<? super PullToRefreshState, ? super Composer, ? super Integer, Unit> function14 = function3M2818getLambda1$material3_release;
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4208boximpl(contentColor)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 935555266, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11) {
                        float fM6935constructorimpl;
                        if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(935555266, i11, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer.<anonymous> (PullToRefresh.kt:122)");
                            }
                            Modifier modifierM1047size3ABfNKs = SizeKt.m1047size3ABfNKs(modifier17, PullToRefreshKt.getSpinnerContainerSize());
                            composer2.startReplaceableGroup(-1737250521);
                            boolean zChanged = composer2.changed(pullToRefreshState);
                            final PullToRefreshState pullToRefreshState2 = pullToRefreshState;
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1$1$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                        invoke2(graphicsLayerScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                        graphicsLayerScope.setTranslationY(pullToRefreshState2.getVerticalOffset() - Size.m4040getHeightimpl(graphicsLayerScope.getSize()));
                                    }

                                    {
                                        super(1);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierM1047size3ABfNKs, (Function1) objRememberedValue2);
                            if (state10.getValue().booleanValue()) {
                                fM6935constructorimpl = PullToRefreshKt.Elevation;
                            } else {
                                fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                            }
                            Modifier modifierM556backgroundbw27NRU = BackgroundKt.m556backgroundbw27NRU(ShadowKt.m3821shadows4CzXII$default(modifierGraphicsLayer, fM6935constructorimpl, shape13, true, 0L, 0L, 24, null), j18, shape13);
                            Function3<PullToRefreshState, Composer, Integer, Unit> function15 = function14;
                            PullToRefreshState pullToRefreshState3 = pullToRefreshState;
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM556backgroundbw27NRU);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM3536constructorimpl = Updater.m3536constructorimpl(composer2);
                            Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m3506boximpl(SkippableUpdater.m3507constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            function15.invoke(pullToRefreshState3, composer2, 0);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }
                }), composerStartRestartGroup, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function3M2818getLambda1$material3_release = ComposableSingletons$PullToRefreshKt.INSTANCE.m2818getLambda1$material3_release();
                    }
                    if (i6 != 0) {
                        shape2 = PullToRefreshDefaults.INSTANCE.getShape();
                    }
                    if ((i2 & 16) != 0) {
                        containerColor = PullToRefreshDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        contentColor = PullToRefreshDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                } else {
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function3M2818getLambda1$material3_release = ComposableSingletons$PullToRefreshKt.INSTANCE.m2818getLambda1$material3_release();
                    }
                    if (i6 != 0) {
                        shape2 = PullToRefreshDefaults.INSTANCE.getShape();
                    }
                    if ((i2 & 16) != 0) {
                        containerColor = PullToRefreshDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        contentColor = PullToRefreshDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-801976958, i3, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer (PullToRefresh.kt:115)");
                }
                composerStartRestartGroup.startReplaceableGroup(751291370);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$showElevation$1$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return Boolean.valueOf(pullToRefreshState.getVerticalOffset() > 1.0f || pullToRefreshState.isRefreshing());
                        }

                        {
                            super(0);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final State<Boolean> state11 = (State) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                final Modifier modifier18 = modifier2;
                final Shape shape14 = shape2;
                final long j19 = containerColor;
                final Function3<? super PullToRefreshState, ? super Composer, ? super Integer, Unit> function15 = function3M2818getLambda1$material3_release;
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4208boximpl(contentColor)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 935555266, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11) {
                        float fM6935constructorimpl;
                        if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(935555266, i11, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer.<anonymous> (PullToRefresh.kt:122)");
                            }
                            Modifier modifierM1047size3ABfNKs = SizeKt.m1047size3ABfNKs(modifier18, PullToRefreshKt.getSpinnerContainerSize());
                            composer2.startReplaceableGroup(-1737250521);
                            boolean zChanged = composer2.changed(pullToRefreshState);
                            final PullToRefreshState pullToRefreshState2 = pullToRefreshState;
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1$1$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                        invoke2(graphicsLayerScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                        graphicsLayerScope.setTranslationY(pullToRefreshState2.getVerticalOffset() - Size.m4040getHeightimpl(graphicsLayerScope.getSize()));
                                    }

                                    {
                                        super(1);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierM1047size3ABfNKs, (Function1) objRememberedValue2);
                            if (state11.getValue().booleanValue()) {
                                fM6935constructorimpl = PullToRefreshKt.Elevation;
                            } else {
                                fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                            }
                            Modifier modifierM556backgroundbw27NRU = BackgroundKt.m556backgroundbw27NRU(ShadowKt.m3821shadows4CzXII$default(modifierGraphicsLayer, fM6935constructorimpl, shape14, true, 0L, 0L, 24, null), j19, shape14);
                            Function3<PullToRefreshState, Composer, Integer, Unit> function16 = function15;
                            PullToRefreshState pullToRefreshState3 = pullToRefreshState;
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM556backgroundbw27NRU);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM3536constructorimpl = Updater.m3536constructorimpl(composer2);
                            Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m3506boximpl(SkippableUpdater.m3507constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            function16.invoke(pullToRefreshState3, composer2, 0);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }
                }), composerStartRestartGroup, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            function4 = function3M2818getLambda1$material3_release;
            shape3 = shape2;
            j3 = contentColor;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier19 = modifier2;
                final long j110 = containerColor;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11) {
                        PullToRefreshKt.m2822PullToRefreshContainerwBJOh4Y(pullToRefreshState, modifier19, function4, shape3, j110, j3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 384;
        function3M2818getLambda1$material3_release = function3;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    containerColor = j;
                    if (composerStartRestartGroup.changed(containerColor)) {
                    }
                    i3 |= i9;
                } else {
                    containerColor = j;
                }
                i3 |= i9;
            } else {
                containerColor = j;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    contentColor = j2;
                    if (composerStartRestartGroup.changed(contentColor)) {
                    }
                    i3 |= i10;
                } else {
                    contentColor = j2;
                }
                i3 |= i10;
            } else {
                contentColor = j2;
            }
            if ((74899 & i3) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function3M2818getLambda1$material3_release = ComposableSingletons$PullToRefreshKt.INSTANCE.m2818getLambda1$material3_release();
                    }
                    if (i6 != 0) {
                        shape2 = PullToRefreshDefaults.INSTANCE.getShape();
                    }
                    if ((i2 & 16) != 0) {
                        containerColor = PullToRefreshDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        contentColor = PullToRefreshDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                } else {
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function3M2818getLambda1$material3_release = ComposableSingletons$PullToRefreshKt.INSTANCE.m2818getLambda1$material3_release();
                    }
                    if (i6 != 0) {
                        shape2 = PullToRefreshDefaults.INSTANCE.getShape();
                    }
                    if ((i2 & 16) != 0) {
                        containerColor = PullToRefreshDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        contentColor = PullToRefreshDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-801976958, i3, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer (PullToRefresh.kt:115)");
                }
                composerStartRestartGroup.startReplaceableGroup(751291370);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$showElevation$1$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return Boolean.valueOf(pullToRefreshState.getVerticalOffset() > 1.0f || pullToRefreshState.isRefreshing());
                        }

                        {
                            super(0);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final State<Boolean> state12 = (State) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                final Modifier modifier110 = modifier2;
                final Shape shape15 = shape2;
                final long j111 = containerColor;
                final Function3<? super PullToRefreshState, ? super Composer, ? super Integer, Unit> function16 = function3M2818getLambda1$material3_release;
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4208boximpl(contentColor)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 935555266, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11) {
                        float fM6935constructorimpl;
                        if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(935555266, i11, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer.<anonymous> (PullToRefresh.kt:122)");
                            }
                            Modifier modifierM1047size3ABfNKs = SizeKt.m1047size3ABfNKs(modifier110, PullToRefreshKt.getSpinnerContainerSize());
                            composer2.startReplaceableGroup(-1737250521);
                            boolean zChanged = composer2.changed(pullToRefreshState);
                            final PullToRefreshState pullToRefreshState2 = pullToRefreshState;
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1$1$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                        invoke2(graphicsLayerScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                        graphicsLayerScope.setTranslationY(pullToRefreshState2.getVerticalOffset() - Size.m4040getHeightimpl(graphicsLayerScope.getSize()));
                                    }

                                    {
                                        super(1);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierM1047size3ABfNKs, (Function1) objRememberedValue2);
                            if (state12.getValue().booleanValue()) {
                                fM6935constructorimpl = PullToRefreshKt.Elevation;
                            } else {
                                fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                            }
                            Modifier modifierM556backgroundbw27NRU = BackgroundKt.m556backgroundbw27NRU(ShadowKt.m3821shadows4CzXII$default(modifierGraphicsLayer, fM6935constructorimpl, shape15, true, 0L, 0L, 24, null), j111, shape15);
                            Function3<PullToRefreshState, Composer, Integer, Unit> function17 = function16;
                            PullToRefreshState pullToRefreshState3 = pullToRefreshState;
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM556backgroundbw27NRU);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM3536constructorimpl = Updater.m3536constructorimpl(composer2);
                            Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m3506boximpl(SkippableUpdater.m3507constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            function17.invoke(pullToRefreshState3, composer2, 0);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }
                }), composerStartRestartGroup, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function3M2818getLambda1$material3_release = ComposableSingletons$PullToRefreshKt.INSTANCE.m2818getLambda1$material3_release();
                    }
                    if (i6 != 0) {
                        shape2 = PullToRefreshDefaults.INSTANCE.getShape();
                    }
                    if ((i2 & 16) != 0) {
                        containerColor = PullToRefreshDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        contentColor = PullToRefreshDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                } else {
                    if (i8 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i4 != 0) {
                        function3M2818getLambda1$material3_release = ComposableSingletons$PullToRefreshKt.INSTANCE.m2818getLambda1$material3_release();
                    }
                    if (i6 != 0) {
                        shape2 = PullToRefreshDefaults.INSTANCE.getShape();
                    }
                    if ((i2 & 16) != 0) {
                        containerColor = PullToRefreshDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 32) != 0) {
                        contentColor = PullToRefreshDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-801976958, i3, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer (PullToRefresh.kt:115)");
                }
                composerStartRestartGroup.startReplaceableGroup(751291370);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$showElevation$1$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return Boolean.valueOf(pullToRefreshState.getVerticalOffset() > 1.0f || pullToRefreshState.isRefreshing());
                        }

                        {
                            super(0);
                        }
                    });
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final State<Boolean> state13 = (State) objRememberedValue;
                composerStartRestartGroup.endReplaceableGroup();
                final Modifier modifier111 = modifier2;
                final Shape shape16 = shape2;
                final long j112 = containerColor;
                final Function3<? super PullToRefreshState, ? super Composer, ? super Integer, Unit> function17 = function3M2818getLambda1$material3_release;
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4208boximpl(contentColor)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 935555266, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11) {
                        float fM6935constructorimpl;
                        if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(935555266, i11, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer.<anonymous> (PullToRefresh.kt:122)");
                            }
                            Modifier modifierM1047size3ABfNKs = SizeKt.m1047size3ABfNKs(modifier111, PullToRefreshKt.getSpinnerContainerSize());
                            composer2.startReplaceableGroup(-1737250521);
                            boolean zChanged = composer2.changed(pullToRefreshState);
                            final PullToRefreshState pullToRefreshState2 = pullToRefreshState;
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1$1$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                        invoke2(graphicsLayerScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                        graphicsLayerScope.setTranslationY(pullToRefreshState2.getVerticalOffset() - Size.m4040getHeightimpl(graphicsLayerScope.getSize()));
                                    }

                                    {
                                        super(1);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceableGroup();
                            Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierM1047size3ABfNKs, (Function1) objRememberedValue2);
                            if (state13.getValue().booleanValue()) {
                                fM6935constructorimpl = PullToRefreshKt.Elevation;
                            } else {
                                fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                            }
                            Modifier modifierM556backgroundbw27NRU = BackgroundKt.m556backgroundbw27NRU(ShadowKt.m3821shadows4CzXII$default(modifierGraphicsLayer, fM6935constructorimpl, shape16, true, 0L, 0L, 24, null), j112, shape16);
                            Function3<PullToRefreshState, Composer, Integer, Unit> function18 = function17;
                            PullToRefreshState pullToRefreshState3 = pullToRefreshState;
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM556backgroundbw27NRU);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM3536constructorimpl = Updater.m3536constructorimpl(composer2);
                            Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m3506boximpl(SkippableUpdater.m3507constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            function18.invoke(pullToRefreshState3, composer2, 0);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }
                }), composerStartRestartGroup, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            function4 = function3M2818getLambda1$material3_release;
            shape3 = shape2;
            j3 = contentColor;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier112 = modifier2;
                final long j113 = containerColor;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11) {
                        PullToRefreshKt.m2822PullToRefreshContainerwBJOh4Y(pullToRefreshState, modifier112, function4, shape3, j113, j3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 3072;
        shape2 = shape;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                containerColor = j;
                if (composerStartRestartGroup.changed(containerColor)) {
                }
                i3 |= i9;
            } else {
                containerColor = j;
            }
            i3 |= i9;
        } else {
            containerColor = j;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                contentColor = j2;
                if (composerStartRestartGroup.changed(contentColor)) {
                }
                i3 |= i10;
            } else {
                contentColor = j2;
            }
            i3 |= i10;
        } else {
            contentColor = j2;
        }
        if ((74899 & i3) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    function3M2818getLambda1$material3_release = ComposableSingletons$PullToRefreshKt.INSTANCE.m2818getLambda1$material3_release();
                }
                if (i6 != 0) {
                    shape2 = PullToRefreshDefaults.INSTANCE.getShape();
                }
                if ((i2 & 16) != 0) {
                    containerColor = PullToRefreshDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    contentColor = PullToRefreshDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i3 &= -458753;
                }
            } else {
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    function3M2818getLambda1$material3_release = ComposableSingletons$PullToRefreshKt.INSTANCE.m2818getLambda1$material3_release();
                }
                if (i6 != 0) {
                    shape2 = PullToRefreshDefaults.INSTANCE.getShape();
                }
                if ((i2 & 16) != 0) {
                    containerColor = PullToRefreshDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    contentColor = PullToRefreshDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i3 &= -458753;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-801976958, i3, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer (PullToRefresh.kt:115)");
            }
            composerStartRestartGroup.startReplaceableGroup(751291370);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$showElevation$1$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        return Boolean.valueOf(pullToRefreshState.getVerticalOffset() > 1.0f || pullToRefreshState.isRefreshing());
                    }

                    {
                        super(0);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final State<Boolean> state14 = (State) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            final Modifier modifier113 = modifier2;
            final Shape shape17 = shape2;
            final long j114 = containerColor;
            final Function3<? super PullToRefreshState, ? super Composer, ? super Integer, Unit> function18 = function3M2818getLambda1$material3_release;
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4208boximpl(contentColor)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 935555266, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1
                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i11) {
                    float fM6935constructorimpl;
                    if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(935555266, i11, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer.<anonymous> (PullToRefresh.kt:122)");
                        }
                        Modifier modifierM1047size3ABfNKs = SizeKt.m1047size3ABfNKs(modifier113, PullToRefreshKt.getSpinnerContainerSize());
                        composer2.startReplaceableGroup(-1737250521);
                        boolean zChanged = composer2.changed(pullToRefreshState);
                        final PullToRefreshState pullToRefreshState2 = pullToRefreshState;
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1$1$1
                                @Override // kotlin.jvm.functions.Function1
                                public final /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                    invoke2(graphicsLayerScope);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                    graphicsLayerScope.setTranslationY(pullToRefreshState2.getVerticalOffset() - Size.m4040getHeightimpl(graphicsLayerScope.getSize()));
                                }

                                {
                                    super(1);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierM1047size3ABfNKs, (Function1) objRememberedValue2);
                        if (state14.getValue().booleanValue()) {
                            fM6935constructorimpl = PullToRefreshKt.Elevation;
                        } else {
                            fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                        }
                        Modifier modifierM556backgroundbw27NRU = BackgroundKt.m556backgroundbw27NRU(ShadowKt.m3821shadows4CzXII$default(modifierGraphicsLayer, fM6935constructorimpl, shape17, true, 0L, 0L, 24, null), j114, shape17);
                        Function3<PullToRefreshState, Composer, Integer, Unit> function19 = function18;
                        PullToRefreshState pullToRefreshState3 = pullToRefreshState;
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM556backgroundbw27NRU);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3536constructorimpl = Updater.m3536constructorimpl(composer2);
                        Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m3506boximpl(SkippableUpdater.m3507constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function19.invoke(pullToRefreshState3, composer2, 0);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }
            }), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    function3M2818getLambda1$material3_release = ComposableSingletons$PullToRefreshKt.INSTANCE.m2818getLambda1$material3_release();
                }
                if (i6 != 0) {
                    shape2 = PullToRefreshDefaults.INSTANCE.getShape();
                }
                if ((i2 & 16) != 0) {
                    containerColor = PullToRefreshDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    contentColor = PullToRefreshDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i3 &= -458753;
                }
            } else {
                if (i8 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i4 != 0) {
                    function3M2818getLambda1$material3_release = ComposableSingletons$PullToRefreshKt.INSTANCE.m2818getLambda1$material3_release();
                }
                if (i6 != 0) {
                    shape2 = PullToRefreshDefaults.INSTANCE.getShape();
                }
                if ((i2 & 16) != 0) {
                    containerColor = PullToRefreshDefaults.INSTANCE.getContainerColor(composerStartRestartGroup, 6);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    contentColor = PullToRefreshDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i3 &= -458753;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-801976958, i3, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer (PullToRefresh.kt:115)");
            }
            composerStartRestartGroup.startReplaceableGroup(751291370);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<Boolean>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$showElevation$1$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        return Boolean.valueOf(pullToRefreshState.getVerticalOffset() > 1.0f || pullToRefreshState.isRefreshing());
                    }

                    {
                        super(0);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final State<Boolean> state15 = (State) objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            final Modifier modifier114 = modifier2;
            final Shape shape18 = shape2;
            final long j115 = containerColor;
            final Function3<? super PullToRefreshState, ? super Composer, ? super Integer, Unit> function19 = function3M2818getLambda1$material3_release;
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4208boximpl(contentColor)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 935555266, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1
                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i11) {
                    float fM6935constructorimpl;
                    if ((i11 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(935555266, i11, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshContainer.<anonymous> (PullToRefresh.kt:122)");
                        }
                        Modifier modifierM1047size3ABfNKs = SizeKt.m1047size3ABfNKs(modifier114, PullToRefreshKt.getSpinnerContainerSize());
                        composer2.startReplaceableGroup(-1737250521);
                        boolean zChanged = composer2.changed(pullToRefreshState);
                        final PullToRefreshState pullToRefreshState2 = pullToRefreshState;
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = (Function1) new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$1$1$1
                                @Override // kotlin.jvm.functions.Function1
                                public final /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                                    invoke2(graphicsLayerScope);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                                    graphicsLayerScope.setTranslationY(pullToRefreshState2.getVerticalOffset() - Size.m4040getHeightimpl(graphicsLayerScope.getSize()));
                                }

                                {
                                    super(1);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        composer2.endReplaceableGroup();
                        Modifier modifierGraphicsLayer = GraphicsLayerModifierKt.graphicsLayer(modifierM1047size3ABfNKs, (Function1) objRememberedValue2);
                        if (state15.getValue().booleanValue()) {
                            fM6935constructorimpl = PullToRefreshKt.Elevation;
                        } else {
                            fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                        }
                        Modifier modifierM556backgroundbw27NRU = BackgroundKt.m556backgroundbw27NRU(ShadowKt.m3821shadows4CzXII$default(modifierGraphicsLayer, fM6935constructorimpl, shape18, true, 0L, 0L, 24, null), j115, shape18);
                        Function3<PullToRefreshState, Composer, Integer, Unit> function110 = function19;
                        PullToRefreshState pullToRefreshState3 = pullToRefreshState;
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM556backgroundbw27NRU);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM3536constructorimpl = Updater.m3536constructorimpl(composer2);
                        Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m3506boximpl(SkippableUpdater.m3507constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        function110.invoke(pullToRefreshState3, composer2, 0);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }
            }), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        function4 = function3M2818getLambda1$material3_release;
        shape3 = shape2;
        j3 = contentColor;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier115 = modifier2;
            final long j116 = containerColor;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshContainer$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i11) {
                    PullToRefreshKt.m2822PullToRefreshContainerwBJOh4Y(pullToRefreshState, modifier115, function4, shape3, j116, j3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: rememberPullToRefreshState--orJrPs, reason: not valid java name */
    public static final PullToRefreshState m2828rememberPullToRefreshStateorJrPs(float f, final Function0<Boolean> function0, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1935213334);
        if ((i2 & 1) != 0) {
            f = PullToRefreshDefaults.INSTANCE.m2820getPositionalThresholdD9Ej5fM();
        }
        if ((i2 & 2) != 0) {
            function0 = new Function0<Boolean>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$rememberPullToRefreshState$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.TRUE;
                }
            };
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1935213334, i, -1, "androidx.compose.material3.pulltorefresh.rememberPullToRefreshState (PullToRefresh.kt:252)");
        }
        final float fMo694toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo694toPx0680j_4(f);
        Object[] objArr = {Float.valueOf(fMo694toPx0680j_4), function0};
        Saver<PullToRefreshState, Boolean> Saver = PullToRefreshStateImpl.INSTANCE.Saver(fMo694toPx0680j_4, function0);
        composer.startReplaceableGroup(804873447);
        boolean zChanged = composer.changed(fMo694toPx0680j_4);
        boolean z = (((i & 112) ^ 48) > 32 && composer.changed(function0)) || (i & 48) == 32;
        Object objRememberedValue = composer.rememberedValue();
        if ((z | zChanged) || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = (Function0) new Function0<PullToRefreshState>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$rememberPullToRefreshState$2$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final PullToRefreshState invoke() {
                    return new PullToRefreshStateImpl(false, fMo694toPx0680j_4, function0);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        PullToRefreshState pullToRefreshState = (PullToRefreshState) RememberSaveableKt.m3663rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pullToRefreshState;
    }

    public static /* synthetic */ PullToRefreshState PullToRefreshState$default(float f, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function0 = new Function0<Boolean>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt.PullToRefreshState.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Boolean invoke() {
                    return Boolean.TRUE;
                }
            };
        }
        return PullToRefreshState(f, z, function0);
    }

    public static final PullToRefreshState PullToRefreshState(float f, boolean z, Function0<Boolean> function0) {
        return new PullToRefreshStateImpl(z, f, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: CircularArrowProgressIndicator-RPmYEkk, reason: not valid java name */
    public static final void m2821CircularArrowProgressIndicatorRPmYEkk(final Function0<Float> function0, final long j, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-569718810);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-569718810, i2, -1, "androidx.compose.material3.pulltorefresh.CircularArrowProgressIndicator (PullToRefresh.kt:427)");
            }
            composerStartRestartGroup.startReplaceableGroup(-656076138);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Object obj = objRememberedValue;
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Path Path = AndroidPath_androidKt.Path();
                Path.mo4109setFillTypeoQ8Xj4U(PathFillType.INSTANCE.m4513getEvenOddRgk1Os());
                composerStartRestartGroup.updateRememberedValue(Path);
                obj = Path;
            }
            final Path path = (Path) obj;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-656075976);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$targetAlpha$2$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(function0.invoke().floatValue() < 1.0f ? 0.3f : 1.0f);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(CircularArrowProgressIndicator_RPmYEkk$lambda$6((State) objRememberedValue2), AlphaTween, 0.0f, null, null, composerStartRestartGroup, 48, 28);
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-656075714);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function0.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM1047size3ABfNKs = SizeKt.m1047size3ABfNKs(SemanticsModifierKt.semantics(companion, true, (Function1) objRememberedValue3), SpinnerSize);
            composerStartRestartGroup.startReplaceableGroup(-656075558);
            boolean z2 = i3 == 4;
            boolean zChanged = composerStartRestartGroup.changed(stateAnimateFloatAsState);
            boolean z3 = (i2 & 112) == 32;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(path);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (((z2 | zChanged | z3) || zChangedInstance) || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Composer composer4 = composerStartRestartGroup;
                objRememberedValue4 = (Function1) new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$2$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        ArrowValues ArrowValues = PullToRefreshKt.ArrowValues(function0.invoke().floatValue());
                        float fFloatValue = stateAnimateFloatAsState.getValue().floatValue();
                        float rotation = ArrowValues.getRotation();
                        long j2 = j;
                        Path path2 = path;
                        long jMo4797getCenterF1C5BW0 = drawScope.mo4797getCenterF1C5BW0();
                        DrawContext drawContext = drawScope.getDrawContext();
                        long jMo4719getSizeNHjbRc = drawContext.mo4719getSizeNHjbRc();
                        drawContext.getCanvas().save();
                        drawContext.getTransform().mo4725rotateUv8p0NA(rotation, jMo4797getCenterF1C5BW0);
                        Rect rectM4013Rect3MmeM6k = RectKt.m4013Rect3MmeM6k(androidx.compose.ui.geometry.SizeKt.m4053getCenteruvyYCjk(drawScope.mo4798getSizeNHjbRc()), drawScope.mo694toPx0680j_4(PullToRefreshKt.ArcRadius) + (drawScope.mo694toPx0680j_4(PullToRefreshKt.StrokeWidth) / 2.0f));
                        PullToRefreshKt.m2827drawCircularIndicatorKzyDr3Q(drawScope, j2, fFloatValue, ArrowValues, rectM4013Rect3MmeM6k, PullToRefreshKt.StrokeWidth);
                        PullToRefreshKt.m2826drawArrowuDrxG_w(drawScope, path2, rectM4013Rect3MmeM6k, j2, fFloatValue, ArrowValues, PullToRefreshKt.StrokeWidth);
                        drawContext.getCanvas().restore();
                        drawContext.mo4720setSizeuvyYCjk(jMo4719getSizeNHjbRc);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composer4.updateRememberedValue(objRememberedValue4);
                composer2 = composer4;
            } else {
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceableGroup();
            CanvasKt.Canvas(modifierM1047size3ABfNKs, (Function1) objRememberedValue4, composer2, 0);
            composer3 = composer2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                composer3 = composer2;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                    invoke(composer5, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer5, int i4) {
                    PullToRefreshKt.m2821CircularArrowProgressIndicatorRPmYEkk(function0, j, composer5, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawCircularIndicator-KzyDr3Q, reason: not valid java name */
    public static final void m2827drawCircularIndicatorKzyDr3Q(DrawScope drawScope, long j, float f, ArrowValues arrowValues, Rect rect, float f2) {
        float startAngle = arrowValues.getStartAngle();
        float endAngle = arrowValues.getEndAngle();
        float startAngle2 = arrowValues.getStartAngle();
        DrawScope.m4777drawArcyD3GUKo$default(drawScope, j, startAngle, endAngle - startAngle2, false, rect.m4009getTopLeftF1C5BW0(), rect.m4007getSizeNHjbRc(), f, new Stroke(drawScope.mo694toPx0680j_4(f2), 0.0f, StrokeCap.INSTANCE.m4589getButtKaPHkGw(), 0, null, 26, null), null, 0, ViewUtils.EDGE_TO_EDGE_FLAGS, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrowValues ArrowValues(float f) {
        float fMax = (Math.max(Math.min(1.0f, f) - 0.4f, 0.0f) * 5.0f) / 3.0f;
        float fCoerceIn = RangesKt.coerceIn(Math.abs(f) - 1.0f, 0.0f, 2.0f);
        float fPow = (((0.4f * fMax) - 0.25f) + (fCoerceIn - (((float) Math.pow(fCoerceIn, 2.0d)) / 4.0f))) * 0.5f;
        return new ArrowValues(fPow, fPow * 360.0f, ((fMax * MaxProgressArc) + fPow) * 360.0f, Math.min(1.0f, fMax));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawArrow-uDrxG_w, reason: not valid java name */
    public static final void m2826drawArrowuDrxG_w(DrawScope drawScope, Path path, Rect rect, long j, float f, ArrowValues arrowValues, float f2) {
        path.reset();
        path.moveTo(0.0f, 0.0f);
        float f3 = ArrowWidth;
        path.lineTo((drawScope.mo694toPx0680j_4(f3) * arrowValues.getScale()) / 2.0f, drawScope.mo694toPx0680j_4(ArrowHeight) * arrowValues.getScale());
        path.lineTo(drawScope.mo694toPx0680j_4(f3) * arrowValues.getScale(), 0.0f);
        float fMin = Math.min(rect.getWidth(), rect.getHeight()) / 2.0f;
        path.mo4111translatek4lQ0M(OffsetKt.Offset((fMin + Offset.m3974getXimpl(rect.m4004getCenterF1C5BW0())) - ((drawScope.mo694toPx0680j_4(f3) * arrowValues.getScale()) / 2.0f), Offset.m3975getYimpl(rect.m4004getCenterF1C5BW0()) - drawScope.mo694toPx0680j_4(f2)));
        float endAngle = arrowValues.getEndAngle();
        float f4 = drawScope.mo694toPx0680j_4(f2);
        long jMo4797getCenterF1C5BW0 = drawScope.mo4797getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo4719getSizeNHjbRc = drawContext.mo4719getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo4725rotateUv8p0NA(endAngle - f4, jMo4797getCenterF1C5BW0);
        DrawScope.m4788drawPathLG529CI$default(drawScope, path, j, f, new Stroke(drawScope.mo694toPx0680j_4(f2), 0.0f, 0, 0, null, 30, null), null, 0, 48, null);
        drawContext.getCanvas().restore();
        drawContext.mo4720setSizeuvyYCjk(jMo4719getSizeNHjbRc);
    }

    public static final float getSpinnerSize() {
        return SpinnerSize;
    }

    public static final float getSpinnerContainerSize() {
        return SpinnerContainerSize;
    }

    private static final float CircularArrowProgressIndicator_RPmYEkk$lambda$6(State<Float> state) {
        return state.getValue().floatValue();
    }
}
