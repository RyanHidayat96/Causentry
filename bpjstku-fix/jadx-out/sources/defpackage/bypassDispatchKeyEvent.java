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
import com.bpjstku.data.asik.model.response.AddressPostalCodeItem;
import com.bpjstku.databinding.FragmentChoosePostalCodeAddressBottomSheetBinding;
import com.bpjstku.domain.general.model.CodeNamePair;
import com.bpjstku.presentation.asik.active.ChoosePostalCodeAddressBottomSheetFragment$chooseAddressPostalCodeAdapter$2$1;
import com.bpjstku.presentation.asik.active.ChoosePostalCodeAddressBottomSheetFragment$handleItemClicked$1;
import com.kennyc.view.MultiStateView;
import defpackage.ZoomGestureDetectorOnZoomGestureListener;
import defpackage.getEventTime;
import defpackage.isQuickZoomEnabled;
import defpackage.mapPoint;
import defpackage.select;
import defpackage.setQuickZoomEnabled;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
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
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001f\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0016J\u001d\u0010\u0013\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017H\u0002¢\u0006\u0004\b\u0013\u0010\u0018R\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0019\u001a\u00020\u001b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0015\u0010\u001e\u001a\u00020\u001d8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\"\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!0\u00178\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010\"\u001a\u00020$8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\b\u0015\u0010%R\u0014\u0010\u0014\u001a\u00020&8UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010'"}, d2 = {"LbypassDispatchKeyEvent;", "LunregisterMediaButtonEventReceiver;", "Lkotlin/Function1;", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "g", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "d", "b", "(Lcom/bpjstku/domain/general/model/CodeNamePair;)V", "", "(Ljava/util/List;)V", "TuitionPaymentFragmentbindingInflater1", "Lkotlin/jvm/functions/Function1;", "Lselect;", "Lkotlin/Lazy;", "LcreateIntentFilterForBroadcastReceiver;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "asInterface", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "LlambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy;", "asBinder", "Ljava/util/List;", "Lcom/bpjstku/databinding/FragmentChoosePostalCodeAddressBottomSheetBinding;", "Lcom/bpjstku/databinding/FragmentChoosePostalCodeAddressBottomSheetBinding;", "", "()I"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class bypassDispatchKeyEvent extends unregisterMediaButtonEventReceiver {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final Function1<CodeNamePair, Unit> TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Lazy TuitionPaymentFragmentbindingInflater1;
    private final Lazy TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    private List<lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy<CodeNamePair>> b;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private CodeNamePair TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private FragmentChoosePostalCodeAddressBottomSheetBinding asBinder;

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2 */
    public final int getTuitionPaymentFragmentbindingInflater1() {
        return R.layout.fragment_choose_postal_code_address_bottom_sheet;
    }

    public /* synthetic */ bypassDispatchKeyEvent(Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bypassDispatchKeyEvent(Function1<? super CodeNamePair, Unit> function1) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = function1;
        final bypassDispatchKeyEvent bypassdispatchkeyevent = this;
        this.TuitionPaymentFragmentbindingInflater1 = LazyKt.lazy(new Function0<select>() { // from class: com.bpjstku.presentation.asik.active.ChoosePostalCodeAddressBottomSheetFragment$special$$inlined$viewModel$default$1
            final /* synthetic */ mapPoint $qualifier = null;
            final /* synthetic */ Function0 $parameters = null;

            /* JADX WARN: Type inference failed for: r0v8, types: [androidx.lifecycle.ViewModel, select] */
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ select invoke() {
                LifecycleOwner lifecycleOwner = bypassdispatchkeyevent;
                mapPoint mappoint = this.$qualifier;
                Function0 function0 = this.$parameters;
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(select.class);
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
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = LazyKt.lazy(new Function0() { // from class: AppCompatDelegateImplAppCompatWindowCallback
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bypassDispatchKeyEvent.b(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            }
        });
        this.b = CollectionsKt.emptyList();
    }

    /* JADX INFO: renamed from: bypassDispatchKeyEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"LbypassDispatchKeyEvent$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "<init>", "()V", "Lcom/bpjstku/domain/general/model/CodeNamePair;", "p0", "Lkotlin/Function1;", "", "p1", "LbypassDispatchKeyEvent;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "(Lkotlin/jvm/functions/Function1;)LbypassDispatchKeyEvent;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public static bypassDispatchKeyEvent TuitionPaymentFragmentspecialinlinedviewModeldefault1(Function1<? super CodeNamePair, Unit> function1) {
            bypassDispatchKeyEvent bypassdispatchkeyevent = new bypassDispatchKeyEvent(function1);
            bypassdispatchkeyevent.setArguments(new Bundle());
            return bypassdispatchkeyevent;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        Intrinsics.checkNotNullParameter(p0, "");
        FragmentChoosePostalCodeAddressBottomSheetBinding fragmentChoosePostalCodeAddressBottomSheetBindingInflate = FragmentChoosePostalCodeAddressBottomSheetBinding.inflate(p0, p1, false);
        this.asBinder = fragmentChoosePostalCodeAddressBottomSheetBindingInflate;
        if (fragmentChoosePostalCodeAddressBottomSheetBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChoosePostalCodeAddressBottomSheetBindingInflate = null;
        }
        LinearLayout root = fragmentChoosePostalCodeAddressBottomSheetBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        FragmentChoosePostalCodeAddressBottomSheetBinding fragmentChoosePostalCodeAddressBottomSheetBinding = this.asBinder;
        if (fragmentChoosePostalCodeAddressBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChoosePostalCodeAddressBottomSheetBinding = null;
        }
        SearchView searchView = fragmentChoosePostalCodeAddressBottomSheetBinding.svSearchItem;
        Intrinsics.checkNotNullExpressionValue(searchView, "");
        retrieveConcurrentCameraIds.b(searchView, (Function1<? super String, Unit>) new Function1() { // from class: dispatchKeyShortcutEvent
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return bypassDispatchKeyEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault1(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, (String) obj);
            }
        });
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void d() {
        getMaxImages getmaximages = getMaxImages.INSTANCE;
        if (Intrinsics.areEqual(getMaxImages.TuitionPaymentFragmentspecialinlinedviewModeldefault2(), "true")) {
            final select selectVar = (select) this.TuitionPaymentFragmentbindingInflater1.getValue();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            Intrinsics.checkNotNullParameter(contextRequireContext, "");
            MutableLiveData<VirtualCameraAdapter1<List<CodeNamePair>>> mutableLiveData = selectVar.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
            VirtualCameraAdapter1.Companion companion = VirtualCameraAdapter1.INSTANCE;
            mutableLiveData.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
            deriveCodec derivecodecB = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(selectVar.d.TuitionPaymentFragmentbindingInflater1(contextRequireContext)));
            appendBackupVideoProfile appendbackupvideoprofileB = isSamsungJ2.b();
            share.b(appendbackupvideoprofileB, "scheduler is null");
            SingleSubscribeOn singleSubscribeOn = new SingleSubscribeOn(derivecodecB, appendbackupvideoprofileB);
            final Function1 function1 = new Function1() { // from class: AlertController2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return select.TuitionPaymentFragmentspecialinlinedviewModeldefault1(selectVar, (List) obj);
                }
            };
            logToString logtostring = new logToString() { // from class: setView
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function1.invoke(obj);
                }
            };
            final Function1 function2 = new Function1() { // from class: AlertController1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return select.TuitionPaymentFragmentspecialinlinedviewModeldefault1(selectVar, (Throwable) obj);
                }
            };
            BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3 = singleSubscribeOn.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring, new logToString() { // from class: onScrollChange
                @Override // defpackage.logToString
                public final void accept(Object obj) {
                    function2.invoke(obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3, "");
            selectVar.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault3);
            return;
        }
        final select selectVar2 = (select) this.TuitionPaymentFragmentbindingInflater1.getValue();
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        Intrinsics.checkNotNullParameter(contextRequireContext2, "");
        MutableLiveData<VirtualCameraAdapter1<List<AddressPostalCodeItem>>> mutableLiveData2 = selectVar2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        VirtualCameraAdapter1.Companion companion2 = VirtualCameraAdapter1.INSTANCE;
        mutableLiveData2.setValue(VirtualCameraAdapter1.Companion.TuitionPaymentFragmentbindingInflater1());
        deriveCodec derivecodecB2 = deriveCodec.b(((modifyBitrate) share.b(onResume.TuitionPaymentFragmentspecialinlinedviewModeldefault1(null, null, 3), "transformer is null")).TuitionPaymentFragmentbindingInflater1(selectVar2.d.TuitionPaymentFragmentspecialinlinedviewModeldefault1(contextRequireContext2)));
        appendBackupVideoProfile appendbackupvideoprofileB2 = isSamsungJ2.b();
        share.b(appendbackupvideoprofileB2, "scheduler is null");
        SingleSubscribeOn singleSubscribeOn2 = new SingleSubscribeOn(derivecodecB2, appendbackupvideoprofileB2);
        final Function1 function3 = new Function1() { // from class: onKeyDown
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return select.TuitionPaymentFragmentspecialinlinedviewModeldefault3(selectVar2, (List) obj);
            }
        };
        logToString logtostring2 = new logToString() { // from class: onScrollStateChanged
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function3.invoke(obj);
            }
        };
        final Function1 function4 = new Function1() { // from class: onItemClick
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return select.cancel(selectVar2, (Throwable) obj);
            }
        };
        BufferProviderState bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4 = singleSubscribeOn2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(logtostring2, new logToString() { // from class: setContentDescription
            @Override // defpackage.logToString
            public final void accept(Object obj) {
                function4.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4, "");
        selectVar2.INotificationSideChannel.TuitionPaymentFragmentspecialinlinedviewModeldefault3(bufferProviderStateTuitionPaymentFragmentspecialinlinedviewModeldefault4);
    }

    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault3(List<CodeNamePair> p0) {
        List<CodeNamePair> list = p0;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy((CodeNamePair) it.next()));
        }
        this.b = arrayList;
        createIntentFilterForBroadcastReceiver createintentfilterforbroadcastreceiver = (createIntentFilterForBroadcastReceiver) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        createintentfilterforbroadcastreceiver.d.clear();
        createintentfilterforbroadcastreceiver.notifyDataSetChanged();
        ((createIntentFilterForBroadcastReceiver) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
        CodeNamePair codeNamePair = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (codeNamePair != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(codeNamePair);
        }
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault2(bypassDispatchKeyEvent bypassdispatchkeyevent, VirtualCameraAdapter1 virtualCameraAdapter1) {
        FragmentChoosePostalCodeAddressBottomSheetBinding fragmentChoosePostalCodeAddressBottomSheetBinding = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            FragmentChoosePostalCodeAddressBottomSheetBinding fragmentChoosePostalCodeAddressBottomSheetBinding2 = bypassdispatchkeyevent.asBinder;
            if (fragmentChoosePostalCodeAddressBottomSheetBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentChoosePostalCodeAddressBottomSheetBinding = fragmentChoosePostalCodeAddressBottomSheetBinding2;
            }
            MultiStateView multiStateView = fragmentChoosePostalCodeAddressBottomSheetBinding.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView, "");
            multiStateView.setViewState(MultiStateView.ViewState.LOADING);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            FragmentChoosePostalCodeAddressBottomSheetBinding fragmentChoosePostalCodeAddressBottomSheetBinding3 = bypassdispatchkeyevent.asBinder;
            if (fragmentChoosePostalCodeAddressBottomSheetBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentChoosePostalCodeAddressBottomSheetBinding = fragmentChoosePostalCodeAddressBottomSheetBinding3;
            }
            MultiStateView multiStateView2 = fragmentChoosePostalCodeAddressBottomSheetBinding.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
            multiStateView2.setViewState(MultiStateView.ViewState.CONTENT);
            Iterable<AddressPostalCodeItem> iterable = (Iterable) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (AddressPostalCodeItem addressPostalCodeItem : iterable) {
                arrayList.add(new CodeNamePair(addressPostalCodeItem.getCode(), addressPostalCodeItem.getAddress()));
            }
            bypassdispatchkeyevent.TuitionPaymentFragmentspecialinlinedviewModeldefault3(arrayList);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            FragmentChoosePostalCodeAddressBottomSheetBinding fragmentChoosePostalCodeAddressBottomSheetBinding4 = bypassdispatchkeyevent.asBinder;
            if (fragmentChoosePostalCodeAddressBottomSheetBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentChoosePostalCodeAddressBottomSheetBinding = fragmentChoosePostalCodeAddressBottomSheetBinding4;
            }
            MultiStateView multiStateView3 = fragmentChoosePostalCodeAddressBottomSheetBinding.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView3, "");
            Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView3, ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, null, null, null);
        }
    }

    public static /* synthetic */ Unit TuitionPaymentFragmentspecialinlinedviewModeldefault1(bypassDispatchKeyEvent bypassdispatchkeyevent, String str) {
        createIntentFilterForBroadcastReceiver createintentfilterforbroadcastreceiver = (createIntentFilterForBroadcastReceiver) bypassdispatchkeyevent.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        if (str == null) {
            str = "";
        }
        createintentfilterforbroadcastreceiver.b(str);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void TuitionPaymentFragmentspecialinlinedviewModeldefault3(bypassDispatchKeyEvent bypassdispatchkeyevent, VirtualCameraAdapter1 virtualCameraAdapter1) {
        FragmentChoosePostalCodeAddressBottomSheetBinding fragmentChoosePostalCodeAddressBottomSheetBinding = null;
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            FragmentChoosePostalCodeAddressBottomSheetBinding fragmentChoosePostalCodeAddressBottomSheetBinding2 = bypassdispatchkeyevent.asBinder;
            if (fragmentChoosePostalCodeAddressBottomSheetBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentChoosePostalCodeAddressBottomSheetBinding = fragmentChoosePostalCodeAddressBottomSheetBinding2;
            }
            MultiStateView multiStateView = fragmentChoosePostalCodeAddressBottomSheetBinding.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView, "");
            multiStateView.setViewState(MultiStateView.ViewState.LOADING);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.asBinder) {
            FragmentChoosePostalCodeAddressBottomSheetBinding fragmentChoosePostalCodeAddressBottomSheetBinding3 = bypassdispatchkeyevent.asBinder;
            if (fragmentChoosePostalCodeAddressBottomSheetBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentChoosePostalCodeAddressBottomSheetBinding = fragmentChoosePostalCodeAddressBottomSheetBinding3;
            }
            MultiStateView multiStateView2 = fragmentChoosePostalCodeAddressBottomSheetBinding.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView2, "");
            multiStateView2.setViewState(MultiStateView.ViewState.CONTENT);
            bypassdispatchkeyevent.TuitionPaymentFragmentspecialinlinedviewModeldefault3((List) ((VirtualCameraAdapter1.asBinder) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            return;
        }
        if (virtualCameraAdapter1 instanceof VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
            FragmentChoosePostalCodeAddressBottomSheetBinding fragmentChoosePostalCodeAddressBottomSheetBinding4 = bypassdispatchkeyevent.asBinder;
            if (fragmentChoosePostalCodeAddressBottomSheetBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                fragmentChoosePostalCodeAddressBottomSheetBinding = fragmentChoosePostalCodeAddressBottomSheetBinding4;
            }
            MultiStateView multiStateView3 = fragmentChoosePostalCodeAddressBottomSheetBinding.msvGeneralList;
            Intrinsics.checkNotNullExpressionValue(multiStateView3, "");
            Camera2CameraControlExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2(multiStateView3, ((VirtualCameraAdapter1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) virtualCameraAdapter1).TuitionPaymentFragmentspecialinlinedviewModeldefault1, null, null, null, null);
        }
    }

    public static /* synthetic */ createIntentFilterForBroadcastReceiver b(bypassDispatchKeyEvent bypassdispatchkeyevent) {
        Context contextRequireContext = bypassdispatchkeyevent.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new createIntentFilterForBroadcastReceiver(contextRequireContext, null, new ChoosePostalCodeAddressBottomSheetFragment$chooseAddressPostalCodeAdapter$2$1(bypassdispatchkeyevent), 2, null);
    }

    public static final /* synthetic */ void b(bypassDispatchKeyEvent bypassdispatchkeyevent, CodeNamePair codeNamePair) {
        bypassdispatchkeyevent.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = codeNamePair;
        b.TuitionPaymentFragmentbindingInflater1(CoroutineScopeKt.CoroutineScope(Dispatchers.TuitionPaymentFragmentbindingInflater1()), null, null, new ChoosePostalCodeAddressBottomSheetFragment$handleItemClicked$1(bypassdispatchkeyevent, codeNamePair, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    private final void TuitionPaymentFragmentspecialinlinedviewModeldefault1(CodeNamePair p0) {
        Iterable iterable = ((createIntentFilterForBroadcastReceiver) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).d;
        Intrinsics.checkNotNullExpressionValue(iterable, "");
        int i = 0;
        for (Object obj : iterable) {
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy = (lambdasetOnImageAvailableListener0androidxcameracoreAndroidImageReaderProxy) obj;
            lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentbindingInflater1 = Intrinsics.areEqual(p0.b, ((CodeNamePair) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).b);
            ((createIntentFilterForBroadcastReceiver) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).d.set(i, (Data) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy);
            if (Intrinsics.areEqual(p0.b, ((CodeNamePair) lambdasetonimageavailablelistener0androidxcameracoreandroidimagereaderproxy.TuitionPaymentFragmentspecialinlinedviewModeldefault2).b)) {
                FragmentChoosePostalCodeAddressBottomSheetBinding fragmentChoosePostalCodeAddressBottomSheetBinding = this.asBinder;
                if (fragmentChoosePostalCodeAddressBottomSheetBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    fragmentChoosePostalCodeAddressBottomSheetBinding = null;
                }
                RecyclerView recyclerView = fragmentChoosePostalCodeAddressBottomSheetBinding.rvItem;
                int i2 = i + 4;
                if (((createIntentFilterForBroadcastReceiver) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).d.size() <= i2 || i <= 4) {
                    i2 = i;
                }
                recyclerView.scrollToPosition(i2);
            }
            i++;
        }
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void b() {
        bypassDispatchKeyEvent bypassdispatchkeyevent = this;
        ((select) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault2.observe(bypassdispatchkeyevent, new Observer() { // from class: bypassOnPanelClosed
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                bypassDispatchKeyEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b, (VirtualCameraAdapter1) obj);
            }
        });
        ((select) this.TuitionPaymentFragmentbindingInflater1.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3.observe(bypassdispatchkeyevent, new Observer() { // from class: onProvideKeyboardShortcuts
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                bypassDispatchKeyEvent.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b, (VirtualCameraAdapter1) obj);
            }
        });
    }

    @Override // defpackage.unregisterMediaButtonEventReceiver
    public final void g() {
        createIntentFilterForBroadcastReceiver createintentfilterforbroadcastreceiver = (createIntentFilterForBroadcastReceiver) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue();
        createintentfilterforbroadcastreceiver.d.clear();
        createintentfilterforbroadcastreceiver.notifyDataSetChanged();
        ((createIntentFilterForBroadcastReceiver) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue()).TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.b);
        FragmentChoosePostalCodeAddressBottomSheetBinding fragmentChoosePostalCodeAddressBottomSheetBinding = this.asBinder;
        FragmentChoosePostalCodeAddressBottomSheetBinding fragmentChoosePostalCodeAddressBottomSheetBinding2 = null;
        if (fragmentChoosePostalCodeAddressBottomSheetBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            fragmentChoosePostalCodeAddressBottomSheetBinding = null;
        }
        RecyclerView recyclerView = fragmentChoosePostalCodeAddressBottomSheetBinding.rvItem;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(requireContext(), 1));
        recyclerView.setAdapter((createIntentFilterForBroadcastReceiver) this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.getValue());
        FragmentChoosePostalCodeAddressBottomSheetBinding fragmentChoosePostalCodeAddressBottomSheetBinding3 = this.asBinder;
        if (fragmentChoosePostalCodeAddressBottomSheetBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fragmentChoosePostalCodeAddressBottomSheetBinding2 = fragmentChoosePostalCodeAddressBottomSheetBinding3;
        }
        fragmentChoosePostalCodeAddressBottomSheetBinding2.tvTitle.setText(getString(R.string.hint_address_postal_code));
        CodeNamePair codeNamePair = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        if (codeNamePair != null) {
            TuitionPaymentFragmentspecialinlinedviewModeldefault1(codeNamePair);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bypassDispatchKeyEvent() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
