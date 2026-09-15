package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
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
import androidx.core.view.ViewCompat;
import androidx.p002lifecycle.Lifecycle;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.p003compose.FlowExtKt;
import androidx.view.compose.BackHandlerKt;
import com.bpjstku.R;
import com.bpjstku.data.scholarship.model.response.BenefitInfo;
import com.bpjstku.data.scholarship.model.response.ScholarshipDataEligible;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipConfirmationScreenKt$GranteeListingScreen$lambda$41$lambda$40$$inlined$items$default$1;
import com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1;
import com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1;
import com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1;
import defpackage.onActionViewCollapsed;
import defpackage.onWindowFocusChanged;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
public final class onWindowFocusChanged {
    /* JADX WARN: Code duplicated, block: B:100:0x0204  */
    /* JADX WARN: Code duplicated, block: B:107:0x023d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0245  */
    /* JADX WARN: Code duplicated, block: B:111:0x0253  */
    /* JADX WARN: Code duplicated, block: B:114:0x025d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0267  */
    /* JADX WARN: Code duplicated, block: B:124:0x029c  */
    /* JADX WARN: Code duplicated, block: B:125:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:128:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:131:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:134:0x0307  */
    /* JADX WARN: Code duplicated, block: B:137:0x032b  */
    /* JADX WARN: Code duplicated, block: B:139:0x0333  */
    /* JADX WARN: Code duplicated, block: B:142:0x0374  */
    /* JADX WARN: Code duplicated, block: B:146:0x0382  */
    /* JADX WARN: Code duplicated, block: B:149:0x03db  */
    /* JADX WARN: Code duplicated, block: B:153:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:156:0x041f  */
    /* JADX WARN: Code duplicated, block: B:158:0x0431  */
    /* JADX WARN: Code duplicated, block: B:162:0x0484  */
    /* JADX WARN: Code duplicated, block: B:163:0x0486  */
    /* JADX WARN: Code duplicated, block: B:166:0x048d  */
    /* JADX WARN: Code duplicated, block: B:170:0x0499  */
    /* JADX WARN: Code duplicated, block: B:173:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:177:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:179:0x0279 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0277 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:? A[LOOP:0: B:115:0x0261->B:181:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:? A[LOOP:1: B:98:0x01fe->B:184:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:76:0x010c  */
    /* JADX WARN: Code duplicated, block: B:78:0x011c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0124  */
    /* JADX WARN: Code duplicated, block: B:84:0x014d  */
    /* JADX WARN: Code duplicated, block: B:87:0x019f  */
    /* JADX WARN: Code duplicated, block: B:90:0x01da  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:97:0x01fa  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44, types: [androidx.compose.runtime.SnapshotMutationPolicy, java.lang.Object, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    public static final void b(final ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities, final getRatioByPercentage getratiobypercentage, Function0<Unit> function0, Function0<Unit> function1, Function0<Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        final Function0<Unit> function3;
        int i4;
        Function0<Unit> function4;
        int i5;
        int i6;
        Function0<Unit> function5;
        int i7;
        int i8;
        Function0<Unit> function6;
        Function0<Unit> function7;
        Function0<Unit> function8;
        Context context;
        StateListDrawableCompat stateListDrawableCompatTuitionPaymentFragmentbindingInflater1;
        Object objRememberedValue;
        MutableState mutableState;
        State stateCollectAsStateWithLifecycle;
        State stateCollectAsStateWithLifecycle2;
        State stateCollectAsStateWithLifecycle3;
        Object objRememberedValue2;
        MutableState mutableState2;
        State stateCollectAsStateWithLifecycle4;
        boolean zChanged;
        Object objRememberedValue3;
        List<ScholarshipDataEligible> list;
        Iterator it;
        boolean z;
        boolean zChanged2;
        Object objRememberedValue4;
        List<ScholarshipDataEligible> list2;
        Iterator it2;
        boolean z2;
        Object objRememberedValue5;
        ?? r2;
        final MutableState mutableState3;
        Object objRememberedValue6;
        MutableState mutableState4;
        Object objRememberedValue7;
        final MutableState mutableState5;
        Object objRememberedValue8;
        boolean zChangedInstance;
        ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1 scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue;
        boolean zChanged3;
        boolean zChanged4;
        boolean zChangedInstance2;
        boolean zChangedInstance3;
        ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1 scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue;
        boolean zChanged5;
        boolean zChanged6;
        boolean zChangedInstance4;
        boolean zChanged7;
        boolean zChangedInstance5;
        ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1 scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue;
        ?? r15;
        int i9;
        ?? r7;
        Object objRememberedValue9;
        final Function0<Unit> function9;
        final Function0<Unit> function10;
        final Function0<Unit> function11;
        Object objRememberedValue10;
        Object objRememberedValue11;
        Object objRememberedValue12;
        Object objRememberedValue13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(activityResultContractsPickVisualMediaMediaCapabilities, "");
        Intrinsics.checkNotNullParameter(getratiobypercentage, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1462147081);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(getratiobypercentage) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                function3 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    function4 = function1;
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        function5 = function2;
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i3;
                    if ((i8 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        if (i10 != 0) {
                            composerStartRestartGroup.startReplaceGroup(642647811);
                            objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue13 = new Function0() { // from class: getActionProvider
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function6 = (Function0) objRememberedValue13;
                        } else {
                            function6 = function3;
                        }
                        if (i4 != 0) {
                            composerStartRestartGroup.startReplaceGroup(642648995);
                            objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue12 = new Function0() { // from class: getActionView
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function7 = (Function0) objRememberedValue12;
                        } else {
                            function7 = function4;
                        }
                        if (i6 != 0) {
                            composerStartRestartGroup.startReplaceGroup(642650179);
                            objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue11 = new Function0() { // from class: getAlphabeticModifiers
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function8 = (Function0) objRememberedValue11;
                        } else {
                            function8 = function5;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1462147081, i8, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipConfirmationScreen (ScholarshipConfirmationScreen.kt:70)");
                        }
                        context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        stateListDrawableCompatTuitionPaymentFragmentbindingInflater1 = getStateDrawable.TuitionPaymentFragmentbindingInflater1(composerStartRestartGroup);
                        composerStartRestartGroup.startReplaceGroup(642653880);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder(), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        mutableState = (MutableState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(activityResultContractsPickVisualMediaMediaCapabilities.asBinder, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        stateCollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.getInterfaceDescriptor, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        stateCollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.INotificationSideChannelStub, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        composerStartRestartGroup.startReplaceGroup(642665579);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        mutableState2 = (MutableState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        stateCollectAsStateWithLifecycle4 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.d, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        updateTextButtonVisibility updatetextbuttonvisibility = (updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue();
                        composerStartRestartGroup.startReplaceGroup(642670282);
                        zChanged = composerStartRestartGroup.changed(updatetextbuttonvisibility);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            list = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            if (!(list instanceof Collection) && list.isEmpty()) {
                                z = true;
                                break;
                            }
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = true;
                                    break;
                                } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                    z = false;
                                    break;
                                }
                            }
                            objRememberedValue3 = Boolean.valueOf(z);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        boolean zBooleanValue = ((Boolean) objRememberedValue3).booleanValue();
                        composerStartRestartGroup.endReplaceGroup();
                        updateTextButtonVisibility updatetextbuttonvisibility2 = (updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue();
                        composerStartRestartGroup.startReplaceGroup(642673386);
                        zChanged2 = composerStartRestartGroup.changed(updatetextbuttonvisibility2);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            list2 = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                            if (!(list2 instanceof Collection) && list2.isEmpty()) {
                                z2 = false;
                                break;
                            }
                            it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z2 = false;
                                    break;
                                } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                    z2 = true;
                                    break;
                                }
                            }
                            objRememberedValue4 = Boolean.valueOf(z2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        boolean zBooleanValue2 = ((Boolean) objRememberedValue4).booleanValue();
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(642676707);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            r2 = 0;
                            objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        } else {
                            r2 = 0;
                        }
                        mutableState3 = (MutableState) objRememberedValue5;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(642678716);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r2, r2, 2, r2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        mutableState4 = (MutableState) objRememberedValue6;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(642681339);
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE, r2, 2, r2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        mutableState5 = (MutableState) objRememberedValue7;
                        composerStartRestartGroup.endReplaceGroup();
                        setArrowHeadLength setarrowheadlength = (setArrowHeadLength) mutableState5.getValue();
                        composerStartRestartGroup.startReplaceGroup(642684425);
                        objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue8 = new Function0() { // from class: getGroupId
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    mutableState5.setValue(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        getArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setarrowheadlength, (Function0) objRememberedValue8, composerStartRestartGroup, 48);
                        Unit unit = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(642686654);
                        zChangedInstance = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                            scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1(activityResultContractsPickVisualMediaMediaCapabilities, mutableState, r2);
                            composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue, composerStartRestartGroup, 6);
                        VirtualCameraAdapter1 virtualCameraAdapter1 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle2.getValue();
                        composerStartRestartGroup.startReplaceGroup(642693267);
                        zChanged3 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle2);
                        zChanged4 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(context);
                        zChangedInstance3 = composerStartRestartGroup.changedInstance(getratiobypercentage);
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!(zChanged3 | zChanged4 | zChangedInstance2 | zChangedInstance3) || scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                            scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, mutableState5, context, getratiobypercentage, stateCollectAsStateWithLifecycle2, null);
                            composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(virtualCameraAdapter1, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue, composerStartRestartGroup, 0);
                        VirtualCameraAdapter1 virtualCameraAdapter2 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle.getValue();
                        composerStartRestartGroup.startReplaceGroup(642744629);
                        zChanged5 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle);
                        zChanged6 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                        zChangedInstance4 = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                        zChanged7 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle3);
                        zChangedInstance5 = composerStartRestartGroup.changedInstance(getratiobypercentage);
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = composerStartRestartGroup.rememberedValue();
                        if ((!(zChanged5 | zChanged6 | zChangedInstance4 | zChanged7) && !zChangedInstance5) || scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                            r15 = 0;
                            scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, stateCollectAsStateWithLifecycle, mutableState2, stateCollectAsStateWithLifecycle3, null);
                            composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue);
                        } else {
                            r15 = 0;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(virtualCameraAdapter2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue, composerStartRestartGroup, (int) r15);
                        composerStartRestartGroup.startReplaceGroup(642771452);
                        if (((Boolean) mutableState3.getValue()).booleanValue()) {
                            composerStartRestartGroup.startReplaceGroup(642774748);
                            objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue10 = new Function0() { // from class: getAlphabeticShortcut
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        mutableState3.setValue(Boolean.FALSE);
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault2((Function0) objRememberedValue10, (ScholarshipDataEligible) mutableState4.getValue(), composerStartRestartGroup, 6, r15);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        i9 = i8 & 896;
                        getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Konfirmasi Beasiswa", ComposableLambdaKt.rememberComposableLambda(-36016005, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(mutableState2, mutableState, zBooleanValue2, zBooleanValue, function7, function8, stateCollectAsStateWithLifecycle4, mutableState4, mutableState3), composerStartRestartGroup, 54), function6, null, composerStartRestartGroup, i9 | 54, 8);
                        composerStartRestartGroup.startReplaceGroup(642962622);
                        if (i9 == 256) {
                            r7 = 1;
                        } else {
                            r7 = r15;
                        }
                        objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                        if (r7 == 0 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                            function9 = function6;
                            objRememberedValue9 = new Function0() { // from class: WindowCallbackWrapperApi26Impl
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function9.invoke();
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                        } else {
                            function9 = function6;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BackHandlerKt.BackHandler(r15, (Function0) objRememberedValue9, composerStartRestartGroup, r15, 1);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function3 = function9;
                        function10 = function7;
                        function11 = function8;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        function10 = function4;
                        function11 = function5;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: onSearchRequested
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities2 = activityResultContractsPickVisualMediaMediaCapabilities;
                                getRatioByPercentage getratiobypercentage2 = getratiobypercentage;
                                Function0 function12 = function3;
                                Function0 function13 = function10;
                                Function0 function14 = function11;
                                int i11 = i;
                                onWindowFocusChanged.b(activityResultContractsPickVisualMediaMediaCapabilities2, getratiobypercentage2, function12, function13, function14, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i2);
                                return Unit.INSTANCE;
                            }
                        });
                    }
                }
                i3 |= 24576;
                function5 = function2;
                i8 = i3;
                if ((i8 & 9363) == 9362) {
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceGroup(642647811);
                        objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue13 = new Function0() { // from class: getActionProvider
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function6 = (Function0) objRememberedValue13;
                    } else {
                        function6 = function3;
                    }
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceGroup(642648995);
                        objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue12 = new Function0() { // from class: getActionView
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function7 = (Function0) objRememberedValue12;
                    } else {
                        function7 = function4;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceGroup(642650179);
                        objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue11 = new Function0() { // from class: getAlphabeticModifiers
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function8 = (Function0) objRememberedValue11;
                    } else {
                        function8 = function5;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1462147081, i8, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipConfirmationScreen (ScholarshipConfirmationScreen.kt:70)");
                    }
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    stateListDrawableCompatTuitionPaymentFragmentbindingInflater1 = getStateDrawable.TuitionPaymentFragmentbindingInflater1(composerStartRestartGroup);
                    composerStartRestartGroup.startReplaceGroup(642653880);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder(), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableState = (MutableState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(activityResultContractsPickVisualMediaMediaCapabilities.asBinder, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    stateCollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.getInterfaceDescriptor, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    stateCollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.INotificationSideChannelStub, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup.startReplaceGroup(642665579);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    mutableState2 = (MutableState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    stateCollectAsStateWithLifecycle4 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.d, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    updateTextButtonVisibility updatetextbuttonvisibility3 = (updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue();
                    composerStartRestartGroup.startReplaceGroup(642670282);
                    zChanged = composerStartRestartGroup.changed(updatetextbuttonvisibility3);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        list = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (!(list instanceof Collection)) {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = true;
                                    break;
                                } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                    z = false;
                                    break;
                                }
                            }
                        } else {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = true;
                                    break;
                                } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                        objRememberedValue3 = Boolean.valueOf(z);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        list = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (!(list instanceof Collection)) {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = true;
                                    break;
                                } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                    z = false;
                                    break;
                                }
                            }
                        } else {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = true;
                                    break;
                                } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                        objRememberedValue3 = Boolean.valueOf(z);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    boolean zBooleanValue3 = ((Boolean) objRememberedValue3).booleanValue();
                    composerStartRestartGroup.endReplaceGroup();
                    updateTextButtonVisibility updatetextbuttonvisibility4 = (updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue();
                    composerStartRestartGroup.startReplaceGroup(642673386);
                    zChanged2 = composerStartRestartGroup.changed(updatetextbuttonvisibility4);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        list2 = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (!(list2 instanceof Collection)) {
                            it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z2 = false;
                                    break;
                                } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                    z2 = true;
                                    break;
                                }
                            }
                        } else {
                            it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z2 = false;
                                    break;
                                } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        objRememberedValue4 = Boolean.valueOf(z2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        list2 = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (!(list2 instanceof Collection)) {
                            it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z2 = false;
                                    break;
                                } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                    z2 = true;
                                    break;
                                }
                            }
                        } else {
                            it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z2 = false;
                                    break;
                                } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        objRememberedValue4 = Boolean.valueOf(z2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    boolean zBooleanValue4 = ((Boolean) objRememberedValue4).booleanValue();
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(642676707);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        r2 = 0;
                        objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        r2 = 0;
                    }
                    mutableState3 = (MutableState) objRememberedValue5;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(642678716);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r2, r2, 2, r2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    mutableState4 = (MutableState) objRememberedValue6;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(642681339);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE, r2, 2, r2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    mutableState5 = (MutableState) objRememberedValue7;
                    composerStartRestartGroup.endReplaceGroup();
                    setArrowHeadLength setarrowheadlength2 = (setArrowHeadLength) mutableState5.getValue();
                    composerStartRestartGroup.startReplaceGroup(642684425);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new Function0() { // from class: getGroupId
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                mutableState5.setValue(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    getArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setarrowheadlength2, (Function0) objRememberedValue8, composerStartRestartGroup, 48);
                    Unit unit2 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(642686654);
                    zChangedInstance = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1(activityResultContractsPickVisualMediaMediaCapabilities, mutableState, r2);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue);
                    } else {
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1(activityResultContractsPickVisualMediaMediaCapabilities, mutableState, r2);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue, composerStartRestartGroup, 6);
                    VirtualCameraAdapter1 virtualCameraAdapter3 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle2.getValue();
                    composerStartRestartGroup.startReplaceGroup(642693267);
                    zChanged3 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle2);
                    zChanged4 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(context);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(getratiobypercentage);
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(zChanged3 | zChanged4 | zChangedInstance2) && !zChangedInstance3) {
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, mutableState5, context, getratiobypercentage, stateCollectAsStateWithLifecycle2, null);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue);
                    } else {
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, mutableState5, context, getratiobypercentage, stateCollectAsStateWithLifecycle2, null);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(virtualCameraAdapter3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue, composerStartRestartGroup, 0);
                    VirtualCameraAdapter1 virtualCameraAdapter4 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle.getValue();
                    composerStartRestartGroup.startReplaceGroup(642744629);
                    zChanged5 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle);
                    zChanged6 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                    zChangedInstance4 = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                    zChanged7 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle3);
                    zChangedInstance5 = composerStartRestartGroup.changedInstance(getratiobypercentage);
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(zChanged5 | zChanged6 | zChangedInstance4 | zChanged7) && !zChangedInstance5) {
                        r15 = 0;
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, stateCollectAsStateWithLifecycle, mutableState2, stateCollectAsStateWithLifecycle3, null);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue);
                    } else {
                        r15 = 0;
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, stateCollectAsStateWithLifecycle, mutableState2, stateCollectAsStateWithLifecycle3, null);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(virtualCameraAdapter4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue, composerStartRestartGroup, (int) r15);
                    composerStartRestartGroup.startReplaceGroup(642771452);
                    if (((Boolean) mutableState3.getValue()).booleanValue()) {
                        composerStartRestartGroup.startReplaceGroup(642774748);
                        objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue10 = new Function0() { // from class: getAlphabeticShortcut
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    mutableState3.setValue(Boolean.FALSE);
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault2((Function0) objRememberedValue10, (ScholarshipDataEligible) mutableState4.getValue(), composerStartRestartGroup, 6, r15);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    i9 = i8 & 896;
                    getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Konfirmasi Beasiswa", ComposableLambdaKt.rememberComposableLambda(-36016005, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(mutableState2, mutableState, zBooleanValue4, zBooleanValue3, function7, function8, stateCollectAsStateWithLifecycle4, mutableState4, mutableState3), composerStartRestartGroup, 54), function6, null, composerStartRestartGroup, i9 | 54, 8);
                    composerStartRestartGroup.startReplaceGroup(642962622);
                    if (i9 == 256) {
                        r7 = 1;
                    } else {
                        r7 = r15;
                    }
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (r7 == 0) {
                        function9 = function6;
                        objRememberedValue9 = new Function0() { // from class: WindowCallbackWrapperApi26Impl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function9.invoke();
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    } else {
                        function9 = function6;
                        objRememberedValue9 = new Function0() { // from class: WindowCallbackWrapperApi26Impl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function9.invoke();
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BackHandlerKt.BackHandler(r15, (Function0) objRememberedValue9, composerStartRestartGroup, r15, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function3 = function9;
                    function10 = function7;
                    function11 = function8;
                } else {
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceGroup(642647811);
                        objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue13 = new Function0() { // from class: getActionProvider
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function6 = (Function0) objRememberedValue13;
                    } else {
                        function6 = function3;
                    }
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceGroup(642648995);
                        objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue12 = new Function0() { // from class: getActionView
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function7 = (Function0) objRememberedValue12;
                    } else {
                        function7 = function4;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceGroup(642650179);
                        objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue11 = new Function0() { // from class: getAlphabeticModifiers
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function8 = (Function0) objRememberedValue11;
                    } else {
                        function8 = function5;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1462147081, i8, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipConfirmationScreen (ScholarshipConfirmationScreen.kt:70)");
                    }
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    stateListDrawableCompatTuitionPaymentFragmentbindingInflater1 = getStateDrawable.TuitionPaymentFragmentbindingInflater1(composerStartRestartGroup);
                    composerStartRestartGroup.startReplaceGroup(642653880);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder(), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableState = (MutableState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(activityResultContractsPickVisualMediaMediaCapabilities.asBinder, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    stateCollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.getInterfaceDescriptor, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    stateCollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.INotificationSideChannelStub, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup.startReplaceGroup(642665579);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    mutableState2 = (MutableState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    stateCollectAsStateWithLifecycle4 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.d, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    updateTextButtonVisibility updatetextbuttonvisibility5 = (updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue();
                    composerStartRestartGroup.startReplaceGroup(642670282);
                    zChanged = composerStartRestartGroup.changed(updatetextbuttonvisibility5);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        list = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (!(list instanceof Collection)) {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = true;
                                    break;
                                } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                    z = false;
                                    break;
                                }
                            }
                        } else {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = true;
                                    break;
                                } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                        objRememberedValue3 = Boolean.valueOf(z);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        list = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (!(list instanceof Collection)) {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = true;
                                    break;
                                } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                    z = false;
                                    break;
                                }
                            }
                        } else {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = true;
                                    break;
                                } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                        objRememberedValue3 = Boolean.valueOf(z);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    boolean zBooleanValue5 = ((Boolean) objRememberedValue3).booleanValue();
                    composerStartRestartGroup.endReplaceGroup();
                    updateTextButtonVisibility updatetextbuttonvisibility6 = (updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue();
                    composerStartRestartGroup.startReplaceGroup(642673386);
                    zChanged2 = composerStartRestartGroup.changed(updatetextbuttonvisibility6);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        list2 = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (!(list2 instanceof Collection)) {
                            it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z2 = false;
                                    break;
                                } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                    z2 = true;
                                    break;
                                }
                            }
                        } else {
                            it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z2 = false;
                                    break;
                                } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        objRememberedValue4 = Boolean.valueOf(z2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        list2 = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (!(list2 instanceof Collection)) {
                            it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z2 = false;
                                    break;
                                } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                    z2 = true;
                                    break;
                                }
                            }
                        } else {
                            it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z2 = false;
                                    break;
                                } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        objRememberedValue4 = Boolean.valueOf(z2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    boolean zBooleanValue6 = ((Boolean) objRememberedValue4).booleanValue();
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(642676707);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        r2 = 0;
                        objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        r2 = 0;
                    }
                    mutableState3 = (MutableState) objRememberedValue5;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(642678716);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r2, r2, 2, r2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    mutableState4 = (MutableState) objRememberedValue6;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(642681339);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE, r2, 2, r2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    mutableState5 = (MutableState) objRememberedValue7;
                    composerStartRestartGroup.endReplaceGroup();
                    setArrowHeadLength setarrowheadlength3 = (setArrowHeadLength) mutableState5.getValue();
                    composerStartRestartGroup.startReplaceGroup(642684425);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new Function0() { // from class: getGroupId
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                mutableState5.setValue(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    getArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setarrowheadlength3, (Function0) objRememberedValue8, composerStartRestartGroup, 48);
                    Unit unit3 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(642686654);
                    zChangedInstance = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1(activityResultContractsPickVisualMediaMediaCapabilities, mutableState, r2);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue);
                    } else {
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1(activityResultContractsPickVisualMediaMediaCapabilities, mutableState, r2);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue, composerStartRestartGroup, 6);
                    VirtualCameraAdapter1 virtualCameraAdapter5 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle2.getValue();
                    composerStartRestartGroup.startReplaceGroup(642693267);
                    zChanged3 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle2);
                    zChanged4 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(context);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(getratiobypercentage);
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(zChanged3 | zChanged4 | zChangedInstance2) && !zChangedInstance3) {
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, mutableState5, context, getratiobypercentage, stateCollectAsStateWithLifecycle2, null);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue);
                    } else {
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, mutableState5, context, getratiobypercentage, stateCollectAsStateWithLifecycle2, null);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(virtualCameraAdapter5, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue, composerStartRestartGroup, 0);
                    VirtualCameraAdapter1 virtualCameraAdapter6 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle.getValue();
                    composerStartRestartGroup.startReplaceGroup(642744629);
                    zChanged5 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle);
                    zChanged6 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                    zChangedInstance4 = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                    zChanged7 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle3);
                    zChangedInstance5 = composerStartRestartGroup.changedInstance(getratiobypercentage);
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(zChanged5 | zChanged6 | zChangedInstance4 | zChanged7) && !zChangedInstance5) {
                        r15 = 0;
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, stateCollectAsStateWithLifecycle, mutableState2, stateCollectAsStateWithLifecycle3, null);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue);
                    } else {
                        r15 = 0;
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, stateCollectAsStateWithLifecycle, mutableState2, stateCollectAsStateWithLifecycle3, null);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(virtualCameraAdapter6, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue, composerStartRestartGroup, (int) r15);
                    composerStartRestartGroup.startReplaceGroup(642771452);
                    if (((Boolean) mutableState3.getValue()).booleanValue()) {
                        composerStartRestartGroup.startReplaceGroup(642774748);
                        objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue10 = new Function0() { // from class: getAlphabeticShortcut
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    mutableState3.setValue(Boolean.FALSE);
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault2((Function0) objRememberedValue10, (ScholarshipDataEligible) mutableState4.getValue(), composerStartRestartGroup, 6, r15);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    i9 = i8 & 896;
                    getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Konfirmasi Beasiswa", ComposableLambdaKt.rememberComposableLambda(-36016005, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(mutableState2, mutableState, zBooleanValue6, zBooleanValue5, function7, function8, stateCollectAsStateWithLifecycle4, mutableState4, mutableState3), composerStartRestartGroup, 54), function6, null, composerStartRestartGroup, i9 | 54, 8);
                    composerStartRestartGroup.startReplaceGroup(642962622);
                    if (i9 == 256) {
                        r7 = 1;
                    } else {
                        r7 = r15;
                    }
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (r7 == 0) {
                        function9 = function6;
                        objRememberedValue9 = new Function0() { // from class: WindowCallbackWrapperApi26Impl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function9.invoke();
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    } else {
                        function9 = function6;
                        objRememberedValue9 = new Function0() { // from class: WindowCallbackWrapperApi26Impl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function9.invoke();
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BackHandlerKt.BackHandler(r15, (Function0) objRememberedValue9, composerStartRestartGroup, r15, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function3 = function9;
                    function10 = function7;
                    function11 = function8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: onSearchRequested
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities2 = activityResultContractsPickVisualMediaMediaCapabilities;
                            getRatioByPercentage getratiobypercentage2 = getratiobypercentage;
                            Function0 function12 = function3;
                            Function0 function13 = function10;
                            Function0 function14 = function11;
                            int i11 = i;
                            onWindowFocusChanged.b(activityResultContractsPickVisualMediaMediaCapabilities2, getratiobypercentage2, function12, function13, function14, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= 3072;
            function4 = function1;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    function5 = function2;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i3;
                if ((i8 & 9363) == 9362) {
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceGroup(642647811);
                        objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue13 = new Function0() { // from class: getActionProvider
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function6 = (Function0) objRememberedValue13;
                    } else {
                        function6 = function3;
                    }
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceGroup(642648995);
                        objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue12 = new Function0() { // from class: getActionView
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function7 = (Function0) objRememberedValue12;
                    } else {
                        function7 = function4;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceGroup(642650179);
                        objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue11 = new Function0() { // from class: getAlphabeticModifiers
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function8 = (Function0) objRememberedValue11;
                    } else {
                        function8 = function5;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1462147081, i8, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipConfirmationScreen (ScholarshipConfirmationScreen.kt:70)");
                    }
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    stateListDrawableCompatTuitionPaymentFragmentbindingInflater1 = getStateDrawable.TuitionPaymentFragmentbindingInflater1(composerStartRestartGroup);
                    composerStartRestartGroup.startReplaceGroup(642653880);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder(), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableState = (MutableState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(activityResultContractsPickVisualMediaMediaCapabilities.asBinder, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    stateCollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.getInterfaceDescriptor, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    stateCollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.INotificationSideChannelStub, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup.startReplaceGroup(642665579);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    mutableState2 = (MutableState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    stateCollectAsStateWithLifecycle4 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.d, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    updateTextButtonVisibility updatetextbuttonvisibility7 = (updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue();
                    composerStartRestartGroup.startReplaceGroup(642670282);
                    zChanged = composerStartRestartGroup.changed(updatetextbuttonvisibility7);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        list = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (!(list instanceof Collection)) {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = true;
                                    break;
                                } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                    z = false;
                                    break;
                                }
                            }
                        } else {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = true;
                                    break;
                                } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                        objRememberedValue3 = Boolean.valueOf(z);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        list = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (!(list instanceof Collection)) {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = true;
                                    break;
                                } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                    z = false;
                                    break;
                                }
                            }
                        } else {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = true;
                                    break;
                                } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                        objRememberedValue3 = Boolean.valueOf(z);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    boolean zBooleanValue7 = ((Boolean) objRememberedValue3).booleanValue();
                    composerStartRestartGroup.endReplaceGroup();
                    updateTextButtonVisibility updatetextbuttonvisibility8 = (updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue();
                    composerStartRestartGroup.startReplaceGroup(642673386);
                    zChanged2 = composerStartRestartGroup.changed(updatetextbuttonvisibility8);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        list2 = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (!(list2 instanceof Collection)) {
                            it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z2 = false;
                                    break;
                                } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                    z2 = true;
                                    break;
                                }
                            }
                        } else {
                            it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z2 = false;
                                    break;
                                } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        objRememberedValue4 = Boolean.valueOf(z2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        list2 = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (!(list2 instanceof Collection)) {
                            it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z2 = false;
                                    break;
                                } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                    z2 = true;
                                    break;
                                }
                            }
                        } else {
                            it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z2 = false;
                                    break;
                                } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        objRememberedValue4 = Boolean.valueOf(z2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    boolean zBooleanValue8 = ((Boolean) objRememberedValue4).booleanValue();
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(642676707);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        r2 = 0;
                        objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        r2 = 0;
                    }
                    mutableState3 = (MutableState) objRememberedValue5;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(642678716);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r2, r2, 2, r2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    mutableState4 = (MutableState) objRememberedValue6;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(642681339);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE, r2, 2, r2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    mutableState5 = (MutableState) objRememberedValue7;
                    composerStartRestartGroup.endReplaceGroup();
                    setArrowHeadLength setarrowheadlength4 = (setArrowHeadLength) mutableState5.getValue();
                    composerStartRestartGroup.startReplaceGroup(642684425);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new Function0() { // from class: getGroupId
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                mutableState5.setValue(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    getArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setarrowheadlength4, (Function0) objRememberedValue8, composerStartRestartGroup, 48);
                    Unit unit4 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(642686654);
                    zChangedInstance = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1(activityResultContractsPickVisualMediaMediaCapabilities, mutableState, r2);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue);
                    } else {
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1(activityResultContractsPickVisualMediaMediaCapabilities, mutableState, r2);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue, composerStartRestartGroup, 6);
                    VirtualCameraAdapter1 virtualCameraAdapter7 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle2.getValue();
                    composerStartRestartGroup.startReplaceGroup(642693267);
                    zChanged3 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle2);
                    zChanged4 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(context);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(getratiobypercentage);
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(zChanged3 | zChanged4 | zChangedInstance2) && !zChangedInstance3) {
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, mutableState5, context, getratiobypercentage, stateCollectAsStateWithLifecycle2, null);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue);
                    } else {
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, mutableState5, context, getratiobypercentage, stateCollectAsStateWithLifecycle2, null);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(virtualCameraAdapter7, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue, composerStartRestartGroup, 0);
                    VirtualCameraAdapter1 virtualCameraAdapter8 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle.getValue();
                    composerStartRestartGroup.startReplaceGroup(642744629);
                    zChanged5 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle);
                    zChanged6 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                    zChangedInstance4 = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                    zChanged7 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle3);
                    zChangedInstance5 = composerStartRestartGroup.changedInstance(getratiobypercentage);
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(zChanged5 | zChanged6 | zChangedInstance4 | zChanged7) && !zChangedInstance5) {
                        r15 = 0;
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, stateCollectAsStateWithLifecycle, mutableState2, stateCollectAsStateWithLifecycle3, null);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue);
                    } else {
                        r15 = 0;
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, stateCollectAsStateWithLifecycle, mutableState2, stateCollectAsStateWithLifecycle3, null);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(virtualCameraAdapter8, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue, composerStartRestartGroup, (int) r15);
                    composerStartRestartGroup.startReplaceGroup(642771452);
                    if (((Boolean) mutableState3.getValue()).booleanValue()) {
                        composerStartRestartGroup.startReplaceGroup(642774748);
                        objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue10 = new Function0() { // from class: getAlphabeticShortcut
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    mutableState3.setValue(Boolean.FALSE);
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault2((Function0) objRememberedValue10, (ScholarshipDataEligible) mutableState4.getValue(), composerStartRestartGroup, 6, r15);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    i9 = i8 & 896;
                    getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Konfirmasi Beasiswa", ComposableLambdaKt.rememberComposableLambda(-36016005, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(mutableState2, mutableState, zBooleanValue8, zBooleanValue7, function7, function8, stateCollectAsStateWithLifecycle4, mutableState4, mutableState3), composerStartRestartGroup, 54), function6, null, composerStartRestartGroup, i9 | 54, 8);
                    composerStartRestartGroup.startReplaceGroup(642962622);
                    if (i9 == 256) {
                        r7 = 1;
                    } else {
                        r7 = r15;
                    }
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (r7 == 0) {
                        function9 = function6;
                        objRememberedValue9 = new Function0() { // from class: WindowCallbackWrapperApi26Impl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function9.invoke();
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    } else {
                        function9 = function6;
                        objRememberedValue9 = new Function0() { // from class: WindowCallbackWrapperApi26Impl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function9.invoke();
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BackHandlerKt.BackHandler(r15, (Function0) objRememberedValue9, composerStartRestartGroup, r15, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function3 = function9;
                    function10 = function7;
                    function11 = function8;
                } else {
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceGroup(642647811);
                        objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue13 = new Function0() { // from class: getActionProvider
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function6 = (Function0) objRememberedValue13;
                    } else {
                        function6 = function3;
                    }
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceGroup(642648995);
                        objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue12 = new Function0() { // from class: getActionView
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function7 = (Function0) objRememberedValue12;
                    } else {
                        function7 = function4;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceGroup(642650179);
                        objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue11 = new Function0() { // from class: getAlphabeticModifiers
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function8 = (Function0) objRememberedValue11;
                    } else {
                        function8 = function5;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1462147081, i8, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipConfirmationScreen (ScholarshipConfirmationScreen.kt:70)");
                    }
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    stateListDrawableCompatTuitionPaymentFragmentbindingInflater1 = getStateDrawable.TuitionPaymentFragmentbindingInflater1(composerStartRestartGroup);
                    composerStartRestartGroup.startReplaceGroup(642653880);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder(), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableState = (MutableState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(activityResultContractsPickVisualMediaMediaCapabilities.asBinder, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    stateCollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.getInterfaceDescriptor, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    stateCollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.INotificationSideChannelStub, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup.startReplaceGroup(642665579);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    mutableState2 = (MutableState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    stateCollectAsStateWithLifecycle4 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.d, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    updateTextButtonVisibility updatetextbuttonvisibility9 = (updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue();
                    composerStartRestartGroup.startReplaceGroup(642670282);
                    zChanged = composerStartRestartGroup.changed(updatetextbuttonvisibility9);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        list = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (!(list instanceof Collection)) {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = true;
                                    break;
                                } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                    z = false;
                                    break;
                                }
                            }
                        } else {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = true;
                                    break;
                                } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                        objRememberedValue3 = Boolean.valueOf(z);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        list = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (!(list instanceof Collection)) {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = true;
                                    break;
                                } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                    z = false;
                                    break;
                                }
                            }
                        } else {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = true;
                                    break;
                                } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                        objRememberedValue3 = Boolean.valueOf(z);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    boolean zBooleanValue9 = ((Boolean) objRememberedValue3).booleanValue();
                    composerStartRestartGroup.endReplaceGroup();
                    updateTextButtonVisibility updatetextbuttonvisibility10 = (updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue();
                    composerStartRestartGroup.startReplaceGroup(642673386);
                    zChanged2 = composerStartRestartGroup.changed(updatetextbuttonvisibility10);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        list2 = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (!(list2 instanceof Collection)) {
                            it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z2 = false;
                                    break;
                                } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                    z2 = true;
                                    break;
                                }
                            }
                        } else {
                            it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z2 = false;
                                    break;
                                } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        objRememberedValue4 = Boolean.valueOf(z2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        list2 = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (!(list2 instanceof Collection)) {
                            it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z2 = false;
                                    break;
                                } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                    z2 = true;
                                    break;
                                }
                            }
                        } else {
                            it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z2 = false;
                                    break;
                                } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        objRememberedValue4 = Boolean.valueOf(z2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    boolean zBooleanValue10 = ((Boolean) objRememberedValue4).booleanValue();
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(642676707);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        r2 = 0;
                        objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        r2 = 0;
                    }
                    mutableState3 = (MutableState) objRememberedValue5;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(642678716);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r2, r2, 2, r2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    mutableState4 = (MutableState) objRememberedValue6;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(642681339);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE, r2, 2, r2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    mutableState5 = (MutableState) objRememberedValue7;
                    composerStartRestartGroup.endReplaceGroup();
                    setArrowHeadLength setarrowheadlength5 = (setArrowHeadLength) mutableState5.getValue();
                    composerStartRestartGroup.startReplaceGroup(642684425);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new Function0() { // from class: getGroupId
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                mutableState5.setValue(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    getArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setarrowheadlength5, (Function0) objRememberedValue8, composerStartRestartGroup, 48);
                    Unit unit5 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(642686654);
                    zChangedInstance = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1(activityResultContractsPickVisualMediaMediaCapabilities, mutableState, r2);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue);
                    } else {
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1(activityResultContractsPickVisualMediaMediaCapabilities, mutableState, r2);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit5, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue, composerStartRestartGroup, 6);
                    VirtualCameraAdapter1 virtualCameraAdapter9 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle2.getValue();
                    composerStartRestartGroup.startReplaceGroup(642693267);
                    zChanged3 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle2);
                    zChanged4 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(context);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(getratiobypercentage);
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(zChanged3 | zChanged4 | zChangedInstance2) && !zChangedInstance3) {
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, mutableState5, context, getratiobypercentage, stateCollectAsStateWithLifecycle2, null);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue);
                    } else {
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, mutableState5, context, getratiobypercentage, stateCollectAsStateWithLifecycle2, null);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(virtualCameraAdapter9, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue, composerStartRestartGroup, 0);
                    VirtualCameraAdapter1 virtualCameraAdapter10 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle.getValue();
                    composerStartRestartGroup.startReplaceGroup(642744629);
                    zChanged5 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle);
                    zChanged6 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                    zChangedInstance4 = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                    zChanged7 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle3);
                    zChangedInstance5 = composerStartRestartGroup.changedInstance(getratiobypercentage);
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(zChanged5 | zChanged6 | zChangedInstance4 | zChanged7) && !zChangedInstance5) {
                        r15 = 0;
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, stateCollectAsStateWithLifecycle, mutableState2, stateCollectAsStateWithLifecycle3, null);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue);
                    } else {
                        r15 = 0;
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, stateCollectAsStateWithLifecycle, mutableState2, stateCollectAsStateWithLifecycle3, null);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(virtualCameraAdapter10, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue, composerStartRestartGroup, (int) r15);
                    composerStartRestartGroup.startReplaceGroup(642771452);
                    if (((Boolean) mutableState3.getValue()).booleanValue()) {
                        composerStartRestartGroup.startReplaceGroup(642774748);
                        objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue10 = new Function0() { // from class: getAlphabeticShortcut
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    mutableState3.setValue(Boolean.FALSE);
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault2((Function0) objRememberedValue10, (ScholarshipDataEligible) mutableState4.getValue(), composerStartRestartGroup, 6, r15);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    i9 = i8 & 896;
                    getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Konfirmasi Beasiswa", ComposableLambdaKt.rememberComposableLambda(-36016005, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(mutableState2, mutableState, zBooleanValue10, zBooleanValue9, function7, function8, stateCollectAsStateWithLifecycle4, mutableState4, mutableState3), composerStartRestartGroup, 54), function6, null, composerStartRestartGroup, i9 | 54, 8);
                    composerStartRestartGroup.startReplaceGroup(642962622);
                    if (i9 == 256) {
                        r7 = 1;
                    } else {
                        r7 = r15;
                    }
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (r7 == 0) {
                        function9 = function6;
                        objRememberedValue9 = new Function0() { // from class: WindowCallbackWrapperApi26Impl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function9.invoke();
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    } else {
                        function9 = function6;
                        objRememberedValue9 = new Function0() { // from class: WindowCallbackWrapperApi26Impl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function9.invoke();
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BackHandlerKt.BackHandler(r15, (Function0) objRememberedValue9, composerStartRestartGroup, r15, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function3 = function9;
                    function10 = function7;
                    function11 = function8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: onSearchRequested
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities2 = activityResultContractsPickVisualMediaMediaCapabilities;
                            getRatioByPercentage getratiobypercentage2 = getratiobypercentage;
                            Function0 function12 = function3;
                            Function0 function13 = function10;
                            Function0 function14 = function11;
                            int i11 = i;
                            onWindowFocusChanged.b(activityResultContractsPickVisualMediaMediaCapabilities2, getratiobypercentage2, function12, function13, function14, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= 24576;
            function5 = function2;
            i8 = i3;
            if ((i8 & 9363) == 9362) {
                if (i10 != 0) {
                    composerStartRestartGroup.startReplaceGroup(642647811);
                    objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue13 = new Function0() { // from class: getActionProvider
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function6 = (Function0) objRememberedValue13;
                } else {
                    function6 = function3;
                }
                if (i4 != 0) {
                    composerStartRestartGroup.startReplaceGroup(642648995);
                    objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue12 = new Function0() { // from class: getActionView
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function7 = (Function0) objRememberedValue12;
                } else {
                    function7 = function4;
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceGroup(642650179);
                    objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue11 = new Function0() { // from class: getAlphabeticModifiers
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function8 = (Function0) objRememberedValue11;
                } else {
                    function8 = function5;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1462147081, i8, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipConfirmationScreen (ScholarshipConfirmationScreen.kt:70)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                stateListDrawableCompatTuitionPaymentFragmentbindingInflater1 = getStateDrawable.TuitionPaymentFragmentbindingInflater1(composerStartRestartGroup);
                composerStartRestartGroup.startReplaceGroup(642653880);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(activityResultContractsPickVisualMediaMediaCapabilities.asBinder, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                stateCollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.getInterfaceDescriptor, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                stateCollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.INotificationSideChannelStub, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceGroup(642665579);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                mutableState2 = (MutableState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                stateCollectAsStateWithLifecycle4 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.d, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                updateTextButtonVisibility updatetextbuttonvisibility11 = (updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue();
                composerStartRestartGroup.startReplaceGroup(642670282);
                zChanged = composerStartRestartGroup.changed(updatetextbuttonvisibility11);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    list = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (!(list instanceof Collection)) {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                z = false;
                                break;
                            }
                        }
                    } else {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                z = false;
                                break;
                            }
                        }
                    }
                    objRememberedValue3 = Boolean.valueOf(z);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    list = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (!(list instanceof Collection)) {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                z = false;
                                break;
                            }
                        }
                    } else {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                z = false;
                                break;
                            }
                        }
                    }
                    objRememberedValue3 = Boolean.valueOf(z);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                boolean zBooleanValue11 = ((Boolean) objRememberedValue3).booleanValue();
                composerStartRestartGroup.endReplaceGroup();
                updateTextButtonVisibility updatetextbuttonvisibility12 = (updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue();
                composerStartRestartGroup.startReplaceGroup(642673386);
                zChanged2 = composerStartRestartGroup.changed(updatetextbuttonvisibility12);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    list2 = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (!(list2 instanceof Collection)) {
                        it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = false;
                                break;
                            } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                z2 = true;
                                break;
                            }
                        }
                    } else {
                        it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = false;
                                break;
                            } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    objRememberedValue4 = Boolean.valueOf(z2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    list2 = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (!(list2 instanceof Collection)) {
                        it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = false;
                                break;
                            } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                z2 = true;
                                break;
                            }
                        }
                    } else {
                        it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = false;
                                break;
                            } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    objRememberedValue4 = Boolean.valueOf(z2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                boolean zBooleanValue12 = ((Boolean) objRememberedValue4).booleanValue();
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(642676707);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    r2 = 0;
                    objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    r2 = 0;
                }
                mutableState3 = (MutableState) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(642678716);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r2, r2, 2, r2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                mutableState4 = (MutableState) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(642681339);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE, r2, 2, r2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                mutableState5 = (MutableState) objRememberedValue7;
                composerStartRestartGroup.endReplaceGroup();
                setArrowHeadLength setarrowheadlength6 = (setArrowHeadLength) mutableState5.getValue();
                composerStartRestartGroup.startReplaceGroup(642684425);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue8 = new Function0() { // from class: getGroupId
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            mutableState5.setValue(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                getArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setarrowheadlength6, (Function0) objRememberedValue8, composerStartRestartGroup, 48);
                Unit unit6 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(642686654);
                zChangedInstance = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1(activityResultContractsPickVisualMediaMediaCapabilities, mutableState, r2);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue);
                } else {
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1(activityResultContractsPickVisualMediaMediaCapabilities, mutableState, r2);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit6, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue, composerStartRestartGroup, 6);
                VirtualCameraAdapter1 virtualCameraAdapter11 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle2.getValue();
                composerStartRestartGroup.startReplaceGroup(642693267);
                zChanged3 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle2);
                zChanged4 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(context);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(getratiobypercentage);
                scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(zChanged3 | zChanged4 | zChangedInstance2) && !zChangedInstance3) {
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, mutableState5, context, getratiobypercentage, stateCollectAsStateWithLifecycle2, null);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue);
                } else {
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, mutableState5, context, getratiobypercentage, stateCollectAsStateWithLifecycle2, null);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(virtualCameraAdapter11, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue, composerStartRestartGroup, 0);
                VirtualCameraAdapter1 virtualCameraAdapter12 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle.getValue();
                composerStartRestartGroup.startReplaceGroup(642744629);
                zChanged5 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle);
                zChanged6 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                zChangedInstance4 = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                zChanged7 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle3);
                zChangedInstance5 = composerStartRestartGroup.changedInstance(getratiobypercentage);
                scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(zChanged5 | zChanged6 | zChangedInstance4 | zChanged7) && !zChangedInstance5) {
                    r15 = 0;
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, stateCollectAsStateWithLifecycle, mutableState2, stateCollectAsStateWithLifecycle3, null);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue);
                } else {
                    r15 = 0;
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, stateCollectAsStateWithLifecycle, mutableState2, stateCollectAsStateWithLifecycle3, null);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(virtualCameraAdapter12, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue, composerStartRestartGroup, (int) r15);
                composerStartRestartGroup.startReplaceGroup(642771452);
                if (((Boolean) mutableState3.getValue()).booleanValue()) {
                    composerStartRestartGroup.startReplaceGroup(642774748);
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue10 = new Function0() { // from class: getAlphabeticShortcut
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                mutableState3.setValue(Boolean.FALSE);
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault2((Function0) objRememberedValue10, (ScholarshipDataEligible) mutableState4.getValue(), composerStartRestartGroup, 6, r15);
                }
                composerStartRestartGroup.endReplaceGroup();
                i9 = i8 & 896;
                getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Konfirmasi Beasiswa", ComposableLambdaKt.rememberComposableLambda(-36016005, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(mutableState2, mutableState, zBooleanValue12, zBooleanValue11, function7, function8, stateCollectAsStateWithLifecycle4, mutableState4, mutableState3), composerStartRestartGroup, 54), function6, null, composerStartRestartGroup, i9 | 54, 8);
                composerStartRestartGroup.startReplaceGroup(642962622);
                if (i9 == 256) {
                    r7 = 1;
                } else {
                    r7 = r15;
                }
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (r7 == 0) {
                    function9 = function6;
                    objRememberedValue9 = new Function0() { // from class: WindowCallbackWrapperApi26Impl
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function9.invoke();
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                } else {
                    function9 = function6;
                    objRememberedValue9 = new Function0() { // from class: WindowCallbackWrapperApi26Impl
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function9.invoke();
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                composerStartRestartGroup.endReplaceGroup();
                BackHandlerKt.BackHandler(r15, (Function0) objRememberedValue9, composerStartRestartGroup, r15, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function9;
                function10 = function7;
                function11 = function8;
            } else {
                if (i10 != 0) {
                    composerStartRestartGroup.startReplaceGroup(642647811);
                    objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue13 = new Function0() { // from class: getActionProvider
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function6 = (Function0) objRememberedValue13;
                } else {
                    function6 = function3;
                }
                if (i4 != 0) {
                    composerStartRestartGroup.startReplaceGroup(642648995);
                    objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue12 = new Function0() { // from class: getActionView
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function7 = (Function0) objRememberedValue12;
                } else {
                    function7 = function4;
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceGroup(642650179);
                    objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue11 = new Function0() { // from class: getAlphabeticModifiers
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function8 = (Function0) objRememberedValue11;
                } else {
                    function8 = function5;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1462147081, i8, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipConfirmationScreen (ScholarshipConfirmationScreen.kt:70)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                stateListDrawableCompatTuitionPaymentFragmentbindingInflater1 = getStateDrawable.TuitionPaymentFragmentbindingInflater1(composerStartRestartGroup);
                composerStartRestartGroup.startReplaceGroup(642653880);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(activityResultContractsPickVisualMediaMediaCapabilities.asBinder, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                stateCollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.getInterfaceDescriptor, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                stateCollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.INotificationSideChannelStub, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceGroup(642665579);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                mutableState2 = (MutableState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                stateCollectAsStateWithLifecycle4 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.d, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                updateTextButtonVisibility updatetextbuttonvisibility13 = (updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue();
                composerStartRestartGroup.startReplaceGroup(642670282);
                zChanged = composerStartRestartGroup.changed(updatetextbuttonvisibility13);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    list = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (!(list instanceof Collection)) {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                z = false;
                                break;
                            }
                        }
                    } else {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                z = false;
                                break;
                            }
                        }
                    }
                    objRememberedValue3 = Boolean.valueOf(z);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    list = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (!(list instanceof Collection)) {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                z = false;
                                break;
                            }
                        }
                    } else {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                z = false;
                                break;
                            }
                        }
                    }
                    objRememberedValue3 = Boolean.valueOf(z);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                boolean zBooleanValue13 = ((Boolean) objRememberedValue3).booleanValue();
                composerStartRestartGroup.endReplaceGroup();
                updateTextButtonVisibility updatetextbuttonvisibility14 = (updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue();
                composerStartRestartGroup.startReplaceGroup(642673386);
                zChanged2 = composerStartRestartGroup.changed(updatetextbuttonvisibility14);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    list2 = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (!(list2 instanceof Collection)) {
                        it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = false;
                                break;
                            } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                z2 = true;
                                break;
                            }
                        }
                    } else {
                        it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = false;
                                break;
                            } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    objRememberedValue4 = Boolean.valueOf(z2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    list2 = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (!(list2 instanceof Collection)) {
                        it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = false;
                                break;
                            } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                z2 = true;
                                break;
                            }
                        }
                    } else {
                        it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = false;
                                break;
                            } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    objRememberedValue4 = Boolean.valueOf(z2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                boolean zBooleanValue14 = ((Boolean) objRememberedValue4).booleanValue();
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(642676707);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    r2 = 0;
                    objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    r2 = 0;
                }
                mutableState3 = (MutableState) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(642678716);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r2, r2, 2, r2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                mutableState4 = (MutableState) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(642681339);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE, r2, 2, r2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                mutableState5 = (MutableState) objRememberedValue7;
                composerStartRestartGroup.endReplaceGroup();
                setArrowHeadLength setarrowheadlength7 = (setArrowHeadLength) mutableState5.getValue();
                composerStartRestartGroup.startReplaceGroup(642684425);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue8 = new Function0() { // from class: getGroupId
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            mutableState5.setValue(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                getArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setarrowheadlength7, (Function0) objRememberedValue8, composerStartRestartGroup, 48);
                Unit unit7 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(642686654);
                zChangedInstance = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1(activityResultContractsPickVisualMediaMediaCapabilities, mutableState, r2);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue);
                } else {
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1(activityResultContractsPickVisualMediaMediaCapabilities, mutableState, r2);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit7, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue, composerStartRestartGroup, 6);
                VirtualCameraAdapter1 virtualCameraAdapter13 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle2.getValue();
                composerStartRestartGroup.startReplaceGroup(642693267);
                zChanged3 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle2);
                zChanged4 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(context);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(getratiobypercentage);
                scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(zChanged3 | zChanged4 | zChangedInstance2) && !zChangedInstance3) {
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, mutableState5, context, getratiobypercentage, stateCollectAsStateWithLifecycle2, null);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue);
                } else {
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, mutableState5, context, getratiobypercentage, stateCollectAsStateWithLifecycle2, null);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(virtualCameraAdapter13, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue, composerStartRestartGroup, 0);
                VirtualCameraAdapter1 virtualCameraAdapter14 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle.getValue();
                composerStartRestartGroup.startReplaceGroup(642744629);
                zChanged5 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle);
                zChanged6 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                zChangedInstance4 = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                zChanged7 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle3);
                zChangedInstance5 = composerStartRestartGroup.changedInstance(getratiobypercentage);
                scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(zChanged5 | zChanged6 | zChangedInstance4 | zChanged7) && !zChangedInstance5) {
                    r15 = 0;
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, stateCollectAsStateWithLifecycle, mutableState2, stateCollectAsStateWithLifecycle3, null);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue);
                } else {
                    r15 = 0;
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, stateCollectAsStateWithLifecycle, mutableState2, stateCollectAsStateWithLifecycle3, null);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(virtualCameraAdapter14, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue, composerStartRestartGroup, (int) r15);
                composerStartRestartGroup.startReplaceGroup(642771452);
                if (((Boolean) mutableState3.getValue()).booleanValue()) {
                    composerStartRestartGroup.startReplaceGroup(642774748);
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue10 = new Function0() { // from class: getAlphabeticShortcut
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                mutableState3.setValue(Boolean.FALSE);
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault2((Function0) objRememberedValue10, (ScholarshipDataEligible) mutableState4.getValue(), composerStartRestartGroup, 6, r15);
                }
                composerStartRestartGroup.endReplaceGroup();
                i9 = i8 & 896;
                getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Konfirmasi Beasiswa", ComposableLambdaKt.rememberComposableLambda(-36016005, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(mutableState2, mutableState, zBooleanValue14, zBooleanValue13, function7, function8, stateCollectAsStateWithLifecycle4, mutableState4, mutableState3), composerStartRestartGroup, 54), function6, null, composerStartRestartGroup, i9 | 54, 8);
                composerStartRestartGroup.startReplaceGroup(642962622);
                if (i9 == 256) {
                    r7 = 1;
                } else {
                    r7 = r15;
                }
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (r7 == 0) {
                    function9 = function6;
                    objRememberedValue9 = new Function0() { // from class: WindowCallbackWrapperApi26Impl
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function9.invoke();
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                } else {
                    function9 = function6;
                    objRememberedValue9 = new Function0() { // from class: WindowCallbackWrapperApi26Impl
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function9.invoke();
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                composerStartRestartGroup.endReplaceGroup();
                BackHandlerKt.BackHandler(r15, (Function0) objRememberedValue9, composerStartRestartGroup, r15, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function9;
                function10 = function7;
                function11 = function8;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: onSearchRequested
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities2 = activityResultContractsPickVisualMediaMediaCapabilities;
                        getRatioByPercentage getratiobypercentage2 = getratiobypercentage;
                        Function0 function12 = function3;
                        Function0 function13 = function10;
                        Function0 function14 = function11;
                        int i11 = i;
                        onWindowFocusChanged.b(activityResultContractsPickVisualMediaMediaCapabilities2, getratiobypercentage2, function12, function13, function14, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= 384;
        function3 = function0;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                function4 = function1;
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    function5 = function2;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i3;
                if ((i8 & 9363) == 9362) {
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceGroup(642647811);
                        objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue13 = new Function0() { // from class: getActionProvider
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function6 = (Function0) objRememberedValue13;
                    } else {
                        function6 = function3;
                    }
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceGroup(642648995);
                        objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue12 = new Function0() { // from class: getActionView
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function7 = (Function0) objRememberedValue12;
                    } else {
                        function7 = function4;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceGroup(642650179);
                        objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue11 = new Function0() { // from class: getAlphabeticModifiers
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function8 = (Function0) objRememberedValue11;
                    } else {
                        function8 = function5;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1462147081, i8, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipConfirmationScreen (ScholarshipConfirmationScreen.kt:70)");
                    }
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    stateListDrawableCompatTuitionPaymentFragmentbindingInflater1 = getStateDrawable.TuitionPaymentFragmentbindingInflater1(composerStartRestartGroup);
                    composerStartRestartGroup.startReplaceGroup(642653880);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder(), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableState = (MutableState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(activityResultContractsPickVisualMediaMediaCapabilities.asBinder, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    stateCollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.getInterfaceDescriptor, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    stateCollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.INotificationSideChannelStub, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup.startReplaceGroup(642665579);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    mutableState2 = (MutableState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    stateCollectAsStateWithLifecycle4 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.d, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    updateTextButtonVisibility updatetextbuttonvisibility15 = (updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue();
                    composerStartRestartGroup.startReplaceGroup(642670282);
                    zChanged = composerStartRestartGroup.changed(updatetextbuttonvisibility15);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        list = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (!(list instanceof Collection)) {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = true;
                                    break;
                                } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                    z = false;
                                    break;
                                }
                            }
                        } else {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = true;
                                    break;
                                } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                        objRememberedValue3 = Boolean.valueOf(z);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        list = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (!(list instanceof Collection)) {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = true;
                                    break;
                                } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                    z = false;
                                    break;
                                }
                            }
                        } else {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = true;
                                    break;
                                } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                        objRememberedValue3 = Boolean.valueOf(z);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    boolean zBooleanValue15 = ((Boolean) objRememberedValue3).booleanValue();
                    composerStartRestartGroup.endReplaceGroup();
                    updateTextButtonVisibility updatetextbuttonvisibility16 = (updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue();
                    composerStartRestartGroup.startReplaceGroup(642673386);
                    zChanged2 = composerStartRestartGroup.changed(updatetextbuttonvisibility16);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        list2 = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (!(list2 instanceof Collection)) {
                            it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z2 = false;
                                    break;
                                } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                    z2 = true;
                                    break;
                                }
                            }
                        } else {
                            it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z2 = false;
                                    break;
                                } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        objRememberedValue4 = Boolean.valueOf(z2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        list2 = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (!(list2 instanceof Collection)) {
                            it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z2 = false;
                                    break;
                                } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                    z2 = true;
                                    break;
                                }
                            }
                        } else {
                            it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z2 = false;
                                    break;
                                } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        objRememberedValue4 = Boolean.valueOf(z2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    boolean zBooleanValue16 = ((Boolean) objRememberedValue4).booleanValue();
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(642676707);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        r2 = 0;
                        objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        r2 = 0;
                    }
                    mutableState3 = (MutableState) objRememberedValue5;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(642678716);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r2, r2, 2, r2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    mutableState4 = (MutableState) objRememberedValue6;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(642681339);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE, r2, 2, r2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    mutableState5 = (MutableState) objRememberedValue7;
                    composerStartRestartGroup.endReplaceGroup();
                    setArrowHeadLength setarrowheadlength8 = (setArrowHeadLength) mutableState5.getValue();
                    composerStartRestartGroup.startReplaceGroup(642684425);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new Function0() { // from class: getGroupId
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                mutableState5.setValue(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    getArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setarrowheadlength8, (Function0) objRememberedValue8, composerStartRestartGroup, 48);
                    Unit unit8 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(642686654);
                    zChangedInstance = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1(activityResultContractsPickVisualMediaMediaCapabilities, mutableState, r2);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue);
                    } else {
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1(activityResultContractsPickVisualMediaMediaCapabilities, mutableState, r2);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit8, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue, composerStartRestartGroup, 6);
                    VirtualCameraAdapter1 virtualCameraAdapter15 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle2.getValue();
                    composerStartRestartGroup.startReplaceGroup(642693267);
                    zChanged3 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle2);
                    zChanged4 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(context);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(getratiobypercentage);
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(zChanged3 | zChanged4 | zChangedInstance2) && !zChangedInstance3) {
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, mutableState5, context, getratiobypercentage, stateCollectAsStateWithLifecycle2, null);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue);
                    } else {
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, mutableState5, context, getratiobypercentage, stateCollectAsStateWithLifecycle2, null);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(virtualCameraAdapter15, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue, composerStartRestartGroup, 0);
                    VirtualCameraAdapter1 virtualCameraAdapter16 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle.getValue();
                    composerStartRestartGroup.startReplaceGroup(642744629);
                    zChanged5 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle);
                    zChanged6 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                    zChangedInstance4 = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                    zChanged7 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle3);
                    zChangedInstance5 = composerStartRestartGroup.changedInstance(getratiobypercentage);
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(zChanged5 | zChanged6 | zChangedInstance4 | zChanged7) && !zChangedInstance5) {
                        r15 = 0;
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, stateCollectAsStateWithLifecycle, mutableState2, stateCollectAsStateWithLifecycle3, null);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue);
                    } else {
                        r15 = 0;
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, stateCollectAsStateWithLifecycle, mutableState2, stateCollectAsStateWithLifecycle3, null);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(virtualCameraAdapter16, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue, composerStartRestartGroup, (int) r15);
                    composerStartRestartGroup.startReplaceGroup(642771452);
                    if (((Boolean) mutableState3.getValue()).booleanValue()) {
                        composerStartRestartGroup.startReplaceGroup(642774748);
                        objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue10 = new Function0() { // from class: getAlphabeticShortcut
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    mutableState3.setValue(Boolean.FALSE);
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault2((Function0) objRememberedValue10, (ScholarshipDataEligible) mutableState4.getValue(), composerStartRestartGroup, 6, r15);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    i9 = i8 & 896;
                    getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Konfirmasi Beasiswa", ComposableLambdaKt.rememberComposableLambda(-36016005, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(mutableState2, mutableState, zBooleanValue16, zBooleanValue15, function7, function8, stateCollectAsStateWithLifecycle4, mutableState4, mutableState3), composerStartRestartGroup, 54), function6, null, composerStartRestartGroup, i9 | 54, 8);
                    composerStartRestartGroup.startReplaceGroup(642962622);
                    if (i9 == 256) {
                        r7 = 1;
                    } else {
                        r7 = r15;
                    }
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (r7 == 0) {
                        function9 = function6;
                        objRememberedValue9 = new Function0() { // from class: WindowCallbackWrapperApi26Impl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function9.invoke();
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    } else {
                        function9 = function6;
                        objRememberedValue9 = new Function0() { // from class: WindowCallbackWrapperApi26Impl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function9.invoke();
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BackHandlerKt.BackHandler(r15, (Function0) objRememberedValue9, composerStartRestartGroup, r15, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function3 = function9;
                    function10 = function7;
                    function11 = function8;
                } else {
                    if (i10 != 0) {
                        composerStartRestartGroup.startReplaceGroup(642647811);
                        objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue13 = new Function0() { // from class: getActionProvider
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function6 = (Function0) objRememberedValue13;
                    } else {
                        function6 = function3;
                    }
                    if (i4 != 0) {
                        composerStartRestartGroup.startReplaceGroup(642648995);
                        objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue12 = new Function0() { // from class: getActionView
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function7 = (Function0) objRememberedValue12;
                    } else {
                        function7 = function4;
                    }
                    if (i6 != 0) {
                        composerStartRestartGroup.startReplaceGroup(642650179);
                        objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue11 = new Function0() { // from class: getAlphabeticModifiers
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function8 = (Function0) objRememberedValue11;
                    } else {
                        function8 = function5;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1462147081, i8, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipConfirmationScreen (ScholarshipConfirmationScreen.kt:70)");
                    }
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    stateListDrawableCompatTuitionPaymentFragmentbindingInflater1 = getStateDrawable.TuitionPaymentFragmentbindingInflater1(composerStartRestartGroup);
                    composerStartRestartGroup.startReplaceGroup(642653880);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder(), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    mutableState = (MutableState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(activityResultContractsPickVisualMediaMediaCapabilities.asBinder, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    stateCollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.getInterfaceDescriptor, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    stateCollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.INotificationSideChannelStub, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup.startReplaceGroup(642665579);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    mutableState2 = (MutableState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    stateCollectAsStateWithLifecycle4 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.d, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    updateTextButtonVisibility updatetextbuttonvisibility17 = (updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue();
                    composerStartRestartGroup.startReplaceGroup(642670282);
                    zChanged = composerStartRestartGroup.changed(updatetextbuttonvisibility17);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        list = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (!(list instanceof Collection)) {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = true;
                                    break;
                                } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                    z = false;
                                    break;
                                }
                            }
                        } else {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = true;
                                    break;
                                } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                        objRememberedValue3 = Boolean.valueOf(z);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        list = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (!(list instanceof Collection)) {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = true;
                                    break;
                                } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                    z = false;
                                    break;
                                }
                            }
                        } else {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = true;
                                    break;
                                } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                        objRememberedValue3 = Boolean.valueOf(z);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    boolean zBooleanValue17 = ((Boolean) objRememberedValue3).booleanValue();
                    composerStartRestartGroup.endReplaceGroup();
                    updateTextButtonVisibility updatetextbuttonvisibility18 = (updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue();
                    composerStartRestartGroup.startReplaceGroup(642673386);
                    zChanged2 = composerStartRestartGroup.changed(updatetextbuttonvisibility18);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChanged2) {
                        list2 = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (!(list2 instanceof Collection)) {
                            it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z2 = false;
                                    break;
                                } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                    z2 = true;
                                    break;
                                }
                            }
                        } else {
                            it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z2 = false;
                                    break;
                                } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        objRememberedValue4 = Boolean.valueOf(z2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    } else {
                        list2 = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (!(list2 instanceof Collection)) {
                            it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z2 = false;
                                    break;
                                } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                    z2 = true;
                                    break;
                                }
                            }
                        } else {
                            it2 = list2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z2 = false;
                                    break;
                                } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                        objRememberedValue4 = Boolean.valueOf(z2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    boolean zBooleanValue18 = ((Boolean) objRememberedValue4).booleanValue();
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(642676707);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        r2 = 0;
                        objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    } else {
                        r2 = 0;
                    }
                    mutableState3 = (MutableState) objRememberedValue5;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(642678716);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r2, r2, 2, r2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    mutableState4 = (MutableState) objRememberedValue6;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(642681339);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE, r2, 2, r2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    mutableState5 = (MutableState) objRememberedValue7;
                    composerStartRestartGroup.endReplaceGroup();
                    setArrowHeadLength setarrowheadlength9 = (setArrowHeadLength) mutableState5.getValue();
                    composerStartRestartGroup.startReplaceGroup(642684425);
                    objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new Function0() { // from class: getGroupId
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                mutableState5.setValue(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    getArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setarrowheadlength9, (Function0) objRememberedValue8, composerStartRestartGroup, 48);
                    Unit unit9 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(642686654);
                    zChangedInstance = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1(activityResultContractsPickVisualMediaMediaCapabilities, mutableState, r2);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue);
                    } else {
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1(activityResultContractsPickVisualMediaMediaCapabilities, mutableState, r2);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit9, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue, composerStartRestartGroup, 6);
                    VirtualCameraAdapter1 virtualCameraAdapter17 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle2.getValue();
                    composerStartRestartGroup.startReplaceGroup(642693267);
                    zChanged3 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle2);
                    zChanged4 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(context);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(getratiobypercentage);
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(zChanged3 | zChanged4 | zChangedInstance2) && !zChangedInstance3) {
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, mutableState5, context, getratiobypercentage, stateCollectAsStateWithLifecycle2, null);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue);
                    } else {
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, mutableState5, context, getratiobypercentage, stateCollectAsStateWithLifecycle2, null);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(virtualCameraAdapter17, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue, composerStartRestartGroup, 0);
                    VirtualCameraAdapter1 virtualCameraAdapter18 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle.getValue();
                    composerStartRestartGroup.startReplaceGroup(642744629);
                    zChanged5 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle);
                    zChanged6 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                    zChangedInstance4 = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                    zChanged7 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle3);
                    zChangedInstance5 = composerStartRestartGroup.changedInstance(getratiobypercentage);
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!(zChanged5 | zChanged6 | zChangedInstance4 | zChanged7) && !zChangedInstance5) {
                        r15 = 0;
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, stateCollectAsStateWithLifecycle, mutableState2, stateCollectAsStateWithLifecycle3, null);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue);
                    } else {
                        r15 = 0;
                        scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, stateCollectAsStateWithLifecycle, mutableState2, stateCollectAsStateWithLifecycle3, null);
                        composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(virtualCameraAdapter18, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue, composerStartRestartGroup, (int) r15);
                    composerStartRestartGroup.startReplaceGroup(642771452);
                    if (((Boolean) mutableState3.getValue()).booleanValue()) {
                        composerStartRestartGroup.startReplaceGroup(642774748);
                        objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue10 = new Function0() { // from class: getAlphabeticShortcut
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    mutableState3.setValue(Boolean.FALSE);
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault2((Function0) objRememberedValue10, (ScholarshipDataEligible) mutableState4.getValue(), composerStartRestartGroup, 6, r15);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    i9 = i8 & 896;
                    getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Konfirmasi Beasiswa", ComposableLambdaKt.rememberComposableLambda(-36016005, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(mutableState2, mutableState, zBooleanValue18, zBooleanValue17, function7, function8, stateCollectAsStateWithLifecycle4, mutableState4, mutableState3), composerStartRestartGroup, 54), function6, null, composerStartRestartGroup, i9 | 54, 8);
                    composerStartRestartGroup.startReplaceGroup(642962622);
                    if (i9 == 256) {
                        r7 = 1;
                    } else {
                        r7 = r15;
                    }
                    objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (r7 == 0) {
                        function9 = function6;
                        objRememberedValue9 = new Function0() { // from class: WindowCallbackWrapperApi26Impl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function9.invoke();
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    } else {
                        function9 = function6;
                        objRememberedValue9 = new Function0() { // from class: WindowCallbackWrapperApi26Impl
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function9.invoke();
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BackHandlerKt.BackHandler(r15, (Function0) objRememberedValue9, composerStartRestartGroup, r15, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function3 = function9;
                    function10 = function7;
                    function11 = function8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: onSearchRequested
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities2 = activityResultContractsPickVisualMediaMediaCapabilities;
                            getRatioByPercentage getratiobypercentage2 = getratiobypercentage;
                            Function0 function12 = function3;
                            Function0 function13 = function10;
                            Function0 function14 = function11;
                            int i11 = i;
                            onWindowFocusChanged.b(activityResultContractsPickVisualMediaMediaCapabilities2, getratiobypercentage2, function12, function13, function14, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= 24576;
            function5 = function2;
            i8 = i3;
            if ((i8 & 9363) == 9362) {
                if (i10 != 0) {
                    composerStartRestartGroup.startReplaceGroup(642647811);
                    objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue13 = new Function0() { // from class: getActionProvider
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function6 = (Function0) objRememberedValue13;
                } else {
                    function6 = function3;
                }
                if (i4 != 0) {
                    composerStartRestartGroup.startReplaceGroup(642648995);
                    objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue12 = new Function0() { // from class: getActionView
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function7 = (Function0) objRememberedValue12;
                } else {
                    function7 = function4;
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceGroup(642650179);
                    objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue11 = new Function0() { // from class: getAlphabeticModifiers
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function8 = (Function0) objRememberedValue11;
                } else {
                    function8 = function5;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1462147081, i8, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipConfirmationScreen (ScholarshipConfirmationScreen.kt:70)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                stateListDrawableCompatTuitionPaymentFragmentbindingInflater1 = getStateDrawable.TuitionPaymentFragmentbindingInflater1(composerStartRestartGroup);
                composerStartRestartGroup.startReplaceGroup(642653880);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(activityResultContractsPickVisualMediaMediaCapabilities.asBinder, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                stateCollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.getInterfaceDescriptor, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                stateCollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.INotificationSideChannelStub, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceGroup(642665579);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                mutableState2 = (MutableState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                stateCollectAsStateWithLifecycle4 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.d, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                updateTextButtonVisibility updatetextbuttonvisibility19 = (updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue();
                composerStartRestartGroup.startReplaceGroup(642670282);
                zChanged = composerStartRestartGroup.changed(updatetextbuttonvisibility19);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    list = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (!(list instanceof Collection)) {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                z = false;
                                break;
                            }
                        }
                    } else {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                z = false;
                                break;
                            }
                        }
                    }
                    objRememberedValue3 = Boolean.valueOf(z);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    list = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (!(list instanceof Collection)) {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                z = false;
                                break;
                            }
                        }
                    } else {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                z = false;
                                break;
                            }
                        }
                    }
                    objRememberedValue3 = Boolean.valueOf(z);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                boolean zBooleanValue19 = ((Boolean) objRememberedValue3).booleanValue();
                composerStartRestartGroup.endReplaceGroup();
                updateTextButtonVisibility updatetextbuttonvisibility110 = (updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue();
                composerStartRestartGroup.startReplaceGroup(642673386);
                zChanged2 = composerStartRestartGroup.changed(updatetextbuttonvisibility110);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    list2 = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (!(list2 instanceof Collection)) {
                        it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = false;
                                break;
                            } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                z2 = true;
                                break;
                            }
                        }
                    } else {
                        it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = false;
                                break;
                            } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    objRememberedValue4 = Boolean.valueOf(z2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    list2 = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (!(list2 instanceof Collection)) {
                        it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = false;
                                break;
                            } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                z2 = true;
                                break;
                            }
                        }
                    } else {
                        it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = false;
                                break;
                            } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    objRememberedValue4 = Boolean.valueOf(z2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                boolean zBooleanValue110 = ((Boolean) objRememberedValue4).booleanValue();
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(642676707);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    r2 = 0;
                    objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    r2 = 0;
                }
                mutableState3 = (MutableState) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(642678716);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r2, r2, 2, r2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                mutableState4 = (MutableState) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(642681339);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE, r2, 2, r2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                mutableState5 = (MutableState) objRememberedValue7;
                composerStartRestartGroup.endReplaceGroup();
                setArrowHeadLength setarrowheadlength10 = (setArrowHeadLength) mutableState5.getValue();
                composerStartRestartGroup.startReplaceGroup(642684425);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue8 = new Function0() { // from class: getGroupId
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            mutableState5.setValue(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                getArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setarrowheadlength10, (Function0) objRememberedValue8, composerStartRestartGroup, 48);
                Unit unit10 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(642686654);
                zChangedInstance = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1(activityResultContractsPickVisualMediaMediaCapabilities, mutableState, r2);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue);
                } else {
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1(activityResultContractsPickVisualMediaMediaCapabilities, mutableState, r2);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit10, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue, composerStartRestartGroup, 6);
                VirtualCameraAdapter1 virtualCameraAdapter19 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle2.getValue();
                composerStartRestartGroup.startReplaceGroup(642693267);
                zChanged3 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle2);
                zChanged4 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(context);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(getratiobypercentage);
                scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(zChanged3 | zChanged4 | zChangedInstance2) && !zChangedInstance3) {
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, mutableState5, context, getratiobypercentage, stateCollectAsStateWithLifecycle2, null);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue);
                } else {
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, mutableState5, context, getratiobypercentage, stateCollectAsStateWithLifecycle2, null);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(virtualCameraAdapter19, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue, composerStartRestartGroup, 0);
                VirtualCameraAdapter1 virtualCameraAdapter110 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle.getValue();
                composerStartRestartGroup.startReplaceGroup(642744629);
                zChanged5 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle);
                zChanged6 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                zChangedInstance4 = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                zChanged7 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle3);
                zChangedInstance5 = composerStartRestartGroup.changedInstance(getratiobypercentage);
                scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(zChanged5 | zChanged6 | zChangedInstance4 | zChanged7) && !zChangedInstance5) {
                    r15 = 0;
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, stateCollectAsStateWithLifecycle, mutableState2, stateCollectAsStateWithLifecycle3, null);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue);
                } else {
                    r15 = 0;
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, stateCollectAsStateWithLifecycle, mutableState2, stateCollectAsStateWithLifecycle3, null);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(virtualCameraAdapter110, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue, composerStartRestartGroup, (int) r15);
                composerStartRestartGroup.startReplaceGroup(642771452);
                if (((Boolean) mutableState3.getValue()).booleanValue()) {
                    composerStartRestartGroup.startReplaceGroup(642774748);
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue10 = new Function0() { // from class: getAlphabeticShortcut
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                mutableState3.setValue(Boolean.FALSE);
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault2((Function0) objRememberedValue10, (ScholarshipDataEligible) mutableState4.getValue(), composerStartRestartGroup, 6, r15);
                }
                composerStartRestartGroup.endReplaceGroup();
                i9 = i8 & 896;
                getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Konfirmasi Beasiswa", ComposableLambdaKt.rememberComposableLambda(-36016005, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(mutableState2, mutableState, zBooleanValue110, zBooleanValue19, function7, function8, stateCollectAsStateWithLifecycle4, mutableState4, mutableState3), composerStartRestartGroup, 54), function6, null, composerStartRestartGroup, i9 | 54, 8);
                composerStartRestartGroup.startReplaceGroup(642962622);
                if (i9 == 256) {
                    r7 = 1;
                } else {
                    r7 = r15;
                }
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (r7 == 0) {
                    function9 = function6;
                    objRememberedValue9 = new Function0() { // from class: WindowCallbackWrapperApi26Impl
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function9.invoke();
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                } else {
                    function9 = function6;
                    objRememberedValue9 = new Function0() { // from class: WindowCallbackWrapperApi26Impl
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function9.invoke();
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                composerStartRestartGroup.endReplaceGroup();
                BackHandlerKt.BackHandler(r15, (Function0) objRememberedValue9, composerStartRestartGroup, r15, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function9;
                function10 = function7;
                function11 = function8;
            } else {
                if (i10 != 0) {
                    composerStartRestartGroup.startReplaceGroup(642647811);
                    objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue13 = new Function0() { // from class: getActionProvider
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function6 = (Function0) objRememberedValue13;
                } else {
                    function6 = function3;
                }
                if (i4 != 0) {
                    composerStartRestartGroup.startReplaceGroup(642648995);
                    objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue12 = new Function0() { // from class: getActionView
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function7 = (Function0) objRememberedValue12;
                } else {
                    function7 = function4;
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceGroup(642650179);
                    objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue11 = new Function0() { // from class: getAlphabeticModifiers
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function8 = (Function0) objRememberedValue11;
                } else {
                    function8 = function5;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1462147081, i8, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipConfirmationScreen (ScholarshipConfirmationScreen.kt:70)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                stateListDrawableCompatTuitionPaymentFragmentbindingInflater1 = getStateDrawable.TuitionPaymentFragmentbindingInflater1(composerStartRestartGroup);
                composerStartRestartGroup.startReplaceGroup(642653880);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(activityResultContractsPickVisualMediaMediaCapabilities.asBinder, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                stateCollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.getInterfaceDescriptor, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                stateCollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.INotificationSideChannelStub, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceGroup(642665579);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                mutableState2 = (MutableState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                stateCollectAsStateWithLifecycle4 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.d, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                updateTextButtonVisibility updatetextbuttonvisibility111 = (updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue();
                composerStartRestartGroup.startReplaceGroup(642670282);
                zChanged = composerStartRestartGroup.changed(updatetextbuttonvisibility111);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    list = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (!(list instanceof Collection)) {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                z = false;
                                break;
                            }
                        }
                    } else {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                z = false;
                                break;
                            }
                        }
                    }
                    objRememberedValue3 = Boolean.valueOf(z);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    list = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (!(list instanceof Collection)) {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                z = false;
                                break;
                            }
                        }
                    } else {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                z = false;
                                break;
                            }
                        }
                    }
                    objRememberedValue3 = Boolean.valueOf(z);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                boolean zBooleanValue111 = ((Boolean) objRememberedValue3).booleanValue();
                composerStartRestartGroup.endReplaceGroup();
                updateTextButtonVisibility updatetextbuttonvisibility112 = (updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue();
                composerStartRestartGroup.startReplaceGroup(642673386);
                zChanged2 = composerStartRestartGroup.changed(updatetextbuttonvisibility112);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    list2 = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (!(list2 instanceof Collection)) {
                        it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = false;
                                break;
                            } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                z2 = true;
                                break;
                            }
                        }
                    } else {
                        it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = false;
                                break;
                            } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    objRememberedValue4 = Boolean.valueOf(z2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    list2 = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (!(list2 instanceof Collection)) {
                        it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = false;
                                break;
                            } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                z2 = true;
                                break;
                            }
                        }
                    } else {
                        it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = false;
                                break;
                            } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    objRememberedValue4 = Boolean.valueOf(z2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                boolean zBooleanValue112 = ((Boolean) objRememberedValue4).booleanValue();
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(642676707);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    r2 = 0;
                    objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    r2 = 0;
                }
                mutableState3 = (MutableState) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(642678716);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r2, r2, 2, r2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                mutableState4 = (MutableState) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(642681339);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE, r2, 2, r2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                mutableState5 = (MutableState) objRememberedValue7;
                composerStartRestartGroup.endReplaceGroup();
                setArrowHeadLength setarrowheadlength11 = (setArrowHeadLength) mutableState5.getValue();
                composerStartRestartGroup.startReplaceGroup(642684425);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue8 = new Function0() { // from class: getGroupId
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            mutableState5.setValue(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                getArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setarrowheadlength11, (Function0) objRememberedValue8, composerStartRestartGroup, 48);
                Unit unit11 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(642686654);
                zChangedInstance = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1(activityResultContractsPickVisualMediaMediaCapabilities, mutableState, r2);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue);
                } else {
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1(activityResultContractsPickVisualMediaMediaCapabilities, mutableState, r2);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit11, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue, composerStartRestartGroup, 6);
                VirtualCameraAdapter1 virtualCameraAdapter111 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle2.getValue();
                composerStartRestartGroup.startReplaceGroup(642693267);
                zChanged3 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle2);
                zChanged4 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(context);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(getratiobypercentage);
                scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(zChanged3 | zChanged4 | zChangedInstance2) && !zChangedInstance3) {
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, mutableState5, context, getratiobypercentage, stateCollectAsStateWithLifecycle2, null);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue);
                } else {
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, mutableState5, context, getratiobypercentage, stateCollectAsStateWithLifecycle2, null);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(virtualCameraAdapter111, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue, composerStartRestartGroup, 0);
                VirtualCameraAdapter1 virtualCameraAdapter112 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle.getValue();
                composerStartRestartGroup.startReplaceGroup(642744629);
                zChanged5 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle);
                zChanged6 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                zChangedInstance4 = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                zChanged7 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle3);
                zChangedInstance5 = composerStartRestartGroup.changedInstance(getratiobypercentage);
                scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(zChanged5 | zChanged6 | zChangedInstance4 | zChanged7) && !zChangedInstance5) {
                    r15 = 0;
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, stateCollectAsStateWithLifecycle, mutableState2, stateCollectAsStateWithLifecycle3, null);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue);
                } else {
                    r15 = 0;
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, stateCollectAsStateWithLifecycle, mutableState2, stateCollectAsStateWithLifecycle3, null);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(virtualCameraAdapter112, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue, composerStartRestartGroup, (int) r15);
                composerStartRestartGroup.startReplaceGroup(642771452);
                if (((Boolean) mutableState3.getValue()).booleanValue()) {
                    composerStartRestartGroup.startReplaceGroup(642774748);
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue10 = new Function0() { // from class: getAlphabeticShortcut
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                mutableState3.setValue(Boolean.FALSE);
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault2((Function0) objRememberedValue10, (ScholarshipDataEligible) mutableState4.getValue(), composerStartRestartGroup, 6, r15);
                }
                composerStartRestartGroup.endReplaceGroup();
                i9 = i8 & 896;
                getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Konfirmasi Beasiswa", ComposableLambdaKt.rememberComposableLambda(-36016005, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(mutableState2, mutableState, zBooleanValue112, zBooleanValue111, function7, function8, stateCollectAsStateWithLifecycle4, mutableState4, mutableState3), composerStartRestartGroup, 54), function6, null, composerStartRestartGroup, i9 | 54, 8);
                composerStartRestartGroup.startReplaceGroup(642962622);
                if (i9 == 256) {
                    r7 = 1;
                } else {
                    r7 = r15;
                }
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (r7 == 0) {
                    function9 = function6;
                    objRememberedValue9 = new Function0() { // from class: WindowCallbackWrapperApi26Impl
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function9.invoke();
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                } else {
                    function9 = function6;
                    objRememberedValue9 = new Function0() { // from class: WindowCallbackWrapperApi26Impl
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function9.invoke();
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                composerStartRestartGroup.endReplaceGroup();
                BackHandlerKt.BackHandler(r15, (Function0) objRememberedValue9, composerStartRestartGroup, r15, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function9;
                function10 = function7;
                function11 = function8;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: onSearchRequested
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities2 = activityResultContractsPickVisualMediaMediaCapabilities;
                        getRatioByPercentage getratiobypercentage2 = getratiobypercentage;
                        Function0 function12 = function3;
                        Function0 function13 = function10;
                        Function0 function14 = function11;
                        int i11 = i;
                        onWindowFocusChanged.b(activityResultContractsPickVisualMediaMediaCapabilities2, getratiobypercentage2, function12, function13, function14, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= 3072;
        function4 = function1;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                function5 = function2;
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i3;
            if ((i8 & 9363) == 9362) {
                if (i10 != 0) {
                    composerStartRestartGroup.startReplaceGroup(642647811);
                    objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue13 = new Function0() { // from class: getActionProvider
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function6 = (Function0) objRememberedValue13;
                } else {
                    function6 = function3;
                }
                if (i4 != 0) {
                    composerStartRestartGroup.startReplaceGroup(642648995);
                    objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue12 = new Function0() { // from class: getActionView
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function7 = (Function0) objRememberedValue12;
                } else {
                    function7 = function4;
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceGroup(642650179);
                    objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue11 = new Function0() { // from class: getAlphabeticModifiers
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function8 = (Function0) objRememberedValue11;
                } else {
                    function8 = function5;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1462147081, i8, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipConfirmationScreen (ScholarshipConfirmationScreen.kt:70)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                stateListDrawableCompatTuitionPaymentFragmentbindingInflater1 = getStateDrawable.TuitionPaymentFragmentbindingInflater1(composerStartRestartGroup);
                composerStartRestartGroup.startReplaceGroup(642653880);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(activityResultContractsPickVisualMediaMediaCapabilities.asBinder, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                stateCollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.getInterfaceDescriptor, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                stateCollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.INotificationSideChannelStub, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceGroup(642665579);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                mutableState2 = (MutableState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                stateCollectAsStateWithLifecycle4 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.d, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                updateTextButtonVisibility updatetextbuttonvisibility113 = (updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue();
                composerStartRestartGroup.startReplaceGroup(642670282);
                zChanged = composerStartRestartGroup.changed(updatetextbuttonvisibility113);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    list = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (!(list instanceof Collection)) {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                z = false;
                                break;
                            }
                        }
                    } else {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                z = false;
                                break;
                            }
                        }
                    }
                    objRememberedValue3 = Boolean.valueOf(z);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    list = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (!(list instanceof Collection)) {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                z = false;
                                break;
                            }
                        }
                    } else {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                z = false;
                                break;
                            }
                        }
                    }
                    objRememberedValue3 = Boolean.valueOf(z);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                boolean zBooleanValue113 = ((Boolean) objRememberedValue3).booleanValue();
                composerStartRestartGroup.endReplaceGroup();
                updateTextButtonVisibility updatetextbuttonvisibility114 = (updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue();
                composerStartRestartGroup.startReplaceGroup(642673386);
                zChanged2 = composerStartRestartGroup.changed(updatetextbuttonvisibility114);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    list2 = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (!(list2 instanceof Collection)) {
                        it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = false;
                                break;
                            } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                z2 = true;
                                break;
                            }
                        }
                    } else {
                        it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = false;
                                break;
                            } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    objRememberedValue4 = Boolean.valueOf(z2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    list2 = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (!(list2 instanceof Collection)) {
                        it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = false;
                                break;
                            } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                z2 = true;
                                break;
                            }
                        }
                    } else {
                        it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = false;
                                break;
                            } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    objRememberedValue4 = Boolean.valueOf(z2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                boolean zBooleanValue114 = ((Boolean) objRememberedValue4).booleanValue();
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(642676707);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    r2 = 0;
                    objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    r2 = 0;
                }
                mutableState3 = (MutableState) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(642678716);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r2, r2, 2, r2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                mutableState4 = (MutableState) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(642681339);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE, r2, 2, r2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                mutableState5 = (MutableState) objRememberedValue7;
                composerStartRestartGroup.endReplaceGroup();
                setArrowHeadLength setarrowheadlength12 = (setArrowHeadLength) mutableState5.getValue();
                composerStartRestartGroup.startReplaceGroup(642684425);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue8 = new Function0() { // from class: getGroupId
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            mutableState5.setValue(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                getArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setarrowheadlength12, (Function0) objRememberedValue8, composerStartRestartGroup, 48);
                Unit unit12 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(642686654);
                zChangedInstance = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1(activityResultContractsPickVisualMediaMediaCapabilities, mutableState, r2);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue);
                } else {
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1(activityResultContractsPickVisualMediaMediaCapabilities, mutableState, r2);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit12, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue, composerStartRestartGroup, 6);
                VirtualCameraAdapter1 virtualCameraAdapter113 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle2.getValue();
                composerStartRestartGroup.startReplaceGroup(642693267);
                zChanged3 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle2);
                zChanged4 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(context);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(getratiobypercentage);
                scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(zChanged3 | zChanged4 | zChangedInstance2) && !zChangedInstance3) {
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, mutableState5, context, getratiobypercentage, stateCollectAsStateWithLifecycle2, null);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue);
                } else {
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, mutableState5, context, getratiobypercentage, stateCollectAsStateWithLifecycle2, null);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(virtualCameraAdapter113, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue, composerStartRestartGroup, 0);
                VirtualCameraAdapter1 virtualCameraAdapter114 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle.getValue();
                composerStartRestartGroup.startReplaceGroup(642744629);
                zChanged5 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle);
                zChanged6 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                zChangedInstance4 = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                zChanged7 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle3);
                zChangedInstance5 = composerStartRestartGroup.changedInstance(getratiobypercentage);
                scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(zChanged5 | zChanged6 | zChangedInstance4 | zChanged7) && !zChangedInstance5) {
                    r15 = 0;
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, stateCollectAsStateWithLifecycle, mutableState2, stateCollectAsStateWithLifecycle3, null);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue);
                } else {
                    r15 = 0;
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, stateCollectAsStateWithLifecycle, mutableState2, stateCollectAsStateWithLifecycle3, null);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(virtualCameraAdapter114, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue, composerStartRestartGroup, (int) r15);
                composerStartRestartGroup.startReplaceGroup(642771452);
                if (((Boolean) mutableState3.getValue()).booleanValue()) {
                    composerStartRestartGroup.startReplaceGroup(642774748);
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue10 = new Function0() { // from class: getAlphabeticShortcut
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                mutableState3.setValue(Boolean.FALSE);
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault2((Function0) objRememberedValue10, (ScholarshipDataEligible) mutableState4.getValue(), composerStartRestartGroup, 6, r15);
                }
                composerStartRestartGroup.endReplaceGroup();
                i9 = i8 & 896;
                getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Konfirmasi Beasiswa", ComposableLambdaKt.rememberComposableLambda(-36016005, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(mutableState2, mutableState, zBooleanValue114, zBooleanValue113, function7, function8, stateCollectAsStateWithLifecycle4, mutableState4, mutableState3), composerStartRestartGroup, 54), function6, null, composerStartRestartGroup, i9 | 54, 8);
                composerStartRestartGroup.startReplaceGroup(642962622);
                if (i9 == 256) {
                    r7 = 1;
                } else {
                    r7 = r15;
                }
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (r7 == 0) {
                    function9 = function6;
                    objRememberedValue9 = new Function0() { // from class: WindowCallbackWrapperApi26Impl
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function9.invoke();
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                } else {
                    function9 = function6;
                    objRememberedValue9 = new Function0() { // from class: WindowCallbackWrapperApi26Impl
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function9.invoke();
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                composerStartRestartGroup.endReplaceGroup();
                BackHandlerKt.BackHandler(r15, (Function0) objRememberedValue9, composerStartRestartGroup, r15, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function9;
                function10 = function7;
                function11 = function8;
            } else {
                if (i10 != 0) {
                    composerStartRestartGroup.startReplaceGroup(642647811);
                    objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue13 = new Function0() { // from class: getActionProvider
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function6 = (Function0) objRememberedValue13;
                } else {
                    function6 = function3;
                }
                if (i4 != 0) {
                    composerStartRestartGroup.startReplaceGroup(642648995);
                    objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue12 = new Function0() { // from class: getActionView
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function7 = (Function0) objRememberedValue12;
                } else {
                    function7 = function4;
                }
                if (i6 != 0) {
                    composerStartRestartGroup.startReplaceGroup(642650179);
                    objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue11 = new Function0() { // from class: getAlphabeticModifiers
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function8 = (Function0) objRememberedValue11;
                } else {
                    function8 = function5;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1462147081, i8, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipConfirmationScreen (ScholarshipConfirmationScreen.kt:70)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                stateListDrawableCompatTuitionPaymentFragmentbindingInflater1 = getStateDrawable.TuitionPaymentFragmentbindingInflater1(composerStartRestartGroup);
                composerStartRestartGroup.startReplaceGroup(642653880);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                mutableState = (MutableState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(activityResultContractsPickVisualMediaMediaCapabilities.asBinder, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                stateCollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.getInterfaceDescriptor, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                stateCollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.INotificationSideChannelStub, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceGroup(642665579);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                mutableState2 = (MutableState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                stateCollectAsStateWithLifecycle4 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.d, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                updateTextButtonVisibility updatetextbuttonvisibility115 = (updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue();
                composerStartRestartGroup.startReplaceGroup(642670282);
                zChanged = composerStartRestartGroup.changed(updatetextbuttonvisibility115);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    list = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (!(list instanceof Collection)) {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                z = false;
                                break;
                            }
                        }
                    } else {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                z = false;
                                break;
                            }
                        }
                    }
                    objRememberedValue3 = Boolean.valueOf(z);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    list = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (!(list instanceof Collection)) {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                z = false;
                                break;
                            }
                        }
                    } else {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z = true;
                                break;
                            } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                                z = false;
                                break;
                            }
                        }
                    }
                    objRememberedValue3 = Boolean.valueOf(z);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                boolean zBooleanValue115 = ((Boolean) objRememberedValue3).booleanValue();
                composerStartRestartGroup.endReplaceGroup();
                updateTextButtonVisibility updatetextbuttonvisibility116 = (updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue();
                composerStartRestartGroup.startReplaceGroup(642673386);
                zChanged2 = composerStartRestartGroup.changed(updatetextbuttonvisibility116);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged2) {
                    list2 = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (!(list2 instanceof Collection)) {
                        it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = false;
                                break;
                            } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                z2 = true;
                                break;
                            }
                        }
                    } else {
                        it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = false;
                                break;
                            } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    objRememberedValue4 = Boolean.valueOf(z2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                } else {
                    list2 = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    if (!(list2 instanceof Collection)) {
                        it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = false;
                                break;
                            } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                z2 = true;
                                break;
                            }
                        }
                    } else {
                        it2 = list2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z2 = false;
                                break;
                            } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    objRememberedValue4 = Boolean.valueOf(z2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                boolean zBooleanValue116 = ((Boolean) objRememberedValue4).booleanValue();
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(642676707);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    r2 = 0;
                    objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                } else {
                    r2 = 0;
                }
                mutableState3 = (MutableState) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(642678716);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r2, r2, 2, r2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                mutableState4 = (MutableState) objRememberedValue6;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(642681339);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE, r2, 2, r2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                mutableState5 = (MutableState) objRememberedValue7;
                composerStartRestartGroup.endReplaceGroup();
                setArrowHeadLength setarrowheadlength13 = (setArrowHeadLength) mutableState5.getValue();
                composerStartRestartGroup.startReplaceGroup(642684425);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue8 = new Function0() { // from class: getGroupId
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            mutableState5.setValue(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                }
                composerStartRestartGroup.endReplaceGroup();
                getArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setarrowheadlength13, (Function0) objRememberedValue8, composerStartRestartGroup, 48);
                Unit unit13 = Unit.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(642686654);
                zChangedInstance = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1(activityResultContractsPickVisualMediaMediaCapabilities, mutableState, r2);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue);
                } else {
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1(activityResultContractsPickVisualMediaMediaCapabilities, mutableState, r2);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(unit13, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue, composerStartRestartGroup, 6);
                VirtualCameraAdapter1 virtualCameraAdapter115 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle2.getValue();
                composerStartRestartGroup.startReplaceGroup(642693267);
                zChanged3 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle2);
                zChanged4 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(context);
                zChangedInstance3 = composerStartRestartGroup.changedInstance(getratiobypercentage);
                scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(zChanged3 | zChanged4 | zChangedInstance2) && !zChangedInstance3) {
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, mutableState5, context, getratiobypercentage, stateCollectAsStateWithLifecycle2, null);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue);
                } else {
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, mutableState5, context, getratiobypercentage, stateCollectAsStateWithLifecycle2, null);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(virtualCameraAdapter115, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue, composerStartRestartGroup, 0);
                VirtualCameraAdapter1 virtualCameraAdapter116 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle.getValue();
                composerStartRestartGroup.startReplaceGroup(642744629);
                zChanged5 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle);
                zChanged6 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
                zChangedInstance4 = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
                zChanged7 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle3);
                zChangedInstance5 = composerStartRestartGroup.changedInstance(getratiobypercentage);
                scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = composerStartRestartGroup.rememberedValue();
                if (!(zChanged5 | zChanged6 | zChangedInstance4 | zChanged7) && !zChangedInstance5) {
                    r15 = 0;
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, stateCollectAsStateWithLifecycle, mutableState2, stateCollectAsStateWithLifecycle3, null);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue);
                } else {
                    r15 = 0;
                    scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, stateCollectAsStateWithLifecycle, mutableState2, stateCollectAsStateWithLifecycle3, null);
                    composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(virtualCameraAdapter116, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue, composerStartRestartGroup, (int) r15);
                composerStartRestartGroup.startReplaceGroup(642771452);
                if (((Boolean) mutableState3.getValue()).booleanValue()) {
                    composerStartRestartGroup.startReplaceGroup(642774748);
                    objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue10 = new Function0() { // from class: getAlphabeticShortcut
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                mutableState3.setValue(Boolean.FALSE);
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault2((Function0) objRememberedValue10, (ScholarshipDataEligible) mutableState4.getValue(), composerStartRestartGroup, 6, r15);
                }
                composerStartRestartGroup.endReplaceGroup();
                i9 = i8 & 896;
                getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Konfirmasi Beasiswa", ComposableLambdaKt.rememberComposableLambda(-36016005, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(mutableState2, mutableState, zBooleanValue116, zBooleanValue115, function7, function8, stateCollectAsStateWithLifecycle4, mutableState4, mutableState3), composerStartRestartGroup, 54), function6, null, composerStartRestartGroup, i9 | 54, 8);
                composerStartRestartGroup.startReplaceGroup(642962622);
                if (i9 == 256) {
                    r7 = 1;
                } else {
                    r7 = r15;
                }
                objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                if (r7 == 0) {
                    function9 = function6;
                    objRememberedValue9 = new Function0() { // from class: WindowCallbackWrapperApi26Impl
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function9.invoke();
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                } else {
                    function9 = function6;
                    objRememberedValue9 = new Function0() { // from class: WindowCallbackWrapperApi26Impl
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function9.invoke();
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                }
                composerStartRestartGroup.endReplaceGroup();
                BackHandlerKt.BackHandler(r15, (Function0) objRememberedValue9, composerStartRestartGroup, r15, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function3 = function9;
                function10 = function7;
                function11 = function8;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: onSearchRequested
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities2 = activityResultContractsPickVisualMediaMediaCapabilities;
                        getRatioByPercentage getratiobypercentage2 = getratiobypercentage;
                        Function0 function12 = function3;
                        Function0 function13 = function10;
                        Function0 function14 = function11;
                        int i11 = i;
                        onWindowFocusChanged.b(activityResultContractsPickVisualMediaMediaCapabilities2, getratiobypercentage2, function12, function13, function14, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= 24576;
        function5 = function2;
        i8 = i3;
        if ((i8 & 9363) == 9362) {
            if (i10 != 0) {
                composerStartRestartGroup.startReplaceGroup(642647811);
                objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue13 = new Function0() { // from class: getActionProvider
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                }
                composerStartRestartGroup.endReplaceGroup();
                function6 = (Function0) objRememberedValue13;
            } else {
                function6 = function3;
            }
            if (i4 != 0) {
                composerStartRestartGroup.startReplaceGroup(642648995);
                objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue12 = new Function0() { // from class: getActionView
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                }
                composerStartRestartGroup.endReplaceGroup();
                function7 = (Function0) objRememberedValue12;
            } else {
                function7 = function4;
            }
            if (i6 != 0) {
                composerStartRestartGroup.startReplaceGroup(642650179);
                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue11 = new Function0() { // from class: getAlphabeticModifiers
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                composerStartRestartGroup.endReplaceGroup();
                function8 = (Function0) objRememberedValue11;
            } else {
                function8 = function5;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1462147081, i8, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipConfirmationScreen (ScholarshipConfirmationScreen.kt:70)");
            }
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            stateListDrawableCompatTuitionPaymentFragmentbindingInflater1 = getStateDrawable.TuitionPaymentFragmentbindingInflater1(composerStartRestartGroup);
            composerStartRestartGroup.startReplaceGroup(642653880);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(activityResultContractsPickVisualMediaMediaCapabilities.asBinder, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            stateCollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.getInterfaceDescriptor, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            stateCollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.INotificationSideChannelStub, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            composerStartRestartGroup.startReplaceGroup(642665579);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            mutableState2 = (MutableState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            stateCollectAsStateWithLifecycle4 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.d, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            updateTextButtonVisibility updatetextbuttonvisibility117 = (updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue();
            composerStartRestartGroup.startReplaceGroup(642670282);
            zChanged = composerStartRestartGroup.changed(updatetextbuttonvisibility117);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                list = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (!(list instanceof Collection)) {
                    it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                            z = false;
                            break;
                        }
                    }
                } else {
                    it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                            z = false;
                            break;
                        }
                    }
                }
                objRememberedValue3 = Boolean.valueOf(z);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                list = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (!(list instanceof Collection)) {
                    it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                            z = false;
                            break;
                        }
                    }
                } else {
                    it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                            z = false;
                            break;
                        }
                    }
                }
                objRememberedValue3 = Boolean.valueOf(z);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            boolean zBooleanValue117 = ((Boolean) objRememberedValue3).booleanValue();
            composerStartRestartGroup.endReplaceGroup();
            updateTextButtonVisibility updatetextbuttonvisibility118 = (updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue();
            composerStartRestartGroup.startReplaceGroup(642673386);
            zChanged2 = composerStartRestartGroup.changed(updatetextbuttonvisibility118);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                list2 = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (!(list2 instanceof Collection)) {
                    it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z2 = false;
                            break;
                        } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                            z2 = true;
                            break;
                        }
                    }
                } else {
                    it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z2 = false;
                            break;
                        } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                            z2 = true;
                            break;
                        }
                    }
                }
                objRememberedValue4 = Boolean.valueOf(z2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                list2 = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (!(list2 instanceof Collection)) {
                    it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z2 = false;
                            break;
                        } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                            z2 = true;
                            break;
                        }
                    }
                } else {
                    it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z2 = false;
                            break;
                        } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                            z2 = true;
                            break;
                        }
                    }
                }
                objRememberedValue4 = Boolean.valueOf(z2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            boolean zBooleanValue118 = ((Boolean) objRememberedValue4).booleanValue();
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(642676707);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                r2 = 0;
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                r2 = 0;
            }
            mutableState3 = (MutableState) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(642678716);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r2, r2, 2, r2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            mutableState4 = (MutableState) objRememberedValue6;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(642681339);
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE, r2, 2, r2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            mutableState5 = (MutableState) objRememberedValue7;
            composerStartRestartGroup.endReplaceGroup();
            setArrowHeadLength setarrowheadlength14 = (setArrowHeadLength) mutableState5.getValue();
            composerStartRestartGroup.startReplaceGroup(642684425);
            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue8 = new Function0() { // from class: getGroupId
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        mutableState5.setValue(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            composerStartRestartGroup.endReplaceGroup();
            getArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setarrowheadlength14, (Function0) objRememberedValue8, composerStartRestartGroup, 48);
            Unit unit14 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(642686654);
            zChangedInstance = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
            scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance) {
                scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1(activityResultContractsPickVisualMediaMediaCapabilities, mutableState, r2);
                composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue);
            } else {
                scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1(activityResultContractsPickVisualMediaMediaCapabilities, mutableState, r2);
                composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit14, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue, composerStartRestartGroup, 6);
            VirtualCameraAdapter1 virtualCameraAdapter117 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle2.getValue();
            composerStartRestartGroup.startReplaceGroup(642693267);
            zChanged3 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle2);
            zChanged4 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
            zChangedInstance2 = composerStartRestartGroup.changedInstance(context);
            zChangedInstance3 = composerStartRestartGroup.changedInstance(getratiobypercentage);
            scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (!(zChanged3 | zChanged4 | zChangedInstance2) && !zChangedInstance3) {
                scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, mutableState5, context, getratiobypercentage, stateCollectAsStateWithLifecycle2, null);
                composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue);
            } else {
                scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, mutableState5, context, getratiobypercentage, stateCollectAsStateWithLifecycle2, null);
                composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(virtualCameraAdapter117, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue, composerStartRestartGroup, 0);
            VirtualCameraAdapter1 virtualCameraAdapter118 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle.getValue();
            composerStartRestartGroup.startReplaceGroup(642744629);
            zChanged5 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle);
            zChanged6 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
            zChangedInstance4 = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
            zChanged7 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle3);
            zChangedInstance5 = composerStartRestartGroup.changedInstance(getratiobypercentage);
            scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (!(zChanged5 | zChanged6 | zChangedInstance4 | zChanged7) && !zChangedInstance5) {
                r15 = 0;
                scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, stateCollectAsStateWithLifecycle, mutableState2, stateCollectAsStateWithLifecycle3, null);
                composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue);
            } else {
                r15 = 0;
                scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, stateCollectAsStateWithLifecycle, mutableState2, stateCollectAsStateWithLifecycle3, null);
                composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(virtualCameraAdapter118, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue, composerStartRestartGroup, (int) r15);
            composerStartRestartGroup.startReplaceGroup(642771452);
            if (((Boolean) mutableState3.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(642774748);
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue10 = new Function0() { // from class: getAlphabeticShortcut
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            mutableState3.setValue(Boolean.FALSE);
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                composerStartRestartGroup.endReplaceGroup();
                getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault2((Function0) objRememberedValue10, (ScholarshipDataEligible) mutableState4.getValue(), composerStartRestartGroup, 6, r15);
            }
            composerStartRestartGroup.endReplaceGroup();
            i9 = i8 & 896;
            getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Konfirmasi Beasiswa", ComposableLambdaKt.rememberComposableLambda(-36016005, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(mutableState2, mutableState, zBooleanValue118, zBooleanValue117, function7, function8, stateCollectAsStateWithLifecycle4, mutableState4, mutableState3), composerStartRestartGroup, 54), function6, null, composerStartRestartGroup, i9 | 54, 8);
            composerStartRestartGroup.startReplaceGroup(642962622);
            if (i9 == 256) {
                r7 = 1;
            } else {
                r7 = r15;
            }
            objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (r7 == 0) {
                function9 = function6;
                objRememberedValue9 = new Function0() { // from class: WindowCallbackWrapperApi26Impl
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function9.invoke();
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            } else {
                function9 = function6;
                objRememberedValue9 = new Function0() { // from class: WindowCallbackWrapperApi26Impl
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function9.invoke();
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            composerStartRestartGroup.endReplaceGroup();
            BackHandlerKt.BackHandler(r15, (Function0) objRememberedValue9, composerStartRestartGroup, r15, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function3 = function9;
            function10 = function7;
            function11 = function8;
        } else {
            if (i10 != 0) {
                composerStartRestartGroup.startReplaceGroup(642647811);
                objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue13 = new Function0() { // from class: getActionProvider
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                }
                composerStartRestartGroup.endReplaceGroup();
                function6 = (Function0) objRememberedValue13;
            } else {
                function6 = function3;
            }
            if (i4 != 0) {
                composerStartRestartGroup.startReplaceGroup(642648995);
                objRememberedValue12 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue12 = new Function0() { // from class: getActionView
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue12);
                }
                composerStartRestartGroup.endReplaceGroup();
                function7 = (Function0) objRememberedValue12;
            } else {
                function7 = function4;
            }
            if (i6 != 0) {
                composerStartRestartGroup.startReplaceGroup(642650179);
                objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue11 = new Function0() { // from class: getAlphabeticModifiers
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                }
                composerStartRestartGroup.endReplaceGroup();
                function8 = (Function0) objRememberedValue11;
            } else {
                function8 = function5;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1462147081, i8, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipConfirmationScreen (ScholarshipConfirmationScreen.kt:70)");
            }
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            stateListDrawableCompatTuitionPaymentFragmentbindingInflater1 = getStateDrawable.TuitionPaymentFragmentbindingInflater1(composerStartRestartGroup);
            composerStartRestartGroup.startReplaceGroup(642653880);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            mutableState = (MutableState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            stateCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(activityResultContractsPickVisualMediaMediaCapabilities.asBinder, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            stateCollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.getInterfaceDescriptor, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            stateCollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.INotificationSideChannelStub, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            composerStartRestartGroup.startReplaceGroup(642665579);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            mutableState2 = (MutableState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            stateCollectAsStateWithLifecycle4 = FlowExtKt.collectAsStateWithLifecycle(getratiobypercentage.d, (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            updateTextButtonVisibility updatetextbuttonvisibility119 = (updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue();
            composerStartRestartGroup.startReplaceGroup(642670282);
            zChanged = composerStartRestartGroup.changed(updatetextbuttonvisibility119);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                list = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (!(list instanceof Collection)) {
                    it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                            z = false;
                            break;
                        }
                    }
                } else {
                    it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                            z = false;
                            break;
                        }
                    }
                }
                objRememberedValue3 = Boolean.valueOf(z);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                list = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (!(list instanceof Collection)) {
                    it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                            z = false;
                            break;
                        }
                    }
                } else {
                    it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        } else if (!Intrinsics.areEqual(((ScholarshipDataEligible) it.next()).getStatusKonfirmasi(), "Y")) {
                            z = false;
                            break;
                        }
                    }
                }
                objRememberedValue3 = Boolean.valueOf(z);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            boolean zBooleanValue119 = ((Boolean) objRememberedValue3).booleanValue();
            composerStartRestartGroup.endReplaceGroup();
            updateTextButtonVisibility updatetextbuttonvisibility1110 = (updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue();
            composerStartRestartGroup.startReplaceGroup(642673386);
            zChanged2 = composerStartRestartGroup.changed(updatetextbuttonvisibility1110);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2) {
                list2 = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (!(list2 instanceof Collection)) {
                    it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z2 = false;
                            break;
                        } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                            z2 = true;
                            break;
                        }
                    }
                } else {
                    it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z2 = false;
                            break;
                        } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                            z2 = true;
                            break;
                        }
                    }
                }
                objRememberedValue4 = Boolean.valueOf(z2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            } else {
                list2 = ((updateTextButtonVisibility) stateCollectAsStateWithLifecycle4.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (!(list2 instanceof Collection)) {
                    it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z2 = false;
                            break;
                        } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                            z2 = true;
                            break;
                        }
                    }
                } else {
                    it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z2 = false;
                            break;
                        } else if (Intrinsics.areEqual(((ScholarshipDataEligible) it2.next()).getStatusKonfirmasi(), "Y")) {
                            z2 = true;
                            break;
                        }
                    }
                }
                objRememberedValue4 = Boolean.valueOf(z2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            boolean zBooleanValue1110 = ((Boolean) objRememberedValue4).booleanValue();
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(642676707);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                r2 = 0;
                objRememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                r2 = 0;
            }
            mutableState3 = (MutableState) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(642678716);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(r2, r2, 2, r2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            mutableState4 = (MutableState) objRememberedValue6;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(642681339);
            objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE, r2, 2, r2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            mutableState5 = (MutableState) objRememberedValue7;
            composerStartRestartGroup.endReplaceGroup();
            setArrowHeadLength setarrowheadlength15 = (setArrowHeadLength) mutableState5.getValue();
            composerStartRestartGroup.startReplaceGroup(642684425);
            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue8 = new Function0() { // from class: getGroupId
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        mutableState5.setValue(setArrowHeadLength.TuitionPaymentFragmentspecialinlinedviewModeldefault1.INSTANCE);
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            composerStartRestartGroup.endReplaceGroup();
            getArrowShaftLength.TuitionPaymentFragmentspecialinlinedviewModeldefault3(setarrowheadlength15, (Function0) objRememberedValue8, composerStartRestartGroup, 48);
            Unit unit15 = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(642686654);
            zChangedInstance = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
            scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance) {
                scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1(activityResultContractsPickVisualMediaMediaCapabilities, mutableState, r2);
                composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue);
            } else {
                scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1(activityResultContractsPickVisualMediaMediaCapabilities, mutableState, r2);
                composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit15, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$5$1RememberedValue, composerStartRestartGroup, 6);
            VirtualCameraAdapter1 virtualCameraAdapter119 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle2.getValue();
            composerStartRestartGroup.startReplaceGroup(642693267);
            zChanged3 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle2);
            zChanged4 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
            zChangedInstance2 = composerStartRestartGroup.changedInstance(context);
            zChangedInstance3 = composerStartRestartGroup.changedInstance(getratiobypercentage);
            scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (!(zChanged3 | zChanged4 | zChangedInstance2) && !zChangedInstance3) {
                scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, mutableState5, context, getratiobypercentage, stateCollectAsStateWithLifecycle2, null);
                composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue);
            } else {
                scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, mutableState5, context, getratiobypercentage, stateCollectAsStateWithLifecycle2, null);
                composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(virtualCameraAdapter119, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1RememberedValue, composerStartRestartGroup, 0);
            VirtualCameraAdapter1 virtualCameraAdapter1110 = (VirtualCameraAdapter1) stateCollectAsStateWithLifecycle.getValue();
            composerStartRestartGroup.startReplaceGroup(642744629);
            zChanged5 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle);
            zChanged6 = composerStartRestartGroup.changed(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1);
            zChangedInstance4 = composerStartRestartGroup.changedInstance(activityResultContractsPickVisualMediaMediaCapabilities);
            zChanged7 = composerStartRestartGroup.changed(stateCollectAsStateWithLifecycle3);
            zChangedInstance5 = composerStartRestartGroup.changedInstance(getratiobypercentage);
            scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = composerStartRestartGroup.rememberedValue();
            if (!(zChanged5 | zChanged6 | zChangedInstance4 | zChanged7) && !zChangedInstance5) {
                r15 = 0;
                scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, stateCollectAsStateWithLifecycle, mutableState2, stateCollectAsStateWithLifecycle3, null);
                composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue);
            } else {
                r15 = 0;
                scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue = new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1(stateListDrawableCompatTuitionPaymentFragmentbindingInflater1, activityResultContractsPickVisualMediaMediaCapabilities, getratiobypercentage, stateCollectAsStateWithLifecycle, mutableState2, stateCollectAsStateWithLifecycle3, null);
                composerStartRestartGroup.updateRememberedValue(scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(virtualCameraAdapter1110, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) scholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1RememberedValue, composerStartRestartGroup, (int) r15);
            composerStartRestartGroup.startReplaceGroup(642771452);
            if (((Boolean) mutableState3.getValue()).booleanValue()) {
                composerStartRestartGroup.startReplaceGroup(642774748);
                objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue10 = new Function0() { // from class: getAlphabeticShortcut
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            mutableState3.setValue(Boolean.FALSE);
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                }
                composerStartRestartGroup.endReplaceGroup();
                getTheme.TuitionPaymentFragmentspecialinlinedviewModeldefault2((Function0) objRememberedValue10, (ScholarshipDataEligible) mutableState4.getValue(), composerStartRestartGroup, 6, r15);
            }
            composerStartRestartGroup.endReplaceGroup();
            i9 = i8 & 896;
            getConstantMinimumWidth.TuitionPaymentFragmentspecialinlinedviewModeldefault3("Konfirmasi Beasiswa", ComposableLambdaKt.rememberComposableLambda(-36016005, true, new TuitionPaymentFragmentspecialinlinedviewModeldefault3(mutableState2, mutableState, zBooleanValue1110, zBooleanValue119, function7, function8, stateCollectAsStateWithLifecycle4, mutableState4, mutableState3), composerStartRestartGroup, 54), function6, null, composerStartRestartGroup, i9 | 54, 8);
            composerStartRestartGroup.startReplaceGroup(642962622);
            if (i9 == 256) {
                r7 = 1;
            } else {
                r7 = r15;
            }
            objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (r7 == 0) {
                function9 = function6;
                objRememberedValue9 = new Function0() { // from class: WindowCallbackWrapperApi26Impl
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function9.invoke();
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            } else {
                function9 = function6;
                objRememberedValue9 = new Function0() { // from class: WindowCallbackWrapperApi26Impl
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        function9.invoke();
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            composerStartRestartGroup.endReplaceGroup();
            BackHandlerKt.BackHandler(r15, (Function0) objRememberedValue9, composerStartRestartGroup, r15, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function3 = function9;
            function10 = function7;
            function11 = function8;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: onSearchRequested
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities2 = activityResultContractsPickVisualMediaMediaCapabilities;
                    getRatioByPercentage getratiobypercentage2 = getratiobypercentage;
                    Function0 function12 = function3;
                    Function0 function13 = function10;
                    Function0 function14 = function11;
                    int i11 = i;
                    onWindowFocusChanged.b(activityResultContractsPickVisualMediaMediaCapabilities2, getratiobypercentage2, function12, function13, function14, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i2);
                    return Unit.INSTANCE;
                }
            });
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements Function3<PaddingValues, Composer, Integer, Unit> {
        private /* synthetic */ boolean TuitionPaymentFragmentbindingInflater1;
        private /* synthetic */ Function0<Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        private /* synthetic */ MutableState<ScholarshipDataEligible> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private /* synthetic */ MutableState<User> f1313a;
        private /* synthetic */ MutableState<Boolean> asBinder;
        private /* synthetic */ State<updateTextButtonVisibility> asInterface;
        private /* synthetic */ Function0<Unit> b;
        private /* synthetic */ MutableState<Bitmap> g;

        static final class TuitionPaymentFragmentbindingInflater1 implements Function3<ColumnScope, Composer, Integer, Unit> {
            private /* synthetic */ MutableState<Bitmap> TuitionPaymentFragmentbindingInflater1;
            private /* synthetic */ MutableState<User> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            private static final byte[] $$c = {55, -47, -47, 67};
            private static final int $$d = 243;
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$a = {5, -91, 77, 46, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54};
            private static final int $$b = 102;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
            private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 1;
            private static int[] b = {834934365, -473467666, -933952445, 1239930195, -1653696476, -1954759881, 617989011, -899598539, -1631319784, -843940891, -602893154, 410675369, -1397939370, -717223903, -2096161104, -665107727, -1275916564, -1297733955};

            /* JADX WARN: Code duplicated, block: B:10:0x0026  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static void a(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
                /*
                    byte[] r0 = onWindowFocusChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.$$a
                    int r7 = r7 * 52
                    int r7 = 55 - r7
                    int r8 = r8 * 14
                    int r8 = 98 - r8
                    int r6 = 53 - r6
                    byte[] r1 = new byte[r6]
                    r2 = 0
                    if (r0 != 0) goto L14
                    r3 = r6
                    r4 = r2
                    goto L28
                L14:
                    r3 = r2
                L15:
                    int r4 = r3 + 1
                    byte r5 = (byte) r8
                    r1[r3] = r5
                    int r7 = r7 + 1
                    if (r4 != r6) goto L26
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L26:
                    r3 = r0[r7]
                L28:
                    int r3 = -r3
                    int r8 = r8 + r3
                    int r8 = r8 + (-11)
                    r3 = r4
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: onWindowFocusChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.a(byte, byte, byte, java.lang.Object[]):void");
            }

            private static void c(int[] iArr, int i, Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length * 2];
                int[] iArr2 = b;
                int i3 = -1870535734;
                int i4 = 1;
                int i5 = 0;
                if (iArr2 != null) {
                    int i6 = $11 + 115;
                    int i7 = i6 % 128;
                    $10 = i7;
                    int i8 = i6 % 2;
                    int length = iArr2.length;
                    int[] iArr3 = new int[length];
                    int i9 = i7 + 107;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = 0;
                    while (i11 < length) {
                        try {
                            Object[] objArr2 = new Object[1];
                            objArr2[i5] = Integer.valueOf(iArr2[i11]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i3);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                byte b2 = (byte) i5;
                                byte b3 = (byte) (b2 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 3291 - TextUtils.indexOf("", ""), (TypedValue.complexToFraction(i5, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i5, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 31, 1948206109, false, $$e(b2, b3, (byte) (-b3)), new Class[]{Integer.TYPE});
                            }
                            iArr3[i11] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                            i11++;
                            i3 = -1870535734;
                            i5 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    int i12 = $11 + 101;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    iArr2 = iArr3;
                }
                int length2 = iArr2.length;
                int[] iArr4 = new int[length2];
                int[] iArr5 = b;
                if (iArr5 != null) {
                    int length3 = iArr5.length;
                    int[] iArr6 = new int[length3];
                    int i14 = 0;
                    while (i14 < length3) {
                        try {
                            Object[] objArr3 = new Object[i4];
                            objArr3[0] = Integer.valueOf(iArr5[i14]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = (byte) (b4 + 1);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getEdgeSlop() >> 16) + 3291, 30 - Process.getGidForName(""), 1948206109, false, $$e(b4, b5, (byte) (-b5)), new Class[]{Integer.TYPE});
                            }
                            iArr6[i14] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                            i14++;
                            iArr5 = iArr5;
                            i4 = 1;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    iArr5 = iArr6;
                }
                char c = 0;
                System.arraycopy(iArr5, 0, iArr4, 0, length2);
                sessionConfigValidatingBuilder.b = 2;
                while (sessionConfigValidatingBuilder.b < iArr.length) {
                    cArr[c] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
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
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getTapTimeout() >> 16), 2559 - (ViewConfiguration.getScrollBarSize() >> 8), 29 - View.MeasureSpec.makeMeasureSpec(0, 0), 683220507, false, $$e(b6, b7, (byte) (b7 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                        i15--;
                    }
                    int i17 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i17;
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                    int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    Object[] objArr5 = {sessionConfigValidatingBuilder};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 28879), Color.argb(0, 0, 0, 0) + 348, TextUtils.indexOf((CharSequence) "", '0', 0) + 26, -30507727, false, "G", new Class[]{Object.class});
                    }
                    sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue()];
                    cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                    cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                    cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                    cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                    cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                    sessionConfigValidatingBuilder.b += 2;
                    int i19 = $10 + 57;
                    $11 = i19 % 128;
                    int i20 = i19 % 2;
                    c = 0;
                }
                objArr[0] = new String(cArr2, 0, i);
            }

            /* JADX WARN: Code duplicated, block: B:43:0x048b A[PHI: r2 r3
  0x048b: PHI (r2v77 androidx.compose.runtime.Composer) = (r2v76 androidx.compose.runtime.Composer), (r2v82 androidx.compose.runtime.Composer) binds: [B:42:0x0489, B:39:0x0471] A[DONT_GENERATE, DONT_INLINE]
  0x048b: PHI (r3v47 int) = (r3v46 int), (r3v56 int) binds: [B:42:0x0489, B:39:0x0471] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:45:0x0491  */
            @Override // kotlin.jvm.functions.Function3
            public final /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) throws Throwable {
                Object[] objArr;
                Composer composer2;
                int iIntValue;
                int i = 2 % 2;
                int i2 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 19;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i2 % 128;
                int i3 = i2 % 2;
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    int iCombineMeasuredStates = 651 - View.combineMeasuredStates(0, 0);
                    int i4 = 44 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                    byte[] bArr = $$a;
                    byte b2 = bArr[7];
                    byte b3 = bArr[5];
                    Object[] objArr2 = new Object[1];
                    a(b2, b3, b3, objArr2);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumDrawingCacheSize, iCombineMeasuredStates, i4, -459846511, false, (String) objArr2[0], null);
                }
                long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
                Object[] objArr3 = new Object[1];
                c(new int[]{-193414729, -2020400323, 44981590, -1537711054, -1257637044, -1259738673, 452985019, 995018663, -988118671, -2002710588, -1692760767, 1146795687, 65530318, 578700630}, MotionEvent.axisFromString("") + 23, objArr3);
                Class<?> cls = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                c(new int[]{-946660357, 275130577, -1076034668, 1906670668, 1950269142, -1841797658, 1469791383, -1623327243, -1143405229, 1107202481}, 15 - View.MeasureSpec.getSize(0), objArr4);
                long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    char cMyPid = (char) (Process.myPid() >> 22);
                    int iArgb = 651 - Color.argb(0, 0, 0, 0);
                    int mode = 44 - View.MeasureSpec.getMode(0);
                    byte b4 = $$a[7];
                    Object[] objArr5 = new Object[1];
                    a((byte) 52, b4, b4, objArr5);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMyPid, iArgb, mode, -873460649, false, (String) objArr5[0], null);
                }
                if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
                    int i5 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 83;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i5 % 128;
                    int i6 = i5 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                        int i7 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 652;
                        int i8 = 44 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        byte[] bArr2 = $$a;
                        Object[] objArr6 = new Object[1];
                        a((byte) 15, bArr2[7], bArr2[5], objArr6);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(cIndexOf, i7, i8, -1595579076, false, (String) objArr6[0], null);
                    }
                    Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
                    objArr = new Object[]{new int[]{i}, new String[0], new int[]{i}, new int[1]};
                    int i9 = ((int[]) objArr7[2])[0];
                    int i10 = ((int[]) objArr7[0])[0];
                    int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int i11 = ~iElapsedRealtime;
                    int i12 = 1452946929 + (((~((-268722211) | i11)) | (~((-265326286) | iElapsedRealtime))) * 520);
                    int i13 = ~(265326285 | i11);
                    int i14 = ~(iElapsedRealtime | 268757095);
                    int i15 = i12 + ((i13 | i14) * (-1040)) + ((i14 | (~(i11 | (-268757096))) | (-534048496)) * 520) + 602241026;
                    int i16 = (i15 << 13) ^ i15;
                    int i17 = i16 ^ (i16 >>> 17);
                    ((int[]) objArr[3])[0] = i17 ^ (i17 << 5);
                } else {
                    try {
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1686493381);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (ViewConfiguration.getEdgeSlop() >> 16), TextUtils.indexOf("", "", 0, 0) + 1610, TextUtils.lastIndexOf("", '0', 0, 0) + 27, 2145681644, false, null, new Class[0]);
                        }
                        Object[] objArr8 = {null, ((Constructor) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).newInstance(null), 602241026, 0};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1625117732);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cRgb = (char) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0));
                            int i18 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 650;
                            int scrollDefaultDelay = 44 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            byte b5 = $$a[7];
                            Object[] objArr9 = new Object[1];
                            a((byte) 52, b5, b5, objArr9);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRgb, i18, scrollDefaultDelay, 2075921419, false, (String) objArr9[0], new Class[]{(Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 695 - (ViewConfiguration.getScrollBarSize() >> 8), 98 - (ViewConfiguration.getTouchSlop() >> 8)), (Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 63406), (ViewConfiguration.getTouchSlop() >> 8) + 793, (ViewConfiguration.getWindowTouchSlop() >> 8) + 83), Integer.TYPE, Integer.TYPE});
                        }
                        objArr = (Object[]) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr8);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1148961515);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                            int iIndexOf = 650 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                            int i19 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43;
                            byte[] bArr3 = $$a;
                            Object[] objArr10 = new Object[1];
                            a((byte) 15, bArr3[7], bArr3[5], objArr10);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iIndexOf, i19, -1595579076, false, (String) objArr10[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, objArr);
                        try {
                            Object[] objArr11 = new Object[1];
                            c(new int[]{-193414729, -2020400323, 44981590, -1537711054, -1257637044, -1259738673, 452985019, 995018663, -988118671, -2002710588, -1692760767, 1146795687, 65530318, 578700630}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22, objArr11);
                            Class<?> cls2 = Class.forName((String) objArr11[0]);
                            Object[] objArr12 = new Object[1];
                            c(new int[]{-946660357, 275130577, -1076034668, 1906670668, 1950269142, -1841797658, 1469791383, -1623327243, -1143405229, 1107202481}, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 16, objArr12);
                            long jLongValue2 = ((Long) cls2.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue2);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(795782016);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                char cAlpha = (char) Color.alpha(0);
                                int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 651;
                                int i20 = 45 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                byte b6 = $$a[7];
                                Object[] objArr13 = new Object[1];
                                a((byte) 52, b6, b6, objArr13);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(cAlpha, iIndexOf2, i20, -873460649, false, (String) objArr13[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(650054);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                char cBlue = (char) Color.blue(0);
                                int bitsPerPixel = 650 - ImageFormat.getBitsPerPixel(0);
                                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 44;
                                byte[] bArr4 = $$a;
                                byte b7 = bArr4[7];
                                byte b8 = bArr4[5];
                                Object[] objArr14 = new Object[1];
                                a(b7, b8, b8, objArr14);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cBlue, bitsPerPixel, pressedStateDuration, -459846511, false, (String) objArr14[0], null);
                            }
                            ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                if (((int[]) objArr[2])[0] != ((int[]) objArr[0])[0]) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArr = (String[]) objArr[1];
                    if (strArr == null) {
                        throw null;
                    }
                    for (String str : strArr) {
                        arrayList.add(str);
                    }
                    throw null;
                }
                Object[] objArr15 = {new int[]{i}, new String[0], new int[]{i}, new int[1]};
                int i21 = ((int[]) objArr[3])[0];
                int i22 = ((int[]) objArr[2])[0];
                int i23 = ((int[]) objArr[0])[0];
                int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
                int i24 = i21 + (-23371539) + (((~(iMaxMemory | 594561348)) | 591130538) * (-668)) + ((594561348 | (~(591130538 | iMaxMemory))) * 1336) + ((iMaxMemory | 595324910) * 668);
                int i25 = (i24 << 13) ^ i24;
                int i26 = i25 ^ (i25 >>> 17);
                ((int[]) objArr15[3])[0] = i26 ^ (i26 << 5);
                int i27 = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                int i28 = i27 + 33;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i28 % 128;
                int i29 = i28 % 2;
                int i30 = i27 + 67;
                TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i30 % 128;
                if (i30 % 2 != 0) {
                    composer2 = composer;
                    iIntValue = num.intValue();
                    Intrinsics.checkNotNullParameter(columnScope, "");
                    if ((iIntValue & 83) == 12) {
                        if (composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                        }
                    }
                    return Unit.INSTANCE;
                }
                composer2 = composer;
                iIntValue = num.intValue();
                Intrinsics.checkNotNullParameter(columnScope, "");
                if ((iIntValue & 17) == 16) {
                    if (composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    }
                }
                return Unit.INSTANCE;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1098400157, iIntValue, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipConfirmationScreen.<anonymous>.<anonymous>.<anonymous> (ScholarshipConfirmationScreen.kt:186)");
                }
                MutableState<Bitmap> mutableState = this.TuitionPaymentFragmentbindingInflater1;
                MutableState<User> mutableState2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer2.getApplier() instanceof Applier)) {
                    int i31 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 119;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i31 % 128;
                    if (i31 % 2 == 0) {
                        ComposablesKt.invalidApplier();
                        throw null;
                    }
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM3536constructorimpl = Updater.m3536constructorimpl(composer2);
                Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3543setimpl(composerM3536constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.bg_box_peserta, composer2, 6), (String) null, BoxScopeInstance.INSTANCE.matchParentSize(Modifier.INSTANCE), (Alignment) null, ContentScale.INSTANCE.getFillBounds(), 0.0f, (ColorFilter) null, composer2, 24624, 104);
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                Modifier modifierM1006paddingqDBjuR0$default = PaddingKt.m1006paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, Dp.m6935constructorimpl(22.0f), 7, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierM1006paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer2.getApplier() instanceof Applier)) {
                    int i32 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 125;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i32 % 128;
                    int i33 = i32 % 2;
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composerM3536constructorimpl2 = Updater.m3536constructorimpl(composer2);
                Updater.m3543setimpl(composerM3536constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3543setimpl(composerM3536constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3536constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM3536constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3536constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3543setimpl(composerM3536constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                Modifier modifierM557backgroundbw27NRU$default = BackgroundKt.m557backgroundbw27NRU$default(ClipKt.clip(SizeKt.m1047size3ABfNKs(PaddingKt.m1006paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6935constructorimpl(22.0f), 0.0f, 0.0f, 13, null), Dp.m6935constructorimpl(72.0f)), RoundedCornerShapeKt.getCircleShape()), androidx.compose.ui.graphics.Color.INSTANCE.m4255getWhite0d7_KjU(), null, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM557backgroundbw27NRU$default);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer2.getApplier() instanceof Applier)) {
                    int i34 = TuitionPaymentFragmentspecialinlinedviewModeldefault1 + 57;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i34 % 128;
                    int i35 = i34 % 2;
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                    int i36 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 115;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i36 % 128;
                    int i37 = i36 % 2;
                } else {
                    composer2.useNode();
                }
                Composer composerM3536constructorimpl3 = Updater.m3536constructorimpl(composer2);
                Updater.m3543setimpl(composerM3536constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3543setimpl(composerM3536constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3536constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM3536constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM3536constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    int i38 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 57;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i38 % 128;
                    int i39 = i38 % 2;
                }
                Updater.m3543setimpl(composerM3536constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Bitmap value = mutableState.getValue();
                if (value == null) {
                    value = Integer.valueOf(R.drawable.ic_placeholder);
                }
                MediaBrowserCompatSubscriptionCallbackStubApi21.TuitionPaymentFragmentspecialinlinedviewModeldefault1(value, "Profile picture", ClipKt.clip(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), ContentScale.INSTANCE.getCrop(), composer2, 1572912);
                composer2.endNode();
                User value2 = mutableState2.getValue();
                String str2 = value2 != null ? value2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null;
                Composer composer3 = composer2;
                TextKt.m2654Text4IGK_g(str2 == null ? "" : str2, PaddingKt.m1006paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6935constructorimpl(10.0f), 0.0f, 0.0f, 13, null), ColorResources_androidKt.colorResource(R.color.colorMacaroniAndCheese, composer2, 6), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.poppins_semibold, null, 0, 0, 14, null)), 0L, (TextDecoration) null, TextAlign.m6812boximpl(TextAlign.INSTANCE.m6819getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 1575984, 0, 130480);
                TextKt.m2654Text4IGK_g("PELAPOR", (Modifier) null, androidx.compose.ui.graphics.Color.INSTANCE.m4255getWhite0d7_KjU(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.poppins_regular, null, 0, 0, 14, null)), 0L, (TextDecoration) null, TextAlign.m6812boximpl(TextAlign.INSTANCE.m6819getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 1576326, 0, 130482);
                composer2.endNode();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    int i40 = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 9;
                    TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i40 % 128;
                    int i41 = i40 % 2;
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }

            TuitionPaymentFragmentbindingInflater1(MutableState<Bitmap> mutableState, MutableState<User> mutableState2) {
                this.TuitionPaymentFragmentbindingInflater1 = mutableState;
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mutableState2;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0024  */
            /* JADX WARN: Code duplicated, block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            private static java.lang.String $$e(int r7, int r8, short r9) {
                /*
                    int r8 = r8 * 56
                    int r8 = 122 - r8
                    int r7 = r7 * 3
                    int r7 = 1 - r7
                    byte[] r0 = onWindowFocusChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.$$c
                    int r9 = r9 + 4
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L14
                    r3 = r9
                    r5 = r2
                    goto L2a
                L14:
                    r3 = r2
                L15:
                    int r9 = r9 + 1
                    byte r4 = (byte) r8
                    int r5 = r3 + 1
                    r1[r3] = r4
                    if (r5 != r7) goto L24
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    return r7
                L24:
                    r3 = r0[r9]
                    r6 = r9
                    r9 = r8
                    r8 = r3
                    r3 = r6
                L2a:
                    int r8 = -r8
                    int r8 = r8 + r9
                    r9 = r3
                    r3 = r5
                    goto L15
                */
                throw new UnsupportedOperationException("Method not decompiled: onWindowFocusChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1.$$e(int, int, short):java.lang.String");
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            Composer composer2;
            int i;
            float f;
            int i2;
            PaddingValues paddingValues2 = paddingValues;
            Composer composer3 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(paddingValues2, "");
            if ((iIntValue & 6) == 0) {
                iIntValue |= composer3.changed(paddingValues2) ? 4 : 2;
            }
            if ((iIntValue & 19) != 18 || !composer3.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-36016005, iIntValue, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipConfirmationScreen.<anonymous> (ScholarshipConfirmationScreen.kt:173)");
                }
                Modifier modifierM1006paddingqDBjuR0$default = PaddingKt.m1006paddingqDBjuR0$default(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues2), 0.0f, 0.0f, 0.0f, Dp.m6935constructorimpl(16.0f), 7, null);
                MutableState<Bitmap> mutableState = this.g;
                MutableState<User> mutableState2 = this.f1313a;
                boolean z = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                boolean z2 = this.TuitionPaymentFragmentbindingInflater1;
                Function0<Unit> function0 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                Function0<Unit> function1 = this.b;
                State<updateTextButtonVisibility> state = this.asInterface;
                final MutableState<ScholarshipDataEligible> mutableState3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                final MutableState<Boolean> mutableState4 = this.asBinder;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer3, modifierM1006paddingqDBjuR0$default);
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
                CardKt.Card(PaddingKt.m1003paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6935constructorimpl(30.0f), Dp.m6935constructorimpl(20.0f)), RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(20.0f)), null, CardDefaults.INSTANCE.m1819cardElevationaqJV_2Y(Dp.m6935constructorimpl(8.0f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-1098400157, true, new TuitionPaymentFragmentbindingInflater1(mutableState, mutableState2), composer3, 54), composer3, 196614, 20);
                Modifier modifierM1004paddingVpY3zN4$default = PaddingKt.m1004paddingVpY3zN4$default(ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null), Dp.m6935constructorimpl(30.0f), 0.0f, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM1004paddingVpY3zN4$default);
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
                Updater.m3543setimpl(composerM3536constructorimpl2, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3543setimpl(composerM3536constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM3536constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM3536constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM3536constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3543setimpl(composerM3536constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                composer3.startReplaceGroup(779433625);
                if (z) {
                    composer2 = composer3;
                } else {
                    composer2 = composer3;
                    TextKt.m2654Text4IGK_g("Silakan melakukan Konfirmasi untuk mendapatkan Manfaat Beasiswa untuk Anak Penerima Manfaat", PaddingKt.m1006paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6935constructorimpl(25.0f), 0.0f, 0.0f, 13, null), ColorResources_androidKt.colorResource(R.color.colorCharcoalGrey, composer3, 6), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.poppins_regular, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 1575990, 0, 130992);
                }
                composer2.endReplaceGroup();
                Composer composer4 = composer2;
                composer4.startReplaceGroup(779451572);
                if (z) {
                    i = 6;
                    SpacerKt.Spacer(SizeKt.m1033height3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(48.0f)), composer4, 6);
                    updateTextButtonVisibility value = state.getValue();
                    composer4.startReplaceGroup(779456621);
                    Object objRememberedValue = composer4.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: getIconTintList
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return onWindowFocusChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault3.b(mutableState3, mutableState4, (ScholarshipDataEligible) obj);
                            }
                        };
                        composer4.updateRememberedValue(objRememberedValue);
                    }
                    composer4.endReplaceGroup();
                    onWindowFocusChanged.TuitionPaymentFragmentbindingInflater1(value, (Function1) objRememberedValue, composer4, 48);
                    SpacerKt.Spacer(SizeKt.m1033height3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(75.0f)), composer4, 6);
                } else {
                    i = 6;
                }
                composer4.endReplaceGroup();
                composer4.startReplaceGroup(779466893);
                if (z2) {
                    f = 0.0f;
                    i2 = 1;
                } else {
                    f = 0.0f;
                    i2 = 1;
                    computeConstantSize.TuitionPaymentFragmentspecialinlinedviewModeldefault2("Konfirmasi Sekarang", function0, PaddingKt.m1006paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6935constructorimpl(25.0f), 0.0f, 0.0f, 13, null), false, composer4, 390, 8);
                }
                composer4.endReplaceGroup();
                computeConstantSize.b("Riwayat Konfirmasi", function1, PaddingKt.m1006paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f, i2, null), 0.0f, Dp.m6935constructorimpl(22.0f), 0.0f, 0.0f, 13, null), false, composer4, 390, 8);
                SpacerKt.Spacer(SizeKt.m1033height3ABfNKs(Modifier.INSTANCE, Dp.m6935constructorimpl(16.0f)), composer4, i);
                composer4.endNode();
                composer4.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer3.skipToGroupEnd();
            }
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Unit b(MutableState mutableState, MutableState mutableState2, ScholarshipDataEligible scholarshipDataEligible) {
            Intrinsics.checkNotNullParameter(scholarshipDataEligible, "");
            mutableState.setValue(scholarshipDataEligible);
            mutableState2.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }

        TuitionPaymentFragmentspecialinlinedviewModeldefault3(MutableState<Bitmap> mutableState, MutableState<User> mutableState2, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function1, State<updateTextButtonVisibility> state, MutableState<ScholarshipDataEligible> mutableState3, MutableState<Boolean> mutableState4) {
            this.g = mutableState;
            this.f1313a = mutableState2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
            this.TuitionPaymentFragmentbindingInflater1 = z2;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function0;
            this.b = function1;
            this.asInterface = state;
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mutableState3;
            this.asBinder = mutableState4;
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Function0<Unit> {
        private /* synthetic */ Function1<ScholarshipDataEligible, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        private /* synthetic */ ScholarshipDataEligible b;
        private static final byte[] $$c = {74, 60, 122, -26};
        private static final int $$d = 27;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {117, 50, 102, 124};
        private static final int $$b = 180;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        private static int asInterface = 1;
        private static char[] TuitionPaymentFragmentspecialinlinedviewModeldefault3 = {60063, 60043, 60068, 59753, 60046, 60116, 60056, 60050, 60057, 60106, 60095, 60052, 60047, 59745, 59749, 60117, 59747, 60088, 59750, 59744, 60093, 60040, 60060, 60048, 60041, 60053, 59746, 59748, 60062, 60058, 60061, 60034, 59751, 59752, 60055, 60044};
        private static char TuitionPaymentFragmentbindingInflater1 = 57191;

        private static void c(short s, byte b, short s2, Object[] objArr) {
            int i = 98 - (s * 2);
            byte[] bArr = $$a;
            int i2 = (s2 * 4) + 4;
            int i3 = b * 2;
            byte[] bArr2 = new byte[i3 + 1];
            int i4 = -1;
            if (bArr == null) {
                i2++;
                i += i2;
            }
            while (true) {
                i4++;
                bArr2[i4] = (byte) i;
                if (i4 == i3) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    byte b2 = bArr[i2];
                    i2++;
                    i += b2;
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:37:0x013a  */
        /* JADX WARN: Code duplicated, block: B:38:0x0153  */
        /* JADX WARN: Code duplicated, block: B:41:0x019c A[Catch: all -> 0x0374, TryCatch #0 {all -> 0x0374, blocks: (B:7:0x0031, B:9:0x003f, B:10:0x0074, B:14:0x008c, B:16:0x009a, B:17:0x00ca, B:39:0x0155, B:41:0x019c, B:42:0x0218, B:46:0x022d, B:48:0x026a, B:50:0x02d1), top: B:70:0x0031 }] */
        /* JADX WARN: Code duplicated, block: B:45:0x022b  */
        /* JADX WARN: Code duplicated, block: B:48:0x026a A[Catch: all -> 0x0374, TryCatch #0 {all -> 0x0374, blocks: (B:7:0x0031, B:9:0x003f, B:10:0x0074, B:14:0x008c, B:16:0x009a, B:17:0x00ca, B:39:0x0155, B:41:0x019c, B:42:0x0218, B:46:0x022d, B:48:0x026a, B:50:0x02d1), top: B:70:0x0031 }] */
        /* JADX WARN: Code duplicated, block: B:49:0x02ce  */
        /* JADX WARN: Code duplicated, block: B:52:0x02f2  */
        /* JADX WARN: Code duplicated, block: B:54:0x02fc  */
        /* JADX WARN: Code duplicated, block: B:55:0x0324  */
        private static void a(char[] cArr, byte b, int i, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            Object[] objArr2;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
            int i3 = 2;
            int i4 = 2 % 2;
            deInitSession deinitsession = new deInitSession();
            char[] cArr2 = TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            Object obj2 = null;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i5 = $10 + 109;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $11 + 63;
                    $10 = i8 % 128;
                    int i9 = i8 % i3;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i7])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                            int iCombineMeasuredStates = 2267 - View.combineMeasuredStates(0, 0);
                            int windowTouchSlop = 33 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                            byte b2 = (byte) ($$d & 7);
                            byte b3 = (byte) (b2 - 3);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(pressedStateDuration, iCombineMeasuredStates, windowTouchSlop, -1927765101, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        cArr3[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr3)).charValue();
                        i7++;
                        i3 = 2;
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
            Object[] objArr4 = {Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1770390596);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                int iResolveSize = 2267 - View.resolveSize(0, 0);
                int maximumDrawingCacheSize = 33 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                byte b4 = (byte) ($$d & 7);
                byte b5 = (byte) (b4 - 3);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cMakeMeasureSpec, iResolveSize, maximumDrawingCacheSize, -1927765101, false, $$e(b4, b5, b5), new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                int i10 = $11 + 77;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    i2 = i + 75;
                    cArr4[i2] = (char) (cArr[i2] * b);
                } else {
                    i2 = i - 1;
                    cArr4[i2] = (char) (cArr[i2] - b);
                }
            } else {
                i2 = i;
            }
            char c = 11;
            if (i2 > 1) {
                deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;
                while (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < i2) {
                    int i11 = $11 + 45;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 1];
                        if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                            obj = obj2;
                        } else {
                            objArr2 = new Object[13];
                            objArr2[12] = deinitsession;
                            objArr2[c] = Integer.valueOf(cCharValue);
                            objArr2[10] = deinitsession;
                            objArr2[9] = deinitsession;
                            objArr2[8] = Integer.valueOf(cCharValue);
                            objArr2[7] = deinitsession;
                            objArr2[6] = deinitsession;
                            objArr2[5] = Integer.valueOf(cCharValue);
                            objArr2[4] = deinitsession;
                            objArr2[3] = deinitsession;
                            objArr2[2] = Integer.valueOf(cCharValue);
                            objArr2[1] = deinitsession;
                            objArr2[0] = deinitsession;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char c2 = (char) (49268 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                int windowTouchSlop2 = 3261 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 31;
                                byte b6 = (byte) ($$d & 6);
                                byte b7 = (byte) (b6 - 2);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c2, windowTouchSlop2, bitsPerPixel, -127612708, false, $$e(b6, b7, b7), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                Object[] objArr5 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b8 = (byte) 0;
                                    byte b9 = b8;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 22878), 594 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 17 - View.resolveSize(0, 0), 1570859318, false, $$e(b8, b9, b9), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr5)).intValue();
                                int i12 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i12];
                            } else {
                                obj = null;
                                if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                    deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                    deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                    int i13 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                    int i14 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i13];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i14];
                                } else {
                                    int i15 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                    int i16 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i15];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i16];
                                }
                            }
                        }
                    } else {
                        deinitsession.b = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3];
                        deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = cArr[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1];
                        if (deinitsession.b == deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = (char) (deinitsession.b - b);
                            cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = (char) (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault2 - b);
                            obj = obj2;
                        } else {
                            objArr2 = new Object[13];
                            objArr2[12] = deinitsession;
                            objArr2[c] = Integer.valueOf(cCharValue);
                            objArr2[10] = deinitsession;
                            objArr2[9] = deinitsession;
                            objArr2[8] = Integer.valueOf(cCharValue);
                            objArr2[7] = deinitsession;
                            objArr2[6] = deinitsession;
                            objArr2[5] = Integer.valueOf(cCharValue);
                            objArr2[4] = deinitsession;
                            objArr2[3] = deinitsession;
                            objArr2[2] = Integer.valueOf(cCharValue);
                            objArr2[1] = deinitsession;
                            objArr2[0] = deinitsession;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(486174475);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                char c3 = (char) (49268 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                int windowTouchSlop3 = 3261 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                                int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 31;
                                byte b10 = (byte) ($$d & 6);
                                byte b11 = (byte) (b10 - 2);
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(c3, windowTouchSlop3, bitsPerPixel2, -127612708, false, $$e(b10, b11, b11), new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue() == deinitsession.asBinder) {
                                Object[] objArr6 = {deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, deinitsession, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), deinitsession, Integer.valueOf(cCharValue), deinitsession};
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1187000607);
                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                    byte b12 = (byte) 0;
                                    byte b13 = b12;
                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (Gravity.getAbsoluteGravity(0, 0) + 22878), 594 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 17 - View.resolveSize(0, 0), 1570859318, false, $$e(b12, b13, b13), new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                }
                                obj = null;
                                int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr6)).intValue();
                                int i17 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[iIntValue2];
                                cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i17];
                            } else {
                                obj = null;
                                if (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == deinitsession.TuitionPaymentFragmentbindingInflater1) {
                                    deinitsession.g = ((deinitsession.g + cCharValue) - 1) % cCharValue;
                                    deinitsession.asBinder = ((deinitsession.asBinder + cCharValue) - 1) % cCharValue;
                                    int i18 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.g;
                                    int i19 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.asBinder;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i18];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i19];
                                } else {
                                    int i110 = (deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault1 * cCharValue) + deinitsession.asBinder;
                                    int i111 = (deinitsession.TuitionPaymentFragmentbindingInflater1 * cCharValue) + deinitsession.g;
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3] = cArr2[i110];
                                    cArr4[deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 1] = cArr2[i111];
                                }
                            }
                        }
                    }
                    deinitsession.TuitionPaymentFragmentspecialinlinedviewModeldefault3 += 2;
                    obj2 = obj;
                    c = 11;
                }
            }
            int i20 = 0;
            while (i20 < i) {
                int i21 = $11 + 11;
                $10 = i21 % 128;
                if (i21 % 2 != 0) {
                    cArr4[i20] = (char) (cArr4[i20] ^ 20249);
                    i20 += 4;
                } else {
                    cArr4[i20] = (char) (cArr4[i20] ^ 13722);
                    i20++;
                }
            }
            objArr[0] = new String(cArr4);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            int i = 2 % 2;
            int i2 = asInterface + 25;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i2 % 128;
            if (i2 % 2 != 0) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.invoke(this.b);
                Unit unit = Unit.INSTANCE;
                throw null;
            }
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.invoke(this.b);
            Unit unit2 = Unit.INSTANCE;
            int i3 = asInterface + 43;
            TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 98 / 0;
            }
            return unit2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1<? super ScholarshipDataEligible, Unit> function1, ScholarshipDataEligible scholarshipDataEligible) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
            this.b = scholarshipDataEligible;
        }

        /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
            java.util.NoSuchElementException
            	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
            	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
            	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
            	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
            	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
            */
        public static java.lang.Object[] TuitionPaymentFragmentbindingInflater1(int r25, int r26) {
            /*
                Method dump skipped, instruction units count: 2372
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: onWindowFocusChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1(int, int):java.lang.Object[]");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$e(int r6, short r7, short r8) {
            /*
                int r7 = r7 * 2
                int r7 = r7 + 4
                int r6 = 116 - r6
                byte[] r0 = onWindowFocusChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$c
                int r8 = r8 * 2
                int r8 = r8 + 1
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r8
                r4 = r2
                goto L24
            L14:
                r3 = r2
            L15:
                int r4 = r3 + 1
                byte r5 = (byte) r6
                r1[r3] = r5
                if (r4 != r8) goto L22
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L22:
                r3 = r0[r7]
            L24:
                int r6 = r6 + r3
                int r7 = r7 + 1
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: onWindowFocusChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2.$$e(int, short, short):java.lang.String");
        }
    }

    static final void TuitionPaymentFragmentbindingInflater1(final updateTextButtonVisibility updatetextbuttonvisibility, final Function1<? super ScholarshipDataEligible, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(379338833);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(updatetextbuttonvisibility) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(379338833, i2, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.GranteeListingScreen (ScholarshipConfirmationScreen.kt:304)");
            }
            Arrangement.HorizontalOrVertical horizontalOrVerticalM882spacedBy0680j_4 = Arrangement.INSTANCE.m882spacedBy0680j_4(Dp.m6935constructorimpl(12.0f));
            PaddingValues paddingValuesM999PaddingValuesa9UjIt4$default = PaddingKt.m999PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m6935constructorimpl(8.0f), 7, null);
            Arrangement.HorizontalOrVertical horizontalOrVertical = horizontalOrVerticalM882spacedBy0680j_4;
            composerStartRestartGroup.startReplaceGroup(-875150757);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(updatetextbuttonvisibility);
            boolean z = (i2 & 112) == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if ((zChangedInstance | z) || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: WindowCallbackWrapperApi24Impl
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        updateTextButtonVisibility updatetextbuttonvisibility2 = updatetextbuttonvisibility;
                        final Function1 function2 = function1;
                        LazyListScope lazyListScope = (LazyListScope) obj;
                        Intrinsics.checkNotNullParameter(lazyListScope, "");
                        List<ScholarshipDataEligible> list = updatetextbuttonvisibility2.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (Intrinsics.areEqual(((ScholarshipDataEligible) obj2).getStatusKonfirmasi(), "Y")) {
                                arrayList.add(obj2);
                            }
                        }
                        final ArrayList arrayList2 = arrayList;
                        final Function1 function3 = new Function1() { // from class: applyIconTint
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                ScholarshipDataEligible scholarshipDataEligible = (ScholarshipDataEligible) obj3;
                                Intrinsics.checkNotNullParameter(scholarshipDataEligible, "");
                                String nik = scholarshipDataEligible.getNik();
                                return nik == null ? "" : nik;
                            }
                        };
                        final ScholarshipConfirmationScreenKt$GranteeListingScreen$lambda$41$lambda$40$$inlined$items$default$1 scholarshipConfirmationScreenKt$GranteeListingScreen$lambda$41$lambda$40$$inlined$items$default$1 = new Function1() { // from class: com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipConfirmationScreenKt$GranteeListingScreen$lambda$41$lambda$40$$inlined$items$default$1
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                            public final Void invoke(ScholarshipDataEligible scholarshipDataEligible) {
                                return null;
                            }
                        };
                        lazyListScope.items(arrayList2.size(), new Function1<Integer, Object>() { // from class: com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipConfirmationScreenKt$GranteeListingScreen$lambda$41$lambda$40$$inlined$items$default$2
                            @Override // kotlin.jvm.functions.Function1
                            public final /* synthetic */ Object invoke(Integer num) {
                                return TuitionPaymentFragmentbindingInflater1(num.intValue());
                            }

                            public final Object TuitionPaymentFragmentbindingInflater1(int i3) {
                                return function3.invoke(arrayList2.get(i3));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        }, new Function1<Integer, Object>() { // from class: com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipConfirmationScreenKt$GranteeListingScreen$lambda$41$lambda$40$$inlined$items$default$3
                            @Override // kotlin.jvm.functions.Function1
                            public final /* synthetic */ Object invoke(Integer num) {
                                return TuitionPaymentFragmentspecialinlinedviewModeldefault2(num.intValue());
                            }

                            public final Object TuitionPaymentFragmentspecialinlinedviewModeldefault2(int i3) {
                                return scholarshipConfirmationScreenKt$GranteeListingScreen$lambda$41$lambda$40$$inlined$items$default$1.invoke(arrayList2.get(i3));
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }
                        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipConfirmationScreenKt$GranteeListingScreen$lambda$41$lambda$40$$inlined$items$default$4
                            @Override // kotlin.jvm.functions.Function4
                            public final /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer3, Integer num2) {
                                TuitionPaymentFragmentspecialinlinedviewModeldefault3(lazyItemScope, num.intValue(), composer3, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(LazyItemScope lazyItemScope, int i3, Composer composer3, int i4) {
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
                                ScholarshipDataEligible scholarshipDataEligible = (ScholarshipDataEligible) arrayList2.get(i3);
                                composer3.startReplaceGroup(-1562775480);
                                String nik = scholarshipDataEligible.getNik();
                                String str = nik == null ? "" : nik;
                                String name = scholarshipDataEligible.getName();
                                String str2 = name == null ? "" : name;
                                composer3.startReplaceGroup(-743143900);
                                boolean zChanged = composer3.changed(function2);
                                boolean zChangedInstance2 = composer3.changedInstance(scholarshipDataEligible);
                                Object objRememberedValue2 = composer3.rememberedValue();
                                if ((zChanged | zChangedInstance2) || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = (Function0) new onWindowFocusChanged.TuitionPaymentFragmentspecialinlinedviewModeldefault2(function2, scholarshipDataEligible);
                                    composer3.updateRememberedValue(objRememberedValue2);
                                }
                                composer3.endReplaceGroup();
                                onActionViewCollapsed.TuitionPaymentFragmentbindingInflater1(str2, str, (Function0) objRememberedValue2, ComposableLambdaKt.rememberComposableLambda(612061343, true, new onWindowFocusChanged.b(scholarshipDataEligible), composer3, 54), false, false, composer3, 3072, 48);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: ActionMenuItem
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    onWindowFocusChanged.TuitionPaymentFragmentbindingInflater1(updatetextbuttonvisibility, function1, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            });
        }
    }

    public static final class b implements Function2<Composer, Integer, Unit> {
        private /* synthetic */ ScholarshipDataEligible b;

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 3) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(612061343, iIntValue, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.GranteeListingScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScholarshipConfirmationScreen.kt:317)");
                }
                BenefitInfo benefitInfo = this.b.getBenefitInfo();
                String status = benefitInfo != null ? benefitInfo.getStatus() : null;
                if (status == null) {
                    status = "";
                }
                onWindowFocusChanged.b(status, 0L, 0L, composer2, 0, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }

        public b(ScholarshipDataEligible scholarshipDataEligible) {
            this.b = scholarshipDataEligible;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x0087  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:48:0x009b  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:58:0x011f  */
    /* JADX WARN: Code duplicated, block: B:60:0x012d  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public static final void b(final String str, long j, long j2, Composer composer, final int i, final int i2) {
        int i3;
        long j3;
        int i4;
        long j4;
        int i5;
        int i6;
        long jColor;
        long jColor2;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM3536constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final long j5;
        final long j6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(str, "");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1982007781);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                j3 = j;
                i3 |= composerStartRestartGroup.changed(j3) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    j4 = j2;
                    if (composerStartRestartGroup.changed(j4)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                i6 = i3;
                if ((i6 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                    if (i7 != 0) {
                        jColor = ColorKt.Color(4294963574L);
                    } else {
                        jColor = j3;
                    }
                    if (i4 != 0) {
                        jColor2 = ColorKt.Color(4286141768L);
                    } else {
                        jColor2 = j4;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1982007781, i6, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.GranteeStatusBadge (ScholarshipConfirmationScreen.kt:329)");
                    }
                    Modifier modifierM1003paddingVpY3zN4 = PaddingKt.m1003paddingVpY3zN4(BackgroundKt.m556backgroundbw27NRU(Modifier.INSTANCE, jColor, RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(8.0f))), Dp.m6935constructorimpl(12.0f), Dp.m6935constructorimpl(6.0f));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1003paddingVpY3zN4);
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
                    Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3543setimpl(composerM3536constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM3536constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3536constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM3536constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM3536constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3543setimpl(composerM3536constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    long j7 = jColor;
                    composer2 = composerStartRestartGroup;
                    TextKt.m2654Text4IGK_g(str, (Modifier) null, jColor2, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.poppins_semibold, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i6 & 14) | 1575936 | (i6 & 896), 0, 130994);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j5 = jColor2;
                    j6 = j7;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    j6 = j3;
                    j5 = j4;
                    composer2 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: expandActionView
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            String str2 = str;
                            long j8 = j6;
                            long j9 = j5;
                            int i8 = i;
                            onWindowFocusChanged.b(str2, j8, j9, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i8 | 1), i2);
                            return Unit.INSTANCE;
                        }
                    });
                }
            }
            i3 |= 384;
            j4 = j2;
            i6 = i3;
            if ((i6 & 147) == 146) {
                if (i7 != 0) {
                    jColor = ColorKt.Color(4294963574L);
                } else {
                    jColor = j3;
                }
                if (i4 != 0) {
                    jColor2 = ColorKt.Color(4286141768L);
                } else {
                    jColor2 = j4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1982007781, i6, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.GranteeStatusBadge (ScholarshipConfirmationScreen.kt:329)");
                }
                Modifier modifierM1003paddingVpY3zN5 = PaddingKt.m1003paddingVpY3zN4(BackgroundKt.m556backgroundbw27NRU(Modifier.INSTANCE, jColor, RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(8.0f))), Dp.m6935constructorimpl(12.0f), Dp.m6935constructorimpl(6.0f));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1003paddingVpY3zN5);
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
                Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                long j8 = jColor;
                composer2 = composerStartRestartGroup;
                TextKt.m2654Text4IGK_g(str, (Modifier) null, jColor2, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.poppins_semibold, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i6 & 14) | 1575936 | (i6 & 896), 0, 130994);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j5 = jColor2;
                j6 = j8;
            } else {
                if (i7 != 0) {
                    jColor = ColorKt.Color(4294963574L);
                } else {
                    jColor = j3;
                }
                if (i4 != 0) {
                    jColor2 = ColorKt.Color(4286141768L);
                } else {
                    jColor2 = j4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1982007781, i6, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.GranteeStatusBadge (ScholarshipConfirmationScreen.kt:329)");
                }
                Modifier modifierM1003paddingVpY3zN6 = PaddingKt.m1003paddingVpY3zN4(BackgroundKt.m556backgroundbw27NRU(Modifier.INSTANCE, jColor, RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(8.0f))), Dp.m6935constructorimpl(12.0f), Dp.m6935constructorimpl(6.0f));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1003paddingVpY3zN6);
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
                Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                long j9 = jColor;
                composer2 = composerStartRestartGroup;
                TextKt.m2654Text4IGK_g(str, (Modifier) null, jColor2, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.poppins_semibold, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i6 & 14) | 1575936 | (i6 & 896), 0, 130994);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j5 = jColor2;
                j6 = j9;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: expandActionView
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        String str2 = str;
                        long j10 = j6;
                        long j11 = j5;
                        int i8 = i;
                        onWindowFocusChanged.b(str2, j10, j11, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i8 | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= 48;
        j3 = j;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                j4 = j2;
                if (composerStartRestartGroup.changed(j4)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i3;
            if ((i6 & 147) == 146) {
                if (i7 != 0) {
                    jColor = ColorKt.Color(4294963574L);
                } else {
                    jColor = j3;
                }
                if (i4 != 0) {
                    jColor2 = ColorKt.Color(4286141768L);
                } else {
                    jColor2 = j4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1982007781, i6, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.GranteeStatusBadge (ScholarshipConfirmationScreen.kt:329)");
                }
                Modifier modifierM1003paddingVpY3zN7 = PaddingKt.m1003paddingVpY3zN4(BackgroundKt.m556backgroundbw27NRU(Modifier.INSTANCE, jColor, RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(8.0f))), Dp.m6935constructorimpl(12.0f), Dp.m6935constructorimpl(6.0f));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1003paddingVpY3zN7);
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
                Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                long j10 = jColor;
                composer2 = composerStartRestartGroup;
                TextKt.m2654Text4IGK_g(str, (Modifier) null, jColor2, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.poppins_semibold, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i6 & 14) | 1575936 | (i6 & 896), 0, 130994);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j5 = jColor2;
                j6 = j10;
            } else {
                if (i7 != 0) {
                    jColor = ColorKt.Color(4294963574L);
                } else {
                    jColor = j3;
                }
                if (i4 != 0) {
                    jColor2 = ColorKt.Color(4286141768L);
                } else {
                    jColor2 = j4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1982007781, i6, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.GranteeStatusBadge (ScholarshipConfirmationScreen.kt:329)");
                }
                Modifier modifierM1003paddingVpY3zN8 = PaddingKt.m1003paddingVpY3zN4(BackgroundKt.m556backgroundbw27NRU(Modifier.INSTANCE, jColor, RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(8.0f))), Dp.m6935constructorimpl(12.0f), Dp.m6935constructorimpl(6.0f));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy5 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1003paddingVpY3zN8);
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
                Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
                BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                long j11 = jColor;
                composer2 = composerStartRestartGroup;
                TextKt.m2654Text4IGK_g(str, (Modifier) null, jColor2, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.poppins_semibold, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i6 & 14) | 1575936 | (i6 & 896), 0, 130994);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j5 = jColor2;
                j6 = j11;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: expandActionView
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        String str2 = str;
                        long j12 = j6;
                        long j13 = j5;
                        int i8 = i;
                        onWindowFocusChanged.b(str2, j12, j13, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i8 | 1), i2);
                        return Unit.INSTANCE;
                    }
                });
            }
        }
        i3 |= 384;
        j4 = j2;
        i6 = i3;
        if ((i6 & 147) == 146) {
            if (i7 != 0) {
                jColor = ColorKt.Color(4294963574L);
            } else {
                jColor = j3;
            }
            if (i4 != 0) {
                jColor2 = ColorKt.Color(4286141768L);
            } else {
                jColor2 = j4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1982007781, i6, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.GranteeStatusBadge (ScholarshipConfirmationScreen.kt:329)");
            }
            Modifier modifierM1003paddingVpY3zN9 = PaddingKt.m1003paddingVpY3zN4(BackgroundKt.m556backgroundbw27NRU(Modifier.INSTANCE, jColor, RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(8.0f))), Dp.m6935constructorimpl(12.0f), Dp.m6935constructorimpl(6.0f));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy6 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1003paddingVpY3zN9);
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
            Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
            BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
            long j12 = jColor;
            composer2 = composerStartRestartGroup;
            TextKt.m2654Text4IGK_g(str, (Modifier) null, jColor2, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.poppins_semibold, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i6 & 14) | 1575936 | (i6 & 896), 0, 130994);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j5 = jColor2;
            j6 = j12;
        } else {
            if (i7 != 0) {
                jColor = ColorKt.Color(4294963574L);
            } else {
                jColor = j3;
            }
            if (i4 != 0) {
                jColor2 = ColorKt.Color(4286141768L);
            } else {
                jColor2 = j4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1982007781, i6, -1, "com.bpjstku.presentation.compose.feature.scholarship.screen.GranteeStatusBadge (ScholarshipConfirmationScreen.kt:329)");
            }
            Modifier modifierM1003paddingVpY3zN10 = PaddingKt.m1003paddingVpY3zN4(BackgroundKt.m556backgroundbw27NRU(Modifier.INSTANCE, jColor, RoundedCornerShapeKt.m1285RoundedCornerShape0680j_4(Dp.m6935constructorimpl(8.0f))), Dp.m6935constructorimpl(12.0f), Dp.m6935constructorimpl(6.0f));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy7 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM1003paddingVpY3zN10);
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
            Updater.m3543setimpl(composerM3536constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy7, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
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
            BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
            long j13 = jColor;
            composer2 = composerStartRestartGroup;
            TextKt.m2654Text4IGK_g(str, (Modifier) null, jColor2, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, FontFamilyKt.FontFamily(FontKt.m6491FontYpTlLL0$default(R.font.poppins_semibold, null, 0, 0, 14, null)), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i6 & 14) | 1575936 | (i6 & 896), 0, 130994);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j5 = jColor2;
            j6 = j13;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: expandActionView
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String str2 = str;
                    long j14 = j6;
                    long j15 = j5;
                    int i8 = i;
                    onWindowFocusChanged.b(str2, j14, j15, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i8 | 1), i2);
                    return Unit.INSTANCE;
                }
            });
        }
    }
}
