package defpackage;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.p002lifecycle.Lifecycle;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.p003compose.FlowExtKt;
import com.bpjstku.domain.scholarship.model.ScholarBenefit;
import com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarHistoryScreenKt$ScholarshipHistoryScreen$2$1;
import com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarHistoryScreenKt$ScholarshipHistoryScreen$4$1;
import com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarHistoryScreenKt$ScholarshipHistoryScreen$5$invoke$lambda$3$lambda$2$lambda$1$$inlined$items$default$1;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.SupportMenuInflater;
import defpackage.getCameraOperatingMode;
import defpackage.initSession;
import java.lang.reflect.Method;
import java.text.ParseException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class getWrapped {
    /* JADX WARN: Code duplicated, block: B:49:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:63:0x0127  */
    /* JADX WARN: Code duplicated, block: B:66:0x0148  */
    /* JADX WARN: Code duplicated, block: B:69:0x0172  */
    /* JADX WARN: Code duplicated, block: B:71:0x017a  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x0230  */
    /* JADX WARN: Code duplicated, block: B:86:0x023a  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(final generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist, final ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities, final getRatioByPercentage getratiobypercentage, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function1;
        int i4;
        Function0<Unit> function2;
        Context context;
        Object objRememberedValue;
        MutableState mutableState;
        State stateCollectAsStateWithLifecycle;
        State stateCollectAsStateWithLifecycle2;
        Object objRememberedValue2;
        final MutableState mutableState2;
        Object objRememberedValue3;
        SnapshotStateList snapshotStateList;
        StateListDrawableCompat stateListDrawableCompatTuitionPaymentFragmentbindingInflater1;
        boolean zChanged;
        boolean zChangedInstance;
        ScholarHistoryScreenKt$ScholarshipHistoryScreen$2$1 scholarHistoryScreenKt$ScholarshipHistoryScreen$2$1RememberedValue;
        Object objRememberedValue4;
        boolean zChanged2;
        boolean zChanged3;
        boolean zChangedInstance2;
        boolean zChangedInstance3;
        ScholarHistoryScreenKt$ScholarshipHistoryScreen$4$1 scholarHistoryScreenKt$ScholarshipHistoryScreen$4$1RememberedValue;
        final Function0<Unit> function3;
        Object objRememberedValue5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(generateultrahdrsupportedcombinationlist, "");
        Intrinsics.checkNotNullParameter(activityResultContractsPickVisualMediaMediaCapabilities, "");
        Intrinsics.checkNotNullParameter(getratiobypercentage, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1593153568);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(generateultrahdrsupportedcombinationlist) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(getratiobypercentage) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                function1 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i5 != 0) {
                    composerStartRestartGroup.startReplaceGroup(-541605790);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new onActionModeFinished();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function2 = (Function0) objRememberedValue5;
                } else {
                    function2 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1593153568, i4, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipHistoryScreen (ScholarHistoryScreen.kt:40)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceGroup(-541603689);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.INotificationSideChannel, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                stateCollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(generateultrahdrsupportedcombinationlist.INotificationSideChannelStub, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceGroup(-541595142);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                mutableState2 = (MutableState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-541592559);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt.mutableStateListOf();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                snapshotStateList = (SnapshotStateList) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                stateListDrawableCompatTuitionPaymentFragmentbindingInflater1 = getStateDrawable.TuitionPaymentFragmentbindingInflater1(composerStartRestartGroup);
                Unit unit = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-541588309);
                zChanged = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle);
                zChangedInstance = composerStartRestartGroup.changedInstance(generateultrahdrsupportedcombinationlist);
                scholarHistoryScreenKt$ScholarshipHistoryScreen$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(zChanged | zChangedInstance) || scholarHistoryScreenKt$ScholarshipHistoryScreen$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    scholarHistoryScreenKt$ScholarshipHistoryScreen$2$1RememberedValue = new ScholarHistoryScreenKt$ScholarshipHistoryScreen$2$1(generateultrahdrsupportedcombinationlist, mutableState, stateCollectAsStateWithLifecycle, null);
                    composerStartRestartGroup.updateRememberedValue(scholarHistoryScreenKt$ScholarshipHistoryScreen$2$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarHistoryScreenKt$ScholarshipHistoryScreen$2$1RememberedValue, composerStartRestartGroup, 6);
                setArrowHeadLength setarrowheadlength = (setArrowHeadLength) mutableState2.getValue();
                composerStartRestartGroup.startReplaceGroup(-541579736);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: onActionModeStarted
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            mutableState2.setValue(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                getArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setarrowheadlength, (Function0) objRememberedValue4, composerStartRestartGroup, 48);
                VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle2.getValue();
                composerStartRestartGroup.startReplaceGroup(-541576422);
                zChanged2 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle2);
                zChanged3 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(generateultrahdrsupportedcombinationlist);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(context);
                scholarHistoryScreenKt$ScholarshipHistoryScreen$4$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(zChanged2 | zChanged3 | zChangedInstance2 | zChangedInstance3) || scholarHistoryScreenKt$ScholarshipHistoryScreen$4$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                    scholarHistoryScreenKt$ScholarshipHistoryScreen$4$1RememberedValue = new ScholarHistoryScreenKt$ScholarshipHistoryScreen$4$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, snapshotStateList, generateultrahdrsupportedcombinationlist, mutableState2, context, stateCollectAsStateWithLifecycle2, null);
                    composerStartRestartGroup.updateRememberedValue(scholarHistoryScreenKt$ScholarshipHistoryScreen$4$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(virtualCameraAdapter1, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarHistoryScreenKt$ScholarshipHistoryScreen$4$1RememberedValue, composerStartRestartGroup, 0);
                getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Riwayat Konfirmasi", ComposableLambdaKt.rememberComposableLambda(-568359580, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(snapshotStateList), composerStartRestartGroup, 54), function2, null, composerStartRestartGroup, ((i4 >> 3) & 896) | 54, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function2;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function3 = function1;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: WindowCallbackWrapperApi23Impl
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist2 = generateultrahdrsupportedcombinationlist;
                        ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities2 = activityResultContractsPickVisualMediaMediaCapabilities;
                        getRatioByPercentage getratiobypercentage2 = getratiobypercentage;
                        Function0 function4 = function3;
                        int i6 = i;
                        getWrapped.TuitionPaymentFragmentspecialinlinedviewModeldefault2(generateultrahdrsupportedcombinationlist2, activityResultContractsPickVisualMediaMediaCapabilities2, getratiobypercentage2, function4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i6 | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= 3072;
        function1 = function0;
        i4 = i3;
        if ((i4 & 1171) == 1170) {
            if (i5 != 0) {
                composerStartRestartGroup.startReplaceGroup(-541605790);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new onActionModeFinished();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                function2 = (Function0) objRememberedValue5;
            } else {
                function2 = function1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1593153568, i4, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipHistoryScreen (ScholarHistoryScreen.kt:40)");
            }
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(-541603689);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.INotificationSideChannel, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            stateCollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(generateultrahdrsupportedcombinationlist.INotificationSideChannelStub, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            composerStartRestartGroup.startReplaceGroup(-541595142);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            mutableState2 = (MutableState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-541592559);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            snapshotStateList = (SnapshotStateList) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            stateListDrawableCompatTuitionPaymentFragmentbindingInflater1 = getStateDrawable.TuitionPaymentFragmentbindingInflater1(composerStartRestartGroup);
            Unit unit2 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-541588309);
            zChanged = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle);
            zChangedInstance = composerStartRestartGroup.changedInstance(generateultrahdrsupportedcombinationlist);
            scholarHistoryScreenKt$ScholarshipHistoryScreen$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (!(zChanged | zChangedInstance)) {
                scholarHistoryScreenKt$ScholarshipHistoryScreen$2$1RememberedValue = new ScholarHistoryScreenKt$ScholarshipHistoryScreen$2$1(generateultrahdrsupportedcombinationlist, mutableState, stateCollectAsStateWithLifecycle, null);
                composerStartRestartGroup.updateRememberedValue(scholarHistoryScreenKt$ScholarshipHistoryScreen$2$1RememberedValue);
            } else {
                scholarHistoryScreenKt$ScholarshipHistoryScreen$2$1RememberedValue = new ScholarHistoryScreenKt$ScholarshipHistoryScreen$2$1(generateultrahdrsupportedcombinationlist, mutableState, stateCollectAsStateWithLifecycle, null);
                composerStartRestartGroup.updateRememberedValue(scholarHistoryScreenKt$ScholarshipHistoryScreen$2$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarHistoryScreenKt$ScholarshipHistoryScreen$2$1RememberedValue, composerStartRestartGroup, 6);
            setArrowHeadLength setarrowheadlength2 = (setArrowHeadLength) mutableState2.getValue();
            composerStartRestartGroup.startReplaceGroup(-541579736);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: onActionModeStarted
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        mutableState2.setValue(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            getArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setarrowheadlength2, (Function0) objRememberedValue4, composerStartRestartGroup, 48);
            VirtualCameraAdapter1 virtualCameraAdapter2 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle2.getValue();
            composerStartRestartGroup.startReplaceGroup(-541576422);
            zChanged2 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle2);
            zChanged3 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
            zChangedInstance2 = composerStartRestartGroup.changedInstance(generateultrahdrsupportedcombinationlist);
            zChangedInstance3 = composerStartRestartGroup.changedInstance(context);
            scholarHistoryScreenKt$ScholarshipHistoryScreen$4$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (!(zChanged2 | zChanged3 | zChangedInstance2 | zChangedInstance3)) {
                scholarHistoryScreenKt$ScholarshipHistoryScreen$4$1RememberedValue = new ScholarHistoryScreenKt$ScholarshipHistoryScreen$4$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, snapshotStateList, generateultrahdrsupportedcombinationlist, mutableState2, context, stateCollectAsStateWithLifecycle2, null);
                composerStartRestartGroup.updateRememberedValue(scholarHistoryScreenKt$ScholarshipHistoryScreen$4$1RememberedValue);
            } else {
                scholarHistoryScreenKt$ScholarshipHistoryScreen$4$1RememberedValue = new ScholarHistoryScreenKt$ScholarshipHistoryScreen$4$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, snapshotStateList, generateultrahdrsupportedcombinationlist, mutableState2, context, stateCollectAsStateWithLifecycle2, null);
                composerStartRestartGroup.updateRememberedValue(scholarHistoryScreenKt$ScholarshipHistoryScreen$4$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(virtualCameraAdapter2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarHistoryScreenKt$ScholarshipHistoryScreen$4$1RememberedValue, composerStartRestartGroup, 0);
            getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Riwayat Konfirmasi", ComposableLambdaKt.rememberComposableLambda(-568359580, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(snapshotStateList), composerStartRestartGroup, 54), function2, null, composerStartRestartGroup, ((i4 >> 3) & 896) | 54, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function3 = function2;
        } else {
            if (i5 != 0) {
                composerStartRestartGroup.startReplaceGroup(-541605790);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new onActionModeFinished();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                function2 = (Function0) objRememberedValue5;
            } else {
                function2 = function1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1593153568, i4, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipHistoryScreen (ScholarHistoryScreen.kt:40)");
            }
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(-541603689);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.INotificationSideChannel, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            stateCollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(generateultrahdrsupportedcombinationlist.INotificationSideChannelStub, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            composerStartRestartGroup.startReplaceGroup(-541595142);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            mutableState2 = (MutableState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-541592559);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            snapshotStateList = (SnapshotStateList) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            stateListDrawableCompatTuitionPaymentFragmentbindingInflater1 = getStateDrawable.TuitionPaymentFragmentbindingInflater1(composerStartRestartGroup);
            Unit unit3 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-541588309);
            zChanged = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle);
            zChangedInstance = composerStartRestartGroup.changedInstance(generateultrahdrsupportedcombinationlist);
            scholarHistoryScreenKt$ScholarshipHistoryScreen$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (!(zChanged | zChangedInstance)) {
                scholarHistoryScreenKt$ScholarshipHistoryScreen$2$1RememberedValue = new ScholarHistoryScreenKt$ScholarshipHistoryScreen$2$1(generateultrahdrsupportedcombinationlist, mutableState, stateCollectAsStateWithLifecycle, null);
                composerStartRestartGroup.updateRememberedValue(scholarHistoryScreenKt$ScholarshipHistoryScreen$2$1RememberedValue);
            } else {
                scholarHistoryScreenKt$ScholarshipHistoryScreen$2$1RememberedValue = new ScholarHistoryScreenKt$ScholarshipHistoryScreen$2$1(generateultrahdrsupportedcombinationlist, mutableState, stateCollectAsStateWithLifecycle, null);
                composerStartRestartGroup.updateRememberedValue(scholarHistoryScreenKt$ScholarshipHistoryScreen$2$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarHistoryScreenKt$ScholarshipHistoryScreen$2$1RememberedValue, composerStartRestartGroup, 6);
            setArrowHeadLength setarrowheadlength3 = (setArrowHeadLength) mutableState2.getValue();
            composerStartRestartGroup.startReplaceGroup(-541579736);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: onActionModeStarted
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        mutableState2.setValue(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            getArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setarrowheadlength3, (Function0) objRememberedValue4, composerStartRestartGroup, 48);
            VirtualCameraAdapter1 virtualCameraAdapter3 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle2.getValue();
            composerStartRestartGroup.startReplaceGroup(-541576422);
            zChanged2 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle2);
            zChanged3 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
            zChangedInstance2 = composerStartRestartGroup.changedInstance(generateultrahdrsupportedcombinationlist);
            zChangedInstance3 = composerStartRestartGroup.changedInstance(context);
            scholarHistoryScreenKt$ScholarshipHistoryScreen$4$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (!(zChanged2 | zChanged3 | zChangedInstance2 | zChangedInstance3)) {
                scholarHistoryScreenKt$ScholarshipHistoryScreen$4$1RememberedValue = new ScholarHistoryScreenKt$ScholarshipHistoryScreen$4$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, snapshotStateList, generateultrahdrsupportedcombinationlist, mutableState2, context, stateCollectAsStateWithLifecycle2, null);
                composerStartRestartGroup.updateRememberedValue(scholarHistoryScreenKt$ScholarshipHistoryScreen$4$1RememberedValue);
            } else {
                scholarHistoryScreenKt$ScholarshipHistoryScreen$4$1RememberedValue = new ScholarHistoryScreenKt$ScholarshipHistoryScreen$4$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, snapshotStateList, generateultrahdrsupportedcombinationlist, mutableState2, context, stateCollectAsStateWithLifecycle2, null);
                composerStartRestartGroup.updateRememberedValue(scholarHistoryScreenKt$ScholarshipHistoryScreen$4$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(virtualCameraAdapter3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarHistoryScreenKt$ScholarshipHistoryScreen$4$1RememberedValue, composerStartRestartGroup, 0);
            getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Riwayat Konfirmasi", ComposableLambdaKt.rememberComposableLambda(-568359580, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(snapshotStateList), composerStartRestartGroup, 54), function2, null, composerStartRestartGroup, ((i4 >> 3) & 896) | 54, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function3 = function2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: WindowCallbackWrapperApi23Impl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist2 = generateultrahdrsupportedcombinationlist;
                    ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities2 = activityResultContractsPickVisualMediaMediaCapabilities;
                    getRatioByPercentage getratiobypercentage2 = getratiobypercentage;
                    Function0 function4 = function3;
                    int i6 = i;
                    getWrapped.TuitionPaymentFragmentspecialinlinedviewModeldefault2(generateultrahdrsupportedcombinationlist2, activityResultContractsPickVisualMediaMediaCapabilities2, getratiobypercentage2, function4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i6 | 1), i2);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Function3<PaddingValues, Composer, Integer, Unit> {
        private /* synthetic */ SnapshotStateList<ScholarBenefit> TuitionPaymentFragmentbindingInflater1;

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
                    ComposerKt.traceEventStart(-568359580, iIntValue, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipHistoryScreen.<anonymous> (ScholarHistoryScreen.kt:91)");
                }
                Modifier modifierM1004paddingVpY3zN4$default = PaddingKt.m1004paddingVpY3zN4$default(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues2), Dp.m6935constructorimpl(8.0f), 0.0f, 2, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM882spacedBy0680j_4 = Arrangement.INSTANCE.m882spacedBy0680j_4(Dp.m6935constructorimpl(8.0f));
                final SnapshotStateList<ScholarBenefit> snapshotStateList = this.TuitionPaymentFragmentbindingInflater1;
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
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                composer2.startReplaceGroup(714168126);
                Object objRememberedValue = composer2.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: onWindowAttributesChanged
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return getWrapped.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(snapshotStateList, (LazyListScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                LazyDslKt.LazyColumn(modifierFillMaxSize$default, null, null, false, null, null, null, false, (Function1) objRememberedValue, composer2, 100663302, 254);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer2.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(SnapshotStateList snapshotStateList, LazyListScope lazyListScope) {
            Intrinsics.checkNotNullParameter(lazyListScope, "");
            final ScholarHistoryScreenKt$ScholarshipHistoryScreen$5$invoke$lambda$3$lambda$2$lambda$1$$inlined$items$default$1 scholarHistoryScreenKt$ScholarshipHistoryScreen$5$invoke$lambda$3$lambda$2$lambda$1$$inlined$items$default$1 = new Function1() { // from class: com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarHistoryScreenKt$ScholarshipHistoryScreen$5$invoke$lambda$3$lambda$2$lambda$1$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                public final Void invoke(ScholarBenefit scholarBenefit) {
                    return null;
                }
            };
            final SnapshotStateList snapshotStateList2 = snapshotStateList;
            lazyListScope.items(snapshotStateList2.size(), null, new Function1<Integer, Object>() { // from class: com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarHistoryScreenKt$ScholarshipHistoryScreen$5$invoke$lambda$3$lambda$2$lambda$1$$inlined$items$default$3
                private static final byte[] $$c = {88, 99, -94, -58};
                private static final int $$d = 147;
                private static int $10 = 0;
                private static int $11 = 1;
                private static final byte[] $$a = {68, 104, -93, -37};
                private static final int $$b = 53;
                private static int $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 0;
                private static int $TuitionPaymentFragmentbindingInflater1 = 1;
                private static int[] TuitionPaymentFragmentspecialinlinedviewModeldefault1 = {-106734099, -81620747, 918499950, 1424084033, 601742699, -264900640, -1886968808, 1701996564, 1407118506, 91530393, -303702701, -714867147, 1746957553, 1411771587, 624100381, 1328874761, -1125033505, -1649096018};

                /* JADX WARN: Code duplicated, block: B:10:0x0025  */
                /* JADX WARN: Code duplicated, block: B:8:0x001d  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static void b(short r6, int r7, byte r8, java.lang.Object[] r9) {
                    /*
                        int r7 = r7 * 3
                        int r7 = r7 + 98
                        int r8 = r8 * 3
                        int r0 = r8 + 1
                        byte[] r1 = com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarHistoryScreenKt$ScholarshipHistoryScreen$5$invoke$lambda$3$lambda$2$lambda$1$$inlined$items$default$3.$$a
                        int r6 = r6 * 3
                        int r6 = r6 + 4
                        byte[] r0 = new byte[r0]
                        r2 = 0
                        if (r1 != 0) goto L17
                        r7 = r6
                        r3 = r8
                        r4 = r2
                        goto L2e
                    L17:
                        r3 = r2
                    L18:
                        byte r4 = (byte) r7
                        r0[r3] = r4
                        if (r3 != r8) goto L25
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r0, r2)
                        r9[r2] = r6
                        return
                    L25:
                        int r3 = r3 + 1
                        r4 = r1[r6]
                        r5 = r7
                        r7 = r6
                        r6 = r4
                        r4 = r3
                        r3 = r5
                    L2e:
                        int r6 = r6 + r3
                        int r7 = r7 + 1
                        r3 = r4
                        r5 = r7
                        r7 = r6
                        r6 = r5
                        goto L18
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarHistoryScreenKt$ScholarshipHistoryScreen$5$invoke$lambda$3$lambda$2$lambda$1$$inlined$items$default$3.b(short, int, byte, java.lang.Object[]):void");
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Object invoke(Integer num) {
                    int i = 2 % 2;
                    int i2 = $TuitionPaymentFragmentbindingInflater1 + 123;
                    $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i2 % 128;
                    int i3 = i2 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault2 = TuitionPaymentFragmentspecialinlinedviewModeldefault2(num.intValue());
                    if (i3 != 0) {
                        int i4 = 27 / 0;
                    }
                    int i5 = $TuitionPaymentFragmentbindingInflater1 + 101;
                    $TuitionPaymentFragmentspecialinlinedviewModeldefault2 = i5 % 128;
                    int i6 = i5 % 2;
                    return objTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                }

                public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i) {
                    int i2 = 2 % 2;
                    int i3 = $TuitionPaymentFragmentspecialinlinedviewModeldefault2 + 43;
                    $TuitionPaymentFragmentbindingInflater1 = i3 % 128;
                    int i4 = i3 % 2;
                    Function1 function1 = scholarHistoryScreenKt$ScholarshipHistoryScreen$5$invoke$lambda$3$lambda$2$lambda$1$$inlined$items$default$1;
                    if (i4 != 0) {
                        return function1.invoke(snapshotStateList2.get(i));
                    }
                    function1.invoke(snapshotStateList2.get(i));
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }

                private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
                    int i2;
                    int i3 = 2 % 2;
                    SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length * 2];
                    int[] iArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i4 = -1870535734;
                    int i5 = 1;
                    int i6 = 0;
                    if (iArr2 != null) {
                        int length = iArr2.length;
                        int[] iArr3 = new int[length];
                        int i7 = 0;
                        while (i7 < length) {
                            try {
                                Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                    byte b = (byte) 0;
                                    byte b2 = (byte) (b + 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (Process.myPid() >> 22) + 3291, (ViewConfiguration.getTapTimeout() >> 16) + 31, 1948206109, false, $$e(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                                }
                                iArr3[i7] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                                i7++;
                                i4 = -1870535734;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }
                        iArr2 = iArr3;
                    }
                    int length2 = iArr2.length;
                    int[] iArr4 = new int[length2];
                    int[] iArr5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    int i8 = 17;
                    if (iArr5 != null) {
                        int length3 = iArr5.length;
                        int[] iArr6 = new int[length3];
                        int i9 = 0;
                        while (i9 < length3) {
                            int i10 = $11 + i8;
                            $10 = i10 % 128;
                            int i11 = i10 % 2;
                            try {
                                Object[] objArr3 = new Object[i5];
                                objArr3[i6] = Integer.valueOf(iArr5[i9]);
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    char keyRepeatTimeout = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                                    int iLastIndexOf = 3290 - TextUtils.lastIndexOf("", '0', i6);
                                    int size = View.MeasureSpec.getSize(i6) + 31;
                                    byte b3 = (byte) i6;
                                    byte b4 = (byte) (b3 + 1);
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(keyRepeatTimeout, iLastIndexOf, size, 1948206109, false, $$e(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE});
                                }
                                iArr6[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                                i9++;
                                iArr5 = iArr5;
                                i8 = 17;
                                i5 = 1;
                                i6 = 0;
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                        i2 = i6;
                        iArr5 = iArr6;
                    } else {
                        i2 = 0;
                    }
                    System.arraycopy(iArr5, i2, iArr4, i2, length2);
                    int i12 = 2;
                    sessionConfigValidatingBuilder.b = 2;
                    while (sessionConfigValidatingBuilder.b < iArr.length) {
                        int i13 = $10 + 119;
                        $11 = i13 % 128;
                        int i14 = i13 % i12;
                        cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                        cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                        cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                        cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                        int i15 = 17;
                        for (int i16 = 1; i15 > i16; i16 = 1) {
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i15];
                            Object[] objArr4 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), View.resolveSize(0, 0) + 2559, 29 - TextUtils.getOffsetBefore("", 0), 683220507, false, $$e(b5, b6, b6), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                            sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                            i15--;
                            int i17 = $11 + 7;
                            $10 = i17 % 128;
                            int i18 = i17 % 2;
                        }
                        int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                        int i20 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        Object[] objArr5 = {sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (KeyEvent.keyCodeFromString("") + 28879), 348 - View.resolveSizeAndState(0, 0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 25, -30507727, false, "G", new Class[]{Object.class});
                        }
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i20 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
                        cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                        cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                        cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                        cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                        cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                        cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                        cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                        sessionConfigValidatingBuilder.b += 2;
                        i12 = 2;
                    }
                    objArr[0] = new String(cArr2, 0, i);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
                    java.util.NoSuchElementException
                    	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
                    	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
                    	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
                    	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
                    	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
                    */
                public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault3(int r27, int r28) {
                    /*
                        Method dump skipped, instruction units count: 1942
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarHistoryScreenKt$ScholarshipHistoryScreen$5$invoke$lambda$3$lambda$2$lambda$1$$inlined$items$default$3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(int, int):java.lang.Object[]");
                }

                /* JADX WARN: Code duplicated, block: B:10:0x0024  */
                /* JADX WARN: Code duplicated, block: B:8:0x001e  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                private static java.lang.String $$e(byte r6, int r7, short r8) {
                    /*
                        int r6 = r6 * 3
                        int r6 = 3 - r6
                        byte[] r0 = com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarHistoryScreenKt$ScholarshipHistoryScreen$5$invoke$lambda$3$lambda$2$lambda$1$$inlined$items$default$3.$$c
                        int r7 = r7 * 56
                        int r7 = 122 - r7
                        int r8 = r8 * 4
                        int r1 = r8 + 1
                        byte[] r1 = new byte[r1]
                        r2 = 0
                        if (r0 != 0) goto L16
                        r3 = r8
                        r4 = r2
                        goto L2c
                    L16:
                        r3 = r2
                    L17:
                        byte r4 = (byte) r7
                        r1[r3] = r4
                        int r6 = r6 + 1
                        if (r3 != r8) goto L24
                        java.lang.String r6 = new java.lang.String
                        r6.<init>(r1, r2)
                        return r6
                    L24:
                        int r3 = r3 + 1
                        r4 = r0[r6]
                        r5 = r3
                        r3 = r7
                        r7 = r4
                        r4 = r5
                    L2c:
                        int r7 = -r7
                        int r7 = r7 + r3
                        r3 = r4
                        goto L17
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarHistoryScreenKt$ScholarshipHistoryScreen$5$invoke$lambda$3$lambda$2$lambda$1$$inlined$items$default$3.$$e(byte, int, short):java.lang.String");
                }
            }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarHistoryScreenKt$ScholarshipHistoryScreen$5$invoke$lambda$3$lambda$2$lambda$1$$inlined$items$default$4
                @Override // kotlin.jvm.functions.Function4
                public final /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) throws ParseException {
                    TuitionPaymentFragmentspecialinlinedviewModeldefault2(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(LazyItemScope lazyItemScope, int i, Composer composer, int i2) throws ParseException {
                    int i3;
                    if ((i2 & 6) == 0) {
                        i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                    } else {
                        i3 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i3 |= composer.changed(i) ? 32 : 16;
                    }
                    if ((i3 & 147) == 146 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                    }
                    ScholarBenefit scholarBenefit = (ScholarBenefit) snapshotStateList2.get(i);
                    composer.startReplaceGroup(-800913061);
                    String str = scholarBenefit.b;
                    String strConcat = "BEASISWA UNTUK ".concat(String.valueOf(scholarBenefit.TuitionPaymentFragmentspecialinlinedviewModeldefault3));
                    String strTuitionPaymentFragmentbindingInflater1 = getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(scholarBenefit.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                    String str2 = scholarBenefit.g;
                    if (str2 == null) {
                        str2 = "";
                    }
                    SupportMenuInflater.TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, strConcat, strTuitionPaymentFragmentbindingInflater1, str2, null, composer, 0, 16);
                    composer.endReplaceGroup();
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

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(SnapshotStateList<ScholarBenefit> snapshotStateList) {
            this.TuitionPaymentFragmentbindingInflater1 = snapshotStateList;
        }

        public static /* synthetic */ void b() {
            ThreadsExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3[0] = getExifTransform.TuitionPaymentFragmentspecialinlinedviewModeldefault2[0];
        }
    }
}
