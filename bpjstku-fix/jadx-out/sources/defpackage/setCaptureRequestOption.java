package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.point.model.response.PointResponse;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class setCaptureRequestOption extends ViewModel {
    public final MutableLiveData<VirtualCameraAdapter1<PointResponse>> TuitionPaymentFragmentbindingInflater1;
    public final dispatchOnBackStarted TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final registerlambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public setCaptureRequestOption(dispatchOnBackStarted dispatchonbackstarted, registerlambda1 registerlambda1Var, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(dispatchonbackstarted, "");
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = dispatchonbackstarted;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = registerlambda1Var;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<PointResponse>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentbindingInflater1 = mutableLiveData;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.isDisposed()) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.dispose();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(setCaptureRequestOption setcapturerequestoption, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, setcapturerequestoption.TuitionPaymentFragmentbindingInflater1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(setCaptureRequestOption setcapturerequestoption, PointResponse pointResponse) {
        MutableLiveData<VirtualCameraAdapter1<PointResponse>> mutableLiveData = setcapturerequestoption.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(pointResponse));
        return Unit.INSTANCE;
    }
}
