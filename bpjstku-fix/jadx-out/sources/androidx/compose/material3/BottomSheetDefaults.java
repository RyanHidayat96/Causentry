package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.tokens.ScrimTokens;
import androidx.compose.material3.tokens.SheetBottomTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JD\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\r2\b\b\u0002\u0010#\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\f\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00048Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0006R\u0019\u0010\u0014\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0016\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0017\u0010\nR\u0011\u0010\u0018\u001a\u00020\u00198G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/material3/BottomSheetDefaults;", "", "()V", "ContainerColor", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "Elevation", "Landroidx/compose/ui/unit/Dp;", "getElevation-D9Ej5fM", "()F", "F", "ExpandedShape", "Landroidx/compose/ui/graphics/Shape;", "getExpandedShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "HiddenShape", "getHiddenShape", "ScrimColor", "getScrimColor", "SheetMaxWidth", "getSheetMaxWidth-D9Ej5fM", "SheetPeekHeight", "getSheetPeekHeight-D9Ej5fM", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "DragHandle", "", "modifier", "Landroidx/compose/ui/Modifier;", "width", "height", "shape", TypedValues.Custom.S_COLOR, "DragHandle-lgZ2HuY", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Shape;JLandroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BottomSheetDefaults {
    public static final int $stable = 0;
    public static final BottomSheetDefaults INSTANCE = new BottomSheetDefaults();
    private static final float Elevation = SheetBottomTokens.INSTANCE.m3312getDockedModalContainerElevationD9Ej5fM();
    private static final float SheetPeekHeight = Dp.m6935constructorimpl(56.0f);
    private static final float SheetMaxWidth = Dp.m6935constructorimpl(640.0f);

    private BottomSheetDefaults() {
    }

    public final Shape getHiddenShape(Composer composer, int i) {
        composer.startReplaceableGroup(-1971658024);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1971658024, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-HiddenShape> (SheetDefaults.kt:348)");
        }
        Shape value = ShapesKt.getValue(SheetBottomTokens.INSTANCE.getDockedMinimizedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    public final Shape getExpandedShape(Composer composer, int i) {
        composer.startReplaceableGroup(1683783414);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1683783414, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ExpandedShape> (SheetDefaults.kt:353)");
        }
        Shape value = ShapesKt.getValue(SheetBottomTokens.INSTANCE.getDockedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    public final long getContainerColor(Composer composer, int i) {
        composer.startReplaceableGroup(433375448);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(433375448, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ContainerColor> (SheetDefaults.kt:358)");
        }
        long value = ColorSchemeKt.getValue(SheetBottomTokens.INSTANCE.getDockedContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    /* JADX INFO: renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m1778getElevationD9Ej5fM() {
        return Elevation;
    }

    public final long getScrimColor(Composer composer, int i) {
        composer.startReplaceableGroup(-2040719176);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2040719176, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ScrimColor> (SheetDefaults.kt:366)");
        }
        long jM4217copywmQWz5c$default = Color.m4217copywmQWz5c$default(ColorSchemeKt.getValue(ScrimTokens.INSTANCE.getContainerColor(), composer, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return jM4217copywmQWz5c$default;
    }

    /* JADX INFO: renamed from: getSheetPeekHeight-D9Ej5fM, reason: not valid java name */
    public final float m1780getSheetPeekHeightD9Ej5fM() {
        return SheetPeekHeight;
    }

    /* JADX INFO: renamed from: getSheetMaxWidth-D9Ej5fM, reason: not valid java name */
    public final float m1779getSheetMaxWidthD9Ej5fM() {
        return SheetMaxWidth;
    }

    public final WindowInsets getWindowInsets(Composer composer, int i) {
        composer.startReplaceableGroup(-511309409);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-511309409, i, -1, "androidx.compose.material3.BottomSheetDefaults.<get-windowInsets> (SheetDefaults.kt:383)");
        }
        WindowInsets windowInsetsM1073onlybOOhFvg = WindowInsetsKt.m1073onlybOOhFvg(SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.INSTANCE, composer, 6), WindowInsetsSides.INSTANCE.m1100getVerticalJoeWqyM());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return windowInsetsM1073onlybOOhFvg;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:85:0x011d  */
    /* JADX WARN: Code duplicated, block: B:89:0x012d  */
    /* JADX WARN: Code duplicated, block: B:92:0x015b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0163  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a9  */
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
    /* JADX INFO: renamed from: DragHandle-lgZ2HuY, reason: not valid java name */
    public final void m1777DragHandlelgZ2HuY(Modifier modifier, float f, float f2, Shape shape, long j, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final float fM3311getDockedDragHandleWidthD9Ej5fM;
        int i4;
        float fM3310getDockedDragHandleHeightD9Ej5fM;
        int i5;
        Shape extraLarge;
        long jM4217copywmQWz5c$default;
        final Modifier.Companion companion;
        int i6;
        final String strM2496getStringNWtq28;
        boolean zChanged;
        Object objRememberedValue;
        final Shape shape2;
        final float f3;
        final float f4;
        final long j2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1364277227);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                fM3311getDockedDragHandleWidthD9Ej5fM = f;
                i3 |= composerStartRestartGroup.changed(fM3311getDockedDragHandleWidthD9Ej5fM) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    fM3310getDockedDragHandleHeightD9Ej5fM = f2;
                    if (composerStartRestartGroup.changed(fM3310getDockedDragHandleHeightD9Ej5fM)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        extraLarge = shape;
                        int i9 = composerStartRestartGroup.changed(extraLarge) ? 2048 : 1024;
                        i3 |= i9;
                    } else {
                        extraLarge = shape;
                    }
                    i3 |= i9;
                } else {
                    extraLarge = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        jM4217copywmQWz5c$default = j;
                        int i10 = composerStartRestartGroup.changed(jM4217copywmQWz5c$default) ? 16384 : 8192;
                        i3 |= i10;
                    } else {
                        jM4217copywmQWz5c$default = j;
                    }
                    i3 |= i10;
                } else {
                    jM4217copywmQWz5c$default = j;
                }
                if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                    } else {
                        if (i7 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i8 != 0) {
                            fM3311getDockedDragHandleWidthD9Ej5fM = SheetBottomTokens.INSTANCE.m3311getDockedDragHandleWidthD9Ej5fM();
                        }
                        if (i4 != 0) {
                            fM3310getDockedDragHandleHeightD9Ej5fM = SheetBottomTokens.INSTANCE.m3310getDockedDragHandleHeightD9Ej5fM();
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            extraLarge = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getExtraLarge();
                        }
                        if ((i2 & 16) != 0) {
                            jM4217copywmQWz5c$default = Color.m4217copywmQWz5c$default(ColorSchemeKt.getValue(SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), composerStartRestartGroup, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                            i6 = i3 & (-57345);
                        } else {
                            modifier2 = companion;
                        }
                        final float f5 = fM3310getDockedDragHandleHeightD9Ej5fM;
                        Shape shape3 = extraLarge;
                        long j3 = jM4217copywmQWz5c$default;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1364277227, i6, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:396)");
                        }
                        Strings.Companion companion2 = Strings.INSTANCE;
                        strM2496getStringNWtq28 = Strings_androidKt.m2496getStringNWtq28(Strings.m2427constructorimpl(R.string.m3c_bottom_sheet_drag_handle_description), composerStartRestartGroup, 0);
                        Modifier modifierM1004paddingVpY3zN4$default = PaddingKt.m1004paddingVpY3zN4$default(companion, 0.0f, SheetDefaultsKt.DragHandleVerticalPadding, 1, null);
                        composerStartRestartGroup.startReplaceableGroup(-363350248);
                        zChanged = composerStartRestartGroup.changed(strM2496getStringNWtq28);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                                @Override // kotlin.jvm.functions.Function1
                                public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    invoke2(semanticsPropertyReceiver);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                    SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM2496getStringNWtq28);
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        int i11 = i6 >> 6;
                        SurfaceKt.m2506SurfaceT9BRK9s(SemanticsModifierKt.semantics$default(modifierM1004paddingVpY3zN4$default, false, (Function1) objRememberedValue, 1, null), shape3, j3, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1039573072, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$2
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i12) {
                                if ((i12 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1039573072, i12, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle.<anonymous> (SheetDefaults.kt:405)");
                                    }
                                    BoxKt.Box(SizeKt.m1049sizeVpY3zN4(Modifier.INSTANCE, fM3311getDockedDragHandleWidthD9Ej5fM, f5), composer2, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }
                        }), composerStartRestartGroup, (i11 & 112) | 12582912 | (i11 & 896), 120);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        shape2 = shape3;
                        f3 = f5;
                        f4 = fM3311getDockedDragHandleWidthD9Ej5fM;
                        j2 = j3;
                    }
                    companion = modifier2;
                    i6 = i3;
                    final float f6 = fM3310getDockedDragHandleHeightD9Ej5fM;
                    Shape shape4 = extraLarge;
                    long j4 = jM4217copywmQWz5c$default;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1364277227, i6, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:396)");
                    }
                    Strings.Companion companion3 = Strings.INSTANCE;
                    strM2496getStringNWtq28 = Strings_androidKt.m2496getStringNWtq28(Strings.m2427constructorimpl(R.string.m3c_bottom_sheet_drag_handle_description), composerStartRestartGroup, 0);
                    Modifier modifierM1004paddingVpY3zN4$default2 = PaddingKt.m1004paddingVpY3zN4$default(companion, 0.0f, SheetDefaultsKt.DragHandleVerticalPadding, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(-363350248);
                    zChanged = composerStartRestartGroup.changed(strM2496getStringNWtq28);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM2496getStringNWtq28);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    } else {
                        objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM2496getStringNWtq28);
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i12 = i6 >> 6;
                    SurfaceKt.m2506SurfaceT9BRK9s(SemanticsModifierKt.semantics$default(modifierM1004paddingVpY3zN4$default2, false, (Function1) objRememberedValue, 1, null), shape4, j4, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1039573072, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$2
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i13) {
                            if ((i13 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1039573072, i13, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle.<anonymous> (SheetDefaults.kt:405)");
                                }
                                BoxKt.Box(SizeKt.m1049sizeVpY3zN4(Modifier.INSTANCE, fM3311getDockedDragHandleWidthD9Ej5fM, f6), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }
                    }), composerStartRestartGroup, (i12 & 112) | 12582912 | (i12 & 896), 120);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape2 = shape4;
                    f3 = f6;
                    f4 = fM3311getDockedDragHandleWidthD9Ej5fM;
                    j2 = j4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    companion = modifier2;
                    f4 = fM3311getDockedDragHandleWidthD9Ej5fM;
                    f3 = fM3310getDockedDragHandleHeightD9Ej5fM;
                    shape2 = extraLarge;
                    j2 = jM4217copywmQWz5c$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$3
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
                            this.$tmp1_rcvr.m1777DragHandlelgZ2HuY(companion, f4, f3, shape2, j2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 384;
            fM3310getDockedDragHandleHeightD9Ej5fM = f2;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    extraLarge = shape;
                    if (composerStartRestartGroup.changed(extraLarge)) {
                    }
                    i3 |= i9;
                } else {
                    extraLarge = shape;
                }
                i3 |= i9;
            } else {
                extraLarge = shape;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    jM4217copywmQWz5c$default = j;
                    if (composerStartRestartGroup.changed(jM4217copywmQWz5c$default)) {
                    }
                    i3 |= i10;
                } else {
                    jM4217copywmQWz5c$default = j;
                }
                i3 |= i10;
            } else {
                jM4217copywmQWz5c$default = j;
            }
            if ((i3 & 9363) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i7 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i8 != 0) {
                        fM3311getDockedDragHandleWidthD9Ej5fM = SheetBottomTokens.INSTANCE.m3311getDockedDragHandleWidthD9Ej5fM();
                    }
                    if (i4 != 0) {
                        fM3310getDockedDragHandleHeightD9Ej5fM = SheetBottomTokens.INSTANCE.m3310getDockedDragHandleHeightD9Ej5fM();
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        extraLarge = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getExtraLarge();
                    }
                    if ((i2 & 16) != 0) {
                        jM4217copywmQWz5c$default = Color.m4217copywmQWz5c$default(ColorSchemeKt.getValue(SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), composerStartRestartGroup, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                        i6 = i3 & (-57345);
                    } else {
                        modifier2 = companion;
                        companion = modifier2;
                        i6 = i3;
                    }
                } else {
                    if (i7 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i8 != 0) {
                        fM3311getDockedDragHandleWidthD9Ej5fM = SheetBottomTokens.INSTANCE.m3311getDockedDragHandleWidthD9Ej5fM();
                    }
                    if (i4 != 0) {
                        fM3310getDockedDragHandleHeightD9Ej5fM = SheetBottomTokens.INSTANCE.m3310getDockedDragHandleHeightD9Ej5fM();
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        extraLarge = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getExtraLarge();
                    }
                    if ((i2 & 16) != 0) {
                        jM4217copywmQWz5c$default = Color.m4217copywmQWz5c$default(ColorSchemeKt.getValue(SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), composerStartRestartGroup, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                        i6 = i3 & (-57345);
                    } else {
                        modifier2 = companion;
                        companion = modifier2;
                        i6 = i3;
                    }
                }
                final float f7 = fM3310getDockedDragHandleHeightD9Ej5fM;
                Shape shape5 = extraLarge;
                long j5 = jM4217copywmQWz5c$default;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1364277227, i6, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:396)");
                }
                Strings.Companion companion4 = Strings.INSTANCE;
                strM2496getStringNWtq28 = Strings_androidKt.m2496getStringNWtq28(Strings.m2427constructorimpl(R.string.m3c_bottom_sheet_drag_handle_description), composerStartRestartGroup, 0);
                Modifier modifierM1004paddingVpY3zN4$default3 = PaddingKt.m1004paddingVpY3zN4$default(companion, 0.0f, SheetDefaultsKt.DragHandleVerticalPadding, 1, null);
                composerStartRestartGroup.startReplaceableGroup(-363350248);
                zChanged = composerStartRestartGroup.changed(strM2496getStringNWtq28);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM2496getStringNWtq28);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM2496getStringNWtq28);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i13 = i6 >> 6;
                SurfaceKt.m2506SurfaceT9BRK9s(SemanticsModifierKt.semantics$default(modifierM1004paddingVpY3zN4$default3, false, (Function1) objRememberedValue, 1, null), shape5, j5, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1039573072, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$2
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i14) {
                        if ((i14 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1039573072, i14, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle.<anonymous> (SheetDefaults.kt:405)");
                            }
                            BoxKt.Box(SizeKt.m1049sizeVpY3zN4(Modifier.INSTANCE, fM3311getDockedDragHandleWidthD9Ej5fM, f7), composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }
                }), composerStartRestartGroup, (i13 & 112) | 12582912 | (i13 & 896), 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape2 = shape5;
                f3 = f7;
                f4 = fM3311getDockedDragHandleWidthD9Ej5fM;
                j2 = j5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i7 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i8 != 0) {
                        fM3311getDockedDragHandleWidthD9Ej5fM = SheetBottomTokens.INSTANCE.m3311getDockedDragHandleWidthD9Ej5fM();
                    }
                    if (i4 != 0) {
                        fM3310getDockedDragHandleHeightD9Ej5fM = SheetBottomTokens.INSTANCE.m3310getDockedDragHandleHeightD9Ej5fM();
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        extraLarge = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getExtraLarge();
                    }
                    if ((i2 & 16) != 0) {
                        jM4217copywmQWz5c$default = Color.m4217copywmQWz5c$default(ColorSchemeKt.getValue(SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), composerStartRestartGroup, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                        i6 = i3 & (-57345);
                    } else {
                        modifier2 = companion;
                        companion = modifier2;
                        i6 = i3;
                    }
                } else {
                    if (i7 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i8 != 0) {
                        fM3311getDockedDragHandleWidthD9Ej5fM = SheetBottomTokens.INSTANCE.m3311getDockedDragHandleWidthD9Ej5fM();
                    }
                    if (i4 != 0) {
                        fM3310getDockedDragHandleHeightD9Ej5fM = SheetBottomTokens.INSTANCE.m3310getDockedDragHandleHeightD9Ej5fM();
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        extraLarge = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getExtraLarge();
                    }
                    if ((i2 & 16) != 0) {
                        jM4217copywmQWz5c$default = Color.m4217copywmQWz5c$default(ColorSchemeKt.getValue(SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), composerStartRestartGroup, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                        i6 = i3 & (-57345);
                    } else {
                        modifier2 = companion;
                        companion = modifier2;
                        i6 = i3;
                    }
                }
                final float f8 = fM3310getDockedDragHandleHeightD9Ej5fM;
                Shape shape6 = extraLarge;
                long j6 = jM4217copywmQWz5c$default;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1364277227, i6, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:396)");
                }
                Strings.Companion companion5 = Strings.INSTANCE;
                strM2496getStringNWtq28 = Strings_androidKt.m2496getStringNWtq28(Strings.m2427constructorimpl(R.string.m3c_bottom_sheet_drag_handle_description), composerStartRestartGroup, 0);
                Modifier modifierM1004paddingVpY3zN4$default4 = PaddingKt.m1004paddingVpY3zN4$default(companion, 0.0f, SheetDefaultsKt.DragHandleVerticalPadding, 1, null);
                composerStartRestartGroup.startReplaceableGroup(-363350248);
                zChanged = composerStartRestartGroup.changed(strM2496getStringNWtq28);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM2496getStringNWtq28);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM2496getStringNWtq28);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i14 = i6 >> 6;
                SurfaceKt.m2506SurfaceT9BRK9s(SemanticsModifierKt.semantics$default(modifierM1004paddingVpY3zN4$default4, false, (Function1) objRememberedValue, 1, null), shape6, j6, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1039573072, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$2
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i15) {
                        if ((i15 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1039573072, i15, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle.<anonymous> (SheetDefaults.kt:405)");
                            }
                            BoxKt.Box(SizeKt.m1049sizeVpY3zN4(Modifier.INSTANCE, fM3311getDockedDragHandleWidthD9Ej5fM, f8), composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }
                }), composerStartRestartGroup, (i14 & 112) | 12582912 | (i14 & 896), 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape2 = shape6;
                f3 = f8;
                f4 = fM3311getDockedDragHandleWidthD9Ej5fM;
                j2 = j6;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$3
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
                        this.$tmp1_rcvr.m1777DragHandlelgZ2HuY(companion, f4, f3, shape2, j2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 48;
        fM3311getDockedDragHandleWidthD9Ej5fM = f;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                fM3310getDockedDragHandleHeightD9Ej5fM = f2;
                if (composerStartRestartGroup.changed(fM3310getDockedDragHandleHeightD9Ej5fM)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    extraLarge = shape;
                    if (composerStartRestartGroup.changed(extraLarge)) {
                    }
                    i3 |= i9;
                } else {
                    extraLarge = shape;
                }
                i3 |= i9;
            } else {
                extraLarge = shape;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    jM4217copywmQWz5c$default = j;
                    if (composerStartRestartGroup.changed(jM4217copywmQWz5c$default)) {
                    }
                    i3 |= i10;
                } else {
                    jM4217copywmQWz5c$default = j;
                }
                i3 |= i10;
            } else {
                jM4217copywmQWz5c$default = j;
            }
            if ((i3 & 9363) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i7 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i8 != 0) {
                        fM3311getDockedDragHandleWidthD9Ej5fM = SheetBottomTokens.INSTANCE.m3311getDockedDragHandleWidthD9Ej5fM();
                    }
                    if (i4 != 0) {
                        fM3310getDockedDragHandleHeightD9Ej5fM = SheetBottomTokens.INSTANCE.m3310getDockedDragHandleHeightD9Ej5fM();
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        extraLarge = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getExtraLarge();
                    }
                    if ((i2 & 16) != 0) {
                        jM4217copywmQWz5c$default = Color.m4217copywmQWz5c$default(ColorSchemeKt.getValue(SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), composerStartRestartGroup, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                        i6 = i3 & (-57345);
                    } else {
                        modifier2 = companion;
                        companion = modifier2;
                        i6 = i3;
                    }
                } else {
                    if (i7 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i8 != 0) {
                        fM3311getDockedDragHandleWidthD9Ej5fM = SheetBottomTokens.INSTANCE.m3311getDockedDragHandleWidthD9Ej5fM();
                    }
                    if (i4 != 0) {
                        fM3310getDockedDragHandleHeightD9Ej5fM = SheetBottomTokens.INSTANCE.m3310getDockedDragHandleHeightD9Ej5fM();
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        extraLarge = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getExtraLarge();
                    }
                    if ((i2 & 16) != 0) {
                        jM4217copywmQWz5c$default = Color.m4217copywmQWz5c$default(ColorSchemeKt.getValue(SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), composerStartRestartGroup, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                        i6 = i3 & (-57345);
                    } else {
                        modifier2 = companion;
                        companion = modifier2;
                        i6 = i3;
                    }
                }
                final float f9 = fM3310getDockedDragHandleHeightD9Ej5fM;
                Shape shape7 = extraLarge;
                long j7 = jM4217copywmQWz5c$default;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1364277227, i6, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:396)");
                }
                Strings.Companion companion6 = Strings.INSTANCE;
                strM2496getStringNWtq28 = Strings_androidKt.m2496getStringNWtq28(Strings.m2427constructorimpl(R.string.m3c_bottom_sheet_drag_handle_description), composerStartRestartGroup, 0);
                Modifier modifierM1004paddingVpY3zN4$default5 = PaddingKt.m1004paddingVpY3zN4$default(companion, 0.0f, SheetDefaultsKt.DragHandleVerticalPadding, 1, null);
                composerStartRestartGroup.startReplaceableGroup(-363350248);
                zChanged = composerStartRestartGroup.changed(strM2496getStringNWtq28);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM2496getStringNWtq28);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM2496getStringNWtq28);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i15 = i6 >> 6;
                SurfaceKt.m2506SurfaceT9BRK9s(SemanticsModifierKt.semantics$default(modifierM1004paddingVpY3zN4$default5, false, (Function1) objRememberedValue, 1, null), shape7, j7, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1039573072, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$2
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i16) {
                        if ((i16 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1039573072, i16, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle.<anonymous> (SheetDefaults.kt:405)");
                            }
                            BoxKt.Box(SizeKt.m1049sizeVpY3zN4(Modifier.INSTANCE, fM3311getDockedDragHandleWidthD9Ej5fM, f9), composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }
                }), composerStartRestartGroup, (i15 & 112) | 12582912 | (i15 & 896), 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape2 = shape7;
                f3 = f9;
                f4 = fM3311getDockedDragHandleWidthD9Ej5fM;
                j2 = j7;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                    if (i7 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i8 != 0) {
                        fM3311getDockedDragHandleWidthD9Ej5fM = SheetBottomTokens.INSTANCE.m3311getDockedDragHandleWidthD9Ej5fM();
                    }
                    if (i4 != 0) {
                        fM3310getDockedDragHandleHeightD9Ej5fM = SheetBottomTokens.INSTANCE.m3310getDockedDragHandleHeightD9Ej5fM();
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        extraLarge = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getExtraLarge();
                    }
                    if ((i2 & 16) != 0) {
                        jM4217copywmQWz5c$default = Color.m4217copywmQWz5c$default(ColorSchemeKt.getValue(SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), composerStartRestartGroup, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                        i6 = i3 & (-57345);
                    } else {
                        modifier2 = companion;
                        companion = modifier2;
                        i6 = i3;
                    }
                } else {
                    if (i7 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i8 != 0) {
                        fM3311getDockedDragHandleWidthD9Ej5fM = SheetBottomTokens.INSTANCE.m3311getDockedDragHandleWidthD9Ej5fM();
                    }
                    if (i4 != 0) {
                        fM3310getDockedDragHandleHeightD9Ej5fM = SheetBottomTokens.INSTANCE.m3310getDockedDragHandleHeightD9Ej5fM();
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        extraLarge = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getExtraLarge();
                    }
                    if ((i2 & 16) != 0) {
                        jM4217copywmQWz5c$default = Color.m4217copywmQWz5c$default(ColorSchemeKt.getValue(SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), composerStartRestartGroup, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                        i6 = i3 & (-57345);
                    } else {
                        modifier2 = companion;
                        companion = modifier2;
                        i6 = i3;
                    }
                }
                final float f10 = fM3310getDockedDragHandleHeightD9Ej5fM;
                Shape shape8 = extraLarge;
                long j8 = jM4217copywmQWz5c$default;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1364277227, i6, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:396)");
                }
                Strings.Companion companion7 = Strings.INSTANCE;
                strM2496getStringNWtq28 = Strings_androidKt.m2496getStringNWtq28(Strings.m2427constructorimpl(R.string.m3c_bottom_sheet_drag_handle_description), composerStartRestartGroup, 0);
                Modifier modifierM1004paddingVpY3zN4$default6 = PaddingKt.m1004paddingVpY3zN4$default(companion, 0.0f, SheetDefaultsKt.DragHandleVerticalPadding, 1, null);
                composerStartRestartGroup.startReplaceableGroup(-363350248);
                zChanged = composerStartRestartGroup.changed(strM2496getStringNWtq28);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM2496getStringNWtq28);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM2496getStringNWtq28);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i16 = i6 >> 6;
                SurfaceKt.m2506SurfaceT9BRK9s(SemanticsModifierKt.semantics$default(modifierM1004paddingVpY3zN4$default6, false, (Function1) objRememberedValue, 1, null), shape8, j8, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1039573072, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$2
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i17) {
                        if ((i17 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1039573072, i17, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle.<anonymous> (SheetDefaults.kt:405)");
                            }
                            BoxKt.Box(SizeKt.m1049sizeVpY3zN4(Modifier.INSTANCE, fM3311getDockedDragHandleWidthD9Ej5fM, f10), composer2, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }
                }), composerStartRestartGroup, (i16 & 112) | 12582912 | (i16 & 896), 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape2 = shape8;
                f3 = f10;
                f4 = fM3311getDockedDragHandleWidthD9Ej5fM;
                j2 = j8;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i17) {
                        this.$tmp1_rcvr.m1777DragHandlelgZ2HuY(companion, f4, f3, shape2, j2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 384;
        fM3310getDockedDragHandleHeightD9Ej5fM = f2;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                extraLarge = shape;
                if (composerStartRestartGroup.changed(extraLarge)) {
                }
                i3 |= i9;
            } else {
                extraLarge = shape;
            }
            i3 |= i9;
        } else {
            extraLarge = shape;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                jM4217copywmQWz5c$default = j;
                if (composerStartRestartGroup.changed(jM4217copywmQWz5c$default)) {
                }
                i3 |= i10;
            } else {
                jM4217copywmQWz5c$default = j;
            }
            i3 |= i10;
        } else {
            jM4217copywmQWz5c$default = j;
        }
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i7 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i8 != 0) {
                    fM3311getDockedDragHandleWidthD9Ej5fM = SheetBottomTokens.INSTANCE.m3311getDockedDragHandleWidthD9Ej5fM();
                }
                if (i4 != 0) {
                    fM3310getDockedDragHandleHeightD9Ej5fM = SheetBottomTokens.INSTANCE.m3310getDockedDragHandleHeightD9Ej5fM();
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    extraLarge = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getExtraLarge();
                }
                if ((i2 & 16) != 0) {
                    jM4217copywmQWz5c$default = Color.m4217copywmQWz5c$default(ColorSchemeKt.getValue(SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), composerStartRestartGroup, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                    i6 = i3 & (-57345);
                } else {
                    modifier2 = companion;
                    companion = modifier2;
                    i6 = i3;
                }
            } else {
                if (i7 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i8 != 0) {
                    fM3311getDockedDragHandleWidthD9Ej5fM = SheetBottomTokens.INSTANCE.m3311getDockedDragHandleWidthD9Ej5fM();
                }
                if (i4 != 0) {
                    fM3310getDockedDragHandleHeightD9Ej5fM = SheetBottomTokens.INSTANCE.m3310getDockedDragHandleHeightD9Ej5fM();
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    extraLarge = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getExtraLarge();
                }
                if ((i2 & 16) != 0) {
                    jM4217copywmQWz5c$default = Color.m4217copywmQWz5c$default(ColorSchemeKt.getValue(SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), composerStartRestartGroup, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                    i6 = i3 & (-57345);
                } else {
                    modifier2 = companion;
                    companion = modifier2;
                    i6 = i3;
                }
            }
            final float f11 = fM3310getDockedDragHandleHeightD9Ej5fM;
            Shape shape9 = extraLarge;
            long j9 = jM4217copywmQWz5c$default;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1364277227, i6, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:396)");
            }
            Strings.Companion companion8 = Strings.INSTANCE;
            strM2496getStringNWtq28 = Strings_androidKt.m2496getStringNWtq28(Strings.m2427constructorimpl(R.string.m3c_bottom_sheet_drag_handle_description), composerStartRestartGroup, 0);
            Modifier modifierM1004paddingVpY3zN4$default7 = PaddingKt.m1004paddingVpY3zN4$default(companion, 0.0f, SheetDefaultsKt.DragHandleVerticalPadding, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-363350248);
            zChanged = composerStartRestartGroup.changed(strM2496getStringNWtq28);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM2496getStringNWtq28);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM2496getStringNWtq28);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i17 = i6 >> 6;
            SurfaceKt.m2506SurfaceT9BRK9s(SemanticsModifierKt.semantics$default(modifierM1004paddingVpY3zN4$default7, false, (Function1) objRememberedValue, 1, null), shape9, j9, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1039573072, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$2
                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i18) {
                    if ((i18 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1039573072, i18, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle.<anonymous> (SheetDefaults.kt:405)");
                        }
                        BoxKt.Box(SizeKt.m1049sizeVpY3zN4(Modifier.INSTANCE, fM3311getDockedDragHandleWidthD9Ej5fM, f11), composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }
            }), composerStartRestartGroup, (i17 & 112) | 12582912 | (i17 & 896), 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shape2 = shape9;
            f3 = f11;
            f4 = fM3311getDockedDragHandleWidthD9Ej5fM;
            j2 = j9;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i7 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i8 != 0) {
                    fM3311getDockedDragHandleWidthD9Ej5fM = SheetBottomTokens.INSTANCE.m3311getDockedDragHandleWidthD9Ej5fM();
                }
                if (i4 != 0) {
                    fM3310getDockedDragHandleHeightD9Ej5fM = SheetBottomTokens.INSTANCE.m3310getDockedDragHandleHeightD9Ej5fM();
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    extraLarge = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getExtraLarge();
                }
                if ((i2 & 16) != 0) {
                    jM4217copywmQWz5c$default = Color.m4217copywmQWz5c$default(ColorSchemeKt.getValue(SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), composerStartRestartGroup, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                    i6 = i3 & (-57345);
                } else {
                    modifier2 = companion;
                    companion = modifier2;
                    i6 = i3;
                }
            } else {
                if (i7 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i8 != 0) {
                    fM3311getDockedDragHandleWidthD9Ej5fM = SheetBottomTokens.INSTANCE.m3311getDockedDragHandleWidthD9Ej5fM();
                }
                if (i4 != 0) {
                    fM3310getDockedDragHandleHeightD9Ej5fM = SheetBottomTokens.INSTANCE.m3310getDockedDragHandleHeightD9Ej5fM();
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    extraLarge = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getExtraLarge();
                }
                if ((i2 & 16) != 0) {
                    jM4217copywmQWz5c$default = Color.m4217copywmQWz5c$default(ColorSchemeKt.getValue(SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), composerStartRestartGroup, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                    i6 = i3 & (-57345);
                } else {
                    modifier2 = companion;
                    companion = modifier2;
                    i6 = i3;
                }
            }
            final float f12 = fM3310getDockedDragHandleHeightD9Ej5fM;
            Shape shape10 = extraLarge;
            long j10 = jM4217copywmQWz5c$default;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1364277227, i6, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:396)");
            }
            Strings.Companion companion9 = Strings.INSTANCE;
            strM2496getStringNWtq28 = Strings_androidKt.m2496getStringNWtq28(Strings.m2427constructorimpl(R.string.m3c_bottom_sheet_drag_handle_description), composerStartRestartGroup, 0);
            Modifier modifierM1004paddingVpY3zN4$default8 = PaddingKt.m1004paddingVpY3zN4$default(companion, 0.0f, SheetDefaultsKt.DragHandleVerticalPadding, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-363350248);
            zChanged = composerStartRestartGroup.changed(strM2496getStringNWtq28);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM2496getStringNWtq28);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = (Function1) new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM2496getStringNWtq28);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i18 = i6 >> 6;
            SurfaceKt.m2506SurfaceT9BRK9s(SemanticsModifierKt.semantics$default(modifierM1004paddingVpY3zN4$default8, false, (Function1) objRememberedValue, 1, null), shape10, j10, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1039573072, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$2
                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i19) {
                    if ((i19 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1039573072, i19, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle.<anonymous> (SheetDefaults.kt:405)");
                        }
                        BoxKt.Box(SizeKt.m1049sizeVpY3zN4(Modifier.INSTANCE, fM3311getDockedDragHandleWidthD9Ej5fM, f12), composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }
            }), composerStartRestartGroup, (i18 & 112) | 12582912 | (i18 & 896), 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shape2 = shape10;
            f3 = f12;
            f4 = fM3311getDockedDragHandleWidthD9Ej5fM;
            j2 = j10;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.BottomSheetDefaults$DragHandle$3
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
                    this.$tmp1_rcvr.m1777DragHandlelgZ2HuY(companion, f4, f3, shape2, j2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }
}
