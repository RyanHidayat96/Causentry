package com.bpjstku.presentation.compose.feature.scholarship.screen;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.bpjstku.R;
import com.bpjstku.data.scholarship.model.request.ScholarshipEligibleRequest;
import com.bpjstku.data.scholarship.model.response.ConfirmResponse;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.compose.feature.scholarship.screen.SubmissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.StateListDrawableCompat;
import defpackage.VirtualCameraAdapter1;
import defpackage.getRatioByPercentage;
import defpackage.getRequiredMaxBitDepth;
import defpackage.lambdaenableTorch1androidxcameracamera2internalTorchControl;
import defpackage.setArrowHeadLength;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.bpjstku.presentation.compose.feature.scholarship.screen.SubmissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1", f = "SubmissionConfirmationScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SubmissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities $accountViewModel;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<setArrowHeadLength> $dialogState;
    final /* synthetic */ StateListDrawableCompat $loadingHandler;
    final /* synthetic */ String $messageConfirm;
    final /* synthetic */ Function0<Unit> $onFinish;
    final /* synthetic */ lambdaenableTorch1androidxcameracamera2internalTorchControl $scholarConfirmViewModel;
    final /* synthetic */ getRatioByPercentage $scholarSelectViewModel;
    final /* synthetic */ State<VirtualCameraAdapter1<ConfirmResponse>> $updateConfirmResult$delegate;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        VirtualCameraAdapter1<ConfirmResponse> value = this.$updateConfirmResult$delegate.getValue();
        if (!(value instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            if (!(value instanceof VirtualCameraAdapter1.asBinder)) {
                if (value instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    this.$loadingHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(Boolean.FALSE);
                    MutableState<setArrowHeadLength> mutableState = this.$dialogState;
                    VirtualCameraAdapter1<ConfirmResponse> value2 = this.$updateConfirmResult$delegate.getValue();
                    Intrinsics.checkNotNull(value2, "");
                    String str = ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) value2).TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    if (str == null) {
                        str = "";
                    }
                    String string = this.$context.getString(R.string.action_ok);
                    Intrinsics.checkNotNullExpressionValue(string, "");
                    mutableState.setValue(new setArrowHeadLength.TuitionPaymentFragmentbindingInflater1("", str, string));
                    lambdaenableTorch1androidxcameracamera2internalTorchControl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(410001568, -410001563, new Object[]{this.$scholarConfirmViewModel}, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
                }
            } else {
                this.$loadingHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(Boolean.FALSE);
                User userAsBinder = this.$accountViewModel.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                String str2 = userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
                if (str2 == null) {
                    str2 = "";
                }
                this.$scholarSelectViewModel.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ScholarshipEligibleRequest(str2, null, 2, null));
                MutableState<setArrowHeadLength> mutableState2 = this.$dialogState;
                Integer numBoxInt = Boxing.boxInt(R.drawable.ic_success);
                String string2 = this.$context.getString(R.string.label_success);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                String str3 = this.$messageConfirm;
                String string3 = this.$context.getString(R.string.action_tracking_confirmation);
                Intrinsics.checkNotNullExpressionValue(string3, "");
                final lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol = this.$scholarConfirmViewModel;
                final Function0<Unit> function0 = this.$onFinish;
                mutableState2.setValue(new setArrowHeadLength.b(numBoxInt, string2, str3, string3, null, new Function0() { // from class: setSupportActionProvider
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SubmissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdaenabletorch1androidxcameracamera2internaltorchcontrol, function0);
                    }
                }, null, 80, null));
            }
        } else {
            this.$loadingHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, Function0 function0) {
        lambdaenabletorch1androidxcameracamera2internaltorchcontrol.b();
        int iTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        lambdaenableTorch1androidxcameracamera2internalTorchControl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(410001568, -410001563, new Object[]{lambdaenabletorch1androidxcameracamera2internaltorchcontrol}, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), iTuitionPaymentFragmentspecialinlinedviewModeldefault3, getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3(), getRequiredMaxBitDepth.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        function0.invoke();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SubmissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SubmissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1(StateListDrawableCompat stateListDrawableCompat, ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities, getRatioByPercentage getratiobypercentage, MutableState<setArrowHeadLength> mutableState, Context context, String str, lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, State<? extends VirtualCameraAdapter1<ConfirmResponse>> state, Function0<Unit> function0, Continuation<? super SubmissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1> continuation) {
        super(2, continuation);
        this.$loadingHandler = stateListDrawableCompat;
        this.$accountViewModel = activityResultContractsPickVisualMediaMediaCapabilities;
        this.$scholarSelectViewModel = getratiobypercentage;
        this.$dialogState = mutableState;
        this.$context = context;
        this.$messageConfirm = str;
        this.$scholarConfirmViewModel = lambdaenabletorch1androidxcameracamera2internaltorchcontrol;
        this.$updateConfirmResult$delegate = state;
        this.$onFinish = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SubmissionConfirmationScreenKt$ScholarshipSubmissionConfirmationScreen$4$1(this.$loadingHandler, this.$accountViewModel, this.$scholarSelectViewModel, this.$dialogState, this.$context, this.$messageConfirm, this.$scholarConfirmViewModel, this.$updateConfirmResult$delegate, this.$onFinish, continuation);
    }
}
