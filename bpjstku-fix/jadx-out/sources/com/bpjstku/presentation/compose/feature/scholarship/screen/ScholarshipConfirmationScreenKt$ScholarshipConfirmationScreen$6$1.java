package com.bpjstku.presentation.compose.feature.scholarship.screen;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.p002lifecycle.MutableLiveData;
import com.bpjstku.R;
import com.bpjstku.data.scholarship.model.response.ScholarshipBenefitPerson;
import com.bpjstku.data.scholarship.model.response.ScholarshipEligibleResponse;
import com.bpjstku.domain.scholarship.model.ScholarPersonDetail;
import defpackage.LocalOnBackPressedDispatcherOwnerExternalSyntheticLambda0;
import defpackage.StateListDrawableCompat;
import defpackage.VirtualCameraAdapter1;
import defpackage.getRatioByPercentage;
import defpackage.setArrowHeadLength;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1", f = "ScholarshipConfirmationScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<setArrowHeadLength> $dialogState;
    final /* synthetic */ State<VirtualCameraAdapter1<ScholarshipEligibleResponse>> $eligibleResult$delegate;
    final /* synthetic */ StateListDrawableCompat $loadingHandler;
    final /* synthetic */ getRatioByPercentage $scholarSelectViewModel;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<ScholarPersonDetail> listEmptyList;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        VirtualCameraAdapter1<ScholarshipEligibleResponse> value = this.$eligibleResult$delegate.getValue();
        if (!(value instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            if (!(value instanceof VirtualCameraAdapter1.asBinder)) {
                if (value instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    this.$loadingHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(Boolean.FALSE);
                    MutableState<setArrowHeadLength> mutableState = this.$dialogState;
                    VirtualCameraAdapter1<ScholarshipEligibleResponse> value2 = this.$eligibleResult$delegate.getValue();
                    Intrinsics.checkNotNull(value2, "");
                    String str = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) value2).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (str == null) {
                        str = "";
                    }
                    String string = this.$context.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    mutableState.setValue(new setArrowHeadLength.TuitionPaymentFragmentbindingInflater1("", str, string));
                }
            } else {
                VirtualCameraAdapter1<ScholarshipEligibleResponse> value3 = this.$eligibleResult$delegate.getValue();
                Intrinsics.checkNotNull(value3, "");
                ScholarshipEligibleResponse scholarshipEligibleResponse = (ScholarshipEligibleResponse) ((VirtualCameraAdapter1.asBinder) value3).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                if (!Intrinsics.areEqual(scholarshipEligibleResponse.getStatusCode(), "203")) {
                    List<ScholarshipBenefitPerson> choosenScholarDetail = scholarshipEligibleResponse.getChoosenScholarDetail();
                    if (choosenScholarDetail != null) {
                        String signature = scholarshipEligibleResponse.getSignature();
                        if (signature == null) {
                            signature = "";
                        }
                        listEmptyList = LocalOnBackPressedDispatcherOwnerExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(choosenScholarDetail, signature);
                    } else {
                        listEmptyList = null;
                    }
                    getRatioByPercentage getratiobypercentage = this.$scholarSelectViewModel;
                    if (listEmptyList == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    Intrinsics.checkNotNullParameter(listEmptyList, "");
                    getratiobypercentage.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(listEmptyList);
                    this.$scholarSelectViewModel.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(scholarshipEligibleResponse);
                    this.$scholarSelectViewModel.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                    this.$loadingHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(Boolean.FALSE);
                } else {
                    this.$loadingHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(Boolean.FALSE);
                    MutableState<setArrowHeadLength> mutableState2 = this.$dialogState;
                    String strReplace$default = StringsKt.replace$default(scholarshipEligibleResponse.getMessage(), "\t", "", false, 4, (Object) null);
                    String string2 = this.$context.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    mutableState2.setValue(new setArrowHeadLength.TuitionPaymentFragmentbindingInflater1("Mohon maaf konfirmasi tidak dapat dilanjutkan", strReplace$default, string2));
                }
                this.$scholarSelectViewModel.RemoteActionCompatParcelizer.b(Boolean.FALSE);
                MutableLiveData<VirtualCameraAdapter1<ScholarshipEligibleResponse>> mutableLiveData = this.$scholarSelectViewModel.g;
                VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1(StateListDrawableCompat stateListDrawableCompat, MutableState<setArrowHeadLength> mutableState, Context context, getRatioByPercentage getratiobypercentage, State<? extends VirtualCameraAdapter1<ScholarshipEligibleResponse>> state, Continuation<? super ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1> continuation) {
        super(2, continuation);
        this.$loadingHandler = stateListDrawableCompat;
        this.$dialogState = mutableState;
        this.$context = context;
        this.$scholarSelectViewModel = getratiobypercentage;
        this.$eligibleResult$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$6$1(this.$loadingHandler, this.$dialogState, this.$context, this.$scholarSelectViewModel, this.$eligibleResult$delegate, continuation);
    }
}
