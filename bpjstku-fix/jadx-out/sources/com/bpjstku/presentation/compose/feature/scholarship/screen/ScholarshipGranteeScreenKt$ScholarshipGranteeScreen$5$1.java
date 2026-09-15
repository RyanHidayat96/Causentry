package com.bpjstku.presentation.compose.feature.scholarship.screen;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.p002lifecycle.MutableLiveData;
import com.bpjstku.R;
import com.bpjstku.data.scholarship.model.request.ScholarshipFmRequest;
import com.bpjstku.data.setting.model.response.KeyResponse;
import com.bpjstku.domain.scholarship.model.ScholarPersonDetail;
import com.bpjstku.domain.user.model.User;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.IntegerRes;
import defpackage.StateListDrawableCompat;
import defpackage.VirtualCameraAdapter1;
import defpackage.lambdaenableTorch1androidxcameracamera2internalTorchControl;
import defpackage.setArrowHeadLength;
import id.vida.liveness.dto.VidaLivenessResponse;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.bpjstku.presentation.compose.feature.scholarship.screen.ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$5$1", f = "ScholarshipGranteeScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities $accountViewModel;
    final /* synthetic */ SnapshotStateList<File> $additionalImages;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<setArrowHeadLength> $dialogState;
    final /* synthetic */ State<VirtualCameraAdapter1<KeyResponse>> $getKeyResult$delegate;
    final /* synthetic */ StateListDrawableCompat $loadingHandler;
    final /* synthetic */ lambdaenableTorch1androidxcameracamera2internalTorchControl $scholarConfirmViewModel;
    final /* synthetic */ MutableState<List<ScholarPersonDetail>> $scholarshipDetailList$delegate;
    final /* synthetic */ IntegerRes $settingViewModel;
    final /* synthetic */ MutableState<VidaLivenessResponse> $vidaLivenessResponse$delegate;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        VirtualCameraAdapter1<KeyResponse> value = this.$getKeyResult$delegate.getValue();
        if (!(value instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
            if (!(value instanceof VirtualCameraAdapter1.asBinder)) {
                if (value instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                    this.$loadingHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(Boolean.FALSE);
                    MutableState<setArrowHeadLength> mutableState = this.$dialogState;
                    VirtualCameraAdapter1<KeyResponse> value2 = this.$getKeyResult$delegate.getValue();
                    Intrinsics.checkNotNull(value2, "");
                    mutableState.setValue(new setArrowHeadLength.TuitionPaymentFragmentbindingInflater1("", String.valueOf(((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) value2).TuitionPaymentFragmentspecialinlinedviewModeldefault2), null, 4, null));
                    MutableLiveData<VirtualCameraAdapter1<KeyResponse>> mutableLiveData = this.$settingViewModel.MediaBrowserCompat;
                    VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
                    mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                }
            } else {
                VirtualCameraAdapter1<KeyResponse> value3 = this.$getKeyResult$delegate.getValue();
                Intrinsics.checkNotNull(value3, "");
                List listSplit$default = StringsKt.split$default((CharSequence) ((KeyResponse) ((VirtualCameraAdapter1.asBinder) value3).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getCheckSum(), new String[]{"#"}, false, 0, 6, (Object) null);
                Object obj2 = StringsKt.split$default((CharSequence) ((ScholarPersonDetail) CollectionsKt.first((List) this.$scholarshipDetailList$delegate.getValue())).com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH java.lang.String, new String[]{"#"}, false, 0, 6, (Object) null).get(1);
                Object obj3 = listSplit$default.get(2);
                StringBuilder sb = new StringBuilder("JMO#");
                sb.append(obj2);
                sb.append("#true#70#");
                sb.append(obj3);
                String string = sb.toString();
                User userAsBinder = this.$accountViewModel.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                if (Intrinsics.areEqual(String.valueOf(userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null), listSplit$default.get(0))) {
                    lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol = this.$scholarConfirmViewModel;
                    String str = ((ScholarPersonDetail) CollectionsKt.first((List) this.$scholarshipDetailList$delegate.getValue())).isConnected;
                    User userAsBinder2 = this.$accountViewModel.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    String str2 = userAsBinder2 != null ? userAsBinder2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
                    String str3 = str2 == null ? "" : str2;
                    String str4 = Build.BRAND;
                    Intrinsics.checkNotNullExpressionValue(str4, "");
                    String string2 = Settings.Secure.getString(this.$context.getContentResolver(), "android_id");
                    Intrinsics.checkExpressionValueIsNotNull(string2, "");
                    String str5 = Build.MODEL;
                    Intrinsics.checkNotNullExpressionValue(str5, "");
                    String str6 = Build.MANUFACTURER;
                    Intrinsics.checkNotNullExpressionValue(str6, "");
                    String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
                    File file = (File) CollectionsKt.getOrNull(this.$additionalImages, 0);
                    File file2 = (File) CollectionsKt.getOrNull(this.$additionalImages, 1);
                    File file3 = (File) CollectionsKt.getOrNull(this.$additionalImages, 2);
                    VidaLivenessResponse value4 = this.$vidaLivenessResponse$delegate.getValue();
                    String transactionId = value4 != null ? value4.getTransactionId() : null;
                    String str7 = transactionId == null ? "" : transactionId;
                    VidaLivenessResponse value5 = this.$vidaLivenessResponse$delegate.getValue();
                    String strValueOf2 = String.valueOf(value5 != null ? Boxing.boxDouble(value5.getLivenessScore()) : null);
                    VidaLivenessResponse value6 = this.$vidaLivenessResponse$delegate.getValue();
                    String strValueOf3 = String.valueOf(value6 != null ? Boxing.boxDouble(value6.getManipulationScore()) : null);
                    String str8 = ((ScholarPersonDetail) CollectionsKt.first((List) this.$scholarshipDetailList$delegate.getValue())).INotificationSideChannelStub;
                    User userAsBinder3 = this.$accountViewModel.TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
                    String str9 = userAsBinder3 != null ? userAsBinder3.b : null;
                    lambdaenabletorch1androidxcameracamera2internaltorchcontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault3("", new ScholarshipFmRequest(str, str3, str4, string2, str5, str6, strValueOf, string, file, file2, file3, str8, str9 == null ? "" : str9, str7, strValueOf2, strValueOf3));
                } else {
                    this.$loadingHandler.TuitionPaymentFragmentspecialinlinedviewModeldefault2.setValue(Boolean.FALSE);
                    MutableState<setArrowHeadLength> mutableState2 = this.$dialogState;
                    String string3 = this.$context.getString(R.string.message_integrity_data);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    mutableState2.setValue(new setArrowHeadLength.TuitionPaymentFragmentbindingInflater1("", string3, null, 4, null));
                }
                MutableLiveData<VirtualCameraAdapter1<KeyResponse>> mutableLiveData2 = this.$settingViewModel.MediaBrowserCompat;
                VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
                mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$5$1(ActivityResultContractsPickVisualMediaMediaCapabilities activityResultContractsPickVisualMediaMediaCapabilities, lambdaenableTorch1androidxcameracamera2internalTorchControl lambdaenabletorch1androidxcameracamera2internaltorchcontrol, Context context, SnapshotStateList<File> snapshotStateList, StateListDrawableCompat stateListDrawableCompat, MutableState<setArrowHeadLength> mutableState, IntegerRes integerRes, State<? extends VirtualCameraAdapter1<KeyResponse>> state, MutableState<List<ScholarPersonDetail>> mutableState2, MutableState<VidaLivenessResponse> mutableState3, Continuation<? super ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$5$1> continuation) {
        super(2, continuation);
        this.$accountViewModel = activityResultContractsPickVisualMediaMediaCapabilities;
        this.$scholarConfirmViewModel = lambdaenabletorch1androidxcameracamera2internaltorchcontrol;
        this.$context = context;
        this.$additionalImages = snapshotStateList;
        this.$loadingHandler = stateListDrawableCompat;
        this.$dialogState = mutableState;
        this.$settingViewModel = integerRes;
        this.$getKeyResult$delegate = state;
        this.$scholarshipDetailList$delegate = mutableState2;
        this.$vidaLivenessResponse$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScholarshipGranteeScreenKt$ScholarshipGranteeScreen$5$1(this.$accountViewModel, this.$scholarConfirmViewModel, this.$context, this.$additionalImages, this.$loadingHandler, this.$dialogState, this.$settingViewModel, this.$getKeyResult$delegate, this.$scholarshipDetailList$delegate, this.$vidaLivenessResponse$delegate, continuation);
    }
}
