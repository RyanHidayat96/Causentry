package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentGeneralListBottomSheetBinding;
import com.bpjstku.domain.vocation.model.Bank;
import com.bpjstku.presentation.vocational.bottomsheets.BankBottomSheetFragment$adapter$2$1;
import com.bpjstku.presentation.vocational.bottomsheets.BankBottomSheetFragment$handleItemClicked$1;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0011R\"\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a0\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0015\u0010\u0013\u001a\u00020\u001e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u001f\u001a\u00020!8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0010\u0010\"R\u001a\u0010\u0014\u001a\u00020#8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0015\u0010$\u001a\u0004\b\u0018\u0010%"}, d2 = {"LapplyQuirks;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function1;", "Lcom/bpjstku/domain/vocation/model/Bank;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "a", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "", "LlambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy;", "Ljava/util/List;", "asBinder", "Lcom/bpjstku/domain/vocation/model/Bank;", "LtoggleHDRPlus;", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/Lazy;", "Lcom/bpjstku/databinding/FragmentGeneralListBottomSheetBinding;", "Lcom/bpjstku/databinding/FragmentGeneralListBottomSheetBinding;", "", "I", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class applyQuirks extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private FragmentGeneralListBottomSheetBinding TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<Bank>> b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1<Bank, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private Bank TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int d;

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
    }

    public /* synthetic */ applyQuirks(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public applyQuirks(Function1<? super Bank, Unit> function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
        this.b = CollectionsKt.emptyList();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = LazyKt.lazy(new Function0() { // from class: onAePrecaptureFinished
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return applyQuirks.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentbindingInflater1);
            }
        });
        this.d = R.layout.fragment_general_searchable_list_bottom_sheet;
    }

    /* JADX INFO: renamed from: applyQuirks$TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"LapplyQuirks$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "<init>", "()V", "Lcom/bpjstku/domain/vocation/model/Bank;", "p0", "Lkotlin/Function1;", "", "p1", "LapplyQuirks;", "b", "(Lcom/bpjstku/domain/vocation/model/Bank;Lkotlin/jvm/functions/Function1;)LapplyQuirks;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static applyQuirks b(Bank p0, Function1<? super Bank, Unit> p1) {
            applyQuirks applyquirks = new applyQuirks(p1);
            Bundle bundle = new Bundle();
            if (p0 != null) {
                bundle.putParcelable("key_selected_bank", p0);
            }
            applyquirks.setArguments(bundle);
            return applyquirks;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from getter */
    public final int getD() {
        return this.d;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBindingInflate = FragmentGeneralListBottomSheetBinding.inflate(p0, p1, false);
        this.TuitionPaymentFragmentbindingInflater1 = fragmentGeneralListBottomSheetBindingInflate;
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
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            Bundle arguments = getArguments();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = arguments != null ? (Bank) arguments.getParcelable("key_selected_bank") : null;
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = this.TuitionPaymentFragmentbindingInflater1;
        if (fragmentGeneralListBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralListBottomSheetBinding = null;
        }
        SearchView searchView = fragmentGeneralListBottomSheetBinding.svSearchItem;
        Intrinsics.checkNotNullExpressionValue(searchView, "");
        retrieveConcurrentCameraIds.b(searchView, (Function1<? super String, Unit>) new Function1() { // from class: OverrideAeModeForStillCapture
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return applyQuirks.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (String) obj);
            }
        });
    }

    public static /* synthetic */ toggleHDRPlus TuitionPaymentFragmentbindingInflater1(applyQuirks applyquirks) {
        Context contextRequireContext = applyquirks.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new toggleHDRPlus(contextRequireContext, null, new BankBottomSheetFragment$adapter$2$1(applyquirks), 2, null);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(applyQuirks applyquirks, String str) {
        ((toggleHDRPlus) applyquirks.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentbindingInflater1(String.valueOf(str));
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentbindingInflater1(applyQuirks applyquirks, Bank bank) {
        applyquirks.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = bank;
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new BankBottomSheetFragment$handleItemClicked$1(applyquirks, bank, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        toggleHDRPlus togglehdrplus = (toggleHDRPlus) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue();
        togglehdrplus.d.clear();
        togglehdrplus.notifyDataSetChanged();
        ((toggleHDRPlus) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = this.TuitionPaymentFragmentbindingInflater1;
        if (fragmentGeneralListBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralListBottomSheetBinding = null;
        }
        RecyclerView recyclerView = fragmentGeneralListBottomSheetBinding.rvItem;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(requireContext(), 1));
        recyclerView.setAdapter((toggleHDRPlus) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue());
        fragmentGeneralListBottomSheetBinding.tvTitle.setText(getString(R.string.label_bank_name));
        fragmentGeneralListBottomSheetBinding.svSearchItem.setQueryHint(getString(R.string.hint_search_bank));
        Bank bank = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (bank != null) {
            Iterable iterable = ((toggleHDRPlus) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).d;
            Intrinsics.checkNotNullExpressionValue(iterable, "");
            int i = 0;
            for (Object obj : iterable) {
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy = (lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy) obj;
                String str = bank.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                String str2 = bank.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(str2);
                String string = sb.toString();
                String str3 = ((Bank) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                String str4 = ((Bank) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(str4);
                lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentbindingInflater1 = Intrinsics.areEqual(string, sb2.toString());
                ((toggleHDRPlus) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).d.set(i, (Data) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy);
                if (Intrinsics.areEqual(bank.TuitionPaymentFragmentspecialinlinedviewModeldefault3, ((Bank) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                    FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding2 = this.TuitionPaymentFragmentbindingInflater1;
                    if (fragmentGeneralListBottomSheetBinding2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        fragmentGeneralListBottomSheetBinding2 = null;
                    }
                    RecyclerView recyclerView2 = fragmentGeneralListBottomSheetBinding2.rvItem;
                    int i2 = i + 4;
                    if (((toggleHDRPlus) this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.getValue()).d.size() <= i2 || i <= 4) {
                        i2 = i;
                    }
                    recyclerView2.scrollToPosition(i2);
                }
                i++;
            }
        }
        fragmentGeneralListBottomSheetBinding.svSearchItem.setQuery("", false);
        TuitionPaymentFragmentbindingInflater1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public applyQuirks() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
