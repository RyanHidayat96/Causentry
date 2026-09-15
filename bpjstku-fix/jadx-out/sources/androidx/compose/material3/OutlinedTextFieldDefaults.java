package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b)\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JP\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00132\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u009c\u0002\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%2\u0011\u0010&\u001a\r\u0012\u0004\u0012\u00020\u00180'¢\u0006\u0002\b(2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\u0015\b\u0002\u0010,\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010'¢\u0006\u0002\b(2\u0015\b\u0002\u0010-\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010'¢\u0006\u0002\b(2\u0015\b\u0002\u0010.\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010'¢\u0006\u0002\b(2\u0015\b\u0002\u0010/\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010'¢\u0006\u0002\b(2\u0015\b\u0002\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010'¢\u0006\u0002\b(2\u0015\b\u0002\u00101\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010'¢\u0006\u0002\b(2\u0015\b\u0002\u00102\u001a\u000f\u0012\u0004\u0012\u00020\u0018\u0018\u00010'¢\u0006\u0002\b(2\b\b\u0002\u0010\u001e\u001a\u00020\u00132\b\b\u0002\u00103\u001a\u0002042\u0013\b\u0002\u00105\u001a\r\u0012\u0004\u0012\u00020\u00180'¢\u0006\u0002\b(H\u0007¢\u0006\u0002\u00106J\r\u0010\u001e\u001a\u00020\u0013H\u0007¢\u0006\u0002\u00107JÂ\u0003\u0010\u001e\u001a\u00020\u00132\b\b\u0002\u00108\u001a\u0002092\b\b\u0002\u0010:\u001a\u0002092\b\b\u0002\u0010;\u001a\u0002092\b\b\u0002\u0010<\u001a\u0002092\b\b\u0002\u0010=\u001a\u0002092\b\b\u0002\u0010>\u001a\u0002092\b\b\u0002\u0010?\u001a\u0002092\b\b\u0002\u0010@\u001a\u0002092\b\b\u0002\u0010A\u001a\u0002092\b\b\u0002\u0010B\u001a\u0002092\n\b\u0002\u0010C\u001a\u0004\u0018\u00010D2\b\b\u0002\u0010E\u001a\u0002092\b\b\u0002\u0010F\u001a\u0002092\b\b\u0002\u0010G\u001a\u0002092\b\b\u0002\u0010H\u001a\u0002092\b\b\u0002\u0010I\u001a\u0002092\b\b\u0002\u0010J\u001a\u0002092\b\b\u0002\u0010K\u001a\u0002092\b\b\u0002\u0010L\u001a\u0002092\b\b\u0002\u0010M\u001a\u0002092\b\b\u0002\u0010N\u001a\u0002092\b\b\u0002\u0010O\u001a\u0002092\b\b\u0002\u0010P\u001a\u0002092\b\b\u0002\u0010Q\u001a\u0002092\b\b\u0002\u0010R\u001a\u0002092\b\b\u0002\u0010S\u001a\u0002092\b\b\u0002\u0010T\u001a\u0002092\b\b\u0002\u0010U\u001a\u0002092\b\b\u0002\u0010V\u001a\u0002092\b\b\u0002\u0010W\u001a\u0002092\b\b\u0002\u0010X\u001a\u0002092\b\b\u0002\u0010Y\u001a\u0002092\b\b\u0002\u0010Z\u001a\u0002092\b\b\u0002\u0010[\u001a\u0002092\b\b\u0002\u0010\\\u001a\u0002092\b\b\u0002\u0010]\u001a\u0002092\b\b\u0002\u0010^\u001a\u0002092\b\b\u0002\u0010_\u001a\u0002092\b\b\u0002\u0010`\u001a\u0002092\b\b\u0002\u0010a\u001a\u0002092\b\b\u0002\u0010b\u001a\u0002092\b\b\u0002\u0010c\u001a\u0002092\b\b\u0002\u0010d\u001a\u000209H\u0007ø\u0001\u0000¢\u0006\u0004\be\u0010fJ8\u00103\u001a\u0002042\b\b\u0002\u0010g\u001a\u00020\u00042\b\b\u0002\u0010h\u001a\u00020\u00042\b\b\u0002\u0010i\u001a\u00020\u00042\b\b\u0002\u0010j\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\bk\u0010lR\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0011\u0010\u000e\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u00020\u0013*\u00020\u00148AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006m"}, d2 = {"Landroidx/compose/material3/OutlinedTextFieldDefaults;", "", "()V", "FocusedBorderThickness", "Landroidx/compose/ui/unit/Dp;", "getFocusedBorderThickness-D9Ej5fM", "()F", "F", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "UnfocusedBorderThickness", "getUnfocusedBorderThickness-D9Ej5fM", "shape", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "defaultOutlinedTextFieldColors", "Landroidx/compose/material3/TextFieldColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultOutlinedTextFieldColors", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "ContainerBox", "", "enabled", "", "isError", "interactionSource", "Landroidx/compose/foundation/interaction/InteractionSource;", "colors", "focusedBorderThickness", "unfocusedBorderThickness", "ContainerBox-nbWgWpA", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/ui/graphics/Shape;FFLandroidx/compose/runtime/Composer;II)V", "DecorationBox", "value", "", "innerTextField", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "singleLine", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", Constants.ScionAnalytics.PARAM_LABEL, "placeholder", "leadingIcon", "trailingIcon", "prefix", DynamicLink.Builder.KEY_SUFFIX, "supportingText", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "container", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/interaction/InteractionSource;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TextFieldColors;", "focusedTextColor", "Landroidx/compose/ui/graphics/Color;", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "selectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "colors-0hiis_0", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIIII)Landroidx/compose/material3/TextFieldColors;", "start", "top", "end", "bottom", "contentPadding-a9UjIt4", "(FFFF)Landroidx/compose/foundation/layout/PaddingValues;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OutlinedTextFieldDefaults {
    public static final int $stable = 0;
    public static final OutlinedTextFieldDefaults INSTANCE = new OutlinedTextFieldDefaults();
    private static final float MinHeight = Dp.m6935constructorimpl(56.0f);
    private static final float MinWidth = Dp.m6935constructorimpl(280.0f);
    private static final float UnfocusedBorderThickness = Dp.m6935constructorimpl(1.0f);
    private static final float FocusedBorderThickness = Dp.m6935constructorimpl(2.0f);

    private OutlinedTextFieldDefaults() {
    }

    public final Shape getShape(Composer composer, int i) {
        composer.startReplaceableGroup(-1066756961);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1066756961, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-shape> (TextFieldDefaults.kt:1409)");
        }
        Shape value = ShapesKt.getValue(OutlinedTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m2259getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* JADX INFO: renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m2260getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    /* JADX INFO: renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m2261getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* JADX INFO: renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m2258getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* JADX INFO: renamed from: ContainerBox-nbWgWpA, reason: not valid java name */
    public final void m2255ContainerBoxnbWgWpA(final boolean z, final boolean z2, final InteractionSource interactionSource, final TextFieldColors textFieldColors, Shape shape, float f, float f2, Composer composer, final int i, final int i2) {
        int i3;
        Shape value;
        float f3;
        float f4;
        final Shape shape2;
        final float f5;
        final float f6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1461761386);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(interactionSource) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(textFieldColors) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                value = shape;
                int i4 = composerStartRestartGroup.changed(value) ? 16384 : 8192;
                i3 |= i4;
            } else {
                value = shape;
            }
            i3 |= i4;
        } else {
            value = shape;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                f3 = f;
                int i5 = composerStartRestartGroup.changed(f3) ? 131072 : 65536;
                i3 |= i5;
            } else {
                f3 = f;
            }
            i3 |= i5;
        } else {
            f3 = f;
        }
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                f4 = f2;
                int i6 = composerStartRestartGroup.changed(f4) ? 1048576 : 524288;
                i3 |= i6;
            } else {
                f4 = f2;
            }
            i3 |= i6;
        } else {
            f4 = f2;
        }
        if ((i2 & 128) != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changed(this) ? 8388608 : 4194304;
        }
        if ((4793491 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 16) != 0) {
                    value = ShapesKt.getValue(OutlinedTextFieldTokens.INSTANCE.getContainerShape(), composerStartRestartGroup, 6);
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    f3 = FocusedBorderThickness;
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    f4 = UnfocusedBorderThickness;
                    i3 &= -3670017;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                }
                if ((i2 & 32) != 0) {
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    i3 &= -3670017;
                }
            }
            Shape shape3 = value;
            float f7 = f3;
            float f8 = f4;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1461761386, i3, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.ContainerBox (TextFieldDefaults.kt:1459)");
            }
            int i7 = i3 & 8190;
            int i8 = i3 >> 3;
            BoxKt.Box(BackgroundKt.m556backgroundbw27NRU(BorderKt.border(Modifier.INSTANCE, (BorderStroke) TextFieldDefaultsKt.m2643animateBorderStrokeAsStateNuRrP5Q(z, z2, interactionSource, textFieldColors, f7, f8, composerStartRestartGroup, (57344 & i8) | i7 | (i8 & 458752)).getValue(), shape3), textFieldColors.containerColor$material3_release(z, z2, interactionSource, composerStartRestartGroup, i7).getValue().m4228unboximpl(), shape3), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shape2 = shape3;
            f5 = f7;
            f6 = f8;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            shape2 = value;
            f5 = f3;
            f6 = f4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$ContainerBox$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i9) {
                    this.$tmp0_rcvr.m2255ContainerBoxnbWgWpA(z, z2, interactionSource, textFieldColors, shape2, f5, f6, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: contentPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m2254contentPaddinga9UjIt4$default(OutlinedTextFieldDefaults outlinedTextFieldDefaults, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 2) != 0) {
            f2 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 4) != 0) {
            f3 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i & 8) != 0) {
            f4 = TextFieldImplKt.getTextFieldPadding();
        }
        return outlinedTextFieldDefaults.m2257contentPaddinga9UjIt4(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: contentPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m2257contentPaddinga9UjIt4(float start, float top, float end, float bottom) {
        return PaddingKt.m998PaddingValuesa9UjIt4(start, top, end, bottom);
    }

    public final TextFieldColors colors(Composer composer, int i) {
        composer.startReplaceableGroup(-471651810);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-471651810, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1492)");
        }
        TextFieldColors defaultOutlinedTextFieldColors = getDefaultOutlinedTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i << 3) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultOutlinedTextFieldColors;
    }

    /* JADX INFO: renamed from: colors-0hiis_0, reason: not valid java name */
    public final TextFieldColors m2256colors0hiis_0(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, TextSelectionColors textSelectionColors, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, Composer composer, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        composer.startReplaceableGroup(1767617725);
        long jM4254getUnspecified0d7_KjU = (i6 & 1) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j;
        long jM4254getUnspecified0d7_KjU2 = (i6 & 2) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j2;
        long jM4254getUnspecified0d7_KjU3 = (i6 & 4) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j3;
        long jM4254getUnspecified0d7_KjU4 = (i6 & 8) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j4;
        long jM4254getUnspecified0d7_KjU5 = (i6 & 16) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j5;
        long jM4254getUnspecified0d7_KjU6 = (i6 & 32) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j6;
        long jM4254getUnspecified0d7_KjU7 = (i6 & 64) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j7;
        long jM4254getUnspecified0d7_KjU8 = (i6 & 128) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j8;
        long jM4254getUnspecified0d7_KjU9 = (i6 & 256) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j9;
        long jM4254getUnspecified0d7_KjU10 = (i6 & 512) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j10;
        TextSelectionColors textSelectionColors2 = (i6 & 1024) != 0 ? null : textSelectionColors;
        long jM4254getUnspecified0d7_KjU11 = (i6 & 2048) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j11;
        long jM4254getUnspecified0d7_KjU12 = (i6 & 4096) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j12;
        long jM4254getUnspecified0d7_KjU13 = (i6 & 8192) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j13;
        long jM4254getUnspecified0d7_KjU14 = (i6 & 16384) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j14;
        long jM4254getUnspecified0d7_KjU15 = (32768 & i6) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j15;
        long jM4254getUnspecified0d7_KjU16 = (65536 & i6) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j16;
        long jM4254getUnspecified0d7_KjU17 = (131072 & i6) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j17;
        long jM4254getUnspecified0d7_KjU18 = (262144 & i6) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j18;
        long jM4254getUnspecified0d7_KjU19 = (524288 & i6) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j19;
        long jM4254getUnspecified0d7_KjU20 = (1048576 & i6) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j20;
        long jM4254getUnspecified0d7_KjU21 = (2097152 & i6) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j21;
        long jM4254getUnspecified0d7_KjU22 = (4194304 & i6) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j22;
        long jM4254getUnspecified0d7_KjU23 = (8388608 & i6) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j23;
        long jM4254getUnspecified0d7_KjU24 = (16777216 & i6) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j24;
        long jM4254getUnspecified0d7_KjU25 = (33554432 & i6) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j25;
        long jM4254getUnspecified0d7_KjU26 = (67108864 & i6) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j26;
        long jM4254getUnspecified0d7_KjU27 = (134217728 & i6) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j27;
        long jM4254getUnspecified0d7_KjU28 = (268435456 & i6) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j28;
        long jM4254getUnspecified0d7_KjU29 = (536870912 & i6) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j29;
        long jM4254getUnspecified0d7_KjU30 = (i6 & BasicMeasure.EXACTLY) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j30;
        long jM4254getUnspecified0d7_KjU31 = (i7 & 1) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j31;
        long jM4254getUnspecified0d7_KjU32 = (i7 & 2) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j32;
        long jM4254getUnspecified0d7_KjU33 = (i7 & 4) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j33;
        long jM4254getUnspecified0d7_KjU34 = (i7 & 8) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j34;
        long jM4254getUnspecified0d7_KjU35 = (i7 & 16) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j35;
        long jM4254getUnspecified0d7_KjU36 = (i7 & 32) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j36;
        long jM4254getUnspecified0d7_KjU37 = (i7 & 64) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j37;
        long jM4254getUnspecified0d7_KjU38 = (i7 & 128) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j38;
        long jM4254getUnspecified0d7_KjU39 = (i7 & 256) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j39;
        long jM4254getUnspecified0d7_KjU40 = (i7 & 512) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j40;
        long jM4254getUnspecified0d7_KjU41 = (i7 & 1024) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j41;
        long jM4254getUnspecified0d7_KjU42 = (i7 & 2048) != 0 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j42;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1767617725, i, i2, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1593)");
        }
        TextFieldColors textFieldColorsM2571copyejIjP34 = getDefaultOutlinedTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i5 >> 6) & 112).m2571copyejIjP34(jM4254getUnspecified0d7_KjU, jM4254getUnspecified0d7_KjU2, jM4254getUnspecified0d7_KjU3, jM4254getUnspecified0d7_KjU4, jM4254getUnspecified0d7_KjU5, jM4254getUnspecified0d7_KjU6, jM4254getUnspecified0d7_KjU7, jM4254getUnspecified0d7_KjU8, jM4254getUnspecified0d7_KjU9, jM4254getUnspecified0d7_KjU10, textSelectionColors2, jM4254getUnspecified0d7_KjU11, jM4254getUnspecified0d7_KjU12, jM4254getUnspecified0d7_KjU13, jM4254getUnspecified0d7_KjU14, jM4254getUnspecified0d7_KjU15, jM4254getUnspecified0d7_KjU16, jM4254getUnspecified0d7_KjU17, jM4254getUnspecified0d7_KjU18, jM4254getUnspecified0d7_KjU19, jM4254getUnspecified0d7_KjU20, jM4254getUnspecified0d7_KjU21, jM4254getUnspecified0d7_KjU22, jM4254getUnspecified0d7_KjU23, jM4254getUnspecified0d7_KjU24, jM4254getUnspecified0d7_KjU25, jM4254getUnspecified0d7_KjU26, jM4254getUnspecified0d7_KjU27, jM4254getUnspecified0d7_KjU28, jM4254getUnspecified0d7_KjU29, jM4254getUnspecified0d7_KjU30, jM4254getUnspecified0d7_KjU31, jM4254getUnspecified0d7_KjU32, jM4254getUnspecified0d7_KjU33, jM4254getUnspecified0d7_KjU34, jM4254getUnspecified0d7_KjU35, jM4254getUnspecified0d7_KjU36, jM4254getUnspecified0d7_KjU37, jM4254getUnspecified0d7_KjU38, jM4254getUnspecified0d7_KjU39, jM4254getUnspecified0d7_KjU40, jM4254getUnspecified0d7_KjU41, jM4254getUnspecified0d7_KjU42);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return textFieldColorsM2571copyejIjP34;
    }

    public final TextFieldColors getDefaultOutlinedTextFieldColors(ColorScheme colorScheme, Composer composer, int i) {
        composer.startReplaceableGroup(-292363577);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-292363577, i, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-defaultOutlinedTextFieldColors> (TextFieldDefaults.kt:1641)");
        }
        TextFieldColors defaultOutlinedTextFieldColorsCached = colorScheme.getDefaultOutlinedTextFieldColorsCached();
        if (defaultOutlinedTextFieldColorsCached == null) {
            defaultOutlinedTextFieldColorsCached = new TextFieldColors(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusInputColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputColor()), Color.m4217copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorInputColor()), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4253getTransparent0d7_KjU(), Color.INSTANCE.m4253getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getCaretColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorFocusCaretColor()), (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusOutlineColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getOutlineColor()), Color.m4217copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledOutlineColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorOutlineColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getLeadingIconColor()), Color.m4217copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getTrailingIconColor()), Color.m4217copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledTrailingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusLabelColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getLabelColor()), Color.m4217copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledLabelColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorLabelColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor()), Color.m4217copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getDisabledInputColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getFocusSupportingColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getSupportingColor()), Color.m4217copywmQWz5c$default(ColorSchemeKt.getValue(OutlinedTextFieldTokens.INSTANCE.getDisabledSupportingColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getErrorSupportingColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), Color.m4217copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), Color.m4217copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, OutlinedTextFieldTokens.INSTANCE.getInputSuffixColor()), null);
            colorScheme.setDefaultOutlinedTextFieldColorsCached$material3_release(defaultOutlinedTextFieldColorsCached);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultOutlinedTextFieldColorsCached;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0130  */
    /* JADX WARN: Code duplicated, block: B:103:0x0136  */
    /* JADX WARN: Code duplicated, block: B:104:0x0139  */
    /* JADX WARN: Code duplicated, block: B:108:0x0141  */
    /* JADX WARN: Code duplicated, block: B:109:0x0146  */
    /* JADX WARN: Code duplicated, block: B:111:0x014c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0152  */
    /* JADX WARN: Code duplicated, block: B:114:0x0155  */
    /* JADX WARN: Code duplicated, block: B:116:0x015a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0160  */
    /* JADX WARN: Code duplicated, block: B:120:0x0163  */
    /* JADX WARN: Code duplicated, block: B:122:0x0169  */
    /* JADX WARN: Code duplicated, block: B:124:0x016f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0172  */
    /* JADX WARN: Code duplicated, block: B:129:0x017c  */
    /* JADX WARN: Code duplicated, block: B:130:0x017f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0183  */
    /* JADX WARN: Code duplicated, block: B:134:0x018b  */
    /* JADX WARN: Code duplicated, block: B:135:0x018e  */
    /* JADX WARN: Code duplicated, block: B:140:0x0199  */
    /* JADX WARN: Code duplicated, block: B:141:0x019c  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:146:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:151:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:153:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:156:0x01c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:158:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:161:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:163:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:166:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:168:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:171:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:172:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:174:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:176:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:177:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:181:0x0207  */
    /* JADX WARN: Code duplicated, block: B:182:0x020a  */
    /* JADX WARN: Code duplicated, block: B:184:0x020e  */
    /* JADX WARN: Code duplicated, block: B:186:0x0214  */
    /* JADX WARN: Code duplicated, block: B:187:0x0217  */
    /* JADX WARN: Code duplicated, block: B:191:0x0225  */
    /* JADX WARN: Code duplicated, block: B:196:0x024f  */
    /* JADX WARN: Code duplicated, block: B:198:0x0256  */
    /* JADX WARN: Code duplicated, block: B:207:0x028a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:208:0x028c  */
    /* JADX WARN: Code duplicated, block: B:209:0x028e  */
    /* JADX WARN: Code duplicated, block: B:212:0x0293  */
    /* JADX WARN: Code duplicated, block: B:213:0x0295  */
    /* JADX WARN: Code duplicated, block: B:215:0x0299  */
    /* JADX WARN: Code duplicated, block: B:216:0x029b  */
    /* JADX WARN: Code duplicated, block: B:218:0x029f  */
    /* JADX WARN: Code duplicated, block: B:219:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:221:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:222:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:224:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:225:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:227:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:228:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:231:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:234:0x02be  */
    /* JADX WARN: Code duplicated, block: B:235:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:238:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:239:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:241:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:242:0x0317  */
    /* JADX WARN: Code duplicated, block: B:246:0x0339  */
    /* JADX WARN: Code duplicated, block: B:249:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:253:0x03de  */
    /* JADX WARN: Code duplicated, block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x008e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0091  */
    /* JADX WARN: Code duplicated, block: B:50:0x0095  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00be  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00df  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:88:0x0107  */
    /* JADX WARN: Code duplicated, block: B:89:0x010c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0112  */
    /* JADX WARN: Code duplicated, block: B:93:0x0118  */
    /* JADX WARN: Code duplicated, block: B:94:0x011b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0125  */
    /* JADX WARN: Code duplicated, block: B:99:0x012a  */
    public final void DecorationBox(final String str, final Function2<? super Composer, ? super Integer, Unit> function2, final boolean z, final boolean z2, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean z3, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, Function2<? super Composer, ? super Integer, Unit> function5, Function2<? super Composer, ? super Integer, Unit> function6, Function2<? super Composer, ? super Integer, Unit> function7, Function2<? super Composer, ? super Integer, Unit> function8, Function2<? super Composer, ? super Integer, Unit> function9, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function10, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        final boolean z4;
        Function2<? super Composer, ? super Integer, Unit> function11;
        Function2<? super Composer, ? super Integer, Unit> function12;
        Function2<? super Composer, ? super Integer, Unit> function13;
        Function2<? super Composer, ? super Integer, Unit> function14;
        Function2<? super Composer, ? super Integer, Unit> function15;
        Function2<? super Composer, ? super Integer, Unit> function16;
        Function2<? super Composer, ? super Integer, Unit> function17;
        final TextFieldColors textFieldColorsColors;
        PaddingValues paddingValuesM2254contentPaddinga9UjIt4$default;
        ComposableLambda composableLambda;
        Function2<? super Composer, ? super Integer, Unit> function18;
        Function2<? super Composer, ? super Integer, Unit> function19;
        Function2<? super Composer, ? super Integer, Unit> function20;
        int i30;
        boolean z5;
        PaddingValues paddingValues2;
        Function2<? super Composer, ? super Integer, Unit> function21;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final TextFieldColors textFieldColors2;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final Function2<? super Composer, ? super Integer, Unit> function25;
        final PaddingValues paddingValues3;
        final Function2<? super Composer, ? super Integer, Unit> function26;
        final Function2<? super Composer, ? super Integer, Unit> function27;
        final Function2<? super Composer, ? super Integer, Unit> function28;
        final Function2<? super Composer, ? super Integer, Unit> function29;
        final boolean z6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i31;
        Composer composerStartRestartGroup = composer.startRestartGroup(-350442135);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) == 0) {
            if ((i & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
            }
            if ((i3 & 4) != 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i4 |= i5;
            }
            if ((i3 & 8) != 0) {
                if ((i & 3072) == 0) {
                    if (composerStartRestartGroup.changed(z2)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                i7 = 8192;
                if ((i3 & 16) != 0) {
                    if ((i & 24576) == 0) {
                        if (composerStartRestartGroup.changed(visualTransformation)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i4 |= i8;
                    }
                    if ((i3 & 32) != 0) {
                        i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                        if (composerStartRestartGroup.changed(interactionSource)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i4 |= i9;
                    }
                    i10 = i3 & 64;
                    if (i10 != 0) {
                        i4 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (composerStartRestartGroup.changed(z3)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i4 |= i11;
                    }
                    i12 = i3 & 128;
                    if (i12 != 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i4 |= i13;
                    }
                    i14 = i3 & 256;
                    if (i14 != 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i15 = 33554432;
                        }
                        i4 |= i15;
                    }
                    i16 = i3 & 512;
                    if (i16 != 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                        i4 |= i17;
                    }
                    i18 = i3 & 1024;
                    if (i18 != 0) {
                        i19 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i20 = 4;
                        } else {
                            i20 = 2;
                        }
                        i19 = i2 | i20;
                    } else {
                        i19 = i2;
                    }
                    i21 = i3 & 2048;
                    if (i21 != 0) {
                        i19 |= 48;
                    } else if ((i2 & 48) == 0) {
                        if (composerStartRestartGroup.changedInstance(function7)) {
                            i22 = 32;
                        } else {
                            i22 = 16;
                        }
                        i19 |= i22;
                    }
                    i23 = i19;
                    i24 = i3 & 4096;
                    if (i24 != 0) {
                        if ((i2 & 384) == 0) {
                            if (composerStartRestartGroup.changedInstance(function8)) {
                                i25 = 256;
                            } else {
                                i25 = 128;
                            }
                            i23 |= i25;
                        }
                        i26 = i3 & 8192;
                        if (i26 != 0) {
                            if ((i2 & 3072) == 0) {
                                i23 |= composerStartRestartGroup.changedInstance(function9) ? 2048 : 1024;
                            }
                            if ((i2 & 24576) != 0) {
                                if ((i3 & 16384) == 0 && composerStartRestartGroup.changed(textFieldColors)) {
                                    i7 = 16384;
                                }
                                i23 |= i7;
                            }
                            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                                if ((i3 & 32768) == 0 || !composerStartRestartGroup.changed(paddingValues)) {
                                    i31 = 65536;
                                } else {
                                    i31 = 131072;
                                }
                                i23 |= i31;
                            }
                            i27 = i3 & 65536;
                            if (i27 != 0) {
                                i23 |= 1572864;
                            } else if ((i2 & 1572864) == 0) {
                                if (composerStartRestartGroup.changedInstance(function10)) {
                                    i28 = 1048576;
                                } else {
                                    i28 = 524288;
                                }
                                i23 |= i28;
                            }
                            if ((i3 & 131072) != 0) {
                                i23 |= 12582912;
                            } else if ((i2 & 12582912) == 0) {
                                if (composerStartRestartGroup.changed(this)) {
                                    i29 = 8388608;
                                } else {
                                    i29 = 4194304;
                                }
                                i23 |= i29;
                            }
                            if ((i4 & 306783379) == 306783378 || (4793491 & i23) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i10 != 0) {
                                        z4 = false;
                                    } else {
                                        z4 = z3;
                                    }
                                    if (i12 != 0) {
                                        function11 = null;
                                    } else {
                                        function11 = function3;
                                    }
                                    if (i14 != 0) {
                                        function12 = null;
                                    } else {
                                        function12 = function4;
                                    }
                                    if (i16 != 0) {
                                        function13 = null;
                                    } else {
                                        function13 = function5;
                                    }
                                    if (i18 != 0) {
                                        function14 = null;
                                    } else {
                                        function14 = function6;
                                    }
                                    if (i21 != 0) {
                                        function15 = null;
                                    } else {
                                        function15 = function7;
                                    }
                                    if (i24 != 0) {
                                        function16 = null;
                                    } else {
                                        function16 = function8;
                                    }
                                    function17 = i26 == 0 ? function9 : null;
                                    if ((i3 & 16384) != 0) {
                                        textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                        i23 &= -57345;
                                    } else {
                                        textFieldColorsColors = textFieldColors;
                                    }
                                    if ((i3 & 32768) != 0) {
                                        paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                        i23 &= -458753;
                                    } else {
                                        paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                                    }
                                    if (i27 != 0) {
                                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                                invoke(composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer2, int i32) {
                                                if ((i32 & 3) != 2 || !composer2.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(-1448570018, i32, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                                    }
                                                    OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                        });
                                    } else {
                                        composableLambda = function10;
                                    }
                                    function18 = function13;
                                    function19 = function14;
                                    function20 = composableLambda;
                                    i30 = i23;
                                    z5 = z4;
                                    paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                                    function21 = function15;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 16384) != 0) {
                                        i23 &= -57345;
                                    }
                                    if ((32768 & i3) != 0) {
                                        i23 &= -458753;
                                    }
                                    z5 = z3;
                                    function11 = function3;
                                    function12 = function4;
                                    function18 = function5;
                                    function19 = function6;
                                    function16 = function8;
                                    function17 = function9;
                                    textFieldColorsColors = textFieldColors;
                                    paddingValues2 = paddingValues;
                                    function20 = function10;
                                    i30 = i23;
                                    function21 = function7;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                                }
                                int i32 = i4 << 3;
                                int i33 = i4 >> 3;
                                int i34 = i4 >> 9;
                                int i35 = i30 << 21;
                                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i32 & 112) | 6 | (i32 & 896) | (i33 & 7168) | (57344 & i34) | (458752 & i34) | (3670016 & i34) | (i35 & 29360128) | (i35 & 234881024) | (i35 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i34 & 7168) | (57344 & i33) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function22 = function19;
                                function23 = function16;
                                textFieldColors2 = textFieldColorsColors;
                                function24 = function12;
                                function25 = function17;
                                paddingValues3 = paddingValues2;
                                function26 = function20;
                                function27 = function18;
                                function28 = function21;
                                function29 = function11;
                                z6 = z5;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                z6 = z3;
                                function29 = function3;
                                function24 = function4;
                                function27 = function5;
                                function22 = function6;
                                function28 = function7;
                                function23 = function8;
                                function25 = function9;
                                textFieldColors2 = textFieldColors;
                                paddingValues3 = paddingValues;
                                function26 = function10;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                                    public final void invoke(Composer composer2, int i36) {
                                        OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                    }
                                });
                            }
                        }
                        i23 |= 3072;
                        if ((i2 & 24576) != 0) {
                            if ((i3 & 16384) == 0) {
                                i7 = 16384;
                            }
                            i23 |= i7;
                        }
                        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                            if ((i3 & 32768) == 0) {
                                i31 = 65536;
                            } else {
                                i31 = 65536;
                            }
                            i23 |= i31;
                        }
                        i27 = i3 & 65536;
                        if (i27 != 0) {
                            i23 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            if (composerStartRestartGroup.changedInstance(function10)) {
                                i28 = 1048576;
                            } else {
                                i28 = 524288;
                            }
                            i23 |= i28;
                        }
                        if ((i3 & 131072) != 0) {
                            i23 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            if (composerStartRestartGroup.changed(this)) {
                                i29 = 8388608;
                            } else {
                                i29 = 4194304;
                            }
                            i23 |= i29;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i10 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z3;
                                }
                                if (i12 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i14 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i16 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i18 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i21 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i24 != 0) {
                                    function16 = null;
                                } else {
                                    function16 = function8;
                                }
                                if (i26 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                    i23 &= -57345;
                                } else {
                                    textFieldColorsColors = textFieldColors;
                                }
                                if ((i3 & 32768) != 0) {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i23 &= -458753;
                                } else {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i27 != 0) {
                                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i36) {
                                            if ((i36 & 3) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1448570018, i36, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                                }
                                                OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                    });
                                } else {
                                    composableLambda = function10;
                                }
                                function18 = function13;
                                function19 = function14;
                                function20 = composableLambda;
                                i30 = i23;
                                z5 = z4;
                                paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                                function21 = function15;
                            } else {
                                if (i10 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z3;
                                }
                                if (i12 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i14 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i16 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i18 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i21 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i24 != 0) {
                                    function16 = null;
                                } else {
                                    function16 = function8;
                                }
                                if (i26 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                    i23 &= -57345;
                                } else {
                                    textFieldColorsColors = textFieldColors;
                                }
                                if ((i3 & 32768) != 0) {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i23 &= -458753;
                                } else {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i27 != 0) {
                                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i36) {
                                            if ((i36 & 3) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1448570018, i36, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                                }
                                                OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                    });
                                } else {
                                    composableLambda = function10;
                                }
                                function18 = function13;
                                function19 = function14;
                                function20 = composableLambda;
                                i30 = i23;
                                z5 = z4;
                                paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                                function21 = function15;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                            }
                            int i36 = i4 << 3;
                            int i37 = i4 >> 3;
                            int i38 = i4 >> 9;
                            int i39 = i30 << 21;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i36 & 112) | 6 | (i36 & 896) | (i37 & 7168) | (57344 & i38) | (458752 & i38) | (3670016 & i38) | (i39 & 29360128) | (i39 & 234881024) | (i39 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i38 & 7168) | (57344 & i37) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function22 = function19;
                            function23 = function16;
                            textFieldColors2 = textFieldColorsColors;
                            function24 = function12;
                            function25 = function17;
                            paddingValues3 = paddingValues2;
                            function26 = function20;
                            function27 = function18;
                            function28 = function21;
                            function29 = function11;
                            z6 = z5;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i10 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z3;
                                }
                                if (i12 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i14 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i16 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i18 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i21 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i24 != 0) {
                                    function16 = null;
                                } else {
                                    function16 = function8;
                                }
                                if (i26 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                    i23 &= -57345;
                                } else {
                                    textFieldColorsColors = textFieldColors;
                                }
                                if ((i3 & 32768) != 0) {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i23 &= -458753;
                                } else {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i27 != 0) {
                                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i310) {
                                            if ((i310 & 3) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1448570018, i310, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                                }
                                                OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                    });
                                } else {
                                    composableLambda = function10;
                                }
                                function18 = function13;
                                function19 = function14;
                                function20 = composableLambda;
                                i30 = i23;
                                z5 = z4;
                                paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                                function21 = function15;
                            } else {
                                if (i10 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z3;
                                }
                                if (i12 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i14 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i16 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i18 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i21 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i24 != 0) {
                                    function16 = null;
                                } else {
                                    function16 = function8;
                                }
                                if (i26 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                    i23 &= -57345;
                                } else {
                                    textFieldColorsColors = textFieldColors;
                                }
                                if ((i3 & 32768) != 0) {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i23 &= -458753;
                                } else {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i27 != 0) {
                                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i310) {
                                            if ((i310 & 3) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1448570018, i310, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                                }
                                                OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                    });
                                } else {
                                    composableLambda = function10;
                                }
                                function18 = function13;
                                function19 = function14;
                                function20 = composableLambda;
                                i30 = i23;
                                z5 = z4;
                                paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                                function21 = function15;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                            }
                            int i310 = i4 << 3;
                            int i311 = i4 >> 3;
                            int i312 = i4 >> 9;
                            int i313 = i30 << 21;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i310 & 112) | 6 | (i310 & 896) | (i311 & 7168) | (57344 & i312) | (458752 & i312) | (3670016 & i312) | (i313 & 29360128) | (i313 & 234881024) | (i313 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i312 & 7168) | (57344 & i311) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function22 = function19;
                            function23 = function16;
                            textFieldColors2 = textFieldColorsColors;
                            function24 = function12;
                            function25 = function17;
                            paddingValues3 = paddingValues2;
                            function26 = function20;
                            function27 = function18;
                            function28 = function21;
                            function29 = function11;
                            z6 = z5;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                                public final void invoke(Composer composer2, int i314) {
                                    OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                }
                            });
                        }
                    }
                    i23 |= 384;
                    i26 = i3 & 8192;
                    if (i26 != 0) {
                        if ((i2 & 3072) == 0) {
                            i23 |= composerStartRestartGroup.changedInstance(function9) ? 2048 : 1024;
                        }
                        if ((i2 & 24576) != 0) {
                            if ((i3 & 16384) == 0) {
                                i7 = 16384;
                            }
                            i23 |= i7;
                        }
                        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                            if ((i3 & 32768) == 0) {
                                i31 = 65536;
                            } else {
                                i31 = 65536;
                            }
                            i23 |= i31;
                        }
                        i27 = i3 & 65536;
                        if (i27 != 0) {
                            i23 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            if (composerStartRestartGroup.changedInstance(function10)) {
                                i28 = 1048576;
                            } else {
                                i28 = 524288;
                            }
                            i23 |= i28;
                        }
                        if ((i3 & 131072) != 0) {
                            i23 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            if (composerStartRestartGroup.changed(this)) {
                                i29 = 8388608;
                            } else {
                                i29 = 4194304;
                            }
                            i23 |= i29;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i10 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z3;
                                }
                                if (i12 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i14 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i16 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i18 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i21 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i24 != 0) {
                                    function16 = null;
                                } else {
                                    function16 = function8;
                                }
                                if (i26 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                    i23 &= -57345;
                                } else {
                                    textFieldColorsColors = textFieldColors;
                                }
                                if ((i3 & 32768) != 0) {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i23 &= -458753;
                                } else {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i27 != 0) {
                                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i314) {
                                            if ((i314 & 3) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1448570018, i314, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                                }
                                                OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                    });
                                } else {
                                    composableLambda = function10;
                                }
                                function18 = function13;
                                function19 = function14;
                                function20 = composableLambda;
                                i30 = i23;
                                z5 = z4;
                                paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                                function21 = function15;
                            } else {
                                if (i10 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z3;
                                }
                                if (i12 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i14 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i16 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i18 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i21 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i24 != 0) {
                                    function16 = null;
                                } else {
                                    function16 = function8;
                                }
                                if (i26 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                    i23 &= -57345;
                                } else {
                                    textFieldColorsColors = textFieldColors;
                                }
                                if ((i3 & 32768) != 0) {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i23 &= -458753;
                                } else {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i27 != 0) {
                                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i314) {
                                            if ((i314 & 3) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1448570018, i314, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                                }
                                                OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                    });
                                } else {
                                    composableLambda = function10;
                                }
                                function18 = function13;
                                function19 = function14;
                                function20 = composableLambda;
                                i30 = i23;
                                z5 = z4;
                                paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                                function21 = function15;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                            }
                            int i314 = i4 << 3;
                            int i315 = i4 >> 3;
                            int i316 = i4 >> 9;
                            int i317 = i30 << 21;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i314 & 112) | 6 | (i314 & 896) | (i315 & 7168) | (57344 & i316) | (458752 & i316) | (3670016 & i316) | (i317 & 29360128) | (i317 & 234881024) | (i317 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i316 & 7168) | (57344 & i315) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function22 = function19;
                            function23 = function16;
                            textFieldColors2 = textFieldColorsColors;
                            function24 = function12;
                            function25 = function17;
                            paddingValues3 = paddingValues2;
                            function26 = function20;
                            function27 = function18;
                            function28 = function21;
                            function29 = function11;
                            z6 = z5;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i10 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z3;
                                }
                                if (i12 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i14 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i16 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i18 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i21 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i24 != 0) {
                                    function16 = null;
                                } else {
                                    function16 = function8;
                                }
                                if (i26 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                    i23 &= -57345;
                                } else {
                                    textFieldColorsColors = textFieldColors;
                                }
                                if ((i3 & 32768) != 0) {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i23 &= -458753;
                                } else {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i27 != 0) {
                                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i318) {
                                            if ((i318 & 3) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1448570018, i318, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                                }
                                                OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                    });
                                } else {
                                    composableLambda = function10;
                                }
                                function18 = function13;
                                function19 = function14;
                                function20 = composableLambda;
                                i30 = i23;
                                z5 = z4;
                                paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                                function21 = function15;
                            } else {
                                if (i10 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z3;
                                }
                                if (i12 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i14 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i16 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i18 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i21 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i24 != 0) {
                                    function16 = null;
                                } else {
                                    function16 = function8;
                                }
                                if (i26 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                    i23 &= -57345;
                                } else {
                                    textFieldColorsColors = textFieldColors;
                                }
                                if ((i3 & 32768) != 0) {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i23 &= -458753;
                                } else {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i27 != 0) {
                                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i318) {
                                            if ((i318 & 3) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1448570018, i318, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                                }
                                                OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                    });
                                } else {
                                    composableLambda = function10;
                                }
                                function18 = function13;
                                function19 = function14;
                                function20 = composableLambda;
                                i30 = i23;
                                z5 = z4;
                                paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                                function21 = function15;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                            }
                            int i318 = i4 << 3;
                            int i319 = i4 >> 3;
                            int i3110 = i4 >> 9;
                            int i3111 = i30 << 21;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i318 & 112) | 6 | (i318 & 896) | (i319 & 7168) | (57344 & i3110) | (458752 & i3110) | (3670016 & i3110) | (i3111 & 29360128) | (i3111 & 234881024) | (i3111 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i3110 & 7168) | (57344 & i319) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function22 = function19;
                            function23 = function16;
                            textFieldColors2 = textFieldColorsColors;
                            function24 = function12;
                            function25 = function17;
                            paddingValues3 = paddingValues2;
                            function26 = function20;
                            function27 = function18;
                            function28 = function21;
                            function29 = function11;
                            z6 = z5;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                                public final void invoke(Composer composer2, int i3112) {
                                    OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                }
                            });
                        }
                    }
                    i23 |= 3072;
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i7 = 16384;
                        }
                        i23 |= i7;
                    }
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                        if ((i3 & 32768) == 0) {
                            i31 = 65536;
                        } else {
                            i31 = 65536;
                        }
                        i23 |= i31;
                    }
                    i27 = i3 & 65536;
                    if (i27 != 0) {
                        i23 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (composerStartRestartGroup.changedInstance(function10)) {
                            i28 = 1048576;
                        } else {
                            i28 = 524288;
                        }
                        i23 |= i28;
                    }
                    if ((i3 & 131072) != 0) {
                        i23 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(this)) {
                            i29 = 8388608;
                        } else {
                            i29 = 4194304;
                        }
                        i23 |= i29;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i3112) {
                                        if ((i3112 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i3112, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        } else {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i3112) {
                                        if ((i3112 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i3112, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                        }
                        int i3112 = i4 << 3;
                        int i3113 = i4 >> 3;
                        int i3114 = i4 >> 9;
                        int i3115 = i30 << 21;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i3112 & 112) | 6 | (i3112 & 896) | (i3113 & 7168) | (57344 & i3114) | (458752 & i3114) | (3670016 & i3114) | (i3115 & 29360128) | (i3115 & 234881024) | (i3115 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i3114 & 7168) | (57344 & i3113) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function22 = function19;
                        function23 = function16;
                        textFieldColors2 = textFieldColorsColors;
                        function24 = function12;
                        function25 = function17;
                        paddingValues3 = paddingValues2;
                        function26 = function20;
                        function27 = function18;
                        function28 = function21;
                        function29 = function11;
                        z6 = z5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i3116) {
                                        if ((i3116 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i3116, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        } else {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i3116) {
                                        if ((i3116 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i3116, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                        }
                        int i3116 = i4 << 3;
                        int i3117 = i4 >> 3;
                        int i3118 = i4 >> 9;
                        int i3119 = i30 << 21;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i3116 & 112) | 6 | (i3116 & 896) | (i3117 & 7168) | (57344 & i3118) | (458752 & i3118) | (3670016 & i3118) | (i3119 & 29360128) | (i3119 & 234881024) | (i3119 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i3118 & 7168) | (57344 & i3117) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function22 = function19;
                        function23 = function16;
                        textFieldColors2 = textFieldColorsColors;
                        function24 = function12;
                        function25 = function17;
                        paddingValues3 = paddingValues2;
                        function26 = function20;
                        function27 = function18;
                        function28 = function21;
                        function29 = function11;
                        z6 = z5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                            public final void invoke(Composer composer2, int i31110) {
                                OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                    }
                }
                i4 |= 24576;
                if ((i3 & 32) != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(interactionSource)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changed(z3)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i4 |= i13;
                }
                i14 = i3 & 256;
                if (i14 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i15 = 33554432;
                    }
                    i4 |= i15;
                }
                i16 = i3 & 512;
                if (i16 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                    i4 |= i17;
                }
                i18 = i3 & 1024;
                if (i18 != 0) {
                    i19 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                    i19 = i2 | i20;
                } else {
                    i19 = i2;
                }
                i21 = i3 & 2048;
                if (i21 != 0) {
                    i19 |= 48;
                } else if ((i2 & 48) == 0) {
                    if (composerStartRestartGroup.changedInstance(function7)) {
                        i22 = 32;
                    } else {
                        i22 = 16;
                    }
                    i19 |= i22;
                }
                i23 = i19;
                i24 = i3 & 4096;
                if (i24 != 0) {
                    if ((i2 & 384) == 0) {
                        if (composerStartRestartGroup.changedInstance(function8)) {
                            i25 = 256;
                        } else {
                            i25 = 128;
                        }
                        i23 |= i25;
                    }
                    i26 = i3 & 8192;
                    if (i26 != 0) {
                        if ((i2 & 3072) == 0) {
                            i23 |= composerStartRestartGroup.changedInstance(function9) ? 2048 : 1024;
                        }
                        if ((i2 & 24576) != 0) {
                            if ((i3 & 16384) == 0) {
                                i7 = 16384;
                            }
                            i23 |= i7;
                        }
                        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                            if ((i3 & 32768) == 0) {
                                i31 = 65536;
                            } else {
                                i31 = 65536;
                            }
                            i23 |= i31;
                        }
                        i27 = i3 & 65536;
                        if (i27 != 0) {
                            i23 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            if (composerStartRestartGroup.changedInstance(function10)) {
                                i28 = 1048576;
                            } else {
                                i28 = 524288;
                            }
                            i23 |= i28;
                        }
                        if ((i3 & 131072) != 0) {
                            i23 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            if (composerStartRestartGroup.changed(this)) {
                                i29 = 8388608;
                            } else {
                                i29 = 4194304;
                            }
                            i23 |= i29;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i10 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z3;
                                }
                                if (i12 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i14 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i16 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i18 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i21 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i24 != 0) {
                                    function16 = null;
                                } else {
                                    function16 = function8;
                                }
                                if (i26 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                    i23 &= -57345;
                                } else {
                                    textFieldColorsColors = textFieldColors;
                                }
                                if ((i3 & 32768) != 0) {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i23 &= -458753;
                                } else {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i27 != 0) {
                                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i31110) {
                                            if ((i31110 & 3) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1448570018, i31110, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                                }
                                                OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                    });
                                } else {
                                    composableLambda = function10;
                                }
                                function18 = function13;
                                function19 = function14;
                                function20 = composableLambda;
                                i30 = i23;
                                z5 = z4;
                                paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                                function21 = function15;
                            } else {
                                if (i10 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z3;
                                }
                                if (i12 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i14 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i16 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i18 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i21 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i24 != 0) {
                                    function16 = null;
                                } else {
                                    function16 = function8;
                                }
                                if (i26 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                    i23 &= -57345;
                                } else {
                                    textFieldColorsColors = textFieldColors;
                                }
                                if ((i3 & 32768) != 0) {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i23 &= -458753;
                                } else {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i27 != 0) {
                                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i31110) {
                                            if ((i31110 & 3) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1448570018, i31110, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                                }
                                                OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                    });
                                } else {
                                    composableLambda = function10;
                                }
                                function18 = function13;
                                function19 = function14;
                                function20 = composableLambda;
                                i30 = i23;
                                z5 = z4;
                                paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                                function21 = function15;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                            }
                            int i31110 = i4 << 3;
                            int i31111 = i4 >> 3;
                            int i31112 = i4 >> 9;
                            int i31113 = i30 << 21;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i31110 & 112) | 6 | (i31110 & 896) | (i31111 & 7168) | (57344 & i31112) | (458752 & i31112) | (3670016 & i31112) | (i31113 & 29360128) | (i31113 & 234881024) | (i31113 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i31112 & 7168) | (57344 & i31111) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function22 = function19;
                            function23 = function16;
                            textFieldColors2 = textFieldColorsColors;
                            function24 = function12;
                            function25 = function17;
                            paddingValues3 = paddingValues2;
                            function26 = function20;
                            function27 = function18;
                            function28 = function21;
                            function29 = function11;
                            z6 = z5;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i10 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z3;
                                }
                                if (i12 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i14 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i16 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i18 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i21 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i24 != 0) {
                                    function16 = null;
                                } else {
                                    function16 = function8;
                                }
                                if (i26 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                    i23 &= -57345;
                                } else {
                                    textFieldColorsColors = textFieldColors;
                                }
                                if ((i3 & 32768) != 0) {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i23 &= -458753;
                                } else {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i27 != 0) {
                                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i31114) {
                                            if ((i31114 & 3) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1448570018, i31114, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                                }
                                                OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                    });
                                } else {
                                    composableLambda = function10;
                                }
                                function18 = function13;
                                function19 = function14;
                                function20 = composableLambda;
                                i30 = i23;
                                z5 = z4;
                                paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                                function21 = function15;
                            } else {
                                if (i10 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z3;
                                }
                                if (i12 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i14 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i16 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i18 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i21 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i24 != 0) {
                                    function16 = null;
                                } else {
                                    function16 = function8;
                                }
                                if (i26 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                    i23 &= -57345;
                                } else {
                                    textFieldColorsColors = textFieldColors;
                                }
                                if ((i3 & 32768) != 0) {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i23 &= -458753;
                                } else {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i27 != 0) {
                                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i31114) {
                                            if ((i31114 & 3) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1448570018, i31114, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                                }
                                                OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                    });
                                } else {
                                    composableLambda = function10;
                                }
                                function18 = function13;
                                function19 = function14;
                                function20 = composableLambda;
                                i30 = i23;
                                z5 = z4;
                                paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                                function21 = function15;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                            }
                            int i31114 = i4 << 3;
                            int i31115 = i4 >> 3;
                            int i31116 = i4 >> 9;
                            int i31117 = i30 << 21;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i31114 & 112) | 6 | (i31114 & 896) | (i31115 & 7168) | (57344 & i31116) | (458752 & i31116) | (3670016 & i31116) | (i31117 & 29360128) | (i31117 & 234881024) | (i31117 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i31116 & 7168) | (57344 & i31115) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function22 = function19;
                            function23 = function16;
                            textFieldColors2 = textFieldColorsColors;
                            function24 = function12;
                            function25 = function17;
                            paddingValues3 = paddingValues2;
                            function26 = function20;
                            function27 = function18;
                            function28 = function21;
                            function29 = function11;
                            z6 = z5;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                                public final void invoke(Composer composer2, int i31118) {
                                    OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                }
                            });
                        }
                    }
                    i23 |= 3072;
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i7 = 16384;
                        }
                        i23 |= i7;
                    }
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                        if ((i3 & 32768) == 0) {
                            i31 = 65536;
                        } else {
                            i31 = 65536;
                        }
                        i23 |= i31;
                    }
                    i27 = i3 & 65536;
                    if (i27 != 0) {
                        i23 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (composerStartRestartGroup.changedInstance(function10)) {
                            i28 = 1048576;
                        } else {
                            i28 = 524288;
                        }
                        i23 |= i28;
                    }
                    if ((i3 & 131072) != 0) {
                        i23 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(this)) {
                            i29 = 8388608;
                        } else {
                            i29 = 4194304;
                        }
                        i23 |= i29;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i31118) {
                                        if ((i31118 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i31118, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        } else {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i31118) {
                                        if ((i31118 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i31118, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                        }
                        int i31118 = i4 << 3;
                        int i31119 = i4 >> 3;
                        int i311110 = i4 >> 9;
                        int i311111 = i30 << 21;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i31118 & 112) | 6 | (i31118 & 896) | (i31119 & 7168) | (57344 & i311110) | (458752 & i311110) | (3670016 & i311110) | (i311111 & 29360128) | (i311111 & 234881024) | (i311111 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i311110 & 7168) | (57344 & i31119) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function22 = function19;
                        function23 = function16;
                        textFieldColors2 = textFieldColorsColors;
                        function24 = function12;
                        function25 = function17;
                        paddingValues3 = paddingValues2;
                        function26 = function20;
                        function27 = function18;
                        function28 = function21;
                        function29 = function11;
                        z6 = z5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i311112) {
                                        if ((i311112 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i311112, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        } else {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i311112) {
                                        if ((i311112 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i311112, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                        }
                        int i311112 = i4 << 3;
                        int i311113 = i4 >> 3;
                        int i311114 = i4 >> 9;
                        int i311115 = i30 << 21;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i311112 & 112) | 6 | (i311112 & 896) | (i311113 & 7168) | (57344 & i311114) | (458752 & i311114) | (3670016 & i311114) | (i311115 & 29360128) | (i311115 & 234881024) | (i311115 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i311114 & 7168) | (57344 & i311113) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function22 = function19;
                        function23 = function16;
                        textFieldColors2 = textFieldColorsColors;
                        function24 = function12;
                        function25 = function17;
                        paddingValues3 = paddingValues2;
                        function26 = function20;
                        function27 = function18;
                        function28 = function21;
                        function29 = function11;
                        z6 = z5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                            public final void invoke(Composer composer2, int i311116) {
                                OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                    }
                }
                i23 |= 384;
                i26 = i3 & 8192;
                if (i26 != 0) {
                    if ((i2 & 3072) == 0) {
                        i23 |= composerStartRestartGroup.changedInstance(function9) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i7 = 16384;
                        }
                        i23 |= i7;
                    }
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                        if ((i3 & 32768) == 0) {
                            i31 = 65536;
                        } else {
                            i31 = 65536;
                        }
                        i23 |= i31;
                    }
                    i27 = i3 & 65536;
                    if (i27 != 0) {
                        i23 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (composerStartRestartGroup.changedInstance(function10)) {
                            i28 = 1048576;
                        } else {
                            i28 = 524288;
                        }
                        i23 |= i28;
                    }
                    if ((i3 & 131072) != 0) {
                        i23 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(this)) {
                            i29 = 8388608;
                        } else {
                            i29 = 4194304;
                        }
                        i23 |= i29;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i311116) {
                                        if ((i311116 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i311116, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        } else {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i311116) {
                                        if ((i311116 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i311116, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                        }
                        int i311116 = i4 << 3;
                        int i311117 = i4 >> 3;
                        int i311118 = i4 >> 9;
                        int i311119 = i30 << 21;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i311116 & 112) | 6 | (i311116 & 896) | (i311117 & 7168) | (57344 & i311118) | (458752 & i311118) | (3670016 & i311118) | (i311119 & 29360128) | (i311119 & 234881024) | (i311119 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i311118 & 7168) | (57344 & i311117) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function22 = function19;
                        function23 = function16;
                        textFieldColors2 = textFieldColorsColors;
                        function24 = function12;
                        function25 = function17;
                        paddingValues3 = paddingValues2;
                        function26 = function20;
                        function27 = function18;
                        function28 = function21;
                        function29 = function11;
                        z6 = z5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i3111110) {
                                        if ((i3111110 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i3111110, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        } else {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i3111110) {
                                        if ((i3111110 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i3111110, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                        }
                        int i3111110 = i4 << 3;
                        int i3111111 = i4 >> 3;
                        int i3111112 = i4 >> 9;
                        int i3111113 = i30 << 21;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i3111110 & 112) | 6 | (i3111110 & 896) | (i3111111 & 7168) | (57344 & i3111112) | (458752 & i3111112) | (3670016 & i3111112) | (i3111113 & 29360128) | (i3111113 & 234881024) | (i3111113 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i3111112 & 7168) | (57344 & i3111111) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function22 = function19;
                        function23 = function16;
                        textFieldColors2 = textFieldColorsColors;
                        function24 = function12;
                        function25 = function17;
                        paddingValues3 = paddingValues2;
                        function26 = function20;
                        function27 = function18;
                        function28 = function21;
                        function29 = function11;
                        z6 = z5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                            public final void invoke(Composer composer2, int i3111114) {
                                OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                    }
                }
                i23 |= 3072;
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i7 = 16384;
                    }
                    i23 |= i7;
                }
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                    if ((i3 & 32768) == 0) {
                        i31 = 65536;
                    } else {
                        i31 = 65536;
                    }
                    i23 |= i31;
                }
                i27 = i3 & 65536;
                if (i27 != 0) {
                    i23 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (composerStartRestartGroup.changedInstance(function10)) {
                        i28 = 1048576;
                    } else {
                        i28 = 524288;
                    }
                    i23 |= i28;
                }
                if ((i3 & 131072) != 0) {
                    i23 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(this)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i23 |= i29;
                }
                if ((i4 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i3111114) {
                                    if ((i3111114 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i3111114, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    } else {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i3111114) {
                                    if ((i3111114 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i3111114, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                    }
                    int i3111114 = i4 << 3;
                    int i3111115 = i4 >> 3;
                    int i3111116 = i4 >> 9;
                    int i3111117 = i30 << 21;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i3111114 & 112) | 6 | (i3111114 & 896) | (i3111115 & 7168) | (57344 & i3111116) | (458752 & i3111116) | (3670016 & i3111116) | (i3111117 & 29360128) | (i3111117 & 234881024) | (i3111117 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i3111116 & 7168) | (57344 & i3111115) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function22 = function19;
                    function23 = function16;
                    textFieldColors2 = textFieldColorsColors;
                    function24 = function12;
                    function25 = function17;
                    paddingValues3 = paddingValues2;
                    function26 = function20;
                    function27 = function18;
                    function28 = function21;
                    function29 = function11;
                    z6 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i3111118) {
                                    if ((i3111118 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i3111118, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    } else {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i3111118) {
                                    if ((i3111118 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i3111118, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                    }
                    int i3111118 = i4 << 3;
                    int i3111119 = i4 >> 3;
                    int i31111110 = i4 >> 9;
                    int i31111111 = i30 << 21;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i3111118 & 112) | 6 | (i3111118 & 896) | (i3111119 & 7168) | (57344 & i31111110) | (458752 & i31111110) | (3670016 & i31111110) | (i31111111 & 29360128) | (i31111111 & 234881024) | (i31111111 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i31111110 & 7168) | (57344 & i3111119) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function22 = function19;
                    function23 = function16;
                    textFieldColors2 = textFieldColorsColors;
                    function24 = function12;
                    function25 = function17;
                    paddingValues3 = paddingValues2;
                    function26 = function20;
                    function27 = function18;
                    function28 = function21;
                    function29 = function11;
                    z6 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                        public final void invoke(Composer composer2, int i31111112) {
                            OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
            }
            i4 |= 3072;
            i7 = 8192;
            if ((i3 & 16) != 0) {
                if ((i & 24576) == 0) {
                    if (composerStartRestartGroup.changed(visualTransformation)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((i3 & 32) != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(interactionSource)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changed(z3)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i4 |= i13;
                }
                i14 = i3 & 256;
                if (i14 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i15 = 33554432;
                    }
                    i4 |= i15;
                }
                i16 = i3 & 512;
                if (i16 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                    i4 |= i17;
                }
                i18 = i3 & 1024;
                if (i18 != 0) {
                    i19 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                    i19 = i2 | i20;
                } else {
                    i19 = i2;
                }
                i21 = i3 & 2048;
                if (i21 != 0) {
                    i19 |= 48;
                } else if ((i2 & 48) == 0) {
                    if (composerStartRestartGroup.changedInstance(function7)) {
                        i22 = 32;
                    } else {
                        i22 = 16;
                    }
                    i19 |= i22;
                }
                i23 = i19;
                i24 = i3 & 4096;
                if (i24 != 0) {
                    if ((i2 & 384) == 0) {
                        if (composerStartRestartGroup.changedInstance(function8)) {
                            i25 = 256;
                        } else {
                            i25 = 128;
                        }
                        i23 |= i25;
                    }
                    i26 = i3 & 8192;
                    if (i26 != 0) {
                        if ((i2 & 3072) == 0) {
                            i23 |= composerStartRestartGroup.changedInstance(function9) ? 2048 : 1024;
                        }
                        if ((i2 & 24576) != 0) {
                            if ((i3 & 16384) == 0) {
                                i7 = 16384;
                            }
                            i23 |= i7;
                        }
                        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                            if ((i3 & 32768) == 0) {
                                i31 = 65536;
                            } else {
                                i31 = 65536;
                            }
                            i23 |= i31;
                        }
                        i27 = i3 & 65536;
                        if (i27 != 0) {
                            i23 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            if (composerStartRestartGroup.changedInstance(function10)) {
                                i28 = 1048576;
                            } else {
                                i28 = 524288;
                            }
                            i23 |= i28;
                        }
                        if ((i3 & 131072) != 0) {
                            i23 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            if (composerStartRestartGroup.changed(this)) {
                                i29 = 8388608;
                            } else {
                                i29 = 4194304;
                            }
                            i23 |= i29;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i10 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z3;
                                }
                                if (i12 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i14 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i16 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i18 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i21 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i24 != 0) {
                                    function16 = null;
                                } else {
                                    function16 = function8;
                                }
                                if (i26 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                    i23 &= -57345;
                                } else {
                                    textFieldColorsColors = textFieldColors;
                                }
                                if ((i3 & 32768) != 0) {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i23 &= -458753;
                                } else {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i27 != 0) {
                                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i31111112) {
                                            if ((i31111112 & 3) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1448570018, i31111112, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                                }
                                                OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                    });
                                } else {
                                    composableLambda = function10;
                                }
                                function18 = function13;
                                function19 = function14;
                                function20 = composableLambda;
                                i30 = i23;
                                z5 = z4;
                                paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                                function21 = function15;
                            } else {
                                if (i10 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z3;
                                }
                                if (i12 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i14 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i16 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i18 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i21 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i24 != 0) {
                                    function16 = null;
                                } else {
                                    function16 = function8;
                                }
                                if (i26 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                    i23 &= -57345;
                                } else {
                                    textFieldColorsColors = textFieldColors;
                                }
                                if ((i3 & 32768) != 0) {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i23 &= -458753;
                                } else {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i27 != 0) {
                                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i31111112) {
                                            if ((i31111112 & 3) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1448570018, i31111112, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                                }
                                                OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                    });
                                } else {
                                    composableLambda = function10;
                                }
                                function18 = function13;
                                function19 = function14;
                                function20 = composableLambda;
                                i30 = i23;
                                z5 = z4;
                                paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                                function21 = function15;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                            }
                            int i31111112 = i4 << 3;
                            int i31111113 = i4 >> 3;
                            int i31111114 = i4 >> 9;
                            int i31111115 = i30 << 21;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i31111112 & 112) | 6 | (i31111112 & 896) | (i31111113 & 7168) | (57344 & i31111114) | (458752 & i31111114) | (3670016 & i31111114) | (i31111115 & 29360128) | (i31111115 & 234881024) | (i31111115 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i31111114 & 7168) | (57344 & i31111113) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function22 = function19;
                            function23 = function16;
                            textFieldColors2 = textFieldColorsColors;
                            function24 = function12;
                            function25 = function17;
                            paddingValues3 = paddingValues2;
                            function26 = function20;
                            function27 = function18;
                            function28 = function21;
                            function29 = function11;
                            z6 = z5;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i10 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z3;
                                }
                                if (i12 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i14 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i16 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i18 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i21 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i24 != 0) {
                                    function16 = null;
                                } else {
                                    function16 = function8;
                                }
                                if (i26 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                    i23 &= -57345;
                                } else {
                                    textFieldColorsColors = textFieldColors;
                                }
                                if ((i3 & 32768) != 0) {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i23 &= -458753;
                                } else {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i27 != 0) {
                                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i31111116) {
                                            if ((i31111116 & 3) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1448570018, i31111116, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                                }
                                                OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                    });
                                } else {
                                    composableLambda = function10;
                                }
                                function18 = function13;
                                function19 = function14;
                                function20 = composableLambda;
                                i30 = i23;
                                z5 = z4;
                                paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                                function21 = function15;
                            } else {
                                if (i10 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z3;
                                }
                                if (i12 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i14 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i16 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i18 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i21 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i24 != 0) {
                                    function16 = null;
                                } else {
                                    function16 = function8;
                                }
                                if (i26 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                    i23 &= -57345;
                                } else {
                                    textFieldColorsColors = textFieldColors;
                                }
                                if ((i3 & 32768) != 0) {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i23 &= -458753;
                                } else {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i27 != 0) {
                                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i31111116) {
                                            if ((i31111116 & 3) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1448570018, i31111116, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                                }
                                                OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                    });
                                } else {
                                    composableLambda = function10;
                                }
                                function18 = function13;
                                function19 = function14;
                                function20 = composableLambda;
                                i30 = i23;
                                z5 = z4;
                                paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                                function21 = function15;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                            }
                            int i31111116 = i4 << 3;
                            int i31111117 = i4 >> 3;
                            int i31111118 = i4 >> 9;
                            int i31111119 = i30 << 21;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i31111116 & 112) | 6 | (i31111116 & 896) | (i31111117 & 7168) | (57344 & i31111118) | (458752 & i31111118) | (3670016 & i31111118) | (i31111119 & 29360128) | (i31111119 & 234881024) | (i31111119 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i31111118 & 7168) | (57344 & i31111117) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function22 = function19;
                            function23 = function16;
                            textFieldColors2 = textFieldColorsColors;
                            function24 = function12;
                            function25 = function17;
                            paddingValues3 = paddingValues2;
                            function26 = function20;
                            function27 = function18;
                            function28 = function21;
                            function29 = function11;
                            z6 = z5;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                                public final void invoke(Composer composer2, int i311111110) {
                                    OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                }
                            });
                        }
                    }
                    i23 |= 3072;
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i7 = 16384;
                        }
                        i23 |= i7;
                    }
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                        if ((i3 & 32768) == 0) {
                            i31 = 65536;
                        } else {
                            i31 = 65536;
                        }
                        i23 |= i31;
                    }
                    i27 = i3 & 65536;
                    if (i27 != 0) {
                        i23 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (composerStartRestartGroup.changedInstance(function10)) {
                            i28 = 1048576;
                        } else {
                            i28 = 524288;
                        }
                        i23 |= i28;
                    }
                    if ((i3 & 131072) != 0) {
                        i23 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(this)) {
                            i29 = 8388608;
                        } else {
                            i29 = 4194304;
                        }
                        i23 |= i29;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i311111110) {
                                        if ((i311111110 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i311111110, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        } else {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i311111110) {
                                        if ((i311111110 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i311111110, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                        }
                        int i311111110 = i4 << 3;
                        int i311111111 = i4 >> 3;
                        int i311111112 = i4 >> 9;
                        int i311111113 = i30 << 21;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i311111110 & 112) | 6 | (i311111110 & 896) | (i311111111 & 7168) | (57344 & i311111112) | (458752 & i311111112) | (3670016 & i311111112) | (i311111113 & 29360128) | (i311111113 & 234881024) | (i311111113 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i311111112 & 7168) | (57344 & i311111111) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function22 = function19;
                        function23 = function16;
                        textFieldColors2 = textFieldColorsColors;
                        function24 = function12;
                        function25 = function17;
                        paddingValues3 = paddingValues2;
                        function26 = function20;
                        function27 = function18;
                        function28 = function21;
                        function29 = function11;
                        z6 = z5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i311111114) {
                                        if ((i311111114 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i311111114, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        } else {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i311111114) {
                                        if ((i311111114 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i311111114, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                        }
                        int i311111114 = i4 << 3;
                        int i311111115 = i4 >> 3;
                        int i311111116 = i4 >> 9;
                        int i311111117 = i30 << 21;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i311111114 & 112) | 6 | (i311111114 & 896) | (i311111115 & 7168) | (57344 & i311111116) | (458752 & i311111116) | (3670016 & i311111116) | (i311111117 & 29360128) | (i311111117 & 234881024) | (i311111117 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i311111116 & 7168) | (57344 & i311111115) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function22 = function19;
                        function23 = function16;
                        textFieldColors2 = textFieldColorsColors;
                        function24 = function12;
                        function25 = function17;
                        paddingValues3 = paddingValues2;
                        function26 = function20;
                        function27 = function18;
                        function28 = function21;
                        function29 = function11;
                        z6 = z5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                            public final void invoke(Composer composer2, int i311111118) {
                                OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                    }
                }
                i23 |= 384;
                i26 = i3 & 8192;
                if (i26 != 0) {
                    if ((i2 & 3072) == 0) {
                        i23 |= composerStartRestartGroup.changedInstance(function9) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i7 = 16384;
                        }
                        i23 |= i7;
                    }
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                        if ((i3 & 32768) == 0) {
                            i31 = 65536;
                        } else {
                            i31 = 65536;
                        }
                        i23 |= i31;
                    }
                    i27 = i3 & 65536;
                    if (i27 != 0) {
                        i23 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (composerStartRestartGroup.changedInstance(function10)) {
                            i28 = 1048576;
                        } else {
                            i28 = 524288;
                        }
                        i23 |= i28;
                    }
                    if ((i3 & 131072) != 0) {
                        i23 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(this)) {
                            i29 = 8388608;
                        } else {
                            i29 = 4194304;
                        }
                        i23 |= i29;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i311111118) {
                                        if ((i311111118 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i311111118, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        } else {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i311111118) {
                                        if ((i311111118 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i311111118, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                        }
                        int i311111118 = i4 << 3;
                        int i311111119 = i4 >> 3;
                        int i3111111110 = i4 >> 9;
                        int i3111111111 = i30 << 21;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i311111118 & 112) | 6 | (i311111118 & 896) | (i311111119 & 7168) | (57344 & i3111111110) | (458752 & i3111111110) | (3670016 & i3111111110) | (i3111111111 & 29360128) | (i3111111111 & 234881024) | (i3111111111 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i3111111110 & 7168) | (57344 & i311111119) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function22 = function19;
                        function23 = function16;
                        textFieldColors2 = textFieldColorsColors;
                        function24 = function12;
                        function25 = function17;
                        paddingValues3 = paddingValues2;
                        function26 = function20;
                        function27 = function18;
                        function28 = function21;
                        function29 = function11;
                        z6 = z5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i3111111112) {
                                        if ((i3111111112 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i3111111112, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        } else {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i3111111112) {
                                        if ((i3111111112 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i3111111112, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                        }
                        int i3111111112 = i4 << 3;
                        int i3111111113 = i4 >> 3;
                        int i3111111114 = i4 >> 9;
                        int i3111111115 = i30 << 21;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i3111111112 & 112) | 6 | (i3111111112 & 896) | (i3111111113 & 7168) | (57344 & i3111111114) | (458752 & i3111111114) | (3670016 & i3111111114) | (i3111111115 & 29360128) | (i3111111115 & 234881024) | (i3111111115 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i3111111114 & 7168) | (57344 & i3111111113) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function22 = function19;
                        function23 = function16;
                        textFieldColors2 = textFieldColorsColors;
                        function24 = function12;
                        function25 = function17;
                        paddingValues3 = paddingValues2;
                        function26 = function20;
                        function27 = function18;
                        function28 = function21;
                        function29 = function11;
                        z6 = z5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                            public final void invoke(Composer composer2, int i3111111116) {
                                OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                    }
                }
                i23 |= 3072;
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i7 = 16384;
                    }
                    i23 |= i7;
                }
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                    if ((i3 & 32768) == 0) {
                        i31 = 65536;
                    } else {
                        i31 = 65536;
                    }
                    i23 |= i31;
                }
                i27 = i3 & 65536;
                if (i27 != 0) {
                    i23 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (composerStartRestartGroup.changedInstance(function10)) {
                        i28 = 1048576;
                    } else {
                        i28 = 524288;
                    }
                    i23 |= i28;
                }
                if ((i3 & 131072) != 0) {
                    i23 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(this)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i23 |= i29;
                }
                if ((i4 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i3111111116) {
                                    if ((i3111111116 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i3111111116, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    } else {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i3111111116) {
                                    if ((i3111111116 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i3111111116, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                    }
                    int i3111111116 = i4 << 3;
                    int i3111111117 = i4 >> 3;
                    int i3111111118 = i4 >> 9;
                    int i3111111119 = i30 << 21;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i3111111116 & 112) | 6 | (i3111111116 & 896) | (i3111111117 & 7168) | (57344 & i3111111118) | (458752 & i3111111118) | (3670016 & i3111111118) | (i3111111119 & 29360128) | (i3111111119 & 234881024) | (i3111111119 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i3111111118 & 7168) | (57344 & i3111111117) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function22 = function19;
                    function23 = function16;
                    textFieldColors2 = textFieldColorsColors;
                    function24 = function12;
                    function25 = function17;
                    paddingValues3 = paddingValues2;
                    function26 = function20;
                    function27 = function18;
                    function28 = function21;
                    function29 = function11;
                    z6 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i31111111110) {
                                    if ((i31111111110 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i31111111110, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    } else {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i31111111110) {
                                    if ((i31111111110 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i31111111110, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                    }
                    int i31111111110 = i4 << 3;
                    int i31111111111 = i4 >> 3;
                    int i31111111112 = i4 >> 9;
                    int i31111111113 = i30 << 21;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i31111111110 & 112) | 6 | (i31111111110 & 896) | (i31111111111 & 7168) | (57344 & i31111111112) | (458752 & i31111111112) | (3670016 & i31111111112) | (i31111111113 & 29360128) | (i31111111113 & 234881024) | (i31111111113 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i31111111112 & 7168) | (57344 & i31111111111) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function22 = function19;
                    function23 = function16;
                    textFieldColors2 = textFieldColorsColors;
                    function24 = function12;
                    function25 = function17;
                    paddingValues3 = paddingValues2;
                    function26 = function20;
                    function27 = function18;
                    function28 = function21;
                    function29 = function11;
                    z6 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                        public final void invoke(Composer composer2, int i31111111114) {
                            OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
            }
            i4 |= 24576;
            if ((i3 & 32) != 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changed(interactionSource)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i4 |= i9;
            }
            i10 = i3 & 64;
            if (i10 != 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (composerStartRestartGroup.changed(z3)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i4 |= i11;
            }
            i12 = i3 & 128;
            if (i12 != 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i4 |= i13;
            }
            i14 = i3 & 256;
            if (i14 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i15 = 33554432;
                }
                i4 |= i15;
            }
            i16 = i3 & 512;
            if (i16 != 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i17 = 536870912;
                } else {
                    i17 = 268435456;
                }
                i4 |= i17;
            }
            i18 = i3 & 1024;
            if (i18 != 0) {
                i19 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (composerStartRestartGroup.changedInstance(function6)) {
                    i20 = 4;
                } else {
                    i20 = 2;
                }
                i19 = i2 | i20;
            } else {
                i19 = i2;
            }
            i21 = i3 & 2048;
            if (i21 != 0) {
                i19 |= 48;
            } else if ((i2 & 48) == 0) {
                if (composerStartRestartGroup.changedInstance(function7)) {
                    i22 = 32;
                } else {
                    i22 = 16;
                }
                i19 |= i22;
            }
            i23 = i19;
            i24 = i3 & 4096;
            if (i24 != 0) {
                if ((i2 & 384) == 0) {
                    if (composerStartRestartGroup.changedInstance(function8)) {
                        i25 = 256;
                    } else {
                        i25 = 128;
                    }
                    i23 |= i25;
                }
                i26 = i3 & 8192;
                if (i26 != 0) {
                    if ((i2 & 3072) == 0) {
                        i23 |= composerStartRestartGroup.changedInstance(function9) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i7 = 16384;
                        }
                        i23 |= i7;
                    }
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                        if ((i3 & 32768) == 0) {
                            i31 = 65536;
                        } else {
                            i31 = 65536;
                        }
                        i23 |= i31;
                    }
                    i27 = i3 & 65536;
                    if (i27 != 0) {
                        i23 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (composerStartRestartGroup.changedInstance(function10)) {
                            i28 = 1048576;
                        } else {
                            i28 = 524288;
                        }
                        i23 |= i28;
                    }
                    if ((i3 & 131072) != 0) {
                        i23 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(this)) {
                            i29 = 8388608;
                        } else {
                            i29 = 4194304;
                        }
                        i23 |= i29;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i31111111114) {
                                        if ((i31111111114 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i31111111114, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        } else {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i31111111114) {
                                        if ((i31111111114 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i31111111114, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                        }
                        int i31111111114 = i4 << 3;
                        int i31111111115 = i4 >> 3;
                        int i31111111116 = i4 >> 9;
                        int i31111111117 = i30 << 21;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i31111111114 & 112) | 6 | (i31111111114 & 896) | (i31111111115 & 7168) | (57344 & i31111111116) | (458752 & i31111111116) | (3670016 & i31111111116) | (i31111111117 & 29360128) | (i31111111117 & 234881024) | (i31111111117 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i31111111116 & 7168) | (57344 & i31111111115) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function22 = function19;
                        function23 = function16;
                        textFieldColors2 = textFieldColorsColors;
                        function24 = function12;
                        function25 = function17;
                        paddingValues3 = paddingValues2;
                        function26 = function20;
                        function27 = function18;
                        function28 = function21;
                        function29 = function11;
                        z6 = z5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i31111111118) {
                                        if ((i31111111118 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i31111111118, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        } else {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i31111111118) {
                                        if ((i31111111118 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i31111111118, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                        }
                        int i31111111118 = i4 << 3;
                        int i31111111119 = i4 >> 3;
                        int i311111111110 = i4 >> 9;
                        int i311111111111 = i30 << 21;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i31111111118 & 112) | 6 | (i31111111118 & 896) | (i31111111119 & 7168) | (57344 & i311111111110) | (458752 & i311111111110) | (3670016 & i311111111110) | (i311111111111 & 29360128) | (i311111111111 & 234881024) | (i311111111111 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i311111111110 & 7168) | (57344 & i31111111119) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function22 = function19;
                        function23 = function16;
                        textFieldColors2 = textFieldColorsColors;
                        function24 = function12;
                        function25 = function17;
                        paddingValues3 = paddingValues2;
                        function26 = function20;
                        function27 = function18;
                        function28 = function21;
                        function29 = function11;
                        z6 = z5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                            public final void invoke(Composer composer2, int i311111111112) {
                                OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                    }
                }
                i23 |= 3072;
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i7 = 16384;
                    }
                    i23 |= i7;
                }
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                    if ((i3 & 32768) == 0) {
                        i31 = 65536;
                    } else {
                        i31 = 65536;
                    }
                    i23 |= i31;
                }
                i27 = i3 & 65536;
                if (i27 != 0) {
                    i23 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (composerStartRestartGroup.changedInstance(function10)) {
                        i28 = 1048576;
                    } else {
                        i28 = 524288;
                    }
                    i23 |= i28;
                }
                if ((i3 & 131072) != 0) {
                    i23 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(this)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i23 |= i29;
                }
                if ((i4 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i311111111112) {
                                    if ((i311111111112 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i311111111112, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    } else {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i311111111112) {
                                    if ((i311111111112 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i311111111112, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                    }
                    int i311111111112 = i4 << 3;
                    int i311111111113 = i4 >> 3;
                    int i311111111114 = i4 >> 9;
                    int i311111111115 = i30 << 21;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i311111111112 & 112) | 6 | (i311111111112 & 896) | (i311111111113 & 7168) | (57344 & i311111111114) | (458752 & i311111111114) | (3670016 & i311111111114) | (i311111111115 & 29360128) | (i311111111115 & 234881024) | (i311111111115 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i311111111114 & 7168) | (57344 & i311111111113) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function22 = function19;
                    function23 = function16;
                    textFieldColors2 = textFieldColorsColors;
                    function24 = function12;
                    function25 = function17;
                    paddingValues3 = paddingValues2;
                    function26 = function20;
                    function27 = function18;
                    function28 = function21;
                    function29 = function11;
                    z6 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i311111111116) {
                                    if ((i311111111116 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i311111111116, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    } else {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i311111111116) {
                                    if ((i311111111116 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i311111111116, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                    }
                    int i311111111116 = i4 << 3;
                    int i311111111117 = i4 >> 3;
                    int i311111111118 = i4 >> 9;
                    int i311111111119 = i30 << 21;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i311111111116 & 112) | 6 | (i311111111116 & 896) | (i311111111117 & 7168) | (57344 & i311111111118) | (458752 & i311111111118) | (3670016 & i311111111118) | (i311111111119 & 29360128) | (i311111111119 & 234881024) | (i311111111119 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i311111111118 & 7168) | (57344 & i311111111117) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function22 = function19;
                    function23 = function16;
                    textFieldColors2 = textFieldColorsColors;
                    function24 = function12;
                    function25 = function17;
                    paddingValues3 = paddingValues2;
                    function26 = function20;
                    function27 = function18;
                    function28 = function21;
                    function29 = function11;
                    z6 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                        public final void invoke(Composer composer2, int i3111111111110) {
                            OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
            }
            i23 |= 384;
            i26 = i3 & 8192;
            if (i26 != 0) {
                if ((i2 & 3072) == 0) {
                    i23 |= composerStartRestartGroup.changedInstance(function9) ? 2048 : 1024;
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i7 = 16384;
                    }
                    i23 |= i7;
                }
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                    if ((i3 & 32768) == 0) {
                        i31 = 65536;
                    } else {
                        i31 = 65536;
                    }
                    i23 |= i31;
                }
                i27 = i3 & 65536;
                if (i27 != 0) {
                    i23 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (composerStartRestartGroup.changedInstance(function10)) {
                        i28 = 1048576;
                    } else {
                        i28 = 524288;
                    }
                    i23 |= i28;
                }
                if ((i3 & 131072) != 0) {
                    i23 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(this)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i23 |= i29;
                }
                if ((i4 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i3111111111110) {
                                    if ((i3111111111110 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i3111111111110, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    } else {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i3111111111110) {
                                    if ((i3111111111110 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i3111111111110, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                    }
                    int i3111111111110 = i4 << 3;
                    int i3111111111111 = i4 >> 3;
                    int i3111111111112 = i4 >> 9;
                    int i3111111111113 = i30 << 21;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i3111111111110 & 112) | 6 | (i3111111111110 & 896) | (i3111111111111 & 7168) | (57344 & i3111111111112) | (458752 & i3111111111112) | (3670016 & i3111111111112) | (i3111111111113 & 29360128) | (i3111111111113 & 234881024) | (i3111111111113 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i3111111111112 & 7168) | (57344 & i3111111111111) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function22 = function19;
                    function23 = function16;
                    textFieldColors2 = textFieldColorsColors;
                    function24 = function12;
                    function25 = function17;
                    paddingValues3 = paddingValues2;
                    function26 = function20;
                    function27 = function18;
                    function28 = function21;
                    function29 = function11;
                    z6 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i3111111111114) {
                                    if ((i3111111111114 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i3111111111114, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    } else {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i3111111111114) {
                                    if ((i3111111111114 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i3111111111114, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                    }
                    int i3111111111114 = i4 << 3;
                    int i3111111111115 = i4 >> 3;
                    int i3111111111116 = i4 >> 9;
                    int i3111111111117 = i30 << 21;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i3111111111114 & 112) | 6 | (i3111111111114 & 896) | (i3111111111115 & 7168) | (57344 & i3111111111116) | (458752 & i3111111111116) | (3670016 & i3111111111116) | (i3111111111117 & 29360128) | (i3111111111117 & 234881024) | (i3111111111117 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i3111111111116 & 7168) | (57344 & i3111111111115) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function22 = function19;
                    function23 = function16;
                    textFieldColors2 = textFieldColorsColors;
                    function24 = function12;
                    function25 = function17;
                    paddingValues3 = paddingValues2;
                    function26 = function20;
                    function27 = function18;
                    function28 = function21;
                    function29 = function11;
                    z6 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                        public final void invoke(Composer composer2, int i3111111111118) {
                            OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
            }
            i23 |= 3072;
            if ((i2 & 24576) != 0) {
                if ((i3 & 16384) == 0) {
                    i7 = 16384;
                }
                i23 |= i7;
            }
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                if ((i3 & 32768) == 0) {
                    i31 = 65536;
                } else {
                    i31 = 65536;
                }
                i23 |= i31;
            }
            i27 = i3 & 65536;
            if (i27 != 0) {
                i23 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (composerStartRestartGroup.changedInstance(function10)) {
                    i28 = 1048576;
                } else {
                    i28 = 524288;
                }
                i23 |= i28;
            }
            if ((i3 & 131072) != 0) {
                i23 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (composerStartRestartGroup.changed(this)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i23 |= i29;
            }
            if ((i4 & 306783379) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i14 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i16 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i18 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i21 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i24 != 0) {
                        function16 = null;
                    } else {
                        function16 = function8;
                    }
                    if (i26 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                        i23 &= -57345;
                    } else {
                        textFieldColorsColors = textFieldColors;
                    }
                    if ((i3 & 32768) != 0) {
                        paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i23 &= -458753;
                    } else {
                        paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i27 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i3111111111118) {
                                if ((i3111111111118 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1448570018, i3111111111118, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                    }
                                    OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                        });
                    } else {
                        composableLambda = function10;
                    }
                    function18 = function13;
                    function19 = function14;
                    function20 = composableLambda;
                    i30 = i23;
                    z5 = z4;
                    paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                    function21 = function15;
                } else {
                    if (i10 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i14 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i16 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i18 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i21 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i24 != 0) {
                        function16 = null;
                    } else {
                        function16 = function8;
                    }
                    if (i26 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                        i23 &= -57345;
                    } else {
                        textFieldColorsColors = textFieldColors;
                    }
                    if ((i3 & 32768) != 0) {
                        paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i23 &= -458753;
                    } else {
                        paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i27 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i3111111111118) {
                                if ((i3111111111118 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1448570018, i3111111111118, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                    }
                                    OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                        });
                    } else {
                        composableLambda = function10;
                    }
                    function18 = function13;
                    function19 = function14;
                    function20 = composableLambda;
                    i30 = i23;
                    z5 = z4;
                    paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                    function21 = function15;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                }
                int i3111111111118 = i4 << 3;
                int i3111111111119 = i4 >> 3;
                int i31111111111110 = i4 >> 9;
                int i31111111111111 = i30 << 21;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i3111111111118 & 112) | 6 | (i3111111111118 & 896) | (i3111111111119 & 7168) | (57344 & i31111111111110) | (458752 & i31111111111110) | (3670016 & i31111111111110) | (i31111111111111 & 29360128) | (i31111111111111 & 234881024) | (i31111111111111 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i31111111111110 & 7168) | (57344 & i3111111111119) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function22 = function19;
                function23 = function16;
                textFieldColors2 = textFieldColorsColors;
                function24 = function12;
                function25 = function17;
                paddingValues3 = paddingValues2;
                function26 = function20;
                function27 = function18;
                function28 = function21;
                function29 = function11;
                z6 = z5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i14 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i16 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i18 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i21 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i24 != 0) {
                        function16 = null;
                    } else {
                        function16 = function8;
                    }
                    if (i26 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                        i23 &= -57345;
                    } else {
                        textFieldColorsColors = textFieldColors;
                    }
                    if ((i3 & 32768) != 0) {
                        paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i23 &= -458753;
                    } else {
                        paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i27 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i31111111111112) {
                                if ((i31111111111112 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1448570018, i31111111111112, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                    }
                                    OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                        });
                    } else {
                        composableLambda = function10;
                    }
                    function18 = function13;
                    function19 = function14;
                    function20 = composableLambda;
                    i30 = i23;
                    z5 = z4;
                    paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                    function21 = function15;
                } else {
                    if (i10 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i14 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i16 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i18 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i21 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i24 != 0) {
                        function16 = null;
                    } else {
                        function16 = function8;
                    }
                    if (i26 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                        i23 &= -57345;
                    } else {
                        textFieldColorsColors = textFieldColors;
                    }
                    if ((i3 & 32768) != 0) {
                        paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i23 &= -458753;
                    } else {
                        paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i27 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i31111111111112) {
                                if ((i31111111111112 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1448570018, i31111111111112, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                    }
                                    OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                        });
                    } else {
                        composableLambda = function10;
                    }
                    function18 = function13;
                    function19 = function14;
                    function20 = composableLambda;
                    i30 = i23;
                    z5 = z4;
                    paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                    function21 = function15;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                }
                int i31111111111112 = i4 << 3;
                int i31111111111113 = i4 >> 3;
                int i31111111111114 = i4 >> 9;
                int i31111111111115 = i30 << 21;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i31111111111112 & 112) | 6 | (i31111111111112 & 896) | (i31111111111113 & 7168) | (57344 & i31111111111114) | (458752 & i31111111111114) | (3670016 & i31111111111114) | (i31111111111115 & 29360128) | (i31111111111115 & 234881024) | (i31111111111115 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i31111111111114 & 7168) | (57344 & i31111111111113) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function22 = function19;
                function23 = function16;
                textFieldColors2 = textFieldColorsColors;
                function24 = function12;
                function25 = function17;
                paddingValues3 = paddingValues2;
                function26 = function20;
                function27 = function18;
                function28 = function21;
                function29 = function11;
                z6 = z5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                    public final void invoke(Composer composer2, int i31111111111116) {
                        OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                    }
                });
            }
        }
        i4 |= 48;
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            if (composerStartRestartGroup.changed(z)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i4 |= i5;
        }
        if ((i3 & 8) != 0) {
            if ((i & 3072) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            i7 = 8192;
            if ((i3 & 16) != 0) {
                if ((i & 24576) == 0) {
                    if (composerStartRestartGroup.changed(visualTransformation)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((i3 & 32) != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(interactionSource)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 64;
                if (i10 != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (composerStartRestartGroup.changed(z3)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i4 |= i11;
                }
                i12 = i3 & 128;
                if (i12 != 0) {
                    i4 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i4 |= i13;
                }
                i14 = i3 & 256;
                if (i14 != 0) {
                    i4 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i15 = 33554432;
                    }
                    i4 |= i15;
                }
                i16 = i3 & 512;
                if (i16 != 0) {
                    i4 |= 805306368;
                } else if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                    i4 |= i17;
                }
                i18 = i3 & 1024;
                if (i18 != 0) {
                    i19 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                    i19 = i2 | i20;
                } else {
                    i19 = i2;
                }
                i21 = i3 & 2048;
                if (i21 != 0) {
                    i19 |= 48;
                } else if ((i2 & 48) == 0) {
                    if (composerStartRestartGroup.changedInstance(function7)) {
                        i22 = 32;
                    } else {
                        i22 = 16;
                    }
                    i19 |= i22;
                }
                i23 = i19;
                i24 = i3 & 4096;
                if (i24 != 0) {
                    if ((i2 & 384) == 0) {
                        if (composerStartRestartGroup.changedInstance(function8)) {
                            i25 = 256;
                        } else {
                            i25 = 128;
                        }
                        i23 |= i25;
                    }
                    i26 = i3 & 8192;
                    if (i26 != 0) {
                        if ((i2 & 3072) == 0) {
                            i23 |= composerStartRestartGroup.changedInstance(function9) ? 2048 : 1024;
                        }
                        if ((i2 & 24576) != 0) {
                            if ((i3 & 16384) == 0) {
                                i7 = 16384;
                            }
                            i23 |= i7;
                        }
                        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                            if ((i3 & 32768) == 0) {
                                i31 = 65536;
                            } else {
                                i31 = 65536;
                            }
                            i23 |= i31;
                        }
                        i27 = i3 & 65536;
                        if (i27 != 0) {
                            i23 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            if (composerStartRestartGroup.changedInstance(function10)) {
                                i28 = 1048576;
                            } else {
                                i28 = 524288;
                            }
                            i23 |= i28;
                        }
                        if ((i3 & 131072) != 0) {
                            i23 |= 12582912;
                        } else if ((i2 & 12582912) == 0) {
                            if (composerStartRestartGroup.changed(this)) {
                                i29 = 8388608;
                            } else {
                                i29 = 4194304;
                            }
                            i23 |= i29;
                        }
                        if ((i4 & 306783379) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i10 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z3;
                                }
                                if (i12 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i14 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i16 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i18 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i21 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i24 != 0) {
                                    function16 = null;
                                } else {
                                    function16 = function8;
                                }
                                if (i26 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                    i23 &= -57345;
                                } else {
                                    textFieldColorsColors = textFieldColors;
                                }
                                if ((i3 & 32768) != 0) {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i23 &= -458753;
                                } else {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i27 != 0) {
                                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i31111111111116) {
                                            if ((i31111111111116 & 3) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1448570018, i31111111111116, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                                }
                                                OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                    });
                                } else {
                                    composableLambda = function10;
                                }
                                function18 = function13;
                                function19 = function14;
                                function20 = composableLambda;
                                i30 = i23;
                                z5 = z4;
                                paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                                function21 = function15;
                            } else {
                                if (i10 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z3;
                                }
                                if (i12 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i14 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i16 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i18 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i21 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i24 != 0) {
                                    function16 = null;
                                } else {
                                    function16 = function8;
                                }
                                if (i26 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                    i23 &= -57345;
                                } else {
                                    textFieldColorsColors = textFieldColors;
                                }
                                if ((i3 & 32768) != 0) {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i23 &= -458753;
                                } else {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i27 != 0) {
                                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i31111111111116) {
                                            if ((i31111111111116 & 3) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1448570018, i31111111111116, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                                }
                                                OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                    });
                                } else {
                                    composableLambda = function10;
                                }
                                function18 = function13;
                                function19 = function14;
                                function20 = composableLambda;
                                i30 = i23;
                                z5 = z4;
                                paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                                function21 = function15;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                            }
                            int i31111111111116 = i4 << 3;
                            int i31111111111117 = i4 >> 3;
                            int i31111111111118 = i4 >> 9;
                            int i31111111111119 = i30 << 21;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i31111111111116 & 112) | 6 | (i31111111111116 & 896) | (i31111111111117 & 7168) | (57344 & i31111111111118) | (458752 & i31111111111118) | (3670016 & i31111111111118) | (i31111111111119 & 29360128) | (i31111111111119 & 234881024) | (i31111111111119 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i31111111111118 & 7168) | (57344 & i31111111111117) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function22 = function19;
                            function23 = function16;
                            textFieldColors2 = textFieldColorsColors;
                            function24 = function12;
                            function25 = function17;
                            paddingValues3 = paddingValues2;
                            function26 = function20;
                            function27 = function18;
                            function28 = function21;
                            function29 = function11;
                            z6 = z5;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i10 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z3;
                                }
                                if (i12 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i14 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i16 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i18 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i21 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i24 != 0) {
                                    function16 = null;
                                } else {
                                    function16 = function8;
                                }
                                if (i26 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                    i23 &= -57345;
                                } else {
                                    textFieldColorsColors = textFieldColors;
                                }
                                if ((i3 & 32768) != 0) {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i23 &= -458753;
                                } else {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i27 != 0) {
                                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i311111111111110) {
                                            if ((i311111111111110 & 3) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1448570018, i311111111111110, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                                }
                                                OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                    });
                                } else {
                                    composableLambda = function10;
                                }
                                function18 = function13;
                                function19 = function14;
                                function20 = composableLambda;
                                i30 = i23;
                                z5 = z4;
                                paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                                function21 = function15;
                            } else {
                                if (i10 != 0) {
                                    z4 = false;
                                } else {
                                    z4 = z3;
                                }
                                if (i12 != 0) {
                                    function11 = null;
                                } else {
                                    function11 = function3;
                                }
                                if (i14 != 0) {
                                    function12 = null;
                                } else {
                                    function12 = function4;
                                }
                                if (i16 != 0) {
                                    function13 = null;
                                } else {
                                    function13 = function5;
                                }
                                if (i18 != 0) {
                                    function14 = null;
                                } else {
                                    function14 = function6;
                                }
                                if (i21 != 0) {
                                    function15 = null;
                                } else {
                                    function15 = function7;
                                }
                                if (i24 != 0) {
                                    function16 = null;
                                } else {
                                    function16 = function8;
                                }
                                if (i26 == 0) {
                                }
                                if ((i3 & 16384) != 0) {
                                    textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                    i23 &= -57345;
                                } else {
                                    textFieldColorsColors = textFieldColors;
                                }
                                if ((i3 & 32768) != 0) {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                    i23 &= -458753;
                                } else {
                                    paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                                }
                                if (i27 != 0) {
                                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer2, int i311111111111110) {
                                            if ((i311111111111110 & 3) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1448570018, i311111111111110, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                                }
                                                OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                    });
                                } else {
                                    composableLambda = function10;
                                }
                                function18 = function13;
                                function19 = function14;
                                function20 = composableLambda;
                                i30 = i23;
                                z5 = z4;
                                paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                                function21 = function15;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                            }
                            int i311111111111110 = i4 << 3;
                            int i311111111111111 = i4 >> 3;
                            int i311111111111112 = i4 >> 9;
                            int i311111111111113 = i30 << 21;
                            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i311111111111110 & 112) | 6 | (i311111111111110 & 896) | (i311111111111111 & 7168) | (57344 & i311111111111112) | (458752 & i311111111111112) | (3670016 & i311111111111112) | (i311111111111113 & 29360128) | (i311111111111113 & 234881024) | (i311111111111113 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i311111111111112 & 7168) | (57344 & i311111111111111) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function22 = function19;
                            function23 = function16;
                            textFieldColors2 = textFieldColorsColors;
                            function24 = function12;
                            function25 = function17;
                            paddingValues3 = paddingValues2;
                            function26 = function20;
                            function27 = function18;
                            function28 = function21;
                            function29 = function11;
                            z6 = z5;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                                public final void invoke(Composer composer2, int i311111111111114) {
                                    OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                }
                            });
                        }
                    }
                    i23 |= 3072;
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i7 = 16384;
                        }
                        i23 |= i7;
                    }
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                        if ((i3 & 32768) == 0) {
                            i31 = 65536;
                        } else {
                            i31 = 65536;
                        }
                        i23 |= i31;
                    }
                    i27 = i3 & 65536;
                    if (i27 != 0) {
                        i23 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (composerStartRestartGroup.changedInstance(function10)) {
                            i28 = 1048576;
                        } else {
                            i28 = 524288;
                        }
                        i23 |= i28;
                    }
                    if ((i3 & 131072) != 0) {
                        i23 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(this)) {
                            i29 = 8388608;
                        } else {
                            i29 = 4194304;
                        }
                        i23 |= i29;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i311111111111114) {
                                        if ((i311111111111114 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i311111111111114, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        } else {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i311111111111114) {
                                        if ((i311111111111114 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i311111111111114, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                        }
                        int i311111111111114 = i4 << 3;
                        int i311111111111115 = i4 >> 3;
                        int i311111111111116 = i4 >> 9;
                        int i311111111111117 = i30 << 21;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i311111111111114 & 112) | 6 | (i311111111111114 & 896) | (i311111111111115 & 7168) | (57344 & i311111111111116) | (458752 & i311111111111116) | (3670016 & i311111111111116) | (i311111111111117 & 29360128) | (i311111111111117 & 234881024) | (i311111111111117 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i311111111111116 & 7168) | (57344 & i311111111111115) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function22 = function19;
                        function23 = function16;
                        textFieldColors2 = textFieldColorsColors;
                        function24 = function12;
                        function25 = function17;
                        paddingValues3 = paddingValues2;
                        function26 = function20;
                        function27 = function18;
                        function28 = function21;
                        function29 = function11;
                        z6 = z5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i311111111111118) {
                                        if ((i311111111111118 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i311111111111118, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        } else {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i311111111111118) {
                                        if ((i311111111111118 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i311111111111118, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                        }
                        int i311111111111118 = i4 << 3;
                        int i311111111111119 = i4 >> 3;
                        int i3111111111111110 = i4 >> 9;
                        int i3111111111111111 = i30 << 21;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i311111111111118 & 112) | 6 | (i311111111111118 & 896) | (i311111111111119 & 7168) | (57344 & i3111111111111110) | (458752 & i3111111111111110) | (3670016 & i3111111111111110) | (i3111111111111111 & 29360128) | (i3111111111111111 & 234881024) | (i3111111111111111 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i3111111111111110 & 7168) | (57344 & i311111111111119) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function22 = function19;
                        function23 = function16;
                        textFieldColors2 = textFieldColorsColors;
                        function24 = function12;
                        function25 = function17;
                        paddingValues3 = paddingValues2;
                        function26 = function20;
                        function27 = function18;
                        function28 = function21;
                        function29 = function11;
                        z6 = z5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                            public final void invoke(Composer composer2, int i3111111111111112) {
                                OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                    }
                }
                i23 |= 384;
                i26 = i3 & 8192;
                if (i26 != 0) {
                    if ((i2 & 3072) == 0) {
                        i23 |= composerStartRestartGroup.changedInstance(function9) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i7 = 16384;
                        }
                        i23 |= i7;
                    }
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                        if ((i3 & 32768) == 0) {
                            i31 = 65536;
                        } else {
                            i31 = 65536;
                        }
                        i23 |= i31;
                    }
                    i27 = i3 & 65536;
                    if (i27 != 0) {
                        i23 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (composerStartRestartGroup.changedInstance(function10)) {
                            i28 = 1048576;
                        } else {
                            i28 = 524288;
                        }
                        i23 |= i28;
                    }
                    if ((i3 & 131072) != 0) {
                        i23 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(this)) {
                            i29 = 8388608;
                        } else {
                            i29 = 4194304;
                        }
                        i23 |= i29;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i3111111111111112) {
                                        if ((i3111111111111112 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i3111111111111112, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        } else {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i3111111111111112) {
                                        if ((i3111111111111112 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i3111111111111112, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                        }
                        int i3111111111111112 = i4 << 3;
                        int i3111111111111113 = i4 >> 3;
                        int i3111111111111114 = i4 >> 9;
                        int i3111111111111115 = i30 << 21;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i3111111111111112 & 112) | 6 | (i3111111111111112 & 896) | (i3111111111111113 & 7168) | (57344 & i3111111111111114) | (458752 & i3111111111111114) | (3670016 & i3111111111111114) | (i3111111111111115 & 29360128) | (i3111111111111115 & 234881024) | (i3111111111111115 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i3111111111111114 & 7168) | (57344 & i3111111111111113) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function22 = function19;
                        function23 = function16;
                        textFieldColors2 = textFieldColorsColors;
                        function24 = function12;
                        function25 = function17;
                        paddingValues3 = paddingValues2;
                        function26 = function20;
                        function27 = function18;
                        function28 = function21;
                        function29 = function11;
                        z6 = z5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i3111111111111116) {
                                        if ((i3111111111111116 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i3111111111111116, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        } else {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i3111111111111116) {
                                        if ((i3111111111111116 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i3111111111111116, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                        }
                        int i3111111111111116 = i4 << 3;
                        int i3111111111111117 = i4 >> 3;
                        int i3111111111111118 = i4 >> 9;
                        int i3111111111111119 = i30 << 21;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i3111111111111116 & 112) | 6 | (i3111111111111116 & 896) | (i3111111111111117 & 7168) | (57344 & i3111111111111118) | (458752 & i3111111111111118) | (3670016 & i3111111111111118) | (i3111111111111119 & 29360128) | (i3111111111111119 & 234881024) | (i3111111111111119 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i3111111111111118 & 7168) | (57344 & i3111111111111117) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function22 = function19;
                        function23 = function16;
                        textFieldColors2 = textFieldColorsColors;
                        function24 = function12;
                        function25 = function17;
                        paddingValues3 = paddingValues2;
                        function26 = function20;
                        function27 = function18;
                        function28 = function21;
                        function29 = function11;
                        z6 = z5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                            public final void invoke(Composer composer2, int i31111111111111110) {
                                OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                    }
                }
                i23 |= 3072;
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i7 = 16384;
                    }
                    i23 |= i7;
                }
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                    if ((i3 & 32768) == 0) {
                        i31 = 65536;
                    } else {
                        i31 = 65536;
                    }
                    i23 |= i31;
                }
                i27 = i3 & 65536;
                if (i27 != 0) {
                    i23 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (composerStartRestartGroup.changedInstance(function10)) {
                        i28 = 1048576;
                    } else {
                        i28 = 524288;
                    }
                    i23 |= i28;
                }
                if ((i3 & 131072) != 0) {
                    i23 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(this)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i23 |= i29;
                }
                if ((i4 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i31111111111111110) {
                                    if ((i31111111111111110 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i31111111111111110, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    } else {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i31111111111111110) {
                                    if ((i31111111111111110 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i31111111111111110, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                    }
                    int i31111111111111110 = i4 << 3;
                    int i31111111111111111 = i4 >> 3;
                    int i31111111111111112 = i4 >> 9;
                    int i31111111111111113 = i30 << 21;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i31111111111111110 & 112) | 6 | (i31111111111111110 & 896) | (i31111111111111111 & 7168) | (57344 & i31111111111111112) | (458752 & i31111111111111112) | (3670016 & i31111111111111112) | (i31111111111111113 & 29360128) | (i31111111111111113 & 234881024) | (i31111111111111113 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i31111111111111112 & 7168) | (57344 & i31111111111111111) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function22 = function19;
                    function23 = function16;
                    textFieldColors2 = textFieldColorsColors;
                    function24 = function12;
                    function25 = function17;
                    paddingValues3 = paddingValues2;
                    function26 = function20;
                    function27 = function18;
                    function28 = function21;
                    function29 = function11;
                    z6 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i31111111111111114) {
                                    if ((i31111111111111114 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i31111111111111114, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    } else {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i31111111111111114) {
                                    if ((i31111111111111114 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i31111111111111114, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                    }
                    int i31111111111111114 = i4 << 3;
                    int i31111111111111115 = i4 >> 3;
                    int i31111111111111116 = i4 >> 9;
                    int i31111111111111117 = i30 << 21;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i31111111111111114 & 112) | 6 | (i31111111111111114 & 896) | (i31111111111111115 & 7168) | (57344 & i31111111111111116) | (458752 & i31111111111111116) | (3670016 & i31111111111111116) | (i31111111111111117 & 29360128) | (i31111111111111117 & 234881024) | (i31111111111111117 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i31111111111111116 & 7168) | (57344 & i31111111111111115) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function22 = function19;
                    function23 = function16;
                    textFieldColors2 = textFieldColorsColors;
                    function24 = function12;
                    function25 = function17;
                    paddingValues3 = paddingValues2;
                    function26 = function20;
                    function27 = function18;
                    function28 = function21;
                    function29 = function11;
                    z6 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                        public final void invoke(Composer composer2, int i31111111111111118) {
                            OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
            }
            i4 |= 24576;
            if ((i3 & 32) != 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changed(interactionSource)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i4 |= i9;
            }
            i10 = i3 & 64;
            if (i10 != 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (composerStartRestartGroup.changed(z3)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i4 |= i11;
            }
            i12 = i3 & 128;
            if (i12 != 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i4 |= i13;
            }
            i14 = i3 & 256;
            if (i14 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i15 = 33554432;
                }
                i4 |= i15;
            }
            i16 = i3 & 512;
            if (i16 != 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i17 = 536870912;
                } else {
                    i17 = 268435456;
                }
                i4 |= i17;
            }
            i18 = i3 & 1024;
            if (i18 != 0) {
                i19 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (composerStartRestartGroup.changedInstance(function6)) {
                    i20 = 4;
                } else {
                    i20 = 2;
                }
                i19 = i2 | i20;
            } else {
                i19 = i2;
            }
            i21 = i3 & 2048;
            if (i21 != 0) {
                i19 |= 48;
            } else if ((i2 & 48) == 0) {
                if (composerStartRestartGroup.changedInstance(function7)) {
                    i22 = 32;
                } else {
                    i22 = 16;
                }
                i19 |= i22;
            }
            i23 = i19;
            i24 = i3 & 4096;
            if (i24 != 0) {
                if ((i2 & 384) == 0) {
                    if (composerStartRestartGroup.changedInstance(function8)) {
                        i25 = 256;
                    } else {
                        i25 = 128;
                    }
                    i23 |= i25;
                }
                i26 = i3 & 8192;
                if (i26 != 0) {
                    if ((i2 & 3072) == 0) {
                        i23 |= composerStartRestartGroup.changedInstance(function9) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i7 = 16384;
                        }
                        i23 |= i7;
                    }
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                        if ((i3 & 32768) == 0) {
                            i31 = 65536;
                        } else {
                            i31 = 65536;
                        }
                        i23 |= i31;
                    }
                    i27 = i3 & 65536;
                    if (i27 != 0) {
                        i23 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (composerStartRestartGroup.changedInstance(function10)) {
                            i28 = 1048576;
                        } else {
                            i28 = 524288;
                        }
                        i23 |= i28;
                    }
                    if ((i3 & 131072) != 0) {
                        i23 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(this)) {
                            i29 = 8388608;
                        } else {
                            i29 = 4194304;
                        }
                        i23 |= i29;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i31111111111111118) {
                                        if ((i31111111111111118 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i31111111111111118, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        } else {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i31111111111111118) {
                                        if ((i31111111111111118 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i31111111111111118, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                        }
                        int i31111111111111118 = i4 << 3;
                        int i31111111111111119 = i4 >> 3;
                        int i311111111111111110 = i4 >> 9;
                        int i311111111111111111 = i30 << 21;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i31111111111111118 & 112) | 6 | (i31111111111111118 & 896) | (i31111111111111119 & 7168) | (57344 & i311111111111111110) | (458752 & i311111111111111110) | (3670016 & i311111111111111110) | (i311111111111111111 & 29360128) | (i311111111111111111 & 234881024) | (i311111111111111111 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i311111111111111110 & 7168) | (57344 & i31111111111111119) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function22 = function19;
                        function23 = function16;
                        textFieldColors2 = textFieldColorsColors;
                        function24 = function12;
                        function25 = function17;
                        paddingValues3 = paddingValues2;
                        function26 = function20;
                        function27 = function18;
                        function28 = function21;
                        function29 = function11;
                        z6 = z5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i311111111111111112) {
                                        if ((i311111111111111112 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i311111111111111112, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        } else {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i311111111111111112) {
                                        if ((i311111111111111112 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i311111111111111112, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                        }
                        int i311111111111111112 = i4 << 3;
                        int i311111111111111113 = i4 >> 3;
                        int i311111111111111114 = i4 >> 9;
                        int i311111111111111115 = i30 << 21;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i311111111111111112 & 112) | 6 | (i311111111111111112 & 896) | (i311111111111111113 & 7168) | (57344 & i311111111111111114) | (458752 & i311111111111111114) | (3670016 & i311111111111111114) | (i311111111111111115 & 29360128) | (i311111111111111115 & 234881024) | (i311111111111111115 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i311111111111111114 & 7168) | (57344 & i311111111111111113) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function22 = function19;
                        function23 = function16;
                        textFieldColors2 = textFieldColorsColors;
                        function24 = function12;
                        function25 = function17;
                        paddingValues3 = paddingValues2;
                        function26 = function20;
                        function27 = function18;
                        function28 = function21;
                        function29 = function11;
                        z6 = z5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                            public final void invoke(Composer composer2, int i311111111111111116) {
                                OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                    }
                }
                i23 |= 3072;
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i7 = 16384;
                    }
                    i23 |= i7;
                }
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                    if ((i3 & 32768) == 0) {
                        i31 = 65536;
                    } else {
                        i31 = 65536;
                    }
                    i23 |= i31;
                }
                i27 = i3 & 65536;
                if (i27 != 0) {
                    i23 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (composerStartRestartGroup.changedInstance(function10)) {
                        i28 = 1048576;
                    } else {
                        i28 = 524288;
                    }
                    i23 |= i28;
                }
                if ((i3 & 131072) != 0) {
                    i23 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(this)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i23 |= i29;
                }
                if ((i4 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i311111111111111116) {
                                    if ((i311111111111111116 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i311111111111111116, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    } else {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i311111111111111116) {
                                    if ((i311111111111111116 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i311111111111111116, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                    }
                    int i311111111111111116 = i4 << 3;
                    int i311111111111111117 = i4 >> 3;
                    int i311111111111111118 = i4 >> 9;
                    int i311111111111111119 = i30 << 21;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i311111111111111116 & 112) | 6 | (i311111111111111116 & 896) | (i311111111111111117 & 7168) | (57344 & i311111111111111118) | (458752 & i311111111111111118) | (3670016 & i311111111111111118) | (i311111111111111119 & 29360128) | (i311111111111111119 & 234881024) | (i311111111111111119 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i311111111111111118 & 7168) | (57344 & i311111111111111117) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function22 = function19;
                    function23 = function16;
                    textFieldColors2 = textFieldColorsColors;
                    function24 = function12;
                    function25 = function17;
                    paddingValues3 = paddingValues2;
                    function26 = function20;
                    function27 = function18;
                    function28 = function21;
                    function29 = function11;
                    z6 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i3111111111111111110) {
                                    if ((i3111111111111111110 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i3111111111111111110, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    } else {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i3111111111111111110) {
                                    if ((i3111111111111111110 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i3111111111111111110, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                    }
                    int i3111111111111111110 = i4 << 3;
                    int i3111111111111111111 = i4 >> 3;
                    int i3111111111111111112 = i4 >> 9;
                    int i3111111111111111113 = i30 << 21;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i3111111111111111110 & 112) | 6 | (i3111111111111111110 & 896) | (i3111111111111111111 & 7168) | (57344 & i3111111111111111112) | (458752 & i3111111111111111112) | (3670016 & i3111111111111111112) | (i3111111111111111113 & 29360128) | (i3111111111111111113 & 234881024) | (i3111111111111111113 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i3111111111111111112 & 7168) | (57344 & i3111111111111111111) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function22 = function19;
                    function23 = function16;
                    textFieldColors2 = textFieldColorsColors;
                    function24 = function12;
                    function25 = function17;
                    paddingValues3 = paddingValues2;
                    function26 = function20;
                    function27 = function18;
                    function28 = function21;
                    function29 = function11;
                    z6 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                        public final void invoke(Composer composer2, int i3111111111111111114) {
                            OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
            }
            i23 |= 384;
            i26 = i3 & 8192;
            if (i26 != 0) {
                if ((i2 & 3072) == 0) {
                    i23 |= composerStartRestartGroup.changedInstance(function9) ? 2048 : 1024;
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i7 = 16384;
                    }
                    i23 |= i7;
                }
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                    if ((i3 & 32768) == 0) {
                        i31 = 65536;
                    } else {
                        i31 = 65536;
                    }
                    i23 |= i31;
                }
                i27 = i3 & 65536;
                if (i27 != 0) {
                    i23 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (composerStartRestartGroup.changedInstance(function10)) {
                        i28 = 1048576;
                    } else {
                        i28 = 524288;
                    }
                    i23 |= i28;
                }
                if ((i3 & 131072) != 0) {
                    i23 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(this)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i23 |= i29;
                }
                if ((i4 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i3111111111111111114) {
                                    if ((i3111111111111111114 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i3111111111111111114, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    } else {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i3111111111111111114) {
                                    if ((i3111111111111111114 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i3111111111111111114, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                    }
                    int i3111111111111111114 = i4 << 3;
                    int i3111111111111111115 = i4 >> 3;
                    int i3111111111111111116 = i4 >> 9;
                    int i3111111111111111117 = i30 << 21;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i3111111111111111114 & 112) | 6 | (i3111111111111111114 & 896) | (i3111111111111111115 & 7168) | (57344 & i3111111111111111116) | (458752 & i3111111111111111116) | (3670016 & i3111111111111111116) | (i3111111111111111117 & 29360128) | (i3111111111111111117 & 234881024) | (i3111111111111111117 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i3111111111111111116 & 7168) | (57344 & i3111111111111111115) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function22 = function19;
                    function23 = function16;
                    textFieldColors2 = textFieldColorsColors;
                    function24 = function12;
                    function25 = function17;
                    paddingValues3 = paddingValues2;
                    function26 = function20;
                    function27 = function18;
                    function28 = function21;
                    function29 = function11;
                    z6 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i3111111111111111118) {
                                    if ((i3111111111111111118 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i3111111111111111118, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    } else {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i3111111111111111118) {
                                    if ((i3111111111111111118 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i3111111111111111118, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                    }
                    int i3111111111111111118 = i4 << 3;
                    int i3111111111111111119 = i4 >> 3;
                    int i31111111111111111110 = i4 >> 9;
                    int i31111111111111111111 = i30 << 21;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i3111111111111111118 & 112) | 6 | (i3111111111111111118 & 896) | (i3111111111111111119 & 7168) | (57344 & i31111111111111111110) | (458752 & i31111111111111111110) | (3670016 & i31111111111111111110) | (i31111111111111111111 & 29360128) | (i31111111111111111111 & 234881024) | (i31111111111111111111 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i31111111111111111110 & 7168) | (57344 & i3111111111111111119) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function22 = function19;
                    function23 = function16;
                    textFieldColors2 = textFieldColorsColors;
                    function24 = function12;
                    function25 = function17;
                    paddingValues3 = paddingValues2;
                    function26 = function20;
                    function27 = function18;
                    function28 = function21;
                    function29 = function11;
                    z6 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                        public final void invoke(Composer composer2, int i31111111111111111112) {
                            OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
            }
            i23 |= 3072;
            if ((i2 & 24576) != 0) {
                if ((i3 & 16384) == 0) {
                    i7 = 16384;
                }
                i23 |= i7;
            }
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                if ((i3 & 32768) == 0) {
                    i31 = 65536;
                } else {
                    i31 = 65536;
                }
                i23 |= i31;
            }
            i27 = i3 & 65536;
            if (i27 != 0) {
                i23 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (composerStartRestartGroup.changedInstance(function10)) {
                    i28 = 1048576;
                } else {
                    i28 = 524288;
                }
                i23 |= i28;
            }
            if ((i3 & 131072) != 0) {
                i23 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (composerStartRestartGroup.changed(this)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i23 |= i29;
            }
            if ((i4 & 306783379) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i14 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i16 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i18 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i21 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i24 != 0) {
                        function16 = null;
                    } else {
                        function16 = function8;
                    }
                    if (i26 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                        i23 &= -57345;
                    } else {
                        textFieldColorsColors = textFieldColors;
                    }
                    if ((i3 & 32768) != 0) {
                        paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i23 &= -458753;
                    } else {
                        paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i27 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i31111111111111111112) {
                                if ((i31111111111111111112 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1448570018, i31111111111111111112, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                    }
                                    OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                        });
                    } else {
                        composableLambda = function10;
                    }
                    function18 = function13;
                    function19 = function14;
                    function20 = composableLambda;
                    i30 = i23;
                    z5 = z4;
                    paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                    function21 = function15;
                } else {
                    if (i10 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i14 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i16 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i18 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i21 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i24 != 0) {
                        function16 = null;
                    } else {
                        function16 = function8;
                    }
                    if (i26 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                        i23 &= -57345;
                    } else {
                        textFieldColorsColors = textFieldColors;
                    }
                    if ((i3 & 32768) != 0) {
                        paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i23 &= -458753;
                    } else {
                        paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i27 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i31111111111111111112) {
                                if ((i31111111111111111112 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1448570018, i31111111111111111112, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                    }
                                    OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                        });
                    } else {
                        composableLambda = function10;
                    }
                    function18 = function13;
                    function19 = function14;
                    function20 = composableLambda;
                    i30 = i23;
                    z5 = z4;
                    paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                    function21 = function15;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                }
                int i31111111111111111112 = i4 << 3;
                int i31111111111111111113 = i4 >> 3;
                int i31111111111111111114 = i4 >> 9;
                int i31111111111111111115 = i30 << 21;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i31111111111111111112 & 112) | 6 | (i31111111111111111112 & 896) | (i31111111111111111113 & 7168) | (57344 & i31111111111111111114) | (458752 & i31111111111111111114) | (3670016 & i31111111111111111114) | (i31111111111111111115 & 29360128) | (i31111111111111111115 & 234881024) | (i31111111111111111115 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i31111111111111111114 & 7168) | (57344 & i31111111111111111113) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function22 = function19;
                function23 = function16;
                textFieldColors2 = textFieldColorsColors;
                function24 = function12;
                function25 = function17;
                paddingValues3 = paddingValues2;
                function26 = function20;
                function27 = function18;
                function28 = function21;
                function29 = function11;
                z6 = z5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i14 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i16 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i18 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i21 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i24 != 0) {
                        function16 = null;
                    } else {
                        function16 = function8;
                    }
                    if (i26 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                        i23 &= -57345;
                    } else {
                        textFieldColorsColors = textFieldColors;
                    }
                    if ((i3 & 32768) != 0) {
                        paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i23 &= -458753;
                    } else {
                        paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i27 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i31111111111111111116) {
                                if ((i31111111111111111116 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1448570018, i31111111111111111116, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                    }
                                    OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                        });
                    } else {
                        composableLambda = function10;
                    }
                    function18 = function13;
                    function19 = function14;
                    function20 = composableLambda;
                    i30 = i23;
                    z5 = z4;
                    paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                    function21 = function15;
                } else {
                    if (i10 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i14 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i16 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i18 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i21 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i24 != 0) {
                        function16 = null;
                    } else {
                        function16 = function8;
                    }
                    if (i26 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                        i23 &= -57345;
                    } else {
                        textFieldColorsColors = textFieldColors;
                    }
                    if ((i3 & 32768) != 0) {
                        paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i23 &= -458753;
                    } else {
                        paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i27 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i31111111111111111116) {
                                if ((i31111111111111111116 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1448570018, i31111111111111111116, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                    }
                                    OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                        });
                    } else {
                        composableLambda = function10;
                    }
                    function18 = function13;
                    function19 = function14;
                    function20 = composableLambda;
                    i30 = i23;
                    z5 = z4;
                    paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                    function21 = function15;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                }
                int i31111111111111111116 = i4 << 3;
                int i31111111111111111117 = i4 >> 3;
                int i31111111111111111118 = i4 >> 9;
                int i31111111111111111119 = i30 << 21;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i31111111111111111116 & 112) | 6 | (i31111111111111111116 & 896) | (i31111111111111111117 & 7168) | (57344 & i31111111111111111118) | (458752 & i31111111111111111118) | (3670016 & i31111111111111111118) | (i31111111111111111119 & 29360128) | (i31111111111111111119 & 234881024) | (i31111111111111111119 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i31111111111111111118 & 7168) | (57344 & i31111111111111111117) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function22 = function19;
                function23 = function16;
                textFieldColors2 = textFieldColorsColors;
                function24 = function12;
                function25 = function17;
                paddingValues3 = paddingValues2;
                function26 = function20;
                function27 = function18;
                function28 = function21;
                function29 = function11;
                z6 = z5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                    public final void invoke(Composer composer2, int i311111111111111111110) {
                        OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                    }
                });
            }
        }
        i4 |= 3072;
        i7 = 8192;
        if ((i3 & 16) != 0) {
            if ((i & 24576) == 0) {
                if (composerStartRestartGroup.changed(visualTransformation)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i4 |= i8;
            }
            if ((i3 & 32) != 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changed(interactionSource)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i4 |= i9;
            }
            i10 = i3 & 64;
            if (i10 != 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (composerStartRestartGroup.changed(z3)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i4 |= i11;
            }
            i12 = i3 & 128;
            if (i12 != 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i4 |= i13;
            }
            i14 = i3 & 256;
            if (i14 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i15 = 33554432;
                }
                i4 |= i15;
            }
            i16 = i3 & 512;
            if (i16 != 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i17 = 536870912;
                } else {
                    i17 = 268435456;
                }
                i4 |= i17;
            }
            i18 = i3 & 1024;
            if (i18 != 0) {
                i19 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (composerStartRestartGroup.changedInstance(function6)) {
                    i20 = 4;
                } else {
                    i20 = 2;
                }
                i19 = i2 | i20;
            } else {
                i19 = i2;
            }
            i21 = i3 & 2048;
            if (i21 != 0) {
                i19 |= 48;
            } else if ((i2 & 48) == 0) {
                if (composerStartRestartGroup.changedInstance(function7)) {
                    i22 = 32;
                } else {
                    i22 = 16;
                }
                i19 |= i22;
            }
            i23 = i19;
            i24 = i3 & 4096;
            if (i24 != 0) {
                if ((i2 & 384) == 0) {
                    if (composerStartRestartGroup.changedInstance(function8)) {
                        i25 = 256;
                    } else {
                        i25 = 128;
                    }
                    i23 |= i25;
                }
                i26 = i3 & 8192;
                if (i26 != 0) {
                    if ((i2 & 3072) == 0) {
                        i23 |= composerStartRestartGroup.changedInstance(function9) ? 2048 : 1024;
                    }
                    if ((i2 & 24576) != 0) {
                        if ((i3 & 16384) == 0) {
                            i7 = 16384;
                        }
                        i23 |= i7;
                    }
                    if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                        if ((i3 & 32768) == 0) {
                            i31 = 65536;
                        } else {
                            i31 = 65536;
                        }
                        i23 |= i31;
                    }
                    i27 = i3 & 65536;
                    if (i27 != 0) {
                        i23 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        if (composerStartRestartGroup.changedInstance(function10)) {
                            i28 = 1048576;
                        } else {
                            i28 = 524288;
                        }
                        i23 |= i28;
                    }
                    if ((i3 & 131072) != 0) {
                        i23 |= 12582912;
                    } else if ((i2 & 12582912) == 0) {
                        if (composerStartRestartGroup.changed(this)) {
                            i29 = 8388608;
                        } else {
                            i29 = 4194304;
                        }
                        i23 |= i29;
                    }
                    if ((i4 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i311111111111111111110) {
                                        if ((i311111111111111111110 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i311111111111111111110, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        } else {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i311111111111111111110) {
                                        if ((i311111111111111111110 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i311111111111111111110, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                        }
                        int i311111111111111111110 = i4 << 3;
                        int i311111111111111111111 = i4 >> 3;
                        int i311111111111111111112 = i4 >> 9;
                        int i311111111111111111113 = i30 << 21;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i311111111111111111110 & 112) | 6 | (i311111111111111111110 & 896) | (i311111111111111111111 & 7168) | (57344 & i311111111111111111112) | (458752 & i311111111111111111112) | (3670016 & i311111111111111111112) | (i311111111111111111113 & 29360128) | (i311111111111111111113 & 234881024) | (i311111111111111111113 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i311111111111111111112 & 7168) | (57344 & i311111111111111111111) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function22 = function19;
                        function23 = function16;
                        textFieldColors2 = textFieldColorsColors;
                        function24 = function12;
                        function25 = function17;
                        paddingValues3 = paddingValues2;
                        function26 = function20;
                        function27 = function18;
                        function28 = function21;
                        function29 = function11;
                        z6 = z5;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i311111111111111111114) {
                                        if ((i311111111111111111114 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i311111111111111111114, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        } else {
                            if (i10 != 0) {
                                z4 = false;
                            } else {
                                z4 = z3;
                            }
                            if (i12 != 0) {
                                function11 = null;
                            } else {
                                function11 = function3;
                            }
                            if (i14 != 0) {
                                function12 = null;
                            } else {
                                function12 = function4;
                            }
                            if (i16 != 0) {
                                function13 = null;
                            } else {
                                function13 = function5;
                            }
                            if (i18 != 0) {
                                function14 = null;
                            } else {
                                function14 = function6;
                            }
                            if (i21 != 0) {
                                function15 = null;
                            } else {
                                function15 = function7;
                            }
                            if (i24 != 0) {
                                function16 = null;
                            } else {
                                function16 = function8;
                            }
                            if (i26 == 0) {
                            }
                            if ((i3 & 16384) != 0) {
                                textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                                i23 &= -57345;
                            } else {
                                textFieldColorsColors = textFieldColors;
                            }
                            if ((i3 & 32768) != 0) {
                                paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                                i23 &= -458753;
                            } else {
                                paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                            }
                            if (i27 != 0) {
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer2, int i311111111111111111114) {
                                        if ((i311111111111111111114 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1448570018, i311111111111111111114, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                            }
                                            OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                                });
                            } else {
                                composableLambda = function10;
                            }
                            function18 = function13;
                            function19 = function14;
                            function20 = composableLambda;
                            i30 = i23;
                            z5 = z4;
                            paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                            function21 = function15;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                        }
                        int i311111111111111111114 = i4 << 3;
                        int i311111111111111111115 = i4 >> 3;
                        int i311111111111111111116 = i4 >> 9;
                        int i311111111111111111117 = i30 << 21;
                        TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i311111111111111111114 & 112) | 6 | (i311111111111111111114 & 896) | (i311111111111111111115 & 7168) | (57344 & i311111111111111111116) | (458752 & i311111111111111111116) | (3670016 & i311111111111111111116) | (i311111111111111111117 & 29360128) | (i311111111111111111117 & 234881024) | (i311111111111111111117 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i311111111111111111116 & 7168) | (57344 & i311111111111111111115) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function22 = function19;
                        function23 = function16;
                        textFieldColors2 = textFieldColorsColors;
                        function24 = function12;
                        function25 = function17;
                        paddingValues3 = paddingValues2;
                        function26 = function20;
                        function27 = function18;
                        function28 = function21;
                        function29 = function11;
                        z6 = z5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                            public final void invoke(Composer composer2, int i311111111111111111118) {
                                OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                    }
                }
                i23 |= 3072;
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i7 = 16384;
                    }
                    i23 |= i7;
                }
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                    if ((i3 & 32768) == 0) {
                        i31 = 65536;
                    } else {
                        i31 = 65536;
                    }
                    i23 |= i31;
                }
                i27 = i3 & 65536;
                if (i27 != 0) {
                    i23 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (composerStartRestartGroup.changedInstance(function10)) {
                        i28 = 1048576;
                    } else {
                        i28 = 524288;
                    }
                    i23 |= i28;
                }
                if ((i3 & 131072) != 0) {
                    i23 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(this)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i23 |= i29;
                }
                if ((i4 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i311111111111111111118) {
                                    if ((i311111111111111111118 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i311111111111111111118, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    } else {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i311111111111111111118) {
                                    if ((i311111111111111111118 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i311111111111111111118, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                    }
                    int i311111111111111111118 = i4 << 3;
                    int i311111111111111111119 = i4 >> 3;
                    int i3111111111111111111110 = i4 >> 9;
                    int i3111111111111111111111 = i30 << 21;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i311111111111111111118 & 112) | 6 | (i311111111111111111118 & 896) | (i311111111111111111119 & 7168) | (57344 & i3111111111111111111110) | (458752 & i3111111111111111111110) | (3670016 & i3111111111111111111110) | (i3111111111111111111111 & 29360128) | (i3111111111111111111111 & 234881024) | (i3111111111111111111111 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i3111111111111111111110 & 7168) | (57344 & i311111111111111111119) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function22 = function19;
                    function23 = function16;
                    textFieldColors2 = textFieldColorsColors;
                    function24 = function12;
                    function25 = function17;
                    paddingValues3 = paddingValues2;
                    function26 = function20;
                    function27 = function18;
                    function28 = function21;
                    function29 = function11;
                    z6 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i3111111111111111111112) {
                                    if ((i3111111111111111111112 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i3111111111111111111112, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    } else {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i3111111111111111111112) {
                                    if ((i3111111111111111111112 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i3111111111111111111112, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                    }
                    int i3111111111111111111112 = i4 << 3;
                    int i3111111111111111111113 = i4 >> 3;
                    int i3111111111111111111114 = i4 >> 9;
                    int i3111111111111111111115 = i30 << 21;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i3111111111111111111112 & 112) | 6 | (i3111111111111111111112 & 896) | (i3111111111111111111113 & 7168) | (57344 & i3111111111111111111114) | (458752 & i3111111111111111111114) | (3670016 & i3111111111111111111114) | (i3111111111111111111115 & 29360128) | (i3111111111111111111115 & 234881024) | (i3111111111111111111115 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i3111111111111111111114 & 7168) | (57344 & i3111111111111111111113) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function22 = function19;
                    function23 = function16;
                    textFieldColors2 = textFieldColorsColors;
                    function24 = function12;
                    function25 = function17;
                    paddingValues3 = paddingValues2;
                    function26 = function20;
                    function27 = function18;
                    function28 = function21;
                    function29 = function11;
                    z6 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                        public final void invoke(Composer composer2, int i3111111111111111111116) {
                            OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
            }
            i23 |= 384;
            i26 = i3 & 8192;
            if (i26 != 0) {
                if ((i2 & 3072) == 0) {
                    i23 |= composerStartRestartGroup.changedInstance(function9) ? 2048 : 1024;
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i7 = 16384;
                    }
                    i23 |= i7;
                }
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                    if ((i3 & 32768) == 0) {
                        i31 = 65536;
                    } else {
                        i31 = 65536;
                    }
                    i23 |= i31;
                }
                i27 = i3 & 65536;
                if (i27 != 0) {
                    i23 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (composerStartRestartGroup.changedInstance(function10)) {
                        i28 = 1048576;
                    } else {
                        i28 = 524288;
                    }
                    i23 |= i28;
                }
                if ((i3 & 131072) != 0) {
                    i23 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(this)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i23 |= i29;
                }
                if ((i4 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i3111111111111111111116) {
                                    if ((i3111111111111111111116 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i3111111111111111111116, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    } else {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i3111111111111111111116) {
                                    if ((i3111111111111111111116 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i3111111111111111111116, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                    }
                    int i3111111111111111111116 = i4 << 3;
                    int i3111111111111111111117 = i4 >> 3;
                    int i3111111111111111111118 = i4 >> 9;
                    int i3111111111111111111119 = i30 << 21;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i3111111111111111111116 & 112) | 6 | (i3111111111111111111116 & 896) | (i3111111111111111111117 & 7168) | (57344 & i3111111111111111111118) | (458752 & i3111111111111111111118) | (3670016 & i3111111111111111111118) | (i3111111111111111111119 & 29360128) | (i3111111111111111111119 & 234881024) | (i3111111111111111111119 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i3111111111111111111118 & 7168) | (57344 & i3111111111111111111117) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function22 = function19;
                    function23 = function16;
                    textFieldColors2 = textFieldColorsColors;
                    function24 = function12;
                    function25 = function17;
                    paddingValues3 = paddingValues2;
                    function26 = function20;
                    function27 = function18;
                    function28 = function21;
                    function29 = function11;
                    z6 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i31111111111111111111110) {
                                    if ((i31111111111111111111110 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i31111111111111111111110, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    } else {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i31111111111111111111110) {
                                    if ((i31111111111111111111110 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i31111111111111111111110, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                    }
                    int i31111111111111111111110 = i4 << 3;
                    int i31111111111111111111111 = i4 >> 3;
                    int i31111111111111111111112 = i4 >> 9;
                    int i31111111111111111111113 = i30 << 21;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i31111111111111111111110 & 112) | 6 | (i31111111111111111111110 & 896) | (i31111111111111111111111 & 7168) | (57344 & i31111111111111111111112) | (458752 & i31111111111111111111112) | (3670016 & i31111111111111111111112) | (i31111111111111111111113 & 29360128) | (i31111111111111111111113 & 234881024) | (i31111111111111111111113 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i31111111111111111111112 & 7168) | (57344 & i31111111111111111111111) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function22 = function19;
                    function23 = function16;
                    textFieldColors2 = textFieldColorsColors;
                    function24 = function12;
                    function25 = function17;
                    paddingValues3 = paddingValues2;
                    function26 = function20;
                    function27 = function18;
                    function28 = function21;
                    function29 = function11;
                    z6 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                        public final void invoke(Composer composer2, int i31111111111111111111114) {
                            OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
            }
            i23 |= 3072;
            if ((i2 & 24576) != 0) {
                if ((i3 & 16384) == 0) {
                    i7 = 16384;
                }
                i23 |= i7;
            }
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                if ((i3 & 32768) == 0) {
                    i31 = 65536;
                } else {
                    i31 = 65536;
                }
                i23 |= i31;
            }
            i27 = i3 & 65536;
            if (i27 != 0) {
                i23 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (composerStartRestartGroup.changedInstance(function10)) {
                    i28 = 1048576;
                } else {
                    i28 = 524288;
                }
                i23 |= i28;
            }
            if ((i3 & 131072) != 0) {
                i23 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (composerStartRestartGroup.changed(this)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i23 |= i29;
            }
            if ((i4 & 306783379) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i14 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i16 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i18 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i21 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i24 != 0) {
                        function16 = null;
                    } else {
                        function16 = function8;
                    }
                    if (i26 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                        i23 &= -57345;
                    } else {
                        textFieldColorsColors = textFieldColors;
                    }
                    if ((i3 & 32768) != 0) {
                        paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i23 &= -458753;
                    } else {
                        paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i27 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i31111111111111111111114) {
                                if ((i31111111111111111111114 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1448570018, i31111111111111111111114, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                    }
                                    OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                        });
                    } else {
                        composableLambda = function10;
                    }
                    function18 = function13;
                    function19 = function14;
                    function20 = composableLambda;
                    i30 = i23;
                    z5 = z4;
                    paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                    function21 = function15;
                } else {
                    if (i10 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i14 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i16 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i18 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i21 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i24 != 0) {
                        function16 = null;
                    } else {
                        function16 = function8;
                    }
                    if (i26 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                        i23 &= -57345;
                    } else {
                        textFieldColorsColors = textFieldColors;
                    }
                    if ((i3 & 32768) != 0) {
                        paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i23 &= -458753;
                    } else {
                        paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i27 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i31111111111111111111114) {
                                if ((i31111111111111111111114 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1448570018, i31111111111111111111114, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                    }
                                    OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                        });
                    } else {
                        composableLambda = function10;
                    }
                    function18 = function13;
                    function19 = function14;
                    function20 = composableLambda;
                    i30 = i23;
                    z5 = z4;
                    paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                    function21 = function15;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                }
                int i31111111111111111111114 = i4 << 3;
                int i31111111111111111111115 = i4 >> 3;
                int i31111111111111111111116 = i4 >> 9;
                int i31111111111111111111117 = i30 << 21;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i31111111111111111111114 & 112) | 6 | (i31111111111111111111114 & 896) | (i31111111111111111111115 & 7168) | (57344 & i31111111111111111111116) | (458752 & i31111111111111111111116) | (3670016 & i31111111111111111111116) | (i31111111111111111111117 & 29360128) | (i31111111111111111111117 & 234881024) | (i31111111111111111111117 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i31111111111111111111116 & 7168) | (57344 & i31111111111111111111115) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function22 = function19;
                function23 = function16;
                textFieldColors2 = textFieldColorsColors;
                function24 = function12;
                function25 = function17;
                paddingValues3 = paddingValues2;
                function26 = function20;
                function27 = function18;
                function28 = function21;
                function29 = function11;
                z6 = z5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i14 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i16 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i18 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i21 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i24 != 0) {
                        function16 = null;
                    } else {
                        function16 = function8;
                    }
                    if (i26 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                        i23 &= -57345;
                    } else {
                        textFieldColorsColors = textFieldColors;
                    }
                    if ((i3 & 32768) != 0) {
                        paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i23 &= -458753;
                    } else {
                        paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i27 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i31111111111111111111118) {
                                if ((i31111111111111111111118 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1448570018, i31111111111111111111118, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                    }
                                    OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                        });
                    } else {
                        composableLambda = function10;
                    }
                    function18 = function13;
                    function19 = function14;
                    function20 = composableLambda;
                    i30 = i23;
                    z5 = z4;
                    paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                    function21 = function15;
                } else {
                    if (i10 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i14 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i16 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i18 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i21 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i24 != 0) {
                        function16 = null;
                    } else {
                        function16 = function8;
                    }
                    if (i26 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                        i23 &= -57345;
                    } else {
                        textFieldColorsColors = textFieldColors;
                    }
                    if ((i3 & 32768) != 0) {
                        paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i23 &= -458753;
                    } else {
                        paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i27 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i31111111111111111111118) {
                                if ((i31111111111111111111118 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1448570018, i31111111111111111111118, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                    }
                                    OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                        });
                    } else {
                        composableLambda = function10;
                    }
                    function18 = function13;
                    function19 = function14;
                    function20 = composableLambda;
                    i30 = i23;
                    z5 = z4;
                    paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                    function21 = function15;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                }
                int i31111111111111111111118 = i4 << 3;
                int i31111111111111111111119 = i4 >> 3;
                int i311111111111111111111110 = i4 >> 9;
                int i311111111111111111111111 = i30 << 21;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i31111111111111111111118 & 112) | 6 | (i31111111111111111111118 & 896) | (i31111111111111111111119 & 7168) | (57344 & i311111111111111111111110) | (458752 & i311111111111111111111110) | (3670016 & i311111111111111111111110) | (i311111111111111111111111 & 29360128) | (i311111111111111111111111 & 234881024) | (i311111111111111111111111 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i311111111111111111111110 & 7168) | (57344 & i31111111111111111111119) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function22 = function19;
                function23 = function16;
                textFieldColors2 = textFieldColorsColors;
                function24 = function12;
                function25 = function17;
                paddingValues3 = paddingValues2;
                function26 = function20;
                function27 = function18;
                function28 = function21;
                function29 = function11;
                z6 = z5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                    public final void invoke(Composer composer2, int i311111111111111111111112) {
                        OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                    }
                });
            }
        }
        i4 |= 24576;
        if ((i3 & 32) != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            if (composerStartRestartGroup.changed(interactionSource)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i4 |= i9;
        }
        i10 = i3 & 64;
        if (i10 != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (composerStartRestartGroup.changed(z3)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i4 |= i11;
        }
        i12 = i3 & 128;
        if (i12 != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (composerStartRestartGroup.changedInstance(function3)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i4 |= i13;
        }
        i14 = i3 & 256;
        if (i14 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (composerStartRestartGroup.changedInstance(function4)) {
                i15 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i15 = 33554432;
            }
            i4 |= i15;
        }
        i16 = i3 & 512;
        if (i16 != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            if (composerStartRestartGroup.changedInstance(function5)) {
                i17 = 536870912;
            } else {
                i17 = 268435456;
            }
            i4 |= i17;
        }
        i18 = i3 & 1024;
        if (i18 != 0) {
            i19 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (composerStartRestartGroup.changedInstance(function6)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i19 = i2 | i20;
        } else {
            i19 = i2;
        }
        i21 = i3 & 2048;
        if (i21 != 0) {
            i19 |= 48;
        } else if ((i2 & 48) == 0) {
            if (composerStartRestartGroup.changedInstance(function7)) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i19 |= i22;
        }
        i23 = i19;
        i24 = i3 & 4096;
        if (i24 != 0) {
            if ((i2 & 384) == 0) {
                if (composerStartRestartGroup.changedInstance(function8)) {
                    i25 = 256;
                } else {
                    i25 = 128;
                }
                i23 |= i25;
            }
            i26 = i3 & 8192;
            if (i26 != 0) {
                if ((i2 & 3072) == 0) {
                    i23 |= composerStartRestartGroup.changedInstance(function9) ? 2048 : 1024;
                }
                if ((i2 & 24576) != 0) {
                    if ((i3 & 16384) == 0) {
                        i7 = 16384;
                    }
                    i23 |= i7;
                }
                if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                    if ((i3 & 32768) == 0) {
                        i31 = 65536;
                    } else {
                        i31 = 65536;
                    }
                    i23 |= i31;
                }
                i27 = i3 & 65536;
                if (i27 != 0) {
                    i23 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    if (composerStartRestartGroup.changedInstance(function10)) {
                        i28 = 1048576;
                    } else {
                        i28 = 524288;
                    }
                    i23 |= i28;
                }
                if ((i3 & 131072) != 0) {
                    i23 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    if (composerStartRestartGroup.changed(this)) {
                        i29 = 8388608;
                    } else {
                        i29 = 4194304;
                    }
                    i23 |= i29;
                }
                if ((i4 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i311111111111111111111112) {
                                    if ((i311111111111111111111112 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i311111111111111111111112, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    } else {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i311111111111111111111112) {
                                    if ((i311111111111111111111112 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i311111111111111111111112, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                    }
                    int i311111111111111111111112 = i4 << 3;
                    int i311111111111111111111113 = i4 >> 3;
                    int i311111111111111111111114 = i4 >> 9;
                    int i311111111111111111111115 = i30 << 21;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i311111111111111111111112 & 112) | 6 | (i311111111111111111111112 & 896) | (i311111111111111111111113 & 7168) | (57344 & i311111111111111111111114) | (458752 & i311111111111111111111114) | (3670016 & i311111111111111111111114) | (i311111111111111111111115 & 29360128) | (i311111111111111111111115 & 234881024) | (i311111111111111111111115 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i311111111111111111111114 & 7168) | (57344 & i311111111111111111111113) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function22 = function19;
                    function23 = function16;
                    textFieldColors2 = textFieldColorsColors;
                    function24 = function12;
                    function25 = function17;
                    paddingValues3 = paddingValues2;
                    function26 = function20;
                    function27 = function18;
                    function28 = function21;
                    function29 = function11;
                    z6 = z5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i311111111111111111111116) {
                                    if ((i311111111111111111111116 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i311111111111111111111116, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    } else {
                        if (i10 != 0) {
                            z4 = false;
                        } else {
                            z4 = z3;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        if (i14 != 0) {
                            function12 = null;
                        } else {
                            function12 = function4;
                        }
                        if (i16 != 0) {
                            function13 = null;
                        } else {
                            function13 = function5;
                        }
                        if (i18 != 0) {
                            function14 = null;
                        } else {
                            function14 = function6;
                        }
                        if (i21 != 0) {
                            function15 = null;
                        } else {
                            function15 = function7;
                        }
                        if (i24 != 0) {
                            function16 = null;
                        } else {
                            function16 = function8;
                        }
                        if (i26 == 0) {
                        }
                        if ((i3 & 16384) != 0) {
                            textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                            i23 &= -57345;
                        } else {
                            textFieldColorsColors = textFieldColors;
                        }
                        if ((i3 & 32768) != 0) {
                            paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                            i23 &= -458753;
                        } else {
                            paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                        }
                        if (i27 != 0) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i311111111111111111111116) {
                                    if ((i311111111111111111111116 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1448570018, i311111111111111111111116, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                        }
                                        OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                            });
                        } else {
                            composableLambda = function10;
                        }
                        function18 = function13;
                        function19 = function14;
                        function20 = composableLambda;
                        i30 = i23;
                        z5 = z4;
                        paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                        function21 = function15;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                    }
                    int i311111111111111111111116 = i4 << 3;
                    int i311111111111111111111117 = i4 >> 3;
                    int i311111111111111111111118 = i4 >> 9;
                    int i311111111111111111111119 = i30 << 21;
                    TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i311111111111111111111116 & 112) | 6 | (i311111111111111111111116 & 896) | (i311111111111111111111117 & 7168) | (57344 & i311111111111111111111118) | (458752 & i311111111111111111111118) | (3670016 & i311111111111111111111118) | (i311111111111111111111119 & 29360128) | (i311111111111111111111119 & 234881024) | (i311111111111111111111119 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i311111111111111111111118 & 7168) | (57344 & i311111111111111111111117) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function22 = function19;
                    function23 = function16;
                    textFieldColors2 = textFieldColorsColors;
                    function24 = function12;
                    function25 = function17;
                    paddingValues3 = paddingValues2;
                    function26 = function20;
                    function27 = function18;
                    function28 = function21;
                    function29 = function11;
                    z6 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                        public final void invoke(Composer composer2, int i3111111111111111111111110) {
                            OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                        }
                    });
                }
            }
            i23 |= 3072;
            if ((i2 & 24576) != 0) {
                if ((i3 & 16384) == 0) {
                    i7 = 16384;
                }
                i23 |= i7;
            }
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                if ((i3 & 32768) == 0) {
                    i31 = 65536;
                } else {
                    i31 = 65536;
                }
                i23 |= i31;
            }
            i27 = i3 & 65536;
            if (i27 != 0) {
                i23 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (composerStartRestartGroup.changedInstance(function10)) {
                    i28 = 1048576;
                } else {
                    i28 = 524288;
                }
                i23 |= i28;
            }
            if ((i3 & 131072) != 0) {
                i23 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (composerStartRestartGroup.changed(this)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i23 |= i29;
            }
            if ((i4 & 306783379) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i14 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i16 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i18 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i21 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i24 != 0) {
                        function16 = null;
                    } else {
                        function16 = function8;
                    }
                    if (i26 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                        i23 &= -57345;
                    } else {
                        textFieldColorsColors = textFieldColors;
                    }
                    if ((i3 & 32768) != 0) {
                        paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i23 &= -458753;
                    } else {
                        paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i27 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i3111111111111111111111110) {
                                if ((i3111111111111111111111110 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1448570018, i3111111111111111111111110, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                    }
                                    OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                        });
                    } else {
                        composableLambda = function10;
                    }
                    function18 = function13;
                    function19 = function14;
                    function20 = composableLambda;
                    i30 = i23;
                    z5 = z4;
                    paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                    function21 = function15;
                } else {
                    if (i10 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i14 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i16 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i18 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i21 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i24 != 0) {
                        function16 = null;
                    } else {
                        function16 = function8;
                    }
                    if (i26 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                        i23 &= -57345;
                    } else {
                        textFieldColorsColors = textFieldColors;
                    }
                    if ((i3 & 32768) != 0) {
                        paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i23 &= -458753;
                    } else {
                        paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i27 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i3111111111111111111111110) {
                                if ((i3111111111111111111111110 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1448570018, i3111111111111111111111110, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                    }
                                    OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                        });
                    } else {
                        composableLambda = function10;
                    }
                    function18 = function13;
                    function19 = function14;
                    function20 = composableLambda;
                    i30 = i23;
                    z5 = z4;
                    paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                    function21 = function15;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                }
                int i3111111111111111111111110 = i4 << 3;
                int i3111111111111111111111111 = i4 >> 3;
                int i3111111111111111111111112 = i4 >> 9;
                int i3111111111111111111111113 = i30 << 21;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i3111111111111111111111110 & 112) | 6 | (i3111111111111111111111110 & 896) | (i3111111111111111111111111 & 7168) | (57344 & i3111111111111111111111112) | (458752 & i3111111111111111111111112) | (3670016 & i3111111111111111111111112) | (i3111111111111111111111113 & 29360128) | (i3111111111111111111111113 & 234881024) | (i3111111111111111111111113 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i3111111111111111111111112 & 7168) | (57344 & i3111111111111111111111111) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function22 = function19;
                function23 = function16;
                textFieldColors2 = textFieldColorsColors;
                function24 = function12;
                function25 = function17;
                paddingValues3 = paddingValues2;
                function26 = function20;
                function27 = function18;
                function28 = function21;
                function29 = function11;
                z6 = z5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i14 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i16 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i18 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i21 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i24 != 0) {
                        function16 = null;
                    } else {
                        function16 = function8;
                    }
                    if (i26 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                        i23 &= -57345;
                    } else {
                        textFieldColorsColors = textFieldColors;
                    }
                    if ((i3 & 32768) != 0) {
                        paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i23 &= -458753;
                    } else {
                        paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i27 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i3111111111111111111111114) {
                                if ((i3111111111111111111111114 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1448570018, i3111111111111111111111114, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                    }
                                    OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                        });
                    } else {
                        composableLambda = function10;
                    }
                    function18 = function13;
                    function19 = function14;
                    function20 = composableLambda;
                    i30 = i23;
                    z5 = z4;
                    paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                    function21 = function15;
                } else {
                    if (i10 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i14 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i16 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i18 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i21 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i24 != 0) {
                        function16 = null;
                    } else {
                        function16 = function8;
                    }
                    if (i26 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                        i23 &= -57345;
                    } else {
                        textFieldColorsColors = textFieldColors;
                    }
                    if ((i3 & 32768) != 0) {
                        paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i23 &= -458753;
                    } else {
                        paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i27 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i3111111111111111111111114) {
                                if ((i3111111111111111111111114 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1448570018, i3111111111111111111111114, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                    }
                                    OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                        });
                    } else {
                        composableLambda = function10;
                    }
                    function18 = function13;
                    function19 = function14;
                    function20 = composableLambda;
                    i30 = i23;
                    z5 = z4;
                    paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                    function21 = function15;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                }
                int i3111111111111111111111114 = i4 << 3;
                int i3111111111111111111111115 = i4 >> 3;
                int i3111111111111111111111116 = i4 >> 9;
                int i3111111111111111111111117 = i30 << 21;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i3111111111111111111111114 & 112) | 6 | (i3111111111111111111111114 & 896) | (i3111111111111111111111115 & 7168) | (57344 & i3111111111111111111111116) | (458752 & i3111111111111111111111116) | (3670016 & i3111111111111111111111116) | (i3111111111111111111111117 & 29360128) | (i3111111111111111111111117 & 234881024) | (i3111111111111111111111117 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i3111111111111111111111116 & 7168) | (57344 & i3111111111111111111111115) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function22 = function19;
                function23 = function16;
                textFieldColors2 = textFieldColorsColors;
                function24 = function12;
                function25 = function17;
                paddingValues3 = paddingValues2;
                function26 = function20;
                function27 = function18;
                function28 = function21;
                function29 = function11;
                z6 = z5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                    public final void invoke(Composer composer2, int i3111111111111111111111118) {
                        OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                    }
                });
            }
        }
        i23 |= 384;
        i26 = i3 & 8192;
        if (i26 != 0) {
            if ((i2 & 3072) == 0) {
                i23 |= composerStartRestartGroup.changedInstance(function9) ? 2048 : 1024;
            }
            if ((i2 & 24576) != 0) {
                if ((i3 & 16384) == 0) {
                    i7 = 16384;
                }
                i23 |= i7;
            }
            if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
                if ((i3 & 32768) == 0) {
                    i31 = 65536;
                } else {
                    i31 = 65536;
                }
                i23 |= i31;
            }
            i27 = i3 & 65536;
            if (i27 != 0) {
                i23 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                if (composerStartRestartGroup.changedInstance(function10)) {
                    i28 = 1048576;
                } else {
                    i28 = 524288;
                }
                i23 |= i28;
            }
            if ((i3 & 131072) != 0) {
                i23 |= 12582912;
            } else if ((i2 & 12582912) == 0) {
                if (composerStartRestartGroup.changed(this)) {
                    i29 = 8388608;
                } else {
                    i29 = 4194304;
                }
                i23 |= i29;
            }
            if ((i4 & 306783379) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i14 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i16 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i18 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i21 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i24 != 0) {
                        function16 = null;
                    } else {
                        function16 = function8;
                    }
                    if (i26 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                        i23 &= -57345;
                    } else {
                        textFieldColorsColors = textFieldColors;
                    }
                    if ((i3 & 32768) != 0) {
                        paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i23 &= -458753;
                    } else {
                        paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i27 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i3111111111111111111111118) {
                                if ((i3111111111111111111111118 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1448570018, i3111111111111111111111118, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                    }
                                    OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                        });
                    } else {
                        composableLambda = function10;
                    }
                    function18 = function13;
                    function19 = function14;
                    function20 = composableLambda;
                    i30 = i23;
                    z5 = z4;
                    paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                    function21 = function15;
                } else {
                    if (i10 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i14 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i16 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i18 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i21 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i24 != 0) {
                        function16 = null;
                    } else {
                        function16 = function8;
                    }
                    if (i26 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                        i23 &= -57345;
                    } else {
                        textFieldColorsColors = textFieldColors;
                    }
                    if ((i3 & 32768) != 0) {
                        paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i23 &= -458753;
                    } else {
                        paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i27 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i3111111111111111111111118) {
                                if ((i3111111111111111111111118 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1448570018, i3111111111111111111111118, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                    }
                                    OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                        });
                    } else {
                        composableLambda = function10;
                    }
                    function18 = function13;
                    function19 = function14;
                    function20 = composableLambda;
                    i30 = i23;
                    z5 = z4;
                    paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                    function21 = function15;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                }
                int i3111111111111111111111118 = i4 << 3;
                int i3111111111111111111111119 = i4 >> 3;
                int i31111111111111111111111110 = i4 >> 9;
                int i31111111111111111111111111 = i30 << 21;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i3111111111111111111111118 & 112) | 6 | (i3111111111111111111111118 & 896) | (i3111111111111111111111119 & 7168) | (57344 & i31111111111111111111111110) | (458752 & i31111111111111111111111110) | (3670016 & i31111111111111111111111110) | (i31111111111111111111111111 & 29360128) | (i31111111111111111111111111 & 234881024) | (i31111111111111111111111111 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i31111111111111111111111110 & 7168) | (57344 & i3111111111111111111111119) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function22 = function19;
                function23 = function16;
                textFieldColors2 = textFieldColorsColors;
                function24 = function12;
                function25 = function17;
                paddingValues3 = paddingValues2;
                function26 = function20;
                function27 = function18;
                function28 = function21;
                function29 = function11;
                z6 = z5;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i10 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i14 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i16 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i18 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i21 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i24 != 0) {
                        function16 = null;
                    } else {
                        function16 = function8;
                    }
                    if (i26 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                        i23 &= -57345;
                    } else {
                        textFieldColorsColors = textFieldColors;
                    }
                    if ((i3 & 32768) != 0) {
                        paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i23 &= -458753;
                    } else {
                        paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i27 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i31111111111111111111111112) {
                                if ((i31111111111111111111111112 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1448570018, i31111111111111111111111112, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                    }
                                    OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                        });
                    } else {
                        composableLambda = function10;
                    }
                    function18 = function13;
                    function19 = function14;
                    function20 = composableLambda;
                    i30 = i23;
                    z5 = z4;
                    paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                    function21 = function15;
                } else {
                    if (i10 != 0) {
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    if (i14 != 0) {
                        function12 = null;
                    } else {
                        function12 = function4;
                    }
                    if (i16 != 0) {
                        function13 = null;
                    } else {
                        function13 = function5;
                    }
                    if (i18 != 0) {
                        function14 = null;
                    } else {
                        function14 = function6;
                    }
                    if (i21 != 0) {
                        function15 = null;
                    } else {
                        function15 = function7;
                    }
                    if (i24 != 0) {
                        function16 = null;
                    } else {
                        function16 = function8;
                    }
                    if (i26 == 0) {
                    }
                    if ((i3 & 16384) != 0) {
                        textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                        i23 &= -57345;
                    } else {
                        textFieldColorsColors = textFieldColors;
                    }
                    if ((i3 & 32768) != 0) {
                        paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                        i23 &= -458753;
                    } else {
                        paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                    }
                    if (i27 != 0) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i31111111111111111111111112) {
                                if ((i31111111111111111111111112 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1448570018, i31111111111111111111111112, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                    }
                                    OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                        });
                    } else {
                        composableLambda = function10;
                    }
                    function18 = function13;
                    function19 = function14;
                    function20 = composableLambda;
                    i30 = i23;
                    z5 = z4;
                    paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                    function21 = function15;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
                }
                int i31111111111111111111111112 = i4 << 3;
                int i31111111111111111111111113 = i4 >> 3;
                int i31111111111111111111111114 = i4 >> 9;
                int i31111111111111111111111115 = i30 << 21;
                TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i31111111111111111111111112 & 112) | 6 | (i31111111111111111111111112 & 896) | (i31111111111111111111111113 & 7168) | (57344 & i31111111111111111111111114) | (458752 & i31111111111111111111111114) | (3670016 & i31111111111111111111111114) | (i31111111111111111111111115 & 29360128) | (i31111111111111111111111115 & 234881024) | (i31111111111111111111111115 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i31111111111111111111111114 & 7168) | (57344 & i31111111111111111111111113) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function22 = function19;
                function23 = function16;
                textFieldColors2 = textFieldColorsColors;
                function24 = function12;
                function25 = function17;
                paddingValues3 = paddingValues2;
                function26 = function20;
                function27 = function18;
                function28 = function21;
                function29 = function11;
                z6 = z5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                    public final void invoke(Composer composer2, int i31111111111111111111111116) {
                        OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                    }
                });
            }
        }
        i23 |= 3072;
        if ((i2 & 24576) != 0) {
            if ((i3 & 16384) == 0) {
                i7 = 16384;
            }
            i23 |= i7;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) != 0) {
            if ((i3 & 32768) == 0) {
                i31 = 65536;
            } else {
                i31 = 65536;
            }
            i23 |= i31;
        }
        i27 = i3 & 65536;
        if (i27 != 0) {
            i23 |= 1572864;
        } else if ((i2 & 1572864) == 0) {
            if (composerStartRestartGroup.changedInstance(function10)) {
                i28 = 1048576;
            } else {
                i28 = 524288;
            }
            i23 |= i28;
        }
        if ((i3 & 131072) != 0) {
            i23 |= 12582912;
        } else if ((i2 & 12582912) == 0) {
            if (composerStartRestartGroup.changed(this)) {
                i29 = 8388608;
            } else {
                i29 = 4194304;
            }
            i23 |= i29;
        }
        if ((i4 & 306783379) == 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                if (i12 != 0) {
                    function11 = null;
                } else {
                    function11 = function3;
                }
                if (i14 != 0) {
                    function12 = null;
                } else {
                    function12 = function4;
                }
                if (i16 != 0) {
                    function13 = null;
                } else {
                    function13 = function5;
                }
                if (i18 != 0) {
                    function14 = null;
                } else {
                    function14 = function6;
                }
                if (i21 != 0) {
                    function15 = null;
                } else {
                    function15 = function7;
                }
                if (i24 != 0) {
                    function16 = null;
                } else {
                    function16 = function8;
                }
                if (i26 == 0) {
                }
                if ((i3 & 16384) != 0) {
                    textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                    i23 &= -57345;
                } else {
                    textFieldColorsColors = textFieldColors;
                }
                if ((i3 & 32768) != 0) {
                    paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    i23 &= -458753;
                } else {
                    paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                }
                if (i27 != 0) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i31111111111111111111111116) {
                            if ((i31111111111111111111111116 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1448570018, i31111111111111111111111116, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                }
                                OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                    });
                } else {
                    composableLambda = function10;
                }
                function18 = function13;
                function19 = function14;
                function20 = composableLambda;
                i30 = i23;
                z5 = z4;
                paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                function21 = function15;
            } else {
                if (i10 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                if (i12 != 0) {
                    function11 = null;
                } else {
                    function11 = function3;
                }
                if (i14 != 0) {
                    function12 = null;
                } else {
                    function12 = function4;
                }
                if (i16 != 0) {
                    function13 = null;
                } else {
                    function13 = function5;
                }
                if (i18 != 0) {
                    function14 = null;
                } else {
                    function14 = function6;
                }
                if (i21 != 0) {
                    function15 = null;
                } else {
                    function15 = function7;
                }
                if (i24 != 0) {
                    function16 = null;
                } else {
                    function16 = function8;
                }
                if (i26 == 0) {
                }
                if ((i3 & 16384) != 0) {
                    textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                    i23 &= -57345;
                } else {
                    textFieldColorsColors = textFieldColors;
                }
                if ((i3 & 32768) != 0) {
                    paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    i23 &= -458753;
                } else {
                    paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                }
                if (i27 != 0) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i31111111111111111111111116) {
                            if ((i31111111111111111111111116 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1448570018, i31111111111111111111111116, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                }
                                OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                    });
                } else {
                    composableLambda = function10;
                }
                function18 = function13;
                function19 = function14;
                function20 = composableLambda;
                i30 = i23;
                z5 = z4;
                paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                function21 = function15;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
            }
            int i31111111111111111111111116 = i4 << 3;
            int i31111111111111111111111117 = i4 >> 3;
            int i31111111111111111111111118 = i4 >> 9;
            int i31111111111111111111111119 = i30 << 21;
            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i31111111111111111111111116 & 112) | 6 | (i31111111111111111111111116 & 896) | (i31111111111111111111111117 & 7168) | (57344 & i31111111111111111111111118) | (458752 & i31111111111111111111111118) | (3670016 & i31111111111111111111111118) | (i31111111111111111111111119 & 29360128) | (i31111111111111111111111119 & 234881024) | (i31111111111111111111111119 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i31111111111111111111111118 & 7168) | (57344 & i31111111111111111111111117) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function22 = function19;
            function23 = function16;
            textFieldColors2 = textFieldColorsColors;
            function24 = function12;
            function25 = function17;
            paddingValues3 = paddingValues2;
            function26 = function20;
            function27 = function18;
            function28 = function21;
            function29 = function11;
            z6 = z5;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                if (i12 != 0) {
                    function11 = null;
                } else {
                    function11 = function3;
                }
                if (i14 != 0) {
                    function12 = null;
                } else {
                    function12 = function4;
                }
                if (i16 != 0) {
                    function13 = null;
                } else {
                    function13 = function5;
                }
                if (i18 != 0) {
                    function14 = null;
                } else {
                    function14 = function6;
                }
                if (i21 != 0) {
                    function15 = null;
                } else {
                    function15 = function7;
                }
                if (i24 != 0) {
                    function16 = null;
                } else {
                    function16 = function8;
                }
                if (i26 == 0) {
                }
                if ((i3 & 16384) != 0) {
                    textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                    i23 &= -57345;
                } else {
                    textFieldColorsColors = textFieldColors;
                }
                if ((i3 & 32768) != 0) {
                    paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    i23 &= -458753;
                } else {
                    paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                }
                if (i27 != 0) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i311111111111111111111111110) {
                            if ((i311111111111111111111111110 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1448570018, i311111111111111111111111110, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                }
                                OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                    });
                } else {
                    composableLambda = function10;
                }
                function18 = function13;
                function19 = function14;
                function20 = composableLambda;
                i30 = i23;
                z5 = z4;
                paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                function21 = function15;
            } else {
                if (i10 != 0) {
                    z4 = false;
                } else {
                    z4 = z3;
                }
                if (i12 != 0) {
                    function11 = null;
                } else {
                    function11 = function3;
                }
                if (i14 != 0) {
                    function12 = null;
                } else {
                    function12 = function4;
                }
                if (i16 != 0) {
                    function13 = null;
                } else {
                    function13 = function5;
                }
                if (i18 != 0) {
                    function14 = null;
                } else {
                    function14 = function6;
                }
                if (i21 != 0) {
                    function15 = null;
                } else {
                    function15 = function7;
                }
                if (i24 != 0) {
                    function16 = null;
                } else {
                    function16 = function8;
                }
                if (i26 == 0) {
                }
                if ((i3 & 16384) != 0) {
                    textFieldColorsColors = colors(composerStartRestartGroup, (i23 >> 21) & 14);
                    i23 &= -57345;
                } else {
                    textFieldColorsColors = textFieldColors;
                }
                if ((i3 & 32768) != 0) {
                    paddingValuesM2254contentPaddinga9UjIt4$default = m2254contentPaddinga9UjIt4$default(this, 0.0f, 0.0f, 0.0f, 0.0f, 15, null);
                    i23 &= -458753;
                } else {
                    paddingValuesM2254contentPaddinga9UjIt4$default = paddingValues;
                }
                if (i27 != 0) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1448570018, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i311111111111111111111111110) {
                            if ((i311111111111111111111111110 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1448570018, i311111111111111111111111110, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.<anonymous> (TextFieldDefaults.kt:1781)");
                                }
                                OutlinedTextFieldDefaults.INSTANCE.m2255ContainerBoxnbWgWpA(z, z4, interactionSource, textFieldColorsColors, null, 0.0f, 0.0f, composer2, 12582912, 112);
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
                    });
                } else {
                    composableLambda = function10;
                }
                function18 = function13;
                function19 = function14;
                function20 = composableLambda;
                i30 = i23;
                z5 = z4;
                paddingValues2 = paddingValuesM2254contentPaddinga9UjIt4$default;
                function21 = function15;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-350442135, i4, i30, "androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox (TextFieldDefaults.kt:1788)");
            }
            int i311111111111111111111111110 = i4 << 3;
            int i311111111111111111111111111 = i4 >> 3;
            int i311111111111111111111111112 = i4 >> 9;
            int i311111111111111111111111113 = i30 << 21;
            TextFieldImplKt.CommonDecorationBox(TextFieldType.Outlined, str, function2, visualTransformation, function11, function12, function18, function19, function21, function16, function17, z2, z, z5, interactionSource, paddingValues2, textFieldColorsColors, function20, composerStartRestartGroup, (i311111111111111111111111110 & 112) | 6 | (i311111111111111111111111110 & 896) | (i311111111111111111111111111 & 7168) | (57344 & i311111111111111111111111112) | (458752 & i311111111111111111111111112) | (3670016 & i311111111111111111111111112) | (i311111111111111111111111113 & 29360128) | (i311111111111111111111111113 & 234881024) | (i311111111111111111111111113 & 1879048192), (i4 & 896) | ((i30 >> 9) & 14) | ((i4 >> 6) & 112) | (i311111111111111111111111112 & 7168) | (57344 & i311111111111111111111111111) | (458752 & i30) | ((i30 << 6) & 3670016) | ((i30 << 3) & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function22 = function19;
            function23 = function16;
            textFieldColors2 = textFieldColorsColors;
            function24 = function12;
            function25 = function17;
            paddingValues3 = paddingValues2;
            function26 = function20;
            function27 = function18;
            function28 = function21;
            function29 = function11;
            z6 = z5;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox.2
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

                public final void invoke(Composer composer2, int i311111111111111111111111114) {
                    OutlinedTextFieldDefaults.this.DecorationBox(str, function2, z, z2, visualTransformation, interactionSource, z6, function29, function24, function27, function22, function28, function23, function25, textFieldColors2, paddingValues3, function26, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                }
            });
        }
    }
}
