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
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentBranchOfficeDirectoryBinding;
import com.bpjstku.domain.branchoffice.model.Office;
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
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0013\u0010\u0003J\u0019\u0010\u0014\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0013\u001a\u00020\u00168CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0015\u0010\u000e\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0016\u0010\u0010\u001a\u00020\u001c8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0015X\u0095D¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!"}, d2 = {"LdoShow;", "LunregisterMediaButtonEventReceiver;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "a", "b", "onCreate", "(Landroid/os/Bundle;)V", "LdrawSelectorCompat;", "Lkotlin/Lazy;", "Lcom/bpjstku/domain/branchoffice/model/RegionalOffice;", "Lcom/bpjstku/domain/branchoffice/model/RegionalOffice;", "TuitionPaymentFragmentbindingInflater1", "LshowForActionMode;", "Lcom/bpjstku/databinding/FragmentBranchOfficeDirectoryBinding;", "Lcom/bpjstku/databinding/FragmentBranchOfficeDirectoryBinding;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "I", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class doShow extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: enableContentAnimations
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return doShow.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    });
    private final int TuitionPaymentFragmentspecialinlinedviewModeldefault2 = R.layout.fragment_branch_office_directory;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private RegionalOffice TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private FragmentBranchOfficeDirectoryBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    static final /* synthetic */ class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements Observer, FunctionAdapter {
        private final /* synthetic */ Function1 TuitionPaymentFragmentspecialinlinedviewModeldefault3;

        TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
            return this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.invoke(obj);
        }
    }

    public doShow() {
        final doShow doshow = this;
        this.b = LazyKt.lazy(new Function0<drawSelectorCompat>() { // from class: com.bpjstku.presentation.branchoffice.BranchOfficeDirectoryFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [drawSelectorCompat, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final drawSelectorCompat invoke() {
                ComponentCallbacks componentCallbacks = doshow;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(drawSelectorCompat.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: doShow$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"LdoShow$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/bpjstku/domain/branchoffice/model/RegionalOffice;", "p0", "LdoShow;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/bpjstku/domain/branchoffice/model/RegionalOffice;)LdoShow;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static doShow TuitionPaymentFragmentbindingInflater1(RegionalOffice p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            doShow doshow = new doShow();
            Bundle bundle = new Bundle();
            bundle.putParcelable("regional_office", p0);
            doshow.setArguments(bundle);
            return doshow;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) throws Throwable {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentBranchOfficeDirectoryBinding fragmentBranchOfficeDirectoryBindingInflate = FragmentBranchOfficeDirectoryBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = fragmentBranchOfficeDirectoryBindingInflate;
        if (fragmentBranchOfficeDirectoryBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentBranchOfficeDirectoryBindingInflate = null;
        }
        RelativeLayout root = fragmentBranchOfficeDirectoryBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        Bundle arguments = getArguments();
        this.TuitionPaymentFragmentbindingInflater1 = arguments != null ? (RegionalOffice) arguments.getParcelable("regional_office") : null;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        FragmentBranchOfficeDirectoryBinding fragmentBranchOfficeDirectoryBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (fragmentBranchOfficeDirectoryBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentBranchOfficeDirectoryBinding = null;
        }
        RecyclerView recyclerView = fragmentBranchOfficeDirectoryBinding.rvBranchOfficeDirectory;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(requireContext(), 1));
        recyclerView.setAdapter((showForActionMode) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        FragmentBranchOfficeDirectoryBinding fragmentBranchOfficeDirectoryBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        FragmentBranchOfficeDirectoryBinding fragmentBranchOfficeDirectoryBinding2 = null;
        if (fragmentBranchOfficeDirectoryBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentBranchOfficeDirectoryBinding = null;
        }
        SearchView searchView = fragmentBranchOfficeDirectoryBinding.svSearchItem;
        Intrinsics.checkNotNullExpressionValue(searchView, "");
        retrieveConcurrentCameraIds.b(searchView, (Function1<? super String, Unit>) new Function1() { // from class: showForSystem
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return doShow.TuitionPaymentFragmentbindingInflater1(this.b, (String) obj);
            }
        });
        FragmentBranchOfficeDirectoryBinding fragmentBranchOfficeDirectoryBinding3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (fragmentBranchOfficeDirectoryBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentBranchOfficeDirectoryBinding3 = null;
        }
        AppCompatImageView appCompatImageView = fragmentBranchOfficeDirectoryBinding3.imgBack;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setOnClickListener(new isBound(new Function1() { // from class: onContentScrollStarted
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return doShow.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (View) obj);
            }
        }));
        FragmentBranchOfficeDirectoryBinding fragmentBranchOfficeDirectoryBinding4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (fragmentBranchOfficeDirectoryBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentBranchOfficeDirectoryBinding2 = fragmentBranchOfficeDirectoryBinding4;
        }
        AppCompatImageView appCompatImageView2 = fragmentBranchOfficeDirectoryBinding2.imgCollapseBottomSheetDirectory;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        appCompatImageView2.setOnClickListener(new isBound(new Function1() { // from class: onWindowVisibilityChanged
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return doShow.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (View) obj);
            }
        }));
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle p0) {
        super.onCreate(p0);
        setStyle(2, R.style.AppBottomSheetDialogTheme);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(final doShow doshow, String str) {
        FragmentBranchOfficeDirectoryBinding fragmentBranchOfficeDirectoryBinding;
        Context contextRequireContext = doshow.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        Iterable iterable = ((showForActionMode) doshow.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).d;
        Intrinsics.checkNotNullExpressionValue(iterable, "");
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (true) {
            fragmentBranchOfficeDirectoryBinding = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String str2 = ((Office) next).TuitionPaymentFragmentbindingInflater1;
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            String lowerCase = str2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) (str == null ? "" : str), false, 2, (Object) null)) {
                arrayList.add(next);
            }
        }
        showForActionMode showforactionmode = new showForActionMode(contextRequireContext, arrayList, new Function1() { // from class: hideForSystem
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return doShow.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (Office) obj);
            }
        });
        FragmentBranchOfficeDirectoryBinding fragmentBranchOfficeDirectoryBinding2 = doshow.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (fragmentBranchOfficeDirectoryBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentBranchOfficeDirectoryBinding = fragmentBranchOfficeDirectoryBinding2;
        }
        RecyclerView recyclerView = fragmentBranchOfficeDirectoryBinding.rvBranchOfficeDirectory;
        recyclerView.setLayoutManager(new LinearLayoutManager(doshow.requireContext()));
        recyclerView.setAdapter(showforactionmode);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(doShow doshow) {
        doshow.a();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ showForActionMode TuitionPaymentFragmentspecialinlinedviewModeldefault2(final doShow doshow) {
        Context contextRequireContext = doshow.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new showForActionMode(contextRequireContext, new ArrayList(), new Function1() { // from class: hasIcon
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return doShow.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (Office) obj);
            }
        });
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(doShow doshow, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        doshow.dismiss();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(doShow doshow, Office office) {
        Intrinsics.checkNotNullParameter(office, "");
        BranchOfficeActivity.Companion companion = BranchOfficeActivity.INSTANCE;
        Context contextRequireContext = doshow.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        BranchOfficeActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, office);
        doshow.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(doShow doshow, Office office) {
        Intrinsics.checkNotNullParameter(office, "");
        BranchOfficeActivity.Companion companion = BranchOfficeActivity.INSTANCE;
        Context contextRequireContext = doshow.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        BranchOfficeActivity.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(contextRequireContext, office);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(doShow doshow, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        doshow.dismiss();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(final doShow doshow, VirtualCameraAdapter1 virtualCameraAdapter1) {
        FragmentBranchOfficeDirectoryBinding fragmentBranchOfficeDirectoryBinding = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            FragmentBranchOfficeDirectoryBinding fragmentBranchOfficeDirectoryBinding2 = doshow.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (fragmentBranchOfficeDirectoryBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentBranchOfficeDirectoryBinding = fragmentBranchOfficeDirectoryBinding2;
            }
            MultiStateView multiStateView = fragmentBranchOfficeDirectoryBinding.msvRegionalBranchOffice;
            Intrinsics.checkNotNullExpressionValue(multiStateView, "");
            multiStateView.setViewState(MultiStateView.ViewState.LOADING);
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            FragmentBranchOfficeDirectoryBinding fragmentBranchOfficeDirectoryBinding3 = doshow.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (fragmentBranchOfficeDirectoryBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentBranchOfficeDirectoryBinding = fragmentBranchOfficeDirectoryBinding3;
            }
            MultiStateView multiStateView2 = fragmentBranchOfficeDirectoryBinding.msvRegionalBranchOffice;
            Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
            multiStateView2.setViewState(MultiStateView.ViewState.CONTENT);
            ((showForActionMode) doshow.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3((List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            FragmentBranchOfficeDirectoryBinding fragmentBranchOfficeDirectoryBinding4 = doshow.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (fragmentBranchOfficeDirectoryBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentBranchOfficeDirectoryBinding = fragmentBranchOfficeDirectoryBinding4;
            }
            MultiStateView multiStateView3 = fragmentBranchOfficeDirectoryBinding.msvRegionalBranchOffice;
            Intrinsics.checkNotNullExpressionValue(multiStateView3, "");
            Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView3, ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, doshow.getString(R.string.error_error_occured), null, new Pair(doshow.getString(R.string.action_retry), new Function0() { // from class: doHide
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return doShow.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }));
        }
        return Unit.INSTANCE;
    }

    private final void a() {
        drawSelectorCompat drawselectorcompat = (drawSelectorCompat) this.b.getValue();
        RegionalOffice regionalOffice = this.TuitionPaymentFragmentbindingInflater1;
        drawselectorcompat.b(String.valueOf(regionalOffice != null ? regionalOffice.b : null));
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
        ((drawSelectorCompat) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.observe(getViewLifecycleOwner(), new TuitionPaymentFragmentspecialinlinedviewModeldefault2(new Function1() { // from class: hasLogo
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return doShow.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        }));
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        RegionalOffice regionalOffice = this.TuitionPaymentFragmentbindingInflater1;
        FragmentBranchOfficeDirectoryBinding fragmentBranchOfficeDirectoryBinding = null;
        String str = regionalOffice != null ? regionalOffice.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null;
        FragmentBranchOfficeDirectoryBinding fragmentBranchOfficeDirectoryBinding2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (fragmentBranchOfficeDirectoryBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentBranchOfficeDirectoryBinding = fragmentBranchOfficeDirectoryBinding2;
        }
        fragmentBranchOfficeDirectoryBinding.tvNameRegionalOffice.setText(str);
        a();
    }
}
