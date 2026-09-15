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
import com.bpjstku.domain.report.model.Healthcare;
import com.bpjstku.presentation.report.PlkkBottomSheetFragment$handleItemClicked$1;
import com.bpjstku.presentation.report.PlkkBottomSheetFragment$healtchCareAdapter$2$1;
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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0011R\"\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001c0\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u0015\u0010\u0015\u001a\u00020\u001e8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0018\u0010\u001fR\u0014\u0010\u0016\u001a\u00020 8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010!R\u0016\u0010\u0019\u001a\u00020\"8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0013\u0010#"}, d2 = {"LisImageAnalysis;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function1;", "Lcom/bpjstku/domain/report/model/Healthcare;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "Lcom/bpjstku/domain/report/model/Healthcare;", "", "LlambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy;", "Ljava/util/List;", "LgetClosestSupportedDeviceFrameRate;", "Lkotlin/Lazy;", "", "()I", "Lcom/bpjstku/databinding/FragmentGeneralSearchableListBottomSheetBinding;", "Lcom/bpjstku/databinding/FragmentGeneralSearchableListBottomSheetBinding;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class isImageAnalysis extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Function1<Healthcare, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private FragmentGeneralSearchableListBottomSheetBinding asInterface;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private Healthcare TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<Healthcare>> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getTuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return R.layout.fragment_general_searchable_list_bottom_sheet;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
    }

    public /* synthetic */ isImageAnalysis(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public isImageAnalysis(Function1<? super Healthcare, Unit> function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = CollectionsKt.emptyList();
        this.b = LazyKt.lazy(new Function0() { // from class: issueStillCaptureRequest
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return isImageAnalysis.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
    }

    /* JADX INFO: renamed from: isImageAnalysis$TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"LisImageAnalysis$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/bpjstku/domain/report/model/Healthcare;", "", "p0", "LisImageAnalysis;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lkotlin/jvm/functions/Function1;)LisImageAnalysis;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static isImageAnalysis TuitionPaymentFragmentspecialinlinedviewModeldefault2(Function1<? super Healthcare, Unit> p0) {
            return new isImageAnalysis(p0);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentGeneralSearchableListBottomSheetBinding fragmentGeneralSearchableListBottomSheetBindingInflate = FragmentGeneralSearchableListBottomSheetBinding.inflate(p0, p1, false);
        this.asInterface = fragmentGeneralSearchableListBottomSheetBindingInflate;
        if (fragmentGeneralSearchableListBottomSheetBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralSearchableListBottomSheetBindingInflate = null;
        }
        LinearLayout root = fragmentGeneralSearchableListBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            Bundle arguments = getArguments();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = arguments != null ? (Healthcare) arguments.getParcelable("key_selected_healthcare") : null;
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        FragmentGeneralSearchableListBottomSheetBinding fragmentGeneralSearchableListBottomSheetBinding = this.asInterface;
        if (fragmentGeneralSearchableListBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralSearchableListBottomSheetBinding = null;
        }
        SearchView searchView = fragmentGeneralSearchableListBottomSheetBinding.svSearchItem;
        Intrinsics.checkNotNullExpressionValue(searchView, "");
        retrieveConcurrentCameraIds.b(searchView, (Function1<? super String, Unit>) new Function1() { // from class: issueTriggerRequest
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return isImageAnalysis.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (String) obj);
            }
        });
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault3(isImageAnalysis isimageanalysis, String str) {
        ((getClosestSupportedDeviceFrameRate) isimageanalysis.b.getValue()).TuitionPaymentFragmentbindingInflater1(String.valueOf(str));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ getClosestSupportedDeviceFrameRate TuitionPaymentFragmentbindingInflater1(isImageAnalysis isimageanalysis) {
        Context contextRequireContext = isimageanalysis.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new getClosestSupportedDeviceFrameRate(contextRequireContext, null, new PlkkBottomSheetFragment$healtchCareAdapter$2$1(isimageanalysis), 2, null);
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(isImageAnalysis isimageanalysis, Healthcare healthcare) {
        isimageanalysis.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = healthcare;
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new PlkkBottomSheetFragment$handleItemClicked$1(isimageanalysis, healthcare, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        getClosestSupportedDeviceFrameRate getclosestsupporteddeviceframerate = (getClosestSupportedDeviceFrameRate) this.b.getValue();
        getclosestsupporteddeviceframerate.d.clear();
        getclosestsupporteddeviceframerate.notifyDataSetChanged();
        ((getClosestSupportedDeviceFrameRate) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        FragmentGeneralSearchableListBottomSheetBinding fragmentGeneralSearchableListBottomSheetBinding = this.asInterface;
        if (fragmentGeneralSearchableListBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralSearchableListBottomSheetBinding = null;
        }
        RecyclerView recyclerView = fragmentGeneralSearchableListBottomSheetBinding.rvItem;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(requireContext(), 1));
        recyclerView.setAdapter((getClosestSupportedDeviceFrameRate) this.b.getValue());
        fragmentGeneralSearchableListBottomSheetBinding.tvTitle.setText(getString(R.string.label_plkk_nearest));
        fragmentGeneralSearchableListBottomSheetBinding.svSearchItem.setQueryHint(getString(R.string.hint_search_plkk));
        Healthcare healthcare = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (healthcare != null) {
            Iterable iterable = ((getClosestSupportedDeviceFrameRate) this.b.getValue()).d;
            Intrinsics.checkNotNullExpressionValue(iterable, "");
            int i = 0;
            for (Object obj : iterable) {
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy = (lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy) obj;
                lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentbindingInflater1 = Intrinsics.areEqual(healthcare.TuitionPaymentFragmentspecialinlinedviewModeldefault2, ((Healthcare) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                ((getClosestSupportedDeviceFrameRate) this.b.getValue()).d.set(i, (Data) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy);
                if (Intrinsics.areEqual(healthcare.TuitionPaymentFragmentspecialinlinedviewModeldefault2, ((Healthcare) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                    FragmentGeneralSearchableListBottomSheetBinding fragmentGeneralSearchableListBottomSheetBinding2 = this.asInterface;
                    if (fragmentGeneralSearchableListBottomSheetBinding2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                        fragmentGeneralSearchableListBottomSheetBinding2 = null;
                    }
                    RecyclerView recyclerView2 = fragmentGeneralSearchableListBottomSheetBinding2.rvItem;
                    int i2 = i + 4;
                    if (((getClosestSupportedDeviceFrameRate) this.b.getValue()).d.size() <= i2 || i <= 4) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public isImageAnalysis() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
