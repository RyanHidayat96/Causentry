package defpackage;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.RadioButtonDefaults;
import androidx.compose.material3.RadioButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
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
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class enableHomeButtonByDefault {
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x0105  */
    /* JADX WARN: Code duplicated, block: B:75:0x0111  */
    /* JADX WARN: Code duplicated, block: B:76:0x0115  */
    /* JADX WARN: Code duplicated, block: B:79:0x013a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0148  */
    /* JADX WARN: Code duplicated, block: B:84:0x0211  */
    /* JADX WARN: Code duplicated, block: B:88:0x021e  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final boolean z, final Function0<Unit> function0, final String str, Modifier modifier, boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final boolean z3;
        int i5;
        int i6;
        Modifier modifier3;
        boolean z4;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM3536constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(str, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(235624974);
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
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    z3 = z2;
                    if (composerStartRestartGroup.changed(z3)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i3;
                if ((i6 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                    if (i7 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i4 != 0) {
                        z4 = true;
                    } else {
                        z4 = z3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(235624974, i6, -1, "com.bpjstku.presentation.compose.common.BpjstkuRadioButton (RadioButton.kt:26)");
                    }
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Modifier modifierM590clickableXHw0xAI$default = ClickableKt.m590clickableXHw0xAI$default(modifier3, false, null, null, function0, 7, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM590clickableXHw0xAI$default);
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
                    Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3543setimpl(composerM3536constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    RadioButtonKt.RadioButton(z, null, null, z4, RadioButtonDefaults.INSTANCE.m2300colorsro_MJ88(ColorKt.Color(4278228616L), ColorKt.Color(4288652199L), 0L, 0L, composerStartRestartGroup, (RadioButtonDefaults.$stable << 12) | 54, 12), null, composerStartRestartGroup, (i6 & 14) | 48 | ((i6 >> 3) & 7168), 36);
                    SpacerKt.Spacer(SizeKt.m1052width3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(4.0f)), composerStartRestartGroup, 6);
                    composer2 = composerStartRestartGroup;
                    TextKt.m2654Text4IGK_g(str, (Modifier) null, ColorKt.Color(4280032286L), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (14 & (i6 >> 6)) | 1576320, 0, 130994);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    z3 = z4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    composer2 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getMaxActionButtons
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            boolean z5 = z;
                            Function0 function1 = function0;
                            String str2 = str;
                            Modifier modifier5 = modifier4;
                            boolean z6 = z3;
                            int i8 = i;
                            enableHomeButtonByDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, function1, str2, modifier5, z6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i8 | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= 24576;
            z3 = z2;
            i6 = i3;
            if ((i6 & 9363) == 9362) {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z4 = true;
                } else {
                    z4 = z3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(235624974, i6, -1, "com.bpjstku.presentation.compose.common.BpjstkuRadioButton (RadioButton.kt:26)");
                }
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                Modifier modifierM590clickableXHw0xAI$default2 = ClickableKt.m590clickableXHw0xAI$default(modifier3, false, null, null, function0, 7, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composerStartRestartGroup, 48);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM590clickableXHw0xAI$default2);
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
                Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                RadioButtonKt.RadioButton(z, null, null, z4, RadioButtonDefaults.INSTANCE.m2300colorsro_MJ88(ColorKt.Color(4278228616L), ColorKt.Color(4288652199L), 0L, 0L, composerStartRestartGroup, (RadioButtonDefaults.$stable << 12) | 54, 12), null, composerStartRestartGroup, (i6 & 14) | 48 | ((i6 >> 3) & 7168), 36);
                SpacerKt.Spacer(SizeKt.m1052width3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(4.0f)), composerStartRestartGroup, 6);
                composer2 = composerStartRestartGroup;
                TextKt.m2654Text4IGK_g(str, (Modifier) null, ColorKt.Color(4280032286L), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (14 & (i6 >> 6)) | 1576320, 0, 130994);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z3 = z4;
            } else {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z4 = true;
                } else {
                    z4 = z3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(235624974, i6, -1, "com.bpjstku.presentation.compose.common.BpjstkuRadioButton (RadioButton.kt:26)");
                }
                Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
                Modifier modifierM590clickableXHw0xAI$default3 = ClickableKt.m590clickableXHw0xAI$default(modifier3, false, null, null, function0, 7, null);
                MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, composerStartRestartGroup, 48);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM590clickableXHw0xAI$default3);
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
                Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyRowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
                RadioButtonKt.RadioButton(z, null, null, z4, RadioButtonDefaults.INSTANCE.m2300colorsro_MJ88(ColorKt.Color(4278228616L), ColorKt.Color(4288652199L), 0L, 0L, composerStartRestartGroup, (RadioButtonDefaults.$stable << 12) | 54, 12), null, composerStartRestartGroup, (i6 & 14) | 48 | ((i6 >> 3) & 7168), 36);
                SpacerKt.Spacer(SizeKt.m1052width3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(4.0f)), composerStartRestartGroup, 6);
                composer2 = composerStartRestartGroup;
                TextKt.m2654Text4IGK_g(str, (Modifier) null, ColorKt.Color(4280032286L), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (14 & (i6 >> 6)) | 1576320, 0, 130994);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z3 = z4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getMaxActionButtons
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        boolean z5 = z;
                        Function0 function1 = function0;
                        String str2 = str;
                        Modifier modifier5 = modifier4;
                        boolean z6 = z3;
                        int i8 = i;
                        enableHomeButtonByDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, function1, str2, modifier5, z6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i8 | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= 3072;
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                z3 = z2;
                if (composerStartRestartGroup.changed(z3)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i3;
            if ((i6 & 9363) == 9362) {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z4 = true;
                } else {
                    z4 = z3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(235624974, i6, -1, "com.bpjstku.presentation.compose.common.BpjstkuRadioButton (RadioButton.kt:26)");
                }
                Alignment.Vertical centerVertically4 = Alignment.INSTANCE.getCenterVertically();
                Modifier modifierM590clickableXHw0xAI$default4 = ClickableKt.m590clickableXHw0xAI$default(modifier3, false, null, null, function0, 7, null);
                MeasurePolicy measurePolicyRowMeasurePolicy4 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically4, composerStartRestartGroup, 48);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM590clickableXHw0xAI$default4);
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
                Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyRowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3536constructorimpl.getInserting()) {
                    composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                } else {
                    composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3543setimpl(composerM3536constructorimpl, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                RowScopeInstance rowScopeInstance4 = RowScopeInstance.INSTANCE;
                RadioButtonKt.RadioButton(z, null, null, z4, RadioButtonDefaults.INSTANCE.m2300colorsro_MJ88(ColorKt.Color(4278228616L), ColorKt.Color(4288652199L), 0L, 0L, composerStartRestartGroup, (RadioButtonDefaults.$stable << 12) | 54, 12), null, composerStartRestartGroup, (i6 & 14) | 48 | ((i6 >> 3) & 7168), 36);
                SpacerKt.Spacer(SizeKt.m1052width3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(4.0f)), composerStartRestartGroup, 6);
                composer2 = composerStartRestartGroup;
                TextKt.m2654Text4IGK_g(str, (Modifier) null, ColorKt.Color(4280032286L), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (14 & (i6 >> 6)) | 1576320, 0, 130994);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z3 = z4;
            } else {
                if (i7 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i4 != 0) {
                    z4 = true;
                } else {
                    z4 = z3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(235624974, i6, -1, "com.bpjstku.presentation.compose.common.BpjstkuRadioButton (RadioButton.kt:26)");
                }
                Alignment.Vertical centerVertically5 = Alignment.INSTANCE.getCenterVertically();
                Modifier modifierM590clickableXHw0xAI$default5 = ClickableKt.m590clickableXHw0xAI$default(modifier3, false, null, null, function0, 7, null);
                MeasurePolicy measurePolicyRowMeasurePolicy5 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically5, composerStartRestartGroup, 48);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM590clickableXHw0xAI$default5);
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
                Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyRowMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM3536constructorimpl.getInserting()) {
                    composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                } else {
                    composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3543setimpl(composerM3536constructorimpl, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                RowScopeInstance rowScopeInstance5 = RowScopeInstance.INSTANCE;
                RadioButtonKt.RadioButton(z, null, null, z4, RadioButtonDefaults.INSTANCE.m2300colorsro_MJ88(ColorKt.Color(4278228616L), ColorKt.Color(4288652199L), 0L, 0L, composerStartRestartGroup, (RadioButtonDefaults.$stable << 12) | 54, 12), null, composerStartRestartGroup, (i6 & 14) | 48 | ((i6 >> 3) & 7168), 36);
                SpacerKt.Spacer(SizeKt.m1052width3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(4.0f)), composerStartRestartGroup, 6);
                composer2 = composerStartRestartGroup;
                TextKt.m2654Text4IGK_g(str, (Modifier) null, ColorKt.Color(4280032286L), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (14 & (i6 >> 6)) | 1576320, 0, 130994);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z3 = z4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getMaxActionButtons
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        boolean z5 = z;
                        Function0 function1 = function0;
                        String str2 = str;
                        Modifier modifier5 = modifier4;
                        boolean z6 = z3;
                        int i8 = i;
                        enableHomeButtonByDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, function1, str2, modifier5, z6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i8 | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= 24576;
        z3 = z2;
        i6 = i3;
        if ((i6 & 9363) == 9362) {
            if (i7 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                z4 = true;
            } else {
                z4 = z3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(235624974, i6, -1, "com.bpjstku.presentation.compose.common.BpjstkuRadioButton (RadioButton.kt:26)");
            }
            Alignment.Vertical centerVertically6 = Alignment.INSTANCE.getCenterVertically();
            Modifier modifierM590clickableXHw0xAI$default6 = ClickableKt.m590clickableXHw0xAI$default(modifier3, false, null, null, function0, 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy6 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically6, composerStartRestartGroup, 48);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM590clickableXHw0xAI$default6);
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
            Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyRowMeasurePolicy6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3536constructorimpl.getInserting()) {
                composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            } else {
                composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3543setimpl(composerM3536constructorimpl, modifierMaterializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
            RowScopeInstance rowScopeInstance6 = RowScopeInstance.INSTANCE;
            RadioButtonKt.RadioButton(z, null, null, z4, RadioButtonDefaults.INSTANCE.m2300colorsro_MJ88(ColorKt.Color(4278228616L), ColorKt.Color(4288652199L), 0L, 0L, composerStartRestartGroup, (RadioButtonDefaults.$stable << 12) | 54, 12), null, composerStartRestartGroup, (i6 & 14) | 48 | ((i6 >> 3) & 7168), 36);
            SpacerKt.Spacer(SizeKt.m1052width3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(4.0f)), composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            TextKt.m2654Text4IGK_g(str, (Modifier) null, ColorKt.Color(4280032286L), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (14 & (i6 >> 6)) | 1576320, 0, 130994);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            z3 = z4;
        } else {
            if (i7 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i4 != 0) {
                z4 = true;
            } else {
                z4 = z3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(235624974, i6, -1, "com.bpjstku.presentation.compose.common.BpjstkuRadioButton (RadioButton.kt:26)");
            }
            Alignment.Vertical centerVertically7 = Alignment.INSTANCE.getCenterVertically();
            Modifier modifierM590clickableXHw0xAI$default7 = ClickableKt.m590clickableXHw0xAI$default(modifier3, false, null, null, function0, 7, null);
            MeasurePolicy measurePolicyRowMeasurePolicy7 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically7, composerStartRestartGroup, 48);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM590clickableXHw0xAI$default7);
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
            Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyRowMeasurePolicy7, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM3536constructorimpl.getInserting()) {
                composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            } else {
                composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3543setimpl(composerM3536constructorimpl, modifierMaterializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
            RowScopeInstance rowScopeInstance7 = RowScopeInstance.INSTANCE;
            RadioButtonKt.RadioButton(z, null, null, z4, RadioButtonDefaults.INSTANCE.m2300colorsro_MJ88(ColorKt.Color(4278228616L), ColorKt.Color(4288652199L), 0L, 0L, composerStartRestartGroup, (RadioButtonDefaults.$stable << 12) | 54, 12), null, composerStartRestartGroup, (i6 & 14) | 48 | ((i6 >> 3) & 7168), 36);
            SpacerKt.Spacer(SizeKt.m1052width3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(4.0f)), composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            TextKt.m2654Text4IGK_g(str, (Modifier) null, ColorKt.Color(4280032286L), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (14 & (i6 >> 6)) | 1576320, 0, 130994);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            z3 = z4;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getMaxActionButtons
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    boolean z5 = z;
                    Function0 function1 = function0;
                    String str2 = str;
                    Modifier modifier5 = modifier4;
                    boolean z6 = z3;
                    int i8 = i;
                    enableHomeButtonByDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault1(z5, function1, str2, modifier5, z6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i8 | 1), i2);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
