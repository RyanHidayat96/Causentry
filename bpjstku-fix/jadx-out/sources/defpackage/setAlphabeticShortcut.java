package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.p002lifecycle.Lifecycle;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.p003compose.FlowExtKt;
import com.bpjstku.R;
import com.bpjstku.data.scholarship.model.response.ScholarshipDataEligible;
import com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipHistoryParticipantKt$GranteeList$lambda$6$lambda$5$$inlined$items$default$1;
import defpackage.SupportActionModeWrapperCallbackWrapper;
import defpackage.onActionViewCollapsed;
import defpackage.setAlphabeticShortcut;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class setAlphabeticShortcut {
    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final getRatioByPercentage getratiobypercentage, final Function0<Unit> function0, final Function0<Unit> function1, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(getratiobypercentage, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1897268750);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(getratiobypercentage) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1897268750, i3, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipHistoryParticipant (ScholarshipHistoryParticipant.kt:31)");
            }
            getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Riwayat Konfirmasi", ComposableLambdaKt.rememberComposableLambda(315921390, true, new TuitionPaymentFragmentbindingInflater1(getratiobypercentage, function1, FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.d, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 54), function0, null, composerStartRestartGroup, ((i3 << 3) & 896) | 54, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: setIconTintList
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    setAlphabeticShortcut.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getratiobypercentage, function0, function1, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }

    static final class TuitionPaymentFragmentbindingInflater1 implements Function3<PaddingValues, Composer, Integer, Unit> {
        private /* synthetic */ getRatioByPercentage TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ State<updateTextButtonVisibility> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ Function0<Unit> b;

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            PaddingValues paddingValues2 = paddingValues;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(paddingValues2, "");
            if ((iIntValue & 6) == 0) {
                iIntValue |= composer2.changed(paddingValues2) ? 4 : 2;
            }
            if ((iIntValue & 19) != 18 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(315921390, iIntValue, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipHistoryParticipant.<anonymous> (ScholarshipHistoryParticipant.kt:38)");
                }
                Modifier modifierM1004paddingVpY3zN4$default = PaddingKt.m1004paddingVpY3zN4$default(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues2), Dp.m6935constructorimpl(16.0f), 0.0f, 2, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM882spacedBy0680j_4 = Arrangement.INSTANCE.m882spacedBy0680j_4(Dp.m6935constructorimpl(16.0f));
                getRatioByPercentage getratiobypercentage = this.TuitionPaymentFragmentbindingInflater1;
                Function0<Unit> function0 = this.b;
                State<updateTextButtonVisibility> state = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM882spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer2, 6);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM1004paddingVpY3zN4$default);
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
                SpacerKt.Spacer(SizeKt.m1033height3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(8.0f)), composer2, 6);
                getIconTintMode.TuitionPaymentFragmentbindingInflater1(R.drawable.bg_art_scholarship, composer2, 6);
                getIconTintMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1("Pilih Penerima Beasiswa", "Silahkan pilih Anak Penerima Manfaat", composer2, 54);
                setAlphabeticShortcut.TuitionPaymentFragmentbindingInflater1(state.getValue(), getratiobypercentage, function0, composer2, 0);
                SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer2, 0);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer2.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }

        TuitionPaymentFragmentbindingInflater1(getRatioByPercentage getratiobypercentage, Function0<Unit> function0, State<updateTextButtonVisibility> state) {
            this.TuitionPaymentFragmentbindingInflater1 = getratiobypercentage;
            this.b = function0;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = state;
        }
    }

    static final void TuitionPaymentFragmentbindingInflater1(final updateTextButtonVisibility updatetextbuttonvisibility, final getRatioByPercentage getratiobypercentage, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1850285954);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(updatetextbuttonvisibility) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(getratiobypercentage) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1850285954, i2, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.GranteeList (ScholarshipHistoryParticipant.kt:59)");
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalM882spacedBy0680j_4 = Arrangement.INSTANCE.m882spacedBy0680j_4(Dp.m6935constructorimpl(12.0f));
            PaddingValues paddingValuesM999PaddingValuesa9UjIt4$default = PaddingKt.m999PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6935constructorimpl(8.0f), 7, null);
            Arrangement.HorizontalOrVertical horizontalOrVertical = horizontalOrVerticalM882spacedBy0680j_4;
            composerStartRestartGroup.startReplaceGroup(2124524056);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(updatetextbuttonvisibility);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(getratiobypercentage);
            boolean z = (i2 & 896) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance | zChangedInstance2 | z) || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: setExclusiveCheckable
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        updateTextButtonVisibility updatetextbuttonvisibility2 = updatetextbuttonvisibility;
                        final getRatioByPercentage getratiobypercentage2 = getratiobypercentage;
                        final Function0 function1 = function0;
                        LazyListScope lazyListScope = (LazyListScope) obj;
                        Intrinsics.checkNotNullParameter(lazyListScope, "");
                        final List<ScholarshipDataEligible> list = updatetextbuttonvisibility2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        final Function1 function2 = new Function1() { // from class: setChecked
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                ScholarshipDataEligible scholarshipDataEligible = (ScholarshipDataEligible) obj2;
                                Intrinsics.checkNotNullParameter(scholarshipDataEligible, "");
                                String nik = scholarshipDataEligible.getNik();
                                return nik == null ? "" : nik;
                            }
                        };
                        final ScholarshipHistoryParticipantKt$GranteeList$lambda$6$lambda$5$$inlined$items$default$1 scholarshipHistoryParticipantKt$GranteeList$lambda$6$lambda$5$$inlined$items$default$1 = new Function1() { // from class: com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipHistoryParticipantKt$GranteeList$lambda$6$lambda$5$$inlined$items$default$1
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                            public final Void invoke(ScholarshipDataEligible scholarshipDataEligible) {
                                return null;
                            }
                        };
                        lazyListScope.items(list.size(), new Function1<Integer, Object>() { // from class: com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipHistoryParticipantKt$GranteeList$lambda$6$lambda$5$$inlined$items$default$2
                            @Override // kotlin.jvm.functions.Function1
                            public final /* synthetic */ Object invoke(Integer num) {
                                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(num.intValue());
                            }

                            public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i3) {
                                return function2.invoke(list.get(i3));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        }, new Function1<Integer, Object>() { // from class: com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipHistoryParticipantKt$GranteeList$lambda$6$lambda$5$$inlined$items$default$3
                            @Override // kotlin.jvm.functions.Function1
                            public final /* synthetic */ Object invoke(Integer num) {
                                return TuitionPaymentFragmentbindingInflater1(num.intValue());
                            }

                            public final Object TuitionPaymentFragmentbindingInflater1(int i3) {
                                return scholarshipHistoryParticipantKt$GranteeList$lambda$6$lambda$5$$inlined$items$default$1.invoke(list.get(i3));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipHistoryParticipantKt$GranteeList$lambda$6$lambda$5$$inlined$items$default$4
                            @Override // kotlin.jvm.functions.Function4
                            public final /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer3, Integer num2) {
                                b(lazyItemScope, num.intValue(), composer3, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void b(LazyItemScope lazyItemScope, int i3, Composer composer3, int i4) {
                                int i5;
                                if ((i4 & 6) == 0) {
                                    i5 = (composer3.changed(lazyItemScope) ? 4 : 2) | i4;
                                } else {
                                    i5 = i4;
                                }
                                if ((i4 & 48) == 0) {
                                    i5 |= composer3.changed(i3) ? 32 : 16;
                                }
                                if ((i5 & 147) == 146 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-632812321, i5, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                                }
                                ScholarshipDataEligible scholarshipDataEligible = (ScholarshipDataEligible) list.get(i3);
                                composer3.startReplaceGroup(166525810);
                                String nik = scholarshipDataEligible.getNik();
                                String str = nik == null ? "" : nik;
                                String name = scholarshipDataEligible.getName();
                                String str2 = name == null ? "" : name;
                                composer3.startReplaceGroup(836660576);
                                boolean zChangedInstance3 = composer3.changedInstance(getratiobypercentage2);
                                boolean zChanged = composer3.changed(str);
                                boolean zChanged2 = composer3.changed(function1);
                                Object objRememberedValue2 = composer3.rememberedValue();
                                if ((zChangedInstance3 | zChanged | zChanged2) || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = (Function0) new setAlphabeticShortcut.b(getratiobypercentage2, str, function1);
                                    composer3.updateRememberedValue(objRememberedValue2);
                                }
                                composer3.endReplaceGroup();
                                SupportActionModeWrapperCallbackWrapper supportActionModeWrapperCallbackWrapper = SupportActionModeWrapperCallbackWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                onActionViewCollapsed.TuitionPaymentFragmentbindingInflater1(str2, str, (Function0) objRememberedValue2, SupportActionModeWrapperCallbackWrapper.TuitionPaymentFragmentbindingInflater1(), false, false, composer3, 3072, 48);
                                composer3.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(4);
                            }
                        }));
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            LazyDslKt.LazyColumn(null, null, paddingValuesM999PaddingValuesa9UjIt4$default, false, horizontalOrVertical, null, null, false, (Function1) objRememberedValue, composerStartRestartGroup, 24960, 235);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: setIconTintMode
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    setAlphabeticShortcut.TuitionPaymentFragmentbindingInflater1(updatetextbuttonvisibility, getratiobypercentage, function0, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final class b implements Function0<Unit> {
        private /* synthetic */ Function0<Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private /* synthetic */ getRatioByPercentage b;

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            Object next;
            getRatioByPercentage getratiobypercentage = this.b;
            String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator<T> it = getratiobypercentage.a.TuitionPaymentFragmentspecialinlinedviewModeldefault1().TuitionPaymentFragmentspecialinlinedviewModeldefault1.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.areEqual(((ScholarshipDataEligible) next).getNik(), str));
            ScholarshipDataEligible scholarshipDataEligible = (ScholarshipDataEligible) next;
            getratiobypercentage.onTransact.b(scholarshipDataEligible != null ? CollectionsKt.listOf(scholarshipDataEligible) : CollectionsKt.emptyList());
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.invoke();
            return Unit.INSTANCE;
        }

        public b(getRatioByPercentage getratiobypercentage, String str, Function0<Unit> function0) {
            this.b = getratiobypercentage;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function0;
        }
    }
}
