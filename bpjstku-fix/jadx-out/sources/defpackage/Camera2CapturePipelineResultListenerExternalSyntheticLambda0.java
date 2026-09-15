package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentOldDaySecuritySimulationBottomsheetBinding;
import com.bpjstku.domain.simulation.model.JhtSimulation;
import com.google.android.material.button.MaterialButton;
import java.text.ParseException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\u0003J+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0014\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00188\u0015X\u0095D¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\t\u0010\u001c"}, d2 = {"LCamera2CapturePipelineResultListenerExternalSyntheticLambda0;", "LunregisterMediaButtonEventReceiver;", "<init>", "()V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "LremoveSessionCameraCaptureCallback;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lkotlin/Lazy;", "Lcom/bpjstku/domain/simulation/model/JhtSimulation;", "Lcom/bpjstku/domain/simulation/model/JhtSimulation;", "", "I", "()I", "Lcom/bpjstku/databinding/FragmentOldDaySecuritySimulationBottomsheetBinding;", "Lcom/bpjstku/databinding/FragmentOldDaySecuritySimulationBottomsheetBinding;", "TuitionPaymentFragmentbindingInflater1"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Camera2CapturePipelineResultListenerExternalSyntheticLambda0 extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private JhtSimulation TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: Camera2CapturePipelinePipelineTask
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Camera2CapturePipelineResultListenerExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1);
        }
    });

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault1 = R.layout.fragment_old_day_security_simulation_bottomsheet;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private FragmentOldDaySecuritySimulationBottomsheetBinding TuitionPaymentFragmentbindingInflater1;

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
    }

    /* JADX INFO: renamed from: Camera2CapturePipelineResultListenerExternalSyntheticLambda0$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LCamera2CapturePipelineResultListenerExternalSyntheticLambda0$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/bpjstku/domain/simulation/model/JhtSimulation;", "p0", "LCamera2CapturePipelineResultListenerExternalSyntheticLambda0;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/bpjstku/domain/simulation/model/JhtSimulation;)LCamera2CapturePipelineResultListenerExternalSyntheticLambda0;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Camera2CapturePipelineResultListenerExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault3(JhtSimulation p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            Camera2CapturePipelineResultListenerExternalSyntheticLambda0 camera2CapturePipelineResultListenerExternalSyntheticLambda0 = new Camera2CapturePipelineResultListenerExternalSyntheticLambda0();
            Bundle bundle = new Bundle();
            bundle.putParcelable("jht_simulation_result", p0);
            camera2CapturePipelineResultListenerExternalSyntheticLambda0.setArguments(bundle);
            return camera2CapturePipelineResultListenerExternalSyntheticLambda0;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        Bundle arguments = getArguments();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = arguments != null ? (JhtSimulation) arguments.getParcelable("jht_simulation_result") : null;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        FragmentOldDaySecuritySimulationBottomsheetBinding fragmentOldDaySecuritySimulationBottomsheetBinding = this.TuitionPaymentFragmentbindingInflater1;
        if (fragmentOldDaySecuritySimulationBottomsheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentOldDaySecuritySimulationBottomsheetBinding = null;
        }
        RecyclerView recyclerView = fragmentOldDaySecuritySimulationBottomsheetBinding.rvSimulationOldDaySecurity;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(new ContextThemeWrapper(recyclerView.getContext(), R.style.AppTheme), 1));
        recyclerView.setAdapter((removeSessionCameraCaptureCallback) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue());
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        FragmentOldDaySecuritySimulationBottomsheetBinding fragmentOldDaySecuritySimulationBottomsheetBinding = this.TuitionPaymentFragmentbindingInflater1;
        if (fragmentOldDaySecuritySimulationBottomsheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentOldDaySecuritySimulationBottomsheetBinding = null;
        }
        MaterialButton materialButton = fragmentOldDaySecuritySimulationBottomsheetBinding.btnBack;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: getFuture
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Camera2CapturePipelineResultListenerExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (View) obj);
            }
        }));
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentOldDaySecuritySimulationBottomsheetBinding fragmentOldDaySecuritySimulationBottomsheetBindingInflate = FragmentOldDaySecuritySimulationBottomsheetBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentbindingInflater1 = fragmentOldDaySecuritySimulationBottomsheetBindingInflate;
        if (fragmentOldDaySecuritySimulationBottomsheetBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentOldDaySecuritySimulationBottomsheetBindingInflate = null;
        }
        RelativeLayout root = fragmentOldDaySecuritySimulationBottomsheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(Camera2CapturePipelineResultListenerExternalSyntheticLambda0 camera2CapturePipelineResultListenerExternalSyntheticLambda0, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        camera2CapturePipelineResultListenerExternalSyntheticLambda0.dismiss();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ removeSessionCameraCaptureCallback TuitionPaymentFragmentspecialinlinedviewModeldefault1(Camera2CapturePipelineResultListenerExternalSyntheticLambda0 camera2CapturePipelineResultListenerExternalSyntheticLambda0) throws ParseException {
        String str;
        String str2;
        String str3;
        String str4;
        Context contextRequireContext = camera2CapturePipelineResultListenerExternalSyntheticLambda0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        getDefaultLightScrim[] getdefaultlightscrimArr = new getDefaultLightScrim[5];
        JhtSimulation jhtSimulation = camera2CapturePipelineResultListenerExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String strTuitionPaymentFragmentbindingInflater1 = null;
        String str5 = jhtSimulation != null ? jhtSimulation.b : null;
        if (str5 == null) {
            str5 = "";
        }
        getdefaultlightscrimArr[0] = new getDefaultLightScrim("Jumlah Tahun", str5);
        JhtSimulation jhtSimulation2 = camera2CapturePipelineResultListenerExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String strTuitionPaymentFragmentbindingInflater2 = (jhtSimulation2 == null || (str4 = jhtSimulation2.TuitionPaymentFragmentspecialinlinedviewModeldefault1) == null) ? null : getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(str4);
        if (strTuitionPaymentFragmentbindingInflater2 == null) {
            strTuitionPaymentFragmentbindingInflater2 = "";
        }
        getdefaultlightscrimArr[1] = new getDefaultLightScrim("Saldo Awal", strTuitionPaymentFragmentbindingInflater2);
        JhtSimulation jhtSimulation3 = camera2CapturePipelineResultListenerExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String strTuitionPaymentFragmentbindingInflater3 = (jhtSimulation3 == null || (str3 = jhtSimulation3.TuitionPaymentFragmentbindingInflater1) == null) ? null : getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(str3);
        if (strTuitionPaymentFragmentbindingInflater3 == null) {
            strTuitionPaymentFragmentbindingInflater3 = "";
        }
        getdefaultlightscrimArr[2] = new getDefaultLightScrim("Iuran JHT", strTuitionPaymentFragmentbindingInflater3);
        JhtSimulation jhtSimulation4 = camera2CapturePipelineResultListenerExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String strTuitionPaymentFragmentbindingInflater4 = (jhtSimulation4 == null || (str2 = jhtSimulation4.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) ? null : getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(str2);
        if (strTuitionPaymentFragmentbindingInflater4 == null) {
            strTuitionPaymentFragmentbindingInflater4 = "";
        }
        getdefaultlightscrimArr[3] = new getDefaultLightScrim("Hasil Pengembangan", strTuitionPaymentFragmentbindingInflater4);
        JhtSimulation jhtSimulation5 = camera2CapturePipelineResultListenerExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str6 = jhtSimulation5 != null ? jhtSimulation5.b : null;
        if (str6 == null) {
            str6 = "";
        }
        StringBuilder sb = new StringBuilder("Saldo Akhir Tahun\n(");
        sb.append(str6);
        sb.append(" Tahun)");
        String string = sb.toString();
        JhtSimulation jhtSimulation6 = camera2CapturePipelineResultListenerExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (jhtSimulation6 != null && (str = jhtSimulation6.TuitionPaymentFragmentspecialinlinedviewModeldefault2) != null) {
            strTuitionPaymentFragmentbindingInflater1 = getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(str);
        }
        getdefaultlightscrimArr[4] = new getDefaultLightScrim(string, strTuitionPaymentFragmentbindingInflater1 != null ? strTuitionPaymentFragmentbindingInflater1 : "");
        return new removeSessionCameraCaptureCallback(contextRequireContext, CollectionsKt.mutableListOf(getdefaultlightscrimArr));
    }
}
