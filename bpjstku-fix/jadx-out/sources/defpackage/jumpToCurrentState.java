package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentChooseReligionBottomSheetBinding;
import com.bpjstku.presentation.bsu.ChooseBsuBankBottomSheetFragment$chooseBankBsuAdapter$2$1;
import com.bpjstku.presentation.bsu.ChooseBsuBankBottomSheetFragment$handleItemClicked$1;
import com.bpjstku.presentation.bsu.model.BankStatus;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0015\u0010\u0010\u001a\u00020\u001a8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u0014\u0010\u0013\u001a\u00020\u001f8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010 "}, d2 = {"LjumpToCurrentState;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function1;", "Lcom/bpjstku/presentation/bsu/model/BankStatus;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/bpjstku/presentation/bsu/model/BankStatus;)V", "Lkotlin/jvm/functions/Function1;", "Lcom/bpjstku/presentation/bsu/model/BankStatus;", "LaddState;", "Lkotlin/Lazy;", "Lcom/bpjstku/databinding/FragmentChooseReligionBottomSheetBinding;", "Lcom/bpjstku/databinding/FragmentChooseReligionBottomSheetBinding;", "TuitionPaymentFragmentbindingInflater1", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class jumpToCurrentState extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private BankStatus b;
    private final Function1<BankStatus, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private FragmentChooseReligionBottomSheetBinding TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final int TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        return R.layout.fragment_choose_religion_bottom_sheet;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
    }

    public /* synthetic */ jumpToCurrentState(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jumpToCurrentState(Function1<? super BankStatus, Unit> function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = LazyKt.lazy(new clearMutated(this));
    }

    /* JADX INFO: renamed from: jumpToCurrentState$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LjumpToCurrentState$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ jumpToCurrentState TuitionPaymentFragmentspecialinlinedviewModeldefault3(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            jumpToCurrentState jumptocurrentstate = new jumpToCurrentState(function1);
            Bundle bundle = new Bundle();
            bundle.putParcelable("bank_bsu", null);
            jumptocurrentstate.setArguments(bundle);
            return jumptocurrentstate;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentChooseReligionBottomSheetBinding fragmentChooseReligionBottomSheetBindingInflate = FragmentChooseReligionBottomSheetBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentbindingInflater1 = fragmentChooseReligionBottomSheetBindingInflate;
        if (fragmentChooseReligionBottomSheetBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChooseReligionBottomSheetBindingInflate = null;
        }
        FrameLayout root = fragmentChooseReligionBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        if (this.b == null) {
            Bundle arguments = getArguments();
            this.b = arguments != null ? (BankStatus) arguments.getParcelable("religion") : null;
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        FragmentChooseReligionBottomSheetBinding fragmentChooseReligionBottomSheetBinding = this.TuitionPaymentFragmentbindingInflater1;
        FragmentChooseReligionBottomSheetBinding fragmentChooseReligionBottomSheetBinding2 = null;
        if (fragmentChooseReligionBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChooseReligionBottomSheetBinding = null;
        }
        fragmentChooseReligionBottomSheetBinding.tvChooseReligion.setText("Pilih Bank");
        FragmentChooseReligionBottomSheetBinding fragmentChooseReligionBottomSheetBinding3 = this.TuitionPaymentFragmentbindingInflater1;
        if (fragmentChooseReligionBottomSheetBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentChooseReligionBottomSheetBinding2 = fragmentChooseReligionBottomSheetBinding3;
        }
        RecyclerView recyclerView = fragmentChooseReligionBottomSheetBinding2.rvChooseReligion;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter((addState) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue());
        BankStatus bankStatus = this.b;
        if (bankStatus != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(bankStatus);
        }
    }

    public static /* synthetic */ addState TuitionPaymentFragmentspecialinlinedviewModeldefault2(jumpToCurrentState jumptocurrentstate) {
        ChooseBsuBankBottomSheetFragment$chooseBankBsuAdapter$2$1 chooseBsuBankBottomSheetFragment$chooseBankBsuAdapter$2$1 = new ChooseBsuBankBottomSheetFragment$chooseBankBsuAdapter$2$1(jumptocurrentstate);
        Context contextRequireContext = jumptocurrentstate.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new addState(contextRequireContext, null, chooseBsuBankBottomSheetFragment$chooseBankBsuAdapter$2$1, 2, null);
    }

    public static final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(jumpToCurrentState jumptocurrentstate, BankStatus bankStatus) {
        jumptocurrentstate.b = bankStatus;
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new ChooseBsuBankBottomSheetFragment$handleItemClicked$1(jumptocurrentstate, bankStatus, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(BankStatus p0) {
        Iterable iterable = ((addState) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).d;
        Intrinsics.checkNotNullExpressionValue(iterable, "");
        int i = 0;
        for (Object obj : iterable) {
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            BankStatus bankStatus = (BankStatus) obj;
            bankStatus.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = Intrinsics.areEqual(p0.TuitionPaymentFragmentbindingInflater1, bankStatus.TuitionPaymentFragmentbindingInflater1);
            ((addState) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).d.set(i, (Data) bankStatus);
            FragmentChooseReligionBottomSheetBinding fragmentChooseReligionBottomSheetBinding = this.TuitionPaymentFragmentbindingInflater1;
            if (fragmentChooseReligionBottomSheetBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentChooseReligionBottomSheetBinding = null;
            }
            fragmentChooseReligionBottomSheetBinding.rvChooseReligion.scrollToPosition(i);
            i++;
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        List listListOf = CollectionsKt.listOf((Object[]) new BankStatus[]{new BankStatus("BANK BRI", false), new BankStatus("BANK BNI", false), new BankStatus("BANK MANDIRI", false), new BankStatus("BANK BTN", false), new BankStatus("BANK SYARIAH INDONESIA", false)});
        addState addstate = (addState) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue();
        addstate.d.clear();
        addstate.notifyDataSetChanged();
        ((addState) this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(listListOf);
        BankStatus bankStatus = this.b;
        if (bankStatus != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault2(bankStatus);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jumpToCurrentState() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
