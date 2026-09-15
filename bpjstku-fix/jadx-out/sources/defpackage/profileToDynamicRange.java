package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bpjstku.R;
import com.bpjstku.data.tuition.model.response.PaymentHistoryResponse;
import com.bpjstku.data.tuition.model.response.PaymentHistoryResponseItem;
import com.bpjstku.databinding.FragmentTuitionPaymentHistoryBinding;
import com.bpjstku.databinding.LayoutDefaultEmptyBinding;
import com.bpjstku.domain.tuition.model.PaymentHistoryItem;
import com.bpjstku.domain.user.model.User;
import com.bpjstku.presentation.tuition.TuitionPaymentHistoryFragment$bindingInflater$1;
import com.bpjstku.presentation.tuition.TuitionPaymentHistoryFragment$paymentHistoryAdapter$2$1;
import com.bpjstku.presentation.tuition.model.SelectedProgram;
import com.kennyc.view.MultiStateView;
import com.nbs.nucleosnucleo.presentation.BaseActivity;
import defpackage.ActivityResultContractsPickVisualMediaMediaCapabilities;
import defpackage.InputConfigurationCompat;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u001f\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000f\u0010\nJ\r\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\nJ\u0015\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0010\u001a\u00020\u00178CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0015\u0010\u001b\u001a\u00020\u001a8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0015\u0010\u001f\u001a\u00020\u001e8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0015\u0010\r\u001a\u00020 8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\"8\u0015X\u0095D¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b!\u0010$R.\u0010\u0014\u001a\u001c\u0012\u0004\u0012\u00020&\u0012\u0006\u0012\u0004\u0018\u00010'\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00020%8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010)R\u0016\u0010\u0018\u001a\u00020*8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0012\u0010+"}, d2 = {"LprofileToDynamicRange;", "LAutoValue_CameraState_StateError;", "Lcom/bpjstku/databinding/FragmentTuitionPaymentHistoryBinding;", "Lkotlin/Function1;", "Lcom/bpjstku/presentation/tuition/model/SelectedProgram;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "b_", "()V", "cancelAll", "onTransact", "g", "INotificationSideChannel", "cancel", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/bpjstku/domain/tuition/model/PaymentHistoryItem;", "b", "(Lcom/bpjstku/domain/tuition/model/PaymentHistoryItem;)V", "asInterface", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "LInputConfigurationCompat;", "d", "Lkotlin/Lazy;", "LActivityResultContractsPickVisualMediaMediaCapabilities;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lcom/bpjstku/domain/user/model/User;", "a", "LisSurfaceSharingEnabled;", "TuitionPaymentFragmentbindingInflater1", "LOutputConfigurationCompatApi26Impl;", "asBinder", "", "I", "()I", "Lkotlin/Function3;", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "", "()Lkotlin/jvm/functions/Function3;", "Lcom/bpjstku/databinding/LayoutDefaultEmptyBinding;", "Lcom/bpjstku/databinding/LayoutDefaultEmptyBinding;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class profileToDynamicRange extends AutoValue_CameraState_StateError<FragmentTuitionPaymentHistoryBinding> {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final int a;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private final Lazy g;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Function1<SelectedProgram, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private LayoutDefaultEmptyBinding d;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Override // defpackage.LifecycleCameraRepository
    public final void b_() {
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancelAll() {
    }

    public /* synthetic */ profileToDynamicRange(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private profileToDynamicRange(Function1<? super SelectedProgram, Unit> function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
        final profileToDynamicRange profiletodynamicrange = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0<InputConfigurationCompat>() { // from class: com.bpjstku.presentation.tuition.TuitionPaymentHistoryFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [InputConfigurationCompat, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ InputConfigurationCompat invoke() {
                LifecycleOwner lifecycleOwner = profiletodynamicrange;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InputConfigurationCompat.class);
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0<ActivityResultContractsPickVisualMediaMediaCapabilities>() { // from class: com.bpjstku.presentation.tuition.TuitionPaymentHistoryFragment$special$$inlined$viewModel$default$2
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [ActivityResultContractsPickVisualMediaMediaCapabilities, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ ActivityResultContractsPickVisualMediaMediaCapabilities invoke() {
                LifecycleOwner lifecycleOwner = profiletodynamicrange;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ActivityResultContractsPickVisualMediaMediaCapabilities.class);
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
        this.b = LazyKt.lazy(new Function0() { // from class: DynamicRangesCompatDynamicRangeProfilesCompatImpl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ActivityResultContractsPickVisualMediaMediaCapabilities) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder();
            }
        });
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: isExtraLatencyPresent
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return profileToDynamicRange.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b);
            }
        });
        this.g = LazyKt.lazy(new Function0() { // from class: toDynamicRangeProfiles
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return profileToDynamicRange.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            }
        });
        this.a = R.layout.fragment_tuition_payment_history;
    }

    /* JADX INFO: renamed from: profileToDynamicRange$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LprofileToDynamicRange$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "LprofileToDynamicRange;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()LprofileToDynamicRange;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public static profileToDynamicRange TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            return new profileToDynamicRange(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.LifecycleCameraRepository
    /* JADX INFO: renamed from: asBinder, reason: from getter */
    public final int getA() {
        return this.a;
    }

    @Override // defpackage.AutoValue_CameraState_StateError
    public final Function3<LayoutInflater, ViewGroup, Boolean, FragmentTuitionPaymentHistoryBinding> TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        return TuitionPaymentHistoryFragment$bindingInflater$1.b;
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void onTransact() {
        this.d = LayoutDefaultEmptyBinding.bind(asInterface().getRoot());
        RecyclerView recyclerView = asInterface().rvPaymentHistory;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(requireContext(), 1));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter((OutputConfigurationCompatApi26Impl) this.g.getValue());
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void g() {
        asInterface().srlPaymentHistory.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: DynamicRangesCompatApi33Impl
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                profileToDynamicRange.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void cancel() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2();
    }

    public final void b(PaymentHistoryItem p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        DynamicRangeConversions.Companion companion = DynamicRangeConversions.INSTANCE;
        User user = (User) this.b.getValue();
        DynamicRangeConversions dynamicRangeConversionsTuitionPaymentFragmentspecialinlinedviewModeldefault2 = DynamicRangeConversions.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2(PaymentHistoryItem.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0, String.valueOf(user != null ? user.b : null)), new Function1() { // from class: dynamicRangeToFirstSupportedProfile
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return profileToDynamicRange.TuitionPaymentFragmentbindingInflater1((String) obj);
            }
        });
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Intrinsics.checkNotNullParameter(childFragmentManager, "");
        if (childFragmentManager.findFragmentByTag(dynamicRangeConversionsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3) == null) {
            dynamicRangeConversionsTuitionPaymentFragmentspecialinlinedviewModeldefault2.show(childFragmentManager, dynamicRangeConversionsTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    public static /* synthetic */ void b(profileToDynamicRange profiletodynamicrange) {
        ViewPortBuilder.g();
        try {
            FragmentActivity activity = profiletodynamicrange.getActivity();
            Intrinsics.checkNotNull(activity, "");
            Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_payment_history_result", "refresh_payment_history_result"));
            Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
            Intrinsics.checkNotNullParameter("refresh_payment_history_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
            Intrinsics.checkNotNullParameter("refresh_payment_history_result", "");
            Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
            TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2("refresh_payment_history_result", mapMutableMapOf);
            profiletodynamicrange.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        } finally {
            ViewPortBuilder.asBinder();
        }
    }

    public static /* synthetic */ OutputConfigurationCompatApi26Impl TuitionPaymentFragmentbindingInflater1(profileToDynamicRange profiletodynamicrange) {
        Context contextRequireContext = profiletodynamicrange.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new OutputConfigurationCompatApi26Impl(contextRequireContext, null, new TuitionPaymentHistoryFragment$paymentHistoryAdapter$2$1(profiletodynamicrange), 2, null);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(profileToDynamicRange profiletodynamicrange, SelectedProgram selectedProgram) {
        Intrinsics.checkNotNullParameter(selectedProgram, "");
        Function1<SelectedProgram, Unit> function1 = profiletodynamicrange.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(profileToDynamicRange profiletodynamicrange) {
        profiletodynamicrange.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentbindingInflater1(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ isSurfaceSharingEnabled TuitionPaymentFragmentspecialinlinedviewModeldefault2(final profileToDynamicRange profiletodynamicrange) {
        Context contextRequireContext = profiletodynamicrange.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new isSurfaceSharingEnabled(contextRequireContext, null, new Function1() { // from class: toDynamicRangesCompat
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return profileToDynamicRange.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (SelectedProgram) obj);
            }
        }, 2, null);
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(final profileToDynamicRange profiletodynamicrange, VirtualCameraAdapter1 virtualCameraAdapter1) {
        String str;
        FragmentTuitionPaymentHistoryBinding fragmentTuitionPaymentHistoryBindingAsInterface = profiletodynamicrange.asInterface();
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            fragmentTuitionPaymentHistoryBindingAsInterface.srlPaymentHistory.setRefreshing(false);
            MultiStateView multiStateView = fragmentTuitionPaymentHistoryBindingAsInterface.msvPaymentHistory;
            Intrinsics.checkNotNullExpressionValue(multiStateView, "");
            multiStateView.setViewState(MultiStateView.ViewState.LOADING);
            str = "loading_payment_history_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            fragmentTuitionPaymentHistoryBindingAsInterface.srlPaymentHistory.setRefreshing(false);
            MultiStateView multiStateView2 = fragmentTuitionPaymentHistoryBindingAsInterface.msvPaymentHistory;
            Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
            VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = (VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1;
            Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView2, tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, String.valueOf(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2), null, new Pair(profiletodynamicrange.getString(R.string.action_retry), new Function0() { // from class: DynamicRangesCompat
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return profileToDynamicRange.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                }
            }));
            str = "failure_payment_history_result";
        } else if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            fragmentTuitionPaymentHistoryBindingAsInterface.srlPaymentHistory.setRefreshing(false);
            VirtualCameraAdapter1.asBinder asbinder = (VirtualCameraAdapter1.asBinder) virtualCameraAdapter1;
            List<PaymentHistoryResponseItem> data = ((PaymentHistoryResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getData();
            if (data == null || data.isEmpty()) {
                MultiStateView multiStateView3 = fragmentTuitionPaymentHistoryBindingAsInterface.msvPaymentHistory;
                Intrinsics.checkNotNullExpressionValue(multiStateView3, "");
                multiStateView3.setViewState(MultiStateView.ViewState.EMPTY);
                LayoutDefaultEmptyBinding layoutDefaultEmptyBinding = profiletodynamicrange.d;
                LayoutDefaultEmptyBinding layoutDefaultEmptyBinding2 = null;
                if (layoutDefaultEmptyBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    layoutDefaultEmptyBinding = null;
                }
                layoutDefaultEmptyBinding.tvMessage.setText("");
                LayoutDefaultEmptyBinding layoutDefaultEmptyBinding3 = profiletodynamicrange.d;
                if (layoutDefaultEmptyBinding3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    layoutDefaultEmptyBinding3 = null;
                }
                layoutDefaultEmptyBinding3.tvTitle.setText("Belum Ada Transaksi Pembayaran Iuran BPU dengan Pembayaran Instan");
                LayoutDefaultEmptyBinding layoutDefaultEmptyBinding4 = profiletodynamicrange.d;
                if (layoutDefaultEmptyBinding4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    layoutDefaultEmptyBinding4 = null;
                }
                layoutDefaultEmptyBinding4.imgError.setVisibility(0);
                LayoutDefaultEmptyBinding layoutDefaultEmptyBinding5 = profiletodynamicrange.d;
                if (layoutDefaultEmptyBinding5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    layoutDefaultEmptyBinding2 = layoutDefaultEmptyBinding5;
                }
                layoutDefaultEmptyBinding2.imgError.setImageResource(2131231485);
            } else {
                MultiStateView multiStateView4 = fragmentTuitionPaymentHistoryBindingAsInterface.msvPaymentHistory;
                Intrinsics.checkNotNullExpressionValue(multiStateView4, "");
                multiStateView4.setViewState(MultiStateView.ViewState.CONTENT);
                List<PaymentHistoryResponseItem> data2 = ((PaymentHistoryResponse) asbinder.TuitionPaymentFragmentspecialinlinedviewModeldefault1).getData();
                Intrinsics.checkNotNull(data2);
                List<PaymentHistoryResponseItem> list = data2;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(getResultCode.TuitionPaymentFragmentbindingInflater1((PaymentHistoryResponseItem) it.next()));
                }
                OutputConfigurationCompatApi26Impl outputConfigurationCompatApi26Impl = (OutputConfigurationCompatApi26Impl) profiletodynamicrange.g.getValue();
                outputConfigurationCompatApi26Impl.d.clear();
                outputConfigurationCompatApi26Impl.notifyDataSetChanged();
                ((OutputConfigurationCompatApi26Impl) profiletodynamicrange.g.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(arrayList);
            }
            str = "success_payment_history_result";
        } else {
            str = "";
        }
        FragmentActivity activity = profiletodynamicrange.getActivity();
        Intrinsics.checkNotNull(activity, "");
        Map<String, Object> mapMutableMapOf = MapsKt.mutableMapOf(new Pair("params_payment_history_result", str));
        Intrinsics.checkNotNullParameter((BaseActivity) activity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio targetAspectRatio = TargetAspectRatio.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(mapMutableMapOf, "");
        TargetAspectRatio.TuitionPaymentFragmentbindingInflater1().TuitionPaymentFragmentspecialinlinedviewModeldefault2(str, mapMutableMapOf);
    }

    private void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        InputConfigurationCompat inputConfigurationCompat = (InputConfigurationCompat) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        User user = (User) this.b.getValue();
        inputConfigurationCompat.TuitionPaymentFragmentbindingInflater1(String.valueOf(user != null ? user.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : null));
    }

    @Override // defpackage.LifecycleCameraRepository
    public final void INotificationSideChannel() {
        ((InputConfigurationCompat) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentbindingInflater1.observe(getViewLifecycleOwner(), new Observer() { // from class: getDynamicRangeCaptureRequestConstraints
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                profileToDynamicRange.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, (VirtualCameraAdapter1) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public profileToDynamicRange() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
