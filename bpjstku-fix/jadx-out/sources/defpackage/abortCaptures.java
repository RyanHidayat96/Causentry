package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentJpnSimulationBottomSheetBinding;
import com.bpjstku.domain.simulation.model.JpSimulation;
import com.google.android.material.button.MaterialButton;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.hasProfile;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import java.text.ParseException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0003R\u0015\u0010\u0015\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u0015\u0010\u0019\u001a\u00020\u00188BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0014\u0010\u0010\u001a\u00020\u001a8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001bR\u0016\u0010\u0012\u001a\u00020\u001c8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0012\u0010\u001d"}, d2 = {"LabortCaptures;", "LunregisterMediaButtonEventReceiver;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "LonReady;", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/bpjstku/domain/simulation/model/JpSimulation;", "Lcom/bpjstku/domain/simulation/model/JpSimulation;", "LhasProfile;", "TuitionPaymentFragmentbindingInflater1", "", "()I", "Lcom/bpjstku/databinding/FragmentJpnSimulationBottomSheetBinding;", "Lcom/bpjstku/databinding/FragmentJpnSimulationBottomSheetBinding;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class abortCaptures extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Lazy TuitionPaymentFragmentbindingInflater1;
    private JpSimulation TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: findOutputConfigId
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return abortCaptures.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1);
        }
    });
    private FragmentJpnSimulationBottomSheetBinding b;

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return R.layout.fragment_jpn_simulation_bottom_sheet;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
    }

    public abortCaptures() {
        final abortCaptures abortcaptures = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<hasProfile>() { // from class: com.bpjstku.presentation.program.jpn.JpnSimulationBottomSheetFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, hasProfile] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ hasProfile invoke() {
                LifecycleOwner lifecycleOwner = abortcaptures;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(hasProfile.class);
                if (lifecycleOwner != null) {
                    ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                    return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
            }

            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: abortCaptures$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LabortCaptures$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/bpjstku/domain/simulation/model/JpSimulation;", "p0", "LabortCaptures;", "b", "(Lcom/bpjstku/domain/simulation/model/JpSimulation;)LabortCaptures;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static abortCaptures b(JpSimulation p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            abortCaptures abortcaptures = new abortCaptures();
            Bundle bundle = new Bundle();
            bundle.putParcelable("jpn_result", p0);
            abortcaptures.setArguments(bundle);
            return abortcaptures;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentJpnSimulationBottomSheetBinding fragmentJpnSimulationBottomSheetBindingInflate = FragmentJpnSimulationBottomSheetBinding.inflate(p0, p1, false);
        this.b = fragmentJpnSimulationBottomSheetBindingInflate;
        if (fragmentJpnSimulationBottomSheetBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentJpnSimulationBottomSheetBindingInflate = null;
        }
        FrameLayout root = fragmentJpnSimulationBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        Bundle arguments = getArguments();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = arguments != null ? (JpSimulation) arguments.getParcelable("jpn_result") : null;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        FragmentJpnSimulationBottomSheetBinding fragmentJpnSimulationBottomSheetBinding = this.b;
        if (fragmentJpnSimulationBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentJpnSimulationBottomSheetBinding = null;
        }
        RecyclerView recyclerView = fragmentJpnSimulationBottomSheetBinding.rvJpnSimulationResult;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(new ContextThemeWrapper(recyclerView.getContext(), R.style.AppTheme), 1));
        recyclerView.setAdapter((onReady) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue());
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        FragmentJpnSimulationBottomSheetBinding fragmentJpnSimulationBottomSheetBinding = this.b;
        if (fragmentJpnSimulationBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentJpnSimulationBottomSheetBinding = null;
        }
        MaterialButton materialButton = fragmentJpnSimulationBottomSheetBinding.btnBack;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: setRepeating
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return abortCaptures.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(abortCaptures abortcaptures, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        abortcaptures.dismiss();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ onReady TuitionPaymentFragmentspecialinlinedviewModeldefault1(abortCaptures abortcaptures) throws ParseException {
        String str;
        Context contextRequireContext = abortcaptures.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ReportDrawnKtExternalSyntheticLambda4[] reportDrawnKtExternalSyntheticLambda4Arr = new ReportDrawnKtExternalSyntheticLambda4[5];
        String string = abortcaptures.getString(R.string.label_pension_age);
        Intrinsics.checkNotNullExpressionValue(string, "");
        JpSimulation jpSimulation = abortcaptures.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String strTuitionPaymentFragmentbindingInflater1 = null;
        String str2 = jpSimulation != null ? jpSimulation.TuitionPaymentFragmentbindingInflater1 : null;
        if (str2 == null) {
            str2 = "";
        }
        reportDrawnKtExternalSyntheticLambda4Arr[0] = new ReportDrawnKtExternalSyntheticLambda4(string, str2);
        String string2 = abortcaptures.getString(R.string.label_premium_period_counted);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        JpSimulation jpSimulation2 = abortcaptures.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str3 = jpSimulation2 != null ? jpSimulation2.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        if (str3 == null) {
            str3 = "";
        }
        reportDrawnKtExternalSyntheticLambda4Arr[1] = new ReportDrawnKtExternalSyntheticLambda4(string2, str3);
        String string3 = abortcaptures.getString(R.string.label_pension_year);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        JpSimulation jpSimulation3 = abortcaptures.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str4 = jpSimulation3 != null ? jpSimulation3.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : null;
        if (str4 == null) {
            str4 = "";
        }
        reportDrawnKtExternalSyntheticLambda4Arr[2] = new ReportDrawnKtExternalSyntheticLambda4(string3, str4);
        String string4 = abortcaptures.getString(R.string.label_premium_period);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        JpSimulation jpSimulation4 = abortcaptures.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str5 = jpSimulation4 != null ? jpSimulation4.b : null;
        if (str5 == null) {
            str5 = "";
        }
        reportDrawnKtExternalSyntheticLambda4Arr[3] = new ReportDrawnKtExternalSyntheticLambda4(string4, str5);
        String string5 = abortcaptures.getString(R.string.label_benefit);
        Intrinsics.checkNotNullExpressionValue(string5, "");
        JpSimulation jpSimulation5 = abortcaptures.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (jpSimulation5 != null && (str = jpSimulation5.TuitionPaymentFragmentspecialinlinedviewModeldefault2) != null) {
            strTuitionPaymentFragmentbindingInflater1 = getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(str);
        }
        reportDrawnKtExternalSyntheticLambda4Arr[4] = new ReportDrawnKtExternalSyntheticLambda4(string5, strTuitionPaymentFragmentbindingInflater1 != null ? strTuitionPaymentFragmentbindingInflater1 : "");
        return new onReady(contextRequireContext, CollectionsKt.mutableListOf(reportDrawnKtExternalSyntheticLambda4Arr));
    }
}
