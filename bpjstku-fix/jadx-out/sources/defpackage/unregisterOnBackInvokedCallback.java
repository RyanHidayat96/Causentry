package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentChooseFamilyStatusBottomSheetBinding;
import com.bpjstku.domain.asik.model.FamilyStatus;
import com.bpjstku.presentation.asik.active.ChooseFamilyStatusBottomSheetFragment$chooseFamilyStatusAdapter$2$1;
import com.bpjstku.presentation.asik.active.ChooseFamilyStatusBottomSheetFragment$handleItemClicked$1;
import com.bpjstku.util.constant.FamilyStatusCode;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.mapPoint;
import defpackage.select;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0016R\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0015\u0010\u0015\u001a\u00020\u001a8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0010\u001a\u00020\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0016\u0010\u001b\u001a\u00020\u001e8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0014\u0010\"\u001a\u00020 8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010!"}, d2 = {"LunregisterOnBackInvokedCallback;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function1;", "Lcom/bpjstku/domain/asik/model/FamilyStatus;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "(Lcom/bpjstku/domain/asik/model/FamilyStatus;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lkotlin/jvm/functions/Function1;", "Lcom/bpjstku/domain/asik/model/FamilyStatus;", "Lselect;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Lazy;", "LisOutOfBounds;", "Lcom/bpjstku/databinding/FragmentChooseFamilyStatusBottomSheetBinding;", "Lcom/bpjstku/databinding/FragmentChooseFamilyStatusBottomSheetBinding;", "", "()I", "asBinder"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class unregisterOnBackInvokedCallback extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy b;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Function1<FamilyStatus, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private FragmentChooseFamilyStatusBottomSheetBinding TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private FamilyStatus TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return R.layout.fragment_choose_family_status_bottom_sheet;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
    }

    public /* synthetic */ unregisterOnBackInvokedCallback(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public unregisterOnBackInvokedCallback(Function1<? super FamilyStatus, Unit> function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
        final unregisterOnBackInvokedCallback unregisteronbackinvokedcallback = this;
        this.b = LazyKt.lazy(new Function0<select>() { // from class: com.bpjstku.presentation.asik.active.ChooseFamilyStatusBottomSheetFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, select] */
            @Override // kotlin.jvm.functions.Function0
            public final select invoke() {
                ComponentCallbacks componentCallbacks = unregisteronbackinvokedcallback;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(select.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: getOnBackInvokedDispatcher
            public static int TuitionPaymentFragmentbindingInflater1 = 1527176501;

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return unregisterOnBackInvokedCallback.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b);
            }
        });
    }

    /* JADX INFO: renamed from: unregisterOnBackInvokedCallback$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LunregisterOnBackInvokedCallback$b;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ unregisterOnBackInvokedCallback TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            unregisterOnBackInvokedCallback unregisteronbackinvokedcallback = new unregisterOnBackInvokedCallback(function1);
            Bundle bundle = new Bundle();
            bundle.putParcelable("family_status", null);
            unregisteronbackinvokedcallback.setArguments(bundle);
            return unregisteronbackinvokedcallback;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentChooseFamilyStatusBottomSheetBinding fragmentChooseFamilyStatusBottomSheetBindingInflate = FragmentChooseFamilyStatusBottomSheetBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentbindingInflater1 = fragmentChooseFamilyStatusBottomSheetBindingInflate;
        if (fragmentChooseFamilyStatusBottomSheetBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChooseFamilyStatusBottomSheetBindingInflate = null;
        }
        FrameLayout root = fragmentChooseFamilyStatusBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            Bundle arguments = getArguments();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = arguments != null ? (FamilyStatus) arguments.getParcelable("family_status") : null;
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        FragmentChooseFamilyStatusBottomSheetBinding fragmentChooseFamilyStatusBottomSheetBinding = this.TuitionPaymentFragmentbindingInflater1;
        if (fragmentChooseFamilyStatusBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChooseFamilyStatusBottomSheetBinding = null;
        }
        RecyclerView recyclerView = fragmentChooseFamilyStatusBottomSheetBinding.rvFamilyStatus;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter((isOutOfBounds) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        FamilyStatus familyStatus = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (familyStatus != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(familyStatus);
        }
    }

    public static /* synthetic */ isOutOfBounds TuitionPaymentFragmentspecialinlinedviewModeldefault1(unregisterOnBackInvokedCallback unregisteronbackinvokedcallback) {
        ChooseFamilyStatusBottomSheetFragment$chooseFamilyStatusAdapter$2$1 chooseFamilyStatusBottomSheetFragment$chooseFamilyStatusAdapter$2$1 = new ChooseFamilyStatusBottomSheetFragment$chooseFamilyStatusAdapter$2$1(unregisteronbackinvokedcallback);
        Context contextRequireContext = unregisteronbackinvokedcallback.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new isOutOfBounds(contextRequireContext, null, chooseFamilyStatusBottomSheetFragment$chooseFamilyStatusAdapter$2$1, 2, null);
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault1(unregisterOnBackInvokedCallback unregisteronbackinvokedcallback, FamilyStatus familyStatus) {
        unregisteronbackinvokedcallback.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = familyStatus;
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new ChooseFamilyStatusBottomSheetFragment$handleItemClicked$1(unregisteronbackinvokedcallback, familyStatus, null), 3, null);
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(FamilyStatus p0) {
        Iterable iterable = ((isOutOfBounds) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).d;
        Intrinsics.checkNotNullExpressionValue(iterable, "");
        int i = 0;
        for (Object obj : iterable) {
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            FamilyStatus familyStatus = (FamilyStatus) obj;
            familyStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Intrinsics.areEqual(p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3, familyStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            FragmentChooseFamilyStatusBottomSheetBinding fragmentChooseFamilyStatusBottomSheetBinding = this.TuitionPaymentFragmentbindingInflater1;
            if (fragmentChooseFamilyStatusBottomSheetBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentChooseFamilyStatusBottomSheetBinding = null;
            }
            fragmentChooseFamilyStatusBottomSheetBinding.rvFamilyStatus.scrollToPosition(i);
            i++;
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        List listListOf = CollectionsKt.listOf((Object[]) new FamilyStatus[]{new FamilyStatus(FamilyStatusCode.I.getType(), false), new FamilyStatus(FamilyStatusCode.S.getType(), false), new FamilyStatus(FamilyStatusCode.A.getType(), false), new FamilyStatus(FamilyStatusCode.O.getType(), false), new FamilyStatus(FamilyStatusCode.K.getType(), false), new FamilyStatus(FamilyStatusCode.C.getType(), false), new FamilyStatus(FamilyStatusCode.M.getType(), false), new FamilyStatus(FamilyStatusCode.B.getType(), false), new FamilyStatus(FamilyStatusCode.L.getType(), false)});
        isOutOfBounds isoutofbounds = (isOutOfBounds) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        isoutofbounds.d.clear();
        isoutofbounds.notifyDataSetChanged();
        ((isOutOfBounds) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(listListOf);
        FamilyStatus familyStatus = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (familyStatus != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(familyStatus);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public unregisterOnBackInvokedCallback() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
