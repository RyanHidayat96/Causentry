package defpackage;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SearchView;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bpjstku.R;
import com.bpjstku.data.lib.model.BaseRequest;
import com.bpjstku.databinding.FragmentGeneralListBottomSheetBinding;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.domain.vocation.model.Bank;
import com.bpjstku.presentation.program.jht.olddaysecurity.BankBottomSheetDialogFragment$bankAdapter$2$1;
import com.bpjstku.presentation.program.jht.olddaysecurity.BankBottomSheetDialogFragment$handleItemClicked$1;
import com.kennyc.view.MultiStateView;
import defpackage.Camera2CameraControlImplExternalSyntheticLambda4;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.setQuickZoomEnabled;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.b;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0016R\"\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0015\u0010\u0015\u001a\u00020\u00198CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0015\u0010\u001c\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030 0\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010!R\u0014\u0010\u0012\u001a\u00020\"8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010#R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0018\u0010%"}, d2 = {"LgetExposureControl;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function1;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "(Lcom/bpjstku/domain/general/model/CodeNamePair;)V", "Lkotlin/jvm/functions/Function1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "LCamera2CameraControlImplExternalSyntheticLambda4;", "Lkotlin/Lazy;", "LisInVideoUsage;", "TuitionPaymentFragmentbindingInflater1", "asBinder", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "", "LlambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy;", "Ljava/util/List;", "", "()I", "Lcom/bpjstku/databinding/FragmentGeneralListBottomSheetBinding;", "Lcom/bpjstku/databinding/FragmentGeneralListBottomSheetBinding;", "asInterface"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class getExposureControl extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Lazy TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Function1<CodeNamePair, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    private FragmentGeneralListBottomSheetBinding asInterface;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final Lazy b;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private CodeNamePair TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<CodeNamePair>> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getTuitionPaymentFragmentbindingInflater1() {
        return R.layout.fragment_general_list_bottom_sheet;
    }

    public /* synthetic */ getExposureControl(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getExposureControl(Function1<? super CodeNamePair, Unit> function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = function1;
        final getExposureControl getexposurecontrol = this;
        this.b = LazyKt.lazy(new Function0<Camera2CameraControlImplExternalSyntheticLambda4>() { // from class: com.bpjstku.presentation.program.jht.olddaysecurity.BankBottomSheetDialogFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [Camera2CameraControlImplExternalSyntheticLambda4, androidx.lifecycle.ViewModel] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ Camera2CameraControlImplExternalSyntheticLambda4 invoke() {
                LifecycleOwner lifecycleOwner = getexposurecontrol;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Camera2CameraControlImplExternalSyntheticLambda4.class);
                if (lifecycleOwner != null) {
                    ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
                    return isQuickZoomEnabled.b(componentCallbacks instanceof getEventTime ? ((getEventTime) componentCallbacks).getKoin() : ZoomGestureDetectorOnZoomGestureListener.TuitionPaymentFragmentbindingInflater1().b, new setQuickZoomEnabled(orCreateKotlinClass, lifecycleOwner, mappoint, null, function0, 8, null));
                }
                throw new TypeCastException("null cannot be cast to non-null type android.content.ComponentCallbacks");
            }

            {
                super(0);
            }
        });
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0() { // from class: getCameraCapturePipelineAsync
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return getExposureControl.TuitionPaymentFragmentbindingInflater1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            }
        });
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = CollectionsKt.emptyList();
    }

    /* JADX INFO: renamed from: getExposureControl$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"LgetExposureControl$b;", "", "<init>", "()V", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "p0", "Lkotlin/Function1;", "", "p1", "LgetExposureControl;", "TuitionPaymentFragmentbindingInflater1", "(Lkotlin/jvm/functions/Function1;)LgetExposureControl;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static getExposureControl TuitionPaymentFragmentbindingInflater1(Function1<? super CodeNamePair, Unit> function1) {
            getExposureControl getexposurecontrol = new getExposureControl(function1);
            getexposurecontrol.setArguments(new Bundle());
            return getexposurecontrol;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBindingInflate = FragmentGeneralListBottomSheetBinding.inflate(p0, p1, false);
        this.asInterface = fragmentGeneralListBottomSheetBindingInflate;
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
            this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = arguments != null ? (CodeNamePair) arguments.getParcelable("service_area") : null;
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = this.asInterface;
        if (fragmentGeneralListBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralListBottomSheetBinding = null;
        }
        fragmentGeneralListBottomSheetBinding.svSearchItem.setQueryHint(getString(R.string.hint_search_bank));
        isInVideoUsage isinvideousage = (isInVideoUsage) this.TuitionPaymentFragmentbindingInflater1.getValue();
        isinvideousage.d.clear();
        isinvideousage.notifyDataSetChanged();
        ((isInVideoUsage) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        RecyclerView recyclerView = fragmentGeneralListBottomSheetBinding.rvItem;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(requireContext(), 1));
        recyclerView.setAdapter((isInVideoUsage) this.TuitionPaymentFragmentbindingInflater1.getValue());
        fragmentGeneralListBottomSheetBinding.tvTitle.setText(getString(R.string.hint_bank_name));
        CodeNamePair codeNamePair = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        if (codeNamePair != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault3(codeNamePair);
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = this.asInterface;
        if (fragmentGeneralListBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentGeneralListBottomSheetBinding = null;
        }
        SearchView searchView = fragmentGeneralListBottomSheetBinding.svSearchItem;
        Intrinsics.checkNotNullExpressionValue(searchView, "");
        retrieveConcurrentCameraIds.b(searchView, (Function1<? super String, Unit>) new Function1() { // from class: getCurrentSessionUpdateId
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return getExposureControl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.b, (String) obj);
            }
        });
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(getExposureControl getexposurecontrol, String str) {
        isInVideoUsage isinvideousage = (isInVideoUsage) getexposurecontrol.TuitionPaymentFragmentbindingInflater1.getValue();
        if (str == null) {
            str = "";
        }
        isinvideousage.b(str);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void b(getExposureControl getexposurecontrol, VirtualCameraAdapter1 virtualCameraAdapter1) {
        FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding2 = getexposurecontrol.asInterface;
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
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding3 = getexposurecontrol.asInterface;
            if (fragmentGeneralListBottomSheetBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentGeneralListBottomSheetBinding = fragmentGeneralListBottomSheetBinding3;
            }
            MultiStateView multiStateView2 = fragmentGeneralListBottomSheetBinding.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
            multiStateView2.setViewState(MultiStateView.ViewState.CONTENT);
            Iterable<Bank> iterable = (Iterable) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (Bank bank : iterable) {
                arrayList.add(new CodeNamePair(bank.TuitionPaymentFragmentspecialinlinedviewModeldefault3, bank.TuitionPaymentFragmentspecialinlinedviewModeldefault1));
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(new lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy((CodeNamePair) it.next()));
            }
            getexposurecontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = arrayList3;
            isInVideoUsage isinvideousage = (isInVideoUsage) getexposurecontrol.TuitionPaymentFragmentbindingInflater1.getValue();
            isinvideousage.d.clear();
            isinvideousage.notifyDataSetChanged();
            ((isInVideoUsage) getexposurecontrol.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(getexposurecontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            CodeNamePair codeNamePair = getexposurecontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            if (codeNamePair != null) {
                getexposurecontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault3(codeNamePair);
                return;
            }
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding4 = getexposurecontrol.asInterface;
            if (fragmentGeneralListBottomSheetBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentGeneralListBottomSheetBinding = fragmentGeneralListBottomSheetBinding4;
            }
            MultiStateView multiStateView3 = fragmentGeneralListBottomSheetBinding.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView3, "");
            Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView3, ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, null, null, null);
        }
    }

    public static /* synthetic */ isInVideoUsage TuitionPaymentFragmentbindingInflater1(getExposureControl getexposurecontrol) {
        Context contextRequireContext = getexposurecontrol.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new isInVideoUsage(contextRequireContext, null, new BankBottomSheetDialogFragment$bankAdapter$2$1(getexposurecontrol), 2, null);
    }

    public static final /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(getExposureControl getexposurecontrol, CodeNamePair codeNamePair) {
        getexposurecontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = codeNamePair;
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new BankBottomSheetDialogFragment$handleItemClicked$1(getexposurecontrol, codeNamePair, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(CodeNamePair p0) {
        Iterable iterable = ((isInVideoUsage) this.TuitionPaymentFragmentbindingInflater1.getValue()).d;
        Intrinsics.checkNotNullExpressionValue(iterable, "");
        int i = 0;
        for (Object obj : iterable) {
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy = (lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy) obj;
            lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentbindingInflater1 = Intrinsics.areEqual(p0.b, ((CodeNamePair) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).b);
            ((isInVideoUsage) this.TuitionPaymentFragmentbindingInflater1.getValue()).d.set(i, (Data) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy);
            if (Intrinsics.areEqual(p0.b, ((CodeNamePair) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).b)) {
                FragmentGeneralListBottomSheetBinding fragmentGeneralListBottomSheetBinding = this.asInterface;
                if (fragmentGeneralListBottomSheetBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    fragmentGeneralListBottomSheetBinding = null;
                }
                RecyclerView recyclerView = fragmentGeneralListBottomSheetBinding.rvItem;
                int i2 = i + 4;
                if (((isInVideoUsage) this.TuitionPaymentFragmentbindingInflater1.getValue()).d.size() <= i2 || i <= 4) {
                    i2 = i;
                }
                recyclerView.scrollToPosition(i2);
            }
            i++;
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
        ((Camera2CameraControlImplExternalSyntheticLambda4) this.b.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.observe(this, new Observer() { // from class: getFlashMode
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                getExposureControl.b(this.TuitionPaymentFragmentbindingInflater1, (VirtualCameraAdapter1) obj);
            }
        });
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        final Camera2CameraControlImplExternalSyntheticLambda4 camera2CameraControlImplExternalSyntheticLambda4 = (Camera2CameraControlImplExternalSyntheticLambda4) this.b.getValue();
        MutableLiveData<VirtualCameraAdapter1<List<Bank>>> mutableLiveData = camera2CameraControlImplExternalSyntheticLambda4.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(camera2CameraControlImplExternalSyntheticLambda4.connect.b(new BaseRequest())));
        final Function1 function1 = new Function1() { // from class: configAndCloseIfNeeded
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Camera2CameraControlImplExternalSyntheticLambda4.b(camera2CameraControlImplExternalSyntheticLambda4, (List) obj);
            }
        };
        logToString logtostring = new logToString() { // from class: debugLog
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: getOrCreateUserReleaseFuture
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Camera2CameraControlImplExternalSyntheticLambda4.TuitionPaymentFragmentbindingInflater1(camera2CameraControlImplExternalSyntheticLambda4, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = derivecodecB.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: createDeviceStateCallback
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
        camera2CameraControlImplExternalSyntheticLambda4.INotificationSideChannelStubProxy.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public getExposureControl() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
