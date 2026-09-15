package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentJpnSimulationResultBinding;
import com.bpjstku.domain.simulation.model.Lumpsum;
import com.bpjstku.presentation.program.jpn.JpnLumpsumFragment$bindingInflater$1;
import com.kennyc.view.MultiStateView;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004R*\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\r\u0018\u0001`\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0015\u001a\u00020\u00128CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u000f\u001a\u00020\u00168\u0015X\u0095D¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R.\u0010\u0013\u001a\u001c\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00020\u001a8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u001e"}, d2 = {"LCamera2EncoderProfilesProvider;", "LAutoValue_CameraState_StateError;", "Lcom/bpjstku/databinding/FragmentJpnSimulationResultBinding;", "<init>", "()V", "", "cancelAll", "b_", "onTransact", "g", "cancel", "INotificationSideChannel", "Ljava/util/ArrayList;", "Lcom/bpjstku/domain/simulation/model/Lumpsum;", "Lkotlin/collections/b;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/util/ArrayList;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "LCameraIdUtil;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lkotlin/Lazy;", "b", "", "I", "asBinder", "()I", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "()Lkotlin/jvm/functions/Function3;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2EncoderProfilesProvider extends AutoValue_CameraState_StateError<FragmentJpnSimulationResultBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private ArrayList<Lumpsum> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy b = LazyKt.lazy(new Function0() { // from class: createProfilesFromCamcorderProfile
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Camera2EncoderProfilesProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = R.layout.fragment_jpn_simulation_result;

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void b_() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // defpackage.AutoValue_CameraState_StateError
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentJpnSimulationResultBinding> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return JpnLumpsumFragment$bindingInflater$1.TuitionPaymentFragmentbindingInflater1;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
        Bundle arguments = getArguments();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = arguments != null ? arguments.getParcelableArrayList("jpn_lumpsum") : null;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        RecyclerView recyclerView = asInterface().rvJpnSimulationResult;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.addItemDecoration(new setCameraOperatingMode(24, 24));
        recyclerView.setAdapter((CameraIdUtil) this.b.getValue());
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        ArrayList<Lumpsum> arrayList = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (arrayList != null) {
            if (!arrayList.isEmpty()) {
                MultiStateView multiStateView = asInterface().msvJpnSimulationResult;
                Intrinsics.checkNotNullExpressionValue(multiStateView, "");
                multiStateView.setViewState(MultiStateView.ViewState.CONTENT);
                ((CameraIdUtil) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1(arrayList);
                return;
            }
            MultiStateView multiStateView2 = asInterface().msvJpnSimulationResult;
            Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
            Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(multiStateView2, getString(R.string.error_message_no_lumsum), null, null);
        }
    }

    public static /* synthetic */ CameraIdUtil TuitionPaymentFragmentspecialinlinedviewModeldefault2(Camera2EncoderProfilesProvider camera2EncoderProfilesProvider) {
        Context contextRequireContext = camera2EncoderProfilesProvider.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new CameraIdUtil(contextRequireContext, null, 2, null);
    }
}
