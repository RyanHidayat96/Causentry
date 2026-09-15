package com.bpjstku.presentation.compose.feature.scholarship.screen;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.p002lifecycle.MutableLiveData;
import com.bpjstku.R;
import com.bpjstku.domain.scholarship.model.ScholarBenefit;
import defpackage.StateListDrawableCompat;
import defpackage.VirtualCameraAdapter1;
import defpackage.generateUltraHdrSupportedCombinationList;
import defpackage.setArrowHeadLength;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarHistoryScreenKt$ScholarshipHistoryScreen$4$1", f = "ScholarHistoryScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ScholarHistoryScreenKt$ScholarshipHistoryScreen$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ SnapshotStateList<ScholarBenefit> $dataHistory;
    final /* synthetic */ MutableState<setArrowHeadLength> $dialogState;
    final /* synthetic */ State<VirtualCameraAdapter1<List<ScholarBenefit>>> $historyResult$delegate;
    final /* synthetic */ StateListDrawableCompat $loadingHandler;
    final /* synthetic */ generateUltraHdrSupportedCombinationList $scholarBenefitViewModel;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        VirtualCameraAdapter1<List<ScholarBenefit>> value = this.$historyResult$delegate.getValue();
        if (!(value instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            if (!(value instanceof VirtualCameraAdapter1.asBinder)) {
                if (value instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    this.$loadingHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(Boolean.FALSE);
                    MutableState<setArrowHeadLength> mutableState = this.$dialogState;
                    VirtualCameraAdapter1<List<ScholarBenefit>> value2 = this.$historyResult$delegate.getValue();
                    Intrinsics.checkNotNull(value2, "");
                    String str = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) value2).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (str == null) {
                        str = "";
                    }
                    String string = this.$context.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    mutableState.setValue(new setArrowHeadLength.TuitionPaymentFragmentbindingInflater1("", str, string));
                    MutableLiveData<VirtualCameraAdapter1<List<ScholarBenefit>>> mutableLiveData = this.$scholarBenefitViewModel.notify;
                    VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                    mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                }
            } else {
                VirtualCameraAdapter1<List<ScholarBenefit>> value3 = this.$historyResult$delegate.getValue();
                Intrinsics.checkNotNull(value3, "");
                List list = (List) ((VirtualCameraAdapter1.asBinder) value3).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                this.$dataHistory.clear();
                this.$dataHistory.addAll(list);
                this.$loadingHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(Boolean.FALSE);
                MutableLiveData<VirtualCameraAdapter1<List<ScholarBenefit>>> mutableLiveData2 = this.$scholarBenefitViewModel.notify;
                VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            }
        } else {
            this.$loadingHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScholarHistoryScreenKt$ScholarshipHistoryScreen$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScholarHistoryScreenKt$ScholarshipHistoryScreen$4$1(StateListDrawableCompat stateListDrawableCompat, SnapshotStateList<ScholarBenefit> snapshotStateList, generateUltraHdrSupportedCombinationList generateultrahdrsupportedcombinationlist, MutableState<setArrowHeadLength> mutableState, Context context, State<? extends VirtualCameraAdapter1<List<ScholarBenefit>>> state, Continuation<? super ScholarHistoryScreenKt$ScholarshipHistoryScreen$4$1> continuation) {
        super(2, continuation);
        this.$loadingHandler = stateListDrawableCompat;
        this.$dataHistory = snapshotStateList;
        this.$scholarBenefitViewModel = generateultrahdrsupportedcombinationlist;
        this.$dialogState = mutableState;
        this.$context = context;
        this.$historyResult$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScholarHistoryScreenKt$ScholarshipHistoryScreen$4$1(this.$loadingHandler, this.$dataHistory, this.$scholarBenefitViewModel, this.$dialogState, this.$context, this.$historyResult$delegate, continuation);
    }
}
