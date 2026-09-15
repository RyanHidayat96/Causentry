package com.bpjstku.presentation.compose.feature.scholarship.screen;

import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.p002lifecycle.MutableLiveData;
import com.bpjstku.data.scholarship.model.request.ScholarshipEligibleRequest;
import com.bpjstku.domain.user.model.User;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.StateListDrawableCompat;
import defpackage.VirtualCameraAdapter1;
import defpackage.getRatioByPercentage;
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
@DebugMetadata(c = "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1", f = "ScholarshipConfirmationScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities $accountViewModel;
    final /* synthetic */ StateListDrawableCompat $loadingHandler;
    final /* synthetic */ MutableState<Bitmap> $picture$delegate;
    final /* synthetic */ State<VirtualCameraAdapter1<Bitmap>> $profilePictureState$delegate;
    final /* synthetic */ State<Boolean> $redirect$delegate;
    final /* synthetic */ getRatioByPercentage $scholarSelectViewModel;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        VirtualCameraAdapter1<Bitmap> value = this.$profilePictureState$delegate.getValue();
        if (!(value instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            if (value instanceof VirtualCameraAdapter1.asBinder) {
                MutableState<Bitmap> mutableState = this.$picture$delegate;
                VirtualCameraAdapter1<Bitmap> value2 = this.$profilePictureState$delegate.getValue();
                Intrinsics.checkNotNull(value2, "");
                mutableState.setValue((Bitmap) ((VirtualCameraAdapter1.asBinder) value2).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                MutableLiveData<VirtualCameraAdapter1<Bitmap>> mutableLiveData = this.$accountViewModel.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                if (this.$redirect$delegate.getValue().booleanValue()) {
                    getRatioByPercentage getratiobypercentage = this.$scholarSelectViewModel;
                    User userAsBinder = this.$accountViewModel.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    String str = userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
                    getratiobypercentage.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ScholarshipEligibleRequest(str != null ? str : "", null, 2, null));
                } else {
                    this.$loadingHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(Boolean.FALSE);
                }
            } else if (value instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                this.$loadingHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(Boolean.FALSE);
                MutableLiveData<VirtualCameraAdapter1<Bitmap>> mutableLiveData2 = this.$accountViewModel.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
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
        return ((ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1(StateListDrawableCompat stateListDrawableCompat, ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities, getRatioByPercentage getratiobypercentage, State<? extends VirtualCameraAdapter1<Bitmap>> state, MutableState<Bitmap> mutableState, State<Boolean> state2, Continuation<? super ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1> continuation) {
        super(2, continuation);
        this.$loadingHandler = stateListDrawableCompat;
        this.$accountViewModel = activityResultContractsPickVisualMediaMediaCapabilities;
        this.$scholarSelectViewModel = getratiobypercentage;
        this.$profilePictureState$delegate = state;
        this.$picture$delegate = mutableState;
        this.$redirect$delegate = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScholarshipConfirmationScreenKt$ScholarshipConfirmationScreen$7$1(this.$loadingHandler, this.$accountViewModel, this.$scholarSelectViewModel, this.$profilePictureState$delegate, this.$picture$delegate, this.$redirect$delegate, continuation);
    }
}
