package defpackage;

import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.DividerKt;
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
import com.bpjstku.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SupportMenuInflater {
    /* JADX WARN: Code duplicated, block: B:59:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00be  */
    /* JADX WARN: Code duplicated, block: B:67:0x0100  */
    /* JADX WARN: Code duplicated, block: B:70:0x010c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0110  */
    /* JADX WARN: Code duplicated, block: B:74:0x0135  */
    /* JADX WARN: Code duplicated, block: B:76:0x0143  */
    /* JADX WARN: Code duplicated, block: B:79:0x026a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0275  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final String str, final String str2, final String str3, final String str4, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM3536constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-522798684);
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
            i3 |= composerStartRestartGroup.changed(str4) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i3;
            if ((i4 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                if (i5 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-522798684, i4, -1, "com.bpjstku.presentation.compose.common.scholarship.ScholarshipHistoryItem (ScholarshipHistoryItem.kt:34)");
                }
                Modifier modifierM1004paddingVpY3zN4$default = PaddingKt.m1004paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), 0.0f, Dp.m6935constructorimpl(8.0f), 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1004paddingVpY3zN4$default);
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM3536constructorimpl = Updater.m3536constructorimpl(composerStartRestartGroup);
                Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3543setimpl(composerM3536constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier modifier4 = modifier3;
                TextKt.m2654Text4IGK_g(str, PaddingKt.m1003paddingVpY3zN4(Modifier.INSTANCE, Dp.m6935constructorimpl(16.0f), Dp.m6935constructorimpl(8.0f)), Color.INSTANCE.m4244getBlack0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.poppins_medium, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i4 & 14) | 1576368, 0, 130992);
                composer2 = composerStartRestartGroup;
                CardKt.Card(PaddingKt.m1003paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6935constructorimpl(16.0f), Dp.m6935constructorimpl(8.0f)), RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(8.0f)), CardDefaults.INSTANCE.m1818cardColorsro_MJ88(Color.INSTANCE.m4255getWhite0d7_KjU(), 0L, 0L, 0L, composerStartRestartGroup, (CardDefaults.$stable << 12) | 6, 14), CardDefaults.INSTANCE.m1819cardElevationaqJV_2Y(Dp.m6935constructorimpl(0.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (CardDefaults.$stable << 18) | 6, 62), BorderStrokeKt.m584BorderStrokecXLIe8U(Dp.m6935constructorimpl(1.0f), ColorKt.Color(4292927712L)), ComposableLambdaKt.rememberComposableLambda(-2041935988, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(str2, str3, str4), composerStartRestartGroup, 54), composerStartRestartGroup, 221190, 0);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getMenuWrapper
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        String str5 = str;
                        String str6 = str2;
                        String str7 = str3;
                        String str8 = str4;
                        Modifier modifier5 = modifier2;
                        int i6 = i;
                        SupportMenuInflater.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str5, str6, str7, str8, modifier5, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i6 | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= 24576;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 9363) == 9362) {
            if (i5 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-522798684, i4, -1, "com.bpjstku.presentation.compose.common.scholarship.ScholarshipHistoryItem (ScholarshipHistoryItem.kt:34)");
            }
            Modifier modifierM1004paddingVpY3zN4$default2 = PaddingKt.m1004paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), 0.0f, Dp.m6935constructorimpl(8.0f), 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1004paddingVpY3zN4$default2);
            constructor = ComposeUiNode.INSTANCE.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM3536constructorimpl = Updater.m3536constructorimpl(composerStartRestartGroup);
            Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3536constructorimpl.getInserting()) {
                composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            } else {
                composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3543setimpl(composerM3536constructorimpl, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            Modifier modifier5 = modifier3;
            TextKt.m2654Text4IGK_g(str, PaddingKt.m1003paddingVpY3zN4(Modifier.INSTANCE, Dp.m6935constructorimpl(16.0f), Dp.m6935constructorimpl(8.0f)), Color.INSTANCE.m4244getBlack0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.poppins_medium, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i4 & 14) | 1576368, 0, 130992);
            composer2 = composerStartRestartGroup;
            CardKt.Card(PaddingKt.m1003paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6935constructorimpl(16.0f), Dp.m6935constructorimpl(8.0f)), RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(8.0f)), CardDefaults.INSTANCE.m1818cardColorsro_MJ88(Color.INSTANCE.m4255getWhite0d7_KjU(), 0L, 0L, 0L, composerStartRestartGroup, (CardDefaults.$stable << 12) | 6, 14), CardDefaults.INSTANCE.m1819cardElevationaqJV_2Y(Dp.m6935constructorimpl(0.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (CardDefaults.$stable << 18) | 6, 62), BorderStrokeKt.m584BorderStrokecXLIe8U(Dp.m6935constructorimpl(1.0f), ColorKt.Color(4292927712L)), ComposableLambdaKt.rememberComposableLambda(-2041935988, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(str2, str3, str4), composerStartRestartGroup, 54), composerStartRestartGroup, 221190, 0);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier5;
        } else {
            if (i5 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-522798684, i4, -1, "com.bpjstku.presentation.compose.common.scholarship.ScholarshipHistoryItem (ScholarshipHistoryItem.kt:34)");
            }
            Modifier modifierM1004paddingVpY3zN4$default3 = PaddingKt.m1004paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), 0.0f, Dp.m6935constructorimpl(8.0f), 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1004paddingVpY3zN4$default3);
            constructor = ComposeUiNode.INSTANCE.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM3536constructorimpl = Updater.m3536constructorimpl(composerStartRestartGroup);
            Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyColumnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3536constructorimpl.getInserting()) {
                composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            } else {
                composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3543setimpl(composerM3536constructorimpl, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            Modifier modifier6 = modifier3;
            TextKt.m2654Text4IGK_g(str, PaddingKt.m1003paddingVpY3zN4(Modifier.INSTANCE, Dp.m6935constructorimpl(16.0f), Dp.m6935constructorimpl(8.0f)), Color.INSTANCE.m4244getBlack0d7_KjU(), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.poppins_medium, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i4 & 14) | 1576368, 0, 130992);
            composer2 = composerStartRestartGroup;
            CardKt.Card(PaddingKt.m1003paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6935constructorimpl(16.0f), Dp.m6935constructorimpl(8.0f)), RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(8.0f)), CardDefaults.INSTANCE.m1818cardColorsro_MJ88(Color.INSTANCE.m4255getWhite0d7_KjU(), 0L, 0L, 0L, composerStartRestartGroup, (CardDefaults.$stable << 12) | 6, 14), CardDefaults.INSTANCE.m1819cardElevationaqJV_2Y(Dp.m6935constructorimpl(0.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (CardDefaults.$stable << 18) | 6, 62), BorderStrokeKt.m584BorderStrokecXLIe8U(Dp.m6935constructorimpl(1.0f), ColorKt.Color(4292927712L)), ComposableLambdaKt.rememberComposableLambda(-2041935988, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault1(str2, str3, str4), composerStartRestartGroup, 54), composerStartRestartGroup, 221190, 0);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier6;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getMenuWrapper
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String str5 = str;
                    String str6 = str2;
                    String str7 = str3;
                    String str8 = str4;
                    Modifier modifier7 = modifier2;
                    int i6 = i;
                    SupportMenuInflater.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str5, str6, str7, str8, modifier7, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i6 | 1), i2);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Function3<ColumnScope, Composer, Integer, Unit> {
        private /* synthetic */ String TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(columnScope, "");
            if ((iIntValue & 17) != 16 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2041935988, iIntValue, -1, "com.bpjstku.presentation.compose.common.scholarship.ScholarshipHistoryItem.<anonymous>.<anonymous> (ScholarshipHistoryItem.kt:60)");
                }
                Modifier modifierM1003paddingVpY3zN4 = PaddingKt.m1003paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6935constructorimpl(8.0f), Dp.m6935constructorimpl(8.0f));
                String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                String str3 = this.TuitionPaymentFragmentbindingInflater1;
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
                TextKt.m2654Text4IGK_g("Pendidikan/Pelatihan yang ditempuh", (Modifier) null, Color.INSTANCE.m4248getGray0d7_KjU(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 1576326, 0, 130994);
                TextKt.m2654Text4IGK_g(str, PaddingKt.m1006paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6935constructorimpl(5.0f), 0.0f, 0.0f, 13, null), ColorKt.Color(4281545523L), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 1576368, 0, 130992);
                DividerKt.m2055HorizontalDivider9IZ8Weo(PaddingKt.m1004paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m6935constructorimpl(8.0f), 1, null), Dp.m6935constructorimpl(1.0f), Color.INSTANCE.m4248getGray0d7_KjU(), composer2, 438, 0);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getTop(), composer2, 6);
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
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion);
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
                TextKt.m2654Text4IGK_g("Besar Manfaat", (Modifier) null, Color.INSTANCE.m4248getGray0d7_KjU(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 1576326, 0, 130994);
                TextKt.m2654Text4IGK_g(str2, PaddingKt.m1006paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6935constructorimpl(5.0f), 0.0f, Dp.m6935constructorimpl(8.0f), 5, null), ColorKt.Color(4281545523L), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 1576368, 0, 130992);
                composer2.endNode();
                Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, composer2, 48);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, companion2);
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
                Updater.m3543setimpl(composerM3536constructorimpl4, measurePolicyColumnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3543setimpl(composerM3536constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3536constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM3536constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM3536constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m3543setimpl(composerM3536constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                TextKt.m2654Text4IGK_g("Tanggal Bayar", (Modifier) null, Color.INSTANCE.m4248getGray0d7_KjU(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 1576326, 0, 130994);
                TextKt.m2654Text4IGK_g(str3, PaddingKt.m1006paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6935constructorimpl(5.0f), 0.0f, Dp.m6935constructorimpl(8.0f), 5, null), ColorKt.Color(4281545523L), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 1576368, 0, 130992);
                composer2.endNode();
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

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str, String str2, String str3) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str2;
            this.TuitionPaymentFragmentbindingInflater1 = str3;
        }
    }
}
