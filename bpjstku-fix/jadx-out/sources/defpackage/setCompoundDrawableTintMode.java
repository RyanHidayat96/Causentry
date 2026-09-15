package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.domain.user.model.ForgotAccount;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class setCompoundDrawableTintMode extends ViewModel {
    public final acquireBuffer TuitionPaymentFragmentbindingInflater1;
    public final MutableLiveData<VirtualCameraAdapter1<ForgotAccount>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final registerlambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public setCompoundDrawableTintMode(registerlambda1 registerlambda1Var, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = registerlambda1Var;
        this.TuitionPaymentFragmentbindingInflater1 = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<ForgotAccount>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mutableLiveData;
        mutableLiveData.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.TuitionPaymentFragmentbindingInflater1.isDisposed()) {
            return;
        }
        this.TuitionPaymentFragmentbindingInflater1.dispose();
    }

    public static /* synthetic */ Unit b(setCompoundDrawableTintMode setcompounddrawabletintmode, ForgotAccount forgotAccount) {
        MutableLiveData<VirtualCameraAdapter1<ForgotAccount>> mutableLiveData = setcompounddrawabletintmode.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(forgotAccount));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(setCompoundDrawableTintMode setcompounddrawabletintmode, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, setcompounddrawabletintmode.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        return Unit.INSTANCE;
    }
}
