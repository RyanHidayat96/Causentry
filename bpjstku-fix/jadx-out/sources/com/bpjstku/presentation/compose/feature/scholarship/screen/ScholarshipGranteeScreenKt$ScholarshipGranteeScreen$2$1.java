package com.bpjstku.presentation.compose.feature.scholarship.screen;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.p002lifecycle.MutableLiveData;
import com.bpjstku.data.scholarship.model.response.ScholarshipFmResponse;
import com.bpjstku.domain.scholarship.model.ScholarPersonDetail;
import defpackage.StateListDrawableCompat;
import defpackage.VirtualCameraAdapter1;
import defpackage.lambdaenableTorch1androidxcameracamera2internalTorchControl;
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
@DebugMetadata(c = "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$2$1", f = "ScholarshipGranteeScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<setArrowHeadLength> $dialogState;
    final /* synthetic */ State<VirtualCameraAdapter1<ScholarshipFmResponse>> $fmBeginResult$delegate;
    final /* synthetic */ StateListDrawableCompat $loadingHandler;
    final /* synthetic */ MutableState<Boolean> $requestPermission$delegate;
    final /* synthetic */ lambdaenableTorch1androidxcameracamera2internalTorchControl $scholarConfirmViewModel;
    final /* synthetic */ MutableState<List<ScholarPersonDetail>> $scholarshipDetailList$delegate;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        List listSplit$default;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        VirtualCameraAdapter1<ScholarshipFmResponse> value = this.$fmBeginResult$delegate.getValue();
        if (!(value instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            if (!(value instanceof VirtualCameraAdapter1.asBinder)) {
                if (value instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    this.$loadingHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(Boolean.FALSE);
                    VirtualCameraAdapter1<ScholarshipFmResponse> value2 = this.$fmBeginResult$delegate.getValue();
                    Intrinsics.checkNotNull(value2, "");
                    MutableState<setArrowHeadLength> mutableState = this.$dialogState;
                    String str2 = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) value2).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    mutableState.setValue(new setArrowHeadLength.TuitionPaymentFragmentbindingInflater1("", str2 == null ? "" : str2, null, 4, null));
                    MutableLiveData<VirtualCameraAdapter1<ScholarshipFmResponse>> mutableLiveData = this.$scholarConfirmViewModel.INotificationSideChannelStub;
                    VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                    mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                }
            } else {
                VirtualCameraAdapter1<ScholarshipFmResponse> value3 = this.$fmBeginResult$delegate.getValue();
                Intrinsics.checkNotNull(value3, "");
                String strIsSuccessful = ((ScholarshipFmResponse) ((VirtualCameraAdapter1.asBinder) value3).TuitionPaymentFragmentspecialinlinedviewModeldefault1).isSuccessful();
                String str3 = (String) CollectionsKt.getOrNull(StringsKt.split$default((CharSequence) (strIsSuccessful != null ? strIsSuccessful : ""), new String[]{"#"}, false, 0, 6, (Object) null), 2);
                ScholarPersonDetail scholarPersonDetail = (ScholarPersonDetail) CollectionsKt.firstOrNull((List) this.$scholarshipDetailList$delegate.getValue());
                String str4 = (scholarPersonDetail == null || (str = scholarPersonDetail.com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH java.lang.String) == null || (listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{"#"}, false, 0, 6, (Object) null)) == null) ? null : (String) CollectionsKt.getOrNull(listSplit$default, 2);
                if (str3 != null && Intrinsics.areEqual(str3, str4)) {
                    this.$requestPermission$delegate.setValue(Boolean.TRUE);
                } else {
                    this.$loadingHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(Boolean.FALSE);
                    this.$dialogState.setValue(new setArrowHeadLength.TuitionPaymentFragmentbindingInflater1("Information", "Permintaan ditolak", null, 4, null));
                }
                MutableLiveData<VirtualCameraAdapter1<ScholarshipFmResponse>> mutableLiveData2 = this.$scholarConfirmViewModel.INotificationSideChannelStub;
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
        return ((ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$2$1(StateListDrawableCompat stateListDrawableCompat, MutableState<setArrowHeadLength> mutableState, lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, State<? extends VirtualCameraAdapter1<ScholarshipFmResponse>> state, MutableState<List<ScholarPersonDetail>> mutableState2, MutableState<Boolean> mutableState3, Continuation<? super ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$2$1> continuation) {
        super(2, continuation);
        this.$loadingHandler = stateListDrawableCompat;
        this.$dialogState = mutableState;
        this.$scholarConfirmViewModel = lambdaenabletorch1androidxcameracamera2internaltorchcontrol;
        this.$fmBeginResult$delegate = state;
        this.$scholarshipDetailList$delegate = mutableState2;
        this.$requestPermission$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$2$1(this.$loadingHandler, this.$dialogState, this.$scholarConfirmViewModel, this.$fmBeginResult$delegate, this.$scholarshipDetailList$delegate, this.$requestPermission$delegate, continuation);
    }
}
