package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentGeneralListBottomSheetBinding;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.presentation.membership.registration.model.WorkLocation;
import com.bpjstku.presentation.membership.registration.nonsalariedworker.WorkLocationBottomSheetDialogFragment$handleItemClicked$1;
import com.bpjstku.presentation.membership.registration.nonsalariedworker.WorkLocationBottomSheetDialogFragment$workLocationAdapter$2$1;
import com.kennyc.view.MultiStateView;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.getImeOptions;
import defpackage.mapPoint;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0011R\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0013\u001a\u00020\u00188CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0016\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0015\u001a\u00020\u001e8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001fR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0015\u0010!"}, d2 = {"LgetActivitySideSheetPosition;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function1;", "Lcom/bpjstku/presentation/membership/registration/model/WorkLocation;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/jvm/functions/Function1;", "LToolbarExternalSyntheticLambda0;", "asBinder", "Lkotlin/Lazy;", "LgetImeOptions;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/bpjstku/presentation/membership/registration/model/WorkLocation;", "", "()I", "Lcom/bpjstku/databinding/FragmentGeneralListBottomSheetBinding;", "Lcom/bpjstku/databinding/FragmentGeneralListBottomSheetBinding;", "asInterface"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getActivitySideSheetPosition extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Function1<WorkLocation, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private WorkLocation TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private FragmentGeneralListBottomSheetBinding asInterface;

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getG() {
        return R.layout.fragment_general_list_bottom_sheet;
    }

    public /* synthetic */ getActivitySideSheetPosition(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getActivitySideSheetPosition(Function1<? super WorkLocation, Unit> function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: getActivitySideSheetDecorationType
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return getActivitySideSheetPosition.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
        final getActivitySideSheetPosition getactivitysidesheetposition = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<getImeOptions>() { // from class: com.bpjstku.presentation.membership.registration.nonsalariedworker.WorkLocationBottomSheetDialogFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [getImeOptions, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final getImeOptions invoke() {
                ComponentCallbacks componentCallbacks = getactivitysidesheetposition;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(getImeOptions.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: getActivitySideSheetPosition$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"LgetActivitySideSheetPosition$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/bpjstku/presentation/membership/registration/model/WorkLocation;", "p0", "Lkotlin/Function1;", "", "p1", "LgetActivitySideSheetPosition;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/bpjstku/presentation/membership/registration/model/WorkLocation;Lkotlin/jvm/functions/Function1;)LgetActivitySideSheetPosition;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static getActivitySideSheetPosition TuitionPaymentFragmentbindingInflater1(WorkLocation p0, Function1<? super WorkLocation, Unit> p1) {
            getActivitySideSheetPosition getactivitysidesheetposition = new getActivitySideSheetPosition(p1);
            Bundle bundle = new Bundle();
            if (p0 != null) {
                bundle.putParcelable("work_location", p0);
            }
            getactivitysidesheetposition.setArguments(bundle);
            return getactivitysidesheetposition;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBindingInflate = FragmentGeneralListBottomSheetBinding.inflate(p0, p1, false);
        this.asInterface = fragmentGeneralListBottomSheetBindingInflate;
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
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            Bundle arguments = getArguments();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = arguments != null ? (WorkLocation) arguments.getParcelable("work_location") : null;
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        TuitionPaymentFragmentbindingInflater1();
        ToolbarExternalSyntheticLambda0 toolbarExternalSyntheticLambda0 = (ToolbarExternalSyntheticLambda0) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        toolbarExternalSyntheticLambda0.d.clear();
        toolbarExternalSyntheticLambda0.notifyDataSetChanged();
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = this.asInterface;
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding2 = null;
        if (fragmentGeneralListBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralListBottomSheetBinding = null;
        }
        RecyclerView recyclerView = fragmentGeneralListBottomSheetBinding.rvItem;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(requireContext(), 1));
        recyclerView.setAdapter((ToolbarExternalSyntheticLambda0) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue());
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding3 = this.asInterface;
        if (fragmentGeneralListBottomSheetBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralListBottomSheetBinding3 = null;
        }
        fragmentGeneralListBottomSheetBinding3.tvTitle.setText(getString(R.string.label_work_location));
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding4 = this.asInterface;
        if (fragmentGeneralListBottomSheetBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentGeneralListBottomSheetBinding2 = fragmentGeneralListBottomSheetBinding4;
        }
        fragmentGeneralListBottomSheetBinding2.svSearchItem.setQueryHint(getString(R.string.label_work_location));
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = this.asInterface;
        if (fragmentGeneralListBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralListBottomSheetBinding = null;
        }
        SearchView searchView = fragmentGeneralListBottomSheetBinding.svSearchItem;
        Intrinsics.checkNotNullExpressionValue(searchView, "");
        retrieveConcurrentCameraIds.b(searchView, new getActivitySideSheetRoundedCornersPosition(this));
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(getActivitySideSheetPosition getactivitysidesheetposition, String str) {
        ToolbarExternalSyntheticLambda0 toolbarExternalSyntheticLambda0 = (ToolbarExternalSyntheticLambda0) getactivitysidesheetposition.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        if (str == null) {
            str = "";
        }
        toolbarExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1(str);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static /* synthetic */ void b(final getActivitySideSheetPosition getactivitysidesheetposition, VirtualCameraAdapter1 virtualCameraAdapter1) {
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding2 = getactivitysidesheetposition.asInterface;
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
            FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding3 = getactivitysidesheetposition.asInterface;
            if (fragmentGeneralListBottomSheetBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentGeneralListBottomSheetBinding3 = null;
            }
            MultiStateView multiStateView2 = fragmentGeneralListBottomSheetBinding3.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
            multiStateView2.setViewState(MultiStateView.ViewState.CONTENT);
            List<CodeNamePair> list = (List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (CodeNamePair codeNamePair : list) {
                arrayList.add(new lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy(new WorkLocation(codeNamePair.b, codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1)));
            }
            ((ToolbarExternalSyntheticLambda0) getactivitysidesheetposition.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(arrayList);
            WorkLocation workLocation = getactivitysidesheetposition.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (workLocation != null) {
                Iterable iterable = ((ToolbarExternalSyntheticLambda0) getactivitysidesheetposition.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).d;
                Intrinsics.checkNotNullExpressionValue(iterable, "");
                int i = 0;
                for (Object obj : iterable) {
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy = (lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy) obj;
                    lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentbindingInflater1 = Intrinsics.areEqual(workLocation.TuitionPaymentFragmentbindingInflater1, ((WorkLocation) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).TuitionPaymentFragmentbindingInflater1);
                    ((ToolbarExternalSyntheticLambda0) getactivitysidesheetposition.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).d.set(i, (Data) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy);
                    if (Intrinsics.areEqual(workLocation.TuitionPaymentFragmentbindingInflater1, ((WorkLocation) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).TuitionPaymentFragmentbindingInflater1)) {
                        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding4 = getactivitysidesheetposition.asInterface;
                        if (fragmentGeneralListBottomSheetBinding4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            fragmentGeneralListBottomSheetBinding4 = null;
                        }
                        fragmentGeneralListBottomSheetBinding4.rvItem.scrollToPosition(i);
                    }
                    i++;
                }
                return;
            }
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding5 = getactivitysidesheetposition.asInterface;
            if (fragmentGeneralListBottomSheetBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentGeneralListBottomSheetBinding = fragmentGeneralListBottomSheetBinding5;
            }
            MultiStateView multiStateView3 = fragmentGeneralListBottomSheetBinding.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView3, "");
            Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView3, ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, getactivitysidesheetposition.getString(R.string.error_error_occured), null, new Pair(getactivitysidesheetposition.getString(R.string.action_retry), new Function0() { // from class: getActivitySideSheetBreakpointDp
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return getActivitySideSheetPosition.b(this.b);
                }
            }));
        }
    }

    public static /* synthetic */ Unit b(getActivitySideSheetPosition getactivitysidesheetposition) {
        ((getImeOptions) getactivitysidesheetposition.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentbindingInflater1();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ ToolbarExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault1(getActivitySideSheetPosition getactivitysidesheetposition) {
        Context contextRequireContext = getactivitysidesheetposition.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new ToolbarExternalSyntheticLambda0(contextRequireContext, null, new WorkLocationBottomSheetDialogFragment$workLocationAdapter$2$1(getactivitysidesheetposition), 2, null);
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(getActivitySideSheetPosition getactivitysidesheetposition, WorkLocation workLocation) {
        getactivitysidesheetposition.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = workLocation;
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new WorkLocationBottomSheetDialogFragment$handleItemClicked$1(getactivitysidesheetposition, workLocation, null), 3, null);
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
        ((getImeOptions) this.TuitionPaymentFragmentbindingInflater1.getValue()).cancel.observe(getViewLifecycleOwner(), new Observer() { // from class: getActivityResizeBehavior
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                getActivitySideSheetPosition.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (VirtualCameraAdapter1) obj);
            }
        });
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        ((getImeOptions) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentbindingInflater1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getActivitySideSheetPosition() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
