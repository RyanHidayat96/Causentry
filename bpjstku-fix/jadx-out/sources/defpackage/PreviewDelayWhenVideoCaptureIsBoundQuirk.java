package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.lib.PreferenceManager;
import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.data.vocation.model.request.BlkProfileRequest;
import com.bpjstku.data.vocation.model.request.VocationPhoneVerificationRequest;
import com.bpjstku.data.vocation.model.request.VocationProfileRequest;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.registration.general.model.Verification;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.domain.vocation.model.Bank;
import com.bpjstku.domain.vocation.model.Training;
import com.bpjstku.domain.vocation.model.TrainingField;
import com.bpjstku.domain.vocation.model.VocationProfile;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PreviewDelayWhenVideoCaptureIsBoundQuirk extends ViewModel {
    public final MutableLiveData<VirtualCameraAdapter1<Verification>> INotificationSideChannel;
    private final PreferenceManager INotificationSideChannelDefault;
    public final setMaxItems RemoteActionCompatParcelizer;
    public final MutableLiveData<VirtualCameraAdapter1<Pair<List<PickVisualMediaRequestdefault>, List<getSynchronousResult>>>> TuitionPaymentFragmentbindingInflater1;
    final MutableLiveData<VirtualCameraAdapter1<List<Bank>>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final MutableLiveData<VirtualCameraAdapter1<BaseModel>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> f196a;
    public final MutableLiveData<VirtualCameraAdapter1<List<ActivityResultContractSynchronousResult>>> asBinder;
    final MutableLiveData<VirtualCameraAdapter1<List<Training>>> asInterface;
    final MutableLiveData<VirtualCameraAdapter1<setMediaCapabilitiesForTranscoding>> b;
    public final Lazy cancel;
    public final MutableLiveData<VirtualCameraAdapter1<BaseModel>> cancelAll;
    public final MutableLiveData<VirtualCameraAdapter1<List<TrainingField>>> d;
    final MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> g;
    public final MutableLiveData<VirtualCameraAdapter1<BaseModel>> notify;
    public final MutableLiveData<VirtualCameraAdapter1<VocationProfile>> onTransact;

    public PreviewDelayWhenVideoCaptureIsBoundQuirk(setMaxItems setmaxitems, PreferenceManager preferenceManager, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(setmaxitems, "");
        Intrinsics.checkNotNullParameter(preferenceManager, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.RemoteActionCompatParcelizer = setmaxitems;
        this.INotificationSideChannelDefault = preferenceManager;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mutableLiveData;
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData2 = new MutableLiveData<>();
        this.g = mutableLiveData2;
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData3 = new MutableLiveData<>();
        this.f196a = mutableLiveData3;
        MutableLiveData<VirtualCameraAdapter1<VocationProfile>> mutableLiveData4 = new MutableLiveData<>();
        this.onTransact = mutableLiveData4;
        MutableLiveData<VirtualCameraAdapter1<List<Training>>> mutableLiveData5 = new MutableLiveData<>();
        this.asInterface = mutableLiveData5;
        MutableLiveData<VirtualCameraAdapter1<setMediaCapabilitiesForTranscoding>> mutableLiveData6 = new MutableLiveData<>();
        this.b = mutableLiveData6;
        MutableLiveData<VirtualCameraAdapter1<List<Bank>>> mutableLiveData7 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mutableLiveData7;
        MutableLiveData<VirtualCameraAdapter1<List<TrainingField>>> mutableLiveData8 = new MutableLiveData<>();
        this.d = mutableLiveData8;
        MutableLiveData<VirtualCameraAdapter1<Pair<List<PickVisualMediaRequestdefault>, List<getSynchronousResult>>>> mutableLiveData9 = new MutableLiveData<>();
        this.TuitionPaymentFragmentbindingInflater1 = mutableLiveData9;
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData10 = new MutableLiveData<>();
        this.cancelAll = mutableLiveData10;
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData11 = new MutableLiveData<>();
        this.INotificationSideChannel = mutableLiveData11;
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData12 = new MutableLiveData<>();
        this.notify = mutableLiveData12;
        MutableLiveData<VirtualCameraAdapter1<List<ActivityResultContractSynchronousResult>>> mutableLiveData13 = new MutableLiveData<>();
        this.asBinder = mutableLiveData13;
        this.cancel = LazyKt.lazy(new Function0() { // from class: isSamsungJ7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PreviewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar3 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData3.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar4 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData4.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar5 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData5.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar6 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData6.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar7 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData7.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar8 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData8.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar9 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData9.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar10 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData10.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar11 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData11.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar12 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData12.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion bVar13 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData13.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(VocationProfileRequest vocationProfileRequest) {
        Intrinsics.checkNotNullParameter(vocationProfileRequest, "");
        MutableLiveData<VirtualCameraAdapter1<VocationProfile>> mutableLiveData = this.onTransact;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.RemoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault2(vocationProfileRequest)));
        final Function1 function1 = new Function1() { // from class: isXiaomiMiA1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreviewDelayWhenVideoCaptureIsBoundQuirk.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (VocationProfile) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new logToString() { // from class: AeFpsRange
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        }, new isAffectedXiaoMiDevices(new Function1() { // from class: addAeFpsRangeOptions
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreviewDelayWhenVideoCaptureIsBoundQuirk.d(this.b, (Throwable) obj);
            }
        }));
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentbindingInflater1(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        MutableLiveData<VirtualCameraAdapter1<Pair<List<PickVisualMediaRequestdefault>, List<getSynchronousResult>>>> mutableLiveData = this.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.RemoteActionCompatParcelizer.b(new BlkProfileRequest(str))));
        final Function1 function1 = new Function1() { // from class: DisplaySizeCorrector
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreviewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Pair) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: FlashAvailabilityChecker
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: ForceCloseCaptureSession
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreviewDelayWhenVideoCaptureIsBoundQuirk.a(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: ForceCloseDeferrableSurface
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void b(VocationPhoneVerificationRequest vocationPhoneVerificationRequest) {
        Intrinsics.checkNotNullParameter(vocationPhoneVerificationRequest, "");
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = this.INotificationSideChannel;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.RemoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault1(vocationPhoneVerificationRequest)));
        final Function1 function1 = new Function1() { // from class: onSessionEnd
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreviewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (Verification) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: ImageCapturePixelHDRPlus
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: isOppoA37F
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreviewDelayWhenVideoCaptureIsBoundQuirk.asBinder(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: TemporalNoiseQuirk
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        MutableLiveData<VirtualCameraAdapter1<List<ActivityResultContractSynchronousResult>>> mutableLiveData = this.asBinder;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.RemoteActionCompatParcelizer.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new BaseRequest())));
        final Function1 function1 = new Function1() { // from class: SmallDisplaySizeQuirk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreviewDelayWhenVideoCaptureIsBoundQuirk.asInterface(this.TuitionPaymentFragmentbindingInflater1, (List) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new logToString() { // from class: isFrontCamera
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        }, new TextureViewIsClosedQuirk(new Function1() { // from class: isExternalFlashAeModeSupported
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreviewDelayWhenVideoCaptureIsBoundQuirk.g(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Throwable) obj);
            }
        }));
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.isDisposed()) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.dispose();
    }

    public static /* synthetic */ Unit b(PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, previewDelayWhenVideoCaptureIsBoundQuirk.g);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, previewDelayWhenVideoCaptureIsBoundQuirk.b);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, previewDelayWhenVideoCaptureIsBoundQuirk.d);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, previewDelayWhenVideoCaptureIsBoundQuirk.asInterface);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, previewDelayWhenVideoCaptureIsBoundQuirk.notify);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk, Verification verification) {
        MutableLiveData<VirtualCameraAdapter1<Verification>> mutableLiveData = previewDelayWhenVideoCaptureIsBoundQuirk.INotificationSideChannel;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(verification));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData = previewDelayWhenVideoCaptureIsBoundQuirk.g;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk, Pair pair) {
        MutableLiveData<VirtualCameraAdapter1<Pair<List<PickVisualMediaRequestdefault>, List<getSynchronousResult>>>> mutableLiveData = previewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(pair));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit g(PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, previewDelayWhenVideoCaptureIsBoundQuirk.asBinder);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit d(PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, previewDelayWhenVideoCaptureIsBoundQuirk.onTransact);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk, BaseModel baseModel) {
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = previewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseModel));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asInterface(PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, previewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asBinder(PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, previewDelayWhenVideoCaptureIsBoundQuirk.INotificationSideChannel);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk, VocationProfile vocationProfile) {
        MutableLiveData<VirtualCameraAdapter1<VocationProfile>> mutableLiveData = previewDelayWhenVideoCaptureIsBoundQuirk.onTransact;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(vocationProfile));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit a(PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, previewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentbindingInflater1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk, BaseModel baseModel) {
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = previewDelayWhenVideoCaptureIsBoundQuirk.cancelAll;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseModel));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk, BaseModel baseModel) {
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = previewDelayWhenVideoCaptureIsBoundQuirk.notify;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseModel));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<Training>>> mutableLiveData = previewDelayWhenVideoCaptureIsBoundQuirk.asInterface;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<TrainingField>>> mutableLiveData = previewDelayWhenVideoCaptureIsBoundQuirk.d;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit cancel(PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, previewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData = previewDelayWhenVideoCaptureIsBoundQuirk.f196a;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit cancelAll(PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, previewDelayWhenVideoCaptureIsBoundQuirk.cancelAll);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<Bank>>> mutableLiveData = previewDelayWhenVideoCaptureIsBoundQuirk.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit asInterface(PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<ActivityResultContractSynchronousResult>>> mutableLiveData = previewDelayWhenVideoCaptureIsBoundQuirk.asBinder;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ User TuitionPaymentFragmentbindingInflater1(PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk) {
        return (User) previewDelayWhenVideoCaptureIsBoundQuirk.INotificationSideChannelDefault.getObject("USER_OBJECT", User.class);
    }

    public static /* synthetic */ Unit INotificationSideChannel(PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, previewDelayWhenVideoCaptureIsBoundQuirk.f196a);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(PreviewDelayWhenVideoCaptureIsBoundQuirk previewDelayWhenVideoCaptureIsBoundQuirk, setMediaCapabilitiesForTranscoding setmediacapabilitiesfortranscoding) {
        MutableLiveData<VirtualCameraAdapter1<setMediaCapabilitiesForTranscoding>> mutableLiveData = previewDelayWhenVideoCaptureIsBoundQuirk.b;
        VirtualCameraAdapter1.Companion bVar = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(setmediacapabilitiesfortranscoding));
        return Unit.INSTANCE;
    }
}
