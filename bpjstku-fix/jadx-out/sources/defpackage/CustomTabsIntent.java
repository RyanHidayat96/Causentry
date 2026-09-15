package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.data.registration.bpu.model.request.ListTuitionRateRequest;
import com.bpjstku.data.registration.bpu.model.response.ItemTuition;
import com.bpjstku.data.registration.bpu.model.response.ListTuitionRateResponse;
import com.bpjstku.databinding.FragmentListTuitionRateBinding;
import com.bpjstku.presentation.membership.registration.model.TuitionRate;
import com.bpjstku.presentation.membership.registration.nonsalariedworker.TuitionRateBottomSheetDialogFragment$chooseTuitionRateAdapter$2$1;
import com.bpjstku.presentation.membership.registration.nonsalariedworker.TuitionRateBottomSheetDialogFragment$handleItemClicked$1;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0011J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0017R\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0015\u0010\u0016\u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u0014\u0010\"\u001a\u00020!8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010\u001d\u001a\u00020$8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0016\u0010%R\u0015\u0010\u0012\u001a\u00020&8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010 "}, d2 = {"LCustomTabsIntent;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function1;", "Lcom/bpjstku/presentation/membership/registration/model/TuitionRate;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "a", "d", "b", "(Lcom/bpjstku/presentation/membership/registration/model/TuitionRate;)V", "Lkotlin/jvm/functions/Function1;", "asBinder", "Lcom/bpjstku/presentation/membership/registration/model/TuitionRate;", "TuitionPaymentFragmentbindingInflater1", "", "asInterface", "Ljava/lang/String;", "LsetTitleTextAppearance;", "Lkotlin/Lazy;", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "()I", "Lcom/bpjstku/databinding/FragmentListTuitionRateBinding;", "Lcom/bpjstku/databinding/FragmentListTuitionRateBinding;", "LgetImeOptions;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CustomTabsIntent extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Function1<TuitionRate, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy g;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private TuitionRate TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private FragmentListTuitionRateBinding asInterface;

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return R.layout.fragment_list_tuition_rate;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    public /* synthetic */ CustomTabsIntent(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomTabsIntent(Function1<? super TuitionRate, Unit> function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = "";
        this.b = LazyKt.lazy(new Function0() { // from class: CustomTabsClient29
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CustomTabsIntent.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentbindingInflater1);
            }
        });
        final CustomTabsIntent customTabsIntent = this;
        this.g = LazyKt.lazy(new Function0<getImeOptions>() { // from class: com.bpjstku.presentation.membership.registration.nonsalariedworker.TuitionRateBottomSheetDialogFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [getImeOptions, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final getImeOptions invoke() {
                ComponentCallbacks componentCallbacks = customTabsIntent;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(getImeOptions.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
    }

    /* JADX INFO: renamed from: CustomTabsIntent$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\f\u0010\r"}, d2 = {"LCustomTabsIntent$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "", "p0", "Lcom/bpjstku/presentation/membership/registration/model/TuitionRate;", "p1", "Lkotlin/Function1;", "", "p2", "LCustomTabsIntent;", "TuitionPaymentFragmentbindingInflater1", "(Ljava/lang/String;Lcom/bpjstku/presentation/membership/registration/model/TuitionRate;Lkotlin/jvm/functions/Function1;)LCustomTabsIntent;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static CustomTabsIntent TuitionPaymentFragmentbindingInflater1(String p0, TuitionRate p1, Function1<? super TuitionRate, Unit> p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p2, "");
            CustomTabsIntent customTabsIntent = new CustomTabsIntent(p2);
            Bundle bundle = new Bundle();
            bundle.putParcelable("tuition_rate", p1);
            bundle.putString("selected_kode_paket", p0);
            customTabsIntent.setArguments(bundle);
            return customTabsIntent;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            ExifDataBuilder1.TuitionPaymentFragmentbindingInflater1[0] = setLensFNumber.TuitionPaymentFragmentbindingInflater1[0];
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentListTuitionRateBinding fragmentListTuitionRateBindingInflate = FragmentListTuitionRateBinding.inflate(p0, p1, false);
        this.asInterface = fragmentListTuitionRateBindingInflate;
        if (fragmentListTuitionRateBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentListTuitionRateBindingInflate = null;
        }
        FrameLayout root = fragmentListTuitionRateBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        if (this.TuitionPaymentFragmentbindingInflater1 == null) {
            Bundle arguments = getArguments();
            this.TuitionPaymentFragmentbindingInflater1 = arguments != null ? (TuitionRate) arguments.getParcelable("tuition_rate") : null;
        }
        Bundle arguments2 = getArguments();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = arguments2 != null ? arguments2.getString("selected_kode_paket") : null;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        FragmentListTuitionRateBinding fragmentListTuitionRateBinding = this.asInterface;
        if (fragmentListTuitionRateBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentListTuitionRateBinding = null;
        }
        RecyclerView recyclerView = fragmentListTuitionRateBinding.rvItem;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter((setTitleTextAppearance) this.b.getValue());
        TuitionRate tuitionRate = this.TuitionPaymentFragmentbindingInflater1;
        if (tuitionRate != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionRate);
        }
        TuitionPaymentFragmentbindingInflater1();
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        a();
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(final CustomTabsIntent customTabsIntent, VirtualCameraAdapter1 virtualCameraAdapter1) {
        FragmentListTuitionRateBinding fragmentListTuitionRateBinding = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            FragmentListTuitionRateBinding fragmentListTuitionRateBinding2 = customTabsIntent.asInterface;
            if (fragmentListTuitionRateBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentListTuitionRateBinding = fragmentListTuitionRateBinding2;
            }
            MultiStateView multiStateView = fragmentListTuitionRateBinding.msvListTuitionRates;
            Intrinsics.checkNotNullExpressionValue(multiStateView, "");
            multiStateView.setViewState(MultiStateView.ViewState.LOADING);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            FragmentListTuitionRateBinding fragmentListTuitionRateBinding3 = customTabsIntent.asInterface;
            if (fragmentListTuitionRateBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentListTuitionRateBinding = fragmentListTuitionRateBinding3;
            }
            MultiStateView multiStateView2 = fragmentListTuitionRateBinding.msvListTuitionRates;
            Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
            multiStateView2.setViewState(MultiStateView.ViewState.CONTENT);
            List<ItemTuition> data = ((ListTuitionRateResponse) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1).getData();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(data, 10));
            for (ItemTuition itemTuition : data) {
                arrayList.add(new TuitionRate(String.valueOf(itemTuition.getTotalIuran()), String.valueOf(itemTuition.getNominalDasarUpah()), false));
            }
            setTitleTextAppearance settitletextappearance = (setTitleTextAppearance) customTabsIntent.b.getValue();
            settitletextappearance.d.clear();
            settitletextappearance.notifyDataSetChanged();
            ((setTitleTextAppearance) customTabsIntent.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(arrayList);
            TuitionRate tuitionRate = customTabsIntent.TuitionPaymentFragmentbindingInflater1;
            if (tuitionRate != null) {
                customTabsIntent.TuitionPaymentFragmentspecialinlinedviewModeldefault3(tuitionRate);
                return;
            }
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            FragmentListTuitionRateBinding fragmentListTuitionRateBinding4 = customTabsIntent.asInterface;
            if (fragmentListTuitionRateBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentListTuitionRateBinding = fragmentListTuitionRateBinding4;
            }
            MultiStateView multiStateView3 = fragmentListTuitionRateBinding.msvListTuitionRates;
            Intrinsics.checkNotNullExpressionValue(multiStateView3, "");
            Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView3, ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, customTabsIntent.getString(R.string.error_error_occured), null, new Pair(customTabsIntent.getString(R.string.action_retry), new Function0() { // from class: CustomTabsClient28
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CustomTabsIntent.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
                }
            }));
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(CustomTabsIntent customTabsIntent) {
        customTabsIntent.a();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ setTitleTextAppearance TuitionPaymentFragmentspecialinlinedviewModeldefault2(CustomTabsIntent customTabsIntent) {
        TuitionRateBottomSheetDialogFragment$chooseTuitionRateAdapter$2$1 tuitionRateBottomSheetDialogFragment$chooseTuitionRateAdapter$2$1 = new TuitionRateBottomSheetDialogFragment$chooseTuitionRateAdapter$2$1(customTabsIntent);
        Context contextRequireContext = customTabsIntent.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new setTitleTextAppearance(contextRequireContext, null, tuitionRateBottomSheetDialogFragment$chooseTuitionRateAdapter$2$1, 2, null);
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(CustomTabsIntent customTabsIntent, TuitionRate tuitionRate) {
        customTabsIntent.TuitionPaymentFragmentbindingInflater1 = tuitionRate;
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new TuitionRateBottomSheetDialogFragment$handleItemClicked$1(customTabsIntent, tuitionRate, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(TuitionRate p0) {
        Iterable iterable = ((setTitleTextAppearance) this.b.getValue()).d;
        Intrinsics.checkNotNullExpressionValue(iterable, "");
        int i = 0;
        for (Object obj : iterable) {
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            TuitionRate tuitionRate = (TuitionRate) obj;
            tuitionRate.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Intrinsics.areEqual(p0.TuitionPaymentFragmentbindingInflater1, tuitionRate.TuitionPaymentFragmentbindingInflater1);
            ((setTitleTextAppearance) this.b.getValue()).d.set(i, (Data) tuitionRate);
            if (Intrinsics.areEqual(p0.TuitionPaymentFragmentbindingInflater1, tuitionRate.TuitionPaymentFragmentbindingInflater1)) {
                FragmentListTuitionRateBinding fragmentListTuitionRateBinding = this.asInterface;
                if (fragmentListTuitionRateBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    fragmentListTuitionRateBinding = null;
                }
                fragmentListTuitionRateBinding.rvItem.scrollToPosition(i);
            }
            i++;
        }
    }

    private void a() {
        ((getImeOptions) this.g.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2(new ListTuitionRateRequest("JMO", "12341234", String.valueOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1)));
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
        ((getImeOptions) this.g.getValue()).INotificationSideChannel.observe(getViewLifecycleOwner(), new Observer() { // from class: CustomTabsFeatures
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                CustomTabsIntent.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomTabsIntent() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
