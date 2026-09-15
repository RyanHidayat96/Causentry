package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.jht.model.request.CheckBankAccountRequest;
import com.bpjstku.data.jht.model.request.ClaimReasonRequest;
import com.bpjstku.data.jht.model.request.ClaimSegmenRequest;
import com.bpjstku.data.jht.model.request.GenerateClaimCodeRequest;
import com.bpjstku.data.jht.model.request.JhtBenefitDetailRequest;
import com.bpjstku.data.jht.model.response.ClaimCheckBankBpuReactivationResponse;
import com.bpjstku.data.jht.model.response.ClaimLivenessResponse;
import com.bpjstku.data.jht.model.response.ClaimReactivationBpuTuitionResponse;
import com.bpjstku.data.jht.model.response.JhtClaimEmployeeDataItem;
import com.bpjstku.data.jht.model.response.JhtContributionDetailItem;
import com.bpjstku.data.jht.model.response.ReasonNotReactive;
import com.bpjstku.data.lib.model.BaseItem;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.jht.model.BenefitDetail;
import com.bpjstku.domain.jht.model.ClaimSegmenItem;
import com.bpjstku.domain.jht.model.JhtClaimEligibility;
import com.bpjstku.domain.jht.model.JhtClaimTrack;
import com.bpjstku.domain.jht.model.JhtEligibility;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.domain.vocation.model.Bank;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Camera2CameraControlImplExternalSyntheticLambda4 extends ViewModel {
    public final MutableLiveData<VirtualCameraAdapter1<ClaimLivenessResponse>> INotificationSideChannel;
    public final removeOnPictureInPictureUiStateChangedListener INotificationSideChannelDefault;
    public final MutableLiveData<VirtualCameraAdapter1<ComponentActivityExternalSyntheticLambda10>> INotificationSideChannelStub;
    public final acquireBuffer INotificationSideChannelStubProxy;
    public final registerlambda1 IconCompatParcelizer;
    private final MutableLiveData<VirtualCameraAdapter1<JhtEligibility>> MediaBrowserCompat;
    public final MutableLiveData<VirtualCameraAdapter1<List<startActivityForResult>>> RemoteActionCompatParcelizer;
    public final MutableLiveData<VirtualCameraAdapter1<JhtClaimEligibility>> TuitionPaymentFragmentbindingInflater1;
    public final MutableLiveData<VirtualCameraAdapter1<JhtEligibility>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final MutableLiveData<VirtualCameraAdapter1<List<Bank>>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final MutableLiveData<VirtualCameraAdapter1<BaseModel>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableLiveData<VirtualCameraAdapter1<JhtClaimEmployeeDataItem>> f101a;
    public final MutableLiveData<VirtualCameraAdapter1<List<ReasonNotReactive>>> asBinder;
    public final MutableLiveData<VirtualCameraAdapter1<ClaimCheckBankBpuReactivationResponse>> asInterface;
    public final MutableLiveData<VirtualCameraAdapter1<BenefitDetail>> b;
    public final MutableLiveData<VirtualCameraAdapter1<ClaimReactivationBpuTuitionResponse>> cancel;
    public final MutableLiveData<VirtualCameraAdapter1<ClaimLivenessResponse>> cancelAll;
    public final setMaxItems connect;
    public final MutableLiveData<VirtualCameraAdapter1<BaseItem>> d;
    private final MutableLiveData<VirtualCameraAdapter1<BaseModel>> disconnect;
    public final MutableLiveData<VirtualCameraAdapter1<BaseModel>> g;
    private final MutableLiveData<VirtualCameraAdapter1<List<JhtContributionDetailItem>>> getExtras;
    public final MutableLiveData<VirtualCameraAdapter1<Boolean>> getInterfaceDescriptor;
    private final MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> getNotifyChildrenChangedOptions;
    private final MutableLiveData<VirtualCameraAdapter1<JhtEligibility>> getRoot;
    public final MutableLiveData<VirtualCameraAdapter1<List<setPictureInPictureParams>>> notify;
    public final MutableLiveData<VirtualCameraAdapter1<List<ClaimSegmenItem>>> onTransact;
    public final MutableLiveData<VirtualCameraAdapter1<JhtClaimTrack>> read;
    public final MutableLiveData<VirtualCameraAdapter1<BaseModel>> write;

    public Camera2CameraControlImplExternalSyntheticLambda4(removeOnPictureInPictureUiStateChangedListener removeonpictureinpictureuistatechangedlistener, setMaxItems setmaxitems, registerlambda1 registerlambda1Var, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(removeonpictureinpictureuistatechangedlistener, "");
        Intrinsics.checkNotNullParameter(setmaxitems, "");
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.INotificationSideChannelDefault = removeonpictureinpictureuistatechangedlistener;
        this.connect = setmaxitems;
        this.IconCompatParcelizer = registerlambda1Var;
        this.INotificationSideChannelStubProxy = acquirebuffer;
        this.INotificationSideChannelStub = new MutableLiveData<>();
        MutableLiveData<VirtualCameraAdapter1<JhtEligibility>> mutableLiveData = new MutableLiveData<>();
        this.getRoot = mutableLiveData;
        MutableLiveData<VirtualCameraAdapter1<List<setPictureInPictureParams>>> mutableLiveData2 = new MutableLiveData<>();
        this.notify = mutableLiveData2;
        MutableLiveData<VirtualCameraAdapter1<JhtEligibility>> mutableLiveData3 = new MutableLiveData<>();
        this.MediaBrowserCompat = mutableLiveData3;
        MutableLiveData<VirtualCameraAdapter1<Boolean>> mutableLiveData4 = new MutableLiveData<>();
        this.getInterfaceDescriptor = mutableLiveData4;
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData5 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mutableLiveData5;
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData6 = new MutableLiveData<>();
        this.g = mutableLiveData6;
        MutableLiveData<VirtualCameraAdapter1<BaseItem>> mutableLiveData7 = new MutableLiveData<>();
        this.d = mutableLiveData7;
        MutableLiveData<VirtualCameraAdapter1<List<Bank>>> mutableLiveData8 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mutableLiveData8;
        MutableLiveData<VirtualCameraAdapter1<JhtEligibility>> mutableLiveData9 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mutableLiveData9;
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData10 = new MutableLiveData<>();
        this.disconnect = mutableLiveData10;
        MutableLiveData<VirtualCameraAdapter1<JhtClaimTrack>> mutableLiveData11 = new MutableLiveData<>();
        this.read = mutableLiveData11;
        MutableLiveData<VirtualCameraAdapter1<BenefitDetail>> mutableLiveData12 = new MutableLiveData<>();
        this.b = mutableLiveData12;
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData13 = new MutableLiveData<>();
        this.write = mutableLiveData13;
        MutableLiveData<VirtualCameraAdapter1<JhtClaimEligibility>> mutableLiveData14 = new MutableLiveData<>();
        this.TuitionPaymentFragmentbindingInflater1 = mutableLiveData14;
        MutableLiveData<VirtualCameraAdapter1<JhtClaimEmployeeDataItem>> mutableLiveData15 = new MutableLiveData<>();
        this.f101a = mutableLiveData15;
        MutableLiveData<VirtualCameraAdapter1<List<JhtContributionDetailItem>>> mutableLiveData16 = new MutableLiveData<>();
        this.getExtras = mutableLiveData16;
        MutableLiveData<VirtualCameraAdapter1<List<startActivityForResult>>> mutableLiveData17 = new MutableLiveData<>();
        this.RemoteActionCompatParcelizer = mutableLiveData17;
        MutableLiveData<VirtualCameraAdapter1<ClaimLivenessResponse>> mutableLiveData18 = new MutableLiveData<>();
        this.INotificationSideChannel = mutableLiveData18;
        MutableLiveData<VirtualCameraAdapter1<ClaimLivenessResponse>> mutableLiveData19 = new MutableLiveData<>();
        this.cancelAll = mutableLiveData19;
        MutableLiveData<VirtualCameraAdapter1<List<ClaimSegmenItem>>> mutableLiveData20 = new MutableLiveData<>();
        this.onTransact = mutableLiveData20;
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData21 = new MutableLiveData<>();
        this.getNotifyChildrenChangedOptions = mutableLiveData21;
        MutableLiveData<VirtualCameraAdapter1<ClaimReactivationBpuTuitionResponse>> mutableLiveData22 = new MutableLiveData<>();
        this.cancel = mutableLiveData22;
        MutableLiveData<VirtualCameraAdapter1<ClaimCheckBankBpuReactivationResponse>> mutableLiveData23 = new MutableLiveData<>();
        this.asInterface = mutableLiveData23;
        MutableLiveData<VirtualCameraAdapter1<List<ReasonNotReactive>>> mutableLiveData24 = new MutableLiveData<>();
        this.asBinder = mutableLiveData24;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData17.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion3 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion4 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData3.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion5 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData4.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion6 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData5.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion7 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData6.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion8 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData8.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion9 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData9.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion10 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData10.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion11 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData11.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion12 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData12.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion13 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData13.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion14 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData7.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion15 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData14.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion16 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData15.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion17 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData16.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion18 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData17.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion19 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData18.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion20 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData19.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion21 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData20.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion22 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData21.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion23 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData22.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion24 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData23.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion25 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData24.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        MutableLiveData<VirtualCameraAdapter1<ComponentActivityExternalSyntheticLambda10>> mutableLiveData = this.INotificationSideChannelStub;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        User userAsBinder = this.IconCompatParcelizer.asBinder();
        if (userAsBinder != null) {
            String str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (str == null) {
                str = "";
            }
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new GenerateClaimCodeRequest(str))));
            final Function1 function1 = new Function1() { // from class: findSessionConfigForSurface
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Camera2CameraControlImplExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (ComponentActivityExternalSyntheticLambda10) obj);
                }
            };
            logToString logtostring = new logToString() { // from class: getCameraInfoInternal
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: getCameraControlInternal
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Camera2CameraControlImplExternalSyntheticLambda4.g(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Throwable) obj);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: finishClose
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function2.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            this.INotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    public final void TuitionPaymentFragmentbindingInflater1() {
        MutableLiveData<VirtualCameraAdapter1<List<setPictureInPictureParams>>> mutableLiveData = this.notify;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        User userAsBinder = this.IconCompatParcelizer.asBinder();
        if (userAsBinder != null) {
            String str = userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (str == null) {
                str = "";
            }
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ClaimReasonRequest(str))));
            final Function1 function1 = new Function1() { // from class: Camera2CameraControlImplCameraCaptureCallbackSet
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Camera2CameraControlImplExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (List) obj);
                }
            };
            logToString logtostring = new logToString() { // from class: Camera2CameraControlImplExternalSyntheticLambda9
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: onCaptureCompleted
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Camera2CameraControlImplExternalSyntheticLambda4.a(this.TuitionPaymentFragmentbindingInflater1, (Throwable) obj);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: onCaptureFailed
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function2.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            this.INotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(CheckBankAccountRequest checkBankAccountRequest) {
        Intrinsics.checkNotNullParameter(checkBankAccountRequest, "");
        MutableLiveData<VirtualCameraAdapter1<JhtEligibility>> mutableLiveData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new CheckBankAccountRequest(checkBankAccountRequest.getKodeBank(), checkBankAccountRequest.getNamaBank(), checkBankAccountRequest.getNamaRekening(), checkBankAccountRequest.getNomorRekening()))));
        final Function1 function1 = new Function1() { // from class: notifyStateAttachedAndCameraControlReady
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Camera2CameraControlImplExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (JhtEligibility) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: openCameraConfigAndClose
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: openCameraDevice
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Camera2CameraControlImplExternalSyntheticLambda4.cancel(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: openInternal
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.INotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void b() {
        Camera2CameraControlExternalSyntheticLambda5.b(Camera2CameraControlExternalSyntheticLambda5.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        MutableLiveData<VirtualCameraAdapter1<BenefitDetail>> mutableLiveData = this.b;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        User userAsBinder = this.IconCompatParcelizer.asBinder();
        String str = userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        if (str == null) {
            str = "";
        }
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.INotificationSideChannelDefault.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new JhtBenefitDetailRequest(str))));
        final Function1 function1 = new Function1() { // from class: Camera2CameraControlImplCameraControlSessionCallbackExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Camera2CameraControlImplExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (BenefitDetail) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: lambdaonCaptureCompleted0androidxcameracamera2internalCamera2CameraControlImplCameraControlSessionCallback
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: Camera2CameraFactory
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Camera2CameraControlImplExternalSyntheticLambda4.asInterface(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getCamera
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.INotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        MutableLiveData<VirtualCameraAdapter1<List<ClaimSegmenItem>>> mutableLiveData = this.onTransact;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        User userAsBinder = this.IconCompatParcelizer.asBinder();
        removeOnPictureInPictureUiStateChangedListener removeonpictureinpictureuistatechangedlistener = this.INotificationSideChannelDefault;
        String str = userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        if (str == null) {
            str = "";
        }
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(removeonpictureinpictureuistatechangedlistener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(new ClaimSegmenRequest(str))));
        final Function1 function1 = new Function1() { // from class: notifyStateDetachedToUseCases
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Camera2CameraControlImplExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: updateZslDisabledByUseCaseConfigStatus
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: isMeteringRepeatingAttached
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Camera2CameraControlImplExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: lambdaonCaptureCompleted0
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.INotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, Boolean bool) {
        MutableLiveData<VirtualCameraAdapter1<Boolean>> mutableLiveData = camera2CameraControlImplExternalSyntheticLambda4.getInterfaceDescriptor;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(bool));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, ClaimReactivationBpuTuitionResponse claimReactivationBpuTuitionResponse) {
        MutableLiveData<VirtualCameraAdapter1<ClaimReactivationBpuTuitionResponse>> mutableLiveData = camera2CameraControlImplExternalSyntheticLambda4.cancel;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(claimReactivationBpuTuitionResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, camera2CameraControlImplExternalSyntheticLambda4.onTransact);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, camera2CameraControlImplExternalSyntheticLambda4.read);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, JhtClaimTrack jhtClaimTrack) {
        MutableLiveData<VirtualCameraAdapter1<JhtClaimTrack>> mutableLiveData = camera2CameraControlImplExternalSyntheticLambda4.read;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(jhtClaimTrack));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, JhtClaimEmployeeDataItem jhtClaimEmployeeDataItem) {
        MutableLiveData<VirtualCameraAdapter1<JhtClaimEmployeeDataItem>> mutableLiveData = camera2CameraControlImplExternalSyntheticLambda4.f101a;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(jhtClaimEmployeeDataItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, camera2CameraControlImplExternalSyntheticLambda4.asBinder);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, ClaimLivenessResponse claimLivenessResponse) {
        MutableLiveData<VirtualCameraAdapter1<ClaimLivenessResponse>> mutableLiveData = camera2CameraControlImplExternalSyntheticLambda4.cancelAll;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(claimLivenessResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, ClaimLivenessResponse claimLivenessResponse) {
        MutableLiveData<VirtualCameraAdapter1<ClaimLivenessResponse>> mutableLiveData = camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannel;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(claimLivenessResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, BenefitDetail benefitDetail) {
        MutableLiveData<VirtualCameraAdapter1<BenefitDetail>> mutableLiveData = camera2CameraControlImplExternalSyntheticLambda4.b;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(benefitDetail));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannel);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, camera2CameraControlImplExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asBinder(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, camera2CameraControlImplExternalSyntheticLambda4.getInterfaceDescriptor);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, ComponentActivityExternalSyntheticLambda10 componentActivityExternalSyntheticLambda10) {
        MutableLiveData<VirtualCameraAdapter1<ComponentActivityExternalSyntheticLambda10>> mutableLiveData = camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannelStub;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(componentActivityExternalSyntheticLambda10));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<Bank>>> mutableLiveData = camera2CameraControlImplExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asInterface(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, camera2CameraControlImplExternalSyntheticLambda4.b);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, JhtEligibility jhtEligibility) {
        MutableLiveData<VirtualCameraAdapter1<JhtEligibility>> mutableLiveData = camera2CameraControlImplExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(jhtEligibility));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<startActivityForResult>>> mutableLiveData = camera2CameraControlImplExternalSyntheticLambda4.RemoteActionCompatParcelizer;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit d(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, camera2CameraControlImplExternalSyntheticLambda4.asInterface);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit g(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannelStub);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<ClaimSegmenItem>>> mutableLiveData = camera2CameraControlImplExternalSyntheticLambda4.onTransact;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit a(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, camera2CameraControlImplExternalSyntheticLambda4.notify);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<setPictureInPictureParams>>> mutableLiveData = camera2CameraControlImplExternalSyntheticLambda4.notify;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit cancelAll(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, camera2CameraControlImplExternalSyntheticLambda4.cancelAll);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit onTransact(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, camera2CameraControlImplExternalSyntheticLambda4.RemoteActionCompatParcelizer);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit cancel(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, camera2CameraControlImplExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit getInterfaceDescriptor(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, camera2CameraControlImplExternalSyntheticLambda4.write);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, BaseModel baseModel) {
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = camera2CameraControlImplExternalSyntheticLambda4.write;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseModel));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, JhtClaimEligibility jhtClaimEligibility) {
        MutableLiveData<VirtualCameraAdapter1<JhtClaimEligibility>> mutableLiveData = camera2CameraControlImplExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(jhtClaimEligibility));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit INotificationSideChannel(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, camera2CameraControlImplExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit notify(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, camera2CameraControlImplExternalSyntheticLambda4.f101a);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit INotificationSideChannelStubProxy(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, camera2CameraControlImplExternalSyntheticLambda4.cancel);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, ClaimCheckBankBpuReactivationResponse claimCheckBankBpuReactivationResponse) {
        MutableLiveData<VirtualCameraAdapter1<ClaimCheckBankBpuReactivationResponse>> mutableLiveData = camera2CameraControlImplExternalSyntheticLambda4.asInterface;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(claimCheckBankBpuReactivationResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<ReasonNotReactive>>> mutableLiveData = camera2CameraControlImplExternalSyntheticLambda4.asBinder;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }
}
