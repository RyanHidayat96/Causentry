package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.domain.general.model.CodeNamePair;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class flagActionItems extends ViewModel {
    final MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    final r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public flagActionItems(r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = r8lambdaxcwb6u5x87zpwrzw4zmu6tskqc8;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mutableLiveData;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(flagActionItems flagactionitems, List list) {
        MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData = flagactionitems.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(list));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(flagActionItems flagactionitems, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, flagactionitems.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return Unit.INSTANCE;
    }
}
