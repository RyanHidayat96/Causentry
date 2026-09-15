package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.ImageKt;
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
import androidx.compose.material3.CheckboxDefaults;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import androidx.p002lifecycle.Lifecycle;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.p003compose.FlowExtKt;
import androidx.work.WorkInfo;
import com.bpjstku.R;
import com.bpjstku.data.scholarship.model.request.ScholarshipFmBeginRequest;
import com.bpjstku.data.scholarship.model.response.ScholarshipDataEligible;
import com.bpjstku.domain.scholarship.model.ScholarPersonDetail;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipGranteeScreenKt$GranteeList$lambda$46$lambda$45$$inlined$items$default$1;
import com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$2$1;
import com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$3$1;
import com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$4$1;
import com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$5$1;
import com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$6$1;
import defpackage.getIconTintMode;
import defpackage.onActionViewCollapsed;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.tls.internal.der.DerHeader;

/* JADX INFO: loaded from: classes3.dex */
public final class getIconTintMode {
    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final getRatioByPercentage getratiobypercentage, final ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities, final Function0<Unit> function0, final lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, final populateOptionsMenu populateoptionsmenu, final IntegerRes integerRes, final Function4<? super Integer, ? super ScholarPersonDetail, ? super ScholarPersonDetail, ? super Integer, Unit> function4, Composer composer, final int i) {
        int i2;
        final MutableState mutableState;
        MutableState mutableState2;
        Composer composer2;
        StateListDrawableCompat stateListDrawableCompat;
        Composer composer3;
        Intrinsics.checkNotNullParameter(getratiobypercentage, "");
        Intrinsics.checkNotNullParameter(activityResultContractsPickVisualMediaMediaCapabilities, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(lambdaenabletorch1androidxcameracamera2internaltorchcontrol, "");
        Intrinsics.checkNotNullParameter(populateoptionsmenu, "");
        Intrinsics.checkNotNullParameter(integerRes, "");
        Intrinsics.checkNotNullParameter(function4, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1886205448);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(getratiobypercentage) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(lambdaenabletorch1androidxcameracamera2internaltorchcontrol) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(populateoptionsmenu) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(integerRes) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function4) ? 1048576 : 524288;
        }
        int i3 = i2;
        if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1886205448, i3, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipGranteeScreen (ScholarshipGranteeScreen.kt:92)");
            }
            State stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.d, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            State stateCollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.INotificationSideChannel, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            composerStartRestartGroup.startReplaceGroup(1856868786);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(getratiobypercentage.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState3 = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            StateListDrawableCompat stateListDrawableCompatTuitionPaymentFragmentbindingInflater1 = getStateDrawable.TuitionPaymentFragmentbindingInflater1(composerStartRestartGroup);
            composerStartRestartGroup.startReplaceGroup(1856873506);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState4 = (MutableState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1856876298);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                objRememberedValue3 = mutableStateMutableStateOf$default;
            }
            MutableState mutableState5 = (MutableState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Activity activity = context instanceof Activity ? (Activity) context : null;
            composerStartRestartGroup.startReplaceGroup(1856880879);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1856883200);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            MutableState mutableState6 = (MutableState) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            final Activity activity2 = activity;
            State stateCollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.getExtras, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            State stateCollectAsStateWithLifecycle4 = FlowExtKt.collectAsStateWithLifecycle(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.getItem, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            State stateCollectAsStateWithLifecycle5 = FlowExtKt.collectAsStateWithLifecycle(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.MediaBrowserCompat, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            State stateCollectAsStateWithLifecycle6 = FlowExtKt.collectAsStateWithLifecycle(integerRes.getNotifyChildrenChangedOptions, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            setArrowHeadLength setarrowheadlength = (setArrowHeadLength) mutableState4.getValue();
            composerStartRestartGroup.startReplaceGroup(1856898096);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                mutableState = mutableState4;
                objRememberedValue6 = new Function0() { // from class: getIntent
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        mutableState.setValue(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                mutableState = mutableState4;
            }
            composerStartRestartGroup.endReplaceGroup();
            getArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setarrowheadlength, (Function0) objRememberedValue6, composerStartRestartGroup, 48);
            VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle3.getValue();
            composerStartRestartGroup.startReplaceGroup(1856901644);
            boolean zChanged = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle3);
            boolean zChanged2 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(lambdaenabletorch1androidxcameracamera2internaltorchcontrol);
            ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$2$1 scholarshipGranteeScreenKt$ScholarshipGranteeScreen$2$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (((zChanged | zChanged2) || zChangedInstance) || scholarshipGranteeScreenKt$ScholarshipGranteeScreen$2$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                mutableState2 = mutableState5;
                composer2 = composerStartRestartGroup;
                scholarshipGranteeScreenKt$ScholarshipGranteeScreen$2$1RememberedValue = new ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$2$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, mutableState, lambdaenabletorch1androidxcameracamera2internaltorchcontrol, stateCollectAsStateWithLifecycle3, mutableState3, mutableState2, null);
                composer2.updateRememberedValue(scholarshipGranteeScreenKt$ScholarshipGranteeScreen$2$1RememberedValue);
            } else {
                mutableState2 = mutableState5;
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(virtualCameraAdapter1, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipGranteeScreenKt$ScholarshipGranteeScreen$2$1RememberedValue, composer2, 0);
            VirtualCameraAdapter1 virtualCameraAdapter2 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle4.getValue();
            composer2.startReplaceGroup(1856939749);
            boolean zChanged3 = composer2.changed(stateCollectAsStateWithLifecycle4);
            boolean zChangedInstance2 = composer2.changedInstance(lambdaenabletorch1androidxcameracamera2internaltorchcontrol);
            boolean zChangedInstance3 = composer2.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
            boolean zChanged4 = composer2.changed(stateCollectAsStateWithLifecycle2);
            boolean zChanged5 = composer2.changed(r2);
            boolean zChangedInstance4 = composer2.changedInstance(context);
            ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$3$1 scholarshipGranteeScreenKt$ScholarshipGranteeScreen$3$1RememberedValue = composer2.rememberedValue();
            if ((zChanged3 | zChangedInstance2 | zChangedInstance3 | zChanged4 | zChanged5 | zChangedInstance4) || scholarshipGranteeScreenKt$ScholarshipGranteeScreen$3$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                scholarshipGranteeScreenKt$ScholarshipGranteeScreen$3$1RememberedValue = new ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$3$1(lambdaenabletorch1androidxcameracamera2internaltorchcontrol, activityResultContractsPickVisualMediaMediaCapabilities, r2, snapshotStateList, mutableState, context, stateCollectAsStateWithLifecycle4, stateCollectAsStateWithLifecycle2, mutableState3, null);
                composer2.updateRememberedValue(scholarshipGranteeScreenKt$ScholarshipGranteeScreen$3$1RememberedValue);
            }
            composer2.endReplaceGroup();
            EffectsKt.LaunchedEffect(virtualCameraAdapter2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipGranteeScreenKt$ScholarshipGranteeScreen$3$1RememberedValue, composer2, 0);
            VirtualCameraAdapter1 virtualCameraAdapter3 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle5.getValue();
            composer2.startReplaceGroup(1856984429);
            boolean zChanged6 = composer2.changed(stateCollectAsStateWithLifecycle5);
            boolean zChangedInstance5 = composer2.changedInstance(getratiobypercentage);
            boolean zChanged7 = composer2.changed(r2);
            boolean zChangedInstance6 = composer2.changedInstance(context);
            boolean zChanged8 = composer2.changed(stateCollectAsStateWithLifecycle2);
            boolean zChangedInstance7 = composer2.changedInstance(lambdaenabletorch1androidxcameracamera2internaltorchcontrol);
            boolean z = (r11 & 3670016) == 1048576;
            ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$4$1 scholarshipGranteeScreenKt$ScholarshipGranteeScreen$4$1RememberedValue = composer2.rememberedValue();
            if (((zChanged6 | zChangedInstance5 | zChanged7 | zChangedInstance6 | zChanged8 | zChangedInstance7) || z) || scholarshipGranteeScreenKt$ScholarshipGranteeScreen$4$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                stateListDrawableCompat = stateListDrawableCompatTuitionPaymentFragmentbindingInflater1;
                composer3 = composer2;
                scholarshipGranteeScreenKt$ScholarshipGranteeScreen$4$1RememberedValue = new ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$4$1(getratiobypercentage, stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, mutableState, context, lambdaenabletorch1androidxcameracamera2internaltorchcontrol, stateCollectAsStateWithLifecycle5, mutableState3, mutableState6, function4, stateCollectAsStateWithLifecycle2, null);
                composer3.updateRememberedValue(scholarshipGranteeScreenKt$ScholarshipGranteeScreen$4$1RememberedValue);
            } else {
                stateListDrawableCompat = stateListDrawableCompatTuitionPaymentFragmentbindingInflater1;
                composer3 = composer2;
            }
            composer3.endReplaceGroup();
            EffectsKt.LaunchedEffect(virtualCameraAdapter3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipGranteeScreenKt$ScholarshipGranteeScreen$4$1RememberedValue, composer3, 0);
            VirtualCameraAdapter1 virtualCameraAdapter4 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle6.getValue();
            composer3.startReplaceGroup(1857079591);
            boolean zChanged9 = composer3.changed(stateCollectAsStateWithLifecycle6);
            boolean zChangedInstance8 = composer3.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
            boolean zChangedInstance9 = composer3.changedInstance(lambdaenabletorch1androidxcameracamera2internaltorchcontrol);
            boolean zChangedInstance10 = composer3.changedInstance(context);
            StateListDrawableCompat stateListDrawableCompat2 = stateListDrawableCompat;
            boolean zChanged10 = composer3.changed(stateListDrawableCompat2);
            boolean zChangedInstance11 = composer3.changedInstance(integerRes);
            ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$5$1 scholarshipGranteeScreenKt$ScholarshipGranteeScreen$5$1RememberedValue = composer3.rememberedValue();
            if ((zChanged9 | zChangedInstance8 | zChangedInstance9 | zChangedInstance10 | zChanged10 | zChangedInstance11) || scholarshipGranteeScreenKt$ScholarshipGranteeScreen$5$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                scholarshipGranteeScreenKt$ScholarshipGranteeScreen$5$1RememberedValue = new ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$5$1(activityResultContractsPickVisualMediaMediaCapabilities, lambdaenabletorch1androidxcameracamera2internaltorchcontrol, context, snapshotStateList, stateListDrawableCompat2, mutableState, integerRes, stateCollectAsStateWithLifecycle6, mutableState3, mutableState6, null);
                composer3.updateRememberedValue(scholarshipGranteeScreenKt$ScholarshipGranteeScreen$5$1RememberedValue);
            }
            composer3.endReplaceGroup();
            EffectsKt.LaunchedEffect(virtualCameraAdapter4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipGranteeScreenKt$ScholarshipGranteeScreen$5$1RememberedValue, composer3, 0);
            Unit unit = Unit.INSTANCE;
            composer3.startReplaceGroup(1857165265);
            boolean zChangedInstance12 = composer3.changedInstance(populateoptionsmenu);
            boolean zChangedInstance13 = composer3.changedInstance(r10);
            boolean zChangedInstance14 = composer3.changedInstance(lambdaenabletorch1androidxcameracamera2internaltorchcontrol);
            boolean zChangedInstance15 = composer3.changedInstance(integerRes);
            boolean zChangedInstance16 = composer3.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
            boolean zChanged11 = composer3.changed(stateListDrawableCompat2);
            ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$6$1 scholarshipGranteeScreenKt$ScholarshipGranteeScreen$6$1RememberedValue = composer3.rememberedValue();
            if ((zChangedInstance12 | zChangedInstance13 | zChangedInstance14 | zChangedInstance15 | zChangedInstance16 | zChanged11) || scholarshipGranteeScreenKt$ScholarshipGranteeScreen$6$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                scholarshipGranteeScreenKt$ScholarshipGranteeScreen$6$1RememberedValue = new ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$6$1(populateoptionsmenu, lambdaenabletorch1androidxcameracamera2internaltorchcontrol, integerRes, activityResultContractsPickVisualMediaMediaCapabilities, stateListDrawableCompat2, mutableState, r10, snapshotStateList, mutableState6, null);
                composer3.updateRememberedValue(scholarshipGranteeScreenKt$ScholarshipGranteeScreen$6$1RememberedValue);
            }
            composer3.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipGranteeScreenKt$ScholarshipGranteeScreen$6$1RememberedValue, composer3, 6);
            getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Penerima Beasiswa", ComposableLambdaKt.rememberComposableLambda(1763907316, true, new b(getratiobypercentage, r10, stateCollectAsStateWithLifecycle, mutableState), composer3, 54), function0, null, composer3, (i3 & 896) | 54, 8);
            composer3.startReplaceGroup(1857253314);
            if (((updateTextButtonVisibility) stateCollectAsStateWithLifecycle.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                composer3.startReplaceGroup(1857255639);
                boolean zChangedInstance17 = composer3.changedInstance(getratiobypercentage);
                Object objRememberedValue7 = composer3.rememberedValue();
                if (zChangedInstance17 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new Function0() { // from class: getNumericShortcut
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            getratiobypercentage.TuitionPaymentFragmentspecialinlinedviewModeldefault1(false);
                            return Unit.INSTANCE;
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue7);
                }
                Function0 function1 = (Function0) objRememberedValue7;
                composer3.endReplaceGroup();
                composer3.startReplaceGroup(1857258014);
                boolean zChangedInstance18 = composer3.changedInstance(getratiobypercentage);
                Object objRememberedValue8 = composer3.rememberedValue();
                if (zChangedInstance18 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue8 = new Function0() { // from class: getTitleCondensed
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            getRatioByPercentage getratiobypercentage2 = getratiobypercentage;
                            getratiobypercentage2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(false);
                            getratiobypercentage2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(true);
                            return Unit.INSTANCE;
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue8);
                }
                Function0 function2 = (Function0) objRememberedValue8;
                composer3.endReplaceGroup();
                composer3.startReplaceGroup(1857262391);
                boolean zChangedInstance19 = composer3.changedInstance(getratiobypercentage);
                Object objRememberedValue9 = composer3.rememberedValue();
                if (zChangedInstance19 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue9 = new Function0() { // from class: getOrder
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            getratiobypercentage.TuitionPaymentFragmentspecialinlinedviewModeldefault1(false);
                            return Unit.INSTANCE;
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue9);
                }
                composer3.endReplaceGroup();
                getChildCount.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function1, function2, (Function0) objRememberedValue9, composer3, 0);
            }
            composer3.endReplaceGroup();
            composer3.startReplaceGroup(1857266416);
            if (((updateTextButtonVisibility) stateCollectAsStateWithLifecycle.getValue()).asInterface) {
                String strStringResource = StringResources_androidKt.stringResource(R.string.title_term_and_condition, composer3, 6);
                String strStringResource2 = StringResources_androidKt.stringResource(R.string.term_and_condition_biometric_dukcapil, composer3, 6);
                String strStringResource3 = StringResources_androidKt.stringResource(R.string.action_next, composer3, 6);
                String strStringResource4 = StringResources_androidKt.stringResource(R.string.action_cancel_id, composer3, 6);
                String strStringResource5 = StringResources_androidKt.stringResource(R.string.redactional_confirmation_biometric_dukcapil, composer3, 6);
                composer3.startReplaceGroup(1857275246);
                boolean zChangedInstance20 = composer3.changedInstance(getratiobypercentage);
                boolean zChangedInstance21 = composer3.changedInstance(lambdaenabletorch1androidxcameracamera2internaltorchcontrol);
                boolean zChangedInstance22 = composer3.changedInstance(r9);
                Object objRememberedValue10 = composer3.rememberedValue();
                if ((zChangedInstance20 | zChangedInstance21 | zChangedInstance22) || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue10 = new Function0() { // from class: getSupportActionProvider
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            getRatioByPercentage getratiobypercentage2 = getratiobypercentage;
                            lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol2 = lambdaenabletorch1androidxcameracamera2internaltorchcontrol;
                            ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities2 = activityResultContractsPickVisualMediaMediaCapabilities;
                            MutableState mutableState7 = mutableState3;
                            getratiobypercentage2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(false);
                            User userAsBinder = activityResultContractsPickVisualMediaMediaCapabilities2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                            String str = userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
                            if (str == null) {
                                str = "";
                            }
                            lambdaenabletorch1androidxcameracamera2internaltorchcontrol2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ScholarshipFmBeginRequest(str, ((ScholarPersonDetail) CollectionsKt.first((List) mutableState7.getValue())).isConnected));
                            return Unit.INSTANCE;
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue10);
                }
                Function0 function3 = (Function0) objRememberedValue10;
                composer3.endReplaceGroup();
                composer3.startReplaceGroup(1857288659);
                boolean zChangedInstance23 = composer3.changedInstance(getratiobypercentage);
                Object objRememberedValue11 = composer3.rememberedValue();
                if (zChangedInstance23 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue11 = new Function0() { // from class: getSubMenu
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            getratiobypercentage.TuitionPaymentFragmentspecialinlinedviewModeldefault2(false);
                            return Unit.INSTANCE;
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue11);
                }
                Function0 function5 = (Function0) objRememberedValue11;
                composer3.endReplaceGroup();
                composer3.startReplaceGroup(1857293939);
                boolean zChangedInstance24 = composer3.changedInstance(getratiobypercentage);
                Object objRememberedValue12 = composer3.rememberedValue();
                if (zChangedInstance24 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue12 = new Function0() { // from class: getMenuInfo
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            getratiobypercentage.TuitionPaymentFragmentspecialinlinedviewModeldefault2(false);
                            return Unit.INSTANCE;
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue12);
                }
                composer3.endReplaceGroup();
                DrawableWrapperCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault3(strStringResource, strStringResource2, strStringResource3, function3, strStringResource4, function5, strStringResource5, false, (Function0) objRememberedValue12, composer3, 12582912, 0);
            }
            composer3.endReplaceGroup();
            final MutableState mutableState7 = mutableState2;
            if (((Boolean) mutableState7.getValue()).booleanValue()) {
                composer3.startReplaceGroup(1857300807);
                boolean zChangedInstance25 = composer3.changedInstance(activity2);
                boolean zChangedInstance26 = composer3.changedInstance(populateoptionsmenu);
                Object objRememberedValue13 = composer3.rememberedValue();
                if ((zChangedInstance25 | zChangedInstance26) || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue13 = new Function0() { // from class: getTooltipText
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            VideoRecordEventStart<TwilightManager> videoRecordEventStartTuitionPaymentFragmentbindingInflater1;
                            Activity activity3 = activity2;
                            MutableState mutableState8 = mutableState7;
                            final populateOptionsMenu populateoptionsmenu2 = populateoptionsmenu;
                            mutableState8.setValue(Boolean.FALSE);
                            if (activity3 != null) {
                                Intrinsics.checkNotNullParameter(activity3, "");
                                if (populateoptionsmenu2.TuitionPaymentFragmentbindingInflater1 == null) {
                                    populateoptionsmenu2.TuitionPaymentFragmentbindingInflater1 = new ToolbarActionBarToolbarMenuCallback();
                                }
                                ToolbarActionBarToolbarMenuCallback toolbarActionBarToolbarMenuCallback = populateoptionsmenu2.TuitionPaymentFragmentbindingInflater1;
                                if (toolbarActionBarToolbarMenuCallback != null && (videoRecordEventStartTuitionPaymentFragmentbindingInflater1 = toolbarActionBarToolbarMenuCallback.TuitionPaymentFragmentbindingInflater1(activity3)) != null) {
                                    final Function1 function6 = new Function1() { // from class: getMenu
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return populateOptionsMenu.TuitionPaymentFragmentspecialinlinedviewModeldefault2(populateoptionsmenu2, (TwilightManager) obj);
                                        }
                                    };
                                    logToString<? super TwilightManager> logtostring = new logToString() { // from class: flushThemedResourcesCache
                                        @Override // defpackage.logToString
                                        public final void accept(Object obj) {
                                            function6.invoke(obj);
                                        }
                                    };
                                    final Function1 function7 = new Function1() { // from class: ToolbarActionBar1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return populateOptionsMenu.TuitionPaymentFragmentspecialinlinedviewModeldefault1(populateoptionsmenu2, (Throwable) obj);
                                        }
                                    };
                                    BufferProviderState bufferProviderStateSubscribe = videoRecordEventStartTuitionPaymentFragmentbindingInflater1.subscribe(logtostring, new logToString() { // from class: ToolbarActionBar2
                                        @Override // defpackage.logToString
                                        public final void accept(Object obj) {
                                            function7.invoke(obj);
                                        }
                                    });
                                    if (bufferProviderStateSubscribe != null) {
                                        populateoptionsmenu2.b.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateSubscribe);
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue13);
                }
                Function0 function6 = (Function0) objRememberedValue13;
                composer3.endReplaceGroup();
                composer3.startReplaceGroup(1857305772);
                boolean zChangedInstance27 = composer3.changedInstance(r10);
                Object objRememberedValue14 = composer3.rememberedValue();
                if (zChangedInstance27 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue14 = new Function0() { // from class: hasSubMenu
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Context context2 = context;
                            mutableState7.setValue(Boolean.FALSE);
                            String string = context2.getString(R.string.message_camera_storage_permission_required);
                            Intrinsics.checkNotNullExpressionValue(string, "");
                            AutoValue_LifecycleCameraRepository_Key.b(context2, string);
                            return Unit.INSTANCE;
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue14);
                }
                composer3.endReplaceGroup();
                setSpinEnabled.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function6, (Function0) objRememberedValue14, composer3, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: isVisible
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    getIconTintMode.TuitionPaymentFragmentspecialinlinedviewModeldefault3(getratiobypercentage, activityResultContractsPickVisualMediaMediaCapabilities, function0, lambdaenabletorch1androidxcameracamera2internaltorchcontrol, populateoptionsmenu, integerRes, function4, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }

    static final class b implements Function3<PaddingValues, Composer, Integer, Unit> {
        private /* synthetic */ State<updateTextButtonVisibility> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ getRatioByPercentage TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ Context TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private /* synthetic */ MutableState<setArrowHeadLength> b;

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
                    ComposerKt.traceEventStart(1763907316, iIntValue, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipGranteeScreen.<anonymous> (ScholarshipGranteeScreen.kt:320)");
                }
                Modifier modifierM1004paddingVpY3zN4$default = PaddingKt.m1004paddingVpY3zN4$default(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues2), Dp.m6935constructorimpl(16.0f), 0.0f, 2, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM882spacedBy0680j_4 = Arrangement.INSTANCE.m882spacedBy0680j_4(Dp.m6935constructorimpl(16.0f));
                final getRatioByPercentage getratiobypercentage = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                final Context context = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                State<updateTextButtonVisibility> state = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                final MutableState<setArrowHeadLength> mutableState = this.b;
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
                updateTextButtonVisibility value = state.getValue();
                composer2.startReplaceGroup(-990277820);
                boolean zChangedInstance = composer2.changedInstance(context);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: requiresOverflow
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return getIconTintMode.b.b(mutableState, context, (ScholarshipDataEligible) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                getIconTintMode.TuitionPaymentFragmentbindingInflater1(value, getratiobypercentage, (Function1) objRememberedValue, composer2, 0);
                SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer2, 0);
                composer2.startReplaceGroup(-990259564);
                boolean zChangedInstance2 = composer2.changedInstance(getratiobypercentage);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: setActionProvider
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return getIconTintMode.b.TuitionPaymentFragmentbindingInflater1(getratiobypercentage);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                computeConstantSize.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Konfirmasi Sekarang", (Function0) objRememberedValue2, null, state.getValue().TuitionPaymentFragmentbindingInflater1, composer2, 6, 4);
                SpacerKt.Spacer(SizeKt.m1033height3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(8.0f)), composer2, 6);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer2.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(getRatioByPercentage getratiobypercentage) {
            getratiobypercentage.TuitionPaymentFragmentspecialinlinedviewModeldefault1(true);
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit b(MutableState mutableState, Context context, ScholarshipDataEligible scholarshipDataEligible) {
            Intrinsics.checkNotNullParameter(scholarshipDataEligible, "");
            String descPencarian = scholarshipDataEligible.getDescPencarian();
            if (descPencarian == null) {
                descPencarian = "Mohon maaf, penerima manfaat beasiswa tidak memenuhi persyaratan.";
            }
            String string = context.getString(R.string.action_information);
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = context.getString(R.string.action_back);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            mutableState.setValue(new setArrowHeadLength.TuitionPaymentFragmentbindingInflater1(string, descPencarian, string2));
            return Unit.INSTANCE;
        }

        b(getRatioByPercentage getratiobypercentage, Context context, State<updateTextButtonVisibility> state, MutableState<setArrowHeadLength> mutableState) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getratiobypercentage;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = context;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = state;
            this.b = mutableState;
        }
    }

    static final void TuitionPaymentFragmentbindingInflater1(final updateTextButtonVisibility updatetextbuttonvisibility, final getRatioByPercentage getratiobypercentage, final Function1<? super ScholarshipDataEligible, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-126586486);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(updatetextbuttonvisibility) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(getratiobypercentage) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-126586486, i2, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.GranteeList (ScholarshipGranteeScreen.kt:400)");
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalM882spacedBy0680j_4 = Arrangement.INSTANCE.m882spacedBy0680j_4(Dp.m6935constructorimpl(12.0f));
            PaddingValues paddingValuesM999PaddingValuesa9UjIt4$default = PaddingKt.m999PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6935constructorimpl(8.0f), 7, null);
            Arrangement.HorizontalOrVertical horizontalOrVertical = horizontalOrVerticalM882spacedBy0680j_4;
            composerStartRestartGroup.startReplaceGroup(2125050213);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(updatetextbuttonvisibility);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(getratiobypercentage);
            boolean z = (i2 & 896) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance | zChangedInstance2 | z) || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: isCheckable
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        final updateTextButtonVisibility updatetextbuttonvisibility2 = updatetextbuttonvisibility;
                        final getRatioByPercentage getratiobypercentage2 = getratiobypercentage;
                        final Function1 function2 = function1;
                        LazyListScope lazyListScope = (LazyListScope) obj;
                        Intrinsics.checkNotNullParameter(lazyListScope, "");
                        final List<ScholarshipDataEligible> list = updatetextbuttonvisibility2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        final Function1 function3 = new Function1() { // from class: setActionView
                            private static final byte[] $$a = {99, -43, -44, -62};
                            private static final int $$b = 241;
                            private static int $10 = 0;
                            private static int $11 = 1;

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            private static int f1355a = 0;
                            private static int d = 1;
                            private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault2 = {47378, 47367, 47384, 47380, 47399, 47409, 47395, 47398, 47404, 47349, 47377, 47408, 47411, 47392, 47406, 47337, 47366, 47360, 47362, 47393, 47365, 47412, 47410, 47402, 47400, 47335, 47397, 47368, 47372, 47407, 47403, 47455, 47394, 47452, 47375, 47379, 47421, 47328, 47333, 47401};
                            private static int b = 2047719637;
                            private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3 = true;
                            private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
                            private static char[] TuitionPaymentFragmentbindingInflater1 = {60054, 60085, 60063, 60067, 59747, 60086, 60051, 60043, 60107, 60117, 60110, 59744, 60053, 60056, 60050, 60047, 60084, 60078, 60057, 60090, 60045, 59745, 60040, 59751, 60059, 60048, 60041, 59746, 60034, 60075, 60061, 60098, 59749, 59748, 60088, 60058, 60035, 60055, 60060, 60072, 60082, 60049, 60046, 60052, 60123, 60102, 60062, 60095, 60119};
                            private static char g = 57190;

                            private static void c(char[] cArr, int[] iArr, int i3, byte[] bArr, Object[] objArr) throws Throwable {
                                char[] cArr2;
                                int i4 = 2 % 2;
                                getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
                                char[] cArr3 = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                long j = 0;
                                char c = '0';
                                if (cArr3 != null) {
                                    int i5 = $10 + 103;
                                    $11 = i5 % 128;
                                    int i6 = i5 % 2;
                                    int length = cArr3.length;
                                    char[] cArr4 = new char[length];
                                    int i7 = 0;
                                    while (i7 < length) {
                                        try {
                                            Object[] objArr2 = {Integer.valueOf(cArr3[i7])};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                char cLastIndexOf = (char) (31338 - TextUtils.lastIndexOf("", c, 0));
                                                int i8 = 2995 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1));
                                                int packedPositionType = ExpandableListView.getPackedPositionType(j) + 17;
                                                byte b2 = (byte) 0;
                                                byte b3 = b2;
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cLastIndexOf, i8, packedPositionType, 1182129903, false, $$c(b2, b3, (byte) (b3 | 48)), new Class[]{Integer.TYPE});
                                            }
                                            cArr4[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                                            i7++;
                                            j = 0;
                                            c = '0';
                                        } catch (Throwable th) {
                                            Throwable cause = th.getCause();
                                            if (cause == null) {
                                                throw th;
                                            }
                                            throw cause;
                                        }
                                    }
                                    cArr3 = cArr4;
                                }
                                Object[] objArr3 = {Integer.valueOf(b)};
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 43325), View.MeasureSpec.makeMeasureSpec(0, 0) + 253, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 22, 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
                                }
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                                if (TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                                    int i9 = $10 + 27;
                                    $11 = i9 % 128;
                                    if (i9 % 2 == 0) {
                                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                                        cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                                    } else {
                                        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
                                        cArr2 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                                    }
                                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                                        int i10 = $11 + 101;
                                        $10 = i10 % 128;
                                        int i11 = i10 % 2;
                                        cArr2[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i3] - iIntValue);
                                        Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            byte b4 = (byte) 0;
                                            byte b5 = b4;
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 33602), 3085 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 27 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -2146875848, false, $$c(b4, b5, (byte) (b5 | 49)), new Class[]{Object.class, Object.class});
                                        }
                                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                                    }
                                    objArr[0] = new String(cArr2);
                                    return;
                                }
                                if (!TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                                    getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
                                    char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                                    getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                                    while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                                        cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i3] - iIntValue);
                                        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                                    }
                                    objArr[0] = new String(cArr5);
                                    return;
                                }
                                getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
                                char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
                                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
                                while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                                    int i12 = $11 + 27;
                                    $10 = i12 % 128;
                                    int i13 = i12 % 2;
                                    cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr3[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i3] - iIntValue);
                                    Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        byte b6 = (byte) 0;
                                        byte b7 = b6;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 33602), AndroidCharacter.getMirror('0') + 3037, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 25, -2146875848, false, $$c(b6, b7, (byte) (b7 | 49)), new Class[]{Object.class, Object.class});
                                    }
                                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                                }
                                objArr[0] = new String(cArr6);
                            }

                            /* JADX WARN: Code duplicated, block: B:35:0x0128  */
                            /* JADX WARN: Code duplicated, block: B:36:0x0140  */
                            /* JADX WARN: Code duplicated, block: B:39:0x018d A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:7:0x0022, B:9:0x0030, B:10:0x0062, B:37:0x0142, B:39:0x018d, B:40:0x01fc, B:44:0x0211, B:46:0x024d, B:48:0x02b6), top: B:72:0x0022 }] */
                            /* JADX WARN: Code duplicated, block: B:43:0x020f  */
                            /* JADX WARN: Code duplicated, block: B:46:0x024d A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:7:0x0022, B:9:0x0030, B:10:0x0062, B:37:0x0142, B:39:0x018d, B:40:0x01fc, B:44:0x0211, B:46:0x024d, B:48:0x02b6), top: B:72:0x0022 }] */
                            /* JADX WARN: Code duplicated, block: B:47:0x02b4  */
                            /* JADX WARN: Code duplicated, block: B:50:0x02d7  */
                            /* JADX WARN: Code duplicated, block: B:52:0x02e0  */
                            /* JADX WARN: Code duplicated, block: B:53:0x0308  */
                            private static void e(int i3, char[] cArr, byte b2, Object[] objArr) throws Throwable {
                                int i4;
                                Object obj2;
                                Object[] objArr2;
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
                                int i5 = 2 % 2;
                                deInitSession deinitsession = new deInitSession();
                                char[] cArr2 = TuitionPaymentFragmentbindingInflater1;
                                char c = '0';
                                int i6 = 1770390596;
                                Object obj3 = null;
                                if (cArr2 != null) {
                                    int length = cArr2.length;
                                    char[] cArr3 = new char[length];
                                    int i7 = 0;
                                    while (i7 < length) {
                                        try {
                                            Object[] objArr3 = {Integer.valueOf(cArr2[i7])};
                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i6);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                byte b3 = (byte) 0;
                                                byte b4 = b3;
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (TextUtils.lastIndexOf("", c, 0) + 1), (ViewConfiguration.getWindowTouchSlop() >> 8) + 2267, 32 - Process.getGidForName(""), -1927765101, false, $$c(b3, b4, (byte) (b4 + 3)), new Class[]{Integer.TYPE});
                                            }
                                            cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                                            i7++;
                                            c = '0';
                                            i6 = 1770390596;
                                        } catch (Throwable th) {
                                            Throwable cause = th.getCause();
                                            if (cause == null) {
                                                throw th;
                                            }
                                            throw cause;
                                        }
                                    }
                                    cArr2 = cArr3;
                                }
                                try {
                                    Object[] objArr4 = {Integer.valueOf(g)};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                        byte b5 = (byte) 0;
                                        byte b6 = b5;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) TextUtils.getTrimmedLength(""), Process.getGidForName("") + 2268, 32 - TextUtils.lastIndexOf("", '0', 0, 0), -1927765101, false, $$c(b5, b6, (byte) (b6 + 3)), new Class[]{Integer.TYPE});
                                    }
                                    char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
                                    char[] cArr4 = new char[i3];
                                    if (i3 % 2 != 0) {
                                        int i8 = $10;
                                        int i9 = i8 + 41;
                                        $11 = i9 % 128;
                                        int i10 = i9 % 2;
                                        i4 = i3 - 1;
                                        cArr4[i4] = (char) (cArr[i4] - b2);
                                        int i11 = i8 + 15;
                                        $11 = i11 % 128;
                                        int i12 = i11 % 2;
                                    } else {
                                        i4 = i3;
                                    }
                                    if (i4 > 1) {
                                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                                        while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i4) {
                                            int i13 = $11 + 71;
                                            $10 = i13 % 128;
                                            if (i13 % 2 != 0) {
                                                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                                                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 % 0];
                                                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                                                    obj2 = obj3;
                                                } else {
                                                    objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                        byte b7 = (byte) 0;
                                                        byte b8 = b7;
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.rgb(0, 0, 0) + 16826483), View.MeasureSpec.getSize(0) + 3261, 30 - TextUtils.indexOf("", "", 0), -127612708, false, $$c(b7, b8, (byte) (b8 + 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                                    }
                                                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                                        Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                            byte b9 = (byte) 0;
                                                            byte b10 = b9;
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (22879 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 595, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 17, 1570859318, false, $$c(b9, b10, b10), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                                        }
                                                        obj2 = null;
                                                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).intValue();
                                                        int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                                                    } else {
                                                        obj2 = null;
                                                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                                            int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                                            int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i15];
                                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                                                        } else {
                                                            int i17 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                                            int i18 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i17];
                                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i18];
                                                        }
                                                    }
                                                }
                                            } else {
                                                deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                                                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                                                if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b2);
                                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b2);
                                                    obj2 = obj3;
                                                } else {
                                                    objArr2 = new Object[]{deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                                        byte b11 = (byte) 0;
                                                        byte b12 = b11;
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.rgb(0, 0, 0) + 16826483), View.MeasureSpec.getSize(0) + 3261, 30 - TextUtils.indexOf("", "", 0), -127612708, false, $$c(b11, b12, (byte) (b12 + 2)), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                                                    }
                                                    if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                                        Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                            byte b13 = (byte) 0;
                                                            byte b14 = b13;
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (22879 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 595, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 17, 1570859318, false, $$c(b13, b14, b14), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                                        }
                                                        obj2 = null;
                                                        int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                                                        int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue2];
                                                        cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i19];
                                                    } else {
                                                        obj2 = null;
                                                        if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                                            deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                                            deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                                            int i110 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                                            int i111 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i110];
                                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i111];
                                                        } else {
                                                            int i112 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                                            int i113 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i112];
                                                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i113];
                                                        }
                                                    }
                                                }
                                            }
                                            deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                                            obj3 = obj2;
                                        }
                                    }
                                    int i20 = 0;
                                    while (i20 < i3) {
                                        int i21 = $10 + 93;
                                        $11 = i21 % 128;
                                        if (i21 % 2 == 0) {
                                            cArr4[i20] = (char) (cArr4[i20] ^ 4294);
                                            i20 += 19;
                                        } else {
                                            cArr4[i20] = (char) (cArr4[i20] ^ 13722);
                                            i20++;
                                        }
                                    }
                                    objArr[0] = new String(cArr4);
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                String str = "";
                                int i3 = 2 % 2;
                                int i4 = f1355a + 71;
                                d = i4 % 128;
                                int i5 = i4 % 2;
                                ScholarshipDataEligible scholarshipDataEligible = (ScholarshipDataEligible) obj2;
                                Intrinsics.checkNotNullParameter(scholarshipDataEligible, "");
                                String nik = scholarshipDataEligible.getNik();
                                if (nik == null) {
                                    int i6 = d + 119;
                                    f1355a = i6 % 128;
                                    int i7 = i6 % 2;
                                } else {
                                    str = nik;
                                }
                                int i8 = d + 25;
                                f1355a = i8 % 128;
                                int i9 = i8 % 2;
                                return str;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r2v0 */
                            /* JADX WARN: Type inference failed for: r2v1 */
                            /* JADX WARN: Type inference failed for: r2v10 */
                            /* JADX WARN: Type inference failed for: r2v109 */
                            /* JADX WARN: Type inference failed for: r2v11 */
                            /* JADX WARN: Type inference failed for: r2v110 */
                            /* JADX WARN: Type inference failed for: r2v48, types: [byte[]] */
                            /* JADX WARN: Type inference failed for: r2v49 */
                            /* JADX WARN: Type inference failed for: r2v51, types: [java.lang.Object[]] */
                            /* JADX WARN: Type inference failed for: r2v80 */
                            /* JADX WARN: Type inference failed for: r3v121, types: [java.lang.reflect.Method] */
                            /* JADX WARN: Type inference failed for: r3v166 */
                            /* JADX WARN: Type inference failed for: r3v167 */
                            public static Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(Context context, int i3, int i4) {
                                int i5;
                                Object obj2;
                                Class<?> cls;
                                Class<?>[] clsArr;
                                int i6;
                                int i7;
                                Object obj3;
                                Object obj4;
                                Object objNewInstance;
                                int i8;
                                int i9;
                                String str;
                                int i10;
                                int i11;
                                char[] cArr;
                                byte packedPositionType;
                                int iB;
                                int i12;
                                ?? method;
                                ?? r2 = i4;
                                int i13 = 2 % 2;
                                int i14 = d;
                                int i15 = (i14 & 27) + (i14 | 27);
                                f1355a = i15 % 128;
                                int i16 = i15 % 2;
                                int i17 = 1;
                                if (context != null) {
                                    int i18 = ((i14 | 103) << 1) - (i14 ^ 103);
                                    f1355a = i18 % 128;
                                    int i19 = i18 % 2;
                                    try {
                                        int i20 = -KeyEvent.getDeadChar(0, 0);
                                        int iB2 = setRelative.b();
                                        int i21 = d;
                                        int i22 = ((i21 | 11) << 1) - (i21 ^ 11);
                                        f1355a = i22 % 128;
                                        if (i22 % 2 != 0) {
                                            i5 = (i20 * (-464)) / (-802);
                                        } else {
                                            int i23 = i20 * (-464);
                                            i5 = (i23 | (-117983)) + (i23 & (-117983));
                                        }
                                        int i24 = ~i20;
                                        int i25 = (iB2 ^ 127) | (iB2 & 127);
                                        int i26 = ~i25;
                                        int i27 = (-465) * ((i26 & i24) | (i24 ^ i26));
                                        int i28 = ~(iB2 | i24);
                                        int i29 = (i5 & i27) + (i5 | i27) + (((i28 & 127) | (i28 ^ 127)) * 930);
                                        int i30 = (i21 ^ 119) + ((i21 & 119) << 1);
                                        f1355a = i30 % 128;
                                        if (i30 % 2 != 0) {
                                            int i31 = ~i20;
                                            Object[] objArr = new Object[1];
                                            c(null, null, i29 << (464 - (~(-((i31 & i25) | (i25 ^ i31))))), new byte[]{-109, -110, -125, -127, -112, -122, -119, -120, -121, -122, -123, -124, -125, -111, -112, -113, -114, -115, -116, -117, -118, -122, -119, -120, -121, -122, -123, -124, -125, -126, -127}, objArr);
                                            obj2 = objArr[0];
                                        } else {
                                            Object[] objArr2 = new Object[1];
                                            c(null, null, (i29 - (~(((i25 ^ i24) | (i25 & i24)) * 465))) - 1, new byte[]{-109, -110, -125, -127, -112, -122, -119, -120, -121, -122, -123, -124, -125, -111, -112, -113, -114, -115, -116, -117, -118, -122, -119, -120, -121, -122, -123, -124, -125, -126, -127}, objArr2);
                                            obj2 = objArr2[0];
                                        }
                                        try {
                                            Object[] objArr3 = {(String) obj2};
                                            int i32 = -TextUtils.getTrimmedLength("");
                                            int i33 = ~i32;
                                            int i34 = (((i32 * (-665)) + 12692) - (~(i33 * (-333)))) - 1;
                                            int i35 = ~i32;
                                            int i36 = ~i3;
                                            int i37 = ~((i35 & i36) | (i35 ^ i36));
                                            int i38 = ~((i3 ^ 38) | (i3 & 38));
                                            int i39 = i34 + (((i37 & i38) | (i37 ^ i38)) * 333);
                                            int i40 = d;
                                            int i41 = ((i40 | 107) << 1) - (i40 ^ 107);
                                            f1355a = i41 % 128;
                                            int i42 = i41 % 2;
                                            int i43 = (i39 - (~(333 * ((~((i33 ^ i3) | (i33 & i3))) | (~((i36 ^ 38) | (i36 & 38))))))) - 1;
                                            char[] cArr2 = {'#', Typography.dollar, 14, ')', '%', '\b', 25, '+', 7, '0', 21, 19, 14, 29, 7, '%', '+', 14, 2, '\r', Typography.amp, '\b', 13742, 13742, '\n', 2, 11, '\t', 15, Typography.dollar, 21, 19, '\r', 7, 21, 14, Typography.dollar, Typography.amp};
                                            int iRed = Color.red(0);
                                            int iB3 = setRelative.b();
                                            int i44 = ~(((-5) ^ iRed) | ((-5) & iRed));
                                            int i45 = ~iRed;
                                            int i46 = (i45 ^ 4) | (i45 & 4);
                                            int i47 = ~((i46 ^ iB3) | (i46 & iB3));
                                            int i48 = ((iRed * (-500)) - 2000) + (((i44 ^ i47) | (i47 & i44)) * TypedValues.PositionType.TYPE_TRANSITION_EASING);
                                            int i49 = ~iRed;
                                            int i50 = f1355a + 25;
                                            d = i50 % 128;
                                            if (i50 % 2 == 0) {
                                                int i51 = 1002 << (~((i49 & (-5)) | (i49 ^ (-5))));
                                                int i52 = (i48 ^ i51) + ((i51 & i48) << 1);
                                                int i53 = ~iB3;
                                                int i54 = (i45 & i53) | (i45 ^ i53);
                                                Object[] objArr4 = new Object[1];
                                                e(i43, cArr2, (byte) ((i52 - (~(-(500 - (~(-(~((i54 & 4) | (i54 ^ 4))))))))) - 1), objArr4);
                                                cls = Class.forName((String) objArr4[0]);
                                                clsArr = new Class[1];
                                                clsArr[1] = String.class;
                                            } else {
                                                int i55 = (~((i49 & (-5)) | (i49 ^ (-5)))) * 1002;
                                                int i56 = ((i48 | i55) << 1) - (i55 ^ i48);
                                                int i57 = i45 | (~iB3);
                                                int i58 = (~((i57 & 4) | (i57 ^ 4))) * TypedValues.PositionType.TYPE_TRANSITION_EASING;
                                                Object[] objArr5 = new Object[1];
                                                e(i43, cArr2, (byte) ((i56 & i58) + (i58 | i56)), objArr5);
                                                cls = Class.forName((String) objArr5[0]);
                                                clsArr = new Class[]{String.class};
                                            }
                                            Object objNewInstance2 = cls.getDeclaredConstructor(clsArr).newInstance(objArr3);
                                            int i59 = -MotionEvent.axisFromString("");
                                            int i60 = ((i59 | 30) << 1) - (i59 ^ 30);
                                            char[] cArr3 = {31, '0', 18, Typography.amp, ',', 20, '/', 17, '\t', 5, 22, '/', 16, 0, 6, ')', 3, '+', 26, 19, 5, 23, '*', 15, '\t', 2, '0', '/', 14, '.', 13857};
                                            int i61 = -ExpandableListView.getPackedPositionType(0L);
                                            int iB4 = setRelative.b();
                                            int i62 = i61 * 673;
                                            int i63 = f1355a;
                                            int i64 = (i63 & 125) + (i63 | 125);
                                            int i65 = i64 % 128;
                                            d = i65;
                                            if (i64 % 2 == 0) {
                                                int i66 = i62 >> (-1379);
                                                int i67 = ((~((i61 ^ iB4) | (i61 & iB4))) | 36) + 672;
                                                i6 = (i66 ^ i67) + ((i66 & i67) << 1);
                                                int i68 = ~i61;
                                                int i69 = ~iB4;
                                                int i70 = ~((i68 & i69) | (i68 ^ i69));
                                                int i71 = ~(iB4 | 36);
                                                i7 = (i70 & i71) | (i70 ^ i71);
                                            } else {
                                                int i72 = ((i62 | (-48348)) << 1) - (i62 ^ (-48348));
                                                int i73 = ~(i61 | iB4);
                                                int i74 = -(-(((i73 & 36) | (i73 ^ 36)) * 672));
                                                i6 = (i72 ^ i74) + ((i74 & i72) << 1);
                                                int i75 = ~i61;
                                                int i76 = ~iB4;
                                                i7 = (~((i75 & i76) | (i75 ^ i76))) | (~((iB4 ^ 36) | (iB4 & 36)));
                                            }
                                            int i77 = ((i65 | 23) << 1) - (i65 ^ 23);
                                            f1355a = i77 % 128;
                                            if (i77 % 2 != 0) {
                                                int i78 = ~iB4;
                                                int i79 = ~((i78 & (-37)) | ((-37) ^ i78));
                                                int i80 = ~((i61 & (-37)) | ((-37) ^ i61));
                                                byte b2 = (byte) ((i6 << ((-672) % i7)) >>> (672 / ((i80 & i79) | (i79 ^ i80))));
                                                Object[] objArr6 = new Object[1];
                                                e(i60, cArr3, b2, objArr6);
                                                obj3 = objArr6[0];
                                            } else {
                                                int i81 = (i6 - (~((-672) * i7))) - 1;
                                                int i82 = ~iB4;
                                                int i83 = ~((i82 & (-37)) | ((-37) ^ i82));
                                                int i84 = ~((i61 & (-37)) | ((-37) ^ i61));
                                                byte b3 = (byte) ((i81 - (~(-(-(((i84 & i83) | (i83 ^ i84)) * 672))))) - 1);
                                                Object[] objArr7 = new Object[1];
                                                e(i60, cArr3, b3, objArr7);
                                                obj3 = objArr7[0];
                                            }
                                            try {
                                                Object[] objArr8 = {(String) obj3};
                                                int iIndexOf = TextUtils.indexOf("", "");
                                                int i85 = d;
                                                int i86 = ((i85 | 123) << 1) - (i85 ^ 123);
                                                f1355a = i86 % 128;
                                                int i87 = i86 % 2;
                                                int i88 = 38 - iIndexOf;
                                                char[] cArr4 = {'#', Typography.dollar, 14, ')', '%', '\b', 25, '+', 7, '0', 21, 19, 14, 29, 7, '%', '+', 14, 2, '\r', Typography.amp, '\b', 13742, 13742, '\n', 2, 11, '\t', 15, Typography.dollar, 21, 19, '\r', 7, 21, 14, Typography.dollar, Typography.amp};
                                                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L);
                                                int iB5 = setRelative.b();
                                                int i89 = packedPositionGroup * (-464);
                                                int i90 = (i89 ^ (-3716)) + ((i89 & (-3716)) << 1);
                                                int i91 = (iB5 ^ 4) | (iB5 & 4);
                                                int i92 = ((~packedPositionGroup) | (~i91)) * (-465);
                                                int i93 = ~packedPositionGroup;
                                                int i94 = ~((iB5 & i93) | (i93 ^ iB5));
                                                int i95 = (i90 ^ i92) + ((i92 & i90) << 1) + (((i94 & 4) | (i94 ^ 4)) * 930);
                                                int i96 = d;
                                                int i97 = (i96 ^ 117) + ((i96 & 117) << 1);
                                                f1355a = i97 % 128;
                                                if (i97 % 2 != 0) {
                                                    Object[] objArr9 = new Object[1];
                                                    e(i88, cArr4, (byte) (i95 - (465 >>> ((i93 & i91) | (i91 ^ i93)))), objArr9);
                                                    obj4 = objArr9[0];
                                                } else {
                                                    Object[] objArr10 = new Object[1];
                                                    e(i88, cArr4, (byte) (i95 + (((i93 & i91) | (i91 ^ i93)) * 465)), objArr10);
                                                    obj4 = objArr10[0];
                                                }
                                                String str2 = (String) obj4;
                                                int i98 = d;
                                                int i99 = ((i98 | 21) << 1) - (i98 ^ 21);
                                                f1355a = i99 % 128;
                                                int i100 = i99 % 2;
                                                Constructor<?> declaredConstructor = Class.forName(str2).getDeclaredConstructor(String.class);
                                                int i101 = f1355a + 39;
                                                d = i101 % 128;
                                                if (i101 % 2 == 0) {
                                                    try {
                                                        objNewInstance = declaredConstructor.newInstance(objArr8);
                                                        i8 = 0;
                                                        int i102 = 64 / 0;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        Throwable cause = th.getCause();
                                                        if (cause != null) {
                                                            throw cause;
                                                        }
                                                        throw th;
                                                    }
                                                } else {
                                                    i8 = 0;
                                                    objNewInstance = declaredConstructor.newInstance(objArr8);
                                                }
                                                try {
                                                    int i103 = -View.MeasureSpec.makeMeasureSpec(i8, i8);
                                                    int i104 = i103 * (-183);
                                                    int i105 = ((i104 | (-4209)) << 1) - (i104 ^ (-4209));
                                                    int i106 = ~i103;
                                                    int i107 = (i106 ^ i36) | (i106 & i36);
                                                    int i108 = ~((i107 & 23) | (i107 ^ 23));
                                                    int i109 = ((-24) ^ i36) | ((-24) & i36);
                                                    int i110 = ~((i109 & i103) | (i109 ^ i103));
                                                    int i111 = (i105 - (~(-(-(((i108 & i110) | (i108 ^ i110)) * (-184)))))) - 1;
                                                    int i112 = ~i103;
                                                    int i113 = ~((i112 & (-24)) | (i112 ^ (-24)));
                                                    int i114 = ~((i106 & i36) | (i106 ^ i36));
                                                    int i115 = (i114 & i113) | (i113 ^ i114);
                                                    int i116 = ~i3;
                                                    int i117 = ~(((-24) & i116) | ((-24) ^ i116));
                                                    int i118 = -(-(((i115 & i117) | (i115 ^ i117)) * 184));
                                                    int i119 = ((i111 | i118) << 1) - (i118 ^ i111);
                                                    int i120 = -(-(((i103 & 23) | (i103 ^ 23)) * 184));
                                                    int i121 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                    int i122 = (i121 * 784) + 907;
                                                    int i123 = ~i121;
                                                    int i124 = i123 | i36;
                                                    int i125 = -(-((~((i124 & 124) | (i124 ^ 124))) * (-783)));
                                                    int i126 = ((i122 | i125) << 1) - (i122 ^ i125);
                                                    int i127 = ~(i36 | 124);
                                                    byte b4 = (byte) ((i126 - (~(-(-(((i123 & i127) | (i123 ^ i127)) * 783))))) - 1);
                                                    Object[] objArr11 = new Object[1];
                                                    e((i119 ^ i120) + ((i120 & i119) << 1), new char[]{'(', 7, 5, 23, '*', 15, '\t', 16, '\b', '0', '\b', 19, '/', 11, 16, '\b', 29, '0', '\b', 19, '+', '\'', 13931}, b4, objArr11);
                                                    Class<?> cls2 = Class.forName((String) objArr11[0]);
                                                    int maxKeyCode = KeyEvent.getMaxKeyCode() >> 16;
                                                    int iB6 = setRelative.b();
                                                    int i128 = (maxKeyCode * 193) + 3281;
                                                    int i129 = ~iB6;
                                                    int i130 = ~maxKeyCode;
                                                    int i131 = ~((i130 ^ 17) | (i130 & 17));
                                                    int i132 = ((i129 ^ i131) | (i131 & i129)) * (-192);
                                                    int i133 = (i128 & i132) + (i128 | i132);
                                                    int i134 = ~maxKeyCode;
                                                    int i135 = -(-(((~((i134 & (-18)) | (i134 ^ (-18)))) | (~(((-18) & i129) | ((-18) ^ i129)))) * (-384)));
                                                    int i136 = (i133 ^ i135) + ((i133 & i135) << 1);
                                                    int i137 = (i130 ^ (-18)) | (i130 & (-18));
                                                    int i138 = ~((i137 & iB6) | (i137 ^ iB6));
                                                    int i139 = ~iB6;
                                                    int i140 = ((-18) & i139) | ((-18) ^ i139);
                                                    int i141 = ~((i140 & maxKeyCode) | (i140 ^ maxKeyCode));
                                                    int i142 = (i138 & i141) | (i138 ^ i141);
                                                    int i143 = ~((maxKeyCode & 17) | (maxKeyCode ^ 17) | iB6);
                                                    int i144 = -(-(((i143 & i142) | (i142 ^ i143)) * DerHeader.TAG_CLASS_PRIVATE));
                                                    int i145 = (i136 & i144) + (i144 | i136);
                                                    char[] cArr5 = {'\'', '-', 22, Typography.dollar, ')', 7, 21, '\'', '\'', '-', 0, '(', 7, '(', '\'', '-', 13859};
                                                    int i146 = -Process.getGidForName("");
                                                    int i147 = i146 * (-380);
                                                    int i148 = (i147 & 22156) + (i147 | 22156);
                                                    int i149 = i3 | 58;
                                                    int i150 = ~i146;
                                                    int i151 = ((i149 ^ i150) | (i149 & i150)) * (-381);
                                                    int i152 = (i148 ^ i151) + ((i151 & i148) << 1);
                                                    int i153 = ~i146;
                                                    int i154 = -(-(((~((i36 ^ 58) | (i36 & 58))) | (~(i153 | (-59))) | (~((i146 & 58) | (i146 ^ 58)))) * 381));
                                                    int i155 = ((i152 | i154) << 1) - (i154 ^ i152);
                                                    int i156 = (~((i153 ^ 58) | (i153 & 58))) * 381;
                                                    byte b5 = (byte) ((i155 & i156) + (i156 | i155));
                                                    Object[] objArr12 = new Object[1];
                                                    e(i145, cArr5, b5, objArr12);
                                                    Object objInvoke = cls2.getMethod((String) objArr12[0], null).invoke(context, null);
                                                    try {
                                                        int i157 = -(-(Process.myPid() >> 22));
                                                        int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                                        int i158 = ~iIndexOf2;
                                                        int i159 = ~((i158 & ComposerKt.defaultsKey) | (i158 ^ ComposerKt.defaultsKey));
                                                        int i160 = ~iIndexOf2;
                                                        int i161 = (i160 ^ 126) | (i160 & 126);
                                                        int i162 = ((((iIndexOf2 * (-751)) - 94626) - (~(((~((i160 ^ i3) | (i160 & i3))) | i159) * 1504))) - 1) + ((~((i161 ^ i3) | (i161 & i3))) * (-1504));
                                                        int i163 = ~i161;
                                                        int i164 = ~(iIndexOf2 | ComposerKt.defaultsKey);
                                                        int i165 = -(-(((i164 & i163) | (i163 ^ i164)) * 752));
                                                        Object[] objArr13 = new Object[1];
                                                        e((i157 & 23) + (i157 | 23), new char[]{'(', 7, 5, 23, '*', 15, '\t', 16, '\b', '0', '\b', 19, '/', 11, 16, '\b', 29, '0', '\b', 19, '+', '\'', 13931}, (byte) (((i162 | i165) << 1) - (i165 ^ i162)), objArr13);
                                                        Class<?> cls3 = Class.forName((String) objArr13[0]);
                                                        Object[] objArr14 = new Object[1];
                                                        c(null, null, 126 - (~(ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), new byte[]{-116, -103, -106, -126, -116, -113, -106, -104, -105, -106, -107, -108, -116, -113}, objArr14);
                                                        try {
                                                            Object[] objArr15 = {cls3.getMethod((String) objArr14[0], null).invoke(context, null), 64};
                                                            int packedPositionChild = ExpandableListView.getPackedPositionChild(0L);
                                                            int iB7 = setRelative.b();
                                                            int i166 = ~packedPositionChild;
                                                            int i167 = ~iB7;
                                                            int i168 = ~(((-129) ^ i167) | (i167 & (-129)));
                                                            int i169 = (i166 ^ i168) | (i168 & i166);
                                                            int i170 = ~((iB7 & 128) | (iB7 ^ 128));
                                                            int i171 = (((packedPositionChild * (-563)) + 72320) - (~(-(-(((i170 & i169) | (i169 ^ i170)) * (-564)))))) - 1;
                                                            int i172 = ~packedPositionChild;
                                                            int i173 = (i172 & 128) | (i172 ^ 128);
                                                            int i174 = (~((i173 & iB7) | (i173 ^ iB7))) * 1128;
                                                            int i175 = ~iB7;
                                                            int i176 = ~((i175 & i166) | (i166 ^ i175));
                                                            Object[] objArr16 = new Object[1];
                                                            c(null, null, (((i171 & i174) + (i174 | i171)) - (~(-(-(((~(packedPositionChild | 128)) | i176) * 564))))) - 1, new byte[]{-121, -116, -113, -106, -123, -106, -100, -116, -113, -106, -104, -105, -106, -107, -102, -103, -101, -102, -108, -123, -116, -108, -123, -120, -105, -102, -122, -119, -120, -121, -122, -123, -106}, objArr16);
                                                            Class<?> cls4 = Class.forName((String) objArr16[0]);
                                                            int i177 = -(-TextUtils.indexOf((CharSequence) "", '0'));
                                                            Object[] objArr17 = new Object[1];
                                                            c(null, null, (i177 & 128) + (i177 | 128), new byte[]{-120, -98, -123, -99, -116, -113, -106, -104, -105, -106, -107, -108, -116, -113}, objArr17);
                                                            Object objInvoke2 = cls4.getMethod((String) objArr17[0], String.class, Integer.TYPE).invoke(objInvoke, objArr15);
                                                            Object[] objArr18 = new Object[1];
                                                            c(null, null, 126 - (~(ViewConfiguration.getTapTimeout() >> 16)), new byte[]{-120, -98, -123, -99, -116, -113, -106, -104, -105, -106, -107, -102, -103, -101, -102, -108, -123, -116, -108, -123, -120, -105, -102, -122, -119, -120, -121, -122, -123, -106}, objArr18);
                                                            Class<?> cls5 = Class.forName((String) objArr18[0]);
                                                            Object[] objArr19 = new Object[1];
                                                            e(KeyEvent.getDeadChar(0, 0) + 10, new char[]{21, 15, '(', '\n', Typography.dollar, 14, '/', 21, '+', 25}, (byte) (76 - (~(-(ViewConfiguration.getMinimumFlingVelocity() >> 16)))), objArr19);
                                                            Object[] objArr20 = (Object[]) cls5.getField((String) objArr19[0]).get(objInvoke2);
                                                            int length = objArr20.length;
                                                            int i178 = d;
                                                            int i179 = (i178 ^ 119) + ((i178 & 119) << 1);
                                                            f1355a = i179 % 128;
                                                            int i180 = i179 % 2;
                                                            int i181 = 0;
                                                            r2 = r2;
                                                            while (true) {
                                                                if (i181 < length) {
                                                                    Object obj5 = objArr20[i181];
                                                                    int fadingEdgeLength = ViewConfiguration.getFadingEdgeLength() >> 16;
                                                                    int i182 = ((fadingEdgeLength | 5) << i17) - (fadingEdgeLength ^ 5);
                                                                    char[] cArr6 = {2, '\n', 11, '\t', 13752};
                                                                    int i183 = 20 - (~(-ExpandableListView.getPackedPositionType(0L)));
                                                                    int i184 = d + 119;
                                                                    f1355a = i184 % 128;
                                                                    byte b6 = (byte) i183;
                                                                    if (i184 % 2 != 0) {
                                                                        Object[] objArr21 = new Object[i17];
                                                                        e(i182, cArr6, b6, objArr21);
                                                                        str = (String) objArr21[0];
                                                                        int i185 = 10 / 0;
                                                                        i9 = 0;
                                                                    } else {
                                                                        Object[] objArr22 = new Object[i17];
                                                                        e(i182, cArr6, b6, objArr22);
                                                                        i9 = 0;
                                                                        str = (String) objArr22[0];
                                                                    }
                                                                    try {
                                                                        Object[] objArr23 = {str};
                                                                        int iIndexOf3 = TextUtils.indexOf((CharSequence) "", '0', i9);
                                                                        int iB8 = setRelative.b();
                                                                        int i186 = iIndexOf3 * 595;
                                                                        int i187 = ((i186 | (-151936)) << 1) - (i186 ^ (-151936));
                                                                        int i188 = ~iIndexOf3;
                                                                        int i189 = ~((i188 ^ 128) | (i188 & 128));
                                                                        int i190 = ~iB8;
                                                                        Object[] objArr24 = objArr20;
                                                                        int i191 = ~((i190 & 128) | (i190 ^ 128));
                                                                        int i192 = i187 + (((i191 & i189) | (i189 ^ i191)) * (-1188));
                                                                        int i193 = ~((~iIndexOf3) | 128);
                                                                        int i194 = ~(((-129) ^ iB8) | ((-129) & iB8));
                                                                        int i195 = (i193 ^ i194) | (i193 & i194);
                                                                        int i196 = ~iB8;
                                                                        int i197 = ~((i196 & iIndexOf3) | (i196 ^ iIndexOf3));
                                                                        int i198 = i192 + (((i195 & i197) | (i195 ^ i197)) * 594);
                                                                        int i199 = (~(((-129) ^ i190) | ((-129) & i190))) | (~(((-129) ^ iIndexOf3) | (iIndexOf3 & (-129))));
                                                                        int i200 = -(-(((i199 & i197) | (i199 ^ i197)) * 594));
                                                                        Object[] objArr25 = new Object[1];
                                                                        c(null, null, (i198 ^ i200) + ((i198 & i200) << 1), new byte[]{-94, -121, -120, -108, -105, -106, -93, -116, -108, -106, -105, -119, -98, -119, -108, -121, -116, -127, -102, -108, -121, -116, -105, -102, -94, -108, -119, -121, -114, -105, -116, -95, -102, -106, -96, -106, -97}, objArr25);
                                                                        Class<?> cls6 = Class.forName((String) objArr25[0]);
                                                                        int i201 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                                                        int i202 = i201 * TypedValues.PositionType.TYPE_PERCENT_WIDTH;
                                                                        int i203 = (i202 ^ 5030) + ((i202 & 5030) << 1);
                                                                        int i204 = i201 | 10;
                                                                        int i205 = -(-(i204 * (-502)));
                                                                        int i206 = (i203 & i205) + (i203 | i205);
                                                                        int i207 = d;
                                                                        int i208 = ((i207 | 45) << 1) - (i207 ^ 45);
                                                                        int i209 = length;
                                                                        f1355a = i208 % 128;
                                                                        int i210 = i208 % 2;
                                                                        int i211 = ~i201;
                                                                        if (i210 != 0) {
                                                                            int i212 = ~((i211 ^ (-11)) | (i211 & (-11)));
                                                                            int i213 = ~((i211 ^ i116) | (i211 & i116));
                                                                            int i214 = (i212 ^ i213) | (i213 & i212);
                                                                            int i215 = (i201 ^ 10) | (i201 & 10);
                                                                            int i216 = ~((i215 ^ i3) | (i215 & i3));
                                                                            i10 = i206 >> ((-503) - (~(-((i214 ^ i216) | (i214 & i216)))));
                                                                        } else {
                                                                            int i217 = (~((i211 ^ i36) | (i211 & i36))) | (~((i211 ^ (-11)) | (i211 & (-11))));
                                                                            int i218 = (i201 ^ 10) | (i201 & 10);
                                                                            int i219 = ~((i218 ^ i3) | (i218 & i3));
                                                                            i10 = (((i217 ^ i219) | (i217 & i219)) * (-502)) + i206;
                                                                        }
                                                                        int i220 = i207 + 91;
                                                                        f1355a = i220 % 128;
                                                                        if (i220 % 2 != 0) {
                                                                            int i221 = (~i201) | i116;
                                                                            int i222 = ~((i221 & 10) | (i221 ^ 10));
                                                                            int i223 = (i201 & 10) | (i201 ^ 10);
                                                                            int i224 = ~((i223 & i3) | (i223 ^ i3));
                                                                            i11 = i10 / (TypedValues.PositionType.TYPE_DRAWPATH >> ((i224 & i222) | (i222 ^ i224)));
                                                                            cArr = new char[]{'\'', '-', 19, Typography.dollar, '\b', 26, 14, Typography.dollar, '\r', 7, 13924};
                                                                            packedPositionType = (byte) (105 / ExpandableListView.getPackedPositionType(0L));
                                                                        } else {
                                                                            int i225 = ~i201;
                                                                            int i226 = (i225 & i36) | (i225 ^ i36);
                                                                            int i227 = ~((i226 & 10) | (i226 ^ 10));
                                                                            int i228 = ~(i204 | i3);
                                                                            int i229 = -(-(TypedValues.PositionType.TYPE_DRAWPATH * ((i227 & i228) | (i227 ^ i228))));
                                                                            i11 = ((i10 & i229) << 1) + (i10 ^ i229);
                                                                            cArr = new char[]{'\'', '-', 19, Typography.dollar, '\b', 26, 14, Typography.dollar, '\r', 7, 13924};
                                                                            packedPositionType = (byte) (100 - (~(-ExpandableListView.getPackedPositionType(0L))));
                                                                        }
                                                                        Object[] objArr26 = new Object[1];
                                                                        e(i11, cArr, packedPositionType, objArr26);
                                                                        Object objInvoke3 = cls6.getMethod((String) objArr26[0], String.class).invoke(null, objArr23);
                                                                        try {
                                                                            int i230 = -Color.blue(0);
                                                                            int i231 = (i230 ^ 28) + ((i230 & 28) << 1);
                                                                            char[] cArr7 = {'(', 7, 5, 23, '*', 15, '\t', 16, '\b', '0', '\b', 19, '/', 11, 16, '\b', 14, 7, 11, '%', 17, '#', 7, '(', 14, '+', 25, '/'};
                                                                            int threadPriority = (Process.getThreadPriority(0) + 20) >> 6;
                                                                            int i232 = threadPriority * (-721);
                                                                            int i233 = (i232 ^ (-9373)) + ((i232 & (-9373)) << 1);
                                                                            int i234 = ~threadPriority;
                                                                            int i235 = ~((i234 ^ (-14)) | (i234 & (-14)));
                                                                            int i236 = (i36 ^ i235) | (i235 & i36);
                                                                            int i237 = i116;
                                                                            int i238 = (threadPriority ^ 13) | (threadPriority & 13);
                                                                            int i239 = ~i238;
                                                                            int i240 = i233 + (((i236 ^ i239) | (i239 & i236)) * 1444);
                                                                            int i241 = ~i238;
                                                                            int i242 = ~((threadPriority ^ i3) | (threadPriority & i3));
                                                                            int i243 = i240 + (((i241 & i242) | (i241 ^ i242) | (~(i3 | 13))) * (-1444));
                                                                            int i244 = ~((i234 ^ 13) | (i234 & 13));
                                                                            int i245 = ~(((-14) & threadPriority) | ((-14) ^ threadPriority));
                                                                            try {
                                                                                Object[] objArr27 = new Object[1];
                                                                                e(i231, cArr7, (byte) (i243 + (((i244 & i245) | (i244 ^ i245)) * 722)), objArr27);
                                                                                Class<?> cls7 = Class.forName((String) objArr27[0]);
                                                                                int bitsPerPixel = ImageFormat.getBitsPerPixel(0);
                                                                                int iB9 = setRelative.b();
                                                                                int i246 = (bitsPerPixel * (-523)) + 33664;
                                                                                int i247 = ~bitsPerPixel;
                                                                                int i248 = ~((i247 & 128) | (i247 ^ 128));
                                                                                int i249 = (bitsPerPixel & (-129)) | ((-129) ^ bitsPerPixel);
                                                                                int i250 = ~i249;
                                                                                int i251 = -(-(((~(((-129) ^ iB9) | ((-129) & iB9))) | (i248 ^ i250) | (i248 & i250)) * 262));
                                                                                int i252 = (i246 & i251) + (i246 | i251) + (i250 * (-786));
                                                                                int i253 = ~iB9;
                                                                                int i254 = ~((i253 & (-129)) | ((-129) ^ i253));
                                                                                int i255 = (i254 & i248) | (i254 ^ i248);
                                                                                int i256 = ~i249;
                                                                                int i257 = -(-(((i255 & i256) | (i255 ^ i256)) * 262));
                                                                                Object[] objArr28 = new Object[1];
                                                                                c(null, null, ((i252 | i257) << 1) - (i257 ^ i252), new byte[]{-94, -106, -121, -121, -124, -116, -108, -94, -92, -120, -108}, objArr28);
                                                                                r2 = (byte[]) cls7.getMethod((String) objArr28[0], null).invoke(obj5, null);
                                                                                try {
                                                                                    try {
                                                                                        r2 = new Object[]{new ByteArrayInputStream(r2)};
                                                                                        int iArgb = Color.argb(0, 0, 0, 0);
                                                                                        int i258 = f1355a + 77;
                                                                                        d = i258 % 128;
                                                                                        if (i258 % 2 == 0) {
                                                                                            iB = setRelative.b();
                                                                                            i12 = ((-167) << iArgb) - 1;
                                                                                        } else {
                                                                                            iB = setRelative.b();
                                                                                            int i259 = iArgb * (-167);
                                                                                            i12 = (i259 | (-21209)) + (i259 & (-21209));
                                                                                        }
                                                                                        int i260 = ~iArgb;
                                                                                        int i261 = ~((i260 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i260 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT));
                                                                                        int i262 = ~iB;
                                                                                        int i263 = ~(((-128) & i262) | ((-128) ^ i262));
                                                                                        int i264 = 168 * ((i261 & i263) | (i261 ^ i263));
                                                                                        int i265 = ((i12 | i264) << 1) - (i12 ^ i264);
                                                                                        int i266 = f1355a;
                                                                                        int i267 = i266 + 67;
                                                                                        d = i267 % 128;
                                                                                        int i268 = i267 % 2;
                                                                                        int i269 = (i260 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | (i260 & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT);
                                                                                        int i270 = (~((i269 & iB) | (i269 ^ iB))) * 168;
                                                                                        int i271 = (i265 & i270) + (i265 | i270);
                                                                                        int i272 = ~((i260 & i262) | (i260 ^ i262));
                                                                                        int i273 = ~iArgb;
                                                                                        int i274 = ~((i273 & 127) | (i273 ^ 127));
                                                                                        int i275 = (i272 & i274) | (i272 ^ i274);
                                                                                        int i276 = i266 + 109;
                                                                                        d = i276 % 128;
                                                                                        int i277 = i276 % 2;
                                                                                        int i278 = (iArgb & WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT) | ((-128) ^ iArgb);
                                                                                        Object[] objArr29 = new Object[1];
                                                                                        c(null, null, (i271 - (~(-(-(168 * ((~((iB & i278) | (i278 ^ iB))) | i275)))))) - 1, new byte[]{-94, -121, -120, -108, -105, -106, -93, -116, -108, -106, -105, -119, -98, -119, -108, -121, -116, -127, -102, -108, -121, -116, -105, -102, -94, -108, -119, -121, -114, -105, -116, -95, -102, -106, -96, -106, -97}, objArr29);
                                                                                        Class<?> cls8 = Class.forName((String) objArr29[0]);
                                                                                        int i279 = d + 23;
                                                                                        f1355a = i279 % 128;
                                                                                        if (i279 % 2 != 0) {
                                                                                            Object[] objArr30 = new Object[1];
                                                                                            c(null, null, 127 / View.resolveSizeAndState(1, 0, 0), new byte[]{-116, -108, -106, -105, -119, -98, -119, -108, -121, -116, -127, -116, -108, -106, -121, -116, -123, -116, -113}, objArr30);
                                                                                            method = cls8.getMethod((String) objArr30[0], InputStream.class);
                                                                                        } else {
                                                                                            int i280 = -View.resolveSizeAndState(0, 0, 0);
                                                                                            Object[] objArr31 = new Object[1];
                                                                                            c(null, null, (i280 ^ 127) + ((i280 & 127) << 1), new byte[]{-116, -108, -106, -105, -119, -98, -119, -108, -121, -116, -127, -116, -108, -106, -121, -116, -123, -116, -113}, objArr31);
                                                                                            method = cls8.getMethod((String) objArr31[0], InputStream.class);
                                                                                        }
                                                                                        int i281 = d + 53;
                                                                                        f1355a = i281 % 128;
                                                                                        int i282 = i281 % 2;
                                                                                        Object objInvoke4 = method.invoke(objInvoke3, r2);
                                                                                        try {
                                                                                            int i283 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                                                            int i284 = (i283 & 35) + (i283 | 35);
                                                                                            char[] cArr8 = {'#', Typography.dollar, 14, ')', '\b', 23, '0', 11, '/', 21, 15, 16, 30, 7, 11, '0', 22, 19, '\n', 2, 11, '\t', ' ', 28, '/', 25, 16, 15, 28, 16, 7, ')', 18, '+'};
                                                                                            int i285 = -(SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                                                                                            Object[] objArr32 = new Object[1];
                                                                                            e(i284, cArr8, (byte) ((i285 & 9) + (i285 | 9)), objArr32);
                                                                                            Class<?> cls9 = Class.forName((String) objArr32[0]);
                                                                                            int threadPriority2 = Process.getThreadPriority(0);
                                                                                            int i286 = threadPriority2 * 193;
                                                                                            int i287 = ((3860 | i286) << 1) - (i286 ^ 3860);
                                                                                            int i288 = ((~(((-21) & threadPriority2) | ((-21) ^ threadPriority2))) | i36) * (-192);
                                                                                            int i289 = (i287 & i288) + (i288 | i287);
                                                                                            int i290 = ~threadPriority2;
                                                                                            int i291 = ~((-21) | i290);
                                                                                            int i292 = ~((i290 ^ i36) | (i290 & i36));
                                                                                            int i293 = (i289 - (~(-(-(((i291 & i292) | (i291 ^ i292)) * (-384)))))) - 1;
                                                                                            int i294 = ~(((-21) & i290) | ((-21) ^ i290) | i3);
                                                                                            int i295 = ~(i290 | i36 | 20);
                                                                                            int i296 = (i295 & i294) | (i294 ^ i295);
                                                                                            int i297 = threadPriority2 | 20;
                                                                                            int i298 = ~((i297 & i3) | (i297 ^ i3));
                                                                                            int i299 = i296 ^ i298;
                                                                                            Object[] objArr33 = new Object[1];
                                                                                            r2 = 0;
                                                                                            c(null, null, 127 - (((i293 - (~(((i296 & i298) | i299) * DerHeader.TAG_CLASS_PRIVATE))) - 1) >> 6), new byte[]{-88, -106, -101, -119, -105, -123, -119, -121, -107, -89, -89, -90, -91, -108, -105, -116, -97, -115, -114, -109, -108, -116, -113}, objArr33);
                                                                                            if (objNewInstance2.equals(cls9.getMethod((String) objArr33[0], null).invoke(objInvoke4, null))) {
                                                                                                break;
                                                                                            }
                                                                                            int i300 = d;
                                                                                            int i301 = (i300 & 49) + (i300 | 49);
                                                                                            f1355a = i301 % 128;
                                                                                            int i302 = i301 % 2;
                                                                                            try {
                                                                                                int iIndexOf4 = TextUtils.indexOf("", "", 0);
                                                                                                int i303 = ((iIndexOf4 | 34) << 1) - (iIndexOf4 ^ 34);
                                                                                                char[] cArr9 = {'#', Typography.dollar, 14, ')', '\b', 23, '0', 11, '/', 21, 15, 16, 30, 7, 11, '0', 22, 19, '\n', 2, 11, '\t', ' ', 28, '/', 25, 16, 15, 28, 16, 7, ')', 18, '+'};
                                                                                                int i304 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                                                                                                int iB10 = setRelative.b();
                                                                                                int i305 = (i304 * 471) + 3768 + (((i304 ^ 8) | (i304 & 8)) * (-470));
                                                                                                int i306 = d + 71;
                                                                                                f1355a = i306 % 128;
                                                                                                if (i306 % 2 != 0) {
                                                                                                    Object obj6 = null;
                                                                                                    obj6.hashCode();
                                                                                                    throw null;
                                                                                                }
                                                                                                int i307 = ~i304;
                                                                                                int i308 = ~((i307 & (-9)) | (i307 ^ (-9)));
                                                                                                int i309 = ~(((-9) & iB10) | ((-9) ^ iB10));
                                                                                                int i310 = (i308 & i309) | (i308 ^ i309);
                                                                                                int i311 = ~iB10;
                                                                                                int i312 = (i311 & i304) | (i311 ^ i304);
                                                                                                int i313 = ~((i312 & 8) | (i312 ^ 8));
                                                                                                int i314 = -(-((-470) * ((i310 & i313) | (i310 ^ i313))));
                                                                                                int i315 = (i305 & i314) + (i305 | i314);
                                                                                                int i316 = ((-9) & i304) | ((-9) ^ i304);
                                                                                                int i317 = -(-(((~(i304 | (~iB10) | 8)) | (~((i316 & iB10) | (i316 ^ iB10)))) * 470));
                                                                                                Object[] objArr34 = new Object[1];
                                                                                                e(i303, cArr9, (byte) ((i315 ^ i317) + ((i317 & i315) << 1)), objArr34);
                                                                                                Class<?> cls10 = Class.forName((String) objArr34[0]);
                                                                                                int trimmedLength = TextUtils.getTrimmedLength("");
                                                                                                int i318 = (trimmedLength ^ 127) + ((trimmedLength & 127) << 1);
                                                                                                int i319 = d;
                                                                                                int i320 = (i319 & 25) + (i319 | 25);
                                                                                                f1355a = i320 % 128;
                                                                                                int i321 = i320 % 2;
                                                                                                Object[] objArr35 = new Object[1];
                                                                                                c(null, null, i318, new byte[]{-88, -106, -101, -119, -105, -123, -119, -121, -107, -89, -89, -90, -91, -108, -105, -116, -97, -115, -114, -109, -108, -116, -113}, objArr35);
                                                                                                if (objNewInstance.equals(cls10.getMethod((String) objArr35[0], null).invoke(objInvoke4, null))) {
                                                                                                    break;
                                                                                                }
                                                                                                int i322 = i181 + 42;
                                                                                                i181 = (i322 ^ (-41)) + ((i322 & (-41)) << 1);
                                                                                                r2 = i4;
                                                                                                length = i209;
                                                                                                objArr20 = objArr24;
                                                                                                i116 = i237;
                                                                                                i17 = 1;
                                                                                            } catch (Throwable th2) {
                                                                                                Throwable cause2 = th2.getCause();
                                                                                                if (cause2 != null) {
                                                                                                    throw cause2;
                                                                                                }
                                                                                                throw th2;
                                                                                            }
                                                                                        } catch (Throwable th3) {
                                                                                            Throwable cause3 = th3.getCause();
                                                                                            if (cause3 != null) {
                                                                                                throw cause3;
                                                                                            }
                                                                                            throw th3;
                                                                                        }
                                                                                    } catch (Throwable th4) {
                                                                                        Throwable cause4 = th4.getCause();
                                                                                        if (cause4 != null) {
                                                                                            throw cause4;
                                                                                        }
                                                                                        throw th4;
                                                                                    }
                                                                                } catch (Throwable unused) {
                                                                                    r2 = i4;
                                                                                }
                                                                            } catch (Throwable th5) {
                                                                                th = th5;
                                                                                Throwable cause5 = th.getCause();
                                                                                if (cause5 != null) {
                                                                                    throw cause5;
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        } catch (Throwable th6) {
                                                                            th = th6;
                                                                        }
                                                                    } catch (Throwable th7) {
                                                                        Throwable cause6 = th7.getCause();
                                                                        if (cause6 != null) {
                                                                            throw cause6;
                                                                        }
                                                                        throw th7;
                                                                    }
                                                                }
                                                            }
                                                            int i323 = (i3 & (-2)) | (i36 & 1);
                                                            Object[] objArr36 = new Object[4];
                                                            int[] iArr = new int[1];
                                                            objArr36[0] = iArr;
                                                            objArr36[1] = new int[1];
                                                            int[] iArr2 = new int[1];
                                                            int i324 = f1355a;
                                                            int i325 = ((i324 | 47) << 1) - (i324 ^ 47);
                                                            d = i325 % 128;
                                                            int i326 = i325 % 2;
                                                            objArr36[2] = iArr2;
                                                            iArr[0] = i3;
                                                            iArr2[0] = i323;
                                                            objArr36[3] = null;
                                                            int startUptimeMillis = (int) Process.getStartUptimeMillis();
                                                            int i327 = ~startUptimeMillis;
                                                            int i328 = (-810060588) + ((487867656 | i327) * (-192)) + (((~(492193609 | i327)) | 44636182) * (-384)) + (((~(startUptimeMillis | (-4325954))) | (~(i327 | 536829791)) | (~((-44636183) | startUptimeMillis))) * DerHeader.TAG_CLASS_PRIVATE) + 16;
                                                            int i329 = ~i328;
                                                            int i330 = ~i4;
                                                            int i331 = (i330 & i329) | (i329 ^ i330);
                                                            int i332 = ~((i331 & i3) | (i331 ^ i3));
                                                            int i333 = (i328 ^ i4) | (i328 & i4);
                                                            int i334 = ~((i333 & i3) | (i333 ^ i3));
                                                            int i335 = (i328 * 70) + (i4 * (-68)) + (((i332 & i334) | (i332 ^ i334)) * 69);
                                                            int i336 = ~((i329 & i4) | (i329 ^ i4));
                                                            int i337 = ~((~i328) | i3);
                                                            int i338 = (i336 & i337) | (i336 ^ i337);
                                                            int i339 = ~((i4 ^ i3) | (i4 & i3));
                                                            int i340 = (i335 - (~(-(-(((i338 & i339) | (i338 ^ i339)) * (-69)))))) - 1;
                                                            int i341 = ~i4;
                                                            int i342 = -(-((~((i341 & i328) | (i341 ^ i328))) * 69));
                                                            int i343 = (i340 & i342) + (i340 | i342);
                                                            int i344 = (i343 << 13) ^ i343;
                                                            int i345 = i344 >>> 17;
                                                            int i346 = (i344 | i345) & (~(i344 & i345));
                                                            ((int[]) objArr36[1])[0] = i346 ^ (i346 << 5);
                                                            return objArr36;
                                                        } catch (Throwable th8) {
                                                            Throwable cause7 = th8.getCause();
                                                            if (cause7 != null) {
                                                                throw cause7;
                                                            }
                                                            throw th8;
                                                        }
                                                    } catch (Throwable th9) {
                                                        Throwable cause8 = th9.getCause();
                                                        if (cause8 != null) {
                                                            throw cause8;
                                                        }
                                                        throw th9;
                                                    }
                                                } catch (Throwable th10) {
                                                    Throwable cause9 = th10.getCause();
                                                    if (cause9 != null) {
                                                        throw cause9;
                                                    }
                                                    throw th10;
                                                }
                                            } catch (Throwable th11) {
                                                th = th11;
                                            }
                                        } catch (Throwable th12) {
                                            Throwable cause10 = th12.getCause();
                                            if (cause10 != null) {
                                                throw cause10;
                                            }
                                            throw th12;
                                        }
                                    } catch (Throwable unused2) {
                                    }
                                }
                                Object[] objArr37 = {new int[]{i3}, new int[1], new int[]{i3}, null};
                                int startUptimeMillis2 = (int) Process.getStartUptimeMillis();
                                int i347 = (((~(658216100 | startUptimeMillis2)) | (-244924126)) * 398) + 799324606 + (((~((~startUptimeMillis2) | 658216100)) | (-244924126)) * 398);
                                int i348 = (r2 ^ i347) + ((r2 & i347) << 1);
                                int i349 = i348 << 13;
                                int i350 = ((~i348) & i349) | ((~i349) & i348);
                                int i351 = i350 >>> 17;
                                int i352 = (i350 | i351) & (~(i350 & i351));
                                int i353 = i352 << 5;
                                ((int[]) objArr37[1])[0] = ((~i352) & i353) | ((~i353) & i352);
                                return objArr37;
                            }

                            private static String $$c(int i3, short s, byte b2) {
                                byte[] bArr = $$a;
                                int i4 = (i3 * 4) + 4;
                                int i5 = 116 - b2;
                                int i6 = s * 4;
                                byte[] bArr2 = new byte[1 - i6];
                                int i7 = 0 - i6;
                                int i8 = -1;
                                if (bArr == null) {
                                    i4++;
                                    i5 = i4 + (-i7);
                                }
                                while (true) {
                                    int i9 = i5;
                                    int i10 = i4;
                                    i8++;
                                    bArr2[i8] = (byte) i9;
                                    if (i8 == i7) {
                                        return new String(bArr2, 0);
                                    }
                                    i4 = i10 + 1;
                                    i5 = i9 + (-bArr[i10]);
                                }
                            }
                        };
                        final ScholarshipGranteeScreenKt$GranteeList$lambda$46$lambda$45$$inlined$items$default$1 scholarshipGranteeScreenKt$GranteeList$lambda$46$lambda$45$$inlined$items$default$1 = new Function1() { // from class: com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipGranteeScreenKt$GranteeList$lambda$46$lambda$45$$inlined$items$default$1
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
                            public final Void invoke(ScholarshipDataEligible scholarshipDataEligible) {
                                return null;
                            }
                        };
                        lazyListScope.items(list.size(), new Function1<Integer, Object>() { // from class: com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipGranteeScreenKt$GranteeList$lambda$46$lambda$45$$inlined$items$default$2
                            @Override // kotlin.jvm.functions.Function1
                            public final /* synthetic */ Object invoke(Integer num) {
                                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(num.intValue());
                            }

                            public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i3) {
                                return function3.invoke(list.get(i3));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        }, new Function1<Integer, Object>() { // from class: com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipGranteeScreenKt$GranteeList$lambda$46$lambda$45$$inlined$items$default$3
                            @Override // kotlin.jvm.functions.Function1
                            public final /* synthetic */ Object invoke(Integer num) {
                                return TuitionPaymentFragmentspecialinlinedviewModeldefault1(num.intValue());
                            }

                            public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault1(int i3) {
                                return scholarshipGranteeScreenKt$GranteeList$lambda$46$lambda$45$$inlined$items$default$1.invoke(list.get(i3));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipGranteeScreenKt$GranteeList$lambda$46$lambda$45$$inlined$items$default$4
                            @Override // kotlin.jvm.functions.Function4
                            public final /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer3, Integer num2) {
                                TuitionPaymentFragmentbindingInflater1(lazyItemScope, num.intValue(), composer3, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void TuitionPaymentFragmentbindingInflater1(LazyItemScope lazyItemScope, int i3, Composer composer3, int i4) {
                                int i5;
                                Triple triple;
                                if ((i4 & 6) == 0) {
                                    i5 = i4 | (composer3.changed(lazyItemScope) ? 4 : 2);
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
                                composer3.startReplaceGroup(182836677);
                                String nik = scholarshipDataEligible.getNik();
                                String str = nik == null ? "" : nik;
                                Boolean bool = updatetextbuttonvisibility2.TuitionPaymentFragmentspecialinlinedviewModeldefault2.get(str);
                                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                                if (Intrinsics.areEqual(scholarshipDataEligible.getStatusPencarian(), "Y") && Intrinsics.areEqual(scholarshipDataEligible.getStatusKonfirmasi(), ExifInterface.GPS_DIRECTION_TRUE)) {
                                    Boolean bool2 = Boolean.TRUE;
                                    triple = new Triple(bool2, bool2, Boolean.valueOf(zBooleanValue));
                                } else if (Intrinsics.areEqual(scholarshipDataEligible.getStatusPencarian(), ExifInterface.GPS_DIRECTION_TRUE) && Intrinsics.areEqual(scholarshipDataEligible.getStatusKonfirmasi(), ExifInterface.GPS_DIRECTION_TRUE)) {
                                    triple = new Triple(Boolean.TRUE, Boolean.FALSE, Boolean.TRUE);
                                } else if (Intrinsics.areEqual(scholarshipDataEligible.getStatusKonfirmasi(), "Y")) {
                                    Boolean bool3 = Boolean.FALSE;
                                    triple = new Triple(bool3, bool3, Boolean.TRUE);
                                } else {
                                    Boolean bool4 = Boolean.TRUE;
                                    triple = new Triple(bool4, bool4, Boolean.valueOf(zBooleanValue));
                                }
                                Triple triple2 = triple;
                                boolean z2 = Intrinsics.areEqual(scholarshipDataEligible.getStatusPencarian(), ExifInterface.GPS_DIRECTION_TRUE) && Intrinsics.areEqual(scholarshipDataEligible.getStatusKonfirmasi(), ExifInterface.GPS_DIRECTION_TRUE);
                                String name = scholarshipDataEligible.getName();
                                String str2 = name == null ? "" : name;
                                boolean zBooleanValue2 = ((Boolean) triple2.getFirst()).booleanValue();
                                composer3.startReplaceGroup(837209669);
                                boolean zChanged = composer3.changed(triple2);
                                boolean zChangedInstance3 = composer3.changedInstance(getratiobypercentage2);
                                boolean zChanged2 = composer3.changed(str);
                                boolean zChanged3 = composer3.changed(z2);
                                boolean zChanged4 = composer3.changed(function2);
                                boolean zChangedInstance4 = composer3.changedInstance(scholarshipDataEligible);
                                Object objRememberedValue2 = composer3.rememberedValue();
                                if ((zChanged | zChangedInstance3 | zChanged2 | zChanged3 | zChanged4 | zChangedInstance4) || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = (Function0) new getIconTintMode.TuitionPaymentFragmentspecialinlinedviewModeldefault2(triple2, getratiobypercentage2, str, z2, function2, scholarshipDataEligible);
                                    composer3.updateRememberedValue(objRememberedValue2);
                                }
                                composer3.endReplaceGroup();
                                onActionViewCollapsed.TuitionPaymentFragmentbindingInflater1(str2, str, (Function0) objRememberedValue2, ComposableLambdaKt.rememberComposableLambda(451401980, true, new getIconTintMode.TuitionPaymentFragmentbindingInflater1(z2, triple2, getratiobypercentage2, str), composer3, 54), zBooleanValue2, z2, composer3, 3072, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: isChecked
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    getIconTintMode.TuitionPaymentFragmentbindingInflater1(updatetextbuttonvisibility, getratiobypercentage, function1, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 implements Function2<Composer, Integer, Unit> {
        private /* synthetic */ Triple<Boolean, Boolean, Boolean> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private /* synthetic */ getRatioByPercentage b;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 3) != 2 || !composer2.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(451401980, iIntValue, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.GranteeList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScholarshipGranteeScreen.kt:434)");
                }
                if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    composer2.startReplaceGroup(405758170);
                    IconKt.m2127Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_information, composer2, 6), "Warning", SizeKt.m1047size3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(20.0f)), androidx.compose.ui.graphics.Color.INSTANCE.m4254getUnspecified0d7_KjU(), composer2, 3504, 0);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(406109369);
                    boolean zBooleanValue = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getThird().booleanValue();
                    composer2.startReplaceGroup(-1233822051);
                    boolean zChangedInstance = composer2.changedInstance(this.b);
                    boolean zChanged = composer2.changed(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    getRatioByPercentage getratiobypercentage = this.b;
                    String str = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3RememberedValue = composer2.rememberedValue();
                    if ((zChangedInstance | zChanged) || tuitionPaymentFragmentspecialinlinedviewModeldefault3RememberedValue == Composer.INSTANCE.getEmpty()) {
                        tuitionPaymentFragmentspecialinlinedviewModeldefault3RememberedValue = new TuitionPaymentFragmentspecialinlinedviewModeldefault3(getratiobypercentage, str);
                        composer2.updateRememberedValue(tuitionPaymentFragmentspecialinlinedviewModeldefault3RememberedValue);
                    }
                    composer2.endReplaceGroup();
                    CheckboxKt.Checkbox(zBooleanValue, (Function1) tuitionPaymentFragmentspecialinlinedviewModeldefault3RememberedValue, null, this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getSecond().booleanValue(), CheckboxDefaults.INSTANCE.m1845colors5tl4gsc(ColorResources_androidKt.colorResource(R.color.selector_default_button, composer2, 6), androidx.compose.ui.graphics.Color.INSTANCE.m4250getLightGray0d7_KjU(), androidx.compose.ui.graphics.Color.INSTANCE.m4255getWhite0d7_KjU(), androidx.compose.ui.graphics.Color.INSTANCE.m4248getGray0d7_KjU(), 0L, 0L, composer2, (CheckboxDefaults.$stable << 18) | 3504, 48), null, composer2, 0, 36);
                    composer2.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer2.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }

        static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Function1<Boolean, Unit> {
            private /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            private /* synthetic */ getRatioByPercentage TuitionPaymentFragmentspecialinlinedviewModeldefault2;

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Unit invoke(Boolean bool) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, bool.booleanValue());
                return Unit.INSTANCE;
            }

            TuitionPaymentFragmentspecialinlinedviewModeldefault3(getRatioByPercentage getratiobypercentage, String str) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getratiobypercentage;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
            }
        }

        public TuitionPaymentFragmentbindingInflater1(boolean z, Triple<Boolean, Boolean, Boolean> triple, getRatioByPercentage getratiobypercentage, String str) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = triple;
            this.b = getratiobypercentage;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        }
    }

    public static final void TuitionPaymentFragmentbindingInflater1(final int i, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-110000524);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-110000524, i3, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.IllustrationSection (ScholarshipGranteeScreen.kt:462)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(i, composerStartRestartGroup, i3 & 14), (String) null, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: isActionViewExpanded
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    getIconTintMode.TuitionPaymentFragmentbindingInflater1(i, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final String str, final String str2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-780247227);
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
                ComposerKt.traceEventStart(-780247227, i3, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.TitleSection (ScholarshipGranteeScreen.kt:472)");
            }
            Modifier modifierM1004paddingVpY3zN4$default = PaddingKt.m1004paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6935constructorimpl(18.0f), 0.0f, 2, null);
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
            composer2 = composerStartRestartGroup;
            TextKt.m2654Text4IGK_g(str, (Modifier) null, 0L, TextUnitKt.getSp(18), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.poppins_semibold, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i3 & 14) | 1575936, 0, 130998);
            TextKt.m2654Text4IGK_g(str2, (Modifier) null, androidx.compose.ui.graphics.Color.INSTANCE.m4248getGray0d7_KjU(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ((i3 >> 3) & 14) | 1576320, 0, 130994);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: getNumericModifiers
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    getIconTintMode.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str, str2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Function0<Unit> {
        private /* synthetic */ String TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ Triple<Boolean, Boolean, Boolean> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ Function1<ScholarshipDataEligible, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ ScholarshipDataEligible TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        private /* synthetic */ getRatioByPercentage asInterface;
        private /* synthetic */ boolean b;

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getFirst().booleanValue() && this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getSecond().booleanValue()) {
                this.asInterface.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, !this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getThird().booleanValue());
            }
            if (this.b) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.invoke(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(Triple<Boolean, Boolean, Boolean> triple, getRatioByPercentage getratiobypercentage, String str, boolean z, Function1<? super ScholarshipDataEligible, Unit> function1, ScholarshipDataEligible scholarshipDataEligible) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = triple;
            this.asInterface = getratiobypercentage;
            this.TuitionPaymentFragmentbindingInflater1 = str;
            this.b = z;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = scholarshipDataEligible;
        }
    }
}
