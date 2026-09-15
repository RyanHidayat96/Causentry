package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.jht.model.request.ClaimEvidenceJhtRequest;
import com.bpjstku.data.jht.model.request.JhtBalanceRequest;
import com.bpjstku.data.jht.model.response.ClaimEvidenceJhtResponse;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.jht.model.JhtBalance;
import com.bpjstku.domain.jht.model.JhtSubscription;
import com.bpjstku.domain.user.model.User;
import java.io.InputStream;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class isModeInList extends ViewModel {
    public final MutableLiveData<VirtualCameraAdapter1<List<JhtBalance>>> TuitionPaymentFragmentbindingInflater1;
    public final MutableLiveData<VirtualCameraAdapter1<ClaimEvidenceJhtResponse>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final MutableLiveData<VirtualCameraAdapter1<List<JhtBalance>>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final removeOnPictureInPictureUiStateChangedListener f1223a;
    private final registerlambda1 asBinder;
    public final MutableLiveData<VirtualCameraAdapter1<InputStream>> b;
    public final MutableLiveData<VirtualCameraAdapter1<BaseModel>> d;
    private final MutableLiveData<VirtualCameraAdapter1<List<JhtSubscription>>> g;

    public isModeInList(removeOnPictureInPictureUiStateChangedListener removeonpictureinpictureuistatechangedlistener, registerlambda1 registerlambda1Var, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(removeonpictureinpictureuistatechangedlistener, "");
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.f1223a = removeonpictureinpictureuistatechangedlistener;
        this.asBinder = registerlambda1Var;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<List<JhtBalance>>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentbindingInflater1 = mutableLiveData;
        MutableLiveData<VirtualCameraAdapter1<List<JhtBalance>>> mutableLiveData2 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mutableLiveData2;
        MutableLiveData<VirtualCameraAdapter1<List<JhtSubscription>>> mutableLiveData3 = new MutableLiveData<>();
        this.g = mutableLiveData3;
        MutableLiveData<VirtualCameraAdapter1<InputStream>> mutableLiveData4 = new MutableLiveData<>();
        this.b = mutableLiveData4;
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData5 = new MutableLiveData<>();
        this.d = mutableLiveData5;
        MutableLiveData<VirtualCameraAdapter1<ClaimEvidenceJhtResponse>> mutableLiveData6 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mutableLiveData6;
        mutableLiveData.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData2.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData3.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData4.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData5.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData6.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        deriveCodec derivecodecB;
        MutableLiveData<VirtualCameraAdapter1<List<JhtBalance>>> mutableLiveData = this.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec<List<JhtBalance>> derivecodecTuitionPaymentFragmentspecialinlinedviewModeldefault3 = this.f1223a.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        if (derivecodecTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null || (derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(derivecodecTuitionPaymentFragmentspecialinlinedviewModeldefault3))) == null) {
            return;
        }
        final Function1 function1 = new Function1() { // from class: enableTorch
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return isModeInList.b(this.b, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: clearInteropConfig
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: getCamera2CameraControl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return isModeInList.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Throwable) obj);
            }
        };
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: getSupportedAwbMode
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        }));
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        MutableLiveData<VirtualCameraAdapter1<List<JhtBalance>>> mutableLiveData = this.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        User userAsBinder = this.asBinder.asBinder();
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.f1223a.TuitionPaymentFragmentspecialinlinedviewModeldefault2(new JhtBalanceRequest(String.valueOf(userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null), true))));
        if (derivecodecB != null) {
            final Function1 function1 = new Function1() { // from class: isControlInUse
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return isModeInList.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (List) obj);
                }
            };
            logToString logtostring = new logToString() { // from class: Camera2CameraControlImpl
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: lambdaaddInteropConfig0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return isModeInList.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Throwable) obj);
                }
            };
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: addInteropConfig
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function2.invoke(obj);
                }
            }));
        }
    }

    public final void TuitionPaymentFragmentbindingInflater1(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        MutableLiveData<VirtualCameraAdapter1<ClaimEvidenceJhtResponse>> mutableLiveData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        User userAsBinder = this.asBinder.asBinder();
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.f1223a.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new ClaimEvidenceJhtRequest(String.valueOf(userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null), str, str2))));
        final Function1 function1 = new Function1() { // from class: cancelFocusAndMetering
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return isModeInList.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (ClaimEvidenceJhtResponse) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: addCaptureResultListener
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: addZslConfig
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return isModeInList.b(this.TuitionPaymentFragmentbindingInflater1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: enableTorchInternal
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isDisposed()) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.dispose();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(isModeInList ismodeinlist, BaseModel baseModel) {
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = ismodeinlist.d;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseModel));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(isModeInList ismodeinlist, InputStream inputStream) {
        MutableLiveData<VirtualCameraAdapter1<InputStream>> mutableLiveData = ismodeinlist.b;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(inputStream));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(isModeInList ismodeinlist, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<JhtBalance>>> mutableLiveData = ismodeinlist.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(isModeInList ismodeinlist, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<JhtBalance>>> mutableLiveData = ismodeinlist.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(isModeInList ismodeinlist, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, ismodeinlist.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(isModeInList ismodeinlist, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, ismodeinlist.d);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(isModeInList ismodeinlist, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, ismodeinlist.b);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(isModeInList ismodeinlist, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, ismodeinlist.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(isModeInList ismodeinlist, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, ismodeinlist.TuitionPaymentFragmentbindingInflater1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(isModeInList ismodeinlist, ClaimEvidenceJhtResponse claimEvidenceJhtResponse) {
        MutableLiveData<VirtualCameraAdapter1<ClaimEvidenceJhtResponse>> mutableLiveData = ismodeinlist.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(claimEvidenceJhtResponse));
        return Unit.INSTANCE;
    }
}
