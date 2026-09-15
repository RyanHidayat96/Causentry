package defpackage;

import android.content.Context;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.CheckboxDefaults;
import androidx.compose.material3.CheckboxKt;
import androidx.compose.material3.DividerKt;
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
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ColorResources_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.p002lifecycle.Lifecycle;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.p003compose.FlowExtKt;
import androidx.view.compose.BackHandlerKt;
import com.bpjstku.R;
import com.bpjstku.data.scholarship.model.request.Penerima;
import com.bpjstku.data.scholarship.model.request.UpdateConfirmationRequest;
import com.bpjstku.data.scholarship.model.response.ConfirmResponse;
import com.bpjstku.domain.scholarship.model.ScholarPersonDetail;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.compose.feature.scholarship.screen.SubmissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1;
import id.vida.liveness.dto.VidaLivenessResponse;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class setCheckable {
    /* JADX WARN: Code duplicated, block: B:102:0x024b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0295  */
    /* JADX WARN: Code duplicated, block: B:106:0x0297  */
    /* JADX WARN: Code duplicated, block: B:109:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:113:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:116:0x0323  */
    /* JADX WARN: Code duplicated, block: B:117:0x0325  */
    /* JADX WARN: Code duplicated, block: B:120:0x032c  */
    /* JADX WARN: Code duplicated, block: B:124:0x0338  */
    /* JADX WARN: Code duplicated, block: B:127:0x0350  */
    /* JADX WARN: Code duplicated, block: B:131:0x035c  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:77:0x0122  */
    /* JADX WARN: Code duplicated, block: B:80:0x0152  */
    /* JADX WARN: Code duplicated, block: B:83:0x0178  */
    /* JADX WARN: Code duplicated, block: B:86:0x019e  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:92:0x0201  */
    /* JADX WARN: Code duplicated, block: B:95:0x0218  */
    /* JADX WARN: Code duplicated, block: B:96:0x021b  */
    /* JADX WARN: Code duplicated, block: B:99:0x021f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities, getRatioByPercentage getratiobypercentage, Function0<Unit> function0, Function0<Unit> function1, Composer composer, int i, int i2) {
        int i3;
        Function0<Unit> function2;
        int i4;
        Function0<Unit> function3;
        int i5;
        int i6;
        Function0<Unit> function4;
        Function0<Unit> function5;
        Context context;
        Object objRememberedValue;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Object objRememberedValue4;
        Object objRememberedValue5;
        Function0<Unit> function6;
        State stateCollectAsStateWithLifecycle;
        StateListDrawableCompat stateListDrawableCompatTuitionPaymentFragmentbindingInflater1;
        Object objRememberedValue6;
        final MutableState mutableState;
        User userAsBinder;
        String str;
        String string;
        Object objRememberedValue7;
        boolean zChanged;
        boolean zChanged2;
        boolean zChangedInstance;
        boolean zChangedInstance2;
        boolean zChangedInstance3;
        boolean zChanged3;
        boolean zChangedInstance4;
        boolean z;
        SubmissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1 submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue;
        ?? r11;
        ?? r0;
        Object objRememberedValue8;
        final Function0<Unit> function7;
        Function0<Unit> function8;
        Object objRememberedValue9;
        Object objRememberedValue10;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(lambdaenabletorch1androidxcameracamera2internaltorchcontrol, "");
        Intrinsics.checkNotNullParameter(activityResultContractsPickVisualMediaMediaCapabilities, "");
        Intrinsics.checkNotNullParameter(getratiobypercentage, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-548965915);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(lambdaenabletorch1androidxcameracamera2internaltorchcontrol) ? 4 : 2) | i;
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
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                function2 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    function3 = function1;
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i3;
                if ((i6 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                    if (i7 != 0) {
                        composerStartRestartGroup.startReplaceGroup(1190163119);
                        objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue10 = new Function0() { // from class: setNumericShortcut
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function4 = (Function0) objRememberedValue10;
                    } else {
                        function4 = function2;
                    }
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceGroup(1190164111);
                        objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue9 = new Function0() { // from class: setIntent
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function5 = (Function0) objRememberedValue9;
                    } else {
                        function5 = function3;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-548965915, i6, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipSubmissionConfirmationScreen (SubmissionConfirmationScreen.kt:61)");
                    }
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    composerStartRestartGroup.startReplaceGroup(1190167279);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    MutableState mutableState2 = (MutableState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    State stateObserveAsState = LiveDataAdapterKt.observeAsState(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.d, CollectionsKt.emptyList(), composerStartRestartGroup, 48);
                    composerStartRestartGroup.startReplaceGroup(1190174940);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.asBinder.getValue(), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    MutableState mutableState3 = (MutableState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1190178519);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(getratiobypercentage.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    MutableState mutableState4 = (MutableState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1190181726);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    MutableState mutableState5 = (MutableState) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1190184788);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function6 = function4;
                    stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.sendCustomAction, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    stateListDrawableCompatTuitionPaymentFragmentbindingInflater1 = getStateDrawable.TuitionPaymentFragmentbindingInflater1(composerStartRestartGroup);
                    composerStartRestartGroup.startReplaceGroup(1190191879);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    mutableState = (MutableState) objRememberedValue6;
                    composerStartRestartGroup.endReplaceGroup();
                    userAsBinder = activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    if (userAsBinder != null) {
                        str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    } else {
                        str = null;
                    }
                    String str2 = str != null ? str : "";
                    StringBuilder sb = new StringBuilder("Bapak/Ibu <b>");
                    sb.append(str2);
                    sb.append("</b>, Konfirmasi manfaat beasiswa berhasil!. Data beasiswa Anda sedang diproses. Silakan cek status persetujuan dan pembayaran secara berkala.");
                    string = sb.toString();
                    setArrowHeadLength setarrowheadlength = (setArrowHeadLength) mutableState.getValue();
                    composerStartRestartGroup.startReplaceGroup(1190203381);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new Function0() { // from class: setOnMenuItemClickListener
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                mutableState.setValue(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    getArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setarrowheadlength, (Function0) objRememberedValue7, composerStartRestartGroup, 48);
                    VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle.getValue();
                    composerStartRestartGroup.startReplaceGroup(1190207495);
                    zChanged = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle);
                    zChanged2 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                    zChangedInstance = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(getratiobypercentage);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(context);
                    zChanged3 = composerStartRestartGroup.changed(string);
                    zChangedInstance4 = composerStartRestartGroup.changedInstance(lambdaenabletorch1androidxcameracamera2internaltorchcontrol);
                    if ((i6 & 57344) == 16384) {
                        z = true;
                    } else {
                        z = false;
                    }
                    submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if ((!(zChanged | zChanged2 | zChangedInstance | zChangedInstance2 | zChangedInstance3 | zChanged3 | zChangedInstance4) && !z) || submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                        r11 = 0;
                        submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue = new SubmissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, mutableState, context, string, lambdaenabletorch1androidxcameracamera2internaltorchcontrol, stateCollectAsStateWithLifecycle, function5, null);
                        composerStartRestartGroup.updateRememberedValue(submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue);
                    } else {
                        r11 = 0;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(virtualCameraAdapter1, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue, composerStartRestartGroup, (int) r11);
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1986729185, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(activityResultContractsPickVisualMediaMediaCapabilities, lambdaenabletorch1androidxcameracamera2internaltorchcontrol, function6, stateObserveAsState, mutableState2, mutableState5, mutableState4, mutableState3), composerStartRestartGroup, 54);
                    findRealOwner findrealowner = findRealOwner.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Penerima Manfaat Beasiswa", composableLambdaRememberComposableLambda, function6, findRealOwner.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), composerStartRestartGroup, ((i6 >> 3) & 896) | 3126, 0);
                    composerStartRestartGroup.startReplaceGroup(1190502282);
                    if ((i6 & 7168) == 2048) {
                        r0 = 1;
                    } else {
                        r0 = r11;
                    }
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (r0 == 0 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        function7 = function6;
                        objRememberedValue8 = new Function0() { // from class: setOnActionExpandListener
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function7.invoke();
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    } else {
                        function7 = function6;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BackHandlerKt.BackHandler(r11, (Function0) objRememberedValue8, composerStartRestartGroup, r11, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function2 = function7;
                    function8 = function5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    function8 = function3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new setTooltipText(lambdaenabletorch1androidxcameracamera2internaltorchcontrol, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, function2, function8, i, i2));
                }
            }
            i3 |= 24576;
            function3 = function1;
            i6 = i3;
            if ((i6 & 9363) == 9362) {
                if (i7 != 0) {
                    composerStartRestartGroup.startReplaceGroup(1190163119);
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue10 = new Function0() { // from class: setNumericShortcut
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function4 = (Function0) objRememberedValue10;
                } else {
                    function4 = function2;
                }
                if (i4 != 0) {
                    composerStartRestartGroup.startReplaceGroup(1190164111);
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new Function0() { // from class: setIntent
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function5 = (Function0) objRememberedValue9;
                } else {
                    function5 = function3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-548965915, i6, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipSubmissionConfirmationScreen (SubmissionConfirmationScreen.kt:61)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceGroup(1190167279);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                MutableState mutableState6 = (MutableState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                State stateObserveAsState2 = LiveDataAdapterKt.observeAsState(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.d, CollectionsKt.emptyList(), composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceGroup(1190174940);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.asBinder.getValue(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                MutableState mutableState7 = (MutableState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1190178519);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(getratiobypercentage.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                MutableState mutableState8 = (MutableState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1190181726);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                MutableState mutableState9 = (MutableState) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1190184788);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                function6 = function4;
                stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.sendCustomAction, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                stateListDrawableCompatTuitionPaymentFragmentbindingInflater1 = getStateDrawable.TuitionPaymentFragmentbindingInflater1(composerStartRestartGroup);
                composerStartRestartGroup.startReplaceGroup(1190191879);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                mutableState = (MutableState) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                userAsBinder = activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                if (userAsBinder != null) {
                    str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                } else {
                    str = null;
                }
                if (str != null) {
                }
                StringBuilder sb2 = new StringBuilder("Bapak/Ibu <b>");
                sb2.append(str2);
                sb2.append("</b>, Konfirmasi manfaat beasiswa berhasil!. Data beasiswa Anda sedang diproses. Silakan cek status persetujuan dan pembayaran secara berkala.");
                string = sb2.toString();
                setArrowHeadLength setarrowheadlength2 = (setArrowHeadLength) mutableState.getValue();
                composerStartRestartGroup.startReplaceGroup(1190203381);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new Function0() { // from class: setOnMenuItemClickListener
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            mutableState.setValue(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                getArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setarrowheadlength2, (Function0) objRememberedValue7, composerStartRestartGroup, 48);
                VirtualCameraAdapter1 virtualCameraAdapter2 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle.getValue();
                composerStartRestartGroup.startReplaceGroup(1190207495);
                zChanged = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle);
                zChanged2 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                zChangedInstance = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(getratiobypercentage);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(context);
                zChanged3 = composerStartRestartGroup.changed(string);
                zChangedInstance4 = composerStartRestartGroup.changedInstance(lambdaenabletorch1androidxcameracamera2internaltorchcontrol);
                if ((i6 & 57344) == 16384) {
                    z = true;
                } else {
                    z = false;
                }
                submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(zChanged | zChanged2 | zChangedInstance | zChangedInstance2 | zChangedInstance3 | zChanged3 | zChangedInstance4 | z)) {
                    r11 = 0;
                    submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue = new SubmissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, mutableState, context, string, lambdaenabletorch1androidxcameracamera2internaltorchcontrol, stateCollectAsStateWithLifecycle, function5, null);
                    composerStartRestartGroup.updateRememberedValue(submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue);
                } else {
                    r11 = 0;
                    submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue = new SubmissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, mutableState, context, string, lambdaenabletorch1androidxcameracamera2internaltorchcontrol, stateCollectAsStateWithLifecycle, function5, null);
                    composerStartRestartGroup.updateRememberedValue(submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(virtualCameraAdapter2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue, composerStartRestartGroup, (int) r11);
                ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(1986729185, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(activityResultContractsPickVisualMediaMediaCapabilities, lambdaenabletorch1androidxcameracamera2internaltorchcontrol, function6, stateObserveAsState2, mutableState6, mutableState9, mutableState8, mutableState7), composerStartRestartGroup, 54);
                findRealOwner findrealowner2 = findRealOwner.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Penerima Manfaat Beasiswa", composableLambdaRememberComposableLambda2, function6, findRealOwner.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), composerStartRestartGroup, ((i6 >> 3) & 896) | 3126, 0);
                composerStartRestartGroup.startReplaceGroup(1190502282);
                if ((i6 & 7168) == 2048) {
                    r0 = 1;
                } else {
                    r0 = r11;
                }
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (r0 == 0) {
                    function7 = function6;
                    objRememberedValue8 = new Function0() { // from class: setOnActionExpandListener
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function7.invoke();
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                } else {
                    function7 = function6;
                    objRememberedValue8 = new Function0() { // from class: setOnActionExpandListener
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function7.invoke();
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                BackHandlerKt.BackHandler(r11, (Function0) objRememberedValue8, composerStartRestartGroup, r11, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2 = function7;
                function8 = function5;
            } else {
                if (i7 != 0) {
                    composerStartRestartGroup.startReplaceGroup(1190163119);
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue10 = new Function0() { // from class: setNumericShortcut
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function4 = (Function0) objRememberedValue10;
                } else {
                    function4 = function2;
                }
                if (i4 != 0) {
                    composerStartRestartGroup.startReplaceGroup(1190164111);
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new Function0() { // from class: setIntent
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function5 = (Function0) objRememberedValue9;
                } else {
                    function5 = function3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-548965915, i6, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipSubmissionConfirmationScreen (SubmissionConfirmationScreen.kt:61)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceGroup(1190167279);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                MutableState mutableState10 = (MutableState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                State stateObserveAsState3 = LiveDataAdapterKt.observeAsState(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.d, CollectionsKt.emptyList(), composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceGroup(1190174940);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.asBinder.getValue(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                MutableState mutableState11 = (MutableState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1190178519);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(getratiobypercentage.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                MutableState mutableState12 = (MutableState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1190181726);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                MutableState mutableState13 = (MutableState) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1190184788);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                function6 = function4;
                stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.sendCustomAction, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                stateListDrawableCompatTuitionPaymentFragmentbindingInflater1 = getStateDrawable.TuitionPaymentFragmentbindingInflater1(composerStartRestartGroup);
                composerStartRestartGroup.startReplaceGroup(1190191879);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                mutableState = (MutableState) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                userAsBinder = activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                if (userAsBinder != null) {
                    str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                } else {
                    str = null;
                }
                if (str != null) {
                }
                StringBuilder sb3 = new StringBuilder("Bapak/Ibu <b>");
                sb3.append(str2);
                sb3.append("</b>, Konfirmasi manfaat beasiswa berhasil!. Data beasiswa Anda sedang diproses. Silakan cek status persetujuan dan pembayaran secara berkala.");
                string = sb3.toString();
                setArrowHeadLength setarrowheadlength3 = (setArrowHeadLength) mutableState.getValue();
                composerStartRestartGroup.startReplaceGroup(1190203381);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new Function0() { // from class: setOnMenuItemClickListener
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            mutableState.setValue(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                getArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setarrowheadlength3, (Function0) objRememberedValue7, composerStartRestartGroup, 48);
                VirtualCameraAdapter1 virtualCameraAdapter3 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle.getValue();
                composerStartRestartGroup.startReplaceGroup(1190207495);
                zChanged = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle);
                zChanged2 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                zChangedInstance = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(getratiobypercentage);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(context);
                zChanged3 = composerStartRestartGroup.changed(string);
                zChangedInstance4 = composerStartRestartGroup.changedInstance(lambdaenabletorch1androidxcameracamera2internaltorchcontrol);
                if ((i6 & 57344) == 16384) {
                    z = true;
                } else {
                    z = false;
                }
                submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(zChanged | zChanged2 | zChangedInstance | zChangedInstance2 | zChangedInstance3 | zChanged3 | zChangedInstance4 | z)) {
                    r11 = 0;
                    submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue = new SubmissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, mutableState, context, string, lambdaenabletorch1androidxcameracamera2internaltorchcontrol, stateCollectAsStateWithLifecycle, function5, null);
                    composerStartRestartGroup.updateRememberedValue(submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue);
                } else {
                    r11 = 0;
                    submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue = new SubmissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, mutableState, context, string, lambdaenabletorch1androidxcameracamera2internaltorchcontrol, stateCollectAsStateWithLifecycle, function5, null);
                    composerStartRestartGroup.updateRememberedValue(submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(virtualCameraAdapter3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue, composerStartRestartGroup, (int) r11);
                ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(1986729185, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(activityResultContractsPickVisualMediaMediaCapabilities, lambdaenabletorch1androidxcameracamera2internaltorchcontrol, function6, stateObserveAsState3, mutableState10, mutableState13, mutableState12, mutableState11), composerStartRestartGroup, 54);
                findRealOwner findrealowner3 = findRealOwner.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Penerima Manfaat Beasiswa", composableLambdaRememberComposableLambda3, function6, findRealOwner.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), composerStartRestartGroup, ((i6 >> 3) & 896) | 3126, 0);
                composerStartRestartGroup.startReplaceGroup(1190502282);
                if ((i6 & 7168) == 2048) {
                    r0 = 1;
                } else {
                    r0 = r11;
                }
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (r0 == 0) {
                    function7 = function6;
                    objRememberedValue8 = new Function0() { // from class: setOnActionExpandListener
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function7.invoke();
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                } else {
                    function7 = function6;
                    objRememberedValue8 = new Function0() { // from class: setOnActionExpandListener
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function7.invoke();
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                BackHandlerKt.BackHandler(r11, (Function0) objRememberedValue8, composerStartRestartGroup, r11, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2 = function7;
                function8 = function5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new setTooltipText(lambdaenabletorch1androidxcameracamera2internaltorchcontrol, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, function2, function8, i, i2));
            }
        }
        i3 |= 3072;
        function2 = function0;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                function3 = function1;
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i3;
            if ((i6 & 9363) == 9362) {
                if (i7 != 0) {
                    composerStartRestartGroup.startReplaceGroup(1190163119);
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue10 = new Function0() { // from class: setNumericShortcut
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function4 = (Function0) objRememberedValue10;
                } else {
                    function4 = function2;
                }
                if (i4 != 0) {
                    composerStartRestartGroup.startReplaceGroup(1190164111);
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new Function0() { // from class: setIntent
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function5 = (Function0) objRememberedValue9;
                } else {
                    function5 = function3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-548965915, i6, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipSubmissionConfirmationScreen (SubmissionConfirmationScreen.kt:61)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceGroup(1190167279);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                MutableState mutableState14 = (MutableState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                State stateObserveAsState4 = LiveDataAdapterKt.observeAsState(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.d, CollectionsKt.emptyList(), composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceGroup(1190174940);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.asBinder.getValue(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                MutableState mutableState15 = (MutableState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1190178519);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(getratiobypercentage.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                MutableState mutableState16 = (MutableState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1190181726);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                MutableState mutableState17 = (MutableState) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1190184788);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                function6 = function4;
                stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.sendCustomAction, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                stateListDrawableCompatTuitionPaymentFragmentbindingInflater1 = getStateDrawable.TuitionPaymentFragmentbindingInflater1(composerStartRestartGroup);
                composerStartRestartGroup.startReplaceGroup(1190191879);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                mutableState = (MutableState) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                userAsBinder = activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                if (userAsBinder != null) {
                    str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                } else {
                    str = null;
                }
                if (str != null) {
                }
                StringBuilder sb4 = new StringBuilder("Bapak/Ibu <b>");
                sb4.append(str2);
                sb4.append("</b>, Konfirmasi manfaat beasiswa berhasil!. Data beasiswa Anda sedang diproses. Silakan cek status persetujuan dan pembayaran secara berkala.");
                string = sb4.toString();
                setArrowHeadLength setarrowheadlength4 = (setArrowHeadLength) mutableState.getValue();
                composerStartRestartGroup.startReplaceGroup(1190203381);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new Function0() { // from class: setOnMenuItemClickListener
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            mutableState.setValue(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                getArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setarrowheadlength4, (Function0) objRememberedValue7, composerStartRestartGroup, 48);
                VirtualCameraAdapter1 virtualCameraAdapter4 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle.getValue();
                composerStartRestartGroup.startReplaceGroup(1190207495);
                zChanged = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle);
                zChanged2 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                zChangedInstance = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(getratiobypercentage);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(context);
                zChanged3 = composerStartRestartGroup.changed(string);
                zChangedInstance4 = composerStartRestartGroup.changedInstance(lambdaenabletorch1androidxcameracamera2internaltorchcontrol);
                if ((i6 & 57344) == 16384) {
                    z = true;
                } else {
                    z = false;
                }
                submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(zChanged | zChanged2 | zChangedInstance | zChangedInstance2 | zChangedInstance3 | zChanged3 | zChangedInstance4 | z)) {
                    r11 = 0;
                    submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue = new SubmissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, mutableState, context, string, lambdaenabletorch1androidxcameracamera2internaltorchcontrol, stateCollectAsStateWithLifecycle, function5, null);
                    composerStartRestartGroup.updateRememberedValue(submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue);
                } else {
                    r11 = 0;
                    submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue = new SubmissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, mutableState, context, string, lambdaenabletorch1androidxcameracamera2internaltorchcontrol, stateCollectAsStateWithLifecycle, function5, null);
                    composerStartRestartGroup.updateRememberedValue(submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(virtualCameraAdapter4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue, composerStartRestartGroup, (int) r11);
                ComposableLambda composableLambdaRememberComposableLambda4 = ComposableLambdaKt.rememberComposableLambda(1986729185, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(activityResultContractsPickVisualMediaMediaCapabilities, lambdaenabletorch1androidxcameracamera2internaltorchcontrol, function6, stateObserveAsState4, mutableState14, mutableState17, mutableState16, mutableState15), composerStartRestartGroup, 54);
                findRealOwner findrealowner4 = findRealOwner.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Penerima Manfaat Beasiswa", composableLambdaRememberComposableLambda4, function6, findRealOwner.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), composerStartRestartGroup, ((i6 >> 3) & 896) | 3126, 0);
                composerStartRestartGroup.startReplaceGroup(1190502282);
                if ((i6 & 7168) == 2048) {
                    r0 = 1;
                } else {
                    r0 = r11;
                }
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (r0 == 0) {
                    function7 = function6;
                    objRememberedValue8 = new Function0() { // from class: setOnActionExpandListener
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function7.invoke();
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                } else {
                    function7 = function6;
                    objRememberedValue8 = new Function0() { // from class: setOnActionExpandListener
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function7.invoke();
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                BackHandlerKt.BackHandler(r11, (Function0) objRememberedValue8, composerStartRestartGroup, r11, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2 = function7;
                function8 = function5;
            } else {
                if (i7 != 0) {
                    composerStartRestartGroup.startReplaceGroup(1190163119);
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue10 = new Function0() { // from class: setNumericShortcut
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function4 = (Function0) objRememberedValue10;
                } else {
                    function4 = function2;
                }
                if (i4 != 0) {
                    composerStartRestartGroup.startReplaceGroup(1190164111);
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new Function0() { // from class: setIntent
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function5 = (Function0) objRememberedValue9;
                } else {
                    function5 = function3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-548965915, i6, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipSubmissionConfirmationScreen (SubmissionConfirmationScreen.kt:61)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceGroup(1190167279);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                MutableState mutableState18 = (MutableState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                State stateObserveAsState5 = LiveDataAdapterKt.observeAsState(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.d, CollectionsKt.emptyList(), composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceGroup(1190174940);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.asBinder.getValue(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                MutableState mutableState19 = (MutableState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1190178519);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(getratiobypercentage.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                MutableState mutableState110 = (MutableState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1190181726);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                MutableState mutableState111 = (MutableState) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1190184788);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                function6 = function4;
                stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.sendCustomAction, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                stateListDrawableCompatTuitionPaymentFragmentbindingInflater1 = getStateDrawable.TuitionPaymentFragmentbindingInflater1(composerStartRestartGroup);
                composerStartRestartGroup.startReplaceGroup(1190191879);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                mutableState = (MutableState) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                userAsBinder = activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                if (userAsBinder != null) {
                    str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                } else {
                    str = null;
                }
                if (str != null) {
                }
                StringBuilder sb5 = new StringBuilder("Bapak/Ibu <b>");
                sb5.append(str2);
                sb5.append("</b>, Konfirmasi manfaat beasiswa berhasil!. Data beasiswa Anda sedang diproses. Silakan cek status persetujuan dan pembayaran secara berkala.");
                string = sb5.toString();
                setArrowHeadLength setarrowheadlength5 = (setArrowHeadLength) mutableState.getValue();
                composerStartRestartGroup.startReplaceGroup(1190203381);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new Function0() { // from class: setOnMenuItemClickListener
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            mutableState.setValue(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                getArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setarrowheadlength5, (Function0) objRememberedValue7, composerStartRestartGroup, 48);
                VirtualCameraAdapter1 virtualCameraAdapter5 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle.getValue();
                composerStartRestartGroup.startReplaceGroup(1190207495);
                zChanged = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle);
                zChanged2 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                zChangedInstance = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(getratiobypercentage);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(context);
                zChanged3 = composerStartRestartGroup.changed(string);
                zChangedInstance4 = composerStartRestartGroup.changedInstance(lambdaenabletorch1androidxcameracamera2internaltorchcontrol);
                if ((i6 & 57344) == 16384) {
                    z = true;
                } else {
                    z = false;
                }
                submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(zChanged | zChanged2 | zChangedInstance | zChangedInstance2 | zChangedInstance3 | zChanged3 | zChangedInstance4 | z)) {
                    r11 = 0;
                    submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue = new SubmissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, mutableState, context, string, lambdaenabletorch1androidxcameracamera2internaltorchcontrol, stateCollectAsStateWithLifecycle, function5, null);
                    composerStartRestartGroup.updateRememberedValue(submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue);
                } else {
                    r11 = 0;
                    submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue = new SubmissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, mutableState, context, string, lambdaenabletorch1androidxcameracamera2internaltorchcontrol, stateCollectAsStateWithLifecycle, function5, null);
                    composerStartRestartGroup.updateRememberedValue(submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(virtualCameraAdapter5, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue, composerStartRestartGroup, (int) r11);
                ComposableLambda composableLambdaRememberComposableLambda5 = ComposableLambdaKt.rememberComposableLambda(1986729185, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(activityResultContractsPickVisualMediaMediaCapabilities, lambdaenabletorch1androidxcameracamera2internaltorchcontrol, function6, stateObserveAsState5, mutableState18, mutableState111, mutableState110, mutableState19), composerStartRestartGroup, 54);
                findRealOwner findrealowner5 = findRealOwner.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Penerima Manfaat Beasiswa", composableLambdaRememberComposableLambda5, function6, findRealOwner.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), composerStartRestartGroup, ((i6 >> 3) & 896) | 3126, 0);
                composerStartRestartGroup.startReplaceGroup(1190502282);
                if ((i6 & 7168) == 2048) {
                    r0 = 1;
                } else {
                    r0 = r11;
                }
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (r0 == 0) {
                    function7 = function6;
                    objRememberedValue8 = new Function0() { // from class: setOnActionExpandListener
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function7.invoke();
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                } else {
                    function7 = function6;
                    objRememberedValue8 = new Function0() { // from class: setOnActionExpandListener
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function7.invoke();
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                BackHandlerKt.BackHandler(r11, (Function0) objRememberedValue8, composerStartRestartGroup, r11, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function2 = function7;
                function8 = function5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new setTooltipText(lambdaenabletorch1androidxcameracamera2internaltorchcontrol, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, function2, function8, i, i2));
            }
        }
        i3 |= 24576;
        function3 = function1;
        i6 = i3;
        if ((i6 & 9363) == 9362) {
            if (i7 != 0) {
                composerStartRestartGroup.startReplaceGroup(1190163119);
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue10 = new Function0() { // from class: setNumericShortcut
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                composerStartRestartGroup.endReplaceGroup();
                function4 = (Function0) objRememberedValue10;
            } else {
                function4 = function2;
            }
            if (i4 != 0) {
                composerStartRestartGroup.startReplaceGroup(1190164111);
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue9 = new Function0() { // from class: setIntent
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                composerStartRestartGroup.endReplaceGroup();
                function5 = (Function0) objRememberedValue9;
            } else {
                function5 = function3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-548965915, i6, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipSubmissionConfirmationScreen (SubmissionConfirmationScreen.kt:61)");
            }
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(1190167279);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState112 = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            State stateObserveAsState6 = LiveDataAdapterKt.observeAsState(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.d, CollectionsKt.emptyList(), composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceGroup(1190174940);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.asBinder.getValue(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState113 = (MutableState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1190178519);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(getratiobypercentage.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState114 = (MutableState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1190181726);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState115 = (MutableState) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1190184788);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            function6 = function4;
            stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.sendCustomAction, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            stateListDrawableCompatTuitionPaymentFragmentbindingInflater1 = getStateDrawable.TuitionPaymentFragmentbindingInflater1(composerStartRestartGroup);
            composerStartRestartGroup.startReplaceGroup(1190191879);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            mutableState = (MutableState) objRememberedValue6;
            composerStartRestartGroup.endReplaceGroup();
            userAsBinder = activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            if (userAsBinder != null) {
                str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            } else {
                str = null;
            }
            if (str != null) {
            }
            StringBuilder sb6 = new StringBuilder("Bapak/Ibu <b>");
            sb6.append(str2);
            sb6.append("</b>, Konfirmasi manfaat beasiswa berhasil!. Data beasiswa Anda sedang diproses. Silakan cek status persetujuan dan pembayaran secara berkala.");
            string = sb6.toString();
            setArrowHeadLength setarrowheadlength6 = (setArrowHeadLength) mutableState.getValue();
            composerStartRestartGroup.startReplaceGroup(1190203381);
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new Function0() { // from class: setOnMenuItemClickListener
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        mutableState.setValue(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            composerStartRestartGroup.endReplaceGroup();
            getArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setarrowheadlength6, (Function0) objRememberedValue7, composerStartRestartGroup, 48);
            VirtualCameraAdapter1 virtualCameraAdapter6 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle.getValue();
            composerStartRestartGroup.startReplaceGroup(1190207495);
            zChanged = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle);
            zChanged2 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
            zChangedInstance = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
            zChangedInstance2 = composerStartRestartGroup.changedInstance(getratiobypercentage);
            zChangedInstance3 = composerStartRestartGroup.changedInstance(context);
            zChanged3 = composerStartRestartGroup.changed(string);
            zChangedInstance4 = composerStartRestartGroup.changedInstance(lambdaenabletorch1androidxcameracamera2internaltorchcontrol);
            if ((i6 & 57344) == 16384) {
                z = true;
            } else {
                z = false;
            }
            submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (!(zChanged | zChanged2 | zChangedInstance | zChangedInstance2 | zChangedInstance3 | zChanged3 | zChangedInstance4 | z)) {
                r11 = 0;
                submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue = new SubmissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, mutableState, context, string, lambdaenabletorch1androidxcameracamera2internaltorchcontrol, stateCollectAsStateWithLifecycle, function5, null);
                composerStartRestartGroup.updateRememberedValue(submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue);
            } else {
                r11 = 0;
                submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue = new SubmissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, mutableState, context, string, lambdaenabletorch1androidxcameracamera2internaltorchcontrol, stateCollectAsStateWithLifecycle, function5, null);
                composerStartRestartGroup.updateRememberedValue(submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(virtualCameraAdapter6, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue, composerStartRestartGroup, (int) r11);
            ComposableLambda composableLambdaRememberComposableLambda6 = ComposableLambdaKt.rememberComposableLambda(1986729185, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(activityResultContractsPickVisualMediaMediaCapabilities, lambdaenabletorch1androidxcameracamera2internaltorchcontrol, function6, stateObserveAsState6, mutableState112, mutableState115, mutableState114, mutableState113), composerStartRestartGroup, 54);
            findRealOwner findrealowner6 = findRealOwner.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Penerima Manfaat Beasiswa", composableLambdaRememberComposableLambda6, function6, findRealOwner.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), composerStartRestartGroup, ((i6 >> 3) & 896) | 3126, 0);
            composerStartRestartGroup.startReplaceGroup(1190502282);
            if ((i6 & 7168) == 2048) {
                r0 = 1;
            } else {
                r0 = r11;
            }
            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (r0 == 0) {
                function7 = function6;
                objRememberedValue8 = new Function0() { // from class: setOnActionExpandListener
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function7.invoke();
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            } else {
                function7 = function6;
                objRememberedValue8 = new Function0() { // from class: setOnActionExpandListener
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function7.invoke();
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            composerStartRestartGroup.endReplaceGroup();
            BackHandlerKt.BackHandler(r11, (Function0) objRememberedValue8, composerStartRestartGroup, r11, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function2 = function7;
            function8 = function5;
        } else {
            if (i7 != 0) {
                composerStartRestartGroup.startReplaceGroup(1190163119);
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue10 = new Function0() { // from class: setNumericShortcut
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                composerStartRestartGroup.endReplaceGroup();
                function4 = (Function0) objRememberedValue10;
            } else {
                function4 = function2;
            }
            if (i4 != 0) {
                composerStartRestartGroup.startReplaceGroup(1190164111);
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue9 = new Function0() { // from class: setIntent
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                composerStartRestartGroup.endReplaceGroup();
                function5 = (Function0) objRememberedValue9;
            } else {
                function5 = function3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-548965915, i6, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipSubmissionConfirmationScreen (SubmissionConfirmationScreen.kt:61)");
            }
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(1190167279);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState116 = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            State stateObserveAsState7 = LiveDataAdapterKt.observeAsState(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.d, CollectionsKt.emptyList(), composerStartRestartGroup, 48);
            composerStartRestartGroup.startReplaceGroup(1190174940);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.asBinder.getValue(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            MutableState mutableState117 = (MutableState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1190178519);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(getratiobypercentage.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState118 = (MutableState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1190181726);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault3(context), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState119 = (MutableState) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1190184788);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            function6 = function4;
            stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.sendCustomAction, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            stateListDrawableCompatTuitionPaymentFragmentbindingInflater1 = getStateDrawable.TuitionPaymentFragmentbindingInflater1(composerStartRestartGroup);
            composerStartRestartGroup.startReplaceGroup(1190191879);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            mutableState = (MutableState) objRememberedValue6;
            composerStartRestartGroup.endReplaceGroup();
            userAsBinder = activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            if (userAsBinder != null) {
                str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            } else {
                str = null;
            }
            if (str != null) {
            }
            StringBuilder sb7 = new StringBuilder("Bapak/Ibu <b>");
            sb7.append(str2);
            sb7.append("</b>, Konfirmasi manfaat beasiswa berhasil!. Data beasiswa Anda sedang diproses. Silakan cek status persetujuan dan pembayaran secara berkala.");
            string = sb7.toString();
            setArrowHeadLength setarrowheadlength7 = (setArrowHeadLength) mutableState.getValue();
            composerStartRestartGroup.startReplaceGroup(1190203381);
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new Function0() { // from class: setOnMenuItemClickListener
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        mutableState.setValue(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            composerStartRestartGroup.endReplaceGroup();
            getArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setarrowheadlength7, (Function0) objRememberedValue7, composerStartRestartGroup, 48);
            VirtualCameraAdapter1 virtualCameraAdapter7 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle.getValue();
            composerStartRestartGroup.startReplaceGroup(1190207495);
            zChanged = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle);
            zChanged2 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
            zChangedInstance = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
            zChangedInstance2 = composerStartRestartGroup.changedInstance(getratiobypercentage);
            zChangedInstance3 = composerStartRestartGroup.changedInstance(context);
            zChanged3 = composerStartRestartGroup.changed(string);
            zChangedInstance4 = composerStartRestartGroup.changedInstance(lambdaenabletorch1androidxcameracamera2internaltorchcontrol);
            if ((i6 & 57344) == 16384) {
                z = true;
            } else {
                z = false;
            }
            submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (!(zChanged | zChanged2 | zChangedInstance | zChangedInstance2 | zChangedInstance3 | zChanged3 | zChangedInstance4 | z)) {
                r11 = 0;
                submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue = new SubmissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, mutableState, context, string, lambdaenabletorch1androidxcameracamera2internaltorchcontrol, stateCollectAsStateWithLifecycle, function5, null);
                composerStartRestartGroup.updateRememberedValue(submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue);
            } else {
                r11 = 0;
                submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue = new SubmissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, mutableState, context, string, lambdaenabletorch1androidxcameracamera2internaltorchcontrol, stateCollectAsStateWithLifecycle, function5, null);
                composerStartRestartGroup.updateRememberedValue(submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(virtualCameraAdapter7, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) submissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1RememberedValue, composerStartRestartGroup, (int) r11);
            ComposableLambda composableLambdaRememberComposableLambda7 = ComposableLambdaKt.rememberComposableLambda(1986729185, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(activityResultContractsPickVisualMediaMediaCapabilities, lambdaenabletorch1androidxcameracamera2internaltorchcontrol, function6, stateObserveAsState7, mutableState116, mutableState119, mutableState118, mutableState117), composerStartRestartGroup, 54);
            findRealOwner findrealowner7 = findRealOwner.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Penerima Manfaat Beasiswa", composableLambdaRememberComposableLambda7, function6, findRealOwner.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), composerStartRestartGroup, ((i6 >> 3) & 896) | 3126, 0);
            composerStartRestartGroup.startReplaceGroup(1190502282);
            if ((i6 & 7168) == 2048) {
                r0 = 1;
            } else {
                r0 = r11;
            }
            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (r0 == 0) {
                function7 = function6;
                objRememberedValue8 = new Function0() { // from class: setOnActionExpandListener
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function7.invoke();
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            } else {
                function7 = function6;
                objRememberedValue8 = new Function0() { // from class: setOnActionExpandListener
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function7.invoke();
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            composerStartRestartGroup.endReplaceGroup();
            BackHandlerKt.BackHandler(r11, (Function0) objRememberedValue8, composerStartRestartGroup, r11, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function2 = function7;
            function8 = function5;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new setTooltipText(lambdaenabletorch1androidxcameracamera2internaltorchcontrol, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, function2, function8, i, i2));
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Function3<PaddingValues, Composer, Integer, Unit> {
        private /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ MutableState<List<File>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ MutableState<Boolean> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ MutableState<List<ScholarPersonDetail>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ MutableState<VidaLivenessResponse> f1364a;
        private /* synthetic */ State<List<Penerima>> asBinder;
        private /* synthetic */ lambdaenableTorch1androidxcameracamera2internalTorchControl asInterface;
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
                    ComposerKt.traceEventStart(1986729185, iIntValue, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipSubmissionConfirmationScreen.<anonymous> (SubmissionConfirmationScreen.kt:127)");
                }
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m1004paddingVpY3zN4$default(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues2), Dp.m6935constructorimpl(16.0f), 0.0f, 2, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                final ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities = this.TuitionPaymentFragmentbindingInflater1;
                final lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol = this.asInterface;
                Function0<Unit> function0 = this.b;
                State<List<Penerima>> state = this.asBinder;
                MutableState<Boolean> mutableState = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                MutableState<List<File>> mutableState2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                MutableState<List<ScholarPersonDetail>> mutableState3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                final MutableState<VidaLivenessResponse> mutableState4 = this.f1364a;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierVerticalScroll$default);
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
                composer2.startReplaceGroup(-1040559413);
                List<Penerima> value = state.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                int i = 0;
                for (Object obj : value) {
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Penerima penerima = (Penerima) obj;
                    setCheckable.TuitionPaymentFragmentspecialinlinedviewModeldefault1("Data Penerima Beasiswa", composer2, 6);
                    setCheckable.TuitionPaymentFragmentbindingInflater1("Nama Penerima Beasiswa", penerima.getNamaPenerima(), composer2, 6);
                    setCheckable.TuitionPaymentFragmentbindingInflater1("Jenjang Pendidikan", penerima.getJenjangPendidikan(), composer2, 6);
                    setCheckable.TuitionPaymentFragmentbindingInflater1("Tingkat/Kelas Saat Ini", penerima.getTingkatPendidikan(), composer2, 6);
                    setCheckable.TuitionPaymentFragmentbindingInflater1("Tahun", penerima.getTahunBeasiswa(), composer2, 6);
                    SpacerKt.Spacer(PaddingKt.m1006paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6935constructorimpl(30.0f), 0.0f, 0.0f, 13, null), composer2, 6);
                    setCheckable.TuitionPaymentFragmentspecialinlinedviewModeldefault1("Dokumen Penerima Beasiswa", composer2, 6);
                    setCheckable.b("Surat Keterangan Menempuh Pendidikan", composer2, 6);
                    setCheckable.b("Raport / Transkrip Nilai", composer2, 6);
                    setCheckable.b("Dokumen Lainnya", composer2, 6);
                    SpacerKt.Spacer(PaddingKt.m1006paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6935constructorimpl(30.0f), 0.0f, 0.0f, 13, null), composer2, 6);
                    DividerKt.m2055HorizontalDivider9IZ8Weo(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6935constructorimpl(1.0f), Color.INSTANCE.m4250getLightGray0d7_KjU(), composer2, 438, 0);
                    SpacerKt.Spacer(PaddingKt.m1006paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6935constructorimpl(1.0f), 0.0f, 0.0f, 13, null), composer2, 6);
                    DividerKt.m2055HorizontalDivider9IZ8Weo(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6935constructorimpl(1.0f), Color.INSTANCE.m4250getLightGray0d7_KjU(), composer2, 438, 0);
                    SpacerKt.Spacer(PaddingKt.m1006paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6935constructorimpl(22.0f), 0.0f, 0.0f, 13, null), composer2, 6);
                    i++;
                    mutableState3 = mutableState3;
                    mutableState2 = mutableState2;
                    mutableState = mutableState;
                    function0 = function0;
                }
                final MutableState<List<ScholarPersonDetail>> mutableState5 = mutableState3;
                final MutableState<List<File>> mutableState6 = mutableState2;
                final MutableState<Boolean> mutableState7 = mutableState;
                Function0<Unit> function1 = function0;
                composer2.endReplaceGroup();
                TextKt.m2654Text4IGK_g("Menyatakan bahwa :", PaddingKt.m1006paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6935constructorimpl(8.0f), 0.0f, 0.0f, 13, null), ColorResources_androidKt.colorResource(R.color.colorCharcoalGrey, composer2, 6), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 1575990, 0, 130992);
                TextKt.m2654Text4IGK_g("Data dan informasi pribadi saya adalah benar dan lengkap sesuai persyaratan, serta bersedia mempertanggung-jawabkan kebenarannya sesuai ketentuan perundangan yang berlaku.", PaddingKt.m1006paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6935constructorimpl(8.0f), 0.0f, 0.0f, 13, null), Color.INSTANCE.m4248getGray0d7_KjU(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 1576374, 0, 130992);
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Modifier modifierM1004paddingVpY3zN4$default = PaddingKt.m1004paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6935constructorimpl(16.0f), 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM1004paddingVpY3zN4$default);
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
                MutableState<Boolean> mutableState8 = mutableState7;
                boolean zBooleanValue = mutableState8.getValue().booleanValue();
                composer2.startReplaceGroup(998527651);
                Object objRememberedValue = composer2.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: setShowAsAction
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return setCheckable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(mutableState7, ((Boolean) obj2).booleanValue());
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                CheckboxKt.Checkbox(zBooleanValue, (Function1) objRememberedValue, null, false, CheckboxDefaults.INSTANCE.m1845colors5tl4gsc(ColorResources_androidKt.colorResource(R.color.green_forest_primary, composer2, 6), 0L, Color.INSTANCE.m4255getWhite0d7_KjU(), 0L, 0L, 0L, composer2, (CheckboxDefaults.$stable << 18) | 384, 58), null, composer2, 48, 44);
                TextKt.m2654Text4IGK_g("Saya telah membaca dan menyetujui persyaratan diatas", PaddingKt.m1006paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6935constructorimpl(8.0f), 0.0f, 0.0f, 0.0f, 14, null), Color.INSTANCE.m4248getGray0d7_KjU(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 1576374, 0, 130992);
                composer2.endNode();
                boolean zBooleanValue2 = mutableState8.getValue().booleanValue();
                Modifier modifierM1004paddingVpY3zN4$default2 = PaddingKt.m1004paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6935constructorimpl(8.0f), 1, null);
                composer2.startReplaceGroup(-1040428189);
                boolean zChangedInstance = composer2.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                boolean zChangedInstance2 = composer2.changedInstance(lambdaenabletorch1androidxcameracamera2internaltorchcontrol);
                Object objRememberedValue2 = composer2.rememberedValue();
                if ((zChangedInstance | zChangedInstance2) || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Function0 function2 = new Function0() { // from class: getItemData
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return setCheckable.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(activityResultContractsPickVisualMediaMediaCapabilities, lambdaenabletorch1androidxcameracamera2internaltorchcontrol, mutableState6, mutableState5, mutableState4);
                        }
                    };
                    composer2.updateRememberedValue(function2);
                    objRememberedValue2 = function2;
                }
                composer2.endReplaceGroup();
                computeConstantSize.TuitionPaymentFragmentspecialinlinedviewModeldefault2("SIMPAN & LANJUTKAN", (Function0) objRememberedValue2, modifierM1004paddingVpY3zN4$default2, zBooleanValue2, composer2, 390, 0);
                computeConstantSize.b("KEMBALI", function1, PaddingKt.m1006paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6935constructorimpl(24.0f), 7, null), false, composer2, 390, 8);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer2.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities, final lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
            MutableState mutableState4 = mutableState;
            File file = (File) CollectionsKt.getOrNull((List) mutableState4.getValue(), 0);
            File file2 = (File) CollectionsKt.getOrNull((List) mutableState4.getValue(), 1);
            File file3 = file2 == null ? file : file2;
            File file4 = (File) CollectionsKt.getOrNull((List) mutableState4.getValue(), 2);
            File file5 = file4 == null ? file : file4;
            User userAsBinder = activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            String str = userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
            String str2 = str == null ? "" : str;
            ScholarPersonDetail scholarPersonDetail = (ScholarPersonDetail) CollectionsKt.firstOrNull((List) mutableState2.getValue());
            String str3 = scholarPersonDetail != null ? scholarPersonDetail.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null;
            String str4 = str3 == null ? "" : str3;
            User userAsBinder2 = activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            String str5 = userAsBinder2 != null ? userAsBinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null;
            String str6 = str5 == null ? "" : str5;
            User userAsBinder3 = activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            String str7 = userAsBinder3 != null ? userAsBinder3.b : null;
            String str8 = str7 == null ? "" : str7;
            User userAsBinder4 = activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            String str9 = userAsBinder4 != null ? userAsBinder4.asInterface : null;
            String str10 = str9 == null ? "" : str9;
            String value = lambdaenabletorch1androidxcameracamera2internaltorchcontrol.asInterface.getValue();
            String str11 = value == null ? "" : value;
            List<Penerima> value2 = lambdaenabletorch1androidxcameracamera2internaltorchcontrol.d.getValue();
            if (value2 == null) {
                value2 = CollectionsKt.emptyList();
            }
            List<Penerima> list = value2;
            MutableState mutableState5 = mutableState3;
            VidaLivenessResponse vidaLivenessResponse = (VidaLivenessResponse) mutableState5.getValue();
            String strValueOf = String.valueOf(vidaLivenessResponse != null ? Double.valueOf(vidaLivenessResponse.getLivenessScore()) : null);
            VidaLivenessResponse vidaLivenessResponse2 = (VidaLivenessResponse) mutableState5.getValue();
            UpdateConfirmationRequest updateConfirmationRequest = new UpdateConfirmationRequest(str2, str4, str6, str8, str10, str11, list, file, file3, file5, strValueOf, String.valueOf(vidaLivenessResponse2 != null ? Double.valueOf(vidaLivenessResponse2.getManipulationScore()) : null));
            Intrinsics.checkNotNullParameter(updateConfirmationRequest, "");
            MutableLiveData<VirtualCameraAdapter1<ConfirmResponse>> mutableLiveData = lambdaenabletorch1androidxcameracamera2internaltorchcontrol.getInterfaceDescriptor;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(lambdaenabletorch1androidxcameracamera2internaltorchcontrol.b.b(updateConfirmationRequest)));
            final Function1 function1 = new Function1() { // from class: lambdanew0androidxcameracamera2internalTorchControl
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return lambdaenableTorch1androidxcameracamera2internalTorchControl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdaenabletorch1androidxcameracamera2internaltorchcontrol, (ConfirmResponse) obj);
                }
            };
            logToString logtostring = new logToString() { // from class: VideoStabilizationUtil
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    lambdaenableTorch1androidxcameracamera2internalTorchControl.TuitionPaymentFragmentspecialinlinedviewModeldefault3(function1, obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: incrementUsagelambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return lambdaenableTorch1androidxcameracamera2internalTorchControl.TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdaenabletorch1androidxcameracamera2internaltorchcontrol, (Throwable) obj);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: resetDirectly
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    lambdaenableTorch1androidxcameracamera2internalTorchControl.g(function2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            lambdaenabletorch1androidxcameracamera2internaltorchcontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(MutableState mutableState, boolean z) {
            mutableState.setValue(Boolean.valueOf(z));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        TuitionPaymentFragmentspecialinlinedviewModeldefault3(ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities, lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, Function0<Unit> function0, State<? extends List<Penerima>> state, MutableState<Boolean> mutableState, MutableState<List<File>> mutableState2, MutableState<List<ScholarPersonDetail>> mutableState3, MutableState<VidaLivenessResponse> mutableState4) {
            this.TuitionPaymentFragmentbindingInflater1 = activityResultContractsPickVisualMediaMediaCapabilities;
            this.asInterface = lambdaenabletorch1androidxcameracamera2internaltorchcontrol;
            this.b = function0;
            this.asBinder = state;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mutableState;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mutableState2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mutableState3;
            this.f1364a = mutableState4;
        }
    }

    public static final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(str, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1672078633);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1672078633, i2, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.SectionTitle (SubmissionConfirmationScreen.kt:302)");
            }
            FontFamily FontFamily = FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null));
            composer2 = composerStartRestartGroup;
            TextKt.m2654Text4IGK_g(str, PaddingKt.m1003paddingVpY3zN4(Modifier.INSTANCE, Dp.m6935constructorimpl(4.0f), Dp.m6935constructorimpl(8.0f)), Color.INSTANCE.m4248getGray0d7_KjU(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, FontFamily, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i2 & 14) | 1576320, 0, 130992);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: setTitleCondensed
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    setCheckable.TuitionPaymentFragmentspecialinlinedviewModeldefault1(str, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final void TuitionPaymentFragmentbindingInflater1(final String str, final String str2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2126515675);
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
                ComposerKt.traceEventStart(-2126515675, i3, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.DataField (SubmissionConfirmationScreen.kt:313)");
            }
            Modifier modifierM1003paddingVpY3zN4 = PaddingKt.m1003paddingVpY3zN4(Modifier.INSTANCE, Dp.m6935constructorimpl(4.0f), Dp.m6935constructorimpl(12.0f));
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            composer2 = composerStartRestartGroup;
            TextKt.m2654Text4IGK_g(str2, PaddingKt.m1006paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6935constructorimpl(5.0f), 0.0f, 0.0f, 13, null), ColorResources_androidKt.colorResource(R.color.colorCharcoalGrey, composerStartRestartGroup, 6), TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ((i3 >> 3) & 14) | 1575984, 0, 130992);
            DividerKt.m2055HorizontalDivider9IZ8Weo(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6935constructorimpl(1.0f), Color.INSTANCE.m4250getLightGray0d7_KjU(), composer2, 438, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: setShowAsActionFlags
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    setCheckable.TuitionPaymentFragmentbindingInflater1(str, str2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final void b(final String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(str, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1218357849);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1218357849, i2, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.DocumentRow (SubmissionConfirmationScreen.kt:341)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Modifier modifierM1003paddingVpY3zN4 = PaddingKt.m1003paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6935constructorimpl(4.0f), Dp.m6935constructorimpl(8.0f));
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
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
            Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3543setimpl(composerM3536constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            TextKt.m2654Text4IGK_g(str, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), Color.INSTANCE.m4248getGray0d7_KjU(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.dmsans_reguler, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i2 & 14) | 1576320, 0, 130992);
            composer2 = composerStartRestartGroup;
            IconKt.m2127Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_checklist_new, composer2, 6), "Document verified", SizeKt.m1047size3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(14.0f)), Color.INSTANCE.m4254getUnspecified0d7_KjU(), composer2, 3504, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: setShortcut
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    setCheckable.b(str, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
