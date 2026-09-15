package com.bpjstku.presentation.compose.feature.scholarship.screen;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.p002lifecycle.MutableLiveData;
import com.bpjstku.R;
import com.bpjstku.data.scholarship.model.request.ScholarshipEducationListRequest;
import com.bpjstku.data.scholarship.model.response.ScholarshipDataEligible;
import com.bpjstku.data.scholarship.model.response.ScholarshipVerificationResponse;
import com.bpjstku.domain.scholarship.model.ScholarPersonDetail;
import com.bpjstku.domain.user.model.User;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.Camera2CameraCoordinatorExternalSyntheticLambda0;
import defpackage.StateListDrawableCompat;
import defpackage.VirtualCameraAdapter1;
import defpackage.lambdaenableTorch1androidxcameracamera2internalTorchControl;
import defpackage.setArrowHeadLength;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$3$1", f = "ScholarshipGranteeScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities $accountViewModel;
    final /* synthetic */ SnapshotStateList<File> $additionalImages;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<setArrowHeadLength> $dialogState;
    final /* synthetic */ State<VirtualCameraAdapter1<ScholarshipVerificationResponse>> $fmResult$delegate;
    final /* synthetic */ StateListDrawableCompat $loadingHandler;
    final /* synthetic */ lambdaenableTorch1androidxcameracamera2internalTorchControl $scholarConfirmViewModel;
    final /* synthetic */ MutableState<List<ScholarPersonDetail>> $scholarshipDetailList$delegate;
    final /* synthetic */ State<List<ScholarshipDataEligible>> $selectedItems$delegate;
    int label;

    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String nik;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        VirtualCameraAdapter1<ScholarshipVerificationResponse> value = this.$fmResult$delegate.getValue();
        if (!(value instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            if (value instanceof VirtualCameraAdapter1.asBinder) {
                lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol = this.$scholarConfirmViewModel;
                User userAsBinder = this.$accountViewModel.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                String str = userAsBinder != null ? userAsBinder.b : null;
                if (str == null) {
                    str = "";
                }
                User userAsBinder2 = this.$accountViewModel.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                String str2 = userAsBinder2 != null ? userAsBinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
                if (str2 == null) {
                    str2 = "";
                }
                if (this.$selectedItems$delegate.getValue().size() != 1) {
                    nik = "";
                } else {
                    ScholarshipDataEligible scholarshipDataEligible = (ScholarshipDataEligible) CollectionsKt.firstOrNull((List) this.$selectedItems$delegate.getValue());
                    nik = scholarshipDataEligible != null ? scholarshipDataEligible.getNik() : null;
                    if (nik == null) {
                        nik = "";
                    }
                }
                ScholarPersonDetail scholarPersonDetail = (ScholarPersonDetail) CollectionsKt.firstOrNull((List) this.$scholarshipDetailList$delegate.getValue());
                String str3 = scholarPersonDetail != null ? scholarPersonDetail.INotificationSideChannelStub : null;
                if (str3 == null) {
                    str3 = "";
                }
                lambdaenabletorch1androidxcameracamera2internaltorchcontrol.b(new ScholarshipEducationListRequest(str, str2, nik, str3));
                MutableLiveData<String> mutableLiveData = this.$scholarConfirmViewModel.asInterface;
                VirtualCameraAdapter1<ScholarshipVerificationResponse> value2 = this.$fmResult$delegate.getValue();
                Intrinsics.checkNotNull(value2, "");
                mutableLiveData.setValue(((ScholarshipVerificationResponse) ((VirtualCameraAdapter1.asBinder) value2).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getKodePengajuan());
                MutableLiveData<VirtualCameraAdapter1<ScholarshipVerificationResponse>> mutableLiveData2 = this.$scholarConfirmViewModel.cancel;
                VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            } else if (value instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                this.$loadingHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(Boolean.FALSE);
                File fileTuitionPaymentFragmentspecialinlinedviewModeldefault1 = Camera2CameraCoordinatorExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                if (fileTuitionPaymentFragmentspecialinlinedviewModeldefault1.exists()) {
                    FilesKt.deleteRecursively(fileTuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
                this.$additionalImages.clear();
                MutableState<setArrowHeadLength> mutableState = this.$dialogState;
                VirtualCameraAdapter1<ScholarshipVerificationResponse> value3 = this.$fmResult$delegate.getValue();
                Intrinsics.checkNotNull(value3, "");
                String str4 = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) value3).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                if (str4 == null) {
                    str4 = "";
                }
                String string = this.$context.getString(R.string.action_ok);
                Intrinsics.checkNotNullExpressionValue(string, "");
                mutableState.setValue(new setArrowHeadLength.TuitionPaymentFragmentbindingInflater1("", str4, string));
                MutableLiveData<VirtualCameraAdapter1<ScholarshipVerificationResponse>> mutableLiveData3 = this.$scholarConfirmViewModel.cancel;
                VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData3.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$3$1(lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities, StateListDrawableCompat stateListDrawableCompat, SnapshotStateList<File> snapshotStateList, MutableState<setArrowHeadLength> mutableState, Context context, State<? extends VirtualCameraAdapter1<ScholarshipVerificationResponse>> state, State<? extends List<ScholarshipDataEligible>> state2, MutableState<List<ScholarPersonDetail>> mutableState2, Continuation<? super ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$3$1> continuation) {
        super(2, continuation);
        this.$scholarConfirmViewModel = lambdaenabletorch1androidxcameracamera2internaltorchcontrol;
        this.$accountViewModel = activityResultContractsPickVisualMediaMediaCapabilities;
        this.$loadingHandler = stateListDrawableCompat;
        this.$additionalImages = snapshotStateList;
        this.$dialogState = mutableState;
        this.$context = context;
        this.$fmResult$delegate = state;
        this.$selectedItems$delegate = state2;
        this.$scholarshipDetailList$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$3$1(this.$scholarConfirmViewModel, this.$accountViewModel, this.$loadingHandler, this.$additionalImages, this.$dialogState, this.$context, this.$fmResult$delegate, this.$selectedItems$delegate, this.$scholarshipDetailList$delegate, continuation);
    }
}
