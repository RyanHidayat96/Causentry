package defpackage;

import android.os.Bundle;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.PointerIconCompat;
import androidx.p002lifecycle.SavedStateHandle;
import androidx.p005navigation.NamedNavArgument;
import androidx.p005navigation.NamedNavArgumentKt;
import androidx.p005navigation.NavArgumentBuilder;
import androidx.p005navigation.NavBackStackEntry;
import androidx.p005navigation.NavController;
import androidx.p005navigation.NavGraphBuilder;
import androidx.p005navigation.NavHostController;
import androidx.p005navigation.NavOptions;
import androidx.p005navigation.NavOptionsBuilder;
import androidx.p005navigation.NavType;
import androidx.p005navigation.Navigator;
import androidx.p005navigation.PopUpToBuilder;
import androidx.p005navigation.p006compose.NavGraphBuilderKt;
import androidx.p005navigation.p006compose.NavHostKt;
import com.bpjstku.domain.scholarship.model.ScholarPersonDetail;
import java.text.ParseException;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class shouldAllowTextWithIcon {
    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final NavHostController navHostController, final getRatioByPercentage getratiobypercentage, final lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, final generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist, final populateOptionsMenu populateoptionsmenu, final ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities, final IntegerRes integerRes, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composer3;
        Intrinsics.checkNotNullParameter(navHostController, "");
        Intrinsics.checkNotNullParameter(getratiobypercentage, "");
        Intrinsics.checkNotNullParameter(lambdaenabletorch1androidxcameracamera2internaltorchcontrol, "");
        Intrinsics.checkNotNullParameter(generateultrahdrsupportedcombinationlist, "");
        Intrinsics.checkNotNullParameter(populateoptionsmenu, "");
        Intrinsics.checkNotNullParameter(activityResultContractsPickVisualMediaMediaCapabilities, "");
        Intrinsics.checkNotNullParameter(integerRes, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(160600108);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(navHostController) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(getratiobypercentage) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(lambdaenabletorch1androidxcameracamera2internaltorchcontrol) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(generateultrahdrsupportedcombinationlist) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(populateoptionsmenu) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(integerRes) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if ((4793491 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(160600108, i3, -1, "com.bpjstku.presentation.compose.navigation.ScholarshipNavHost (ScholarshipNavGraph.kt:33)");
            }
            String str = bindItemView.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INSTANCE.b;
            composerStartRestartGroup.startReplaceGroup(1888751372);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(navHostController);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(getratiobypercentage);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(lambdaenabletorch1androidxcameracamera2internaltorchcontrol);
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(populateoptionsmenu);
            boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
            boolean zChangedInstance6 = composerStartRestartGroup.changedInstance(integerRes);
            boolean z = (i3 & 29360128) == 8388608;
            boolean zChangedInstance7 = composerStartRestartGroup.changedInstance(generateultrahdrsupportedcombinationlist);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (((zChangedInstance | zChangedInstance2 | zChangedInstance3 | zChangedInstance4 | zChangedInstance5 | zChangedInstance6 | z) || zChangedInstance7) || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composer2 = composerStartRestartGroup;
                Function1 function1 = new Function1() { // from class: getAccessibilityClassName
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        NavHostController navHostController2 = navHostController;
                        getRatioByPercentage getratiobypercentage2 = getratiobypercentage;
                        lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol2 = lambdaenabletorch1androidxcameracamera2internaltorchcontrol;
                        populateOptionsMenu populateoptionsmenu2 = populateoptionsmenu;
                        ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities2 = activityResultContractsPickVisualMediaMediaCapabilities;
                        IntegerRes integerRes2 = integerRes;
                        Function0 function2 = function0;
                        generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist2 = generateultrahdrsupportedcombinationlist;
                        NavGraphBuilder navGraphBuilder = (NavGraphBuilder) obj;
                        Intrinsics.checkNotNullParameter(navGraphBuilder, "");
                        Intrinsics.checkNotNullParameter(navGraphBuilder, "");
                        Intrinsics.checkNotNullParameter(navHostController2, "");
                        Intrinsics.checkNotNullParameter(getratiobypercentage2, "");
                        Intrinsics.checkNotNullParameter(lambdaenabletorch1androidxcameracamera2internaltorchcontrol2, "");
                        Intrinsics.checkNotNullParameter(populateoptionsmenu2, "");
                        Intrinsics.checkNotNullParameter(activityResultContractsPickVisualMediaMediaCapabilities2, "");
                        Intrinsics.checkNotNullParameter(integerRes2, "");
                        NavGraphBuilderKt.composable$default(navGraphBuilder, bindItemView.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE.b, (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(1759739707, true, new shouldAllowTextWithIcon.TuitionPaymentFragmentspecialinlinedviewModeldefault1(getratiobypercentage2, activityResultContractsPickVisualMediaMediaCapabilities2, navHostController2, lambdaenabletorch1androidxcameracamera2internaltorchcontrol2, populateoptionsmenu2, integerRes2)), 254, (Object) null);
                        Intrinsics.checkNotNullParameter(navGraphBuilder, "");
                        Intrinsics.checkNotNullParameter(navHostController2, "");
                        Intrinsics.checkNotNullParameter(lambdaenabletorch1androidxcameracamera2internaltorchcontrol2, "");
                        Intrinsics.checkNotNullParameter(getratiobypercentage2, "");
                        Intrinsics.checkNotNullParameter(activityResultContractsPickVisualMediaMediaCapabilities2, "");
                        NavGraphBuilderKt.composable$default(navGraphBuilder, bindItemView.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INSTANCE.b, CollectionsKt.listOf((Object[]) new NamedNavArgument[]{NamedNavArgumentKt.navArgument("childIndex", new Function1() { // from class: initialize
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                NavArgumentBuilder navArgumentBuilder = (NavArgumentBuilder) obj2;
                                Intrinsics.checkNotNullParameter(navArgumentBuilder, "");
                                navArgumentBuilder.setType(NavType.IntType);
                                return Unit.INSTANCE;
                            }
                        }), NamedNavArgumentKt.navArgument("totalChild", new Function1() { // from class: needsDividerBefore
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                NavArgumentBuilder navArgumentBuilder = (NavArgumentBuilder) obj2;
                                Intrinsics.checkNotNullParameter(navArgumentBuilder, "");
                                navArgumentBuilder.setType(NavType.IntType);
                                return Unit.INSTANCE;
                            }
                        })}), (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-1334426850, true, new shouldAllowTextWithIcon.TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdaenabletorch1androidxcameracamera2internaltorchcontrol2, activityResultContractsPickVisualMediaMediaCapabilities2, getratiobypercentage2, navHostController2)), 252, (Object) null);
                        Intrinsics.checkNotNullParameter(navGraphBuilder, "");
                        Intrinsics.checkNotNullParameter(navHostController2, "");
                        Intrinsics.checkNotNullParameter(activityResultContractsPickVisualMediaMediaCapabilities2, "");
                        Intrinsics.checkNotNullParameter(getratiobypercentage2, "");
                        Intrinsics.checkNotNullParameter(function2, "");
                        NavGraphBuilderKt.composable$default(navGraphBuilder, bindItemView.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INSTANCE.b, (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(1557785325, true, new shouldAllowTextWithIcon.TuitionPaymentFragmentspecialinlinedviewModeldefault3(activityResultContractsPickVisualMediaMediaCapabilities2, getratiobypercentage2, function2, navHostController2)), 254, (Object) null);
                        Intrinsics.checkNotNullParameter(navGraphBuilder, "");
                        Intrinsics.checkNotNullParameter(navHostController2, "");
                        Intrinsics.checkNotNullParameter(getratiobypercentage2, "");
                        NavGraphBuilderKt.composable$default(navGraphBuilder, bindItemView.b.INSTANCE.b, (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-21909195, true, new shouldAllowTextWithIcon.b(getratiobypercentage2, navHostController2)), 254, (Object) null);
                        Intrinsics.checkNotNullParameter(navGraphBuilder, "");
                        Intrinsics.checkNotNullParameter(navHostController2, "");
                        Intrinsics.checkNotNullParameter(lambdaenabletorch1androidxcameracamera2internaltorchcontrol2, "");
                        Intrinsics.checkNotNullParameter(getratiobypercentage2, "");
                        Intrinsics.checkNotNullParameter(activityResultContractsPickVisualMediaMediaCapabilities2, "");
                        NavGraphBuilderKt.composable$default(navGraphBuilder, bindItemView.a.INSTANCE.b, (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-922971411, true, new shouldAllowTextWithIcon.d(lambdaenabletorch1androidxcameracamera2internaltorchcontrol2, activityResultContractsPickVisualMediaMediaCapabilities2, getratiobypercentage2, navHostController2)), 254, (Object) null);
                        Intrinsics.checkNotNullParameter(navGraphBuilder, "");
                        Intrinsics.checkNotNullParameter(navHostController2, "");
                        Intrinsics.checkNotNullParameter(generateultrahdrsupportedcombinationlist2, "");
                        Intrinsics.checkNotNullParameter(activityResultContractsPickVisualMediaMediaCapabilities2, "");
                        Intrinsics.checkNotNullParameter(getratiobypercentage2, "");
                        NavGraphBuilderKt.composable$default(navGraphBuilder, bindItemView.TuitionPaymentFragmentbindingInflater1.INSTANCE.b, (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-1602813315, true, new shouldAllowTextWithIcon.TuitionPaymentFragmentbindingInflater1(generateultrahdrsupportedcombinationlist2, activityResultContractsPickVisualMediaMediaCapabilities2, getratiobypercentage2, navHostController2)), 254, (Object) null);
                        return Unit.INSTANCE;
                    }
                };
                composer2.updateRememberedValue(function1);
                objRememberedValue = function1;
            } else {
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceGroup();
            composer3 = composer2;
            NavHostKt.NavHost(navHostController, str, null, null, null, null, null, null, null, null, (Function1) objRememberedValue, composer2, i3 & 14, 0, PointerIconCompat.TYPE_GRAB);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: needsDividerAfter
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    shouldAllowTextWithIcon.TuitionPaymentFragmentspecialinlinedviewModeldefault3(navHostController, getratiobypercentage, lambdaenabletorch1androidxcameracamera2internaltorchcontrol, generateultrahdrsupportedcombinationlist, populateoptionsmenu, activityResultContractsPickVisualMediaMediaCapabilities, integerRes, function0, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
        private /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ NavHostController TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ lambdaenableTorch1androidxcameracamera2internalTorchControl TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ populateOptionsMenu TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private /* synthetic */ IntegerRes asInterface;
        private /* synthetic */ getRatioByPercentage b;

        @Override // kotlin.jvm.functions.Function4
        public final /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(animatedContentScope, "");
            Intrinsics.checkNotNullParameter(navBackStackEntry, "");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1759739707, iIntValue, -1, "com.bpjstku.presentation.compose.navigation.addScholarshipGranteeScreen.<anonymous> (ScholarshipNavGraph.kt:91)");
            }
            getRatioByPercentage getratiobypercentage = this.b;
            ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities = this.TuitionPaymentFragmentbindingInflater1;
            composer2.startReplaceGroup(-2041374776);
            boolean zChangedInstance = composer2.changedInstance(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            final NavHostController navHostController = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Object objRememberedValue = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: setPadding
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return shouldAllowTextWithIcon.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(navHostController);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer2.endReplaceGroup();
            lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            populateOptionsMenu populateoptionsmenu = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            IntegerRes integerRes = this.asInterface;
            composer2.startReplaceGroup(-2041399352);
            boolean zChangedInstance2 = composer2.changedInstance(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            final NavHostController navHostController2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function4() { // from class: setItemInvoker
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        SavedStateHandle savedStateHandle;
                        SavedStateHandle savedStateHandle2;
                        NavHostController navHostController3 = navHostController2;
                        int iIntValue2 = ((Integer) obj).intValue();
                        ScholarPersonDetail scholarPersonDetail = (ScholarPersonDetail) obj2;
                        ScholarPersonDetail scholarPersonDetail2 = (ScholarPersonDetail) obj3;
                        int iIntValue3 = ((Integer) obj4).intValue();
                        Intrinsics.checkNotNullParameter(scholarPersonDetail, "");
                        bindItemView.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = bindItemView.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INSTANCE;
                        NavController.navigate$default((NavController) navHostController3, bindItemView.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(iIntValue2, iIntValue3), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                        NavBackStackEntry currentBackStackEntry = navHostController3.getCurrentBackStackEntry();
                        if (currentBackStackEntry != null && (savedStateHandle2 = currentBackStackEntry.getSavedStateHandle()) != null) {
                            savedStateHandle2.set("selectedChild", scholarPersonDetail);
                        }
                        NavBackStackEntry currentBackStackEntry2 = navHostController3.getCurrentBackStackEntry();
                        if (currentBackStackEntry2 != null && (savedStateHandle = currentBackStackEntry2.getSavedStateHandle()) != null) {
                            savedStateHandle.set("nextChild", scholarPersonDetail2);
                        }
                        bindItemView.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = bindItemView.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INSTANCE;
                        NavBackStackEntry backStackEntry = navHostController3.getBackStackEntry(bindItemView.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(iIntValue2, iIntValue3));
                        backStackEntry.getSavedStateHandle().set("selectedChild", scholarPersonDetail);
                        backStackEntry.getSavedStateHandle().set("nextChild", scholarPersonDetail2);
                        return Unit.INSTANCE;
                    }
                };
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceGroup();
            getIconTintMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getratiobypercentage, activityResultContractsPickVisualMediaMediaCapabilities, function0, lambdaenabletorch1androidxcameracamera2internaltorchcontrol, populateoptionsmenu, integerRes, (Function4) objRememberedValue2, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(NavHostController navHostController) {
            navHostController.popBackStack();
            return Unit.INSTANCE;
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault1(getRatioByPercentage getratiobypercentage, ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities, NavHostController navHostController, lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, populateOptionsMenu populateoptionsmenu, IntegerRes integerRes) {
            this.b = getratiobypercentage;
            this.TuitionPaymentFragmentbindingInflater1 = activityResultContractsPickVisualMediaMediaCapabilities;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = navHostController;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdaenabletorch1androidxcameracamera2internaltorchcontrol;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = populateoptionsmenu;
            this.asInterface = integerRes;
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
        private /* synthetic */ getRatioByPercentage TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ NavHostController TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ lambdaenableTorch1androidxcameracamera2internalTorchControl TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities b;

        @Override // kotlin.jvm.functions.Function4
        public final /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) throws ParseException {
            NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(animatedContentScope, "");
            Intrinsics.checkNotNullParameter(navBackStackEntry2, "");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1334426850, iIntValue, -1, "com.bpjstku.presentation.compose.navigation.addScholarFormScreen.<anonymous> (ScholarshipNavGraph.kt:126)");
            }
            SavedStateHandle savedStateHandle = navBackStackEntry2.getSavedStateHandle();
            ScholarPersonDetail scholarPersonDetail = (ScholarPersonDetail) savedStateHandle.get("selectedChild");
            final ScholarPersonDetail scholarPersonDetail2 = (ScholarPersonDetail) savedStateHandle.get("nextChild");
            Bundle arguments = navBackStackEntry2.getArguments();
            int i = arguments != null ? arguments.getInt("childIndex") : 0;
            Bundle arguments2 = navBackStackEntry2.getArguments();
            final int i2 = arguments2 != null ? arguments2.getInt("totalChild") : 0;
            lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities = this.b;
            getRatioByPercentage getratiobypercentage = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            composer2.startReplaceGroup(1417423405);
            boolean zChangedInstance = composer2.changedInstance(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            boolean zChangedInstance2 = composer2.changedInstance(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            boolean zChanged = composer2.changed(i2);
            boolean zChangedInstance3 = composer2.changedInstance(scholarPersonDetail2);
            final getRatioByPercentage getratiobypercentage2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            final NavHostController navHostController = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Object objRememberedValue = composer2.rememberedValue();
            if ((zChangedInstance | zChangedInstance2 | zChanged | zChangedInstance3) || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: hasText
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return shouldAllowTextWithIcon.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(getratiobypercentage2, navHostController, i2, scholarPersonDetail2, ((Integer) obj).intValue());
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(1417448818);
            boolean zChangedInstance4 = composer2.changedInstance(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            final NavHostController navHostController2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChangedInstance4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: onMeasure
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return shouldAllowTextWithIcon.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(navHostController2);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceGroup();
            parseMenu.TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdaenabletorch1androidxcameracamera2internaltorchcontrol, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, scholarPersonDetail, i2, i, null, function1, (Function0) objRememberedValue2, composer2, 0, 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(NavHostController navHostController) {
            navHostController.popBackStack();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(getRatioByPercentage getratiobypercentage, NavHostController navHostController, int i, ScholarPersonDetail scholarPersonDetail, int i2) {
            SavedStateHandle savedStateHandle;
            if (i2 < getratiobypercentage.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault1().size()) {
                bindItemView.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = bindItemView.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INSTANCE;
                NavController.navigate$default((NavController) navHostController, bindItemView.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(i2, i), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                NavBackStackEntry currentBackStackEntry = navHostController.getCurrentBackStackEntry();
                if (currentBackStackEntry != null && (savedStateHandle = currentBackStackEntry.getSavedStateHandle()) != null) {
                    savedStateHandle.set("selectedChild", scholarPersonDetail);
                }
                bindItemView.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = bindItemView.TuitionPaymentFragmentspecialinlinedviewModeldefault2.INSTANCE;
                navHostController.getBackStackEntry(bindItemView.TuitionPaymentFragmentspecialinlinedviewModeldefault2.b(i2, i)).getSavedStateHandle().set("selectedChild", scholarPersonDetail);
            } else {
                NavController.navigate$default((NavController) navHostController, bindItemView.a.INSTANCE.b, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
            }
            return Unit.INSTANCE;
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities, getRatioByPercentage getratiobypercentage, NavHostController navHostController) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdaenabletorch1androidxcameracamera2internaltorchcontrol;
            this.b = activityResultContractsPickVisualMediaMediaCapabilities;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getratiobypercentage;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = navHostController;
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
        private /* synthetic */ NavHostController TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ getRatioByPercentage TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private /* synthetic */ Function0<Unit> b;

        @Override // kotlin.jvm.functions.Function4
        public final /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(animatedContentScope, "");
            Intrinsics.checkNotNullParameter(navBackStackEntry, "");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1557785325, iIntValue, -1, "com.bpjstku.presentation.compose.navigation.addScholarshipConfirmationScreen.<anonymous> (ScholarshipNavGraph.kt:166)");
            }
            ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            getRatioByPercentage getratiobypercentage = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            composer2.startReplaceGroup(1735915273);
            boolean zChanged = composer2.changed(this.b);
            final Function0<Unit> function0 = this.b;
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: setExpandedFormat
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return shouldAllowTextWithIcon.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function0);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            Function0 function1 = (Function0) objRememberedValue;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(1735917654);
            boolean zChangedInstance = composer2.changedInstance(this.TuitionPaymentFragmentbindingInflater1);
            final NavHostController navHostController = this.TuitionPaymentFragmentbindingInflater1;
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: prefersCondensedTitle
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return shouldAllowTextWithIcon.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(navHostController);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue2);
            }
            Function0 function2 = (Function0) objRememberedValue2;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(1735921441);
            boolean zChangedInstance2 = composer2.changedInstance(this.TuitionPaymentFragmentbindingInflater1);
            final NavHostController navHostController2 = this.TuitionPaymentFragmentbindingInflater1;
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: onTouchEvent
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return shouldAllowTextWithIcon.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(navHostController2);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceGroup();
            onWindowFocusChanged.b(activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, function1, function2, (Function0) objRememberedValue3, composer2, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(NavHostController navHostController) {
            NavController.navigate$default((NavController) navHostController, bindItemView.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE.b, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(NavHostController navHostController) {
            NavController.navigate$default((NavController) navHostController, bindItemView.b.INSTANCE.b, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
            return Unit.INSTANCE;
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities, getRatioByPercentage getratiobypercentage, Function0<Unit> function0, NavHostController navHostController) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = activityResultContractsPickVisualMediaMediaCapabilities;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getratiobypercentage;
            this.b = function0;
            this.TuitionPaymentFragmentbindingInflater1 = navHostController;
        }
    }

    static final class b implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
        private /* synthetic */ NavHostController TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ getRatioByPercentage TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        @Override // kotlin.jvm.functions.Function4
        public final /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(animatedContentScope, "");
            Intrinsics.checkNotNullParameter(navBackStackEntry, "");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-21909195, iIntValue, -1, "com.bpjstku.presentation.compose.navigation.addScholarshipHistoryScreen.<anonymous> (ScholarshipNavGraph.kt:187)");
            }
            getRatioByPercentage getratiobypercentage = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            composer2.startReplaceGroup(1077295200);
            boolean zChangedInstance = composer2.changedInstance(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            final NavHostController navHostController = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Object objRememberedValue = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: showsIcon
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return shouldAllowTextWithIcon.b.TuitionPaymentFragmentspecialinlinedviewModeldefault1(navHostController);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(1077297019);
            boolean zChangedInstance2 = composer2.changedInstance(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            final NavHostController navHostController2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Object objRememberedValue2 = composer2.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: ActionMenuItemViewActionMenuItemForwardingListener
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return shouldAllowTextWithIcon.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2(navHostController2);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceGroup();
            setAlphabeticShortcut.TuitionPaymentFragmentspecialinlinedviewModeldefault2(getratiobypercentage, function0, (Function0) objRememberedValue2, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(NavHostController navHostController) {
            NavController.navigate$default((NavController) navHostController, bindItemView.TuitionPaymentFragmentbindingInflater1.INSTANCE.b, (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(NavHostController navHostController) {
            navHostController.popBackStack();
            return Unit.INSTANCE;
        }

        b(getRatioByPercentage getratiobypercentage, NavHostController navHostController) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = getratiobypercentage;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = navHostController;
        }
    }

    static final class d implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
        private /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ getRatioByPercentage TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ lambdaenableTorch1androidxcameracamera2internalTorchControl TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ NavHostController TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        @Override // kotlin.jvm.functions.Function4
        public final /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(animatedContentScope, "");
            Intrinsics.checkNotNullParameter(navBackStackEntry, "");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-922971411, iIntValue, -1, "com.bpjstku.presentation.compose.navigation.addSubmissionConfirmationScreen.<anonymous> (ScholarshipNavGraph.kt:202)");
            }
            lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities = this.TuitionPaymentFragmentbindingInflater1;
            getRatioByPercentage getratiobypercentage = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            composer2.startReplaceGroup(-612054897);
            boolean zChangedInstance = composer2.changedInstance(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            final NavHostController navHostController = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object objRememberedValue = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: addItemView
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return shouldAllowTextWithIcon.d.TuitionPaymentFragmentbindingInflater1(navHostController);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(-612052761);
            boolean zChangedInstance2 = composer2.changedInstance(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            boolean zChangedInstance3 = composer2.changedInstance(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            final getRatioByPercentage getratiobypercentage2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            final NavHostController navHostController2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object objRememberedValue2 = composer2.rememberedValue();
            if ((zChangedInstance2 | zChangedInstance3) || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: ActionMenuItemViewPopupCallback
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return shouldAllowTextWithIcon.d.TuitionPaymentFragmentbindingInflater1(getratiobypercentage2, navHostController2);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceGroup();
            setCheckable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaenabletorch1androidxcameracamera2internaltorchcontrol, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, function0, (Function0) objRememberedValue2, composer2, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(PopUpToBuilder popUpToBuilder) {
            Intrinsics.checkNotNullParameter(popUpToBuilder, "");
            popUpToBuilder.setInclusive(true);
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(getRatioByPercentage getratiobypercentage, NavHostController navHostController) {
            getratiobypercentage.RemoteActionCompatParcelizer.b(Boolean.TRUE);
            navHostController.navigate(bindItemView.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INSTANCE.b, new Function1() { // from class: onForwardingStarted
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return shouldAllowTextWithIcon.d.TuitionPaymentFragmentspecialinlinedviewModeldefault2((NavOptionsBuilder) obj);
                }
            });
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(NavHostController navHostController) {
            navHostController.popBackStack();
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(NavOptionsBuilder navOptionsBuilder) {
            Intrinsics.checkNotNullParameter(navOptionsBuilder, "");
            navOptionsBuilder.popUpTo(bindItemView.TuitionPaymentFragmentspecialinlinedviewModeldefault3.INSTANCE.b, new Function1() { // from class: getPopup
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return shouldAllowTextWithIcon.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1((PopUpToBuilder) obj);
                }
            });
            navOptionsBuilder.setLaunchSingleTop(true);
            return Unit.INSTANCE;
        }

        d(lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities, getRatioByPercentage getratiobypercentage, NavHostController navHostController) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdaenabletorch1androidxcameracamera2internaltorchcontrol;
            this.TuitionPaymentFragmentbindingInflater1 = activityResultContractsPickVisualMediaMediaCapabilities;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getratiobypercentage;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = navHostController;
        }
    }

    static final class TuitionPaymentFragmentbindingInflater1 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
        private /* synthetic */ generateUltraHdrSupportedCombinationList TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ getRatioByPercentage TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private /* synthetic */ NavHostController b;

        @Override // kotlin.jvm.functions.Function4
        public final /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(animatedContentScope, "");
            Intrinsics.checkNotNullParameter(navBackStackEntry, "");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1602813315, iIntValue, -1, "com.bpjstku.presentation.compose.navigation.addScholarshipHistoryScreen.<anonymous> (ScholarshipNavGraph.kt:227)");
            }
            generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist = this.TuitionPaymentFragmentbindingInflater1;
            ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            getRatioByPercentage getratiobypercentage = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            composer2.startReplaceGroup(1077347932);
            boolean zChangedInstance = composer2.changedInstance(this.b);
            final NavHostController navHostController = this.b;
            Object objRememberedValue = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: setPopupCallback
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return shouldAllowTextWithIcon.TuitionPaymentFragmentbindingInflater1.b(navHostController);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            getWrapped.TuitionPaymentFragmentspecialinlinedviewModeldefault2(generateultrahdrsupportedcombinationlist, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, (Function0) objRememberedValue, composer2, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit b(NavHostController navHostController) {
            navHostController.popBackStack();
            return Unit.INSTANCE;
        }

        TuitionPaymentFragmentbindingInflater1(generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist, ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities, getRatioByPercentage getratiobypercentage, NavHostController navHostController) {
            this.TuitionPaymentFragmentbindingInflater1 = generateultrahdrsupportedcombinationlist;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = activityResultContractsPickVisualMediaMediaCapabilities;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = getratiobypercentage;
            this.b = navHostController;
        }
    }
}
