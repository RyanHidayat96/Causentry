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
import com.bpjstku.databinding.FragmentChooseEducationBottomSheetBinding;
import com.bpjstku.domain.asik.model.EducationStatus;
import com.bpjstku.presentation.asik.active.ChooseEducationBottomSheetFragment$chooseEducationAdapter$2$1;
import com.bpjstku.presentation.asik.active.ChooseEducationBottomSheetFragment$handleItemClicked$1;
import com.bpjstku.util.constant.EducationCode;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0015\u0010\u001b\u001a\u00020\u001a8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0015\u001a\u00020\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u0016\u0010\u0013\u001a\u00020\u001e8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0018\u0010\u001fR\u0014\u0010\"\u001a\u00020 8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010!"}, d2 = {"LonBackInvoked;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function1;", "Lcom/bpjstku/domain/asik/model/EducationStatus;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "(Lcom/bpjstku/domain/asik/model/EducationStatus;)V", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/bpjstku/domain/asik/model/EducationStatus;", "Lselect;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Lazy;", "LAppCompatDelegateImplAutoNightModeManager;", "Lcom/bpjstku/databinding/FragmentChooseEducationBottomSheetBinding;", "Lcom/bpjstku/databinding/FragmentChooseEducationBottomSheetBinding;", "", "()I", "a"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class onBackInvoked extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private FragmentChooseEducationBottomSheetBinding TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Function1<EducationStatus, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private final Lazy b;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private EducationStatus TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return R.layout.fragment_choose_education_bottom_sheet;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
    }

    public /* synthetic */ onBackInvoked(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public onBackInvoked(Function1<? super EducationStatus, Unit> function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
        final onBackInvoked onbackinvoked = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<select>() { // from class: com.bpjstku.presentation.asik.active.ChooseEducationBottomSheetFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, select] */
            @Override // kotlin.jvm.functions.Function0
            public final select invoke() {
                ComponentCallbacks componentCallbacks = onbackinvoked;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(select.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.b = LazyKt.lazy(new Function0() { // from class: registerOnBackPressedCallback
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return onBackInvoked.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentbindingInflater1);
            }
        });
    }

    /* JADX INFO: renamed from: onBackInvoked$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LonBackInvoked$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ onBackInvoked TuitionPaymentFragmentbindingInflater1(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            onBackInvoked onbackinvoked = new onBackInvoked(function1);
            Bundle bundle = new Bundle();
            bundle.putParcelable("education", null);
            onbackinvoked.setArguments(bundle);
            return onbackinvoked;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentChooseEducationBottomSheetBinding fragmentChooseEducationBottomSheetBindingInflate = FragmentChooseEducationBottomSheetBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = fragmentChooseEducationBottomSheetBindingInflate;
        if (fragmentChooseEducationBottomSheetBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChooseEducationBottomSheetBindingInflate = null;
        }
        FrameLayout root = fragmentChooseEducationBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            Bundle arguments = getArguments();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = arguments != null ? (EducationStatus) arguments.getParcelable("education") : null;
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        FragmentChooseEducationBottomSheetBinding fragmentChooseEducationBottomSheetBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (fragmentChooseEducationBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChooseEducationBottomSheetBinding = null;
        }
        RecyclerView recyclerView = fragmentChooseEducationBottomSheetBinding.rvChooseEducation;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter((AppCompatDelegateImplAutoNightModeManager) this.b.getValue());
        EducationStatus educationStatus = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (educationStatus != null) {
            b(educationStatus);
        }
    }

    public static /* synthetic */ AppCompatDelegateImplAutoNightModeManager TuitionPaymentFragmentspecialinlinedviewModeldefault3(onBackInvoked onbackinvoked) {
        ChooseEducationBottomSheetFragment$chooseEducationAdapter$2$1 chooseEducationBottomSheetFragment$chooseEducationAdapter$2$1 = new ChooseEducationBottomSheetFragment$chooseEducationAdapter$2$1(onbackinvoked);
        Context contextRequireContext = onbackinvoked.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new AppCompatDelegateImplAutoNightModeManager(contextRequireContext, null, chooseEducationBottomSheetFragment$chooseEducationAdapter$2$1, 2, null);
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(onBackInvoked onbackinvoked, EducationStatus educationStatus) {
        onbackinvoked.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = educationStatus;
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new ChooseEducationBottomSheetFragment$handleItemClicked$1(onbackinvoked, educationStatus, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private final void b(EducationStatus p0) {
        Iterable iterable = ((AppCompatDelegateImplAutoNightModeManager) this.b.getValue()).d;
        Intrinsics.checkNotNullExpressionValue(iterable, "");
        int i = 0;
        for (Object obj : iterable) {
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            EducationStatus educationStatus = (EducationStatus) obj;
            educationStatus.TuitionPaymentFragmentbindingInflater1 = Intrinsics.areEqual(p0.TuitionPaymentFragmentspecialinlinedviewModeldefault1, educationStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            ((AppCompatDelegateImplAutoNightModeManager) this.b.getValue()).d.set(i, (Data) educationStatus);
            FragmentChooseEducationBottomSheetBinding fragmentChooseEducationBottomSheetBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (fragmentChooseEducationBottomSheetBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentChooseEducationBottomSheetBinding = null;
            }
            fragmentChooseEducationBottomSheetBinding.rvChooseEducation.scrollToPosition(i);
            i++;
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        List listListOf = CollectionsKt.listOf((Object[]) new EducationStatus[]{new EducationStatus(EducationCode.P01.getType(), false), new EducationStatus(EducationCode.P02.getType(), false), new EducationStatus(EducationCode.P03.getType(), false), new EducationStatus(EducationCode.P04.getType(), false), new EducationStatus(EducationCode.P05.getType(), false), new EducationStatus(EducationCode.P06.getType(), false), new EducationStatus(EducationCode.P07.getType(), false), new EducationStatus(EducationCode.P08.getType(), false), new EducationStatus(EducationCode.P09.getType(), false), new EducationStatus(EducationCode.P10.getType(), false)});
        AppCompatDelegateImplAutoNightModeManager appCompatDelegateImplAutoNightModeManager = (AppCompatDelegateImplAutoNightModeManager) this.b.getValue();
        appCompatDelegateImplAutoNightModeManager.d.clear();
        appCompatDelegateImplAutoNightModeManager.notifyDataSetChanged();
        ((AppCompatDelegateImplAutoNightModeManager) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(listListOf);
        EducationStatus educationStatus = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (educationStatus != null) {
            b(educationStatus);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public onBackInvoked() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
