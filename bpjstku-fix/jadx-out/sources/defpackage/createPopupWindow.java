package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.danasiaga.model.response.CheckEligiblePinangResponse;
import com.bpjstku.data.danasiaga.model.response.EligibleIctMenuResponse;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class createPopupWindow extends ViewModel {
    public final MutableLiveData<VirtualCameraAdapter1<EligibleIctMenuResponse>> TuitionPaymentFragmentbindingInflater1;
    public final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final _init_lambda2 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final registerlambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final MutableLiveData<VirtualCameraAdapter1<CheckEligiblePinangResponse>> b;

    public createPopupWindow(acquireBuffer acquirebuffer, _init_lambda2 _init_lambda2Var, registerlambda1 registerlambda1Var) {
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        Intrinsics.checkNotNullParameter(_init_lambda2Var, "");
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = acquirebuffer;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = _init_lambda2Var;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = registerlambda1Var;
        MutableLiveData<VirtualCameraAdapter1<CheckEligiblePinangResponse>> mutableLiveData = new MutableLiveData<>();
        this.b = mutableLiveData;
        MutableLiveData<VirtualCameraAdapter1<EligibleIctMenuResponse>> mutableLiveData2 = new MutableLiveData<>();
        this.TuitionPaymentFragmentbindingInflater1 = mutableLiveData2;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isDisposed()) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.dispose();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(createPopupWindow createpopupwindow, CheckEligiblePinangResponse checkEligiblePinangResponse) {
        MutableLiveData<VirtualCameraAdapter1<CheckEligiblePinangResponse>> mutableLiveData = createpopupwindow.b;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(checkEligiblePinangResponse));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(createPopupWindow createpopupwindow, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, createpopupwindow.TuitionPaymentFragmentbindingInflater1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(createPopupWindow createpopupwindow, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, createpopupwindow.b);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(createPopupWindow createpopupwindow, EligibleIctMenuResponse eligibleIctMenuResponse) {
        MutableLiveData<VirtualCameraAdapter1<EligibleIctMenuResponse>> mutableLiveData = createpopupwindow.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(eligibleIctMenuResponse));
        return Unit.INSTANCE;
    }
}
