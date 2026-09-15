package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentRegionalOfficeDirectoryBinding;
import com.bpjstku.domain.branchoffice.model.RegionalOffice;
import com.bpjstku.presentation.branchoffice.BranchOfficeActivity;
import com.kennyc.view.MultiStateView;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.drawSelectorCompat;
import defpackage.getEventTime;
import defpackage.mapPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0003J\u0019\u0010\u0013\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u000e\u0010\u0016R\u0015\u0010\u0018\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0015\u0010\u001b\u001a\u00020\u001a8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u0012\u001a\u00020\u001c8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u001a\u0010\u0010\u001a\u00020\u001e8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0012\u0010\u001f\u001a\u0004\b\u001b\u0010 "}, d2 = {"LWindowDecorActionBar3;", "LunregisterMediaButtonEventReceiver;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/bpjstku/domain/branchoffice/model/RegionalOffice;", "(Lcom/bpjstku/domain/branchoffice/model/RegionalOffice;)V", "LonContentScrollStopped;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Lazy;", "LdrawSelectorCompat;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/bpjstku/databinding/FragmentRegionalOfficeDirectoryBinding;", "Lcom/bpjstku/databinding/FragmentRegionalOfficeDirectoryBinding;", "", "I", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WindowDecorActionBar3 extends unregisterMediaButtonEventReceiver {
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private FragmentRegionalOfficeDirectoryBinding b;
    private final Lazy TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: finish
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return WindowDecorActionBar3.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b);
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = R.layout.fragment_regional_office_directory;

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
    }

    public WindowDecorActionBar3() {
        final WindowDecorActionBar3 windowDecorActionBar3 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<drawSelectorCompat>() { // from class: com.bpjstku.presentation.branchoffice.RegionalOfficeDirectoryFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [drawSelectorCompat, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final drawSelectorCompat invoke() {
                ComponentCallbacks componentCallbacks = windowDecorActionBar3;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(drawSelectorCompat.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentRegionalOfficeDirectoryBinding fragmentRegionalOfficeDirectoryBindingInflate = FragmentRegionalOfficeDirectoryBinding.inflate(p0, p1, false);
        this.b = fragmentRegionalOfficeDirectoryBindingInflate;
        if (fragmentRegionalOfficeDirectoryBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentRegionalOfficeDirectoryBindingInflate = null;
        }
        RelativeLayout root = fragmentRegionalOfficeDirectoryBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        FragmentRegionalOfficeDirectoryBinding fragmentRegionalOfficeDirectoryBinding = this.b;
        if (fragmentRegionalOfficeDirectoryBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentRegionalOfficeDirectoryBinding = null;
        }
        RecyclerView recyclerView = fragmentRegionalOfficeDirectoryBinding.rvBranchOfficeDirectory;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(requireContext(), 1));
        recyclerView.setAdapter((onContentScrollStopped) this.TuitionPaymentFragmentbindingInflater1.getValue());
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        FragmentRegionalOfficeDirectoryBinding fragmentRegionalOfficeDirectoryBinding = this.b;
        FragmentRegionalOfficeDirectoryBinding fragmentRegionalOfficeDirectoryBinding2 = null;
        if (fragmentRegionalOfficeDirectoryBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentRegionalOfficeDirectoryBinding = null;
        }
        AppCompatImageView appCompatImageView = fragmentRegionalOfficeDirectoryBinding.imgCollapseBottomSheetDirectory;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setOnClickListener(new LifecycleCameraRepositoryKey(new Function1() { // from class: invalidate
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WindowDecorActionBar3.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1, (View) obj);
            }
        }));
        FragmentRegionalOfficeDirectoryBinding fragmentRegionalOfficeDirectoryBinding3 = this.b;
        if (fragmentRegionalOfficeDirectoryBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentRegionalOfficeDirectoryBinding2 = fragmentRegionalOfficeDirectoryBinding3;
        }
        SearchView searchView = fragmentRegionalOfficeDirectoryBinding2.svSearchItem;
        Intrinsics.checkNotNullExpressionValue(searchView, "");
        retrieveConcurrentCameraIds.b(searchView, (Function1<? super String, Unit>) new Function1() { // from class: isTitleOptional
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WindowDecorActionBar3.b(this.TuitionPaymentFragmentbindingInflater1, (String) obj);
            }
        });
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle p0) {
        super.onCreate(p0);
        setStyle(2, R.style.AppBottomSheetDialogTheme);
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(RegionalOffice p0) {
        dismiss();
        doShow.Companion tuitionPaymentFragmentspecialinlinedviewModeldefault1 = doShow.INSTANCE;
        doShow doshowTuitionPaymentFragmentbindingInflater1 = doShow.Companion.TuitionPaymentFragmentbindingInflater1(p0);
        Context context = getContext();
        Intrinsics.checkNotNull(context, "");
        FragmentManager supportFragmentManager = ((BranchOfficeActivity) context).getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        Intrinsics.checkNotNullParameter(supportFragmentManager, "");
        if (supportFragmentManager.findFragmentByTag(doshowTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            doshowTuitionPaymentFragmentbindingInflater1.show(supportFragmentManager, doshowTuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final WindowDecorActionBar3 windowDecorActionBar3, VirtualCameraAdapter1 virtualCameraAdapter1) {
        FragmentRegionalOfficeDirectoryBinding fragmentRegionalOfficeDirectoryBinding = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            FragmentRegionalOfficeDirectoryBinding fragmentRegionalOfficeDirectoryBinding2 = windowDecorActionBar3.b;
            if (fragmentRegionalOfficeDirectoryBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentRegionalOfficeDirectoryBinding = fragmentRegionalOfficeDirectoryBinding2;
            }
            MultiStateView multiStateView = fragmentRegionalOfficeDirectoryBinding.msvRegionalOffice;
            Intrinsics.checkNotNullExpressionValue(multiStateView, "");
            multiStateView.setViewState(MultiStateView.ViewState.LOADING);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            FragmentRegionalOfficeDirectoryBinding fragmentRegionalOfficeDirectoryBinding3 = windowDecorActionBar3.b;
            if (fragmentRegionalOfficeDirectoryBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentRegionalOfficeDirectoryBinding = fragmentRegionalOfficeDirectoryBinding3;
            }
            MultiStateView multiStateView2 = fragmentRegionalOfficeDirectoryBinding.msvRegionalOffice;
            Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
            multiStateView2.setViewState(MultiStateView.ViewState.CONTENT);
            ((onContentScrollStopped) windowDecorActionBar3.TuitionPaymentFragmentbindingInflater1.getValue()).b((List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            FragmentRegionalOfficeDirectoryBinding fragmentRegionalOfficeDirectoryBinding4 = windowDecorActionBar3.b;
            if (fragmentRegionalOfficeDirectoryBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentRegionalOfficeDirectoryBinding = fragmentRegionalOfficeDirectoryBinding4;
            }
            MultiStateView multiStateView3 = fragmentRegionalOfficeDirectoryBinding.msvRegionalOffice;
            Intrinsics.checkNotNullExpressionValue(multiStateView3, "");
            Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView3, ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, windowDecorActionBar3.getString(R.string.error_error_occured), null, new Pair(windowDecorActionBar3.getString(R.string.action_retry), new Function0() { // from class: WindowDecorActionBar2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WindowDecorActionBar3.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }));
        }
    }

    public static /* synthetic */ Unit b(WindowDecorActionBar3 windowDecorActionBar3, RegionalOffice regionalOffice) {
        Intrinsics.checkNotNullParameter(regionalOffice, "");
        windowDecorActionBar3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(regionalOffice);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(WindowDecorActionBar3 windowDecorActionBar3) {
        ((drawSelectorCompat) windowDecorActionBar3.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ onContentScrollStopped TuitionPaymentFragmentspecialinlinedviewModeldefault2(final WindowDecorActionBar3 windowDecorActionBar3) {
        Context contextRequireContext = windowDecorActionBar3.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new onContentScrollStopped(contextRequireContext, new ArrayList(), new Function1() { // from class: WindowDecorActionBarActionModeImpl
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WindowDecorActionBar3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (RegionalOffice) obj);
            }
        });
    }

    public static /* synthetic */ Unit b(final WindowDecorActionBar3 windowDecorActionBar3, String str) {
        FragmentRegionalOfficeDirectoryBinding fragmentRegionalOfficeDirectoryBinding;
        Context contextRequireContext = windowDecorActionBar3.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        Iterable iterable = ((onContentScrollStopped) windowDecorActionBar3.TuitionPaymentFragmentbindingInflater1.getValue()).d;
        Intrinsics.checkNotNullExpressionValue(iterable, "");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (true) {
            fragmentRegionalOfficeDirectoryBinding = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String str2 = ((RegionalOffice) next).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            String lowerCase = str2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) (str == null ? "" : str), false, 2, (Object) null)) {
                arrayList.add(next);
            }
        }
        onContentScrollStopped oncontentscrollstopped = new onContentScrollStopped(contextRequireContext, arrayList, new Function1() { // from class: onAnimationUpdate
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WindowDecorActionBar3.b(this.b, (RegionalOffice) obj);
            }
        });
        FragmentRegionalOfficeDirectoryBinding fragmentRegionalOfficeDirectoryBinding2 = windowDecorActionBar3.b;
        if (fragmentRegionalOfficeDirectoryBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentRegionalOfficeDirectoryBinding = fragmentRegionalOfficeDirectoryBinding2;
        }
        RecyclerView recyclerView = fragmentRegionalOfficeDirectoryBinding.rvBranchOfficeDirectory;
        recyclerView.setLayoutManager(new LinearLayoutManager(windowDecorActionBar3.requireContext()));
        recyclerView.setAdapter(oncontentscrollstopped);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(WindowDecorActionBar3 windowDecorActionBar3, RegionalOffice regionalOffice) {
        Intrinsics.checkNotNullParameter(regionalOffice, "");
        windowDecorActionBar3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(regionalOffice);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(WindowDecorActionBar3 windowDecorActionBar3, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        windowDecorActionBar3.dismiss();
        return Unit.INSTANCE;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        ((drawSelectorCompat) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).asInterface.observe(getViewLifecycleOwner(), new Observer() { // from class: onCloseSubMenu
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                WindowDecorActionBar3.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        });
        ((drawSelectorCompat) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }
}
