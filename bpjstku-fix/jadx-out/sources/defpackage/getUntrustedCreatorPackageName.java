package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.presentation.membership.registration.model.RegisteredMemberRegistration;
import com.bpjstku.presentation.membership.registration.newregistration.VerificationRequestType;

/* JADX INFO: loaded from: classes3.dex */
public final class getUntrustedCreatorPackageName extends ViewModel {
    public final MutableLiveData<Integer> TuitionPaymentFragmentbindingInflater1 = new MutableLiveData<>(1);
    public final MutableLiveData<RegisteredMemberRegistration> b = new MutableLiveData<>();
    private final MutableLiveData<VerificationRequestType> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new MutableLiveData<>();

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        MutableLiveData<Integer> mutableLiveData = this.TuitionPaymentFragmentbindingInflater1;
        Integer value = mutableLiveData.getValue();
        mutableLiveData.setValue(value != null ? Integer.valueOf(value.intValue() - 1) : 1);
    }

    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        MutableLiveData<Integer> mutableLiveData = this.TuitionPaymentFragmentbindingInflater1;
        Integer value = mutableLiveData.getValue();
        mutableLiveData.setValue(value != null ? Integer.valueOf(value.intValue() + 1) : 1);
    }
}
