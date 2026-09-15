package defpackage;

import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentGeneralListBottomSheetBinding;
import com.bpjstku.domain.branchoffice.model.Office;
import com.bpjstku.domain.branchoffice.model.RegionalOffice;
import com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOfficeBottomSheetDialogFragment$handleItemClicked$1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.kennyc.view.MultiStateView;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.drawSelectorCompat;
import defpackage.getEventTime;
import defpackage.mapPoint;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0003R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR*\u0010\u001e\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0015\u0010\"\u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b \u0010!R\u0015\u0010 \u001a\u00020#8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010!R\u001a\u0010\u0011\u001a\u00020$8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0012\u0010%\u001a\u0004\b\"\u0010&R\u0016\u0010\u000f\u001a\u00020'8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u000e\u0010("}, d2 = {"LlambdaonUseCaseInactive8androidxcameracamera2internalCamera2CameraImpl;", "LunregisterMediaButtonEventReceiver;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "", "Lcom/bpjstku/domain/branchoffice/model/Office;", "Ljava/util/List;", "LlambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy;", "asBinder", "LlambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy;", "Lcom/bpjstku/domain/branchoffice/model/RegionalOffice;", "asInterface", "Lcom/bpjstku/domain/branchoffice/model/RegionalOffice;", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentbindingInflater1", "LdrawSelectorCompat;", "a", "Lkotlin/Lazy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LshowForActionMode;", "", "I", "()I", "Lcom/bpjstku/databinding/FragmentGeneralListBottomSheetBinding;", "Lcom/bpjstku/databinding/FragmentGeneralListBottomSheetBinding;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class lambdaonUseCaseInactive8androidxcameracamera2internalCamera2CameraImpl extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private FragmentGeneralListBottomSheetBinding g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<Office> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private RegionalOffice TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Function1<? super lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<Office>, Unit> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private List<Office> b = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy a = LazyKt.lazy(new Function0() { // from class: onUseCaseReset
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return lambdaonUseCaseInactive8androidxcameracamera2internalCamera2CameraImpl.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int d = R.layout.fragment_general_list_bottom_sheet;

    public lambdaonUseCaseInactive8androidxcameracamera2internalCamera2CameraImpl() {
        final lambdaonUseCaseInactive8androidxcameracamera2internalCamera2CameraImpl lambdaonusecaseinactive8androidxcameracamera2internalcamera2cameraimpl = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<drawSelectorCompat>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.claim.ClaimOfficeBottomSheetDialogFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [drawSelectorCompat, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final drawSelectorCompat invoke() {
                ComponentCallbacks componentCallbacks = lambdaonusecaseinactive8androidxcameracamera2internalcamera2cameraimpl;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(drawSelectorCompat.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    public final int getD() {
        return this.d;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBindingInflate = FragmentGeneralListBottomSheetBinding.inflate(p0, p1, false);
        this.g = fragmentGeneralListBottomSheetBindingInflate;
        if (fragmentGeneralListBottomSheetBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralListBottomSheetBindingInflate = null;
        }
        LinearLayout root = fragmentGeneralListBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        Bundle arguments = getArguments();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = arguments != null ? (RegionalOffice) arguments.getParcelable("regional_office") : null;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = this.g;
        if (fragmentGeneralListBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralListBottomSheetBinding = null;
        }
        showForActionMode showforactionmode = (showForActionMode) this.a.getValue();
        showforactionmode.d.clear();
        showforactionmode.notifyDataSetChanged();
        ((showForActionMode) this.a.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
        RecyclerView recyclerView = fragmentGeneralListBottomSheetBinding.rvItem;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter((showForActionMode) this.a.getValue());
        SearchView searchView = fragmentGeneralListBottomSheetBinding.svSearchItem;
        Intrinsics.checkNotNullExpressionValue(searchView, "");
        searchView.setVisibility(8);
        fragmentGeneralListBottomSheetBinding.tvTitle.setText(getString(R.string.label_branch_office));
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: onUseCaseInactive
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    lambdaonUseCaseInactive8androidxcameracamera2internalCamera2CameraImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
            });
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdaonUseCaseInactive8androidxcameracamera2internalCamera2CameraImpl lambdaonusecaseinactive8androidxcameracamera2internalcamera2cameraimpl) {
        Dialog dialog = lambdaonusecaseinactive8androidxcameracamera2internalcamera2cameraimpl.getDialog();
        Intrinsics.checkNotNull(dialog, "");
        View viewFindViewById = ((BottomSheetDialog) dialog).findViewById(R.id.design_bottom_sheet);
        Intrinsics.checkNotNull(viewFindViewById, "");
        BottomSheetBehavior.from((FrameLayout) viewFindViewById).setState(3);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdaonUseCaseInactive8androidxcameracamera2internalCamera2CameraImpl lambdaonusecaseinactive8androidxcameracamera2internalcamera2cameraimpl, Office office) {
        Intrinsics.checkNotNullParameter(office, "");
        lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<Office> lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy = new lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<>(office);
        lambdaonusecaseinactive8androidxcameracamera2internalcamera2cameraimpl.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy;
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new ClaimOfficeBottomSheetDialogFragment$handleItemClicked$1(lambdaonusecaseinactive8androidxcameracamera2internalcamera2cameraimpl, lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy, null), 3, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ showForActionMode b(final lambdaonUseCaseInactive8androidxcameracamera2internalCamera2CameraImpl lambdaonusecaseinactive8androidxcameracamera2internalcamera2cameraimpl) {
        Context contextRequireContext = lambdaonusecaseinactive8androidxcameracamera2internalcamera2cameraimpl.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new showForActionMode(contextRequireContext, new ArrayList(), new Function1() { // from class: lambdasetActiveResumingMode18androidxcameracamera2internalCamera2CameraImpl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return lambdaonUseCaseInactive8androidxcameracamera2internalCamera2CameraImpl.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (Office) obj);
            }
        });
    }

    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(lambdaonUseCaseInactive8androidxcameracamera2internalCamera2CameraImpl lambdaonusecaseinactive8androidxcameracamera2internalcamera2cameraimpl, VirtualCameraAdapter1 virtualCameraAdapter1) {
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding2 = lambdaonusecaseinactive8androidxcameracamera2internalcamera2cameraimpl.g;
            if (fragmentGeneralListBottomSheetBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentGeneralListBottomSheetBinding = fragmentGeneralListBottomSheetBinding2;
            }
            MultiStateView multiStateView = fragmentGeneralListBottomSheetBinding.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView, "");
            multiStateView.setViewState(MultiStateView.ViewState.LOADING);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding3 = lambdaonusecaseinactive8androidxcameracamera2internalcamera2cameraimpl.g;
            if (fragmentGeneralListBottomSheetBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentGeneralListBottomSheetBinding = fragmentGeneralListBottomSheetBinding3;
            }
            MultiStateView multiStateView2 = fragmentGeneralListBottomSheetBinding.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
            multiStateView2.setViewState(MultiStateView.ViewState.CONTENT);
            ((showForActionMode) lambdaonusecaseinactive8androidxcameracamera2internalcamera2cameraimpl.a.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3((List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding4 = lambdaonusecaseinactive8androidxcameracamera2internalcamera2cameraimpl.g;
            if (fragmentGeneralListBottomSheetBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentGeneralListBottomSheetBinding = fragmentGeneralListBottomSheetBinding4;
            }
            MultiStateView multiStateView3 = fragmentGeneralListBottomSheetBinding.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView3, "");
            Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView3, ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, null, null, null);
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
        ((drawSelectorCompat) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.observe(this, new Observer() { // from class: lambdaopenCameraConfigAndClose1androidxcameracamera2internalCamera2CameraImpl
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                lambdaonUseCaseInactive8androidxcameracamera2internalCamera2CameraImpl.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        drawSelectorCompat drawselectorcompat = (drawSelectorCompat) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        RegionalOffice regionalOffice = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        drawselectorcompat.b(String.valueOf(regionalOffice != null ? regionalOffice.b : null));
    }
}
