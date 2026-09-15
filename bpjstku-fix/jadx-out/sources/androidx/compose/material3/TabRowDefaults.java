package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
import androidx.compose.material3.tokens.SecondaryNavigationTabTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.ItemTouchHelper;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJD\u0010 \u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\"\u001a\u00020#H\u0007ø\u0001\u0000¢\u0006\u0004\b$\u0010%J0\u0010&\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010\u001fJ\u0012\u0010(\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010)\u001a\u00020*R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R \u0010\b\u001a\u00020\t8GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\fR \u0010\r\u001a\u00020\t8GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000e\u0010\u0002\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0010\u001a\u00020\t8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0012\u001a\u00020\t8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0014\u001a\u00020\t8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0016\u001a\u00020\t8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0017\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+²\u0006\n\u0010,\u001a\u00020\u0004X\u008a\u0084\u0002²\u0006\n\u0010-\u001a\u00020\u0004X\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material3/TabRowDefaults;", "", "()V", "ScrollableTabRowEdgeStartPadding", "Landroidx/compose/ui/unit/Dp;", "getScrollableTabRowEdgeStartPadding-D9Ej5fM", "()F", "F", "containerColor", "Landroidx/compose/ui/graphics/Color;", "getContainerColor$annotations", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "contentColor", "getContentColor$annotations", "getContentColor", "primaryContainerColor", "getPrimaryContainerColor", "primaryContentColor", "getPrimaryContentColor", "secondaryContainerColor", "getSecondaryContainerColor", "secondaryContentColor", "getSecondaryContentColor", "Indicator", "", "modifier", "Landroidx/compose/ui/Modifier;", "height", TypedValues.Custom.S_COLOR, "Indicator-9IZ8Weo", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/runtime/Composer;II)V", "PrimaryIndicator", "width", "shape", "Landroidx/compose/ui/graphics/Shape;", "PrimaryIndicator-10LGxhE", "(Landroidx/compose/ui/Modifier;FFJLandroidx/compose/ui/graphics/Shape;Landroidx/compose/runtime/Composer;II)V", "SecondaryIndicator", "SecondaryIndicator-9IZ8Weo", "tabIndicatorOffset", "currentTabPosition", "Landroidx/compose/material3/TabPosition;", "material3_release", "currentTabWidth", "indicatorOffset"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TabRowDefaults {
    public static final int $stable = 0;
    public static final TabRowDefaults INSTANCE = new TabRowDefaults();
    private static final float ScrollableTabRowEdgeStartPadding = Dp.m6935constructorimpl(52.0f);

    @Deprecated(message = "Use TabRowDefaults.primaryContainerColor instead", replaceWith = @ReplaceWith(expression = "primaryContainerColor", imports = {}))
    public static /* synthetic */ void getContainerColor$annotations() {
    }

    @Deprecated(message = "Use TabRowDefaults.primaryContentColor instead", replaceWith = @ReplaceWith(expression = "primaryContentColor", imports = {}))
    public static /* synthetic */ void getContentColor$annotations() {
    }

    private TabRowDefaults() {
    }

    /* JADX INFO: renamed from: getScrollableTabRowEdgeStartPadding-D9Ej5fM, reason: not valid java name */
    public final float m2554getScrollableTabRowEdgeStartPaddingD9Ej5fM() {
        return ScrollableTabRowEdgeStartPadding;
    }

    public final long getContainerColor(Composer composer, int i) {
        composer.startReplaceableGroup(-2026555673);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2026555673, i, -1, "androidx.compose.material3.TabRowDefaults.<get-containerColor> (TabRow.kt:1011)");
        }
        long value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    public final long getPrimaryContainerColor(Composer composer, int i) {
        composer.startReplaceableGroup(-2069154037);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2069154037, i, -1, "androidx.compose.material3.TabRowDefaults.<get-primaryContainerColor> (TabRow.kt:1016)");
        }
        long value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    public final long getSecondaryContainerColor(Composer composer, int i) {
        composer.startReplaceableGroup(-1938007129);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1938007129, i, -1, "androidx.compose.material3.TabRowDefaults.<get-secondaryContainerColor> (TabRow.kt:1021)");
        }
        long value = ColorSchemeKt.getValue(SecondaryNavigationTabTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    public final long getContentColor(Composer composer, int i) {
        composer.startReplaceableGroup(1163072359);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1163072359, i, -1, "androidx.compose.material3.TabRowDefaults.<get-contentColor> (TabRow.kt:1030)");
        }
        long value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveLabelTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    public final long getPrimaryContentColor(Composer composer, int i) {
        composer.startReplaceableGroup(1410362619);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1410362619, i, -1, "androidx.compose.material3.TabRowDefaults.<get-primaryContentColor> (TabRow.kt:1035)");
        }
        long value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveLabelTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    public final long getSecondaryContentColor(Composer composer, int i) {
        composer.startReplaceableGroup(1166419479);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1166419479, i, -1, "androidx.compose.material3.TabRowDefaults.<get-secondaryContentColor> (TabRow.kt:1040)");
        }
        long value = ColorSchemeKt.getValue(SecondaryNavigationTabTokens.INSTANCE.getActiveLabelTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:52:0x009c  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    @Deprecated(message = "Use SecondaryIndicator instead.", replaceWith = @ReplaceWith(expression = "SecondaryIndicator(modifier, height, color)", imports = {}))
    /* JADX INFO: renamed from: Indicator-9IZ8Weo, reason: not valid java name */
    public final void m2551Indicator9IZ8Weo(Modifier modifier, float f, long j, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        float f2;
        long j2;
        final Modifier.Companion companion;
        final float fM3292getActiveIndicatorHeightD9Ej5fM;
        int i4;
        final long jFromToken;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1454716052);
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
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                f2 = f;
                i3 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    j2 = j;
                    int i7 = composerStartRestartGroup.changed(j2) ? 256 : 128;
                    i3 |= i7;
                } else {
                    j2 = j;
                }
                i3 |= i7;
            } else {
                j2 = j;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                } else {
                    if (i5 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i6 != 0) {
                        fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                    } else {
                        fM3292getActiveIndicatorHeightD9Ej5fM = f2;
                    }
                    if ((i2 & 4) != 0) {
                        i4 = i3 & (-897);
                        jFromToken = ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6), PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor());
                    } else {
                        f2 = fM3292getActiveIndicatorHeightD9Ej5fM;
                        modifier2 = companion;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1454716052, i4, -1, "androidx.compose.material3.TabRowDefaults.Indicator (TabRow.kt:1062)");
                    }
                    BoxKt.Box(BackgroundKt.m557backgroundbw27NRU$default(SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), fM3292getActiveIndicatorHeightD9Ej5fM), jFromToken, null, 2, null), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                companion = modifier2;
                fM3292getActiveIndicatorHeightD9Ej5fM = f2;
                i4 = i3;
                jFromToken = j2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1454716052, i4, -1, "androidx.compose.material3.TabRowDefaults.Indicator (TabRow.kt:1062)");
                }
                BoxKt.Box(BackgroundKt.m557backgroundbw27NRU$default(SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), fM3292getActiveIndicatorHeightD9Ej5fM), jFromToken, null, 2, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                companion = modifier2;
                fM3292getActiveIndicatorHeightD9Ej5fM = f2;
                jFromToken = j2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowDefaults$Indicator$1
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
                        this.$tmp0_rcvr.m2551Indicator9IZ8Weo(companion, fM3292getActiveIndicatorHeightD9Ej5fM, jFromToken, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 48;
        f2 = f;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j2 = j;
                if (composerStartRestartGroup.changed(j2)) {
                }
                i3 |= i7;
            } else {
                j2 = j;
            }
            i3 |= i7;
        } else {
            j2 = j;
        }
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i5 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i6 != 0) {
                    fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                } else {
                    fM3292getActiveIndicatorHeightD9Ej5fM = f2;
                }
                if ((i2 & 4) != 0) {
                    i4 = i3 & (-897);
                    jFromToken = ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6), PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor());
                } else {
                    f2 = fM3292getActiveIndicatorHeightD9Ej5fM;
                    modifier2 = companion;
                    companion = modifier2;
                    fM3292getActiveIndicatorHeightD9Ej5fM = f2;
                    i4 = i3;
                    jFromToken = j2;
                }
            } else {
                if (i5 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i6 != 0) {
                    fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                } else {
                    fM3292getActiveIndicatorHeightD9Ej5fM = f2;
                }
                if ((i2 & 4) != 0) {
                    i4 = i3 & (-897);
                    jFromToken = ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6), PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor());
                } else {
                    f2 = fM3292getActiveIndicatorHeightD9Ej5fM;
                    modifier2 = companion;
                    companion = modifier2;
                    fM3292getActiveIndicatorHeightD9Ej5fM = f2;
                    i4 = i3;
                    jFromToken = j2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1454716052, i4, -1, "androidx.compose.material3.TabRowDefaults.Indicator (TabRow.kt:1062)");
            }
            BoxKt.Box(BackgroundKt.m557backgroundbw27NRU$default(SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), fM3292getActiveIndicatorHeightD9Ej5fM), jFromToken, null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i5 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i6 != 0) {
                    fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                } else {
                    fM3292getActiveIndicatorHeightD9Ej5fM = f2;
                }
                if ((i2 & 4) != 0) {
                    i4 = i3 & (-897);
                    jFromToken = ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6), PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor());
                } else {
                    f2 = fM3292getActiveIndicatorHeightD9Ej5fM;
                    modifier2 = companion;
                    companion = modifier2;
                    fM3292getActiveIndicatorHeightD9Ej5fM = f2;
                    i4 = i3;
                    jFromToken = j2;
                }
            } else {
                if (i5 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i6 != 0) {
                    fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                } else {
                    fM3292getActiveIndicatorHeightD9Ej5fM = f2;
                }
                if ((i2 & 4) != 0) {
                    i4 = i3 & (-897);
                    jFromToken = ColorSchemeKt.fromToken(MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6), PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor());
                } else {
                    f2 = fM3292getActiveIndicatorHeightD9Ej5fM;
                    modifier2 = companion;
                    companion = modifier2;
                    fM3292getActiveIndicatorHeightD9Ej5fM = f2;
                    i4 = i3;
                    jFromToken = j2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1454716052, i4, -1, "androidx.compose.material3.TabRowDefaults.Indicator (TabRow.kt:1062)");
            }
            BoxKt.Box(BackgroundKt.m557backgroundbw27NRU$default(SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), fM3292getActiveIndicatorHeightD9Ej5fM), jFromToken, null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowDefaults$Indicator$1
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
                    this.$tmp0_rcvr.m2551Indicator9IZ8Weo(companion, fM3292getActiveIndicatorHeightD9Ej5fM, jFromToken, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

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
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x0101  */
    /* JADX WARN: Code duplicated, block: B:87:0x011d  */
    /* JADX WARN: Code duplicated, block: B:90:0x012a  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: PrimaryIndicator-10LGxhE, reason: not valid java name */
    public final void m2552PrimaryIndicator10LGxhE(Modifier modifier, float f, float f2, long j, Shape shape, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        float fM6935constructorimpl;
        int i4;
        float fM3292getActiveIndicatorHeightD9Ej5fM;
        int i5;
        long value;
        int i6;
        Shape activeIndicatorShape;
        int i7;
        final Modifier.Companion companion;
        final float f3;
        final float f4;
        final long j2;
        final Shape shape2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1895596205);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                fM6935constructorimpl = f;
                i3 |= composerStartRestartGroup.changed(fM6935constructorimpl) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    fM3292getActiveIndicatorHeightD9Ej5fM = f2;
                    if (composerStartRestartGroup.changed(fM3292getActiveIndicatorHeightD9Ej5fM)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        value = j;
                        int i10 = composerStartRestartGroup.changed(value) ? 2048 : 1024;
                        i3 |= i10;
                    } else {
                        value = j;
                    }
                    i3 |= i10;
                } else {
                    value = j;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        activeIndicatorShape = shape;
                        if (composerStartRestartGroup.changed(activeIndicatorShape)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i8 != 0) {
                                companion = Modifier.INSTANCE;
                            } else {
                                companion = modifier2;
                            }
                            if (i9 != 0) {
                                fM6935constructorimpl = Dp.m6935constructorimpl(24.0f);
                            }
                            if (i4 != 0) {
                                fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                            }
                            if ((i2 & 8) != 0) {
                                value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                                i3 &= -7169;
                            }
                            if (i6 != 0) {
                                activeIndicatorShape = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            companion = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1895596205, i3, -1, "androidx.compose.material3.TabRowDefaults.PrimaryIndicator (TabRow.kt:1088)");
                        }
                        SpacerKt.Spacer(BackgroundKt.m556backgroundbw27NRU(SizeKt.m1044requiredWidth3ABfNKs(SizeKt.m1036requiredHeight3ABfNKs(companion, fM3292getActiveIndicatorHeightD9Ej5fM), fM6935constructorimpl), value, activeIndicatorShape), composerStartRestartGroup, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        companion = modifier2;
                    }
                    f3 = fM6935constructorimpl;
                    f4 = fM3292getActiveIndicatorHeightD9Ej5fM;
                    j2 = value;
                    shape2 = activeIndicatorShape;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowDefaults$PrimaryIndicator$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i11) {
                                this.$tmp0_rcvr.m2552PrimaryIndicator10LGxhE(companion, f3, f4, j2, shape2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                    }
                }
                i3 |= 24576;
                activeIndicatorShape = shape;
                if ((i3 & 9363) == 9362) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i9 != 0) {
                            fM6935constructorimpl = Dp.m6935constructorimpl(24.0f);
                        }
                        if (i4 != 0) {
                            fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                        }
                        if ((i2 & 8) != 0) {
                            value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                            i3 &= -7169;
                        }
                        if (i6 != 0) {
                            activeIndicatorShape = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                        }
                    } else {
                        if (i8 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i9 != 0) {
                            fM6935constructorimpl = Dp.m6935constructorimpl(24.0f);
                        }
                        if (i4 != 0) {
                            fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                        }
                        if ((i2 & 8) != 0) {
                            value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                            i3 &= -7169;
                        }
                        if (i6 != 0) {
                            activeIndicatorShape = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1895596205, i3, -1, "androidx.compose.material3.TabRowDefaults.PrimaryIndicator (TabRow.kt:1088)");
                    }
                    SpacerKt.Spacer(BackgroundKt.m556backgroundbw27NRU(SizeKt.m1044requiredWidth3ABfNKs(SizeKt.m1036requiredHeight3ABfNKs(companion, fM3292getActiveIndicatorHeightD9Ej5fM), fM6935constructorimpl), value, activeIndicatorShape), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i9 != 0) {
                            fM6935constructorimpl = Dp.m6935constructorimpl(24.0f);
                        }
                        if (i4 != 0) {
                            fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                        }
                        if ((i2 & 8) != 0) {
                            value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                            i3 &= -7169;
                        }
                        if (i6 != 0) {
                            activeIndicatorShape = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                        }
                    } else {
                        if (i8 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i9 != 0) {
                            fM6935constructorimpl = Dp.m6935constructorimpl(24.0f);
                        }
                        if (i4 != 0) {
                            fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                        }
                        if ((i2 & 8) != 0) {
                            value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                            i3 &= -7169;
                        }
                        if (i6 != 0) {
                            activeIndicatorShape = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1895596205, i3, -1, "androidx.compose.material3.TabRowDefaults.PrimaryIndicator (TabRow.kt:1088)");
                    }
                    SpacerKt.Spacer(BackgroundKt.m556backgroundbw27NRU(SizeKt.m1044requiredWidth3ABfNKs(SizeKt.m1036requiredHeight3ABfNKs(companion, fM3292getActiveIndicatorHeightD9Ej5fM), fM6935constructorimpl), value, activeIndicatorShape), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                f3 = fM6935constructorimpl;
                f4 = fM3292getActiveIndicatorHeightD9Ej5fM;
                j2 = value;
                shape2 = activeIndicatorShape;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowDefaults$PrimaryIndicator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11) {
                            this.$tmp0_rcvr.m2552PrimaryIndicator10LGxhE(companion, f3, f4, j2, shape2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 384;
            fM3292getActiveIndicatorHeightD9Ej5fM = f2;
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    value = j;
                    if (composerStartRestartGroup.changed(value)) {
                    }
                    i3 |= i10;
                } else {
                    value = j;
                }
                i3 |= i10;
            } else {
                value = j;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    activeIndicatorShape = shape;
                    if (composerStartRestartGroup.changed(activeIndicatorShape)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i3 & 9363) == 9362) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i9 != 0) {
                            fM6935constructorimpl = Dp.m6935constructorimpl(24.0f);
                        }
                        if (i4 != 0) {
                            fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                        }
                        if ((i2 & 8) != 0) {
                            value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                            i3 &= -7169;
                        }
                        if (i6 != 0) {
                            activeIndicatorShape = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                        }
                    } else {
                        if (i8 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i9 != 0) {
                            fM6935constructorimpl = Dp.m6935constructorimpl(24.0f);
                        }
                        if (i4 != 0) {
                            fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                        }
                        if ((i2 & 8) != 0) {
                            value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                            i3 &= -7169;
                        }
                        if (i6 != 0) {
                            activeIndicatorShape = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1895596205, i3, -1, "androidx.compose.material3.TabRowDefaults.PrimaryIndicator (TabRow.kt:1088)");
                    }
                    SpacerKt.Spacer(BackgroundKt.m556backgroundbw27NRU(SizeKt.m1044requiredWidth3ABfNKs(SizeKt.m1036requiredHeight3ABfNKs(companion, fM3292getActiveIndicatorHeightD9Ej5fM), fM6935constructorimpl), value, activeIndicatorShape), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i9 != 0) {
                            fM6935constructorimpl = Dp.m6935constructorimpl(24.0f);
                        }
                        if (i4 != 0) {
                            fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                        }
                        if ((i2 & 8) != 0) {
                            value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                            i3 &= -7169;
                        }
                        if (i6 != 0) {
                            activeIndicatorShape = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                        }
                    } else {
                        if (i8 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i9 != 0) {
                            fM6935constructorimpl = Dp.m6935constructorimpl(24.0f);
                        }
                        if (i4 != 0) {
                            fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                        }
                        if ((i2 & 8) != 0) {
                            value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                            i3 &= -7169;
                        }
                        if (i6 != 0) {
                            activeIndicatorShape = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1895596205, i3, -1, "androidx.compose.material3.TabRowDefaults.PrimaryIndicator (TabRow.kt:1088)");
                    }
                    SpacerKt.Spacer(BackgroundKt.m556backgroundbw27NRU(SizeKt.m1044requiredWidth3ABfNKs(SizeKt.m1036requiredHeight3ABfNKs(companion, fM3292getActiveIndicatorHeightD9Ej5fM), fM6935constructorimpl), value, activeIndicatorShape), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                f3 = fM6935constructorimpl;
                f4 = fM3292getActiveIndicatorHeightD9Ej5fM;
                j2 = value;
                shape2 = activeIndicatorShape;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowDefaults$PrimaryIndicator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11) {
                            this.$tmp0_rcvr.m2552PrimaryIndicator10LGxhE(companion, f3, f4, j2, shape2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            activeIndicatorShape = shape;
            if ((i3 & 9363) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i9 != 0) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(24.0f);
                    }
                    if (i4 != 0) {
                        fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                    }
                    if ((i2 & 8) != 0) {
                        value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                        i3 &= -7169;
                    }
                    if (i6 != 0) {
                        activeIndicatorShape = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                    }
                } else {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i9 != 0) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(24.0f);
                    }
                    if (i4 != 0) {
                        fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                    }
                    if ((i2 & 8) != 0) {
                        value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                        i3 &= -7169;
                    }
                    if (i6 != 0) {
                        activeIndicatorShape = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1895596205, i3, -1, "androidx.compose.material3.TabRowDefaults.PrimaryIndicator (TabRow.kt:1088)");
                }
                SpacerKt.Spacer(BackgroundKt.m556backgroundbw27NRU(SizeKt.m1044requiredWidth3ABfNKs(SizeKt.m1036requiredHeight3ABfNKs(companion, fM3292getActiveIndicatorHeightD9Ej5fM), fM6935constructorimpl), value, activeIndicatorShape), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i9 != 0) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(24.0f);
                    }
                    if (i4 != 0) {
                        fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                    }
                    if ((i2 & 8) != 0) {
                        value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                        i3 &= -7169;
                    }
                    if (i6 != 0) {
                        activeIndicatorShape = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                    }
                } else {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i9 != 0) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(24.0f);
                    }
                    if (i4 != 0) {
                        fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                    }
                    if ((i2 & 8) != 0) {
                        value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                        i3 &= -7169;
                    }
                    if (i6 != 0) {
                        activeIndicatorShape = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1895596205, i3, -1, "androidx.compose.material3.TabRowDefaults.PrimaryIndicator (TabRow.kt:1088)");
                }
                SpacerKt.Spacer(BackgroundKt.m556backgroundbw27NRU(SizeKt.m1044requiredWidth3ABfNKs(SizeKt.m1036requiredHeight3ABfNKs(companion, fM3292getActiveIndicatorHeightD9Ej5fM), fM6935constructorimpl), value, activeIndicatorShape), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            f3 = fM6935constructorimpl;
            f4 = fM3292getActiveIndicatorHeightD9Ej5fM;
            j2 = value;
            shape2 = activeIndicatorShape;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowDefaults$PrimaryIndicator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11) {
                        this.$tmp0_rcvr.m2552PrimaryIndicator10LGxhE(companion, f3, f4, j2, shape2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 48;
        fM6935constructorimpl = f;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                fM3292getActiveIndicatorHeightD9Ej5fM = f2;
                if (composerStartRestartGroup.changed(fM3292getActiveIndicatorHeightD9Ej5fM)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    value = j;
                    if (composerStartRestartGroup.changed(value)) {
                    }
                    i3 |= i10;
                } else {
                    value = j;
                }
                i3 |= i10;
            } else {
                value = j;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    activeIndicatorShape = shape;
                    if (composerStartRestartGroup.changed(activeIndicatorShape)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((i3 & 9363) == 9362) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i9 != 0) {
                            fM6935constructorimpl = Dp.m6935constructorimpl(24.0f);
                        }
                        if (i4 != 0) {
                            fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                        }
                        if ((i2 & 8) != 0) {
                            value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                            i3 &= -7169;
                        }
                        if (i6 != 0) {
                            activeIndicatorShape = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                        }
                    } else {
                        if (i8 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i9 != 0) {
                            fM6935constructorimpl = Dp.m6935constructorimpl(24.0f);
                        }
                        if (i4 != 0) {
                            fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                        }
                        if ((i2 & 8) != 0) {
                            value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                            i3 &= -7169;
                        }
                        if (i6 != 0) {
                            activeIndicatorShape = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1895596205, i3, -1, "androidx.compose.material3.TabRowDefaults.PrimaryIndicator (TabRow.kt:1088)");
                    }
                    SpacerKt.Spacer(BackgroundKt.m556backgroundbw27NRU(SizeKt.m1044requiredWidth3ABfNKs(SizeKt.m1036requiredHeight3ABfNKs(companion, fM3292getActiveIndicatorHeightD9Ej5fM), fM6935constructorimpl), value, activeIndicatorShape), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i9 != 0) {
                            fM6935constructorimpl = Dp.m6935constructorimpl(24.0f);
                        }
                        if (i4 != 0) {
                            fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                        }
                        if ((i2 & 8) != 0) {
                            value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                            i3 &= -7169;
                        }
                        if (i6 != 0) {
                            activeIndicatorShape = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                        }
                    } else {
                        if (i8 != 0) {
                            companion = Modifier.INSTANCE;
                        } else {
                            companion = modifier2;
                        }
                        if (i9 != 0) {
                            fM6935constructorimpl = Dp.m6935constructorimpl(24.0f);
                        }
                        if (i4 != 0) {
                            fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                        }
                        if ((i2 & 8) != 0) {
                            value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                            i3 &= -7169;
                        }
                        if (i6 != 0) {
                            activeIndicatorShape = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1895596205, i3, -1, "androidx.compose.material3.TabRowDefaults.PrimaryIndicator (TabRow.kt:1088)");
                    }
                    SpacerKt.Spacer(BackgroundKt.m556backgroundbw27NRU(SizeKt.m1044requiredWidth3ABfNKs(SizeKt.m1036requiredHeight3ABfNKs(companion, fM3292getActiveIndicatorHeightD9Ej5fM), fM6935constructorimpl), value, activeIndicatorShape), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                f3 = fM6935constructorimpl;
                f4 = fM3292getActiveIndicatorHeightD9Ej5fM;
                j2 = value;
                shape2 = activeIndicatorShape;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowDefaults$PrimaryIndicator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i11) {
                            this.$tmp0_rcvr.m2552PrimaryIndicator10LGxhE(companion, f3, f4, j2, shape2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                }
            }
            i3 |= 24576;
            activeIndicatorShape = shape;
            if ((i3 & 9363) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i9 != 0) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(24.0f);
                    }
                    if (i4 != 0) {
                        fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                    }
                    if ((i2 & 8) != 0) {
                        value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                        i3 &= -7169;
                    }
                    if (i6 != 0) {
                        activeIndicatorShape = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                    }
                } else {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i9 != 0) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(24.0f);
                    }
                    if (i4 != 0) {
                        fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                    }
                    if ((i2 & 8) != 0) {
                        value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                        i3 &= -7169;
                    }
                    if (i6 != 0) {
                        activeIndicatorShape = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1895596205, i3, -1, "androidx.compose.material3.TabRowDefaults.PrimaryIndicator (TabRow.kt:1088)");
                }
                SpacerKt.Spacer(BackgroundKt.m556backgroundbw27NRU(SizeKt.m1044requiredWidth3ABfNKs(SizeKt.m1036requiredHeight3ABfNKs(companion, fM3292getActiveIndicatorHeightD9Ej5fM), fM6935constructorimpl), value, activeIndicatorShape), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i9 != 0) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(24.0f);
                    }
                    if (i4 != 0) {
                        fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                    }
                    if ((i2 & 8) != 0) {
                        value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                        i3 &= -7169;
                    }
                    if (i6 != 0) {
                        activeIndicatorShape = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                    }
                } else {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i9 != 0) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(24.0f);
                    }
                    if (i4 != 0) {
                        fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                    }
                    if ((i2 & 8) != 0) {
                        value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                        i3 &= -7169;
                    }
                    if (i6 != 0) {
                        activeIndicatorShape = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1895596205, i3, -1, "androidx.compose.material3.TabRowDefaults.PrimaryIndicator (TabRow.kt:1088)");
                }
                SpacerKt.Spacer(BackgroundKt.m556backgroundbw27NRU(SizeKt.m1044requiredWidth3ABfNKs(SizeKt.m1036requiredHeight3ABfNKs(companion, fM3292getActiveIndicatorHeightD9Ej5fM), fM6935constructorimpl), value, activeIndicatorShape), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            f3 = fM6935constructorimpl;
            f4 = fM3292getActiveIndicatorHeightD9Ej5fM;
            j2 = value;
            shape2 = activeIndicatorShape;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowDefaults$PrimaryIndicator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11) {
                        this.$tmp0_rcvr.m2552PrimaryIndicator10LGxhE(companion, f3, f4, j2, shape2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 384;
        fM3292getActiveIndicatorHeightD9Ej5fM = f2;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                value = j;
                if (composerStartRestartGroup.changed(value)) {
                }
                i3 |= i10;
            } else {
                value = j;
            }
            i3 |= i10;
        } else {
            value = j;
        }
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                activeIndicatorShape = shape;
                if (composerStartRestartGroup.changed(activeIndicatorShape)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((i3 & 9363) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i9 != 0) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(24.0f);
                    }
                    if (i4 != 0) {
                        fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                    }
                    if ((i2 & 8) != 0) {
                        value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                        i3 &= -7169;
                    }
                    if (i6 != 0) {
                        activeIndicatorShape = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                    }
                } else {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i9 != 0) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(24.0f);
                    }
                    if (i4 != 0) {
                        fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                    }
                    if ((i2 & 8) != 0) {
                        value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                        i3 &= -7169;
                    }
                    if (i6 != 0) {
                        activeIndicatorShape = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1895596205, i3, -1, "androidx.compose.material3.TabRowDefaults.PrimaryIndicator (TabRow.kt:1088)");
                }
                SpacerKt.Spacer(BackgroundKt.m556backgroundbw27NRU(SizeKt.m1044requiredWidth3ABfNKs(SizeKt.m1036requiredHeight3ABfNKs(companion, fM3292getActiveIndicatorHeightD9Ej5fM), fM6935constructorimpl), value, activeIndicatorShape), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i9 != 0) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(24.0f);
                    }
                    if (i4 != 0) {
                        fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                    }
                    if ((i2 & 8) != 0) {
                        value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                        i3 &= -7169;
                    }
                    if (i6 != 0) {
                        activeIndicatorShape = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                    }
                } else {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i9 != 0) {
                        fM6935constructorimpl = Dp.m6935constructorimpl(24.0f);
                    }
                    if (i4 != 0) {
                        fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                    }
                    if ((i2 & 8) != 0) {
                        value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                        i3 &= -7169;
                    }
                    if (i6 != 0) {
                        activeIndicatorShape = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1895596205, i3, -1, "androidx.compose.material3.TabRowDefaults.PrimaryIndicator (TabRow.kt:1088)");
                }
                SpacerKt.Spacer(BackgroundKt.m556backgroundbw27NRU(SizeKt.m1044requiredWidth3ABfNKs(SizeKt.m1036requiredHeight3ABfNKs(companion, fM3292getActiveIndicatorHeightD9Ej5fM), fM6935constructorimpl), value, activeIndicatorShape), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            f3 = fM6935constructorimpl;
            f4 = fM3292getActiveIndicatorHeightD9Ej5fM;
            j2 = value;
            shape2 = activeIndicatorShape;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowDefaults$PrimaryIndicator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i11) {
                        this.$tmp0_rcvr.m2552PrimaryIndicator10LGxhE(companion, f3, f4, j2, shape2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 24576;
        activeIndicatorShape = shape;
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i9 != 0) {
                    fM6935constructorimpl = Dp.m6935constructorimpl(24.0f);
                }
                if (i4 != 0) {
                    fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                }
                if ((i2 & 8) != 0) {
                    value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                    i3 &= -7169;
                }
                if (i6 != 0) {
                    activeIndicatorShape = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                }
            } else {
                if (i8 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i9 != 0) {
                    fM6935constructorimpl = Dp.m6935constructorimpl(24.0f);
                }
                if (i4 != 0) {
                    fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                }
                if ((i2 & 8) != 0) {
                    value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                    i3 &= -7169;
                }
                if (i6 != 0) {
                    activeIndicatorShape = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1895596205, i3, -1, "androidx.compose.material3.TabRowDefaults.PrimaryIndicator (TabRow.kt:1088)");
            }
            SpacerKt.Spacer(BackgroundKt.m556backgroundbw27NRU(SizeKt.m1044requiredWidth3ABfNKs(SizeKt.m1036requiredHeight3ABfNKs(companion, fM3292getActiveIndicatorHeightD9Ej5fM), fM6935constructorimpl), value, activeIndicatorShape), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i9 != 0) {
                    fM6935constructorimpl = Dp.m6935constructorimpl(24.0f);
                }
                if (i4 != 0) {
                    fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                }
                if ((i2 & 8) != 0) {
                    value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                    i3 &= -7169;
                }
                if (i6 != 0) {
                    activeIndicatorShape = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                }
            } else {
                if (i8 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i9 != 0) {
                    fM6935constructorimpl = Dp.m6935constructorimpl(24.0f);
                }
                if (i4 != 0) {
                    fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                }
                if ((i2 & 8) != 0) {
                    value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                    i3 &= -7169;
                }
                if (i6 != 0) {
                    activeIndicatorShape = PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorShape();
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1895596205, i3, -1, "androidx.compose.material3.TabRowDefaults.PrimaryIndicator (TabRow.kt:1088)");
            }
            SpacerKt.Spacer(BackgroundKt.m556backgroundbw27NRU(SizeKt.m1044requiredWidth3ABfNKs(SizeKt.m1036requiredHeight3ABfNKs(companion, fM3292getActiveIndicatorHeightD9Ej5fM), fM6935constructorimpl), value, activeIndicatorShape), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        f3 = fM6935constructorimpl;
        f4 = fM3292getActiveIndicatorHeightD9Ej5fM;
        j2 = value;
        shape2 = activeIndicatorShape;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowDefaults$PrimaryIndicator$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i11) {
                    this.$tmp0_rcvr.m2552PrimaryIndicator10LGxhE(companion, f3, f4, j2, shape2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:52:0x009c  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: SecondaryIndicator-9IZ8Weo, reason: not valid java name */
    public final void m2553SecondaryIndicator9IZ8Weo(Modifier modifier, float f, long j, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        float f2;
        long j2;
        final Modifier.Companion companion;
        final float fM3292getActiveIndicatorHeightD9Ej5fM;
        int i4;
        final long value;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1498258020);
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
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                f2 = f;
                i3 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    j2 = j;
                    int i7 = composerStartRestartGroup.changed(j2) ? 256 : 128;
                    i3 |= i7;
                } else {
                    j2 = j;
                }
                i3 |= i7;
            } else {
                j2 = j;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                } else {
                    if (i5 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i6 != 0) {
                        fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                    } else {
                        fM3292getActiveIndicatorHeightD9Ej5fM = f2;
                    }
                    if ((i2 & 4) != 0) {
                        i4 = i3 & (-897);
                        value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                    } else {
                        f2 = fM3292getActiveIndicatorHeightD9Ej5fM;
                        modifier2 = companion;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1498258020, i4, -1, "androidx.compose.material3.TabRowDefaults.SecondaryIndicator (TabRow.kt:1110)");
                    }
                    BoxKt.Box(BackgroundKt.m557backgroundbw27NRU$default(SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), fM3292getActiveIndicatorHeightD9Ej5fM), value, null, 2, null), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                companion = modifier2;
                fM3292getActiveIndicatorHeightD9Ej5fM = f2;
                i4 = i3;
                value = j2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1498258020, i4, -1, "androidx.compose.material3.TabRowDefaults.SecondaryIndicator (TabRow.kt:1110)");
                }
                BoxKt.Box(BackgroundKt.m557backgroundbw27NRU$default(SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), fM3292getActiveIndicatorHeightD9Ej5fM), value, null, 2, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                companion = modifier2;
                fM3292getActiveIndicatorHeightD9Ej5fM = f2;
                value = j2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowDefaults$SecondaryIndicator$1
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
                        this.$tmp0_rcvr.m2553SecondaryIndicator9IZ8Weo(companion, fM3292getActiveIndicatorHeightD9Ej5fM, value, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                    }
                });
            }
        }
        i3 |= 48;
        f2 = f;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j2 = j;
                if (composerStartRestartGroup.changed(j2)) {
                }
                i3 |= i7;
            } else {
                j2 = j;
            }
            i3 |= i7;
        } else {
            j2 = j;
        }
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i5 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i6 != 0) {
                    fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                } else {
                    fM3292getActiveIndicatorHeightD9Ej5fM = f2;
                }
                if ((i2 & 4) != 0) {
                    i4 = i3 & (-897);
                    value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                } else {
                    f2 = fM3292getActiveIndicatorHeightD9Ej5fM;
                    modifier2 = companion;
                    companion = modifier2;
                    fM3292getActiveIndicatorHeightD9Ej5fM = f2;
                    i4 = i3;
                    value = j2;
                }
            } else {
                if (i5 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i6 != 0) {
                    fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                } else {
                    fM3292getActiveIndicatorHeightD9Ej5fM = f2;
                }
                if ((i2 & 4) != 0) {
                    i4 = i3 & (-897);
                    value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                } else {
                    f2 = fM3292getActiveIndicatorHeightD9Ej5fM;
                    modifier2 = companion;
                    companion = modifier2;
                    fM3292getActiveIndicatorHeightD9Ej5fM = f2;
                    i4 = i3;
                    value = j2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1498258020, i4, -1, "androidx.compose.material3.TabRowDefaults.SecondaryIndicator (TabRow.kt:1110)");
            }
            BoxKt.Box(BackgroundKt.m557backgroundbw27NRU$default(SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), fM3292getActiveIndicatorHeightD9Ej5fM), value, null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
                if (i5 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i6 != 0) {
                    fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                } else {
                    fM3292getActiveIndicatorHeightD9Ej5fM = f2;
                }
                if ((i2 & 4) != 0) {
                    i4 = i3 & (-897);
                    value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                } else {
                    f2 = fM3292getActiveIndicatorHeightD9Ej5fM;
                    modifier2 = companion;
                    companion = modifier2;
                    fM3292getActiveIndicatorHeightD9Ej5fM = f2;
                    i4 = i3;
                    value = j2;
                }
            } else {
                if (i5 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i6 != 0) {
                    fM3292getActiveIndicatorHeightD9Ej5fM = PrimaryNavigationTabTokens.INSTANCE.m3292getActiveIndicatorHeightD9Ej5fM();
                } else {
                    fM3292getActiveIndicatorHeightD9Ej5fM = f2;
                }
                if ((i2 & 4) != 0) {
                    i4 = i3 & (-897);
                    value = ColorSchemeKt.getValue(PrimaryNavigationTabTokens.INSTANCE.getActiveIndicatorColor(), composerStartRestartGroup, 6);
                } else {
                    f2 = fM3292getActiveIndicatorHeightD9Ej5fM;
                    modifier2 = companion;
                    companion = modifier2;
                    fM3292getActiveIndicatorHeightD9Ej5fM = f2;
                    i4 = i3;
                    value = j2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1498258020, i4, -1, "androidx.compose.material3.TabRowDefaults.SecondaryIndicator (TabRow.kt:1110)");
            }
            BoxKt.Box(BackgroundKt.m557backgroundbw27NRU$default(SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), fM3292getActiveIndicatorHeightD9Ej5fM), value, null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowDefaults$SecondaryIndicator$1
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
                    this.$tmp0_rcvr.m2553SecondaryIndicator9IZ8Weo(companion, fM3292getActiveIndicatorHeightD9Ej5fM, value, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public final Modifier tabIndicatorOffset(Modifier modifier, final TabPosition tabPosition) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("tabIndicatorOffset");
                inspectorInfo.setValue(tabPosition);
            }

            {
                super(1);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material3.TabRowDefaults.tabIndicatorOffset.2
            @Override // kotlin.jvm.functions.Function3
            public final /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.startReplaceableGroup(-1541271084);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1541271084, i, -1, "androidx.compose.material3.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:1134)");
                }
                State<Dp> stateM449animateDpAsStateAjpBEmI = AnimateAsStateKt.m449animateDpAsStateAjpBEmI(tabPosition.getWidth(), AnimationSpecKt.tween$default(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, composer, 0, 12);
                Modifier modifierM1052width3ABfNKs = SizeKt.m1052width3ABfNKs(OffsetKt.m963offsetVpY3zN4$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), Alignment.INSTANCE.getBottomStart(), false, 2, null), invoke$lambda$1(AnimateAsStateKt.m449animateDpAsStateAjpBEmI(tabPosition.getLeft(), AnimationSpecKt.tween$default(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, composer, 0, 12)), 0.0f, 2, null), invoke$lambda$0(stateM449animateDpAsStateAjpBEmI));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierM1052width3ABfNKs;
            }

            private static final float invoke$lambda$0(State<Dp> state) {
                return state.getValue().m6949unboximpl();
            }

            private static final float invoke$lambda$1(State<Dp> state) {
                return state.getValue().m6949unboximpl();
            }

            {
                super(3);
            }
        });
    }
}
