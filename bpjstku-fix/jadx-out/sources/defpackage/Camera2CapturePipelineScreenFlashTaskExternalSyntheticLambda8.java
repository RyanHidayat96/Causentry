package defpackage;

import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import com.bpjstku.domain.jkp.model.JkpTrackClaim;
import com.bpjstku.domain.jkp.model.SubmissionJkpCheckItem;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8 extends ViewModel {
    public final registerlambda1 TuitionPaymentFragmentbindingInflater1;
    public final MutableLiveData<VirtualCameraAdapter1<JkpTrackClaim>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final ComponentActivityExternalSyntheticLambda5 TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final MutableLiveData<VirtualCameraAdapter1<SubmissionJkpCheckItem>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final acquireBuffer b;

    public Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8(registerlambda1 registerlambda1Var, ComponentActivityExternalSyntheticLambda5 componentActivityExternalSyntheticLambda5, acquireBuffer acquirebuffer) {
        Intrinsics.checkNotNullParameter(registerlambda1Var, "");
        Intrinsics.checkNotNullParameter(componentActivityExternalSyntheticLambda5, "");
        Intrinsics.checkNotNullParameter(acquirebuffer, "");
        this.TuitionPaymentFragmentbindingInflater1 = registerlambda1Var;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = componentActivityExternalSyntheticLambda5;
        this.b = acquirebuffer;
        MutableLiveData<VirtualCameraAdapter1<JkpTrackClaim>> mutableLiveData = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mutableLiveData;
        MutableLiveData<VirtualCameraAdapter1<SubmissionJkpCheckItem>> mutableLiveData2 = new MutableLiveData<>();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = mutableLiveData2;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
        VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
    }

    public static /* synthetic */ Unit b(Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8 camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8, SubmissionJkpCheckItem submissionJkpCheckItem) {
        MutableLiveData<VirtualCameraAdapter1<SubmissionJkpCheckItem>> mutableLiveData = camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(submissionJkpCheckItem));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8 camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8, JkpTrackClaim jkpTrackClaim) {
        MutableLiveData<VirtualCameraAdapter1<JkpTrackClaim>> mutableLiveData = camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1(jkpTrackClaim));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8 camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(Camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8 camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8, Throwable th) {
        Intrinsics.checkNotNull(th);
        setRccState.TuitionPaymentFragmentspecialinlinedviewModeldefault3(th, camera2CapturePipelineScreenFlashTaskExternalSyntheticLambda8.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        return Unit.INSTANCE;
    }
}
