package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentGeneralListBottomSheetBinding;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.presentation.membership.registration.indonesianmigranworker.CountryBottomSheetDialogFragment$countryAdapter$2$1;
import com.bpjstku.presentation.membership.registration.indonesianmigranworker.CountryBottomSheetDialogFragment$handleItemClicked$1;
import com.kennyc.view.MultiStateView;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.onSuggestionClick;
import defpackage.setQuickZoomEnabled;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0011R\"\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0015\u0010\u001a\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0010\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\"\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001d0\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u0012\u001a\u00020\"8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001a\u0010#R\u001a\u0010'\u001a\u00020$8\u0015X\u0095D¢\u0006\f\n\u0004\b\u001f\u0010%\u001a\u0004\b\u001f\u0010&"}, d2 = {"LsetTitleTextColor;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function1;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "Lkotlin/jvm/functions/Function1;", "LonSuggestionClick;", "asInterface", "Lkotlin/Lazy;", "TuitionPaymentFragmentbindingInflater1", "LsetContentInsetStartWithNavigation;", "", "LlambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy;", "Ljava/util/List;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "a", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "Lcom/bpjstku/databinding/FragmentGeneralListBottomSheetBinding;", "Lcom/bpjstku/databinding/FragmentGeneralListBottomSheetBinding;", "", "I", "()I", "asBinder"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setTitleTextColor extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private FragmentGeneralListBottomSheetBinding g;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final int asBinder;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private CodeNamePair TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;
    private final Function1<CodeNamePair, Unit> b;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<CodeNamePair>> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public /* synthetic */ setTitleTextColor(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setTitleTextColor(Function1<? super CodeNamePair, Unit> function1) {
        this.b = function1;
        final setTitleTextColor settitletextcolor = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<onSuggestionClick>() { // from class: com.bpjstku.presentation.membership.registration.indonesianmigranworker.CountryBottomSheetDialogFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, onSuggestionClick] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ onSuggestionClick invoke() {
                LifecycleOwner lifecycleOwner = settitletextcolor;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(onSuggestionClick.class);
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: newOnBackInvokedCallback
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return setTitleTextColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = CollectionsKt.emptyList();
        this.asBinder = R.layout.fragment_general_list_bottom_sheet;
    }

    /* JADX INFO: renamed from: setTitleTextColor$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"LsetTitleTextColor$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "p0", "Lkotlin/Function1;", "", "p1", "LsetTitleTextColor;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(Lcom/bpjstku/domain/general/model/CodeNamePair;Lkotlin/jvm/functions/Function1;)LsetTitleTextColor;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static setTitleTextColor TuitionPaymentFragmentspecialinlinedviewModeldefault3(CodeNamePair p0, Function1<? super CodeNamePair, Unit> p1) {
            setTitleTextColor settitletextcolor = new setTitleTextColor(p1);
            Bundle bundle = new Bundle();
            if (p0 != null) {
                bundle.putParcelable("placement_country", p0);
            }
            settitletextcolor.setArguments(bundle);
            return settitletextcolor;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    public final int getD() {
        return this.asBinder;
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
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            Bundle arguments = getArguments();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = arguments != null ? (CodeNamePair) arguments.getParcelable("placement_country") : null;
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = this.g;
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding2 = null;
        if (fragmentGeneralListBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralListBottomSheetBinding = null;
        }
        RecyclerView recyclerView = fragmentGeneralListBottomSheetBinding.rvItem;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(requireContext(), 1));
        recyclerView.setAdapter((setContentInsetStartWithNavigation) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding3 = this.g;
        if (fragmentGeneralListBottomSheetBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentGeneralListBottomSheetBinding2 = fragmentGeneralListBottomSheetBinding3;
        }
        fragmentGeneralListBottomSheetBinding2.tvTitle.setText(getString(R.string.label_placement_country));
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = this.g;
        if (fragmentGeneralListBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralListBottomSheetBinding = null;
        }
        SearchView searchView = fragmentGeneralListBottomSheetBinding.svSearchItem;
        Intrinsics.checkNotNullExpressionValue(searchView, "");
        retrieveConcurrentCameraIds.b(searchView, (Function1<? super String, Unit>) new Function1() { // from class: ToolbarExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return setTitleTextColor.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (String) obj);
            }
        });
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(setTitleTextColor settitletextcolor) {
        ((onSuggestionClick) settitletextcolor.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentbindingInflater1();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ setContentInsetStartWithNavigation TuitionPaymentFragmentspecialinlinedviewModeldefault2(setTitleTextColor settitletextcolor) {
        Context contextRequireContext = settitletextcolor.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new setContentInsetStartWithNavigation(contextRequireContext, null, new CountryBottomSheetDialogFragment$countryAdapter$2$1(settitletextcolor), 2, null);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault2(setTitleTextColor settitletextcolor, String str) {
        setContentInsetStartWithNavigation setcontentinsetstartwithnavigation = (setContentInsetStartWithNavigation) settitletextcolor.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        if (str == null) {
            str = "";
        }
        setcontentinsetstartwithnavigation.TuitionPaymentFragmentbindingInflater1(str);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final setTitleTextColor settitletextcolor, VirtualCameraAdapter1 virtualCameraAdapter1) {
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding2 = settitletextcolor.g;
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
            FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding3 = settitletextcolor.g;
            if (fragmentGeneralListBottomSheetBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentGeneralListBottomSheetBinding3 = null;
            }
            MultiStateView multiStateView2 = fragmentGeneralListBottomSheetBinding3.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
            multiStateView2.setViewState(MultiStateView.ViewState.CONTENT);
            List list = (List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy((CodeNamePair) it.next()));
            }
            settitletextcolor.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = arrayList;
            setContentInsetStartWithNavigation setcontentinsetstartwithnavigation = (setContentInsetStartWithNavigation) settitletextcolor.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
            setcontentinsetstartwithnavigation.d.clear();
            setcontentinsetstartwithnavigation.notifyDataSetChanged();
            ((setContentInsetStartWithNavigation) settitletextcolor.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(settitletextcolor.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            CodeNamePair codeNamePair = settitletextcolor.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (codeNamePair != null) {
                Iterable iterable = ((setContentInsetStartWithNavigation) settitletextcolor.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).d;
                Intrinsics.checkNotNullExpressionValue(iterable, "");
                int i = 0;
                for (Object obj : iterable) {
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy = (lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy) obj;
                    lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentbindingInflater1 = Intrinsics.areEqual(codeNamePair.b, ((CodeNamePair) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).b);
                    ((setContentInsetStartWithNavigation) settitletextcolor.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).d.set(i, (Data) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy);
                    if (Intrinsics.areEqual(codeNamePair.b, ((CodeNamePair) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).b)) {
                        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding4 = settitletextcolor.g;
                        if (fragmentGeneralListBottomSheetBinding4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            fragmentGeneralListBottomSheetBinding4 = null;
                        }
                        RecyclerView recyclerView = fragmentGeneralListBottomSheetBinding4.rvItem;
                        int i2 = i + 4;
                        if (((setContentInsetStartWithNavigation) settitletextcolor.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).d.size() <= i2 || i <= 4) {
                            i2 = i;
                        }
                        recyclerView.scrollToPosition(i2);
                    }
                    i++;
                }
                return;
            }
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding5 = settitletextcolor.g;
            if (fragmentGeneralListBottomSheetBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentGeneralListBottomSheetBinding = fragmentGeneralListBottomSheetBinding5;
            }
            MultiStateView multiStateView3 = fragmentGeneralListBottomSheetBinding.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView3, "");
            Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView3, ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, settitletextcolor.getString(R.string.error_error_occured), null, new Pair(settitletextcolor.getString(R.string.action_retry), new Function0() { // from class: Toolbar2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return setTitleTextColor.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
            }));
        }
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(setTitleTextColor settitletextcolor, CodeNamePair codeNamePair) {
        settitletextcolor.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = codeNamePair;
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new CountryBottomSheetDialogFragment$handleItemClicked$1(settitletextcolor, codeNamePair, null), 3, null);
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
        ((onSuggestionClick) this.TuitionPaymentFragmentbindingInflater1.getValue()).d.observe(getViewLifecycleOwner(), new Observer() { // from class: Toolbar1
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                setTitleTextColor.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        ((onSuggestionClick) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentbindingInflater1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setTitleTextColor() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
