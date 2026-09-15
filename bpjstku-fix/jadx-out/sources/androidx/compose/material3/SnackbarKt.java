package androidx.compose.material3;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.SnackbarTokens;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001ae\u0010\n\u001a\u00020\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000e2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000e2\u0013\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0003ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001ag\u0010\u0018\u001a\u00020\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000e2\u0013\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0013\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0003ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0017\u001aj\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u00142\b\b\u0002\u0010&\u001a\u00020\u00142\b\b\u0002\u0010'\u001a\u00020\u00142\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a\u0099\u0001\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020 2\u0015\b\u0002\u0010\u000f\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r¢\u0006\u0002\b\u000e2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u00142\b\b\u0002\u0010&\u001a\u00020\u00142\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u0011\u0010*\u001a\r\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010,\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"ContainerMaxWidth", "Landroidx/compose/ui/unit/Dp;", "F", "HeightToFirstLine", "HorizontalSpacing", "HorizontalSpacingButtonSide", "LongButtonVerticalOffset", "SeparateButtonExtraY", "SnackbarVerticalPadding", "TextEndExtraSpacing", "NewLineButtonSnackbar", "", "text", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "action", "dismissAction", "actionTextStyle", "Landroidx/compose/ui/text/TextStyle;", "actionContentColor", "Landroidx/compose/ui/graphics/Color;", "dismissActionContentColor", "NewLineButtonSnackbar-kKq0p4A", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/text/TextStyle;JJLandroidx/compose/runtime/Composer;I)V", "OneRowSnackbar", "actionTextColor", "dismissActionColor", "OneRowSnackbar-kKq0p4A", "Snackbar", "snackbarData", "Landroidx/compose/material3/SnackbarData;", "modifier", "Landroidx/compose/ui/Modifier;", "actionOnNewLine", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "contentColor", "actionColor", "Snackbar-sDKtq54", "(Landroidx/compose/material3/SnackbarData;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJJJJLandroidx/compose/runtime/Composer;II)V", FirebaseAnalytics.Param.CONTENT, "Snackbar-eQBnUkQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/graphics/Shape;JJJJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SnackbarKt {
    private static final float ContainerMaxWidth = Dp.m6935constructorimpl(600.0f);
    private static final float HeightToFirstLine = Dp.m6935constructorimpl(30.0f);
    private static final float HorizontalSpacing = Dp.m6935constructorimpl(16.0f);
    private static final float HorizontalSpacingButtonSide = Dp.m6935constructorimpl(8.0f);
    private static final float SeparateButtonExtraY = Dp.m6935constructorimpl(2.0f);
    private static final float SnackbarVerticalPadding = Dp.m6935constructorimpl(6.0f);
    private static final float TextEndExtraSpacing = Dp.m6935constructorimpl(8.0f);
    private static final float LongButtonVerticalOffset = Dp.m6935constructorimpl(12.0f);

    /* JADX WARN: Code duplicated, block: B:100:0x010e  */
    /* JADX WARN: Code duplicated, block: B:101:0x0111  */
    /* JADX WARN: Code duplicated, block: B:103:0x0115  */
    /* JADX WARN: Code duplicated, block: B:105:0x011d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0120  */
    /* JADX WARN: Code duplicated, block: B:111:0x0131  */
    /* JADX WARN: Code duplicated, block: B:114:0x0149  */
    /* JADX WARN: Code duplicated, block: B:116:0x015f  */
    /* JADX WARN: Code duplicated, block: B:134:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x0193  */
    /* JADX WARN: Code duplicated, block: B:136:0x0198  */
    /* JADX WARN: Code duplicated, block: B:139:0x019d  */
    /* JADX WARN: Code duplicated, block: B:141:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:144:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:148:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:151:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:154:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:155:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:158:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:159:0x01df  */
    /* JADX WARN: Code duplicated, block: B:162:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:165:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:168:0x025a  */
    /* JADX WARN: Code duplicated, block: B:172:0x026e  */
    /* JADX WARN: Code duplicated, block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00df  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:95:0x0102  */
    /* JADX WARN: Code duplicated, block: B:97:0x0106  */
    /* JADX INFO: renamed from: Snackbar-eQBnUkQ, reason: not valid java name */
    public static final void m2422SnackbareQBnUkQ(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, boolean z, Shape shape, long j, long j2, long j3, long j4, final Function2<? super Composer, ? super Integer, Unit> function4, Composer composer, final int i, final int i2) {
        int i3;
        Function2<? super Composer, ? super Integer, Unit> function5;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function6;
        int i5;
        int i6;
        int i7;
        long color;
        long dismissActionContentColor;
        int i8;
        Modifier.Companion companion;
        Function2<? super Composer, ? super Integer, Unit> function7;
        boolean z2;
        Shape shape2;
        long contentColor;
        long actionContentColor;
        final Function2<? super Composer, ? super Integer, Unit> function8;
        Modifier modifier2;
        final boolean z3;
        final Shape shape3;
        long j5;
        final long j6;
        final long j7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i9;
        int i10;
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1235788955);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 == 0) {
            if ((i & 48) == 0) {
                function5 = function2;
                i3 |= composerStartRestartGroup.changedInstance(function5) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    function6 = function3;
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 8;
                if (i6 != 0) {
                    if ((i & 3072) == 0) {
                        if (composerStartRestartGroup.changed(z)) {
                            i7 = 2048;
                        } else {
                            i7 = 1024;
                        }
                        i3 |= i7;
                    }
                    if ((i & 24576) != 0) {
                        i3 |= ((i2 & 16) == 0 || !composerStartRestartGroup.changed(shape)) ? 8192 : 16384;
                    }
                    if ((196608 & i) == 0) {
                        if ((i2 & 32) == 0) {
                            color = j;
                            int i14 = composerStartRestartGroup.changed(color) ? 131072 : 65536;
                            i3 |= i14;
                        } else {
                            color = j;
                        }
                        i3 |= i14;
                    } else {
                        color = j;
                    }
                    if ((i & 1572864) != 0) {
                        if ((i2 & 64) == 0 || !composerStartRestartGroup.changed(j2)) {
                            i11 = 524288;
                        } else {
                            i11 = 1048576;
                        }
                        i3 |= i11;
                    }
                    if ((i & 12582912) != 0) {
                        if ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j3)) {
                            i10 = 4194304;
                        } else {
                            i10 = 8388608;
                        }
                        i3 |= i10;
                    }
                    if ((100663296 & i) == 0) {
                        dismissActionContentColor = j4;
                        if ((i2 & 256) == 0 || !composerStartRestartGroup.changed(dismissActionContentColor)) {
                            i9 = 33554432;
                        } else {
                            i9 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        }
                        i3 |= i9;
                    } else {
                        dismissActionContentColor = j4;
                    }
                    if ((i2 & 512) != 0) {
                        if ((i & 805306368) == 0) {
                            if (composerStartRestartGroup.changedInstance(function4)) {
                                i8 = 536870912;
                            } else {
                                i8 = 268435456;
                            }
                            i3 |= i8;
                        }
                        if ((i3 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i12 != 0) {
                                    companion = Modifier.INSTANCE;
                                } else {
                                    companion = modifier;
                                }
                                if (i13 != 0) {
                                    function5 = null;
                                }
                                function7 = i4 == 0 ? function6 : null;
                                if (i6 != 0) {
                                    z2 = false;
                                } else {
                                    z2 = z;
                                }
                                if ((i2 & 16) != 0) {
                                    shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                    i3 &= -57345;
                                } else {
                                    shape2 = shape;
                                }
                                if ((i2 & 32) != 0) {
                                    color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                    i3 &= -458753;
                                }
                                if ((i2 & 64) != 0) {
                                    contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                    i3 &= -3670017;
                                } else {
                                    contentColor = j2;
                                }
                                if ((i2 & 128) != 0) {
                                    actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                    i3 &= -29360129;
                                } else {
                                    actionContentColor = j3;
                                }
                                if ((i2 & 256) != 0) {
                                    i3 &= -234881025;
                                    dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
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
                                if ((i2 & 128) != 0) {
                                    i3 &= -29360129;
                                }
                                if ((i2 & 256) != 0) {
                                    i3 &= -234881025;
                                }
                                companion = modifier;
                                z2 = z;
                                shape2 = shape;
                                contentColor = j2;
                                actionContentColor = j3;
                                function7 = function6;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
                            }
                            final Function2<? super Composer, ? super Integer, Unit> function9 = function5;
                            final Function2<? super Composer, ? super Integer, Unit> function10 = function7;
                            final long j8 = actionContentColor;
                            final long j9 = dismissActionContentColor;
                            final boolean z4 = z2;
                            Function2<? super Composer, ? super Integer, Unit> function11 = function7;
                            int i15 = i3 >> 9;
                            SurfaceKt.m2506SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m3326getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i16) {
                                    if ((i16 & 3) != 2 || !composer2.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1829663446, i16, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                                        }
                                        TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getSupportingTextFont());
                                        final TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont());
                                        ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                                        final Function2<Composer, Integer, Unit> function12 = function9;
                                        final Function2<Composer, Integer, Unit> function13 = function4;
                                        final Function2<Composer, Integer, Unit> function14 = function10;
                                        final long j10 = j8;
                                        final long j11 = j9;
                                        final boolean z5 = z4;
                                        CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i17) {
                                                if ((i17 & 3) != 2 || !composer3.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(835891690, i17, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                                    }
                                                    if (function12 == null) {
                                                        composer3.startReplaceableGroup(-2104362406);
                                                        SnackbarKt.m2421OneRowSnackbarkKq0p4A(function13, null, function14, textStyleFromToken2, j10, j11, composer3, 48);
                                                        composer3.endReplaceableGroup();
                                                    } else if (z5) {
                                                        composer3.startReplaceableGroup(-2104362092);
                                                        SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function13, function12, function14, textStyleFromToken2, j10, j11, composer3, 0);
                                                        composer3.endReplaceableGroup();
                                                    } else {
                                                        composer3.startReplaceableGroup(-2104361812);
                                                        SnackbarKt.m2421OneRowSnackbarkKq0p4A(function13, function12, function14, textStyleFromToken2, j10, j11, composer3, 0);
                                                        composer3.endReplaceableGroup();
                                                    }
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer3.skipToGroupEnd();
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }
                                        }), composer2, ProvidedValue.$stable | 48);
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
                            }), composerStartRestartGroup, (i3 & 14) | 12779520 | (i15 & 112) | (i15 & 896) | (i15 & 7168), 80);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function8 = function11;
                            modifier2 = companion;
                            z3 = z2;
                            shape3 = shape2;
                            j5 = dismissActionContentColor;
                            j6 = contentColor;
                            j7 = actionContentColor;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            z3 = z;
                            shape3 = shape;
                            function8 = function6;
                            j5 = dismissActionContentColor;
                            j6 = j2;
                            j7 = j3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier3 = modifier2;
                            final Function2<? super Composer, ? super Integer, Unit> function12 = function5;
                            final long j10 = color;
                            final long j11 = j5;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
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

                                public final void invoke(Composer composer2, int i16) {
                                    SnackbarKt.m2422SnackbareQBnUkQ(modifier3, function12, function8, z3, shape3, j10, j6, j7, j11, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                        }
                    }
                    i3 |= 805306368;
                    if ((i3 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i4 == 0) {
                            }
                            if (i6 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i3 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i2 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                contentColor = j2;
                            }
                            if ((i2 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                actionContentColor = j3;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            }
                        } else {
                            if (i12 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i4 == 0) {
                            }
                            if (i6 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i3 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i2 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                contentColor = j2;
                            }
                            if ((i2 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                actionContentColor = j3;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
                        }
                        final Function2<? super Composer, ? super Integer, Unit> function13 = function5;
                        final Function2<? super Composer, ? super Integer, Unit> function14 = function7;
                        final long j12 = actionContentColor;
                        final long j13 = dismissActionContentColor;
                        final boolean z5 = z2;
                        Function2<? super Composer, ? super Integer, Unit> function15 = function7;
                        int i16 = i3 >> 9;
                        SurfaceKt.m2506SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m3326getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i17) {
                                if ((i17 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1829663446, i17, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                                    }
                                    TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getSupportingTextFont());
                                    final TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont());
                                    ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                                    final Function2<? super Composer, ? super Integer, Unit> function16 = function13;
                                    final Function2<? super Composer, ? super Integer, Unit> function17 = function4;
                                    final Function2<? super Composer, ? super Integer, Unit> function18 = function14;
                                    final long j14 = j12;
                                    final long j15 = j13;
                                    final boolean z6 = z5;
                                    CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i18) {
                                            if ((i18 & 3) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(835891690, i18, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                                }
                                                if (function16 == null) {
                                                    composer3.startReplaceableGroup(-2104362406);
                                                    SnackbarKt.m2421OneRowSnackbarkKq0p4A(function17, null, function18, textStyleFromToken2, j14, j15, composer3, 48);
                                                    composer3.endReplaceableGroup();
                                                } else if (z6) {
                                                    composer3.startReplaceableGroup(-2104362092);
                                                    SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function17, function16, function18, textStyleFromToken2, j14, j15, composer3, 0);
                                                    composer3.endReplaceableGroup();
                                                } else {
                                                    composer3.startReplaceableGroup(-2104361812);
                                                    SnackbarKt.m2421OneRowSnackbarkKq0p4A(function17, function16, function18, textStyleFromToken2, j14, j15, composer3, 0);
                                                    composer3.endReplaceableGroup();
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }
                                    }), composer2, ProvidedValue.$stable | 48);
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
                        }), composerStartRestartGroup, (i3 & 14) | 12779520 | (i16 & 112) | (i16 & 896) | (i16 & 7168), 80);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function15;
                        modifier2 = companion;
                        z3 = z2;
                        shape3 = shape2;
                        j5 = dismissActionContentColor;
                        j6 = contentColor;
                        j7 = actionContentColor;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i4 == 0) {
                            }
                            if (i6 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i3 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i2 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                contentColor = j2;
                            }
                            if ((i2 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                actionContentColor = j3;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            }
                        } else {
                            if (i12 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i4 == 0) {
                            }
                            if (i6 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i3 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i2 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                contentColor = j2;
                            }
                            if ((i2 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                actionContentColor = j3;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
                        }
                        final Function2<? super Composer, ? super Integer, Unit> function16 = function5;
                        final Function2<? super Composer, ? super Integer, Unit> function17 = function7;
                        final long j14 = actionContentColor;
                        final long j15 = dismissActionContentColor;
                        final boolean z6 = z2;
                        Function2<? super Composer, ? super Integer, Unit> function18 = function7;
                        int i17 = i3 >> 9;
                        SurfaceKt.m2506SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m3326getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i18) {
                                if ((i18 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1829663446, i18, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                                    }
                                    TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getSupportingTextFont());
                                    final TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont());
                                    ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                                    final Function2<? super Composer, ? super Integer, Unit> function19 = function16;
                                    final Function2<? super Composer, ? super Integer, Unit> function110 = function4;
                                    final Function2<? super Composer, ? super Integer, Unit> function111 = function17;
                                    final long j16 = j14;
                                    final long j17 = j15;
                                    final boolean z7 = z6;
                                    CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i19) {
                                            if ((i19 & 3) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(835891690, i19, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                                }
                                                if (function19 == null) {
                                                    composer3.startReplaceableGroup(-2104362406);
                                                    SnackbarKt.m2421OneRowSnackbarkKq0p4A(function110, null, function111, textStyleFromToken2, j16, j17, composer3, 48);
                                                    composer3.endReplaceableGroup();
                                                } else if (z7) {
                                                    composer3.startReplaceableGroup(-2104362092);
                                                    SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function110, function19, function111, textStyleFromToken2, j16, j17, composer3, 0);
                                                    composer3.endReplaceableGroup();
                                                } else {
                                                    composer3.startReplaceableGroup(-2104361812);
                                                    SnackbarKt.m2421OneRowSnackbarkKq0p4A(function110, function19, function111, textStyleFromToken2, j16, j17, composer3, 0);
                                                    composer3.endReplaceableGroup();
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }
                                    }), composer2, ProvidedValue.$stable | 48);
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
                        }), composerStartRestartGroup, (i3 & 14) | 12779520 | (i17 & 112) | (i17 & 896) | (i17 & 7168), 80);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function18;
                        modifier2 = companion;
                        z3 = z2;
                        shape3 = shape2;
                        j5 = dismissActionContentColor;
                        j6 = contentColor;
                        j7 = actionContentColor;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier4 = modifier2;
                        final Function2<? super Composer, ? super Integer, Unit> function19 = function5;
                        final long j16 = color;
                        final long j17 = j5;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
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

                            public final void invoke(Composer composer2, int i18) {
                                SnackbarKt.m2422SnackbareQBnUkQ(modifier4, function19, function8, z3, shape3, j16, j6, j7, j17, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 3072;
                if ((i & 24576) != 0) {
                    i3 |= ((i2 & 16) == 0 || !composerStartRestartGroup.changed(shape)) ? 8192 : 16384;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        color = j;
                        if (composerStartRestartGroup.changed(color)) {
                        }
                        i3 |= i14;
                    } else {
                        color = j;
                    }
                    i3 |= i14;
                } else {
                    color = j;
                }
                if ((i & 1572864) != 0) {
                    if ((i2 & 64) == 0) {
                        i11 = 524288;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                if ((i & 12582912) != 0) {
                    if ((i2 & 128) == 0) {
                        i10 = 4194304;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
                if ((100663296 & i) == 0) {
                    dismissActionContentColor = j4;
                    if ((i2 & 256) == 0) {
                        i9 = 33554432;
                    } else {
                        i9 = 33554432;
                    }
                    i3 |= i9;
                } else {
                    dismissActionContentColor = j4;
                }
                if ((i2 & 512) != 0) {
                    if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i8 = 536870912;
                        } else {
                            i8 = 268435456;
                        }
                        i3 |= i8;
                    }
                    if ((i3 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i4 == 0) {
                            }
                            if (i6 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i3 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i2 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                contentColor = j2;
                            }
                            if ((i2 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                actionContentColor = j3;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            }
                        } else {
                            if (i12 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i4 == 0) {
                            }
                            if (i6 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i3 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i2 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                contentColor = j2;
                            }
                            if ((i2 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                actionContentColor = j3;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
                        }
                        final Function2<? super Composer, ? super Integer, Unit> function110 = function5;
                        final Function2<? super Composer, ? super Integer, Unit> function111 = function7;
                        final long j18 = actionContentColor;
                        final long j19 = dismissActionContentColor;
                        final boolean z7 = z2;
                        Function2<? super Composer, ? super Integer, Unit> function112 = function7;
                        int i18 = i3 >> 9;
                        SurfaceKt.m2506SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m3326getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i19) {
                                if ((i19 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1829663446, i19, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                                    }
                                    TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getSupportingTextFont());
                                    final TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont());
                                    ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                                    final Function2<? super Composer, ? super Integer, Unit> function113 = function110;
                                    final Function2<? super Composer, ? super Integer, Unit> function114 = function4;
                                    final Function2<? super Composer, ? super Integer, Unit> function115 = function111;
                                    final long j110 = j18;
                                    final long j111 = j19;
                                    final boolean z8 = z7;
                                    CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i110) {
                                            if ((i110 & 3) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(835891690, i110, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                                }
                                                if (function113 == null) {
                                                    composer3.startReplaceableGroup(-2104362406);
                                                    SnackbarKt.m2421OneRowSnackbarkKq0p4A(function114, null, function115, textStyleFromToken2, j110, j111, composer3, 48);
                                                    composer3.endReplaceableGroup();
                                                } else if (z8) {
                                                    composer3.startReplaceableGroup(-2104362092);
                                                    SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function114, function113, function115, textStyleFromToken2, j110, j111, composer3, 0);
                                                    composer3.endReplaceableGroup();
                                                } else {
                                                    composer3.startReplaceableGroup(-2104361812);
                                                    SnackbarKt.m2421OneRowSnackbarkKq0p4A(function114, function113, function115, textStyleFromToken2, j110, j111, composer3, 0);
                                                    composer3.endReplaceableGroup();
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }
                                    }), composer2, ProvidedValue.$stable | 48);
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
                        }), composerStartRestartGroup, (i3 & 14) | 12779520 | (i18 & 112) | (i18 & 896) | (i18 & 7168), 80);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function112;
                        modifier2 = companion;
                        z3 = z2;
                        shape3 = shape2;
                        j5 = dismissActionContentColor;
                        j6 = contentColor;
                        j7 = actionContentColor;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i4 == 0) {
                            }
                            if (i6 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i3 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i2 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                contentColor = j2;
                            }
                            if ((i2 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                actionContentColor = j3;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            }
                        } else {
                            if (i12 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i4 == 0) {
                            }
                            if (i6 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i3 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i2 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                contentColor = j2;
                            }
                            if ((i2 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                actionContentColor = j3;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
                        }
                        final Function2<? super Composer, ? super Integer, Unit> function113 = function5;
                        final Function2<? super Composer, ? super Integer, Unit> function114 = function7;
                        final long j110 = actionContentColor;
                        final long j111 = dismissActionContentColor;
                        final boolean z8 = z2;
                        Function2<? super Composer, ? super Integer, Unit> function115 = function7;
                        int i19 = i3 >> 9;
                        SurfaceKt.m2506SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m3326getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i110) {
                                if ((i110 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1829663446, i110, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                                    }
                                    TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getSupportingTextFont());
                                    final TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont());
                                    ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                                    final Function2<? super Composer, ? super Integer, Unit> function116 = function113;
                                    final Function2<? super Composer, ? super Integer, Unit> function117 = function4;
                                    final Function2<? super Composer, ? super Integer, Unit> function118 = function114;
                                    final long j112 = j110;
                                    final long j113 = j111;
                                    final boolean z9 = z8;
                                    CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i111) {
                                            if ((i111 & 3) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(835891690, i111, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                                }
                                                if (function116 == null) {
                                                    composer3.startReplaceableGroup(-2104362406);
                                                    SnackbarKt.m2421OneRowSnackbarkKq0p4A(function117, null, function118, textStyleFromToken2, j112, j113, composer3, 48);
                                                    composer3.endReplaceableGroup();
                                                } else if (z9) {
                                                    composer3.startReplaceableGroup(-2104362092);
                                                    SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function117, function116, function118, textStyleFromToken2, j112, j113, composer3, 0);
                                                    composer3.endReplaceableGroup();
                                                } else {
                                                    composer3.startReplaceableGroup(-2104361812);
                                                    SnackbarKt.m2421OneRowSnackbarkKq0p4A(function117, function116, function118, textStyleFromToken2, j112, j113, composer3, 0);
                                                    composer3.endReplaceableGroup();
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }
                                    }), composer2, ProvidedValue.$stable | 48);
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
                        }), composerStartRestartGroup, (i3 & 14) | 12779520 | (i19 & 112) | (i19 & 896) | (i19 & 7168), 80);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function115;
                        modifier2 = companion;
                        z3 = z2;
                        shape3 = shape2;
                        j5 = dismissActionContentColor;
                        j6 = contentColor;
                        j7 = actionContentColor;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier5 = modifier2;
                        final Function2<? super Composer, ? super Integer, Unit> function116 = function5;
                        final long j112 = color;
                        final long j113 = j5;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
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

                            public final void invoke(Composer composer2, int i110) {
                                SnackbarKt.m2422SnackbareQBnUkQ(modifier5, function116, function8, z3, shape3, j112, j6, j7, j113, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 805306368;
                if ((i3 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i2 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            contentColor = j2;
                        }
                        if ((i2 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            actionContentColor = j3;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        }
                    } else {
                        if (i12 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i2 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            contentColor = j2;
                        }
                        if ((i2 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            actionContentColor = j3;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
                    }
                    final Function2<? super Composer, ? super Integer, Unit> function117 = function5;
                    final Function2<? super Composer, ? super Integer, Unit> function118 = function7;
                    final long j114 = actionContentColor;
                    final long j115 = dismissActionContentColor;
                    final boolean z9 = z2;
                    Function2<? super Composer, ? super Integer, Unit> function119 = function7;
                    int i110 = i3 >> 9;
                    SurfaceKt.m2506SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m3326getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i111) {
                            if ((i111 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1829663446, i111, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                                }
                                TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getSupportingTextFont());
                                final TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont());
                                ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                                final Function2<? super Composer, ? super Integer, Unit> function1110 = function117;
                                final Function2<? super Composer, ? super Integer, Unit> function1111 = function4;
                                final Function2<? super Composer, ? super Integer, Unit> function1112 = function118;
                                final long j116 = j114;
                                final long j117 = j115;
                                final boolean z10 = z9;
                                CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i112) {
                                        if ((i112 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(835891690, i112, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                            }
                                            if (function1110 == null) {
                                                composer3.startReplaceableGroup(-2104362406);
                                                SnackbarKt.m2421OneRowSnackbarkKq0p4A(function1111, null, function1112, textStyleFromToken2, j116, j117, composer3, 48);
                                                composer3.endReplaceableGroup();
                                            } else if (z10) {
                                                composer3.startReplaceableGroup(-2104362092);
                                                SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function1111, function1110, function1112, textStyleFromToken2, j116, j117, composer3, 0);
                                                composer3.endReplaceableGroup();
                                            } else {
                                                composer3.startReplaceableGroup(-2104361812);
                                                SnackbarKt.m2421OneRowSnackbarkKq0p4A(function1111, function1110, function1112, textStyleFromToken2, j116, j117, composer3, 0);
                                                composer3.endReplaceableGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }
                                }), composer2, ProvidedValue.$stable | 48);
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
                    }), composerStartRestartGroup, (i3 & 14) | 12779520 | (i110 & 112) | (i110 & 896) | (i110 & 7168), 80);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function119;
                    modifier2 = companion;
                    z3 = z2;
                    shape3 = shape2;
                    j5 = dismissActionContentColor;
                    j6 = contentColor;
                    j7 = actionContentColor;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i2 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            contentColor = j2;
                        }
                        if ((i2 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            actionContentColor = j3;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        }
                    } else {
                        if (i12 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i2 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            contentColor = j2;
                        }
                        if ((i2 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            actionContentColor = j3;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
                    }
                    final Function2<? super Composer, ? super Integer, Unit> function1110 = function5;
                    final Function2<? super Composer, ? super Integer, Unit> function1111 = function7;
                    final long j116 = actionContentColor;
                    final long j117 = dismissActionContentColor;
                    final boolean z10 = z2;
                    Function2<? super Composer, ? super Integer, Unit> function1112 = function7;
                    int i111 = i3 >> 9;
                    SurfaceKt.m2506SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m3326getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i112) {
                            if ((i112 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1829663446, i112, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                                }
                                TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getSupportingTextFont());
                                final TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont());
                                ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                                final Function2<? super Composer, ? super Integer, Unit> function1113 = function1110;
                                final Function2<? super Composer, ? super Integer, Unit> function1114 = function4;
                                final Function2<? super Composer, ? super Integer, Unit> function1115 = function1111;
                                final long j118 = j116;
                                final long j119 = j117;
                                final boolean z11 = z10;
                                CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i113) {
                                        if ((i113 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(835891690, i113, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                            }
                                            if (function1113 == null) {
                                                composer3.startReplaceableGroup(-2104362406);
                                                SnackbarKt.m2421OneRowSnackbarkKq0p4A(function1114, null, function1115, textStyleFromToken2, j118, j119, composer3, 48);
                                                composer3.endReplaceableGroup();
                                            } else if (z11) {
                                                composer3.startReplaceableGroup(-2104362092);
                                                SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function1114, function1113, function1115, textStyleFromToken2, j118, j119, composer3, 0);
                                                composer3.endReplaceableGroup();
                                            } else {
                                                composer3.startReplaceableGroup(-2104361812);
                                                SnackbarKt.m2421OneRowSnackbarkKq0p4A(function1114, function1113, function1115, textStyleFromToken2, j118, j119, composer3, 0);
                                                composer3.endReplaceableGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }
                                }), composer2, ProvidedValue.$stable | 48);
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
                    }), composerStartRestartGroup, (i3 & 14) | 12779520 | (i111 & 112) | (i111 & 896) | (i111 & 7168), 80);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function1112;
                    modifier2 = companion;
                    z3 = z2;
                    shape3 = shape2;
                    j5 = dismissActionContentColor;
                    j6 = contentColor;
                    j7 = actionContentColor;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier6 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function1113 = function5;
                    final long j118 = color;
                    final long j119 = j5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
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

                        public final void invoke(Composer composer2, int i112) {
                            SnackbarKt.m2422SnackbareQBnUkQ(modifier6, function1113, function8, z3, shape3, j118, j6, j7, j119, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 384;
            function6 = function3;
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) != 0) {
                    i3 |= ((i2 & 16) == 0 || !composerStartRestartGroup.changed(shape)) ? 8192 : 16384;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        color = j;
                        if (composerStartRestartGroup.changed(color)) {
                        }
                        i3 |= i14;
                    } else {
                        color = j;
                    }
                    i3 |= i14;
                } else {
                    color = j;
                }
                if ((i & 1572864) != 0) {
                    if ((i2 & 64) == 0) {
                        i11 = 524288;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                if ((i & 12582912) != 0) {
                    if ((i2 & 128) == 0) {
                        i10 = 4194304;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
                if ((100663296 & i) == 0) {
                    dismissActionContentColor = j4;
                    if ((i2 & 256) == 0) {
                        i9 = 33554432;
                    } else {
                        i9 = 33554432;
                    }
                    i3 |= i9;
                } else {
                    dismissActionContentColor = j4;
                }
                if ((i2 & 512) != 0) {
                    if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i8 = 536870912;
                        } else {
                            i8 = 268435456;
                        }
                        i3 |= i8;
                    }
                    if ((i3 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i4 == 0) {
                            }
                            if (i6 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i3 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i2 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                contentColor = j2;
                            }
                            if ((i2 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                actionContentColor = j3;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            }
                        } else {
                            if (i12 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i4 == 0) {
                            }
                            if (i6 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i3 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i2 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                contentColor = j2;
                            }
                            if ((i2 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                actionContentColor = j3;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
                        }
                        final Function2<? super Composer, ? super Integer, Unit> function1114 = function5;
                        final Function2<? super Composer, ? super Integer, Unit> function1115 = function7;
                        final long j1110 = actionContentColor;
                        final long j1111 = dismissActionContentColor;
                        final boolean z11 = z2;
                        Function2<? super Composer, ? super Integer, Unit> function1116 = function7;
                        int i112 = i3 >> 9;
                        SurfaceKt.m2506SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m3326getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i113) {
                                if ((i113 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1829663446, i113, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                                    }
                                    TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getSupportingTextFont());
                                    final TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont());
                                    ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                                    final Function2<? super Composer, ? super Integer, Unit> function1117 = function1114;
                                    final Function2<? super Composer, ? super Integer, Unit> function1118 = function4;
                                    final Function2<? super Composer, ? super Integer, Unit> function1119 = function1115;
                                    final long j1112 = j1110;
                                    final long j1113 = j1111;
                                    final boolean z12 = z11;
                                    CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i114) {
                                            if ((i114 & 3) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(835891690, i114, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                                }
                                                if (function1117 == null) {
                                                    composer3.startReplaceableGroup(-2104362406);
                                                    SnackbarKt.m2421OneRowSnackbarkKq0p4A(function1118, null, function1119, textStyleFromToken2, j1112, j1113, composer3, 48);
                                                    composer3.endReplaceableGroup();
                                                } else if (z12) {
                                                    composer3.startReplaceableGroup(-2104362092);
                                                    SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function1118, function1117, function1119, textStyleFromToken2, j1112, j1113, composer3, 0);
                                                    composer3.endReplaceableGroup();
                                                } else {
                                                    composer3.startReplaceableGroup(-2104361812);
                                                    SnackbarKt.m2421OneRowSnackbarkKq0p4A(function1118, function1117, function1119, textStyleFromToken2, j1112, j1113, composer3, 0);
                                                    composer3.endReplaceableGroup();
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }
                                    }), composer2, ProvidedValue.$stable | 48);
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
                        }), composerStartRestartGroup, (i3 & 14) | 12779520 | (i112 & 112) | (i112 & 896) | (i112 & 7168), 80);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function1116;
                        modifier2 = companion;
                        z3 = z2;
                        shape3 = shape2;
                        j5 = dismissActionContentColor;
                        j6 = contentColor;
                        j7 = actionContentColor;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i4 == 0) {
                            }
                            if (i6 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i3 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i2 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                contentColor = j2;
                            }
                            if ((i2 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                actionContentColor = j3;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            }
                        } else {
                            if (i12 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i4 == 0) {
                            }
                            if (i6 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i3 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i2 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                contentColor = j2;
                            }
                            if ((i2 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                actionContentColor = j3;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
                        }
                        final Function2<? super Composer, ? super Integer, Unit> function1117 = function5;
                        final Function2<? super Composer, ? super Integer, Unit> function1118 = function7;
                        final long j1112 = actionContentColor;
                        final long j1113 = dismissActionContentColor;
                        final boolean z12 = z2;
                        Function2<? super Composer, ? super Integer, Unit> function1119 = function7;
                        int i113 = i3 >> 9;
                        SurfaceKt.m2506SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m3326getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i114) {
                                if ((i114 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1829663446, i114, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                                    }
                                    TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getSupportingTextFont());
                                    final TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont());
                                    ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                                    final Function2<? super Composer, ? super Integer, Unit> function11110 = function1117;
                                    final Function2<? super Composer, ? super Integer, Unit> function11111 = function4;
                                    final Function2<? super Composer, ? super Integer, Unit> function11112 = function1118;
                                    final long j1114 = j1112;
                                    final long j1115 = j1113;
                                    final boolean z13 = z12;
                                    CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i115) {
                                            if ((i115 & 3) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(835891690, i115, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                                }
                                                if (function11110 == null) {
                                                    composer3.startReplaceableGroup(-2104362406);
                                                    SnackbarKt.m2421OneRowSnackbarkKq0p4A(function11111, null, function11112, textStyleFromToken2, j1114, j1115, composer3, 48);
                                                    composer3.endReplaceableGroup();
                                                } else if (z13) {
                                                    composer3.startReplaceableGroup(-2104362092);
                                                    SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function11111, function11110, function11112, textStyleFromToken2, j1114, j1115, composer3, 0);
                                                    composer3.endReplaceableGroup();
                                                } else {
                                                    composer3.startReplaceableGroup(-2104361812);
                                                    SnackbarKt.m2421OneRowSnackbarkKq0p4A(function11111, function11110, function11112, textStyleFromToken2, j1114, j1115, composer3, 0);
                                                    composer3.endReplaceableGroup();
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }
                                    }), composer2, ProvidedValue.$stable | 48);
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
                        }), composerStartRestartGroup, (i3 & 14) | 12779520 | (i113 & 112) | (i113 & 896) | (i113 & 7168), 80);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function1119;
                        modifier2 = companion;
                        z3 = z2;
                        shape3 = shape2;
                        j5 = dismissActionContentColor;
                        j6 = contentColor;
                        j7 = actionContentColor;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier7 = modifier2;
                        final Function2<? super Composer, ? super Integer, Unit> function11110 = function5;
                        final long j1114 = color;
                        final long j1115 = j5;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
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

                            public final void invoke(Composer composer2, int i114) {
                                SnackbarKt.m2422SnackbareQBnUkQ(modifier7, function11110, function8, z3, shape3, j1114, j6, j7, j1115, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 805306368;
                if ((i3 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i2 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            contentColor = j2;
                        }
                        if ((i2 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            actionContentColor = j3;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        }
                    } else {
                        if (i12 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i2 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            contentColor = j2;
                        }
                        if ((i2 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            actionContentColor = j3;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
                    }
                    final Function2<? super Composer, ? super Integer, Unit> function11111 = function5;
                    final Function2<? super Composer, ? super Integer, Unit> function11112 = function7;
                    final long j1116 = actionContentColor;
                    final long j1117 = dismissActionContentColor;
                    final boolean z13 = z2;
                    Function2<? super Composer, ? super Integer, Unit> function11113 = function7;
                    int i114 = i3 >> 9;
                    SurfaceKt.m2506SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m3326getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i115) {
                            if ((i115 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1829663446, i115, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                                }
                                TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getSupportingTextFont());
                                final TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont());
                                ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                                final Function2<? super Composer, ? super Integer, Unit> function11114 = function11111;
                                final Function2<? super Composer, ? super Integer, Unit> function11115 = function4;
                                final Function2<? super Composer, ? super Integer, Unit> function11116 = function11112;
                                final long j1118 = j1116;
                                final long j1119 = j1117;
                                final boolean z14 = z13;
                                CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i116) {
                                        if ((i116 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(835891690, i116, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                            }
                                            if (function11114 == null) {
                                                composer3.startReplaceableGroup(-2104362406);
                                                SnackbarKt.m2421OneRowSnackbarkKq0p4A(function11115, null, function11116, textStyleFromToken2, j1118, j1119, composer3, 48);
                                                composer3.endReplaceableGroup();
                                            } else if (z14) {
                                                composer3.startReplaceableGroup(-2104362092);
                                                SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function11115, function11114, function11116, textStyleFromToken2, j1118, j1119, composer3, 0);
                                                composer3.endReplaceableGroup();
                                            } else {
                                                composer3.startReplaceableGroup(-2104361812);
                                                SnackbarKt.m2421OneRowSnackbarkKq0p4A(function11115, function11114, function11116, textStyleFromToken2, j1118, j1119, composer3, 0);
                                                composer3.endReplaceableGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }
                                }), composer2, ProvidedValue.$stable | 48);
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
                    }), composerStartRestartGroup, (i3 & 14) | 12779520 | (i114 & 112) | (i114 & 896) | (i114 & 7168), 80);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function11113;
                    modifier2 = companion;
                    z3 = z2;
                    shape3 = shape2;
                    j5 = dismissActionContentColor;
                    j6 = contentColor;
                    j7 = actionContentColor;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i2 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            contentColor = j2;
                        }
                        if ((i2 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            actionContentColor = j3;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        }
                    } else {
                        if (i12 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i2 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            contentColor = j2;
                        }
                        if ((i2 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            actionContentColor = j3;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
                    }
                    final Function2<? super Composer, ? super Integer, Unit> function11114 = function5;
                    final Function2<? super Composer, ? super Integer, Unit> function11115 = function7;
                    final long j1118 = actionContentColor;
                    final long j1119 = dismissActionContentColor;
                    final boolean z14 = z2;
                    Function2<? super Composer, ? super Integer, Unit> function11116 = function7;
                    int i115 = i3 >> 9;
                    SurfaceKt.m2506SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m3326getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i116) {
                            if ((i116 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1829663446, i116, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                                }
                                TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getSupportingTextFont());
                                final TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont());
                                ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                                final Function2<? super Composer, ? super Integer, Unit> function11117 = function11114;
                                final Function2<? super Composer, ? super Integer, Unit> function11118 = function4;
                                final Function2<? super Composer, ? super Integer, Unit> function11119 = function11115;
                                final long j11110 = j1118;
                                final long j11111 = j1119;
                                final boolean z15 = z14;
                                CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i117) {
                                        if ((i117 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(835891690, i117, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                            }
                                            if (function11117 == null) {
                                                composer3.startReplaceableGroup(-2104362406);
                                                SnackbarKt.m2421OneRowSnackbarkKq0p4A(function11118, null, function11119, textStyleFromToken2, j11110, j11111, composer3, 48);
                                                composer3.endReplaceableGroup();
                                            } else if (z15) {
                                                composer3.startReplaceableGroup(-2104362092);
                                                SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function11118, function11117, function11119, textStyleFromToken2, j11110, j11111, composer3, 0);
                                                composer3.endReplaceableGroup();
                                            } else {
                                                composer3.startReplaceableGroup(-2104361812);
                                                SnackbarKt.m2421OneRowSnackbarkKq0p4A(function11118, function11117, function11119, textStyleFromToken2, j11110, j11111, composer3, 0);
                                                composer3.endReplaceableGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }
                                }), composer2, ProvidedValue.$stable | 48);
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
                    }), composerStartRestartGroup, (i3 & 14) | 12779520 | (i115 & 112) | (i115 & 896) | (i115 & 7168), 80);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function11116;
                    modifier2 = companion;
                    z3 = z2;
                    shape3 = shape2;
                    j5 = dismissActionContentColor;
                    j6 = contentColor;
                    j7 = actionContentColor;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier8 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function11117 = function5;
                    final long j11110 = color;
                    final long j11111 = j5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
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

                        public final void invoke(Composer composer2, int i116) {
                            SnackbarKt.m2422SnackbareQBnUkQ(modifier8, function11117, function8, z3, shape3, j11110, j6, j7, j11111, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            if ((i & 24576) != 0) {
                i3 |= ((i2 & 16) == 0 || !composerStartRestartGroup.changed(shape)) ? 8192 : 16384;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    color = j;
                    if (composerStartRestartGroup.changed(color)) {
                    }
                    i3 |= i14;
                } else {
                    color = j;
                }
                i3 |= i14;
            } else {
                color = j;
            }
            if ((i & 1572864) != 0) {
                if ((i2 & 64) == 0) {
                    i11 = 524288;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            if ((i & 12582912) != 0) {
                if ((i2 & 128) == 0) {
                    i10 = 4194304;
                } else {
                    i10 = 4194304;
                }
                i3 |= i10;
            }
            if ((100663296 & i) == 0) {
                dismissActionContentColor = j4;
                if ((i2 & 256) == 0) {
                    i9 = 33554432;
                } else {
                    i9 = 33554432;
                }
                i3 |= i9;
            } else {
                dismissActionContentColor = j4;
            }
            if ((i2 & 512) != 0) {
                if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i8 = 536870912;
                    } else {
                        i8 = 268435456;
                    }
                    i3 |= i8;
                }
                if ((i3 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i2 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            contentColor = j2;
                        }
                        if ((i2 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            actionContentColor = j3;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        }
                    } else {
                        if (i12 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i2 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            contentColor = j2;
                        }
                        if ((i2 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            actionContentColor = j3;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
                    }
                    final Function2<? super Composer, ? super Integer, Unit> function11118 = function5;
                    final Function2<? super Composer, ? super Integer, Unit> function11119 = function7;
                    final long j11112 = actionContentColor;
                    final long j11113 = dismissActionContentColor;
                    final boolean z15 = z2;
                    Function2<? super Composer, ? super Integer, Unit> function111110 = function7;
                    int i116 = i3 >> 9;
                    SurfaceKt.m2506SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m3326getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i117) {
                            if ((i117 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1829663446, i117, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                                }
                                TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getSupportingTextFont());
                                final TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont());
                                ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                                final Function2<? super Composer, ? super Integer, Unit> function111111 = function11118;
                                final Function2<? super Composer, ? super Integer, Unit> function111112 = function4;
                                final Function2<? super Composer, ? super Integer, Unit> function111113 = function11119;
                                final long j11114 = j11112;
                                final long j11115 = j11113;
                                final boolean z16 = z15;
                                CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i118) {
                                        if ((i118 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(835891690, i118, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                            }
                                            if (function111111 == null) {
                                                composer3.startReplaceableGroup(-2104362406);
                                                SnackbarKt.m2421OneRowSnackbarkKq0p4A(function111112, null, function111113, textStyleFromToken2, j11114, j11115, composer3, 48);
                                                composer3.endReplaceableGroup();
                                            } else if (z16) {
                                                composer3.startReplaceableGroup(-2104362092);
                                                SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function111112, function111111, function111113, textStyleFromToken2, j11114, j11115, composer3, 0);
                                                composer3.endReplaceableGroup();
                                            } else {
                                                composer3.startReplaceableGroup(-2104361812);
                                                SnackbarKt.m2421OneRowSnackbarkKq0p4A(function111112, function111111, function111113, textStyleFromToken2, j11114, j11115, composer3, 0);
                                                composer3.endReplaceableGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }
                                }), composer2, ProvidedValue.$stable | 48);
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
                    }), composerStartRestartGroup, (i3 & 14) | 12779520 | (i116 & 112) | (i116 & 896) | (i116 & 7168), 80);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function111110;
                    modifier2 = companion;
                    z3 = z2;
                    shape3 = shape2;
                    j5 = dismissActionContentColor;
                    j6 = contentColor;
                    j7 = actionContentColor;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i2 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            contentColor = j2;
                        }
                        if ((i2 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            actionContentColor = j3;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        }
                    } else {
                        if (i12 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i2 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            contentColor = j2;
                        }
                        if ((i2 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            actionContentColor = j3;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
                    }
                    final Function2<? super Composer, ? super Integer, Unit> function111111 = function5;
                    final Function2<? super Composer, ? super Integer, Unit> function111112 = function7;
                    final long j11114 = actionContentColor;
                    final long j11115 = dismissActionContentColor;
                    final boolean z16 = z2;
                    Function2<? super Composer, ? super Integer, Unit> function111113 = function7;
                    int i117 = i3 >> 9;
                    SurfaceKt.m2506SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m3326getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i118) {
                            if ((i118 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1829663446, i118, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                                }
                                TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getSupportingTextFont());
                                final TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont());
                                ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                                final Function2<? super Composer, ? super Integer, Unit> function111114 = function111111;
                                final Function2<? super Composer, ? super Integer, Unit> function111115 = function4;
                                final Function2<? super Composer, ? super Integer, Unit> function111116 = function111112;
                                final long j11116 = j11114;
                                final long j11117 = j11115;
                                final boolean z17 = z16;
                                CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i119) {
                                        if ((i119 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(835891690, i119, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                            }
                                            if (function111114 == null) {
                                                composer3.startReplaceableGroup(-2104362406);
                                                SnackbarKt.m2421OneRowSnackbarkKq0p4A(function111115, null, function111116, textStyleFromToken2, j11116, j11117, composer3, 48);
                                                composer3.endReplaceableGroup();
                                            } else if (z17) {
                                                composer3.startReplaceableGroup(-2104362092);
                                                SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function111115, function111114, function111116, textStyleFromToken2, j11116, j11117, composer3, 0);
                                                composer3.endReplaceableGroup();
                                            } else {
                                                composer3.startReplaceableGroup(-2104361812);
                                                SnackbarKt.m2421OneRowSnackbarkKq0p4A(function111115, function111114, function111116, textStyleFromToken2, j11116, j11117, composer3, 0);
                                                composer3.endReplaceableGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }
                                }), composer2, ProvidedValue.$stable | 48);
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
                    }), composerStartRestartGroup, (i3 & 14) | 12779520 | (i117 & 112) | (i117 & 896) | (i117 & 7168), 80);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function111113;
                    modifier2 = companion;
                    z3 = z2;
                    shape3 = shape2;
                    j5 = dismissActionContentColor;
                    j6 = contentColor;
                    j7 = actionContentColor;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier9 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function111114 = function5;
                    final long j11116 = color;
                    final long j11117 = j5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
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

                        public final void invoke(Composer composer2, int i118) {
                            SnackbarKt.m2422SnackbareQBnUkQ(modifier9, function111114, function8, z3, shape3, j11116, j6, j7, j11117, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 805306368;
            if ((i3 & 306783379) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i4 == 0) {
                    }
                    if (i6 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i2 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        contentColor = j2;
                    }
                    if ((i2 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        actionContentColor = j3;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    }
                } else {
                    if (i12 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i4 == 0) {
                    }
                    if (i6 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i2 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        contentColor = j2;
                    }
                    if ((i2 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        actionContentColor = j3;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
                }
                final Function2<? super Composer, ? super Integer, Unit> function111115 = function5;
                final Function2<? super Composer, ? super Integer, Unit> function111116 = function7;
                final long j11118 = actionContentColor;
                final long j11119 = dismissActionContentColor;
                final boolean z17 = z2;
                Function2<? super Composer, ? super Integer, Unit> function111117 = function7;
                int i118 = i3 >> 9;
                SurfaceKt.m2506SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m3326getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i119) {
                        if ((i119 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1829663446, i119, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                            }
                            TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getSupportingTextFont());
                            final TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont());
                            ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                            final Function2<? super Composer, ? super Integer, Unit> function111118 = function111115;
                            final Function2<? super Composer, ? super Integer, Unit> function111119 = function4;
                            final Function2<? super Composer, ? super Integer, Unit> function1111110 = function111116;
                            final long j111110 = j11118;
                            final long j111111 = j11119;
                            final boolean z18 = z17;
                            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i1110) {
                                    if ((i1110 & 3) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(835891690, i1110, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                        }
                                        if (function111118 == null) {
                                            composer3.startReplaceableGroup(-2104362406);
                                            SnackbarKt.m2421OneRowSnackbarkKq0p4A(function111119, null, function1111110, textStyleFromToken2, j111110, j111111, composer3, 48);
                                            composer3.endReplaceableGroup();
                                        } else if (z18) {
                                            composer3.startReplaceableGroup(-2104362092);
                                            SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function111119, function111118, function1111110, textStyleFromToken2, j111110, j111111, composer3, 0);
                                            composer3.endReplaceableGroup();
                                        } else {
                                            composer3.startReplaceableGroup(-2104361812);
                                            SnackbarKt.m2421OneRowSnackbarkKq0p4A(function111119, function111118, function1111110, textStyleFromToken2, j111110, j111111, composer3, 0);
                                            composer3.endReplaceableGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }
                            }), composer2, ProvidedValue.$stable | 48);
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
                }), composerStartRestartGroup, (i3 & 14) | 12779520 | (i118 & 112) | (i118 & 896) | (i118 & 7168), 80);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function111117;
                modifier2 = companion;
                z3 = z2;
                shape3 = shape2;
                j5 = dismissActionContentColor;
                j6 = contentColor;
                j7 = actionContentColor;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i4 == 0) {
                    }
                    if (i6 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i2 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        contentColor = j2;
                    }
                    if ((i2 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        actionContentColor = j3;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    }
                } else {
                    if (i12 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i4 == 0) {
                    }
                    if (i6 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i2 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        contentColor = j2;
                    }
                    if ((i2 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        actionContentColor = j3;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
                }
                final Function2<? super Composer, ? super Integer, Unit> function111118 = function5;
                final Function2<? super Composer, ? super Integer, Unit> function111119 = function7;
                final long j111110 = actionContentColor;
                final long j111111 = dismissActionContentColor;
                final boolean z18 = z2;
                Function2<? super Composer, ? super Integer, Unit> function1111110 = function7;
                int i119 = i3 >> 9;
                SurfaceKt.m2506SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m3326getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i1110) {
                        if ((i1110 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1829663446, i1110, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                            }
                            TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getSupportingTextFont());
                            final TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont());
                            ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                            final Function2<? super Composer, ? super Integer, Unit> function1111111 = function111118;
                            final Function2<? super Composer, ? super Integer, Unit> function1111112 = function4;
                            final Function2<? super Composer, ? super Integer, Unit> function1111113 = function111119;
                            final long j111112 = j111110;
                            final long j111113 = j111111;
                            final boolean z19 = z18;
                            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i1111) {
                                    if ((i1111 & 3) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(835891690, i1111, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                        }
                                        if (function1111111 == null) {
                                            composer3.startReplaceableGroup(-2104362406);
                                            SnackbarKt.m2421OneRowSnackbarkKq0p4A(function1111112, null, function1111113, textStyleFromToken2, j111112, j111113, composer3, 48);
                                            composer3.endReplaceableGroup();
                                        } else if (z19) {
                                            composer3.startReplaceableGroup(-2104362092);
                                            SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function1111112, function1111111, function1111113, textStyleFromToken2, j111112, j111113, composer3, 0);
                                            composer3.endReplaceableGroup();
                                        } else {
                                            composer3.startReplaceableGroup(-2104361812);
                                            SnackbarKt.m2421OneRowSnackbarkKq0p4A(function1111112, function1111111, function1111113, textStyleFromToken2, j111112, j111113, composer3, 0);
                                            composer3.endReplaceableGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }
                            }), composer2, ProvidedValue.$stable | 48);
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
                }), composerStartRestartGroup, (i3 & 14) | 12779520 | (i119 & 112) | (i119 & 896) | (i119 & 7168), 80);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function1111110;
                modifier2 = companion;
                z3 = z2;
                shape3 = shape2;
                j5 = dismissActionContentColor;
                j6 = contentColor;
                j7 = actionContentColor;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier10 = modifier2;
                final Function2<? super Composer, ? super Integer, Unit> function1111111 = function5;
                final long j111112 = color;
                final long j111113 = j5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
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

                    public final void invoke(Composer composer2, int i1110) {
                        SnackbarKt.m2422SnackbareQBnUkQ(modifier10, function1111111, function8, z3, shape3, j111112, j6, j7, j111113, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 48;
        function5 = function2;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                function6 = function3;
                if (composerStartRestartGroup.changedInstance(function6)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    if (composerStartRestartGroup.changed(z)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                if ((i & 24576) != 0) {
                    i3 |= ((i2 & 16) == 0 || !composerStartRestartGroup.changed(shape)) ? 8192 : 16384;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        color = j;
                        if (composerStartRestartGroup.changed(color)) {
                        }
                        i3 |= i14;
                    } else {
                        color = j;
                    }
                    i3 |= i14;
                } else {
                    color = j;
                }
                if ((i & 1572864) != 0) {
                    if ((i2 & 64) == 0) {
                        i11 = 524288;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                if ((i & 12582912) != 0) {
                    if ((i2 & 128) == 0) {
                        i10 = 4194304;
                    } else {
                        i10 = 4194304;
                    }
                    i3 |= i10;
                }
                if ((100663296 & i) == 0) {
                    dismissActionContentColor = j4;
                    if ((i2 & 256) == 0) {
                        i9 = 33554432;
                    } else {
                        i9 = 33554432;
                    }
                    i3 |= i9;
                } else {
                    dismissActionContentColor = j4;
                }
                if ((i2 & 512) != 0) {
                    if ((i & 805306368) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i8 = 536870912;
                        } else {
                            i8 = 268435456;
                        }
                        i3 |= i8;
                    }
                    if ((i3 & 306783379) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i4 == 0) {
                            }
                            if (i6 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i3 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i2 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                contentColor = j2;
                            }
                            if ((i2 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                actionContentColor = j3;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            }
                        } else {
                            if (i12 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i4 == 0) {
                            }
                            if (i6 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i3 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i2 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                contentColor = j2;
                            }
                            if ((i2 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                actionContentColor = j3;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
                        }
                        final Function2<? super Composer, ? super Integer, Unit> function1111112 = function5;
                        final Function2<? super Composer, ? super Integer, Unit> function1111113 = function7;
                        final long j111114 = actionContentColor;
                        final long j111115 = dismissActionContentColor;
                        final boolean z19 = z2;
                        Function2<? super Composer, ? super Integer, Unit> function1111114 = function7;
                        int i1110 = i3 >> 9;
                        SurfaceKt.m2506SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m3326getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i1111) {
                                if ((i1111 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1829663446, i1111, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                                    }
                                    TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getSupportingTextFont());
                                    final TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont());
                                    ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                                    final Function2<? super Composer, ? super Integer, Unit> function1111115 = function1111112;
                                    final Function2<? super Composer, ? super Integer, Unit> function1111116 = function4;
                                    final Function2<? super Composer, ? super Integer, Unit> function1111117 = function1111113;
                                    final long j111116 = j111114;
                                    final long j111117 = j111115;
                                    final boolean z110 = z19;
                                    CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i1112) {
                                            if ((i1112 & 3) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(835891690, i1112, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                                }
                                                if (function1111115 == null) {
                                                    composer3.startReplaceableGroup(-2104362406);
                                                    SnackbarKt.m2421OneRowSnackbarkKq0p4A(function1111116, null, function1111117, textStyleFromToken2, j111116, j111117, composer3, 48);
                                                    composer3.endReplaceableGroup();
                                                } else if (z110) {
                                                    composer3.startReplaceableGroup(-2104362092);
                                                    SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function1111116, function1111115, function1111117, textStyleFromToken2, j111116, j111117, composer3, 0);
                                                    composer3.endReplaceableGroup();
                                                } else {
                                                    composer3.startReplaceableGroup(-2104361812);
                                                    SnackbarKt.m2421OneRowSnackbarkKq0p4A(function1111116, function1111115, function1111117, textStyleFromToken2, j111116, j111117, composer3, 0);
                                                    composer3.endReplaceableGroup();
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }
                                    }), composer2, ProvidedValue.$stable | 48);
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
                        }), composerStartRestartGroup, (i3 & 14) | 12779520 | (i1110 & 112) | (i1110 & 896) | (i1110 & 7168), 80);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function1111114;
                        modifier2 = companion;
                        z3 = z2;
                        shape3 = shape2;
                        j5 = dismissActionContentColor;
                        j6 = contentColor;
                        j7 = actionContentColor;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i12 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i4 == 0) {
                            }
                            if (i6 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i3 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i2 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                contentColor = j2;
                            }
                            if ((i2 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                actionContentColor = j3;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            }
                        } else {
                            if (i12 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier;
                            }
                            if (i13 != 0) {
                                function5 = null;
                            }
                            if (i4 == 0) {
                            }
                            if (i6 != 0) {
                                z2 = false;
                            } else {
                                z2 = z;
                            }
                            if ((i2 & 16) != 0) {
                                shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                i3 &= -57345;
                            } else {
                                shape2 = shape;
                            }
                            if ((i2 & 32) != 0) {
                                color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                                i3 &= -458753;
                            }
                            if ((i2 & 64) != 0) {
                                contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                                i3 &= -3670017;
                            } else {
                                contentColor = j2;
                            }
                            if ((i2 & 128) != 0) {
                                actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                                i3 &= -29360129;
                            } else {
                                actionContentColor = j3;
                            }
                            if ((i2 & 256) != 0) {
                                i3 &= -234881025;
                                dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
                        }
                        final Function2<? super Composer, ? super Integer, Unit> function1111115 = function5;
                        final Function2<? super Composer, ? super Integer, Unit> function1111116 = function7;
                        final long j111116 = actionContentColor;
                        final long j111117 = dismissActionContentColor;
                        final boolean z110 = z2;
                        Function2<? super Composer, ? super Integer, Unit> function1111117 = function7;
                        int i1111 = i3 >> 9;
                        SurfaceKt.m2506SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m3326getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i1112) {
                                if ((i1112 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1829663446, i1112, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                                    }
                                    TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getSupportingTextFont());
                                    final TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont());
                                    ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                                    final Function2<? super Composer, ? super Integer, Unit> function1111118 = function1111115;
                                    final Function2<? super Composer, ? super Integer, Unit> function1111119 = function4;
                                    final Function2<? super Composer, ? super Integer, Unit> function11111110 = function1111116;
                                    final long j111118 = j111116;
                                    final long j111119 = j111117;
                                    final boolean z111 = z110;
                                    CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Composer composer3, int i1113) {
                                            if ((i1113 & 3) != 2 || !composer3.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(835891690, i1113, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                                }
                                                if (function1111118 == null) {
                                                    composer3.startReplaceableGroup(-2104362406);
                                                    SnackbarKt.m2421OneRowSnackbarkKq0p4A(function1111119, null, function11111110, textStyleFromToken2, j111118, j111119, composer3, 48);
                                                    composer3.endReplaceableGroup();
                                                } else if (z111) {
                                                    composer3.startReplaceableGroup(-2104362092);
                                                    SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function1111119, function1111118, function11111110, textStyleFromToken2, j111118, j111119, composer3, 0);
                                                    composer3.endReplaceableGroup();
                                                } else {
                                                    composer3.startReplaceableGroup(-2104361812);
                                                    SnackbarKt.m2421OneRowSnackbarkKq0p4A(function1111119, function1111118, function11111110, textStyleFromToken2, j111118, j111119, composer3, 0);
                                                    composer3.endReplaceableGroup();
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer3.skipToGroupEnd();
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }
                                    }), composer2, ProvidedValue.$stable | 48);
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
                        }), composerStartRestartGroup, (i3 & 14) | 12779520 | (i1111 & 112) | (i1111 & 896) | (i1111 & 7168), 80);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function1111117;
                        modifier2 = companion;
                        z3 = z2;
                        shape3 = shape2;
                        j5 = dismissActionContentColor;
                        j6 = contentColor;
                        j7 = actionContentColor;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        final Modifier modifier11 = modifier2;
                        final Function2<? super Composer, ? super Integer, Unit> function1111118 = function5;
                        final long j111118 = color;
                        final long j111119 = j5;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
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

                            public final void invoke(Composer composer2, int i1112) {
                                SnackbarKt.m2422SnackbareQBnUkQ(modifier11, function1111118, function8, z3, shape3, j111118, j6, j7, j111119, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 805306368;
                if ((i3 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i2 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            contentColor = j2;
                        }
                        if ((i2 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            actionContentColor = j3;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        }
                    } else {
                        if (i12 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i2 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            contentColor = j2;
                        }
                        if ((i2 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            actionContentColor = j3;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
                    }
                    final Function2<? super Composer, ? super Integer, Unit> function1111119 = function5;
                    final Function2<? super Composer, ? super Integer, Unit> function11111110 = function7;
                    final long j1111110 = actionContentColor;
                    final long j1111111 = dismissActionContentColor;
                    final boolean z111 = z2;
                    Function2<? super Composer, ? super Integer, Unit> function11111111 = function7;
                    int i1112 = i3 >> 9;
                    SurfaceKt.m2506SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m3326getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i1113) {
                            if ((i1113 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1829663446, i1113, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                                }
                                TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getSupportingTextFont());
                                final TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont());
                                ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                                final Function2<? super Composer, ? super Integer, Unit> function11111112 = function1111119;
                                final Function2<? super Composer, ? super Integer, Unit> function11111113 = function4;
                                final Function2<? super Composer, ? super Integer, Unit> function11111114 = function11111110;
                                final long j1111112 = j1111110;
                                final long j1111113 = j1111111;
                                final boolean z112 = z111;
                                CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i1114) {
                                        if ((i1114 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(835891690, i1114, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                            }
                                            if (function11111112 == null) {
                                                composer3.startReplaceableGroup(-2104362406);
                                                SnackbarKt.m2421OneRowSnackbarkKq0p4A(function11111113, null, function11111114, textStyleFromToken2, j1111112, j1111113, composer3, 48);
                                                composer3.endReplaceableGroup();
                                            } else if (z112) {
                                                composer3.startReplaceableGroup(-2104362092);
                                                SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function11111113, function11111112, function11111114, textStyleFromToken2, j1111112, j1111113, composer3, 0);
                                                composer3.endReplaceableGroup();
                                            } else {
                                                composer3.startReplaceableGroup(-2104361812);
                                                SnackbarKt.m2421OneRowSnackbarkKq0p4A(function11111113, function11111112, function11111114, textStyleFromToken2, j1111112, j1111113, composer3, 0);
                                                composer3.endReplaceableGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }
                                }), composer2, ProvidedValue.$stable | 48);
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
                    }), composerStartRestartGroup, (i3 & 14) | 12779520 | (i1112 & 112) | (i1112 & 896) | (i1112 & 7168), 80);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function11111111;
                    modifier2 = companion;
                    z3 = z2;
                    shape3 = shape2;
                    j5 = dismissActionContentColor;
                    j6 = contentColor;
                    j7 = actionContentColor;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i2 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            contentColor = j2;
                        }
                        if ((i2 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            actionContentColor = j3;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        }
                    } else {
                        if (i12 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i2 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            contentColor = j2;
                        }
                        if ((i2 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            actionContentColor = j3;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
                    }
                    final Function2<? super Composer, ? super Integer, Unit> function11111112 = function5;
                    final Function2<? super Composer, ? super Integer, Unit> function11111113 = function7;
                    final long j1111112 = actionContentColor;
                    final long j1111113 = dismissActionContentColor;
                    final boolean z112 = z2;
                    Function2<? super Composer, ? super Integer, Unit> function11111114 = function7;
                    int i1113 = i3 >> 9;
                    SurfaceKt.m2506SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m3326getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i1114) {
                            if ((i1114 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1829663446, i1114, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                                }
                                TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getSupportingTextFont());
                                final TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont());
                                ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                                final Function2<? super Composer, ? super Integer, Unit> function11111115 = function11111112;
                                final Function2<? super Composer, ? super Integer, Unit> function11111116 = function4;
                                final Function2<? super Composer, ? super Integer, Unit> function11111117 = function11111113;
                                final long j1111114 = j1111112;
                                final long j1111115 = j1111113;
                                final boolean z113 = z112;
                                CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i1115) {
                                        if ((i1115 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(835891690, i1115, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                            }
                                            if (function11111115 == null) {
                                                composer3.startReplaceableGroup(-2104362406);
                                                SnackbarKt.m2421OneRowSnackbarkKq0p4A(function11111116, null, function11111117, textStyleFromToken2, j1111114, j1111115, composer3, 48);
                                                composer3.endReplaceableGroup();
                                            } else if (z113) {
                                                composer3.startReplaceableGroup(-2104362092);
                                                SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function11111116, function11111115, function11111117, textStyleFromToken2, j1111114, j1111115, composer3, 0);
                                                composer3.endReplaceableGroup();
                                            } else {
                                                composer3.startReplaceableGroup(-2104361812);
                                                SnackbarKt.m2421OneRowSnackbarkKq0p4A(function11111116, function11111115, function11111117, textStyleFromToken2, j1111114, j1111115, composer3, 0);
                                                composer3.endReplaceableGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }
                                }), composer2, ProvidedValue.$stable | 48);
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
                    }), composerStartRestartGroup, (i3 & 14) | 12779520 | (i1113 & 112) | (i1113 & 896) | (i1113 & 7168), 80);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function11111114;
                    modifier2 = companion;
                    z3 = z2;
                    shape3 = shape2;
                    j5 = dismissActionContentColor;
                    j6 = contentColor;
                    j7 = actionContentColor;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier12 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function11111115 = function5;
                    final long j1111114 = color;
                    final long j1111115 = j5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
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

                        public final void invoke(Composer composer2, int i1114) {
                            SnackbarKt.m2422SnackbareQBnUkQ(modifier12, function11111115, function8, z3, shape3, j1111114, j6, j7, j1111115, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 3072;
            if ((i & 24576) != 0) {
                i3 |= ((i2 & 16) == 0 || !composerStartRestartGroup.changed(shape)) ? 8192 : 16384;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    color = j;
                    if (composerStartRestartGroup.changed(color)) {
                    }
                    i3 |= i14;
                } else {
                    color = j;
                }
                i3 |= i14;
            } else {
                color = j;
            }
            if ((i & 1572864) != 0) {
                if ((i2 & 64) == 0) {
                    i11 = 524288;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            if ((i & 12582912) != 0) {
                if ((i2 & 128) == 0) {
                    i10 = 4194304;
                } else {
                    i10 = 4194304;
                }
                i3 |= i10;
            }
            if ((100663296 & i) == 0) {
                dismissActionContentColor = j4;
                if ((i2 & 256) == 0) {
                    i9 = 33554432;
                } else {
                    i9 = 33554432;
                }
                i3 |= i9;
            } else {
                dismissActionContentColor = j4;
            }
            if ((i2 & 512) != 0) {
                if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i8 = 536870912;
                    } else {
                        i8 = 268435456;
                    }
                    i3 |= i8;
                }
                if ((i3 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i2 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            contentColor = j2;
                        }
                        if ((i2 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            actionContentColor = j3;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        }
                    } else {
                        if (i12 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i2 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            contentColor = j2;
                        }
                        if ((i2 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            actionContentColor = j3;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
                    }
                    final Function2<? super Composer, ? super Integer, Unit> function11111116 = function5;
                    final Function2<? super Composer, ? super Integer, Unit> function11111117 = function7;
                    final long j1111116 = actionContentColor;
                    final long j1111117 = dismissActionContentColor;
                    final boolean z113 = z2;
                    Function2<? super Composer, ? super Integer, Unit> function11111118 = function7;
                    int i1114 = i3 >> 9;
                    SurfaceKt.m2506SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m3326getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i1115) {
                            if ((i1115 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1829663446, i1115, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                                }
                                TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getSupportingTextFont());
                                final TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont());
                                ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                                final Function2<? super Composer, ? super Integer, Unit> function11111119 = function11111116;
                                final Function2<? super Composer, ? super Integer, Unit> function111111110 = function4;
                                final Function2<? super Composer, ? super Integer, Unit> function111111111 = function11111117;
                                final long j1111118 = j1111116;
                                final long j1111119 = j1111117;
                                final boolean z114 = z113;
                                CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i1116) {
                                        if ((i1116 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(835891690, i1116, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                            }
                                            if (function11111119 == null) {
                                                composer3.startReplaceableGroup(-2104362406);
                                                SnackbarKt.m2421OneRowSnackbarkKq0p4A(function111111110, null, function111111111, textStyleFromToken2, j1111118, j1111119, composer3, 48);
                                                composer3.endReplaceableGroup();
                                            } else if (z114) {
                                                composer3.startReplaceableGroup(-2104362092);
                                                SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function111111110, function11111119, function111111111, textStyleFromToken2, j1111118, j1111119, composer3, 0);
                                                composer3.endReplaceableGroup();
                                            } else {
                                                composer3.startReplaceableGroup(-2104361812);
                                                SnackbarKt.m2421OneRowSnackbarkKq0p4A(function111111110, function11111119, function111111111, textStyleFromToken2, j1111118, j1111119, composer3, 0);
                                                composer3.endReplaceableGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }
                                }), composer2, ProvidedValue.$stable | 48);
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
                    }), composerStartRestartGroup, (i3 & 14) | 12779520 | (i1114 & 112) | (i1114 & 896) | (i1114 & 7168), 80);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function11111118;
                    modifier2 = companion;
                    z3 = z2;
                    shape3 = shape2;
                    j5 = dismissActionContentColor;
                    j6 = contentColor;
                    j7 = actionContentColor;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i2 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            contentColor = j2;
                        }
                        if ((i2 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            actionContentColor = j3;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        }
                    } else {
                        if (i12 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i2 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            contentColor = j2;
                        }
                        if ((i2 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            actionContentColor = j3;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
                    }
                    final Function2<? super Composer, ? super Integer, Unit> function11111119 = function5;
                    final Function2<? super Composer, ? super Integer, Unit> function111111110 = function7;
                    final long j1111118 = actionContentColor;
                    final long j1111119 = dismissActionContentColor;
                    final boolean z114 = z2;
                    Function2<? super Composer, ? super Integer, Unit> function111111111 = function7;
                    int i1115 = i3 >> 9;
                    SurfaceKt.m2506SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m3326getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i1116) {
                            if ((i1116 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1829663446, i1116, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                                }
                                TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getSupportingTextFont());
                                final TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont());
                                ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                                final Function2<? super Composer, ? super Integer, Unit> function111111112 = function11111119;
                                final Function2<? super Composer, ? super Integer, Unit> function111111113 = function4;
                                final Function2<? super Composer, ? super Integer, Unit> function111111114 = function111111110;
                                final long j11111110 = j1111118;
                                final long j11111111 = j1111119;
                                final boolean z115 = z114;
                                CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i1117) {
                                        if ((i1117 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(835891690, i1117, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                            }
                                            if (function111111112 == null) {
                                                composer3.startReplaceableGroup(-2104362406);
                                                SnackbarKt.m2421OneRowSnackbarkKq0p4A(function111111113, null, function111111114, textStyleFromToken2, j11111110, j11111111, composer3, 48);
                                                composer3.endReplaceableGroup();
                                            } else if (z115) {
                                                composer3.startReplaceableGroup(-2104362092);
                                                SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function111111113, function111111112, function111111114, textStyleFromToken2, j11111110, j11111111, composer3, 0);
                                                composer3.endReplaceableGroup();
                                            } else {
                                                composer3.startReplaceableGroup(-2104361812);
                                                SnackbarKt.m2421OneRowSnackbarkKq0p4A(function111111113, function111111112, function111111114, textStyleFromToken2, j11111110, j11111111, composer3, 0);
                                                composer3.endReplaceableGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }
                                }), composer2, ProvidedValue.$stable | 48);
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
                    }), composerStartRestartGroup, (i3 & 14) | 12779520 | (i1115 & 112) | (i1115 & 896) | (i1115 & 7168), 80);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function111111111;
                    modifier2 = companion;
                    z3 = z2;
                    shape3 = shape2;
                    j5 = dismissActionContentColor;
                    j6 = contentColor;
                    j7 = actionContentColor;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier13 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function111111112 = function5;
                    final long j11111110 = color;
                    final long j11111111 = j5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
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

                        public final void invoke(Composer composer2, int i1116) {
                            SnackbarKt.m2422SnackbareQBnUkQ(modifier13, function111111112, function8, z3, shape3, j11111110, j6, j7, j11111111, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 805306368;
            if ((i3 & 306783379) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i4 == 0) {
                    }
                    if (i6 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i2 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        contentColor = j2;
                    }
                    if ((i2 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        actionContentColor = j3;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    }
                } else {
                    if (i12 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i4 == 0) {
                    }
                    if (i6 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i2 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        contentColor = j2;
                    }
                    if ((i2 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        actionContentColor = j3;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
                }
                final Function2<? super Composer, ? super Integer, Unit> function111111113 = function5;
                final Function2<? super Composer, ? super Integer, Unit> function111111114 = function7;
                final long j11111112 = actionContentColor;
                final long j11111113 = dismissActionContentColor;
                final boolean z115 = z2;
                Function2<? super Composer, ? super Integer, Unit> function111111115 = function7;
                int i1116 = i3 >> 9;
                SurfaceKt.m2506SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m3326getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i1117) {
                        if ((i1117 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1829663446, i1117, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                            }
                            TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getSupportingTextFont());
                            final TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont());
                            ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                            final Function2<? super Composer, ? super Integer, Unit> function111111116 = function111111113;
                            final Function2<? super Composer, ? super Integer, Unit> function111111117 = function4;
                            final Function2<? super Composer, ? super Integer, Unit> function111111118 = function111111114;
                            final long j11111114 = j11111112;
                            final long j11111115 = j11111113;
                            final boolean z116 = z115;
                            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i1118) {
                                    if ((i1118 & 3) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(835891690, i1118, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                        }
                                        if (function111111116 == null) {
                                            composer3.startReplaceableGroup(-2104362406);
                                            SnackbarKt.m2421OneRowSnackbarkKq0p4A(function111111117, null, function111111118, textStyleFromToken2, j11111114, j11111115, composer3, 48);
                                            composer3.endReplaceableGroup();
                                        } else if (z116) {
                                            composer3.startReplaceableGroup(-2104362092);
                                            SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function111111117, function111111116, function111111118, textStyleFromToken2, j11111114, j11111115, composer3, 0);
                                            composer3.endReplaceableGroup();
                                        } else {
                                            composer3.startReplaceableGroup(-2104361812);
                                            SnackbarKt.m2421OneRowSnackbarkKq0p4A(function111111117, function111111116, function111111118, textStyleFromToken2, j11111114, j11111115, composer3, 0);
                                            composer3.endReplaceableGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }
                            }), composer2, ProvidedValue.$stable | 48);
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
                }), composerStartRestartGroup, (i3 & 14) | 12779520 | (i1116 & 112) | (i1116 & 896) | (i1116 & 7168), 80);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function111111115;
                modifier2 = companion;
                z3 = z2;
                shape3 = shape2;
                j5 = dismissActionContentColor;
                j6 = contentColor;
                j7 = actionContentColor;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i4 == 0) {
                    }
                    if (i6 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i2 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        contentColor = j2;
                    }
                    if ((i2 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        actionContentColor = j3;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    }
                } else {
                    if (i12 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i4 == 0) {
                    }
                    if (i6 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i2 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        contentColor = j2;
                    }
                    if ((i2 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        actionContentColor = j3;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
                }
                final Function2<? super Composer, ? super Integer, Unit> function111111116 = function5;
                final Function2<? super Composer, ? super Integer, Unit> function111111117 = function7;
                final long j11111114 = actionContentColor;
                final long j11111115 = dismissActionContentColor;
                final boolean z116 = z2;
                Function2<? super Composer, ? super Integer, Unit> function111111118 = function7;
                int i1117 = i3 >> 9;
                SurfaceKt.m2506SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m3326getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i1118) {
                        if ((i1118 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1829663446, i1118, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                            }
                            TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getSupportingTextFont());
                            final TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont());
                            ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                            final Function2<? super Composer, ? super Integer, Unit> function111111119 = function111111116;
                            final Function2<? super Composer, ? super Integer, Unit> function1111111110 = function4;
                            final Function2<? super Composer, ? super Integer, Unit> function1111111111 = function111111117;
                            final long j11111116 = j11111114;
                            final long j11111117 = j11111115;
                            final boolean z117 = z116;
                            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i1119) {
                                    if ((i1119 & 3) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(835891690, i1119, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                        }
                                        if (function111111119 == null) {
                                            composer3.startReplaceableGroup(-2104362406);
                                            SnackbarKt.m2421OneRowSnackbarkKq0p4A(function1111111110, null, function1111111111, textStyleFromToken2, j11111116, j11111117, composer3, 48);
                                            composer3.endReplaceableGroup();
                                        } else if (z117) {
                                            composer3.startReplaceableGroup(-2104362092);
                                            SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function1111111110, function111111119, function1111111111, textStyleFromToken2, j11111116, j11111117, composer3, 0);
                                            composer3.endReplaceableGroup();
                                        } else {
                                            composer3.startReplaceableGroup(-2104361812);
                                            SnackbarKt.m2421OneRowSnackbarkKq0p4A(function1111111110, function111111119, function1111111111, textStyleFromToken2, j11111116, j11111117, composer3, 0);
                                            composer3.endReplaceableGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }
                            }), composer2, ProvidedValue.$stable | 48);
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
                }), composerStartRestartGroup, (i3 & 14) | 12779520 | (i1117 & 112) | (i1117 & 896) | (i1117 & 7168), 80);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function111111118;
                modifier2 = companion;
                z3 = z2;
                shape3 = shape2;
                j5 = dismissActionContentColor;
                j6 = contentColor;
                j7 = actionContentColor;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier14 = modifier2;
                final Function2<? super Composer, ? super Integer, Unit> function111111119 = function5;
                final long j11111116 = color;
                final long j11111117 = j5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
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

                    public final void invoke(Composer composer2, int i1118) {
                        SnackbarKt.m2422SnackbareQBnUkQ(modifier14, function111111119, function8, z3, shape3, j11111116, j6, j7, j11111117, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 384;
        function6 = function3;
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                if (composerStartRestartGroup.changed(z)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i & 24576) != 0) {
                i3 |= ((i2 & 16) == 0 || !composerStartRestartGroup.changed(shape)) ? 8192 : 16384;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    color = j;
                    if (composerStartRestartGroup.changed(color)) {
                    }
                    i3 |= i14;
                } else {
                    color = j;
                }
                i3 |= i14;
            } else {
                color = j;
            }
            if ((i & 1572864) != 0) {
                if ((i2 & 64) == 0) {
                    i11 = 524288;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            if ((i & 12582912) != 0) {
                if ((i2 & 128) == 0) {
                    i10 = 4194304;
                } else {
                    i10 = 4194304;
                }
                i3 |= i10;
            }
            if ((100663296 & i) == 0) {
                dismissActionContentColor = j4;
                if ((i2 & 256) == 0) {
                    i9 = 33554432;
                } else {
                    i9 = 33554432;
                }
                i3 |= i9;
            } else {
                dismissActionContentColor = j4;
            }
            if ((i2 & 512) != 0) {
                if ((i & 805306368) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i8 = 536870912;
                    } else {
                        i8 = 268435456;
                    }
                    i3 |= i8;
                }
                if ((i3 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i2 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            contentColor = j2;
                        }
                        if ((i2 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            actionContentColor = j3;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        }
                    } else {
                        if (i12 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i2 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            contentColor = j2;
                        }
                        if ((i2 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            actionContentColor = j3;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
                    }
                    final Function2<? super Composer, ? super Integer, Unit> function1111111110 = function5;
                    final Function2<? super Composer, ? super Integer, Unit> function1111111111 = function7;
                    final long j11111118 = actionContentColor;
                    final long j11111119 = dismissActionContentColor;
                    final boolean z117 = z2;
                    Function2<? super Composer, ? super Integer, Unit> function1111111112 = function7;
                    int i1118 = i3 >> 9;
                    SurfaceKt.m2506SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m3326getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i1119) {
                            if ((i1119 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1829663446, i1119, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                                }
                                TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getSupportingTextFont());
                                final TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont());
                                ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                                final Function2<? super Composer, ? super Integer, Unit> function1111111113 = function1111111110;
                                final Function2<? super Composer, ? super Integer, Unit> function1111111114 = function4;
                                final Function2<? super Composer, ? super Integer, Unit> function1111111115 = function1111111111;
                                final long j111111110 = j11111118;
                                final long j111111111 = j11111119;
                                final boolean z118 = z117;
                                CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i11110) {
                                        if ((i11110 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(835891690, i11110, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                            }
                                            if (function1111111113 == null) {
                                                composer3.startReplaceableGroup(-2104362406);
                                                SnackbarKt.m2421OneRowSnackbarkKq0p4A(function1111111114, null, function1111111115, textStyleFromToken2, j111111110, j111111111, composer3, 48);
                                                composer3.endReplaceableGroup();
                                            } else if (z118) {
                                                composer3.startReplaceableGroup(-2104362092);
                                                SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function1111111114, function1111111113, function1111111115, textStyleFromToken2, j111111110, j111111111, composer3, 0);
                                                composer3.endReplaceableGroup();
                                            } else {
                                                composer3.startReplaceableGroup(-2104361812);
                                                SnackbarKt.m2421OneRowSnackbarkKq0p4A(function1111111114, function1111111113, function1111111115, textStyleFromToken2, j111111110, j111111111, composer3, 0);
                                                composer3.endReplaceableGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }
                                }), composer2, ProvidedValue.$stable | 48);
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
                    }), composerStartRestartGroup, (i3 & 14) | 12779520 | (i1118 & 112) | (i1118 & 896) | (i1118 & 7168), 80);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function1111111112;
                    modifier2 = companion;
                    z3 = z2;
                    shape3 = shape2;
                    j5 = dismissActionContentColor;
                    j6 = contentColor;
                    j7 = actionContentColor;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i12 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i2 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            contentColor = j2;
                        }
                        if ((i2 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            actionContentColor = j3;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        }
                    } else {
                        if (i12 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier;
                        }
                        if (i13 != 0) {
                            function5 = null;
                        }
                        if (i4 == 0) {
                        }
                        if (i6 != 0) {
                            z2 = false;
                        } else {
                            z2 = z;
                        }
                        if ((i2 & 16) != 0) {
                            shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            shape2 = shape;
                        }
                        if ((i2 & 32) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            contentColor = j2;
                        }
                        if ((i2 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            actionContentColor = j3;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
                    }
                    final Function2<? super Composer, ? super Integer, Unit> function1111111113 = function5;
                    final Function2<? super Composer, ? super Integer, Unit> function1111111114 = function7;
                    final long j111111110 = actionContentColor;
                    final long j111111111 = dismissActionContentColor;
                    final boolean z118 = z2;
                    Function2<? super Composer, ? super Integer, Unit> function1111111115 = function7;
                    int i1119 = i3 >> 9;
                    SurfaceKt.m2506SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m3326getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11110) {
                            if ((i11110 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1829663446, i11110, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                                }
                                TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getSupportingTextFont());
                                final TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont());
                                ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                                final Function2<? super Composer, ? super Integer, Unit> function1111111116 = function1111111113;
                                final Function2<? super Composer, ? super Integer, Unit> function1111111117 = function4;
                                final Function2<? super Composer, ? super Integer, Unit> function1111111118 = function1111111114;
                                final long j111111112 = j111111110;
                                final long j111111113 = j111111111;
                                final boolean z119 = z118;
                                CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i11111) {
                                        if ((i11111 & 3) != 2 || !composer3.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(835891690, i11111, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                            }
                                            if (function1111111116 == null) {
                                                composer3.startReplaceableGroup(-2104362406);
                                                SnackbarKt.m2421OneRowSnackbarkKq0p4A(function1111111117, null, function1111111118, textStyleFromToken2, j111111112, j111111113, composer3, 48);
                                                composer3.endReplaceableGroup();
                                            } else if (z119) {
                                                composer3.startReplaceableGroup(-2104362092);
                                                SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function1111111117, function1111111116, function1111111118, textStyleFromToken2, j111111112, j111111113, composer3, 0);
                                                composer3.endReplaceableGroup();
                                            } else {
                                                composer3.startReplaceableGroup(-2104361812);
                                                SnackbarKt.m2421OneRowSnackbarkKq0p4A(function1111111117, function1111111116, function1111111118, textStyleFromToken2, j111111112, j111111113, composer3, 0);
                                                composer3.endReplaceableGroup();
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer3.skipToGroupEnd();
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }
                                }), composer2, ProvidedValue.$stable | 48);
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
                    }), composerStartRestartGroup, (i3 & 14) | 12779520 | (i1119 & 112) | (i1119 & 896) | (i1119 & 7168), 80);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function1111111115;
                    modifier2 = companion;
                    z3 = z2;
                    shape3 = shape2;
                    j5 = dismissActionContentColor;
                    j6 = contentColor;
                    j7 = actionContentColor;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier15 = modifier2;
                    final Function2<? super Composer, ? super Integer, Unit> function1111111116 = function5;
                    final long j111111112 = color;
                    final long j111111113 = j5;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
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

                        public final void invoke(Composer composer2, int i11110) {
                            SnackbarKt.m2422SnackbareQBnUkQ(modifier15, function1111111116, function8, z3, shape3, j111111112, j6, j7, j111111113, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 805306368;
            if ((i3 & 306783379) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i4 == 0) {
                    }
                    if (i6 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i2 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        contentColor = j2;
                    }
                    if ((i2 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        actionContentColor = j3;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    }
                } else {
                    if (i12 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i4 == 0) {
                    }
                    if (i6 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i2 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        contentColor = j2;
                    }
                    if ((i2 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        actionContentColor = j3;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
                }
                final Function2<? super Composer, ? super Integer, Unit> function1111111117 = function5;
                final Function2<? super Composer, ? super Integer, Unit> function1111111118 = function7;
                final long j111111114 = actionContentColor;
                final long j111111115 = dismissActionContentColor;
                final boolean z119 = z2;
                Function2<? super Composer, ? super Integer, Unit> function1111111119 = function7;
                int i11110 = i3 >> 9;
                SurfaceKt.m2506SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m3326getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11111) {
                        if ((i11111 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1829663446, i11111, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                            }
                            TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getSupportingTextFont());
                            final TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont());
                            ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                            final Function2<? super Composer, ? super Integer, Unit> function11111111110 = function1111111117;
                            final Function2<? super Composer, ? super Integer, Unit> function11111111111 = function4;
                            final Function2<? super Composer, ? super Integer, Unit> function11111111112 = function1111111118;
                            final long j111111116 = j111111114;
                            final long j111111117 = j111111115;
                            final boolean z1110 = z119;
                            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i11112) {
                                    if ((i11112 & 3) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(835891690, i11112, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                        }
                                        if (function11111111110 == null) {
                                            composer3.startReplaceableGroup(-2104362406);
                                            SnackbarKt.m2421OneRowSnackbarkKq0p4A(function11111111111, null, function11111111112, textStyleFromToken2, j111111116, j111111117, composer3, 48);
                                            composer3.endReplaceableGroup();
                                        } else if (z1110) {
                                            composer3.startReplaceableGroup(-2104362092);
                                            SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function11111111111, function11111111110, function11111111112, textStyleFromToken2, j111111116, j111111117, composer3, 0);
                                            composer3.endReplaceableGroup();
                                        } else {
                                            composer3.startReplaceableGroup(-2104361812);
                                            SnackbarKt.m2421OneRowSnackbarkKq0p4A(function11111111111, function11111111110, function11111111112, textStyleFromToken2, j111111116, j111111117, composer3, 0);
                                            composer3.endReplaceableGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }
                            }), composer2, ProvidedValue.$stable | 48);
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
                }), composerStartRestartGroup, (i3 & 14) | 12779520 | (i11110 & 112) | (i11110 & 896) | (i11110 & 7168), 80);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function1111111119;
                modifier2 = companion;
                z3 = z2;
                shape3 = shape2;
                j5 = dismissActionContentColor;
                j6 = contentColor;
                j7 = actionContentColor;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i4 == 0) {
                    }
                    if (i6 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i2 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        contentColor = j2;
                    }
                    if ((i2 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        actionContentColor = j3;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    }
                } else {
                    if (i12 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i4 == 0) {
                    }
                    if (i6 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i2 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        contentColor = j2;
                    }
                    if ((i2 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        actionContentColor = j3;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
                }
                final Function2<? super Composer, ? super Integer, Unit> function11111111110 = function5;
                final Function2<? super Composer, ? super Integer, Unit> function11111111111 = function7;
                final long j111111116 = actionContentColor;
                final long j111111117 = dismissActionContentColor;
                final boolean z1110 = z2;
                Function2<? super Composer, ? super Integer, Unit> function11111111112 = function7;
                int i11111 = i3 >> 9;
                SurfaceKt.m2506SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m3326getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11112) {
                        if ((i11112 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1829663446, i11112, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                            }
                            TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getSupportingTextFont());
                            final TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont());
                            ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                            final Function2<? super Composer, ? super Integer, Unit> function11111111113 = function11111111110;
                            final Function2<? super Composer, ? super Integer, Unit> function11111111114 = function4;
                            final Function2<? super Composer, ? super Integer, Unit> function11111111115 = function11111111111;
                            final long j111111118 = j111111116;
                            final long j111111119 = j111111117;
                            final boolean z1111 = z1110;
                            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i11113) {
                                    if ((i11113 & 3) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(835891690, i11113, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                        }
                                        if (function11111111113 == null) {
                                            composer3.startReplaceableGroup(-2104362406);
                                            SnackbarKt.m2421OneRowSnackbarkKq0p4A(function11111111114, null, function11111111115, textStyleFromToken2, j111111118, j111111119, composer3, 48);
                                            composer3.endReplaceableGroup();
                                        } else if (z1111) {
                                            composer3.startReplaceableGroup(-2104362092);
                                            SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function11111111114, function11111111113, function11111111115, textStyleFromToken2, j111111118, j111111119, composer3, 0);
                                            composer3.endReplaceableGroup();
                                        } else {
                                            composer3.startReplaceableGroup(-2104361812);
                                            SnackbarKt.m2421OneRowSnackbarkKq0p4A(function11111111114, function11111111113, function11111111115, textStyleFromToken2, j111111118, j111111119, composer3, 0);
                                            composer3.endReplaceableGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }
                            }), composer2, ProvidedValue.$stable | 48);
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
                }), composerStartRestartGroup, (i3 & 14) | 12779520 | (i11111 & 112) | (i11111 & 896) | (i11111 & 7168), 80);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function11111111112;
                modifier2 = companion;
                z3 = z2;
                shape3 = shape2;
                j5 = dismissActionContentColor;
                j6 = contentColor;
                j7 = actionContentColor;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier16 = modifier2;
                final Function2<? super Composer, ? super Integer, Unit> function11111111113 = function5;
                final long j111111118 = color;
                final long j111111119 = j5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
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

                    public final void invoke(Composer composer2, int i11112) {
                        SnackbarKt.m2422SnackbareQBnUkQ(modifier16, function11111111113, function8, z3, shape3, j111111118, j6, j7, j111111119, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 3072;
        if ((i & 24576) != 0) {
            i3 |= ((i2 & 16) == 0 || !composerStartRestartGroup.changed(shape)) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                color = j;
                if (composerStartRestartGroup.changed(color)) {
                }
                i3 |= i14;
            } else {
                color = j;
            }
            i3 |= i14;
        } else {
            color = j;
        }
        if ((i & 1572864) != 0) {
            if ((i2 & 64) == 0) {
                i11 = 524288;
            } else {
                i11 = 524288;
            }
            i3 |= i11;
        }
        if ((i & 12582912) != 0) {
            if ((i2 & 128) == 0) {
                i10 = 4194304;
            } else {
                i10 = 4194304;
            }
            i3 |= i10;
        }
        if ((100663296 & i) == 0) {
            dismissActionContentColor = j4;
            if ((i2 & 256) == 0) {
                i9 = 33554432;
            } else {
                i9 = 33554432;
            }
            i3 |= i9;
        } else {
            dismissActionContentColor = j4;
        }
        if ((i2 & 512) != 0) {
            if ((i & 805306368) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i8 = 536870912;
                } else {
                    i8 = 268435456;
                }
                i3 |= i8;
            }
            if ((i3 & 306783379) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i4 == 0) {
                    }
                    if (i6 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i2 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        contentColor = j2;
                    }
                    if ((i2 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        actionContentColor = j3;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    }
                } else {
                    if (i12 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i4 == 0) {
                    }
                    if (i6 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i2 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        contentColor = j2;
                    }
                    if ((i2 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        actionContentColor = j3;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
                }
                final Function2<? super Composer, ? super Integer, Unit> function11111111114 = function5;
                final Function2<? super Composer, ? super Integer, Unit> function11111111115 = function7;
                final long j1111111110 = actionContentColor;
                final long j1111111111 = dismissActionContentColor;
                final boolean z1111 = z2;
                Function2<? super Composer, ? super Integer, Unit> function11111111116 = function7;
                int i11112 = i3 >> 9;
                SurfaceKt.m2506SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m3326getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11113) {
                        if ((i11113 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1829663446, i11113, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                            }
                            TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getSupportingTextFont());
                            final TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont());
                            ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                            final Function2<? super Composer, ? super Integer, Unit> function11111111117 = function11111111114;
                            final Function2<? super Composer, ? super Integer, Unit> function11111111118 = function4;
                            final Function2<? super Composer, ? super Integer, Unit> function11111111119 = function11111111115;
                            final long j1111111112 = j1111111110;
                            final long j1111111113 = j1111111111;
                            final boolean z1112 = z1111;
                            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i11114) {
                                    if ((i11114 & 3) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(835891690, i11114, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                        }
                                        if (function11111111117 == null) {
                                            composer3.startReplaceableGroup(-2104362406);
                                            SnackbarKt.m2421OneRowSnackbarkKq0p4A(function11111111118, null, function11111111119, textStyleFromToken2, j1111111112, j1111111113, composer3, 48);
                                            composer3.endReplaceableGroup();
                                        } else if (z1112) {
                                            composer3.startReplaceableGroup(-2104362092);
                                            SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function11111111118, function11111111117, function11111111119, textStyleFromToken2, j1111111112, j1111111113, composer3, 0);
                                            composer3.endReplaceableGroup();
                                        } else {
                                            composer3.startReplaceableGroup(-2104361812);
                                            SnackbarKt.m2421OneRowSnackbarkKq0p4A(function11111111118, function11111111117, function11111111119, textStyleFromToken2, j1111111112, j1111111113, composer3, 0);
                                            composer3.endReplaceableGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }
                            }), composer2, ProvidedValue.$stable | 48);
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
                }), composerStartRestartGroup, (i3 & 14) | 12779520 | (i11112 & 112) | (i11112 & 896) | (i11112 & 7168), 80);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function11111111116;
                modifier2 = companion;
                z3 = z2;
                shape3 = shape2;
                j5 = dismissActionContentColor;
                j6 = contentColor;
                j7 = actionContentColor;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i4 == 0) {
                    }
                    if (i6 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i2 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        contentColor = j2;
                    }
                    if ((i2 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        actionContentColor = j3;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    }
                } else {
                    if (i12 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier;
                    }
                    if (i13 != 0) {
                        function5 = null;
                    }
                    if (i4 == 0) {
                    }
                    if (i6 != 0) {
                        z2 = false;
                    } else {
                        z2 = z;
                    }
                    if ((i2 & 16) != 0) {
                        shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        shape2 = shape;
                    }
                    if ((i2 & 32) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    }
                    if ((i2 & 64) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        contentColor = j2;
                    }
                    if ((i2 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        actionContentColor = j3;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
                }
                final Function2<? super Composer, ? super Integer, Unit> function11111111117 = function5;
                final Function2<? super Composer, ? super Integer, Unit> function11111111118 = function7;
                final long j1111111112 = actionContentColor;
                final long j1111111113 = dismissActionContentColor;
                final boolean z1112 = z2;
                Function2<? super Composer, ? super Integer, Unit> function11111111119 = function7;
                int i11113 = i3 >> 9;
                SurfaceKt.m2506SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m3326getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11114) {
                        if ((i11114 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1829663446, i11114, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                            }
                            TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getSupportingTextFont());
                            final TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont());
                            ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                            final Function2<? super Composer, ? super Integer, Unit> function111111111110 = function11111111117;
                            final Function2<? super Composer, ? super Integer, Unit> function111111111111 = function4;
                            final Function2<? super Composer, ? super Integer, Unit> function111111111112 = function11111111118;
                            final long j1111111114 = j1111111112;
                            final long j1111111115 = j1111111113;
                            final boolean z1113 = z1112;
                            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                                @Override // kotlin.jvm.functions.Function2
                                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i11115) {
                                    if ((i11115 & 3) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(835891690, i11115, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                        }
                                        if (function111111111110 == null) {
                                            composer3.startReplaceableGroup(-2104362406);
                                            SnackbarKt.m2421OneRowSnackbarkKq0p4A(function111111111111, null, function111111111112, textStyleFromToken2, j1111111114, j1111111115, composer3, 48);
                                            composer3.endReplaceableGroup();
                                        } else if (z1113) {
                                            composer3.startReplaceableGroup(-2104362092);
                                            SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function111111111111, function111111111110, function111111111112, textStyleFromToken2, j1111111114, j1111111115, composer3, 0);
                                            composer3.endReplaceableGroup();
                                        } else {
                                            composer3.startReplaceableGroup(-2104361812);
                                            SnackbarKt.m2421OneRowSnackbarkKq0p4A(function111111111111, function111111111110, function111111111112, textStyleFromToken2, j1111111114, j1111111115, composer3, 0);
                                            composer3.endReplaceableGroup();
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }
                            }), composer2, ProvidedValue.$stable | 48);
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
                }), composerStartRestartGroup, (i3 & 14) | 12779520 | (i11113 & 112) | (i11113 & 896) | (i11113 & 7168), 80);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function11111111119;
                modifier2 = companion;
                z3 = z2;
                shape3 = shape2;
                j5 = dismissActionContentColor;
                j6 = contentColor;
                j7 = actionContentColor;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier17 = modifier2;
                final Function2<? super Composer, ? super Integer, Unit> function111111111110 = function5;
                final long j1111111114 = color;
                final long j1111111115 = j5;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
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

                    public final void invoke(Composer composer2, int i11114) {
                        SnackbarKt.m2422SnackbareQBnUkQ(modifier17, function111111111110, function8, z3, shape3, j1111111114, j6, j7, j1111111115, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 805306368;
        if ((i3 & 306783379) == 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i13 != 0) {
                    function5 = null;
                }
                if (i4 == 0) {
                }
                if (i6 != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                if ((i2 & 16) != 0) {
                    shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i3 &= -57345;
                } else {
                    shape2 = shape;
                }
                if ((i2 & 32) != 0) {
                    color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    contentColor = j2;
                }
                if ((i2 & 128) != 0) {
                    actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                    i3 &= -29360129;
                } else {
                    actionContentColor = j3;
                }
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                    dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                }
            } else {
                if (i12 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i13 != 0) {
                    function5 = null;
                }
                if (i4 == 0) {
                }
                if (i6 != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                if ((i2 & 16) != 0) {
                    shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i3 &= -57345;
                } else {
                    shape2 = shape;
                }
                if ((i2 & 32) != 0) {
                    color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    contentColor = j2;
                }
                if ((i2 & 128) != 0) {
                    actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                    i3 &= -29360129;
                } else {
                    actionContentColor = j3;
                }
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                    dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
            }
            final Function2<? super Composer, ? super Integer, Unit> function111111111111 = function5;
            final Function2<? super Composer, ? super Integer, Unit> function111111111112 = function7;
            final long j1111111116 = actionContentColor;
            final long j1111111117 = dismissActionContentColor;
            final boolean z1113 = z2;
            Function2<? super Composer, ? super Integer, Unit> function111111111113 = function7;
            int i11114 = i3 >> 9;
            SurfaceKt.m2506SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m3326getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i11115) {
                    if ((i11115 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1829663446, i11115, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                        }
                        TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getSupportingTextFont());
                        final TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont());
                        ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                        final Function2<? super Composer, ? super Integer, Unit> function111111111114 = function111111111111;
                        final Function2<? super Composer, ? super Integer, Unit> function111111111115 = function4;
                        final Function2<? super Composer, ? super Integer, Unit> function111111111116 = function111111111112;
                        final long j1111111118 = j1111111116;
                        final long j1111111119 = j1111111117;
                        final boolean z1114 = z1113;
                        CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i11116) {
                                if ((i11116 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(835891690, i11116, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                    }
                                    if (function111111111114 == null) {
                                        composer3.startReplaceableGroup(-2104362406);
                                        SnackbarKt.m2421OneRowSnackbarkKq0p4A(function111111111115, null, function111111111116, textStyleFromToken2, j1111111118, j1111111119, composer3, 48);
                                        composer3.endReplaceableGroup();
                                    } else if (z1114) {
                                        composer3.startReplaceableGroup(-2104362092);
                                        SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function111111111115, function111111111114, function111111111116, textStyleFromToken2, j1111111118, j1111111119, composer3, 0);
                                        composer3.endReplaceableGroup();
                                    } else {
                                        composer3.startReplaceableGroup(-2104361812);
                                        SnackbarKt.m2421OneRowSnackbarkKq0p4A(function111111111115, function111111111114, function111111111116, textStyleFromToken2, j1111111118, j1111111119, composer3, 0);
                                        composer3.endReplaceableGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }
                        }), composer2, ProvidedValue.$stable | 48);
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
            }), composerStartRestartGroup, (i3 & 14) | 12779520 | (i11114 & 112) | (i11114 & 896) | (i11114 & 7168), 80);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function8 = function111111111113;
            modifier2 = companion;
            z3 = z2;
            shape3 = shape2;
            j5 = dismissActionContentColor;
            j6 = contentColor;
            j7 = actionContentColor;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i13 != 0) {
                    function5 = null;
                }
                if (i4 == 0) {
                }
                if (i6 != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                if ((i2 & 16) != 0) {
                    shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i3 &= -57345;
                } else {
                    shape2 = shape;
                }
                if ((i2 & 32) != 0) {
                    color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    contentColor = j2;
                }
                if ((i2 & 128) != 0) {
                    actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                    i3 &= -29360129;
                } else {
                    actionContentColor = j3;
                }
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                    dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                }
            } else {
                if (i12 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier;
                }
                if (i13 != 0) {
                    function5 = null;
                }
                if (i4 == 0) {
                }
                if (i6 != 0) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                if ((i2 & 16) != 0) {
                    shape2 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i3 &= -57345;
                } else {
                    shape2 = shape;
                }
                if ((i2 & 32) != 0) {
                    color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                    i3 &= -458753;
                }
                if ((i2 & 64) != 0) {
                    contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    contentColor = j2;
                }
                if ((i2 & 128) != 0) {
                    actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                    i3 &= -29360129;
                } else {
                    actionContentColor = j3;
                }
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                    dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1235788955, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:107)");
            }
            final Function2<? super Composer, ? super Integer, Unit> function111111111114 = function5;
            final Function2<? super Composer, ? super Integer, Unit> function111111111115 = function7;
            final long j1111111118 = actionContentColor;
            final long j1111111119 = dismissActionContentColor;
            final boolean z1114 = z2;
            Function2<? super Composer, ? super Integer, Unit> function111111111116 = function7;
            int i11115 = i3 >> 9;
            SurfaceKt.m2506SurfaceT9BRK9s(companion, shape2, color, contentColor, 0.0f, SnackbarTokens.INSTANCE.m3326getContainerElevationD9Ej5fM(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1829663446, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1
                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i11116) {
                    if ((i11116 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1829663446, i11116, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:115)");
                        }
                        TextStyle textStyleFromToken = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getSupportingTextFont());
                        final TextStyle textStyleFromToken2 = TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer2, 6), SnackbarTokens.INSTANCE.getActionLabelTextFont());
                        ProvidedValue<TextStyle> providedValueProvides = TextKt.getLocalTextStyle().provides(textStyleFromToken);
                        final Function2<? super Composer, ? super Integer, Unit> function111111111117 = function111111111114;
                        final Function2<? super Composer, ? super Integer, Unit> function111111111118 = function4;
                        final Function2<? super Composer, ? super Integer, Unit> function111111111119 = function111111111115;
                        final long j11111111110 = j1111111118;
                        final long j11111111111 = j1111111119;
                        final boolean z1115 = z1114;
                        CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 835891690, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i11117) {
                                if ((i11117 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(835891690, i11117, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:118)");
                                    }
                                    if (function111111111117 == null) {
                                        composer3.startReplaceableGroup(-2104362406);
                                        SnackbarKt.m2421OneRowSnackbarkKq0p4A(function111111111118, null, function111111111119, textStyleFromToken2, j11111111110, j11111111111, composer3, 48);
                                        composer3.endReplaceableGroup();
                                    } else if (z1115) {
                                        composer3.startReplaceableGroup(-2104362092);
                                        SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function111111111118, function111111111117, function111111111119, textStyleFromToken2, j11111111110, j11111111111, composer3, 0);
                                        composer3.endReplaceableGroup();
                                    } else {
                                        composer3.startReplaceableGroup(-2104361812);
                                        SnackbarKt.m2421OneRowSnackbarkKq0p4A(function111111111118, function111111111117, function111111111119, textStyleFromToken2, j11111111110, j11111111111, composer3, 0);
                                        composer3.endReplaceableGroup();
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }
                        }), composer2, ProvidedValue.$stable | 48);
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
            }), composerStartRestartGroup, (i3 & 14) | 12779520 | (i11115 & 112) | (i11115 & 896) | (i11115 & 7168), 80);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function8 = function111111111116;
            modifier2 = companion;
            z3 = z2;
            shape3 = shape2;
            j5 = dismissActionContentColor;
            j6 = contentColor;
            j7 = actionContentColor;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier18 = modifier2;
            final Function2<? super Composer, ? super Integer, Unit> function111111111117 = function5;
            final long j11111111110 = color;
            final long j11111111111 = j5;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$2
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

                public final void invoke(Composer composer2, int i11116) {
                    SnackbarKt.m2422SnackbareQBnUkQ(modifier18, function111111111117, function8, z3, shape3, j11111111110, j6, j7, j11111111111, function4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0109  */
    /* JADX WARN: Code duplicated, block: B:103:0x0120  */
    /* JADX WARN: Code duplicated, block: B:105:0x0136  */
    /* JADX WARN: Code duplicated, block: B:126:0x016e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x0170  */
    /* JADX WARN: Code duplicated, block: B:128:0x0175  */
    /* JADX WARN: Code duplicated, block: B:130:0x0178  */
    /* JADX WARN: Code duplicated, block: B:131:0x017a  */
    /* JADX WARN: Code duplicated, block: B:134:0x0180  */
    /* JADX WARN: Code duplicated, block: B:135:0x0189  */
    /* JADX WARN: Code duplicated, block: B:138:0x018e  */
    /* JADX WARN: Code duplicated, block: B:139:0x0197  */
    /* JADX WARN: Code duplicated, block: B:142:0x019c  */
    /* JADX WARN: Code duplicated, block: B:143:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:146:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:147:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:150:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:154:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:155:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:161:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:162:0x020e  */
    /* JADX WARN: Code duplicated, block: B:165:0x021f  */
    /* JADX WARN: Code duplicated, block: B:166:0x0230  */
    /* JADX WARN: Code duplicated, block: B:169:0x0282  */
    /* JADX WARN: Code duplicated, block: B:173:0x0290  */
    /* JADX WARN: Code duplicated, block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:61:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:90:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:95:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:97:0x00fe  */
    /* JADX INFO: renamed from: Snackbar-sDKtq54, reason: not valid java name */
    public static final void m2423SnackbarsDKtq54(final SnackbarData snackbarData, Modifier modifier, boolean z, Shape shape, long j, long j2, long j3, long j4, long j5, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        Shape shape2;
        long j6;
        long j7;
        Modifier.Companion companion;
        boolean z3;
        Shape shape3;
        long color;
        long contentColor;
        final long actionColor;
        long actionContentColor;
        long dismissActionContentColor;
        long j8;
        final String actionLabel;
        final SnackbarData snackbarData2;
        boolean z4;
        ComposableLambda composableLambda;
        ComposableLambda composableLambda2;
        long j9;
        final boolean z5;
        final Shape shape4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i6;
        int i7;
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(274621471);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(snackbarData) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    z2 = z;
                    if (composerStartRestartGroup.changed(z2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        shape2 = shape;
                        int i10 = composerStartRestartGroup.changed(shape2) ? 2048 : 1024;
                        i3 |= i10;
                    } else {
                        shape2 = shape;
                    }
                    i3 |= i10;
                } else {
                    shape2 = shape;
                }
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        j6 = j;
                        int i11 = composerStartRestartGroup.changed(j6) ? 16384 : 8192;
                        i3 |= i11;
                    } else {
                        j6 = j;
                    }
                    i3 |= i11;
                } else {
                    j6 = j;
                }
                if ((196608 & i) == 0) {
                    if ((i2 & 32) == 0) {
                        j7 = j2;
                        int i12 = composerStartRestartGroup.changed(j7) ? 131072 : 65536;
                        i3 |= i12;
                    } else {
                        j7 = j2;
                    }
                    i3 |= i12;
                } else {
                    j7 = j2;
                }
                if ((1572864 & i) != 0) {
                    if ((i2 & 64) == 0 || !composerStartRestartGroup.changed(j3)) {
                        i8 = 524288;
                    } else {
                        i8 = 1048576;
                    }
                    i3 |= i8;
                }
                if ((i & 12582912) != 0) {
                    if ((i2 & 128) == 0 || !composerStartRestartGroup.changed(j4)) {
                        i7 = 4194304;
                    } else {
                        i7 = 8388608;
                    }
                    i3 |= i7;
                }
                if ((100663296 & i) != 0) {
                    if ((i2 & 256) == 0 || !composerStartRestartGroup.changed(j5)) {
                        i6 = 33554432;
                    } else {
                        i6 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    }
                    i3 |= i6;
                }
                if ((38347923 & i3) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i9 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i4 != 0) {
                            z3 = false;
                        } else {
                            z3 = z2;
                        }
                        if ((i2 & 8) != 0) {
                            shape3 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            i3 &= -7169;
                        } else {
                            shape3 = shape2;
                        }
                        if ((i2 & 16) != 0) {
                            color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                            i3 &= -57345;
                        } else {
                            color = j6;
                        }
                        if ((i2 & 32) != 0) {
                            contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                            i3 &= -458753;
                        } else {
                            contentColor = j7;
                        }
                        if ((i2 & 64) != 0) {
                            actionColor = SnackbarDefaults.INSTANCE.getActionColor(composerStartRestartGroup, 6);
                            i3 &= -3670017;
                        } else {
                            actionColor = j3;
                        }
                        if ((i2 & 128) != 0) {
                            actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                            i3 &= -29360129;
                        } else {
                            actionContentColor = j4;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                            j8 = actionContentColor;
                            dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                        } else {
                            dismissActionContentColor = j5;
                            j8 = actionContentColor;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        if ((i2 & 32) != 0) {
                            i3 &= -458753;
                        }
                        if ((i2 & 64) != 0) {
                            i3 &= -3670017;
                        }
                        if ((i2 & 128) != 0) {
                            i3 &= -29360129;
                        }
                        if ((i2 & 256) != 0) {
                            i3 &= -234881025;
                        }
                        j8 = j4;
                        dismissActionContentColor = j5;
                        companion = modifier2;
                        z3 = z2;
                        shape3 = shape2;
                        color = j6;
                        contentColor = j7;
                        actionColor = j3;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(274621471, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:209)");
                    }
                    actionLabel = snackbarData.getVisuals().getActionLabel();
                    if (actionLabel != null) {
                        snackbarData2 = snackbarData;
                        Function2<Composer, Integer, Unit> function2 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i13) {
                                if ((i13 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1378313599, i13, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:213)");
                                    }
                                    ButtonColors buttonColorsM1808textButtonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1808textButtonColorsro_MJ88(0L, actionColor, 0L, 0L, composer2, 24576, 13);
                                    composer2.startReplaceableGroup(-2057496839);
                                    boolean zChanged = composer2.changed(snackbarData2);
                                    final SnackbarData snackbarData3 = snackbarData2;
                                    Object objRememberedValue = composer2.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$1$1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                snackbarData3.performAction();
                                            }

                                            {
                                                super(0);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue);
                                    }
                                    Function0 function0 = (Function0) objRememberedValue;
                                    composer2.endReplaceableGroup();
                                    final String str = actionLabel;
                                    ButtonKt.TextButton(function0, null, false, null, buttonColorsM1808textButtonColorsro_MJ88, null, null, null, null, ComposableLambdaKt.composableLambda(composer2, 521110564, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1.2
                                        @Override // kotlin.jvm.functions.Function3
                                        public final /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                            invoke(rowScope, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(RowScope rowScope, Composer composer3, int i14) {
                                            if ((i14 & 17) == 16 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(521110564, i14, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:216)");
                                            }
                                            TextKt.m2654Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }
                                    }), composer2, 805306368, 494);
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
                        };
                        z4 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1378313599, true, function2);
                    } else {
                        snackbarData2 = snackbarData;
                        z4 = true;
                        composableLambda = null;
                    }
                    if (snackbarData.getVisuals().getWithDismissAction()) {
                        composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1812633777, z4, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1
                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i13) {
                                if ((i13 & 3) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1812633777, i13, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:225)");
                                    }
                                    composer2.startReplaceableGroup(-2057496502);
                                    boolean zChanged = composer2.changed(snackbarData2);
                                    final SnackbarData snackbarData3 = snackbarData2;
                                    Object objRememberedValue = composer2.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1$1$1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final /* bridge */ /* synthetic */ Unit invoke() {
                                                invoke2();
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2() {
                                                snackbarData3.dismiss();
                                            }

                                            {
                                                super(0);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue);
                                    }
                                    composer2.endReplaceableGroup();
                                    IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$SnackbarKt.INSTANCE.m1965getLambda1$material3_release(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }

                            {
                                super(2);
                            }
                        });
                    } else {
                        composableLambda2 = null;
                    }
                    int i13 = i3 << 3;
                    m2422SnackbareQBnUkQ(PaddingKt.m1002padding3ABfNKs(companion, Dp.m6935constructorimpl(12.0f)), composableLambda, composableLambda2, z3, shape3, color, contentColor, j8, dismissActionContentColor, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1266389126, z4, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$3
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i14) {
                            if ((i14 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1266389126, i14, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:248)");
                            }
                            TextKt.m2654Text4IGK_g(snackbarData2.getVisuals().getMessage(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        {
                            super(2);
                        }
                    }), composerStartRestartGroup, (i13 & 458752) | (i13 & 7168) | 805306368 | (57344 & i13) | (3670016 & i13) | (29360128 & i3) | (i3 & 234881024), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j9 = actionColor;
                    z5 = z3;
                    shape4 = shape3;
                    modifier2 = companion;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    j8 = j4;
                    dismissActionContentColor = j5;
                    z5 = z2;
                    shape4 = shape2;
                    color = j6;
                    contentColor = j7;
                    j9 = j3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier3 = modifier2;
                    final long j10 = color;
                    final long j11 = contentColor;
                    final long j12 = j9;
                    final long j13 = j8;
                    final long j14 = dismissActionContentColor;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i14) {
                            SnackbarKt.m2423SnackbarsDKtq54(snackbarData, modifier3, z5, shape4, j10, j11, j12, j13, j14, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 384;
            z2 = z;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i3 |= i10;
                } else {
                    shape2 = shape;
                }
                i3 |= i10;
            } else {
                shape2 = shape;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    j6 = j;
                    if (composerStartRestartGroup.changed(j6)) {
                    }
                    i3 |= i11;
                } else {
                    j6 = j;
                }
                i3 |= i11;
            } else {
                j6 = j;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    j7 = j2;
                    if (composerStartRestartGroup.changed(j7)) {
                    }
                    i3 |= i12;
                } else {
                    j7 = j2;
                }
                i3 |= i12;
            } else {
                j7 = j2;
            }
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    i8 = 524288;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            if ((i & 12582912) != 0) {
                if ((i2 & 128) == 0) {
                    i7 = 4194304;
                } else {
                    i7 = 4194304;
                }
                i3 |= i7;
            }
            if ((100663296 & i) != 0) {
                if ((i2 & 256) == 0) {
                    i6 = 33554432;
                } else {
                    i6 = 33554432;
                }
                i3 |= i6;
            }
            if ((38347923 & i3) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        shape3 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i3 &= -7169;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        color = j6;
                    }
                    if ((i2 & 32) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    } else {
                        contentColor = j7;
                    }
                    if ((i2 & 64) != 0) {
                        actionColor = SnackbarDefaults.INSTANCE.getActionColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        actionColor = j3;
                    }
                    if ((i2 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        actionContentColor = j4;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        j8 = actionContentColor;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    } else {
                        dismissActionContentColor = j5;
                        j8 = actionContentColor;
                    }
                } else {
                    if (i9 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        shape3 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i3 &= -7169;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        color = j6;
                    }
                    if ((i2 & 32) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    } else {
                        contentColor = j7;
                    }
                    if ((i2 & 64) != 0) {
                        actionColor = SnackbarDefaults.INSTANCE.getActionColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        actionColor = j3;
                    }
                    if ((i2 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        actionContentColor = j4;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        j8 = actionContentColor;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    } else {
                        dismissActionContentColor = j5;
                        j8 = actionContentColor;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(274621471, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:209)");
                }
                actionLabel = snackbarData.getVisuals().getActionLabel();
                if (actionLabel != null) {
                    snackbarData2 = snackbarData;
                    Function2<Composer, Integer, Unit> function3 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i14) {
                            if ((i14 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1378313599, i14, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:213)");
                                }
                                ButtonColors buttonColorsM1808textButtonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1808textButtonColorsro_MJ88(0L, actionColor, 0L, 0L, composer2, 24576, 13);
                                composer2.startReplaceableGroup(-2057496839);
                                boolean zChanged = composer2.changed(snackbarData2);
                                final SnackbarData snackbarData3 = snackbarData2;
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$1$1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            snackbarData3.performAction();
                                        }

                                        {
                                            super(0);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                Function0 function0 = (Function0) objRememberedValue;
                                composer2.endReplaceableGroup();
                                final String str = actionLabel;
                                ButtonKt.TextButton(function0, null, false, null, buttonColorsM1808textButtonColorsro_MJ88, null, null, null, null, ComposableLambdaKt.composableLambda(composer2, 521110564, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1.2
                                    @Override // kotlin.jvm.functions.Function3
                                    public final /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                        invoke(rowScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(RowScope rowScope, Composer composer3, int i15) {
                                        if ((i15 & 17) == 16 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(521110564, i15, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:216)");
                                        }
                                        TextKt.m2654Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }
                                }), composer2, 805306368, 494);
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
                    };
                    z4 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1378313599, true, function3);
                } else {
                    snackbarData2 = snackbarData;
                    z4 = true;
                    composableLambda = null;
                }
                if (snackbarData.getVisuals().getWithDismissAction()) {
                    composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1812633777, z4, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i14) {
                            if ((i14 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1812633777, i14, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:225)");
                                }
                                composer2.startReplaceableGroup(-2057496502);
                                boolean zChanged = composer2.changed(snackbarData2);
                                final SnackbarData snackbarData3 = snackbarData2;
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1$1$1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            snackbarData3.dismiss();
                                        }

                                        {
                                            super(0);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                composer2.endReplaceableGroup();
                                IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$SnackbarKt.INSTANCE.m1965getLambda1$material3_release(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        {
                            super(2);
                        }
                    });
                } else {
                    composableLambda2 = null;
                }
                int i14 = i3 << 3;
                m2422SnackbareQBnUkQ(PaddingKt.m1002padding3ABfNKs(companion, Dp.m6935constructorimpl(12.0f)), composableLambda, composableLambda2, z3, shape3, color, contentColor, j8, dismissActionContentColor, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1266389126, z4, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$3
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i15) {
                        if ((i15 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1266389126, i15, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:248)");
                        }
                        TextKt.m2654Text4IGK_g(snackbarData2.getVisuals().getMessage(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    {
                        super(2);
                    }
                }), composerStartRestartGroup, (i14 & 458752) | (i14 & 7168) | 805306368 | (57344 & i14) | (3670016 & i14) | (29360128 & i3) | (i3 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j9 = actionColor;
                z5 = z3;
                shape4 = shape3;
                modifier2 = companion;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        shape3 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i3 &= -7169;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        color = j6;
                    }
                    if ((i2 & 32) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    } else {
                        contentColor = j7;
                    }
                    if ((i2 & 64) != 0) {
                        actionColor = SnackbarDefaults.INSTANCE.getActionColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        actionColor = j3;
                    }
                    if ((i2 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        actionContentColor = j4;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        j8 = actionContentColor;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    } else {
                        dismissActionContentColor = j5;
                        j8 = actionContentColor;
                    }
                } else {
                    if (i9 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        shape3 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i3 &= -7169;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        color = j6;
                    }
                    if ((i2 & 32) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    } else {
                        contentColor = j7;
                    }
                    if ((i2 & 64) != 0) {
                        actionColor = SnackbarDefaults.INSTANCE.getActionColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        actionColor = j3;
                    }
                    if ((i2 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        actionContentColor = j4;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        j8 = actionContentColor;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    } else {
                        dismissActionContentColor = j5;
                        j8 = actionContentColor;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(274621471, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:209)");
                }
                actionLabel = snackbarData.getVisuals().getActionLabel();
                if (actionLabel != null) {
                    snackbarData2 = snackbarData;
                    Function2<Composer, Integer, Unit> function4 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i15) {
                            if ((i15 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1378313599, i15, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:213)");
                                }
                                ButtonColors buttonColorsM1808textButtonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1808textButtonColorsro_MJ88(0L, actionColor, 0L, 0L, composer2, 24576, 13);
                                composer2.startReplaceableGroup(-2057496839);
                                boolean zChanged = composer2.changed(snackbarData2);
                                final SnackbarData snackbarData3 = snackbarData2;
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$1$1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            snackbarData3.performAction();
                                        }

                                        {
                                            super(0);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                Function0 function0 = (Function0) objRememberedValue;
                                composer2.endReplaceableGroup();
                                final String str = actionLabel;
                                ButtonKt.TextButton(function0, null, false, null, buttonColorsM1808textButtonColorsro_MJ88, null, null, null, null, ComposableLambdaKt.composableLambda(composer2, 521110564, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1.2
                                    @Override // kotlin.jvm.functions.Function3
                                    public final /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                        invoke(rowScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(RowScope rowScope, Composer composer3, int i16) {
                                        if ((i16 & 17) == 16 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(521110564, i16, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:216)");
                                        }
                                        TextKt.m2654Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }
                                }), composer2, 805306368, 494);
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
                    };
                    z4 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1378313599, true, function4);
                } else {
                    snackbarData2 = snackbarData;
                    z4 = true;
                    composableLambda = null;
                }
                if (snackbarData.getVisuals().getWithDismissAction()) {
                    composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1812633777, z4, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i15) {
                            if ((i15 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1812633777, i15, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:225)");
                                }
                                composer2.startReplaceableGroup(-2057496502);
                                boolean zChanged = composer2.changed(snackbarData2);
                                final SnackbarData snackbarData3 = snackbarData2;
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1$1$1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            snackbarData3.dismiss();
                                        }

                                        {
                                            super(0);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                composer2.endReplaceableGroup();
                                IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$SnackbarKt.INSTANCE.m1965getLambda1$material3_release(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        {
                            super(2);
                        }
                    });
                } else {
                    composableLambda2 = null;
                }
                int i15 = i3 << 3;
                m2422SnackbareQBnUkQ(PaddingKt.m1002padding3ABfNKs(companion, Dp.m6935constructorimpl(12.0f)), composableLambda, composableLambda2, z3, shape3, color, contentColor, j8, dismissActionContentColor, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1266389126, z4, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$3
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i16) {
                        if ((i16 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1266389126, i16, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:248)");
                        }
                        TextKt.m2654Text4IGK_g(snackbarData2.getVisuals().getMessage(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    {
                        super(2);
                    }
                }), composerStartRestartGroup, (i15 & 458752) | (i15 & 7168) | 805306368 | (57344 & i15) | (3670016 & i15) | (29360128 & i3) | (i3 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j9 = actionColor;
                z5 = z3;
                shape4 = shape3;
                modifier2 = companion;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier4 = modifier2;
                final long j15 = color;
                final long j16 = contentColor;
                final long j17 = j9;
                final long j18 = j8;
                final long j19 = dismissActionContentColor;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i16) {
                        SnackbarKt.m2423SnackbarsDKtq54(snackbarData, modifier4, z5, shape4, j15, j16, j17, j18, j19, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                z2 = z;
                if (composerStartRestartGroup.changed(z2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i3 |= i10;
                } else {
                    shape2 = shape;
                }
                i3 |= i10;
            } else {
                shape2 = shape;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    j6 = j;
                    if (composerStartRestartGroup.changed(j6)) {
                    }
                    i3 |= i11;
                } else {
                    j6 = j;
                }
                i3 |= i11;
            } else {
                j6 = j;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    j7 = j2;
                    if (composerStartRestartGroup.changed(j7)) {
                    }
                    i3 |= i12;
                } else {
                    j7 = j2;
                }
                i3 |= i12;
            } else {
                j7 = j2;
            }
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    i8 = 524288;
                } else {
                    i8 = 524288;
                }
                i3 |= i8;
            }
            if ((i & 12582912) != 0) {
                if ((i2 & 128) == 0) {
                    i7 = 4194304;
                } else {
                    i7 = 4194304;
                }
                i3 |= i7;
            }
            if ((100663296 & i) != 0) {
                if ((i2 & 256) == 0) {
                    i6 = 33554432;
                } else {
                    i6 = 33554432;
                }
                i3 |= i6;
            }
            if ((38347923 & i3) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        shape3 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i3 &= -7169;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        color = j6;
                    }
                    if ((i2 & 32) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    } else {
                        contentColor = j7;
                    }
                    if ((i2 & 64) != 0) {
                        actionColor = SnackbarDefaults.INSTANCE.getActionColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        actionColor = j3;
                    }
                    if ((i2 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        actionContentColor = j4;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        j8 = actionContentColor;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    } else {
                        dismissActionContentColor = j5;
                        j8 = actionContentColor;
                    }
                } else {
                    if (i9 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        shape3 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i3 &= -7169;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        color = j6;
                    }
                    if ((i2 & 32) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    } else {
                        contentColor = j7;
                    }
                    if ((i2 & 64) != 0) {
                        actionColor = SnackbarDefaults.INSTANCE.getActionColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        actionColor = j3;
                    }
                    if ((i2 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        actionContentColor = j4;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        j8 = actionContentColor;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    } else {
                        dismissActionContentColor = j5;
                        j8 = actionContentColor;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(274621471, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:209)");
                }
                actionLabel = snackbarData.getVisuals().getActionLabel();
                if (actionLabel != null) {
                    snackbarData2 = snackbarData;
                    Function2<Composer, Integer, Unit> function5 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i16) {
                            if ((i16 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1378313599, i16, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:213)");
                                }
                                ButtonColors buttonColorsM1808textButtonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1808textButtonColorsro_MJ88(0L, actionColor, 0L, 0L, composer2, 24576, 13);
                                composer2.startReplaceableGroup(-2057496839);
                                boolean zChanged = composer2.changed(snackbarData2);
                                final SnackbarData snackbarData3 = snackbarData2;
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$1$1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            snackbarData3.performAction();
                                        }

                                        {
                                            super(0);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                Function0 function0 = (Function0) objRememberedValue;
                                composer2.endReplaceableGroup();
                                final String str = actionLabel;
                                ButtonKt.TextButton(function0, null, false, null, buttonColorsM1808textButtonColorsro_MJ88, null, null, null, null, ComposableLambdaKt.composableLambda(composer2, 521110564, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1.2
                                    @Override // kotlin.jvm.functions.Function3
                                    public final /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                        invoke(rowScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(RowScope rowScope, Composer composer3, int i17) {
                                        if ((i17 & 17) == 16 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(521110564, i17, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:216)");
                                        }
                                        TextKt.m2654Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }
                                }), composer2, 805306368, 494);
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
                    };
                    z4 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1378313599, true, function5);
                } else {
                    snackbarData2 = snackbarData;
                    z4 = true;
                    composableLambda = null;
                }
                if (snackbarData.getVisuals().getWithDismissAction()) {
                    composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1812633777, z4, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i16) {
                            if ((i16 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1812633777, i16, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:225)");
                                }
                                composer2.startReplaceableGroup(-2057496502);
                                boolean zChanged = composer2.changed(snackbarData2);
                                final SnackbarData snackbarData3 = snackbarData2;
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1$1$1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            snackbarData3.dismiss();
                                        }

                                        {
                                            super(0);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                composer2.endReplaceableGroup();
                                IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$SnackbarKt.INSTANCE.m1965getLambda1$material3_release(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        {
                            super(2);
                        }
                    });
                } else {
                    composableLambda2 = null;
                }
                int i16 = i3 << 3;
                m2422SnackbareQBnUkQ(PaddingKt.m1002padding3ABfNKs(companion, Dp.m6935constructorimpl(12.0f)), composableLambda, composableLambda2, z3, shape3, color, contentColor, j8, dismissActionContentColor, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1266389126, z4, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$3
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
                            ComposerKt.traceEventStart(-1266389126, i17, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:248)");
                        }
                        TextKt.m2654Text4IGK_g(snackbarData2.getVisuals().getMessage(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    {
                        super(2);
                    }
                }), composerStartRestartGroup, (i16 & 458752) | (i16 & 7168) | 805306368 | (57344 & i16) | (3670016 & i16) | (29360128 & i3) | (i3 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j9 = actionColor;
                z5 = z3;
                shape4 = shape3;
                modifier2 = companion;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i9 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        shape3 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i3 &= -7169;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        color = j6;
                    }
                    if ((i2 & 32) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    } else {
                        contentColor = j7;
                    }
                    if ((i2 & 64) != 0) {
                        actionColor = SnackbarDefaults.INSTANCE.getActionColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        actionColor = j3;
                    }
                    if ((i2 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        actionContentColor = j4;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        j8 = actionContentColor;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    } else {
                        dismissActionContentColor = j5;
                        j8 = actionContentColor;
                    }
                } else {
                    if (i9 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i4 != 0) {
                        z3 = false;
                    } else {
                        z3 = z2;
                    }
                    if ((i2 & 8) != 0) {
                        shape3 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        i3 &= -7169;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i2 & 16) != 0) {
                        color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                        i3 &= -57345;
                    } else {
                        color = j6;
                    }
                    if ((i2 & 32) != 0) {
                        contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                        i3 &= -458753;
                    } else {
                        contentColor = j7;
                    }
                    if ((i2 & 64) != 0) {
                        actionColor = SnackbarDefaults.INSTANCE.getActionColor(composerStartRestartGroup, 6);
                        i3 &= -3670017;
                    } else {
                        actionColor = j3;
                    }
                    if ((i2 & 128) != 0) {
                        actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                        i3 &= -29360129;
                    } else {
                        actionContentColor = j4;
                    }
                    if ((i2 & 256) != 0) {
                        i3 &= -234881025;
                        j8 = actionContentColor;
                        dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                    } else {
                        dismissActionContentColor = j5;
                        j8 = actionContentColor;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(274621471, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:209)");
                }
                actionLabel = snackbarData.getVisuals().getActionLabel();
                if (actionLabel != null) {
                    snackbarData2 = snackbarData;
                    Function2<Composer, Integer, Unit> function6 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i17) {
                            if ((i17 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1378313599, i17, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:213)");
                                }
                                ButtonColors buttonColorsM1808textButtonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1808textButtonColorsro_MJ88(0L, actionColor, 0L, 0L, composer2, 24576, 13);
                                composer2.startReplaceableGroup(-2057496839);
                                boolean zChanged = composer2.changed(snackbarData2);
                                final SnackbarData snackbarData3 = snackbarData2;
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$1$1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            snackbarData3.performAction();
                                        }

                                        {
                                            super(0);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                Function0 function0 = (Function0) objRememberedValue;
                                composer2.endReplaceableGroup();
                                final String str = actionLabel;
                                ButtonKt.TextButton(function0, null, false, null, buttonColorsM1808textButtonColorsro_MJ88, null, null, null, null, ComposableLambdaKt.composableLambda(composer2, 521110564, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1.2
                                    @Override // kotlin.jvm.functions.Function3
                                    public final /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                        invoke(rowScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(RowScope rowScope, Composer composer3, int i18) {
                                        if ((i18 & 17) == 16 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(521110564, i18, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:216)");
                                        }
                                        TextKt.m2654Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }
                                }), composer2, 805306368, 494);
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
                    };
                    z4 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1378313599, true, function6);
                } else {
                    snackbarData2 = snackbarData;
                    z4 = true;
                    composableLambda = null;
                }
                if (snackbarData.getVisuals().getWithDismissAction()) {
                    composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1812633777, z4, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i17) {
                            if ((i17 & 3) != 2 || !composer2.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1812633777, i17, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:225)");
                                }
                                composer2.startReplaceableGroup(-2057496502);
                                boolean zChanged = composer2.changed(snackbarData2);
                                final SnackbarData snackbarData3 = snackbarData2;
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1$1$1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            snackbarData3.dismiss();
                                        }

                                        {
                                            super(0);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                composer2.endReplaceableGroup();
                                IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$SnackbarKt.INSTANCE.m1965getLambda1$material3_release(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }

                        {
                            super(2);
                        }
                    });
                } else {
                    composableLambda2 = null;
                }
                int i17 = i3 << 3;
                m2422SnackbareQBnUkQ(PaddingKt.m1002padding3ABfNKs(companion, Dp.m6935constructorimpl(12.0f)), composableLambda, composableLambda2, z3, shape3, color, contentColor, j8, dismissActionContentColor, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1266389126, z4, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$3
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
                            ComposerKt.traceEventStart(-1266389126, i18, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:248)");
                        }
                        TextKt.m2654Text4IGK_g(snackbarData2.getVisuals().getMessage(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    {
                        super(2);
                    }
                }), composerStartRestartGroup, (i17 & 458752) | (i17 & 7168) | 805306368 | (57344 & i17) | (3670016 & i17) | (29360128 & i3) | (i3 & 234881024), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j9 = actionColor;
                z5 = z3;
                shape4 = shape3;
                modifier2 = companion;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier5 = modifier2;
                final long j110 = color;
                final long j111 = contentColor;
                final long j112 = j9;
                final long j113 = j8;
                final long j114 = dismissActionContentColor;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$4
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
                        SnackbarKt.m2423SnackbarsDKtq54(snackbarData, modifier5, z5, shape4, j110, j111, j112, j113, j114, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i3 |= i10;
            } else {
                shape2 = shape;
            }
            i3 |= i10;
        } else {
            shape2 = shape;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                j6 = j;
                if (composerStartRestartGroup.changed(j6)) {
                }
                i3 |= i11;
            } else {
                j6 = j;
            }
            i3 |= i11;
        } else {
            j6 = j;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                j7 = j2;
                if (composerStartRestartGroup.changed(j7)) {
                }
                i3 |= i12;
            } else {
                j7 = j2;
            }
            i3 |= i12;
        } else {
            j7 = j2;
        }
        if ((1572864 & i) != 0) {
            if ((i2 & 64) == 0) {
                i8 = 524288;
            } else {
                i8 = 524288;
            }
            i3 |= i8;
        }
        if ((i & 12582912) != 0) {
            if ((i2 & 128) == 0) {
                i7 = 4194304;
            } else {
                i7 = 4194304;
            }
            i3 |= i7;
        }
        if ((100663296 & i) != 0) {
            if ((i2 & 256) == 0) {
                i6 = 33554432;
            } else {
                i6 = 33554432;
            }
            i3 |= i6;
        }
        if ((38347923 & i3) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i4 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if ((i2 & 8) != 0) {
                    shape3 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i3 &= -7169;
                } else {
                    shape3 = shape2;
                }
                if ((i2 & 16) != 0) {
                    color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                    i3 &= -57345;
                } else {
                    color = j6;
                }
                if ((i2 & 32) != 0) {
                    contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i3 &= -458753;
                } else {
                    contentColor = j7;
                }
                if ((i2 & 64) != 0) {
                    actionColor = SnackbarDefaults.INSTANCE.getActionColor(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    actionColor = j3;
                }
                if ((i2 & 128) != 0) {
                    actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                    i3 &= -29360129;
                } else {
                    actionContentColor = j4;
                }
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                    j8 = actionContentColor;
                    dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                } else {
                    dismissActionContentColor = j5;
                    j8 = actionContentColor;
                }
            } else {
                if (i9 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i4 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if ((i2 & 8) != 0) {
                    shape3 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i3 &= -7169;
                } else {
                    shape3 = shape2;
                }
                if ((i2 & 16) != 0) {
                    color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                    i3 &= -57345;
                } else {
                    color = j6;
                }
                if ((i2 & 32) != 0) {
                    contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i3 &= -458753;
                } else {
                    contentColor = j7;
                }
                if ((i2 & 64) != 0) {
                    actionColor = SnackbarDefaults.INSTANCE.getActionColor(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    actionColor = j3;
                }
                if ((i2 & 128) != 0) {
                    actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                    i3 &= -29360129;
                } else {
                    actionContentColor = j4;
                }
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                    j8 = actionContentColor;
                    dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                } else {
                    dismissActionContentColor = j5;
                    j8 = actionContentColor;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(274621471, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:209)");
            }
            actionLabel = snackbarData.getVisuals().getActionLabel();
            if (actionLabel != null) {
                snackbarData2 = snackbarData;
                Function2<Composer, Integer, Unit> function7 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i18) {
                        if ((i18 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1378313599, i18, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:213)");
                            }
                            ButtonColors buttonColorsM1808textButtonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1808textButtonColorsro_MJ88(0L, actionColor, 0L, 0L, composer2, 24576, 13);
                            composer2.startReplaceableGroup(-2057496839);
                            boolean zChanged = composer2.changed(snackbarData2);
                            final SnackbarData snackbarData3 = snackbarData2;
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$1$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        snackbarData3.performAction();
                                    }

                                    {
                                        super(0);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            Function0 function0 = (Function0) objRememberedValue;
                            composer2.endReplaceableGroup();
                            final String str = actionLabel;
                            ButtonKt.TextButton(function0, null, false, null, buttonColorsM1808textButtonColorsro_MJ88, null, null, null, null, ComposableLambdaKt.composableLambda(composer2, 521110564, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1.2
                                @Override // kotlin.jvm.functions.Function3
                                public final /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                    invoke(rowScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope rowScope, Composer composer3, int i19) {
                                    if ((i19 & 17) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(521110564, i19, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:216)");
                                    }
                                    TextKt.m2654Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }
                            }), composer2, 805306368, 494);
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
                };
                z4 = true;
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1378313599, true, function7);
            } else {
                snackbarData2 = snackbarData;
                z4 = true;
                composableLambda = null;
            }
            if (snackbarData.getVisuals().getWithDismissAction()) {
                composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1812633777, z4, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i18) {
                        if ((i18 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1812633777, i18, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:225)");
                            }
                            composer2.startReplaceableGroup(-2057496502);
                            boolean zChanged = composer2.changed(snackbarData2);
                            final SnackbarData snackbarData3 = snackbarData2;
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1$1$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        snackbarData3.dismiss();
                                    }

                                    {
                                        super(0);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceableGroup();
                            IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$SnackbarKt.INSTANCE.m1965getLambda1$material3_release(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }

                    {
                        super(2);
                    }
                });
            } else {
                composableLambda2 = null;
            }
            int i18 = i3 << 3;
            m2422SnackbareQBnUkQ(PaddingKt.m1002padding3ABfNKs(companion, Dp.m6935constructorimpl(12.0f)), composableLambda, composableLambda2, z3, shape3, color, contentColor, j8, dismissActionContentColor, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1266389126, z4, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$3
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
                        ComposerKt.traceEventStart(-1266389126, i19, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:248)");
                    }
                    TextKt.m2654Text4IGK_g(snackbarData2.getVisuals().getMessage(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                {
                    super(2);
                }
            }), composerStartRestartGroup, (i18 & 458752) | (i18 & 7168) | 805306368 | (57344 & i18) | (3670016 & i18) | (29360128 & i3) | (i3 & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j9 = actionColor;
            z5 = z3;
            shape4 = shape3;
            modifier2 = companion;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i4 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if ((i2 & 8) != 0) {
                    shape3 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i3 &= -7169;
                } else {
                    shape3 = shape2;
                }
                if ((i2 & 16) != 0) {
                    color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                    i3 &= -57345;
                } else {
                    color = j6;
                }
                if ((i2 & 32) != 0) {
                    contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i3 &= -458753;
                } else {
                    contentColor = j7;
                }
                if ((i2 & 64) != 0) {
                    actionColor = SnackbarDefaults.INSTANCE.getActionColor(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    actionColor = j3;
                }
                if ((i2 & 128) != 0) {
                    actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                    i3 &= -29360129;
                } else {
                    actionContentColor = j4;
                }
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                    j8 = actionContentColor;
                    dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                } else {
                    dismissActionContentColor = j5;
                    j8 = actionContentColor;
                }
            } else {
                if (i9 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i4 != 0) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if ((i2 & 8) != 0) {
                    shape3 = SnackbarDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    i3 &= -7169;
                } else {
                    shape3 = shape2;
                }
                if ((i2 & 16) != 0) {
                    color = SnackbarDefaults.INSTANCE.getColor(composerStartRestartGroup, 6);
                    i3 &= -57345;
                } else {
                    color = j6;
                }
                if ((i2 & 32) != 0) {
                    contentColor = SnackbarDefaults.INSTANCE.getContentColor(composerStartRestartGroup, 6);
                    i3 &= -458753;
                } else {
                    contentColor = j7;
                }
                if ((i2 & 64) != 0) {
                    actionColor = SnackbarDefaults.INSTANCE.getActionColor(composerStartRestartGroup, 6);
                    i3 &= -3670017;
                } else {
                    actionColor = j3;
                }
                if ((i2 & 128) != 0) {
                    actionContentColor = SnackbarDefaults.INSTANCE.getActionContentColor(composerStartRestartGroup, 6);
                    i3 &= -29360129;
                } else {
                    actionContentColor = j4;
                }
                if ((i2 & 256) != 0) {
                    i3 &= -234881025;
                    j8 = actionContentColor;
                    dismissActionContentColor = SnackbarDefaults.INSTANCE.getDismissActionContentColor(composerStartRestartGroup, 6);
                } else {
                    dismissActionContentColor = j5;
                    j8 = actionContentColor;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(274621471, i3, -1, "androidx.compose.material3.Snackbar (Snackbar.kt:209)");
            }
            actionLabel = snackbarData.getVisuals().getActionLabel();
            if (actionLabel != null) {
                snackbarData2 = snackbarData;
                Function2<Composer, Integer, Unit> function8 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i19) {
                        if ((i19 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1378313599, i19, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:213)");
                            }
                            ButtonColors buttonColorsM1808textButtonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1808textButtonColorsro_MJ88(0L, actionColor, 0L, 0L, composer2, 24576, 13);
                            composer2.startReplaceableGroup(-2057496839);
                            boolean zChanged = composer2.changed(snackbarData2);
                            final SnackbarData snackbarData3 = snackbarData2;
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1$1$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        snackbarData3.performAction();
                                    }

                                    {
                                        super(0);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            Function0 function0 = (Function0) objRememberedValue;
                            composer2.endReplaceableGroup();
                            final String str = actionLabel;
                            ButtonKt.TextButton(function0, null, false, null, buttonColorsM1808textButtonColorsro_MJ88, null, null, null, null, ComposableLambdaKt.composableLambda(composer2, 521110564, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$actionComposable$1.2
                                @Override // kotlin.jvm.functions.Function3
                                public final /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                                    invoke(rowScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope rowScope, Composer composer3, int i110) {
                                    if ((i110 & 17) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(521110564, i110, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:216)");
                                    }
                                    TextKt.m2654Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }
                            }), composer2, 805306368, 494);
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
                };
                z4 = true;
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1378313599, true, function8);
            } else {
                snackbarData2 = snackbarData;
                z4 = true;
                composableLambda = null;
            }
            if (snackbarData.getVisuals().getWithDismissAction()) {
                composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1812633777, z4, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i19) {
                        if ((i19 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1812633777, i19, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:225)");
                            }
                            composer2.startReplaceableGroup(-2057496502);
                            boolean zChanged = composer2.changed(snackbarData2);
                            final SnackbarData snackbarData3 = snackbarData2;
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = (Function0) new Function0<Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$dismissActionComposable$1$1$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        snackbarData3.dismiss();
                                    }

                                    {
                                        super(0);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceableGroup();
                            IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$SnackbarKt.INSTANCE.m1965getLambda1$material3_release(), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 30);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }

                    {
                        super(2);
                    }
                });
            } else {
                composableLambda2 = null;
            }
            int i19 = i3 << 3;
            m2422SnackbareQBnUkQ(PaddingKt.m1002padding3ABfNKs(companion, Dp.m6935constructorimpl(12.0f)), composableLambda, composableLambda2, z3, shape3, color, contentColor, j8, dismissActionContentColor, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1266389126, z4, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$3
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
                        ComposerKt.traceEventStart(-1266389126, i110, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:248)");
                    }
                    TextKt.m2654Text4IGK_g(snackbarData2.getVisuals().getMessage(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                {
                    super(2);
                }
            }), composerStartRestartGroup, (i19 & 458752) | (i19 & 7168) | 805306368 | (57344 & i19) | (3670016 & i19) | (29360128 & i3) | (i3 & 234881024), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j9 = actionColor;
            z5 = z3;
            shape4 = shape3;
            modifier2 = companion;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier6 = modifier2;
            final long j115 = color;
            final long j116 = contentColor;
            final long j117 = j9;
            final long j118 = j8;
            final long j119 = dismissActionContentColor;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$4
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
                    SnackbarKt.m2423SnackbarsDKtq54(snackbarData, modifier6, z5, shape4, j115, j116, j117, j118, j119, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: NewLineButtonSnackbar-kKq0p4A, reason: not valid java name */
    public static final void m2420NewLineButtonSnackbarkKq0p4A(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function4, final TextStyle textStyle, final long j, final long j2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1332496681);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function4) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(textStyle) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(j2) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1332496681, i2, -1, "androidx.compose.material3.NewLineButtonSnackbar (Snackbar.kt:260)");
            }
            Modifier modifierM1006paddingqDBjuR0$default = PaddingKt.m1006paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(SizeKt.m1054widthInVpY3zN4$default(Modifier.INSTANCE, 0.0f, ContainerMaxWidth, 1, null), 0.0f, 1, null), HorizontalSpacing, 0.0f, 0.0f, SeparateButtonExtraY, 6, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM1006paddingqDBjuR0$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3536constructorimpl = Updater.m3536constructorimpl(composerStartRestartGroup);
            Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m3506boximpl(SkippableUpdater.m3507constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierM856paddingFromBaselineVpY3zN4 = AlignmentLineKt.m856paddingFromBaselineVpY3zN4(Modifier.INSTANCE, HeightToFirstLine, LongButtonVerticalOffset);
            float f = HorizontalSpacingButtonSide;
            Modifier modifierM1006paddingqDBjuR0$default2 = PaddingKt.m1006paddingqDBjuR0$default(modifierM856paddingFromBaselineVpY3zN4, 0.0f, 0.0f, f, 0.0f, 11, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM1006paddingqDBjuR0$default2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3536constructorimpl2 = Updater.m3536constructorimpl(composerStartRestartGroup);
            Updater.m3543setimpl(composerM3536constructorimpl2, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3543setimpl(composerM3536constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3536constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3536constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3536constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m3506boximpl(SkippableUpdater.m3507constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i2 & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM1006paddingqDBjuR0$default3 = PaddingKt.m1006paddingqDBjuR0$default(columnScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getEnd()), 0.0f, 0.0f, function4 != null ? Dp.m6935constructorimpl(0.0f) : f, 0.0f, 11, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM1006paddingqDBjuR0$default3);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3536constructorimpl3 = Updater.m3536constructorimpl(composerStartRestartGroup);
            Updater.m3543setimpl(composerM3536constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3543setimpl(composerM3536constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3536constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM3536constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM3536constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m3506boximpl(SkippableUpdater.m3507constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3536constructorimpl4 = Updater.m3536constructorimpl(composerStartRestartGroup);
            Updater.m3543setimpl(composerM3536constructorimpl4, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3543setimpl(composerM3536constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3536constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM3536constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM3536constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            function3ModifierMaterializerOf4.invoke(SkippableUpdater.m3506boximpl(SkippableUpdater.m3507constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4208boximpl(j)), TextKt.getLocalTextStyle().provides(textStyle)}, function3, composerStartRestartGroup, i2 & 112);
            composerStartRestartGroup.startReplaceableGroup(302367084);
            if (function4 != null) {
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4208boximpl(j2)), function4, composerStartRestartGroup, ((i2 >> 3) & 112) | ProvidedValue.$stable);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$NewLineButtonSnackbar$2
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

                public final void invoke(Composer composer2, int i3) {
                    SnackbarKt.m2420NewLineButtonSnackbarkKq0p4A(function2, function3, function4, textStyle, j, j2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: OneRowSnackbar-kKq0p4A, reason: not valid java name */
    public static final void m2421OneRowSnackbarkKq0p4A(final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function4, final TextStyle textStyle, final long j, final long j2, Composer composer, final int i) {
        int i2;
        float fM6935constructorimpl;
        Composer composerStartRestartGroup = composer.startRestartGroup(-903235475);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function4) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(textStyle) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(j2) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-903235475, i2, -1, "androidx.compose.material3.OneRowSnackbar (Snackbar.kt:305)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = HorizontalSpacing;
            if (function4 == null) {
                fM6935constructorimpl = HorizontalSpacingButtonSide;
            } else {
                fM6935constructorimpl = Dp.m6935constructorimpl(0.0f);
            }
            Modifier modifierM1006paddingqDBjuR0$default = PaddingKt.m1006paddingqDBjuR0$default(companion, f, 0.0f, fM6935constructorimpl, 0.0f, 10, null);
            composerStartRestartGroup.startReplaceableGroup(44739392);
            MeasurePolicy measurePolicyRememberedValue = composerStartRestartGroup.rememberedValue();
            final String str = "text";
            final String str2 = "dismissAction";
            final String str3 = "action";
            if (measurePolicyRememberedValue == Composer.INSTANCE.getEmpty()) {
                measurePolicyRememberedValue = new MeasurePolicy() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$2$1
                    /* JADX WARN: Code duplicated, block: B:60:0x0152 A[PHI: r0 r4
  0x0152: PHI (r0v14 int) = (r0v13 int), (r0v21 int), (r0v21 int) binds: [B:57:0x0143, B:52:0x0115, B:54:0x0121] A[DONT_GENERATE, DONT_INLINE]
  0x0152: PHI (r4v5 int) = (r4v4 int), (r4v13 int), (r4v13 int) binds: [B:57:0x0143, B:52:0x0115, B:54:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    /* JADX INFO: renamed from: measure-3p2s80s */
                    public final MeasureResult mo359measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j3) {
                        Measurable measurable;
                        Measurable measurable2;
                        int height;
                        int iMax;
                        int height2;
                        int i3;
                        final int i4;
                        final int i5;
                        int i6;
                        int iMin = Math.min(Constraints.m6888getMaxWidthimpl(j3), measureScope.mo688roundToPx0680j_4(SnackbarKt.ContainerMaxWidth));
                        String str4 = str3;
                        int size = list.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size) {
                                measurable = null;
                                break;
                            }
                            measurable = list.get(i7);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), str4)) {
                                break;
                            }
                            i7++;
                        }
                        Measurable measurable3 = measurable;
                        Placeable placeableMo5637measureBRTryo0 = measurable3 != null ? measurable3.mo5637measureBRTryo0(j3) : null;
                        String str5 = str2;
                        int size2 = list.size();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= size2) {
                                measurable2 = null;
                                break;
                            }
                            measurable2 = list.get(i8);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), str5)) {
                                break;
                            }
                            i8++;
                        }
                        Measurable measurable4 = measurable2;
                        final Placeable placeableMo5637measureBRTryo1 = measurable4 != null ? measurable4.mo5637measureBRTryo0(j3) : null;
                        int width = placeableMo5637measureBRTryo0 != null ? placeableMo5637measureBRTryo0.getWidth() : 0;
                        int height3 = placeableMo5637measureBRTryo0 != null ? placeableMo5637measureBRTryo0.getHeight() : 0;
                        int width2 = placeableMo5637measureBRTryo1 != null ? placeableMo5637measureBRTryo1.getWidth() : 0;
                        int height4 = placeableMo5637measureBRTryo1 != null ? placeableMo5637measureBRTryo1.getHeight() : 0;
                        int iCoerceAtLeast = RangesKt.coerceAtLeast(((iMin - width) - width2) - (width2 == 0 ? measureScope.mo688roundToPx0680j_4(SnackbarKt.TextEndExtraSpacing) : 0), Constraints.m6890getMinWidthimpl(j3));
                        String str6 = str;
                        int size3 = list.size();
                        int i9 = 0;
                        while (i9 < size3) {
                            Measurable measurable5 = list.get(i9);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable5), str6)) {
                                int i10 = height4;
                                final Placeable placeableMo5637measureBRTryo2 = measurable5.mo5637measureBRTryo0(Constraints.m6878copyZbe2FdA$default(j3, 0, iCoerceAtLeast, 0, 0, 9, null));
                                int i11 = placeableMo5637measureBRTryo2.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
                                if (i11 == Integer.MIN_VALUE) {
                                    throw new IllegalArgumentException("No baselines for text".toString());
                                }
                                int i12 = placeableMo5637measureBRTryo2.get(androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline());
                                if (i12 == Integer.MIN_VALUE) {
                                    throw new IllegalArgumentException("No baselines for text".toString());
                                }
                                boolean z = i11 == i12;
                                final int i13 = iMin - width2;
                                if (!z) {
                                    height = measureScope.mo688roundToPx0680j_4(SnackbarKt.HeightToFirstLine) - i11;
                                    iMax = Math.max(measureScope.mo688roundToPx0680j_4(SnackbarTokens.INSTANCE.m3329getTwoLinesContainerHeightD9Ej5fM()), placeableMo5637measureBRTryo2.getHeight() + height);
                                    if (placeableMo5637measureBRTryo0 != null) {
                                        height2 = (iMax - placeableMo5637measureBRTryo0.getHeight()) / 2;
                                        i5 = height2;
                                        i4 = height;
                                        i3 = iMax;
                                    } else {
                                        i3 = iMax;
                                        i4 = height;
                                        i5 = 0;
                                    }
                                } else {
                                    iMax = Math.max(measureScope.mo688roundToPx0680j_4(SnackbarTokens.INSTANCE.m3328getSingleLineContainerHeightD9Ej5fM()), Math.max(height3, i10));
                                    height = (iMax - placeableMo5637measureBRTryo2.getHeight()) / 2;
                                    if (placeableMo5637measureBRTryo0 == null || (i6 = placeableMo5637measureBRTryo0.get(androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline())) == Integer.MIN_VALUE) {
                                        i3 = iMax;
                                        i4 = height;
                                        i5 = 0;
                                    } else {
                                        height2 = (i11 + height) - i6;
                                        i5 = height2;
                                        i4 = height;
                                        i3 = iMax;
                                    }
                                }
                                final int height5 = placeableMo5637measureBRTryo1 != null ? (i3 - placeableMo5637measureBRTryo1.getHeight()) / 2 : 0;
                                final int i14 = i13 - width;
                                final Placeable placeable = placeableMo5637measureBRTryo0;
                                return MeasureScope.layout$default(measureScope, iMin, i3, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$2$1.4
                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                        invoke2(placementScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Placeable.PlacementScope placementScope) {
                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5637measureBRTryo2, 0, i4, 0.0f, 4, null);
                                        Placeable placeable2 = placeableMo5637measureBRTryo1;
                                        if (placeable2 != null) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i13, height5, 0.0f, 4, null);
                                        }
                                        Placeable placeable3 = placeable;
                                        if (placeable3 != null) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, i14, i5, 0.0f, 4, null);
                                        }
                                    }

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }
                                }, 4, null);
                            }
                            i9++;
                            height4 = height4;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                };
                composerStartRestartGroup.updateRememberedValue(measurePolicyRememberedValue);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) measurePolicyRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM1006paddingqDBjuR0$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3536constructorimpl = Updater.m3536constructorimpl(composerStartRestartGroup);
            Updater.m3543setimpl(composerM3536constructorimpl, measurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m3506boximpl(SkippableUpdater.m3507constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            Modifier modifierM1004paddingVpY3zN4$default = PaddingKt.m1004paddingVpY3zN4$default(LayoutIdKt.layoutId(Modifier.INSTANCE, "text"), 0.0f, SnackbarVerticalPadding, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM1004paddingVpY3zN4$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3536constructorimpl2 = Updater.m3536constructorimpl(composerStartRestartGroup);
            Updater.m3543setimpl(composerM3536constructorimpl2, measurePolicyRememberBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3543setimpl(composerM3536constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3536constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3536constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3536constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m3506boximpl(SkippableUpdater.m3507constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i2 & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-167734260);
            if (function3 != null) {
                Modifier modifierLayoutId = LayoutIdKt.layoutId(Modifier.INSTANCE, "action");
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierLayoutId);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3536constructorimpl3 = Updater.m3536constructorimpl(composerStartRestartGroup);
                Updater.m3543setimpl(composerM3536constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3543setimpl(composerM3536constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3536constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM3536constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM3536constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m3506boximpl(SkippableUpdater.m3507constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m4208boximpl(j)), TextKt.getLocalTextStyle().provides(textStyle)}, function3, composerStartRestartGroup, i2 & 112);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(44738899);
            if (function4 != null) {
                Modifier modifierLayoutId2 = LayoutIdKt.layoutId(Modifier.INSTANCE, "dismissAction");
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierLayoutId2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM3536constructorimpl4 = Updater.m3536constructorimpl(composerStartRestartGroup);
                Updater.m3543setimpl(composerM3536constructorimpl4, measurePolicyRememberBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3543setimpl(composerM3536constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3536constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM3536constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM3536constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                function3ModifierMaterializerOf4.invoke(SkippableUpdater.m3506boximpl(SkippableUpdater.m3507constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m4208boximpl(j2)), function4, composerStartRestartGroup, ((i2 >> 3) & 112) | ProvidedValue.$stable);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$3
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

                public final void invoke(Composer composer2, int i3) {
                    SnackbarKt.m2421OneRowSnackbarkKq0p4A(function2, function3, function4, textStyle, j, j2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
