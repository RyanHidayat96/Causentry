package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class setCompoundDrawablesRelativeWithIntrinsicBounds extends ViewModel {
    public final acquireBuffer TuitionPaymentFragmentbindingInflater1;
    public final MutableLiveData<VirtualCameraAdapter1<ActivityResultRegistryExternalSyntheticLambda0>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final registerlambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public setCompoundDrawablesRelativeWithIntrinsicBounds(registerlambda1 registerlambda1Var, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = registerlambda1Var;
        this.TuitionPaymentFragmentbindingInflater1 = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<ActivityResultRegistryExternalSyntheticLambda0>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mutableLiveData;
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

    public static /* synthetic */ Unit b(setCompoundDrawablesRelativeWithIntrinsicBounds setcompounddrawablesrelativewithintrinsicbounds, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, setcompounddrawablesrelativewithintrinsicbounds.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(setCompoundDrawablesRelativeWithIntrinsicBounds setcompounddrawablesrelativewithintrinsicbounds, ActivityResultRegistryExternalSyntheticLambda0 activityResultRegistryExternalSyntheticLambda0) {
        MutableLiveData<VirtualCameraAdapter1<ActivityResultRegistryExternalSyntheticLambda0>> mutableLiveData = setcompounddrawablesrelativewithintrinsicbounds.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(activityResultRegistryExternalSyntheticLambda0));
        return Unit.INSTANCE;
    }
}
