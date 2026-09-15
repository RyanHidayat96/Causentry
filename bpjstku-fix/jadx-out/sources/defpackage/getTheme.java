package defpackage;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
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
import androidx.compose.ui.window.AndroidDialog_androidKt;
import com.bpjstku.R;
import com.bpjstku.data.scholarship.model.response.BenefitInfo;
import com.bpjstku.data.scholarship.model.response.ScholarshipDataEligible;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class getTheme {
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Function2<Composer, Integer, Unit> {
        private /* synthetic */ Function0<Unit> TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ ScholarshipDataEligible TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 3) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1769428293, iIntValue, -1, "com.bpjstku.presentation.compose.common.scholarship.ScholarshipConfirmedDialog.<anonymous> (ScholarshipConfirmedDialog.kt:35)");
                }
                RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(16.0f));
                Modifier modifierM1002padding3ABfNKs = PaddingKt.m1002padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6935constructorimpl(16.0f));
                CardElevation cardElevationM1819cardElevationaqJV_2Y = CardDefaults.INSTANCE.m1819cardElevationaqJV_2Y(Dp.m6935constructorimpl(8.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer2, (CardDefaults.$stable << 18) | 6, 62);
                final ScholarshipDataEligible scholarshipDataEligible = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                final Function0<Unit> function0 = this.TuitionPaymentFragmentbindingInflater1;
                CardKt.Card(modifierM1002padding3ABfNKs, roundedCornerShapeM1285RoundedCornerShape0680j_4, null, cardElevationM1819cardElevationaqJV_2Y, null, ComposableLambdaKt.rememberComposableLambda(-971858679, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault2.4
                    @Override // kotlin.jvm.functions.Function3
                    public final /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num2) {
                        BenefitInfo benefitInfo;
                        BenefitInfo benefitInfo2;
                        BenefitInfo benefitInfo3;
                        BenefitInfo benefitInfo4;
                        BenefitInfo benefitInfo5;
                        BenefitInfo benefitInfo6;
                        BenefitInfo benefitInfo7;
                        Composer composer4 = composer3;
                        int iIntValue2 = num2.intValue();
                        Intrinsics.checkNotNullParameter(columnScope, "");
                        if ((iIntValue2 & 17) != 16 || !composer4.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-971858679, iIntValue2, -1, "com.bpjstku.presentation.compose.common.scholarship.ScholarshipConfirmedDialog.<anonymous>.<anonymous> (ScholarshipConfirmedDialog.kt:42)");
                            }
                            Modifier modifierM1002padding3ABfNKs2 = PaddingKt.m1002padding3ABfNKs(BackgroundKt.m557backgroundbw27NRU$default(Modifier.INSTANCE, Color.INSTANCE.m4255getWhite0d7_KjU(), null, 2, null), Dp.m6935constructorimpl(20.0f));
                            ScholarshipDataEligible scholarshipDataEligible2 = scholarshipDataEligible;
                            Function0<Unit> function1 = function0;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierM1002padding3ABfNKs2);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            if (!(composer4.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM3536constructorimpl = Updater.m3536constructorimpl(composer4);
                            Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m3543setimpl(composerM3536constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            Modifier modifierM1003paddingVpY3zN4 = PaddingKt.m1003paddingVpY3zN4(BackgroundKt.m556backgroundbw27NRU(ColumnScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getEnd()), ColorKt.Color(4294959234L), RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(8.0f))), Dp.m6935constructorimpl(8.0f), Dp.m6935constructorimpl(4.0f));
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer4, modifierM1003paddingVpY3zN4);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            if (!(composer4.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor2);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM3536constructorimpl2 = Updater.m3536constructorimpl(composer4);
                            Updater.m3543setimpl(composerM3536constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3543setimpl(composerM3536constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (composerM3536constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM3536constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM3536constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m3543setimpl(composerM3536constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            String status = (scholarshipDataEligible2 == null || (benefitInfo7 = scholarshipDataEligible2.getBenefitInfo()) == null) ? null : benefitInfo7.getStatus();
                            TextKt.m2654Text4IGK_g(status == null ? "" : status, (Modifier) null, ColorKt.Color(4286275584L), TextUnitKt.getSp(8), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.poppins_regular, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 1576320, 0, 130994);
                            composer4.endNode();
                            String name = scholarshipDataEligible2 != null ? scholarshipDataEligible2.getName() : null;
                            if (name == null) {
                                name = "";
                            }
                            getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Nama Anak", name, composer4, 6);
                            String educationLevel = (scholarshipDataEligible2 == null || (benefitInfo6 = scholarshipDataEligible2.getBenefitInfo()) == null) ? null : benefitInfo6.getEducationLevel();
                            if (educationLevel == null) {
                                educationLevel = "";
                            }
                            String gradeLevel = (scholarshipDataEligible2 == null || (benefitInfo5 = scholarshipDataEligible2.getBenefitInfo()) == null) ? null : benefitInfo5.getGradeLevel();
                            if (gradeLevel == null) {
                                gradeLevel = "";
                            }
                            StringBuilder sb = new StringBuilder();
                            sb.append(educationLevel);
                            sb.append(" / KELAS ");
                            sb.append(gradeLevel);
                            getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Pendidikan yang ditempuh", sb.toString(), composer4, 6);
                            String institution = (scholarshipDataEligible2 == null || (benefitInfo4 = scholarshipDataEligible2.getBenefitInfo()) == null) ? null : benefitInfo4.getInstitution();
                            if (institution == null) {
                                institution = "";
                            }
                            getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Lembaga Pendidikan", institution, composer4, 6);
                            String benefit = (scholarshipDataEligible2 == null || (benefitInfo3 = scholarshipDataEligible2.getBenefitInfo()) == null) ? null : benefitInfo3.getBenefit();
                            if (benefit == null) {
                                benefit = "";
                            }
                            getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Besar Manfaat", getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(benefit), composer4, 6);
                            String year = (scholarshipDataEligible2 == null || (benefitInfo2 = scholarshipDataEligible2.getBenefitInfo()) == null) ? null : benefitInfo2.getYear();
                            if (year == null) {
                                year = "";
                            }
                            getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Tahun", year, composer4, 6);
                            String date = (scholarshipDataEligible2 == null || (benefitInfo = scholarshipDataEligible2.getBenefitInfo()) == null) ? null : benefitInfo.getDate();
                            if (date == null) {
                                date = "";
                            }
                            getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Tanggal Konfirmasi", date, composer4, 6);
                            SpacerKt.Spacer(SizeKt.m1033height3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(16.0f)), composer4, 6);
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            ButtonColors buttonColorsM1797buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m1797buttonColorsro_MJ88(ColorKt.Color(4283215696L), 0L, 0L, 0L, composer4, (ButtonDefaults.$stable << 12) | 6, 14);
                            RoundedCornerShape roundedCornerShapeM1285RoundedCornerShape0680j_5 = RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(8.0f));
                            CollapsibleActionView collapsibleActionView = CollapsibleActionView.b;
                            ButtonKt.Button(function1, modifierFillMaxWidth$default, false, roundedCornerShapeM1285RoundedCornerShape0680j_5, buttonColorsM1797buttonColorsro_MJ88, null, null, null, null, CollapsibleActionView.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), composer4, 805306416, 484);
                            composer4.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer4.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }, composer2, 54), composer2, 196614, 20);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer2.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(ScholarshipDataEligible scholarshipDataEligible, Function0<Unit> function0) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = scholarshipDataEligible;
            this.TuitionPaymentFragmentbindingInflater1 = function0;
        }
    }

    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final Function0<Unit> function0, final ScholarshipDataEligible scholarshipDataEligible, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(function0, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(1485422770);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(scholarshipDataEligible) ? 32 : 16;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                scholarshipDataEligible = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1485422770, i3, -1, "com.bpjstku.presentation.compose.common.scholarship.ScholarshipConfirmedDialog (ScholarshipConfirmedDialog.kt:33)");
            }
            composerStartRestartGroup.startReplaceGroup(1784837575);
            boolean z = (i3 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: SupportActionModeWrapper
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function0.invoke();
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, null, ComposableLambdaKt.rememberComposableLambda(-1769428293, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault2(scholarshipDataEligible, function0), composerStartRestartGroup, 54), composerStartRestartGroup, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: StandaloneActionMode
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Function0 function1 = function0;
                    ScholarshipDataEligible scholarshipDataEligible2 = scholarshipDataEligible;
                    int i5 = i;
                    getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, scholarshipDataEligible2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i5 | 1), i2);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final String str, final String str2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(27592267);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(27592267, i3, -1, "com.bpjstku.presentation.compose.common.scholarship.InfoItem (ScholarshipConfirmedDialog.kt:92)");
            }
            Modifier modifierM1004paddingVpY3zN4$default = PaddingKt.m1004paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6935constructorimpl(5.0f), 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1004paddingVpY3zN4$default);
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
            Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3543setimpl(composerM3536constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m2654Text4IGK_g(str, (Modifier) null, Color.INSTANCE.m4248getGray0d7_KjU(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i3 & 14) | 1576320, 0, 130994);
            SpacerKt.Spacer(SizeKt.m1033height3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(4.0f)), composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            TextKt.m2654Text4IGK_g(str2, (Modifier) null, 0L, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ((i3 >> 3) & 14) | 1575936, 0, 130998);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getSystemService
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault3(str, str2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        int i2 = i % 9295819;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i + 1;
        if (i2 != 0) {
            return TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        }
        int i3 = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getResources().getConfiguration().mcc;
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i3;
        return i3;
    }
}
