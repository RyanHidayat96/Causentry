package com.bpjstku.presentation.compose.feature.scholarship.screen;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.bpjstku.R;
import com.bpjstku.data.setting.model.request.KeyRequest;
import com.bpjstku.domain.user.model.User;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.Camera2CameraControlExternalSyntheticLambda5;
import defpackage.ExperimentalCameraProviderConfiguration;
import defpackage.IntegerRes;
import defpackage.StateListDrawableCompat;
import defpackage.TwilightManager;
import defpackage.addSignalEosTimeoutIfNeeded;
import defpackage.clampVideoBitrateIfNotSupported;
import defpackage.lambdaenableTorch1androidxcameracamera2internalTorchControl;
import defpackage.populateOptionsMenu;
import defpackage.setArrowHeadLength;
import id.vida.liveness.dto.VidaLivenessResponse;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$6$1", f = "ScholarshipGranteeScreen.kt", i = {}, l = {287}, m = "invokeSuspend", n = {}, s = {})
public final class ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$6$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities $accountViewModel;
    final /* synthetic */ SnapshotStateList<File> $additionalImages;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<setArrowHeadLength> $dialogState;
    final /* synthetic */ populateOptionsMenu $livenessViewModel;
    final /* synthetic */ StateListDrawableCompat $loadingHandler;
    final /* synthetic */ lambdaenableTorch1androidxcameracamera2internalTorchControl $scholarConfirmViewModel;
    final /* synthetic */ IntegerRes $settingViewModel;
    final /* synthetic */ MutableState<VidaLivenessResponse> $vidaLivenessResponse$delegate;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            clampVideoBitrateIfNotSupported<Object> clampvideobitrateifnotsupported = this.$livenessViewModel.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            final lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol = this.$scholarConfirmViewModel;
            final IntegerRes integerRes = this.$settingViewModel;
            final ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities = this.$accountViewModel;
            final StateListDrawableCompat stateListDrawableCompat = this.$loadingHandler;
            final MutableState<setArrowHeadLength> mutableState = this.$dialogState;
            final Context context = this.$context;
            final SnapshotStateList<File> snapshotStateList = this.$additionalImages;
            final MutableState<VidaLivenessResponse> mutableState2 = this.$vidaLivenessResponse$delegate;
            this.label = 1;
            if (clampvideobitrateifnotsupported.collect(new addSignalEosTimeoutIfNeeded() { // from class: com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$6$1.2
                @Override // defpackage.addSignalEosTimeoutIfNeeded
                public final Object emit(Object obj2, Continuation<? super Unit> continuation) {
                    if (obj2 instanceof TwilightManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                        TwilightManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1 tuitionPaymentFragmentspecialinlinedviewModeldefault1 = (TwilightManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1) obj2;
                        byte[] imageBytes = tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1.getImageBytes();
                        if (imageBytes != null) {
                            Boxing.boxBoolean(snapshotStateList.add(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault1(imageBytes, context)));
                        }
                        mutableState2.setValue(tuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1);
                        lambdaenabletorch1androidxcameracamera2internaltorchcontrol.asBinder.setValue(mutableState2.getValue());
                        IntegerRes integerRes2 = integerRes;
                        User userAsBinder = activityResultContractsPickVisualMediaMediaCapabilities.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                        String str = userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append("#beasiswa");
                        integerRes2.b(new KeyRequest(sb.toString()));
                    } else if (!(obj2 instanceof TwilightManager.TuitionPaymentFragmentbindingInflater1)) {
                        if (obj2 instanceof Throwable) {
                            MutableState<setArrowHeadLength> mutableState3 = mutableState;
                            String string = context.getString(R.string.action_information);
                            Intrinsics.checkNotNullExpressionValue(string, "");
                            String string2 = context.getString(R.string.message_exception_vida);
                            Intrinsics.checkNotNullExpressionValue(string2, "");
                            String string3 = context.getString(R.string.action_back);
                            Intrinsics.checkNotNullExpressionValue(string3, "");
                            mutableState3.setValue(new setArrowHeadLength.TuitionPaymentFragmentbindingInflater1(string, string2, string3));
                        }
                    } else {
                        stateListDrawableCompat.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(Boolean.FALSE);
                        TwilightManager.TuitionPaymentFragmentbindingInflater1 tuitionPaymentFragmentbindingInflater1 = (TwilightManager.TuitionPaymentFragmentbindingInflater1) obj2;
                        int i2 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        String str2 = tuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(i2);
                        sb2.append(": ");
                        sb2.append(str2);
                        Toast.makeText(ExperimentalCameraProviderConfiguration.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), sb2.toString(), 0).show();
                    }
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$6$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$6$1(populateOptionsMenu populateoptionsmenu, lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, IntegerRes integerRes, ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities, StateListDrawableCompat stateListDrawableCompat, MutableState<setArrowHeadLength> mutableState, Context context, SnapshotStateList<File> snapshotStateList, MutableState<VidaLivenessResponse> mutableState2, Continuation<? super ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$6$1> continuation) {
        super(2, continuation);
        this.$livenessViewModel = populateoptionsmenu;
        this.$scholarConfirmViewModel = lambdaenabletorch1androidxcameracamera2internaltorchcontrol;
        this.$settingViewModel = integerRes;
        this.$accountViewModel = activityResultContractsPickVisualMediaMediaCapabilities;
        this.$loadingHandler = stateListDrawableCompat;
        this.$dialogState = mutableState;
        this.$context = context;
        this.$additionalImages = snapshotStateList;
        this.$vidaLivenessResponse$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$6$1(this.$livenessViewModel, this.$scholarConfirmViewModel, this.$settingViewModel, this.$accountViewModel, this.$loadingHandler, this.$dialogState, this.$context, this.$additionalImages, this.$vidaLivenessResponse$delegate, continuation);
    }
}
