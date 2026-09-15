package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.domain.about.model.About;
import com.google.gson.JsonSyntaxException;
import com.nbs.nucleo.utils.exception.ApiException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ActivityResultContracts extends ViewModel {
    public final MutableLiveData<VirtualCameraAdapter1<About>> TuitionPaymentFragmentbindingInflater1;
    public final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final onActivityPostResumed TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public ActivityResultContracts(onActivityPostResumed onactivitypostresumed, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(onactivitypostresumed, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = onactivitypostresumed;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<About>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentbindingInflater1 = mutableLiveData;
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

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(ActivityResultContracts activityResultContracts, About about) {
        MutableLiveData<VirtualCameraAdapter1<About>> mutableLiveData = activityResultContracts.TuitionPaymentFragmentbindingInflater1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(about));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(ActivityResultContracts activityResultContracts, Throwable th) {
        Intrinsics.checkNotNull(th);
        MutableLiveData<VirtualCameraAdapter1<About>> mutableLiveData = activityResultContracts.TuitionPaymentFragmentbindingInflater1;
        if (th instanceof ApiException) {
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(th, ((ApiException) th).getApiError().getB()));
        } else if (th instanceof SocketTimeoutException) {
            VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(th, "Connection Timeout"));
        } else if (th instanceof IOException) {
            VirtualCameraAdapter1.Companion companion3 = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(th, "Connection IOException"));
        } else if (th instanceof JsonSyntaxException) {
            VirtualCameraAdapter1.Companion companion4 = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(th, "JSON Exception"));
        } else {
            VirtualCameraAdapter1.Companion companion5 = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(th, "An unknown error occurred"));
        }
        return Unit.INSTANCE;
    }
}
