package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.domain.general.model.BaseModel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class getCombinedMessage extends ViewModel {
    public final MutableLiveData<VirtualCameraAdapter1<BaseModel>> TuitionPaymentFragmentbindingInflater1;
    public final r8lambdaXxpmZzi8FNPM2sJJA30VCt2mBcQ TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public getCombinedMessage(r8lambdaXxpmZzi8FNPM2sJJA30VCt2mBcQ r8lambdaxxpmzzi8fnpm2sjja30vct2mbcq, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(r8lambdaxxpmzzi8fnpm2sjja30vct2mbcq, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r8lambdaxxpmzzi8fnpm2sjja30vct2mbcq;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentbindingInflater1 = mutableLiveData;
        mutableLiveData.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(getCombinedMessage getcombinedmessage, BaseModel baseModel) {
        MutableLiveData<VirtualCameraAdapter1<BaseModel>> mutableLiveData = getcombinedmessage.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(baseModel));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(getCombinedMessage getcombinedmessage, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, getcombinedmessage.TuitionPaymentFragmentbindingInflater1);
        return Unit.INSTANCE;
    }
}
