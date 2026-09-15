package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ApiCompatApi29Impl extends ViewModel {
    public final registerlambda1 TuitionPaymentFragmentbindingInflater1;
    private final MutableLiveData<VirtualCameraAdapter1<Object>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final IntentSenderRequestBuilder TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final acquireBuffer b;

    public ApiCompatApi29Impl(IntentSenderRequestBuilder intentSenderRequestBuilder, registerlambda1 registerlambda1Var, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(intentSenderRequestBuilder, "");
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = intentSenderRequestBuilder;
        this.TuitionPaymentFragmentbindingInflater1 = registerlambda1Var;
        this.b = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<Object>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mutableLiveData;
        mutableLiveData.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
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
