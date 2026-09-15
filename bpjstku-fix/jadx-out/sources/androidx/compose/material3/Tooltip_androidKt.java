package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.PlainTooltipTokens;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aq\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a@\u0010\u0014\u001a\u00020\u0015*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"PlainTooltip", "", "Landroidx/compose/material3/CaretScope;", "modifier", "Landroidx/compose/ui/Modifier;", "caretProperties", "Landroidx/compose/material3/CaretProperties;", "shape", "Landroidx/compose/ui/graphics/Shape;", "contentColor", "Landroidx/compose/ui/graphics/Color;", "containerColor", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "shadowElevation", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "PlainTooltip-Fg7CxbU", "(Landroidx/compose/material3/CaretScope;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/CaretProperties;Landroidx/compose/ui/graphics/Shape;JJFFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "drawCaretWithPath", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "density", "Landroidx/compose/ui/unit/Density;", "configuration", "Landroid/content/res/Configuration;", "anchorLayoutCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "drawCaretWithPath-Bx497Mc", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/unit/Density;Landroid/content/res/Configuration;JLandroidx/compose/material3/CaretProperties;Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/draw/DrawResult;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Tooltip_androidKt {
    /* JADX WARN: Code duplicated, block: B:101:0x0118  */
    /* JADX WARN: Code duplicated, block: B:104:0x012a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0137  */
    /* JADX WARN: Code duplicated, block: B:119:0x0160 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:120:0x0162  */
    /* JADX WARN: Code duplicated, block: B:121:0x0167  */
    /* JADX WARN: Code duplicated, block: B:123:0x016b  */
    /* JADX WARN: Code duplicated, block: B:124:0x016d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0174  */
    /* JADX WARN: Code duplicated, block: B:128:0x017d  */
    /* JADX WARN: Code duplicated, block: B:131:0x0182  */
    /* JADX WARN: Code duplicated, block: B:134:0x018e  */
    /* JADX WARN: Code duplicated, block: B:137:0x019b  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:145:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:148:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:150:0x0209  */
    /* JADX WARN: Code duplicated, block: B:152:0x020f  */
    /* JADX WARN: Code duplicated, block: B:158:0x021e  */
    /* JADX WARN: Code duplicated, block: B:159:0x0220  */
    /* JADX WARN: Code duplicated, block: B:162:0x022b  */
    /* JADX WARN: Code duplicated, block: B:164:0x0233  */
    /* JADX WARN: Code duplicated, block: B:166:0x0257  */
    /* JADX WARN: Code duplicated, block: B:169:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:173:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:94:0x0103  */
    /* JADX WARN: Code duplicated, block: B:96:0x0109  */
    /* JADX WARN: Code duplicated, block: B:97:0x010c  */
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
    /* JADX INFO: renamed from: PlainTooltip-Fg7CxbU, reason: not valid java name */
    public static final void m2798PlainTooltipFg7CxbU(final CaretScope caretScope, Modifier modifier, CaretProperties caretProperties, Shape shape, long j, long j2, float f, float f2, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        int i5;
        Shape shape2;
        long plainTooltipContentColor;
        final long plainTooltipContainerColor;
        int i6;
        float f3;
        int i7;
        int i8;
        int i9;
        int i10;
        Modifier.Companion companion;
        CaretProperties caretProperties2;
        Shape plainTooltipContainerShape;
        float fM6935constructorimpl;
        float fM6935constructorimpl2;
        long j3;
        int i11;
        float f4;
        final long j4;
        Modifier modifierThen;
        float f5;
        Modifier modifier2;
        final long j5;
        final Density density;
        final Configuration configuration;
        boolean zChanged;
        boolean zChangedInstance;
        boolean z;
        boolean z2;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(419109811);
        if ((Integer.MIN_VALUE & i2) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(caretScope) : composerStartRestartGroup.changedInstance(caretScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 1;
        if (i14 == 0) {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i4 = i2 & 2;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    if (composerStartRestartGroup.changed(caretProperties)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 4) == 0) {
                        shape2 = shape;
                        int i15 = composerStartRestartGroup.changed(shape2) ? 2048 : 1024;
                        i3 |= i15;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i15;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    plainTooltipContentColor = j;
                    if ((i2 & 8) == 0 || !composerStartRestartGroup.changed(plainTooltipContentColor)) {
                        i13 = 8192;
                    } else {
                        i13 = 16384;
                    }
                    i3 |= i13;
                } else {
                    plainTooltipContentColor = j;
                }
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    plainTooltipContainerColor = j2;
                    if ((i2 & 16) == 0 || !composerStartRestartGroup.changed(plainTooltipContainerColor)) {
                        i12 = 65536;
                    } else {
                        i12 = 131072;
                    }
                    i3 |= i12;
                } else {
                    plainTooltipContainerColor = j2;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    i3 |= 1572864;
                    f3 = f;
                } else {
                    f3 = f;
                    if ((i & 1572864) == 0) {
                        if (composerStartRestartGroup.changed(f3)) {
                            i7 = 1048576;
                        } else {
                            i7 = 524288;
                        }
                        i3 |= i7;
                    }
                }
                i8 = i2 & 64;
                if (i8 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(f2)) {
                        i9 = 8388608;
                    } else {
                        i9 = 4194304;
                    }
                    i3 |= i9;
                }
                if ((i2 & 128) != 0) {
                    i3 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i10 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i10 = 33554432;
                    }
                    i3 |= i10;
                }
                if ((38347923 & i3) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i14 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i4 != 0) {
                            caretProperties2 = null;
                        } else {
                            caretProperties2 = caretProperties;
                        }
                        if ((i2 & 4) != 0) {
                            plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                            i3 &= -7169;
                        } else {
                            plainTooltipContainerShape = shape2;
                        }
                        if ((i2 & 8) != 0) {
                            plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        }
                        if ((i2 & 16) != 0) {
                            plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                        if (i6 != 0) {
                            fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                        } else {
                            fM6935constructorimpl = f3;
                        }
                        if (i8 != 0) {
                            fM6935constructorimpl2 = Dp.m6935constructorimpl(0.0f);
                        } else {
                            fM6935constructorimpl2 = f2;
                        }
                        j3 = plainTooltipContentColor;
                        i11 = i3;
                        f4 = fM6935constructorimpl;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -458753;
                        }
                        companion = modifier;
                        caretProperties2 = caretProperties;
                        fM6935constructorimpl2 = f2;
                        plainTooltipContainerShape = shape2;
                        j3 = plainTooltipContentColor;
                        i11 = i3;
                        f4 = f3;
                    }
                    j4 = plainTooltipContainerColor;
                    final long j6 = j3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(419109811, i11, -1, "androidx.compose.material3.PlainTooltip (Tooltip.android.kt:67)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(2067440203);
                    if (caretProperties2 != null) {
                        density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        configuration = (Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        composerStartRestartGroup.startReplaceableGroup(2067440371);
                        zChanged = composerStartRestartGroup.changed(density);
                        zChangedInstance = composerStartRestartGroup.changedInstance(configuration);
                        z = (((i11 & 458752) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072 && composerStartRestartGroup.changed(j4)) || (i11 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 131072;
                        if ((i11 & 896) == 256) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!(z | zChanged | zChangedInstance | z2) || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            final CaretProperties caretProperties3 = caretProperties2;
                            objRememberedValue = (Function2) new Function2<CacheDrawScope, LayoutCoordinates, DrawResult>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$customModifier$1$1
                                @Override // kotlin.jvm.functions.Function2
                                public final DrawResult invoke(CacheDrawScope cacheDrawScope, LayoutCoordinates layoutCoordinates) {
                                    return Tooltip_androidKt.m2800drawCaretWithPathBx497Mc(cacheDrawScope, density, configuration, j4, caretProperties3, layoutCoordinates);
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        modifierThen = caretScope.drawCaret(companion2, (Function2) objRememberedValue).then(companion);
                    } else {
                        modifierThen = companion;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i16 = i11 >> 6;
                    SurfaceKt.m2506SurfaceT9BRK9s(modifierThen, plainTooltipContainerShape, j4, 0L, f4, fM6935constructorimpl2, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -705895688, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i17) {
                            if ((i17 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-705895688, i17, -1, "androidx.compose.material3.PlainTooltip.<anonymous> (Tooltip.android.kt:90)");
                            }
                            Modifier modifierPadding = PaddingKt.padding(SizeKt.m1051sizeInqDBjuR0$default(Modifier.INSTANCE, TooltipKt.getTooltipMinWidth(), TooltipKt.getTooltipMinHeight(), TooltipKt.getPlainTooltipMaxWidth(), 0.0f, 8, null), TooltipKt.getPlainTooltipContentPadding());
                            long j7 = j6;
                            Function2<Composer, Integer, Unit> function3 = function2;
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierPadding);
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
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4208boximpl(j7)), TextKt.getLocalTextStyle().provides(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), PlainTooltipTokens.INSTANCE.getSupportingTextFont()))}, function3, composer2, 0);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }
                    }), composerStartRestartGroup, ((i11 >> 9) & 896) | (i16 & 112) | 12582912 | (57344 & i16) | (i16 & 458752), 72);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    f5 = fM6935constructorimpl2;
                    modifier2 = companion;
                    j5 = j6;
                    plainTooltipContainerColor = j4;
                    f3 = f4;
                    shape2 = plainTooltipContainerShape;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier2 = modifier;
                    caretProperties2 = caretProperties;
                    f5 = f2;
                    j5 = plainTooltipContentColor;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier3 = modifier2;
                    final CaretProperties caretProperties4 = caretProperties2;
                    final Shape shape3 = shape2;
                    final float f6 = f3;
                    final float f7 = f5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$2
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

                        public final void invoke(Composer composer2, int i17) {
                            Tooltip_androidKt.m2798PlainTooltipFg7CxbU(caretScope, modifier3, caretProperties4, shape3, j5, plainTooltipContainerColor, f6, f7, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 384;
            if ((i & 3072) == 0) {
                if ((i2 & 4) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i3 |= i15;
                } else {
                    shape2 = shape;
                }
                i3 |= i15;
            } else {
                shape2 = shape;
            }
            if ((i & 24576) == 0) {
                plainTooltipContentColor = j;
                if ((i2 & 8) == 0) {
                    i13 = 8192;
                } else {
                    i13 = 8192;
                }
                i3 |= i13;
            } else {
                plainTooltipContentColor = j;
            }
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                plainTooltipContainerColor = j2;
                if ((i2 & 16) == 0) {
                    i12 = 65536;
                } else {
                    i12 = 65536;
                }
                i3 |= i12;
            } else {
                plainTooltipContainerColor = j2;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                i3 |= 1572864;
                f3 = f;
            } else {
                f3 = f;
                if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changed(f3)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changed(f2)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            if ((i2 & 128) != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i10 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i10 = 33554432;
                }
                i3 |= i10;
            }
            if ((38347923 & i3) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i4 != 0) {
                        caretProperties2 = null;
                    } else {
                        caretProperties2 = caretProperties;
                    }
                    if ((i2 & 4) != 0) {
                        plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                        i3 &= -7169;
                    } else {
                        plainTooltipContainerShape = shape2;
                    }
                    if ((i2 & 8) != 0) {
                        plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 16) != 0) {
                        plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                    if (i6 != 0) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                    } else {
                        fM6935constructorimpl = f3;
                    }
                    if (i8 != 0) {
                        fM6935constructorimpl2 = Dp.m6935constructorimpl(0.0f);
                    } else {
                        fM6935constructorimpl2 = f2;
                    }
                    j3 = plainTooltipContentColor;
                    i11 = i3;
                    f4 = fM6935constructorimpl;
                } else {
                    if (i14 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i4 != 0) {
                        caretProperties2 = null;
                    } else {
                        caretProperties2 = caretProperties;
                    }
                    if ((i2 & 4) != 0) {
                        plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                        i3 &= -7169;
                    } else {
                        plainTooltipContainerShape = shape2;
                    }
                    if ((i2 & 8) != 0) {
                        plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 16) != 0) {
                        plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                    if (i6 != 0) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                    } else {
                        fM6935constructorimpl = f3;
                    }
                    if (i8 != 0) {
                        fM6935constructorimpl2 = Dp.m6935constructorimpl(0.0f);
                    } else {
                        fM6935constructorimpl2 = f2;
                    }
                    j3 = plainTooltipContentColor;
                    i11 = i3;
                    f4 = fM6935constructorimpl;
                }
                j4 = plainTooltipContainerColor;
                final long j7 = j3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(419109811, i11, -1, "androidx.compose.material3.PlainTooltip (Tooltip.android.kt:67)");
                }
                composerStartRestartGroup.startReplaceableGroup(2067440203);
                if (caretProperties2 != null) {
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    configuration = (Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(2067440371);
                    zChanged = composerStartRestartGroup.changed(density);
                    zChangedInstance = composerStartRestartGroup.changedInstance(configuration);
                    if (((i11 & 458752) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
                    }
                    if ((i11 & 896) == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(z | zChanged | zChangedInstance | z2)) {
                        final CaretProperties caretProperties5 = caretProperties2;
                        objRememberedValue = (Function2) new Function2<CacheDrawScope, LayoutCoordinates, DrawResult>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$customModifier$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final DrawResult invoke(CacheDrawScope cacheDrawScope, LayoutCoordinates layoutCoordinates) {
                                return Tooltip_androidKt.m2800drawCaretWithPathBx497Mc(cacheDrawScope, density, configuration, j4, caretProperties5, layoutCoordinates);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        final CaretProperties caretProperties6 = caretProperties2;
                        objRememberedValue = (Function2) new Function2<CacheDrawScope, LayoutCoordinates, DrawResult>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$customModifier$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final DrawResult invoke(CacheDrawScope cacheDrawScope, LayoutCoordinates layoutCoordinates) {
                                return Tooltip_androidKt.m2800drawCaretWithPathBx497Mc(cacheDrawScope, density, configuration, j4, caretProperties6, layoutCoordinates);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifierThen = caretScope.drawCaret(companion3, (Function2) objRememberedValue).then(companion);
                } else {
                    modifierThen = companion;
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i17 = i11 >> 6;
                SurfaceKt.m2506SurfaceT9BRK9s(modifierThen, plainTooltipContainerShape, j4, 0L, f4, fM6935constructorimpl2, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -705895688, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i18) {
                        if ((i18 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-705895688, i18, -1, "androidx.compose.material3.PlainTooltip.<anonymous> (Tooltip.android.kt:90)");
                        }
                        Modifier modifierPadding = PaddingKt.padding(SizeKt.m1051sizeInqDBjuR0$default(Modifier.INSTANCE, TooltipKt.getTooltipMinWidth(), TooltipKt.getTooltipMinHeight(), TooltipKt.getPlainTooltipMaxWidth(), 0.0f, 8, null), TooltipKt.getPlainTooltipContentPadding());
                        long j8 = j7;
                        Function2<Composer, Integer, Unit> function3 = function2;
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierPadding);
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
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4208boximpl(j8)), TextKt.getLocalTextStyle().provides(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), PlainTooltipTokens.INSTANCE.getSupportingTextFont()))}, function3, composer2, 0);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }
                }), composerStartRestartGroup, ((i11 >> 9) & 896) | (i17 & 112) | 12582912 | (57344 & i17) | (i17 & 458752), 72);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f5 = fM6935constructorimpl2;
                modifier2 = companion;
                j5 = j7;
                plainTooltipContainerColor = j4;
                f3 = f4;
                shape2 = plainTooltipContainerShape;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i4 != 0) {
                        caretProperties2 = null;
                    } else {
                        caretProperties2 = caretProperties;
                    }
                    if ((i2 & 4) != 0) {
                        plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                        i3 &= -7169;
                    } else {
                        plainTooltipContainerShape = shape2;
                    }
                    if ((i2 & 8) != 0) {
                        plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 16) != 0) {
                        plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                    if (i6 != 0) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                    } else {
                        fM6935constructorimpl = f3;
                    }
                    if (i8 != 0) {
                        fM6935constructorimpl2 = Dp.m6935constructorimpl(0.0f);
                    } else {
                        fM6935constructorimpl2 = f2;
                    }
                    j3 = plainTooltipContentColor;
                    i11 = i3;
                    f4 = fM6935constructorimpl;
                } else {
                    if (i14 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i4 != 0) {
                        caretProperties2 = null;
                    } else {
                        caretProperties2 = caretProperties;
                    }
                    if ((i2 & 4) != 0) {
                        plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                        i3 &= -7169;
                    } else {
                        plainTooltipContainerShape = shape2;
                    }
                    if ((i2 & 8) != 0) {
                        plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 16) != 0) {
                        plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                    if (i6 != 0) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                    } else {
                        fM6935constructorimpl = f3;
                    }
                    if (i8 != 0) {
                        fM6935constructorimpl2 = Dp.m6935constructorimpl(0.0f);
                    } else {
                        fM6935constructorimpl2 = f2;
                    }
                    j3 = plainTooltipContentColor;
                    i11 = i3;
                    f4 = fM6935constructorimpl;
                }
                j4 = plainTooltipContainerColor;
                final long j8 = j3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(419109811, i11, -1, "androidx.compose.material3.PlainTooltip (Tooltip.android.kt:67)");
                }
                composerStartRestartGroup.startReplaceableGroup(2067440203);
                if (caretProperties2 != null) {
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    configuration = (Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(2067440371);
                    zChanged = composerStartRestartGroup.changed(density);
                    zChangedInstance = composerStartRestartGroup.changedInstance(configuration);
                    if (((i11 & 458752) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
                    }
                    if ((i11 & 896) == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(z | zChanged | zChangedInstance | z2)) {
                        final CaretProperties caretProperties7 = caretProperties2;
                        objRememberedValue = (Function2) new Function2<CacheDrawScope, LayoutCoordinates, DrawResult>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$customModifier$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final DrawResult invoke(CacheDrawScope cacheDrawScope, LayoutCoordinates layoutCoordinates) {
                                return Tooltip_androidKt.m2800drawCaretWithPathBx497Mc(cacheDrawScope, density, configuration, j4, caretProperties7, layoutCoordinates);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        final CaretProperties caretProperties8 = caretProperties2;
                        objRememberedValue = (Function2) new Function2<CacheDrawScope, LayoutCoordinates, DrawResult>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$customModifier$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final DrawResult invoke(CacheDrawScope cacheDrawScope, LayoutCoordinates layoutCoordinates) {
                                return Tooltip_androidKt.m2800drawCaretWithPathBx497Mc(cacheDrawScope, density, configuration, j4, caretProperties8, layoutCoordinates);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifierThen = caretScope.drawCaret(companion4, (Function2) objRememberedValue).then(companion);
                } else {
                    modifierThen = companion;
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i18 = i11 >> 6;
                SurfaceKt.m2506SurfaceT9BRK9s(modifierThen, plainTooltipContainerShape, j4, 0L, f4, fM6935constructorimpl2, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -705895688, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i19) {
                        if ((i19 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-705895688, i19, -1, "androidx.compose.material3.PlainTooltip.<anonymous> (Tooltip.android.kt:90)");
                        }
                        Modifier modifierPadding = PaddingKt.padding(SizeKt.m1051sizeInqDBjuR0$default(Modifier.INSTANCE, TooltipKt.getTooltipMinWidth(), TooltipKt.getTooltipMinHeight(), TooltipKt.getPlainTooltipMaxWidth(), 0.0f, 8, null), TooltipKt.getPlainTooltipContentPadding());
                        long j9 = j8;
                        Function2<Composer, Integer, Unit> function3 = function2;
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierPadding);
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
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4208boximpl(j9)), TextKt.getLocalTextStyle().provides(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), PlainTooltipTokens.INSTANCE.getSupportingTextFont()))}, function3, composer2, 0);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }
                }), composerStartRestartGroup, ((i11 >> 9) & 896) | (i18 & 112) | 12582912 | (57344 & i18) | (i18 & 458752), 72);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f5 = fM6935constructorimpl2;
                modifier2 = companion;
                j5 = j8;
                plainTooltipContainerColor = j4;
                f3 = f4;
                shape2 = plainTooltipContainerShape;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier4 = modifier2;
                final CaretProperties caretProperties9 = caretProperties2;
                final Shape shape4 = shape2;
                final float f8 = f3;
                final float f9 = f5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$2
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

                    public final void invoke(Composer composer2, int i19) {
                        Tooltip_androidKt.m2798PlainTooltipFg7CxbU(caretScope, modifier4, caretProperties9, shape4, j5, plainTooltipContainerColor, f8, f9, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 48;
        i4 = i2 & 2;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                if (composerStartRestartGroup.changed(caretProperties)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 4) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i3 |= i15;
                } else {
                    shape2 = shape;
                }
                i3 |= i15;
            } else {
                shape2 = shape;
            }
            if ((i & 24576) == 0) {
                plainTooltipContentColor = j;
                if ((i2 & 8) == 0) {
                    i13 = 8192;
                } else {
                    i13 = 8192;
                }
                i3 |= i13;
            } else {
                plainTooltipContentColor = j;
            }
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                plainTooltipContainerColor = j2;
                if ((i2 & 16) == 0) {
                    i12 = 65536;
                } else {
                    i12 = 65536;
                }
                i3 |= i12;
            } else {
                plainTooltipContainerColor = j2;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                i3 |= 1572864;
                f3 = f;
            } else {
                f3 = f;
                if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changed(f3)) {
                        i7 = 1048576;
                    } else {
                        i7 = 524288;
                    }
                    i3 |= i7;
                }
            }
            i8 = i2 & 64;
            if (i8 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changed(f2)) {
                    i9 = 8388608;
                } else {
                    i9 = 4194304;
                }
                i3 |= i9;
            }
            if ((i2 & 128) != 0) {
                i3 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i10 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i10 = 33554432;
                }
                i3 |= i10;
            }
            if ((38347923 & i3) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i4 != 0) {
                        caretProperties2 = null;
                    } else {
                        caretProperties2 = caretProperties;
                    }
                    if ((i2 & 4) != 0) {
                        plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                        i3 &= -7169;
                    } else {
                        plainTooltipContainerShape = shape2;
                    }
                    if ((i2 & 8) != 0) {
                        plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 16) != 0) {
                        plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                    if (i6 != 0) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                    } else {
                        fM6935constructorimpl = f3;
                    }
                    if (i8 != 0) {
                        fM6935constructorimpl2 = Dp.m6935constructorimpl(0.0f);
                    } else {
                        fM6935constructorimpl2 = f2;
                    }
                    j3 = plainTooltipContentColor;
                    i11 = i3;
                    f4 = fM6935constructorimpl;
                } else {
                    if (i14 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i4 != 0) {
                        caretProperties2 = null;
                    } else {
                        caretProperties2 = caretProperties;
                    }
                    if ((i2 & 4) != 0) {
                        plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                        i3 &= -7169;
                    } else {
                        plainTooltipContainerShape = shape2;
                    }
                    if ((i2 & 8) != 0) {
                        plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 16) != 0) {
                        plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                    if (i6 != 0) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                    } else {
                        fM6935constructorimpl = f3;
                    }
                    if (i8 != 0) {
                        fM6935constructorimpl2 = Dp.m6935constructorimpl(0.0f);
                    } else {
                        fM6935constructorimpl2 = f2;
                    }
                    j3 = plainTooltipContentColor;
                    i11 = i3;
                    f4 = fM6935constructorimpl;
                }
                j4 = plainTooltipContainerColor;
                final long j9 = j3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(419109811, i11, -1, "androidx.compose.material3.PlainTooltip (Tooltip.android.kt:67)");
                }
                composerStartRestartGroup.startReplaceableGroup(2067440203);
                if (caretProperties2 != null) {
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    configuration = (Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
                    Modifier.Companion companion5 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(2067440371);
                    zChanged = composerStartRestartGroup.changed(density);
                    zChangedInstance = composerStartRestartGroup.changedInstance(configuration);
                    if (((i11 & 458752) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
                    }
                    if ((i11 & 896) == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(z | zChanged | zChangedInstance | z2)) {
                        final CaretProperties caretProperties10 = caretProperties2;
                        objRememberedValue = (Function2) new Function2<CacheDrawScope, LayoutCoordinates, DrawResult>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$customModifier$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final DrawResult invoke(CacheDrawScope cacheDrawScope, LayoutCoordinates layoutCoordinates) {
                                return Tooltip_androidKt.m2800drawCaretWithPathBx497Mc(cacheDrawScope, density, configuration, j4, caretProperties10, layoutCoordinates);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        final CaretProperties caretProperties11 = caretProperties2;
                        objRememberedValue = (Function2) new Function2<CacheDrawScope, LayoutCoordinates, DrawResult>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$customModifier$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final DrawResult invoke(CacheDrawScope cacheDrawScope, LayoutCoordinates layoutCoordinates) {
                                return Tooltip_androidKt.m2800drawCaretWithPathBx497Mc(cacheDrawScope, density, configuration, j4, caretProperties11, layoutCoordinates);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifierThen = caretScope.drawCaret(companion5, (Function2) objRememberedValue).then(companion);
                } else {
                    modifierThen = companion;
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i19 = i11 >> 6;
                SurfaceKt.m2506SurfaceT9BRK9s(modifierThen, plainTooltipContainerShape, j4, 0L, f4, fM6935constructorimpl2, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -705895688, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i110) {
                        if ((i110 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-705895688, i110, -1, "androidx.compose.material3.PlainTooltip.<anonymous> (Tooltip.android.kt:90)");
                        }
                        Modifier modifierPadding = PaddingKt.padding(SizeKt.m1051sizeInqDBjuR0$default(Modifier.INSTANCE, TooltipKt.getTooltipMinWidth(), TooltipKt.getTooltipMinHeight(), TooltipKt.getPlainTooltipMaxWidth(), 0.0f, 8, null), TooltipKt.getPlainTooltipContentPadding());
                        long j10 = j9;
                        Function2<Composer, Integer, Unit> function3 = function2;
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierPadding);
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
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4208boximpl(j10)), TextKt.getLocalTextStyle().provides(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), PlainTooltipTokens.INSTANCE.getSupportingTextFont()))}, function3, composer2, 0);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }
                }), composerStartRestartGroup, ((i11 >> 9) & 896) | (i19 & 112) | 12582912 | (57344 & i19) | (i19 & 458752), 72);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f5 = fM6935constructorimpl2;
                modifier2 = companion;
                j5 = j9;
                plainTooltipContainerColor = j4;
                f3 = f4;
                shape2 = plainTooltipContainerShape;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i14 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i4 != 0) {
                        caretProperties2 = null;
                    } else {
                        caretProperties2 = caretProperties;
                    }
                    if ((i2 & 4) != 0) {
                        plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                        i3 &= -7169;
                    } else {
                        plainTooltipContainerShape = shape2;
                    }
                    if ((i2 & 8) != 0) {
                        plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 16) != 0) {
                        plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                    if (i6 != 0) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                    } else {
                        fM6935constructorimpl = f3;
                    }
                    if (i8 != 0) {
                        fM6935constructorimpl2 = Dp.m6935constructorimpl(0.0f);
                    } else {
                        fM6935constructorimpl2 = f2;
                    }
                    j3 = plainTooltipContentColor;
                    i11 = i3;
                    f4 = fM6935constructorimpl;
                } else {
                    if (i14 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i4 != 0) {
                        caretProperties2 = null;
                    } else {
                        caretProperties2 = caretProperties;
                    }
                    if ((i2 & 4) != 0) {
                        plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                        i3 &= -7169;
                    } else {
                        plainTooltipContainerShape = shape2;
                    }
                    if ((i2 & 8) != 0) {
                        plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    }
                    if ((i2 & 16) != 0) {
                        plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                    if (i6 != 0) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                    } else {
                        fM6935constructorimpl = f3;
                    }
                    if (i8 != 0) {
                        fM6935constructorimpl2 = Dp.m6935constructorimpl(0.0f);
                    } else {
                        fM6935constructorimpl2 = f2;
                    }
                    j3 = plainTooltipContentColor;
                    i11 = i3;
                    f4 = fM6935constructorimpl;
                }
                j4 = plainTooltipContainerColor;
                final long j10 = j3;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(419109811, i11, -1, "androidx.compose.material3.PlainTooltip (Tooltip.android.kt:67)");
                }
                composerStartRestartGroup.startReplaceableGroup(2067440203);
                if (caretProperties2 != null) {
                    density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    configuration = (Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
                    Modifier.Companion companion6 = Modifier.INSTANCE;
                    composerStartRestartGroup.startReplaceableGroup(2067440371);
                    zChanged = composerStartRestartGroup.changed(density);
                    zChangedInstance = composerStartRestartGroup.changedInstance(configuration);
                    if (((i11 & 458752) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
                    }
                    if ((i11 & 896) == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(z | zChanged | zChangedInstance | z2)) {
                        final CaretProperties caretProperties12 = caretProperties2;
                        objRememberedValue = (Function2) new Function2<CacheDrawScope, LayoutCoordinates, DrawResult>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$customModifier$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final DrawResult invoke(CacheDrawScope cacheDrawScope, LayoutCoordinates layoutCoordinates) {
                                return Tooltip_androidKt.m2800drawCaretWithPathBx497Mc(cacheDrawScope, density, configuration, j4, caretProperties12, layoutCoordinates);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        final CaretProperties caretProperties13 = caretProperties2;
                        objRememberedValue = (Function2) new Function2<CacheDrawScope, LayoutCoordinates, DrawResult>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$customModifier$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final DrawResult invoke(CacheDrawScope cacheDrawScope, LayoutCoordinates layoutCoordinates) {
                                return Tooltip_androidKt.m2800drawCaretWithPathBx497Mc(cacheDrawScope, density, configuration, j4, caretProperties13, layoutCoordinates);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    modifierThen = caretScope.drawCaret(companion6, (Function2) objRememberedValue).then(companion);
                } else {
                    modifierThen = companion;
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i110 = i11 >> 6;
                SurfaceKt.m2506SurfaceT9BRK9s(modifierThen, plainTooltipContainerShape, j4, 0L, f4, fM6935constructorimpl2, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -705895688, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i111) {
                        if ((i111 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-705895688, i111, -1, "androidx.compose.material3.PlainTooltip.<anonymous> (Tooltip.android.kt:90)");
                        }
                        Modifier modifierPadding = PaddingKt.padding(SizeKt.m1051sizeInqDBjuR0$default(Modifier.INSTANCE, TooltipKt.getTooltipMinWidth(), TooltipKt.getTooltipMinHeight(), TooltipKt.getPlainTooltipMaxWidth(), 0.0f, 8, null), TooltipKt.getPlainTooltipContentPadding());
                        long j11 = j10;
                        Function2<Composer, Integer, Unit> function3 = function2;
                        composer2.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierPadding);
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
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4208boximpl(j11)), TextKt.getLocalTextStyle().provides(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), PlainTooltipTokens.INSTANCE.getSupportingTextFont()))}, function3, composer2, 0);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }
                }), composerStartRestartGroup, ((i11 >> 9) & 896) | (i110 & 112) | 12582912 | (57344 & i110) | (i110 & 458752), 72);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                f5 = fM6935constructorimpl2;
                modifier2 = companion;
                j5 = j10;
                plainTooltipContainerColor = j4;
                f3 = f4;
                shape2 = plainTooltipContainerShape;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier5 = modifier2;
                final CaretProperties caretProperties14 = caretProperties2;
                final Shape shape5 = shape2;
                final float f10 = f3;
                final float f11 = f5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$2
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

                    public final void invoke(Composer composer2, int i111) {
                        Tooltip_androidKt.m2798PlainTooltipFg7CxbU(caretScope, modifier5, caretProperties14, shape5, j5, plainTooltipContainerColor, f10, f11, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 384;
        if ((i & 3072) == 0) {
            if ((i2 & 4) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i3 |= i15;
            } else {
                shape2 = shape;
            }
            i3 |= i15;
        } else {
            shape2 = shape;
        }
        if ((i & 24576) == 0) {
            plainTooltipContentColor = j;
            if ((i2 & 8) == 0) {
                i13 = 8192;
            } else {
                i13 = 8192;
            }
            i3 |= i13;
        } else {
            plainTooltipContentColor = j;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            plainTooltipContainerColor = j2;
            if ((i2 & 16) == 0) {
                i12 = 65536;
            } else {
                i12 = 65536;
            }
            i3 |= i12;
        } else {
            plainTooltipContainerColor = j2;
        }
        i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= 1572864;
            f3 = f;
        } else {
            f3 = f;
            if ((i & 1572864) == 0) {
                if (composerStartRestartGroup.changed(f3)) {
                    i7 = 1048576;
                } else {
                    i7 = 524288;
                }
                i3 |= i7;
            }
        }
        i8 = i2 & 64;
        if (i8 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (composerStartRestartGroup.changed(f2)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i3 |= i9;
        }
        if ((i2 & 128) != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (composerStartRestartGroup.changedInstance(function2)) {
                i10 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i10 = 33554432;
            }
            i3 |= i10;
        }
        if ((38347923 & i3) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i14 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i4 != 0) {
                    caretProperties2 = null;
                } else {
                    caretProperties2 = caretProperties;
                }
                if ((i2 & 4) != 0) {
                    plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                    i3 &= -7169;
                } else {
                    plainTooltipContainerShape = shape2;
                }
                if ((i2 & 8) != 0) {
                    plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                    i3 &= -57345;
                }
                if ((i2 & 16) != 0) {
                    plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                    i3 &= -458753;
                }
                if (i6 != 0) {
                    fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                } else {
                    fM6935constructorimpl = f3;
                }
                if (i8 != 0) {
                    fM6935constructorimpl2 = Dp.m6935constructorimpl(0.0f);
                } else {
                    fM6935constructorimpl2 = f2;
                }
                j3 = plainTooltipContentColor;
                i11 = i3;
                f4 = fM6935constructorimpl;
            } else {
                if (i14 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i4 != 0) {
                    caretProperties2 = null;
                } else {
                    caretProperties2 = caretProperties;
                }
                if ((i2 & 4) != 0) {
                    plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                    i3 &= -7169;
                } else {
                    plainTooltipContainerShape = shape2;
                }
                if ((i2 & 8) != 0) {
                    plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                    i3 &= -57345;
                }
                if ((i2 & 16) != 0) {
                    plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                    i3 &= -458753;
                }
                if (i6 != 0) {
                    fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                } else {
                    fM6935constructorimpl = f3;
                }
                if (i8 != 0) {
                    fM6935constructorimpl2 = Dp.m6935constructorimpl(0.0f);
                } else {
                    fM6935constructorimpl2 = f2;
                }
                j3 = plainTooltipContentColor;
                i11 = i3;
                f4 = fM6935constructorimpl;
            }
            j4 = plainTooltipContainerColor;
            final long j11 = j3;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(419109811, i11, -1, "androidx.compose.material3.PlainTooltip (Tooltip.android.kt:67)");
            }
            composerStartRestartGroup.startReplaceableGroup(2067440203);
            if (caretProperties2 != null) {
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                configuration = (Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
                Modifier.Companion companion7 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(2067440371);
                zChanged = composerStartRestartGroup.changed(density);
                zChangedInstance = composerStartRestartGroup.changedInstance(configuration);
                if (((i11 & 458752) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
                }
                if ((i11 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(z | zChanged | zChangedInstance | z2)) {
                    final CaretProperties caretProperties15 = caretProperties2;
                    objRememberedValue = (Function2) new Function2<CacheDrawScope, LayoutCoordinates, DrawResult>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$customModifier$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public final DrawResult invoke(CacheDrawScope cacheDrawScope, LayoutCoordinates layoutCoordinates) {
                            return Tooltip_androidKt.m2800drawCaretWithPathBx497Mc(cacheDrawScope, density, configuration, j4, caretProperties15, layoutCoordinates);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    final CaretProperties caretProperties16 = caretProperties2;
                    objRememberedValue = (Function2) new Function2<CacheDrawScope, LayoutCoordinates, DrawResult>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$customModifier$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public final DrawResult invoke(CacheDrawScope cacheDrawScope, LayoutCoordinates layoutCoordinates) {
                            return Tooltip_androidKt.m2800drawCaretWithPathBx497Mc(cacheDrawScope, density, configuration, j4, caretProperties16, layoutCoordinates);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                modifierThen = caretScope.drawCaret(companion7, (Function2) objRememberedValue).then(companion);
            } else {
                modifierThen = companion;
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i111 = i11 >> 6;
            SurfaceKt.m2506SurfaceT9BRK9s(modifierThen, plainTooltipContainerShape, j4, 0L, f4, fM6935constructorimpl2, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -705895688, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$1
                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i112) {
                    if ((i112 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-705895688, i112, -1, "androidx.compose.material3.PlainTooltip.<anonymous> (Tooltip.android.kt:90)");
                    }
                    Modifier modifierPadding = PaddingKt.padding(SizeKt.m1051sizeInqDBjuR0$default(Modifier.INSTANCE, TooltipKt.getTooltipMinWidth(), TooltipKt.getTooltipMinHeight(), TooltipKt.getPlainTooltipMaxWidth(), 0.0f, 8, null), TooltipKt.getPlainTooltipContentPadding());
                    long j12 = j11;
                    Function2<Composer, Integer, Unit> function3 = function2;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierPadding);
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
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4208boximpl(j12)), TextKt.getLocalTextStyle().provides(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), PlainTooltipTokens.INSTANCE.getSupportingTextFont()))}, function3, composer2, 0);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }
            }), composerStartRestartGroup, ((i11 >> 9) & 896) | (i111 & 112) | 12582912 | (57344 & i111) | (i111 & 458752), 72);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f5 = fM6935constructorimpl2;
            modifier2 = companion;
            j5 = j11;
            plainTooltipContainerColor = j4;
            f3 = f4;
            shape2 = plainTooltipContainerShape;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i14 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i4 != 0) {
                    caretProperties2 = null;
                } else {
                    caretProperties2 = caretProperties;
                }
                if ((i2 & 4) != 0) {
                    plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                    i3 &= -7169;
                } else {
                    plainTooltipContainerShape = shape2;
                }
                if ((i2 & 8) != 0) {
                    plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                    i3 &= -57345;
                }
                if ((i2 & 16) != 0) {
                    plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                    i3 &= -458753;
                }
                if (i6 != 0) {
                    fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                } else {
                    fM6935constructorimpl = f3;
                }
                if (i8 != 0) {
                    fM6935constructorimpl2 = Dp.m6935constructorimpl(0.0f);
                } else {
                    fM6935constructorimpl2 = f2;
                }
                j3 = plainTooltipContentColor;
                i11 = i3;
                f4 = fM6935constructorimpl;
            } else {
                if (i14 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i4 != 0) {
                    caretProperties2 = null;
                } else {
                    caretProperties2 = caretProperties;
                }
                if ((i2 & 4) != 0) {
                    plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                    i3 &= -7169;
                } else {
                    plainTooltipContainerShape = shape2;
                }
                if ((i2 & 8) != 0) {
                    plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                    i3 &= -57345;
                }
                if ((i2 & 16) != 0) {
                    plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                    i3 &= -458753;
                }
                if (i6 != 0) {
                    fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
                } else {
                    fM6935constructorimpl = f3;
                }
                if (i8 != 0) {
                    fM6935constructorimpl2 = Dp.m6935constructorimpl(0.0f);
                } else {
                    fM6935constructorimpl2 = f2;
                }
                j3 = plainTooltipContentColor;
                i11 = i3;
                f4 = fM6935constructorimpl;
            }
            j4 = plainTooltipContainerColor;
            final long j12 = j3;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(419109811, i11, -1, "androidx.compose.material3.PlainTooltip (Tooltip.android.kt:67)");
            }
            composerStartRestartGroup.startReplaceableGroup(2067440203);
            if (caretProperties2 != null) {
                density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                configuration = (Configuration) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
                Modifier.Companion companion8 = Modifier.INSTANCE;
                composerStartRestartGroup.startReplaceableGroup(2067440371);
                zChanged = composerStartRestartGroup.changed(density);
                zChangedInstance = composerStartRestartGroup.changedInstance(configuration);
                if (((i11 & 458752) ^ ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) <= 131072) {
                }
                if ((i11 & 896) == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(z | zChanged | zChangedInstance | z2)) {
                    final CaretProperties caretProperties17 = caretProperties2;
                    objRememberedValue = (Function2) new Function2<CacheDrawScope, LayoutCoordinates, DrawResult>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$customModifier$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public final DrawResult invoke(CacheDrawScope cacheDrawScope, LayoutCoordinates layoutCoordinates) {
                            return Tooltip_androidKt.m2800drawCaretWithPathBx497Mc(cacheDrawScope, density, configuration, j4, caretProperties17, layoutCoordinates);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    final CaretProperties caretProperties18 = caretProperties2;
                    objRememberedValue = (Function2) new Function2<CacheDrawScope, LayoutCoordinates, DrawResult>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$customModifier$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public final DrawResult invoke(CacheDrawScope cacheDrawScope, LayoutCoordinates layoutCoordinates) {
                            return Tooltip_androidKt.m2800drawCaretWithPathBx497Mc(cacheDrawScope, density, configuration, j4, caretProperties18, layoutCoordinates);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                modifierThen = caretScope.drawCaret(companion8, (Function2) objRememberedValue).then(companion);
            } else {
                modifierThen = companion;
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i112 = i11 >> 6;
            SurfaceKt.m2506SurfaceT9BRK9s(modifierThen, plainTooltipContainerShape, j4, 0L, f4, fM6935constructorimpl2, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -705895688, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$1
                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i113) {
                    if ((i113 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-705895688, i113, -1, "androidx.compose.material3.PlainTooltip.<anonymous> (Tooltip.android.kt:90)");
                    }
                    Modifier modifierPadding = PaddingKt.padding(SizeKt.m1051sizeInqDBjuR0$default(Modifier.INSTANCE, TooltipKt.getTooltipMinWidth(), TooltipKt.getTooltipMinHeight(), TooltipKt.getPlainTooltipMaxWidth(), 0.0f, 8, null), TooltipKt.getPlainTooltipContentPadding());
                    long j13 = j12;
                    Function2<Composer, Integer, Unit> function3 = function2;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierPadding);
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
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4208boximpl(j13)), TextKt.getLocalTextStyle().provides(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), PlainTooltipTokens.INSTANCE.getSupportingTextFont()))}, function3, composer2, 0);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }
            }), composerStartRestartGroup, ((i11 >> 9) & 896) | (i112 & 112) | 12582912 | (57344 & i112) | (i112 & 458752), 72);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            f5 = fM6935constructorimpl2;
            modifier2 = companion;
            j5 = j12;
            plainTooltipContainerColor = j4;
            f3 = f4;
            shape2 = plainTooltipContainerShape;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier6 = modifier2;
            final CaretProperties caretProperties19 = caretProperties2;
            final Shape shape6 = shape2;
            final float f12 = f3;
            final float f13 = f5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$PlainTooltip$2
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

                public final void invoke(Composer composer2, int i113) {
                    Tooltip_androidKt.m2798PlainTooltipFg7CxbU(caretScope, modifier6, caretProperties19, shape6, j5, plainTooltipContainerColor, f12, f13, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: drawCaretWithPath-Bx497Mc, reason: not valid java name */
    public static final DrawResult m2800drawCaretWithPathBx497Mc(CacheDrawScope cacheDrawScope, Density density, Configuration configuration, final long j, CaretProperties caretProperties, final LayoutCoordinates layoutCoordinates) {
        long jOffset;
        final Path Path = AndroidPath_androidKt.Path();
        if (layoutCoordinates != null) {
            int iMo688roundToPx0680j_4 = density.mo688roundToPx0680j_4(caretProperties.m1829getCaretHeightD9Ej5fM());
            int iMo688roundToPx0680j_5 = density.mo688roundToPx0680j_4(caretProperties.m1830getCaretWidthD9Ej5fM());
            int iMo688roundToPx0680j_6 = density.mo688roundToPx0680j_4(Dp.m6935constructorimpl(configuration.screenWidthDp));
            int iMo688roundToPx0680j_7 = density.mo688roundToPx0680j_4(TooltipKt.getSpacingBetweenTooltipAndAnchor());
            Rect rectBoundsInWindow = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates);
            float left = rectBoundsInWindow.getLeft();
            float right = rectBoundsInWindow.getRight();
            float top = rectBoundsInWindow.getTop();
            float f = (right + left) / 2.0f;
            float fM4043getWidthimpl = Size.m4043getWidthimpl(cacheDrawScope.m3758getSizeNHjbRc());
            float fM4040getHeightimpl = Size.m4040getHeightimpl(cacheDrawScope.m3758getSizeNHjbRc());
            boolean z = (top - fM4040getHeightimpl) - ((float) iMo688roundToPx0680j_7) < 0.0f;
            if (z) {
                fM4040getHeightimpl = 0.0f;
            }
            float f2 = iMo688roundToPx0680j_6;
            if ((fM4043getWidthimpl / 2.0f) + f > f2) {
                jOffset = OffsetKt.Offset(fM4043getWidthimpl - (f2 - f), fM4040getHeightimpl);
            } else {
                jOffset = OffsetKt.Offset(f - Math.max(left - ((Size.m4043getWidthimpl(cacheDrawScope.m3758getSizeNHjbRc()) / 2.0f) - ((right - left) / 2.0f)), 0.0f), fM4040getHeightimpl);
            }
            if (z) {
                Path.moveTo(Offset.m3974getXimpl(jOffset), Offset.m3975getYimpl(jOffset));
                float f3 = iMo688roundToPx0680j_5 / 2;
                Path.lineTo(Offset.m3974getXimpl(jOffset) + f3, Offset.m3975getYimpl(jOffset));
                Path.lineTo(Offset.m3974getXimpl(jOffset), Offset.m3975getYimpl(jOffset) - iMo688roundToPx0680j_4);
                Path.lineTo(Offset.m3974getXimpl(jOffset) - f3, Offset.m3975getYimpl(jOffset));
                Path.close();
            } else {
                Path.moveTo(Offset.m3974getXimpl(jOffset), Offset.m3975getYimpl(jOffset));
                float f4 = iMo688roundToPx0680j_5 / 2;
                Path.lineTo(Offset.m3974getXimpl(jOffset) + f4, Offset.m3975getYimpl(jOffset));
                Path.lineTo(Offset.m3974getXimpl(jOffset), Offset.m3975getYimpl(jOffset) + iMo688roundToPx0680j_4);
                Path.lineTo(Offset.m3974getXimpl(jOffset) - f4, Offset.m3975getYimpl(jOffset));
                Path.close();
            }
        }
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.Tooltip_androidKt$drawCaretWithPath$4
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                if (layoutCoordinates != null) {
                    contentDrawScope.drawContent();
                    DrawScope.m4788drawPathLG529CI$default(contentDrawScope, Path, j, 0.0f, null, null, 0, 60, null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        });
    }
}
