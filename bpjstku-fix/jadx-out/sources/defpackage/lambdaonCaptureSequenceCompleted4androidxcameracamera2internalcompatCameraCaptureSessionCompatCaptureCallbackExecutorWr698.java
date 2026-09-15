package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.data.support.model.response.CallPmiResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class lambdaonCaptureSequenceCompleted4androidxcameracamera2internalcompatCameraCaptureSessionCompatCaptureCallbackExecutorWrapper extends ViewModel {
    private final registerlambda1 TuitionPaymentFragmentbindingInflater1;
    private final acquireBuffer TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final MutableLiveData<VirtualCameraAdapter1<CallPmiResponse>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final ReportDrawnKtReportDrawnWhenlambda10inlinedonDispose1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public lambdaonCaptureSequenceCompleted4androidxcameracamera2internalcompatCameraCaptureSessionCompatCaptureCallbackExecutorWrapper(ReportDrawnKtReportDrawnWhenlambda10inlinedonDispose1 reportDrawnKtReportDrawnWhenlambda10inlinedonDispose1, registerlambda1 registerlambda1Var, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(reportDrawnKtReportDrawnWhenlambda10inlinedonDispose1, "");
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = reportDrawnKtReportDrawnWhenlambda10inlinedonDispose1;
        this.TuitionPaymentFragmentbindingInflater1 = registerlambda1Var;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<CallPmiResponse>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = mutableLiveData;
        mutableLiveData.setValue(new VirtualCameraAdapter1.TuitionPaymentFragmentbindingInflater1());
    }
}
