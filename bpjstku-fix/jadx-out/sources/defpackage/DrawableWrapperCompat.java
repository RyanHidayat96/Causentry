package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
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
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CheckboxDefaults;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import androidx.view.compose.ManagedActivityResultLauncher;
import com.bpjstku.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class DrawableWrapperCompat {
    /* JADX WARN: Code duplicated, block: B:126:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final String str, final String str2, final String str3, final Function0<Unit> function0, final String str4, final Function0<Unit> function1, final String str5, boolean z, final Function0<Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        final boolean z2;
        Composer composer2;
        final boolean z3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-104225348);
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
            i3 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(str4) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
        }
        if ((i2 & 64) != 0) {
            i3 |= 1572864;
        } else if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changed(str5) ? 1048576 : 524288;
        }
        int i4 = i2 & 128;
        if (i4 != 0) {
            i3 |= 12582912;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 12582912) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
            }
        }
        if ((i2 & 256) != 0) {
            i3 |= 100663296;
        } else if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((38347923 & i3) != 38347922 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                z2 = true;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-104225348, i3, -1, "com.bpjstku.presentation.compose.common.CustomBottomDialog (CustomBottomDialog.kt:61)");
            }
            composerStartRestartGroup.startReplaceGroup(-1975026867);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1975024441);
            boolean z4 = (29360128 & i3) == 8388608;
            boolean z5 = (i3 & 234881024) == 67108864;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if ((z4 | z5) || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: setLayoutDirection
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean z6 = z2;
                        Function0 function3 = function2;
                        if (z6) {
                            function3.invoke();
                        }
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            boolean z6 = z2;
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog((Function0) objRememberedValue2, null, ComposableLambdaKt.rememberComposableLambda(1467173907, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(str, str2, mutableState, str5, function1, function0, str4, str3), composer2, 54), composer2, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                z3 = z6;
            } else {
                z2 = z6;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: setVariablePadding
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        String str6 = str;
                        String str7 = str2;
                        String str8 = str3;
                        Function0 function3 = function0;
                        String str9 = str4;
                        Function0 function4 = function1;
                        String str10 = str5;
                        boolean z7 = z3;
                        Function0 function5 = function2;
                        int i5 = i;
                        DrawableWrapperCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str6, str7, str8, function3, str9, function4, str10, z7, function5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i5 | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        composerStartRestartGroup.skipToGroupEnd();
        composer2 = composerStartRestartGroup;
        z3 = z2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: setVariablePadding
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String str6 = str;
                    String str7 = str2;
                    String str8 = str3;
                    Function0 function3 = function0;
                    String str9 = str4;
                    Function0 function4 = function1;
                    String str10 = str5;
                    boolean z7 = z3;
                    Function0 function5 = function2;
                    int i5 = i;
                    DrawableWrapperCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str6, str7, str8, function3, str9, function4, str10, z7, function5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i5 | 1), i2);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Function2<Composer, Integer, Unit> {
        private /* synthetic */ MutableState<Boolean> TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ Function0<Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ String f127a;
        private /* synthetic */ String asInterface;
        private /* synthetic */ Function0<Unit> b;
        private /* synthetic */ String g;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 3) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1467173907, iIntValue, -1, "com.bpjstku.presentation.compose.common.CustomBottomDialog.<anonymous> (CustomBottomDialog.kt:69)");
                }
                SurfaceKt.m2506SurfaceT9BRK9s(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(12.0f)), Color.INSTANCE.m4255getWhite0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-767421074, true, new AnonymousClass3(this.g, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, this.TuitionPaymentFragmentbindingInflater1, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, this.b, this.asInterface, this.f127a), composer2, 54), composer2, 12583302, 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer2.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: DrawableWrapperCompat$TuitionPaymentFragmentspecialinlinedviewModeldefault3$3, reason: invalid class name */
        static final class AnonymousClass3 implements Function2<Composer, Integer, Unit> {
            private /* synthetic */ Function0<Unit> TuitionPaymentFragmentbindingInflater1;
            private /* synthetic */ Function0<Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private /* synthetic */ String f128a;
            private /* synthetic */ MutableState<Boolean> b;
            private /* synthetic */ String d;
            private /* synthetic */ String g;

            @Override // kotlin.jvm.functions.Function2
            public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
                final MutableState<Boolean> mutableState;
                Composer composer2 = composer;
                int iIntValue = num.intValue();
                if ((iIntValue & 3) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-767421074, iIntValue, -1, "com.bpjstku.presentation.compose.common.CustomBottomDialog.<anonymous>.<anonymous> (CustomBottomDialog.kt:74)");
                    }
                    Modifier modifierM1003paddingVpY3zN4 = PaddingKt.m1003paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6935constructorimpl(20.0f), Dp.m6935constructorimpl(16.0f));
                    String str = this.d;
                    String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    MutableState<Boolean> mutableState2 = this.b;
                    String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    final Function0<Unit> function0 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    final Function0<Unit> function1 = this.TuitionPaymentFragmentbindingInflater1;
                    String str4 = this.g;
                    String str5 = this.f128a;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1003paddingVpY3zN4);
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
                    Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3543setimpl(composerM3536constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    FontWeight bold = FontWeight.INSTANCE.getBold();
                    long sp = TextUnitKt.getSp(20);
                    TextKt.m2654Text4IGK_g(str, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ColorKt.Color(4280427042L), sp, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6812boximpl(TextAlign.INSTANCE.m6819getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 200112, 0, 130512);
                    SpacerKt.Spacer(SizeKt.m1033height3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(16.0f)), composer2, 6);
                    Modifier modifierM1002padding3ABfNKs = PaddingKt.m1002padding3ABfNKs(ScrollKt.verticalScroll$default(SizeKt.m1034heightInVpY3zN4(SizeKt.fillMaxWidth$default(BackgroundKt.m556backgroundbw27NRU(Modifier.INSTANCE, ColorKt.Color(4294309365L), RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(8.0f))), 0.0f, 1, null), Dp.m6935constructorimpl(120.0f), Dp.m6935constructorimpl(260.0f)), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null), Dp.m6935constructorimpl(12.0f));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM1002padding3ABfNKs);
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
                    Updater.m3543setimpl(composerM3536constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3543setimpl(composerM3536constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3536constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM3536constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM3536constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m3543setimpl(composerM3536constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    TextKt.m2654Text4IGK_g(str2, (Modifier) null, ColorKt.Color(4281545523L), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(18), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3456, 6, 130034);
                    composer2.endNode();
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m1006paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6935constructorimpl(16.0f), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
                    composer2.startReplaceGroup(2023030178);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        mutableState = mutableState2;
                        objRememberedValue = new Function0() { // from class: setDrawable
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DrawableWrapperCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(mutableState);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    } else {
                        mutableState = mutableState2;
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierM590clickableXHw0xAI$default = ClickableKt.m590clickableXHw0xAI$default(modifierFillMaxWidth$default, false, null, null, (Function0) objRememberedValue, 7, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer2, 48);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM590clickableXHw0xAI$default);
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3536constructorimpl3 = Updater.m3536constructorimpl(composer2);
                    Updater.m3543setimpl(composerM3536constructorimpl3, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3543setimpl(composerM3536constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3536constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM3536constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM3536constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m3543setimpl(composerM3536constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    MutableState<Boolean> mutableState3 = mutableState;
                    boolean zBooleanValue = mutableState3.getValue().booleanValue();
                    composer2.startReplaceGroup(-690438407);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: DrawerArrowDrawable
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return DrawableWrapperCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(mutableState, ((Boolean) obj).booleanValue());
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    CheckboxKt.Checkbox(zBooleanValue, (Function1) objRememberedValue2, null, false, CheckboxDefaults.INSTANCE.m1845colors5tl4gsc(ColorKt.Color(4278233220L), Color.INSTANCE.m4248getGray0d7_KjU(), 0L, 0L, 0L, 0L, composer2, (CheckboxDefaults.$stable << 18) | 54, 60), null, composer2, 48, 44);
                    SpacerKt.Spacer(SizeKt.m1052width3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(8.0f)), composer2, 6);
                    TextKt.m2654Text4IGK_g(str3, (Modifier) null, ColorKt.Color(4282664004L), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(18), 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3456, 6, 130034);
                    composer2.endNode();
                    SpacerKt.Spacer(SizeKt.m1033height3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(16.0f)), composer2, 6);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m882spacedBy0680j_4(Dp.m6935constructorimpl(12.0f)), Alignment.INSTANCE.getTop(), composer2, 6);
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3536constructorimpl4 = Updater.m3536constructorimpl(composer2);
                    Updater.m3543setimpl(composerM3536constructorimpl4, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3543setimpl(composerM3536constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM3536constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM3536constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM3536constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m3543setimpl(composerM3536constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    Modifier modifierWeight$default = RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null);
                    BorderStroke borderStrokeM584BorderStrokecXLIe8U = BorderStrokeKt.m584BorderStrokecXLIe8U(Dp.m6935constructorimpl(1.0f), ColorKt.Color(4291611852L));
                    ButtonColors buttonColorsM1807outlinedButtonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1807outlinedButtonColorsro_MJ88(0L, ColorKt.Color(4284900966L), 0L, 0L, composer2, (ButtonDefaults.$stable << 12) | 48, 13);
                    RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(10.0f));
                    composer2.startReplaceGroup(-690410339);
                    boolean zChanged = composer2.changed(function0);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: getColor
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DrawableWrapperCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass3.TuitionPaymentFragmentbindingInflater1(function0);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceGroup();
                    ButtonKt.OutlinedButton((Function0) objRememberedValue3, modifierWeight$default, false, roundedCornerShapeM1285RoundedCornerShape0680j_4, buttonColorsM1807outlinedButtonColorsro_MJ88, null, borderStrokeM584BorderStrokecXLIe8U, null, null, ComposableLambdaKt.rememberComposableLambda(1644959243, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(str4), composer2, 54), composer2, 806879232, TypedValues.CycleType.TYPE_EASING);
                    boolean zBooleanValue2 = mutableState3.getValue().booleanValue();
                    Modifier modifierWeight$default2 = RowScope.weight$default(rowScopeInstance2, Modifier.INSTANCE, 1.0f, false, 2, null);
                    ButtonColors buttonColorsM1797buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1797buttonColorsro_MJ88(ColorResources_androidKt.colorResource(R.color.selector_default_button, composer2, 6), ColorResources_androidKt.colorResource(R.color.colorWhite, composer2, 6), 0L, 0L, composer2, ButtonDefaults.$stable << 12, 12);
                    RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(10.0f));
                    composer2.startReplaceGroup(-690389765);
                    boolean zChanged2 = composer2.changed(function1);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: getArrowHeadLength
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DrawableWrapperCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3.AnonymousClass3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceGroup();
                    ButtonKt.Button((Function0) objRememberedValue4, modifierWeight$default2, zBooleanValue2, roundedCornerShapeM1285RoundedCornerShape0680j_5, buttonColorsM1797buttonColorsro_MJ88, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(2039544781, true, new b(str5), composer2, 54), composer2, 805306368, 480);
                    composer2.endNode();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: DrawableWrapperCompat$TuitionPaymentFragmentspecialinlinedviewModeldefault3$3$TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
            static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Function3<RowScope, Composer, Integer, Unit> {
                private /* synthetic */ String b;

                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
                    Composer composer2 = composer;
                    int iIntValue = num.intValue();
                    Intrinsics.checkNotNullParameter(rowScope, "");
                    if ((iIntValue & 17) != 16 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1644959243, iIntValue, -1, "com.bpjstku.presentation.compose.common.CustomBottomDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CustomBottomDialog.kt:150)");
                        }
                        FontWeight bold = FontWeight.INSTANCE.getBold();
                        TextKt.m2654Text4IGK_g(this.b, (Modifier) null, 0L, TextUnitKt.getSp(16), (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 199680, 0, 131030);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }

                TuitionPaymentFragmentspecialinlinedviewModeldefault2(String str) {
                    this.b = str;
                }
            }

            /* JADX INFO: renamed from: DrawableWrapperCompat$TuitionPaymentFragmentspecialinlinedviewModeldefault3$3$b */
            static final class b implements Function3<RowScope, Composer, Integer, Unit> {
                private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

                @Override // kotlin.jvm.functions.Function3
                public final /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
                    Composer composer2 = composer;
                    int iIntValue = num.intValue();
                    Intrinsics.checkNotNullParameter(rowScope, "");
                    if ((iIntValue & 17) != 16 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2039544781, iIntValue, -1, "com.bpjstku.presentation.compose.common.CustomBottomDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CustomBottomDialog.kt:167)");
                        }
                        FontWeight bold = FontWeight.INSTANCE.getBold();
                        long sp = TextUnitKt.getSp(16);
                        TextKt.m2654Text4IGK_g(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Modifier) null, Color.INSTANCE.m4255getWhite0d7_KjU(), sp, (FontStyle) null, bold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 200064, 0, 131026);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer2.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }

                b(String str) {
                    this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
                }
            }

            public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(Function0 function0) {
                function0.invoke();
                return Unit.INSTANCE;
            }

            public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(MutableState mutableState) {
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                return Unit.INSTANCE;
            }

            public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function0 function0) {
                function0.invoke();
                return Unit.INSTANCE;
            }

            public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(MutableState mutableState, boolean z) {
                mutableState.setValue(Boolean.valueOf(z));
                return Unit.INSTANCE;
            }

            AnonymousClass3(String str, String str2, MutableState<Boolean> mutableState, String str3, Function0<Unit> function0, Function0<Unit> function1, String str4, String str5) {
                this.d = str;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str2;
                this.b = mutableState;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str3;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function0;
                this.TuitionPaymentFragmentbindingInflater1 = function1;
                this.g = str4;
                this.f128a = str5;
            }
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(String str, String str2, MutableState<Boolean> mutableState, String str3, Function0<Unit> function0, Function0<Unit> function1, String str4, String str5) {
            this.g = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str2;
            this.TuitionPaymentFragmentbindingInflater1 = mutableState;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str3;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function0;
            this.b = function1;
            this.asInterface = str4;
            this.f127a = str5;
        }
    }

    public static final void TuitionPaymentFragmentbindingInflater1(final boolean z, final Function0<Unit> function0, final Function1<? super Uri, Unit> function1, final ManagedActivityResultLauncher<Uri, Boolean> managedActivityResultLauncher, final ManagedActivityResultLauncher<String[], Uri> managedActivityResultLauncher2, final Function1<? super Context, ? extends Uri> function2, final Integer num, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(managedActivityResultLauncher, "");
        Intrinsics.checkNotNullParameter(managedActivityResultLauncher2, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-851394800);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(managedActivityResultLauncher) : composerStartRestartGroup.changedInstance(managedActivityResultLauncher) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(managedActivityResultLauncher2) : composerStartRestartGroup.changedInstance(managedActivityResultLauncher2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(num) ? 1048576 : 524288;
        }
        int i3 = i2;
        if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-851394800, i3, -1, "com.bpjstku.presentation.compose.common.ChangePhotoDialog (CustomBottomDialog.kt:205)");
            }
            if (!z) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getTransparentRegion
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            DrawableWrapperCompat.TuitionPaymentFragmentbindingInflater1(z, function0, function1, managedActivityResultLauncher, managedActivityResultLauncher2, function2, num, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                            return Unit.INSTANCE;
                        }
                    });
                    return;
                }
                return;
            }
            composer2 = composerStartRestartGroup;
            AndroidDialog_androidKt.Dialog(function0, null, ComposableLambdaKt.rememberComposableLambda(1539050727, true, new TuitionPaymentFragmentbindingInflater1(function0, function2, (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), function1, num, managedActivityResultLauncher, managedActivityResultLauncher2), composer2, 54), composer2, ((i3 >> 3) & 14) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: setFilterBitmap
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    DrawableWrapperCompat.TuitionPaymentFragmentbindingInflater1(z, function0, function1, managedActivityResultLauncher, managedActivityResultLauncher2, function2, num, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }

    static final class TuitionPaymentFragmentbindingInflater1 implements Function2<Composer, Integer, Unit> {
        private /* synthetic */ Function1<Context, Uri> TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ Context TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ ManagedActivityResultLauncher<Uri, Boolean> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ Integer TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private /* synthetic */ Function0<Unit> asBinder;
        private /* synthetic */ ManagedActivityResultLauncher<String[], Uri> b;
        private /* synthetic */ Function1<Uri, Unit> g;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 3) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1539050727, iIntValue, -1, "com.bpjstku.presentation.compose.common.ChangePhotoDialog.<anonymous> (CustomBottomDialog.kt:211)");
                }
                Modifier modifierM1002padding3ABfNKs = PaddingKt.m1002padding3ABfNKs(BackgroundKt.m556backgroundbw27NRU(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m4255getWhite0d7_KjU(), RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(16.0f))), Dp.m6935constructorimpl(25.0f));
                final Function0<Unit> function0 = this.asBinder;
                final Function1<Context, Uri> function1 = this.TuitionPaymentFragmentbindingInflater1;
                final Context context = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                final Function1<Uri, Unit> function2 = this.g;
                final Integer num2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                final ManagedActivityResultLauncher<Uri, Boolean> managedActivityResultLauncher = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                final ManagedActivityResultLauncher<String[], Uri> managedActivityResultLauncher2 = this.b;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1002padding3ABfNKs);
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
                Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3543setimpl(composerM3536constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                FontWeight semiBold = FontWeight.INSTANCE.getSemiBold();
                TextKt.m2654Text4IGK_g("Pilih Sumber Foto", (Modifier) null, Color.INSTANCE.m4244getBlack0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, semiBold, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 200070, 0, 131026);
                SpacerKt.Spacer(SizeKt.m1033height3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(12.0f)), composer2, 6);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.m882spacedBy0680j_4(Dp.m6935constructorimpl(14.0f)), Alignment.INSTANCE.getTop(), composer2, 6);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxWidth$default);
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
                Updater.m3543setimpl(composerM3536constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3543setimpl(composerM3536constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3536constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM3536constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3536constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3543setimpl(composerM3536constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                Modifier.Companion companion = Modifier.INSTANCE;
                composer2.startReplaceGroup(97436720);
                boolean zChanged = composer2.changed(function1);
                boolean zChangedInstance = composer2.changedInstance(context);
                boolean zChanged2 = composer2.changed(function2);
                boolean zChanged3 = composer2.changed(num2);
                boolean zChangedInstance2 = composer2.changedInstance(managedActivityResultLauncher);
                boolean zChanged4 = composer2.changed(function0);
                Object objRememberedValue = composer2.rememberedValue();
                if ((zChanged | zChangedInstance | zChanged2 | zChanged3 | zChangedInstance2 | zChanged4) || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: lerp
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DrawableWrapperCompat.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(function1, context, function2, num2, function0, managedActivityResultLauncher);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                Modifier modifierM590clickableXHw0xAI$default = ClickableKt.m590clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM590clickableXHw0xAI$default);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM3536constructorimpl3 = Updater.m3536constructorimpl(composer2);
                Updater.m3543setimpl(composerM3536constructorimpl3, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3543setimpl(composerM3536constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3536constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM3536constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM3536constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m3543setimpl(composerM3536constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                Modifier modifierM568borderxT4_qwU = BorderKt.m568borderxT4_qwU(SizeKt.m1047size3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(68.0f)), Dp.m6935constructorimpl(1.0f), Color.INSTANCE.m4250getLightGray0d7_KjU(), RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(8.0f)));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierM568borderxT4_qwU);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor4);
                } else {
                    composer2.useNode();
                }
                Composer composerM3536constructorimpl4 = Updater.m3536constructorimpl(composer2);
                Updater.m3543setimpl(composerM3536constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3543setimpl(composerM3536constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3536constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM3536constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM3536constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m3543setimpl(composerM3536constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                IconKt.m2127Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_camera_source, composer2, 6), (String) null, SizeKt.m1047size3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(28.0f)), Color.INSTANCE.m4247getDarkGray0d7_KjU(), composer2, 3504, 0);
                composer2.endNode();
                SpacerKt.Spacer(SizeKt.m1033height3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(4.0f)), composer2, 6);
                TextKt.m2654Text4IGK_g("Ambil Foto", (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6812boximpl(TextAlign.INSTANCE.m6819getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3078, 0, 130550);
                composer2.endNode();
                Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                composer2.startReplaceGroup(97473804);
                boolean zChanged5 = composer2.changed(num2);
                boolean zChangedInstance3 = composer2.changedInstance(managedActivityResultLauncher2);
                boolean zChanged6 = composer2.changed(function0);
                Object objRememberedValue2 = composer2.rememberedValue();
                if ((zChanged5 | zChangedInstance3 | zChanged6) || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: setChangingConfigurations
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DrawableWrapperCompat.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(num2, function0, managedActivityResultLauncher2);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                Modifier modifierM590clickableXHw0xAI$default2 = ClickableKt.m590clickableXHw0xAI$default(companion2, false, null, null, (Function0) objRememberedValue2, 7, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, composer2, 48);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierM590clickableXHw0xAI$default2);
                Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor5);
                } else {
                    composer2.useNode();
                }
                Composer composerM3536constructorimpl5 = Updater.m3536constructorimpl(composer2);
                Updater.m3543setimpl(composerM3536constructorimpl5, measurePolicyColumnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3543setimpl(composerM3536constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3536constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    composerM3536constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    composerM3536constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                Updater.m3543setimpl(composerM3536constructorimpl5, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                Modifier modifierM568borderxT4_qwU2 = BorderKt.m568borderxT4_qwU(SizeKt.m1047size3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(68.0f)), Dp.m6935constructorimpl(1.0f), Color.INSTANCE.m4250getLightGray0d7_KjU(), RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(8.0f)));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer2, modifierM568borderxT4_qwU2);
                Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor6);
                } else {
                    composer2.useNode();
                }
                Composer composerM3536constructorimpl6 = Updater.m3536constructorimpl(composer2);
                Updater.m3543setimpl(composerM3536constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3543setimpl(composerM3536constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3536constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    composerM3536constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                    composerM3536constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                }
                Updater.m3543setimpl(composerM3536constructorimpl6, modifierMaterializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                IconKt.m2127Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_photo, composer2, 6), (String) null, SizeKt.m1047size3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(28.0f)), Color.INSTANCE.m4247getDarkGray0d7_KjU(), composer2, 3504, 0);
                composer2.endNode();
                SpacerKt.Spacer(SizeKt.m1033height3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(4.0f)), composer2, 6);
                TextKt.m2654Text4IGK_g("Upload Dokumen", (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6812boximpl(TextAlign.INSTANCE.m6819getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3078, 0, 130550);
                composer2.endNode();
                composer2.endNode();
                SpacerKt.Spacer(SizeKt.m1033height3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(28.0f)), composer2, 6);
                BorderStroke borderStrokeM584BorderStrokecXLIe8U = BorderStrokeKt.m584BorderStrokecXLIe8U(Dp.m6935constructorimpl(1.0f), ColorKt.Color(4294927175L));
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                getExitFadeDuration getexitfadeduration = getExitFadeDuration.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                ButtonKt.OutlinedButton(function0, modifierFillMaxWidth$default2, false, null, null, null, borderStrokeM584BorderStrokecXLIe8U, null, null, getExitFadeDuration.b(), composer2, 806879280, 444);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer2.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(Integer num, Function0 function0, ManagedActivityResultLauncher managedActivityResultLauncher) {
            if (num != null) {
                managedActivityResultLauncher.launch(new String[]{"image/*", "application/pdf"});
            }
            function0.invoke();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1, Context context, Function1 function2, Integer num, Function0 function0, ManagedActivityResultLauncher managedActivityResultLauncher) {
            Uri uri = (Uri) function1.invoke(context);
            function2.invoke(uri);
            if (num != null) {
                managedActivityResultLauncher.launch(uri);
            }
            function0.invoke();
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        TuitionPaymentFragmentbindingInflater1(Function0<Unit> function0, Function1<? super Context, ? extends Uri> function1, Context context, Function1<? super Uri, Unit> function2, Integer num, ManagedActivityResultLauncher<Uri, Boolean> managedActivityResultLauncher, ManagedActivityResultLauncher<String[], Uri> managedActivityResultLauncher2) {
            this.asBinder = function0;
            this.TuitionPaymentFragmentbindingInflater1 = function1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = context;
            this.g = function2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = num;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = managedActivityResultLauncher;
            this.b = managedActivityResultLauncher2;
        }
    }
}
