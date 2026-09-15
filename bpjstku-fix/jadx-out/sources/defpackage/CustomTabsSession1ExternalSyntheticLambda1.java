package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.multibiller.model.request.MultiBillerCheckTransactionRequest;
import com.bpjstku.data.multibiller.model.request.MultiBillerTransactionRequest;
import com.bpjstku.data.multibiller.model.response.MultiBillerAuthResponse;
import com.bpjstku.data.multibiller.model.response.MultiBillerAuthTransactionResponse;
import com.bpjstku.data.multibiller.model.response.MultiBillerCheckRegisterResponse;
import com.bpjstku.data.multibiller.model.response.MultiBillerCheckTransactionResponse;
import com.bpjstku.data.multibiller.model.response.MultiBillerRegistrationResponse;
import com.bpjstku.data.multibiller.model.response.MultiBillerTokenResponse;
import com.bpjstku.data.multibiller.model.response.MultiBillerTransactionResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomTabsSession1ExternalSyntheticLambda1 extends ViewModel {
    public final MutableLiveData<VirtualCameraAdapter1<MultiBillerCheckTransactionResponse>> TuitionPaymentFragmentbindingInflater1;
    public final MutableLiveData<Boolean> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final MutableLiveData<VirtualCameraAdapter1<MultiBillerTransactionResponse>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final MutableLiveData<MultiBillerAuthResponse> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final acquireBuffer f123a;
    private final MutableLiveData<VirtualCameraAdapter1<MultiBillerAuthTransactionResponse>> asBinder;
    private final MutableLiveData<MultiBillerRegistrationResponse> asInterface;
    private final MutableLiveData<VirtualCameraAdapter1<MultiBillerAuthResponse>> b;
    private final MutableLiveData<VirtualCameraAdapter1<MultiBillerTokenResponse>> cancelAll;
    private final MutableLiveData<VirtualCameraAdapter1<MultiBillerCheckRegisterResponse>> d;
    private final ComponentActivityactivityResultRegistry1ExternalSyntheticLambda0 g;
    private final MutableLiveData<VirtualCameraAdapter1<MultiBillerRegistrationResponse>> onTransact;

    public CustomTabsSession1ExternalSyntheticLambda1(ComponentActivityactivityResultRegistry1ExternalSyntheticLambda0 componentActivityactivityResultRegistry1ExternalSyntheticLambda0, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(componentActivityactivityResultRegistry1ExternalSyntheticLambda0, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.g = componentActivityactivityResultRegistry1ExternalSyntheticLambda0;
        this.f123a = acquirebuffer;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new MutableLiveData<>(Boolean.FALSE);
        MutableLiveData<VirtualCameraAdapter1<MultiBillerTransactionResponse>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mutableLiveData;
        MutableLiveData<VirtualCameraAdapter1<MultiBillerRegistrationResponse>> mutableLiveData2 = new MutableLiveData<>();
        this.onTransact = mutableLiveData2;
        MutableLiveData<VirtualCameraAdapter1<MultiBillerTokenResponse>> mutableLiveData3 = new MutableLiveData<>();
        this.cancelAll = mutableLiveData3;
        MutableLiveData<VirtualCameraAdapter1<MultiBillerAuthResponse>> mutableLiveData4 = new MutableLiveData<>();
        this.b = mutableLiveData4;
        MutableLiveData<VirtualCameraAdapter1<MultiBillerAuthTransactionResponse>> mutableLiveData5 = new MutableLiveData<>();
        this.asBinder = mutableLiveData5;
        MutableLiveData<VirtualCameraAdapter1<MultiBillerCheckTransactionResponse>> mutableLiveData6 = new MutableLiveData<>();
        this.TuitionPaymentFragmentbindingInflater1 = mutableLiveData6;
        MutableLiveData<VirtualCameraAdapter1<MultiBillerCheckRegisterResponse>> mutableLiveData7 = new MutableLiveData<>();
        this.d = mutableLiveData7;
        this.asInterface = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new MutableLiveData<>();
        mutableLiveData.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData2.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData3.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData4.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData5.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData6.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
        mutableLiveData7.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(MultiBillerTransactionRequest multiBillerTransactionRequest) {
        Intrinsics.checkNotNullParameter(multiBillerTransactionRequest, "");
        MutableLiveData<VirtualCameraAdapter1<MultiBillerTransactionResponse>> mutableLiveData = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.g.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiBillerTransactionRequest)));
        if (derivecodecB != null) {
            final Function1 function1 = new Function1() { // from class: CustomTabsSession2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CustomTabsSession1ExternalSyntheticLambda1.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (MultiBillerTransactionResponse) obj);
                }
            };
            logToString logtostring = new logToString() { // from class: CustomTabsSession2ExternalSyntheticLambda1
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: CustomTabsSession1ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CustomTabsSession1ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Throwable) obj);
                }
            };
            this.f123a.TuitionPaymentFragmentspecialinlinedviewModeldefault3(derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: CustomTabsSession1ExternalSyntheticLambda2
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function2.invoke(obj);
                }
            }));
        }
    }

    public final void TuitionPaymentFragmentbindingInflater1(MultiBillerCheckTransactionRequest multiBillerCheckTransactionRequest) {
        Intrinsics.checkNotNullParameter(multiBillerCheckTransactionRequest, "");
        MutableLiveData<VirtualCameraAdapter1<MultiBillerCheckTransactionResponse>> mutableLiveData = this.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(this.g.b(multiBillerCheckTransactionRequest)));
        if (derivecodecB != null) {
            final Function1 function1 = new Function1() { // from class: onSessionEnded
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CustomTabsSession1ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1, (MultiBillerCheckTransactionResponse) obj);
                }
            };
            logToString logtostring = new logToString() { // from class: onGreatestScrollPercentageIncreased
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: CustomTabsSession2ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CustomTabsSession1ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (Throwable) obj);
                }
            };
            this.f123a.TuitionPaymentFragmentspecialinlinedviewModeldefault3(derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: CustomTabsSession2ExternalSyntheticLambda0
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function2.invoke(obj);
                }
            }));
        }
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.f123a.isDisposed()) {
            return;
        }
        this.f123a.dispose();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(CustomTabsSession1ExternalSyntheticLambda1 customTabsSession1ExternalSyntheticLambda1, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, customTabsSession1ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(CustomTabsSession1ExternalSyntheticLambda1 customTabsSession1ExternalSyntheticLambda1, MultiBillerTransactionResponse multiBillerTransactionResponse) {
        MutableLiveData<VirtualCameraAdapter1<MultiBillerTransactionResponse>> mutableLiveData = customTabsSession1ExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(multiBillerTransactionResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(CustomTabsSession1ExternalSyntheticLambda1 customTabsSession1ExternalSyntheticLambda1, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, customTabsSession1ExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(CustomTabsSession1ExternalSyntheticLambda1 customTabsSession1ExternalSyntheticLambda1, MultiBillerCheckTransactionResponse multiBillerCheckTransactionResponse) {
        MutableLiveData<VirtualCameraAdapter1<MultiBillerCheckTransactionResponse>> mutableLiveData = customTabsSession1ExternalSyntheticLambda1.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(multiBillerCheckTransactionResponse));
        return Unit.INSTANCE;
    }
}
