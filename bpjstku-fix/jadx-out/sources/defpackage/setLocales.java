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
import com.bpjstku.databinding.FragmentChooseBloodTypeBottomSheetBinding;
import com.bpjstku.domain.asik.model.BloodTypeStatus;
import com.bpjstku.presentation.asik.active.ChooseBloodTypeBottomSheetFragment$chooseBloodTypeAdapter$2$1;
import com.bpjstku.presentation.asik.active.ChooseBloodTypeBottomSheetFragment$handleItemClicked$1;
import com.bpjstku.util.constant.BloodTypeCode;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0017\u001a\u00020\u001b8BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR\u0015\u0010\u0010\u001a\u00020\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0014\u001a\u00020!8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\""}, d2 = {"LsetLocales;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function1;", "Lcom/bpjstku/domain/asik/model/BloodTypeStatus;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "(Lcom/bpjstku/domain/asik/model/BloodTypeStatus;)V", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/jvm/functions/Function1;", "asBinder", "Lcom/bpjstku/domain/asik/model/BloodTypeStatus;", "Lselect;", "Lkotlin/Lazy;", "LisListening;", "Lcom/bpjstku/databinding/FragmentChooseBloodTypeBottomSheetBinding;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lcom/bpjstku/databinding/FragmentChooseBloodTypeBottomSheetBinding;", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class setLocales extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Function1<BloodTypeStatus, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    private FragmentChooseBloodTypeBottomSheetBinding TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private BloodTypeStatus b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return R.layout.fragment_choose_blood_type_bottom_sheet;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
    }

    public /* synthetic */ setLocales(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setLocales(Function1<? super BloodTypeStatus, Unit> function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
        final setLocales setlocales = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<select>() { // from class: com.bpjstku.presentation.asik.active.ChooseBloodTypeBottomSheetFragment$special$$inlined$inject$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, select] */
            @Override // kotlin.jvm.functions.Function0
            public final select invoke() {
                ComponentCallbacks componentCallbacks = setlocales;
                return (componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b).b.b(Reflection.getOrCreateKotlinClass(select.class), this.$qualifier, this.$parameters);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new Function0() { // from class: AppCompatDelegateImplApi33Impl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return setLocales.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
    }

    /* JADX INFO: renamed from: setLocales$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LsetLocales$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ setLocales TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            setLocales setlocales = new setLocales(function1);
            Bundle bundle = new Bundle();
            bundle.putParcelable("blood_type", null);
            setlocales.setArguments(bundle);
            return setlocales;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentChooseBloodTypeBottomSheetBinding fragmentChooseBloodTypeBottomSheetBindingInflate = FragmentChooseBloodTypeBottomSheetBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = fragmentChooseBloodTypeBottomSheetBindingInflate;
        if (fragmentChooseBloodTypeBottomSheetBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChooseBloodTypeBottomSheetBindingInflate = null;
        }
        FrameLayout root = fragmentChooseBloodTypeBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        if (this.b == null) {
            Bundle arguments = getArguments();
            this.b = arguments != null ? (BloodTypeStatus) arguments.getParcelable("blood_type") : null;
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        FragmentChooseBloodTypeBottomSheetBinding fragmentChooseBloodTypeBottomSheetBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (fragmentChooseBloodTypeBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChooseBloodTypeBottomSheetBinding = null;
        }
        RecyclerView recyclerView = fragmentChooseBloodTypeBottomSheetBinding.rvChooseBloodType;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter((isListening) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        BloodTypeStatus bloodTypeStatus = this.b;
        if (bloodTypeStatus != null) {
            b(bloodTypeStatus);
        }
    }

    public static /* synthetic */ isListening TuitionPaymentFragmentspecialinlinedviewModeldefault2(setLocales setlocales) {
        ChooseBloodTypeBottomSheetFragment$chooseBloodTypeAdapter$2$1 chooseBloodTypeBottomSheetFragment$chooseBloodTypeAdapter$2$1 = new ChooseBloodTypeBottomSheetFragment$chooseBloodTypeAdapter$2$1(setlocales);
        Context contextRequireContext = setlocales.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new isListening(contextRequireContext, null, chooseBloodTypeBottomSheetFragment$chooseBloodTypeAdapter$2$1, 2, null);
    }

    public static final /* synthetic */ void b(setLocales setlocales, BloodTypeStatus bloodTypeStatus) {
        setlocales.b = bloodTypeStatus;
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new ChooseBloodTypeBottomSheetFragment$handleItemClicked$1(setlocales, bloodTypeStatus, null), 3, null);
    }

    private final void b(BloodTypeStatus p0) {
        Iterable iterable = ((isListening) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).d;
        Intrinsics.checkNotNullExpressionValue(iterable, "");
        int i = 0;
        for (Object obj : iterable) {
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            BloodTypeStatus bloodTypeStatus = (BloodTypeStatus) obj;
            bloodTypeStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = Intrinsics.areEqual(p0.TuitionPaymentFragmentspecialinlinedviewModeldefault2, bloodTypeStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            FragmentChooseBloodTypeBottomSheetBinding fragmentChooseBloodTypeBottomSheetBinding = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            if (fragmentChooseBloodTypeBottomSheetBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentChooseBloodTypeBottomSheetBinding = null;
            }
            fragmentChooseBloodTypeBottomSheetBinding.rvChooseBloodType.scrollToPosition(i);
            i++;
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        List listListOf = CollectionsKt.listOf((Object[]) new BloodTypeStatus[]{new BloodTypeStatus(BloodTypeCode.A.getType(), false), new BloodTypeStatus(BloodTypeCode.B.getType(), false), new BloodTypeStatus(BloodTypeCode.AB.getType(), false), new BloodTypeStatus(BloodTypeCode.O.getType(), false)});
        isListening islistening = (isListening) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        islistening.d.clear();
        islistening.notifyDataSetChanged();
        ((isListening) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(listListOf);
        BloodTypeStatus bloodTypeStatus = this.b;
        if (bloodTypeStatus != null) {
            b(bloodTypeStatus);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setLocales() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
