package defpackage;

import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardColors;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.profileinstaller.ProfileVerifier;
import com.bpjstku.R;
import com.bpjstku.domain.scholarship.model.ScholarDocument;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class initializeTheme {
    /* JADX WARN: Code duplicated, block: B:49:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0095  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x0152  */
    /* JADX WARN: Code duplicated, block: B:61:0x015d  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    public static final void b(final ScholarDocument scholarDocument, final Function0<Unit> function0, final Function1<? super String, Unit> function1, final Function0<Unit> function2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(scholarDocument, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(856020569);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(scholarDocument) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9235) == 9234 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(856020569, i3, -1, "com.bpjstku.presentation.compose.common.scholarship.ScholarProveFileItem (ScholarProve.kt:48)");
                }
                Modifier modifierM1004paddingVpY3zN4$default = PaddingKt.m1004paddingVpY3zN4$default(SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), Dp.m6935constructorimpl(202.0f)), 0.0f, Dp.m6935constructorimpl(8.0f), 1, null);
                Modifier modifier4 = modifier3;
                CardColors cardColorsM1818cardColorsro_MJ88 = CardDefaults.INSTANCE.m1818cardColorsro_MJ88(ColorResources_androidKt.colorResource(R.color.colorPaleGrey, composerStartRestartGroup, 6), 0L, 0L, 0L, composerStartRestartGroup, CardDefaults.$stable << 12, 14);
                CardKt.Card(modifierM1004paddingVpY3zN4$default, RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(5.0f)), cardColorsM1818cardColorsro_MJ88, CardDefaults.INSTANCE.m1819cardElevationaqJV_2Y(Dp.m6935constructorimpl(2.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (CardDefaults.$stable << 18) | 6, 62), BorderStrokeKt.m584BorderStrokecXLIe8U(Dp.m6935constructorimpl(1.0f), ColorResources_androidKt.colorResource(R.color.colorPaleGrey, composerStartRestartGroup, 6)), ComposableLambdaKt.rememberComposableLambda(1261176779, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(scholarDocument, function0, function2), composerStartRestartGroup, 54), composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier5 = modifier2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: applyOverrideConfiguration
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ScholarDocument scholarDocument2 = scholarDocument;
                        Function0 function3 = function0;
                        Function1 function4 = function1;
                        Function0 function5 = function2;
                        Modifier modifier6 = modifier5;
                        int i5 = i;
                        initializeTheme.b(scholarDocument2, function3, function4, function5, modifier6, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i5 | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9235) == 9234) {
            if (i4 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(856020569, i3, -1, "com.bpjstku.presentation.compose.common.scholarship.ScholarProveFileItem (ScholarProve.kt:48)");
            }
            Modifier modifierM1004paddingVpY3zN4$default2 = PaddingKt.m1004paddingVpY3zN4$default(SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), Dp.m6935constructorimpl(202.0f)), 0.0f, Dp.m6935constructorimpl(8.0f), 1, null);
            Modifier modifier6 = modifier3;
            CardColors cardColorsM1818cardColorsro_MJ89 = CardDefaults.INSTANCE.m1818cardColorsro_MJ88(ColorResources_androidKt.colorResource(R.color.colorPaleGrey, composerStartRestartGroup, 6), 0L, 0L, 0L, composerStartRestartGroup, CardDefaults.$stable << 12, 14);
            CardKt.Card(modifierM1004paddingVpY3zN4$default2, RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(5.0f)), cardColorsM1818cardColorsro_MJ89, CardDefaults.INSTANCE.m1819cardElevationaqJV_2Y(Dp.m6935constructorimpl(2.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (CardDefaults.$stable << 18) | 6, 62), BorderStrokeKt.m584BorderStrokecXLIe8U(Dp.m6935constructorimpl(1.0f), ColorResources_androidKt.colorResource(R.color.colorPaleGrey, composerStartRestartGroup, 6)), ComposableLambdaKt.rememberComposableLambda(1261176779, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(scholarDocument, function0, function2), composerStartRestartGroup, 54), composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier6;
        } else {
            if (i4 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(856020569, i3, -1, "com.bpjstku.presentation.compose.common.scholarship.ScholarProveFileItem (ScholarProve.kt:48)");
            }
            Modifier modifierM1004paddingVpY3zN4$default3 = PaddingKt.m1004paddingVpY3zN4$default(SizeKt.m1033height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), Dp.m6935constructorimpl(202.0f)), 0.0f, Dp.m6935constructorimpl(8.0f), 1, null);
            Modifier modifier7 = modifier3;
            CardColors cardColorsM1818cardColorsro_MJ810 = CardDefaults.INSTANCE.m1818cardColorsro_MJ88(ColorResources_androidKt.colorResource(R.color.colorPaleGrey, composerStartRestartGroup, 6), 0L, 0L, 0L, composerStartRestartGroup, CardDefaults.$stable << 12, 14);
            CardKt.Card(modifierM1004paddingVpY3zN4$default3, RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(5.0f)), cardColorsM1818cardColorsro_MJ810, CardDefaults.INSTANCE.m1819cardElevationaqJV_2Y(Dp.m6935constructorimpl(2.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, (CardDefaults.$stable << 18) | 6, 62), BorderStrokeKt.m584BorderStrokecXLIe8U(Dp.m6935constructorimpl(1.0f), ColorResources_androidKt.colorResource(R.color.colorPaleGrey, composerStartRestartGroup, 6)), ComposableLambdaKt.rememberComposableLambda(1261176779, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(scholarDocument, function0, function2), composerStartRestartGroup, 54), composerStartRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier7;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier8 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: applyOverrideConfiguration
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ScholarDocument scholarDocument2 = scholarDocument;
                    Function0 function3 = function0;
                    Function1 function4 = function1;
                    Function0 function5 = function2;
                    Modifier modifier9 = modifier8;
                    int i5 = i;
                    initializeTheme.b(scholarDocument2, function3, function4, function5, modifier9, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i5 | 1), i2);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Function3<ColumnScope, Composer, Integer, Unit> {
        private /* synthetic */ Function0<Unit> TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ ScholarDocument TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ Function0<Unit> b;

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) throws Throwable {
            Function0<Unit> function0;
            Composer composer2;
            int i;
            Composer composer3 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(columnScope, "");
            if ((iIntValue & 17) != 16 || !composer3.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1261176779, iIntValue, -1, "com.bpjstku.presentation.compose.common.scholarship.ScholarProveFileItem.<anonymous> (ScholarProve.kt:61)");
                }
                Modifier modifierM1002padding3ABfNKs = PaddingKt.m1002padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6935constructorimpl(8.0f));
                ScholarDocument scholarDocument = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                final Function0<Unit> function1 = this.TuitionPaymentFragmentbindingInflater1;
                final Function0<Unit> function2 = this.b;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM1002padding3ABfNKs);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor);
                } else {
                    composer3.useNode();
                }
                Composer composerM3536constructorimpl = Updater.m3536constructorimpl(composer3);
                Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3543setimpl(composerM3536constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                boolean z = Intrinsics.areEqual(scholarDocument.TuitionPaymentFragmentspecialinlinedviewModeldefault3, "D113") || Intrinsics.areEqual(scholarDocument.TuitionPaymentFragmentspecialinlinedviewModeldefault3, "D114");
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                builder.append(scholarDocument.b);
                if (z) {
                    int iPushStyle = builder.pushStyle(new SpanStyle(Color.INSTANCE.m4252getRed0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
                    try {
                        builder.append(" *");
                        Unit unit = Unit.INSTANCE;
                        builder.pop(iPushStyle);
                    } catch (Throwable th) {
                        builder.pop(iPushStyle);
                        throw th;
                    }
                }
                TextKt.m2655TextIbK3jfQ(builder.toAnnotatedString(), PaddingKt.m1004paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6935constructorimpl(16.0f), 0.0f, 2, null), ColorKt.Color(4283058762L), TextUnitKt.getSp(12), null, FontWeight.INSTANCE.getMedium(), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, composer3, 200112, 0, 262096);
                SpacerKt.Spacer(SizeKt.m1033height3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(8.0f)), composer3, 6);
                Modifier modifierM1006paddingqDBjuR0$default = PaddingKt.m1006paddingqDBjuR0$default(ClipKt.clip(SizeKt.fillMaxWidth$default(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null), RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(6.0f))), 0.0f, Dp.m6935constructorimpl(8.0f), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM1006paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor2);
                } else {
                    composer3.useNode();
                }
                Composer composerM3536constructorimpl2 = Updater.m3536constructorimpl(composer3);
                Updater.m3543setimpl(composerM3536constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3543setimpl(composerM3536constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3536constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM3536constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3536constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3543setimpl(composerM3536constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (StringsKt.contains$default((CharSequence) scholarDocument.TuitionPaymentFragmentbindingInflater1, (CharSequence) "image", false, 2, (Object) null) && scholarDocument.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                    composer3.startReplaceGroup(1603059274);
                    MediaBrowserCompatSubscriptionCallbackStubApi21.TuitionPaymentFragmentspecialinlinedviewModeldefault1(scholarDocument.TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ContentScale.INSTANCE.getFit(), composer3, 1573296);
                    composer3.endReplaceGroup();
                    composer2 = composer3;
                    i = 6;
                    function0 = function1;
                } else if (scholarDocument.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                    composer3.startReplaceGroup(1603796237);
                    long sp = TextUnitKt.getSp(14);
                    long jM4248getGray0d7_KjU = Color.INSTANCE.m4248getGray0d7_KjU();
                    Modifier.Companion companion = Modifier.INSTANCE;
                    composer3.startReplaceGroup(-1472277247);
                    boolean zChanged = composer3.changed(function1);
                    Object objRememberedValue = composer3.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: isEmptyConfiguration
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return initializeTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(function1);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    composer3.endReplaceGroup();
                    function0 = function1;
                    TextKt.m2654Text4IGK_g("Lihat File Pdf", PaddingKt.m1004paddingVpY3zN4$default(ClickableKt.m590clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null), Dp.m6935constructorimpl(16.0f), 0.0f, 2, null), jM4248getGray0d7_KjU, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3462, 0, 131056);
                    composer3.endReplaceGroup();
                    composer2 = composer3;
                    i = 6;
                } else {
                    function0 = function1;
                    composer2 = composer3;
                    composer2.startReplaceGroup(1604209312);
                    i = 6;
                    Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.ic_camera, composer2, 6);
                    Modifier modifierM1047size3ABfNKs = SizeKt.m1047size3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(48.0f));
                    composer2.startReplaceGroup(-1472262486);
                    boolean zChanged2 = composer2.changed(function2);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: onApplyThemeResource
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return initializeTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(function2);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    IconKt.m2127Iconww6aTOc(painterPainterResource, "Upload", ClickableKt.m590clickableXHw0xAI$default(modifierM1047size3ABfNKs, false, null, null, (Function0) objRememberedValue2, 7, null), Color.INSTANCE.m4247getDarkGray0d7_KjU(), composer2, 3120, 0);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                composer2.startReplaceGroup(-5999510);
                if (scholarDocument.TuitionPaymentFragmentspecialinlinedviewModeldefault1 != null) {
                    Modifier modifierM1006paddingqDBjuR0$default2 = PaddingKt.m1006paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, Dp.m6935constructorimpl(8.0f), Dp.m6935constructorimpl(8.0f), 3, null);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getEnd(), Alignment.INSTANCE.getTop(), composer2, i);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM1006paddingqDBjuR0$default2);
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
                    Modifier modifierM1047size3ABfNKs2 = SizeKt.m1047size3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(40.0f));
                    onActionViewExpanded onactionviewexpanded = onActionViewExpanded.b;
                    IconButtonKt.IconButton(function0, modifierM1047size3ABfNKs2, false, null, null, onActionViewExpanded.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), composer2, 196656, 28);
                    composer2.endNode();
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer3.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit b(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(ScholarDocument scholarDocument, Function0<Unit> function0, Function0<Unit> function1) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = scholarDocument;
            this.TuitionPaymentFragmentbindingInflater1 = function0;
            this.b = function1;
        }
    }
}
