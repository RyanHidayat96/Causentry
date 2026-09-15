package defpackage;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import com.bpjstku.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class onActionViewCollapsed {
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:86:0x0107  */
    /* JADX WARN: Code duplicated, block: B:89:0x0199  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    public static final void TuitionPaymentFragmentbindingInflater1(final String str, final String str2, final Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> function2, boolean z, boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        boolean z6;
        long jM4253getTransparent0d7_KjU;
        long jM4255getWhite0d7_KjU;
        final boolean z7;
        final boolean z8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(1901673274);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 == 0) {
            if ((i & 24576) == 0) {
                z3 = z;
                i3 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    z4 = z2;
                    if (composerStartRestartGroup.changed(z4)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                    if (i6 != 0) {
                        z5 = true;
                    } else {
                        z5 = z3;
                    }
                    if (i4 != 0) {
                        z6 = false;
                    } else {
                        z6 = z4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1901673274, i3, -1, "com.bpjstku.presentation.compose.common.scholarship.GranteeItem (GranteeItem.kt:38)");
                    }
                    if (z6) {
                        jM4253getTransparent0d7_KjU = ColorKt.Color(4294942720L);
                    } else {
                        jM4253getTransparent0d7_KjU = Color.INSTANCE.m4253getTransparent0d7_KjU();
                    }
                    long j = jM4253getTransparent0d7_KjU;
                    if (z6) {
                        jM4255getWhite0d7_KjU = ColorKt.Color(4294965473L);
                    } else {
                        jM4255getWhite0d7_KjU = Color.INSTANCE.m4255getWhite0d7_KjU();
                    }
                    composerStartRestartGroup = composerStartRestartGroup;
                    CardKt.Card(PaddingKt.m1004paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6935constructorimpl(8.0f), 0.0f, 2, null), null, null, CardDefaults.INSTANCE.m1819cardElevationaqJV_2Y(Dp.m6935constructorimpl(8.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (CardDefaults.$stable << 18) | 6, 62), BorderStrokeKt.m584BorderStrokecXLIe8U(Dp.m6935constructorimpl(1.0f), j), ComposableLambdaKt.rememberComposableLambda(1639082632, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(z5, jM4255getWhite0d7_KjU, function0, function2, z6, Color.INSTANCE.m4248getGray0d7_KjU(), str, str2), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z7 = z5;
                    z8 = z6;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    z8 = z4;
                    z7 = z3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getResourcesInternal
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            String str3 = str;
                            String str4 = str2;
                            Function0 function1 = function0;
                            Function2 function3 = function2;
                            boolean z9 = z7;
                            boolean z10 = z8;
                            int i7 = i;
                            onActionViewCollapsed.TuitionPaymentFragmentbindingInflater1(str3, str4, function1, function3, z9, z10, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i7 | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z4 = z2;
            if ((74899 & i3) == 74898) {
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z3;
                }
                if (i4 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1901673274, i3, -1, "com.bpjstku.presentation.compose.common.scholarship.GranteeItem (GranteeItem.kt:38)");
                }
                if (z6) {
                    jM4253getTransparent0d7_KjU = ColorKt.Color(4294942720L);
                } else {
                    jM4253getTransparent0d7_KjU = Color.INSTANCE.m4253getTransparent0d7_KjU();
                }
                long j2 = jM4253getTransparent0d7_KjU;
                if (z6) {
                    jM4255getWhite0d7_KjU = ColorKt.Color(4294965473L);
                } else {
                    jM4255getWhite0d7_KjU = Color.INSTANCE.m4255getWhite0d7_KjU();
                }
                composerStartRestartGroup = composerStartRestartGroup;
                CardKt.Card(PaddingKt.m1004paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6935constructorimpl(8.0f), 0.0f, 2, null), null, null, CardDefaults.INSTANCE.m1819cardElevationaqJV_2Y(Dp.m6935constructorimpl(8.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (CardDefaults.$stable << 18) | 6, 62), BorderStrokeKt.m584BorderStrokecXLIe8U(Dp.m6935constructorimpl(1.0f), j2), ComposableLambdaKt.rememberComposableLambda(1639082632, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(z5, jM4255getWhite0d7_KjU, function0, function2, z6, Color.INSTANCE.m4248getGray0d7_KjU(), str, str2), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z7 = z5;
                z8 = z6;
            } else {
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z3;
                }
                if (i4 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1901673274, i3, -1, "com.bpjstku.presentation.compose.common.scholarship.GranteeItem (GranteeItem.kt:38)");
                }
                if (z6) {
                    jM4253getTransparent0d7_KjU = ColorKt.Color(4294942720L);
                } else {
                    jM4253getTransparent0d7_KjU = Color.INSTANCE.m4253getTransparent0d7_KjU();
                }
                long j3 = jM4253getTransparent0d7_KjU;
                if (z6) {
                    jM4255getWhite0d7_KjU = ColorKt.Color(4294965473L);
                } else {
                    jM4255getWhite0d7_KjU = Color.INSTANCE.m4255getWhite0d7_KjU();
                }
                composerStartRestartGroup = composerStartRestartGroup;
                CardKt.Card(PaddingKt.m1004paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6935constructorimpl(8.0f), 0.0f, 2, null), null, null, CardDefaults.INSTANCE.m1819cardElevationaqJV_2Y(Dp.m6935constructorimpl(8.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (CardDefaults.$stable << 18) | 6, 62), BorderStrokeKt.m584BorderStrokecXLIe8U(Dp.m6935constructorimpl(1.0f), j3), ComposableLambdaKt.rememberComposableLambda(1639082632, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(z5, jM4255getWhite0d7_KjU, function0, function2, z6, Color.INSTANCE.m4248getGray0d7_KjU(), str, str2), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z7 = z5;
                z8 = z6;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getResourcesInternal
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        String str3 = str;
                        String str4 = str2;
                        Function0 function1 = function0;
                        Function2 function3 = function2;
                        boolean z9 = z7;
                        boolean z10 = z8;
                        int i7 = i;
                        onActionViewCollapsed.TuitionPaymentFragmentbindingInflater1(str3, str4, function1, function3, z9, z10, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i7 | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= 24576;
        z3 = z;
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                z4 = z2;
                if (composerStartRestartGroup.changed(z4)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            if ((74899 & i3) == 74898) {
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z3;
                }
                if (i4 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1901673274, i3, -1, "com.bpjstku.presentation.compose.common.scholarship.GranteeItem (GranteeItem.kt:38)");
                }
                if (z6) {
                    jM4253getTransparent0d7_KjU = ColorKt.Color(4294942720L);
                } else {
                    jM4253getTransparent0d7_KjU = Color.INSTANCE.m4253getTransparent0d7_KjU();
                }
                long j4 = jM4253getTransparent0d7_KjU;
                if (z6) {
                    jM4255getWhite0d7_KjU = ColorKt.Color(4294965473L);
                } else {
                    jM4255getWhite0d7_KjU = Color.INSTANCE.m4255getWhite0d7_KjU();
                }
                composerStartRestartGroup = composerStartRestartGroup;
                CardKt.Card(PaddingKt.m1004paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6935constructorimpl(8.0f), 0.0f, 2, null), null, null, CardDefaults.INSTANCE.m1819cardElevationaqJV_2Y(Dp.m6935constructorimpl(8.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (CardDefaults.$stable << 18) | 6, 62), BorderStrokeKt.m584BorderStrokecXLIe8U(Dp.m6935constructorimpl(1.0f), j4), ComposableLambdaKt.rememberComposableLambda(1639082632, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(z5, jM4255getWhite0d7_KjU, function0, function2, z6, Color.INSTANCE.m4248getGray0d7_KjU(), str, str2), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z7 = z5;
                z8 = z6;
            } else {
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = z3;
                }
                if (i4 != 0) {
                    z6 = false;
                } else {
                    z6 = z4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1901673274, i3, -1, "com.bpjstku.presentation.compose.common.scholarship.GranteeItem (GranteeItem.kt:38)");
                }
                if (z6) {
                    jM4253getTransparent0d7_KjU = ColorKt.Color(4294942720L);
                } else {
                    jM4253getTransparent0d7_KjU = Color.INSTANCE.m4253getTransparent0d7_KjU();
                }
                long j5 = jM4253getTransparent0d7_KjU;
                if (z6) {
                    jM4255getWhite0d7_KjU = ColorKt.Color(4294965473L);
                } else {
                    jM4255getWhite0d7_KjU = Color.INSTANCE.m4255getWhite0d7_KjU();
                }
                composerStartRestartGroup = composerStartRestartGroup;
                CardKt.Card(PaddingKt.m1004paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6935constructorimpl(8.0f), 0.0f, 2, null), null, null, CardDefaults.INSTANCE.m1819cardElevationaqJV_2Y(Dp.m6935constructorimpl(8.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (CardDefaults.$stable << 18) | 6, 62), BorderStrokeKt.m584BorderStrokecXLIe8U(Dp.m6935constructorimpl(1.0f), j5), ComposableLambdaKt.rememberComposableLambda(1639082632, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(z5, jM4255getWhite0d7_KjU, function0, function2, z6, Color.INSTANCE.m4248getGray0d7_KjU(), str, str2), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z7 = z5;
                z8 = z6;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getResourcesInternal
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        String str3 = str;
                        String str4 = str2;
                        Function0 function1 = function0;
                        Function2 function3 = function2;
                        boolean z9 = z7;
                        boolean z10 = z8;
                        int i7 = i;
                        onActionViewCollapsed.TuitionPaymentFragmentbindingInflater1(str3, str4, function1, function3, z9, z10, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i7 | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        z4 = z2;
        if ((74899 & i3) == 74898) {
            if (i6 != 0) {
                z5 = true;
            } else {
                z5 = z3;
            }
            if (i4 != 0) {
                z6 = false;
            } else {
                z6 = z4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1901673274, i3, -1, "com.bpjstku.presentation.compose.common.scholarship.GranteeItem (GranteeItem.kt:38)");
            }
            if (z6) {
                jM4253getTransparent0d7_KjU = ColorKt.Color(4294942720L);
            } else {
                jM4253getTransparent0d7_KjU = Color.INSTANCE.m4253getTransparent0d7_KjU();
            }
            long j6 = jM4253getTransparent0d7_KjU;
            if (z6) {
                jM4255getWhite0d7_KjU = ColorKt.Color(4294965473L);
            } else {
                jM4255getWhite0d7_KjU = Color.INSTANCE.m4255getWhite0d7_KjU();
            }
            composerStartRestartGroup = composerStartRestartGroup;
            CardKt.Card(PaddingKt.m1004paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6935constructorimpl(8.0f), 0.0f, 2, null), null, null, CardDefaults.INSTANCE.m1819cardElevationaqJV_2Y(Dp.m6935constructorimpl(8.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (CardDefaults.$stable << 18) | 6, 62), BorderStrokeKt.m584BorderStrokecXLIe8U(Dp.m6935constructorimpl(1.0f), j6), ComposableLambdaKt.rememberComposableLambda(1639082632, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(z5, jM4255getWhite0d7_KjU, function0, function2, z6, Color.INSTANCE.m4248getGray0d7_KjU(), str, str2), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z7 = z5;
            z8 = z6;
        } else {
            if (i6 != 0) {
                z5 = true;
            } else {
                z5 = z3;
            }
            if (i4 != 0) {
                z6 = false;
            } else {
                z6 = z4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1901673274, i3, -1, "com.bpjstku.presentation.compose.common.scholarship.GranteeItem (GranteeItem.kt:38)");
            }
            if (z6) {
                jM4253getTransparent0d7_KjU = ColorKt.Color(4294942720L);
            } else {
                jM4253getTransparent0d7_KjU = Color.INSTANCE.m4253getTransparent0d7_KjU();
            }
            long j7 = jM4253getTransparent0d7_KjU;
            if (z6) {
                jM4255getWhite0d7_KjU = ColorKt.Color(4294965473L);
            } else {
                jM4255getWhite0d7_KjU = Color.INSTANCE.m4255getWhite0d7_KjU();
            }
            composerStartRestartGroup = composerStartRestartGroup;
            CardKt.Card(PaddingKt.m1004paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6935constructorimpl(8.0f), 0.0f, 2, null), null, null, CardDefaults.INSTANCE.m1819cardElevationaqJV_2Y(Dp.m6935constructorimpl(8.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (CardDefaults.$stable << 18) | 6, 62), BorderStrokeKt.m584BorderStrokecXLIe8U(Dp.m6935constructorimpl(1.0f), j7), ComposableLambdaKt.rememberComposableLambda(1639082632, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(z5, jM4255getWhite0d7_KjU, function0, function2, z6, Color.INSTANCE.m4248getGray0d7_KjU(), str, str2), composerStartRestartGroup, 54), composerStartRestartGroup, 196614, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z7 = z5;
            z8 = z6;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getResourcesInternal
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String str3 = str;
                    String str4 = str2;
                    Function0 function1 = function0;
                    Function2 function3 = function2;
                    boolean z9 = z7;
                    boolean z10 = z8;
                    int i7 = i;
                    onActionViewCollapsed.TuitionPaymentFragmentbindingInflater1(str3, str4, function1, function3, z9, z10, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i7 | 1), i2);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Function3<ColumnScope, Composer, Integer, Unit> {
        private /* synthetic */ Function0<Unit> TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ long TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ boolean f1294a;
        private /* synthetic */ long asBinder;
        private /* synthetic */ Function2<Composer, Integer, Unit> asInterface;
        private /* synthetic */ String b;

        @Override // kotlin.jvm.functions.Function3
        public final /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(columnScope, "");
            if ((iIntValue & 17) != 16 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1639082632, iIntValue, -1, "com.bpjstku.presentation.compose.common.scholarship.GranteeItem.<anonymous> (GranteeItem.kt:49)");
                }
                Modifier modifierM557backgroundbw27NRU$default = BackgroundKt.m557backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(12.0f))), !this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 ? Color.INSTANCE.m4250getLightGray0d7_KjU() : this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, null, 2, null);
                boolean z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                composer2.startReplaceGroup(2084981000);
                boolean zChanged = composer2.changed(this.TuitionPaymentFragmentbindingInflater1);
                final Function0<Unit> function0 = this.TuitionPaymentFragmentbindingInflater1;
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: getAssets
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return onActionViewCollapsed.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(function0);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                Modifier modifierM1006paddingqDBjuR0$default = PaddingKt.m1006paddingqDBjuR0$default(PaddingKt.m1004paddingVpY3zN4$default(PaddingKt.m1002padding3ABfNKs(ClickableKt.m590clickableXHw0xAI$default(modifierM557backgroundbw27NRU$default, z, null, null, (Function0) objRememberedValue, 6, null), Dp.m6935constructorimpl(12.0f)), 0.0f, Dp.m6935constructorimpl(6.0f), 1, null), Dp.m6935constructorimpl(12.0f), 0.0f, 0.0f, 0.0f, 14, null);
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Function2<Composer, Integer, Unit> function2 = this.asInterface;
                boolean z2 = this.f1294a;
                long j = this.asBinder;
                String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                String str2 = this.b;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1006paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
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
                Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3543setimpl(composerM3536constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                Modifier modifierWeight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composerM3536constructorimpl2 = Updater.m3536constructorimpl(composer2);
                Updater.m3543setimpl(composerM3536constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3543setimpl(composerM3536constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3536constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM3536constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3536constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3543setimpl(composerM3536constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                TextKt.m2654Text4IGK_g(str, (Modifier) null, z2 ? j : Color.INSTANCE.m4244getBlack0d7_KjU(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.poppins_semibold, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 1575936, 0, 130994);
                SpacerKt.Spacer(SizeKt.m1033height3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(4.0f)), composer2, 6);
                TextKt.m2654Text4IGK_g(str2, (Modifier) null, !z2 ? Color.INSTANCE.m4254getUnspecified0d7_KjU() : j, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 1575936, 0, 130994);
                composer2.endNode();
                function2.invoke(composer2, 0);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer2.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        TuitionPaymentFragmentspecialinlinedviewModeldefault2(boolean z, long j, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, boolean z2, long j2, String str, String str2) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = z;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
            this.TuitionPaymentFragmentbindingInflater1 = function0;
            this.asInterface = function2;
            this.f1294a = z2;
            this.asBinder = j2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
            this.b = str2;
        }
    }
}
