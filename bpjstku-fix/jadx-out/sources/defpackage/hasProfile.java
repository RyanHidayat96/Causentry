package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.domain.simulation.model.JhtSimulation;
import com.bpjstku.domain.simulation.model.JpSimulation;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hasProfile extends ViewModel {
    public final MutableLiveData<VirtualCameraAdapter1<JpSimulation>> TuitionPaymentFragmentbindingInflater1;
    public final MutableLiveData<VirtualCameraAdapter1<JhtSimulation>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final ReportDrawnKtExternalSyntheticLambda5 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final acquireBuffer b;

    public hasProfile(acquireBuffer acquirebuffer, ReportDrawnKtExternalSyntheticLambda5 reportDrawnKtExternalSyntheticLambda5) {
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        Intrinsics.checkNotNullParameter(reportDrawnKtExternalSyntheticLambda5, "");
        this.b = acquirebuffer;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = reportDrawnKtExternalSyntheticLambda5;
        MutableLiveData<VirtualCameraAdapter1<JpSimulation>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentbindingInflater1 = mutableLiveData;
        MutableLiveData<VirtualCameraAdapter1<JhtSimulation>> mutableLiveData2 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mutableLiveData2;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.b.isDisposed()) {
            return;
        }
        this.b.dispose();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(hasProfile hasprofile, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, hasprofile.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(hasProfile hasprofile, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, hasprofile.TuitionPaymentFragmentbindingInflater1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(hasProfile hasprofile, JpSimulation jpSimulation) {
        MutableLiveData<VirtualCameraAdapter1<JpSimulation>> mutableLiveData = hasprofile.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(jpSimulation));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(hasProfile hasprofile, JhtSimulation jhtSimulation) {
        MutableLiveData<VirtualCameraAdapter1<JhtSimulation>> mutableLiveData = hasprofile.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(jhtSimulation));
        return Unit.INSTANCE;
    }
}
