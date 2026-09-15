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
import com.bpjstku.databinding.FragmentChooseMaritalStatusBottomSheetBinding;
import com.bpjstku.domain.asik.model.MaritalStatus;
import com.bpjstku.presentation.asik.active.ChooseMaritalStatusBottomSheetFragment$chooseMaritalStatusAdapter$2$1;
import com.bpjstku.presentation.asik.active.ChooseMaritalStatusBottomSheetFragment$handleItemClicked$1;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u0015\u0010\u0013\u001a\u00020\u001b8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0015\u0010\u0015\u001a\u00020\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u0016\u0010\u0010\u001a\u00020\u001e8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u0014\u0010\u0014\u001a\u00020 8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010!"}, d2 = {"LAppCompatDelegateImplApi33ImplExternalSyntheticLambda0;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function1;", "Lcom/bpjstku/domain/asik/model/MaritalStatus;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "(Lcom/bpjstku/domain/asik/model/MaritalStatus;)V", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/bpjstku/domain/asik/model/MaritalStatus;", "Lselect;", "Lkotlin/Lazy;", "LAppCompatDelegateImplAutoTimeNightModeManager;", "Lcom/bpjstku/databinding/FragmentChooseMaritalStatusBottomSheetBinding;", "Lcom/bpjstku/databinding/FragmentChooseMaritalStatusBottomSheetBinding;", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppCompatDelegateImplApi33ImplExternalSyntheticLambda0 extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Function1<MaritalStatus, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private FragmentChooseMaritalStatusBottomSheetBinding TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Lazy b;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private MaritalStatus TuitionPaymentFragmentbindingInflater1;

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return R.layout.fragment_choose_marital_status_bottom_sheet;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
    }

    public /* synthetic */ AppCompatDelegateImplApi33ImplExternalSyntheticLambda0(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppCompatDelegateImplApi33ImplExternalSyntheticLambda0(Function1<? super MaritalStatus, Unit> function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
        final AppCompatDelegateImplApi33ImplExternalSyntheticLambda0 appCompatDelegateImplApi33ImplExternalSyntheticLambda0 = this;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0<select>() { // from class: com.bpjstku.presentation.asik.active.ChooseMaritalStatusBottomSheetFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, select] */
            @Override // kotlin.jvm.functions.Function0
            public final select invoke() {
                ComponentCallbacks componentCallbacks = appCompatDelegateImplApi33ImplExternalSyntheticLambda0;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(select.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.b = LazyKt.lazy(new Function0() { // from class: bypassOnContentChanged
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppCompatDelegateImplApi33ImplExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
            }
        });
    }

    /* JADX INFO: renamed from: AppCompatDelegateImplApi33ImplExternalSyntheticLambda0$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LAppCompatDelegateImplApi33ImplExternalSyntheticLambda0$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ AppCompatDelegateImplApi33ImplExternalSyntheticLambda0 TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            AppCompatDelegateImplApi33ImplExternalSyntheticLambda0 appCompatDelegateImplApi33ImplExternalSyntheticLambda0 = new AppCompatDelegateImplApi33ImplExternalSyntheticLambda0(function1);
            Bundle bundle = new Bundle();
            bundle.putParcelable("marital_status", null);
            appCompatDelegateImplApi33ImplExternalSyntheticLambda0.setArguments(bundle);
            return appCompatDelegateImplApi33ImplExternalSyntheticLambda0;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentChooseMaritalStatusBottomSheetBinding fragmentChooseMaritalStatusBottomSheetBindingInflate = FragmentChooseMaritalStatusBottomSheetBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = fragmentChooseMaritalStatusBottomSheetBindingInflate;
        if (fragmentChooseMaritalStatusBottomSheetBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChooseMaritalStatusBottomSheetBindingInflate = null;
        }
        FrameLayout root = fragmentChooseMaritalStatusBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        if (this.TuitionPaymentFragmentbindingInflater1 == null) {
            Bundle arguments = getArguments();
            this.TuitionPaymentFragmentbindingInflater1 = arguments != null ? (MaritalStatus) arguments.getParcelable("marital_status") : null;
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        FragmentChooseMaritalStatusBottomSheetBinding fragmentChooseMaritalStatusBottomSheetBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (fragmentChooseMaritalStatusBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChooseMaritalStatusBottomSheetBinding = null;
        }
        RecyclerView recyclerView = fragmentChooseMaritalStatusBottomSheetBinding.rvChooseMaritalStatus;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter((AppCompatDelegateImplAutoTimeNightModeManager) this.b.getValue());
        MaritalStatus maritalStatus = this.TuitionPaymentFragmentbindingInflater1;
        if (maritalStatus != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(maritalStatus);
        }
    }

    public static /* synthetic */ AppCompatDelegateImplAutoTimeNightModeManager TuitionPaymentFragmentspecialinlinedviewModeldefault3(AppCompatDelegateImplApi33ImplExternalSyntheticLambda0 appCompatDelegateImplApi33ImplExternalSyntheticLambda0) {
        ChooseMaritalStatusBottomSheetFragment$chooseMaritalStatusAdapter$2$1 chooseMaritalStatusBottomSheetFragment$chooseMaritalStatusAdapter$2$1 = new ChooseMaritalStatusBottomSheetFragment$chooseMaritalStatusAdapter$2$1(appCompatDelegateImplApi33ImplExternalSyntheticLambda0);
        Context contextRequireContext = appCompatDelegateImplApi33ImplExternalSyntheticLambda0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new AppCompatDelegateImplAutoTimeNightModeManager(contextRequireContext, null, chooseMaritalStatusBottomSheetFragment$chooseMaritalStatusAdapter$2$1, 2, null);
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(AppCompatDelegateImplApi33ImplExternalSyntheticLambda0 appCompatDelegateImplApi33ImplExternalSyntheticLambda0, MaritalStatus maritalStatus) {
        appCompatDelegateImplApi33ImplExternalSyntheticLambda0.TuitionPaymentFragmentbindingInflater1 = maritalStatus;
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new ChooseMaritalStatusBottomSheetFragment$handleItemClicked$1(appCompatDelegateImplApi33ImplExternalSyntheticLambda0, maritalStatus, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(MaritalStatus p0) {
        Iterable iterable = ((AppCompatDelegateImplAutoTimeNightModeManager) this.b.getValue()).d;
        Intrinsics.checkNotNullExpressionValue(iterable, "");
        int i = 0;
        for (Object obj : iterable) {
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            MaritalStatus maritalStatus = (MaritalStatus) obj;
            maritalStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Intrinsics.areEqual(p0.TuitionPaymentFragmentspecialinlinedviewModeldefault1, maritalStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            ((AppCompatDelegateImplAutoTimeNightModeManager) this.b.getValue()).d.set(i, (Data) maritalStatus);
            FragmentChooseMaritalStatusBottomSheetBinding fragmentChooseMaritalStatusBottomSheetBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (fragmentChooseMaritalStatusBottomSheetBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentChooseMaritalStatusBottomSheetBinding = null;
            }
            fragmentChooseMaritalStatusBottomSheetBinding.rvChooseMaritalStatus.scrollToPosition(i);
            i++;
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        List listListOf = CollectionsKt.listOf((Object[]) new MaritalStatus[]{new MaritalStatus(com.bpjstku.util.constant.MaritalStatus.SINGLE.getType(), false), new MaritalStatus(com.bpjstku.util.constant.MaritalStatus.MARRIED.getType(), false), new MaritalStatus(com.bpjstku.util.constant.MaritalStatus.DIVORCED.getType(), false), new MaritalStatus(com.bpjstku.util.constant.MaritalStatus.DEATH_DIVORCED.getType(), false)});
        AppCompatDelegateImplAutoTimeNightModeManager appCompatDelegateImplAutoTimeNightModeManager = (AppCompatDelegateImplAutoTimeNightModeManager) this.b.getValue();
        appCompatDelegateImplAutoTimeNightModeManager.d.clear();
        appCompatDelegateImplAutoTimeNightModeManager.notifyDataSetChanged();
        ((AppCompatDelegateImplAutoTimeNightModeManager) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(listListOf);
        MaritalStatus maritalStatus = this.TuitionPaymentFragmentbindingInflater1;
        if (maritalStatus != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(maritalStatus);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppCompatDelegateImplApi33ImplExternalSyntheticLambda0() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
