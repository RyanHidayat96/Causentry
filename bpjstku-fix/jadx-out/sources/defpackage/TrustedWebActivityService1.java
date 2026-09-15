package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.databinding.FragmentGeneralListBottomSheetBinding;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.presentation.partner.CityBottomSheetDialogFragment$cityAdapter$2$1;
import com.bpjstku.presentation.partner.CityBottomSheetDialogFragment$handleItemClicked$1;
import com.bpjstku.presentation.partner.CityBottomSheetDialogFragment$special$$inlined$viewModel$default$1;
import com.kennyc.view.MultiStateView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0011R\"\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a0\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR\u0015\u0010\u0015\u001a\u00020\u001f8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b \u0010!R\u0015\u0010 \u001a\u00020\"8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u001a\u0010\u0014\u001a\u00020#8\u0015X\u0095D¢\u0006\f\n\u0004\b\u0015\u0010$\u001a\u0004\b\u0016\u0010%R\u0016\u0010\u001b\u001a\u00020&8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0013\u0010'"}, d2 = {"LTrustedWebActivityService1;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function1;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentbindingInflater1", "", "LlambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy;", "a", "Ljava/util/List;", "asBinder", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "LonSuggestionClick;", "asInterface", "Lkotlin/Lazy;", "LTrustedWebActivityServiceConnectionPoolBindToServiceAsyncTask;", "", "I", "()I", "Lcom/bpjstku/databinding/FragmentGeneralListBottomSheetBinding;", "Lcom/bpjstku/databinding/FragmentGeneralListBottomSheetBinding;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TrustedWebActivityService1 extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy asInterface;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private final Function1<CodeNamePair, Unit> TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private FragmentGeneralListBottomSheetBinding a;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<CodeNamePair>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private CodeNamePair TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int d;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private CodeNamePair TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public /* synthetic */ TrustedWebActivityService1(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrustedWebActivityService1(Function1<? super CodeNamePair, Unit> function1) {
        this.TuitionPaymentFragmentbindingInflater1 = function1;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = CollectionsKt.emptyList();
        this.b = LazyKt.lazy(new CityBottomSheetDialogFragment$special$$inlined$viewModel$default$1(this));
        this.asInterface = LazyKt.lazy(new Function0() { // from class: getSmallIconBitmap
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TrustedWebActivityService1.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
        this.d = R.layout.fragment_general_list_bottom_sheet;
    }

    /* JADX INFO: renamed from: TrustedWebActivityService1$TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"LTrustedWebActivityService1$TuitionPaymentFragmentbindingInflater1;", "", "<init>", "()V", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "p0", "p1", "Lkotlin/Function1;", "", "p2", "LTrustedWebActivityService1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "(Lcom/bpjstku/domain/general/model/CodeNamePair;Lcom/bpjstku/domain/general/model/CodeNamePair;Lkotlin/jvm/functions/Function1;)LTrustedWebActivityService1;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static TrustedWebActivityService1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(CodeNamePair p0, CodeNamePair p1, Function1<? super CodeNamePair, Unit> p2) {
            TrustedWebActivityService1 trustedWebActivityService1 = new TrustedWebActivityService1(p2);
            Bundle bundle = new Bundle();
            if (p0 != null) {
                bundle.putParcelable("key_city_partner", p0);
            }
            if (p1 != null) {
                bundle.putParcelable("key_province_partner", p1);
            }
            trustedWebActivityService1.setArguments(bundle);
            return trustedWebActivityService1;
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
        this.a = fragmentGeneralListBottomSheetBindingInflate;
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
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = arguments != null ? (CodeNamePair) arguments.getParcelable("key_city_partner") : null;
        }
        if (this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            Bundle arguments2 = getArguments();
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = arguments2 != null ? (CodeNamePair) arguments2.getParcelable("key_province_partner") : null;
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = this.a;
        if (fragmentGeneralListBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralListBottomSheetBinding = null;
        }
        RecyclerView recyclerView = fragmentGeneralListBottomSheetBinding.rvItem;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(requireContext(), 1));
        fragmentGeneralListBottomSheetBinding.rvItem.setAdapter((TrustedWebActivityServiceConnectionPoolBindToServiceAsyncTask) this.asInterface.getValue());
        fragmentGeneralListBottomSheetBinding.tvTitle.setText(getString(R.string.label_city));
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = this.a;
        if (fragmentGeneralListBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralListBottomSheetBinding = null;
        }
        SearchView searchView = fragmentGeneralListBottomSheetBinding.svSearchItem;
        Intrinsics.checkNotNullExpressionValue(searchView, "");
        retrieveConcurrentCameraIds.b(searchView, (Function1<? super String, Unit>) new Function1() { // from class: areNotificationsEnabled
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return TrustedWebActivityService1.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, (String) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static /* synthetic */ void TuitionPaymentFragmentbindingInflater1(final TrustedWebActivityService1 trustedWebActivityService1, VirtualCameraAdapter1 virtualCameraAdapter1) {
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding2 = trustedWebActivityService1.a;
            if (fragmentGeneralListBottomSheetBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentGeneralListBottomSheetBinding = fragmentGeneralListBottomSheetBinding2;
            }
            MultiStateView multiStateView = fragmentGeneralListBottomSheetBinding.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView, "");
            multiStateView.setViewState(MultiStateView.ViewState.LOADING);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding3 = trustedWebActivityService1.a;
            if (fragmentGeneralListBottomSheetBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentGeneralListBottomSheetBinding = fragmentGeneralListBottomSheetBinding3;
            }
            MultiStateView multiStateView2 = fragmentGeneralListBottomSheetBinding.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
            Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView2, ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, trustedWebActivityService1.getString(R.string.error_error_occured), null, new Pair(trustedWebActivityService1.getString(R.string.action_retry), new Function0() { // from class: getSmallIconId
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TrustedWebActivityService1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
                }
            }));
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding4 = trustedWebActivityService1.a;
            if (fragmentGeneralListBottomSheetBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                fragmentGeneralListBottomSheetBinding4 = null;
            }
            MultiStateView multiStateView3 = fragmentGeneralListBottomSheetBinding4.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView3, "");
            multiStateView3.setViewState(MultiStateView.ViewState.CONTENT);
            List list = (List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            Intrinsics.checkNotNullParameter(list, "");
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy((CodeNamePair) it.next()));
            }
            trustedWebActivityService1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = arrayList;
            TrustedWebActivityServiceConnectionPoolBindToServiceAsyncTask trustedWebActivityServiceConnectionPoolBindToServiceAsyncTask = (TrustedWebActivityServiceConnectionPoolBindToServiceAsyncTask) trustedWebActivityService1.asInterface.getValue();
            trustedWebActivityServiceConnectionPoolBindToServiceAsyncTask.d.clear();
            trustedWebActivityServiceConnectionPoolBindToServiceAsyncTask.notifyDataSetChanged();
            ((TrustedWebActivityServiceConnectionPoolBindToServiceAsyncTask) trustedWebActivityService1.asInterface.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(trustedWebActivityService1.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            CodeNamePair codeNamePair = trustedWebActivityService1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (codeNamePair != null) {
                Iterable iterable = ((TrustedWebActivityServiceConnectionPoolBindToServiceAsyncTask) trustedWebActivityService1.asInterface.getValue()).d;
                Intrinsics.checkNotNullExpressionValue(iterable, "");
                int i = 0;
                for (Object obj : iterable) {
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy = (lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy) obj;
                    lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentbindingInflater1 = Intrinsics.areEqual(codeNamePair.b, ((CodeNamePair) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).b);
                    ((TrustedWebActivityServiceConnectionPoolBindToServiceAsyncTask) trustedWebActivityService1.asInterface.getValue()).d.set(i, (Data) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy);
                    if (Intrinsics.areEqual(codeNamePair.b, ((CodeNamePair) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).b)) {
                        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding5 = trustedWebActivityService1.a;
                        if (fragmentGeneralListBottomSheetBinding5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            fragmentGeneralListBottomSheetBinding5 = null;
                        }
                        RecyclerView recyclerView = fragmentGeneralListBottomSheetBinding5.rvItem;
                        int i2 = i + 4;
                        if (((TrustedWebActivityServiceConnectionPoolBindToServiceAsyncTask) trustedWebActivityService1.asInterface.getValue()).d.size() <= i2 || i <= 4) {
                            i2 = i;
                        }
                        recyclerView.scrollToPosition(i2);
                    }
                    i++;
                }
            }
        }
    }

    public static /* synthetic */ TrustedWebActivityServiceConnectionPoolBindToServiceAsyncTask TuitionPaymentFragmentspecialinlinedviewModeldefault2(TrustedWebActivityService1 trustedWebActivityService1) {
        Context contextRequireContext = trustedWebActivityService1.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new TrustedWebActivityServiceConnectionPoolBindToServiceAsyncTask(contextRequireContext, null, new CityBottomSheetDialogFragment$cityAdapter$2$1(trustedWebActivityService1), 2, null);
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(TrustedWebActivityService1 trustedWebActivityService1) {
        String str;
        CodeNamePair codeNamePair = trustedWebActivityService1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (codeNamePair != null && (str = codeNamePair.b) != null) {
            ((onSuggestionClick) trustedWebActivityService1.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit b(TrustedWebActivityService1 trustedWebActivityService1, String str) {
        TrustedWebActivityServiceConnectionPoolBindToServiceAsyncTask trustedWebActivityServiceConnectionPoolBindToServiceAsyncTask = (TrustedWebActivityServiceConnectionPoolBindToServiceAsyncTask) trustedWebActivityService1.asInterface.getValue();
        if (str == null) {
            str = "";
        }
        trustedWebActivityServiceConnectionPoolBindToServiceAsyncTask.TuitionPaymentFragmentbindingInflater1(str);
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(TrustedWebActivityService1 trustedWebActivityService1, CodeNamePair codeNamePair) {
        trustedWebActivityService1.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = codeNamePair;
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new CityBottomSheetDialogFragment$handleItemClicked$1(trustedWebActivityService1, codeNamePair, null), 3, null);
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
        ((onSuggestionClick) this.b.getValue()).TuitionPaymentFragmentbindingInflater1.observe(getViewLifecycleOwner(), new Observer() { // from class: cancelNotification
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                TrustedWebActivityService1.TuitionPaymentFragmentbindingInflater1(this.b, (VirtualCameraAdapter1) obj);
            }
        });
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        String str;
        CodeNamePair codeNamePair = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        if (codeNamePair == null || (str = codeNamePair.b) == null) {
            return;
        }
        ((onSuggestionClick) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrustedWebActivityService1() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
