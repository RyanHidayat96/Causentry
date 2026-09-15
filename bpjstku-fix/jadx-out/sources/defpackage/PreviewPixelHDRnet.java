package defpackage;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentLpkProfileBottomSheetBinding;
import com.kennyc.view.MultiStateView;
import defpackage.PreviewDelayWhenVideoCaptureIsBoundQuirk;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0003R\u0015\u0010\u0010\u001a\u00020\u00138CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0015\u0010\u0016\u001a\u00020\u00158CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00178UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u0016\u0010\u0012\u001a\u00020\u001a8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u000e\u0010\u001b"}, d2 = {"LPreviewPixelHDRnet;", "LunregisterMediaButtonEventReceiver;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "LPreviewDelayWhenVideoCaptureIsBoundQuirk;", "Lkotlin/Lazy;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "", "()I", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/databinding/FragmentLpkProfileBottomSheetBinding;", "Lcom/bpjstku/databinding/FragmentLpkProfileBottomSheetBinding;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PreviewPixelHDRnet extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private FragmentLpkProfileBottomSheetBinding b;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: shouldMonitorRequest
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return PreviewPixelHDRnet.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return R.layout.fragment_lpk_profile_bottom_sheet;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
    }

    public PreviewPixelHDRnet() {
        final PreviewPixelHDRnet previewPixelHDRnet = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<PreviewDelayWhenVideoCaptureIsBoundQuirk>() { // from class: com.bpjstku.presentation.vocational.bottomsheets.LpkProfileBottomSheetFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [PreviewDelayWhenVideoCaptureIsBoundQuirk, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ PreviewDelayWhenVideoCaptureIsBoundQuirk invoke() {
                LifecycleOwner lifecycleOwner = previewPixelHDRnet;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PreviewDelayWhenVideoCaptureIsBoundQuirk.class);
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

    /* JADX INFO: renamed from: PreviewPixelHDRnet$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LPreviewPixelHDRnet$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "", "p0", "LPreviewPixelHDRnet;", "b", "(Ljava/lang/String;)LPreviewPixelHDRnet;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static PreviewPixelHDRnet b(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            PreviewPixelHDRnet previewPixelHDRnet = new PreviewPixelHDRnet();
            Bundle bundle = new Bundle();
            bundle.putString("lpk_code", p0);
            previewPixelHDRnet.setArguments(bundle);
            return previewPixelHDRnet;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentLpkProfileBottomSheetBinding fragmentLpkProfileBottomSheetBindingInflate = FragmentLpkProfileBottomSheetBinding.inflate(p0, p1, false);
        this.b = fragmentLpkProfileBottomSheetBindingInflate;
        if (fragmentLpkProfileBottomSheetBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentLpkProfileBottomSheetBindingInflate = null;
        }
        ConstraintLayout root = fragmentLpkProfileBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    public static /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault1(PreviewPixelHDRnet previewPixelHDRnet) {
        String string;
        Bundle arguments = previewPixelHDRnet.getArguments();
        return (arguments == null || (string = arguments.getString("lpk_code", "")) == null) ? "" : string;
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(PreviewPixelHDRnet previewPixelHDRnet, VirtualCameraAdapter1 virtualCameraAdapter1) {
        FragmentLpkProfileBottomSheetBinding fragmentLpkProfileBottomSheetBinding = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            FragmentLpkProfileBottomSheetBinding fragmentLpkProfileBottomSheetBinding2 = previewPixelHDRnet.b;
            if (fragmentLpkProfileBottomSheetBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentLpkProfileBottomSheetBinding = fragmentLpkProfileBottomSheetBinding2;
            }
            MultiStateView multiStateView = fragmentLpkProfileBottomSheetBinding.msvContent;
            Intrinsics.checkNotNullExpressionValue(multiStateView, "");
            multiStateView.setViewState(MultiStateView.ViewState.LOADING);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            FragmentLpkProfileBottomSheetBinding fragmentLpkProfileBottomSheetBinding3 = previewPixelHDRnet.b;
            if (fragmentLpkProfileBottomSheetBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentLpkProfileBottomSheetBinding3 = null;
            }
            MultiStateView multiStateView2 = fragmentLpkProfileBottomSheetBinding3.msvContent;
            Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
            multiStateView2.setViewState(MultiStateView.ViewState.CONTENT);
            PickVisualMediaRequestdefault pickVisualMediaRequestdefault = (PickVisualMediaRequestdefault) CollectionsKt.first((List) ((Pair) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getFirst());
            FragmentLpkProfileBottomSheetBinding fragmentLpkProfileBottomSheetBinding4 = previewPixelHDRnet.b;
            if (fragmentLpkProfileBottomSheetBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentLpkProfileBottomSheetBinding = fragmentLpkProfileBottomSheetBinding4;
            }
            fragmentLpkProfileBottomSheetBinding.tvLpkName.setText(pickVisualMediaRequestdefault.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            fragmentLpkProfileBottomSheetBinding.tvLpkAddress.setText(pickVisualMediaRequestdefault.b);
            fragmentLpkProfileBottomSheetBinding.tvEmail.setText(pickVisualMediaRequestdefault.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            fragmentLpkProfileBottomSheetBinding.tvPhoneNumber.setText(pickVisualMediaRequestdefault.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            FragmentLpkProfileBottomSheetBinding fragmentLpkProfileBottomSheetBinding5 = previewPixelHDRnet.b;
            if (fragmentLpkProfileBottomSheetBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentLpkProfileBottomSheetBinding5 = null;
            }
            MultiStateView multiStateView3 = fragmentLpkProfileBottomSheetBinding5.msvContent;
            Intrinsics.checkNotNullExpressionValue(multiStateView3, "");
            getCameraUseCaseAdapter.TuitionPaymentFragmentbindingInflater1(multiStateView3, ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault2, null, null, null);
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        ((PreviewDelayWhenVideoCaptureIsBoundQuirk) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1.observe(this, new Observer() { // from class: lambdagetRequestsProcessedFuture0
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                PreviewPixelHDRnet.TuitionPaymentFragmentbindingInflater1(this.b, (VirtualCameraAdapter1) obj);
            }
        });
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        ((PreviewDelayWhenVideoCaptureIsBoundQuirk) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1((String) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue());
    }
}
