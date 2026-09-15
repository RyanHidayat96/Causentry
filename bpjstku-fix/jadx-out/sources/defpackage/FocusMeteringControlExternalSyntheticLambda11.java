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
import com.bpjstku.databinding.FragmentGeneralSearchableListBottomSheetBinding;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.presentation.promo.bottomsheet.LocationBottomSheetFragment$adapter$2$1;
import com.bpjstku.presentation.promo.bottomsheet.LocationBottomSheetFragment$handleItemClicked$1;
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
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\tJ\u000f\u0010\r\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\tJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\"\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00180\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0015\u0010\u0019\u001a\u00020\u001c8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001fR\u0016\u0010#\u001a\u00020!8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\r\u0010\""}, d2 = {"LFocusMeteringControlExternalSyntheticLambda11;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function1;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lkotlin/jvm/functions/Function1;", "", "LlambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/util/List;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "LlambdaenableExternalFlashAeMode5androidxcameracamera2internalFocusMeteringControl;", "Lkotlin/Lazy;", "", "()I", "TuitionPaymentFragmentbindingInflater1", "Lcom/bpjstku/databinding/FragmentGeneralSearchableListBottomSheetBinding;", "Lcom/bpjstku/databinding/FragmentGeneralSearchableListBottomSheetBinding;", "a"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FocusMeteringControlExternalSyntheticLambda11 extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<CodeNamePair>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private final Function1<CodeNamePair, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private FragmentGeneralSearchableListBottomSheetBinding a;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private CodeNamePair b;

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getA() {
        return R.layout.fragment_general_searchable_list_bottom_sheet;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
    }

    public /* synthetic */ FocusMeteringControlExternalSyntheticLambda11(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FocusMeteringControlExternalSyntheticLambda11(Function1<? super CodeNamePair, Unit> function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = function1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = CollectionsKt.emptyList();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: FocusMeteringControlExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FocusMeteringControlExternalSyntheticLambda11.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        if (this.b == null) {
            Bundle arguments = getArguments();
            this.b = arguments != null ? (CodeNamePair) arguments.getParcelable("key_selected_merchant") : null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        FragmentGeneralSearchableListBottomSheetBinding fragmentGeneralSearchableListBottomSheetBinding = this.a;
        if (fragmentGeneralSearchableListBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralSearchableListBottomSheetBinding = null;
        }
        lambdaenableExternalFlashAeMode5androidxcameracamera2internalFocusMeteringControl lambdaenableexternalflashaemode5androidxcameracamera2internalfocusmeteringcontrol = (lambdaenableExternalFlashAeMode5androidxcameracamera2internalFocusMeteringControl) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        lambdaenableexternalflashaemode5androidxcameracamera2internalfocusmeteringcontrol.d.clear();
        lambdaenableexternalflashaemode5androidxcameracamera2internalfocusmeteringcontrol.notifyDataSetChanged();
        ((lambdaenableExternalFlashAeMode5androidxcameracamera2internalFocusMeteringControl) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        RecyclerView recyclerView = fragmentGeneralSearchableListBottomSheetBinding.rvItem;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(requireContext(), 1));
        recyclerView.setAdapter((lambdaenableExternalFlashAeMode5androidxcameracamera2internalFocusMeteringControl) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue());
        fragmentGeneralSearchableListBottomSheetBinding.tvTitle.setText(getString(R.string.label_location_merchant));
        fragmentGeneralSearchableListBottomSheetBinding.svSearchItem.setQueryHint(getString(R.string.hint_location_merchant));
        CodeNamePair codeNamePair = this.b;
        if (codeNamePair != null) {
            Iterable iterable = ((lambdaenableExternalFlashAeMode5androidxcameracamera2internalFocusMeteringControl) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).d;
            Intrinsics.checkNotNullExpressionValue(iterable, "");
            int i = 0;
            for (Object obj : iterable) {
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy = (lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy) obj;
                String str = codeNamePair.b;
                String str2 = codeNamePair.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(str2);
                String string = sb.toString();
                String str3 = ((CodeNamePair) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).b;
                String str4 = ((CodeNamePair) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str3);
                sb2.append(str4);
                lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentbindingInflater1 = Intrinsics.areEqual(string, sb2.toString());
                ((lambdaenableExternalFlashAeMode5androidxcameracamera2internalFocusMeteringControl) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).d.set(i, (Data) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy);
                if (Intrinsics.areEqual(codeNamePair.b, ((CodeNamePair) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).b)) {
                    FragmentGeneralSearchableListBottomSheetBinding fragmentGeneralSearchableListBottomSheetBinding2 = this.a;
                    if (fragmentGeneralSearchableListBottomSheetBinding2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        fragmentGeneralSearchableListBottomSheetBinding2 = null;
                    }
                    RecyclerView recyclerView2 = fragmentGeneralSearchableListBottomSheetBinding2.rvItem;
                    int i2 = i + 4;
                    if (((lambdaenableExternalFlashAeMode5androidxcameracamera2internalFocusMeteringControl) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).d.size() <= i2 || i <= 4) {
                        i2 = i;
                    }
                    recyclerView2.scrollToPosition(i2);
                }
                i++;
            }
        }
        fragmentGeneralSearchableListBottomSheetBinding.svSearchItem.setQuery("", false);
        TuitionPaymentFragmentbindingInflater1();
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        FragmentGeneralSearchableListBottomSheetBinding fragmentGeneralSearchableListBottomSheetBinding = this.a;
        if (fragmentGeneralSearchableListBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralSearchableListBottomSheetBinding = null;
        }
        SearchView searchView = fragmentGeneralSearchableListBottomSheetBinding.svSearchItem;
        Intrinsics.checkNotNullExpressionValue(searchView, "");
        retrieveConcurrentCameraIds.b(searchView, (Function1<? super String, Unit>) new Function1() { // from class: FocusMeteringControlExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FocusMeteringControlExternalSyntheticLambda11.b(this.TuitionPaymentFragmentbindingInflater1, (String) obj);
            }
        });
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentGeneralSearchableListBottomSheetBinding fragmentGeneralSearchableListBottomSheetBindingInflate = FragmentGeneralSearchableListBottomSheetBinding.inflate(p0, p1, false);
        this.a = fragmentGeneralSearchableListBottomSheetBindingInflate;
        if (fragmentGeneralSearchableListBottomSheetBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralSearchableListBottomSheetBindingInflate = null;
        }
        LinearLayout root = fragmentGeneralSearchableListBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    /* JADX INFO: renamed from: FocusMeteringControlExternalSyntheticLambda11$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"LFocusMeteringControlExternalSyntheticLambda11$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "p0", "Lkotlin/Function1;", "", "p1", "LFocusMeteringControlExternalSyntheticLambda11;", "TuitionPaymentFragmentbindingInflater1", "(Lcom/bpjstku/domain/general/model/CodeNamePair;Lkotlin/jvm/functions/Function1;)LFocusMeteringControlExternalSyntheticLambda11;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static FocusMeteringControlExternalSyntheticLambda11 TuitionPaymentFragmentbindingInflater1(CodeNamePair p0, Function1<? super CodeNamePair, Unit> p1) {
            FocusMeteringControlExternalSyntheticLambda11 focusMeteringControlExternalSyntheticLambda11 = new FocusMeteringControlExternalSyntheticLambda11(p1);
            focusMeteringControlExternalSyntheticLambda11.setArguments(new Bundle());
            return focusMeteringControlExternalSyntheticLambda11;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ lambdaenableExternalFlashAeMode5androidxcameracamera2internalFocusMeteringControl TuitionPaymentFragmentspecialinlinedviewModeldefault2(FocusMeteringControlExternalSyntheticLambda11 focusMeteringControlExternalSyntheticLambda11) {
        Context contextRequireContext = focusMeteringControlExternalSyntheticLambda11.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new lambdaenableExternalFlashAeMode5androidxcameracamera2internalFocusMeteringControl(contextRequireContext, null, new LocationBottomSheetFragment$adapter$2$1(focusMeteringControlExternalSyntheticLambda11), 2, null);
    }

    public static /* synthetic */ Unit b(FocusMeteringControlExternalSyntheticLambda11 focusMeteringControlExternalSyntheticLambda11, String str) {
        ((lambdaenableExternalFlashAeMode5androidxcameracamera2internalFocusMeteringControl) focusMeteringControlExternalSyntheticLambda11.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentbindingInflater1(String.valueOf(str));
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(FocusMeteringControlExternalSyntheticLambda11 focusMeteringControlExternalSyntheticLambda11, CodeNamePair codeNamePair) {
        focusMeteringControlExternalSyntheticLambda11.b = codeNamePair;
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new LocationBottomSheetFragment$handleItemClicked$1(focusMeteringControlExternalSyntheticLambda11, codeNamePair, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FocusMeteringControlExternalSyntheticLambda11() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
