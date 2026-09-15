package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class createStaticLayoutForMeasuring extends ViewModel {
    public final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final MutableLiveData<VirtualCameraAdapter1<ActivityResultRegistryExternalSyntheticLambda0>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final registerlambda1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public createStaticLayoutForMeasuring(registerlambda1 registerlambda1Var, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = registerlambda1Var;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<ActivityResultRegistryExternalSyntheticLambda0>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mutableLiveData;
        mutableLiveData.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
    }

    @Override // androidx.p002lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.isDisposed()) {
            return;
        }
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.dispose();
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(createStaticLayoutForMeasuring createstaticlayoutformeasuring, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, createstaticlayoutformeasuring.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(createStaticLayoutForMeasuring createstaticlayoutformeasuring, ActivityResultRegistryExternalSyntheticLambda0 activityResultRegistryExternalSyntheticLambda0) {
        MutableLiveData<VirtualCameraAdapter1<ActivityResultRegistryExternalSyntheticLambda0>> mutableLiveData = createstaticlayoutformeasuring.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(activityResultRegistryExternalSyntheticLambda0));
        return Unit.INSTANCE;
    }
}
