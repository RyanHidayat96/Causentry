package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentEwalletBottomSheetBinding;
import com.bpjstku.presentation.membership.payment.EwalletDetailPayment;
import com.google.android.material.button.MaterialButton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0003R$\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0015\u0010\u0012\u001a\u00020\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0019\u001a\u00020\u001b8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"LgetShowDividers;", "LunregisterMediaButtonEventReceiver;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "Lkotlin/Function1;", "", "Lkotlin/jvm/functions/Function1;", "LonReady;", "Lkotlin/Lazy;", "Lcom/bpjstku/presentation/membership/payment/EwalletDetailPayment;", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/presentation/membership/payment/EwalletDetailPayment;", "Lcom/bpjstku/databinding/FragmentEwalletBottomSheetBinding;", "Lcom/bpjstku/databinding/FragmentEwalletBottomSheetBinding;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getShowDividers extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private EwalletDetailPayment TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private FragmentEwalletBottomSheetBinding TuitionPaymentFragmentbindingInflater1;
    private Function1<? super String, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private final Lazy b = LazyKt.lazy(new getVirtualChildCount(this));

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return R.layout.fragment_ewallet_bottom_sheet;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
    }

    /* JADX INFO: renamed from: getShowDividers$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"LgetShowDividers$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/bpjstku/presentation/membership/payment/EwalletDetailPayment;", "p0", "Lkotlin/Function1;", "", "", "p1", "LgetShowDividers;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/bpjstku/presentation/membership/payment/EwalletDetailPayment;Lkotlin/jvm/functions/Function1;)LgetShowDividers;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static getShowDividers TuitionPaymentFragmentspecialinlinedviewModeldefault3(EwalletDetailPayment p0, Function1<? super String, Unit> p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            getShowDividers getshowdividers = new getShowDividers();
            Bundle bundle = new Bundle();
            getshowdividers.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = p1;
            bundle.putParcelable("ewallet_payment", p0);
            getshowdividers.setArguments(bundle);
            return getshowdividers;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentEwalletBottomSheetBinding fragmentEwalletBottomSheetBindingInflate = FragmentEwalletBottomSheetBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentbindingInflater1 = fragmentEwalletBottomSheetBindingInflate;
        if (fragmentEwalletBottomSheetBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentEwalletBottomSheetBindingInflate = null;
        }
        FrameLayout root = fragmentEwalletBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        Bundle arguments = getArguments();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = arguments != null ? (EwalletDetailPayment) arguments.getParcelable("ewallet_payment") : null;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        FragmentEwalletBottomSheetBinding fragmentEwalletBottomSheetBinding = this.TuitionPaymentFragmentbindingInflater1;
        if (fragmentEwalletBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentEwalletBottomSheetBinding = null;
        }
        RecyclerView recyclerView = fragmentEwalletBottomSheetBinding.rvJpnSimulationResult;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(new ContextThemeWrapper(recyclerView.getContext(), R.style.AppTheme), 1));
        recyclerView.setAdapter((onReady) this.b.getValue());
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        FragmentEwalletBottomSheetBinding fragmentEwalletBottomSheetBinding = this.TuitionPaymentFragmentbindingInflater1;
        if (fragmentEwalletBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentEwalletBottomSheetBinding = null;
        }
        MaterialButton materialButton = fragmentEwalletBottomSheetBinding.btnBack;
        Intrinsics.checkNotNullExpressionValue(materialButton, "");
        materialButton.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: hasDividerBeforeChildAt
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getShowDividers.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (View) obj);
            }
        }));
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        ImageView imageView;
        int i;
        EwalletDetailPayment ewalletDetailPayment = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        FragmentEwalletBottomSheetBinding fragmentEwalletBottomSheetBinding = null;
        if (Intrinsics.areEqual(ewalletDetailPayment != null ? ewalletDetailPayment.TuitionPaymentFragmentbindingInflater1() : null, "GOPAY")) {
            FragmentEwalletBottomSheetBinding fragmentEwalletBottomSheetBinding2 = this.TuitionPaymentFragmentbindingInflater1;
            if (fragmentEwalletBottomSheetBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentEwalletBottomSheetBinding2 = null;
            }
            imageView = fragmentEwalletBottomSheetBinding2.imgEwallet;
            i = 2131231514;
        } else {
            FragmentEwalletBottomSheetBinding fragmentEwalletBottomSheetBinding3 = this.TuitionPaymentFragmentbindingInflater1;
            if (fragmentEwalletBottomSheetBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentEwalletBottomSheetBinding3 = null;
            }
            imageView = fragmentEwalletBottomSheetBinding3.imgEwallet;
            i = 2131231515;
        }
        imageView.setImageResource(i);
        FragmentEwalletBottomSheetBinding fragmentEwalletBottomSheetBinding4 = this.TuitionPaymentFragmentbindingInflater1;
        if (fragmentEwalletBottomSheetBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentEwalletBottomSheetBinding = fragmentEwalletBottomSheetBinding4;
        }
        fragmentEwalletBottomSheetBinding.btnBack.setText("Bayar");
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(getShowDividers getshowdividers, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function1<? super String, Unit> function1 = getshowdividers.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (function1 != null) {
            function1.invoke("PAY");
        }
        getshowdividers.dismiss();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ onReady TuitionPaymentFragmentbindingInflater1(getShowDividers getshowdividers) {
        Context contextRequireContext = getshowdividers.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ReportDrawnKtExternalSyntheticLambda4[] reportDrawnKtExternalSyntheticLambda4Arr = new ReportDrawnKtExternalSyntheticLambda4[3];
        EwalletDetailPayment ewalletDetailPayment = getshowdividers.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        reportDrawnKtExternalSyntheticLambda4Arr[0] = new ReportDrawnKtExternalSyntheticLambda4("Nominal Iuran", getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(String.valueOf(ewalletDetailPayment != null ? Double.valueOf(ewalletDetailPayment.TuitionPaymentFragmentspecialinlinedviewModeldefault2) : null)));
        EwalletDetailPayment ewalletDetailPayment2 = getshowdividers.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        reportDrawnKtExternalSyntheticLambda4Arr[1] = new ReportDrawnKtExternalSyntheticLambda4("Biaya Layanan Mitra", getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(String.valueOf(ewalletDetailPayment2 != null ? Double.valueOf(ewalletDetailPayment2.TuitionPaymentFragmentspecialinlinedviewModeldefault1) : null)));
        EwalletDetailPayment ewalletDetailPayment3 = getshowdividers.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        reportDrawnKtExternalSyntheticLambda4Arr[2] = new ReportDrawnKtExternalSyntheticLambda4("Total Tagihan", getCameraOperatingMode.TuitionPaymentFragmentbindingInflater1(String.valueOf(ewalletDetailPayment3 != null ? Double.valueOf(ewalletDetailPayment3.TuitionPaymentFragmentbindingInflater1) : null)));
        return new onReady(contextRequireContext, CollectionsKt.mutableListOf(reportDrawnKtExternalSyntheticLambda4Arr));
    }
}
