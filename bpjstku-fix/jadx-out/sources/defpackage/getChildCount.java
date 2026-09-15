package defpackage;

import android.content.Context;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SurfaceKt;
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
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
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
import androidx.compose.ui.window.AndroidDialog_androidKt;
import com.bpjstku.R;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class getChildCount {

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Function2<Composer, Integer, Unit> {
        private /* synthetic */ Function0<Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ Function0<Unit> b;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 3) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1397738188, iIntValue, -1, "com.bpjstku.presentation.compose.common.BiometricVerificationDialog.<anonymous> (BiometricVerificationGuide.kt:45)");
                }
                RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(12.0f));
                long jM4255getWhite0d7_KjU = Color.INSTANCE.m4255getWhite0d7_KjU();
                final Function0<Unit> function0 = this.b;
                final Function0<Unit> function1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                SurfaceKt.m2506SurfaceT9BRK9s(null, roundedCornerShapeM1285RoundedCornerShape0680j_4, jM4255getWhite0d7_KjU, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-202474929, true, new Function2<Composer, Integer, Unit>() { // from class: getChildCount.TuitionPaymentFragmentspecialinlinedviewModeldefault2.1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ Unit invoke(Composer composer3, Integer num2) {
                        Composer composer4 = composer3;
                        int iIntValue2 = num2.intValue();
                        if ((iIntValue2 & 3) != 2 || !composer4.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-202474929, iIntValue2, -1, "com.bpjstku.presentation.compose.common.BiometricVerificationDialog.<anonymous>.<anonymous> (BiometricVerificationGuide.kt:49)");
                            }
                            getChildCount.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function0, function1, composer4, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer4.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }, composer2, 54), composer2, 12583296, 121);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer2.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function0<Unit> function0, Function0<Unit> function1) {
            this.b = function0;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        }
    }

    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-995438563);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-995438563, i2, -1, "com.bpjstku.presentation.compose.common.BiometricVerificationDialog (BiometricVerificationGuide.kt:43)");
            }
            composerStartRestartGroup.startReplaceGroup(868065187);
            boolean z = (i2 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: getCapacity
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function0.invoke();
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, null, ComposableLambdaKt.rememberComposableLambda(-1397738188, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, function2), composerStartRestartGroup, 54), composerStartRestartGroup, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getChild
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    getChildCount.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function0, function1, function2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final Function0<Unit> function0, final Function0<Unit> function1, Composer composer, final int i) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(1285694747);
        int i2 = (i & 6) == 0 ? (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1285694747, i3, -1, "com.bpjstku.presentation.compose.common.BiometricVerificationGuide (BiometricVerificationGuide.kt:62)");
            }
            Modifier modifierM1003paddingVpY3zN4 = PaddingKt.m1003paddingVpY3zN4(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), Dp.m6935constructorimpl(0.0f), Dp.m6935constructorimpl(12.0f));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1003paddingVpY3zN4);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
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
            Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3543setimpl(composerM3536constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifierM1002padding3ABfNKs = PaddingKt.m1002padding3ABfNKs(BackgroundKt.m557backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(12.0f))), Color.INSTANCE.m4255getWhite0d7_KjU(), null, 2, null), Dp.m6935constructorimpl(16.0f));
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1002padding3ABfNKs);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
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
            Updater.m3543setimpl(composerM3536constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3543setimpl(composerM3536constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3536constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM3536constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM3536constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3543setimpl(composerM3536constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m2654Text4IGK_g("Panduan Verifikasi Wajah", (Modifier) null, Color.INSTANCE.m4244getBlack0d7_KjU(), TextUnitKt.getSp(20), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.poppins_medium, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 1576326, 0, 130994);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.bg_tutorial_verification_biometric, composerStartRestartGroup, 6), (String) null, SizeKt.m1047size3ABfNKs(PaddingKt.m1006paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6935constructorimpl(44.0f), 0.0f, 0.0f, 13, null), Dp.m6935constructorimpl(80.0f)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, 120);
            List listListOf = CollectionsKt.listOf((Object[]) new String[]{"Pastikan Posisi wajah berada dalam frame pada camera", "Pastikan Wajah tidak menggunakan masker dan kacamata", "Pastikan Pencahayaan Cukup agar wajah terlihat jelas", "Pastikan Wajah menghadap kehadapan camera handphone"});
            composerStartRestartGroup.startReplaceGroup(-795708024);
            int i4 = 0;
            for (Object obj : listListOf) {
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String str = (String) obj;
                Modifier modifierM1006paddingqDBjuR0$default = PaddingKt.m1006paddingqDBjuR0$default(PaddingKt.m1004paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6935constructorimpl(20.0f), 0.0f, 2, null), 0.0f, i4 == 0 ? Dp.m6935constructorimpl(20.0f) : Dp.m6935constructorimpl(5.0f), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 48);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1006paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
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
                Updater.m3543setimpl(composerM3536constructorimpl3, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3543setimpl(composerM3536constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3536constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM3536constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM3536constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m3543setimpl(composerM3536constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                IconKt.m2127Iconww6aTOc(ProcessingNodeExternalSyntheticLambda1.b(AppCompatResources.getDrawable((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), R.drawable.bg_point_green_circle), composerStartRestartGroup), (String) null, PaddingKt.m1006paddingqDBjuR0$default(SizeKt.m1047size3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(14.0f)), 0.0f, Dp.m6935constructorimpl(3.0f), 0.0f, 0.0f, 13, null), Color.INSTANCE.m4254getUnspecified0d7_KjU(), composerStartRestartGroup, 3504, 0);
                SpacerKt.Spacer(SizeKt.m1052width3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(14.0f)), composerStartRestartGroup, 6);
                TextKt.m2654Text4IGK_g(str, (Modifier) null, Color.INSTANCE.m4244getBlack0d7_KjU(), TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 1576320, 0, 130994);
                composerStartRestartGroup.endNode();
                i4++;
            }
            composerStartRestartGroup.endReplaceGroup();
            ButtonColors buttonColorsM1797buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1797buttonColorsro_MJ88(ColorResources_androidKt.colorResource(R.color.selector_default_button, composerStartRestartGroup, 6), Color.INSTANCE.m4255getWhite0d7_KjU(), 0L, 0L, composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 48, 12);
            Modifier modifierM1006paddingqDBjuR0$default2 = PaddingKt.m1006paddingqDBjuR0$default(PaddingKt.m1004paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6935constructorimpl(20.0f), 0.0f, 2, null), 0.0f, Dp.m6935constructorimpl(20.0f), 0.0f, 0.0f, 13, null);
            growArray growarray = growArray.b;
            ButtonKt.Button(function0, modifierM1006paddingqDBjuR0$default2, false, null, buttonColorsM1797buttonColorsro_MJ88, null, null, null, null, growArray.TuitionPaymentFragmentbindingInflater1(), composerStartRestartGroup, (i3 & 14) | 805306416, 492);
            Modifier modifierM1004paddingVpY3zN4$default = PaddingKt.m1004paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6935constructorimpl(20.0f), 0.0f, 2, null);
            composer2 = composerStartRestartGroup;
            ButtonColors buttonColorsM1808textButtonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1808textButtonColorsro_MJ88(0L, ColorResources_androidKt.colorResource(R.color.colorDarkMint, composerStartRestartGroup, 6), 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 13);
            growArray growarray2 = growArray.b;
            ButtonKt.TextButton(function1, modifierM1004paddingVpY3zN4$default, false, null, buttonColorsM1808textButtonColorsro_MJ88, null, null, null, null, growArray.b(), composer2, ((i3 >> 3) & 14) | 805306416, 492);
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: canConstantState
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    getChildCount.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function0, function1, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
