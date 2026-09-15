package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.domain.digitalcard.model.BPUMembershipInformation;
import com.bpjstku.domain.digitalcard.model.DigitalCard;
import com.bpjstku.domain.digitalcard.model.PMIMembershipInformation;
import com.bpjstku.domain.digitalcard.model.PUMembershipInformation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CaptureSessionExternalSyntheticLambda3 extends ViewModel {
    private final MutableLiveData<VirtualCameraAdapter1<List<DigitalCard>>> TuitionPaymentFragmentbindingInflater1;
    public final registerlambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final MutableLiveData<VirtualCameraAdapter1<BPUMembershipInformation>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final ensureViewModelStore TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final MutableLiveData<VirtualCameraAdapter1<PMIMembershipInformation>> asBinder;
    private final MutableLiveData<VirtualCameraAdapter1<PUMembershipInformation>> asInterface;
    private final acquireBuffer b;

    public CaptureSessionExternalSyntheticLambda3(ensureViewModelStore ensureviewmodelstore, acquireBuffer acquirebuffer, registerlambda1 registerlambda1Var) {
        Intrinsics.checkNotNullParameter(ensureviewmodelstore, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = ensureviewmodelstore;
        this.b = acquirebuffer;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = registerlambda1Var;
        MutableLiveData<VirtualCameraAdapter1<List<DigitalCard>>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentbindingInflater1 = mutableLiveData;
        MutableLiveData<VirtualCameraAdapter1<BPUMembershipInformation>> mutableLiveData2 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mutableLiveData2;
        MutableLiveData<VirtualCameraAdapter1<PUMembershipInformation>> mutableLiveData3 = new MutableLiveData<>();
        this.asInterface = mutableLiveData3;
        MutableLiveData<VirtualCameraAdapter1<PMIMembershipInformation>> mutableLiveData4 = new MutableLiveData<>();
        this.asBinder = mutableLiveData4;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion3 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData3.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion4 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData4.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.b.isDisposed()) {
            return;
        }
        this.b.dispose();
    }
}
