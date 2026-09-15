package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.jp.model.request.CheckEligibilityJpRequest;
import com.bpjstku.data.jp.model.request.GetCountClaimJpRequest;
import com.bpjstku.data.jp.model.request.GetJpBenefitRequest;
import com.bpjstku.data.jp.model.response.JpVerificationResponse;
import com.bpjstku.domain.general.model.BaseModel;
import com.bpjstku.domain.jp.model.CheckEligibleJp;
import com.bpjstku.domain.jp.model.GetCountClaimJp;
import com.bpjstku.domain.jp.model.JpDataTk;
import com.bpjstku.domain.user.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class stopRepeating extends ViewModel {
    public final ComponentActivityReportFullyDrawnExecutorImpl TuitionPaymentFragmentbindingInflater1;
    public final MutableLiveData<VirtualCameraAdapter1<GetCountClaimJp>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final MutableLiveData<VirtualCameraAdapter1<CheckEligibleJp>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MutableLiveData<VirtualCameraAdapter1<BaseModel>> f1408a;
    private final registerlambda1 asBinder;
    public final MutableLiveData<VirtualCameraAdapter1<JpVerificationResponse>> asInterface;
    public final MutableLiveData<VirtualCameraAdapter1<activityDestroyed>> b;
    public final MutableLiveData<VirtualCameraAdapter1<JpVerificationResponse>> d;

    public stopRepeating(registerlambda1 registerlambda1Var, ComponentActivityReportFullyDrawnExecutorImpl componentActivityReportFullyDrawnExecutorImpl, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        Intrinsics.checkNotNullParameter(componentActivityReportFullyDrawnExecutorImpl, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.asBinder = registerlambda1Var;
        this.TuitionPaymentFragmentbindingInflater1 = componentActivityReportFullyDrawnExecutorImpl;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<GetCountClaimJp>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mutableLiveData;
        MutableLiveData<VirtualCameraAdapter1<CheckEligibleJp>> mutableLiveData2 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mutableLiveData2;
        MutableLiveData<VirtualCameraAdapter1<activityDestroyed>> mutableLiveData3 = new MutableLiveData<>();
        this.b = mutableLiveData3;
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData4 = new MutableLiveData<>();
        this.f1408a = mutableLiveData4;
        MutableLiveData<VirtualCameraAdapter1<JpVerificationResponse>> mutableLiveData5 = new MutableLiveData<>();
        this.d = mutableLiveData5;
        MutableLiveData<VirtualCameraAdapter1<JpVerificationResponse>> mutableLiveData6 = new MutableLiveData<>();
        this.asInterface = mutableLiveData6;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion3 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData3.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion4 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData4.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion5 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData5.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion6 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData6.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        MutableLiveData<VirtualCameraAdapter1<GetCountClaimJp>> mutableLiveData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        User userAsBinder = this.asBinder.asBinder();
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new GetCountClaimJpRequest(String.valueOf(userAsBinder != null ? userAsBinder.b : null), String.valueOf(userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null)))));
        final Function1 function1 = new Function1() { // from class: submit
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return stopRepeating.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (GetCountClaimJp) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: Camera2SessionOptionUnpacker
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: CameraBurstCaptureCallbackCaptureSequenceCallback
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return stopRepeating.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: CameraBurstCaptureCallback
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(JpDataTk jpDataTk) {
        Intrinsics.checkNotNullParameter(jpDataTk, "");
        MutableLiveData<VirtualCameraAdapter1<CheckEligibleJp>> mutableLiveData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        User userAsBinder = this.asBinder.asBinder();
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1.b(new CheckEligibilityJpRequest(String.valueOf(userAsBinder != null ? userAsBinder.b : null), String.valueOf(userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : null), jpDataTk.TuitionPaymentFragmentspecialinlinedviewModeldefault2, String.valueOf(userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null)))));
        final Function1 function1 = new Function1() { // from class: isRequestValid
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return stopRepeating.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (CheckEligibleJp) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: getConfig
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: setCaptureSequenceCallback
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return stopRepeating.b(this.b, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: addCamera2Callbacks
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        MutableLiveData<VirtualCameraAdapter1<activityDestroyed>> mutableLiveData = this.b;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        User userAsBinder = this.asBinder.asBinder();
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1(new GetJpBenefitRequest(str, String.valueOf(userAsBinder != null ? userAsBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null)))));
        final Function1 function1 = new Function1() { // from class: onActive
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return stopRepeating.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (activityDestroyed) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: CameraCaptureSessionStateCallbacks
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: Camera2UseCaseConfigFactory
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return stopRepeating.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: onCaptureSequenceCompletedOrAborted
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(stopRepeating stoprepeating, JpVerificationResponse jpVerificationResponse) {
        MutableLiveData<VirtualCameraAdapter1<JpVerificationResponse>> mutableLiveData = stoprepeating.d;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(jpVerificationResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(stopRepeating stoprepeating, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, stoprepeating.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(stopRepeating stoprepeating, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, stoprepeating.d);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(stopRepeating stoprepeating, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, stoprepeating.b);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(stopRepeating stoprepeating, CheckEligibleJp checkEligibleJp) {
        MutableLiveData<VirtualCameraAdapter1<CheckEligibleJp>> mutableLiveData = stoprepeating.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(checkEligibleJp));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(stopRepeating stoprepeating, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, stoprepeating.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(stopRepeating stoprepeating, JpVerificationResponse jpVerificationResponse) {
        MutableLiveData<VirtualCameraAdapter1<JpVerificationResponse>> mutableLiveData = stoprepeating.asInterface;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(jpVerificationResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(stopRepeating stoprepeating, GetCountClaimJp getCountClaimJp) {
        MutableLiveData<VirtualCameraAdapter1<GetCountClaimJp>> mutableLiveData = stoprepeating.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(getCountClaimJp));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(stopRepeating stoprepeating, activityDestroyed activitydestroyed) {
        MutableLiveData<VirtualCameraAdapter1<activityDestroyed>> mutableLiveData = stoprepeating.b;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(activitydestroyed));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(stopRepeating stoprepeating, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, stoprepeating.asInterface);
        return Unit.INSTANCE;
    }
}
